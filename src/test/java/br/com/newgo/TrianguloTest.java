package br.com.newgo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TrianguloTest {
    Triangulo triangulo;

    @BeforeEach
    void init(){
        triangulo = new Triangulo();
    }

    @Test
    @DisplayName("When instance triangulo")
    void triangleTest(){
        assertNotNull(triangulo, "triangulo is null");
    }
}
