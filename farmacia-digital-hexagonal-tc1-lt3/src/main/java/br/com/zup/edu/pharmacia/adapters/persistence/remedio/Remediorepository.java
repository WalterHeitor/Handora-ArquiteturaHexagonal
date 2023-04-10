package br.com.zup.edu.pharmacia.adapters.persistence.remedio;

import br.com.zup.edu.pharmacia.domain.remedios.Remedio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Remediorepository extends CrudRepository<Remedio, Long> {
}
