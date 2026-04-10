package br.com.thales.easyracha.service;

import br.com.thales.easyracha.model.Match;
import br.com.thales.easyracha.repository.MatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MatchService {

    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Optional<Match> getMatchById(Long id){
        return matchRepository.findById(id);
    }

    public Match saveMatch(Match match){
        return matchRepository.save(match);
    }

    public List<Match> listAllMatch(){
        return matchRepository.findAll();
    }


    


}
