/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.commons.impl.jooq.generation.tables.records;


import com.wuda.foundation.core.commons.impl.jooq.generation.tables.MenuItem;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import java.time.LocalDateTime;


/**
 * 可以代表站点的功能菜单中的一个具体功能，导航栏菜单（Navigation menu）中的一个具体项等等，这些item可能是按钮，链接等。参考Android的Menu，MenuItem，https://developer.android.com/reference/android/view/MenuItem。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MenuItemRecord extends UpdatableRecordImpl<MenuItemRecord> implements Record8<ULong, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = -926717690;

    /**
     * Setter for <code>foundation_commons.menu_item.menu_item_id</code>.
     */
    public void setMenuItemId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item.menu_item_id</code>.
     */
    public ULong getMenuItemId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_commons.menu_item.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>foundation_commons.menu_item.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_commons.menu_item.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>foundation_commons.menu_item.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>foundation_commons.menu_item.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>foundation_commons.menu_item.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>foundation_commons.menu_item.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_commons.menu_item.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<ULong, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return MenuItem.MENU_ITEM.MENU_ITEM_ID;
    }

    @Override
    public Field<String> field2() {
        return MenuItem.MENU_ITEM.NAME;
    }

    @Override
    public Field<String> field3() {
        return MenuItem.MENU_ITEM.DESCRIPTION;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return MenuItem.MENU_ITEM.CREATE_TIME;
    }

    @Override
    public Field<ULong> field5() {
        return MenuItem.MENU_ITEM.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return MenuItem.MENU_ITEM.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field7() {
        return MenuItem.MENU_ITEM.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field8() {
        return MenuItem.MENU_ITEM.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getMenuItemId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    @Override
    public ULong component5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component6() {
        return getLastModifyTime();
    }

    @Override
    public ULong component7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component8() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getMenuItemId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    @Override
    public ULong value5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value6() {
        return getLastModifyTime();
    }

    @Override
    public ULong value7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value8() {
        return getIsDeleted();
    }

    @Override
    public MenuItemRecord value1(ULong value) {
        setMenuItemId(value);
        return this;
    }

    @Override
    public MenuItemRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public MenuItemRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public MenuItemRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public MenuItemRecord value5(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public MenuItemRecord value6(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public MenuItemRecord value7(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public MenuItemRecord value8(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public MenuItemRecord values(ULong value1, String value2, String value3, LocalDateTime value4, ULong value5, LocalDateTime value6, ULong value7, ULong value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MenuItemRecord
     */
    public MenuItemRecord() {
        super(MenuItem.MENU_ITEM);
    }

    /**
     * Create a detached, initialised MenuItemRecord
     */
    public MenuItemRecord(ULong menuItemId, String name, String description, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(MenuItem.MENU_ITEM);

        set(0, menuItemId);
        set(1, name);
        set(2, description);
        set(3, createTime);
        set(4, createUserId);
        set(5, lastModifyTime);
        set(6, lastModifyUserId);
        set(7, isDeleted);
    }
}