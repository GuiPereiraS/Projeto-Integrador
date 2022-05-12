package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Agendamento;
import com.example.Projeto.Integrador.repositories.AgendamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoServiceImpl implements AgendamentoService{

    final AgendamentoRepository agendamentoRepository;

       public AgendamentoServiceImpl(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    @Override
    public Agendamento salvar(Agendamento agendamento) {
        return null;
    }

    @Override
    public Agendamento editar(Agendamento agendamento) {
        return null;
    }

    @Override
    public Agendamento listar() {
        return null;
    }



}
