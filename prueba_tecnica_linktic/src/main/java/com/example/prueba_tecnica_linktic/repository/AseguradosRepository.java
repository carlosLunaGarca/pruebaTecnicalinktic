package com.example.prueba_tecnica_linktic.repository;

import com.example.prueba_tecnica_linktic.model.Asegurados;
import com.example.prueba_tecnica_linktic.model.enumerate.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AseguradosRepository extends JpaRepository<Asegurados,Integer> {
    List<Asegurados> findByNumeroIdenticficacionAndTipoIdentificacion(String numeroIdentificacio, TipoIdentificacion tipoIdentificacion);
}
