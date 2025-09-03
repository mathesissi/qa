package br.edu.ifsp.demo_clean.service;

import org.springframework.stereotype.Service;

import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.repository.ClienteRepository;

import java.util.*;

@Service
public class ClienteService {

    private ClienteRepository repositorioDoCliente;

    public void ServiceCliente(ClienteRepository ClienteRepository){
    	setRepositorioDoCliente(ClienteRepository); 
    }

    public void adicionarCliente(Cliente cliente){repositorioDoCliente.save(cliente);}
    public List<Cliente> Clientes(){return repositorioDoCliente.findAll();}

   

	public ClienteRepository getRepositorioDoCliente() {
		return repositorioDoCliente;
	}

	public void setRepositorioDoCliente(ClienteRepository repositorioDoCliente) {
		this.repositorioDoCliente = repositorioDoCliente;
	}
}
