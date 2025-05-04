package com.app.example1hexagonal.application.usecases;

import com.app.example1hexagonal.domain.models.Task;
import com.app.example1hexagonal.domain.ports.in.UpdateTaskUseCase;
import com.app.example1hexagonal.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImp implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }

}
