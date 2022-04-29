package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto2;

@Controller
public class Punto2Controller {
	
@GetMapping("/resolverPunto2")

	public String getPunto2Page( @RequestParam (name = "yy") int yy, Model model ) {
		boolean result;
		String whatis;
		Punto2 newPunto2 = new Punto2();
		newPunto2.setYear(yy);
		result = newPunto2.IsLeapYear();
		if(result == true)
			whatis = "SI es bisiesto";
		else
			whatis = "NO es bisiesto";

			model.addAttribute("Punto2", whatis);
		return "punto_2";
	}
}