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
@Table(name = "bets")
public class apuestasModel implements Serializable {

	private static final long serialVersionUID = -8750887545934046166L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "betId", nullable = false)
	private long secuencia;

	@Column(name = "userId", nullable = false)
	private long usuarioId;

	@Column(name = "n1", length = 30, nullable = false)
	private String n1;

	@Column(name = "n2", length = 30, nullable = false)
	private String n2;

	@Column(name = "n3", length = 30, nullable = false)
	private String n3;

	@Column(name = "n4", length = 30, nullable = false)
	private String n4;

	@Column(name = "n5", length = 30, nullable = false)
	private String n5;

	@Column(name = "n6", length = 30, nullable = false)
	private String n6;

	@Column(name = "nR", length = 30, nullable = false)
	private String nR;

	@Column(name = "actualDate", columnDefinition = "datetime", nullable = false)
	private Date fecha_actual;

	@Column(name = "dayOfWeek", columnDefinition = "int default '0'", nullable = false)
	private int dia_semana;

	@Column(name = "betDay", columnDefinition = "datetime", nullable = false)
	private Date fecha_apuesta;

	@Column(name = "price", columnDefinition = "numeric(8,2) default '0'", nullable = false)
	private float valor;

	public apuestasModel() {
	}

	public long getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(long secuencia) {
		this.secuencia = secuencia;
	}

	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getN1() {
		return n1;
	}

	public void setN1(String n1) {
		this.n1 = n1;
	}

	public String getN2() {
		return n2;
	}

	public void setN2(String n2) {
		this.n2 = n2;
	}

	public String getN3() {
		return n3;
	}

	public void setN3(String n3) {
		this.n3 = n3;
	}

	public String getN4() {
		return n4;
	}

	public void setN4(String n4) {
		this.n4 = n4;
	}

	public String getN5() {
		return n5;
	}

	public void setN5(String n5) {
		this.n5 = n5;
	}

	public String getN6() {
		return n6;
	}

	public void setN6(String n6) {
		this.n6 = n6;
	}

	public String getnR() {
		return nR;
	}

	public void setnR(String nR) {
		this.nR = nR;
	}

	public Date getFecha_actual() {
		return fecha_actual;
	}

	public void setFecha_actual(Date fecha_actual) {
		this.fecha_actual = fecha_actual;
	}

	public int getDia_semana() {
		return dia_semana;
	}

	public void setDia_semana(int dia_semana) {
		this.dia_semana = dia_semana;
	}

	public Date getFecha_apuesta() {
		return fecha_apuesta;
	}

	public void setFecha_apuesta(Date fecha_apuesta) {
		this.fecha_apuesta = fecha_apuesta;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
