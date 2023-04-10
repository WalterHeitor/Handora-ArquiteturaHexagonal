package com.zupedu.bancodigital.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proposta")
public class Proposta {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String documento;

    private String email;

    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Proposta(String nome, String documento, String email, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.endereco = endereco;
    }
}
