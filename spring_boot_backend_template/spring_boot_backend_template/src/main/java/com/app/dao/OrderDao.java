package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Order;

public interface OrderDao extends JpaRepository<Order,Integer> {

}
