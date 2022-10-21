package com.IBM.Funcionalidades;

import java.io.Serializable;
import java.sql.Array;
import java.util.List;

import com.IBM.MySql.ControlerJsonJava;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListaObjetos implements Serializable {
	
	private static final long serialVersionUID = 2L;

	private List<ControlerJsonJava> value;
	@JsonProperty("@odata.context")
	private String odatacontext;

	public List<ControlerJsonJava> getValue() {
		return value;
	}
	public void setValue(List<ControlerJsonJava> value) {
		this.value = value;
	}
}