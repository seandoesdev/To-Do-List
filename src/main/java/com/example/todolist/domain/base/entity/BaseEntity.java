package com.example.todolist.domain.base.entity;

import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public abstract class BaseEntity {

    @CreationTimestamp
    @Column(nullable = false)
    protected LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    protected LocalDateTime updateBy;
}
