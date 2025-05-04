package com.app.example1hexagonal.application.usecases;

import com.app.example1hexagonal.domain.models.Task;
import com.app.example1hexagonal.domain.ports.in.RetriveTaskUseCase;
import com.app.example1hexagonal.domain.ports.out.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetriveTaskUseCaseImp implements RetriveTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public RetriveTaskUseCaseImp(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepositoryPort.findAll();
    }
}
