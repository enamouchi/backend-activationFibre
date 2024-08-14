package com.namouchi.activationfibrebackend.service;

import com.namouchi.activationfibrebackend.model.ActivationFibre;
import com.namouchi.activationfibrebackend.repository.ActivationFibreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivationFibreService {

    @Autowired
    private ActivationFibreRepository activationFibreRepository;

    public ActivationFibre save(ActivationFibre activationFibre) {
        return activationFibreRepository.save(activationFibre);
    }

    public ActivationFibre findById(Long id) {
        return activationFibreRepository.findById(id).orElse(null);
    }

    public List<ActivationFibre> findAll() {
        return activationFibreRepository.findAll();
    }

    public void deleteById(Long id) {
        activationFibreRepository.deleteById(id);
    }
}
