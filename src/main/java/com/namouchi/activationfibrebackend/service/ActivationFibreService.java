package com.namouchi.activationfibrebackend.service;

import com.namouchi.activationfibrebackend.model.ActivationFibre; import com.namouchi.activationfibrebackend.repository.ActivationFibreRepository; import org.springframework.beans.factory.annotation.Autowired; import org.springframework.stereotype.Service;

@Service public class ActivationFibreService {

    @Autowired
    private ActivationFibreRepository activationFibreRepository;

    public ActivationFibre saveStep1(ActivationFibre activationFibre) {
        // Log the object being saved
        System.out.println("Attempting to save ActivationFibre: " + activationFibre);
        ActivationFibre savedEntity = activationFibreRepository.save(activationFibre);
        System.out.println("Saved ActivationFibre: " + savedEntity);
        return savedEntity;
    }

    public ActivationFibre saveStep2(Long id, String signatureClient, String signatureAgent) {
        // Find the ActivationFibre entity by id
        ActivationFibre activationFibre = activationFibreRepository.findById(id).orElse(null);

        if (activationFibre != null) {
            // Update the signatureClient and signatureAgent
            activationFibre.setSignatureClient(signatureClient);
            activationFibre.setSignatureAgent(signatureAgent);

            // Save the updated entity
            System.out.println("Attempting to update ActivationFibre: " + activationFibre);
            ActivationFibre updatedEntity = activationFibreRepository.save(activationFibre);
            System.out.println("Updated ActivationFibre: " + updatedEntity);

            return updatedEntity;
        } else {
            System.out.println("ActivationFibre with id " + id + " not found");
            return null; // Or handle the case where the entity is not found
        }
    }
}
