package com.learning.project.pizza.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "CustomerId")
    private int customerId;

    @Column(name = "OrderTime")
    private Instant orderTime;

    @Column(name = "STATUS")
    private int status;
}
