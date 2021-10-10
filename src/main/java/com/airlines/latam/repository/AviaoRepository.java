package com.airlines.latam.repository;

import com.airlines.latam.model.Aviao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AviaoRepository extends JpaRepository<Aviao,Long> {
    Optional<Aviao> findByModelo(String modelo);
}
