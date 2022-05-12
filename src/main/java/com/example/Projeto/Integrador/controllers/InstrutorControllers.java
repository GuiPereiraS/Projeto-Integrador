package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.service.InstrutorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "instrutor")
public class InstrutorControllers {

    final InstrutorServiceImpl instrutorServiceImpl;


    public InstrutorControllers(InstrutorServiceImpl instrutorServiceImpl) {
        this.instrutorServiceImpl = instrutorServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Object> salvarInstrutor(@RequestBody Instrutor instrutor){
        Instrutor response = instrutorServiceImpl.salvar(instrutor);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
