package p18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p17ee.UserInto;

public class Puls {
	// String url = "jdbc:mariadb://localhost:3306/iot2";
	// String user = "root";
	// String password = "test";
	Connection con = null;
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		String user;
		// Connection
		con = DriverManager.getConnection(url, user, password);
		System.out.println("연결완료");
		String sql = "select*from user_into";
		sql += " where uino<5";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<UserInto> userList = new ArrayList<UserInto>();

		while (rs.next()) {
			UserInto ui = new UserInto();
			ui.setUino(rs.getInt("uino"));
			ui.setUiName(rs.getString("uiname"));
			ui.setUiAge(rs.getInt("uiage"));
			ui.setUiid(rs.getString("uiid"));
			ui.setUipwd(rs.getString("uipwd"));
			ui.setCino(rs.getInt("cino"));
			ui.setAdress(rs.getString("adress"));
			userList.add(ui);
		}
		for (UserInto u : userList) {
			System.out.println(u);
		}
		// String uiId= rs.getString("uiid");
		// String uiPwd=rs.getString("uipwd");
		// String cino=rs.getString("cino");
		// String uiname= rs.getString("uiname");
		//// String uiadress=rs.getString("uiadress");
		// System.out.println("아리디:"+uiId+("비밀번호")+uiPwd+"이름"+uiname+("번호")+cino);
		// System.out.println(rs.getString("uiname"));
		// }
	} catch (SQLException e) {
		System.out.println("모르겠고 이스큐얼 에러");
		// e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} finally {
		if (con != null) {
			try {
				con.close();
				con = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
