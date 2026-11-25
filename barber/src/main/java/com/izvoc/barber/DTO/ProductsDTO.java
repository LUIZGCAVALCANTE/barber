package com.izvoc.barber.DTO;

public class ProductsDTO {
    private Long id;
    private String name;
    private Double price;

    public ProductsDTO(){}

    public ProductsDTO(String name, Long id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public Long getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public Double getPrice() {
        return price;
    }


}
