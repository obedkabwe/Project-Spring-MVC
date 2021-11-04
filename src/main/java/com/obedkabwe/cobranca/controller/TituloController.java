package com.obedkabwe.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.obedkabwe.cobranca.model.Titulo;
import com.obedkabwe.cobranca.repository.TituloRepository;



@Controller
@RequestMapping("/titulos")
public class TituloController {

	@Autowired
	private TituloRepository tituloRepository;

	@RequestMapping("/novo")
	public String novo() {
	return "CadastroTitulo";
}


@RequestMapping(method = RequestMethod.POST)
public ModelAndView salvar(Titulo titulo) {
	ModelAndView mv = new ModelAndView("CadastroTitulo");
	tituloRepository.save(titulo);
	mv.addObject("mensagem", "Titulo salvo com sucesso");
	return mv;
}







}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

