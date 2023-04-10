package br.com.zup.edu.pharmacia.domain.remedios;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;

public interface DadosNovoRemedio {

    Remedio toModel(Farmaceutica farmacia, Categoria categoria);
}
