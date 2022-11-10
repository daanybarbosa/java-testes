package com.dio.junit;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

//importação estatica
import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTest {

    @Test
    void validarLancamentos() {

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

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); //Verificar se os valores do array são iguais
        assertArrayEquals(primeiroLancamento, segundoLancamento); //Verificar se os valores do array são iguais

        //Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);

        //assertEquals(5, 3 + 3);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        //Assertions.assertNull(pessoa); //verifica se está nulo
        assertNull(pessoa); //verifica se está nulo

        pessoa = new Pessoa("Luciano", LocalDateTime.now());

        //fail("Error no teste"); //ira simular um erro

        //Assertions.assertNotNull(pessoa); //verifica se não está nulo
        assertNotNull(pessoa); //verifica se não está nulo
    }

    @Test
    void validarNumerosDeTiposDiferentes() {

        double valor = 5.0;
        double outroValor = 5.0;

        //Assertions.assertEquals(valor, outroValor); //verifica se os dois valores sao iguais.
        assertEquals(valor, outroValor); //verifica se os dois valores sao iguais.
    }

    @Test
    void validarValoresDeOperacoes() {

        /* Validando soma */
        int resultado = 10;
        assertEquals(resultado, (5 + 5));

        /* Validando igualdade de valores */
        double valor = 5.0;
        double outroValor = 5.0;
        assertEquals(valor, outroValor);
    }

    @Test
    void validarSeArraysSaoIguais() {

        /* Valida se os arrays são iguais, comparando um a um */
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        assertArrayEquals(primeiroLancamento, segundoLancamento);

        /* Utilizando arrays de diferentes tipos, começando por boolean[] */
        boolean[] flags = {true, false, false};
        assertArrayEquals(new boolean[]{true, false, false}, flags);

        /* Utilizando arrays de diferentes tipos, começando por double[] */
        double[] valores = {5.0, 10.5, 50D, 46d};
        assertArrayEquals(new double[]{5.0, 10.5, 50D, 46d}, valores);
    }

    @Test
    void validarSeObjetoEstaNuloOuNao() {

        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes2() {

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }

    @Test
    void validarQueValoresSaoDiferentes(){

        int x = 5;
        int y = 6;

        assertNotEquals(5, 6);
    }

    @Test
    void validarQueAlgumaCondicaoEhFalsa() {

        boolean condicao = 5 + 6 == 12;

        assertFalse(condicao);
    }

    @Test
    void validarQueAlgumaCondicaoEhVerdadeira() {

        var condicao = 6 + 6 == 12;

        assertTrue(condicao);
    }
}
