package com.fiapGrupo8.Etapa3WS.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fiapGrupo8.Etapa3WS.Repository.ProductRepository;
import com.fiapGrupo8.Etapa3WS.dto.ProductDTO;
import com.fiapGrupo8.Etapa3WS.dto.ProductDTOCreateUpdate;
import com.fiapGrupo8.Etapa3WS.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		
		this.productRepository = productRepository;
		
	}
	
	@Override
	public List<ProductDTO> getAllProducts() {
		List<Product> productList;
		
		productList = productRepository.findAll();
		
		return productList.stream().map(product -> new ProductDTO(product)).collect(Collectors.toList());

		
	}

	@Override
	public List<ProductDTO> getProductByName(String name) {
		List<Product> productList;
        if (name != null) {
        	productList = productRepository.findAllByNameLike("%" + name + "%");
        } else {
        	productList = productRepository.findAll();
        }
        return productList.stream()
                .map(product -> new ProductDTO(product))
                .collect(Collectors.toList());
	}

	@Override
	public List<ProductDTO> getProductById(Long id) {
		List<Product> productList;
        if (id != null) {
        	productList = productRepository.findAllById(id);
        } else {
        	productList = productRepository.findAll();
        }
        return productList.stream()
                .map(product -> new ProductDTO(product))
                .collect(Collectors.toList());
	}

	@Override
	public ProductDTO createProduct(ProductDTOCreateUpdate productDTOCreateUpdate) {
		Product product = new Product(productDTOCreateUpdate);
		Product savedProduct = productRepository.save(product);
        return new ProductDTO(savedProduct);
	}

	@Override
	public ProductDTO updateProductById(ProductDTO productDTO, Long id) {

		Product product = productRepository.findById(id).stream().findFirst().orElseThrow();

		product.setBrand(productDTO.getBrand());  
		product.setIsGlutenFree(productDTO.getIsGlutenFree());
		product.setIsVegan(productDTO.getIsVegan());
		product.setIsVegetarian(productDTO.getIsVegetarian());
		product.setName(productDTO.getName());

        Product savedProduct = productRepository.save(product);
        return new ProductDTO(savedProduct);
		
	}

	@Override
	public void deleteProductById(Long id) {
		Product product = productRepository.findById(id).stream().findFirst().orElseThrow();
		productRepository.delete(product);

	}

}
