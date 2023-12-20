package com.example.todolist.web.task;

import com.example.todolist.domain.task.entity.Task;
import com.example.todolist.domain.task.service.TaskService;
import com.example.todolist.domain.task.service.TaskServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Slf4j
@RequiredArgsConstructor
@Controller
public class TaskController {

    private final TaskService taskServiceImpl;

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @PostMapping("/task/put")
    public String put(@RequestBody Task task){
        Task savedTask = taskServiceImpl.save(task);
        log.info("saved {}", savedTask);
        return "/";
    }

    @PostMapping("/task/update")
    public String update(@RequestBody Task task){
        return "";
    }

    @PostMapping("/task/delete")
    public String delete(){
        return "";
    }


}
