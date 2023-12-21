package com.example.todolist.domain.task.service;

import com.example.todolist.domain.task.entity.Task;

import java.util.List;

public interface TaskService {

    /**
     * 업무 저장
     */
    public Task save(Task task);

    public int update(Task task);

    public List<Task> getAllTask(int userId);

}
