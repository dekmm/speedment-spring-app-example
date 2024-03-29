package com.speedment.demo.sakila.sakila.film.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film.Film;
import com.speedment.demo.sakila.sakila.language.Language;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.ComparableForeignKeyField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.speedment.demo.sakila.sakila.film.Film}-interface representing entities
 * of the {@code film}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilm {
    
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getFilmId()} method.
     */
    IntField<Film, Integer> FILM_ID = IntField.create(
        Identifier.FILM_ID,
        Film::getFilmId,
        Film::setFilmId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getTitle()} method.
     */
    StringField<Film, String> TITLE = StringField.create(
        Identifier.TITLE,
        Film::getTitle,
        Film::setTitle,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getDescription()} method.
     */
    StringField<Film, String> DESCRIPTION = StringField.create(
        Identifier.DESCRIPTION,
        o -> OptionalUtil.unwrap(o.getDescription()),
        Film::setDescription,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getReleaseYear()} method.
     */
    ComparableField<Film, Integer, Integer> RELEASE_YEAR = ComparableField.create(
        Identifier.RELEASE_YEAR,
        o -> OptionalUtil.unwrap(o.getReleaseYear()),
        Film::setReleaseYear,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getLanguageId()} method.
     */
    IntForeignKeyField<Film, Integer, Language> LANGUAGE_ID = IntForeignKeyField.create(
        Identifier.LANGUAGE_ID,
        Film::getLanguageId,
        Film::setLanguageId,
        Language.LANGUAGE_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getOriginalLanguageId()} method.
     */
    ComparableForeignKeyField<Film, Integer, Integer, Language> ORIGINAL_LANGUAGE_ID = ComparableForeignKeyField.create(
        Identifier.ORIGINAL_LANGUAGE_ID,
        o -> OptionalUtil.unwrap(o.getOriginalLanguageId()),
        Film::setOriginalLanguageId,
        Language.LANGUAGE_ID,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getRentalDuration()} method.
     */
    IntField<Film, Integer> RENTAL_DURATION = IntField.create(
        Identifier.RENTAL_DURATION,
        Film::getRentalDuration,
        Film::setRentalDuration,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getRentalRate()} method.
     */
    ComparableField<Film, BigDecimal, BigDecimal> RENTAL_RATE = ComparableField.create(
        Identifier.RENTAL_RATE,
        Film::getRentalRate,
        Film::setRentalRate,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getLength()} method.
     */
    ComparableField<Film, Integer, Integer> LENGTH = ComparableField.create(
        Identifier.LENGTH,
        o -> OptionalUtil.unwrap(o.getLength()),
        Film::setLength,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getReplacementCost()} method.
     */
    ComparableField<Film, BigDecimal, BigDecimal> REPLACEMENT_COST = ComparableField.create(
        Identifier.REPLACEMENT_COST,
        Film::getReplacementCost,
        Film::setReplacementCost,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getRating()} method.
     */
    StringField<Film, String> RATING = StringField.create(
        Identifier.RATING,
        o -> OptionalUtil.unwrap(o.getRating()),
        Film::setRating,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getSpecialFeatures()} method.
     */
    StringField<Film, String> SPECIAL_FEATURES = StringField.create(
        Identifier.SPECIAL_FEATURES,
        o -> OptionalUtil.unwrap(o.getSpecialFeatures()),
        Film::setSpecialFeatures,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Film} field that can be obtained
     * using the {@link Film#getLastUpdate()} method.
     */
    ComparableField<Film, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        Film::getLastUpdate,
        Film::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the filmId of this Film. The filmId field corresponds to the
     * database column sakila.sakila.film.film_id.
     * 
     * @return the filmId of this Film
     */
    int getFilmId();
    
    /**
     * Returns the title of this Film. The title field corresponds to the
     * database column sakila.sakila.film.title.
     * 
     * @return the title of this Film
     */
    String getTitle();
    
    /**
     * Returns the description of this Film. The description field corresponds
     * to the database column sakila.sakila.film.description.
     * 
     * @return the description of this Film
     */
    Optional<String> getDescription();
    
    /**
     * Returns the releaseYear of this Film. The releaseYear field corresponds
     * to the database column sakila.sakila.film.release_year.
     * 
     * @return the releaseYear of this Film
     */
    OptionalInt getReleaseYear();
    
    /**
     * Returns the languageId of this Film. The languageId field corresponds to
     * the database column sakila.sakila.film.language_id.
     * 
     * @return the languageId of this Film
     */
    int getLanguageId();
    
    /**
     * Returns the originalLanguageId of this Film. The originalLanguageId field
     * corresponds to the database column
     * sakila.sakila.film.original_language_id.
     * 
     * @return the originalLanguageId of this Film
     */
    OptionalInt getOriginalLanguageId();
    
    /**
     * Returns the rentalDuration of this Film. The rentalDuration field
     * corresponds to the database column sakila.sakila.film.rental_duration.
     * 
     * @return the rentalDuration of this Film
     */
    int getRentalDuration();
    
    /**
     * Returns the rentalRate of this Film. The rentalRate field corresponds to
     * the database column sakila.sakila.film.rental_rate.
     * 
     * @return the rentalRate of this Film
     */
    BigDecimal getRentalRate();
    
    /**
     * Returns the length of this Film. The length field corresponds to the
     * database column sakila.sakila.film.length.
     * 
     * @return the length of this Film
     */
    OptionalInt getLength();
    
    /**
     * Returns the replacementCost of this Film. The replacementCost field
     * corresponds to the database column sakila.sakila.film.replacement_cost.
     * 
     * @return the replacementCost of this Film
     */
    BigDecimal getReplacementCost();
    
    /**
     * Returns the rating of this Film. The rating field corresponds to the
     * database column sakila.sakila.film.rating.
     * 
     * @return the rating of this Film
     */
    Optional<String> getRating();
    
    /**
     * Returns the specialFeatures of this Film. The specialFeatures field
     * corresponds to the database column sakila.sakila.film.special_features.
     * 
     * @return the specialFeatures of this Film
     */
    Optional<String> getSpecialFeatures();
    
    /**
     * Returns the lastUpdate of this Film. The lastUpdate field corresponds to
     * the database column sakila.sakila.film.last_update.
     * 
     * @return the lastUpdate of this Film
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the filmId of this Film. The filmId field corresponds to the
     * database column sakila.sakila.film.film_id.
     * 
     * @param filmId to set of this Film
     * @return       this Film instance
     */
    Film setFilmId(int filmId);
    
    /**
     * Sets the title of this Film. The title field corresponds to the database
     * column sakila.sakila.film.title.
     * 
     * @param title to set of this Film
     * @return      this Film instance
     */
    Film setTitle(String title);
    
    /**
     * Sets the description of this Film. The description field corresponds to
     * the database column sakila.sakila.film.description.
     * 
     * @param description to set of this Film
     * @return            this Film instance
     */
    Film setDescription(String description);
    
    /**
     * Sets the releaseYear of this Film. The releaseYear field corresponds to
     * the database column sakila.sakila.film.release_year.
     * 
     * @param releaseYear to set of this Film
     * @return            this Film instance
     */
    Film setReleaseYear(Integer releaseYear);
    
    /**
     * Sets the languageId of this Film. The languageId field corresponds to the
     * database column sakila.sakila.film.language_id.
     * 
     * @param languageId to set of this Film
     * @return           this Film instance
     */
    Film setLanguageId(int languageId);
    
    /**
     * Sets the originalLanguageId of this Film. The originalLanguageId field
     * corresponds to the database column
     * sakila.sakila.film.original_language_id.
     * 
     * @param originalLanguageId to set of this Film
     * @return                   this Film instance
     */
    Film setOriginalLanguageId(Integer originalLanguageId);
    
    /**
     * Sets the rentalDuration of this Film. The rentalDuration field
     * corresponds to the database column sakila.sakila.film.rental_duration.
     * 
     * @param rentalDuration to set of this Film
     * @return               this Film instance
     */
    Film setRentalDuration(int rentalDuration);
    
    /**
     * Sets the rentalRate of this Film. The rentalRate field corresponds to the
     * database column sakila.sakila.film.rental_rate.
     * 
     * @param rentalRate to set of this Film
     * @return           this Film instance
     */
    Film setRentalRate(BigDecimal rentalRate);
    
    /**
     * Sets the length of this Film. The length field corresponds to the
     * database column sakila.sakila.film.length.
     * 
     * @param length to set of this Film
     * @return       this Film instance
     */
    Film setLength(Integer length);
    
    /**
     * Sets the replacementCost of this Film. The replacementCost field
     * corresponds to the database column sakila.sakila.film.replacement_cost.
     * 
     * @param replacementCost to set of this Film
     * @return                this Film instance
     */
    Film setReplacementCost(BigDecimal replacementCost);
    
    /**
     * Sets the rating of this Film. The rating field corresponds to the
     * database column sakila.sakila.film.rating.
     * 
     * @param rating to set of this Film
     * @return       this Film instance
     */
    Film setRating(String rating);
    
    /**
     * Sets the specialFeatures of this Film. The specialFeatures field
     * corresponds to the database column sakila.sakila.film.special_features.
     * 
     * @param specialFeatures to set of this Film
     * @return                this Film instance
     */
    Film setSpecialFeatures(String specialFeatures);
    
    /**
     * Sets the lastUpdate of this Film. The lastUpdate field corresponds to the
     * database column sakila.sakila.film.last_update.
     * 
     * @param lastUpdate to set of this Film
     * @return           this Film instance
     */
    Film setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Queries the specified manager for the referenced Language. If no such
     * Language exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Language findLanguageId(Manager<Language> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Language. If no such
     * Language exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Optional<Language> findOriginalLanguageId(Manager<Language> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Film> {
        
        FILM_ID              ("film_id"),
        TITLE                ("title"),
        DESCRIPTION          ("description"),
        RELEASE_YEAR         ("release_year"),
        LANGUAGE_ID          ("language_id"),
        ORIGINAL_LANGUAGE_ID ("original_language_id"),
        RENTAL_DURATION      ("rental_duration"),
        RENTAL_RATE          ("rental_rate"),
        LENGTH               ("length"),
        REPLACEMENT_COST     ("replacement_cost"),
        RATING               ("rating"),
        SPECIAL_FEATURES     ("special_features"),
        LAST_UPDATE          ("last_update");
        
        private final String columnId;
        private final TableIdentifier<Film> tableIdentifier;
        
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
            return "film";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Film> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}