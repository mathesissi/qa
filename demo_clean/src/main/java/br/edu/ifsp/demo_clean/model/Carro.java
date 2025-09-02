package br.edu.ifsp.demo_clean.model;

import jakarta.persistence.*;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int cod;

    public String nome;
    public String cor;
    public double valor;

    @ManyToOne
    public Cliente cli; //nome confuso de cliente

    public Carro(){}

    public Carro(String n, String c, double v, Cliente cl){
        nome=n; cor=c; valor=v; cli=cl;
    }
}

