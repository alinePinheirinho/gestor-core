package com.pinheirostec.gestor_core.domain.produto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Grupo {

    private int id;
    private String nomeGrupo;
    private List<String> nameSubGrupo;
}
