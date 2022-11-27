/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wdb.wdb;

import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Screens extends JFrame {

    // 입력 값 저장 변수
    String LineNum = "";
    String DepartureNm = "";
    String ArriveNm = "";
    String RideTime = "";
    String RideDay = "";

    // 버튼클릭 변수
    int AddBtn = 0;
    int EditBtn = 0;
    int DeleteBtn = 0;
    int SearchBtn = 0;
    
    // 모달창 선택 변수
    int modalscreen = 0;
    
    // 노선도 이미지 리스트 선택 변수
    int selectedImage = 0;
    Panel pane = new Panel();
    
    public Screens() {
        Frame f = new Frame("지하철 혼잡도 정보 시스템");
        f.setSize(1024, 600);
        f.setLayout(null);

        // 상단 메뉴
        MenuBar menu = new MenuBar();
        Menu n1 = new Menu("노선도");
        MenuItem a = new MenuItem("노선도");
        n1.add(a);
        
        // 메뉴창 액션 추가 (완료)
        ActionListener Menulistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                switch (cmd) {
                    case "노선도":
                        modalscreen = 1;
                        // 노선도 이미지 모달창 다이얼로그 (모달 창 추가필요)
                        if (modalscreen == 1) {
                            Frame popF = new Frame("지하철 노선도");
                            popF.setSize(1440,960);
                            popF.setLayout(null);
                            
                            // 노선 선택
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
                            
                            // 노선도 이미지
                            ItemListener InfoLinelistener = new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
//                                    Panel pane = new Panel();
                                    if (cInfoLine.getSelectedItem() == "1호선") {
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_1.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
//                                        popF.add(pane);
                                    } else if (cInfoLine.getSelectedItem() == "2호선") {
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_2.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
//                                        popF.add(pane);
                                    } else if (cInfoLine.getSelectedItem() == "3호선") {
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_3.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
//                                        popF.add(pane);
                                    } else if (cInfoLine.getSelectedItem() == "4호선") {
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_4.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
//                                        popF.add(pane);
                                    } else if (cInfoLine.getSelectedItem() == "5호선") {
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_5.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
//                                        popF.add(pane);
                                    } else if (cInfoLine.getSelectedItem() == "6호선") {
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_6.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
//                                        popF.add(pane);
                                    } else if (cInfoLine.getSelectedItem() == "7호선") {
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_7.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
//                                        popF.add(pane);
                                    } else if (cInfoLine.getSelectedItem() == "8호선") {
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_8.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(1340, 860);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
//                                        popF.add(pane);
                                    } else if (cInfoLine.getSelectedItem() == "9호선") {
                                        ImageIcon icon = new ImageIcon("F:\\javasource\\javaTeam\\WDB\\src\\main\\java\\Image\\Line_9.png");
                                        Image img = icon.getImage();
//                                        Panel pane = new Panel();
                                        TestFrame test = new TestFrame(img);
                                        pane.setSize(900, 560);
                                        pane.setLocation(250, 50);
                                        pane.add(test);
//                                        popF.add(pane);
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

        // 노선 입력
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
        
        // 노선 입력 액션 추가 (완)
//        ItemListener cLinenumListener = new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                Choice ch = (Choice) e.getSource();
//                String selected = ch.getSelectedItem();
//                if(selected == "1호선"){
//                    LineNum = "1호선";
////                    System.out.println(LineNum);
//                }
//                else if(selected == "2호선"){
//                    LineNum = "2호선";
////                    System.out.println(LineNum);
//                }
//                else if(selected == "3호선"){
//                    LineNum = "3호선";
////                    System.out.println(LineNum);
//                }
//                else if(selected == "4호선"){
//                    LineNum = "4호선";
////                    System.out.println(LineNum);
//                }
//                else if(selected == "5호선"){
//                    LineNum = "5호선";
////                    System.out.println(LineNum);
//                }
//                else if(selected == "6호선"){
//                    LineNum = "6호선";
////                    System.out.println(LineNum);
//                }
//                else if(selected == "7호선"){
//                    LineNum = "7호선";
////                    System.out.println(LineNum);
//                }
//                else if(selected == "8호선"){
//                    LineNum = "8호선";
////                    System.out.println(LineNum);
//                }
//                else if(selected == "9호선"){
//                    LineNum = "9호선";
////                    System.out.println(LineNum);
//                }
//            }
//        };
//        cLinenum.addItemListener(cLinenumListener);

        // 출발,도착역 입력
        //Panel pStart = new Panel();
        //Panel pArrive = new Panel();
        Label lStart = new Label("출발역");
        Label lArrive = new Label("도착역");
        TextField tf1 = new TextField(20);
        TextField tf2 = new TextField(20);
//        pStart.add(lStart); pStart.add(tf1);
//        pArrive.add(lArrive); pArrive.add(tf2);
//        pStart.setSize(180,50);    pStart.setLocation(40,60);
//        pArrive.setSize(180,50);    pArrive.setLocation(300,60);
//        f.add(pStart);  f.add(pArrive);
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

        // 탑승시간 목록 선택
        //Panel pLine = new Panel();
        Choice cLine = new Choice();
        Label lLine = new Label("탑승시간");
        //lLine.setLocation(595, 60);
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
        //pLine.add(lLine);//   pLine.add(cLine);
        cLine.setSize(80, 60);
        cLine.setLocation(670, 90);
        lLine.setSize(100, 50);
        lLine.setLocation(595, 77);
        //pLine.setSize(100,50);     pLine.setLocation(595, 60);
        f.add(cLine);
        f.add(lLine);   //f.add(pLine);
        
        // 탑승시간 액션 추가 (완)
//         ItemListener cLineListener = new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                Choice ch = (Choice) e.getSource();
//                String selected = ch.getSelectedItem();
//                if(selected == "05:30"){
//                    RideTime = "05:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "06:00"){
//                    RideTime = "06:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "06:30"){
//                    RideTime = "06:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "07:00"){
//                    RideTime = "07:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "07:30"){
//                    RideTime = "07:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "08:00"){
//                    RideTime = "08:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "08:30"){
//                    RideTime = "08:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "09:00"){
//                    RideTime = "09:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "09:30"){
//                    RideTime = "09:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "10:00"){
//                    RideTime = "10:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "10:30"){
//                    RideTime = "10:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "11:00"){
//                    RideTime = "11:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "11:30"){
//                    RideTime = "11:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "12:00"){
//                    RideTime = "12:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "12:30"){
//                    RideTime = "12:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "13:00"){
//                    RideTime = "13:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "13:30"){
//                    RideTime = "13:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "14:00"){
//                    RideTime = "14:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "14:30"){
//                    RideTime = "14:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "15:00"){
//                    RideTime = "15:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "15:30"){
//                    RideTime = "15:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "16:00"){
//                    RideTime = "16:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "16:30"){
//                    RideTime = "16:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "17:00"){
//                    RideTime = "17:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "17:30"){
//                    RideTime = "17:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "18:00"){
//                    RideTime = "18:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "18:30"){
//                    RideTime = "18:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "19:00"){
//                    RideTime = "19:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "19:30"){
//                    RideTime = "19:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "20:00"){
//                    RideTime = "20:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "20:30"){
//                    RideTime = "20:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "21:00"){
//                    RideTime = "21:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "21:30"){
//                    RideTime = "21:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "22:00"){
//                    RideTime = "22:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "22:30"){
//                    RideTime = "22:30";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "23:00"){
//                    RideTime = "23:00";
////                    System.out.println(RideTime);
//                }
//                else if(selected == "23:30"){
//                    RideTime = "23:30";
////                    System.out.println(RideTime);
//                }
//            }
//        };
//        cLine.addItemListener(cLineListener);

        // 탑승요일 목록 선택
        //Panel pDay = new Panel();
        Choice cDay = new Choice();
        Label lDay = new Label("탑승요일");
        cDay.add("월~금");
        cDay.add("토");
        cDay.add("공휴일");
        //pDay.add(lDay); pDay.setSize(100,50);  pDay.setLocation(855, 60);
        cDay.setSize(80, 60);
        cDay.setLocation(900, 90);
        lDay.setSize(100, 50);
        lDay.setLocation(825, 77);
        f.add(cDay);
        f.add(lDay);    //f.add(pDay);

        // 탑승요일 액션 추가 (완)
//         ItemListener cDayListener = new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                Choice ch = (Choice) e.getSource();
//                String selected = ch.getSelectedItem();
//                if(selected == "월~금"){
//                    RideDay = "월~금";
////                    System.out.println(RideDay);
//                }
//                else if(selected == "토"){
//                    RideDay = "토";
////                    System.out.println(RideDay);
//                }
//                else if(selected == "공휴일"){
//                    RideDay = "공휴일";
////                    System.out.println(RideDay);
//                }
//            }
//        };
//        cDay.addItemListener(cDayListener);
        
        // 저장 리스트 (TextArea로 할지 Table로 할지 다른 방안 검색)
        String header[] = {"출발역 노선","출발역","도착역","탑승시간","탑승요일"};
        String contents[][] = {};
        
        DefaultTableModel model = new DefaultTableModel(contents, header);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        
        scrollPane.setSize(900, 320);
        scrollPane.setLocation(40, 220);
        
        f.add(scrollPane);
        
        // 추가 버튼 (입력 결과 창에 나오게 추가 필요), (세부 기능 추가 필요)
        Button bAdd = new Button("추가");
         ActionListener bAddListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String inputStr[] = new String[5];
                inputStr[0] = cLinenum.getSelectedItem();
                inputStr[1] = tf1.getText();
                inputStr[2] = tf2.getText();
                inputStr[3] = cLine.getSelectedItem();
                inputStr[4] = cDay.getSelectedItem();
                
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
                    SearchBtn = 1;
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

        f.add(bAdd);
        f.add(bEdit);
        f.add(bDelete);
        f.add(bSearch);

        
        


        f.addWindowListener(new screenexit());
        f.setVisible(true);
    }
    public void modalscreen(){
        
    }

}
