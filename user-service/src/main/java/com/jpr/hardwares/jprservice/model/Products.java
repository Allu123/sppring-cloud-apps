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
public class Products {

    @Id
    String id;
    String productId;
    String ProductName;
    String unitPrice;
    String unitsInStock;
    Boolean isDiscounted;
    String maxRetailPrice;
    String wholeSalePrice;
}
