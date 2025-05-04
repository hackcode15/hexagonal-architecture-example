package com.app.example1hexagonal.application.usecases;

import com.app.example1hexagonal.domain.ports.in.DeleteTaskUseCase;
import com.app.example1hexagonal.domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImp implements DeleteTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }

}
