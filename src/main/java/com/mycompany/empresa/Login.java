package com.mycompany.empresa;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author epren
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        btnIngresar.putClientProperty("JButton.buttonType", "roundRect");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txNombre = new javax.swing.JTextField();
        txPassword = new javax.swing.JPasswordField();
        lbNombre = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGCA 3000");
        setMinimumSize(new java.awt.Dimension(400, 600));
        setName("login"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(400, 600));
        bg.setPreferredSize(new java.awt.Dimension(400, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(4, 512));
        jLabel1.setPreferredSize(new java.awt.Dimension(4, 512));
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 280));
        bg.add(txNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 320, 40));
        bg.add(txPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 320, 40));

        lbNombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbNombre.setText("Usuario");
        bg.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        lbPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbPassword.setText("Contraseña");
        bg.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        bg.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 140, 60));

        txEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txEstado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(txEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 400, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String nombre = txNombre.getText();
        String password = new String(txPassword.getPassword());

        if (nombre.isEmpty() || password.isEmpty()) {
            txEstado.setText("Error 01");
        } else if (!nombre.equals("admin")) {
            txEstado.setText("Error 01");
        } else if (!password.equals("1234")) {
            txEstado.setText("Error 01");
        } else {
            // Cerrar el JFrame actual
            this.dispose();

            // Abrir el nuevo JFrame
            Principal frame2 = new Principal();
            frame2.setVisible(true);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel txEstado;
    private javax.swing.JTextField txNombre;
    private javax.swing.JPasswordField txPassword;
    // End of variables declaration//GEN-END:variables
}
