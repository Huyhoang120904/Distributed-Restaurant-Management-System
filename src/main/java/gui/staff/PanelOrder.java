/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.staff;

import bus.TableBUS;
import common.Constants;
import model.OrderEntity;
import gui.menu.Application;
import gui.FormLoad;
import gui.custom.RoundedPanel;

import javax.swing.*;
import java.time.Duration;
import java.time.LocalDateTime;
import util.DoubleFormatUlti;

/**
 *
 * @author Trần Ngọc Huyền.
 */
public class PanelOrder extends javax.swing.JPanel {

    /**
     * Creates new form PanelOrder
     */
    private OrderEntity o;
    private OrderGUI orderGUI;
    private TableBUS tableBUS;

    public PanelOrder(OrderGUI orderGUI, OrderEntity o) {
        this.o = o;
        this.orderGUI = orderGUI;
        this.tableBUS = FormLoad.tableBUS;
        initComponents();
        startTimeCounter(o.getReservationTime());
        fillContent();
    }

    public OrderGUI getOrderGUI() {
        return orderGUI;
    }

    public void setOrderGUI(OrderGUI orderGUI) {
        this.orderGUI = orderGUI;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOrderTop = new RoundedPanel();
        lblCusTotal = new javax.swing.JLabel();
        lblFloorName = new javax.swing.JLabel();
        panelOrderMid = new javax.swing.JPanel();
        panelMidLeft = new javax.swing.JPanel();
        lblTableName = new javax.swing.JLabel();
        panelMidRight = new javax.swing.JPanel();
        panelMidRightTop = new javax.swing.JPanel();
        lblTotalPaid = new javax.swing.JLabel();
        panelMidRightBot = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        panelOrderBot = new RoundedPanel();
        btnEdit = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btnMerge = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(250, 200));
        setPreferredSize(new java.awt.Dimension(250, 200));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        panelOrderTop.setBackground(Constants.COLOR_PRIMARY);
        panelOrderTop.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Constants.COLOR_BORDER));
        panelOrderTop.setForeground(new java.awt.Color(255, 255, 255));
        panelOrderTop.setPreferredSize(new java.awt.Dimension(35, 35));

        lblCusTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCusTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblCusTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/png/icons8-user-24.png"))); // NOI18N

        lblFloorName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFloorName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelOrderTopLayout = new javax.swing.GroupLayout(panelOrderTop);
        panelOrderTop.setLayout(panelOrderTopLayout);
        panelOrderTopLayout.setHorizontalGroup(
            panelOrderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOrderTopLayout.createSequentialGroup()
                .addGap(0, 231, Short.MAX_VALUE)
                .addComponent(lblCusTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelOrderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelOrderTopLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblFloorName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(223, Short.MAX_VALUE)))
        );
        panelOrderTopLayout.setVerticalGroup(
            panelOrderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCusTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addGroup(panelOrderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblFloorName, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        add(panelOrderTop, java.awt.BorderLayout.NORTH);

        panelOrderMid.setBackground(new java.awt.Color(255, 255, 255));
        panelOrderMid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, Constants.COLOR_BORDER));
        panelOrderMid.setPreferredSize(new java.awt.Dimension(100, 100));
        panelOrderMid.setLayout(new java.awt.GridLayout(1, 0));

        panelMidLeft.setBackground(Constants.COLOR_BG);
        panelMidLeft.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, Constants.COLOR_BORDER));
        panelMidLeft.setPreferredSize(new java.awt.Dimension(50, 50));
        panelMidLeft.setLayout(new java.awt.BorderLayout());

        lblTableName.setBackground(new java.awt.Color(115, 171, 227));
        lblTableName.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTableName.setForeground(Constants.COLOR_PRIMARY);
        lblTableName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMidLeft.add(lblTableName, java.awt.BorderLayout.CENTER);

        panelOrderMid.add(panelMidLeft);

        panelMidRight.setBackground(new java.awt.Color(255, 255, 255));
        panelMidRight.setPreferredSize(new java.awt.Dimension(50, 50));
        panelMidRight.setLayout(new java.awt.GridLayout(2, 1));

        panelMidRightTop.setBackground(new java.awt.Color(255, 255, 255));
        panelMidRightTop.setPreferredSize(new java.awt.Dimension(25, 25));
        panelMidRightTop.setLayout(new java.awt.BorderLayout());

        lblTotalPaid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotalPaid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPaid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/png/icons8-coin-24.png"))); // NOI18N
        lblTotalPaid.setText("0");
        lblTotalPaid.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelMidRightTop.add(lblTotalPaid, java.awt.BorderLayout.CENTER);

        panelMidRight.add(panelMidRightTop);

        panelMidRightBot.setBackground(new java.awt.Color(255, 255, 255));
        panelMidRightBot.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, Constants.COLOR_BORDER));
        panelMidRightBot.setLayout(new java.awt.BorderLayout());

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/png/icons8-alarm-clock-24.png"))); // NOI18N
        lblTime.setText("00:00:00");
        panelMidRightBot.add(lblTime, java.awt.BorderLayout.CENTER);

        panelMidRight.add(panelMidRightBot);

        panelOrderMid.add(panelMidRight);

        add(panelOrderMid, java.awt.BorderLayout.CENTER);

        panelOrderBot.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, Constants.COLOR_BORDER));
        panelOrderBot.setPreferredSize(new java.awt.Dimension(35, 35));
        panelOrderBot.setLayout(new java.awt.GridLayout(1, 0));

        btnEdit.setBackground(Constants.COLOR_BTN_ICON);
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/png/food-tray.png"))); // NOI18N
        btnEdit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, Constants.COLOR_BORDER));
        btnEdit.setFocusable(false);
        panelOrderBot.add(btnEdit);

        btnPay.setBackground(Constants.COLOR_BTN_ICON);
        btnPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/png/icons8-calculator-30.png"))); // NOI18N
        btnPay.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, Constants.COLOR_BORDER));
        btnPay.setFocusable(false);
        panelOrderBot.add(btnPay);

        btnMerge.setBackground(Constants.COLOR_BTN_ICON);
        btnMerge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/png/icons8-ungroup-objects-30.png"))); // NOI18N
        btnMerge.setBorder(null);
        btnMerge.setFocusable(false);
        panelOrderBot.add(btnMerge);

        add(panelOrderBot, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        orderGUI.setTable(o.getTable());
        orderGUI.loadOrder(o);
        displayOrderGUI();
    }//GEN-LAST:event_formMouseClicked
    private void fillContent() {
        if (o.getTable() != null) {
            lblTableName.setText(o.getTable().getName());
            lblFloorName.setText(o.getTable().getFloor().getName());
                lblCusTotal.setText(o.getNumberOfCustomer() + "");
            if(o.getOrderDetails().isEmpty()) {
                lblTotalPaid.setText(DoubleFormatUlti.format(o.getDeposit()));
            }
            else 
                lblTotalPaid.setText(DoubleFormatUlti.format(o.getTotalPaid()));
        }
    }

    private void displayOrderGUI() {
        Application.showForm(orderGUI);
    }

    private void startTimeCounter(LocalDateTime timeStartCount) {
        // Tạo Timer để cập nhật lblTime mỗi giây
        Timer timer = new Timer(1000, e -> {
            // Tính toán thời gian đã trôi qua từ thời điểm bắt đầu
            Duration duration = Duration.between(timeStartCount, LocalDateTime.now());
            long elapsedSeconds = duration.getSeconds();

            // Tính toán giờ, phút, giây
            int hours = (int) (elapsedSeconds / 3600);
            int minutes = (int) ((elapsedSeconds % 3600) / 60);
            int seconds = (int) (elapsedSeconds % 60);

            // Định dạng thời gian và cập nhật lblTime
            String currentTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            lblTime.setText(currentTime);
        });

        // Bắt đầu timer
        timer.start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMerge;
    private javax.swing.JButton btnPay;
    private javax.swing.JLabel lblCusTotal;
    private javax.swing.JLabel lblFloorName;
    private javax.swing.JLabel lblTableName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTotalPaid;
    private javax.swing.JPanel panelMidLeft;
    private javax.swing.JPanel panelMidRight;
    private javax.swing.JPanel panelMidRightBot;
    private javax.swing.JPanel panelMidRightTop;
    private javax.swing.JPanel panelOrderBot;
    private javax.swing.JPanel panelOrderMid;
    private javax.swing.JPanel panelOrderTop;
    // End of variables declaration//GEN-END:variables
}
