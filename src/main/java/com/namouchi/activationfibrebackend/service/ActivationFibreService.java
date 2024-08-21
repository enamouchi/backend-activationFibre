package com.namouchi.activationfibrebackend.service;

import com.namouchi.activationfibrebackend.model.ActivationFibre;
import com.namouchi.activationfibrebackend.repository.ActivationFibreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivationFibreService {

    @Autowired
    private ActivationFibreRepository activationFibreRepository;

    public ActivationFibre save(ActivationFibre request) {
        return activationFibreRepository.save(request);
    }
}
