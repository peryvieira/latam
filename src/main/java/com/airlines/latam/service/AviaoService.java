package com.airlines.latam.service;

import com.airlines.latam.model.Aviao;

import java.util.List;
import java.util.Optional;

public interface AviaoService {

    List<Aviao> findAll();

    Optional<Aviao> findById(Long id);

    Optional<Aviao> findByModelo(String modelo);

    Aviao save(Aviao aviao);

    void delete(Long id);
}
