package com.example.todolist.domain.task.repository;

import com.example.todolist.domain.task.entity.Task;

import java.util.List;
import java.util.Optional;

public interface JpaTaskRepository {
    Task save(Task task);

    int update(Task task);

    List<Task> findById(int id);

    Optional<Task> findByTitle(String title);

    List<Task> findAll();
}
