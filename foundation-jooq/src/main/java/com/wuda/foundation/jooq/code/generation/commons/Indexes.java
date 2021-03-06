/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.commons;


import com.wuda.foundation.jooq.code.generation.commons.tables.PropertyKeyDefinition;
import com.wuda.foundation.jooq.code.generation.commons.tables.PropertyMount;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>foundation_commons</code> 
 * schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PROPERTY_KEY_DEFINITION_FK_ATTRIBUTE_KEY_ID = Indexes0.PROPERTY_KEY_DEFINITION_FK_ATTRIBUTE_KEY_ID;
    public static final Index PROPERTY_MOUNT_FK_ATTRIBUTE_KEY_ID = Indexes0.PROPERTY_MOUNT_FK_ATTRIBUTE_KEY_ID;
    public static final Index PROPERTY_MOUNT_IDX_MOUNT = Indexes0.PROPERTY_MOUNT_IDX_MOUNT;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index PROPERTY_KEY_DEFINITION_FK_ATTRIBUTE_KEY_ID = Internal.createIndex("fk_attribute_key_id", PropertyKeyDefinition.PROPERTY_KEY_DEFINITION, new OrderField[] { PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.PROPERTY_KEY_ID }, false);
        public static Index PROPERTY_MOUNT_FK_ATTRIBUTE_KEY_ID = Internal.createIndex("fk_attribute_key_id", PropertyMount.PROPERTY_MOUNT, new OrderField[] { PropertyMount.PROPERTY_MOUNT.PROPERTY_KEY_ID }, false);
        public static Index PROPERTY_MOUNT_IDX_MOUNT = Internal.createIndex("idx_mount", PropertyMount.PROPERTY_MOUNT, new OrderField[] { PropertyMount.PROPERTY_MOUNT.MOUNT_POINT_TYPE, PropertyMount.PROPERTY_MOUNT.MOUNT_POINT_IDENFIER }, false);
    }
}
