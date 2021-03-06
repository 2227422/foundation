/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UByte;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * 行政单元，行政区域划分。也就是省市区等数据，不按省市区建表，因为不一定是按那样划分，比如北京，深圳，但是他们有一个共同特点，那就是有上下级关系，因此用ID/PID的方式组织。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdministrativeUnit implements Serializable {

    private static final long serialVersionUID = 869224810;

    private UShort        administrativeUnitId;
    private UShort        parentId;
    private String        fullName;
    private String        shortName;
    private String        alias;
    private UByte         level;
    private String        levelName;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public AdministrativeUnit() {}

    public AdministrativeUnit(AdministrativeUnit value) {
        this.administrativeUnitId = value.administrativeUnitId;
        this.parentId = value.parentId;
        this.fullName = value.fullName;
        this.shortName = value.shortName;
        this.alias = value.alias;
        this.level = value.level;
        this.levelName = value.levelName;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public AdministrativeUnit(
        UShort        administrativeUnitId,
        UShort        parentId,
        String        fullName,
        String        shortName,
        String        alias,
        UByte         level,
        String        levelName,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.administrativeUnitId = administrativeUnitId;
        this.parentId = parentId;
        this.fullName = fullName;
        this.shortName = shortName;
        this.alias = alias;
        this.level = level;
        this.levelName = levelName;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public UShort getAdministrativeUnitId() {
        return this.administrativeUnitId;
    }

    public void setAdministrativeUnitId(UShort administrativeUnitId) {
        this.administrativeUnitId = administrativeUnitId;
    }

    public UShort getParentId() {
        return this.parentId;
    }

    public void setParentId(UShort parentId) {
        this.parentId = parentId;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public UByte getLevel() {
        return this.level;
    }

    public void setLevel(UByte level) {
        this.level = level;
    }

    public String getLevelName() {
        return this.levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public ULong getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(ULong createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ULong getLastModifyUserId() {
        return this.lastModifyUserId;
    }

    public void setLastModifyUserId(ULong lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public ULong getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(ULong isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AdministrativeUnit (");

        sb.append(administrativeUnitId);
        sb.append(", ").append(parentId);
        sb.append(", ").append(fullName);
        sb.append(", ").append(shortName);
        sb.append(", ").append(alias);
        sb.append(", ").append(level);
        sb.append(", ").append(levelName);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
