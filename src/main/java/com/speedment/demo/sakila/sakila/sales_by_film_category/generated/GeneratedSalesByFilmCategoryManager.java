package com.speedment.demo.sakila.sakila.sales_by_film_category.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.sales_by_film_category.SalesByFilmCategory;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.speedment.demo.sakila.sakila.sales_by_film_category.SalesByFilmCategory}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSalesByFilmCategoryManager extends Manager<SalesByFilmCategory> {
    
    TableIdentifier<SalesByFilmCategory> IDENTIFIER = TableIdentifier.of("sakila", "sakila", "sales_by_film_category");
    List<Field<SalesByFilmCategory>> FIELDS = unmodifiableList(asList(
        SalesByFilmCategory.CATEGORY,
        SalesByFilmCategory.TOTAL_SALES
    ));
    
    @Override
    default Class<SalesByFilmCategory> getEntityClass() {
        return SalesByFilmCategory.class;
    }
}