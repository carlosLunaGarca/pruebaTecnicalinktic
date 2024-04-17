package com.example.prueba_tecnica_linktic.services;

import com.example.prueba_tecnica_linktic.DTOS.request.PrimaDTO;
import com.example.prueba_tecnica_linktic.DTOS.response.CalculePrimaTotalDTO;
import com.example.prueba_tecnica_linktic.repository.AmparosRepository;
import com.example.prueba_tecnica_linktic.repository.AseguradosRepository;
import com.example.prueba_tecnica_linktic.repository.PrimasRepository;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicesImpl implements  IServices{
    @Autowired
    AmparosRepository amparosRepository;
    @Autowired
    AseguradosRepository aseguradosRepository;
    @Autowired
    PrimasRepository primasRepository;
    @Override
    public List<CalculePrimaTotalDTO> calcularPrimaTotal(PrimaDTO primaDTO) {
        return null;
    }
}
