package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ar.edu.unju.edm.model.Punto4;

@Controller
public class Punto4Controller {

	@GetMapping("/resolverPunto4")
	public String getPunto4Page( @RequestParam (name = "num") int num, Model model ) {
		String whatis;
		Punto4 newPunto4 = new Punto4();
		newPunto4.setNum(num);
		if(newPunto4.IsMonth() == true)
			whatis = "SI es un mes";
		else
			whatis = "NO es un mes";

			model.addAttribute("Punto4", whatis);
		return "punto_4";
	}
}