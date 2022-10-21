package com.IBM.MySql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.IBM.ConexaoBD.ConexaoMySQL;

public class MySqlCRUD {

	public static void insertDataBase(String indicador, String data, String dataReferencia, double media,
			double mediana, double desvioPadrao, double coeficienteVariacao, double minimo, double maximo,
			int numeroRespondentes, int baseCalculo) {

		Connection conn = ConexaoMySQL.getConnection();

		Statement stmt = null;
		ResultSet rs = null;
		boolean hadResults = false;

		try {
			stmt = conn.createStatement();
			hadResults = stmt.execute(
					"insert into dadosolinda (indicador, data, datareferencia, media, mediana, desviopadrao, coeficientevariacao, minimo, maximo, numerorespondentes, basecalculo) values ('"
							+ indicador + "','" + data + "','" + dataReferencia + "'," + media + "," + mediana + ","
							+ desvioPadrao + "," + coeficienteVariacao + "," + minimo + "," + maximo + ","
							+ numeroRespondentes + "," + baseCalculo + ");");

			rs = stmt.getResultSet();
		} catch (SQLException e) {

			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());

		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				stmt = null;
			}
		}
	}

	public static void printResult() {

		Connection cm = ConexaoMySQL.getConnection();

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = cm.createStatement();
			rs = stmt.executeQuery("SELECT * FROM dadosolinda");

			while (rs.next()) {

				System.out.println(rs.getString("indicador") + " " + rs.getString("data") + " "
						+ rs.getString("dataReferencia") + " " + rs.getString("media") + " " + rs.getString("mediana")
						+ " " + rs.getString("desvioPadrao") + " " + rs.getString("coeficienteVariacao") + " "
						+ rs.getString("minimo") + " " + rs.getString("maximo") + " "
						+ rs.getString("numeroRespondentes") + " " + rs.getString("baseCalculo"));
			}
		} catch (SQLException e) {

			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());

		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				stmt = null;
			}
		}
	}

	public static void printResultIndicador() {

		Connection cm = ConexaoMySQL.getConnection();
		Scanner scr = new Scanner(System.in);

		Statement stmt = null;
		ResultSet rs = null;

		try {
			System.out.println("Digite o indicador para ser encontrado: ");
			String auxiliar = scr.nextLine();

			stmt = cm.createStatement();
			rs = stmt.executeQuery("SELECT * FROM dadosolinda WHERE Indicador = " + "'" + auxiliar + "';");

			while (rs.next()) {

				System.out.println(rs.getString("indicador") + " " + rs.getString("data") + " "
						+ rs.getString("dataReferencia") + " " + rs.getString("media") + " " + rs.getString("mediana")
						+ " " + rs.getString("desvioPadrao") + " " + rs.getString("coeficienteVariacao") + " "
						+ rs.getString("minimo") + " " + rs.getString("maximo") + " "
						+ rs.getString("numeroRespondentes") + " " + rs.getString("baseCalculo"));
			}
		} catch (SQLException e) {

			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());

		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				stmt = null;
			}
		}
	}

	public static void printDataReferencia() {

		Connection cm = ConexaoMySQL.getConnection();
		Scanner scr = new Scanner(System.in);

		Statement stmt = null;
		ResultSet rs = null;

		try {
			System.out.println("Digite a data de Referencia para ser encontrada: ");
			String auxiliar = scr.nextLine();

			stmt = cm.createStatement();
			rs = stmt.executeQuery("SELECT * FROM dadosolinda WHERE dataReferencia = " + "'" + auxiliar + "';");

			while (rs.next()) {

				System.out.println(rs.getString("indicador") + " " + rs.getString("data") + " "
						+ rs.getString("dataReferencia") + " " + rs.getString("media") + " " + rs.getString("mediana")
						+ " " + rs.getString("desvioPadrao") + " " + rs.getString("coeficienteVariacao") + " "
						+ rs.getString("minimo") + " " + rs.getString("maximo") + " "
						+ rs.getString("numeroRespondentes") + " " + rs.getString("baseCalculo"));
			}
		} catch (SQLException e) {

			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());

		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				stmt = null;
			}
		}
	}

	public static void printnumeroRespondentes() {

		Connection cm = ConexaoMySQL.getConnection();
		Scanner scr = new Scanner(System.in);

		Statement stmt = null;
		ResultSet rs = null;

		try {
			System.out.println("Digite o numero de Respondentes para realizar a busca: ");
			String auxiliar = scr.nextLine();

			stmt = cm.createStatement();
			rs = stmt.executeQuery("SELECT * FROM dadosolinda WHERE numeroRespondentes = " + "'" + auxiliar + "';");

			while (rs.next()) {

				System.out.println(rs.getString("indicador") + " " + rs.getString("data") + " "
						+ rs.getString("dataReferencia") + " " + rs.getString("media") + " " + rs.getString("mediana")
						+ " " + rs.getString("desvioPadrao") + " " + rs.getString("coeficienteVariacao") + " "
						+ rs.getString("minimo") + " " + rs.getString("maximo") + " "
						+ rs.getString("numeroRespondentes") + " " + rs.getString("baseCalculo"));
			}
		} catch (SQLException e) {

			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());

		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
					System.out.println("SQLException: " + sqlEx.getMessage());
					System.out.println("SQLState: " + sqlEx.getSQLState());
					System.out.println("VendorError: " + sqlEx.getErrorCode());
				}
				stmt = null;
			}
		}
	}
	
	public static void deleteResult() throws SQLException {

		Connection cm = ConexaoMySQL.getConnection();

		Statement stmt = null;
		int rs = 0;
			
			Scanner scr = new Scanner(System.in);
			System.out.println("Digite um ID para ser ser excluido: ");
			int auxl = scr.nextInt();
			stmt = cm.createStatement();
			rs = stmt.executeUpdate("DELETE FROM dadosolinda WHERE Id = "+auxl+";");
	}

	public static void updateDataBase() throws SQLException {


		Connection cm = ConexaoMySQL.getConnection();

		Statement stmt = null;
		int rs = 0;
		String aux1, aux2, aux3;
			
			Scanner scr = new Scanner(System.in);
			System.out.println("Digite a coluna que deseja alterar: ");
			aux1 = scr.nextLine();
			System.out.println("Digite o novo registro: ");
			aux2 = scr.nextLine();
			System.out.println("Digite o ID para ser ser alterado: ");
			aux3 = scr.nextLine();
			stmt = cm.createStatement();
			rs = stmt.executeUpdate("UPDATE dadosolinda SET "+aux1+"='"+aux2+"' WHERE id = '"+aux3+"'");
	}
}
