/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;
/**
 *
 * @author 이영근
 */
import java.awt.*;
import javax.swing.*;

// 노선도 이미지 그리는 클래스
public class TestFrame extends JPanel {
    public TestFrame() {
}
    private Image img;
    
    public TestFrame(Image img) {
        this.img = img;
        setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
        setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
        setLayout(null);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(img, 3, 0, null);
    }
}
