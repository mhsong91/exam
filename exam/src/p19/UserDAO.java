package p19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import p18.Connector;

public class UserDAO {
	
	Connector c;
	Connection con;
	
	UserDAO() throws ClassNotFoundException, SQLException{		
		c = new Connector();
		
	}
	
	public ArrayList<HashMap<String, Object>> getUserList() throws SQLException{
		ArrayList<HashMap<String, Object>> userList = new ArrayList<HashMap<String, Object>>();
		String sql = "select * from user_into";
		con = c.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			HashMap<String, Object> hm = new HashMap<String, Object>();
			hm.put("uiid", rs.getString("uiid"));
			hm.put("uino", rs.getInt("uino"));
			userList.add(hm);					
		}
		c.close();
		return userList;		
	}
	
	public int insertUser(HashMap<String, Object> hm) throws SQLException {
		String sql = "insert into user_into(uiname,uiage, uiid, uipwd, address, cino, uiregdate)\r\n" +
					" values(?,?,?,?,?,1,now())";
		con=c.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, (String)hm.get("uiname"));
		ps.setString(1, (String)hm.get("uiid"));
		ps.setString(1, (String)hm.get("ui"));
		ps.setString(1, (String)hm.get("uiname"));
		ps.setString(1, (String)hm.get("uiname"));
		int result = ps.executeUpdate();
		con.close(); 
		return 0;		
	}
	
	public int updateUser(HashMap<String, Object> hm) {		
		return 0;
	}	
	
	public int deleteUser(int userNo) throws SQLException {	
		String sql ="delete from User_into where uino=?";
		con=c.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,userNo);
		int result = ps.executeUpdate();
		con.close();
		return 0;		
	}
	

}
