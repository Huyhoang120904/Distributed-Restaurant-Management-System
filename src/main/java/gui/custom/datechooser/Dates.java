/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.custom.datechooser;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;

public final class Dates extends javax.swing.JPanel {

    private Event event;
    private final int MONTH;
    private final int YEAR;
    private final int DAY;
    private int m;
    private int y;
    private int selectDay = 0;
    private int startDate;
    private int max_of_month;
    private boolean allowUpdateTxtReference = true;

    public Dates() {
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String toDay = df.format(date);
        DAY = Integer.valueOf(toDay.split("-")[0]);
        MONTH = Integer.valueOf(toDay.split("-")[1]);
        YEAR = Integer.valueOf(toDay.split("-")[2]);
        this.allowUpdateTxtReference = true;
    }

    public Dates(boolean isAllow) {
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String toDay = df.format(date);
        DAY = Integer.valueOf(toDay.split("-")[0]);
        MONTH = Integer.valueOf(toDay.split("-")[1]);
        YEAR = Integer.valueOf(toDay.split("-")[2]);
        this.allowUpdateTxtReference = isAllow;
    }

    public int getMONTH() {
        return MONTH;
    }

    public int getYEAR() {
        return YEAR;
    }

    public int getDAY() {
        return DAY;
    }

    public boolean isAllowUpdateTxtReference() {
        return allowUpdateTxtReference;
    }

    public void showDate(int month, int year, SelectedDate select) {
        m = month;
        y = year;
        // selectDay = 0;
        Calendar cd = Calendar.getInstance();
        cd.set(year, month - 1, 1);
        int start = cd.get(Calendar.DAY_OF_WEEK);
        max_of_month = cd.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (start == 1) {
            start += 7;
        }
        clear();
        start += 5;
        startDate = start;
        for (int i = 1; i <= max_of_month; i++) {
            Button cmd = (Button) getComponent(start);
            cmd.setColorSelected(getForeground());
            cmd.setText(i + "");
            if (i == DAY && month == MONTH && year == YEAR) {
                cmd.setBackground(new Color(224, 214, 229));
            } else {
                cmd.setBackground(Color.WHITE);
            }
            if (i == select.getDay() && month == select.getMonth() && year == select.getYear()) {
                cmd.setBackground(getForeground());
                cmd.setForeground(new Color(255, 255, 255));
            }
            start++;
        }
    }

    private void clear() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((JButton) getComponent(i)).setText("");
        }
    }

    public void clearSelected() {
        for (int i = 7; i < getComponentCount(); i++) {
            JButton cmd = (JButton) getComponent(i);
            if (MONTH == m && y == YEAR && !cmd.getText().equals("") && Integer.valueOf(cmd.getText()) == DAY) {
                cmd.setBackground(new Color(224, 214, 229));
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            } else {
                cmd.setBackground(Color.WHITE);
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            }
        }
        selectDay = 0;
    }

    private void addEvent() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((Button) getComponent(i)).setEvent(event);
        }
    }

    public void setSelected(int index) {
        selectDay = index;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        cmdMo = new gui.custom.datechooser.Button(this);
        cmdTu = new gui.custom.datechooser.Button(this);
        cmdWe = new gui.custom.datechooser.Button(this);
        cmdTh = new gui.custom.datechooser.Button(this);
        cmdFr = new gui.custom.datechooser.Button(this);
        cmdSa = new gui.custom.datechooser.Button(this);
        cmdSu = new gui.custom.datechooser.Button(this);
        cmd1 = new gui.custom.datechooser.Button(this);
        cmd2 = new gui.custom.datechooser.Button(this);
        cmd3 = new gui.custom.datechooser.Button(this);
        cmd4 = new gui.custom.datechooser.Button(this);
        cmd5 = new gui.custom.datechooser.Button(this);
        cmd6 = new gui.custom.datechooser.Button(this);
        cmd7 = new gui.custom.datechooser.Button(this);
        cmd8 = new gui.custom.datechooser.Button(this);
        cmd9 = new gui.custom.datechooser.Button(this);
        cmd10 = new gui.custom.datechooser.Button(this);
        cmd11 = new gui.custom.datechooser.Button(this);
        cmd12 = new gui.custom.datechooser.Button(this);
        cmd13 = new gui.custom.datechooser.Button(this);
        cmd14 = new gui.custom.datechooser.Button(this);
        cmd15 = new gui.custom.datechooser.Button(this);
        cmd16 = new gui.custom.datechooser.Button(this);
        cmd17 = new gui.custom.datechooser.Button(this);
        cmd18 = new gui.custom.datechooser.Button(this);
        cmd19 = new gui.custom.datechooser.Button(this);
        cmd20 = new gui.custom.datechooser.Button(this);
        cmd21 = new gui.custom.datechooser.Button(this);
        cmd22 = new gui.custom.datechooser.Button(this);
        cmd23 = new gui.custom.datechooser.Button(this);
        cmd24 = new gui.custom.datechooser.Button(this);
        cmd25 = new gui.custom.datechooser.Button(this);
        cmd26 = new gui.custom.datechooser.Button(this);
        cmd27 = new gui.custom.datechooser.Button(this);
        cmd28 = new gui.custom.datechooser.Button(this);
        cmd29 = new gui.custom.datechooser.Button(this);
        cmd30 = new gui.custom.datechooser.Button(this);
        cmd31 = new gui.custom.datechooser.Button(this);
        cmd32 = new gui.custom.datechooser.Button(this);
        cmd33 = new gui.custom.datechooser.Button(this);
        cmd34 = new gui.custom.datechooser.Button(this);
        cmd35 = new gui.custom.datechooser.Button(this);
        cmd36 = new gui.custom.datechooser.Button(this);
        cmd37 = new gui.custom.datechooser.Button(this);
        cmd38 = new gui.custom.datechooser.Button(this);
        cmd39 = new gui.custom.datechooser.Button(this);
        cmd40 = new gui.custom.datechooser.Button(this);
        cmd41 = new gui.custom.datechooser.Button(this);
        cmd42 = new gui.custom.datechooser.Button(this);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(7, 7));

        cmdMo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdMo.setForeground(new java.awt.Color(118, 118, 118));
        cmdMo.setText("Mo");
        add(cmdMo);

        cmdTu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdTu.setForeground(new java.awt.Color(118, 118, 118));
        cmdTu.setText("Tu");
        add(cmdTu);

        cmdWe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdWe.setForeground(new java.awt.Color(118, 118, 118));
        cmdWe.setText("We");
        add(cmdWe);

        cmdTh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdTh.setForeground(new java.awt.Color(118, 118, 118));
        cmdTh.setText("Th");
        add(cmdTh);

        cmdFr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdFr.setForeground(new java.awt.Color(118, 118, 118));
        cmdFr.setText("Fr");
        add(cmdFr);

        cmdSa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdSa.setForeground(new java.awt.Color(118, 118, 118));
        cmdSa.setText("Sa");
        add(cmdSa);

        cmdSu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdSu.setForeground(new java.awt.Color(255, 1, 1));
        cmdSu.setText("Su");
        add(cmdSu);

        cmd1.setBackground(new java.awt.Color(255, 255, 255));
        cmd1.setForeground(new java.awt.Color(75, 75, 75));
        cmd1.setName("day"); // NOI18N
        add(cmd1);

        cmd2.setBackground(new java.awt.Color(255, 255, 255));
        cmd2.setForeground(new java.awt.Color(75, 75, 75));
        cmd2.setName("day"); // NOI18N
        add(cmd2);

        cmd3.setBackground(new java.awt.Color(255, 255, 255));
        cmd3.setForeground(new java.awt.Color(75, 75, 75));
        cmd3.setText("1");
        cmd3.setName("day"); // NOI18N
        add(cmd3);

        cmd4.setBackground(new java.awt.Color(255, 255, 255));
        cmd4.setForeground(new java.awt.Color(75, 75, 75));
        cmd4.setText("2");
        cmd4.setName("day"); // NOI18N
        add(cmd4);

        cmd5.setBackground(new java.awt.Color(255, 255, 255));
        cmd5.setForeground(new java.awt.Color(75, 75, 75));
        cmd5.setText("3");
        cmd5.setName("day"); // NOI18N
        add(cmd5);

        cmd6.setBackground(new java.awt.Color(255, 255, 255));
        cmd6.setForeground(new java.awt.Color(75, 75, 75));
        cmd6.setText("4");
        cmd6.setName("day"); // NOI18N
        add(cmd6);

        cmd7.setBackground(new java.awt.Color(255, 255, 255));
        cmd7.setForeground(new java.awt.Color(75, 75, 75));
        cmd7.setText("5");
        cmd7.setName("day"); // NOI18N
        add(cmd7);

        cmd8.setBackground(new java.awt.Color(255, 255, 255));
        cmd8.setForeground(new java.awt.Color(75, 75, 75));
        cmd8.setText("6");
        cmd8.setName("day"); // NOI18N
        add(cmd8);

        cmd9.setBackground(new java.awt.Color(255, 255, 255));
        cmd9.setForeground(new java.awt.Color(75, 75, 75));
        cmd9.setText("7");
        cmd9.setName("day"); // NOI18N
        add(cmd9);

        cmd10.setBackground(new java.awt.Color(255, 255, 255));
        cmd10.setForeground(new java.awt.Color(75, 75, 75));
        cmd10.setText("8");
        cmd10.setName("day"); // NOI18N
        add(cmd10);

        cmd11.setBackground(new java.awt.Color(255, 255, 255));
        cmd11.setForeground(new java.awt.Color(75, 75, 75));
        cmd11.setText("9");
        cmd11.setName("day"); // NOI18N
        add(cmd11);

        cmd12.setBackground(new java.awt.Color(255, 255, 255));
        cmd12.setForeground(new java.awt.Color(75, 75, 75));
        cmd12.setText("10");
        cmd12.setName("day"); // NOI18N
        add(cmd12);

        cmd13.setBackground(new java.awt.Color(255, 255, 255));
        cmd13.setForeground(new java.awt.Color(75, 75, 75));
        cmd13.setText("11");
        cmd13.setName("day"); // NOI18N
        add(cmd13);

        cmd14.setBackground(new java.awt.Color(255, 255, 255));
        cmd14.setForeground(new java.awt.Color(75, 75, 75));
        cmd14.setText("12");
        cmd14.setName("day"); // NOI18N
        add(cmd14);

        cmd15.setBackground(new java.awt.Color(255, 255, 255));
        cmd15.setForeground(new java.awt.Color(75, 75, 75));
        cmd15.setText("13");
        cmd15.setName("day"); // NOI18N
        add(cmd15);

        cmd16.setBackground(new java.awt.Color(255, 255, 255));
        cmd16.setForeground(new java.awt.Color(75, 75, 75));
        cmd16.setText("14");
        cmd16.setName("day"); // NOI18N
        add(cmd16);

        cmd17.setBackground(new java.awt.Color(255, 255, 255));
        cmd17.setForeground(new java.awt.Color(75, 75, 75));
        cmd17.setText("15");
        cmd17.setName("day"); // NOI18N
        add(cmd17);

        cmd18.setBackground(new java.awt.Color(255, 255, 255));
        cmd18.setForeground(new java.awt.Color(75, 75, 75));
        cmd18.setText("16");
        cmd18.setName("day"); // NOI18N
        add(cmd18);

        cmd19.setBackground(new java.awt.Color(255, 255, 255));
        cmd19.setForeground(new java.awt.Color(75, 75, 75));
        cmd19.setText("17");
        cmd19.setName("day"); // NOI18N
        add(cmd19);

        cmd20.setBackground(new java.awt.Color(255, 255, 255));
        cmd20.setForeground(new java.awt.Color(75, 75, 75));
        cmd20.setText("18");
        cmd20.setName("day"); // NOI18N
        add(cmd20);

        cmd21.setBackground(new java.awt.Color(255, 255, 255));
        cmd21.setForeground(new java.awt.Color(75, 75, 75));
        cmd21.setText("19");
        cmd21.setName("day"); // NOI18N
        add(cmd21);

        cmd22.setBackground(new java.awt.Color(255, 255, 255));
        cmd22.setForeground(new java.awt.Color(75, 75, 75));
        cmd22.setText("20");
        cmd22.setName("day"); // NOI18N
        add(cmd22);

        cmd23.setBackground(new java.awt.Color(255, 255, 255));
        cmd23.setForeground(new java.awt.Color(75, 75, 75));
        cmd23.setText("21");
        cmd23.setName("day"); // NOI18N
        add(cmd23);

        cmd24.setBackground(new java.awt.Color(255, 255, 255));
        cmd24.setForeground(new java.awt.Color(75, 75, 75));
        cmd24.setText("22");
        cmd24.setName("day"); // NOI18N
        add(cmd24);

        cmd25.setBackground(new java.awt.Color(255, 255, 255));
        cmd25.setForeground(new java.awt.Color(75, 75, 75));
        cmd25.setText("23");
        cmd25.setName("day"); // NOI18N
        add(cmd25);

        cmd26.setBackground(new java.awt.Color(255, 255, 255));
        cmd26.setForeground(new java.awt.Color(75, 75, 75));
        cmd26.setText("24");
        cmd26.setName("day"); // NOI18N
        add(cmd26);

        cmd27.setBackground(new java.awt.Color(255, 255, 255));
        cmd27.setForeground(new java.awt.Color(75, 75, 75));
        cmd27.setText("25");
        cmd27.setName("day"); // NOI18N
        add(cmd27);

        cmd28.setBackground(new java.awt.Color(255, 255, 255));
        cmd28.setForeground(new java.awt.Color(75, 75, 75));
        cmd28.setText("26");
        cmd28.setName("day"); // NOI18N
        add(cmd28);

        cmd29.setBackground(new java.awt.Color(255, 255, 255));
        cmd29.setForeground(new java.awt.Color(75, 75, 75));
        cmd29.setText("27");
        cmd29.setName("day"); // NOI18N
        add(cmd29);

        cmd30.setBackground(new java.awt.Color(255, 255, 255));
        cmd30.setForeground(new java.awt.Color(75, 75, 75));
        cmd30.setText("28");
        cmd30.setName("day"); // NOI18N
        add(cmd30);

        cmd31.setBackground(new java.awt.Color(255, 255, 255));
        cmd31.setForeground(new java.awt.Color(75, 75, 75));
        cmd31.setText("29");
        cmd31.setName("day"); // NOI18N
        add(cmd31);

        cmd32.setBackground(new java.awt.Color(255, 255, 255));
        cmd32.setForeground(new java.awt.Color(75, 75, 75));
        cmd32.setText("30");
        cmd32.setName("day"); // NOI18N
        add(cmd32);

        cmd33.setBackground(new java.awt.Color(255, 255, 255));
        cmd33.setForeground(new java.awt.Color(75, 75, 75));
        cmd33.setText("31");
        cmd33.setName("day"); // NOI18N
        add(cmd33);

        cmd34.setBackground(new java.awt.Color(255, 255, 255));
        cmd34.setForeground(new java.awt.Color(75, 75, 75));
        cmd34.setName("day"); // NOI18N
        add(cmd34);

        cmd35.setBackground(new java.awt.Color(255, 255, 255));
        cmd35.setForeground(new java.awt.Color(75, 75, 75));
        cmd35.setName("day"); // NOI18N
        add(cmd35);

        cmd36.setBackground(new java.awt.Color(255, 255, 255));
        cmd36.setForeground(new java.awt.Color(75, 75, 75));
        cmd36.setName("day"); // NOI18N
        add(cmd36);

        cmd37.setBackground(new java.awt.Color(255, 255, 255));
        cmd37.setForeground(new java.awt.Color(75, 75, 75));
        cmd37.setName("day"); // NOI18N
        add(cmd37);

        cmd38.setBackground(new java.awt.Color(255, 255, 255));
        cmd38.setForeground(new java.awt.Color(75, 75, 75));
        cmd38.setName("day"); // NOI18N
        add(cmd38);

        cmd39.setBackground(new java.awt.Color(255, 255, 255));
        cmd39.setForeground(new java.awt.Color(75, 75, 75));
        cmd39.setName("day"); // NOI18N
        add(cmd39);

        cmd40.setBackground(new java.awt.Color(255, 255, 255));
        cmd40.setForeground(new java.awt.Color(75, 75, 75));
        cmd40.setName("day"); // NOI18N
        add(cmd40);

        cmd41.setBackground(new java.awt.Color(255, 255, 255));
        cmd41.setForeground(new java.awt.Color(75, 75, 75));
        cmd41.setName("day"); // NOI18N
        add(cmd41);

        cmd42.setBackground(new java.awt.Color(255, 255, 255));
        cmd42.setForeground(new java.awt.Color(75, 75, 75));
        cmd42.setName("day"); // NOI18N
        add(cmd42);
    }// </editor-fold>                        

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }

    // Variables declaration - do not modify                     
    private gui.custom.datechooser.Button cmd1;
    private gui.custom.datechooser.Button cmd10;
    private gui.custom.datechooser.Button cmd11;
    private gui.custom.datechooser.Button cmd12;
    private gui.custom.datechooser.Button cmd13;
    private gui.custom.datechooser.Button cmd14;
    private gui.custom.datechooser.Button cmd15;
    private gui.custom.datechooser.Button cmd16;
    private gui.custom.datechooser.Button cmd17;
    private gui.custom.datechooser.Button cmd18;
    private gui.custom.datechooser.Button cmd19;
    private gui.custom.datechooser.Button cmd2;
    private gui.custom.datechooser.Button cmd20;
    private gui.custom.datechooser.Button cmd21;
    private gui.custom.datechooser.Button cmd22;
    private gui.custom.datechooser.Button cmd23;
    private gui.custom.datechooser.Button cmd24;
    private gui.custom.datechooser.Button cmd25;
    private gui.custom.datechooser.Button cmd26;
    private gui.custom.datechooser.Button cmd27;
    private gui.custom.datechooser.Button cmd28;
    private gui.custom.datechooser.Button cmd29;
    private gui.custom.datechooser.Button cmd3;
    private gui.custom.datechooser.Button cmd30;
    private gui.custom.datechooser.Button cmd31;
    private gui.custom.datechooser.Button cmd32;
    private gui.custom.datechooser.Button cmd33;
    private gui.custom.datechooser.Button cmd34;
    private gui.custom.datechooser.Button cmd35;
    private gui.custom.datechooser.Button cmd36;
    private gui.custom.datechooser.Button cmd37;
    private gui.custom.datechooser.Button cmd38;
    private gui.custom.datechooser.Button cmd39;
    private gui.custom.datechooser.Button cmd4;
    private gui.custom.datechooser.Button cmd40;
    private gui.custom.datechooser.Button cmd41;
    private gui.custom.datechooser.Button cmd42;
    private gui.custom.datechooser.Button cmd5;
    private gui.custom.datechooser.Button cmd6;
    private gui.custom.datechooser.Button cmd7;
    private gui.custom.datechooser.Button cmd8;
    private gui.custom.datechooser.Button cmd9;
    private gui.custom.datechooser.Button cmdFr;
    private gui.custom.datechooser.Button cmdMo;
    private gui.custom.datechooser.Button cmdSa;
    private gui.custom.datechooser.Button cmdSu;
    private gui.custom.datechooser.Button cmdTh;
    private gui.custom.datechooser.Button cmdTu;
    private gui.custom.datechooser.Button cmdWe;
    // End of variables declaration                   

    public void next() {
        if (selectDay == max_of_month) {
            selectDay = 0;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 1);
        String n = cmd.getText();
        if (!n.equals("") && Integer.valueOf(n) <= max_of_month) {
            selectDay++;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void back() {
        if (selectDay <= 1) {
            selectDay = max_of_month + 1;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 1);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay--;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void up() {
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 7);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay -= 7;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void down() {
        if (getComponents().length > startDate - 1 + selectDay + 7) {
            JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 7);
            String n = cmd.getText();
            if (!n.equals("") && cmd.getName() != null) {
                selectDay += 7;
                event.execute(null, selectDay);
                cmd.setBackground(new Color(206, 110, 245));
            }
        }
    }

}
