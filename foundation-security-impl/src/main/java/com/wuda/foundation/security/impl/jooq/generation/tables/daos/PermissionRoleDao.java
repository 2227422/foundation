/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.security.impl.jooq.generation.tables.daos;


import com.wuda.foundation.security.impl.jooq.generation.tables.PermissionRole;
import com.wuda.foundation.security.impl.jooq.generation.tables.records.PermissionRoleRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 角色
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionRoleDao extends DAOImpl<PermissionRoleRecord, com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole, ULong> {

    /**
     * Create a new PermissionRoleDao without any configuration
     */
    public PermissionRoleDao() {
        super(PermissionRole.PERMISSION_ROLE, com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole.class);
    }

    /**
     * Create a new PermissionRoleDao with an attached configuration
     */
    public PermissionRoleDao(Configuration configuration) {
        super(PermissionRole.PERMISSION_ROLE, com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole object) {
        return object.getPermissionRoleId();
    }

    /**
     * Fetch records that have <code>permission_role_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchRangeOfPermissionRoleId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionRole.PERMISSION_ROLE.PERMISSION_ROLE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>permission_role_id IN (values)</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchByPermissionRoleId(ULong... values) {
        return fetch(PermissionRole.PERMISSION_ROLE.PERMISSION_ROLE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>permission_role_id = value</code>
     */
    public com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole fetchOneByPermissionRoleId(ULong value) {
        return fetchOne(PermissionRole.PERMISSION_ROLE.PERMISSION_ROLE_ID, value);
    }

    /**
     * Fetch records that have <code>type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchRangeOfType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(PermissionRole.PERMISSION_ROLE.TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchByType(UByte... values) {
        return fetch(PermissionRole.PERMISSION_ROLE.TYPE, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(PermissionRole.PERMISSION_ROLE.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchByName(String... values) {
        return fetch(PermissionRole.PERMISSION_ROLE.NAME, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(PermissionRole.PERMISSION_ROLE.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchByDescription(String... values) {
        return fetch(PermissionRole.PERMISSION_ROLE.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(PermissionRole.PERMISSION_ROLE.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchByCreateTime(LocalDateTime... values) {
        return fetch(PermissionRole.PERMISSION_ROLE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionRole.PERMISSION_ROLE.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchByCreateUserId(ULong... values) {
        return fetch(PermissionRole.PERMISSION_ROLE.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(PermissionRole.PERMISSION_ROLE.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(PermissionRole.PERMISSION_ROLE.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionRole.PERMISSION_ROLE.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchByLastModifyUserId(ULong... values) {
        return fetch(PermissionRole.PERMISSION_ROLE.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PermissionRole.PERMISSION_ROLE.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.security.impl.jooq.generation.tables.pojos.PermissionRole> fetchByIsDeleted(ULong... values) {
        return fetch(PermissionRole.PERMISSION_ROLE.IS_DELETED, values);
    }
}
