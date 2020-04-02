package com.speedment.demo.sakila.sakila.film_genre.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film_genre.FilmGenre;
import com.speedment.demo.sakila.sakila.film_genre.FilmGenreImpl;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.speedment.demo.sakila.sakila.film_genre.FilmGenre} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmGenreSqlAdapter implements SqlAdapter<FilmGenre> {
    
    private final TableIdentifier<FilmGenre> tableIdentifier;
    
    protected GeneratedFilmGenreSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "film_genre");
    }
    
    protected FilmGenre apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setFilmId( getInt(resultSet, 1 + offset))
            .setGenre(  resultSet.getString(2 + offset))
            ;
    }
    
    protected FilmGenreImpl createEntity() {
        return new FilmGenreImpl();
    }
    
    @Override
    public TableIdentifier<FilmGenre> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, FilmGenre> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, FilmGenre> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}