package com.example.test.repository;

import com.example.test.model.CompKey;
import com.example.test.model.Composant;
import com.example.test.model.LogiKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComposantRepo extends JpaRepository<Composant, CompKey> {
}
