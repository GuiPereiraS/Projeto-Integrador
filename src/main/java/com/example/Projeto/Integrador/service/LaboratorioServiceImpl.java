package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Laboratorio;
import com.example.Projeto.Integrador.repositories.LaboratorioRepository;
import org.springframework.stereotype.Service;

@Service
public class LaboratorioServiceImpl implements LaboratorioService{

    final LaboratorioRepository laboratorioRepository;

    public LaboratorioServiceImpl(LaboratorioRepository laboratorioRepository) {
        this.laboratorioRepository = laboratorioRepository;
    }


    @Override
    public Laboratorio salvar(Laboratorio laboratorio) {
        return null;
    }

    @Override
    public Laboratorio editar(Laboratorio laboratorio) {
        return null;
    }

    @Override
    public Laboratorio listar() {
        return null;
    }

}
