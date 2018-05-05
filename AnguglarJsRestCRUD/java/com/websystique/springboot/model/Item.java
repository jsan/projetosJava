package com.websystique.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name="Item")
@Table(name="APP_ITEM")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_item;

	@NotEmpty
	@Column(name="NAME", nullable=false)
	private String name;
	
//	@ManyToOne
//	@JoinColumn(name="id_user")
//	private User user;
//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public Long getId_item() {
		return id_item;
	}

	public void setId_item(Long id_item) {
		this.id_item = id_item;
	}

}
