package com.pinheirostec.gestor_core.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EstoqueEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEstoque;
    private double quantidade;
    private double quantidadeMinima;
    private double quantidadeMaxima;
}
