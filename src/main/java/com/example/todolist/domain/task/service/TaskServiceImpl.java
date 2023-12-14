package com.example.todolist.domain.task.service;

import com.example.todolist.domain.task.entity.Task;
import com.example.todolist.domain.task.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public int create(Task task) {
        return 0;
    }

    @Override
    public List<Task> getAllTask(int userId) {
        return taskRepository.findById(userId);
    }
}
