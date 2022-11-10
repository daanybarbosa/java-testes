package com.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    //@Test - Anotação
    @Test
    void deveCalcularIdadeCorretamente(){ //o que deverá ser feito
        //cenarios para serem validados
        Pessoa daniele = new Pessoa("Daniele", LocalDateTime.of(1994, 10, 25, 9, 45, 0));
        Assertions.assertEquals(28, daniele.getIdade()); //executa as validações - valor esperado - igualdade
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        //cenarios para serem validados
        Pessoa daniele = new Pessoa("Daniele", LocalDateTime.of(1994, 10, 25, 9, 45, 0));
        Assertions.assertTrue(daniele.ehMaiorDeIdade()); //executa as validações - testa condições - true

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade()); //executa as validações - testa condições - false
    }

    @Test
    void validaIgualdade() {
        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDateTime.now());
        Assertions.assertSame(pessoa, pessoa);
    }
}
