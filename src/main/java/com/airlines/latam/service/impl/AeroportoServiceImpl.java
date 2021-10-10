package com.airlines.latam.service.impl;

import com.airlines.latam.model.Aeroporto;
import com.airlines.latam.repository.AeroportoRepository;
import com.airlines.latam.service.AeroportoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AeroportoServiceImpl implements AeroportoService {

    private final AeroportoRepository aeroportoRepository;

    public AeroportoServiceImpl(AeroportoRepository aeroportoRepository) {
        this.aeroportoRepository = aeroportoRepository;
    }

    @Override
    public List<Aeroporto> findAll() {
        return aeroportoRepository.findAll();
    }

    @Override
    public Optional<Aeroporto> findById(Long id) {
        return aeroportoRepository.findById(id);
    }

    @Override
    public Optional<Aeroporto> findByCidade(String cidade) {
        return aeroportoRepository.findByCidade(cidade);
    }

    @Override
    public Aeroporto save(Aeroporto aeroporto) {
        return aeroportoRepository.save(aeroporto);
    }

    @Override
    public void deleteById(Long id) {
        aeroportoRepository.deleteById(id);
    }
}
