package com.Project01_Acount.controller;

import com.Project01_Acount.bean.Account;
import com.Project01_Acount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/project01/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/save")
    public Mono<Account> save(@RequestBody Account account) {
        return accountService.save(account);
    }

    @GetMapping("/findAll")
    public Flux<Account> findAll(){
        return accountService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Mono<Account> findById(@PathVariable String id) {
        return  accountService.finById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable String id) {
        accountService.deleteById(id).subscribe();
    }

    @PutMapping("/update")
    public void update(@RequestBody Account account) {
        accountService.save(account);
    }

}
