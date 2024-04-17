package com.example.prueba_tecnica_linktic.controller;

import com.example.prueba_tecnica_linktic.DTOS.request.PrimaDTO;
import com.example.prueba_tecnica_linktic.DTOS.response.CalculePrimaTotalDTO;
import com.example.prueba_tecnica_linktic.services.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("primas/")
public class PrimasController {
@Autowired
    IServices iServices;
@PostMapping
    ResponseEntity<?> calculatePrima(@RequestBody PrimaDTO calculePrimaTotalDTO){
    return new ResponseEntity<>(iServices.calcularPrimaTotal(calculePrimaTotalDTO), HttpStatus.OK);
}
}
