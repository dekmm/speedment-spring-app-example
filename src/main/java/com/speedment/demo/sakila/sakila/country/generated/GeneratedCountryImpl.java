package com.speedment.demo.sakila.sakila.country.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.country.Country;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.demo.sakila.sakila.country.Country}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCountryImpl implements Country {
    
    private int countryId;
    private String country;
    private Timestamp lastUpdate;
    
    protected GeneratedCountryImpl() {}
    
    @Override
    public int getCountryId() {
        return countryId;
    }
    
    @Override
    public String getCountry() {
        return country;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Country setCountryId(int countryId) {
        this.countryId = countryId;
        return this;
    }
    
    @Override
    public Country setCountry(String country) {
        this.country = country;
        return this;
    }
    
    @Override
    public Country setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("countryId = "  + Objects.toString(getCountryId()));
        sj.add("country = "    + Objects.toString(getCountry()));
        sj.add("lastUpdate = " + Objects.toString(getLastUpdate()));
        return "CountryImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Country)) { return false; }
        final Country thatCountry = (Country)that;
        if (this.getCountryId() != thatCountry.getCountryId()) { return false; }
        if (!Objects.equals(this.getCountry(), thatCountry.getCountry())) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatCountry.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getCountryId());
        hash = 31 * hash + Objects.hashCode(getCountry());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}