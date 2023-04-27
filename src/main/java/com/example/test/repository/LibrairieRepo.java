package com.example.test.repository;

import com.example.test.model.Categorie;
import com.example.test.model.Librairie;
import com.example.test.model.LogiKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrairieRepo extends JpaRepository<Librairie, LogiKey> {
}
