/*
 * This file is generated by jOOQ.
 */
package com.rpkit.moderation.bukkit.database.jooq.tables;


import com.rpkit.moderation.bukkit.database.jooq.Indexes;
import com.rpkit.moderation.bukkit.database.jooq.Keys;
import com.rpkit.moderation.bukkit.database.jooq.RpkitModeration;
import com.rpkit.moderation.bukkit.database.jooq.tables.records.FlywaySchemaHistoryPlayersRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class FlywaySchemaHistoryPlayers extends TableImpl<FlywaySchemaHistoryPlayersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>rpkit_moderation.flyway_schema_history_players</code>
     */
    public static final FlywaySchemaHistoryPlayers FLYWAY_SCHEMA_HISTORY_PLAYERS = new FlywaySchemaHistoryPlayers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FlywaySchemaHistoryPlayersRecord> getRecordType() {
        return FlywaySchemaHistoryPlayersRecord.class;
    }

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.installed_rank</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, Integer> INSTALLED_RANK = createField(DSL.name("installed_rank"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.version</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, String> VERSION = createField(DSL.name("version"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.description</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.type</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.script</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, String> SCRIPT = createField(DSL.name("script"), SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.checksum</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, Integer> CHECKSUM = createField(DSL.name("checksum"), SQLDataType.INTEGER.defaultValue(DSL.inline("NULL", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.installed_by</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, String> INSTALLED_BY = createField(DSL.name("installed_by"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.installed_on</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, LocalDateTime> INSTALLED_ON = createField(DSL.name("installed_on"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("current_timestamp()", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.execution_time</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, Integer> EXECUTION_TIME = createField(DSL.name("execution_time"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_moderation.flyway_schema_history_players.success</code>.
     */
    public final TableField<FlywaySchemaHistoryPlayersRecord, Boolean> SUCCESS = createField(DSL.name("success"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private FlywaySchemaHistoryPlayers(Name alias, Table<FlywaySchemaHistoryPlayersRecord> aliased) {
        this(alias, aliased, null);
    }

    private FlywaySchemaHistoryPlayers(Name alias, Table<FlywaySchemaHistoryPlayersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>rpkit_moderation.flyway_schema_history_players</code> table reference
     */
    public FlywaySchemaHistoryPlayers(String alias) {
        this(DSL.name(alias), FLYWAY_SCHEMA_HISTORY_PLAYERS);
    }

    /**
     * Create an aliased <code>rpkit_moderation.flyway_schema_history_players</code> table reference
     */
    public FlywaySchemaHistoryPlayers(Name alias) {
        this(alias, FLYWAY_SCHEMA_HISTORY_PLAYERS);
    }

    /**
     * Create a <code>rpkit_moderation.flyway_schema_history_players</code> table reference
     */
    public FlywaySchemaHistoryPlayers() {
        this(DSL.name("flyway_schema_history_players"), null);
    }

    public <O extends Record> FlywaySchemaHistoryPlayers(Table<O> child, ForeignKey<O, FlywaySchemaHistoryPlayersRecord> key) {
        super(child, key, FLYWAY_SCHEMA_HISTORY_PLAYERS);
    }

    @Override
    public Schema getSchema() {
        return RpkitModeration.RPKIT_MODERATION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FLYWAY_SCHEMA_HISTORY_PLAYERS_FLYWAY_SCHEMA_HISTORY_PLAYERS_S_IDX);
    }

    @Override
    public UniqueKey<FlywaySchemaHistoryPlayersRecord> getPrimaryKey() {
        return Keys.KEY_FLYWAY_SCHEMA_HISTORY_PLAYERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<FlywaySchemaHistoryPlayersRecord>> getKeys() {
        return Arrays.<UniqueKey<FlywaySchemaHistoryPlayersRecord>>asList(Keys.KEY_FLYWAY_SCHEMA_HISTORY_PLAYERS_PRIMARY);
    }

    @Override
    public FlywaySchemaHistoryPlayers as(String alias) {
        return new FlywaySchemaHistoryPlayers(DSL.name(alias), this);
    }

    @Override
    public FlywaySchemaHistoryPlayers as(Name alias) {
        return new FlywaySchemaHistoryPlayers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FlywaySchemaHistoryPlayers rename(String name) {
        return new FlywaySchemaHistoryPlayers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FlywaySchemaHistoryPlayers rename(Name name) {
        return new FlywaySchemaHistoryPlayers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, Integer, String, LocalDateTime, Integer, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
