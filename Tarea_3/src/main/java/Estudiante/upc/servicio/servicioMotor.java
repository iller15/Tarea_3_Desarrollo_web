package Estudiante.upc.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Estudiante.upc.entidades.Motor;
import Estudiante.upc.repositorio.Motor_Repositorio;

@Service
public class servicioMotor {
	@Autowired
	private Motor_Repositorio motor_Repositorio;
	
	public Motor registrarMotor(Motor motor) {
		return motor_Repositorio.save(motor);
	}
	
	public List<Motor> listarMotores(){
		return motor_Repositorio.findAll();
	}
	
	public List<Motor> filtrarMotorRango(float precio_Max,float precio_Min){
		List<Motor> autos = motor_Repositorio.findAll();
		List<Motor> exit = new ArrayList<Motor>();
		for(int i = 0; i < autos.size();i++) {
			if(autos.get(i).getPrecio() > precio_Min && autos.get(i).getPrecio() < precio_Max) {
				exit.add(autos.get(i));
				
			}
		}
		return exit;
		
	}
	
}
