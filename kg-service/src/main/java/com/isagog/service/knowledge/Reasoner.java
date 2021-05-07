package com.isagog.service.knowledge;

import com.isagog.kg.model.Classifier;
import com.isagog.kg.model.Concept;
import com.isagog.kg.model.Relation;
import com.isagog.service.ServiceException;

import java.net.URI;
import java.util.Set;

public interface Reasoner {

    <C extends Classifier> boolean includes  (C sup, C sub) throws ServiceException;
    <C extends Classifier> boolean disjoint  (C sup, C sub) throws ServiceException;
    <C extends Classifier> boolean subsumes  (C sup, C sub) throws ServiceException;
    <C extends Classifier> Set<C> superClassifiers(C sub) throws ServiceException;
    <C extends Classifier> Set<C> subClassifiers(C sub) throws ServiceException;
}
