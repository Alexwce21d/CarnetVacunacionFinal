package cPresentacion;

import cEntidad.TextToGraphics;
import cEntidad.Usuario;
import cNegocio.UsuarioService;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class Principal extends javax.swing.JFrame {

    String currentCaptcha;
    Usuario objUsuario = new Usuario();
    UsuarioService objUsuarioService = new UsuarioService();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        lblImg.setText("");
        reset();

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
        principal = new javax.swing.JPanel();
        logotipoLoVacuno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVerifica = new javax.swing.JPanel();
        logotipoQR = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        identificate = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        cboxTipo = new javax.swing.JComboBox<>();
        lblNumeroDocumento = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblFEmision = new javax.swing.JLabel();
        txtFechaEmision = new com.toedter.calendar.JDateChooser();
        lblLugarEmision = new javax.swing.JLabel();
        lblFNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        ckboxMantener = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        txtCaptcha = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        piepagina = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 134, 229));
        header.setPreferredSize(new java.awt.Dimension(1200, 40));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoMinsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Link.png"))); // NOI18N
        header.add(LogoMinsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 200, -1));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        principal.setBackground(new java.awt.Color(243, 244, 246));
        principal.setPreferredSize(new java.awt.Dimension(580, 350));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logotipoLoVacuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logotipo.png.png"))); // NOI18N
        principal.add(logotipoLoVacuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(39, 41, 47));
        jLabel1.setText("Carné de Vacunación");
        principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 41, 47));
        jLabel2.setText("Te damos la bienvenida a");
        principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel3.setBackground(new java.awt.Color(85, 87, 95));
        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel3.setText("En esta plataforma podrás:");
        principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(85, 87, 95));
        jLabel4.setText("• Ver y descargar tu Carné de Vacunación. ");
        principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(85, 87, 95));
        jLabel5.setText("• Verificar la validez de un código QR. ");
        principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(85, 87, 95));
        jLabel6.setText("• Ver el detalle de tu esquema de vacunación. ");
        principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(85, 87, 95));
        jLabel7.setText("• Descargar tu certificado de vacunación. ");
        principal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(85, 87, 95));
        jLabel8.setText("• Solicitar el registro de tu vacunación COVID-19. ");
        principal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        btnVerifica.setBackground(new java.awt.Color(255, 255, 255));
        btnVerifica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerifica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logotipoQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background+Shadow.png"))); // NOI18N
        btnVerifica.add(logotipoQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel9.setText("Verifica un");
        btnVerifica.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel11.setText("código QR");
        btnVerifica.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        principal.add(btnVerifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 320, 90));

        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 580, 560));

        identificate.setBackground(new java.awt.Color(249, 249, 249));
        identificate.setPreferredSize(new java.awt.Dimension(620, 350));
        identificate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        lblTitle.setText("Identifícate para ingresar ");
        identificate.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        lblTipo.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        lblTipo.setText("Selecciona tu tipo de Documento  ");
        identificate.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        cboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI - Documento Nacional de Identidad", "CE - Carnet de Extranjería", "Pasaporte", "Documento de Identidad Extranjero", "Código Temporal de Acceso", "Permiso Temporal de Permanencia" }));
        identificate.add(cboxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 320, 30));

        lblNumeroDocumento.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        lblNumeroDocumento.setText("Número de Documento ");
        identificate.add(lblNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));
        identificate.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 320, 30));

        lblFEmision.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        lblFEmision.setText("Fecha de emisión de tu DNI ");
        identificate.add(lblFEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        txtFechaEmision.setDateFormatString("yyyy-MM-dd");
        identificate.add(txtFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 320, 30));

        lblLugarEmision.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        lblLugarEmision.setText("¿Dónde está la Fecha de emisión de mi DNI?");
        identificate.add(lblLugarEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        lblFNacimiento.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        lblFNacimiento.setText("Fecha de Nacimiento ");
        identificate.add(lblFNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        txtFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        identificate.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 320, 30));

        ckboxMantener.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        ckboxMantener.setText("Mantener mi sesión iniciada por 07 días.  ");
        identificate.add(ckboxMantener, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel17.setText("Condiciones de la plataforma.");
        identificate.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        jLabel19.setText("Revisa la Política de Privacidad y Términos y");
        identificate.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        btnContinuar.setBackground(new java.awt.Color(161, 177, 184));
        btnContinuar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        identificate.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 220, 40));

        lblImg.setText("jLabel10");
        identificate.add(lblImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        txtCaptcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaptchaActionPerformed(evt);
            }
        });
        identificate.add(txtCaptcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 140, 40));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        identificate.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        getContentPane().add(identificate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 620, 560));

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

        getContentPane().add(piepagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1200, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset() {
        try {
            currentCaptcha = TextToGraphics.generateImage();
            Image img = ImageIO.read(new File("./src/captcha/Text.png"));
            lblImg.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
       // Validate the CAPTCHA first
         if (!txtCaptcha.getText().equals(currentCaptcha)) {
            JOptionPane.showMessageDialog(this, "Invalid CAPTCHA", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
// Obtener el tipo de documento seleccionado del cuadro combinado
        String tipoDocumento = (String) cboxTipo.getSelectedItem();
        //Obtiene el número de documento del campo de texto
        String numeroDocumento = txtDni.getText();
        //Obtener la fecha de emisión del DNI desde el selector de fechas
        Date fechaEmisionDNI = txtFechaEmision.getDate();
        // Obtener la fecha de nacimiento del selector de fechas
        Date fechaNacimiento = txtFechaNacimiento.getDate();

        // Llama al método validarDNI desde la entidad objUsuario para validar el número de DNI
        if (!objUsuario.validateDNI(numeroDocumento)) {
            // Si el DNI no es válido muestra un mensaje de error y detiene la ejecución
            JOptionPane.showMessageDialog(this, "Número de DNI inválido");
            return;
        }

        // Validate the date of emission
        if (!objUsuario.validateFechaEmision(fechaEmisionDNI)) {
            JOptionPane.showMessageDialog(this, "Fecha de emisión inválida");
            return;
        }

        // Validate the date of birth
        if (!objUsuario.validateFechaNacimiento(fechaNacimiento)) {
            JOptionPane.showMessageDialog(this, "Fecha de nacimiento inválida");
            return;
        }
        

        // Crea un nuevo objeto Usuario
        Usuario usuario = new Usuario();
        // Establecer el tipo de documento del usuario
        usuario.setTipoDocumento(tipoDocumento);
        // Establece el número de documento del usuario
        usuario.setNumeroDocumento(numeroDocumento);
        // Establecer la fecha de emisión del DNI del usuario
        usuario.setFechaEmisionDNI(fechaEmisionDNI);
        // Establece la fecha de nacimiento del usuario
        usuario.setFechaNacimiento(fechaNacimiento);
        // Llama al método agregarUsuario desde objUsuarioService para agregar el usuario
        objUsuarioService.agregarUsuario(usuario);
        // Comprobar si hay un mensaje de error del proceso de creación de usuario
        if (usuario.getMensajeError() == null) {
            // Si no hay ningún error, muestra un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Usuario agregado exitosamente");
        } else {
            // Si hay un error, muestra un mensaje de error con los detalles del error
            JOptionPane.showMessageDialog(this, "Error: " + usuario.getMensajeError());
        }
        //Cerrar la ventana actual
        this.dispose();
        // Crea un nuevo objeto CarnetVacunacion
        CarnetVacunacion carnetVacunacion = new CarnetVacunacion();
        // Crea un nuevo JFrame para el carnet de vacunación
        JFrame registerFrame = new JFrame("Carnet Vacunacion");
        // Establece la operación de cierre predeterminada para el marco
        registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Agrega el panel del carnet de vacunación al marco
        registerFrame.add(carnetVacunacion);
        // Empaqueta el marco a su tamaño preferido
        registerFrame.pack();
        //Hacer visible el marco
        registerFrame.setVisible(true);

        //metodo creamos isntaaciia
        CarnetVacunacionCovid19 covid19 = new CarnetVacunacionCovid19(numeroDocumento, fechaNacimiento);
        registerFrame.add(covid19);

        
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtCaptchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaptchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaptchaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        reset();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoMinsa;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JPanel btnVerifica;
    private javax.swing.JComboBox<String> cboxTipo;
    private javax.swing.JCheckBox ckboxMantener;
    private javax.swing.JPanel header;
    private javax.swing.JPanel identificate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFEmision;
    private javax.swing.JLabel lblFNacimiento;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLugarEmision;
    private javax.swing.JLabel lblNumeroDocumento;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel logotipoLoVacuno;
    private javax.swing.JLabel logotipoQR;
    private javax.swing.JPanel piepagina;
    private javax.swing.JPanel principal;
    private javax.swing.JTextField txtCaptcha;
    private javax.swing.JTextField txtDni;
    private com.toedter.calendar.JDateChooser txtFechaEmision;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    // End of variables declaration//GEN-END:variables
}
