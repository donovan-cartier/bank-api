package fr.donovancartier.bank_api.service;

import fr.donovancartier.bank_api.model.Transaction;
import fr.donovancartier.bank_api.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransaction(Long id) {
        return transactionRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Transaction introuvable"
        ));
    }

    public List<Transaction> getAccountTransactions(Long accountId) {
        return transactionRepository.findAllByAccountId(accountId);
    }

}
