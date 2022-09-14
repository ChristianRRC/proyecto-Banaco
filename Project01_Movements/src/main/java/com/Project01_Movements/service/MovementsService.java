package com.Project01_Movements.service;

import com.Project01_Movements.bean.Movements;
import com.Project01_Movements.repository.MovementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MovementsService {

@Autowired
    private MovementsRepository movementsRepository;

    public Mono<Movements> save (Movements movements) {
        return movementsRepository.save(movements);
    }

    public Flux<Movements> findAll(){
        return movementsRepository.findAll();
    }

    public Mono<Movements> finById(String id) {
        return movementsRepository.findById(id);
    }

    public Mono<Void> deleteById(String id) {
        return movementsRepository.deleteById(id);
    }


}
