package ar.edu.unju.edm.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto12;
@Controller
public class Punto12Controller {
	@GetMapping("/resolverPunto12")
	public String getPunto12Page(@RequestParam (name = "height") int height, Model model) {
		Punto12 nPunto12 = new Punto12();
		nPunto12.setHeight(height);
		
		model.addAttribute("Punto12",nPunto12.CalculateTime());
	
		return "punto_12";
	}
}