package com.Api.Publicacoes.domains;

import com.Api.Publicacoes.dtos.DadosCriacaoPublicacao;
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

    private int curtida;

    private int naoGostei;

    private Date dataDeCriacao;

    private int visualizacoes;

    private List<Comentario> comentarios;

    public Publicacao(DadosCriacaoPublicacao dados){
        this.titulo = dados.titulo();
        this.usuarioAutor = dados.usuarioAutor();
        this.comentarios = dados.comentarios();
        this.corpo = dados.corpo();
        this.curtida = dados.curtida();
        this.naoGostei = dados.naoGostei();
        this.dataDeCriacao = dados.dataDeCriacao();
        this.visualizacoes = dados.visualizacoes();
    }

    public Publicacao() {
    }
}
