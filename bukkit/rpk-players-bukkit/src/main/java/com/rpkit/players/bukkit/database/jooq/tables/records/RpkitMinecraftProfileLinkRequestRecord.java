/*
 * This file is generated by jOOQ.
 */
package com.rpkit.players.bukkit.database.jooq.tables.records;


import com.rpkit.players.bukkit.database.jooq.tables.RpkitMinecraftProfileLinkRequest;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitMinecraftProfileLinkRequestRecord extends TableRecordImpl<RpkitMinecraftProfileLinkRequestRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>rpkit_players.rpkit_minecraft_profile_link_request.profile_id</code>.
     */
    public void setProfileId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>rpkit_players.rpkit_minecraft_profile_link_request.profile_id</code>.
     */
    public Integer getProfileId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>rpkit_players.rpkit_minecraft_profile_link_request.minecraft_profile_id</code>.
     */
    public void setMinecraftProfileId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>rpkit_players.rpkit_minecraft_profile_link_request.minecraft_profile_id</code>.
     */
    public Integer getMinecraftProfileId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RpkitMinecraftProfileLinkRequest.RPKIT_MINECRAFT_PROFILE_LINK_REQUEST.PROFILE_ID;
    }

    @Override
    public Field<Integer> field2() {
        return RpkitMinecraftProfileLinkRequest.RPKIT_MINECRAFT_PROFILE_LINK_REQUEST.MINECRAFT_PROFILE_ID;
    }

    @Override
    public Integer component1() {
        return getProfileId();
    }

    @Override
    public Integer component2() {
        return getMinecraftProfileId();
    }

    @Override
    public Integer value1() {
        return getProfileId();
    }

    @Override
    public Integer value2() {
        return getMinecraftProfileId();
    }

    @Override
    public RpkitMinecraftProfileLinkRequestRecord value1(Integer value) {
        setProfileId(value);
        return this;
    }

    @Override
    public RpkitMinecraftProfileLinkRequestRecord value2(Integer value) {
        setMinecraftProfileId(value);
        return this;
    }

    @Override
    public RpkitMinecraftProfileLinkRequestRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RpkitMinecraftProfileLinkRequestRecord
     */
    public RpkitMinecraftProfileLinkRequestRecord() {
        super(RpkitMinecraftProfileLinkRequest.RPKIT_MINECRAFT_PROFILE_LINK_REQUEST);
    }

    /**
     * Create a detached, initialised RpkitMinecraftProfileLinkRequestRecord
     */
    public RpkitMinecraftProfileLinkRequestRecord(Integer profileId, Integer minecraftProfileId) {
        super(RpkitMinecraftProfileLinkRequest.RPKIT_MINECRAFT_PROFILE_LINK_REQUEST);

        setProfileId(profileId);
        setMinecraftProfileId(minecraftProfileId);
    }
}
