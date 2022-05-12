package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Agendamento;
import com.example.Projeto.Integrador.models.Instrutor;

public interface InstrutorService {


    Instrutor salvar(Instrutor instrutor);

    Instrutor editar(Instrutor instrutor);

    Instrutor listar();

}
