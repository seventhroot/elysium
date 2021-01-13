/*
 * Copyright 2021 Ren Binden
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is generated by jOOQ.
 */
package com.rpkit.characters.bukkit.database.jooq.tables;


import com.rpkit.characters.bukkit.database.jooq.Keys;
import com.rpkit.characters.bukkit.database.jooq.RpkitCharacters;
import com.rpkit.characters.bukkit.database.jooq.tables.records.RpkitNewCharacterCooldownRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitNewCharacterCooldown extends TableImpl<RpkitNewCharacterCooldownRecord> {

    private static final long serialVersionUID = -985809552;

    /**
     * The reference instance of <code>rpkit_characters.rpkit_new_character_cooldown</code>
     */
    public static final RpkitNewCharacterCooldown RPKIT_NEW_CHARACTER_COOLDOWN = new RpkitNewCharacterCooldown();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RpkitNewCharacterCooldownRecord> getRecordType() {
        return RpkitNewCharacterCooldownRecord.class;
    }

    /**
     * The column <code>rpkit_characters.rpkit_new_character_cooldown.profile_id</code>.
     */
    public final TableField<RpkitNewCharacterCooldownRecord, Integer> PROFILE_ID = createField(DSL.name("profile_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>rpkit_characters.rpkit_new_character_cooldown.cooldown_timestamp</code>.
     */
    public final TableField<RpkitNewCharacterCooldownRecord, LocalDateTime> COOLDOWN_TIMESTAMP = createField(DSL.name("cooldown_timestamp"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>rpkit_characters.rpkit_new_character_cooldown</code> table reference
     */
    public RpkitNewCharacterCooldown() {
        this(DSL.name("rpkit_new_character_cooldown"), null);
    }

    /**
     * Create an aliased <code>rpkit_characters.rpkit_new_character_cooldown</code> table reference
     */
    public RpkitNewCharacterCooldown(String alias) {
        this(DSL.name(alias), RPKIT_NEW_CHARACTER_COOLDOWN);
    }

    /**
     * Create an aliased <code>rpkit_characters.rpkit_new_character_cooldown</code> table reference
     */
    public RpkitNewCharacterCooldown(Name alias) {
        this(alias, RPKIT_NEW_CHARACTER_COOLDOWN);
    }

    private RpkitNewCharacterCooldown(Name alias, Table<RpkitNewCharacterCooldownRecord> aliased) {
        this(alias, aliased, null);
    }

    private RpkitNewCharacterCooldown(Name alias, Table<RpkitNewCharacterCooldownRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RpkitNewCharacterCooldown(Table<O> child, ForeignKey<O, RpkitNewCharacterCooldownRecord> key) {
        super(child, key, RPKIT_NEW_CHARACTER_COOLDOWN);
    }

    @Override
    public Schema getSchema() {
        return RpkitCharacters.RPKIT_CHARACTERS;
    }

    @Override
    public UniqueKey<RpkitNewCharacterCooldownRecord> getPrimaryKey() {
        return Keys.KEY_RPKIT_NEW_CHARACTER_COOLDOWN_PRIMARY;
    }

    @Override
    public List<UniqueKey<RpkitNewCharacterCooldownRecord>> getKeys() {
        return Arrays.<UniqueKey<RpkitNewCharacterCooldownRecord>>asList(Keys.KEY_RPKIT_NEW_CHARACTER_COOLDOWN_PRIMARY);
    }

    @Override
    public RpkitNewCharacterCooldown as(String alias) {
        return new RpkitNewCharacterCooldown(DSL.name(alias), this);
    }

    @Override
    public RpkitNewCharacterCooldown as(Name alias) {
        return new RpkitNewCharacterCooldown(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RpkitNewCharacterCooldown rename(String name) {
        return new RpkitNewCharacterCooldown(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RpkitNewCharacterCooldown rename(Name name) {
        return new RpkitNewCharacterCooldown(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, LocalDateTime> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
