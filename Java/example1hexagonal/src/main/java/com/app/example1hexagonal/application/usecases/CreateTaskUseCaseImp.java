package com.app.example1hexagonal.application.usecases;

import com.app.example1hexagonal.domain.models.Task;
import com.app.example1hexagonal.domain.ports.in.CreateTaskUseCase;
import com.app.example1hexagonal.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImp implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }

}
