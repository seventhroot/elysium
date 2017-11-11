/*
 * This file is generated by jOOQ.
*/
package com.rpkit.blocklog.bukkit.database.jooq.rpkit.tables;


import com.rpkit.blocklog.bukkit.database.jooq.rpkit.Keys;
import com.rpkit.blocklog.bukkit.database.jooq.rpkit.Rpkit;
import com.rpkit.blocklog.bukkit.database.jooq.rpkit.tables.records.RpkitBlockHistoryRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitBlockHistory extends TableImpl<RpkitBlockHistoryRecord> {

    private static final long serialVersionUID = -568014849;

    /**
     * The reference instance of <code>rpkit.rpkit_block_history</code>
     */
    public static final RpkitBlockHistory RPKIT_BLOCK_HISTORY = new RpkitBlockHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RpkitBlockHistoryRecord> getRecordType() {
        return RpkitBlockHistoryRecord.class;
    }

    /**
     * The column <code>rpkit.rpkit_block_history.id</code>.
     */
    public final TableField<RpkitBlockHistoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit.rpkit_block_history.world</code>.
     */
    public final TableField<RpkitBlockHistoryRecord, String> WORLD = createField("world", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>rpkit.rpkit_block_history.x</code>.
     */
    public final TableField<RpkitBlockHistoryRecord, Integer> X = createField("x", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit.rpkit_block_history.y</code>.
     */
    public final TableField<RpkitBlockHistoryRecord, Integer> Y = createField("y", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit.rpkit_block_history.z</code>.
     */
    public final TableField<RpkitBlockHistoryRecord, Integer> Z = createField("z", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>rpkit.rpkit_block_history</code> table reference
     */
    public RpkitBlockHistory() {
        this("rpkit_block_history", null);
    }

    /**
     * Create an aliased <code>rpkit.rpkit_block_history</code> table reference
     */
    public RpkitBlockHistory(String alias) {
        this(alias, RPKIT_BLOCK_HISTORY);
    }

    private RpkitBlockHistory(String alias, Table<RpkitBlockHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private RpkitBlockHistory(String alias, Table<RpkitBlockHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Rpkit.RPKIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RpkitBlockHistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RPKIT_BLOCK_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RpkitBlockHistoryRecord> getPrimaryKey() {
        return Keys.KEY_RPKIT_BLOCK_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RpkitBlockHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<RpkitBlockHistoryRecord>>asList(Keys.KEY_RPKIT_BLOCK_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RpkitBlockHistory as(String alias) {
        return new RpkitBlockHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RpkitBlockHistory rename(String name) {
        return new RpkitBlockHistory(name, null);
    }
}