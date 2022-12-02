/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;

/**
 *
 * @author 이영근
 */
import java.sql.*;

// 입력한 데이터를 JSON데이터가 저장된 데이터베이스에서 검색하여 PassInput 클래스의 전달하는 변수에 저장하는 클래스
public class select {

    Connection con;
    String query;
    Statement stmt;
    ResultSet rs;

    // 넘겨줄 값 변수
    String passLineNum = "";
    String passDepNm = "";
    String passStationCd = "";

    public select() {
        String url = "jdbc:mysql://localhost:3306/jsonParse?serverTimezone=Asia/Seoul&useSSL=false";
        String userID = "JAVATEAM";
        String userPW = "team3503";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userID, userPW);
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
    }
    // 데이터베이스에 저장된 데이터 출력

    void printsql(String query) throws SQLException {
        this.query = query;
        stmt = con.createStatement();
        rs = stmt.executeQuery(this.query);
        while (rs.next()) {
            passLineNum = rs.getString(1);
            passDepNm = rs.getString(2);
            passStationCd = rs.getString(4);
        }
        con.close();
    }
}
