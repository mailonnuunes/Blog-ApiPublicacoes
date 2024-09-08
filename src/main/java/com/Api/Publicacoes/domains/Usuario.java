package com.Api.Publicacoes.domains;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    private Long id;

    private String nome;

    private String sobrenome;

    private String email;

    private String senha;
}
