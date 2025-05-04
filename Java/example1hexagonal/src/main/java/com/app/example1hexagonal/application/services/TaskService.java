package com.app.example1hexagonal.application.services;

import com.app.example1hexagonal.domain.models.AdditionalTaskInfo;
import com.app.example1hexagonal.domain.models.Task;
import com.app.example1hexagonal.domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class TaskService implements
        CreateTaskUseCase,
        DeleteTaskUseCase,
        RetriveTaskUseCase,
        UpdateTaskUseCase,
        GetAdditionalTaskInfoUseCase
{

    private final CreateTaskUseCase createTaskUseCase;
    private final RetriveTaskUseCase retriveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    public TaskService(CreateTaskUseCase createTaskUseCase, RetriveTaskUseCase retriveTaskUseCase, UpdateTaskUseCase updateTaskUseCase, DeleteTaskUseCase deleteTaskUseCase, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.retriveTaskUseCase = retriveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
    }

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(id);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retriveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAllTask() {
        return retriveTaskUseCase.getAllTask();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return updateTaskUseCase.updateTask(id, updateTask);
    }

}
