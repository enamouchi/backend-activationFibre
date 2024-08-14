package com.namouchi.activationfibrebackend.repository;

import com.namouchi.activationfibrebackend.model.ActivationFibre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivationFibreRepository extends JpaRepository<ActivationFibre, Long> {
}
