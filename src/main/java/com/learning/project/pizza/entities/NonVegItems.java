package com.learning.project.pizza.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("NonVeg")
public class NonVegItems extends Items{
    @Override
    public String toString() {
        return "NonVegItems{ "+ super.toString() +" }";
    }
}