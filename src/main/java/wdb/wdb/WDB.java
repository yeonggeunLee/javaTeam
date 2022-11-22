/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package wdb.wdb;

import java.sql.*;
import java.io.*;
import java.util.*;

public class WDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        java.sql.Statement stmt = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        String filePath = "JSON 디렉토리 입력하세요 !!";

        String name = "";
        long soldAmount = 0;
        long price = 0;

        try {
            Connection conn = null;
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String db_id = "c##dbinput";
            String db_pw = "3503";
            conn = DriverManager.getConnection(db_url, db_id, db_pw);
            System.out.println("데이터베이스에 성공적으로 연결하였습니다!");
            stmt = conn.createStatement();

            boolean b = stmt.execute(query);

            System.out.println("b : " + b);

        } catch (ClassNotFoundException ex) {
            System.out.println("드라이버 로딩 실패");
            ex.printStackTrace();
        } catch (SQLException e) {
            System.out.println("sql오류 :이미 생성");
            //.printStackTrace();
        } finally {
            CloseUtil.close(null, stmt, conn);
        }
    }
}
