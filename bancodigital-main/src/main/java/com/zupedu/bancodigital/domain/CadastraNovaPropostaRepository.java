package com.zupedu.bancodigital.domain;

import com.zupedu.bancodigital.domain.Proposta;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastraNovaPropostaRepository {

    Proposta salva(Proposta proposta);
}
