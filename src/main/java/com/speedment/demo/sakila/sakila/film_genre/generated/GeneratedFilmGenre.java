package com.speedment.demo.sakila.sakila.film_genre.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film.Film;
import com.speedment.demo.sakila.sakila.film_genre.FilmGenre;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.speedment.demo.sakila.sakila.film_genre.FilmGenre}-interface representing
 * entities of the {@code film_genre}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmGenre {
    
    /**
     * This Field corresponds to the {@link FilmGenre} field that can be
     * obtained using the {@link FilmGenre#getFilmId()} method.
     */
    IntForeignKeyField<FilmGenre, Integer, Film> FILM_ID = IntForeignKeyField.create(
        Identifier.FILM_ID,
        FilmGenre::getFilmId,
        FilmGenre::setFilmId,
        Film.FILM_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmGenre} field that can be
     * obtained using the {@link FilmGenre#getGenre()} method.
     */
    StringField<FilmGenre, String> GENRE = StringField.create(
        Identifier.GENRE,
        o -> OptionalUtil.unwrap(o.getGenre()),
        FilmGenre::setGenre,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the filmId of this FilmGenre. The filmId field corresponds to the
     * database column sakila.sakila.film_genre.film_id.
     * 
     * @return the filmId of this FilmGenre
     */
    int getFilmId();
    
    /**
     * Returns the genre of this FilmGenre. The genre field corresponds to the
     * database column sakila.sakila.film_genre.genre.
     * 
     * @return the genre of this FilmGenre
     */
    Optional<String> getGenre();
    
    /**
     * Sets the filmId of this FilmGenre. The filmId field corresponds to the
     * database column sakila.sakila.film_genre.film_id.
     * 
     * @param filmId to set of this FilmGenre
     * @return       this FilmGenre instance
     */
    FilmGenre setFilmId(int filmId);
    
    /**
     * Sets the genre of this FilmGenre. The genre field corresponds to the
     * database column sakila.sakila.film_genre.genre.
     * 
     * @param genre to set of this FilmGenre
     * @return      this FilmGenre instance
     */
    FilmGenre setGenre(String genre);
    
    /**
     * Queries the specified manager for the referenced Film. If no such Film
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Film findFilmId(Manager<Film> foreignManager);
    
    enum Identifier implements ColumnIdentifier<FilmGenre> {
        
        FILM_ID ("film_id"),
        GENRE   ("genre");
        
        private final String columnId;
        private final TableIdentifier<FilmGenre> tableIdentifier;
        
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
            return "film_genre";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<FilmGenre> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}