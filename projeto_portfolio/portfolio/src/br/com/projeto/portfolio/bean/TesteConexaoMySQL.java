package br.com.projeto.portfolio.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TesteConexaoMySQL {


	public static void main(String[] args) throws Exception {
		Connection con;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4LUPJKD;instanceName=SQLSERVER2022;databaseName=portfolio;integratedSecurity=true");
		PreparedStatement sta = con.prepareStatement("select * from projeto");
		ResultSet res = sta.executeQuery();
		System.out.println(res.toString());
		System.out.println("Conex�o realizada com sucesso.");
		
		if(con != null) {
			con.close();
		}

	}

}
