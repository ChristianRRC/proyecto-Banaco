package com.Project01_Client.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Clients")
@Data
public class Client {

    @Id
    private String idClient;
    private String type;
    private String name;
    private String document;
    private Integer phone;
    private String email;


}
