package com.example.Projeto.Integrador.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

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

    @Column(name = "dataInicio")
    private Date dataInicio;

    @Column(name = "dataFim")
    private Date dataFim;

    @Column(name = "horarioInicio")
    private String horarioInicio;

    @Column(name = "horarioFim")
    private String horarioFim;

    @Column(name = "numeroLaboratorio")
    private Integer numeroLaboratorio;

    @Transient
    private Instrutor instrutor;
    @Transient
    private Curso curso;
    @Transient
    private Laboratorio laboratorio;
}
