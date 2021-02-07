/*
 * This file is generated by jOOQ.
 */
package com.rpkit.skills.bukkit.database.jooq;


import com.rpkit.skills.bukkit.database.jooq.tables.RpkitSkillBinding;
import com.rpkit.skills.bukkit.database.jooq.tables.records.RpkitSkillBindingRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * rpkit_skills.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<RpkitSkillBindingRecord> KEY_RPKIT_SKILL_BINDING_PRIMARY = Internal.createUniqueKey(RpkitSkillBinding.RPKIT_SKILL_BINDING, DSL.name("KEY_rpkit_skill_binding_PRIMARY"), new TableField[] { RpkitSkillBinding.RPKIT_SKILL_BINDING.ID }, true);
}
