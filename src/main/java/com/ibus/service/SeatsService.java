package com.ibus.service;

import com.ibus.entity.Seats;
import com.ibus.repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsService {


    @Autowired
    private SeatsRepository seatsRepository;

    public List<Seats> buscarTodos() {
        return seatsRepository.findAll();
    }

    public Seats inserir(Seats seats) {
        return seatsRepository.save(seats);
    }

    public Seats alterar(Seats seats) {
        return seatsRepository.save(seats);
    }

    public void excluir(Long id) {
        Seats seats = seatsRepository.findById(id).orElse(null);
        if (seats != null) {
            seatsRepository.delete(seats);
        }
    }
}
