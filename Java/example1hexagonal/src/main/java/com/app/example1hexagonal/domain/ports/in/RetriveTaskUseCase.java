package com.app.example1hexagonal.domain.ports.in;

import com.app.example1hexagonal.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetriveTaskUseCase {
    Optional<Task> getTask(Long id);
    List<Task> getAllTask();
}
