package com.Api.Publicacoes.controllers;

import com.Api.Publicacoes.domains.Publicacao;
import com.Api.Publicacoes.dtos.DadosCriacaoPublicacao;
import com.Api.Publicacoes.dtos.DadosListagemPublicacoes;
import com.Api.Publicacoes.interfaces.IPublicacaoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("publicacoes")
public class PublicacaoController {


    @Autowired
    private IPublicacaoRepository repository;

    @PostMapping
    @Transactional
    public void CriarPublicacao(@RequestBody @Valid DadosCriacaoPublicacao dados){
        repository.save(new Publicacao(dados));

    }
    @GetMapping
    public Page<DadosListagemPublicacoes> MostrarTodasPublicacoes(@PageableDefault(size = 2, sort = {"dataDeCriacao"})Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPublicacoes::new);
    }

}
