package com.sikl3gend.springcrudkubernetes.Service;

import com.sikl3gend.springcrudkubernetes.Model.OrderModel;
import com.sikl3gend.springcrudkubernetes.OrderRepository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;



    public OrderModel saveOrder(OrderModel order){
        return orderRepository.save(order);
    }

    public List<OrderModel> getOrders(){
        return orderRepository.findAll();
    }

    public OrderModel getOrderById(int id){
        return orderRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Invalid id: "+ id));
    }

}
