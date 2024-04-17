package com.example.prueba_tecnica_linktic.repository;

import com.example.prueba_tecnica_linktic.model.Asegurados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AseguradosRepository extends JpaRepository<Asegurados,Integer> {
}
