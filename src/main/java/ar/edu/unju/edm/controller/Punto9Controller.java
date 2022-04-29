package ar.edu.unju.edm.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto9;
@Controller
public class Punto9Controller {
	@GetMapping("/resolverPunto9")
	public String getPunto9Page(Model model) {
		Punto9 nueviPunto9 = new Punto9();
		
		int[] narray = nueviPunto9.CountBackwardsFor();
		
		model.addAttribute("Punto9", Arrays.toString(narray));
	
		return "punto_9";
	}
}