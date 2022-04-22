package com.airlines.latam.controller;

import com.airlines.latam.dto.VooDTO;
import com.airlines.latam.model.Voo;
import com.airlines.latam.service.impl.VooServiceImpl;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/voo")
public class VooController {
    private final VooServiceImpl vooService;

    public VooController(VooServiceImpl vooService) {
        this.vooService = vooService;
    }

    @GetMapping("/{vooId}")
    public ResponseEntity<Voo> getVooById(@PathVariable Long vooId){
        return ResponseEntity.ok(vooService.findById(vooId).get());
    }

    @PostMapping
    public ResponseEntity<Voo> createVoo(@RequestBody @Valid Voo voo){
        return ResponseEntity.ok(vooService.save(voo));
    }
}
