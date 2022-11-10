package com.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("4564485", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        //ira simular o lançamento de uma exceção
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }

    @Test
    void validarCenarioDeExcecaoNaTransferencia2(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("4564485", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        //Não espera que a excecao seja feita
        //Assertions.assertDoesNotThrow( () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
        Assertions.assertDoesNotThrow( () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }

}
