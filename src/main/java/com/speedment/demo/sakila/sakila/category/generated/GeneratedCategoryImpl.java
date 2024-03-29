package com.speedment.demo.sakila.sakila.category.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.category.Category;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.demo.sakila.sakila.category.Category}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCategoryImpl implements Category {
    
    private int categoryId;
    private String name;
    private Timestamp lastUpdate;
    
    protected GeneratedCategoryImpl() {}
    
    @Override
    public int getCategoryId() {
        return categoryId;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Category setCategoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    
    @Override
    public Category setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Category setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("categoryId = " + Objects.toString(getCategoryId()));
        sj.add("name = "       + Objects.toString(getName()));
        sj.add("lastUpdate = " + Objects.toString(getLastUpdate()));
        return "CategoryImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Category)) { return false; }
        final Category thatCategory = (Category)that;
        if (this.getCategoryId() != thatCategory.getCategoryId()) { return false; }
        if (!Objects.equals(this.getName(), thatCategory.getName())) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatCategory.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getCategoryId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}