package com.pinheirostec.gestor_core.repository.entity;

import com.pinheirostec.gestor_core.domain.enumeration.Medida;
import com.pinheirostec.gestor_core.domain.produto.Grupo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, name = "name")
    private String nomeProduto;
    private String descricaoProduto;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "id_preco", referencedColumnName = "idPreco")
    private PrecoEntity preco;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "id_estoque", referencedColumnName = "idEstoque")
    private EstoqueEntity estoque;
    private boolean ativo = true;
    private String codBarras;
    private String codPersonalizado;
    @Enumerated(EnumType.STRING)
    private Medida unidadeMedida;
    private String marca;
   // private Grupo grupo;

}
