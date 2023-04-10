package com.softwalter.livraria.application;

import com.softwalter.livraria.domain.Autor;
import com.softwalter.livraria.domain.DadosNovoAutor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public record NovoAutorRequest(@NotBlank String nome,
                               @Email  @NotBlank String email,
                               @NotBlank  @Size(max = 4000) String descricao) implements DadosNovoAutor {
    @Override
    public Autor toModel() {
        return new Autor(nome, email, descricao);
    }
}
