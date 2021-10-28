package com.airlines.latam.controller;

import com.airlines.latam.dto.ClienteDTO;
import com.airlines.latam.exception.ClienteNotFoundException;
import com.airlines.latam.model.Cliente;
import com.airlines.latam.service.impl.ClienteServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/cliente")
public class ClienteController {
    private final ClienteServiceImpl clienteService;

    public ClienteController(ClienteServiceImpl clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) throws ClienteNotFoundException {
        return ResponseEntity.ok().body(clienteService.findById(id).orElseThrow(() -> new ClienteNotFoundException(id.toString())));
    }

    @PostMapping
    public ResponseEntity<Cliente> postCliente(@RequestBody @Valid ClienteDTO clienteDTO){
        Cliente cliente = Cliente.builder()
                .nome(clienteDTO.getNome())
                .cpf(clienteDTO.getCpf()).build();

        return ResponseEntity.ok().body(clienteService.save(cliente));
    }
}
