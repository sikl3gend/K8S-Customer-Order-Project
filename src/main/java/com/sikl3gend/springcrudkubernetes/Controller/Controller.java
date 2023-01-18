package com.sikl3gend.springcrudkubernetes.Controller;


import com.sikl3gend.springcrudkubernetes.Model.OrderModel;
import com.sikl3gend.springcrudkubernetes.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class Controller {

    @Autowired
    private OrderService service;




    @PostMapping
    public OrderModel saveOrder(@RequestBody OrderModel order){
        return service.saveOrder(order);
    }

    @GetMapping
    public List<OrderModel> getOrders(){
        return service.getOrders();
    }

    @GetMapping("/{id}")
    public OrderModel getOrderById(@PathVariable int id){
        return service.getOrderById(id);
    }


}
