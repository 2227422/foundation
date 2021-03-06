/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * 通知定义所属的组
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationDifinitionGroupRelation implements Serializable {

    private static final long serialVersionUID = 418446559;

    private ULong         id;
    private ULong         notificationDifinitionId;
    private ULong         groupId;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public NotificationDifinitionGroupRelation() {}

    public NotificationDifinitionGroupRelation(NotificationDifinitionGroupRelation value) {
        this.id = value.id;
        this.notificationDifinitionId = value.notificationDifinitionId;
        this.groupId = value.groupId;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public NotificationDifinitionGroupRelation(
        ULong         id,
        ULong         notificationDifinitionId,
        ULong         groupId,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.id = id;
        this.notificationDifinitionId = notificationDifinitionId;
        this.groupId = groupId;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public ULong getNotificationDifinitionId() {
        return this.notificationDifinitionId;
    }

    public void setNotificationDifinitionId(ULong notificationDifinitionId) {
        this.notificationDifinitionId = notificationDifinitionId;
    }

    public ULong getGroupId() {
        return this.groupId;
    }

    public void setGroupId(ULong groupId) {
        this.groupId = groupId;
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
        StringBuilder sb = new StringBuilder("NotificationDifinitionGroupRelation (");

        sb.append(id);
        sb.append(", ").append(notificationDifinitionId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
