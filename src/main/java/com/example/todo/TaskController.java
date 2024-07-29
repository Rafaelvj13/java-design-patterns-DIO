package com.example.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskManager taskManager = TaskManager.getInstance();

    @GetMapping
    public List<String> getTasks() {
        return taskManager.getTasks();
    }

    @PostMapping
    public void addTask(@RequestBody String task) {
        taskManager.addTask(task);
    }

    @DeleteMapping
    public void removeTask(@RequestBody String task) {
        taskManager.removeTask(task);
    }
}