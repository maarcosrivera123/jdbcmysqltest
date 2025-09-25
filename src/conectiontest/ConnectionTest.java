package conectiontest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) throws SQLException, InterruptedException {
		String dbURL = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "Admin";
		DriverManager driveManager;
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println(connection);
//las conexiones con las base de datos son objetos pesados
//el proceso de establecimiento de las conneccion consume
//mucho recurso en el ordenador ...
//una prueba de cuantas conexiones se pueden establecer con una base de datos
		Connection[] connections = new Connection[100];
		for (int i = 0; i < 1000; i++) {
			connections[1] = DriverManager.getConnection(dbURL, username, password);

		}
		Thread.currentThread().wait(1231234);
	}
}
