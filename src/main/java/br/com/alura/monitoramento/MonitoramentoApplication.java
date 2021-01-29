package br.com.alura.monitoramento;

import org.hibernate.validator.constraints.EAN;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
//Projeto spring boot admin, para monitorar api
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class MonitoramentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoramentoApplication.class, args);
	}

}
