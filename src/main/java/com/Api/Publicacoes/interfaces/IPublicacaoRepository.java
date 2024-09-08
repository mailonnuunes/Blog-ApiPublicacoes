package com.Api.Publicacoes.interfaces;

import com.Api.Publicacoes.domains.Publicacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPublicacaoRepository extends JpaRepository<Publicacao, Long> {
}
