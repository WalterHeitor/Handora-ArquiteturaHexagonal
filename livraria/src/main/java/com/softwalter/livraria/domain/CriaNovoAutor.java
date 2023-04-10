package com.softwalter.livraria.domain;

import org.springframework.stereotype.Service;

@Service
public class CriaNovoAutor {

    private final CadastraAutorRepository repository;

    public CriaNovoAutor(CadastraAutorRepository repository) {this.repository = repository;}

    public Autor cria (DadosNovoAutor novoAutor) {

        var autor = novoAutor.toModel();

        repository.salva(autor);

        return autor;
    }
}
