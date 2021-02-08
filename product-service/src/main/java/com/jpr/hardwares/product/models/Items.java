package com.jpr.hardwares.product.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class Items {

    @Id
    private Long id;
    private String itemCode;
    private String Name;
    private int prices;
    private int count;

}
