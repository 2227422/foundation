/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.commons.impl.jooq.generation.tables.daos;


import com.wuda.foundation.core.commons.impl.jooq.generation.tables.PropertyMount;
import com.wuda.foundation.core.commons.impl.jooq.generation.tables.records.PropertyMountRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.List;


/**
 * 属性模板的挂载点，比如对于商品来说，相同分类下的商品属性很擂台，因此可以把属性模板挂载到商品分类上，在新建商品时就可以推荐相关的属性模板了
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyMountDao extends DAOImpl<PropertyMountRecord, com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount, ULong> {

    /**
     * Create a new PropertyMountDao without any configuration
     */
    public PropertyMountDao() {
        super(PropertyMount.PROPERTY_MOUNT, com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount.class);
    }

    /**
     * Create a new PropertyMountDao with an attached configuration
     */
    public PropertyMountDao(Configuration configuration) {
        super(PropertyMount.PROPERTY_MOUNT, com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchRangeOfId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyMount.PROPERTY_MOUNT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchById(ULong... values) {
        return fetch(PropertyMount.PROPERTY_MOUNT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount fetchOneById(ULong value) {
        return fetchOne(PropertyMount.PROPERTY_MOUNT.ID, value);
    }

    /**
     * Fetch records that have <code>property_key_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchRangeOfPropertyKeyId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyMount.PROPERTY_MOUNT.PROPERTY_KEY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>property_key_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchByPropertyKeyId(ULong... values) {
        return fetch(PropertyMount.PROPERTY_MOUNT.PROPERTY_KEY_ID, values);
    }

    /**
     * Fetch records that have <code>mount_point_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchRangeOfMountPointType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(PropertyMount.PROPERTY_MOUNT.MOUNT_POINT_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>mount_point_type IN (values)</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchByMountPointType(UByte... values) {
        return fetch(PropertyMount.PROPERTY_MOUNT.MOUNT_POINT_TYPE, values);
    }

    /**
     * Fetch records that have <code>mount_point_idenfier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchRangeOfMountPointIdenfier(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyMount.PROPERTY_MOUNT.MOUNT_POINT_IDENFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>mount_point_idenfier IN (values)</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchByMountPointIdenfier(ULong... values) {
        return fetch(PropertyMount.PROPERTY_MOUNT.MOUNT_POINT_IDENFIER, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(PropertyMount.PROPERTY_MOUNT.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchByCreateTime(LocalDateTime... values) {
        return fetch(PropertyMount.PROPERTY_MOUNT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyMount.PROPERTY_MOUNT.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchByCreateUserId(ULong... values) {
        return fetch(PropertyMount.PROPERTY_MOUNT.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyMount.PROPERTY_MOUNT.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.core.commons.impl.jooq.generation.tables.pojos.PropertyMount> fetchByIsDeleted(ULong... values) {
        return fetch(PropertyMount.PROPERTY_MOUNT.IS_DELETED, values);
    }
}