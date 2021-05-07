package com.isagog.service.language;

import com.isagog.kg.model.*;

import javax.annotation.Nonnull;
import java.util.NoSuchElementException;
import java.util.Optional;

public class SentenceFactory {

    public static @Nonnull
    Sentence newSentence(@Nonnull AnnotatedSentence annotation) {
        Sentence sentence = new Sentence();
        for (LemmaAnnotation tk: annotation.getLemmas()) {
            sentence.addWord(tk.getToken(),tk.getPos().name(),tk.getOffset());
        }
        for (DependencyAnnotation dep : annotation.getDependencies()) {
            Optional<Word> w1 = sentence.getWord (dep.getOffset());
            Optional<Word> w2 = sentence.getWord (dep.getGovernor());
            if (w1.isPresent() && w2.isPresent()) {
                if (dep instanceof SyntacticRelation)
                    sentence.addSyntacticRelation(w1.get(), w2.get(),((SyntacticRelation) dep).getTag().name());
                else if (dep instanceof SemanticRelation)
                    sentence.addSemanticRelation(w1.get(), w2.get(),((SemanticRelation) dep).getPredicate());
                else throw new NoSuchElementException(dep.getDtype());
                }

            }
        return sentence;
    }



}
