package com.gestion.siis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.gestion.siis.config.MainConfig;
import com.gestion.siis.config.PersistenceConfig;


@SpringBootApplication
@ImportResource({"application-context.xml"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(new Object[]{Application.class,  MainConfig.class, PersistenceConfig.class}, args);
	}
}
