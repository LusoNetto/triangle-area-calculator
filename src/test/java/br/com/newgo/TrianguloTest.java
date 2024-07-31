package br.com.newgo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



public class TrianguloTest {
    Triangulo triangulo;

    @BeforeEach
    void init(){
        triangulo = new Triangulo(0, 0, 0, 0, 0);
    }

    @Test
    @DisplayName("When instance triangulo")
    void testInstance(){
        assertNotNull(triangulo, "triangulo is null");
    }

    @Nested
    @DisplayName("When calculate area using base and height")
    class BaseHeightTests {
        @Test
        @DisplayName("When calculate a area using base and height")
        void calculateBaseAndHeight(){            
            triangulo.setBase(5);
            triangulo.setAltura(10);
            assertEquals(25, triangulo.calcularAreaBaseAltura(), "Teste para o método de cálculo da área usando base e altura.");
        }
    }
    @Nested
    @DisplayName("When calculate area using heron")
    class HeronFormulaTests {

        @Test
        @DisplayName("When calculate a area using base and height")
        public void testCalculateAreaHeron() {
            triangulo.setLadoA(3);
            triangulo.setLadoB(4);
            triangulo.setLadoC(5);
            assertEquals(6, triangulo.calculateAreaHeron(),"Teste para o método de cálculo da área usando Heron.");
        }
    }
}
