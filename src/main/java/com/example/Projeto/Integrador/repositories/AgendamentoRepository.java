package com.example.Projeto.Integrador.repositories;

import com.example.Projeto.Integrador.models.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
