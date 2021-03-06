/*
 * This file is generated by jOOQ.
 */
package com.rpkit.economy.bukkit.database.jooq.tables.records;


import com.rpkit.economy.bukkit.database.jooq.tables.RpkitMoneyHidden;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitMoneyHiddenRecord extends UpdatableRecordImpl<RpkitMoneyHiddenRecord> implements Record1<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>rpkit_economy.rpkit_money_hidden.character_id</code>.
     */
    public void setCharacterId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>rpkit_economy.rpkit_money_hidden.character_id</code>.
     */
    public Integer getCharacterId() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RpkitMoneyHidden.RPKIT_MONEY_HIDDEN.CHARACTER_ID;
    }

    @Override
    public Integer component1() {
        return getCharacterId();
    }

    @Override
    public Integer value1() {
        return getCharacterId();
    }

    @Override
    public RpkitMoneyHiddenRecord value1(Integer value) {
        setCharacterId(value);
        return this;
    }

    @Override
    public RpkitMoneyHiddenRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RpkitMoneyHiddenRecord
     */
    public RpkitMoneyHiddenRecord() {
        super(RpkitMoneyHidden.RPKIT_MONEY_HIDDEN);
    }

    /**
     * Create a detached, initialised RpkitMoneyHiddenRecord
     */
    public RpkitMoneyHiddenRecord(Integer characterId) {
        super(RpkitMoneyHidden.RPKIT_MONEY_HIDDEN);

        setCharacterId(characterId);
    }
}
