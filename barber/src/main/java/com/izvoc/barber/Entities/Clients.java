package com.izvoc.barber.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.util.Objects;

@Table( name="tb_clients")
@Entity
public class Clients {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long Id;


    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String CPF;


    public Clients(){}

    public Clients(Long id, String email, String name, String CPF) {
        Id = id;
        this.email = email;
        this.name = name;
        this.CPF = CPF;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Long getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Clients clients)) return false;
        return Objects.equals(getId(), clients.getId()) && Objects.equals(getName(),
                clients.getName()) && Objects.equals(getEmail(),
                clients.getEmail()) && Objects.equals(getCPF(),
                clients.getCPF());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getCPF());
    }

    @Override
    public String toString() {
        return "Clients{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + CPF + '\'' +
                '}';
    }
}
