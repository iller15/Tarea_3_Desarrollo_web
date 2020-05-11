package Estudiante.upc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Estudiante.upc.entidades.Motor;
import Estudiante.upc.servicio.servicioMotor;

@RestController
@RequestMapping("/api")
public class restFunctions {
	@Autowired
	private servicioMotor servicio;
	
	@PostMapping("/motor")
	public Motor registrarMotor(@RequestBody Motor motor) {
		return servicio.registrarMotor(motor);
	}
	
	@GetMapping("/{min}-{max}")
	public List<Motor> filtroMotoresl(@PathVariable(value = "min")float min,@PathVariable(value = "max")float max){
		return servicio.filtrarMotorRango(max, min);
	}
	
	@GetMapping("/motores")
	public List<Motor> listaMotores(){
		return servicio.listarMotores();
	}
	
	
	
	

}
