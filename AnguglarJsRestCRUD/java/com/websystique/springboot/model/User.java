package com.websystique.springboot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="APP_USER")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@NotEmpty
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="AGE", nullable=false)
	private int age;
	
	@Column(name="SALARY", nullable=false)
	private String salary;
	
// @OneToMany(mappedBy = "user", targetEntity = Item.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
// @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//	 @OneToMany(cascade = CascadeType.PERSIST, mappedBy="user")
// 	 private List<Item> itens = new ArrayList<>();
	
	
//	@Column(name="ITEM", nullable=false)	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

//	public List<Item> getItens() {
//		return itens;
//	}
//
//	public void setItens(List<Item> itens) {
//		this.itens = itens;
//	}
		
	
}
