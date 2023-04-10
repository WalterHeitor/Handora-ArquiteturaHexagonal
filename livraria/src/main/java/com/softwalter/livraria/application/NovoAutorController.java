package com.softwalter.livraria.application;

import com.softwalter.livraria.domain.Autor;
import com.softwalter.livraria.domain.CriaNovoAutor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class NovoAutorController {
    private final CriaNovoAutor service;

    public NovoAutorController(CriaNovoAutor service) {
        this.service = service;
    }

    @Transactional
    @PostMapping("/api/autores")
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovoAutorRequest request,
                                      UriComponentsBuilder uriBuilder) {

        Autor autor = service.cria(request);

        URI location = uriBuilder.path("/api/autores/{id}")
                .buildAndExpand(autor.getId())
                .toUri();

        return ResponseEntity
                .created(location).build();
    }
}
