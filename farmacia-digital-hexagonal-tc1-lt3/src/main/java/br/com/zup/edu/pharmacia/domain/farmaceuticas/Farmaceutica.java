package br.com.zup.edu.pharmacia.domain.farmaceuticas;

import br.com.zup.edu.pharmacia.domain.remedios.Remedio;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Farmaceutica {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    @CNPJ
    @Column(unique = true)
    private String documento;

    @NotBlank
    @Email
    @Column(unique = true)
    private String emailDeContato;

    @NotBlank
    private String telefonePrincipal;

    @OneToMany(mappedBy = "farmaceutica", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Remedio> remedios = new ArrayList<Remedio>();

    public Farmaceutica(String nome,
                        String documento,
                        String emailDeContato,
                        String telefonePrincipal) {

        this.nome = nome;
        this.documento = documento;
        this.emailDeContato = emailDeContato;
        this.telefonePrincipal = telefonePrincipal;
    }

    public Farmaceutica(String nome, String documento, String emailDeContato, String telefonePrincipal, List<Remedio> remedios) {
        this.nome = nome;
        this.documento = documento;
        this.emailDeContato = emailDeContato;
        this.telefonePrincipal = telefonePrincipal;
        this.remedios = remedios;
    }

    /**
     * @deprecated para uso dos frameworks
     */
    @Deprecated
    public Farmaceutica() { }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmailDeContato() {
        return emailDeContato;
    }

    public String getTelefonePrincipal() {
        return telefonePrincipal;
    }

    public List<Remedio> getRemedios() {
        return remedios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmaceutica that = (Farmaceutica) o;
        return documento.equals(that.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
}
