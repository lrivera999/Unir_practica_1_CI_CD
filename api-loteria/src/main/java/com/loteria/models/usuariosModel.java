package com.loteria.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class usuariosModel implements Serializable
{
	private static final long serialVersionUID = -8099440282456785377L;
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private long secuencia;
	
	@Column(name="nickname", length=30, nullable=false)
	private String alias;
	
	@Column(name="password", length=30, nullable=false)
	private String clave;
	
	@Column(name="name", length=30, nullable=false)
	private String nombre;
	
	@Column(name="lastName", length=30, nullable=false)
	private String apellido;
	
	@Column(name="brithday", nullable=false)
	private Date cumpleanios;
	
	@Column(name="email", length=200, nullable=false)
	private String correo;
	
	@Column(name="amount", columnDefinition = "numeric(8,2) default '0'", nullable=false)
	private float ganancia;

	public usuariosModel() {}

	public long getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(long secuencia) {
		this.secuencia = secuencia;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getCumpleanios() {
		return cumpleanios;
	}

	public void setCumpleanios(Date cumpleanios) {
		this.cumpleanios = cumpleanios;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public float getGanancia() {
		return ganancia;
	}

	public void setGanancia(float ganancia) {
		this.ganancia = ganancia;
	}

}
