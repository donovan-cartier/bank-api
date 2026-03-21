package fr.donovancartier.bank_api.service;

import fr.donovancartier.bank_api.model.Account;
import fr.donovancartier.bank_api.model.Client;
import fr.donovancartier.bank_api.model.Transaction;
import fr.donovancartier.bank_api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClient(Long id) {
        return clientRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Client introuvable"
        ));
    }

}
