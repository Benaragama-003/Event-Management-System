package event.mangement.system;



import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Event_creationGUI extends javax.swing.JFrame {
    private static EventDAO eventDAO = new EventDAO();
    /**
     * Creates new form Dashboard
     */
    public Event_creationGUI() {
       
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollBar2 = new javax.swing.JScrollBar();
        jScrollBar3 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        eventcreationpanel = new javax.swing.JPanel();
        signup_label = new javax.swing.JLabel();
        er_createbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        er_id = new javax.swing.JTextField();
        er_name = new javax.swing.JTextField();
        er_date = new javax.swing.JTextField();
        er_cat = new javax.swing.JComboBox<>();
        er_loc = new javax.swing.JTextField();
        er_des = new javax.swing.JTextField();
        er_createbtn1 = new javax.swing.JButton();
        er_pay = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 248, 243));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1220, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(160, 153, 121));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setBackground(new java.awt.Color(160, 153, 121));
        jButton5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("hOME");
        jButton5.setBorder(null);

        jButton6.setBackground(new java.awt.Color(160, 153, 121));
        jButton6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("EVENTS");
        jButton6.setBorder(null);

        jButton9.setBackground(new java.awt.Color(160, 153, 121));
        jButton9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("BLOGS");
        jButton9.setBorder(null);

        jButton1.setBackground(new java.awt.Color(160, 153, 121));
        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("About Us");
        jButton1.setBorder(null);

        jButton4.setBackground(new java.awt.Color(160, 153, 121));
        jButton4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Contact Us");
        jButton4.setBorder(null);

        jButton7.setBackground(new java.awt.Color(160, 153, 121));
        jButton7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Venues");
        jButton7.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(406, 406, 406))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 100));

        eventcreationpanel.setBackground(new java.awt.Color(255, 255, 255));
        eventcreationpanel.setPreferredSize(new java.awt.Dimension(1210, 768));

        signup_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        signup_label.setText("  Event Registration");

        er_createbtn.setBackground(new java.awt.Color(0, 153, 0));
        er_createbtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        er_createbtn.setForeground(new java.awt.Color(255, 255, 255));
        er_createbtn.setText("Create");
        er_createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                er_createbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("Description");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Location");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Event category");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Payment");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Date");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("Event name");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("Event ID");

        er_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                er_idActionPerformed(evt);
            }
        });

        er_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                er_nameActionPerformed(evt);
            }
        });

        er_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                er_dateActionPerformed(evt);
            }
        });

        er_cat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        er_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sport", "Musical", "Religious", "Drama", " " }));

        er_createbtn1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        er_createbtn1.setText("Cancel");
        er_createbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                er_createbtn1ActionPerformed(evt);
            }
        });

        er_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                er_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eventcreationpanelLayout = new javax.swing.GroupLayout(eventcreationpanel);
        eventcreationpanel.setLayout(eventcreationpanelLayout);
        eventcreationpanelLayout.setHorizontalGroup(
            eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventcreationpanelLayout.createSequentialGroup()
                .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eventcreationpanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(signup_label))
                    .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, eventcreationpanelLayout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(er_createbtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(er_createbtn1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, eventcreationpanelLayout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(er_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(er_date, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(er_name, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(er_id, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(er_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(er_des, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(er_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        eventcreationpanelLayout.setVerticalGroup(
            eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventcreationpanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(signup_label)
                .addGap(39, 39, 39)
                .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(er_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(er_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(er_date, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(er_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(er_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(er_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(er_des, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(eventcreationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(er_createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(er_createbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel1.add(eventcreationpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane3.setMaximumSize(new java.awt.Dimension(3, 3));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(1210, 768));
        jScrollPane3.setVerticalScrollBar(jScrollBar2);
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void er_createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_er_createbtnActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        
                //System.out.print("Enter Event ID: ");
        int eventID = Integer.parseInt(er_id.getText());
        //scanner.nextLine();  // Consume newline left-over
        //System.out.print("Enter Name: ");
        String name = er_name.getText();
        //System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = er_date.getText();
        //System.out.print("Enter Payment: ");
        double payment = Double.parseDouble(er_pay.getText());
        //scanner.nextLine();  // Consume newline
        ///System.out.print("Enter Category: ");
        String category = (String) er_cat.getSelectedItem();
        //System.out.print("Enter Location: ");
        String location = er_loc.getText();
        //System.out.print("Enter Description: ");
        String description = er_des.getText();

        Event event = new Event(eventID, name, date, payment, category, location, description);
        try {
            eventDAO.addEvent(event);
            System.out.println("Event added successfully.");
        } catch (SQLException ex) {
            Logger.getLogger(event.mangement.system.Event_creation.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("eRROR");
        }
        
    }//GEN-LAST:event_er_createbtnActionPerformed

    private void er_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_er_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_er_idActionPerformed

    private void er_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_er_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_er_nameActionPerformed

    private void er_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_er_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_er_dateActionPerformed

    private void er_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_er_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_er_payActionPerformed

    private void er_createbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_er_createbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_er_createbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Event_creationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> er_cat;
    private javax.swing.JButton er_createbtn;
    private javax.swing.JButton er_createbtn1;
    private javax.swing.JTextField er_date;
    private javax.swing.JTextField er_des;
    private javax.swing.JTextField er_id;
    private javax.swing.JTextField er_loc;
    private javax.swing.JTextField er_name;
    private javax.swing.JTextField er_pay;
    private javax.swing.JPanel eventcreationpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel signup_label;
    // End of variables declaration//GEN-END:variables
}
