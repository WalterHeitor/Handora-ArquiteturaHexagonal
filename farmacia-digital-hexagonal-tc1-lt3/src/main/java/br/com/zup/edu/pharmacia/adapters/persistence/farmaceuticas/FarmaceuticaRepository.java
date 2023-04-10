package br.com.zup.edu.pharmacia.adapters.persistence.farmaceuticas;

import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmaceuticaRepository extends JpaRepository<Farmaceutica, Long> {
}
