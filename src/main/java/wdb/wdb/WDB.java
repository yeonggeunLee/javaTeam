/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package wdb.wdb;

import java.sql.*;
import java.io.*;
import java.util.*;

public class WDB {
	public static void main(String[] args) {
                //jsonTodb stationInfoSet = new jsonTodb();
		select showjsonDB = new select();
		try {
			showjsonDB.printsql();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//            Connection conn = null;
//            Connection con;
//            Statement stmt;
//            String driverName = "oracle.jdbc.OracleDriver";
//            Class.forName(driverName);
//            String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
//            String db_id = "c##dbinput";
//            String db_pw = "3503";
//            conn = DriverManager.getConnection(db_url, db_id, db_pw);
//            System.out.println("데이터베이스에 성공적으로 연결하였습니다!");
//    }}
////            try{
////                Properties props = new Properties();
////                props.put("charSet", "8859_1");
////                con = DriverManager.getConnection(db_url,props);
////                stmt = con.createStatement();
////                String sqlStr = "SELECT * FROM USERINPUT";
////                ResultSet rs = stmt.executeQuery(sqlStr);
////                while(rs.next()){
////                    String s = fromDB(rs.getString("arrive"));
////                    System.out.println(s + " ");
////                }
////                stmt.close();
////                con.close();
////            }catch(SQLException e){
////                System.out.println("SQLException : " + e.getMessage());
////            }catch(UnsupportedEncodingException e){
////                System.out.println("EncodingException : " + e.getMessage());
////            }
//    }
//    static String toDB(String str) throws java.io.UnsupportedEncodingException{
//        return new String(str.getBytes("KSC5601"), "8859_1");
//    }
//    static String fromDB(String str) throws java.io.UnsupportedEncodingException{
//        return new String(str.getBytes("8859_1"), "KSC5601");
//    }
//}


//public class WDB {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//            String url = "jdbc:oracle:c##dbinput";
//            Connection con;
//            Statement stmt;
//            try{
//            String driverName = "oracle.jdbc.driver.OracleDriver";
//            Class.forName(driverName);
//            }catch(java.lang.ClassNotFoundException e){
//                System.err.print("ClassNotFoundException : ");;
//                System.err.println(e.getMessage());
//            }
//            try{
//                Properties props = new Properties();
//                props.put("charSet", "8859_1");
//                con = DriverManager.getConnection(url,props);
//                stmt = con.createStatement();
//                String sqlStr = "SELECT * FROM USERINPUT";
//                ResultSet rs = stmt.executeQuery(sqlStr);
//                while(rs.next()){
//                    String s = fromDB(rs.getString("name"));
//                    System.out.println(s + " ");
//                }
//                stmt.close();
//                con.close();
//            }catch(SQLException e){ 
//            }           
//    }
//    static String toDB(String str) throws java.io.UnsupportedEncodingException{
//        return new String(str.getBytes("KSC5601"), "8859_1");
//    }
//    static String fromDB(String str) throws java.io.UnsupportedEncodingException{
//        return new String(str.getBytes("8859_1"), "KSC5601");
//    }
//}
