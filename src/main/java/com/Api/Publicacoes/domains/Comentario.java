package com.Api.Publicacoes.domains;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Comentario {

    private Long id;

    private String body;

    private Usuario usuarioAutor;

    private Publicacao publicacaoDoComentario;


}
