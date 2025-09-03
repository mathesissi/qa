package br.edu.ifsp.demo_clean.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String nomeCliente;
    @OneToMany
    public List<Carro> carros = new ArrayList<>();

    public Cliente(){}

    public Cliente(String nome){
        nomeCliente=nome;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
    
}
