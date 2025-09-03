package br.edu.ifsp.demo_clean.controller;

import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.service.ClienteService;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Consumer ", description = "Responsável por controlar as replicações das tabelas")

public class ClienteController {

    private ClienteService serviceCliente;

    public ClienteController(ClienteService service){this.serviceCliente=service;}

    @PostMapping("/cliente")
    public String salvaCli(@RequestBody Cliente cliente){serviceCliente.adicionarCliente(cliente); return "ok cliente";}

    @GetMapping("/cliente")
    public List<Cliente> listarClientes(){return serviceCliente.Clientes();}

}