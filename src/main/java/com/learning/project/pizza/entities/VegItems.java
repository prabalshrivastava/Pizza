package com.learning.project.pizza.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Veg")
public class VegItems extends Items {
    @Override
    public String toString() {
        return "VegItems{ " + super.toString() + " }";
    }
}
