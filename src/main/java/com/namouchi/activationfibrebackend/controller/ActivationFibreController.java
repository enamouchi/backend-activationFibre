package com.namouchi.activationfibrebackend.controller;

import com.namouchi.activationfibrebackend.model.ActivationFibre;
import com.namouchi.activationfibrebackend.service.ActivationFibreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activationfibre")
public class ActivationFibreController {

    @Autowired
    private ActivationFibreService activationFibreService;

    @PostMapping
    public ActivationFibre create(@RequestBody ActivationFibre activationFibre) {
        return activationFibreService.save(activationFibre);
    }

    @GetMapping("/{id}")
    public ActivationFibre getById(@PathVariable Long id) {
        return activationFibreService.findById(id);
    }

    @GetMapping
    public List<ActivationFibre> getAll() {
        return activationFibreService.findAll();
    }

    @PutMapping("/{id}")
    public ActivationFibre update(@PathVariable Long id, @RequestBody ActivationFibre activationFibre) {
        activationFibre.setId(id);
        return activationFibreService.save(activationFibre);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        activationFibreService.deleteById(id);
    }
}
