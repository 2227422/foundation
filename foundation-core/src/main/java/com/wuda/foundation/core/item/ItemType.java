package com.wuda.foundation.core.item;

import com.wuda.foundation.lang.UniqueCodeDescriptor;

/**
 * item type.虽然该类可以通过<i>new</i>关键字任意实例化,但是
 * 你应该把类型作为常量,就好像{@link java.sql.JDBCType}一样.
 *
 * @author wuda
 * @since 1.0.3
 */
public interface ItemType extends UniqueCodeDescriptor<Byte> {
}
