package com.app.example1hexagonal.infrastructure.config;

import com.app.example1hexagonal.application.services.TaskService;
import com.app.example1hexagonal.application.usecases.*;
import com.app.example1hexagonal.domain.ports.in.*;
import com.app.example1hexagonal.domain.ports.out.ExternalServicePort;
import com.app.example1hexagonal.domain.ports.out.TaskRepositoryPort;
import com.app.example1hexagonal.infrastructure.adapters.ExternalServiceAdapter;
import com.app.example1hexagonal.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImp(taskRepositoryPort),
                new RetriveTaskUseCaseImp(taskRepositoryPort),
                new UpdateTaskUseCaseImp(taskRepositoryPort),
                new DeleteTaskUseCaseImp(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImp(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }

}
