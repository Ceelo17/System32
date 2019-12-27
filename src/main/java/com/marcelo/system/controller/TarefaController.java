package com.marcelo.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marcelo.system.domain.TarefaDomain;
import com.marcelo.system.service.TarefaService;

@Controller
@RequestMapping("/tarefa")
public class TarefaController {

	@Autowired
	private TarefaService service;

	@RequestMapping(value = "")
	public ModelAndView formulario(TarefaDomain td, Model model) {
		List<TarefaDomain> listaTarefas = service.listar(td);
		model.addAttribute("tarefas", listaTarefas);
		return new ModelAndView("TarefaCadastro");
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrar(TarefaDomain td, Model model) {
		model.addAttribute("descricao", td.getDescricao());
		model.addAttribute("titulo", td.getTitulo());
		model.addAttribute("dataExpiracao", td.getDataExpiracao());
		model.addAttribute("concluido", td.isConcluida());
		model.addAttribute("pessoa",td.getPessoa());
		service.inserir(td);
		return "redirect:/tarefa";
	}

	@RequestMapping(value = "/listar")
	public String listar(TarefaDomain td, Model model, BindingResult result) {
		List<TarefaDomain> listaTarefas = service.listar(td);
		model.addAttribute("tarefas", listaTarefas);
		return "redirect:/tarefa";
	}

}
