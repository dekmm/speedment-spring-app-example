package com.speedment.demo.sakila.sakila.film_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film_list.FilmList;
import com.speedment.demo.sakila.sakila.film_list.FilmListImpl;
import com.speedment.demo.sakila.sakila.film_list.FilmListManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractViewManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.demo.sakila.sakila.film_list.FilmList} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmListManagerImpl 
extends AbstractViewManager<FilmList> 
implements GeneratedFilmListManager {
    
    private final TableIdentifier<FilmList> tableIdentifier;
    
    protected GeneratedFilmListManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "film_list");
    }
    
    @Override
    public FilmList create() {
        return new FilmListImpl();
    }
    
    @Override
    public TableIdentifier<FilmList> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<FilmList>> fields() {
        return FilmListManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<FilmList>> primaryKeyFields() {
        return Stream.empty();
    }
}