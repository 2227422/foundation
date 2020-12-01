/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.commons.impl.jooq.generation.tables;


import com.wuda.foundation.core.commons.impl.jooq.generation.FoundationCommons;
import com.wuda.foundation.core.commons.impl.jooq.generation.Indexes;
import com.wuda.foundation.core.commons.impl.jooq.generation.Keys;
import com.wuda.foundation.core.commons.impl.jooq.generation.tables.records.PropertyMountRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 属性模板的挂载点，比如对于商品来说，相同分类下的商品属性很擂台，因此可以把属性模板挂载到商品分类上，在新建商品时就可以推荐相关的属性模板了
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyMount extends TableImpl<PropertyMountRecord> {

    private static final long serialVersionUID = 1354436214;

    /**
     * The reference instance of <code>foundation_commons.property_mount</code>
     */
    public static final PropertyMount PROPERTY_MOUNT = new PropertyMount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PropertyMountRecord> getRecordType() {
        return PropertyMountRecord.class;
    }

    /**
     * The column <code>foundation_commons.property_mount.id</code>.
     */
    public final TableField<PropertyMountRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_commons.property_mount.property_key_id</code>.
     */
    public final TableField<PropertyMountRecord, ULong> PROPERTY_KEY_ID = createField(DSL.name("property_key_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.property_mount.mount_point_type</code>. 挂载点类型
     */
    public final TableField<PropertyMountRecord, UByte> MOUNT_POINT_TYPE = createField(DSL.name("mount_point_type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "挂载点类型");

    /**
     * The column <code>foundation_commons.property_mount.mount_point_idenfier</code>. 挂载点唯一标记
     */
    public final TableField<PropertyMountRecord, ULong> MOUNT_POINT_IDENFIER = createField(DSL.name("mount_point_idenfier"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "挂载点唯一标记");

    /**
     * The column <code>foundation_commons.property_mount.create_time</code>.
     */
    public final TableField<PropertyMountRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.property_mount.create_user_id</code>.
     */
    public final TableField<PropertyMountRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.property_mount.is_deleted</code>.
     */
    public final TableField<PropertyMountRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_commons.property_mount</code> table reference
     */
    public PropertyMount() {
        this(DSL.name("property_mount"), null);
    }

    /**
     * Create an aliased <code>foundation_commons.property_mount</code> table reference
     */
    public PropertyMount(String alias) {
        this(DSL.name(alias), PROPERTY_MOUNT);
    }

    /**
     * Create an aliased <code>foundation_commons.property_mount</code> table reference
     */
    public PropertyMount(Name alias) {
        this(alias, PROPERTY_MOUNT);
    }

    private PropertyMount(Name alias, Table<PropertyMountRecord> aliased) {
        this(alias, aliased, null);
    }

    private PropertyMount(Name alias, Table<PropertyMountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("属性模板的挂载点，比如对于商品来说，相同分类下的商品属性很擂台，因此可以把属性模板挂载到商品分类上，在新建商品时就可以推荐相关的属性模板了"), TableOptions.table());
    }

    public <O extends Record> PropertyMount(Table<O> child, ForeignKey<O, PropertyMountRecord> key) {
        super(child, key, PROPERTY_MOUNT);
    }

    @Override
    public Schema getSchema() {
        return FoundationCommons.FOUNDATION_COMMONS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PROPERTY_MOUNT_FK_ATTRIBUTE_KEY_ID, Indexes.PROPERTY_MOUNT_IDX_MOUNT);
    }

    @Override
    public Identity<PropertyMountRecord, ULong> getIdentity() {
        return Keys.IDENTITY_PROPERTY_MOUNT;
    }

    @Override
    public UniqueKey<PropertyMountRecord> getPrimaryKey() {
        return Keys.KEY_PROPERTY_MOUNT_PRIMARY;
    }

    @Override
    public List<UniqueKey<PropertyMountRecord>> getKeys() {
        return Arrays.<UniqueKey<PropertyMountRecord>>asList(Keys.KEY_PROPERTY_MOUNT_PRIMARY);
    }

    @Override
    public PropertyMount as(String alias) {
        return new PropertyMount(DSL.name(alias), this);
    }

    @Override
    public PropertyMount as(Name alias) {
        return new PropertyMount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PropertyMount rename(String name) {
        return new PropertyMount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PropertyMount rename(Name name) {
        return new PropertyMount(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<ULong, ULong, UByte, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}