package com.marcelo.system.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marcelo.system.domain.PessoaDomain;
import com.marcelo.system.service.PessoaService;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaService service;

	// Método que abre o formulário para cadastro

	@RequestMapping(value = "")
	public ModelAndView formulario(Model model) {

		// Método para atualizar a página de formulario com a lista de pessoas

		List<PessoaDomain> listaPessoas = service.listar();
		model.addAttribute("pessoas", listaPessoas);
		return new ModelAndView("PessoaCadastro");
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrar(@ModelAttribute("pessoa") PessoaDomain pessoa, Model model) {
		model.addAttribute(pessoa.getNome());
		service.inserir(pessoa);
		return "redirect:/pessoa";
	}

	@RequestMapping(value = "/listar")
	public String listarForm(@ModelAttribute("pessoa") PessoaDomain pessoa, BindingResult result, Model model) {
		List<PessoaDomain> listaPessoas = service.listar();
		model.addAttribute("pessoas", listaPessoas);
		return "PessoaLista";
	}

	// Método que abre o formulário de edição carregando o id
	@RequestMapping(value = "/editarForm/{id}")
	public String editarForm(@PathVariable("id") Long id, Model model) {
		PessoaDomain pessoa = service.listarPorId(id);
		model.addAttribute("pessoa", pessoa);
		return "PessoaEdicao";
	}

	@RequestMapping(value = "/editar/{id}", method = RequestMethod.POST)
	public String editar(@PathVariable("id") Long id, @Valid PessoaDomain pessoa, BindingResult result, Model model) {
		if (result.hasErrors()) {
			pessoa.setId(id);
			return "redirect:/pessoa";
		}
		service.editar(pessoa);
		model.addAttribute("pessoas", service.listar());
		return "redirect:/pessoa";
	}

	@RequestMapping(value = "/deletar/{id}")
	public String deletar(@PathVariable("id") Long id) {
		service.deletar(id);
		return "redirect:/pessoa";
	}

}
