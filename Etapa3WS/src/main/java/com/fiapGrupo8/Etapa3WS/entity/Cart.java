package com.fiapGrupo8.Etapa3WS.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.fiapGrupo8.Etapa3WS.dto.CartDTOCreateUpdate;
import com.fiapGrupo8.Etapa3WS.dto.ProductDTOCreateUpdate;

@Entity
@Table(name = "TB_CARTS")
public class Cart {

	public Cart() {

	}

	public Cart(CartDTOCreateUpdate cart) {
		this.productsInCart = cart.getProductsInCart();
	}
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long cart_id;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="TB_CART_PRODUCTS",
	joinColumns={@JoinColumn(name="cart_id")},
	inverseJoinColumns={@JoinColumn(name="product_id")})
	List<Product> productsInCart;

	public Long getId() {
		return cart_id;
	}

	public void setId(Long cart_id) {
		this.cart_id = cart_id;
	}

	public List<Product> getProductsInCart() {

		return productsInCart;
	}

	public void setProductsInCart(List<Product> productsInCart) {
		this.productsInCart = productsInCart;
	}


}
