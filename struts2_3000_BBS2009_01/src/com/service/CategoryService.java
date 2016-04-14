package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.xml.registry.DeleteException;

import com.model.Category;
import com.util.DB;

public class CategoryService {
	public void add(Category c){
		Connection conn = DB.createcConnection();
		String sql = "insert into _category values (null,?,?)";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setString(1, c.getName());
			ps.setString(2, c.getDescription());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
		
		
	}
	
	public List<Category> list(){
		Connection conn = DB.createcConnection();
		String sql = "select * from _category";
		PreparedStatement ps = DB.prepare(conn, sql);
		List<Category> categories = new ArrayList<Category>();
		try {
			ResultSet rs = ps.executeQuery();
			Category c =null;
			while (rs.next()) {
				c=new Category();
				c.setName(rs.getString("name"));
				c.setDescription(rs.getString("description"));
				categories.add(c);
				
			}
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
		
		return categories;
	}
	
	public void delete(Category c){
		deleteById(c.getId());
	} 
	
	public void deleteById(int id){
		Connection conn = DB.createcConnection();
		String sql = "delete from _category where id = ?";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
		
	}
	
	public void update(Category c){
		Connection conn = DB.createcConnection();
		String sql = "update _category set name = ? and description = ? where id = ?";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setString(1, c.getName());
			ps.setString(2, c.getDescription());
			ps.setInt(3, c.getId());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
		
	}
	
}
