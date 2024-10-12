package com.pinheirostec.gestor_core.domain.produto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class Preco {

    private BigDecimal precoVendaVarejo;
    private BigDecimal precoVendaAtacado;
    private BigDecimal precoVendaCompra;
    private BigDecimal precoPromocional;
    private BigDecimal precoParcelado;
    private long idProduto;
}
