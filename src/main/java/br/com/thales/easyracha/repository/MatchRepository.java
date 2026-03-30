package br.com.thales.easyracha.repository;

import br.com.thales.easyracha.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match,Long> {
}
