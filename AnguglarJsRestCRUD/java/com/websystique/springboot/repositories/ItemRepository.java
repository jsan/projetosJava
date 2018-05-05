package com.websystique.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websystique.springboot.model.User;

public interface ItemRepository extends JpaRepository<User, Long>{
	

}
