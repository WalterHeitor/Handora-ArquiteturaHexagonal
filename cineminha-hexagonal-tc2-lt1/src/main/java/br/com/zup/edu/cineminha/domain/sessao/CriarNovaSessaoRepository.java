package br.com.zup.edu.cineminha.domain.sessao;

import br.com.zup.edu.cineminha.domain.filme.Filme;
import br.com.zup.edu.cineminha.domain.sala.Sala;

public interface CriarNovaSessaoRepository {
    Sessao salva(Sessao sessao);

    Sala getSalaById(long salaId);

    Filme getFilmeById(long filmeId);
}
