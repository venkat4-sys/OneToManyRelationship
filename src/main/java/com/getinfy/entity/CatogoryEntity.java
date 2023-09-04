package com.getinfy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Category_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatogoryEntity {

	@Id
	private Integer categoryId;

	private String name;

	private Double price;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "productId_fk", referencedColumnName = "categoryId")
	private List<ProductEntity> lstofProducts;

}
