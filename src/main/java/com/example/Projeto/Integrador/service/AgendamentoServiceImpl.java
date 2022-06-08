package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Agendamento;
import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.repositories.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AgendamentoServiceImpl implements AgendamentoService{

    final AgendamentoRepository agendamentoRepository;

       public AgendamentoServiceImpl(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    @Override
    public Agendamento salvar(Agendamento agendamento) throws Exception {

        List<Agendamento> Data = agendamentoRepository.findAgendamentoByDataInicio(agendamento.getDataInicio());
        if(Data != null && Data.size() > 0){
            throw new Exception("O agendamento " + agendamento.getDataInicio() + " já foi resgistrado");
        }
        List<Agendamento> HorarioInicio = agendamentoRepository.findAgendamentoByHorarioInicio(agendamento.getHorarioInicio());
        if(HorarioInicio != null && HorarioInicio.size() > 0){
            throw new Exception("O agendamento " + agendamento.getHorarioInicio() + " já foi resgistrado");

        }

        return agendamentoRepository.save(agendamento);
    }

    @Override
    public Agendamento editar(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public List<Agendamento> listar() {
        return agendamentoRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
           agendamentoRepository.deleteById(id);
    }


}
