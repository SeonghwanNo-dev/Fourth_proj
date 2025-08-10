package com.github.SeonghwanNo_dev.fourth_proj;

import com.github.SeonghwanNo_dev.fourth_proj.Model.Entity.MemberEntity;
import com.github.SeonghwanNo_dev.fourth_proj.Model.Entity.OrderEntity;
import com.github.SeonghwanNo_dev.fourth_proj.Model.Service.OrderService;
import jakarta.persistence.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FourthProjApplication implements CommandLineRunner
{
	private final OrderService orderService;

	public FourthProjApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(FourthProjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		orderService.doLogic();
	}

}
