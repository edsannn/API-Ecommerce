package com.edsannn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edsannn.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
