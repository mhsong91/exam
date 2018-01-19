package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Service {
	DBCon dbcon;

	Service() {
		dbcon = new DBCon();
	}

	public int insertInfo(LinkedHashMap<String, Object> hm) {
		int resert = 0;
		String sql = "insert into class_info(ciname,cidescr)\r\n" + "values (?,?)\r\n";
		try {
			resert = dbcon.executeUpdate(sql, hm);
			dbcon.commit();
		} catch (SQLException e) {

			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			return resert;
		}
	

	// 업데이트
	public int updateClassInfo(LinkedHashMap<String, Object> hm) {
		int resurt = 0;
		String sql = "update class_info\r\n" + "set cidescr=?\r\n" + "where cino=?";
		try {
			resurt = dbcon.executeUpdate(sql, hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			e.printStackTrace();
		} finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resurt;
	}
}
