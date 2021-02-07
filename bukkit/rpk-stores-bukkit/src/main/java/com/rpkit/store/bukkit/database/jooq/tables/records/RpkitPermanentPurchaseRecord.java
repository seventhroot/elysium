/*
 * This file is generated by jOOQ.
 */
package com.rpkit.store.bukkit.database.jooq.tables.records;


import com.rpkit.store.bukkit.database.jooq.tables.RpkitPermanentPurchase;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitPermanentPurchaseRecord extends UpdatableRecordImpl<RpkitPermanentPurchaseRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>rpkit_stores.rpkit_permanent_purchase.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>rpkit_stores.rpkit_permanent_purchase.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>rpkit_stores.rpkit_permanent_purchase.purchase_id</code>.
     */
    public void setPurchaseId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>rpkit_stores.rpkit_permanent_purchase.purchase_id</code>.
     */
    public Integer getPurchaseId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RpkitPermanentPurchase.RPKIT_PERMANENT_PURCHASE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return RpkitPermanentPurchase.RPKIT_PERMANENT_PURCHASE.PURCHASE_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPurchaseId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPurchaseId();
    }

    @Override
    public RpkitPermanentPurchaseRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RpkitPermanentPurchaseRecord value2(Integer value) {
        setPurchaseId(value);
        return this;
    }

    @Override
    public RpkitPermanentPurchaseRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RpkitPermanentPurchaseRecord
     */
    public RpkitPermanentPurchaseRecord() {
        super(RpkitPermanentPurchase.RPKIT_PERMANENT_PURCHASE);
    }

    /**
     * Create a detached, initialised RpkitPermanentPurchaseRecord
     */
    public RpkitPermanentPurchaseRecord(Integer id, Integer purchaseId) {
        super(RpkitPermanentPurchase.RPKIT_PERMANENT_PURCHASE);

        setId(id);
        setPurchaseId(purchaseId);
    }
}
