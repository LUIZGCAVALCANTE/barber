package com.izvoc.barber.Entities;



import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table( name="tb_products")
public class Products {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    @Column(nullable = false)
    private String name;
    private Double price;



    public Products(){


    }

    public Products(Long id, String name, Double price){
        this.id= id;
        this.name=name;
        this.price=price;


    }

    @Override
    public String toString() {
        return "Produtos{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Products products)) return false;
        return Objects.equals(getId(), products.getId()) && Objects.equals(getName(), products.getName()) && Objects.equals(getPrice(), products.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
