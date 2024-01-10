package com.ibus.service;


import com.ibus.entity.Trips;
import com.ibus.repository.TripsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TripsService {

    @Autowired
    private TripsRepository tripsRepository;

    public List<Trips> buscarTodos() {
        return tripsRepository.findAll();
    }

    public Trips inserir(Trips trips) {
        return tripsRepository.save(trips);
    }

    public Trips alterar(Trips trips) {
        return tripsRepository.save(trips);
    }

    public void excluir(Long id) {
        Trips trips = tripsRepository.findById(id).orElse(null);
        if (trips != null) {
            tripsRepository.delete(trips);
        }
    }
}
