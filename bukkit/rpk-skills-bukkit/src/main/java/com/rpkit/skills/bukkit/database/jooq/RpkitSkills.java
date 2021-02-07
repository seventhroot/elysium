/*
 * This file is generated by jOOQ.
 */
package com.rpkit.skills.bukkit.database.jooq;


import com.rpkit.skills.bukkit.database.jooq.tables.RpkitSkillBinding;
import com.rpkit.skills.bukkit.database.jooq.tables.RpkitSkillCooldown;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RpkitSkills extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>rpkit_skills</code>
     */
    public static final RpkitSkills RPKIT_SKILLS = new RpkitSkills();

    /**
     * The table <code>rpkit_skills.rpkit_skill_binding</code>.
     */
    public final RpkitSkillBinding RPKIT_SKILL_BINDING = RpkitSkillBinding.RPKIT_SKILL_BINDING;

    /**
     * The table <code>rpkit_skills.rpkit_skill_cooldown</code>.
     */
    public final RpkitSkillCooldown RPKIT_SKILL_COOLDOWN = RpkitSkillCooldown.RPKIT_SKILL_COOLDOWN;

    /**
     * No further instances allowed
     */
    private RpkitSkills() {
        super("rpkit_skills", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            RpkitSkillBinding.RPKIT_SKILL_BINDING,
            RpkitSkillCooldown.RPKIT_SKILL_COOLDOWN);
    }
}
