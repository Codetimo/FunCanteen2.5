package com.aiit.config;

 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class DBBean {
	
	
	Connection con=null;
	Statement stat=null;
	PreparedStatement pstm=null;
	ResultSet rs=null;
	DbUtil dbUtil=new DbUtil();
	
	public DBBean()
	{
	}
	public Connection getcon() {
		try {
		con =dbUtil.getCon();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
		}
	public ResultSet query(String sql)
	{
 
try {
	con=getcon();
	stat=con.createStatement();
	rs=stat.executeQuery(sql);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return rs;
	}
	
	public void close()
	{
		try {
			dbUtil.closeCon(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
