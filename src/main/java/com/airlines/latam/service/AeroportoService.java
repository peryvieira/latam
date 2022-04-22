package com.airlines.latam.service;

import com.airlines.latam.model.Aeroporto;

import java.util.List;
import java.util.Optional;

public interface AeroportoService   {
    List<Aeroporto> findAll();

    Optional<Aeroporto> findById(Long id);

    Optional<Aeroporto> findByCidade(String cidade);

    Optional<Aeroporto> findBySigla(String sigla);

    Aeroporto save(Aeroporto aeroporto);

    void deleteById(Long id);
}
