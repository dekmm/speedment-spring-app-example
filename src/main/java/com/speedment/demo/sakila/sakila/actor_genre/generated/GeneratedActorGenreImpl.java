package com.speedment.demo.sakila.sakila.actor_genre.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.actor.Actor;
import com.speedment.demo.sakila.sakila.actor_genre.ActorGenre;
import com.speedment.runtime.core.manager.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.demo.sakila.sakila.actor_genre.ActorGenre}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedActorGenreImpl implements ActorGenre {
    
    private int actorGenreId;
    private int actorId;
    private String name;
    
    protected GeneratedActorGenreImpl() {}
    
    @Override
    public int getActorGenreId() {
        return actorGenreId;
    }
    
    @Override
    public int getActorId() {
        return actorId;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public ActorGenre setActorGenreId(int actorGenreId) {
        this.actorGenreId = actorGenreId;
        return this;
    }
    
    @Override
    public ActorGenre setActorId(int actorId) {
        this.actorId = actorId;
        return this;
    }
    
    @Override
    public ActorGenre setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Actor findActorId(Manager<Actor> foreignManager) {
        return foreignManager.stream().filter(Actor.ACTOR_ID.equal(getActorId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("actorGenreId = " + Objects.toString(getActorGenreId()));
        sj.add("actorId = "      + Objects.toString(getActorId()));
        sj.add("name = "         + Objects.toString(getName()));
        return "ActorGenreImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof ActorGenre)) { return false; }
        final ActorGenre thatActorGenre = (ActorGenre)that;
        if (this.getActorGenreId() != thatActorGenre.getActorGenreId()) { return false; }
        if (this.getActorId() != thatActorGenre.getActorId()) { return false; }
        if (!Objects.equals(this.getName(), thatActorGenre.getName())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getActorGenreId());
        hash = 31 * hash + Integer.hashCode(getActorId());
        hash = 31 * hash + Objects.hashCode(getName());
        return hash;
    }
}