package com.ibus.service;

import com.ibus.entity.Buses;
import com.ibus.repository.BusesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusesService {

    @Autowired
    private BusesRepository busesRepository;

    public List<Buses> buscarTodos() {
        return busesRepository.findAll();
    }

    public Buses inserir(Buses buses) {
        // Implement your logic for inserting
        return busesRepository.save(buses); // Assuming you have a save method in the repository
    }

    public Buses alterar(Buses buses) {
        // Implement your logic for updating
        return busesRepository.save(buses); // Assuming you have a save method in the repository
    }

    public void excluir(Long id) {
        Buses buses = busesRepository.findById(id).orElse(null);
        if (buses != null) {
            busesRepository.delete(buses);
        }
    }
}

