package com.Api.Publicacoes.dtos;

import com.Api.Publicacoes.domains.Comentario;
import com.Api.Publicacoes.domains.Publicacao;
import com.Api.Publicacoes.domains.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public record DadosListagemPublicacoes(
        String titulo,
        String corpo,
        Usuario usuarioAutor,
        int curtida,
        int naoGostei,
        Date dataDeCriacao,
        List<Comentario> comentarios

) {
    public DadosListagemPublicacoes(Publicacao publicacao) {

        this(publicacao.getTitulo(), publicacao.getCorpo(),publicacao.getUsuarioAutor(), publicacao.getCurtida(), publicacao.getNaoGostei(),publicacao.getDataDeCriacao(),publicacao.getComentarios());
    }
}