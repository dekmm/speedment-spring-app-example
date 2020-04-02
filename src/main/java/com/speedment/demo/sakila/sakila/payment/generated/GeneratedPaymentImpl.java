package com.speedment.demo.sakila.sakila.payment.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.customer.Customer;
import com.speedment.demo.sakila.sakila.payment.Payment;
import com.speedment.demo.sakila.sakila.rental.Rental;
import com.speedment.demo.sakila.sakila.staff.Staff;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.demo.sakila.sakila.payment.Payment}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedPaymentImpl implements Payment {
    
    private int paymentId;
    private int customerId;
    private int staffId;
    private Integer rentalId;
    private BigDecimal amount;
    private Timestamp paymentDate;
    private Timestamp lastUpdate;
    
    protected GeneratedPaymentImpl() {}
    
    @Override
    public int getPaymentId() {
        return paymentId;
    }
    
    @Override
    public int getCustomerId() {
        return customerId;
    }
    
    @Override
    public int getStaffId() {
        return staffId;
    }
    
    @Override
    public OptionalInt getRentalId() {
        return OptionalUtil.ofNullable(rentalId);
    }
    
    @Override
    public BigDecimal getAmount() {
        return amount;
    }
    
    @Override
    public Timestamp getPaymentDate() {
        return paymentDate;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Payment setPaymentId(int paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    
    @Override
    public Payment setCustomerId(int customerId) {
        this.customerId = customerId;
        return this;
    }
    
    @Override
    public Payment setStaffId(int staffId) {
        this.staffId = staffId;
        return this;
    }
    
    @Override
    public Payment setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
        return this;
    }
    
    @Override
    public Payment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }
    
    @Override
    public Payment setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }
    
    @Override
    public Payment setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Customer findCustomerId(Manager<Customer> foreignManager) {
        return foreignManager.stream().filter(Customer.CUSTOMER_ID.equal(getCustomerId())).findAny().orElse(null);
    }
    
    @Override
    public Staff findStaffId(Manager<Staff> foreignManager) {
        return foreignManager.stream().filter(Staff.STAFF_ID.equal(getStaffId())).findAny().orElse(null);
    }
    
    @Override
    public Optional<Rental> findRentalId(Manager<Rental> foreignManager) {
        if (getRentalId().isPresent()) {
            return foreignManager.stream().filter(Rental.RENTAL_ID.equal(getRentalId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("paymentId = "   + Objects.toString(getPaymentId()));
        sj.add("customerId = "  + Objects.toString(getCustomerId()));
        sj.add("staffId = "     + Objects.toString(getStaffId()));
        sj.add("rentalId = "    + Objects.toString(OptionalUtil.unwrap(getRentalId())));
        sj.add("amount = "      + Objects.toString(getAmount()));
        sj.add("paymentDate = " + Objects.toString(getPaymentDate()));
        sj.add("lastUpdate = "  + Objects.toString(getLastUpdate()));
        return "PaymentImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Payment)) { return false; }
        final Payment thatPayment = (Payment)that;
        if (this.getPaymentId() != thatPayment.getPaymentId()) { return false; }
        if (this.getCustomerId() != thatPayment.getCustomerId()) { return false; }
        if (this.getStaffId() != thatPayment.getStaffId()) { return false; }
        if (!Objects.equals(this.getRentalId(), thatPayment.getRentalId())) { return false; }
        if (!Objects.equals(this.getAmount(), thatPayment.getAmount())) { return false; }
        if (!Objects.equals(this.getPaymentDate(), thatPayment.getPaymentDate())) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatPayment.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getPaymentId());
        hash = 31 * hash + Integer.hashCode(getCustomerId());
        hash = 31 * hash + Integer.hashCode(getStaffId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getRentalId()));
        hash = 31 * hash + Objects.hashCode(getAmount());
        hash = 31 * hash + Objects.hashCode(getPaymentDate());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}