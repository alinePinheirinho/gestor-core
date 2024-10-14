package com.pinheirostec.gestor_core.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class PrecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPreco;
    private BigDecimal precoVendaVarejo;
    private BigDecimal precoVendaAtacado;
    private BigDecimal precoVendaCompra;
    private BigDecimal precoPromocional;
    private BigDecimal precoParcelado;
    private long idProduto;
}
