package com.airlines.latam.repository;

import com.airlines.latam.model.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VooRepository extends JpaRepository<Voo,Long> {
}
