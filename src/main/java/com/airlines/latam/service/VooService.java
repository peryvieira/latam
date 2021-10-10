package com.airlines.latam.service;

import com.airlines.latam.model.Voo;

import java.util.List;
import java.util.Optional;

public interface VooService {

    List<Voo> findAll();

    Optional<Voo> findById(Long id);

    Voo save(Voo voo);

    void delete(Long id);
}
