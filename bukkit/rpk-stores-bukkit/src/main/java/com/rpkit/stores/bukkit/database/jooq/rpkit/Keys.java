/*
 * This file is generated by jOOQ.
 */
package com.rpkit.stores.bukkit.database.jooq.rpkit;


import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.RpkitConsumablePurchase;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.RpkitConsumableStoreItem;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.RpkitPermanentPurchase;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.RpkitPermanentStoreItem;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.RpkitPurchase;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.RpkitStoreItem;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.RpkitTimedPurchase;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.RpkitTimedStoreItem;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.records.RpkitConsumablePurchaseRecord;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.records.RpkitConsumableStoreItemRecord;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.records.RpkitPermanentPurchaseRecord;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.records.RpkitPermanentStoreItemRecord;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.records.RpkitPurchaseRecord;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.records.RpkitStoreItemRecord;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.records.RpkitTimedPurchaseRecord;
import com.rpkit.stores.bukkit.database.jooq.rpkit.tables.records.RpkitTimedStoreItemRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>rpkit</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<RpkitConsumablePurchaseRecord, Integer> IDENTITY_RPKIT_CONSUMABLE_PURCHASE = Identities0.IDENTITY_RPKIT_CONSUMABLE_PURCHASE;
    public static final Identity<RpkitConsumableStoreItemRecord, Integer> IDENTITY_RPKIT_CONSUMABLE_STORE_ITEM = Identities0.IDENTITY_RPKIT_CONSUMABLE_STORE_ITEM;
    public static final Identity<RpkitPermanentPurchaseRecord, Integer> IDENTITY_RPKIT_PERMANENT_PURCHASE = Identities0.IDENTITY_RPKIT_PERMANENT_PURCHASE;
    public static final Identity<RpkitPermanentStoreItemRecord, Integer> IDENTITY_RPKIT_PERMANENT_STORE_ITEM = Identities0.IDENTITY_RPKIT_PERMANENT_STORE_ITEM;
    public static final Identity<RpkitPurchaseRecord, Integer> IDENTITY_RPKIT_PURCHASE = Identities0.IDENTITY_RPKIT_PURCHASE;
    public static final Identity<RpkitStoreItemRecord, Integer> IDENTITY_RPKIT_STORE_ITEM = Identities0.IDENTITY_RPKIT_STORE_ITEM;
    public static final Identity<RpkitTimedPurchaseRecord, Integer> IDENTITY_RPKIT_TIMED_PURCHASE = Identities0.IDENTITY_RPKIT_TIMED_PURCHASE;
    public static final Identity<RpkitTimedStoreItemRecord, Integer> IDENTITY_RPKIT_TIMED_STORE_ITEM = Identities0.IDENTITY_RPKIT_TIMED_STORE_ITEM;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<RpkitConsumablePurchaseRecord> KEY_RPKIT_CONSUMABLE_PURCHASE_PRIMARY = UniqueKeys0.KEY_RPKIT_CONSUMABLE_PURCHASE_PRIMARY;
    public static final UniqueKey<RpkitConsumableStoreItemRecord> KEY_RPKIT_CONSUMABLE_STORE_ITEM_PRIMARY = UniqueKeys0.KEY_RPKIT_CONSUMABLE_STORE_ITEM_PRIMARY;
    public static final UniqueKey<RpkitPermanentPurchaseRecord> KEY_RPKIT_PERMANENT_PURCHASE_PRIMARY = UniqueKeys0.KEY_RPKIT_PERMANENT_PURCHASE_PRIMARY;
    public static final UniqueKey<RpkitPermanentStoreItemRecord> KEY_RPKIT_PERMANENT_STORE_ITEM_PRIMARY = UniqueKeys0.KEY_RPKIT_PERMANENT_STORE_ITEM_PRIMARY;
    public static final UniqueKey<RpkitPurchaseRecord> KEY_RPKIT_PURCHASE_PRIMARY = UniqueKeys0.KEY_RPKIT_PURCHASE_PRIMARY;
    public static final UniqueKey<RpkitStoreItemRecord> KEY_RPKIT_STORE_ITEM_PRIMARY = UniqueKeys0.KEY_RPKIT_STORE_ITEM_PRIMARY;
    public static final UniqueKey<RpkitTimedPurchaseRecord> KEY_RPKIT_TIMED_PURCHASE_PRIMARY = UniqueKeys0.KEY_RPKIT_TIMED_PURCHASE_PRIMARY;
    public static final UniqueKey<RpkitTimedStoreItemRecord> KEY_RPKIT_TIMED_STORE_ITEM_PRIMARY = UniqueKeys0.KEY_RPKIT_TIMED_STORE_ITEM_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<RpkitConsumablePurchaseRecord, Integer> IDENTITY_RPKIT_CONSUMABLE_PURCHASE = Internal.createIdentity(RpkitConsumablePurchase.RPKIT_CONSUMABLE_PURCHASE, RpkitConsumablePurchase.RPKIT_CONSUMABLE_PURCHASE.ID);
        public static Identity<RpkitConsumableStoreItemRecord, Integer> IDENTITY_RPKIT_CONSUMABLE_STORE_ITEM = Internal.createIdentity(RpkitConsumableStoreItem.RPKIT_CONSUMABLE_STORE_ITEM, RpkitConsumableStoreItem.RPKIT_CONSUMABLE_STORE_ITEM.ID);
        public static Identity<RpkitPermanentPurchaseRecord, Integer> IDENTITY_RPKIT_PERMANENT_PURCHASE = Internal.createIdentity(RpkitPermanentPurchase.RPKIT_PERMANENT_PURCHASE, RpkitPermanentPurchase.RPKIT_PERMANENT_PURCHASE.ID);
        public static Identity<RpkitPermanentStoreItemRecord, Integer> IDENTITY_RPKIT_PERMANENT_STORE_ITEM = Internal.createIdentity(RpkitPermanentStoreItem.RPKIT_PERMANENT_STORE_ITEM, RpkitPermanentStoreItem.RPKIT_PERMANENT_STORE_ITEM.ID);
        public static Identity<RpkitPurchaseRecord, Integer> IDENTITY_RPKIT_PURCHASE = Internal.createIdentity(RpkitPurchase.RPKIT_PURCHASE, RpkitPurchase.RPKIT_PURCHASE.ID);
        public static Identity<RpkitStoreItemRecord, Integer> IDENTITY_RPKIT_STORE_ITEM = Internal.createIdentity(RpkitStoreItem.RPKIT_STORE_ITEM, RpkitStoreItem.RPKIT_STORE_ITEM.ID);
        public static Identity<RpkitTimedPurchaseRecord, Integer> IDENTITY_RPKIT_TIMED_PURCHASE = Internal.createIdentity(RpkitTimedPurchase.RPKIT_TIMED_PURCHASE, RpkitTimedPurchase.RPKIT_TIMED_PURCHASE.ID);
        public static Identity<RpkitTimedStoreItemRecord, Integer> IDENTITY_RPKIT_TIMED_STORE_ITEM = Internal.createIdentity(RpkitTimedStoreItem.RPKIT_TIMED_STORE_ITEM, RpkitTimedStoreItem.RPKIT_TIMED_STORE_ITEM.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<RpkitConsumablePurchaseRecord> KEY_RPKIT_CONSUMABLE_PURCHASE_PRIMARY = Internal.createUniqueKey(RpkitConsumablePurchase.RPKIT_CONSUMABLE_PURCHASE, "KEY_rpkit_consumable_purchase_PRIMARY", RpkitConsumablePurchase.RPKIT_CONSUMABLE_PURCHASE.ID);
        public static final UniqueKey<RpkitConsumableStoreItemRecord> KEY_RPKIT_CONSUMABLE_STORE_ITEM_PRIMARY = Internal.createUniqueKey(RpkitConsumableStoreItem.RPKIT_CONSUMABLE_STORE_ITEM, "KEY_rpkit_consumable_store_item_PRIMARY", RpkitConsumableStoreItem.RPKIT_CONSUMABLE_STORE_ITEM.ID);
        public static final UniqueKey<RpkitPermanentPurchaseRecord> KEY_RPKIT_PERMANENT_PURCHASE_PRIMARY = Internal.createUniqueKey(RpkitPermanentPurchase.RPKIT_PERMANENT_PURCHASE, "KEY_rpkit_permanent_purchase_PRIMARY", RpkitPermanentPurchase.RPKIT_PERMANENT_PURCHASE.ID);
        public static final UniqueKey<RpkitPermanentStoreItemRecord> KEY_RPKIT_PERMANENT_STORE_ITEM_PRIMARY = Internal.createUniqueKey(RpkitPermanentStoreItem.RPKIT_PERMANENT_STORE_ITEM, "KEY_rpkit_permanent_store_item_PRIMARY", RpkitPermanentStoreItem.RPKIT_PERMANENT_STORE_ITEM.ID);
        public static final UniqueKey<RpkitPurchaseRecord> KEY_RPKIT_PURCHASE_PRIMARY = Internal.createUniqueKey(RpkitPurchase.RPKIT_PURCHASE, "KEY_rpkit_purchase_PRIMARY", RpkitPurchase.RPKIT_PURCHASE.ID);
        public static final UniqueKey<RpkitStoreItemRecord> KEY_RPKIT_STORE_ITEM_PRIMARY = Internal.createUniqueKey(RpkitStoreItem.RPKIT_STORE_ITEM, "KEY_rpkit_store_item_PRIMARY", RpkitStoreItem.RPKIT_STORE_ITEM.ID);
        public static final UniqueKey<RpkitTimedPurchaseRecord> KEY_RPKIT_TIMED_PURCHASE_PRIMARY = Internal.createUniqueKey(RpkitTimedPurchase.RPKIT_TIMED_PURCHASE, "KEY_rpkit_timed_purchase_PRIMARY", RpkitTimedPurchase.RPKIT_TIMED_PURCHASE.ID);
        public static final UniqueKey<RpkitTimedStoreItemRecord> KEY_RPKIT_TIMED_STORE_ITEM_PRIMARY = Internal.createUniqueKey(RpkitTimedStoreItem.RPKIT_TIMED_STORE_ITEM, "KEY_rpkit_timed_store_item_PRIMARY", RpkitTimedStoreItem.RPKIT_TIMED_STORE_ITEM.ID);
    }
}