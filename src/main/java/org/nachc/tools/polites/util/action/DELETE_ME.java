package org.nachc.tools.polites.util.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DELETE_ME {

	public static void dropDatabase(String databaseName) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// Set up the connection to the database where you have the right to drop databases
			// Typically this would be to a maintenance database like 'postgres'
			conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres?user=postgres&password=mypass");
			// Turning off autocommit
			conn.setAutoCommit(true);

			// Create the SQL command to drop the database
			String sql = "DROP DATABASE " + databaseName;

			// Create a Statement object
			stmt = conn.createStatement();

			// Execute the drop command
			stmt.executeUpdate(sql);

			System.out.println("Database " + databaseName + " dropped successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Clean up the environment by closing statement and connection
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		dropDatabase("foo_bar");
	}
}
