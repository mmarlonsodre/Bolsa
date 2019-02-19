package com.example.marlonsodre.bolsa;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

public class AcaoDAO{

    private ConexaoDB conexao;

    private final String TABELA = "acoes";
    private final String CAMPO_ID = "ID";
    private final String CAMPO_NOME = "nome";
    private final String CAMPO_DATA = "data";
    private final String CAMPO_VALOR = "valor";


    public AcaoDAO(Context context){
        this.conexao = ConexaoDB.getInstance(context);
    }

    public void incluir(Acao acao){
        ContentValues content = new ContentValues();
        content.put(CAMPO_NOME, acao.getNome());
        content.put(CAMPO_DATA, acao.getData());
        content.put(CAMPO_VALOR, acao.getValor());
        this.conexao.getDb().insert(TABELA, null, content);
    }

    public void alterar(Acao acao){

    }

    public void excluir(int id){
    }

    public Acao obter(int id){
        return null;
    }

    public List<Acao> listar(){
        return null;
    }
}
