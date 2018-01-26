package com.aiit.config;


import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	public static Connection getCon()throws Exception{
		Class.forName(PropertiesUtil.getValue("jdbc.driver"));
		Connection con=DriverManager.getConnection(PropertiesUtil.getValue("jdbc.url"), PropertiesUtil.getValue("jdbc.username"), PropertiesUtil.getValue("jdbc.password"));
		return con;
	}
	
	public static void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
		try {
			DbUtil.getCon();
			System.out.println("链接成功");
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
