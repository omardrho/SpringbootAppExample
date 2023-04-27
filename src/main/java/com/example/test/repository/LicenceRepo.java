package com.example.test.repository;

import com.example.test.model.Categorie;
import com.example.test.model.LicKey;
import com.example.test.model.Licence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenceRepo extends JpaRepository<Licence, LicKey> {
}
