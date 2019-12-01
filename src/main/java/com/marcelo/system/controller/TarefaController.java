package com.marcelo.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public ModelAndView formulario() {
		return new ModelAndView("TarefaCadastro");
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrar(@ModelAttribute("tarefa") TarefaDomain td, Model model) {
		model.addAttribute("descricao", td.getDescricao());
		model.addAttribute("titulo", td.getTitulo());
		model.addAttribute("dataExpiracao", td.getDataExpiracao());
		model.addAttribute("concluido", td.isConcluida());

		service.inserir(td);
		return "redirect:/tarefa";
	}

}
