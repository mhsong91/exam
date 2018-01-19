package p18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class UserList {

	public static void main(String[] args) {
		// Connector c;
		Connector c = null;
		try {
			c = new Connector();
			Connection con = c.getConnection();
			String sql = "select*from user_into";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			String[] colNames = new String[rsmd.getColumnCount()];
			for (int i = 0; i < colNames.length; i++) {
				colNames[i] = rsmd.getColumnLabel(i + 1);
				// System.out.println(rs.getString(colName));
			}
			ArrayList<HashMap<String, Object>> oblist = new ArrayList<HashMap<String, Object>>();
			while (rs.next()) {
				HashMap<String, Object> hm = new HashMap<String, Object>();

				for (String colName : colNames) {
//					System.out.println(rs.getString(colName) + ",");
					hm.put(colName,rs.getString(colName));
				}
				oblist.add(hm);
			
				for (HashMap<String, Object> hm1 : oblist) {
					System.out.println(hm1);
				}	

				System.out.println("");
				// for (int i = 1; i < rsmd.getColumnCount(); i++) {
				// String colName = rsmd.getColumnLabel(i);
				// System.out.println(rs.getString(colName));
				// }
			}
			// System.out.println(con);
			// con=null;
			// System.out.println(con);
			c.close();
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			if (c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

	}
}
