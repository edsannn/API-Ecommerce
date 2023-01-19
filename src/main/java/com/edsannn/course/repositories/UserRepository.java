package com.edsannn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edsannn.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{	
	
	
}


