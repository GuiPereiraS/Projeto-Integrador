package com.example.Projeto.Integrador.repositories;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstrutorRepository extends JpaRepository<Instrutor, Long> {

    List<Instrutor> findInstrutorByNome(String nome);


}
