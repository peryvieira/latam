package com.airlines.latam.service.impl;

import com.airlines.latam.model.Passagem;
import com.airlines.latam.repository.PassagemRepository;
import com.airlines.latam.service.PassagemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassagemServiceImpl implements PassagemService {

    private final PassagemRepository passagemRepository;

    public PassagemServiceImpl(PassagemRepository passagemRepository){
        this.passagemRepository = passagemRepository;
    }
    @Override
    public List<Passagem> findAll() {
        return passagemRepository.findAll();
    }

    @Override
    public Optional<Passagem> findById(Long id) {
        return passagemRepository.findById(id);
    }

    @Override
    public Passagem save(Passagem passagem) {
        return passagemRepository.save(passagem);
    }

    @Override
    public void delete(Long id) {
        passagemRepository.deleteById(id);
    }
}
