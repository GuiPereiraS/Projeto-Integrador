package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.service.InstrutorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
    @DeleteMapping()
    public void deletarInstrutor(Long id) {
        instrutorServiceImpl.delete(id);
    }

    @GetMapping
    public List<Instrutor> findAllInstrutor(){
        return instrutorServiceImpl.listar();
    }

    @PutMapping
    public void updateInstrutor(@RequestBody Instrutor instrutor){
        instrutorServiceImpl.editar(instrutor);
    }

}
