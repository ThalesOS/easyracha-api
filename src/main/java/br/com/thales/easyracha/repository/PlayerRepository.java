package br.com.thales.easyracha.repository;

import br.com.thales.easyracha.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
