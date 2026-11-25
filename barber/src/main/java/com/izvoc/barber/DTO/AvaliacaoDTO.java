package com.izvoc.barber.DTO;

public class AvaliacaoDTO {
    private Long id;

    private String avaliacao;


    public AvaliacaoDTO (){}


    public AvaliacaoDTO(Long id, String avaliacao) {
        this.id = id;
        this.avaliacao = avaliacao;
    }


    public Long getId() {
        return id;
    }

    public String getAvaliacao() {
        return avaliacao;
    }
}
