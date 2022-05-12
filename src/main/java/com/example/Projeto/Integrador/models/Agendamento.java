package com.example.Projeto.Integrador.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Agendamento")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "10")
public class Agendamento {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "instrutor")
    private Instrutor instrutor;

    @Column(name = "dataInicio")
    private LocalDateTime dataInicio;

    @Column(name = "dataFim")
    private LocalDateTime dataFim;

    @Column(name = "horarioInicio")
    private String horarioInicio;

    @Column(name = "horarioFim")
    private String horarioFim;

    @Column(name = "numeroLaboratorio")
    private Integer numeroLaboratorio;


    private Curso curso;

    private Laboratorio laboratorio;
}
