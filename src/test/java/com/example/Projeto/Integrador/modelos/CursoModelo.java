package com.example.Projeto.Integrador.modelos;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CursoModelo {

    public static Curso construirCenario () {
        Curso curso = null;

        curso = curso.builder()
                .id(1l)
                .nome("Programação")
                .quantidadeDeAluno(15)
                .build();

        return curso;
    }


}


