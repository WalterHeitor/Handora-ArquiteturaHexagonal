package com.zupedu.bancodigital.adapters.percistence;

import com.zupedu.bancodigital.domain.CadastraNovaPropostaRepository;
import com.zupedu.bancodigital.domain.Proposta;
import org.springframework.stereotype.Component;

@Component
public class SqlPropostaRepository implements CadastraNovaPropostaRepository {

    private final PropostaRepository repository;

    public SqlPropostaRepository(PropostaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Proposta salva(Proposta proposta) {
        return repository.save(proposta);
    }
}
