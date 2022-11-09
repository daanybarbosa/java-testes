package com.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Daniele", LocalDate.of(1994, 10, 25));
        Assertions.assertEquals(28, pessoa.getIdade());
    }
}
