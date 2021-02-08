package com.jpr.hardwares.product;

import com.jpr.hardwares.product.models.Items;
import com.jpr.hardwares.product.repository.ProductRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@EnableEurekaClient
@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

	@Autowired
	ProductRepositroy productRepositroy;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Items item=new Items( 1L ,"Handle","300",23 ,234);
		Items item1=new Items( 2L ,"Handle","300",23 ,234);
		Items item2=new Items( 3L ,"Handle","300",23 ,234);
		Items item3=new Items( 4L ,"Handle","300",23 ,234);
		Items item4=new Items( 5L ,"Handle","300",23 ,234);
		List<Items> itemList=new ArrayList<Items>();
		itemList.add(item);
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		productRepositroy.saveAll(itemList);
	}
}


