package com.jpr.hardwares.jprservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Users {

    @Id
    String id;
    String userId;
    String userName;
    String phoneNumber;
    String emailId;
    String address;
}
