package com.ibus.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "seats")
@Data
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer seat_id;
    private Integer bus_id;
    private Integer numberSeat;
    private String status;
    private String informarionSeat;

    public Integer getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Integer seat_id) {
        this.seat_id = seat_id;
    }

    public Integer getBus_id() {
        return bus_id;
    }

    public void setBus_id(Integer bus_id) {
        this.bus_id = bus_id;
    }

    public Integer getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(Integer numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInformarionSeat() {
        return informarionSeat;
    }

    public void setInformarionSeat(String informarionSeat) {
        this.informarionSeat = informarionSeat;
    }
}
