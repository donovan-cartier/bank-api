package fr.donovancartier.bank_api.service;

import fr.donovancartier.bank_api.model.Account;
import fr.donovancartier.bank_api.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;


    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Compte introuvable"
        ));
    }

    public List<Account> getClientAccounts(Long id) {
        return accountRepository.findAllByClientId(id);
    }
}
