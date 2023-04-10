package br.com.zup.edu.pharmacia.domain.remedios;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;
import org.springframework.stereotype.Service;

@Service
public class CriaNovoRemedio {

    private final CadastraNovoRemedioRepository repository;


    public CriaNovoRemedio(CadastraNovoRemedioRepository repository) {
        this.repository = repository;
    }

    public Remedio criaNovoRemedio(
            DadosNovoRemedio dadosNovoRemedio, Farmaceutica farmacia, Categoria categoria) {


        var remedio = dadosNovoRemedio.toModel(farmacia, categoria);

        return repository.salva(remedio);
    }

    public Farmaceutica getByIdFarmacia(Long famaciaId) {
        return repository.buscaFarmaciaPorId(famaciaId).get();
    }

    public Categoria getByIdCategoria(Long categoriaId) {
        return repository.buscaCategoriaPorId(categoriaId).get();
    }
}
