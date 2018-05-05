package com.algaworks.vinhos.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.vinhos.model.TipoVinho;
import com.algaworks.vinhos.model.Vinho;
import com.algaworks.vinhos.repository.VinhosRepository;

@Controller
@RequestMapping("/vinhos")
public class VinhosController {

	@Autowired
	private VinhosRepository vinhosRepository;
	
	@GetMapping
	public ModelAndView listar () {
		
		ModelAndView mav = new ModelAndView("vinhos/lista-vinhos");
		
		mav.addObject("listaVinhos", vinhosRepository.findAll());
		
		return mav;
	}
	
	@GetMapping("/{id}")
	public ModelAndView editar (@PathVariable Long id) {
		
		return novo(vinhosRepository.findOne(id));
	}
	
	@GetMapping("/novo")
	public ModelAndView novo(Vinho vinho) {
		
		ModelAndView mav = new ModelAndView("vinhos/cadastro-vinho");
		
		mav.addObject(vinho);
		mav.addObject("tiposDeVinhos", TipoVinho.values());
		
		return mav;
		
	}
	
	// The @Valid tests the @NotNulls and the @NotBlanks from the model objects , 
	// The BindingResuld  returns if has errors or not. true or false
	@PostMapping("/novo")
	public ModelAndView salvar(@Valid @ModelAttribute("vinho") Vinho vinho, BindingResult result,
			RedirectAttributes attr) { 

		if(result.hasErrors()) {
			return novo(vinho);
		}

		vinhosRepository.save(vinho);

		attr.addFlashAttribute("message", "Vinho salvo com sucesso");

		return new ModelAndView("redirect:/vinhos/");
	}

	@PostMapping("/remove/{id}")
	public ModelAndView remove (@PathVariable Long id, RedirectAttributes attr) {

		System.out.println("a remover:"+id);
		
		vinhosRepository.delete(id);

		attr.addFlashAttribute("message", "Vinho removido com sucesso");

		return new ModelAndView("redirect:/vinhos/");

	}
}
