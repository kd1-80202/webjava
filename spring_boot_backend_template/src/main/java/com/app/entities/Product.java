












































//package com.app.entities;
//
//
//import java.time.LocalDate;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//@Entity
//@Table(name="products")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString(callSuper = true)
//public class Product extends BaseEntity {
//	
//	@Column(name="name",unique=true)
//	private String name;
//	
//	@Column(name="description",length=20)
//	private String description;
//	
//
//	
//	@Column(name="price")
//	private double price;
//	
//	@Column(name="availableStock")
//	private int availableStock;
//	
//	@Column(name="expDate",length=20)
//	private LocalDate expiryDate;
//
//	
//	@ManyToOne
//	@JoinColumn(name="category_id",nullable=false)
//	private Category productCategory;
//
//
////	@Enumerated(EnumType.STRING)
//	@Column(name="category",length=20)
//	private CategoryType category;
//	
//	
//	
//
//}
