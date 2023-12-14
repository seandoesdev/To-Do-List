package com.example.todolist.web.task;

import com.example.todolist.domain.task.entity.Task;
import com.example.todolist.domain.task.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/")
    public String index(Model model){
        List<Task> result = taskService.getAllTask(0);
        for (Task task:
             result) {
            System.out.println(task.getTaskId());
        }
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
