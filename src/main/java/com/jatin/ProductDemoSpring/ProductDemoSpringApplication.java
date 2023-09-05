package com.jatin.ProductDemoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductDemoSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductDemoSpringApplication.class, args);

		ProductService service = context.getBean(ProductService.class);
		List<Product> products = service.getAllProducts();

		System.out.println("========================================");
		System.out.println("Printing all the products");
		System.out.println("========================================\n");

		for (Product product : products) {
			System.out.println(product);
		}
	}

}
