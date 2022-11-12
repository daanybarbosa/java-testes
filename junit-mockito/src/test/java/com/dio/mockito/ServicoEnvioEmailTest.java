package com.dio.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Captor - Capturando Argumentos
 */

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks //injetar os Mocks, a plataforma é uma dependencia da classe ServicoEnvioEmail
    private ServicoEnvioEmail servico;

    @Captor //capturar argumentos de um método
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaAPlataforma(){

        String enderecoDeEmail = "usuario@test.com.br";
        String mensagem = "Olá mundo, teste mensagem";
        //boolean ehFormatoHtml = false; //TEXTO
        boolean ehFormatoHtml = true; //HTML

        servico.enviaEmail(enderecoDeEmail, mensagem, ehFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue(); //pegar a informação

        assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
        assertEquals(mensagem, emailCapturado.getMensagem());
        //assertEquals(Formato.TEXTO, emailCapturado.getFormato());
        assertEquals(Formato.HTML, emailCapturado.getFormato());
    }
}
