package com.fiapGrupo8.Etapa3WS.service;

import java.util.List;

import com.fiapGrupo8.Etapa3WS.dto.CartDTO;
import com.fiapGrupo8.Etapa3WS.dto.CartDTOCreateUpdate;
import com.fiapGrupo8.Etapa3WS.dto.ProductDTO;
import com.fiapGrupo8.Etapa3WS.entity.Product;


public interface CartService {

	List<CartDTO> getAllCarts();
	List<CartDTO> getCartById(Long ids); 
	CartDTO createCart(CartDTOCreateUpdate cart);
	CartDTO updateCartById(CartDTO cart, Long id);
	CartDTO addProductListToCartById(Long productId, Long id);

}

