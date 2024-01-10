package com.ibus.repository;

import com.ibus.entity.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationsRepository extends JpaRepository<Reservations, Long> {

}
