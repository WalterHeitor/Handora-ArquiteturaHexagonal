package br.com.zup.edu.cineminha.domain.sessao;

import br.com.zup.edu.cineminha.domain.filme.Filme;
import br.com.zup.edu.cineminha.domain.sala.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriarSessaoService {

    @Autowired
    CriarNovaSessaoRepository repository;

    public Sessao criaSessao(DadosSessao dadosSessao, Sala sala, Filme filme) {

        Sessao sessao = dadosSessao.toModel(sala, filme);

        return repository.salva(sessao);

    }

    public Sala getByIdSala(long salaId) {
        return repository.getSalaById(salaId);
    }

    public Filme getByIdFilme(long filmeId) {
        return repository.getFilmeById(filmeId);
    }
}
