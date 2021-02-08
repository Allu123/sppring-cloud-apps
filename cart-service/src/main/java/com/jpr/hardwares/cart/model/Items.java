package com.jpr.hardwares.cart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class Items {
    @Id
    private Long id;
    private String itemCode;
    private String Name;
    private int prices;
    private int count;
}
