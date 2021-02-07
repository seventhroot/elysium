/*
 * This file is generated by jOOQ.
 */
package com.rpkit.selection.bukkit.database.jooq.tables;


import com.rpkit.selection.bukkit.database.jooq.Keys;
import com.rpkit.selection.bukkit.database.jooq.tables.records.RpkitSelectionRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class RpkitSelection extends TableImpl<RpkitSelectionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>rpkit_selection.rpkit_selection</code>
     */
    public static final RpkitSelection RPKIT_SELECTION_ = new RpkitSelection();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RpkitSelectionRecord> getRecordType() {
        return RpkitSelectionRecord.class;
    }

    /**
     * The column <code>rpkit_selection.rpkit_selection.minecraft_profile_id</code>.
     */
    public final TableField<RpkitSelectionRecord, Integer> MINECRAFT_PROFILE_ID = createField(DSL.name("minecraft_profile_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_selection.rpkit_selection.world</code>.
     */
    public final TableField<RpkitSelectionRecord, String> WORLD = createField(DSL.name("world"), SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>rpkit_selection.rpkit_selection.x_1</code>.
     */
    public final TableField<RpkitSelectionRecord, Integer> X_1 = createField(DSL.name("x_1"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_selection.rpkit_selection.y_1</code>.
     */
    public final TableField<RpkitSelectionRecord, Integer> Y_1 = createField(DSL.name("y_1"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_selection.rpkit_selection.z_1</code>.
     */
    public final TableField<RpkitSelectionRecord, Integer> Z_1 = createField(DSL.name("z_1"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_selection.rpkit_selection.x_2</code>.
     */
    public final TableField<RpkitSelectionRecord, Integer> X_2 = createField(DSL.name("x_2"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_selection.rpkit_selection.y_2</code>.
     */
    public final TableField<RpkitSelectionRecord, Integer> Y_2 = createField(DSL.name("y_2"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_selection.rpkit_selection.z_2</code>.
     */
    public final TableField<RpkitSelectionRecord, Integer> Z_2 = createField(DSL.name("z_2"), SQLDataType.INTEGER.nullable(false), this, "");

    private RpkitSelection(Name alias, Table<RpkitSelectionRecord> aliased) {
        this(alias, aliased, null);
    }

    private RpkitSelection(Name alias, Table<RpkitSelectionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>rpkit_selection.rpkit_selection</code> table reference
     */
    public RpkitSelection(String alias) {
        this(DSL.name(alias), RPKIT_SELECTION_);
    }

    /**
     * Create an aliased <code>rpkit_selection.rpkit_selection</code> table reference
     */
    public RpkitSelection(Name alias) {
        this(alias, RPKIT_SELECTION_);
    }

    /**
     * Create a <code>rpkit_selection.rpkit_selection</code> table reference
     */
    public RpkitSelection() {
        this(DSL.name("rpkit_selection"), null);
    }

    public <O extends Record> RpkitSelection(Table<O> child, ForeignKey<O, RpkitSelectionRecord> key) {
        super(child, key, RPKIT_SELECTION_);
    }

    @Override
    public Schema getSchema() {
        return com.rpkit.selection.bukkit.database.jooq.RpkitSelection.RPKIT_SELECTION;
    }

    @Override
    public UniqueKey<RpkitSelectionRecord> getPrimaryKey() {
        return Keys.KEY_RPKIT_SELECTION_PRIMARY;
    }

    @Override
    public List<UniqueKey<RpkitSelectionRecord>> getKeys() {
        return Arrays.<UniqueKey<RpkitSelectionRecord>>asList(Keys.KEY_RPKIT_SELECTION_PRIMARY);
    }

    @Override
    public RpkitSelection as(String alias) {
        return new RpkitSelection(DSL.name(alias), this);
    }

    @Override
    public RpkitSelection as(Name alias) {
        return new RpkitSelection(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RpkitSelection rename(String name) {
        return new RpkitSelection(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RpkitSelection rename(Name name) {
        return new RpkitSelection(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
