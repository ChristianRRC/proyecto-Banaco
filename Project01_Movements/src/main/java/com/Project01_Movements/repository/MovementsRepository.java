package com.Project01_Movements.repository;

import com.Project01_Movements.bean.Movements;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementsRepository extends ReactiveMongoRepository<Movements,String> {
}
