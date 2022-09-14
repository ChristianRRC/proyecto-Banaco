package com.Project01_Credit.controller;

import com.Project01_Credit.bean.Credit;
import com.Project01_Credit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/project01/credit")
public class CreditController {

    @Autowired
    CreditService creditService;

    @PostMapping("/save")
    public Mono<Credit> save(@RequestBody Credit credit) {
        return creditService.save(credit);
    }

    @GetMapping("/findAll")
    public Flux<Credit> findAll(){
        return creditService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Mono<Credit> findById(@PathVariable String id) {
        return  creditService.finById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable String id) {
        creditService.deleteById(id).subscribe();
    }

    @PutMapping("/update")
    public void update(@RequestBody Credit credit) {
        creditService.save(credit);
    }


}
