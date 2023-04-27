package com.example.test.controller;

import com.example.test.model.Application;
import com.example.test.model.Logiciel;
import com.example.test.repository.ApplicationRepo;
import com.example.test.repository.LogicielRepo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class LogicielController {
    @Autowired
    LogicielRepo logicielRepo;
    @Autowired
    ApplicationRepo applicationRepo;

    @GetMapping("/all")
    @PreAuthorize("hasRole('ROLE_USER')")

    ResponseEntity<List<Logiciel>> getLogiciels(){
        List<Logiciel> lg = logicielRepo.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(lg);
    }

    @GetMapping("/allApps")

    private List<Application> getAllApps(){
        return applicationRepo.findAll();
    }
    @DeleteMapping("/delete/{nom}")

    private void deleteLogicielByNom(@PathVariable String nom){
        logicielRepo.deleteByName(nom);
    }

}
