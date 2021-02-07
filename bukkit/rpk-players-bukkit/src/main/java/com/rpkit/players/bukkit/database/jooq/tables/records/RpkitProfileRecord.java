/*
 * This file is generated by jOOQ.
 */
package com.rpkit.players.bukkit.database.jooq.tables.records;


import com.rpkit.players.bukkit.database.jooq.tables.RpkitProfile;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitProfileRecord extends UpdatableRecordImpl<RpkitProfileRecord> implements Record5<Integer, String, Integer, byte[], byte[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>rpkit_players.rpkit_profile.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>rpkit_players.rpkit_profile.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>rpkit_players.rpkit_profile.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rpkit_players.rpkit_profile.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rpkit_players.rpkit_profile.discriminator</code>.
     */
    public void setDiscriminator(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>rpkit_players.rpkit_profile.discriminator</code>.
     */
    public Integer getDiscriminator() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>rpkit_players.rpkit_profile.password_hash</code>.
     */
    public void setPasswordHash(byte[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>rpkit_players.rpkit_profile.password_hash</code>.
     */
    public byte[] getPasswordHash() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>rpkit_players.rpkit_profile.password_salt</code>.
     */
    public void setPasswordSalt(byte[] value) {
        set(4, value);
    }

    /**
     * Getter for <code>rpkit_players.rpkit_profile.password_salt</code>.
     */
    public byte[] getPasswordSalt() {
        return (byte[]) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Integer, byte[], byte[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Integer, byte[], byte[]> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RpkitProfile.RPKIT_PROFILE.ID;
    }

    @Override
    public Field<String> field2() {
        return RpkitProfile.RPKIT_PROFILE.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return RpkitProfile.RPKIT_PROFILE.DISCRIMINATOR;
    }

    @Override
    public Field<byte[]> field4() {
        return RpkitProfile.RPKIT_PROFILE.PASSWORD_HASH;
    }

    @Override
    public Field<byte[]> field5() {
        return RpkitProfile.RPKIT_PROFILE.PASSWORD_SALT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getDiscriminator();
    }

    @Override
    public byte[] component4() {
        return getPasswordHash();
    }

    @Override
    public byte[] component5() {
        return getPasswordSalt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getDiscriminator();
    }

    @Override
    public byte[] value4() {
        return getPasswordHash();
    }

    @Override
    public byte[] value5() {
        return getPasswordSalt();
    }

    @Override
    public RpkitProfileRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RpkitProfileRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public RpkitProfileRecord value3(Integer value) {
        setDiscriminator(value);
        return this;
    }

    @Override
    public RpkitProfileRecord value4(byte[] value) {
        setPasswordHash(value);
        return this;
    }

    @Override
    public RpkitProfileRecord value5(byte[] value) {
        setPasswordSalt(value);
        return this;
    }

    @Override
    public RpkitProfileRecord values(Integer value1, String value2, Integer value3, byte[] value4, byte[] value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RpkitProfileRecord
     */
    public RpkitProfileRecord() {
        super(RpkitProfile.RPKIT_PROFILE);
    }

    /**
     * Create a detached, initialised RpkitProfileRecord
     */
    public RpkitProfileRecord(Integer id, String name, Integer discriminator, byte[] passwordHash, byte[] passwordSalt) {
        super(RpkitProfile.RPKIT_PROFILE);

        setId(id);
        setName(name);
        setDiscriminator(discriminator);
        setPasswordHash(passwordHash);
        setPasswordSalt(passwordSalt);
    }
}
