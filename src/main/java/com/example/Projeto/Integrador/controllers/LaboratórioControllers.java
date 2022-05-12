package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Laboratorio;
import com.example.Projeto.Integrador.service.LaboratorioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LaboratórioControllers {

    final LaboratorioServiceImpl laboratorioServiceImpl;


    public LaboratórioControllers(LaboratorioServiceImpl laboratorioServiceImpl) {
        this.laboratorioServiceImpl = laboratorioServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Object> salvarLaboratorio(@RequestBody Laboratorio laboratorio){
        Laboratorio response = laboratorioServiceImpl.salvar(laboratorio);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
