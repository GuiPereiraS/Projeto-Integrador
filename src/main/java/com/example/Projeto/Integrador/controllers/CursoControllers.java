package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.service.CursoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "curso")

public class CursoControllers {
    final CursoServiceImpl cursoServiceImpl;


    public CursoControllers(CursoServiceImpl cursoServiceImpl) {
        this.cursoServiceImpl = cursoServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Object> salvarCurso(@RequestBody Curso curso){
      Curso response = cursoServiceImpl.salvar(curso);
      return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
