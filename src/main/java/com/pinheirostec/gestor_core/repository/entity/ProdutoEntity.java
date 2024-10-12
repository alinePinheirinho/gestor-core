package com.pinheirostec.gestor_core.repository.entity;

import com.pinheirostec.gestor_core.domain.enumeration.Medida;
import com.pinheirostec.gestor_core.domain.produto.Estoque;
import com.pinheirostec.gestor_core.domain.produto.Grupo;
import com.pinheirostec.gestor_core.domain.produto.Preco;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.annotation.Id;

@Entity
public class ProdutoEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduto;
    @Column(nullable = false, name = "name")
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
