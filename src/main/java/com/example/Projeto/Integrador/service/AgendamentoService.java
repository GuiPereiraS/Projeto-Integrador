package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Agendamento;
import com.example.Projeto.Integrador.models.Curso;

public interface AgendamentoService {

    Agendamento salvar(Agendamento agendamento);

    Agendamento editar(Agendamento agendamento);

    Agendamento listar();

}
