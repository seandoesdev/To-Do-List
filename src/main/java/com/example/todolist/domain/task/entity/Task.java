package com.example.todolist.domain.task.entity;

import com.example.todolist.domain.base.entity.BaseEntity;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Task extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private int taskId;

    @Column(nullable = false)
    private int userId;

    @Column(nullable = false)
    private String title;

    private String description;

    private String deadline;

    @Enumerated(EnumType.STRING)
    private PriorityENUM priority;

    @Enumerated(EnumType.STRING)
    private StatusENUM status;

}
