package com.marcelo.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marcelo.system.domain.PessoaDomain;
import com.marcelo.system.domain.TarefaDomain;
import com.marcelo.system.service.PessoaService;
import com.marcelo.system.service.TarefaService;

@Controller
@RequestMapping("/tarefa")
public class TarefaController {

	@Autowired
	private TarefaService serviceT;

	@Autowired
	private PessoaService service;

	@RequestMapping(value = "/{id}")
	public ModelAndView formulario(@PathVariable("id") Long id, TarefaDomain td, PessoaDomain ps, Model model) {
		List<TarefaDomain> listaTarefas = serviceT.listar(td);
		List<PessoaDomain> listaPessoas = service.listar();
		model.addAttribute("tarefas", listaTarefas);
		model.addAttribute("pessoas", listaPessoas);
		return new ModelAndView("TarefaCadastro");
	}

	@RequestMapping(value = "/cadastrar/{id}", method = RequestMethod.POST)
	public String cadastrar(@PathVariable("id") Long id, TarefaDomain td, Model model) {
		model.addAttribute("descricao", td.getDescricao());
		model.addAttribute("titulo", td.getTitulo());
		model.addAttribute("dataExpiracao", td.getDataExpiracao());
		model.addAttribute("concluido", td.isConcluida());

		PessoaDomain pessoa = service.listarPorId(id);
		model.addAttribute("pessoa", td.getPessoa() == pessoa);
		serviceT.inserir(td);
		return "redirect:/pessoa";
	}

	@RequestMapping(value = "/listar")
	public String listar(TarefaDomain td, Model model, BindingResult result) {
		List<TarefaDomain> listaTarefas = serviceT.listar(td);
		model.addAttribute("tarefas", listaTarefas);
		return "redirect:/tarefa";
	}

}
