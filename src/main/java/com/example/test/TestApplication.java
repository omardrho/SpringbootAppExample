package com.example.test;

import com.example.test.model.*;
import com.example.test.repository.ApplicationRepo;
import com.example.test.repository.CategorieRepo;
import com.example.test.repository.LibrairieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestApplication {
    @Autowired
    ApplicationRepo applicationRepo;
    @Autowired
    LibrairieRepo librairieRepo;
    @Autowired
    CategorieRepo categorieRepo;




    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        System.out.println("hello");
    }
    @Bean
    CommandLineRunner start(){
        return args -> {
            LogiKey logiKey= new LogiKey();
            LogiKey logiKey1= new LogiKey();
            logiKey.setNom("key1");
            logiKey.setVersion(Version.MAJEURE);
            Logiciel log1 = new Logiciel();
            Application application = new Application();
            application.setKey(logiKey);

            Categorie categorie = new Categorie();
            Categorie categorie1 = new Categorie();
            categorie.setNom("cat1");
            categorie1.setNom("cat2");
            categorieRepo.save(categorie);
            categorieRepo.save(categorie1);
            application.setCategorie(categorie);
            application.setCategorie(categorie1);
            applicationRepo.save(application);








        };
    }

}
