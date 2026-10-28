package com.tp1.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Provider extends User {

    private String matricule;
    private String service;
    private String company;

    @OneToMany(mappedBy = "provider")
    private List<Product> products = new ArrayList<>();
}
