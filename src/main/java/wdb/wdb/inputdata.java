/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.*;
import java.net.URL;
import java.sql.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class inputdata {
    Connection con = null; // 멤버변수
    Statement stmt = null;
    PreparedStatement pstmt = null;
    
    public inputdata() {
        // 데이터베이스 세팅
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userID = "c##dbinput";
        String userPW = "3503";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
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
