package com.dio.junit;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

//importação estatica
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsTest {

    @Test
    void validarLancamentos(){

        // ---------------------------------------------------------------------------------------------------------

        // ------- 1 falha - arrays com tamanhos diferentes -------
        // ------- AssertionFailedError: array lengths differ, expected: <5> but was: <7> -------

        /*
        int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
        int[] segundoLancamento = { -1, 5, 2, 3, 10, 16, 17 }; */

        // ---------------------------------------------------------------------------------------------------------

        // ------- 2 falha - conteudo do indice 0, está diferente do que o valor esperado -------
        // ------- AssertionFailedError: array contents differ at index [0], expected: <10> but was: <-1> -------
        /*
        int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
        int[] segundoLancamento = { -1, 5, 2, 3, 10}; */

        // ---------------------------------------------------------------------------------------------------------

        int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
        int[] segundoLancamento = { 10, 20, 30, 40, 50 };

        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); //Verificar se os valores do array são iguais
        assertArrayEquals(primeiroLancamento, segundoLancamento); //Verificar se os valores do array são iguais

        //Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        //Assertions.assertNull(pessoa); //verifica se está nulo
        assertNull(pessoa); //verifica se está nulo

        pessoa = new Pessoa("Luciano", LocalDateTime.now());

        //Assertions.assertNotNull(pessoa); //verifica se não está nulo
        assertNotNull(pessoa); //verifica se não está nulo
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        //Assertions.assertEquals(valor, outroValor); //verifica se os dois valores sao iguais.
        assertEquals(valor, outroValor); //verifica se os dois valores sao iguais.
    }
}
