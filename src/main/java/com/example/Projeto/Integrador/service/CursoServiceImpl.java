package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.repositories.CursoRepository;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl implements CursoService{
    final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public Curso salvar(Curso curso) {
        return null;
    }

    @Override
    public Curso editar(Curso curso) {
        return null;
    }

    @Override
    public Curso listar() {
        return null;
    }

}
