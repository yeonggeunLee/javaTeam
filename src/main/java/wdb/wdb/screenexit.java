/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;

import java.awt.event.*;

/**
 *
 * @author 이영근
 */
// 화면 x 클릭시 꺼지는 클래스
public class screenexit extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent we) {
        we.getWindow().setVisible(false);
        we.getWindow().dispose();
        //System.exit(0);
    }
}
