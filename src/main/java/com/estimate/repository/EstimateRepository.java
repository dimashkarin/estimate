package com.estimate.repository;

import com.estimate.dto.entity.Estimate;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EstimateRepository extends CrudRepository<Estimate, Long> {

    Optional<Estimate> findById(Long id);
}
