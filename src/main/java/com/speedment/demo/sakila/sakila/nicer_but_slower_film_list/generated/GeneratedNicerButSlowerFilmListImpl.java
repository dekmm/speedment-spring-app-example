package com.speedment.demo.sakila.sakila.nicer_but_slower_film_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.nicer_but_slower_film_list.NicerButSlowerFilmList;
import com.speedment.runtime.core.util.OptionalUtil;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.demo.sakila.sakila.nicer_but_slower_film_list.NicerButSlowerFilmList}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedNicerButSlowerFilmListImpl implements NicerButSlowerFilmList {
    
    private Integer fid;
    private String title;
    private String description;
    private String category;
    private BigDecimal price;
    private Integer length;
    private String rating;
    private String actors;
    
    protected GeneratedNicerButSlowerFilmListImpl() {}
    
    @Override
    public OptionalInt getFid() {
        return OptionalUtil.ofNullable(fid);
    }
    
    @Override
    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }
    
    @Override
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
    
    @Override
    public String getCategory() {
        return category;
    }
    
    @Override
    public Optional<BigDecimal> getPrice() {
        return Optional.ofNullable(price);
    }
    
    @Override
    public OptionalInt getLength() {
        return OptionalUtil.ofNullable(length);
    }
    
    @Override
    public Optional<String> getRating() {
        return Optional.ofNullable(rating);
    }
    
    @Override
    public Optional<String> getActors() {
        return Optional.ofNullable(actors);
    }
    
    @Override
    public NicerButSlowerFilmList setFid(Integer fid) {
        this.fid = fid;
        return this;
    }
    
    @Override
    public NicerButSlowerFilmList setTitle(String title) {
        this.title = title;
        return this;
    }
    
    @Override
    public NicerButSlowerFilmList setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public NicerButSlowerFilmList setCategory(String category) {
        this.category = category;
        return this;
    }
    
    @Override
    public NicerButSlowerFilmList setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    
    @Override
    public NicerButSlowerFilmList setLength(Integer length) {
        this.length = length;
        return this;
    }
    
    @Override
    public NicerButSlowerFilmList setRating(String rating) {
        this.rating = rating;
        return this;
    }
    
    @Override
    public NicerButSlowerFilmList setActors(String actors) {
        this.actors = actors;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("fid = "         + Objects.toString(OptionalUtil.unwrap(getFid())));
        sj.add("title = "       + Objects.toString(OptionalUtil.unwrap(getTitle())));
        sj.add("description = " + Objects.toString(OptionalUtil.unwrap(getDescription())));
        sj.add("category = "    + Objects.toString(getCategory()));
        sj.add("price = "       + Objects.toString(OptionalUtil.unwrap(getPrice())));
        sj.add("length = "      + Objects.toString(OptionalUtil.unwrap(getLength())));
        sj.add("rating = "      + Objects.toString(OptionalUtil.unwrap(getRating())));
        sj.add("actors = "      + Objects.toString(OptionalUtil.unwrap(getActors())));
        return "NicerButSlowerFilmListImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof NicerButSlowerFilmList)) { return false; }
        final NicerButSlowerFilmList thatNicerButSlowerFilmList = (NicerButSlowerFilmList)that;
        if (!Objects.equals(this.getFid(), thatNicerButSlowerFilmList.getFid())) { return false; }
        if (!Objects.equals(this.getTitle(), thatNicerButSlowerFilmList.getTitle())) { return false; }
        if (!Objects.equals(this.getDescription(), thatNicerButSlowerFilmList.getDescription())) { return false; }
        if (!Objects.equals(this.getCategory(), thatNicerButSlowerFilmList.getCategory())) { return false; }
        if (!Objects.equals(this.getPrice(), thatNicerButSlowerFilmList.getPrice())) { return false; }
        if (!Objects.equals(this.getLength(), thatNicerButSlowerFilmList.getLength())) { return false; }
        if (!Objects.equals(this.getRating(), thatNicerButSlowerFilmList.getRating())) { return false; }
        if (!Objects.equals(this.getActors(), thatNicerButSlowerFilmList.getActors())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getFid()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTitle()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getDescription()));
        hash = 31 * hash + Objects.hashCode(getCategory());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPrice()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getLength()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getRating()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getActors()));
        return hash;
    }
}