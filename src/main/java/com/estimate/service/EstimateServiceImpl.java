package com.estimate.service;

import com.estimate.dto.entity.Estimate;
import com.estimate.repository.EstimateRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Transactional
@Service
public class EstimateServiceImpl implements EstimateService{
    EstimateRepository estimateRepository;

    @Override
    public Optional<Estimate> findEstimateById(Long Id) {
        return estimateRepository.findById(Id);
    }

    @Override
    public void save(Estimate estimate) {
        estimateRepository.save(estimate);
    }
}
