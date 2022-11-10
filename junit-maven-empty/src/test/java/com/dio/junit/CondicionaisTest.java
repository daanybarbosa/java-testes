package com.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "danielebsilva") //habilita esse teste
    void validarAlgoSomenteNoUsuarioDaniele(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root") //desabilita esse teste
    void validarAlgoSomenteNoUsuarioRoot(){
        Assertions.assertEquals(10, 5 + 5);
    }

    //Executa o teste no Sistema Operacional - LINUX
    @Test
    @EnabledOnOs(OS.LINUX)
    void validarAlgoSomenteNoSistemaLinux(){
        Assertions.assertEquals(10, 5 + 5);
    }

    //Executa o teste no Sistema Operacional - MAC
    @Test
    @EnabledOnOs(OS.MAC)
    void validarAlgoSomenteNoSistemaMac(){
        Assertions.assertEquals(10, 5 + 5);
    }

    //Executa o teste no Sistema Operacional - MAC ou Linux
    @Test
    @EnabledOnOs({OS.MAC, OS.LINUX})
    void validarAlgoSomenteNoSistemaMacOuLinux(){
        Assertions.assertEquals(10, 5 + 5);
    }

    //Executa o teste com uma determinada versão do Java
    @Test
    @EnabledOnJre(JRE.JAVA_18)
    void validarAlgoSomenteComJava18(){
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void validarAlgoSomenteComJava8(){
        Assertions.assertEquals(10, 5 + 5);
    }

    //Executa o teste considerando o minimo e o maximo da versão do Java
    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_18)
    void validarAlgoComJava11AoJava18(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
