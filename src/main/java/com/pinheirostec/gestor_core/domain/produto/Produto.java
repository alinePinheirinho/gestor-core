package com.pinheirostec.gestor_core.domain.produto;

import com.pinheirostec.gestor_core.domain.enumeration.Medida;

public class Produto {

    private long idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private Preco precos;
    private Estoque estoques;
    private boolean ativo = true;
    private String codBarras;
    private String codPersonalizado;
    private Medida unidadeMedida;
    private String marca;
    private Grupo grupo;

}
