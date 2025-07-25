/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.manager;

import bus.OrderBUS;
import gui.FormLoad;
import common.Constants;
import gui.custom.curvechart.CurveChart;
import gui.custom.curvechart.ModelChart2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import raven.toast.Notifications;
import util.DoubleFormatUlti;

/**
 *
 * @author ADMIN
 */
public class PromotionStatsGUI extends javax.swing.JPanel {

    private OrderBUS orderBUS;

    /**
     * Creates new form PromotionStatsGUI
     */
    public PromotionStatsGUI() {
        orderBUS = FormLoad.orderBUS;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new gui.custom.datechooser.DateChooser();
        dateChooser2 = new gui.custom.datechooser.DateChooser();
        PromotionStatsPanel = new javax.swing.JPanel();
        pNorth = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lblQtyOff = new javax.swing.JLabel();
        lblTotalDiscount = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        lblQtyOff1 = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        lblQtyOff2 = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        pCenter = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        startedDate = new gui.custom.RoundedTextField();
        jLabel2 = new javax.swing.JLabel();
        endedDate = new gui.custom.RoundedTextField();
        jButton1 = new javax.swing.JButton();
        panelStats = new javax.swing.JPanel();
        stats = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        dateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        dateChooser1.setTextRefernce(startedDate);

        dateChooser2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        dateChooser2.setTextRefernce(endedDate);

        setLayout(new java.awt.BorderLayout());

        PromotionStatsPanel.setBackground(new java.awt.Color(244, 248, 254));
        PromotionStatsPanel.setLayout(new java.awt.BorderLayout());

        pNorth.setBackground(new java.awt.Color(244, 248, 254));
        pNorth.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(86, 187, 137));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/png/icons8-percent-75.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(10, 10, 10))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel16.add(jPanel17, java.awt.BorderLayout.WEST);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(204, 204, 204)));

        lblQtyOff.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblQtyOff.setText("Tổng tiền khuyến mãi");

        lblTotalDiscount.setBackground(new java.awt.Color(255, 102, 102));
        lblTotalDiscount.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTotalDiscount.setForeground(new java.awt.Color(51, 153, 0));
        lblTotalDiscount.setText("0 VNĐ");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQtyOff)
                    .addComponent(lblTotalDiscount))
                .addGap(20, 20, 20))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblQtyOff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalDiscount)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel18, java.awt.BorderLayout.CENTER);

        pNorth.add(jPanel16);

        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/png/icons8-order-75.png"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(10, 10, 10))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel19.add(jPanel20, java.awt.BorderLayout.WEST);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(204, 204, 204)));

        lblQtyOff1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblQtyOff1.setText("Khuyến mãi theo hóa đơn");

        lblOrder.setBackground(new java.awt.Color(255, 102, 102));
        lblOrder.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblOrder.setForeground(new java.awt.Color(87, 158, 227));
        lblOrder.setText("0 lần");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQtyOff1)
                    .addComponent(lblOrder))
                .addGap(20, 20, 20))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblQtyOff1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOrder)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel21, java.awt.BorderLayout.CENTER);

        pNorth.add(jPanel19);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/png/icons8-food-bar-75.png"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addGap(10, 10, 10))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel22.add(jPanel23, java.awt.BorderLayout.WEST);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(204, 204, 204)));

        lblQtyOff2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblQtyOff2.setText("Khuyến mãi theo sản phẩm");

        lblItem.setBackground(new java.awt.Color(230, 159, 57));
        lblItem.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblItem.setForeground(new java.awt.Color(230, 159, 57));
        lblItem.setText("0 lần");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQtyOff2)
                    .addComponent(lblItem))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblQtyOff2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblItem)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel24, java.awt.BorderLayout.CENTER);

        pNorth.add(jPanel22);

        PromotionStatsPanel.add(pNorth, java.awt.BorderLayout.NORTH);

        pCenter.setBackground(new java.awt.Color(244, 248, 254));
        pCenter.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(244, 248, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Thống kê chương trình khuyến mãi");

        startedDate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel2.setText("-->");

        endedDate.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setText("Thống kê");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(startedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(endedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(endedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pCenter.add(jPanel1, java.awt.BorderLayout.NORTH);

        panelStats.setBackground(new java.awt.Color(244, 248, 254));
        panelStats.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        panelStats.setLayout(new java.awt.BorderLayout());

        stats.setBackground(new java.awt.Color(244, 248, 254));
        stats.setLayout(new java.awt.BorderLayout());
        panelStats.add(stats, java.awt.BorderLayout.CENTER);

        jPanel7.setBackground(new java.awt.Color(244, 248, 254));
        jPanel7.setPreferredSize(new java.awt.Dimension(1337, 20));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1337, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelStats.add(jPanel7, java.awt.BorderLayout.NORTH);

        jPanel8.setBackground(new java.awt.Color(244, 248, 254));
        jPanel8.setPreferredSize(new java.awt.Dimension(1337, 20));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1337, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelStats.add(jPanel8, java.awt.BorderLayout.SOUTH);

        jPanel9.setBackground(new java.awt.Color(244, 248, 254));
        jPanel9.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelStats.add(jPanel9, java.awt.BorderLayout.WEST);

        jPanel10.setBackground(new java.awt.Color(244, 248, 254));
        jPanel10.setPreferredSize(new java.awt.Dimension(20, 504));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        panelStats.add(jPanel10, java.awt.BorderLayout.EAST);

        pCenter.add(panelStats, java.awt.BorderLayout.CENTER);

        PromotionStatsPanel.add(pCenter, java.awt.BorderLayout.CENTER);

        add(PromotionStatsPanel, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(244, 248, 254));
        jPanel2.setPreferredSize(new java.awt.Dimension(1379, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setBackground(new java.awt.Color(244, 248, 254));
        jPanel3.setPreferredSize(new java.awt.Dimension(1379, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1379, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel4.setBackground(new java.awt.Color(244, 248, 254));
        jPanel4.setPreferredSize(new java.awt.Dimension(20, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel5.setBackground(new java.awt.Color(244, 248, 254));
        jPanel5.setPreferredSize(new java.awt.Dimension(20, 822));
        jPanel5.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );

        add(jPanel5, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LocalDate startedDate = LocalDate.parse(this.startedDate.getText(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate endedDate = LocalDate.parse(this.endedDate.getText(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
        
        if (startedDate.isAfter(endedDate)) {
         Notifications.getInstance().show(
                            Notifications.Type.WARNING,
                            Notifications.Location.TOP_RIGHT,
                            10000,
                            "Thông báo: Vui lòng chọn ngày bắt đầu trước ngày kết thúc.");
        }
        else if (endedDate.isBefore(startedDate)) {
         Notifications.getInstance().show(
                            Notifications.Type.WARNING,
                            Notifications.Location.TOP_RIGHT,
                            10000,
                            "Thông báo: Vui lòng chọn ngày kết thúc sau ngày bắt đầu.");
        }
        else {
            LocalDateTime start = startedDate.atStartOfDay(); // 00:00:00
            LocalDateTime end = endedDate.atTime(23, 59, 59, 999999999); // 23:59:59.999999999
            createChartByOrderType(start, end, stats);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void createChartByOrderType(LocalDateTime startDate, LocalDateTime endDate, JPanel panel) {
        panel.removeAll();
        CurveChart chart = new CurveChart();
        panel.add(chart);
        updateChartByOrderType(chart, startDate, endDate);
        panel.repaint();
        panel.revalidate();
    }

    private void updateChartByOrderType(CurveChart chart, LocalDateTime startDate, LocalDateTime endDate) {
        chart.clear();
        chart.addLegend("ORDER", Constants.COLOR_REVENUE, Constants.COLOR_REVENUE);
        chart.addLegend("ITEM", Constants.COLOR_CAPITAL, Constants.COLOR_CAPITAL);
        
        Map<String, Map<Integer,Integer>> map = orderBUS.getFrequencyPromotionStatsbyDatetime(startDate, endDate);
        map.forEach((key, values) -> {
            double order = values.getOrDefault(1, 0); 
            double item = values.getOrDefault(2, 0); 

            chart.addData(new ModelChart2(key, new double[]{order, item}));
        });
        
        chart.start();
        
        lblOrder.setText(map.entrySet().stream().mapToInt(entry -> entry.getValue().getOrDefault(1, 0)).sum() +" lần");
        lblItem.setText(map.entrySet().stream().mapToInt(entry -> entry.getValue().getOrDefault(2, 0)).sum() +" lần");
        lblTotalDiscount.setText(DoubleFormatUlti.format(orderBUS.getTotalDiscount(startDate, endDate)) + " VNĐ");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PromotionStatsPanel;
    private gui.custom.datechooser.DateChooser dateChooser1;
    private gui.custom.datechooser.DateChooser dateChooser2;
    private gui.custom.RoundedTextField endedDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblQtyOff;
    private javax.swing.JLabel lblQtyOff1;
    private javax.swing.JLabel lblQtyOff2;
    private javax.swing.JLabel lblTotalDiscount;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pNorth;
    private javax.swing.JPanel panelStats;
    private gui.custom.RoundedTextField startedDate;
    private javax.swing.JPanel stats;
    // End of variables declaration//GEN-END:variables

}
