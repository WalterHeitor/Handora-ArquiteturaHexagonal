package com.zupedu.bancodigital.domain;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Endereco {

    @NotBlank
    private String logradouro;

    @NotBlank
    private String numero;

    private String complemento;

    @NotBlank
    private String cep;

    @NotBlank
    private String cidade;

    @NotBlank
    private String estado;



    /**
     * @deprecated para frameworks apenas
     */
    @Deprecated
    public Endereco() { }

    public Endereco(String logradouro,
                    String numero,
                    String complemento,
                    String cep,
                    String cidade,
                    String estado) {

        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
}
