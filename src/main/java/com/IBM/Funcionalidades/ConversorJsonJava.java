package com.IBM.Funcionalidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import com.IBM.MySql.MySqlCRUD;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ConversorJsonJava {
	
	public static void Converter (Scanner scr) throws IOException {
		System.out.println("Cole o site para a busca: "
				+"\nlink deve ser gerado com todos os campos ou seja sem nenhum filtro");
		String urlBase = scr.next();
		URL url = new URL ("https://olinda.bcb.gov.br/olinda/servico/Expectativas/versao/v1/odata/ExpectativaMercadoMensais?$top=400&$skip=0&$format=json");
				
		URLConnection conexao = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
		
		System.out.println(in.getClass().getSimpleName());

		String urlString = in.readLine();
		System.out.println(urlString.getClass().getSimpleName());
		
		ObjectMapper objMapper = new ObjectMapper();
		ListaObjetos vlue = objMapper.readValue(urlString, ListaObjetos.class);
		 
		int size = vlue.getValue().size();
		int table = 1;
		System.out.println(size);
		
			 while(table < size) {
				 
				 MySqlCRUD.insertDataBase(
						 vlue.getValue().get(table).getIndicador(), 
						 vlue.getValue().get(table).getData(), 
						 vlue.getValue().get(table).getDataReferencia(), 
						 vlue.getValue().get(table).getMedia(), 
						 vlue.getValue().get(table).getMediana(), 
						 vlue.getValue().get(table).getDesvioPadrao(), 
						 vlue.getValue().get(table).getCoeficienteVariacao(), 
						 vlue.getValue().get(table).getMinimo(), 
						 vlue.getValue().get(table).getMaximo(), 
						 vlue.getValue().get(table).getNumeroRespondentes(), 
						 vlue.getValue().get(table).getBaseCalculo());
				 table ++;
			 }
	}

}
