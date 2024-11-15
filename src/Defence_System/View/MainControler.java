/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Defence_System.View;

import Defence_System.Util.Observable;
import Defence_System.Util.Observer;
import Defence_System.View.defences.Helicopter;
import Defence_System.View.defences.Submarine;
import Defence_System.View.defences.Tank;
import java.util.ArrayList;

/**
 *
 * @author dilan
 */
public class MainControler extends javax.swing.JFrame {

    /**
     * Creates new form MainControler
     */
    private Observable observable;
    private String msg = "";

    public MainControler() {
        initComponents();
    }

    public MainControler(Observable observable) {
        this.observable = observable;
        initComponents();
        setTitle("Main Controller");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        selectDefence = new javax.swing.JComboBox<>();
        btnCollect = new javax.swing.JButton();
        areaClear = new javax.swing.JCheckBox();
        lblSoldierOfHelicopter = new javax.swing.JLabel();
        lblAmmoOfHelicopter = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea01 = new javax.swing.JTextArea();
        jSlider1 = new javax.swing.JSlider();
        btnSend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea02 = new javax.swing.JTextArea();
        lblSoldierOfSubmarine = new javax.swing.JLabel();
        lblSoldierofTank = new javax.swing.JLabel();
        soldierCountOfHelicopter01 = new javax.swing.JLabel();
        soldierCountOfSubmarine01 = new javax.swing.JLabel();
        soldierCountOfTank01 = new javax.swing.JLabel();
        lblAmmoOfSubmarine = new javax.swing.JLabel();
        lblAmmoOfTank = new javax.swing.JLabel();
        ammoCountOfHelicopter = new javax.swing.JLabel();
        ammoCountOfSubmarine = new javax.swing.JLabel();
        ammoCountOfTank = new javax.swing.JLabel();
        lblEnergy = new javax.swing.JLabel();
        lblEnergy01 = new javax.swing.JLabel();
        lblOxigen = new javax.swing.JLabel();
        lblOxigen01 = new javax.swing.JLabel();
        mainLbl02 = new javax.swing.JLabel();
        mainLbl03 = new javax.swing.JLabel();
        mainLbl01 = new javax.swing.JLabel();
        mainLbl04 = new javax.swing.JLabel();
        mainLbl06 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectDefence.setBackground(new java.awt.Color(204, 204, 204));
        selectDefence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        selectDefence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDefenceActionPerformed(evt);
            }
        });
        getContentPane().add(selectDefence, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 32, 166, 29));

        btnCollect.setBackground(new java.awt.Color(204, 204, 204));
        btnCollect.setText("Collect informations");
        btnCollect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectActionPerformed(evt);
            }
        });
        getContentPane().add(btnCollect, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 32, 224, 29));

        areaClear.setBackground(new java.awt.Color(204, 204, 204));
        areaClear.setText("Area Clear");
        areaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClearActionPerformed(evt);
            }
        });
        getContentPane().add(areaClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 32, -1, 29));

        lblSoldierOfHelicopter.setText(" Soldier Count of Helicopter");
        lblSoldierOfHelicopter.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblSoldierOfHelicopterAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblSoldierOfHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 160, 166, 24));

        lblAmmoOfHelicopter.setText("Ammo Amount of Helicopter");
        getContentPane().add(lblAmmoOfHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 214, 166, 24));

        lblPosition.setText("Position");
        getContentPane().add(lblPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 135, 24));

        txtArea01.setColumns(20);
        txtArea01.setRows(5);
        jScrollPane1.setViewportView(txtArea01);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 180, 90));

        jSlider1.setBackground(new java.awt.Color(204, 204, 204));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 305, -1));

        btnSend.setBackground(new java.awt.Color(204, 204, 204));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 94, 35));

        txtArea02.setColumns(20);
        txtArea02.setRows(5);
        jScrollPane2.setViewportView(txtArea02);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 180, 90));

        lblSoldierOfSubmarine.setText(" Soldier Count of Submarine");
        getContentPane().add(lblSoldierOfSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 160, 168, 24));

        lblSoldierofTank.setText(" Soldier Count of Tank");
        getContentPane().add(lblSoldierofTank, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 160, 153, 24));
        getContentPane().add(soldierCountOfHelicopter01, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 160, 67, 24));
        getContentPane().add(soldierCountOfSubmarine01, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 160, 67, 24));
        getContentPane().add(soldierCountOfTank01, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 160, 60, 24));

        lblAmmoOfSubmarine.setText("Ammo Amount of Submarine");
        getContentPane().add(lblAmmoOfSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 214, 168, 24));

        lblAmmoOfTank.setText("Ammo Amount of Tank");
        getContentPane().add(lblAmmoOfTank, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 214, 153, 24));
        getContentPane().add(ammoCountOfHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 214, 56, 25));
        getContentPane().add(ammoCountOfSubmarine, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 214, 56, 25));
        getContentPane().add(ammoCountOfTank, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 214, 56, 25));

        lblEnergy.setBackground(new java.awt.Color(204, 255, 255));
        lblEnergy.setText("Energy Leval");
        getContentPane().add(lblEnergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 99, 116, 24));
        getContentPane().add(lblEnergy01, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 99, 52, 24));

        lblOxigen.setBackground(new java.awt.Color(204, 255, 255));
        lblOxigen.setText("Oxigen Level");
        getContentPane().add(lblOxigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 99, 134, 24));
        getContentPane().add(lblOxigen01, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 99, 51, 24));

        mainLbl02.setBackground(new java.awt.Color(204, 204, 204));
        mainLbl02.setOpaque(true);
        getContentPane().add(mainLbl02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 770, 60));

        mainLbl03.setBackground(new java.awt.Color(153, 153, 153));
        mainLbl03.setOpaque(true);
        getContentPane().add(mainLbl03, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 770, 140));

        mainLbl01.setBackground(new java.awt.Color(153, 153, 153));
        mainLbl01.setOpaque(true);
        getContentPane().add(mainLbl01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 90));

        mainLbl04.setBackground(new java.awt.Color(102, 102, 102));
        mainLbl04.setOpaque(true);
        getContentPane().add(mainLbl04, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 240, 540));

        mainLbl06.setBackground(new java.awt.Color(204, 204, 204));
        mainLbl06.setOpaque(true);
        mainLbl06.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                mainLbl06AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(mainLbl06, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 770, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaClearActionPerformed
        if (areaClear.isSelected() == true) {
            observable.setArea("Area Cleared");
        } else {
            observable.setArea("Area Not Cleared");
        }
    }//GEN-LAST:event_areaClearActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        observable.setSlider(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        observable.setMessage(txtArea01.getText());
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnCollectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectActionPerformed
        if(selectDefence.getSelectedItem().toString().equals("Select Defence")){
            lblEnergy01.setText("");
            lblOxigen01.setText("");
        }else if(selectDefence.getSelectedItem().toString().equals("Helicopter")){
            lblEnergy01.setText(Integer.toString( Helicopter.sliderHelicopter.getValue()));
            lblOxigen01.setText("");
        }else if(selectDefence.getSelectedItem().toString().equals("Submarine")){
            lblEnergy01.setText(Integer.toString(Submarine.jSliderSubmarine01.getValue()));
            lblOxigen01.setText(Integer.toString(Submarine.jSlider1Submarine02.getValue()));
        }else if(selectDefence.getSelectedItem().toString().equals("Tank")){
            lblEnergy01.setText(Integer.toString(Tank.silderTank.getValue()));
            lblOxigen01.setText("");
        }
    }//GEN-LAST:event_btnCollectActionPerformed

    private void selectDefenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDefenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectDefenceActionPerformed

    private void mainLbl06AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mainLbl06AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_mainLbl06AncestorAdded

    private void lblSoldierOfHelicopterAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblSoldierOfHelicopterAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSoldierOfHelicopterAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainControler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainControler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainControler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainControler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainControler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammoCountOfHelicopter;
    private javax.swing.JLabel ammoCountOfSubmarine;
    private javax.swing.JLabel ammoCountOfTank;
    private javax.swing.JCheckBox areaClear;
    private javax.swing.JButton btnCollect;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblAmmoOfHelicopter;
    private javax.swing.JLabel lblAmmoOfSubmarine;
    private javax.swing.JLabel lblAmmoOfTank;
    private javax.swing.JLabel lblEnergy;
    private javax.swing.JLabel lblEnergy01;
    private javax.swing.JLabel lblOxigen;
    private javax.swing.JLabel lblOxigen01;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSoldierOfHelicopter;
    private javax.swing.JLabel lblSoldierOfSubmarine;
    private javax.swing.JLabel lblSoldierofTank;
    private javax.swing.JLabel mainLbl01;
    private javax.swing.JLabel mainLbl02;
    private javax.swing.JLabel mainLbl03;
    private javax.swing.JLabel mainLbl04;
    private javax.swing.JLabel mainLbl06;
    private javax.swing.JComboBox<String> selectDefence;
    private javax.swing.JLabel soldierCountOfHelicopter01;
    private javax.swing.JLabel soldierCountOfSubmarine01;
    private javax.swing.JLabel soldierCountOfTank01;
    private javax.swing.JTextArea txtArea01;
    private javax.swing.JTextArea txtArea02;
    // End of variables declaration//GEN-END:variables

    public void setSMS(String msg, int number) {
        if (number == 1) {
            this.msg += "Helicopter : 1 :" + msg + "\n";
        } else if (number == 2) {
            this.msg += "Submarine : 2 :" + msg + "\n";
        } else if (number == 3) {
            this.msg += "Tank : 3 :" + msg + "\n";
        }

        txtArea02.setText(this.msg);

    }

    public void setSoldierCount(int count, int number) {
        if (number == 1) {
            soldierCountOfHelicopter01.setText(Integer.toString(count));
        } else if (number == 2) {
            soldierCountOfSubmarine01.setText(Integer.toString(count));
        } else if (number == 3) {
            soldierCountOfTank01.setText(Integer.toString(count));
        }

    }
    public void setAmmoCount(int count,int number){
        if(number==1){
            ammoCountOfHelicopter.setText(Integer.toString(count));
        }else if(number==2){
            ammoCountOfSubmarine.setText(Integer.toString(count));
        }else if(number==3){
            ammoCountOfTank.setText(Integer.toString(count));
        }
    }

}
