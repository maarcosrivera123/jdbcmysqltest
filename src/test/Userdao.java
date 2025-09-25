/**
 * 
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * data access object for user table
 * 
 * @author marcos 25 sept 2025
 */
public class Userdao {
	public void insert(int id, String name, boolean isVip) {
		String insertSQL = "INSERT INTO users VALUES (9000, 'marcos', 'Admin', 1, 10)";
		Connection connection = DBHelper.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement(insertSQL);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
