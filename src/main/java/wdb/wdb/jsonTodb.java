/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;
/**
 *
 * @author 이영근
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


// 지하철 노선도 API 데이터베이스에 저장하는 클래스
public class jsonTodb {
    Connection con = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    
    public jsonTodb() throws SQLException {
        // 데이터베이스 세팅
        String url = "jdbc:mysql://localhost:3306/jsonParse?serverTimezone=Asia/Seoul&useSSL=false";
        String userID = "JAVATEAM";
        String userPW = "team3503";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userID, userPW);
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
            
        // API
        String key = "4d7769704164756433356745796663";
        String result = ""; 
        
        // JSON 파싱
        try {
            StringBuilder API = new StringBuilder("http://openapi.seoul.go.kr:8088");
            API.append("/" +  URLEncoder.encode(key,"UTF-8") );
            API.append("/" +  URLEncoder.encode("json","UTF-8") );
            API.append("/" + URLEncoder.encode("SearchSTNBySubwayLineInfo","UTF-8"));
            API.append("/" + URLEncoder.encode("1","UTF-8"));
            API.append("/" + URLEncoder.encode("800","UTF-8"));
            
            URL APIurl = new URL(API.toString());
            HttpURLConnection conn = (HttpURLConnection) APIurl.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            BufferedReader rd;
            
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject)jsonParser.parse(rd);
            JSONObject jsonOB = (JSONObject)jsonObject.get("SearchSTNBySubwayLineInfo");
            JSONArray dataArr =(JSONArray) jsonOB.get("row");
            
            
            
            // 데이터 베이스에 API 데이터 저장
            String SQL = "INSERT INTO jsonP(LINE_NUM, STATION_NM_ENG,STATION_NM, STATION_CD, FR_CODE) VALUES(?,?,?,?,?)";
            pstmt = con.prepareStatement(SQL);
            // 각 키 저장하는 변수
            String getLineNum = "";
            String getStnNEng = "";
            String getStnName = "";
            String getStnCd = "";
            String getFrCd  = "";
            
            for(int i = 0; i < dataArr.size(); i++){
                JSONObject data = (JSONObject)dataArr.get(i);
                getLineNum = (String) data.get("LINE_NUM");
                getStnNEng = (String) data.get("STATION_NM_ENG");
                getStnName = (String) data.get("STATION_NM");
                getStnCd = (String) data.get("STATION_CD");
                getFrCd  = (String) data.get("FR_CODE");
                
                pstmt.setString(1, getLineNum);
                pstmt.setString(2, getStnNEng);
                pstmt.setString(3, getStnName);
                pstmt.setString(4, getStnCd);
                pstmt.setString(5, getFrCd);
                pstmt.executeUpdate();
            }
            System.out.println("JSON 파싱 및 데이터베이스 저장 완료");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}