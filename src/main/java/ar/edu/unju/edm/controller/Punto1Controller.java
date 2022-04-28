package ar.edu.unju.edm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto1;

@Controller
public class Punto1Controller {

	@GetMapping({"/menu","/index","/"}) 
	public String showMenu() { 
		
		return "index";
	}
	
	@Autowired
	 Punto1 aPunto1;
	
	@GetMapping("/resolverPunto1")
	public String getPunto1Page( @RequestParam (name = "num") int num, Model model ) {

		Punto1 aPunto1 = new Punto1();
		aPunto1.setNumber(num);
		model.addAttribute("Punto1", aPunto1.SolveFact());
		model.addAttribute("numero", num);
		return "punto_1";
	}
}