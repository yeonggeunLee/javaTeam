/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package wdb.wdb;
/**
 *
 * @author 이영근
 */
import java.sql.*;
import java.io.*;
import java.util.*;

public class WDB {
	public static void main(String[] args) throws SQLException {
                // 화면 생성
                Screens sc = new Screens();
                
                // JSON 데이터 저장하는 데이터베이스 객체 생성
                jsonTodb stationInfoSet = new jsonTodb();
                
                // 데이터베이스 선택해서 출력하는 객체 생성
		select showjsonDB = new select();
		try {
			showjsonDB.printsql();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}