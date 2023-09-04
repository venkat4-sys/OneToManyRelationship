package com.getinfy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Product_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
	
	@Id
	private Integer id;
	
	private String ProductName;

}
