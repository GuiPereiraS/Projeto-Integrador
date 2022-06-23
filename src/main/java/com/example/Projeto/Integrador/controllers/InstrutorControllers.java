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
@CrossOrigin
public class InstrutorControllers {

    final InstrutorServiceImpl instrutorService;

    public InstrutorControllers(InstrutorServiceImpl instrutorServiceImpl) {
        this.instrutorService = instrutorServiceImpl;
    }
    @PostMapping
    public ResponseEntity<Object> salvarInstrutor(@RequestBody Instrutor instrutor) throws Exception {
        Instrutor response = instrutorService.salvar(instrutor);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @DeleteMapping()
    public void deletarInstrutor(Long id) {
        instrutorService.delete(id);
    }

    @GetMapping
    public List<Instrutor> findAllInstrutor(){
        return instrutorService.listar();
    }

    @PutMapping
    public void updateInstrutor(@RequestBody Instrutor instrutor){
        instrutorService.editar(instrutor);
    }

}
