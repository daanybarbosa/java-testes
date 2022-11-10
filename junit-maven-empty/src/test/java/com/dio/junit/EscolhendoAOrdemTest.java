package com.dio.junit;

import org.junit.jupiter.api.*;

//ira nomear os testes e irá considerar essa ordem
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTest {

    @DisplayName("A")
    //@DisplayName("Teste que valida se o usuario foi criado")
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}

/*
//irá testar os testes aleatoriamente
@TestMethodOrder(MethodOrderer.Random.class)
public class EscolhendoAOrdemTest {

    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}
*/

/*
//irá validar o nome do metodo e respeitará a ordem alfabetica
@TestMethodOrder(MethodOrderer.MethodName.class)
public class EscolhendoAOrdemTest {

    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}
*/

/*
//definir a ordem que os testes serão executados
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTest {

    @Order(4)
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}
*/
