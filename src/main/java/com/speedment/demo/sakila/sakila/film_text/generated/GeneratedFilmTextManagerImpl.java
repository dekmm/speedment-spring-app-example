package com.speedment.demo.sakila.sakila.film_text.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film_text.FilmText;
import com.speedment.demo.sakila.sakila.film_text.FilmTextImpl;
import com.speedment.demo.sakila.sakila.film_text.FilmTextManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.demo.sakila.sakila.film_text.FilmText} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmTextManagerImpl 
extends AbstractManager<FilmText> 
implements GeneratedFilmTextManager {
    
    private final TableIdentifier<FilmText> tableIdentifier;
    
    protected GeneratedFilmTextManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "film_text");
    }
    
    @Override
    public FilmText create() {
        return new FilmTextImpl();
    }
    
    @Override
    public TableIdentifier<FilmText> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<FilmText>> fields() {
        return FilmTextManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<FilmText>> primaryKeyFields() {
        return Stream.of(
            FilmText.FILM_ID
        );
    }
}