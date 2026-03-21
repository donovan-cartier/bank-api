package fr.donovancartier.bank_api.service;

import fr.donovancartier.bank_api.model.Transaction;
import fr.donovancartier.bank_api.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAccountTransactions(Long id, Long accountId) {
        return transactionRepository.findAllByAccountId(accountId);
    }
}
