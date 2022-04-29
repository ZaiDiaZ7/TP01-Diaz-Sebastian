package ar.edu.unju.edm.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto10;
@Controller 
public class Punto10Controller {
	@GetMapping("/resolverPunto10")
	public String getPunto10Page(Model model) {
		Punto10 waPunto10 = new Punto10();
		
		int[] narray = waPunto10.CountBackwardsWhile();
		
		model.addAttribute("Punto10", Arrays.toString(narray));
	
		return "punto_10";
	}
}