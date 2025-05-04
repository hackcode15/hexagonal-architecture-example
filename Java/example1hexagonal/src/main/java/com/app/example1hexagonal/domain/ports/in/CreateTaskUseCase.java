package com.app.example1hexagonal.domain.ports.in;

import com.app.example1hexagonal.domain.models.Task;

public interface CreateTaskUseCase {

    Task createTask(Task task);

}
