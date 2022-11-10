package com.dio.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Com Mockito
@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks //injetar o Mock
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "São Paulo", "Rua 1", "Apto", "Centro");

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("01234568")).thenReturn(dadosLocalizacao);

        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa( "Daniele", "123456789", LocalDate.now(), "01234568");

        assertEquals("Daniele", pessoa.getNome());
        assertEquals("123456789", pessoa.getDocumento());
        assertEquals(LocalDate.now(), pessoa.getNascimento());
        assertEquals("SP", pessoa.getEndereco().getUf());
        assertEquals("Apto", pessoa.getEndereco().getComplemento());
    }
}



/* ------------ Sem Mockito ------------
public class CadastrarPessoaTest {

    @BeforeAll
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    private ApiDosCorreios apiDosCorreios = Mockito.mock(ApiDosCorreios.class);
}
 */