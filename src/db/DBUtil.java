/**
 * 
 */
package db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author marcos 21 oct 2025
 */
public class DBUtil {
	private static final String dbURL = "jdbc:mysql://localhost:3306/test";
	private static String username = "root";
	private static String password = "admin";
	private static HikariDataSource dataSource;
	public static void main(String[] args) {
		HikariConfig config = new HikariConfig();
		config.setUsername(username);
		config.setJdbcUrl(dbURL);
		config.setPassword(password);
		config.setMaximumPoolSize(20);
		dataSource = new HikariDataSource(config);
	}
}
