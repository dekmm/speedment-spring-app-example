package com.speedment.demo.sakila.sakila.customer_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.customer_list.CustomerList;
import com.speedment.demo.sakila.sakila.customer_list.CustomerListImpl;
import com.speedment.demo.sakila.sakila.customer_list.CustomerListManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractViewManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.demo.sakila.sakila.customer_list.CustomerList} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCustomerListManagerImpl 
extends AbstractViewManager<CustomerList> 
implements GeneratedCustomerListManager {
    
    private final TableIdentifier<CustomerList> tableIdentifier;
    
    protected GeneratedCustomerListManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "customer_list");
    }
    
    @Override
    public CustomerList create() {
        return new CustomerListImpl();
    }
    
    @Override
    public TableIdentifier<CustomerList> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<CustomerList>> fields() {
        return CustomerListManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<CustomerList>> primaryKeyFields() {
        return Stream.empty();
    }
}