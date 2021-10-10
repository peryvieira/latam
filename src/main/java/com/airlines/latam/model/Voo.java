package com.airlines.latam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.airlines.latam.model.Aeroporto;
import com.airlines.latam.model.Aviao;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "aviao_id", nullable = false)
    private Aviao aviao;

    @OneToOne
    @JoinColumn(name = "aeroporto_partida_id", nullable = false)
    private Aeroporto partida;

    @OneToOne
    @JoinColumn(name = "aeroporto_chegada_id", nullable = false)
    private Aeroporto chegada;

    private LocalDate dataPartida;
    private LocalDate dataChegada;
    private Integer quantidadeClientes;
    private BigDecimal pesoCarga;
    private BigDecimal valorViagem;
}
