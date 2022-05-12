package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Agendamento;
import com.example.Projeto.Integrador.models.Laboratorio;

public interface LaboratorioService {


    Laboratorio salvar(Laboratorio laboratorio);

    Laboratorio editar(Laboratorio laboratorio);

    Laboratorio listar();

}
