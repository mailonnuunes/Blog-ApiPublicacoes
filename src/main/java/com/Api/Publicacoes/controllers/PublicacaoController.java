package com.Api.Publicacoes.controllers;

import com.Api.Publicacoes.interfaces.IPublicacaoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("publicacoes")
public class PublicacaoController {


    @Autowired
    private IPublicacaoRepository repository;

    @PostMapping
    @Transactional
    public void CriarPublicacao(@RequestBody @Valid Dad)


}
