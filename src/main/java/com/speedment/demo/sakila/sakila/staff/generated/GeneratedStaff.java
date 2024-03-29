package com.speedment.demo.sakila.sakila.staff.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.demo.sakila.sakila.address.Address;
import com.speedment.demo.sakila.sakila.staff.Staff;
import com.speedment.demo.sakila.sakila.store.Store;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.BooleanField;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.ReferenceField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.speedment.demo.sakila.sakila.staff.Staff}-interface representing entities
 * of the {@code staff}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStaff {
    
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getStaffId()} method.
     */
    IntField<Staff, Integer> STAFF_ID = IntField.create(
        Identifier.STAFF_ID,
        Staff::getStaffId,
        Staff::setStaffId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getFirstName()} method.
     */
    StringField<Staff, String> FIRST_NAME = StringField.create(
        Identifier.FIRST_NAME,
        Staff::getFirstName,
        Staff::setFirstName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getLastName()} method.
     */
    StringField<Staff, String> LAST_NAME = StringField.create(
        Identifier.LAST_NAME,
        Staff::getLastName,
        Staff::setLastName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getAddressId()} method.
     */
    IntForeignKeyField<Staff, Integer, Address> ADDRESS_ID = IntForeignKeyField.create(
        Identifier.ADDRESS_ID,
        Staff::getAddressId,
        Staff::setAddressId,
        Address.ADDRESS_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getPicture()} method.
     */
    ReferenceField<Staff, Blob, Blob> PICTURE = ReferenceField.create(
        Identifier.PICTURE,
        o -> OptionalUtil.unwrap(o.getPicture()),
        Staff::setPicture,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getEmail()} method.
     */
    StringField<Staff, String> EMAIL = StringField.create(
        Identifier.EMAIL,
        o -> OptionalUtil.unwrap(o.getEmail()),
        Staff::setEmail,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getStoreId()} method.
     */
    IntForeignKeyField<Staff, Integer, Store> STORE_ID = IntForeignKeyField.create(
        Identifier.STORE_ID,
        Staff::getStoreId,
        Staff::setStoreId,
        Store.STORE_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getActive()} method.
     */
    BooleanField<Staff, Boolean> ACTIVE = BooleanField.create(
        Identifier.ACTIVE,
        Staff::getActive,
        Staff::setActive,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getUsername()} method.
     */
    StringField<Staff, String> USERNAME = StringField.create(
        Identifier.USERNAME,
        Staff::getUsername,
        Staff::setUsername,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getPassword()} method.
     */
    StringField<Staff, String> PASSWORD = StringField.create(
        Identifier.PASSWORD,
        o -> OptionalUtil.unwrap(o.getPassword()),
        Staff::setPassword,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Staff} field that can be obtained
     * using the {@link Staff#getLastUpdate()} method.
     */
    ComparableField<Staff, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        Staff::getLastUpdate,
        Staff::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the staffId of this Staff. The staffId field corresponds to the
     * database column sakila.sakila.staff.staff_id.
     * 
     * @return the staffId of this Staff
     */
    int getStaffId();
    
    /**
     * Returns the firstName of this Staff. The firstName field corresponds to
     * the database column sakila.sakila.staff.first_name.
     * 
     * @return the firstName of this Staff
     */
    String getFirstName();
    
    /**
     * Returns the lastName of this Staff. The lastName field corresponds to the
     * database column sakila.sakila.staff.last_name.
     * 
     * @return the lastName of this Staff
     */
    String getLastName();
    
    /**
     * Returns the addressId of this Staff. The addressId field corresponds to
     * the database column sakila.sakila.staff.address_id.
     * 
     * @return the addressId of this Staff
     */
    int getAddressId();
    
    /**
     * Returns the picture of this Staff. The picture field corresponds to the
     * database column sakila.sakila.staff.picture.
     * 
     * @return the picture of this Staff
     */
    Optional<Blob> getPicture();
    
    /**
     * Returns the email of this Staff. The email field corresponds to the
     * database column sakila.sakila.staff.email.
     * 
     * @return the email of this Staff
     */
    Optional<String> getEmail();
    
    /**
     * Returns the storeId of this Staff. The storeId field corresponds to the
     * database column sakila.sakila.staff.store_id.
     * 
     * @return the storeId of this Staff
     */
    int getStoreId();
    
    /**
     * Returns the active of this Staff. The active field corresponds to the
     * database column sakila.sakila.staff.active.
     * 
     * @return the active of this Staff
     */
    boolean getActive();
    
    /**
     * Returns the username of this Staff. The username field corresponds to the
     * database column sakila.sakila.staff.username.
     * 
     * @return the username of this Staff
     */
    String getUsername();
    
    /**
     * Returns the password of this Staff. The password field corresponds to the
     * database column sakila.sakila.staff.password.
     * 
     * @return the password of this Staff
     */
    Optional<String> getPassword();
    
    /**
     * Returns the lastUpdate of this Staff. The lastUpdate field corresponds to
     * the database column sakila.sakila.staff.last_update.
     * 
     * @return the lastUpdate of this Staff
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the staffId of this Staff. The staffId field corresponds to the
     * database column sakila.sakila.staff.staff_id.
     * 
     * @param staffId to set of this Staff
     * @return        this Staff instance
     */
    Staff setStaffId(int staffId);
    
    /**
     * Sets the firstName of this Staff. The firstName field corresponds to the
     * database column sakila.sakila.staff.first_name.
     * 
     * @param firstName to set of this Staff
     * @return          this Staff instance
     */
    Staff setFirstName(String firstName);
    
    /**
     * Sets the lastName of this Staff. The lastName field corresponds to the
     * database column sakila.sakila.staff.last_name.
     * 
     * @param lastName to set of this Staff
     * @return         this Staff instance
     */
    Staff setLastName(String lastName);
    
    /**
     * Sets the addressId of this Staff. The addressId field corresponds to the
     * database column sakila.sakila.staff.address_id.
     * 
     * @param addressId to set of this Staff
     * @return          this Staff instance
     */
    Staff setAddressId(int addressId);
    
    /**
     * Sets the picture of this Staff. The picture field corresponds to the
     * database column sakila.sakila.staff.picture.
     * 
     * @param picture to set of this Staff
     * @return        this Staff instance
     */
    Staff setPicture(Blob picture);
    
    /**
     * Sets the email of this Staff. The email field corresponds to the database
     * column sakila.sakila.staff.email.
     * 
     * @param email to set of this Staff
     * @return      this Staff instance
     */
    Staff setEmail(String email);
    
    /**
     * Sets the storeId of this Staff. The storeId field corresponds to the
     * database column sakila.sakila.staff.store_id.
     * 
     * @param storeId to set of this Staff
     * @return        this Staff instance
     */
    Staff setStoreId(int storeId);
    
    /**
     * Sets the active of this Staff. The active field corresponds to the
     * database column sakila.sakila.staff.active.
     * 
     * @param active to set of this Staff
     * @return       this Staff instance
     */
    Staff setActive(boolean active);
    
    /**
     * Sets the username of this Staff. The username field corresponds to the
     * database column sakila.sakila.staff.username.
     * 
     * @param username to set of this Staff
     * @return         this Staff instance
     */
    Staff setUsername(String username);
    
    /**
     * Sets the password of this Staff. The password field corresponds to the
     * database column sakila.sakila.staff.password.
     * 
     * @param password to set of this Staff
     * @return         this Staff instance
     */
    Staff setPassword(String password);
    
    /**
     * Sets the lastUpdate of this Staff. The lastUpdate field corresponds to
     * the database column sakila.sakila.staff.last_update.
     * 
     * @param lastUpdate to set of this Staff
     * @return           this Staff instance
     */
    Staff setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Queries the specified manager for the referenced Address. If no such
     * Address exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Address findAddressId(Manager<Address> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Store. If no such Store
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Store findStoreId(Manager<Store> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Staff> {
        
        STAFF_ID    ("staff_id"),
        FIRST_NAME  ("first_name"),
        LAST_NAME   ("last_name"),
        ADDRESS_ID  ("address_id"),
        PICTURE     ("picture"),
        EMAIL       ("email"),
        STORE_ID    ("store_id"),
        ACTIVE      ("active"),
        USERNAME    ("username"),
        PASSWORD    ("password"),
        LAST_UPDATE ("last_update");
        
        private final String columnId;
        private final TableIdentifier<Staff> tableIdentifier;
        
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
            return "staff";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Staff> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}