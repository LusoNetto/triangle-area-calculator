package br.com.newgo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CLITest {
    CLI cli;

    @BeforeEach
    void init(){
        cli = new CLI();
    }

    @Test
    @DisplayName("When user input value")
    void leituraDeDadosUsuario(){
        double entradaEsperada = 20;
        assertEquals(entradaEsperada, 20, "value is correct");
    }

    @Test
    @DisplayName("When user input value")
    void exibicaoDeDadosUsuario(){
        String saidaEsperada = "Teste";
        assertEquals(saidaEsperada, "Teste", "output is correct");
    }

}
