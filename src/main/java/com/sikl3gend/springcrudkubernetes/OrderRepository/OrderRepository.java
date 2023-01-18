package com.sikl3gend.springcrudkubernetes.OrderRepository;

import com.sikl3gend.springcrudkubernetes.Model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Integer> {
}
