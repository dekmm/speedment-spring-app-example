package com.speedment.demo.sakila.sakila.payment.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.customer.Customer;
import com.speedment.demo.sakila.sakila.payment.Payment;
import com.speedment.demo.sakila.sakila.rental.Rental;
import com.speedment.demo.sakila.sakila.staff.Staff;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.ComparableForeignKeyField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.speedment.demo.sakila.sakila.payment.Payment}-interface representing
 * entities of the {@code payment}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedPayment {
    
    /**
     * This Field corresponds to the {@link Payment} field that can be obtained
     * using the {@link Payment#getPaymentId()} method.
     */
    IntField<Payment, Integer> PAYMENT_ID = IntField.create(
        Identifier.PAYMENT_ID,
        Payment::getPaymentId,
        Payment::setPaymentId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Payment} field that can be obtained
     * using the {@link Payment#getCustomerId()} method.
     */
    IntForeignKeyField<Payment, Integer, Customer> CUSTOMER_ID = IntForeignKeyField.create(
        Identifier.CUSTOMER_ID,
        Payment::getCustomerId,
        Payment::setCustomerId,
        Customer.CUSTOMER_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Payment} field that can be obtained
     * using the {@link Payment#getStaffId()} method.
     */
    IntForeignKeyField<Payment, Integer, Staff> STAFF_ID = IntForeignKeyField.create(
        Identifier.STAFF_ID,
        Payment::getStaffId,
        Payment::setStaffId,
        Staff.STAFF_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Payment} field that can be obtained
     * using the {@link Payment#getRentalId()} method.
     */
    ComparableForeignKeyField<Payment, Integer, Integer, Rental> RENTAL_ID = ComparableForeignKeyField.create(
        Identifier.RENTAL_ID,
        o -> OptionalUtil.unwrap(o.getRentalId()),
        Payment::setRentalId,
        Rental.RENTAL_ID,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Payment} field that can be obtained
     * using the {@link Payment#getAmount()} method.
     */
    ComparableField<Payment, BigDecimal, BigDecimal> AMOUNT = ComparableField.create(
        Identifier.AMOUNT,
        Payment::getAmount,
        Payment::setAmount,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Payment} field that can be obtained
     * using the {@link Payment#getPaymentDate()} method.
     */
    ComparableField<Payment, Timestamp, Timestamp> PAYMENT_DATE = ComparableField.create(
        Identifier.PAYMENT_DATE,
        Payment::getPaymentDate,
        Payment::setPaymentDate,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Payment} field that can be obtained
     * using the {@link Payment#getLastUpdate()} method.
     */
    ComparableField<Payment, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        Payment::getLastUpdate,
        Payment::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the paymentId of this Payment. The paymentId field corresponds to
     * the database column sakila.sakila.payment.payment_id.
     * 
     * @return the paymentId of this Payment
     */
    int getPaymentId();
    
    /**
     * Returns the customerId of this Payment. The customerId field corresponds
     * to the database column sakila.sakila.payment.customer_id.
     * 
     * @return the customerId of this Payment
     */
    int getCustomerId();
    
    /**
     * Returns the staffId of this Payment. The staffId field corresponds to the
     * database column sakila.sakila.payment.staff_id.
     * 
     * @return the staffId of this Payment
     */
    int getStaffId();
    
    /**
     * Returns the rentalId of this Payment. The rentalId field corresponds to
     * the database column sakila.sakila.payment.rental_id.
     * 
     * @return the rentalId of this Payment
     */
    OptionalInt getRentalId();
    
    /**
     * Returns the amount of this Payment. The amount field corresponds to the
     * database column sakila.sakila.payment.amount.
     * 
     * @return the amount of this Payment
     */
    BigDecimal getAmount();
    
    /**
     * Returns the paymentDate of this Payment. The paymentDate field
     * corresponds to the database column sakila.sakila.payment.payment_date.
     * 
     * @return the paymentDate of this Payment
     */
    Timestamp getPaymentDate();
    
    /**
     * Returns the lastUpdate of this Payment. The lastUpdate field corresponds
     * to the database column sakila.sakila.payment.last_update.
     * 
     * @return the lastUpdate of this Payment
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the paymentId of this Payment. The paymentId field corresponds to
     * the database column sakila.sakila.payment.payment_id.
     * 
     * @param paymentId to set of this Payment
     * @return          this Payment instance
     */
    Payment setPaymentId(int paymentId);
    
    /**
     * Sets the customerId of this Payment. The customerId field corresponds to
     * the database column sakila.sakila.payment.customer_id.
     * 
     * @param customerId to set of this Payment
     * @return           this Payment instance
     */
    Payment setCustomerId(int customerId);
    
    /**
     * Sets the staffId of this Payment. The staffId field corresponds to the
     * database column sakila.sakila.payment.staff_id.
     * 
     * @param staffId to set of this Payment
     * @return        this Payment instance
     */
    Payment setStaffId(int staffId);
    
    /**
     * Sets the rentalId of this Payment. The rentalId field corresponds to the
     * database column sakila.sakila.payment.rental_id.
     * 
     * @param rentalId to set of this Payment
     * @return         this Payment instance
     */
    Payment setRentalId(Integer rentalId);
    
    /**
     * Sets the amount of this Payment. The amount field corresponds to the
     * database column sakila.sakila.payment.amount.
     * 
     * @param amount to set of this Payment
     * @return       this Payment instance
     */
    Payment setAmount(BigDecimal amount);
    
    /**
     * Sets the paymentDate of this Payment. The paymentDate field corresponds
     * to the database column sakila.sakila.payment.payment_date.
     * 
     * @param paymentDate to set of this Payment
     * @return            this Payment instance
     */
    Payment setPaymentDate(Timestamp paymentDate);
    
    /**
     * Sets the lastUpdate of this Payment. The lastUpdate field corresponds to
     * the database column sakila.sakila.payment.last_update.
     * 
     * @param lastUpdate to set of this Payment
     * @return           this Payment instance
     */
    Payment setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Queries the specified manager for the referenced Customer. If no such
     * Customer exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Customer findCustomerId(Manager<Customer> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Staff. If no such Staff
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Staff findStaffId(Manager<Staff> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Rental. If no such
     * Rental exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Optional<Rental> findRentalId(Manager<Rental> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Payment> {
        
        PAYMENT_ID   ("payment_id"),
        CUSTOMER_ID  ("customer_id"),
        STAFF_ID     ("staff_id"),
        RENTAL_ID    ("rental_id"),
        AMOUNT       ("amount"),
        PAYMENT_DATE ("payment_date"),
        LAST_UPDATE  ("last_update");
        
        private final String columnId;
        private final TableIdentifier<Payment> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "sakila";
        }
        
        @Override
        public String getSchemaId() {
            return "sakila";
        }
        
        @Override
        public String getTableId() {
            return "payment";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Payment> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}