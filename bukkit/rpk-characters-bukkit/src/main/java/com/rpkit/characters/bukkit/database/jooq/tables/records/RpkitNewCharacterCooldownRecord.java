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
package com.rpkit.characters.bukkit.database.jooq.tables.records;


import com.rpkit.characters.bukkit.database.jooq.tables.RpkitNewCharacterCooldown;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitNewCharacterCooldownRecord extends UpdatableRecordImpl<RpkitNewCharacterCooldownRecord> implements Record2<Integer, LocalDateTime> {

    private static final long serialVersionUID = -2003948817;

    /**
     * Setter for <code>rpkit_characters.rpkit_new_character_cooldown.profile_id</code>.
     */
    public void setProfileId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_new_character_cooldown.profile_id</code>.
     */
    public Integer getProfileId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_new_character_cooldown.cooldown_timestamp</code>.
     */
    public void setCooldownTimestamp(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_new_character_cooldown.cooldown_timestamp</code>.
     */
    public LocalDateTime getCooldownTimestamp() {
        return (LocalDateTime) get(1);
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
    public Row2<Integer, LocalDateTime> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, LocalDateTime> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RpkitNewCharacterCooldown.RPKIT_NEW_CHARACTER_COOLDOWN.PROFILE_ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return RpkitNewCharacterCooldown.RPKIT_NEW_CHARACTER_COOLDOWN.COOLDOWN_TIMESTAMP;
    }

    @Override
    public Integer component1() {
        return getProfileId();
    }

    @Override
    public LocalDateTime component2() {
        return getCooldownTimestamp();
    }

    @Override
    public Integer value1() {
        return getProfileId();
    }

    @Override
    public LocalDateTime value2() {
        return getCooldownTimestamp();
    }

    @Override
    public RpkitNewCharacterCooldownRecord value1(Integer value) {
        setProfileId(value);
        return this;
    }

    @Override
    public RpkitNewCharacterCooldownRecord value2(LocalDateTime value) {
        setCooldownTimestamp(value);
        return this;
    }

    @Override
    public RpkitNewCharacterCooldownRecord values(Integer value1, LocalDateTime value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RpkitNewCharacterCooldownRecord
     */
    public RpkitNewCharacterCooldownRecord() {
        super(RpkitNewCharacterCooldown.RPKIT_NEW_CHARACTER_COOLDOWN);
    }

    /**
     * Create a detached, initialised RpkitNewCharacterCooldownRecord
     */
    public RpkitNewCharacterCooldownRecord(Integer profileId, LocalDateTime cooldownTimestamp) {
        super(RpkitNewCharacterCooldown.RPKIT_NEW_CHARACTER_COOLDOWN);

        set(0, profileId);
        set(1, cooldownTimestamp);
    }
}
