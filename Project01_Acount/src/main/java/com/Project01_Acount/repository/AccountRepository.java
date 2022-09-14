package com.Project01_Acount.repository;

import com.Project01_Acount.bean.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ReactiveMongoRepository<Account,String> {
}
