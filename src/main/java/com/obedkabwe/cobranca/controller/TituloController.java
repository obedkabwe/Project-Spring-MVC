package com.obedkabwe.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.obedkabwe.cobranca.model.Titulo;

@Controller
@RequestMapping("/titulos")
public class TituloController {

@RequestMapping("/novo")
	public String novo() {
	return "CadastroTitulo";
}


@RequestMapping(method = RequestMethod.POST)
public String salvar(Titulo titulo) {
	System.out.println(titulo.getStatus());
	return "CadastroTitulo";
}







}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

