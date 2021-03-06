/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.security.impl.jooq.generation.tables.records;


import com.wuda.foundation.security.impl.jooq.generation.tables.PermissionAssignment;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * 权限分配。subject可以代表任何主体，比如用户，或者想要访问其他资源的应用，因此我们可以说user 【IS A】 subject 。target可以代表任何对象，比如file，因此我们可以说file 
 * 【IS A】 target。action可以代表任何操作，比如read/write。subject , target , action这三个实体，不一定是某个具体的单个实体，也可以是一类实体，比如target如果是文件夹，那么可以代表subject对这个文件夹下的所有文件以及子文件夹（递归）都拥有权限；同样
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionAssignmentRecord extends UpdatableRecordImpl<PermissionAssignmentRecord> implements Record11<ULong, UByte, ULong, UShort, ULong, UShort, ULong, Boolean, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = -1320025944;

    /**
     * Setter for <code>foundation_security.permission_assignment.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.subject_type</code>. subject的类型，比如subject代表用户
     */
    public void setSubjectType(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.subject_type</code>. subject的类型，比如subject代表用户
     */
    public UByte getSubjectType() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.subject_identifier</code>. 如果subject type代表用户，那么这个值可能就是用户ID
     */
    public void setSubjectIdentifier(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.subject_identifier</code>. 如果subject type代表用户，那么这个值可能就是用户ID
     */
    public ULong getSubjectIdentifier() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.target_type</code>. target的类型，比如target代表文件
     */
    public void setTargetType(UShort value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.target_type</code>. target的类型，比如target代表文件
     */
    public UShort getTargetType() {
        return (UShort) get(3);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.target_identifier</code>. target的唯一标记符
     */
    public void setTargetIdentifier(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.target_identifier</code>. target的唯一标记符
     */
    public ULong getTargetIdentifier() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.action_type</code>. action的类型
     */
    public void setActionType(UShort value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.action_type</code>. action的类型
     */
    public UShort getActionType() {
        return (UShort) get(5);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.action_identifier</code>. action的唯一标记符
     */
    public void setActionIdentifier(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.action_identifier</code>. action的唯一标记符
     */
    public ULong getActionIdentifier() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.inclusion</code>. inclusion or exclusion，虽然为subject分配了target和action，但不一定是拥有，也可以是排除
     */
    public void setInclusion(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.inclusion</code>. inclusion or exclusion，虽然为subject分配了target和action，但不一定是拥有，也可以是排除
     */
    public Boolean getInclusion() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>foundation_security.permission_assignment.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>foundation_security.permission_assignment.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<ULong, UByte, ULong, UShort, ULong, UShort, ULong, Boolean, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<ULong, UByte, ULong, UShort, ULong, UShort, ULong, Boolean, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.ID;
    }

    @Override
    public Field<UByte> field2() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.SUBJECT_TYPE;
    }

    @Override
    public Field<ULong> field3() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.SUBJECT_IDENTIFIER;
    }

    @Override
    public Field<UShort> field4() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.TARGET_TYPE;
    }

    @Override
    public Field<ULong> field5() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.TARGET_IDENTIFIER;
    }

    @Override
    public Field<UShort> field6() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.ACTION_TYPE;
    }

    @Override
    public Field<ULong> field7() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.ACTION_IDENTIFIER;
    }

    @Override
    public Field<Boolean> field8() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.INCLUSION;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.CREATE_TIME;
    }

    @Override
    public Field<ULong> field10() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.CREATE_USER_ID;
    }

    @Override
    public Field<ULong> field11() {
        return PermissionAssignment.PERMISSION_ASSIGNMENT.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public UByte component2() {
        return getSubjectType();
    }

    @Override
    public ULong component3() {
        return getSubjectIdentifier();
    }

    @Override
    public UShort component4() {
        return getTargetType();
    }

    @Override
    public ULong component5() {
        return getTargetIdentifier();
    }

    @Override
    public UShort component6() {
        return getActionType();
    }

    @Override
    public ULong component7() {
        return getActionIdentifier();
    }

    @Override
    public Boolean component8() {
        return getInclusion();
    }

    @Override
    public LocalDateTime component9() {
        return getCreateTime();
    }

    @Override
    public ULong component10() {
        return getCreateUserId();
    }

    @Override
    public ULong component11() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public UByte value2() {
        return getSubjectType();
    }

    @Override
    public ULong value3() {
        return getSubjectIdentifier();
    }

    @Override
    public UShort value4() {
        return getTargetType();
    }

    @Override
    public ULong value5() {
        return getTargetIdentifier();
    }

    @Override
    public UShort value6() {
        return getActionType();
    }

    @Override
    public ULong value7() {
        return getActionIdentifier();
    }

    @Override
    public Boolean value8() {
        return getInclusion();
    }

    @Override
    public LocalDateTime value9() {
        return getCreateTime();
    }

    @Override
    public ULong value10() {
        return getCreateUserId();
    }

    @Override
    public ULong value11() {
        return getIsDeleted();
    }

    @Override
    public PermissionAssignmentRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value2(UByte value) {
        setSubjectType(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value3(ULong value) {
        setSubjectIdentifier(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value4(UShort value) {
        setTargetType(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value5(ULong value) {
        setTargetIdentifier(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value6(UShort value) {
        setActionType(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value7(ULong value) {
        setActionIdentifier(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value8(Boolean value) {
        setInclusion(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value9(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value10(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord value11(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public PermissionAssignmentRecord values(ULong value1, UByte value2, ULong value3, UShort value4, ULong value5, UShort value6, ULong value7, Boolean value8, LocalDateTime value9, ULong value10, ULong value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PermissionAssignmentRecord
     */
    public PermissionAssignmentRecord() {
        super(PermissionAssignment.PERMISSION_ASSIGNMENT);
    }

    /**
     * Create a detached, initialised PermissionAssignmentRecord
     */
    public PermissionAssignmentRecord(ULong id, UByte subjectType, ULong subjectIdentifier, UShort targetType, ULong targetIdentifier, UShort actionType, ULong actionIdentifier, Boolean inclusion, LocalDateTime createTime, ULong createUserId, ULong isDeleted) {
        super(PermissionAssignment.PERMISSION_ASSIGNMENT);

        set(0, id);
        set(1, subjectType);
        set(2, subjectIdentifier);
        set(3, targetType);
        set(4, targetIdentifier);
        set(5, actionType);
        set(6, actionIdentifier);
        set(7, inclusion);
        set(8, createTime);
        set(9, createUserId);
        set(10, isDeleted);
    }
}
