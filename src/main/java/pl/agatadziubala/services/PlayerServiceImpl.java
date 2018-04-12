package pl.agatadziubala.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.agatadziubala.domain.PositionOfField;
import pl.agatadziubala.repository.PlayerRepository;
import pl.agatadziubala.domain.Player;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> findAll() {
        return (List<Player>) playerRepository.findAll();
    }


    public Player findOne(Long id) {
        return playerRepository.findOne(id);
    }

    public void save(String name, String surname, PositionOfField positionOfField) {
        Player player = Player.builder()
                .name(name)
                .surname(surname)
                .positionOfField(positionOfField)
                .build();
        playerRepository.save(player);
    }

    public void update(Long id, String name, String surname, PositionOfField positionOfField) {
        Player player = Player.builder()
                .id(id)
                .name(name)
                .surname(surname)
                .positionOfField(positionOfField)
                .build();
        playerRepository.save(player);
    }

    public void delete(Long id) {
        playerRepository.delete(id);
    }

    public List<Player> findPlayersWhoseRunningAboveSection(int section) {
        List<Player> players = (List<Player>) playerRepository.findAll();
        List<Player> playersAboveSection = new ArrayList<>();

        for (Player player : players) {
            if (player.getPositionOfField().getNoOfSectionField() > section) {
                playersAboveSection.add(player);
            }
        }
        return playersAboveSection;
    }
}
