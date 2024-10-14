package com.pinheirostec.gestor_core.domain.produto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Estoque {

    private double quantidade;
    private double quantidadeMinima;
    private double quantidadeMaxima;
}
