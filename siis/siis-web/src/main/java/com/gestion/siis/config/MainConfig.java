package com.gestion.siis.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@PropertySource({"classpath:profiles/${environment}/database.properties"})
@ComponentScan(basePackages ="com.siis.nomina")
@EnableScheduling
public class MainConfig {
	
}
