package fr.donovancartier.bank_api.controller;

import fr.donovancartier.bank_api.model.Account;
import fr.donovancartier.bank_api.model.Transaction;
import fr.donovancartier.bank_api.service.AccountService;
import fr.donovancartier.bank_api.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/accounts")
    public List<Account> accounts(){
        return accountService.getAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Account account(@PathVariable Long id){
        return accountService.getAccount(id);
    }

    @GetMapping("/accounts/{id}/transactions")
    public List<Transaction> accountTransactions(@PathVariable Long id){
        return transactionService.getAccountTransactions(id);
    }

}
