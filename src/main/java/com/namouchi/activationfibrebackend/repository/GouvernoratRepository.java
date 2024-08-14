package com.namouchi.activationfibrebackend.repository;

import com.namouchi.activationfibrebackend.model.Gouvernorat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GouvernoratRepository extends JpaRepository<Gouvernorat,Long> {
}
