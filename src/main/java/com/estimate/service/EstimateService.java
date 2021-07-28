package com.estimate.service;

import com.estimate.dto.entity.Estimate;

import java.util.Optional;

public interface EstimateService {
    Optional<Estimate> findEstimateById(Long Id);

    void save(Estimate estimate);
}
