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
public class Customers {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Password")
    private String password;

    @Column(name = "Mobile")
    private String mobile;

    @Column(name = "Address")
    private String address;

    @Column(name = "Email")
    private String email;
}