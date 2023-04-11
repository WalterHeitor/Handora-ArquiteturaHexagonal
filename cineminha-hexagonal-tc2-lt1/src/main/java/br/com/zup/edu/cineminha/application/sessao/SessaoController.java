package br.com.zup.edu.cineminha.application.sessao;

import br.com.zup.edu.cineminha.adapters.persistence.filme.FilmeRepository;
import br.com.zup.edu.cineminha.adapters.persistence.sala.SalaRepository;
import br.com.zup.edu.cineminha.adapters.persistence.sessao.SessaoRepository;
import br.com.zup.edu.cineminha.domain.filme.Filme;
import br.com.zup.edu.cineminha.domain.sala.Sala;
import br.com.zup.edu.cineminha.domain.sessao.CriarSessaoService;
import br.com.zup.edu.cineminha.domain.sessao.Sessao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/sessoes")
public class SessaoController {

    @Autowired
    private CriarSessaoService service;



    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovaSessaoRequest request,
                                      UriComponentsBuilder uriBuilder) {
        Sala sala = service.getByIdSala(request.getSalaId());
        Filme filme = service.getByIdFilme(request.getFilmeId());

        Sessao sessao = service.criaSessao(request, sala, filme);


        var location = uriBuilder.path("/api/sessoes/{id}")
                .buildAndExpand(sessao.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }


}
