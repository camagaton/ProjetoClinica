
package view;
// @author Clayton A. Magaton
import controller.ControllerUsuario;
import javax.swing.JOptionPane;


public class TLogin extends javax.swing.JFrame {
    ControllerUsuario control = new ControllerUsuario();
    
    public TLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtEntrar = new javax.swing.JButton();
        JbtCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jpswSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        JimgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jBtEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtEntrar.setForeground(new java.awt.Color(0, 204, 0));
        jBtEntrar.setText("Entrar");
        jBtEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtEntrar);
        jBtEntrar.setBounds(320, 170, 73, 30);

        JbtCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JbtCancelar.setForeground(new java.awt.Color(204, 0, 51));
        JbtCancelar.setText("Cancelar");
        JbtCancelar.setPreferredSize(new java.awt.Dimension(71, 23));
        JbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JbtCancelar);
        JbtCancelar.setBounds(400, 170, 90, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 90, 60, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 130, 60, 17);
        getContentPane().add(jtxtUsuario);
        jtxtUsuario.setBounds(320, 80, 170, 30);
        getContentPane().add(jpswSenha);
        jpswSenha.setBounds(320, 120, 170, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes/login.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 260, 250);

        JimgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes/fundotelaLogin.png"))); // NOI18N
        getContentPane().add(JimgFundo);
        JimgFundo.setBounds(0, 0, 500, 300);

        setSize(new java.awt.Dimension(520, 311));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtEntrarActionPerformed
      if(control.acessoUsuario(jtxtUsuario.getText(),jpswSenha.getText())){
        TPrincipal tela = new TPrincipal();
        tela.setVisible(true);
        this.dispose();
      }else{
          JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos","Error",JOptionPane.ERROR_MESSAGE);          
      } 
    }//GEN-LAST:event_jBtEntrarActionPerformed

    private void JbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtCancelarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_JbtCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtCancelar;
    private javax.swing.JLabel JimgFundo;
    private javax.swing.JButton jBtEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jpswSenha;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
