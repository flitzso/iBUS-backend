package com.ibus.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "trips")
@Data
public class Trips {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String origem;
    private String destino;
    private Integer dataHoraPartida;
    private Integer dataHoraChegada;
    private Integer precoPassagem;
    private String otherInformations;

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(Integer dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public Integer getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(Integer dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public Integer getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(Integer precoPassagem) {
        this.precoPassagem = precoPassagem;
    }

    public String getOtherInformations() {
        return otherInformations;
    }

    public void setOtherInformations(String otherInformations) {
        this.otherInformations = otherInformations;
    }
}
