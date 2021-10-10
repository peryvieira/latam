package com.airlines.latam.service.impl;

import com.airlines.latam.model.Voo;
import com.airlines.latam.repository.VooRepository;
import com.airlines.latam.service.VooService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VooServiceImpl implements VooService {

    private final VooRepository vooRepository;

    public VooServiceImpl(VooRepository vooRepository){
        this.vooRepository = vooRepository;
    }
    @Override
    public List<Voo> findAll() {
        return vooRepository.findAll();
    }

    @Override
    public Optional<Voo> findById(Long id) {
        return vooRepository.findById(id);
    }

    @Override
    public Voo save(Voo voo) {
        return vooRepository.save(voo);
    }

    @Override
    public void delete(Long id) {
        vooRepository.deleteById(id);
    }
}
