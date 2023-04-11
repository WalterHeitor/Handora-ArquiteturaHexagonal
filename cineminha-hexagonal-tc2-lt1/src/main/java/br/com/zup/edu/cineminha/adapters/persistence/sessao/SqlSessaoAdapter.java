package br.com.zup.edu.cineminha.adapters.persistence.sessao;

import br.com.zup.edu.cineminha.adapters.persistence.filme.FilmeRepository;
import br.com.zup.edu.cineminha.adapters.persistence.sala.SalaRepository;
import br.com.zup.edu.cineminha.domain.filme.Filme;
import br.com.zup.edu.cineminha.domain.sala.Sala;
import br.com.zup.edu.cineminha.domain.sessao.CriarNovaSessaoRepository;
import br.com.zup.edu.cineminha.domain.sessao.Sessao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SqlSessaoAdapter implements CriarNovaSessaoRepository {

    @Autowired
    private SessaoRepository repository;

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    public Sessao salva(Sessao sessao) {
        return repository.save(sessao);
    }

    @Override
    public Sala getSalaById(long salaId) {
        Optional<Sala> salaOptional = salaRepository.findById(salaId);
        if (salaOptional.isEmpty()) {
            throw new RuntimeException("criar execption salabyid");
        }
        return salaOptional.get();
    }

    @Override
    public Filme getFilmeById(long filmeId) {
        Optional<Filme> filmeOptional = filmeRepository.findById(filmeId);
        return filmeOptional.orElseThrow(() -> new RuntimeException("filme nao encontrado"));
    }
}
