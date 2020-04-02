package com.speedment.demo.sakila.sakila.film_image.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film.Film;
import com.speedment.demo.sakila.sakila.film_image.FilmImage;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.ReferenceField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Blob;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.speedment.demo.sakila.sakila.film_image.FilmImage}-interface representing
 * entities of the {@code film_image}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmImage {
    
    /**
     * This Field corresponds to the {@link FilmImage} field that can be
     * obtained using the {@link FilmImage#getFilmId()} method.
     */
    IntForeignKeyField<FilmImage, Integer, Film> FILM_ID = IntForeignKeyField.create(
        Identifier.FILM_ID,
        FilmImage::getFilmId,
        FilmImage::setFilmId,
        Film.FILM_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmImage} field that can be
     * obtained using the {@link FilmImage#getImage()} method.
     */
    ReferenceField<FilmImage, Blob, Blob> IMAGE = ReferenceField.create(
        Identifier.IMAGE,
        o -> OptionalUtil.unwrap(o.getImage()),
        FilmImage::setImage,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the filmId of this FilmImage. The filmId field corresponds to the
     * database column sakila.sakila.film_image.film_id.
     * 
     * @return the filmId of this FilmImage
     */
    int getFilmId();
    
    /**
     * Returns the image of this FilmImage. The image field corresponds to the
     * database column sakila.sakila.film_image.image.
     * 
     * @return the image of this FilmImage
     */
    Optional<Blob> getImage();
    
    /**
     * Sets the filmId of this FilmImage. The filmId field corresponds to the
     * database column sakila.sakila.film_image.film_id.
     * 
     * @param filmId to set of this FilmImage
     * @return       this FilmImage instance
     */
    FilmImage setFilmId(int filmId);
    
    /**
     * Sets the image of this FilmImage. The image field corresponds to the
     * database column sakila.sakila.film_image.image.
     * 
     * @param image to set of this FilmImage
     * @return      this FilmImage instance
     */
    FilmImage setImage(Blob image);
    
    /**
     * Queries the specified manager for the referenced Film. If no such Film
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Film findFilmId(Manager<Film> foreignManager);
    
    enum Identifier implements ColumnIdentifier<FilmImage> {
        
        FILM_ID ("film_id"),
        IMAGE   ("image");
        
        private final String columnId;
        private final TableIdentifier<FilmImage> tableIdentifier;
        
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
            return "film_image";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<FilmImage> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}