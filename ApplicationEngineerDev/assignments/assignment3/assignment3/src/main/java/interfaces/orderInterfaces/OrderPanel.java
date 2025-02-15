/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.orderInterfaces;

import business.Car;
import business.CarCatalog;
import interfaces.MainFrame;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Brickea
 */
public class OrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderPanel
     */
    private JPanel viewPanel;
    private CarCatalog carCatalog;
    private CarCatalog tempCatalog = null;
    private MainFrame mainFrame;
    private int[] position = new int[2];

    public OrderPanel() {
        initComponents();
    }

    public OrderPanel(JPanel viewPanel, CarCatalog carCatalog, MainFrame mainFrame) {
        initComponents();
        this.viewPanel = viewPanel;
        this.carCatalog = carCatalog;
        this.mainFrame = mainFrame;
    }

    private boolean isPostionEmpty() {

        if (this.xText.getText().equals("") || this.yText.getText().equals("")) {
            return true;
        } else {
            try {
                double x = Double.parseDouble(this.xText.getText());
                double y = Double.parseDouble(this.yText.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please input a valid number!");
            }
            this.position[0] = Integer.parseInt(this.xText.getText());
            this.position[1] = Integer.parseInt(this.yText.getText());
            return false;
        }
    }

    private boolean getCityAvailableCars() {
        tempCatalog = new CarCatalog();
        for (Car c : this.carCatalog.getCarCatalog()) {
            if (c.getCarCity().equals((String) this.cityCombo.getSelectedItem()) && c.isCarCertification()) {
                this.tempCatalog.addCar(c);
            }
        }
        if (this.tempCatalog.getCarCatalog().size() == 0) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cityCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        xText = new javax.swing.JTextField();
        yText = new javax.swing.JTextField();
        firstBtn = new javax.swing.JButton();
        findBtn = new javax.swing.JButton();

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("Order Car");

        jLabel2.setText("Choose City");

        cityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "New York" }));

        jLabel3.setText("Position(x,y)");

        firstBtn.setText("First Available Car");
        firstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnActionPerformed(evt);
            }
        });

        findBtn.setText("Find Cars");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(findBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(xText, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(yText, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cityCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(82, 82, 82)))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(xText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.mainFrame.enableManageBtn();
        this.viewPanel.remove(this);
        CardLayout layout = (CardLayout) this.viewPanel.getLayout();
        layout.previous(this.viewPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnActionPerformed
        // TODO add your handling code here:
        Car closestCar = null;
        if (!this.isPostionEmpty()) {
            if (this.getCityAvailableCars()) {
                double minDistance = 100;

                for (Car c : this.tempCatalog.getCarCatalog()) {
                    double distance = Math.pow(c.getCarPposition()[0] - this.position[0], 2) + Math.pow(c.getCarPposition()[1] - this.position[1], 2);
                    if (distance <= minDistance) {
                        minDistance = distance;
                        closestCar = c;
                    }
                }
                OrderCarDetial p = new OrderCarDetial(this.viewPanel, closestCar);
                this.viewPanel.add("orderCarDetial", p);
                CardLayout layout = (CardLayout) this.viewPanel.getLayout();
                layout.next(this.viewPanel);
            } else {
                JOptionPane.showMessageDialog(null, "No car available now!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please input your location!");
        }


    }//GEN-LAST:event_firstBtnActionPerformed

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        // TODO add your handling code here:
        if (!this.isPostionEmpty()) {
            if (this.getCityAvailableCars()) {
                OrderCarsFound p = new OrderCarsFound(this.viewPanel, this.carCatalog, this.tempCatalog);
                this.viewPanel.add("orderCarsFound", p);
                CardLayout layout = (CardLayout) this.viewPanel.getLayout();
                layout.next(this.viewPanel);
            } else {
                JOptionPane.showMessageDialog(null, "No car available now!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please input your location!");
        }


    }//GEN-LAST:event_findBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JButton findBtn;
    private javax.swing.JButton firstBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField xText;
    private javax.swing.JTextField yText;
    // End of variables declaration//GEN-END:variables
}
