package com.IBM.ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoMySQL {

		private static Connection connection;
	    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	    private static final String URL = "jdbc:mysql://127.0.0.1:3306/projetoibm";
	    private static final String SEUBD = "projetoibm";
	    private static final String USUARIO = "root";
	    private static final String SENHA = "b1234";
	    
	    public static Connection getConnection() {
	    	
	        if (connection == null) {
	            try {
	                Class.forName(DRIVER);
	                connection = (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
	                System.out.println("A conexao com o banco "+SEUBD+" foi realizada");
	            } catch (ClassNotFoundException e) {
	                JOptionPane.showMessageDialog(null, "Erro ao carregar o driver de conexão\n" + e);
	            } catch (SQLException e) {
	                JOptionPane.showMessageDialog(null, "Não foi possível estabalecer conexão com o banco de dados\n" + e);
	            }
	        }
	        return connection;
	    }
}