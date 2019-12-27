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
		return new ModelAndView("tarefa/tarefaCadastro");
	}

	@RequestMapping(value = "/cadastrar/{id}", method = RequestMethod.POST)
	public String cadastrar(@PathVariable("id") Long id, TarefaDomain td, PessoaDomain ps, Model model) {

		TarefaDomain td1 = new TarefaDomain(null, td.getDescricao(), td.getTitulo(), td.getDataExpiracao(),
				td.isConcluida(), td.getPessoa());

		serviceT.inserir(td1);
		return "redirect:/tarefa/{id}";
	}

	@RequestMapping(value = "/listar")
	public String listar(TarefaDomain td, Model model, BindingResult result) {
		List<TarefaDomain> listaTarefas = serviceT.listar(td);
		model.addAttribute("tarefas", listaTarefas);
		return "redirect:/tarefa";
	}

}
