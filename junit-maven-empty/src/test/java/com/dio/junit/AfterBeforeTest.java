package com.dio.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class AfterBeforeTest {

    //Execução unica no inicio do teste/ciclo do teste
    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
        //System.out.println("Rodou configuraConexao");
    }

    //Executa antes de cada @Test
    @BeforeEach
    void inserirDadosParaTest(){
        BancoDeDados.inserirDados(new Pessoa("Daniele", LocalDateTime.of(1994, 10, 25, 9, 45, 0)));
    }

    //Executa depois de cada @Test
    @AfterEach
    void removerDadosTest(){
        BancoDeDados.removerDados(new Pessoa("Daniele", LocalDateTime.of(1994, 10, 25, 9, 45, 0)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    //Execução unica no final do teste/ciclo do teste
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        //System.out.println("Rodou finalizarConexao");
    }
}
