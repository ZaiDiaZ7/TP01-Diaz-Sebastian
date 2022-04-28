package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto2;

@Controller
public class Punto2Controller {
	
@GetMapping("/resolverPunto2")


/*public ModelAndView getPunto2Page( @RequestParam (name = "yy") int yy, Model model ) { //para hacer con model and view
 String resultado B="";
 ModelAndView anahi; //permite enviar un paquete como objeto
 nuevoBisiesto.setAnio(num);
 resultadoB = nuevoBisiesto.calcularBisiesto();
 ModelAndView anahi=new ModelAndView("resultadoBisiesto")
 
 
 
 }
 
 */
	public String getPunto2Page( @RequestParam (name = "yy") int yy, Model model ) {
		boolean result;
		String whatis;
		Punto2 aPunto2 = new Punto2();
		aPunto2.setYear(yy);
		result = aPunto2.IsLeapYear();
		if(result == true)
			whatis = "SI es bisiesto";
		else
			whatis = "NO es bisiesto";

			model.addAttribute("Punto2", whatis);
		return "punto_2";
	}
}