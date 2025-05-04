package com.app.example1hexagonal.infrastructure.controllers;

import com.app.example1hexagonal.application.services.TaskService;
import com.app.example1hexagonal.domain.models.AdditionalTaskInfo;
import com.app.example1hexagonal.domain.models.Task;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/new")
    @ResponseBody
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    @GetMapping("/{taskId}")
    @ResponseBody
    public ResponseEntity<Task> getTaskId(@PathVariable("taskId") Long taskId) {
        return taskService.getTask(taskId)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTask();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PutMapping("/update/{taskId}")
    @ResponseBody
    public ResponseEntity<Task> updateTask(@PathVariable("taskId") Long taskId, @RequestBody Task updateTask) {
        return taskService.updateTask(taskId, updateTask)
                .map(task -> new ResponseEntity<>(task, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{taskId}")
    public ResponseEntity<String> deleteTaskById(@PathVariable("taskId") Long taskId) {
        if (taskService.deleteTask(taskId)) {
            return new ResponseEntity<>("Borrado con exito", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Error al borrar", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/externo/{taskId}/additionalInfo")
    @ResponseBody
    public ResponseEntity<AdditionalTaskInfo> getAdditionalTaskInfo(@PathVariable("taskId") Long taskId) {
        AdditionalTaskInfo additionalTaskInfo = taskService.getAdditionalTaskInfo(taskId);
        return new ResponseEntity<>(additionalTaskInfo, HttpStatus.OK);
    }

}
