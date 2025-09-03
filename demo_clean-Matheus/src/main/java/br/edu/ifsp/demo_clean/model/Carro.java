package br.edu.ifsp.demo_clean.model;

import jakarta.persistence.*;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Codigo;
    public String nomeVeiculo;
    public String cor;
    public double valor;

    public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


    public Carro(){}

    public Carro(String nome, String corDesejada, double preco){
    	nomeVeiculo=nome; cor=corDesejada; valor=preco;
    }
}

