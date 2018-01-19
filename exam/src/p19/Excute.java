package p19;

import java.sql.SQLException;

public class Excute {
	public static void main(String[] args) {
		try {
			UserDAO udao = new UserDAO();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
