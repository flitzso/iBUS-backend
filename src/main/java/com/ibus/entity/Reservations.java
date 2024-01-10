package com.ibus.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reservations")
@Data
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer reservation_id;
    private Integer user_id;
    private Integer trip_id;
    private Integer seat_id;
    private Integer dataHoraReserva;
    private String statusRserva;
    private String otherinfo;

    public Integer getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(Integer reservation_id) {
        this.reservation_id = reservation_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(Integer trip_id) {
        this.trip_id = trip_id;
    }

    public Integer getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Integer seat_id) {
        this.seat_id = seat_id;
    }

    public Integer getDataHoraReserva() {
        return dataHoraReserva;
    }

    public void setDataHoraReserva(Integer dataHoraReserva) {
        this.dataHoraReserva = dataHoraReserva;
    }

    public String getStatusRserva() {
        return statusRserva;
    }

    public void setStatusRserva(String statusRserva) {
        this.statusRserva = statusRserva;
    }

    public String getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo;
    }
}
