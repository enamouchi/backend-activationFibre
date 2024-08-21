package com.namouchi.activationfibrebackend.service;

import com.namouchi.activationfibrebackend.model.Delegation;
import com.namouchi.activationfibrebackend.repository.DelegationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DelegationService {
    @Autowired
    private DelegationRepository delegationRepository;

    public List<Delegation> findAll() {
        return delegationRepository.findAll();
    }
}
