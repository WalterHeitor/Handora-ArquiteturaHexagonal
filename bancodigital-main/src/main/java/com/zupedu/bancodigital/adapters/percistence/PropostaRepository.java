package com.zupedu.bancodigital.adapters.percistence;

import com.zupedu.bancodigital.domain.Proposta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaRepository extends CrudRepository<Proposta, Long> {

}
