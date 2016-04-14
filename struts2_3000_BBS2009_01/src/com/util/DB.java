package com.util;

import java.io.Closeable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;





import com.opensymphony.xwork2.Result;

public class DB {
	public static Connection createcConnection(){
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbs2009?"+ "user=root&password=tiger&useUnicode=true&characterEncoding=UTF8&useSSL=true");		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return conn;			
	}
	
	public static PreparedStatement prepare(Connection conn,String sql){
		PreparedStatement ps =null;
		
		try {
			ps=conn.prepareStatement(sql);		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ps;
	}
	
	public static void close(Statement stmt){
		
		try {
			stmt.close();
			stmt=null;
			} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	public static void close(ResultSet rs){
		try {
			rs.close();
			rs=null;
			} catch (SQLException e) {
			e.printStackTrace();
		}
						
	}
	
	public static void close(Connection conn){
		if(conn==null){
			return;
		}
		try {
			conn.close();
			conn=null;
			} catch (SQLException e) {
			e.printStackTrace();
		}						
	}
	
}
