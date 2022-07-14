package com.example.Projeto.Integrador;
import com.example.Projeto.Integrador.modelos.InstrutorModelo;
import com.example.Projeto.Integrador.models.Instrutor;
import com.example.Projeto.Integrador.service.InstrutorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InstrutorTeste {

    @BeforeEach
    void reiniciarInstrutor() {
        InstrutorModelo.reset();
    }


    @Test
    public void buscarInstrutorPorId() throws Exception {
        // Arrange -> Entrada
        InstrutorServiceImpl instrutorService = new InstrutorServiceImpl();
        Instrutor instrutor = Instrutor.builder()
                .id(1l)
                .build();
    }

}
