package fr.donovancartier.bank_api.repository;

import fr.donovancartier.bank_api.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAllByClientId(Long id);
}
