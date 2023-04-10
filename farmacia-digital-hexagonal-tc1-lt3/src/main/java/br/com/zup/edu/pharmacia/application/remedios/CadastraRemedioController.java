package br.com.zup.edu.pharmacia.application.remedios;

import br.com.zup.edu.pharmacia.domain.remedios.CriaNovoRemedio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/remedios")
public class CadastraRemedioController {

    private final CriaNovoRemedio service;

    public CadastraRemedioController(CriaNovoRemedio service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovoRemedioRequest request,
                                      UriComponentsBuilder uriBuilder) {
        var farmacia = service.getByIdFarmacia(request.famaciaId());

        var categoria = service.getByIdCategoria(request.categoriaId());

        var remedio = service.criaNovoRemedio(request, farmacia, categoria);


        URI location = uriBuilder.path("/categorias/{id}")
                .buildAndExpand(remedio.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}
