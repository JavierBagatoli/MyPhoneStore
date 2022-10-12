package com.example.MyPhoneStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MyPhoneStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPhoneStoreApplication.class, args);
	}

}
