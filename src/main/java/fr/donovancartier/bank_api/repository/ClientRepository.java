package fr.donovancartier.bank_api.repository;

import fr.donovancartier.bank_api.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
