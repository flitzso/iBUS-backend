package com.ibus.service;

import com.ibus.entity.Reservations;
import com.ibus.entity.User;
import com.ibus.repository.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservationsService {

    @Autowired
    private ReservationsRepository  reservationsRepository;

    public List<Reservations> buscarTodos() {
        return reservationsRepository.findAll();
    }

    public Reservations inserir(Reservations reservations){
        reservations.setDataCriacao(LocalDateTime.now());
        Reservations reservationsNew = reservationsRepository.saveAndFlush(reservations);
        return reservationsNew;
    }

    public User alterar(User user){
        user.setDataAtualizacao(LocalDateTime.now());
        return userRepository.saveAndFlush(user);
    }

    public void excluir(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            userRepository.delete(user);
        }
    }
}
