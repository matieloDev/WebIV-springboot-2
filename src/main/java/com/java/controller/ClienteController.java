package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

	@RequestMapping("/funcionarios")
	public ModelAndView consultar() {

		ModelAndView mv = new ModelAndView("ListaClientes");
		mv.addObject("titulo", "Minha Lista de Funcionarios Dinâmica");

		return mv;
	}
}
