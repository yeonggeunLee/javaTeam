/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;
/**
 *
 * @author �̿���
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


// ����ö �뼱�� API �����ͺ��̽��� �����ϴ� Ŭ����
public class jsonTodb {
    Connection con = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    
    public jsonTodb() throws SQLException {
        // �����ͺ��̽� ����
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userID = "c##dbinput";
        String userPW = "3503";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("JSON ���� ����̹� �ε� ����");
        } catch (Exception e) {
        }

        try {
            System.out.println("JSON ���� �����ͺ��̽����� �غ�...");
            con = DriverManager.getConnection(url, userID, userPW);
            System.out.println("JSON ���� �����ͺ��̽����� ����");
        } catch (Exception e) {
        }
            
        // API
        String key = "4d7769704164756433356745796663";
        String result = ""; 
        
        // JSON �Ľ�
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
                System.out.println("�Ľ̼���! Response code: " + conn.getResponseCode());
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject)jsonParser.parse(rd);
            JSONObject jsonOB = (JSONObject)jsonObject.get("SearchSTNBySubwayLineInfo");
            JSONArray dataArr =(JSONArray) jsonOB.get("row");
            
            // ������ ���̽��� API ������ ����
            String SQL = "INSERT INTO JSONPARSE(LINE_NUM, STATION_NM_ENG,STATION_NM, STATION_CD, FR_CODE) VALUES(?,?,?,?,?)";
            pstmt = con.prepareStatement(SQL);
            // �� Ű �����ϴ� ����
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
            System.out.println("JSON �Ľ� �� �����ͺ��̽� ���� �Ϸ�");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
