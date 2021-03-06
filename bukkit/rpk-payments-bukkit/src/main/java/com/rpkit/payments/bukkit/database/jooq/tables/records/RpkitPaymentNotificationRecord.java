/*
 * This file is generated by jOOQ.
 */
package com.rpkit.payments.bukkit.database.jooq.tables.records;


import com.rpkit.payments.bukkit.database.jooq.tables.RpkitPaymentNotification;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitPaymentNotificationRecord extends UpdatableRecordImpl<RpkitPaymentNotificationRecord> implements Record6<Integer, Integer, Integer, Integer, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>rpkit_payments.rpkit_payment_notification.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>rpkit_payments.rpkit_payment_notification.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>rpkit_payments.rpkit_payment_notification.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>rpkit_payments.rpkit_payment_notification.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>rpkit_payments.rpkit_payment_notification.to_id</code>.
     */
    public void setToId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>rpkit_payments.rpkit_payment_notification.to_id</code>.
     */
    public Integer getToId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>rpkit_payments.rpkit_payment_notification.character_id</code>.
     */
    public void setCharacterId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>rpkit_payments.rpkit_payment_notification.character_id</code>.
     */
    public Integer getCharacterId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>rpkit_payments.rpkit_payment_notification.date</code>.
     */
    public void setDate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>rpkit_payments.rpkit_payment_notification.date</code>.
     */
    public LocalDateTime getDate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>rpkit_payments.rpkit_payment_notification.text</code>.
     */
    public void setText(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>rpkit_payments.rpkit_payment_notification.text</code>.
     */
    public String getText() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, LocalDateTime, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, Integer, Integer, LocalDateTime, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RpkitPaymentNotification.RPKIT_PAYMENT_NOTIFICATION.ID;
    }

    @Override
    public Field<Integer> field2() {
        return RpkitPaymentNotification.RPKIT_PAYMENT_NOTIFICATION.GROUP_ID;
    }

    @Override
    public Field<Integer> field3() {
        return RpkitPaymentNotification.RPKIT_PAYMENT_NOTIFICATION.TO_ID;
    }

    @Override
    public Field<Integer> field4() {
        return RpkitPaymentNotification.RPKIT_PAYMENT_NOTIFICATION.CHARACTER_ID;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return RpkitPaymentNotification.RPKIT_PAYMENT_NOTIFICATION.DATE;
    }

    @Override
    public Field<String> field6() {
        return RpkitPaymentNotification.RPKIT_PAYMENT_NOTIFICATION.TEXT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getGroupId();
    }

    @Override
    public Integer component3() {
        return getToId();
    }

    @Override
    public Integer component4() {
        return getCharacterId();
    }

    @Override
    public LocalDateTime component5() {
        return getDate();
    }

    @Override
    public String component6() {
        return getText();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getGroupId();
    }

    @Override
    public Integer value3() {
        return getToId();
    }

    @Override
    public Integer value4() {
        return getCharacterId();
    }

    @Override
    public LocalDateTime value5() {
        return getDate();
    }

    @Override
    public String value6() {
        return getText();
    }

    @Override
    public RpkitPaymentNotificationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RpkitPaymentNotificationRecord value2(Integer value) {
        setGroupId(value);
        return this;
    }

    @Override
    public RpkitPaymentNotificationRecord value3(Integer value) {
        setToId(value);
        return this;
    }

    @Override
    public RpkitPaymentNotificationRecord value4(Integer value) {
        setCharacterId(value);
        return this;
    }

    @Override
    public RpkitPaymentNotificationRecord value5(LocalDateTime value) {
        setDate(value);
        return this;
    }

    @Override
    public RpkitPaymentNotificationRecord value6(String value) {
        setText(value);
        return this;
    }

    @Override
    public RpkitPaymentNotificationRecord values(Integer value1, Integer value2, Integer value3, Integer value4, LocalDateTime value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RpkitPaymentNotificationRecord
     */
    public RpkitPaymentNotificationRecord() {
        super(RpkitPaymentNotification.RPKIT_PAYMENT_NOTIFICATION);
    }

    /**
     * Create a detached, initialised RpkitPaymentNotificationRecord
     */
    public RpkitPaymentNotificationRecord(Integer id, Integer groupId, Integer toId, Integer characterId, LocalDateTime date, String text) {
        super(RpkitPaymentNotification.RPKIT_PAYMENT_NOTIFICATION);

        setId(id);
        setGroupId(groupId);
        setToId(toId);
        setCharacterId(characterId);
        setDate(date);
        setText(text);
    }
}
