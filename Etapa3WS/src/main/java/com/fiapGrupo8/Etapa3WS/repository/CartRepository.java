package com.fiapGrupo8.Etapa3WS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiapGrupo8.Etapa3WS.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
	
	List<Cart> findAllById(Long id);
}
