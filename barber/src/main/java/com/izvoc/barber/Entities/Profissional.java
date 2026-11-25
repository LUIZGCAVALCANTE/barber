package com.izvoc.barber.Entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="tb_profissionais")
public class Profissional {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String CPF;

    public Profissional(){

    }

    public Profissional(Long id, String name, String email, String CPF) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Profissional that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getCPF(), that.getCPF());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getCPF());
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + CPF + '\'' +
                '}';
    }
}
