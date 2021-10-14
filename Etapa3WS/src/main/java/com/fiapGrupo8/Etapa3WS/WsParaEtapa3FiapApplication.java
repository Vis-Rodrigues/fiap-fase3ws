package com.fiapGrupo8.Etapa3WS;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fiapGrupo8.Etapa3WS.entity.Cart;
import com.fiapGrupo8.Etapa3WS.entity.Product;
import com.fiapGrupo8.Etapa3WS.repository.CartRepository;
import com.fiapGrupo8.Etapa3WS.repository.ProductRepository;

@SpringBootApplication
public class WsParaEtapa3FiapApplication {

	private static final Logger log = LoggerFactory.getLogger(WsParaEtapa3FiapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WsParaEtapa3FiapApplication.class, args);
	}
	
	//Apenas para efeito de teste
	@Bean
	public CommandLineRunner demo(ProductRepository productRepository, CartRepository cartRepository) {
		return (args) -> {

			log.info("-------------------------------");
			log.info("-------------------------------");
			log.info("Criando Teste e inserindo na base.");
			log.info("-------------------------------");
			
			Product product1 = new Product();
			product1.setBrand("Santa Helena");
			product1.setName("Pacoquinha");
			product1.setIsVegan(true);
			product1.setIsVegetarian(false);
			product1.setIsGlutenFree(true);
			product1.setPrice(0.50);
			product1.setUrlImage("");
			
			Product product2 = new Product();
			product2.setBrand("Organico");
			product2.setName("Alface");
			product2.setIsVegan(false);
			product2.setIsVegetarian(true);
			product2.setIsGlutenFree(true);
			product2.setPrice(4.50);
			product2.setUrlImage("");
			
			Product product3 = new Product();
			product3.setBrand("Organico");
			product3.setName("Brocolis");
			product3.setIsVegan(true);
			product3.setIsVegetarian(true);
			product3.setIsGlutenFree(false);
			product3.setPrice(3.50);
			product3.setUrlImage("");
			
			productRepository.save(product1);
			productRepository.save(product2);
			productRepository.save(product3);
			
			List<Product> productList1 = null; //List.of(product1);
			List<Product> productList2 = null; //List.of(product2, product3);
			
			Cart cart1 = new Cart();
			Cart cart2 = new Cart();
			
			cartRepository.save(cart1);
			cartRepository.save(cart2);
			
			cart1.setProductsInCart(productList1);
			cart2.setProductsInCart(productList2);
			cartRepository.save(cart1);
			cartRepository.save(cart2);
			
		};

	}
}
