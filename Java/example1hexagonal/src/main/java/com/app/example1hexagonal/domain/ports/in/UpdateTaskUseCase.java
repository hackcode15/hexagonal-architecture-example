package com.app.example1hexagonal.domain.ports.in;

import com.app.example1hexagonal.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
