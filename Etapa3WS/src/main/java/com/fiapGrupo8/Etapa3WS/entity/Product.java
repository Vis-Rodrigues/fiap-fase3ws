package com.fiapGrupo8.Etapa3WS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fiapGrupo8.Etapa3WS.dto.ProductDTOCreateUpdate;

@Entity
@Table(name = "TB_PRODUCTS")
public class Product {
	
	public Product() {
		
	}
	
	public Product(ProductDTOCreateUpdate product) {
		this.name = product.getName();
		this.brand = product.getBrand();
		this.isVegan = product.getIsVegan();
		this.isVegetarian = product.getIsVegetarian();
		this.isGlutenFree = product.getIsGlutenFree();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	
	
}
