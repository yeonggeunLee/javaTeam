/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;
/**
 *
 * @author �̿���
 */
import java.sql.*;

// ����� �Է��� ������ ���̽��� �����ϴ� Ŭ����
public class inputdata {
    Connection con = null; // 멤�?�???
    Statement stmt = null;
    PreparedStatement pstmt = null;
    
    public inputdata() {
        // �����ͺ��̽� ����
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userID = "c##dbinput";
        String userPW = "3503";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("�Է� ������ ���� ����̹� �ε� ����");
        } catch (Exception e) {
        }

        try {
            System.out.println("�Է� ������ ���� �����ͺ��̽����� �غ�...");
            con = DriverManager.getConnection(url, userID, userPW);
            System.out.println("�Է� ������ ���� �����ͺ��̽����� ����");
        } catch (Exception e) {
        }
    }
}
