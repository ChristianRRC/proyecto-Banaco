package com.Project01_Client.controller;

import com.Project01_Client.bean.Client;
import com.Project01_Client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/project01/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("/save")
    public Mono<Client> save(@RequestBody Client client) {
       return clientService.save(client);
    }

    @GetMapping("/findAll")
    public Flux<Client> findAll(){
        return clientService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Mono<Client> findById(@PathVariable String id) {
        return  clientService.finById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable String id) {
        clientService.deleteById(id).subscribe();
    }

    @PutMapping("/update")
    public void update(@RequestBody Client client) {
        clientService.save(client);
    }

}
