package com.example.Projeto.Integrador.modelos;

import com.example.Projeto.Integrador.models.Agendamento;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.models.Laboratorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

public class AgendamentoModelo {
    public static Agendamento construirCenario () {
        Agendamento agendamento = null;

        agendamento = agendamento.builder()
                .id(1l)
                .dataInicio(LocalDate.ofEpochDay(07-14-2022))
                .dataFim(LocalDate.ofEpochDay(07-14-2022))
                .horarioInicio("13:30:00")
                .horarioFim("17:30:00")
                .numeroLaboratorio(1)
                .instrutor(new Instrutor(1l, "Guilherme", "guilherme@gmail.com", "123456"))
                .curso(new Curso(12l, "Programação", 15))
                .laboratorio(new Laboratorio(1l, "Laboratório de Informática", 2, true))
                .build();

        return agendamento;
    }


}


