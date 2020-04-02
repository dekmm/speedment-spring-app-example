package com.speedment.demo.sakila.sakila.customer.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.customer.Customer;
import com.speedment.demo.sakila.sakila.customer.CustomerImpl;
import com.speedment.demo.sakila.sakila.customer.CustomerManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.demo.sakila.sakila.customer.Customer} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCustomerManagerImpl 
extends AbstractManager<Customer> 
implements GeneratedCustomerManager {
    
    private final TableIdentifier<Customer> tableIdentifier;
    
    protected GeneratedCustomerManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "customer");
    }
    
    @Override
    public Customer create() {
        return new CustomerImpl();
    }
    
    @Override
    public TableIdentifier<Customer> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Customer>> fields() {
        return CustomerManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Customer>> primaryKeyFields() {
        return Stream.of(
            Customer.CUSTOMER_ID
        );
    }
}