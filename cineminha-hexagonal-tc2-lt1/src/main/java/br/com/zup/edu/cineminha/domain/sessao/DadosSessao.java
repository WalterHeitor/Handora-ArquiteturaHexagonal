package br.com.zup.edu.cineminha.domain.sessao;

import br.com.zup.edu.cineminha.domain.filme.Filme;
import br.com.zup.edu.cineminha.domain.sala.Sala;

public interface DadosSessao {
    Sessao toModel(Sala sala, Filme filme);
}
