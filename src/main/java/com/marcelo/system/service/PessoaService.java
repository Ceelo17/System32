package com.marcelo.system.service;

import java.util.List;
import java.util.Optional;

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
		ps.setId(null);
		return repo.save(ps);
	}

	public List<PessoaDomain> listar() {
		return repo.findAll();
	}

	// Utiliza o Optional no método pois pode retornar nulo

	public PessoaDomain listarPorId(Integer id) {
		Optional<PessoaDomain> ps = repo.findById(id);
		return ps.orElse(null);
	}

	// Utiliza o método listarPorId para pegar o Id e utilizar no método editar

	public PessoaDomain editar(PessoaDomain ps) {
		listarPorId(ps.getId());
		return repo.save(ps);
	}

}
