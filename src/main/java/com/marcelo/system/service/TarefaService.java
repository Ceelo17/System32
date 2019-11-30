package com.marcelo.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.system.domain.TarefaDomain;
import com.marcelo.system.repository.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository repo;

	public TarefaDomain inserir(TarefaDomain td) {
		return repo.save(td);
	}

	public List<TarefaDomain> listar(TarefaDomain td) {
		return repo.findAll();
	}

	public TarefaDomain listarPorId(Long id) {
		Optional<TarefaDomain> td = repo.findById(id);
		return td.orElseThrow(null);
	}

	public TarefaDomain editar(TarefaDomain td) {
		listarPorId(td.getId());
		return repo.save(td);
	}

	public void deletar(Long id) {
		repo.delete(listarPorId(id));
	}

}
