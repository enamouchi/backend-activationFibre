package com.namouchi.activationfibrebackend.service;

import com.namouchi.activationfibrebackend.model.ActivationFibre; import com.namouchi.activationfibrebackend.repository.ActivationFibreRepository; import org.springframework.beans.factory.annotation.Autowired; import org.springframework.stereotype.Service;

@Service public class ActivationFibreService {

    @Autowired
    private ActivationFibreRepository activationFibreRepository;

    public ActivationFibre saveStep1(ActivationFibre activationFibre) {
        System.out.println("Attempting to save ActivationFibre: " + activationFibre);
        ActivationFibre savedEntity = activationFibreRepository.save(activationFibre);
        System.out.println("Saved ActivationFibre: " + savedEntity);
        return savedEntity;
    }

    public ActivationFibre saveStep2(Long id, String signatureClient, String signatureAgent) {
        ActivationFibre activationFibre = activationFibreRepository.findById(id).orElse(null);

        if (activationFibre != null) {
            activationFibre.setSignatureClient(signatureClient);
            activationFibre.setSignatureAgent(signatureAgent);

            ActivationFibre updatedEntity = activationFibreRepository.save(activationFibre);
            return updatedEntity;
        } else {
            return null;
        }
    }
}
