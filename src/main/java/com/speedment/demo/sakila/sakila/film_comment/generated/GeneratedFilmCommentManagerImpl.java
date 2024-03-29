package com.speedment.demo.sakila.sakila.film_comment.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film_comment.FilmComment;
import com.speedment.demo.sakila.sakila.film_comment.FilmCommentImpl;
import com.speedment.demo.sakila.sakila.film_comment.FilmCommentManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.demo.sakila.sakila.film_comment.FilmComment} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmCommentManagerImpl 
extends AbstractManager<FilmComment> 
implements GeneratedFilmCommentManager {
    
    private final TableIdentifier<FilmComment> tableIdentifier;
    
    protected GeneratedFilmCommentManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "film_comment");
    }
    
    @Override
    public FilmComment create() {
        return new FilmCommentImpl();
    }
    
    @Override
    public TableIdentifier<FilmComment> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<FilmComment>> fields() {
        return FilmCommentManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<FilmComment>> primaryKeyFields() {
        return Stream.empty();
    }
}