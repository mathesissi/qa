package br.edu.ifsp.demo_clean.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int codVenda;

    @ManyToOne
    public Cliente comprador;

    @ManyToOne
    public Carro carro;

    public LocalDate data;

    public Venda(){}

    public Venda(Cliente c, Carro ca){
        comprador=c; carro=ca; data=LocalDate.now();
    }
}