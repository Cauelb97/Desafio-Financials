package com.IBM.MySql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.Scanner;

import com.IBM.Funcionalidades.ConversorJsonJava;
import com.IBM.Funcionalidades.ListaObjetos;
import com.IBM.Menu.MenuDeUsuario;
import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {
	
	public static void main(String [] agrs) throws IOException, SQLException {
		
	Scanner scr = new Scanner(System.in);
	int cond = 0;
		do {
			
			cond = MenuDeUsuario.entradaUsuarioPrincipal(scr);
			
			switch(cond) {
			
			case 1:
				ConversorJsonJava.Converter(scr);
				break;
					 
			case 2:
					int aux;
					do {
						
						aux = MenuDeUsuario.entradaUsuarioSecudario(scr);
						
						switch(aux) {
						
						case 1:
							MySqlCRUD.printResult();
							break;
						case 2:
							MySqlCRUD.printResultIndicador();
							break;
						case 3:
							MySqlCRUD.printDataReferencia();
							break;
						case 4:
							MySqlCRUD.printnumeroRespondentes();
							break;
						}
						
					}while(aux != 5);
				break;
				
			case 3:
				MySqlCRUD.updateDataBase();
				break;
				
			case 4:
				MySqlCRUD.deleteResult();
				break;
			}
		}while(cond != 5);
	}
}