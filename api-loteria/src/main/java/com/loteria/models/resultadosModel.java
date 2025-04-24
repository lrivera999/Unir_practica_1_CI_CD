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
@Table(name = "resultados")
public class resultadosModel implements Serializable {

	private static final long serialVersionUID = 5504348257633289895L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resultId", nullable = false)
	private long secuencia;

	@Column(name = "dateId", nullable = false)
	private Date fecha;

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

	@Column(name = "nCom", length = 30, nullable = false)
	private String nCom;

	public resultadosModel() {
	}

	public long getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(long secuencia) {
		this.secuencia = secuencia;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	public String getnCom() {
		return nCom;
	}

	public void setnCom(String nCom) {
		this.nCom = nCom;
	}

}
