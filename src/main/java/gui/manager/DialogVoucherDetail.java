/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.manager;

import bus.CategoryBUS;
import bus.ItemBUS;
import model.CategoryEntity;
import model.ItemEntity;
import gui.FormLoad;
import gui.staff.PanelCategoryDetail;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author ACER
 */
public class DialogVoucherDetail extends javax.swing.JDialog {

    /**
     * Creates new form DialogVoucherDetail
     */
    private CategoryBUS categoryBUS;
    private ItemBUS itemBUS;
    private PromotionGUI promotionGUI;
    private ToppingGUI toppingGUI;

    public DialogVoucherDetail(JPanel parentGUI) {
        super(new JFrame(), true);
        this.categoryBUS = FormLoad.categoryBUS;
        this.itemBUS = FormLoad.itemBUS;
        if (parentGUI instanceof PromotionGUI) {
            this.promotionGUI = (PromotionGUI) parentGUI;
        } else if (parentGUI instanceof ToppingGUI) {
            this.toppingGUI = (ToppingGUI) parentGUI;
        }
        initComponents();
        addTabCategory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabCategory = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setModal(true);

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(tabCategory, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void addTabCategory() {
        List<CategoryEntity> categories = categoryBUS.getAllEntities();
        for (CategoryEntity category : categories) {
            List<ItemEntity> items = itemBUS.findByCategoryName(category.getName());
            if (promotionGUI != null) {
                PanelCategoryDetail pnCD = new PanelCategoryDetail(items, promotionGUI);
                tabCategory.add(pnCD, category.getName());
            } else if (toppingGUI != null) {
                PanelCategoryDetail pnCD = new PanelCategoryDetail(items, toppingGUI);
                tabCategory.add(pnCD, category.getName());
            }

        }
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DialogVoucherDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DialogVoucherDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DialogVoucherDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DialogVoucherDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DialogVoucherDetail dialog = new DialogVoucherDetail();
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    public JTabbedPane getTabCategory() {
        return tabCategory;
    }

    public void setTabCategory(JTabbedPane tabCategory) {
        this.tabCategory = tabCategory;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane tabCategory;
    // End of variables declaration//GEN-END:variables
}
