package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Account;

//import com.mysql.jdbc.Driver;

public class Ex1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// step-1 : register db-driver with JDBC API

		// DriverManager.registerDriver(new Driver());
		// or
		Class.forName("com.mysql.cj.jdbc.Driver"); // dynamic class loading

		// step-2 : create db connection
		String url = "jdbc:mysql://localhost:3306/my_bank";
		String user = "root";
		String password = "root1234";
		Connection con = DriverManager.getConnection(url, user, password);

//		String sql = "SELECT * FROM my_bank.ACCOUNTS";
		// Statement statement = con.createStatement();
//		ResultSet rs = statement.executeQuery(sql);

		String sql = "SELECT * FROM my_bank.ACCOUNTS acc WHERE acc.num = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, "1");

		ResultSet rs = statement.executeQuery(sql);

		List<Account> accounts = new ArrayList<>();
		while (rs.next()) {
			Account account = new Account();
			account.setNum(rs.getString(1));
			account.setBalance(rs.getDouble(2));
			accounts.add(account);
		}

		con.close();

		// -----------------------------------------------

		for (Account account : accounts) {
			System.out.println(account);
		}

	}

}
