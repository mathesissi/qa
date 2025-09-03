package br.edu.ifsp.demo_clean.service;

import org.springframework.stereotype.Service;

import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.repository.CarroRepository;

import java.util.*;

@Service
public class CarroService {

    private CarroRepository repositorioDoCarro;
    public CarroService(CarroRepository carroRepository){
    	setRepositorioDoCarro(carroRepository);
    }

    public void adicionarCarro(Carro carro){repositorioDoCarro.save(carro);}
    public List<Carro> Carros(){return repositorioDoCarro.findAll();}

	public CarroRepository getRepositorioDoCarro() {
		return repositorioDoCarro;
	}

	public void setRepositorioDoCarro(CarroRepository repositorioDoCarro) {
		this.repositorioDoCarro = repositorioDoCarro;
	}
}
