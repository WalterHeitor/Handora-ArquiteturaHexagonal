package br.com.zup.edu.pharmacia.domain.remedios;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;

import java.util.Optional;

public interface CadastraNovoRemedioRepository {

    Remedio salva(Remedio remedio);

    Optional<Farmaceutica> buscaFarmaciaPorId(Long farmaceuticaId);

    Optional<Categoria> buscaCategoriaPorId(Long categoriaId);
}
