package fr.donovancartier.bank_api.controller;

import fr.donovancartier.bank_api.model.Client;
import fr.donovancartier.bank_api.model.Transaction;
import fr.donovancartier.bank_api.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public List<Transaction> transactions(){
        return transactionService.getTransactions();
    }

    @GetMapping("/transactions/{id}")
    public Transaction transaction(@PathVariable Long id){
        return transactionService.getTransaction(id);
    }
}
