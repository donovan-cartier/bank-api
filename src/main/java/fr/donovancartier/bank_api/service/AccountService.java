package fr.donovancartier.bank_api.service;

import fr.donovancartier.bank_api.model.Account;
import fr.donovancartier.bank_api.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getClientAccounts(Long id) {
        return accountRepository.findAllByClientId(id);
    }
}
