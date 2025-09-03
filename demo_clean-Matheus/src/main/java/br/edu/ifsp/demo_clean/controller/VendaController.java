package br.edu.ifsp.demo_clean.controller;

import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.demo_clean.model.Venda;
import br.edu.ifsp.demo_clean.service.VendaService;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@RequestMapping("/api")
@Tag(name = "Consumer ", description = "Responsável por controlar as replicações das tabelas")

public class VendaController {

    private VendaService serviceVenda;

    public VendaController(VendaService service){this.serviceVenda=service;}

    @PostMapping("/venda")
    public String salvaVenda(@RequestBody Venda venda){serviceVenda.adicionarVenda(venda); return "ok venda";}

    @GetMapping("/venda")
    public List<Venda> listarVendas(){return serviceVenda.Vendas();}
}