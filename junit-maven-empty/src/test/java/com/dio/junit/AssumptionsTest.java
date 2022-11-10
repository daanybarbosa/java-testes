package com.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

//Hipoteses/Suposicao/Pressuncao/Assumir uma determinada condicao
public class AssumptionsTest {

    @Test
    void validarAlgoSomenteNoUsuarioDaniele(){
        Assumptions.assumeTrue("danielebsilva".equals(System.getenv("USER"))); //Se o usuario do computador for Daniele ira executar esse teste
        //Assumptions.assumeTrue("root".equals(System.getenv("USER"))); //Se o usuario for root, ira executar essa ação

        Assumptions.assumeFalse("root".equals(System.getenv("USER"))); //Se o usuario não for root, ira executar essa ação

        Assertions.assertEquals(10, 5 + 5);
    }
}
