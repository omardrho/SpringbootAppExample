package com.example.test.repository;

import com.example.test.model.Categorie;
import com.example.test.model.LogiKey;
import com.example.test.model.Logiciel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LogicielRepo extends JpaRepository<Logiciel, LogiKey> {
    @Transactional
    @Modifying
    @Query("delete from Logiciel p where p.key.nom = :nom")
    void deleteByName(@Param("nom") String nom);
}
