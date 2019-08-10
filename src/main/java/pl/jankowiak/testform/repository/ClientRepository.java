package pl.jankowiak.testform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jankowiak.testform.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
