package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.service.CursoServiceImpl;
import org.hibernate.annotations.GeneratorType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
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
    @DeleteMapping()
    public void deletarCurso(Long id) {
        cursoServiceImpl.deletar(id);
    }

    @GetMapping
    public List<Curso> findAllCurso(){
        return cursoServiceImpl.listar();
    }

    @PutMapping
    public void updateCurso(@RequestBody Curso curso){
        cursoServiceImpl.editar(curso);
    }

}
