/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.commons.tables;


import com.wuda.foundation.jooq.code.generation.commons.FoundationCommons;
import com.wuda.foundation.jooq.code.generation.commons.Keys;
import com.wuda.foundation.jooq.code.generation.commons.tables.records.TaskPhaseRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
 * 任务的某个阶段
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskPhase extends TableImpl<TaskPhaseRecord> {

    private static final long serialVersionUID = -915301735;

    /**
     * The reference instance of <code>foundation_commons.task_phase</code>
     */
    public static final TaskPhase TASK_PHASE = new TaskPhase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskPhaseRecord> getRecordType() {
        return TaskPhaseRecord.class;
    }

    /**
     * The column <code>foundation_commons.task_phase.task_phase_id</code>.
     */
    public final TableField<TaskPhaseRecord, ULong> TASK_PHASE_ID = createField(DSL.name("task_phase_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_commons.task_phase.task_id</code>. 所属任务的ID
     */
    public final TableField<TaskPhaseRecord, ULong> TASK_ID = createField(DSL.name("task_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "所属任务的ID");

    /**
     * The column <code>foundation_commons.task_phase.type</code>. 任务阶段的类型，比如创建阶段，清理阶段
     */
    public final TableField<TaskPhaseRecord, UByte> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "任务阶段的类型，比如创建阶段，清理阶段");

    /**
     * The column <code>foundation_commons.task_phase.execute_status</code>. 当前阶段的状态
     */
    public final TableField<TaskPhaseRecord, UByte> EXECUTE_STATUS = createField(DSL.name("execute_status"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "当前阶段的状态");

    /**
     * The column <code>foundation_commons.task_phase.sequence_number</code>. 任务序列号，用于表明任务阶段的先后关系，数字越大，表明在阶段中越靠后执行
     */
    public final TableField<TaskPhaseRecord, UByte> SEQUENCE_NUMBER = createField(DSL.name("sequence_number"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "任务序列号，用于表明任务阶段的先后关系，数字越大，表明在阶段中越靠后执行");

    /**
     * The column <code>foundation_commons.task_phase.create_time</code>.
     */
    public final TableField<TaskPhaseRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.task_phase.create_user_id</code>.
     */
    public final TableField<TaskPhaseRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.task_phase.last_modify_time</code>.
     */
    public final TableField<TaskPhaseRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.task_phase.last_modify_user_id</code>.
     */
    public final TableField<TaskPhaseRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.task_phase.is_deleted</code>.
     */
    public final TableField<TaskPhaseRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_commons.task_phase</code> table reference
     */
    public TaskPhase() {
        this(DSL.name("task_phase"), null);
    }

    /**
     * Create an aliased <code>foundation_commons.task_phase</code> table reference
     */
    public TaskPhase(String alias) {
        this(DSL.name(alias), TASK_PHASE);
    }

    /**
     * Create an aliased <code>foundation_commons.task_phase</code> table reference
     */
    public TaskPhase(Name alias) {
        this(alias, TASK_PHASE);
    }

    private TaskPhase(Name alias, Table<TaskPhaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private TaskPhase(Name alias, Table<TaskPhaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("任务的某个阶段"), TableOptions.table());
    }

    public <O extends Record> TaskPhase(Table<O> child, ForeignKey<O, TaskPhaseRecord> key) {
        super(child, key, TASK_PHASE);
    }

    @Override
    public Schema getSchema() {
        return FoundationCommons.FOUNDATION_COMMONS;
    }

    @Override
    public Identity<TaskPhaseRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TASK_PHASE;
    }

    @Override
    public UniqueKey<TaskPhaseRecord> getPrimaryKey() {
        return Keys.KEY_TASK_PHASE_PRIMARY;
    }

    @Override
    public List<UniqueKey<TaskPhaseRecord>> getKeys() {
        return Arrays.<UniqueKey<TaskPhaseRecord>>asList(Keys.KEY_TASK_PHASE_PRIMARY);
    }

    @Override
    public TaskPhase as(String alias) {
        return new TaskPhase(DSL.name(alias), this);
    }

    @Override
    public TaskPhase as(Name alias) {
        return new TaskPhase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskPhase rename(String name) {
        return new TaskPhase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskPhase rename(Name name) {
        return new TaskPhase(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, ULong, UByte, UByte, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
