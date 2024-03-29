package com.speedment.demo.sakila.sakila.sales_by_store.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.sales_by_store.SalesByStore;
import com.speedment.demo.sakila.sakila.sales_by_store.SalesByStoreImpl;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.speedment.demo.sakila.sakila.sales_by_store.SalesByStore} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSalesByStoreSqlAdapter implements SqlAdapter<SalesByStore> {
    
    private final TableIdentifier<SalesByStore> tableIdentifier;
    
    protected GeneratedSalesByStoreSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "sales_by_store");
    }
    
    protected SalesByStore apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setStore(      resultSet.getString(1 + offset))
            .setManager(    resultSet.getString(2 + offset))
            .setTotalSales( resultSet.getBigDecimal(3 + offset))
            ;
    }
    
    protected SalesByStoreImpl createEntity() {
        return new SalesByStoreImpl();
    }
    
    @Override
    public TableIdentifier<SalesByStore> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, SalesByStore> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, SalesByStore> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}