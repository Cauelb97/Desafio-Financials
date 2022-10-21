package com.IBM.Projetoibm;

import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DadosOlindaMensais")
public class Entidades implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String indicador;
	private String data;
	private String dataReferencia;
	private double media;
	private double mediana;
	private double desvioPadrao;
	private double coeficienteVariacao;
	private double minimo;
	private double maximo;
	private int numeroRespondentes;
	private int baseCalculo;
	
	public Entidades() {
	}
	
	public Entidades(String indicador, String data, String dataReferencia, double media, double mediana,
			double desvioPadrao, double coeficienteVariacao, double minimo, double maximo, int numeroRespondentes,
			int baseCalculo) {
		this.indicador = indicador;
		this.data = data;
		this.dataReferencia = dataReferencia;
		this.media = media;
		this.mediana = mediana;
		this.desvioPadrao = desvioPadrao;
		this.coeficienteVariacao = coeficienteVariacao;
		this.minimo = minimo;
		this.maximo = maximo;
		this.numeroRespondentes = numeroRespondentes;
		this.baseCalculo = baseCalculo;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIndicador() {
		return indicador;
	}
	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDataReferencia() {
		return dataReferencia;
	}
	public void setDataReferencia(String dataReferencia) {
		this.dataReferencia = dataReferencia;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public double getMediana() {
		return mediana;
	}
	public void setMediana(double mediana) {
		this.mediana = mediana;
	}
	public double getDesvioPadrao() {
		return desvioPadrao;
	}
	public void setDesvioPadrao(double desvioPadrao) {
		this.desvioPadrao = desvioPadrao;
	}
	public double getCoeficienteVariacao() {
		return coeficienteVariacao;
	}
	public void setCoeficienteVariacao(double coeficienteVariacao) {
		this.coeficienteVariacao = coeficienteVariacao;
	}
	public double getMinimo() {
		return minimo;
	}
	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}
	public double getMaximo() {
		return maximo;
	}
	public void setMaximo(double maximo) {
		this.maximo = maximo;
	}
	public int getNumeroRespondentes() {
		return numeroRespondentes;
	}
	public void setNumeroRespondentes(int numeroRespondentes) {
		this.numeroRespondentes = numeroRespondentes;
	}
	public int getBaseCalculo() {
		return baseCalculo;
	}
	public void setBaseCalculo(int baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entidades other = (Entidades) obj;
		return Objects.equals(id, other.id);
	}
}