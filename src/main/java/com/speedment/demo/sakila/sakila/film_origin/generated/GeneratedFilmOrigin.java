package com.speedment.demo.sakila.sakila.film_origin.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film.Film;
import com.speedment.demo.sakila.sakila.film_origin.FilmOrigin;
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
 * com.speedment.demo.sakila.sakila.film_origin.FilmOrigin}-interface
 * representing entities of the {@code film_origin}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmOrigin {
    
    /**
     * This Field corresponds to the {@link FilmOrigin} field that can be
     * obtained using the {@link FilmOrigin#getFilmId()} method.
     */
    IntForeignKeyField<FilmOrigin, Integer, Film> FILM_ID = IntForeignKeyField.create(
        Identifier.FILM_ID,
        FilmOrigin::getFilmId,
        FilmOrigin::setFilmId,
        Film.FILM_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmOrigin} field that can be
     * obtained using the {@link FilmOrigin#getCity()} method.
     */
    StringField<FilmOrigin, String> CITY = StringField.create(
        Identifier.CITY,
        o -> OptionalUtil.unwrap(o.getCity()),
        FilmOrigin::setCity,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmOrigin} field that can be
     * obtained using the {@link FilmOrigin#getCountry()} method.
     */
    StringField<FilmOrigin, String> COUNTRY = StringField.create(
        Identifier.COUNTRY,
        o -> OptionalUtil.unwrap(o.getCountry()),
        FilmOrigin::setCountry,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the filmId of this FilmOrigin. The filmId field corresponds to
     * the database column sakila.sakila.film_origin.film_id.
     * 
     * @return the filmId of this FilmOrigin
     */
    int getFilmId();
    
    /**
     * Returns the city of this FilmOrigin. The city field corresponds to the
     * database column sakila.sakila.film_origin.city.
     * 
     * @return the city of this FilmOrigin
     */
    Optional<String> getCity();
    
    /**
     * Returns the country of this FilmOrigin. The country field corresponds to
     * the database column sakila.sakila.film_origin.country.
     * 
     * @return the country of this FilmOrigin
     */
    Optional<String> getCountry();
    
    /**
     * Sets the filmId of this FilmOrigin. The filmId field corresponds to the
     * database column sakila.sakila.film_origin.film_id.
     * 
     * @param filmId to set of this FilmOrigin
     * @return       this FilmOrigin instance
     */
    FilmOrigin setFilmId(int filmId);
    
    /**
     * Sets the city of this FilmOrigin. The city field corresponds to the
     * database column sakila.sakila.film_origin.city.
     * 
     * @param city to set of this FilmOrigin
     * @return     this FilmOrigin instance
     */
    FilmOrigin setCity(String city);
    
    /**
     * Sets the country of this FilmOrigin. The country field corresponds to the
     * database column sakila.sakila.film_origin.country.
     * 
     * @param country to set of this FilmOrigin
     * @return        this FilmOrigin instance
     */
    FilmOrigin setCountry(String country);
    
    /**
     * Queries the specified manager for the referenced Film. If no such Film
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Film findFilmId(Manager<Film> foreignManager);
    
    enum Identifier implements ColumnIdentifier<FilmOrigin> {
        
        FILM_ID ("film_id"),
        CITY    ("city"),
        COUNTRY ("country");
        
        private final String columnId;
        private final TableIdentifier<FilmOrigin> tableIdentifier;
        
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
            return "film_origin";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<FilmOrigin> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}