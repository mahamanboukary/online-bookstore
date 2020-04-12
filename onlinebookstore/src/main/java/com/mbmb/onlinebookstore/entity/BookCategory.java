package com.mbmb.onlinebookstore.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_category")
@Setter
@Getter
@ToString
public class BookCategory implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "category_name")
	private String categoryName;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="category" )
	private Set<Book> book; 

}
