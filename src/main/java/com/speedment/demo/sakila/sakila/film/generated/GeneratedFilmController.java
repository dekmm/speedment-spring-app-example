package com.speedment.demo.sakila.sakila.film.generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.json.Json;
import com.speedment.demo.sakila.sakila.film.Film;
import com.speedment.demo.sakila.sakila.film.FilmManager;
import com.speedment.enterprise.plugins.json.JsonCollectors;
import com.speedment.enterprise.plugins.json.JsonComponent;
import com.speedment.enterprise.plugins.json.JsonEncoder;
import com.speedment.enterprise.plugins.spring.runtime.AbstractFilter;
import com.speedment.enterprise.plugins.spring.runtime.AbstractSort;
import com.speedment.enterprise.plugins.spring.runtime.ControllerUtil;
import com.speedment.runtime.core.manager.FieldSet;
import com.speedment.runtime.core.manager.Persister;
import com.speedment.runtime.core.manager.Updater;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;

import static java.util.stream.Collectors.toList;

/**
 * The default REST controller logic for Film entities.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
@CrossOrigin(origins = "*", maxAge = 3600)
public abstract class GeneratedFilmController {
    
    protected @Autowired JsonComponent jsonComponent;
    protected @Autowired FilmManager manager;
    protected JsonEncoder<Film> encoder;
    
    @PostConstruct
    void createFilmEncoder() {
        encoder = jsonComponent.<Film>emptyEncoder()
            .put("filmId", Film.FILM_ID)
            .put("title", Film.TITLE)
            .put("description", Film.DESCRIPTION)
            .put("releaseYear", Film.RELEASE_YEAR)
            .put("languageId", Film.LANGUAGE_ID)
            .put("originalLanguageId", Film.ORIGINAL_LANGUAGE_ID)
            .put("rentalDuration", Film.RENTAL_DURATION)
            .put("rentalRate", Film.RENTAL_RATE)
            .put("length", Film.LENGTH)
            .put("replacementCost", Film.REPLACEMENT_COST)
            .put("rating", Film.RATING)
            .put("specialFeatures", Film.SPECIAL_FEATURES)
            .build();
    }
    
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping(path = "/films", produces = "application/json")
    @ApiOperation(value = "Retrieve a list of Film entities", httpMethod = "GET")
    @ApiResponse(code = 200, message = "Returns a 200 response code if a list of Film entities has been retrieved successfully", response = String.class)
    public String list(
            @RequestParam(name = "filter", defaultValue = "[]") String filters,
            @RequestParam(name = "sort", defaultValue = "[]") String sorters,
            @RequestParam(value = "start", defaultValue = "0") long start,
            @RequestParam(value = "limit", defaultValue = "25") long limit) {
        
        return listHelper(
            ControllerUtil.parseFilters(filters, FilmFilter::new).collect(toList()),
            ControllerUtil.parseSorts(sorters, FilmSort::new).collect(toList()),
            start,
            limit
        );
    }
    
    protected String listHelper(
            List<Predicate<Film>> predicates,
            List<Comparator<Film>> sorters,
            long start,
            long limit) {
        Stream<Film> stream = manager.stream();
        
        for (final Predicate<Film> predicate : predicates) {
            stream = stream.filter(predicate);
        }
        
        if (!sorters.isEmpty()) {
            final Optional<Comparator<Film>> comparator = sorters.stream()
                .reduce(Comparator::thenComparing);
            
            stream = stream.sorted(comparator.get());
        }
        
        return stream
            .skip(start)
            .limit(limit)
            .collect(JsonCollectors.toList(encoder));
    }
    
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping(path = "/films/{film_id}", produces = "application/json")
    @ApiOperation(value = "Retrieve a Film entity with a specified 'film_id' column value", httpMethod = "GET")
    @ApiResponse(code = 200, message = "Returns a 200 response code if a Film entity has been updated successfully")
    public String get(
            @PathVariable(name = "film_id") int filmId) {
        return encoder.apply(
            manager.stream()
                .filter(Film.FILM_ID.equal(filmId))
                .findFirst()
                .orElseThrow(() -> new FilmNotFoundException(filmId))
        );
    }
    
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(path = "/films", consumes = "application/json")
    @ApiOperation(value = "Create a Film entity", httpMethod = "POST")
    @ApiResponse(code = 201, message = "Returns a 201 response code if a Film entity has been created successfully")
    public void create(
            @RequestBody @Validated FilmCreateBody createBody) {
        final FieldSet<Film> excluded = FieldSet.allExcept(
            Film.FILM_ID
        );
        
        final Persister<Film> persister = manager.persister(excluded);
        final Film film = manager.create()
            .setTitle(createBody.getTitle())
            .setDescription(createBody.getDescription())
            .setReleaseYear(createBody.getReleaseYear())
            .setLanguageId(createBody.getLanguageId())
            .setOriginalLanguageId(createBody.getOriginalLanguageId())
            .setRentalDuration(createBody.getRentalDuration())
            .setRentalRate(createBody.getRentalRate())
            .setLength(createBody.getLength())
            .setReplacementCost(createBody.getReplacementCost())
            .setRating(createBody.getRating())
            .setSpecialFeatures(createBody.getSpecialFeatures())
        ;
        
        persister.accept(film);
    }
    
    @ResponseStatus(code = HttpStatus.OK)
    @PatchMapping(path = "/films/{film_id}", consumes = "application/json")
    @ApiOperation(value = "Update a Film entity with a specified 'film_id' column value", httpMethod = "PATCH")
    @ApiResponse(code = 201, message = "Returns a 201 response code if a Film entity has been updated successfully")
    public void update(
            @PathVariable(name = "film_id") int filmId,
            @RequestBody @Validated FilmUpdateBody updateBody) {
        final FieldSet<Film> excluded = FieldSet.allExcept(
            Film.FILM_ID
        );
        
        final Updater<Film> updater = manager.updater(excluded);
        final Film film = manager.stream()
            .filter(Film.FILM_ID.equal(filmId))
            .findFirst()
            .orElseThrow(() -> new FilmNotFoundException(filmId));
        
        film.setTitle(updateBody.getTitle());
        film.setDescription(updateBody.getDescription());
        film.setReleaseYear(updateBody.getReleaseYear());
        film.setLanguageId(updateBody.getLanguageId());
        film.setOriginalLanguageId(updateBody.getOriginalLanguageId());
        film.setRentalDuration(updateBody.getRentalDuration());
        film.setRentalRate(updateBody.getRentalRate());
        film.setLength(updateBody.getLength());
        film.setReplacementCost(updateBody.getReplacementCost());
        film.setRating(updateBody.getRating());
        film.setSpecialFeatures(updateBody.getSpecialFeatures());
        
        updater.accept(film);
    }
    
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/films/{film_id}")
    @ApiOperation(value = "Delete a Film entity with a specified 'film_id' column value", httpMethod = "DELETE")
    @ApiResponse(code = 204, message = "Returns a 204 response code if a Film entity has been deleted successfully")
    public void delete(
            @PathVariable(name = "film_id") int filmId) {
        manager.stream()
            .filter(Film.FILM_ID.equal(filmId))
            .forEach(manager.remover());
    }
    
    @ExceptionHandler(JsonMappingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleMissingValueError() {
        Map<String, Object> error = new HashMap<>();
        error.put("error", "Bad Request");
        error.put("status", 400);
        error.put("message", "Invalid request body: missing required fields");
        
        return Json.toJson(error, true);
    }
    
    @ExceptionHandler(JsonParseException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidJsonError() {
        Map<String, Object> error = new HashMap<>();
        error.put("error", "Bad Request");
        error.put("status", 400);
        error.put("message", "Invalid request body: invalid JSON syntax");
        
        return Json.toJson(error, true);
    }
    
    /**
     * How to filter the results from the controller. This class is designed to
     * be deserialized automatically from JSON.
     */
    public static final class FilmFilter extends AbstractFilter<Film> {
        
        public FilmFilter(
                String operator,
                String property,
                String value) {
            super(operator, property, value);
        }
        
        @Override
        public Predicate<Film> toPredicate() {
            switch (property()) {
                case "filmId" : {
                    final int v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Film.FILM_ID.equal(v);
                        case "ne"   : return Film.FILM_ID.notEqual(v);
                        case "lt"   : return Film.FILM_ID.lessThan(v);
                        case "le"   : return Film.FILM_ID.lessOrEqual(v);
                        case "gt"   : return Film.FILM_ID.greaterThan(v);
                        case "ge"   : return Film.FILM_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.filmId."
                        );
                    }
                }
                case "title" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Film.TITLE.equal(v);
                        case "ne"   : return Film.TITLE.notEqual(v);
                        case "lt"   : return Film.TITLE.lessThan(v);
                        case "le"   : return Film.TITLE.lessOrEqual(v);
                        case "gt"   : return Film.TITLE.greaterThan(v);
                        case "ge"   : return Film.TITLE.greaterOrEqual(v);
                        case "like" : return Film.TITLE.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.title."
                        );
                    }
                }
                case "description" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Film.DESCRIPTION.equal(v);
                        case "ne"   : return Film.DESCRIPTION.notEqual(v);
                        case "lt"   : return Film.DESCRIPTION.lessThan(v);
                        case "le"   : return Film.DESCRIPTION.lessOrEqual(v);
                        case "gt"   : return Film.DESCRIPTION.greaterThan(v);
                        case "ge"   : return Film.DESCRIPTION.greaterOrEqual(v);
                        case "like" : return Film.DESCRIPTION.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.description."
                        );
                    }
                }
                case "releaseYear" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Film.RELEASE_YEAR.equal(v);
                        case "ne"   : return Film.RELEASE_YEAR.notEqual(v);
                        case "lt"   : return Film.RELEASE_YEAR.lessThan(v);
                        case "le"   : return Film.RELEASE_YEAR.lessOrEqual(v);
                        case "gt"   : return Film.RELEASE_YEAR.greaterThan(v);
                        case "ge"   : return Film.RELEASE_YEAR.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.releaseYear."
                        );
                    }
                }
                case "languageId" : {
                    final int v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Film.LANGUAGE_ID.equal(v);
                        case "ne"   : return Film.LANGUAGE_ID.notEqual(v);
                        case "lt"   : return Film.LANGUAGE_ID.lessThan(v);
                        case "le"   : return Film.LANGUAGE_ID.lessOrEqual(v);
                        case "gt"   : return Film.LANGUAGE_ID.greaterThan(v);
                        case "ge"   : return Film.LANGUAGE_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.languageId."
                        );
                    }
                }
                case "originalLanguageId" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Film.ORIGINAL_LANGUAGE_ID.equal(v);
                        case "ne"   : return Film.ORIGINAL_LANGUAGE_ID.notEqual(v);
                        case "lt"   : return Film.ORIGINAL_LANGUAGE_ID.lessThan(v);
                        case "le"   : return Film.ORIGINAL_LANGUAGE_ID.lessOrEqual(v);
                        case "gt"   : return Film.ORIGINAL_LANGUAGE_ID.greaterThan(v);
                        case "ge"   : return Film.ORIGINAL_LANGUAGE_ID.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.originalLanguageId."
                        );
                    }
                }
                case "rentalDuration" : {
                    final int v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Film.RENTAL_DURATION.equal(v);
                        case "ne"   : return Film.RENTAL_DURATION.notEqual(v);
                        case "lt"   : return Film.RENTAL_DURATION.lessThan(v);
                        case "le"   : return Film.RENTAL_DURATION.lessOrEqual(v);
                        case "gt"   : return Film.RENTAL_DURATION.greaterThan(v);
                        case "ge"   : return Film.RENTAL_DURATION.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.rentalDuration."
                        );
                    }
                }
                case "rentalRate" : {
                    final BigDecimal v = new BigDecimal(value());
                    switch (operator()) {
                        case "eq"   : return Film.RENTAL_RATE.equal(v);
                        case "ne"   : return Film.RENTAL_RATE.notEqual(v);
                        case "lt"   : return Film.RENTAL_RATE.lessThan(v);
                        case "le"   : return Film.RENTAL_RATE.lessOrEqual(v);
                        case "gt"   : return Film.RENTAL_RATE.greaterThan(v);
                        case "ge"   : return Film.RENTAL_RATE.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.rentalRate."
                        );
                    }
                }
                case "length" : {
                    final Integer v = Integer.parseInt(value());
                    switch (operator()) {
                        case "eq"   : return Film.LENGTH.equal(v);
                        case "ne"   : return Film.LENGTH.notEqual(v);
                        case "lt"   : return Film.LENGTH.lessThan(v);
                        case "le"   : return Film.LENGTH.lessOrEqual(v);
                        case "gt"   : return Film.LENGTH.greaterThan(v);
                        case "ge"   : return Film.LENGTH.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.length."
                        );
                    }
                }
                case "replacementCost" : {
                    final BigDecimal v = new BigDecimal(value());
                    switch (operator()) {
                        case "eq"   : return Film.REPLACEMENT_COST.equal(v);
                        case "ne"   : return Film.REPLACEMENT_COST.notEqual(v);
                        case "lt"   : return Film.REPLACEMENT_COST.lessThan(v);
                        case "le"   : return Film.REPLACEMENT_COST.lessOrEqual(v);
                        case "gt"   : return Film.REPLACEMENT_COST.greaterThan(v);
                        case "ge"   : return Film.REPLACEMENT_COST.greaterOrEqual(v);
                        case "like" : // Fallthrough
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.replacementCost."
                        );
                    }
                }
                case "rating" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Film.RATING.equal(v);
                        case "ne"   : return Film.RATING.notEqual(v);
                        case "lt"   : return Film.RATING.lessThan(v);
                        case "le"   : return Film.RATING.lessOrEqual(v);
                        case "gt"   : return Film.RATING.greaterThan(v);
                        case "ge"   : return Film.RATING.greaterOrEqual(v);
                        case "like" : return Film.RATING.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.rating."
                        );
                    }
                }
                case "specialFeatures" : {
                    final String v = value();
                    switch (operator()) {
                        case "eq"   : return Film.SPECIAL_FEATURES.equal(v);
                        case "ne"   : return Film.SPECIAL_FEATURES.notEqual(v);
                        case "lt"   : return Film.SPECIAL_FEATURES.lessThan(v);
                        case "le"   : return Film.SPECIAL_FEATURES.lessOrEqual(v);
                        case "gt"   : return Film.SPECIAL_FEATURES.greaterThan(v);
                        case "ge"   : return Film.SPECIAL_FEATURES.greaterOrEqual(v);
                        case "like" : return Film.SPECIAL_FEATURES.contains(v);
                        default : throw new IllegalArgumentException(
                            "'" + operator() + "' is not a valid operator for " +
                            "Film.specialFeatures."
                        );
                    }
                }
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Film property."
                );
            }
        }
    }
    
    /**
     * How to sort the results from the controller. This class is designed to be
     * deserialized automatically from JSON.
     */
    public static final class FilmSort extends AbstractSort<Film> {
        
        public FilmSort(String property, String direction) {
            super(property, direction);
        }
        
        @Override
        public Comparator<Film> toComparator() {
            final Comparator<Film> comparator;
            switch (property()) {
                case "filmId"             : comparator = Film.FILM_ID.comparator();              break;
                case "title"              : comparator = Film.TITLE.comparator();                break;
                case "description"        : comparator = Film.DESCRIPTION.comparator();          break;
                case "releaseYear"        : comparator = Film.RELEASE_YEAR.comparator();         break;
                case "languageId"         : comparator = Film.LANGUAGE_ID.comparator();          break;
                case "originalLanguageId" : comparator = Film.ORIGINAL_LANGUAGE_ID.comparator(); break;
                case "rentalDuration"     : comparator = Film.RENTAL_DURATION.comparator();      break;
                case "rentalRate"         : comparator = Film.RENTAL_RATE.comparator();          break;
                case "length"             : comparator = Film.LENGTH.comparator();               break;
                case "replacementCost"    : comparator = Film.REPLACEMENT_COST.comparator();     break;
                case "rating"             : comparator = Film.RATING.comparator();               break;
                case "specialFeatures"    : comparator = Film.SPECIAL_FEATURES.comparator();     break;
                default : throw new IllegalArgumentException(
                    "'" + property() + "' is not a valid Film property."
                );
            }
            
            switch (direction()) {
                case "ASC"  : return comparator;
                case "DESC" : return comparator.reversed();
                default : throw new IllegalArgumentException(
                    "'" + direction() + "' is not a valid sort direction. " +
                    "Use either 'ASC' or 'DESC', or leave out."
                );
            }
        }
    }
    
    @ResponseStatus(HttpStatus.NOT_FOUND)
    private static class FilmNotFoundException extends RuntimeException {
        
        public FilmNotFoundException(int filmId) {
            super("Film with filmId '" + filmId + "' not found");
        }
    }
    
    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    @ApiModel(description = "A request body model used in POST requests to create a Film entity")
    public static final class FilmCreateBody {
        
        private final @ApiModelProperty(required = true, value = "REST representation of the 'title' column (required)") String title;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'description' column (required)") String description;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'release_year' column (required)") Integer releaseYear;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'language_id' column (required)") int languageId;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'original_language_id' column (required)") Integer originalLanguageId;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'rental_duration' column (required)") int rentalDuration;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'rental_rate' column (required)") BigDecimal rentalRate;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'length' column (required)") Integer length;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'replacement_cost' column (required)") BigDecimal replacementCost;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'rating' column (required)") String rating;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'special_features' column (required)") String specialFeatures;
        
        @JsonCreator
        public FilmCreateBody(
                @JsonProperty("title") String title,
                @JsonProperty("description") String description,
                @JsonProperty("releaseYear") Integer releaseYear,
                @JsonProperty("languageId") Integer languageId,
                @JsonProperty("originalLanguageId") Integer originalLanguageId,
                @JsonProperty("rentalDuration") Integer rentalDuration,
                @JsonProperty("rentalRate") BigDecimal rentalRate,
                @JsonProperty("length") Integer length,
                @JsonProperty("replacementCost") BigDecimal replacementCost,
                @JsonProperty("rating") String rating,
                @JsonProperty("specialFeatures") String specialFeatures) {
            this.title = Objects.requireNonNull(title, "`title` is required");
            this.description = Objects.requireNonNull(description, "`description` is required");
            this.releaseYear = Objects.requireNonNull(releaseYear, "`releaseYear` is required");
            this.languageId = Objects.requireNonNull(languageId, "`languageId` is required");
            this.originalLanguageId = Objects.requireNonNull(originalLanguageId, "`originalLanguageId` is required");
            this.rentalDuration = Objects.requireNonNull(rentalDuration, "`rentalDuration` is required");
            this.rentalRate = Objects.requireNonNull(rentalRate, "`rentalRate` is required");
            this.length = Objects.requireNonNull(length, "`length` is required");
            this.replacementCost = Objects.requireNonNull(replacementCost, "`replacementCost` is required");
            this.rating = Objects.requireNonNull(rating, "`rating` is required");
            this.specialFeatures = Objects.requireNonNull(specialFeatures, "`specialFeatures` is required");
        }
        
        public String getTitle() {
            return this.title;
        }
        
        public String getDescription() {
            return this.description;
        }
        
        public Integer getReleaseYear() {
            return this.releaseYear;
        }
        
        public int getLanguageId() {
            return this.languageId;
        }
        
        public Integer getOriginalLanguageId() {
            return this.originalLanguageId;
        }
        
        public int getRentalDuration() {
            return this.rentalDuration;
        }
        
        public BigDecimal getRentalRate() {
            return this.rentalRate;
        }
        
        public Integer getLength() {
            return this.length;
        }
        
        public BigDecimal getReplacementCost() {
            return this.replacementCost;
        }
        
        public String getRating() {
            return this.rating;
        }
        
        public String getSpecialFeatures() {
            return this.specialFeatures;
        }
    }
    
    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    @ApiModel(description = "A request body model used in PATCH requests to update a Film entity")
    public static final class FilmUpdateBody {
        
        private final @ApiModelProperty(required = true, value = "REST representation of the 'title' column (required)") String title;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'description' column (required)") String description;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'release_year' column (required)") Integer releaseYear;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'language_id' column (required)") int languageId;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'original_language_id' column (required)") Integer originalLanguageId;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'rental_duration' column (required)") int rentalDuration;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'rental_rate' column (required)") BigDecimal rentalRate;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'length' column (required)") Integer length;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'replacement_cost' column (required)") BigDecimal replacementCost;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'rating' column (required)") String rating;
        private final @ApiModelProperty(required = true, value = "REST representation of the 'special_features' column (required)") String specialFeatures;
        
        @JsonCreator
        public FilmUpdateBody(
                @JsonProperty("title") String title,
                @JsonProperty("description") String description,
                @JsonProperty("releaseYear") Integer releaseYear,
                @JsonProperty("languageId") Integer languageId,
                @JsonProperty("originalLanguageId") Integer originalLanguageId,
                @JsonProperty("rentalDuration") Integer rentalDuration,
                @JsonProperty("rentalRate") BigDecimal rentalRate,
                @JsonProperty("length") Integer length,
                @JsonProperty("replacementCost") BigDecimal replacementCost,
                @JsonProperty("rating") String rating,
                @JsonProperty("specialFeatures") String specialFeatures) {
            this.title = Objects.requireNonNull(title, "`title` is required");
            this.description = Objects.requireNonNull(description, "`description` is required");
            this.releaseYear = Objects.requireNonNull(releaseYear, "`releaseYear` is required");
            this.languageId = Objects.requireNonNull(languageId, "`languageId` is required");
            this.originalLanguageId = Objects.requireNonNull(originalLanguageId, "`originalLanguageId` is required");
            this.rentalDuration = Objects.requireNonNull(rentalDuration, "`rentalDuration` is required");
            this.rentalRate = Objects.requireNonNull(rentalRate, "`rentalRate` is required");
            this.length = Objects.requireNonNull(length, "`length` is required");
            this.replacementCost = Objects.requireNonNull(replacementCost, "`replacementCost` is required");
            this.rating = Objects.requireNonNull(rating, "`rating` is required");
            this.specialFeatures = Objects.requireNonNull(specialFeatures, "`specialFeatures` is required");
        }
        
        public String getTitle() {
            return this.title;
        }
        
        public String getDescription() {
            return this.description;
        }
        
        public Integer getReleaseYear() {
            return this.releaseYear;
        }
        
        public int getLanguageId() {
            return this.languageId;
        }
        
        public Integer getOriginalLanguageId() {
            return this.originalLanguageId;
        }
        
        public int getRentalDuration() {
            return this.rentalDuration;
        }
        
        public BigDecimal getRentalRate() {
            return this.rentalRate;
        }
        
        public Integer getLength() {
            return this.length;
        }
        
        public BigDecimal getReplacementCost() {
            return this.replacementCost;
        }
        
        public String getRating() {
            return this.rating;
        }
        
        public String getSpecialFeatures() {
            return this.specialFeatures;
        }
    }
}