package com.devsuperior.frete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.frete.entities.Order;
import com.devsuperior.frete.services.OrderService;

@SpringBootApplication
public class FreteApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(FreteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		System.out.println("pedido codigo: " + order.getCode());
		System.out.println("valor total: R$ " + orderService.total(order));
	}

}
