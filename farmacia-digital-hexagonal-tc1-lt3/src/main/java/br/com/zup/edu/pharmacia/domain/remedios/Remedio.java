package br.com.zup.edu.pharmacia.domain.remedios;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;
@Entity
public class Remedio {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    private String nome;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farmacia_id", nullable = false)
    private Farmaceutica farmaceutica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria", nullable = false)
    private Categoria categoria;

    private Date dataFabricacao;
    private Date dataValidad;


    public Remedio(String nome, Farmaceutica farmaceutica, Categoria categoria, Date dataFabricacao, Date dataValidad) {
        this.nome = nome;
        this.farmaceutica = farmaceutica;
        this.categoria = categoria;
        this.dataFabricacao = dataFabricacao;
        this.dataValidad = dataValidad;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Farmaceutica getFarmaceutica() {
        return farmaceutica;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public Date getDataValidad() {
        return dataValidad;
    }
}
