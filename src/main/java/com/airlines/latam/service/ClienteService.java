package com.airlines.latam.service;

import com.airlines.latam.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> findAll();

    Optional<Cliente> findById(Long id);

    Optional<Cliente> findByCpf(String cpf);

    Cliente save(Cliente cliente);

    void delete(Long id);
}
