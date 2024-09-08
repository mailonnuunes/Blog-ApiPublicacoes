package com.Api.Publicacoes.domains;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Publicacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String corpo;

    private Usuario usuarioAutor;

    private int curtidas;

    private int naoGostei;

    private Date dataDeCriacao;

    private int visualizacoes;


    private List<Comentario> comentarios;

}
