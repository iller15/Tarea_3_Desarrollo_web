package Estudiante.upc.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Motor_tP")
public class Motor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMotor;
	private String modelo;
	private String marca;
	private long precio;
	
	
	public Long getIdMotor() {
		return idMotor;
	}
	public void setIdMotor(Long idMotor) {
		this.idMotor = idMotor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	
	

}
