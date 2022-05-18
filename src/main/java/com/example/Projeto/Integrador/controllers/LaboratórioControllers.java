package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.models.Laboratorio;
import com.example.Projeto.Integrador.service.LaboratorioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "laboratorio")
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
    @DeleteMapping()
    public void deletarAgendamento(Long id) {
        laboratorioServiceImpl.deletar(id);
    }

    @GetMapping
    public List<Laboratorio> findAllLaboratorio(){
        return laboratorioServiceImpl.listar();
    }

    @PutMapping
    public void updateLaboratorio(@RequestBody Laboratorio laboratorio){
        laboratorioServiceImpl.editar(laboratorio);
    }
}
