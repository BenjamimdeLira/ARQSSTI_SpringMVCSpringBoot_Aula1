package br.usjt.hellospringboot.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import br.usjt.hellospringboot.model.PrevisaoTempo;
import br.usjt.hellospringboot.repository.PrevisaoTempoRepository;

@Controller
public class PrevisoesTempoController {
	@Autowired
	private PrevisaoTempoRepository previsoesTempoRepo;

	@GetMapping("/previsoesTempo")
	public ModelAndView listarPrevisoesTempo() {
		
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_previsoesTempo");
		
		// Busque a coleção com o repositório
		List previsoesTempo = (List) previsoesTempoRepo.findAll();
		
		// adicione a coleção ao objeto ModelAndView
		//para modelar o formulário
		mv.addObject(new PrevisaoTempo());
		mv.addObject("previsoesTempo", previsoesTempo);
		
		// devolva o ModelAndView
		return mv;
	}
	
	@PostMapping("/alunos")
	public String salvar (PrevisaoTempo previsaoTempo) {
	previsoesTempoRepo.save(previsaoTempo);
	return "redirect:/alunos";
	}
}