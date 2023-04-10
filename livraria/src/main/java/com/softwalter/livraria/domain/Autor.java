package com.softwalter.livraria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Autor {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String descricao;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, updatable = false)
    private LocalDateTime criadoEm = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    /**
     * @deprecated para uso de frameworks
     */
    @Deprecated(since="4.2", forRemoval=true)
    public Autor(){}

    public Autor(String nome, String descricao, String email) {
        this.nome = nome;
        this.descricao = descricao;
        this.email = email;

    }
}
