package com.websystique.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByName(String name);

	@Query("SELECT a FROM User a WHERE a.age >= :age") 
	List<User> findByAge(@Param("age") int age);
	
	
	
}
