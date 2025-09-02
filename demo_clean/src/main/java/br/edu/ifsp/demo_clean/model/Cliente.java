package br.edu.ifsp.demo_clean.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idd;

    public String nm;

    @OneToMany(mappedBy="cli")
    public List<Carro> carros = new ArrayList<>();

    public Cliente(){}

    public Cliente(String n){
        nm=n;
    }
}
