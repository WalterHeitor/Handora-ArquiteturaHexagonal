package br.com.zup.edu.pharmacia.domain.categorias;

import br.com.zup.edu.pharmacia.domain.remedios.Remedio;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String nome;

    @OneToMany(mappedBy = "remedio", cascade = CascadeType.ALL)
    private List<Remedio> remedios = new ArrayList<Remedio>();


    /**
     * @deprecated para uso de frameworks
     */
    @Deprecated
    public Categoria() { }

    public Categoria(String nome) {
        this.nome = Objects.requireNonNull(nome, "nome nao pode ser nulo");
    }

    public Categoria(String nome, List<Remedio> remedios) {
        this.nome = nome;
        this.remedios = remedios;
    }

    public String getNome() {
        return nome;
    }

    public List<Remedio> getRemedios() {
        return remedios;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return nome.equals(categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
