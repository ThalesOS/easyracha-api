package br.com.thales.easyracha.service;

import br.com.thales.easyracha.model.Player;
import br.com.thales.easyracha.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player savePlayer(Player player){
        return playerRepository.save(player);
    }

    public List<Player> listAllPlayers(){
        return playerRepository.findAll();
    }

    public Optional<Player> findPlayerById(Long id){
        return playerRepository.findById(id);
    }

    public void delPlayerById(Long id){
        playerRepository.deleteById(id);
    }


}
