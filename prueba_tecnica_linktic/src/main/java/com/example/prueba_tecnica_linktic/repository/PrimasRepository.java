package com.example.prueba_tecnica_linktic.repository;

import com.example.prueba_tecnica_linktic.model.Primas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimasRepository extends JpaRepository<Primas,Integer> {
}
