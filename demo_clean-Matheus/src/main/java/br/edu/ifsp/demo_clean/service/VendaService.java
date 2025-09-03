package br.edu.ifsp.demo_clean.service;

import org.springframework.stereotype.Service;

import br.edu.ifsp.demo_clean.model.Venda;
import br.edu.ifsp.demo_clean.repository.VendaRepository;

import java.util.*;

@Service
public class VendaService {

    private VendaRepository repositorioDaVenda;

    public void adicionarVenda(Venda venda){repositorioDaVenda.save(venda);}
    public List<Venda> Vendas(){return repositorioDaVenda.findAll();}

	public VendaRepository getRepositorioDaVenda() {
		return repositorioDaVenda;
	}

	public void setRepositorioDaVenda(VendaRepository repositorioDaVenda) {
		this.repositorioDaVenda = repositorioDaVenda;
	}
}
