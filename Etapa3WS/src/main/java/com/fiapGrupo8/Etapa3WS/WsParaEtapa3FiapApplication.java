package com.fiapGrupo8.Etapa3WS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fiapGrupo8.Etapa3WS.Repository.ProductRepository;
import com.fiapGrupo8.Etapa3WS.entity.Product;



@SpringBootApplication
public class WsParaEtapa3FiapApplication {

	private static final Logger log = LoggerFactory.getLogger(WsParaEtapa3FiapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WsParaEtapa3FiapApplication.class, args);
	}

	//Apenas para efeito de teste
	@Bean
	public CommandLineRunner demo(ProductRepository productRepository) {
		return (args) -> {

			log.info("-------------------------------");
			log.info("-------------------------------");
			log.info("Criando Teste e inserindo na base");
			log.info("-------------------------------");
			
			Product product1 = new Product();
			product1.setBrand("Santa Helena");
			product1.setName("Pacoquinha");
			product1.setIsVegan(true);
			product1.setIsVegetarian(true);
			product1.setIsGlutenFree(true);
			
			Product product2 = new Product();
			product2.setBrand("Organico");
			product2.setName("Alface");
			product2.setIsVegan(true);
			product2.setIsVegetarian(true);
			product2.setIsGlutenFree(true);
			
			Product product3 = new Product();
			product3.setBrand("Organico");
			product3.setName("Brocolis");
			product3.setIsVegan(true);
			product3.setIsVegetarian(true);
			product3.setIsGlutenFree(true);
			
			productRepository.save(product1);
			productRepository.save(product2);
			productRepository.save(product3);
			
			
			
		};

	}
}
