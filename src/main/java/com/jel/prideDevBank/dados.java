package com.jel.prideDevBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jel.prideDevBank.entity.ClienteEntity;
import com.jel.prideDevBank.repository.ClienteRepository;

@Service
public class dados {
	
	@Autowired
	ClienteEntity clienteEntity;
	
	@Autowired
	ClienteRepository clienteRepository;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clienteEntity = clienteRepository
		
	}

}