package br.com.zup.edu.pharmacia.application.remedios;

import br.com.zup.edu.pharmacia.domain.categorias.Categoria;
import br.com.zup.edu.pharmacia.domain.farmaceuticas.Farmaceutica;
import br.com.zup.edu.pharmacia.domain.remedios.DadosNovoRemedio;
import br.com.zup.edu.pharmacia.domain.remedios.Remedio;

import java.util.Date;

public record NovoRemedioRequest(
        String nome,
        Long famaciaId,
        Long categoriaId,
        Date dataFabricacao,
        Date dataValidade
) implements DadosNovoRemedio {


    @Override
    public Remedio toModel(Farmaceutica farmacia, Categoria categoria) {
        return new Remedio(nome, farmacia, categoria, dataFabricacao, dataValidade);
    }
}

