package com.zupedu.bancodigital.domain;

import org.springframework.stereotype.Service;

@Service
public class CriaNovaProposta {
    private final CadastraNovaPropostaRepository repository;

    public CriaNovaProposta(CadastraNovaPropostaRepository repository) {
        this.repository = repository;
    }

    public Proposta criaPropostaBaseadoNos(DadosNovaProposta novaProposta) {

        var proposta = novaProposta.toModel();

        return repository.salva(proposta);

    }
}
