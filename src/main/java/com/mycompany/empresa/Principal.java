package com.mycompany.empresa;

import com.formdev.flatlaf.FlatLightLaf;
import java.time.LocalDate;

/**
 *
 * @author epren
 */
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        lbTitulo.putClientProperty( "FlatLaf.styleClass", "h1" );
        setDate();
        
    }
    
    private void setDate(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre", "Octubre","Noviembre","Diciembre"};
        lbFecha.setText("Hoy es "+day+" de "+meses[month-1]+" de "+year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBackground = new javax.swing.JPanel();
        pnLateral = new javax.swing.JPanel();
        btnCobros = new javax.swing.JButton();
        btnArticulos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnES = new javax.swing.JButton();
        btnESDinero = new javax.swing.JButton();
        btnFacturasCompras = new javax.swing.JButton();
        btnFacturasVentas = new javax.swing.JButton();
        pnSuperior = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        pnPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnBackground.setBackground(new java.awt.Color(255, 255, 255));

        pnLateral.setBackground(new java.awt.Color(255, 255, 204));

        btnCobros.setBackground(new java.awt.Color(204, 255, 255));
        btnCobros.setText("Cobros");
        btnCobros.setBorder(null);
        btnCobros.setBorderPainted(false);
        btnCobros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnArticulos.setBackground(new java.awt.Color(204, 255, 255));
        btnArticulos.setText("Articulos");
        btnArticulos.setBorder(null);
        btnArticulos.setBorderPainted(false);
        btnArticulos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(204, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnProveedores.setBackground(new java.awt.Color(204, 255, 255));
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorder(null);
        btnProveedores.setBorderPainted(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnPagos.setBackground(new java.awt.Color(204, 255, 255));
        btnPagos.setText("Pagos");
        btnPagos.setBorder(null);
        btnPagos.setBorderPainted(false);
        btnPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnES.setBackground(new java.awt.Color(204, 255, 255));
        btnES.setText("Entrada/Salida");
        btnES.setBorder(null);
        btnES.setBorderPainted(false);
        btnES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnESDinero.setBackground(new java.awt.Color(204, 255, 255));
        btnESDinero.setText("E/S Dinero");
        btnESDinero.setBorder(null);
        btnESDinero.setBorderPainted(false);
        btnESDinero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnFacturasCompras.setBackground(new java.awt.Color(204, 255, 255));
        btnFacturasCompras.setText("Facturas de compra");
        btnFacturasCompras.setBorder(null);
        btnFacturasCompras.setBorderPainted(false);
        btnFacturasCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnFacturasVentas.setBackground(new java.awt.Color(204, 255, 255));
        btnFacturasVentas.setText("Facturas de ventas");
        btnFacturasVentas.setBorder(null);
        btnFacturasVentas.setBorderPainted(false);
        btnFacturasVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnLateralLayout = new javax.swing.GroupLayout(pnLateral);
        pnLateral.setLayout(pnLateralLayout);
        pnLateralLayout.setHorizontalGroup(
            pnLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCobros, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnES, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnESDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnFacturasCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnFacturasVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnLateralLayout.setVerticalGroup(
            pnLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLateralLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnCobros, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnES, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnESDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFacturasCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFacturasVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnSuperior.setBackground(new java.awt.Color(255, 51, 51));

        lbTitulo.setText("Titulo");

        lbFecha.setText("Hoy es 11 de octubre de 2024");

        javax.swing.GroupLayout pnSuperiorLayout = new javax.swing.GroupLayout(pnSuperior);
        pnSuperior.setLayout(pnSuperiorLayout);
        pnSuperiorLayout.setHorizontalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuperiorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFecha)
                .addGap(219, 219, 219))
        );
        pnSuperiorLayout.setVerticalGroup(
            pnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFecha)
                .addGap(17, 17, 17)
                .addComponent(lbTitulo)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo2.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addComponent(pnLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnBackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnBackgroundLayout.setVerticalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addComponent(pnSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1096, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArticulosActionPerformed
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCobros;
    private javax.swing.JButton btnES;
    private javax.swing.JButton btnESDinero;
    private javax.swing.JButton btnFacturasCompras;
    private javax.swing.JButton btnFacturasVentas;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JPanel pnLateral;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnSuperior;
    // End of variables declaration//GEN-END:variables
}
