package com.Project01_Acount.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Account")
@Data
public class Account {

    @Id
    private String numAccount;
    private String idClient;
    private String typeProduct;
    private String typeAccount;
    private Double maintenanceFee;
    private Integer qMovements;
    private Double money;



}
