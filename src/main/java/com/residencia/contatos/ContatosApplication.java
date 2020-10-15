package com.residencia.contatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.residencia.contatos.config.AppConfig;


@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class ContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatosApplication.class, args);
	}

}
