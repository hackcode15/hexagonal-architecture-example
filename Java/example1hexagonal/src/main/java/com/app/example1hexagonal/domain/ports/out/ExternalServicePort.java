package com.app.example1hexagonal.domain.ports.out;

import com.app.example1hexagonal.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
