package br.com.zup.edu.pharmacia.adapters.persistence.remedio;

import br.com.zup.edu.pharmacia.adapters.persistence.categorias.CategoriaRepository;
import br.com.zup.edu.pharmacia.adapters.persistence.farmaceuticas.FarmaceuticaRepository;
import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;
import br.com.zup.edu.pharmacia.domain.remedios.CadastraNovoRemedioRepository;
import br.com.zup.edu.pharmacia.domain.remedios.Remedio;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SqlRemedioAdapter implements CadastraNovoRemedioRepository {

    private final Remediorepository remediorepository;
    private final FarmaceuticaRepository farmaceuticaRepository;
    private final CategoriaRepository categoriaRepository;

    public SqlRemedioAdapter(Remediorepository remediorepository, FarmaceuticaRepository farmaceuticaRepository, CategoriaRepository categoriaRepository) {
        this.remediorepository = remediorepository;
        this.farmaceuticaRepository = farmaceuticaRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Remedio salva(Remedio remedio) {
        return remediorepository.save(remedio);
    }

    @Override
    public Optional<Farmaceutica> buscaFarmaciaPorId(Long farmaceuticaId) {

        Optional<Farmaceutica> optionalFarmaceutica = farmaceuticaRepository.findById(farmaceuticaId);
        if (optionalFarmaceutica.isEmpty()) throw new RuntimeException("Criar exexption");

        return optionalFarmaceutica;
    }

    @Override
    public Optional<Categoria> buscaCategoriaPorId(Long categoriaId) {

        Optional<Categoria> optionalCategoria = categoriaRepository.findById(categoriaId);

        if (optionalCategoria.isEmpty()) throw new RuntimeException("Criar exception by categoria");

        return optionalCategoria;
    }
}
