package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Instrutor;

import java.util.List;

public interface InstrutorService {


    Instrutor salvar(Instrutor instrutor);

    Instrutor editar(Instrutor instrutor);

    List<Instrutor> listar();

    void delete (Long id);

}
