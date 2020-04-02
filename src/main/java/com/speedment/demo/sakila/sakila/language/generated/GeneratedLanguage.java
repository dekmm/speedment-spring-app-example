package com.speedment.demo.sakila.sakila.language.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.language.Language;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.speedment.demo.sakila.sakila.language.Language}-interface representing
 * entities of the {@code language}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedLanguage {
    
    /**
     * This Field corresponds to the {@link Language} field that can be obtained
     * using the {@link Language#getLanguageId()} method.
     */
    IntField<Language, Integer> LANGUAGE_ID = IntField.create(
        Identifier.LANGUAGE_ID,
        Language::getLanguageId,
        Language::setLanguageId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Language} field that can be obtained
     * using the {@link Language#getName()} method.
     */
    StringField<Language, String> NAME = StringField.create(
        Identifier.NAME,
        Language::getName,
        Language::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Language} field that can be obtained
     * using the {@link Language#getLastUpdate()} method.
     */
    ComparableField<Language, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        Language::getLastUpdate,
        Language::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the languageId of this Language. The languageId field corresponds
     * to the database column sakila.sakila.language.language_id.
     * 
     * @return the languageId of this Language
     */
    int getLanguageId();
    
    /**
     * Returns the name of this Language. The name field corresponds to the
     * database column sakila.sakila.language.name.
     * 
     * @return the name of this Language
     */
    String getName();
    
    /**
     * Returns the lastUpdate of this Language. The lastUpdate field corresponds
     * to the database column sakila.sakila.language.last_update.
     * 
     * @return the lastUpdate of this Language
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the languageId of this Language. The languageId field corresponds to
     * the database column sakila.sakila.language.language_id.
     * 
     * @param languageId to set of this Language
     * @return           this Language instance
     */
    Language setLanguageId(int languageId);
    
    /**
     * Sets the name of this Language. The name field corresponds to the
     * database column sakila.sakila.language.name.
     * 
     * @param name to set of this Language
     * @return     this Language instance
     */
    Language setName(String name);
    
    /**
     * Sets the lastUpdate of this Language. The lastUpdate field corresponds to
     * the database column sakila.sakila.language.last_update.
     * 
     * @param lastUpdate to set of this Language
     * @return           this Language instance
     */
    Language setLastUpdate(Timestamp lastUpdate);
    
    enum Identifier implements ColumnIdentifier<Language> {
        
        LANGUAGE_ID ("language_id"),
        NAME        ("name"),
        LAST_UPDATE ("last_update");
        
        private final String columnId;
        private final TableIdentifier<Language> tableIdentifier;
        
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
            return "language";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Language> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}