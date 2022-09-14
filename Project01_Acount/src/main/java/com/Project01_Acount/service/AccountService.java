package com.Project01_Acount.service;

import com.Project01_Acount.bean.Account;
import com.Project01_Acount.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Mono<Account> save (Account account) {
        return accountRepository.save(account);
    }

    public Flux<Account> findAll(){
        return accountRepository.findAll();
    }

    public Mono<Account> finById(String id) {
        return accountRepository.findById(id);
    }

    public Mono<Void> deleteById(String id) {
        return accountRepository.deleteById(id);
    }
}
