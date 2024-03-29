package com.speedment.demo.sakila.sakila.film_text.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.film_text.FilmText;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.demo.sakila.sakila.film_text.FilmText}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmTextImpl implements FilmText {
    
    private short filmId;
    private String title;
    private String description;
    
    protected GeneratedFilmTextImpl() {}
    
    @Override
    public short getFilmId() {
        return filmId;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
    
    @Override
    public FilmText setFilmId(short filmId) {
        this.filmId = filmId;
        return this;
    }
    
    @Override
    public FilmText setTitle(String title) {
        this.title = title;
        return this;
    }
    
    @Override
    public FilmText setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("filmId = "      + Objects.toString(getFilmId()));
        sj.add("title = "       + Objects.toString(getTitle()));
        sj.add("description = " + Objects.toString(OptionalUtil.unwrap(getDescription())));
        return "FilmTextImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof FilmText)) { return false; }
        final FilmText thatFilmText = (FilmText)that;
        if (this.getFilmId() != thatFilmText.getFilmId()) { return false; }
        if (!Objects.equals(this.getTitle(), thatFilmText.getTitle())) { return false; }
        if (!Objects.equals(this.getDescription(), thatFilmText.getDescription())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getFilmId());
        hash = 31 * hash + Objects.hashCode(getTitle());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getDescription()));
        return hash;
    }
}