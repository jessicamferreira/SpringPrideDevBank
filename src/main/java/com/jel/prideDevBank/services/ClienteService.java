package com.jel.prideDevBank.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jel.prideDevBank.entity.ClienteEntity;
import com.jel.prideDevBank.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	ClienteEntity cliente;
	
	public ClienteEntity criarNovoCliente(ClienteEntity cliente) {
		
		clienteRepository.save(cliente);
		
		return cliente;
	}
public ClienteEntity pesquisaCliente(Integer id) {
		Optional<ClienteEntity> clienteOptional = clienteRepository.findById(id);
		
		if(clienteOptional.isPresent()) {
			return clienteOptional.get();
		} else {
			return null;
		}
}
}
