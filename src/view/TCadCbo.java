package view;
// @author Clayton Andrade Magaton
import java.util.ArrayList;
import model.ModelCbo;
import controller.ControllerCbo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class TCadCbo extends javax.swing.JFrame {
    ModelCbo mod = new ModelCbo();
    ControllerCbo control = new ControllerCbo();
    String opcao = null;
    public TCadCbo() {
        initComponents();
        this.carregaTab();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtCbo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtDescricao = new javax.swing.JTextField();
        jckStatus = new javax.swing.JCheckBox();
        jbtNovo = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCbo = new javax.swing.JTable();
        jbtExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxPesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE CBO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CBO:");

        jtxtCbo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtCbo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Descrição:");

        jtxtDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtDescricao.setEnabled(false);

        jckStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jckStatus.setSelected(true);
        jckStatus.setText("Ativo");
        jckStatus.setEnabled(false);

        jbtNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtNovo.setForeground(new java.awt.Color(0, 51, 255));
        jbtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes/novo.png"))); // NOI18N
        jbtNovo.setText("NOVO");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jbtSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtSalvar.setForeground(new java.awt.Color(0, 153, 0));
        jbtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes/salvar.png"))); // NOI18N
        jbtSalvar.setText("SALVAR");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtCancelar.setForeground(new java.awt.Color(255, 153, 0));
        jbtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes/cancelar.png"))); // NOI18N
        jbtCancelar.setText("CANCELAR");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jtbCbo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbCbo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CBO", "DESCRIÇÃO", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbCbo);

        jbtExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtExcluir.setForeground(new java.awt.Color(204, 0, 0));
        jbtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes/excluir.png"))); // NOI18N
        jbtExcluir.setText("EXCLUIR");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Pesquisa:");

        jtxPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes/locallizar.png"))); // NOI18N
        jButton1.setText("LOCALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtCbo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jbtSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtCancelar))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jckStatus)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtCbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jckStatus)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNovo)
                    .addComponent(jbtSalvar)
                    .addComponent(jbtCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtExcluir)
                .addGap(18, 18, 18))
        );

        setSize(new java.awt.Dimension(632, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        opcao = "NOVO";
        this.habilitaDesabilita(true);
        jtxtCbo.requestFocus();
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.habilitaDesabilita(false);
        this.limpaForm();
        this.carregaTab();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        int resposta = 0;
        int linha = jtbCbo.getSelectedRow();
        resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este usuario?","Confirmação",JOptionPane.YES_NO_OPTION);
        if(resposta == JOptionPane.YES_OPTION){
            control.excluirCbo((Integer) jtbCbo.getValueAt(linha, 0));
            this.limpaForm();
            this.habilitaDesabilita(false);
            this.carregaTab();
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.carregaTab();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
            mod.setCodigo(Integer.parseInt(jtxtCbo.getText()));
            mod.setDescricao(jtxtDescricao.getText());
            if(jckStatus.isSelected()){
             mod.setStatus(1);
            }else{
             mod.setStatus(0);
            }
            control.salvarCbo(mod);
            this.limpaForm();
            this.carregaTab();
            jtxtCbo.requestFocus();
    }//GEN-LAST:event_jbtSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TCadCbo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCadCbo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCadCbo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCadCbo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCadCbo().setVisible(true);
            }
        });
    }
    //METODO PARA HABILITAR OU DESABILITAR OS CAMPOS DO FORMULARIO;
    public void habilitaDesabilita(boolean op){
        jtxtCbo.setEnabled(op);
        jtxtDescricao.setEnabled(op);
        jckStatus.setEnabled(op);
        jbtNovo.setEnabled(!op);
        jbtSalvar.setEnabled(op);
        jbtCancelar.setEnabled(op);
        jbtExcluir.setEnabled(!op);
    }
    //METODO PARA LIMPAR OS CAMPOS DO FORMULARIO
    public void limpaForm(){
        jtxtCbo.setText("");
        jtxtDescricao.setText("");
        jckStatus.isSelected();
        jtxPesquisa.setText("");
    }
    //METODO PARA CARREGA LISTA DE CBO PARA TABELA;
    public void carregaTab(){
        String ativo = null;
        ArrayList<ModelCbo> listaModelCbo = new ArrayList<>();
        mod.setPesquisa(jtxPesquisa.getText());
        listaModelCbo = control.listaCbo(mod);
        DefaultTableModel modelo = (DefaultTableModel) jtbCbo.getModel();        
        jtbCbo.getColumnModel().getColumn(0).setPreferredWidth(05);
        jtbCbo.getColumnModel().getColumn(1).setPreferredWidth(300);
        jtbCbo.getColumnModel().getColumn(2).setPreferredWidth(5);
        modelo.setNumRows(0);
        for (int i = 0; i < listaModelCbo.size(); i++) {
            if(listaModelCbo.get(i).getStatus().equals(1)){
                ativo = "A";
            }else{
                ativo = "I";
            }
            modelo.addRow(new Object[]{
                listaModelCbo.get(i).getCodigo(),
                listaModelCbo.get(i).getDescricao(),
                ativo
            });            
        }
    }
    //METODO PARA CARREGA DADOS PARA O FORMULARIO;
    public void preencherForm(){
        int linha = jtbCbo.getSelectedRow();
        ModelCbo model = control.retoraCbo((Integer) jtbCbo.getValueAt(linha, 0));
        jtxtCbo.setText(String.valueOf(model.getCodigo()));
        jtxtDescricao.setText(model.getDescricao());
        if(model.getStatus()== 1){
           jckStatus.setSelected(true);
       }else{
           jckStatus.setSelected(false);
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JCheckBox jckStatus;
    private javax.swing.JTable jtbCbo;
    private javax.swing.JTextField jtxPesquisa;
    private javax.swing.JTextField jtxtCbo;
    private javax.swing.JTextField jtxtDescricao;
    // End of variables declaration//GEN-END:variables
}
