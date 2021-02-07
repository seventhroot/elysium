/*
 * This file is generated by jOOQ.
 */
package com.rpkit.moderation.bukkit.database.jooq.tables.records;


import com.rpkit.moderation.bukkit.database.jooq.tables.RpkitTicket;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitTicketRecord extends UpdatableRecordImpl<RpkitTicketRecord> implements Record13<Integer, String, Integer, Integer, String, Double, Double, Double, Double, Double, LocalDateTime, LocalDateTime, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.reason</code>.
     */
    public void setReason(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.reason</code>.
     */
    public String getReason() {
        return (String) get(1);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.issuer_id</code>.
     */
    public void setIssuerId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.issuer_id</code>.
     */
    public Integer getIssuerId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.resolver_id</code>.
     */
    public void setResolverId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.resolver_id</code>.
     */
    public Integer getResolverId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.world</code>.
     */
    public void setWorld(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.world</code>.
     */
    public String getWorld() {
        return (String) get(4);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.x</code>.
     */
    public void setX(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.x</code>.
     */
    public Double getX() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.y</code>.
     */
    public void setY(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.y</code>.
     */
    public Double getY() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.z</code>.
     */
    public void setZ(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.z</code>.
     */
    public Double getZ() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.yaw</code>.
     */
    public void setYaw(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.yaw</code>.
     */
    public Double getYaw() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.pitch</code>.
     */
    public void setPitch(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.pitch</code>.
     */
    public Double getPitch() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.open_date</code>.
     */
    public void setOpenDate(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.open_date</code>.
     */
    public LocalDateTime getOpenDate() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.close_date</code>.
     */
    public void setCloseDate(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.close_date</code>.
     */
    public LocalDateTime getCloseDate() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>rpkit_moderation.rpkit_ticket.closed</code>.
     */
    public void setClosed(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>rpkit_moderation.rpkit_ticket.closed</code>.
     */
    public Boolean getClosed() {
        return (Boolean) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, String, Integer, Integer, String, Double, Double, Double, Double, Double, LocalDateTime, LocalDateTime, Boolean> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Integer, String, Integer, Integer, String, Double, Double, Double, Double, Double, LocalDateTime, LocalDateTime, Boolean> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RpkitTicket.RPKIT_TICKET.ID;
    }

    @Override
    public Field<String> field2() {
        return RpkitTicket.RPKIT_TICKET.REASON;
    }

    @Override
    public Field<Integer> field3() {
        return RpkitTicket.RPKIT_TICKET.ISSUER_ID;
    }

    @Override
    public Field<Integer> field4() {
        return RpkitTicket.RPKIT_TICKET.RESOLVER_ID;
    }

    @Override
    public Field<String> field5() {
        return RpkitTicket.RPKIT_TICKET.WORLD;
    }

    @Override
    public Field<Double> field6() {
        return RpkitTicket.RPKIT_TICKET.X;
    }

    @Override
    public Field<Double> field7() {
        return RpkitTicket.RPKIT_TICKET.Y;
    }

    @Override
    public Field<Double> field8() {
        return RpkitTicket.RPKIT_TICKET.Z;
    }

    @Override
    public Field<Double> field9() {
        return RpkitTicket.RPKIT_TICKET.YAW;
    }

    @Override
    public Field<Double> field10() {
        return RpkitTicket.RPKIT_TICKET.PITCH;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return RpkitTicket.RPKIT_TICKET.OPEN_DATE;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return RpkitTicket.RPKIT_TICKET.CLOSE_DATE;
    }

    @Override
    public Field<Boolean> field13() {
        return RpkitTicket.RPKIT_TICKET.CLOSED;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getReason();
    }

    @Override
    public Integer component3() {
        return getIssuerId();
    }

    @Override
    public Integer component4() {
        return getResolverId();
    }

    @Override
    public String component5() {
        return getWorld();
    }

    @Override
    public Double component6() {
        return getX();
    }

    @Override
    public Double component7() {
        return getY();
    }

    @Override
    public Double component8() {
        return getZ();
    }

    @Override
    public Double component9() {
        return getYaw();
    }

    @Override
    public Double component10() {
        return getPitch();
    }

    @Override
    public LocalDateTime component11() {
        return getOpenDate();
    }

    @Override
    public LocalDateTime component12() {
        return getCloseDate();
    }

    @Override
    public Boolean component13() {
        return getClosed();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getReason();
    }

    @Override
    public Integer value3() {
        return getIssuerId();
    }

    @Override
    public Integer value4() {
        return getResolverId();
    }

    @Override
    public String value5() {
        return getWorld();
    }

    @Override
    public Double value6() {
        return getX();
    }

    @Override
    public Double value7() {
        return getY();
    }

    @Override
    public Double value8() {
        return getZ();
    }

    @Override
    public Double value9() {
        return getYaw();
    }

    @Override
    public Double value10() {
        return getPitch();
    }

    @Override
    public LocalDateTime value11() {
        return getOpenDate();
    }

    @Override
    public LocalDateTime value12() {
        return getCloseDate();
    }

    @Override
    public Boolean value13() {
        return getClosed();
    }

    @Override
    public RpkitTicketRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value2(String value) {
        setReason(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value3(Integer value) {
        setIssuerId(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value4(Integer value) {
        setResolverId(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value5(String value) {
        setWorld(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value6(Double value) {
        setX(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value7(Double value) {
        setY(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value8(Double value) {
        setZ(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value9(Double value) {
        setYaw(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value10(Double value) {
        setPitch(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value11(LocalDateTime value) {
        setOpenDate(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value12(LocalDateTime value) {
        setCloseDate(value);
        return this;
    }

    @Override
    public RpkitTicketRecord value13(Boolean value) {
        setClosed(value);
        return this;
    }

    @Override
    public RpkitTicketRecord values(Integer value1, String value2, Integer value3, Integer value4, String value5, Double value6, Double value7, Double value8, Double value9, Double value10, LocalDateTime value11, LocalDateTime value12, Boolean value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RpkitTicketRecord
     */
    public RpkitTicketRecord() {
        super(RpkitTicket.RPKIT_TICKET);
    }

    /**
     * Create a detached, initialised RpkitTicketRecord
     */
    public RpkitTicketRecord(Integer id, String reason, Integer issuerId, Integer resolverId, String world, Double x, Double y, Double z, Double yaw, Double pitch, LocalDateTime openDate, LocalDateTime closeDate, Boolean closed) {
        super(RpkitTicket.RPKIT_TICKET);

        setId(id);
        setReason(reason);
        setIssuerId(issuerId);
        setResolverId(resolverId);
        setWorld(world);
        setX(x);
        setY(y);
        setZ(z);
        setYaw(yaw);
        setPitch(pitch);
        setOpenDate(openDate);
        setCloseDate(closeDate);
        setClosed(closed);
    }
}
