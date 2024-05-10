package cPresentacion;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author alex
 */
public class CarnetVacunacion extends javax.swing.JPanel {

    
    /**
     * Creates new form CarnetVacunacion
     */
    public CarnetVacunacion() {
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

        header = new javax.swing.JPanel();
        LogoMinsa = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        principal = new javax.swing.JPanel();
        logotipoLoVacuno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVerifica1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnVerifica2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        identificate = new javax.swing.JPanel();
        ingresar = new javax.swing.JPanel();
        lblingrese = new javax.swing.JLabel();
        lblmen = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnCGeneral = new javax.swing.JButton();
        btnCCovid19 = new javax.swing.JButton();
        piepagina = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 134, 229));
        header.setPreferredSize(new java.awt.Dimension(1200, 40));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoMinsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Link.png"))); // NOI18N
        header.add(LogoMinsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 200, -1));

        jLabel13.setBackground(new java.awt.Color(85, 87, 95));
        jLabel13.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Política de Privacidad / Términos y Condiciones");
        header.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, 20));

        btnCerrarSesion.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        header.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, -1, -1));

        add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        principal.setBackground(new java.awt.Color(243, 244, 246));
        principal.setPreferredSize(new java.awt.Dimension(580, 350));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logotipoLoVacuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logotipo.png.png"))); // NOI18N
        principal.add(logotipoLoVacuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(39, 41, 47));
        jLabel1.setText("Vacunación");
        principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 41, 47));
        jLabel2.setText("Bienvenido a tu Carné de");
        principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(85, 87, 95));
        jLabel7.setText("Elige que Carné de Vacunación quieres mostrar.");
        principal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(85, 87, 95));
        jLabel8.setText("Haga clic en cada uno para más detalle.");
        principal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        btnVerifica1.setBackground(new java.awt.Color(255, 255, 255));
        btnVerifica1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(85, 87, 95));
        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setText("Si tienes alguna observación sobre la información del Carné");
        btnVerifica1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(85, 87, 95));
        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel6.setText("Virtual acude al establecimiento de salud donde se realizó la");
        btnVerifica1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel9.setBackground(new java.awt.Color(85, 87, 95));
        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel9.setText("vacunación para la evaluación del caso");
        btnVerifica1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        principal.add(btnVerifica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 380, 90));

        btnVerifica2.setBackground(new java.awt.Color(51, 235, 250));
        btnVerifica2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(85, 87, 95));
        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel5.setText("Los mayores de 5 años podrán ver su historial de ");
        btnVerifica2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel10.setBackground(new java.awt.Color(85, 87, 95));
        jLabel10.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel10.setText(" encuentra registrada puedes mostrar tu carné fisico.");
        btnVerifica2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, -1));

        jLabel11.setBackground(new java.awt.Color(85, 87, 95));
        jLabel11.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel11.setText("de vacunación del 2022 en adelante y los menores de 5 años ");
        btnVerifica2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel12.setBackground(new java.awt.Color(85, 87, 95));
        jLabel12.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel12.setText("el 2019 en adelante. Si tu vacunación no se ");
        btnVerifica2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        principal.add(btnVerifica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 380, 90));

        add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 580, 560));

        identificate.setBackground(new java.awt.Color(249, 249, 249));
        identificate.setPreferredSize(new java.awt.Dimension(620, 350));
        identificate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresar.setBackground(new java.awt.Color(255, 255, 255));
        ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblingrese.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        lblingrese.setText("Ingrese el Carné de Vacunación de ");

        lblmen.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        lblmen.setText("menores de edad");

        jLabel19.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(85, 87, 95));
        jLabel19.setText("Debes ser progenitor o apoderado del menor");

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(85, 87, 95));
        jLabel17.setText("para realizar una consulta.");

        btnContinuar.setBackground(new java.awt.Color(0, 134, 229));
        btnContinuar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Ingresar");

        javax.swing.GroupLayout ingresarLayout = new javax.swing.GroupLayout(ingresar);
        ingresar.setLayout(ingresarLayout);
        ingresarLayout.setHorizontalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarLayout.createSequentialGroup()
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingresarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblingrese)
                            .addComponent(lblmen)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)))
                    .addGroup(ingresarLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        ingresarLayout.setVerticalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblingrese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(3, 3, 3)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        identificate.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 330, 180));

        btnCGeneral.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnCGeneral.setForeground(new java.awt.Color(0, 134, 229));
        btnCGeneral.setText("Carnet de Vacunación General");
        btnCGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCGeneralActionPerformed(evt);
            }
        });
        identificate.add(btnCGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 320, 50));

        btnCCovid19.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnCCovid19.setForeground(new java.awt.Color(0, 134, 229));
        btnCCovid19.setText("Carnet de Vacunación COVID-19");
        btnCCovid19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCovid19ActionPerformed(evt);
            }
        });
        identificate.add(btnCCovid19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 320, 50));

        add(identificate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 620, 560));

        piepagina.setBackground(new java.awt.Color(39, 41, 47));
        piepagina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Copyright © 2022. Desarrollado por la Oficina General de Tecnologías de la Información del Ministerio de Salud.  ");
        piepagina.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Política de Privacidad y Términos y Condiciones.");
        piepagina.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Todos los derechos reservados.");
        piepagina.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        add(piepagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1200, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCGeneralActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // Get the JFrame that contains this JPanel
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);

        // Dispose of the JFrame
        frame.dispose();

        // Show the Principal window again
        Principal principal = new Principal();
        principal.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCCovid19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCovid19ActionPerformed

        // Crear una instancia del panel destino
        CarnetVacunacionCovid19 panelCovid19 = new CarnetVacunacionCovid19();

        // Obtener la ventana actual
        JFrame ventanaActual = (JFrame) SwingUtilities.getWindowAncestor(this);

        // Reemplazar el contenido de la ventana actual
        ventanaActual.getContentPane().removeAll();
        ventanaActual.getContentPane().add(panelCovid19);
        ventanaActual.revalidate();
        ventanaActual.repaint();

    }//GEN-LAST:event_btnCCovid19ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoMinsa;
    private javax.swing.JButton btnCCovid19;
    private javax.swing.JButton btnCGeneral;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JPanel btnVerifica1;
    private javax.swing.JPanel btnVerifica2;
    private javax.swing.JPanel header;
    private javax.swing.JPanel identificate;
    private javax.swing.JPanel ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblingrese;
    private javax.swing.JLabel lblmen;
    private javax.swing.JLabel logotipoLoVacuno;
    private javax.swing.JPanel piepagina;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
