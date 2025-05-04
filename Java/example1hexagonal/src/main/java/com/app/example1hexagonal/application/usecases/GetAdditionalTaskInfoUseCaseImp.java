package com.app.example1hexagonal.application.usecases;

import com.app.example1hexagonal.domain.models.AdditionalTaskInfo;
import com.app.example1hexagonal.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.app.example1hexagonal.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImp implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImp(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }

}
