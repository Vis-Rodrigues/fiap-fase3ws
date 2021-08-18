package com.fiapGrupo8.Etapa3WS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiapGrupo8.Etapa3WS.dto.ProductDTO;
import com.fiapGrupo8.Etapa3WS.entity.Cart;
import com.fiapGrupo8.Etapa3WS.entity.Product;

public interface CartRepository extends JpaRepository<Cart, Long> {
	

	@Query("select c from Cart c where c.id = ?1")
	List<Cart> findAllById(Long id);
}