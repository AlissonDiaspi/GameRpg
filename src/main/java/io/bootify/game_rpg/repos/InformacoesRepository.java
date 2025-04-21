package io.bootify.game_rpg.repos;

import io.bootify.game_rpg.domain.Informacoes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InformacoesRepository extends JpaRepository<Informacoes, Long> {
}
