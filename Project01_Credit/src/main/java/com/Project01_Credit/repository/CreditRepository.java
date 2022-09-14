package com.Project01_Credit.repository;

import com.Project01_Credit.bean.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends ReactiveMongoRepository<Credit,String> {
}
