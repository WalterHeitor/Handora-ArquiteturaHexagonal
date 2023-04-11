package br.com.zup.edu.cineminha.adapters.persistence.filme;

import br.com.zup.edu.cineminha.domain.filme.CadastraNovoFilmeRepository;
import br.com.zup.edu.cineminha.domain.filme.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlFilmeAdapter implements CadastraNovoFilmeRepository {

    @Autowired
    private FilmeRepository repository;

    @Override
    public Filme salva(Filme filme) {
        return repository.save(filme);
    }
}
