/*
 * This file is generated by jOOQ.
 */
package com.rpkit.store.bukkit.database.jooq.tables;


import com.rpkit.store.bukkit.database.jooq.Keys;
import com.rpkit.store.bukkit.database.jooq.RpkitStores;
import com.rpkit.store.bukkit.database.jooq.tables.records.RpkitTimedStoreItemRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitTimedStoreItem extends TableImpl<RpkitTimedStoreItemRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>rpkit_stores.rpkit_timed_store_item</code>
     */
    public static final RpkitTimedStoreItem RPKIT_TIMED_STORE_ITEM = new RpkitTimedStoreItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RpkitTimedStoreItemRecord> getRecordType() {
        return RpkitTimedStoreItemRecord.class;
    }

    /**
     * The column <code>rpkit_stores.rpkit_timed_store_item.id</code>.
     */
    public final TableField<RpkitTimedStoreItemRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>rpkit_stores.rpkit_timed_store_item.store_item_id</code>.
     */
    public final TableField<RpkitTimedStoreItemRecord, Integer> STORE_ITEM_ID = createField(DSL.name("store_item_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_stores.rpkit_timed_store_item.duration</code>.
     */
    public final TableField<RpkitTimedStoreItemRecord, Long> DURATION = createField(DSL.name("duration"), SQLDataType.BIGINT.nullable(false), this, "");

    private RpkitTimedStoreItem(Name alias, Table<RpkitTimedStoreItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private RpkitTimedStoreItem(Name alias, Table<RpkitTimedStoreItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>rpkit_stores.rpkit_timed_store_item</code> table reference
     */
    public RpkitTimedStoreItem(String alias) {
        this(DSL.name(alias), RPKIT_TIMED_STORE_ITEM);
    }

    /**
     * Create an aliased <code>rpkit_stores.rpkit_timed_store_item</code> table reference
     */
    public RpkitTimedStoreItem(Name alias) {
        this(alias, RPKIT_TIMED_STORE_ITEM);
    }

    /**
     * Create a <code>rpkit_stores.rpkit_timed_store_item</code> table reference
     */
    public RpkitTimedStoreItem() {
        this(DSL.name("rpkit_timed_store_item"), null);
    }

    public <O extends Record> RpkitTimedStoreItem(Table<O> child, ForeignKey<O, RpkitTimedStoreItemRecord> key) {
        super(child, key, RPKIT_TIMED_STORE_ITEM);
    }

    @Override
    public Schema getSchema() {
        return RpkitStores.RPKIT_STORES;
    }

    @Override
    public Identity<RpkitTimedStoreItemRecord, Integer> getIdentity() {
        return (Identity<RpkitTimedStoreItemRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<RpkitTimedStoreItemRecord> getPrimaryKey() {
        return Keys.KEY_RPKIT_TIMED_STORE_ITEM_PRIMARY;
    }

    @Override
    public List<UniqueKey<RpkitTimedStoreItemRecord>> getKeys() {
        return Arrays.<UniqueKey<RpkitTimedStoreItemRecord>>asList(Keys.KEY_RPKIT_TIMED_STORE_ITEM_PRIMARY);
    }

    @Override
    public RpkitTimedStoreItem as(String alias) {
        return new RpkitTimedStoreItem(DSL.name(alias), this);
    }

    @Override
    public RpkitTimedStoreItem as(Name alias) {
        return new RpkitTimedStoreItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RpkitTimedStoreItem rename(String name) {
        return new RpkitTimedStoreItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RpkitTimedStoreItem rename(Name name) {
        return new RpkitTimedStoreItem(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
