package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ar.edu.unju.edm.model.Punto3;

@Controller
public class Punto3Controller {

	@GetMapping("/resolverPunto3")
	public String getPunto3Page( @RequestParam (name = "num1") int num1, Model model ) {
		
		Punto3 nuevoPunto3 = new Punto3();
		String iseven="SI es par", noteven="NO es par";
		nuevoPunto3.setNum(num1);
		if(nuevoPunto3.IsEven() == true)
			model.addAttribute("Punto3", iseven);
		else
			model.addAttribute("Punto3", noteven);
		

		return "punto_3";
	}
}