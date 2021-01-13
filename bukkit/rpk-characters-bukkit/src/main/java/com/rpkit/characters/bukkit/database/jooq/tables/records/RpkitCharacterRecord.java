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


import com.rpkit.characters.bukkit.database.jooq.tables.RpkitCharacter;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitCharacterRecord extends UpdatableRecordImpl<RpkitCharacterRecord> {

    private static final long serialVersionUID = -1591168367;

    /**
     * Setter for <code>rpkit_characters.rpkit_character.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.profile_id</code>.
     */
    public void setProfileId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.profile_id</code>.
     */
    public Integer getProfileId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.minecraft_profile_id</code>.
     */
    public void setMinecraftProfileId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.minecraft_profile_id</code>.
     */
    public Integer getMinecraftProfileId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.gender</code>.
     */
    public void setGender(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.gender</code>.
     */
    public String getGender() {
        return (String) get(4);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.age</code>.
     */
    public void setAge(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.race_id</code>.
     */
    public void setRaceId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.race_id</code>.
     */
    public Integer getRaceId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.description</code>.
     */
    public void setDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.description</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.dead</code>.
     */
    public void setDead(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.dead</code>.
     */
    public Boolean getDead() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.world</code>.
     */
    public void setWorld(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.world</code>.
     */
    public String getWorld() {
        return (String) get(9);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.x</code>.
     */
    public void setX(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.x</code>.
     */
    public Double getX() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.y</code>.
     */
    public void setY(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.y</code>.
     */
    public Double getY() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.z</code>.
     */
    public void setZ(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.z</code>.
     */
    public Double getZ() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.yaw</code>.
     */
    public void setYaw(Float value) {
        set(13, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.yaw</code>.
     */
    public Float getYaw() {
        return (Float) get(13);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.pitch</code>.
     */
    public void setPitch(Float value) {
        set(14, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.pitch</code>.
     */
    public Float getPitch() {
        return (Float) get(14);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.inventory_contents</code>.
     */
    public void setInventoryContents(byte[] value) {
        set(15, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.inventory_contents</code>.
     */
    public byte[] getInventoryContents() {
        return (byte[]) get(15);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.helmet</code>.
     */
    public void setHelmet(byte[] value) {
        set(16, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.helmet</code>.
     */
    public byte[] getHelmet() {
        return (byte[]) get(16);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.chestplate</code>.
     */
    public void setChestplate(byte[] value) {
        set(17, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.chestplate</code>.
     */
    public byte[] getChestplate() {
        return (byte[]) get(17);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.leggings</code>.
     */
    public void setLeggings(byte[] value) {
        set(18, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.leggings</code>.
     */
    public byte[] getLeggings() {
        return (byte[]) get(18);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.boots</code>.
     */
    public void setBoots(byte[] value) {
        set(19, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.boots</code>.
     */
    public byte[] getBoots() {
        return (byte[]) get(19);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.health</code>.
     */
    public void setHealth(Double value) {
        set(20, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.health</code>.
     */
    public Double getHealth() {
        return (Double) get(20);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.max_health</code>.
     */
    public void setMaxHealth(Double value) {
        set(21, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.max_health</code>.
     */
    public Double getMaxHealth() {
        return (Double) get(21);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.mana</code>.
     */
    public void setMana(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.mana</code>.
     */
    public Integer getMana() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.max_mana</code>.
     */
    public void setMaxMana(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.max_mana</code>.
     */
    public Integer getMaxMana() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.food_level</code>.
     */
    public void setFoodLevel(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.food_level</code>.
     */
    public Integer getFoodLevel() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.thirst_level</code>.
     */
    public void setThirstLevel(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.thirst_level</code>.
     */
    public Integer getThirstLevel() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.profile_hidden</code>.
     */
    public void setProfileHidden(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.profile_hidden</code>.
     */
    public Boolean getProfileHidden() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.name_hidden</code>.
     */
    public void setNameHidden(Boolean value) {
        set(27, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.name_hidden</code>.
     */
    public Boolean getNameHidden() {
        return (Boolean) get(27);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.gender_hidden</code>.
     */
    public void setGenderHidden(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.gender_hidden</code>.
     */
    public Boolean getGenderHidden() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.age_hidden</code>.
     */
    public void setAgeHidden(Boolean value) {
        set(29, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.age_hidden</code>.
     */
    public Boolean getAgeHidden() {
        return (Boolean) get(29);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.race_hidden</code>.
     */
    public void setRaceHidden(Boolean value) {
        set(30, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.race_hidden</code>.
     */
    public Boolean getRaceHidden() {
        return (Boolean) get(30);
    }

    /**
     * Setter for <code>rpkit_characters.rpkit_character.description_hidden</code>.
     */
    public void setDescriptionHidden(Boolean value) {
        set(31, value);
    }

    /**
     * Getter for <code>rpkit_characters.rpkit_character.description_hidden</code>.
     */
    public Boolean getDescriptionHidden() {
        return (Boolean) get(31);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RpkitCharacterRecord
     */
    public RpkitCharacterRecord() {
        super(RpkitCharacter.RPKIT_CHARACTER);
    }

    /**
     * Create a detached, initialised RpkitCharacterRecord
     */
    public RpkitCharacterRecord(Integer id, Integer profileId, Integer minecraftProfileId, String name, String gender, Integer age, Integer raceId, String description, Boolean dead, String world, Double x, Double y, Double z, Float yaw, Float pitch, byte[] inventoryContents, byte[] helmet, byte[] chestplate, byte[] leggings, byte[] boots, Double health, Double maxHealth, Integer mana, Integer maxMana, Integer foodLevel, Integer thirstLevel, Boolean profileHidden, Boolean nameHidden, Boolean genderHidden, Boolean ageHidden, Boolean raceHidden, Boolean descriptionHidden) {
        super(RpkitCharacter.RPKIT_CHARACTER);

        set(0, id);
        set(1, profileId);
        set(2, minecraftProfileId);
        set(3, name);
        set(4, gender);
        set(5, age);
        set(6, raceId);
        set(7, description);
        set(8, dead);
        set(9, world);
        set(10, x);
        set(11, y);
        set(12, z);
        set(13, yaw);
        set(14, pitch);
        set(15, inventoryContents);
        set(16, helmet);
        set(17, chestplate);
        set(18, leggings);
        set(19, boots);
        set(20, health);
        set(21, maxHealth);
        set(22, mana);
        set(23, maxMana);
        set(24, foodLevel);
        set(25, thirstLevel);
        set(26, profileHidden);
        set(27, nameHidden);
        set(28, genderHidden);
        set(29, ageHidden);
        set(30, raceHidden);
        set(31, descriptionHidden);
    }
}
