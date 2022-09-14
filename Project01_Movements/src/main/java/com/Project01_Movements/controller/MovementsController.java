package com.Project01_Movements.controller;

import com.Project01_Movements.bean.Movements;
import com.Project01_Movements.service.MovementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/project01/movements")
public class MovementsController {

@Autowired
    MovementsService movementsService;

    @PostMapping("/save")
    public Mono<Movements> save(@RequestBody Movements movements) {
        return movementsService.save(movements);
    }

    @GetMapping("/findAll")
    public Flux<Movements> findAll(){
        return movementsService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Mono<Movements> findById(@PathVariable String id) {
        return  movementsService.finById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable String id) {
        movementsService.deleteById(id).subscribe();
    }

    @PutMapping("/update")
    public void update(@RequestBody Movements movements) {
        movementsService.save(movements);
    }

}
