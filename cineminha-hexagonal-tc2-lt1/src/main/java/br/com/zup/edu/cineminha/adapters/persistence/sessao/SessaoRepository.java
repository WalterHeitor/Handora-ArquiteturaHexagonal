package br.com.zup.edu.cineminha.adapters.persistence.sessao;

import br.com.zup.edu.cineminha.domain.sessao.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Long> {
}