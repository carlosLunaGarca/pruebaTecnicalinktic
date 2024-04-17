package com.example.prueba_tecnica_linktic.repository;

import com.example.prueba_tecnica_linktic.model.Amparos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmparosRepository extends JpaRepository<Amparos,Integer> {
}
