package com.speedment.demo.sakila.sakila.actor_info.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.actor_info.ActorInfo;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.speedment.demo.sakila.sakila.actor_info.ActorInfo}-interface representing
 * entities of the {@code actor_info}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedActorInfo {
    
    /**
     * This Field corresponds to the {@link ActorInfo} field that can be
     * obtained using the {@link ActorInfo#getActorId()} method.
     */
    IntField<ActorInfo, Integer> ACTOR_ID = IntField.create(
        Identifier.ACTOR_ID,
        ActorInfo::getActorId,
        ActorInfo::setActorId,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link ActorInfo} field that can be
     * obtained using the {@link ActorInfo#getFirstName()} method.
     */
    StringField<ActorInfo, String> FIRST_NAME = StringField.create(
        Identifier.FIRST_NAME,
        ActorInfo::getFirstName,
        ActorInfo::setFirstName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link ActorInfo} field that can be
     * obtained using the {@link ActorInfo#getLastName()} method.
     */
    StringField<ActorInfo, String> LAST_NAME = StringField.create(
        Identifier.LAST_NAME,
        ActorInfo::getLastName,
        ActorInfo::setLastName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link ActorInfo} field that can be
     * obtained using the {@link ActorInfo#getFilmInfo()} method.
     */
    StringField<ActorInfo, String> FILM_INFO = StringField.create(
        Identifier.FILM_INFO,
        o -> OptionalUtil.unwrap(o.getFilmInfo()),
        ActorInfo::setFilmInfo,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the actorId of this ActorInfo. The actorId field corresponds to
     * the database column sakila.sakila.actor_info.actor_id.
     * 
     * @return the actorId of this ActorInfo
     */
    int getActorId();
    
    /**
     * Returns the firstName of this ActorInfo. The firstName field corresponds
     * to the database column sakila.sakila.actor_info.first_name.
     * 
     * @return the firstName of this ActorInfo
     */
    String getFirstName();
    
    /**
     * Returns the lastName of this ActorInfo. The lastName field corresponds to
     * the database column sakila.sakila.actor_info.last_name.
     * 
     * @return the lastName of this ActorInfo
     */
    String getLastName();
    
    /**
     * Returns the filmInfo of this ActorInfo. The filmInfo field corresponds to
     * the database column sakila.sakila.actor_info.film_info.
     * 
     * @return the filmInfo of this ActorInfo
     */
    Optional<String> getFilmInfo();
    
    /**
     * Sets the actorId of this ActorInfo. The actorId field corresponds to the
     * database column sakila.sakila.actor_info.actor_id.
     * 
     * @param actorId to set of this ActorInfo
     * @return        this ActorInfo instance
     */
    ActorInfo setActorId(int actorId);
    
    /**
     * Sets the firstName of this ActorInfo. The firstName field corresponds to
     * the database column sakila.sakila.actor_info.first_name.
     * 
     * @param firstName to set of this ActorInfo
     * @return          this ActorInfo instance
     */
    ActorInfo setFirstName(String firstName);
    
    /**
     * Sets the lastName of this ActorInfo. The lastName field corresponds to
     * the database column sakila.sakila.actor_info.last_name.
     * 
     * @param lastName to set of this ActorInfo
     * @return         this ActorInfo instance
     */
    ActorInfo setLastName(String lastName);
    
    /**
     * Sets the filmInfo of this ActorInfo. The filmInfo field corresponds to
     * the database column sakila.sakila.actor_info.film_info.
     * 
     * @param filmInfo to set of this ActorInfo
     * @return         this ActorInfo instance
     */
    ActorInfo setFilmInfo(String filmInfo);
    
    enum Identifier implements ColumnIdentifier<ActorInfo> {
        
        ACTOR_ID   ("actor_id"),
        FIRST_NAME ("first_name"),
        LAST_NAME  ("last_name"),
        FILM_INFO  ("film_info");
        
        private final String columnId;
        private final TableIdentifier<ActorInfo> tableIdentifier;
        
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
            return "actor_info";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<ActorInfo> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}