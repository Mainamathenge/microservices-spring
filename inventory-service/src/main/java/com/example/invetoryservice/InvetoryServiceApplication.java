package com.example.invetoryservice;

import com.example.invetoryservice.model.Inventory;
import com.example.invetoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableEurekaClient
public class InvetoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvetoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadDta(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("iphone_15");
			inventory2.setQuantity(0);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone_12");
			inventory1.setQuantity(100);

			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);

		};
	}

}
