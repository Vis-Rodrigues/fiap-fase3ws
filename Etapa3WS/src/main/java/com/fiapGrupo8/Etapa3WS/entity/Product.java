package com.fiapGrupo8.Etapa3WS.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fiapGrupo8.Etapa3WS.dto.ProductDTOCreateUpdate;

@Entity
@Table(name = "TB_PRODUCT")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long productId;

	@Column
	String name;

	@Column
	String brand;

	@Column
	Boolean isVegan;

	@Column
	Boolean isVegetarian;

	@Column
	Boolean isGlutenFree;
	
	@Column
	Double price;
	
	@Column
	String description;
	
	@Column
	String urlImage;

	
	public Product() {

	}

	public Product(Long product_id, String name, String brand, Boolean isVegan, Boolean isVegetarian,
			Boolean isGlutenFree, Double price, String description, String urlImage) {
		super();
		this.productId = product_id;
		this.name = name;
		this.brand = brand;
		this.isVegan = isVegan;
		this.isVegetarian = isVegetarian;
		this.isGlutenFree = isGlutenFree;
		this.price = price;
		this.description = description;
		this.urlImage = urlImage;
	}
	
	public Product(ProductDTOCreateUpdate product) {
		this.name = product.getName();
		this.brand = product.getBrand();
		this.isVegan = product.getIsVegan();
		this.isVegetarian = product.getIsVegetarian();
		this.isGlutenFree = product.getIsGlutenFree();
		this.price = product.getPrice();
		this.description = product.getDescription();
		this.urlImage = product.getUrlImage();
	}
	
	public Long getId() {
		return productId;
	}

	public void setId(Long product_id) {
		this.productId = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Boolean getIsVegan() {
		return isVegan;
	}

	public void setIsVegan(Boolean isVegan) {
		this.isVegan = isVegan;
	}

	public Boolean getIsVegetarian() {
		return isVegetarian;
	}

	public void setIsVegetarian(Boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

	public Boolean getIsGlutenFree() {
		return isGlutenFree;
	}

	public void setIsGlutenFree(Boolean isGlutenFree) {
		this.isGlutenFree = isGlutenFree;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

}
