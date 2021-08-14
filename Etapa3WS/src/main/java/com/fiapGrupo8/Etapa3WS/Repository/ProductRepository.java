package com.fiapGrupo8.Etapa3WS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiapGrupo8.Etapa3WS.dto.ProductDTO;
import com.fiapGrupo8.Etapa3WS.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	List<Product> findAllByNameLike(String name);

	@Query("select p from Product p where p.id = ?1")
	List<Product> findAllById(Long id);

}
