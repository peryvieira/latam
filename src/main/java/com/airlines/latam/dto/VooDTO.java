package com.airlines.latam.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class VooDTO {
    @NotBlank(message = "avião não informado")
    private Long aviao_id;
    @NotBlank(message = "partida não informada")
    private Long aeroporto_partida_id;
    @NotBlank(message = "chegada não informada")
    private Long aeroporto_chegada_id;
    private LocalDate dataPartida;
    private LocalDate dataChegada;
    private BigDecimal valorViagem;
}
