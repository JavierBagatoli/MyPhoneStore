package com.example.MyPhoneStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MyPhoneStoreApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MyPhoneStoreApplication.class, args);

		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploPersistenciaPU");
		//EntityManager em = emf.createEntityManager();

		//Transaccion

		//em.getTransaction().begin();

		//Operacion

		//Object result = em.createNativeQuery("select 4+5;").getSingleResult();

		//System.out.println(result);

		//em.getTransaction().commit();
	}

}
