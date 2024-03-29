package com.speedment.demo.sakila.sakila.actor_genre.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.actor.Actor;
import com.speedment.demo.sakila.sakila.actor_genre.ActorGenre;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.speedment.demo.sakila.sakila.actor_genre.ActorGenre}-interface
 * representing entities of the {@code actor_genre}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedActorGenre {
    
    /**
     * This Field corresponds to the {@link ActorGenre} field that can be
     * obtained using the {@link ActorGenre#getActorGenreId()} method.
     */
    IntField<ActorGenre, Integer> ACTOR_GENRE_ID = IntField.create(
        Identifier.ACTOR_GENRE_ID,
        ActorGenre::getActorGenreId,
        ActorGenre::setActorGenreId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link ActorGenre} field that can be
     * obtained using the {@link ActorGenre#getActorId()} method.
     */
    IntForeignKeyField<ActorGenre, Integer, Actor> ACTOR_ID = IntForeignKeyField.create(
        Identifier.ACTOR_ID,
        ActorGenre::getActorId,
        ActorGenre::setActorId,
        Actor.ACTOR_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link ActorGenre} field that can be
     * obtained using the {@link ActorGenre#getName()} method.
     */
    StringField<ActorGenre, String> NAME = StringField.create(
        Identifier.NAME,
        ActorGenre::getName,
        ActorGenre::setName,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the actorGenreId of this ActorGenre. The actorGenreId field
     * corresponds to the database column
     * sakila.sakila.actor_genre.actor_genre_id.
     * 
     * @return the actorGenreId of this ActorGenre
     */
    int getActorGenreId();
    
    /**
     * Returns the actorId of this ActorGenre. The actorId field corresponds to
     * the database column sakila.sakila.actor_genre.actor_id.
     * 
     * @return the actorId of this ActorGenre
     */
    int getActorId();
    
    /**
     * Returns the name of this ActorGenre. The name field corresponds to the
     * database column sakila.sakila.actor_genre.name.
     * 
     * @return the name of this ActorGenre
     */
    String getName();
    
    /**
     * Sets the actorGenreId of this ActorGenre. The actorGenreId field
     * corresponds to the database column
     * sakila.sakila.actor_genre.actor_genre_id.
     * 
     * @param actorGenreId to set of this ActorGenre
     * @return             this ActorGenre instance
     */
    ActorGenre setActorGenreId(int actorGenreId);
    
    /**
     * Sets the actorId of this ActorGenre. The actorId field corresponds to the
     * database column sakila.sakila.actor_genre.actor_id.
     * 
     * @param actorId to set of this ActorGenre
     * @return        this ActorGenre instance
     */
    ActorGenre setActorId(int actorId);
    
    /**
     * Sets the name of this ActorGenre. The name field corresponds to the
     * database column sakila.sakila.actor_genre.name.
     * 
     * @param name to set of this ActorGenre
     * @return     this ActorGenre instance
     */
    ActorGenre setName(String name);
    
    /**
     * Queries the specified manager for the referenced Actor. If no such Actor
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Actor findActorId(Manager<Actor> foreignManager);
    
    enum Identifier implements ColumnIdentifier<ActorGenre> {
        
        ACTOR_GENRE_ID ("actor_genre_id"),
        ACTOR_ID       ("actor_id"),
        NAME           ("name");
        
        private final String columnId;
        private final TableIdentifier<ActorGenre> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "sakila";
        }
        
        @Override
        public String getSchemaId() {
            return "sakila";
        }
        
        @Override
        public String getTableId() {
            return "actor_genre";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<ActorGenre> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}