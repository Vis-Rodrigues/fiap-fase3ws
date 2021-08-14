package com.fiapGrupo8.Etapa3WS.controller;



import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fiapGrupo8.Etapa3WS.dto.ProductDTO;
import com.fiapGrupo8.Etapa3WS.dto.ProductDTOCreateUpdate;
import com.fiapGrupo8.Etapa3WS.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	
	@GetMapping
	public List<ProductDTO> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/name/{name}")
	public List<ProductDTO> getProductByName(@PathVariable(name = "name") String productName){
		return productService.getProductByName(productName);
	}
	
	
	@GetMapping("/id/{id}")
	public List<ProductDTO> getProductById(@PathVariable(name = "id") Long id){
		return productService.getProductById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductDTO createProduct(@RequestBody ProductDTOCreateUpdate newProduct) {
		return productService.createProduct(newProduct);
	}
	
	@PutMapping("/id/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ProductDTO updateProductById(@RequestBody ProductDTO productupdated,
										@PathVariable Long id) {
		return productService.updateProductById(productupdated, id);
	}
	
	@DeleteMapping("/id/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteProductById(@PathVariable Long id) {
		productService.deleteProductById(id);
		
	}
}
