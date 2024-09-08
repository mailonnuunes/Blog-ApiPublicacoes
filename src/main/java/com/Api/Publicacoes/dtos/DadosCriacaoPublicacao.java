package com.Api.Publicacoes.dtos;

import com.Api.Publicacoes.domains.Comentario;
import com.Api.Publicacoes.domains.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public record DadosCriacaoPublicacao(
        @NotBlank
        String titulo,
        @NotNull
        String corpo,
        @NotNull
        Usuario usuarioAutor,
        @NotNull
        int curtidas,
        @NotNull
        int naoGostei,
        @NotNull
        @DateTimeFormat(pattern = "dd/MM/yyyy")
        Date dataDeCriacao,
        @NotNull
        int visualizacoes,
        @NotNull
        List<Comentario>comentarios

        ){

}
