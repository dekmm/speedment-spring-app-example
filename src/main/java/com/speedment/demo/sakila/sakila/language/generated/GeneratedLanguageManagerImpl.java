package com.speedment.demo.sakila.sakila.language.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.language.Language;
import com.speedment.demo.sakila.sakila.language.LanguageImpl;
import com.speedment.demo.sakila.sakila.language.LanguageManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.demo.sakila.sakila.language.Language} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedLanguageManagerImpl 
extends AbstractManager<Language> 
implements GeneratedLanguageManager {
    
    private final TableIdentifier<Language> tableIdentifier;
    
    protected GeneratedLanguageManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "language");
    }
    
    @Override
    public Language create() {
        return new LanguageImpl();
    }
    
    @Override
    public TableIdentifier<Language> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Language>> fields() {
        return LanguageManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Language>> primaryKeyFields() {
        return Stream.of(
            Language.LANGUAGE_ID
        );
    }
}