package br.com.zup.edu.cineminha.adapters.persistence.sala;

import br.com.zup.edu.cineminha.domain.sala.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
}