/*
 * Copyright 2020 Ren Binden
 *
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
package com.rpkit.characters.bukkit.database.jooq.rpkit.tables;


import com.rpkit.characters.bukkit.database.jooq.rpkit.Keys;
import com.rpkit.characters.bukkit.database.jooq.rpkit.Rpkit;
import com.rpkit.characters.bukkit.database.jooq.rpkit.tables.records.RpkitCharacterRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
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
public class RpkitCharacter extends TableImpl<RpkitCharacterRecord> {

    private static final long serialVersionUID = -1738642648;

    /**
     * The reference instance of <code>rpkit.rpkit_character</code>
     */
    public static final RpkitCharacter RPKIT_CHARACTER = new RpkitCharacter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RpkitCharacterRecord> getRecordType() {
        return RpkitCharacterRecord.class;
    }

    /**
     * The column <code>rpkit.rpkit_character.id</code>.
     */
    public final TableField<RpkitCharacterRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>rpkit.rpkit_character.profile_id</code>.
     */
    public final TableField<RpkitCharacterRecord, Integer> PROFILE_ID = createField(DSL.name("profile_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>rpkit.rpkit_character.minecraft_profile_id</code>.
     */
    public final TableField<RpkitCharacterRecord, Integer> MINECRAFT_PROFILE_ID = createField(DSL.name("minecraft_profile_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>rpkit.rpkit_character.name</code>.
     */
    public final TableField<RpkitCharacterRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>rpkit.rpkit_character.gender</code>.
     */
    public final TableField<RpkitCharacterRecord, String> GENDER = createField(DSL.name("gender"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>rpkit.rpkit_character.age</code>.
     */
    public final TableField<RpkitCharacterRecord, Integer> AGE = createField(DSL.name("age"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>rpkit.rpkit_character.race_id</code>.
     */
    public final TableField<RpkitCharacterRecord, Integer> RACE_ID = createField(DSL.name("race_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>rpkit.rpkit_character.description</code>.
     */
    public final TableField<RpkitCharacterRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>rpkit.rpkit_character.dead</code>.
     */
    public final TableField<RpkitCharacterRecord, Boolean> DEAD = createField(DSL.name("dead"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>rpkit.rpkit_character.world</code>.
     */
    public final TableField<RpkitCharacterRecord, String> WORLD = createField(DSL.name("world"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>rpkit.rpkit_character.x</code>.
     */
    public final TableField<RpkitCharacterRecord, Double> X = createField(DSL.name("x"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>rpkit.rpkit_character.y</code>.
     */
    public final TableField<RpkitCharacterRecord, Double> Y = createField(DSL.name("y"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>rpkit.rpkit_character.z</code>.
     */
    public final TableField<RpkitCharacterRecord, Double> Z = createField(DSL.name("z"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>rpkit.rpkit_character.yaw</code>.
     */
    public final TableField<RpkitCharacterRecord, Float> YAW = createField(DSL.name("yaw"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>rpkit.rpkit_character.pitch</code>.
     */
    public final TableField<RpkitCharacterRecord, Float> PITCH = createField(DSL.name("pitch"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>rpkit.rpkit_character.inventory_contents</code>.
     */
    public final TableField<RpkitCharacterRecord, byte[]> INVENTORY_CONTENTS = createField(DSL.name("inventory_contents"), org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>rpkit.rpkit_character.helmet</code>.
     */
    public final TableField<RpkitCharacterRecord, byte[]> HELMET = createField(DSL.name("helmet"), org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>rpkit.rpkit_character.chestplate</code>.
     */
    public final TableField<RpkitCharacterRecord, byte[]> CHESTPLATE = createField(DSL.name("chestplate"), org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>rpkit.rpkit_character.leggings</code>.
     */
    public final TableField<RpkitCharacterRecord, byte[]> LEGGINGS = createField(DSL.name("leggings"), org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>rpkit.rpkit_character.boots</code>.
     */
    public final TableField<RpkitCharacterRecord, byte[]> BOOTS = createField(DSL.name("boots"), org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>rpkit.rpkit_character.health</code>.
     */
    public final TableField<RpkitCharacterRecord, Double> HEALTH = createField(DSL.name("health"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>rpkit.rpkit_character.max_health</code>.
     */
    public final TableField<RpkitCharacterRecord, Double> MAX_HEALTH = createField(DSL.name("max_health"), org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>rpkit.rpkit_character.mana</code>.
     */
    public final TableField<RpkitCharacterRecord, Integer> MANA = createField(DSL.name("mana"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>rpkit.rpkit_character.max_mana</code>.
     */
    public final TableField<RpkitCharacterRecord, Integer> MAX_MANA = createField(DSL.name("max_mana"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>rpkit.rpkit_character.food_level</code>.
     */
    public final TableField<RpkitCharacterRecord, Integer> FOOD_LEVEL = createField(DSL.name("food_level"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>rpkit.rpkit_character.thirst_level</code>.
     */
    public final TableField<RpkitCharacterRecord, Integer> THIRST_LEVEL = createField(DSL.name("thirst_level"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>rpkit.rpkit_character.profile_hidden</code>.
     */
    public final TableField<RpkitCharacterRecord, Boolean> PROFILE_HIDDEN = createField(DSL.name("profile_hidden"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>rpkit.rpkit_character.name_hidden</code>.
     */
    public final TableField<RpkitCharacterRecord, Boolean> NAME_HIDDEN = createField(DSL.name("name_hidden"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>rpkit.rpkit_character.gender_hidden</code>.
     */
    public final TableField<RpkitCharacterRecord, Boolean> GENDER_HIDDEN = createField(DSL.name("gender_hidden"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>rpkit.rpkit_character.age_hidden</code>.
     */
    public final TableField<RpkitCharacterRecord, Boolean> AGE_HIDDEN = createField(DSL.name("age_hidden"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>rpkit.rpkit_character.race_hidden</code>.
     */
    public final TableField<RpkitCharacterRecord, Boolean> RACE_HIDDEN = createField(DSL.name("race_hidden"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>rpkit.rpkit_character.description_hidden</code>.
     */
    public final TableField<RpkitCharacterRecord, Boolean> DESCRIPTION_HIDDEN = createField(DSL.name("description_hidden"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>rpkit.rpkit_character</code> table reference
     */
    public RpkitCharacter() {
        this(DSL.name("rpkit_character"), null);
    }

    /**
     * Create an aliased <code>rpkit.rpkit_character</code> table reference
     */
    public RpkitCharacter(String alias) {
        this(DSL.name(alias), RPKIT_CHARACTER);
    }

    /**
     * Create an aliased <code>rpkit.rpkit_character</code> table reference
     */
    public RpkitCharacter(Name alias) {
        this(alias, RPKIT_CHARACTER);
    }

    private RpkitCharacter(Name alias, Table<RpkitCharacterRecord> aliased) {
        this(alias, aliased, null);
    }

    private RpkitCharacter(Name alias, Table<RpkitCharacterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RpkitCharacter(Table<O> child, ForeignKey<O, RpkitCharacterRecord> key) {
        super(child, key, RPKIT_CHARACTER);
    }

    @Override
    public Schema getSchema() {
        return Rpkit.RPKIT;
    }

    @Override
    public Identity<RpkitCharacterRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RPKIT_CHARACTER;
    }

    @Override
    public UniqueKey<RpkitCharacterRecord> getPrimaryKey() {
        return Keys.KEY_RPKIT_CHARACTER_PRIMARY;
    }

    @Override
    public List<UniqueKey<RpkitCharacterRecord>> getKeys() {
        return Arrays.<UniqueKey<RpkitCharacterRecord>>asList(Keys.KEY_RPKIT_CHARACTER_PRIMARY);
    }

    @Override
    public RpkitCharacter as(String alias) {
        return new RpkitCharacter(DSL.name(alias), this);
    }

    @Override
    public RpkitCharacter as(Name alias) {
        return new RpkitCharacter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RpkitCharacter rename(String name) {
        return new RpkitCharacter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RpkitCharacter rename(Name name) {
        return new RpkitCharacter(name, null);
    }
}
