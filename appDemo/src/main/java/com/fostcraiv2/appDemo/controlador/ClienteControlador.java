package com.fostcraiv2.appDemo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fostcraiv2.appDemo.service.ClienteService;

@Controller
public class ClienteControlador {

	@Autowired
	private ClienteService servicio;
	
	@GetMapping({"/clintes", "/"})
	public String listarClientes(Model modelo){
		modelo.addAttribute("clientes", servicio.listarTodosLosClientes());
		return "clientes";
	}
	
	
	
	
}
