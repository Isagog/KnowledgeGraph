package com.isagog.service.data;

import com.isagog.kg.model.*;

import java.net.URI;
import java.util.Optional;

public interface CrudManager {

    int createEntity(Entity entity);

    int createStatement(Statement entityStatement);

    int deleteEntity(URI id);

    int deleteStatement(Statement entityStatement);

    Optional<Entity> getEntity(URI id, String details);


    public int upload(String kg, Upload upload);

}
