package com.airlines.latam.service.impl;

import com.airlines.latam.model.Aviao;
import com.airlines.latam.repository.AviaoRepository;
import com.airlines.latam.service.AviaoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AviaoServiceImpl implements AviaoService {

    private final AviaoRepository aviaoRepository;

    public AviaoServiceImpl(AviaoRepository aviaoRepository) {
        this.aviaoRepository = aviaoRepository;
    }

    @Override
    public List<Aviao> findAll() {
        return aviaoRepository.findAll();
    }

    @Override
    public Optional<Aviao> findById(Long id) {
        return aviaoRepository.findById(id);
    }

    @Override
    public Optional<Aviao> findByModelo(String modelo) {
        return aviaoRepository.findByModelo(modelo);
    }

    @Override
    public Aviao save(Aviao aviao) {
        return aviaoRepository.save(aviao);
    }

    @Override
    public void delete(Long id) {
        aviaoRepository.deleteById(id);
    }
}
