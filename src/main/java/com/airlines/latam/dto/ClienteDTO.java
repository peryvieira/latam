package com.airlines.latam.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class ClienteDTO {
    @NotBlank(message = "Nome não informado")
    private String nome;
    @NotBlank(message = "CPF não informado")
    private String cpf;
}
