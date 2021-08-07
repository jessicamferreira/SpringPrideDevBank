package com.jel.prideDevBank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jel.prideDevBank.entity.ClienteEntity;
import com.jel.prideDevBank.services.ClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteService service; 
	
	
	@GetMapping(value = "/cliente", consumes = "application/json", produces="application/json")
	public ResponseEntity<ClienteEntity> criarCliente(@RequestBody ClienteEntity cliente) {
		ClienteEntity clienteResponse = service.criarNovoCliente(cliente);
		java.net.URI uri = java.net.URI.create("/cliente/" + cliente.getId());
		return ResponseEntity.created(uri).body(clienteResponse);
}
	
	@GetMapping("/cliente/{id}")
	public ClienteEntity consultaCliente(@PathVariable Integer id) {
		ClienteEntity cliente = service.pesquisaCliente(id); 
		
		return cliente;
	}
}
