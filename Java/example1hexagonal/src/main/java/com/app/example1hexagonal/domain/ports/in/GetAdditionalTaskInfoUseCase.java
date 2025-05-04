package com.app.example1hexagonal.domain.ports.in;

import com.app.example1hexagonal.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
