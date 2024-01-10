package com.ibus.controller;

import com.ibus.entity.Reservations;
import com.ibus.entity.User;
import com.ibus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
@CrossOrigin
public class ReservationsController {

    @Autowired
    private UserService userService;

    @GetMapping("/reservations")
    public List<Reservations> buscarTodos() {
        return reservationsService.buscarTodos();
    }

    @PostMapping
    public Reservations inserir(@RequestBody Reservations reservations) {
        return reservationsService.inserir(reservations);
    }

    @PutMapping
    public Reservations alterar(@RequestBody Reservations reservations){
        return reservationsService.alterar(reservations);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        userService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
