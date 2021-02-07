/*
 * This file is generated by jOOQ.
 */
package com.rpkit.experience.bukkit.database.jooq;


import com.rpkit.experience.bukkit.database.jooq.tables.RpkitExperience;
import com.rpkit.experience.bukkit.database.jooq.tables.records.RpkitExperienceRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * rpkit_experience.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<RpkitExperienceRecord> KEY_RPKIT_EXPERIENCE_PRIMARY = Internal.createUniqueKey(RpkitExperience.RPKIT_EXPERIENCE_, DSL.name("KEY_rpkit_experience_PRIMARY"), new TableField[] { RpkitExperience.RPKIT_EXPERIENCE_.CHARACTER_ID }, true);
}
