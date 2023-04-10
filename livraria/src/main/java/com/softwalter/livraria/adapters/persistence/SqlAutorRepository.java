package com.softwalter.livraria.adapters.persistence;

import com.softwalter.livraria.domain.Autor;
import com.softwalter.livraria.domain.CadastraAutorRepository;
import org.springframework.stereotype.Component;

@Component
public class SqlAutorRepository implements CadastraAutorRepository {
    private final AutorRepository repository;

    public SqlAutorRepository(AutorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Autor salva(Autor autor) {
        return repository.save(autor);
    }
}
