package com.example.todolist.domain.base.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public abstract class BaseEntity {

    @Column(nullable = false, updatable = false)
    protected LocalDateTime createdAt;

    @Column(columnDefinition = "BINARY(16)", nullable = false)
    protected LocalDateTime updateBy;
}
