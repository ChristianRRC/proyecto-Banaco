package com.Project01_Credit.service;

import com.Project01_Credit.bean.Credit;
import com.Project01_Credit.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditService {

    @Autowired
    private CreditRepository creditRepository;

    public Mono<Credit> save (Credit credit) {
        return creditRepository.save(credit);
    }

    public Flux<Credit> findAll(){
        return creditRepository.findAll();
    }

    public Mono<Credit> finById(String id) {
        return creditRepository.findById(id);
    }

    public Mono<Void> deleteById(String id) {
        return creditRepository.deleteById(id);
    }

}
