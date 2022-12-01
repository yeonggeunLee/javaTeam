/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;
import java.sql.*;
import java.io.*;
import java.util.*;

public class select {
	Connection con;
	String query;
	Statement stmt;
	ResultSet rs;
	public select() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userID = "c##dbinput";
                String userPW = "3503";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
		}
		try {
			con = DriverManager.getConnection(url, userID, userPW);
		} catch (Exception e) {
		}
	}
        // 데이터베이스에 저장된 데이터 출력
        void printsql() throws SQLException {
		query = "SELECT * FROM JSONPARSE"; // sql臾?
		stmt = con.createStatement();
		rs = stmt.executeQuery(query);
		System.out.println("LINE_NUM,\t\t\t\t\tSTATION_NM_ENG, \t\t\t\t\tSTATION_NM, \t\t\t\t\tSTATION_CD, \t\t\t\t\tFR_CODE");
		while (rs.next()) {
			System.out.printf("%10s",rs.getString(1));
			System.out.printf("%50s" , rs.getString(2));
			System.out.printf("%50s" ,rs.getString(3));
			System.out.printf("%50s" , rs.getString(4));
                        System.out.printf("%50s\n" , rs.getString(5));
		}
		con.close();
	}
}