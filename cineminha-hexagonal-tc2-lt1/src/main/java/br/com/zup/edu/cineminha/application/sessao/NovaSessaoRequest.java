package br.com.zup.edu.cineminha.application.sessao;

import br.com.zup.edu.cineminha.domain.filme.Filme;
import br.com.zup.edu.cineminha.domain.sala.Sala;
import br.com.zup.edu.cineminha.domain.sessao.DadosSessao;
import br.com.zup.edu.cineminha.domain.sessao.Sessao;
import br.com.zup.edu.cineminha.adapters.persistence.filme.FilmeRepository;
import br.com.zup.edu.cineminha.adapters.persistence.sala.SalaRepository;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalTime;

public class NovaSessaoRequest implements DadosSessao {

    @NotNull
    private LocalTime horario;

    @Positive
    private long salaId;

    @Positive
    private long filmeId;

    @Positive
    private BigDecimal preco;

    public LocalTime getHorario() {
        return horario;
    }

    public long getSalaId() {
        return salaId;
    }

    public long getFilmeId() {
        return filmeId;
    }

    public BigDecimal getPreco() {
        return preco;
    }


    @Override
    public Sessao toModel(Sala sala, Filme filme) {
        return new Sessao(horario, sala, filme, preco);
    }
}
