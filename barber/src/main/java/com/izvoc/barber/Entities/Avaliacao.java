package com.izvoc.barber.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Avaliacao {


    @Id
    private Long id;

    private String avaliacao;



    public Avaliacao(){


    }

    public Avaliacao(Long id, String avaliacao) {
        this.id = id;
        this.avaliacao = avaliacao;
    }

    public Long getId() {
        return id;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Avaliacao avaliacao1)) return false;
        return Objects.equals(getId(), avaliacao1.getId()) && Objects.equals(getAvaliacao(), avaliacao1.getAvaliacao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAvaliacao());
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id=" + id +
                ", avaliacao='" + avaliacao + '\'' +
                '}';
    }
}
