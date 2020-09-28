package com.learning.project.pizza.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Table(name = "PIZZA_ITEMS")
public class Items {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Type")
    private String type;

    @Column(name = "Category")
    private String category;

    @Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "itemId") //foreign key field (itemId) in Pricing class
    private Set<Pricing> pricingSet;
}
