package com.marcelo.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marcelo.system.domain.PessoaDomain;
import com.marcelo.system.service.PessoaService;

@Controller
@RequestMapping("pessoa")
public class PessoaController {

	@Autowired
	private PessoaService service;

	@RequestMapping(value = "")
	public ModelAndView Pessoa(Model model) {
		return new ModelAndView("PessoaCadastro");
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String Cadastrar(@ModelAttribute("pessoa") PessoaDomain pessoa, Model model) {
		model.addAttribute(pessoa.getNome());
		service.inserir(pessoa);
		return "redirect:/pessoa";
	}

}
