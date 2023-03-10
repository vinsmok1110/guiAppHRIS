/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import internalPages.*;


/**
 *
 * @author SCC_PC
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }
    
    Color navcolor = new Color(102,102,255);
    Color headcolor = new Color(102,204,255);
    Color bodycolor = new Color(0,204,204);
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        dashpane = new javax.swing.JPanel();
        jlabel1 = new javax.swing.JLabel();
        userpane = new javax.swing.JPanel();
        jlabel2 = new javax.swing.JLabel();
        reportpane = new javax.swing.JPanel();
        jlabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(null);

        navbar.setBackground(new java.awt.Color(102, 102, 255));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane.setBackground(new java.awt.Color(102, 102, 255));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });

        jlabel1.setBackground(new java.awt.Color(102, 102, 255));
        jlabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel1.setText("DASHBOARD");

        javax.swing.GroupLayout dashpaneLayout = new javax.swing.GroupLayout(dashpane);
        dashpane.setLayout(dashpaneLayout);
        dashpaneLayout.setHorizontalGroup(
            dashpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashpaneLayout.createSequentialGroup()
                .addComponent(jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashpaneLayout.setVerticalGroup(
            dashpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashpaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabel1)
                .addContainerGap())
        );

        navbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 40));

        userpane.setBackground(new java.awt.Color(102, 102, 255));
        userpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpaneMouseExited(evt);
            }
        });

        jlabel2.setBackground(new java.awt.Color(102, 102, 255));
        jlabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel2.setText("USER PAGE");

        javax.swing.GroupLayout userpaneLayout = new javax.swing.GroupLayout(userpane);
        userpane.setLayout(userpaneLayout);
        userpaneLayout.setHorizontalGroup(
            userpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        userpaneLayout.setVerticalGroup(
            userpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userpaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabel2)
                .addContainerGap())
        );

        navbar.add(userpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 40));

        reportpane.setBackground(new java.awt.Color(102, 102, 255));
        reportpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportpaneMouseExited(evt);
            }
        });

        jlabel3.setBackground(new java.awt.Color(102, 102, 255));
        jlabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel3.setText("REPORT LIST");

        javax.swing.GroupLayout reportpaneLayout = new javax.swing.GroupLayout(reportpane);
        reportpane.setLayout(reportpaneLayout);
        reportpaneLayout.setHorizontalGroup(
            reportpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        reportpaneLayout.setVerticalGroup(
            reportpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportpaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabel3)
                .addContainerGap())
        );

        navbar.add(reportpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 40));

        jPanel2.add(navbar);
        navbar.setBounds(0, 0, 170, 450);

        header.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setText("Main Page");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.add(header);
        header.setBounds(170, 0, 690, 60);

        maindesktop.setBackground(new java.awt.Color(0, 204, 204));
        maindesktop.setPreferredSize(new java.awt.Dimension(760, 420));

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jPanel2.add(maindesktop);
        maindesktop.setBounds(170, 60, 690, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
     dashpane.setBackground(bodycolor);        
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
     dashpane.setBackground(navcolor);  
    }//GEN-LAST:event_dashpaneMouseExited

    private void userpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseEntered
     userpane.setBackground(bodycolor);   
    }//GEN-LAST:event_userpaneMouseEntered

    private void userpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseExited
     userpane.setBackground(navcolor);   
    }//GEN-LAST:event_userpaneMouseExited

    private void reportpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpaneMouseEntered
     reportpane.setBackground(bodycolor);
    }//GEN-LAST:event_reportpaneMouseEntered

    private void reportpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpaneMouseExited
     reportpane.setBackground(navcolor);
    }//GEN-LAST:event_reportpaneMouseExited

    private void userpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpaneMouseClicked
     userPage up = new userPage();
     maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_userpaneMouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel reportpane;
    private javax.swing.JPanel userpane;
    // End of variables declaration//GEN-END:variables
}
