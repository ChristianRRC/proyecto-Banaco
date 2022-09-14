package com.Project01_Client.service;

import com.Project01_Client.bean.Client;

import com.Project01_Client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    @Autowired
 private ClientRepository clientRepository;

    public Mono<Client> save (Client client) {
       return clientRepository.save(client);
    }

    public Flux<Client> findAll(){
        return clientRepository.findAll();
    }

    public Mono<Client> finById(String id) {
        return clientRepository.findById(id);
    }

    public Mono<Void> deleteById(String id) {
        return clientRepository.deleteById(id);
    }
}

