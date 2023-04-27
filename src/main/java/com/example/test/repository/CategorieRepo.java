package com.example.test.repository;

import com.example.test.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepo extends JpaRepository<Categorie, String> {
}
