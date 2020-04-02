package com.speedment.demo.sakila.sakila.country.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.country.Country;
import com.speedment.demo.sakila.sakila.country.CountryImpl;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.speedment.demo.sakila.sakila.country.Country} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCountrySqlAdapter implements SqlAdapter<Country> {
    
    private final TableIdentifier<Country> tableIdentifier;
    
    protected GeneratedCountrySqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "country");
    }
    
    protected Country apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setCountryId(  getInt(resultSet, 1 + offset))
            .setCountry(    resultSet.getString(2 + offset))
            .setLastUpdate( resultSet.getTimestamp(3 + offset))
            ;
    }
    
    protected CountryImpl createEntity() {
        return new CountryImpl();
    }
    
    @Override
    public TableIdentifier<Country> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Country> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Country> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}