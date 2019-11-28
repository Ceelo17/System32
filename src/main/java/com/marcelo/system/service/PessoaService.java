package com.marcelo.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.system.domain.PessoaDomain;
import com.marcelo.system.repository.PessoaRepository;

@Service
public class PessoaService {

	// Declarar objeto para acesso a dados
	// Método para instanciar automáticamente
	@Autowired
	private PessoaRepository repo;

	public PessoaDomain inserir(PessoaDomain ps) {
		ps.setCodigo(null);
		return repo.save(ps);
	}
	
	public List<PessoaDomain> listar(PessoaDomain ps) {
		return repo.findAll();
	}

}
