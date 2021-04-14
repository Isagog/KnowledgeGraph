package com.isagog.service.language;

import org.jgrapht.*;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DirectedMultigraph;

import java.util.*;

public class Sentence {

    private Graph<Word, WordRelation> sGraph;

    private Set<String> classifiers;

    public Sentence() {
        classifiers = new HashSet<>();
        sGraph = new DirectedMultigraph<>(WordRelation.class);
    }

    public Sentence(String ... classifiers) {
        
        this.classifiers = new HashSet<>(Arrays.asList(classifiers));
        sGraph = new DirectedMultigraph<>(WordRelation.class);
    }


   public Optional<Word> addWord (String token, String pos) {
        Word w = new Word(token,pos,sGraph.edgeSet().size());
        if (sGraph.addVertex(w))
              return Optional.of(w);
        else  return Optional.empty();
    }

    public Optional<Word> addWord (String token, String pos, int offset) {
        Word w = new Word(token,pos,offset);
        if (sGraph.addVertex(w))
            return Optional.of(w);
        else  return Optional.empty();
    }

    public boolean addRelation (Word w1, Word w2, WordRelation rel) {
        return sGraph.addEdge(w1,w2, rel);
    }

    public Optional<WordSyntacticRelation> addSyntacticRelation (Word w1, Word w2, String label) {
        WordSyntacticRelation rl = new WordSyntacticRelation(label);
        if (sGraph.addEdge(w1,w2,rl))
            return Optional.of(rl);
        else return Optional.empty();
    }

    public Optional<WordSemanticRelation> addSemanticRelation (Word w1, Word w2, String label) {
        WordSemanticRelation rl = new WordSemanticRelation(label);
        if (sGraph.addEdge(w1,w2,rl))
            return Optional.of(rl);
        else return Optional.empty();
    }

    public GraphPath<Word, WordRelation> getShortestPath (Word origin, Word sink) {
        return new DijkstraShortestPath<>(sGraph).getPath(origin,sink);
    }

    public Optional<Word> getWord(int index) {
        return sGraph.vertexSet().stream()
                     .filter(w -> w.getIndex() == index)
                     .findFirst();
    }

    public Set<String> getClassifiers() {
        return classifiers;
    }

    public boolean addPragmatics(String tag) {
        return classifiers.add(tag);
    }

    public boolean hasPragmatics(String tag) {
        return classifiers.contains(tag);
    }


//    public Optional<Word> getSubject() {
//        Optional<BasicAnnotation> root = getRoot(sentence);
//        if (root.isPresent()) {
//            switch (root.get().getPos()) {
//                case NOUN:
//                case PROPN:
//                    return root;
//                case VERB:
//                    return getDependent(sentence,root.get().getOffset(), DependencyAnnotation.SyntaxEnum.NSUBJ);
//                default:
//            }
//
//        } else {
//            IsagogService.Log.warning("Get subject from fragment: " + sentence.getSentence().getVerbatim());
//
//        }
//    }
//
//    private static Optional<BasicAnnotation> getDependent(SentenceAnnotation sentence, int index, DependencyAnnotation.SyntaxEnum dependency) {
//        return sentence.getDependencies()
//                .stream()
//                .filter(da -> da.getOffset() == index && da.getSyntax().equals(dependency))
//                .findFirst()
//                .flatMap(da -> getTokenAt(sentence.getTokens(), da.getGovernor()));
//
//    }
//
//
//
//    public static Optional<BasicAnnotation> getTokenAt (List<BasicAnnotation> tokens, int offset) {
//        return tokens.stream().filter(t -> t.getOffset() == offset).findFirst();
//    }
//
//
//
//
//    public static Optional<BasicAnnotation> getRoot(SentenceAnnotation sentence) {
//        return sentence.getDependencies().stream()
//                .filter(d -> d.getSyntax().equals(DependencyAnnotation.SyntaxEnum.ROOT))
//                .findFirst()
//                .map(d -> sentence.getTokens().get(d.getOffset()));
//
//    }
}

