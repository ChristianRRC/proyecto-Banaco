package com.Project01_Movements.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Movements {

    @Id
    private String idMovement;
    private String idClient;
    private String idAccount;
    private String concept;
    private Double amount;

}
