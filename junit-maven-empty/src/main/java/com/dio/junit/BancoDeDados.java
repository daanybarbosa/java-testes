package com.dio.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("Finalizou conexão");
    }

    public static void inserirDados(Pessoa pessoa){
        //Insere pessoa no DB
        LOGGER.info("Inseriu dados");
    }

    public static void removerDados(Pessoa pessoa){
        //Remove pessoa no DB
        LOGGER.info("Removeu dados");
    }
}
