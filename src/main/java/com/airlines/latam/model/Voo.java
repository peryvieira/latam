package com.airlines.latam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "aviao_id", nullable = false, referencedColumnName = "id")
    private Aviao aviao;

    @OneToOne
    @JoinColumn(name = "aeroporto_partida_id", nullable = false)
    private Aeroporto partida;

    @OneToOne
    @JoinColumn(name = "aeroporto_chegada_id", nullable = false)
    private Aeroporto chegada;

    private LocalDate data_partida;
    private LocalDate data_chegada;
    private Integer quantidade_clientes;
    private BigDecimal peso_carga;
    private BigDecimal valor_viagem;

}
