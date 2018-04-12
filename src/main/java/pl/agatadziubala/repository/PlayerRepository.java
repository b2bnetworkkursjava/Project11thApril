package pl.agatadziubala.repository;

import org.springframework.data.repository.CrudRepository;
import pl.agatadziubala.domain.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {

}
