package com.airlines.latam.service;

import com.airlines.latam.model.Passagem;

import java.util.List;
import java.util.Optional;

public interface PassagemService {

    List<Passagem> findAll();

    Optional<Passagem> findById(Long id);

    Passagem save(Passagem passagem);

    void delete(Long id);
}
