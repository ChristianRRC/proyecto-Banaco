package com.Project01_Credit.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Credit {

    @Id
    private String creditCode;

    private String idClient;
    private Integer loanValue;
    private String startDate;
    private String endDate;
}
