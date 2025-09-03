package br.edu.ifsp.demo_clean.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int codigoDeVenda;

    @ManyToOne
    public Cliente proprietario;

    @ManyToOne
    public Carro veiculo;

    public LocalDate data;

    public Venda(){}

    public Venda(Cliente cliente, Carro carro){
        proprietario=cliente; veiculo=carro; data=LocalDate.now();
    }

	public int getCodigoDeVenda() {
		return codigoDeVenda;
	}

	public void setCodigoDeVenda(int codigoDeVenda) {
		this.codigoDeVenda = codigoDeVenda;
	}

	public Cliente getProprietario() {
		return proprietario;
	}

	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}

	public Carro getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Carro veiculo) {
		this.veiculo = veiculo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
    
}