package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.repositories.InstrutorRepository;
import org.springframework.stereotype.Service;

@Service
public class InstrutorServiceImpl implements InstrutorService {

    final InstrutorRepository instrutorRepository;

    public InstrutorServiceImpl(InstrutorRepository instrutorRepository) {
        this.instrutorRepository = instrutorRepository;
    }

    @Override
    public Instrutor salvar(Instrutor instrutor) {
        return null;
    }

    @Override
    public Instrutor editar(Instrutor instrutor) {
        return null;
    }

    @Override
    public Instrutor listar() {
        return null;
    }

}
