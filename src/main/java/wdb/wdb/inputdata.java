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

// 사용자 입력을 데이터 베이스에 저장하는 클래스
public class inputdata {
    Connection con = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    
    public inputdata() {
        // 데이터베이스 세팅
        String url = "jdbc:mysql://localhost:3306/connectdb1?serverTimezone=Asia/Seoul&useSSL=false";
        String userID = "c##dbinput";
        String userPW = "3503";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("입력 데이터 저장 드라이버 로드 성공");
        } catch (Exception e) {
        }

        try {
            System.out.println("입력 데이터 저장 데이터베이스연결 준비...");
            con = DriverManager.getConnection(url, userID, userPW);
            System.out.println("입력 데이터 저장 데이터베이스연결 성공");
        } catch (Exception e) {
        }
    }
}