package com.example.Projeto.Integrador.controllers;

import com.example.Projeto.Integrador.models.Agendamento;
import com.example.Projeto.Integrador.service.AgendamentoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "agendamento")

public class AgendamentoControllers {
    final AgendamentoServiceImpl agendamentoServiceImpl;

    public AgendamentoControllers(AgendamentoServiceImpl agendamentoServiceImpl) {
        this.agendamentoServiceImpl = agendamentoServiceImpl;
    }
    @PostMapping
    public ResponseEntity<Object> salvarAgendamento(@RequestBody Agendamento agendamento){
        Agendamento response = agendamentoServiceImpl.salvar(agendamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
