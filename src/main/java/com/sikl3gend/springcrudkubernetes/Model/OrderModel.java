package com.sikl3gend.springcrudkubernetes.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Orders_Table")
public class OrderModel {

    @GeneratedValue
    @Id
    private int id;
    private String name;
    private int orderNumber;
    private int quantity;
    private double price;

}
