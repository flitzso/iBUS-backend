package com.ibus.controller;


import com.ibus.entity.Buses;
import com.ibus.service.BusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
@CrossOrigin
public class BusesController {

    @Autowired
    private BusesService busesService;

    @GetMapping("/buses")
    public List<Buses> buscarTodos() {
        return busesService.buscarTodos();
    }

    @PostMapping
    public Buses inserir(@RequestBody Buses buses) {
        return busesService.inserir(buses);
    }

    @PutMapping
    public Buses alterar(@RequestBody Buses buses){
        return busesService.alterar(buses);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        busesService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
