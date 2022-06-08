package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.repositories.InstrutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrutorServiceImpl implements InstrutorService {

    final InstrutorRepository instrutorRepository;

    public InstrutorServiceImpl(InstrutorRepository instrutorRepository) {
        this.instrutorRepository = instrutorRepository;
    }

    @Override
    public Instrutor salvar(Instrutor instrutor) throws Exception {
        List<Instrutor> ListaDeInstrutor = instrutorRepository.findInstrutorByNome(instrutor.getNome());
        if(ListaDeInstrutor != null && ListaDeInstrutor.size() > 0){
            throw new Exception("O instrutor " + instrutor.getNome() + " já foi registrado");
        }

        return instrutorRepository.save(instrutor);
    }

    @Override
    public Instrutor editar(Instrutor instrutor) {
        return instrutorRepository.save(instrutor);
    }

    @Override
    public List<Instrutor> listar() {
        return instrutorRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        instrutorRepository.deleteById(id);
    }


}
