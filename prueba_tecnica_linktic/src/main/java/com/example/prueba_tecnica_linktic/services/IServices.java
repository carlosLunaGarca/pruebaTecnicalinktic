package com.example.prueba_tecnica_linktic.services;

import com.example.prueba_tecnica_linktic.DTOS.request.PrimaDTO;
import com.example.prueba_tecnica_linktic.DTOS.response.CalculePrimaTotalDTO;

import java.util.List;

public interface IServices {
    List<CalculePrimaTotalDTO> calcularPrimaTotal(PrimaDTO primaDTO);
}
