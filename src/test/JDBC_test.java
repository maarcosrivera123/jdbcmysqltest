package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_test {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "Admin";
		DriverManager driverManager;
		Connection connection;

		try {
			// Conexión a la base de datos
			connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println(connection);
			// Crear tabla con PreparedStatement
			String createSQL = "CREATE TABLE IF NOT EXISTS users (" + "id INT NOT NULL, " + "username VARCHAR(255), "
					+ "psw VARCHAR(255), " + "isVIP TINYINT(1), " + "balance FLOAT, " + "PRIMARY KEY (id)" + ")";
			String insertSQL = "INSERT INTO users VALUES (9000, 'marcos', 'Admin', 1, 10)";

			PreparedStatement ps = connection.prepareStatement(createSQL);
			ps.execute();
			ps = connection.prepareStatement(insertSQL);
			ps.execute();
			String delateSQLS = "DELETE FROM users where username = 'Alejandro'";
			ps = connection.prepareStatement(delateSQLS);
			ps.execute();
			connection.close(); // Cerrar conexión

			String selectSQLS = "select * from username where username = 'Marcos'";
			ps = connection.prepareStatement(delateSQLS);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
