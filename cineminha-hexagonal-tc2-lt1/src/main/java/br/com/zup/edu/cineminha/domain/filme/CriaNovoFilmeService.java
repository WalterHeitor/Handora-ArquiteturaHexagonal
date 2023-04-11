package br.com.zup.edu.cineminha.domain.filme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriaNovoFilmeService {

    @Autowired
    private CadastraNovoFilmeRepository repository;

    public Filme criaNovoFilme(DadosNovoFilme novoFilme) {
        Filme filme = novoFilme.toModel();

        return repository.salva(filme);
    }
}
