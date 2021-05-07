package com.isagog.service.knowledge.frames;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.google.gson.Gson;
import com.isagog.kg.model.*;
//import com.isagog.service.IsagogService;
import com.isagog.service.IsagogRuntime;
import com.isagog.service.ServiceException;
import com.isagog.service.interact.Interactions;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Frames utilities and extensions
 */
public class Frames {

    private static final int MAX_FRAME_INSTANCES = 10;
    private static Gson gson = new Gson();
    private static Logger logger = Logger.getLogger("FRAMES");

    private static IsagogRuntime runtime = IsagogRuntime.getInstance();


    /**
     * Makes a safe copy of the supplied frame
     * @param original
     * @return
     */
    public static Frame safeCopy(Frame original) {
        Frame cpy = gson.fromJson(gson.toJson(original), Frame.class);
        if (cpy.getConceptualSlots() == null) cpy.setConceptualSlots(new ArrayList<>());
        if (cpy.getRelationalSlots() == null) cpy.setRelationalSlots(new ArrayList<>());
        if (cpy.getAttributiveSlots() == null) cpy.setAttributiveSlots(new ArrayList<>());
       // if (cpy.getValueSlots() == null) cpy.setValueSlots(new ArrayList<>());
        return cpy;
    }

    public static List<Frame> loadFrames(List<String> frameFiles)  {
        return frameFiles.stream()
                .flatMap(f -> loadFrames(f).stream())
                .collect(Collectors.toList());
    }

    public static List<Frame> loadFrames (String sourceFile)  {
        URI resource = URI.create(runtime.getResourceLocator(sourceFile));
        ObjectMapper mapper = new ObjectMapper();
        File input = new File(resource);
        ObjectReader objectReader = mapper.reader().forType(Frame.class);
        try {
            MappingIterator<Frame> ite = objectReader.readValues(input);
            List<Frame> rt = ite.readAll();
            rt.forEach(frame -> {
                if (frame.getConceptualSlots() != null) frame.getConceptualSlots().forEach(conceptualSlot ->
                    conceptualSlot.setKtype(KnowledgeType.CONCEPTUALSLOT.name())
                        //TODO query ks and set constraints
                );
                if (frame.getRelationalSlots() != null) frame.getRelationalSlots().forEach(relationalSlot ->
                    relationalSlot.setKtype(KnowledgeType.RELATIONALSLOT.name())
                        //TODO query ks and set constraints
                );
                if (frame.getAttributiveSlots() != null) frame.getAttributiveSlots().forEach(attributiveSlot ->
                    attributiveSlot.setKtype(KnowledgeType.ATTRIBUTIVESLOT.name())
                        //TODO query ks and set constraints
                );
            });
            return rt;
        } catch (IOException e) {
            logger.severe(e.getMessage());
            return Collections.emptyList();
        }

    }


    /**
     * Instantiates a frame based on an interaction
     * @param candidates
     * @param interactions
     * @return
     */
    public static Optional<FrameInstance> instantiate(List<Frame> candidates, List<InteractRecord> interactions) {
        AtomicReference<Optional<FrameInstance>> opt = new AtomicReference<>(Optional.empty());
        Interactions.getFirstRecord(interactions,InteractType.FRAME).ifPresent(frameRecord -> {
            Frame frameType;
            try {
                frameType = retrieveFrame(candidates,frameRecord.getKitem())
                                    .orElseThrow(ServiceException.of("Frame not found: " + frameRecord.getKitem()));

                FrameInstance frameInstance = new FrameInstance(frameType)
                                    .instantiate(interactions);

                opt.set(Optional.of(frameInstance));

            } catch (ServiceException e) {
                logger.severe(e.toString());
            }
        });
        return opt.get();
    }

    private static Optional<Frame> retrieveFrame(List<Frame> frames,String kitem) {
        return frames.stream()
                .filter(f -> f.getId()
                        .equals(kitem))
                .findFirst()
                .map (Frames::safeCopy);
    }



    public static Optional<FrameInstance> instantiate(Frame frame) {
        FrameInstance frameGraph = new FrameInstance(frame);

        return Optional.of(frameGraph);
    }

    public static int size(Frame frame) {
        return getSlots(frame).size();
    }


    public static List<? extends Slot> getSlots(Frame frame) {
        List<Slot> rt = new ArrayList<>();
        if (frame.getAttributiveSlots() != null) rt.addAll(frame.getAttributiveSlots());
        if (frame.getRelationalSlots() != null) rt.addAll(frame.getRelationalSlots());
        if (frame.getConceptualSlots() != null) rt.addAll(frame.getConceptualSlots());
        return rt;
    }

    public static Optional<? extends Slot> getSlot(Frame frame, String id) {
       return getSlots(frame).stream().filter(s -> s.getId().equals(id)).findFirst();
    }


}
