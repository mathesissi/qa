package br.edu.ifsp.demo_clean.controller;

import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.service.CarroService;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Consumer ", description = "Responsável por controlar as replicações das tabelas")

public class CarroController {

    private CarroService serviceCarro;

    public CarroController(CarroService service){this.serviceCarro=service;}

    @PostMapping("/carro")
    public String salvarCarro(@RequestBody Carro carro){serviceCarro.adicionarCarro(carro);return "ok carro";}

    @GetMapping("/carro")
    public List<Carro> listarCarros(){return serviceCarro.Carros();}

}