package com.fiapGrupo8.Etapa3WS.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fiapGrupo8.Etapa3WS.Repository.CartRepository;
import com.fiapGrupo8.Etapa3WS.Repository.ProductRepository;
import com.fiapGrupo8.Etapa3WS.dto.CartDTO;
import com.fiapGrupo8.Etapa3WS.dto.CartDTOCreateUpdate;
import com.fiapGrupo8.Etapa3WS.dto.ProductDTO;
import com.fiapGrupo8.Etapa3WS.entity.Cart;
import com.fiapGrupo8.Etapa3WS.entity.Product;

@Service
public class CartServiceImpl implements CartService {

	CartRepository cartRepository;
	ProductRepository productRepository;

	public CartServiceImpl(CartRepository cartRepository, ProductRepository productRepository) {

		this.cartRepository = cartRepository;
		this.productRepository = productRepository;

	}

	@Override
	public List<CartDTO> getAllCarts() {
		List<Cart> cartList;

		cartList = cartRepository.findAll();

		return cartList.stream().map(cart -> new CartDTO(cart)).collect(Collectors.toList());
	}

	@Override
	public List<CartDTO> getCartById(Long id) {
		List<Cart> cartList;
        if (id != null) {
        	cartList = cartRepository.findAllById(id);
        } else {
        	cartList = cartRepository.findAll();
        }
        return cartList.stream()
                .map(cart -> new CartDTO(cart))
                .collect(Collectors.toList());
	}

	@Override
	public CartDTO createCart(CartDTOCreateUpdate cartDTOCreateUpdate) {
		Cart cart = new Cart(cartDTOCreateUpdate);
		Cart savedCart = cartRepository.save(cart);
        return new CartDTO(savedCart);
	}

	@Override
	public CartDTO updateCartById(CartDTO cartDTO, Long id) {
		Cart cart = cartRepository.findById(id).stream().findFirst().orElseThrow();

		cart.setProductsInCart(cartDTO.getProductsInCart());

        Cart savedCart = cartRepository.save(cart);
        return new CartDTO(savedCart);
	}

	@Override
	public CartDTO addProductListToCartById(Long productId, Long id) {
		Cart cart = cartRepository.findById(id).stream().findFirst().orElseThrow();
		Product product = productRepository.findById(productId).stream().findFirst().orElseThrow();

		cart.getProductsInCart().add(product);
		
		cartRepository.save(cart);
		
		return new CartDTO(cart);
		
	}




}
