package com.learning.project.pizza.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    @Id
    @Column(name = "ID")
    private int iD;

    @Column(name = "OrderId")
    private int orderId;

    @Column(name = "PRICEID")
    private int pRICEID;
}
