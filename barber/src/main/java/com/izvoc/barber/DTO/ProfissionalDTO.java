package com.izvoc.barber.DTO;

public class ProfissionalDTO {
    private Long id;
    private String name;
    private String email;
    private String CPF;

    public ProfissionalDTO(){}

    public ProfissionalDTO(Long id, String name, String email, String CPF) {
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


