package pl.agatadziubala.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.agatadziubala.domain.Player;
import pl.agatadziubala.domain.PositionOfField;
import pl.agatadziubala.services.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Player> findAll() {
        return playerService.findAll();
    }

    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    public Player findOne(Long id) {
        return playerService.findOne(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void save(String name, String surname, PositionOfField position) {
        playerService.save(name, surname, position);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void update(Long id, String name, String surname, PositionOfField position) {
        playerService.update(id, name, surname, position);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(Long id) {
        playerService.delete(id);
    }

    @RequestMapping(value = "/findPlayersAboveSection", method = RequestMethod.GET)
    public List<Player> findPlayersAboveSection(int section) {
        return playerService.findPlayersWhoseRunningAboveSection(section);
    }
}
