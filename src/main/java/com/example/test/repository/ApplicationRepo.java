package com.example.test.repository;

import com.example.test.model.Application;
import com.example.test.model.Categorie;
import com.example.test.model.LogiKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepo extends JpaRepository<Application, LogiKey> {
}
