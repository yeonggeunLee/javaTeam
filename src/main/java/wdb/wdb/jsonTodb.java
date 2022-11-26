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

public class jsonTodb {
    
    Connection con = null; // 멤버변수
    //String query;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    
    public jsonTodb() {

        // 저장된 파일 이용한 방법
        String filepath = "F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\wdb\\wdb\\서울교통공사 노선별 지하철역 정보.json";
        // 데이터베이스 세팅
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userID = "c##dbinput";
        String userPW = "3503";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("JSON 저장 드라이버 로드 성공");
        } catch (Exception e) {
        }

        try {
            System.out.println("JSON 저장 데이터베이스연결 준비...");
            con = DriverManager.getConnection(url, userID, userPW);
            System.out.println("JSON 저장 데이터베이스연결 성공");
        } catch (Exception e) {
        }
        
        // json 데이터 파싱
        try {
            Reader reader = new FileReader(filepath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            JSONArray StationInfo = (JSONArray) jsonObject.get("DATA");
        
        // 데이터베이스
            String SQL = "INSERT INTO JSONPARSE(LINE_NUM, STATION_NM_ENG,STATION_NM, STATION_CD, FR_CODE) VALUES(?,?,?,?,?)";
            pstmt = con.prepareStatement(SQL);
            String getLineNum = "";
            String getStnNEng = "";
            String getStnName = "";
            String getStnCd = "";
            String getFrCd  = "";

            if (StationInfo.size() > 0) {
                for (int i = 0; i < StationInfo.size(); i++) {
                    JSONObject Station = (JSONObject) StationInfo.get(i);
                    getLineNum = (String) Station.get("line_num");
                    getStnNEng = (String) Station.get("station_nm_eng");
                    getStnName = (String) Station.get("station_nm");
                    getStnCd = (String) Station.get("station_cd");
                    getFrCd = (String) Station.get("fr_code");
                    
                    pstmt.setString(1, getLineNum);
                    pstmt.setString(2, getStnNEng);
                    pstmt.setString(3, getStnName);
                    pstmt.setString(4, getStnCd);
                    pstmt.setString(5, getFrCd);
                    pstmt.executeUpdate();
                    
                }
            }
//            String SQL2 = "INSERT INTO JSONPARSE(LINE_NUM, STATION_NM_ENG,STATION_NM, STATION_CD, FR_CODE) VALUES(?,?,?,?,?)";
//            pstmt = con.prepareStatement(SQL2);
            System.out.println("JSON 파싱 및 데이터베이스 저장 완료");
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        // 바로 가져오기
//        String key = "4d7769704164756433356745796663";
//        String result = "";
//        
//        try {
//            URL url = new URL("http://openapi.seoul.go.kr:8088/" + key + "/json/SearchSTNBySubwayLineInfo/1/800");
//            BufferedReader bf;
//            bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
//            result = bf.readLine();
//            
//            JSONParser jsonParser = new JSONParser();
//            JSONObject jsonObject = (JSONObject) jsonParser.parse(result);
//            System.out.println(jsonObject);
//            } catch (Exception e) {
//            e.printStackTrace();
//        }

       
    }
}
