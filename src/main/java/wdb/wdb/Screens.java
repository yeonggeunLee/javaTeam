/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;
/**
 *
 * @author �̿���
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class Screens extends JFrame {
    
    // �Է� ������ �����ͺ��̽� ����
    inputdata InputData = new inputdata();
    PreparedStatement pstmt = null;
    
    // ���â ���� ����
    int modalscreen = 0;
    
    // �뼱�� �̹��� �г�
    Panel pane = new Panel();
    
    // �Ѱ��� �� ����
    String passLineNum = "";
    String passDepNm = "";
    String passArvNm = "";
    String passRTime = "";
    String passRDay = "";
    
    public Screens() {
        // ����ȭ�� ������ ����
        Frame f = new Frame("����ö ȥ�⵵ ���� �ý���");
        f.setSize(1024, 600);
        f.setLayout(null);

        // ��� �޴�
        MenuBar menu = new MenuBar();
        Menu n1 = new Menu("�뼱��");
        MenuItem a = new MenuItem("�뼱��");
        n1.add(a);
        
        // �޴�â �׼� �߰�
        ActionListener Menulistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                switch (cmd) {
                    case "�뼱��":
                        modalscreen = 1;
                        // �뼱�� �̹� ������� ������ ����
                        if (modalscreen == 1) {
                            Frame popF = new Frame("����ö �뼱��");
                            popF.setSize(1440,960);
                            popF.setLayout(null);
                            
                            // ?��?? ???? 콤보�??? ????
                            Choice cInfoLine = new Choice();
                            cInfoLine.add("1ȣ��");
                            cInfoLine.add("2ȣ��");
                            cInfoLine.add("3ȣ��");
                            cInfoLine.add("4ȣ��");
                            cInfoLine.add("5ȣ��");
                            cInfoLine.add("6ȣ��");
                            cInfoLine.add("7ȣ��");
                            cInfoLine.add("8ȣ��");
                            cInfoLine.add("9ȣ��");
                            cInfoLine.setSize(80, 60);
                            cInfoLine.setLocation(50, 50);
                            popF.add(cInfoLine);
                            
                            // �뼱�� �̹��� ����ϴ� �׼�
                            ItemListener InfoLinelistener = new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if (cInfoLine.getSelectedItem() == "1ȣ��") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_1.png");
                                        Image img = icon.getImage();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "2ȣ��") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_2.png");
                                        Image img = icon.getImage();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "3ȣ��") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_3.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "4ȣ��") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_4.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "5ȣ��") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_5.png");
                                        Image img = icon.getImage();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "6ȣ��") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_6.png");
                                        Image img = icon.getImage();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "7ȣ��") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_7.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "8ȣ��") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_8.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "9ȣ��") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_9.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1200, 1060);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    }
                                    popF.add(pane);
                                }
                            };
                            cInfoLine.addItemListener((ItemListener) InfoLinelistener);
                            popF.addWindowListener(new screenexit());
                            popF.setVisible(true);
                        }
                        break;
                }
            }
        };
        a.addActionListener(Menulistener);
        menu.add(n1);
        f.setMenuBar(menu);

        // �뼱 �Է� �޺��ڽ� ����
        Label lLinenum = new Label("��߿� �뼱");
        lLinenum.setSize(65, 50);
        lLinenum.setLocation(20, 77);
        f.add(lLinenum);
        Choice cLinenum = new Choice();
        cLinenum.add("1ȣ��");
        cLinenum.add("2ȣ��");
        cLinenum.add("3ȣ��");
        cLinenum.add("4ȣ��");
        cLinenum.add("5ȣ��");
        cLinenum.add("6ȣ��");
        cLinenum.add("7ȣ��");
        cLinenum.add("8ȣ��");
        cLinenum.add("9ȣ��");
        cLinenum.setSize(80, 60);
        cLinenum.setLocation(95, 90);
        f.add(cLinenum);

        // ��߿�, ������ �Է� TextField ����
        Label lStart = new Label("��߿�");
        Label lArrive = new Label("������");
        TextField tf1 = new TextField(20);
        TextField tf2 = new TextField(20);
        
        lStart.setSize(50, 50);
        lStart.setLocation(190, 77);
        f.add(lStart);
        tf1.setSize(110, 25);
        tf1.setLocation(240, 90);
        f.add(tf1);
        lArrive.setSize(50, 50);
        lArrive.setLocation(390, 77);
        f.add(lArrive);
        tf2.setSize(110, 25);
        tf2.setLocation(440, 90);
        f.add(tf2);

        // ž�½ð� ��� �޺��ڽ� ����
        Choice cLine = new Choice();
        Label lLine = new Label("ž�½ð�");
        cLine.add("05:30");
        cLine.add("06:00");
        cLine.add("06:30");
        cLine.add("07:00");
        cLine.add("07:30");
        cLine.add("08:00");
        cLine.add("08:30");
        cLine.add("09:00");
        cLine.add("09:30");
        cLine.add("10:00");
        cLine.add("10:30");
        cLine.add("11:00");
        cLine.add("11:30");
        cLine.add("12:00");
        cLine.add("12:30");
        cLine.add("13:00");
        cLine.add("13:30");
        cLine.add("14:00");
        cLine.add("14:30");
        cLine.add("15:00");
        cLine.add("15:30");
        cLine.add("16:00");
        cLine.add("16:30");
        cLine.add("17:00");
        cLine.add("17:30");
        cLine.add("18:00");
        cLine.add("18:30");
        cLine.add("19:00");
        cLine.add("19:30");
        cLine.add("20:00");
        cLine.add("20:30");
        cLine.add("21:00");
        cLine.add("21:30");
        cLine.add("22:00");
        cLine.add("22:30");
        cLine.add("23:00");
        cLine.add("23:30");
        cLine.setSize(80, 60);
        cLine.setLocation(670, 90);
        lLine.setSize(100, 50);
        lLine.setLocation(595, 77);
        f.add(cLine);
        f.add(lLine);   //f.add(pLine);
       
        // ž�¿��� ��� �޺��ڽ� ����
        Choice cDay = new Choice();
        Label lDay = new Label("ž�¿���");
        cDay.add("��~��");
        cDay.add("��");
        cDay.add("������");
        cDay.setSize(80, 60);
        cDay.setLocation(900, 90);
        lDay.setSize(100, 50);
        lDay.setLocation(825, 77);
        f.add(cDay);
        f.add(lDay);
        
        // ����ȭ�� ����� �Էµ����� ���� ���̺� ����
        String header[] = {"��߿� �뼱","��߿�","������","ž�½ð�","ž�¿���"};
        String contents[][] = {};
        
        DefaultTableModel model = new DefaultTableModel(contents, header);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        
        scrollPane.setSize(900, 320);
        scrollPane.setLocation(40, 220);
        
        f.add(scrollPane);
        
        // �߰� ��ư  (Ŭ�� �� ����� �Է� �����Ͱ� ���̺� �� �����ͺ��̽��� ����)
        Button bAdd = new Button("�߰�");
         ActionListener bAddListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // ����� �Էµ�����
                String inputStr[] = new String[5];
                inputStr[0] = cLinenum.getSelectedItem();
                inputStr[1] = tf1.getText();
                inputStr[2] = tf2.getText();
                inputStr[3] = cLine.getSelectedItem();
                inputStr[4] = cDay.getSelectedItem();
                // �Ѱ��� �� ���� ����
                passLineNum = cLinenum.getSelectedItem();
                passDepNm = tf1.getText();
                passArvNm = tf2.getText();
                passRTime = cLine.getSelectedItem();
                passRDay = cDay.getSelectedItem();
                
                // ����� �Է� �����ͺ��̽��� ����
                try {
                    String SQL = "INSERT INTO USERINPUT(LINE_NUM, DEPARTURE, ARRIVE, RIDETIME, RIDEDAY) VALUES(?,?,?,?,?)";
                    pstmt = InputData.con.prepareStatement(SQL);
                    pstmt.setString(1, inputStr[0]);
                    pstmt.setString(2, inputStr[1]);
                    pstmt.setString(3, inputStr[2]);
                    pstmt.setString(4, inputStr[3]);
                    pstmt.setString(5, inputStr[4]);
                    pstmt.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                
                // ���̺� ����
                model.addRow(inputStr);
                tf1.setText("");
                tf2.setText("");
            }
        };
        bAdd.addActionListener(bAddListener);

        // ���� ��ư (���� ��� �߰� �ʿ�)
        Button bEdit = new Button("����");
        ActionListener bEditListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(table.getSelectedRow() == -1){
                    return;
                }
                else {
//                    System.out.println(table.getSelectedRow());
//                    model.removeRow(table.getSelectedRow());
                    String inputStr[] = new String[5];
                    inputStr[0] = cLinenum.getSelectedItem();
                    inputStr[1] = tf1.getText();
                    inputStr[2] = tf2.getText();
                    inputStr[3] = cLine.getSelectedItem();
                    inputStr[4] = cDay.getSelectedItem();
                    for(int i = 0 ; i< 5;i++){
                        model.setValueAt(inputStr[i], table.getSelectedRow(), i);
                    }
//                    try {
//                    String SQL = "UPDATE USERINPUT SET(LINE_NUM, DEPARTURE, ARRIVE, RIDETIME, RIDEDAY) VALUES(?,?,?,?,?)";
//                    pstmt = InputData.con.prepareStatement(SQL);
//                    pstmt.setString(1, inputStr[0]);
//                    pstmt.setString(2, inputStr[1]);
//                    pstmt.setString(3, inputStr[2]);
//                    pstmt.setString(4, inputStr[3]);
//                    pstmt.setString(5, inputStr[4]);
//                    pstmt.executeUpdate();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
                }
            }
        };
        bEdit.addActionListener(bEditListener);

        // ���� ��ư (���� ��� �߰� �ʿ�)
        Button bDelete = new Button("����");
        ActionListener bDeleteListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(table.getSelectedRow() == -1){
                    return;
                }
                else {
                    model.removeRow(table.getSelectedRow());
                }
            }
        };
        bDelete.addActionListener(bDeleteListener);

        // �˻� ��ư (���� ��� �߰� �ʿ�)
        Button bSearch = new Button("�˻�");
        ActionListener bSearchListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (bSearch.equals(ae.getSource())) {
//                    System.out.println(SearchBtn);
                }
            }
        };
        bSearch.addActionListener(bSearchListener);

        bAdd.setSize(150, 40);
        bAdd.setLocation(50, 150);
        bEdit.setSize(150, 40);
        bEdit.setLocation(310, 150);
        bDelete.setSize(150, 40);
        bDelete.setLocation(570, 150);
        bSearch.setSize(150, 40);
        bSearch.setLocation(830, 150);

        // ����ȭ�� �����ӿ� ��ư �߰�
        f.add(bAdd);
        f.add(bEdit);
        f.add(bDelete);
        f.add(bSearch);

        f.addWindowListener(new screenexit());
        f.setVisible(true);
    }
}
