package com.microserice.orderservice.repository;

import com.microserice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepostory extends JpaRepository<Order,Long> {
}
