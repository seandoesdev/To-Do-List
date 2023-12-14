package com.example.todolist.domain.task.service;

import com.example.todolist.domain.task.entity.Task;

import java.util.List;

public interface TaskService {

    /**
     * 업무 저장
     */
    public int create(Task task);
    public List<Task> getAllTask(int userId);
}
