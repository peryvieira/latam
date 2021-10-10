package com.airlines.latam.repository;

import com.airlines.latam.model.Aeroporto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AeroportoRepository extends JpaRepository<Aeroporto,Long> {
    Optional<Aeroporto> findByCidade(String cidade);
}
