package com.starter.runner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.starter.repository.ProductRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	@Autowired
	private DataSource ds;
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println(ds.getClass().getName());
		
	}

}
