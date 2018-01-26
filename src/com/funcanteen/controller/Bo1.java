package com.funcanteen.controller;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aiit.config.DBBean;

public class Bo1 {
	public List getDatas() {
		ResultSet rs=null;
		Connection conn=null;
		DBBean DBHelper=new DBBean();
		
		List char1 = new ArrayList();
		String sql = "select dishname,price from dish";
	    rs = DBHelper.query(sql);
		try {
			
			while(rs.next()) {
				String dishname=rs.getString("dishname");
				String price=rs.getString("price");
				
				
				char1.add(dishname);
				char1.add(price);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBHelper.close();
		}
		return char1;
		
	}
	
}
