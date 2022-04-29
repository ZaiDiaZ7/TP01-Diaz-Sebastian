package ar.edu.unju.edm.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto11;
@Controller
public class Punto11Controller {
	@GetMapping("/resolverPunto11")
	public String getPunto11Page(Model model) {
		Punto11 pPunto11 = new Punto11();
		
		int[] narray = pPunto11.CountBackwardsDoWhile();
		
		model.addAttribute("Punto11", Arrays.toString(narray));
	
		return "punto_11";
	}
}