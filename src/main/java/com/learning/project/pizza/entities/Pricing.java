package com.learning.project.pizza.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "piZZA_pRIciNg")
public class Pricing {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "ITEMID")
    private int itemId;

    @Column(name = "SIZES")
    private String sizes;

    @Column(name = "Price")
    private double price;
}
