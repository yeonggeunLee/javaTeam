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
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

public class Screens extends JFrame {
    
    // 입력 데이터 데이터베이스 생성
    inputdata InputData = new inputdata();
    PreparedStatement pstmt = null;
    
    // 모달창 선택 변수
    int modalscreen = 0;
    
    // 노선도 이미지 패널
    Panel pane = new Panel();
    
    // 넘겨줄 값 변수
    String passLineNum = "";
    String passDepNm = "";
    String passArvNm = "";
    String passRTime = "";
    String passRDay = "";
    
    public Screens() {
        // 메인화면 프레임 생성
        Frame f = new Frame("지하철 혼잡도 정보 시스템");
        f.setSize(1024, 600);
        f.setLayout(null);

        // 상단 메뉴
        MenuBar menu = new MenuBar();
        Menu n1 = new Menu("노선도");
        MenuItem a = new MenuItem("노선도");
        n1.add(a);
        
        // 메뉴창 액션 추가
        ActionListener Menulistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                switch (cmd) {
                    case "노선도":
                        modalscreen = 1;
                        // 노선도 이미 모달형식 프레임 생성
                        if (modalscreen == 1) {
                            Frame popF = new Frame("지하철 노선도");
                            popF.setSize(1440,960);
                            popF.setLayout(null);
                            
                            // ?몄?? ???? 肄ㅻ낫諛??? ????
                            Choice cInfoLine = new Choice();
                            cInfoLine.add("1호선");
                            cInfoLine.add("2호선");
                            cInfoLine.add("3호선");
                            cInfoLine.add("4호선");
                            cInfoLine.add("5호선");
                            cInfoLine.add("6호선");
                            cInfoLine.add("7호선");
                            cInfoLine.add("8호선");
                            cInfoLine.add("9호선");
                            cInfoLine.setSize(80, 60);
                            cInfoLine.setLocation(50, 50);
                            popF.add(cInfoLine);
                            
                            // 노선도 이미지 출력하는 액션
                            ItemListener InfoLinelistener = new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if (cInfoLine.getSelectedItem() == "1호선") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_1.png");
                                        Image img = icon.getImage();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "2호선") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_2.png");
                                        Image img = icon.getImage();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "3호선") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_3.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "4호선") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_4.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "5호선") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_5.png");
                                        Image img = icon.getImage();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "6호선") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_6.png");
                                        Image img = icon.getImage();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "7호선") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_7.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "8호선") {
                                        pane.removeAll();
                                        popF.add(cInfoLine);
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_8.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
                                    } else if (cInfoLine.getSelectedItem() == "9호선") {
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

        // 노선 입력 콤보박스 생성
        Label lLinenum = new Label("출발역 노선");
        lLinenum.setSize(65, 50);
        lLinenum.setLocation(20, 77);
        f.add(lLinenum);
        Choice cLinenum = new Choice();
        cLinenum.add("1호선");
        cLinenum.add("2호선");
        cLinenum.add("3호선");
        cLinenum.add("4호선");
        cLinenum.add("5호선");
        cLinenum.add("6호선");
        cLinenum.add("7호선");
        cLinenum.add("8호선");
        cLinenum.add("9호선");
        cLinenum.setSize(80, 60);
        cLinenum.setLocation(95, 90);
        f.add(cLinenum);

        // 출발역, 도착역 입력 TextField 생성
        Label lStart = new Label("출발역");
        Label lArrive = new Label("도착역");
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

        // 탑승시간 목록 콤보박스 생성
        Choice cLine = new Choice();
        Label lLine = new Label("탑승시간");
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
       
        // 탑승요일 목록 콤보박스 생성
        Choice cDay = new Choice();
        Label lDay = new Label("탑승요일");
        cDay.add("월~금");
        cDay.add("토");
        cDay.add("공휴일");
        cDay.setSize(80, 60);
        cDay.setLocation(900, 90);
        lDay.setSize(100, 50);
        lDay.setLocation(825, 77);
        f.add(cDay);
        f.add(lDay);
        
        // 메인화면 사용자 입력데이터 넣을 테이블 생성
        String header[] = {"출발역 노선","출발역","도착역","탑승시간","탑승요일"};
        String contents[][] = {};
        
        DefaultTableModel model = new DefaultTableModel(contents, header);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        
        scrollPane.setSize(900, 320);
        scrollPane.setLocation(40, 220);
        
        f.add(scrollPane);
        
        // 추가 버튼  (클릭 시 사용자 입력 데이터가 테이블 및 데이터베이스에 저장)
        Button bAdd = new Button("추가");
         ActionListener bAddListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // 사용자 입력데이터
                String inputStr[] = new String[5];
                inputStr[0] = cLinenum.getSelectedItem();
                inputStr[1] = tf1.getText();
                inputStr[2] = tf2.getText();
                inputStr[3] = cLine.getSelectedItem();
                inputStr[4] = cDay.getSelectedItem();
                // 넘겨줄 값 저장 변수
                passLineNum = cLinenum.getSelectedItem();
                passDepNm = tf1.getText();
                passArvNm = tf2.getText();
                passRTime = cLine.getSelectedItem();
                passRDay = cDay.getSelectedItem();
                
                // 사용자 입력 데이터베이스에 저장
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
                
                // 테이블 생성
                model.addRow(inputStr);
                tf1.setText("");
                tf2.setText("");
            }
        };
        bAdd.addActionListener(bAddListener);

        // 수정 버튼 (세부 기능 추가 필요)
        Button bEdit = new Button("수정");
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

        // 삭제 버튼 (세부 기능 추가 필요)
        Button bDelete = new Button("삭제");
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

        // 검색 버튼 (세부 기능 추가 필요)
        Button bSearch = new Button("검색");
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

        // 메인화면 프레임에 버튼 추가
        f.add(bAdd);
        f.add(bEdit);
        f.add(bDelete);
        f.add(bSearch);

        f.addWindowListener(new screenexit());
        f.setVisible(true);
    }
}
