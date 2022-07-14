package com.example.Projeto.Integrador.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Curso")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "10")
@Builder
public class Curso {

    @Id
    @Column(name = "id_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "quantidadeDeAluno")
    private int quantidadeDeAluno;

}
