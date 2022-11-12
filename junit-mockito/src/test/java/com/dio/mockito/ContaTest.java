package com.dio.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTest {

    @Spy
    private Conta conta = new Conta(1_000);

    @Test
    void validarOrdemDeChamada(){

        conta.pagaBoleto(300);

        InOrder inOrder = Mockito.inOrder(conta);//observar a ordem

        inOrder.verify(conta).pagaBoleto(300);
        //inOrder.verify(conta).pagaBoleto(ArgumentMatchers.anyInt()); //ira inserir qlq valor inteiro
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviaCreditoParaEmissor(300);
    }

    @Test
    void validarQuantidadeDeVezesQueMetodoFoiChamado(){
        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        //verifica quantas vezes o metodo validaSaldo foi chamado
        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());
    }

    @Test
    void retornaTrueParaQualquerValorNaValidacaoDeSaldo(){
        Mockito.doNothing().when(conta).validaSaldo(ArgumentMatchers.anyInt());
        conta.validaSaldo(3_500);
    }
}
