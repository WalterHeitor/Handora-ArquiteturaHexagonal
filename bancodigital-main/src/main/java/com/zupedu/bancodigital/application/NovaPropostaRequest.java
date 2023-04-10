package com.zupedu.bancodigital.application;

import com.zupedu.bancodigital.domain.DadosNovaProposta;
import com.zupedu.bancodigital.domain.Endereco;
import com.zupedu.bancodigital.domain.Proposta;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public record NovaPropostaRequest(
        @NotBlank
        String nome,

        @NotBlank
        @CPF
        String documento,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String logradouro,

        @NotBlank
        String numero,

        String complemento,

        @NotBlank
        String cep,

        @NotBlank
        String cidade,

        @NotBlank
        String estado
) implements DadosNovaProposta {

    @Override
    public Proposta toModel() {
        Endereco endereco = new Endereco(logradouro, numero, complemento, cep, cidade, estado);
        return new Proposta(nome, documento, email, endereco);
    }
}
