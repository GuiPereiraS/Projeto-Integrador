package com.example.Projeto.Integrador.modelos;

import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.models.Laboratorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LaboratorioModelo {
    public static Laboratorio construirCenario () {
        Laboratorio laboratorio = null;

        laboratorio = laboratorio.builder()
                .id(2l)
                .nome("Laboratório de Informática")
                .quantidade(2)
                .status(true)
                .build();

        return laboratorio;
    }


}


