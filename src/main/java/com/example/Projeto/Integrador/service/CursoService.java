package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Curso;

public interface CursoService {
    Curso salvar(Curso curso);

    Curso editar(Curso curso);

    Curso listar();


}
