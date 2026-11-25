package com.izvoc.barber.DTO;

public class ClientsDTO {
private Long id;
private String name;
private String email;
private String CPF;



public ClientsDTO(){

}

    public ClientsDTO(Long id, String name, String email, String CPF) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.CPF = CPF;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCPF() {
        return CPF;
    }
}
