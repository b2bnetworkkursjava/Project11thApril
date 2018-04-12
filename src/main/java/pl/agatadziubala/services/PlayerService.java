package pl.agatadziubala.services;

import pl.agatadziubala.domain.Player;
import pl.agatadziubala.domain.PositionOfField;

import java.util.List;

public interface PlayerService {
    List<Player> findAll();

    Player findOne(Long id);

    void save(String name, String surname, PositionOfField positionOfField);

    void update(Long id, String name, String surname, PositionOfField positionOfField);

    void delete(Long id);

    List<Player> findPlayersWhoseRunningAboveSection(int section);
}
