package com.marcelo.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Pessoa")
public class PessoaController {

	@RequestMapping(value = "")
	public ModelAndView pessoa(Model model) {
		return new ModelAndView("PessoaCadastro");
	}

}
