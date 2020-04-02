package com.speedment.demo.sakila.sakila.actor.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.actor.Actor;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.speedment.demo.sakila.sakila.actor.Actor} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedActorManager extends Manager<Actor> {
    
    TableIdentifier<Actor> IDENTIFIER = TableIdentifier.of("sakila", "sakila", "actor");
    List<Field<Actor>> FIELDS = unmodifiableList(asList(
        Actor.ACTOR_ID,
        Actor.FIRST_NAME,
        Actor.LAST_NAME,
        Actor.LAST_UPDATE
    ));
    
    @Override
    default Class<Actor> getEntityClass() {
        return Actor.class;
    }
}