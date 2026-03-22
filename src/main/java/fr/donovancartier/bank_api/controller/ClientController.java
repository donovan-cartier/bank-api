package fr.donovancartier.bank_api.controller;

import fr.donovancartier.bank_api.model.Account;
import fr.donovancartier.bank_api.model.Client;
import fr.donovancartier.bank_api.model.Transaction;
import fr.donovancartier.bank_api.service.AccountService;
import fr.donovancartier.bank_api.service.ClientService;
import fr.donovancartier.bank_api.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @Autowired
    private AccountService accountService;

    @GetMapping("/clients")
    public List<Client> clients(){
        return clientService.getClients();
    }

    @GetMapping("/clients/{id}")
    public Client client(@PathVariable Long id){
        return clientService.getClient(id);
    }

    @GetMapping("/clients/{id}/accounts")
    public List<Account> clientAccounts(@PathVariable Long id){
        return accountService.getClientAccounts(id);
    }


}
