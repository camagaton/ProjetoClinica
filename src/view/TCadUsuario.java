package view;
// @author Clayton A. Magaton
import dao.ConexaoBD;
import controller.ControllerUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelUsuario;

public class TCadUsuario extends javax.swing.JFrame {
    ModelUsuario mod = new ModelUsuario();
    ControllerUsuario control = new ControllerUsuario();
    public TCadUsuario() {
        initComponents();
        carregaUsuario(jtxtPesquisa.getText());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtNomeUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtSenha = new javax.swing.JPasswordField();
        jckAtivo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jcbPerfil = new javax.swing.JComboBox<>();
        jbtNovo = new javax.swing.JButton();
        jbtGravar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuarios = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jtxtPesquisa = new javax.swing.JTextField();
        jbtLocaliza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtExcluir = new javax.swing.JButton();
        jbtEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jtxtID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtID.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jtxtNomeUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtNomeUser.setEnabled(false);
        jtxtNomeUser.setPreferredSize(new java.awt.Dimension(6, 30));
        jtxtNomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNomeUserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Login:");

        jtxtLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtLogin.setEnabled(false);
        jtxtLogin.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Senha:");

        jtxtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtSenha.setEnabled(false);
        jtxtSenha.setPreferredSize(new java.awt.Dimension(6, 30));

        jckAtivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jckAtivo.setText("Ativo");
        jckAtivo.setEnabled(false);
        jckAtivo.setPreferredSize(new java.awt.Dimension(59, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Perfil:");

        jcbPerfil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Médico", "Enfermagem", "Atendente" }));
        jcbPerfil.setEnabled(false);
        jcbPerfil.setPreferredSize(new java.awt.Dimension(100, 30));

        jbtNovo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtNovo.setText("NOVO");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jbtGravar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtGravar.setText("GRAVAR");
        jbtGravar.setEnabled(false);
        jbtGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGravarActionPerformed(evt);
            }
        });

        jbtCancelar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtCancelar.setText("CANCELAR");
        jbtCancelar.setEnabled(false);
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jtbUsuarios.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Login", "Perfil", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtbUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        jtbUsuarios.getTableHeader().setReorderingAllowed(false);
        jtbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUsuarios);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Pesquisa:");

        jtxtPesquisa.setPreferredSize(new java.awt.Dimension(6, 30));

        jbtLocaliza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtLocaliza.setText("Localizar");
        jbtLocaliza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtLocaliza.setPreferredSize(new java.awt.Dimension(73, 30));
        jbtLocaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLocalizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtNomeUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbPerfil, 0, 233, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jckAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtLocaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jbtGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jckAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNovo)
                    .addComponent(jbtGravar)
                    .addComponent(jbtCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtLocaliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE USUARIOS:");

        jbtExcluir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtExcluir.setText("EXCLUIR");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtEditar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtEditar.setText("EDITAR");
        jbtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtExcluir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtExcluir)
                    .addComponent(jbtEditar))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(838, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGravarActionPerformed
       if(jtxtID.getText().equals("NOVO")){ 
            mod.setSenha(jtxtSenha.getText());
            mod.setPerfil((String) jcbPerfil.getSelectedItem());
            mod.setNome(jtxtNomeUser.getText());
            mod.setLogin(jtxtLogin.getText());
            if(jckAtivo.isSelected()){
             mod.setAtivo(1);
            }else{
             mod.setAtivo(0);
            }
            control.SalvarUsuario(mod);
            this.LimparForm();
            this.habilita_desbilita(false);
            this.carregaUsuario("");
       }else{
            mod.setCodigo(Integer.parseInt(jtxtID.getText()));
            mod.setSenha(jtxtSenha.getText());
            mod.setPerfil((String) jcbPerfil.getSelectedItem());
            mod.setNome(jtxtNomeUser.getText());
            if(jckAtivo.isSelected()){
             mod.setAtivo(1);
            }else{
             mod.setAtivo(0);
            }
            mod.setPesquisa(jtxtID.getText());
            control.atualizaUsuario(mod);
            this.habilita_desbilita(false);
            this.LimparForm();
            this.carregaUsuario("");
       }
    }//GEN-LAST:event_jbtGravarActionPerformed
    
    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        jtxtID.setText("NOVO");
        jtxtNomeUser.requestFocus();
        this.habilita_desbilita(true);
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.LimparForm();
        jtxtID.setText("");
        this.habilita_desbilita(false);
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jtxtNomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNomeUserActionPerformed
        jtxtNomeUser.getText().toUpperCase();
    }//GEN-LAST:event_jtxtNomeUserActionPerformed

    private void jbtLocalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLocalizaActionPerformed
        this.carregaUsuario(jtxtPesquisa.getText());
    }//GEN-LAST:event_jbtLocalizaActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        int resposta = 0;
        int linha = jtbUsuarios.getSelectedRow();
        resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este usuario?","Confirmação",JOptionPane.YES_NO_OPTION);
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodigo((int) jtbUsuarios.getValueAt(linha, 0));
            control.excluirUsuario(mod);
            this.LimparForm();
            this.habilita_desbilita(false);
            this.carregaUsuario("");
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed
        int linha = jtbUsuarios.getSelectedRow();
        this.preencherForm((String) jtbUsuarios.getValueAt(linha, 1));        
        this.habilita_desbilita(true);
    }//GEN-LAST:event_jbtEditarActionPerformed

    private void jtbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUsuariosMouseClicked
       if(evt.getClickCount() == 2){
          int linha = jtbUsuarios.getSelectedRow();
          this.preencherForm((String) jtbUsuarios.getValueAt(linha, 1));
          this.habilita_desbilita(true);
       }
    }//GEN-LAST:event_jtbUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(TCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCadUsuario().setVisible(true);
            }
        });
    }
    //metodo para limpar o formulario;
    public void LimparForm(){
        jtxtID.setText("");
        jtxtNomeUser.setText("");
        jtxtLogin.setText("");
        jtxtSenha.setText("");
        jckAtivo.setSelected(false);
        jcbPerfil.setSelectedItem("Selecione");        
    }
    // metodo:preebcher o formulario com os dados encontrados no banco de dados;
    public void preencherForm (String Pesq){
       mod.setPesquisa(jtxtPesquisa.getText());
       ModelUsuario model = control.pesquisaUser(mod);
       jtxtID.setText(String.valueOf(model.getCodigo()));
       jtxtNomeUser.setText(model.getNome());
       jtxtLogin.setText(model.getLogin());
       jtxtSenha.setText(model.getSenha());
       if(model.getAtivo()== 1){
           jckAtivo.setSelected(true);
       }else{
           jckAtivo.setSelected(false);
       }
       jcbPerfil.setSelectedItem(model.getPerfil());       
    }
    // metodo para habilita ou desabilita os campos do formulario;
    public void habilita_desbilita(boolean op){
        jtxtID.setEnabled(!op);
        jtxtNomeUser.setEnabled(op);
        jtxtLogin.setEnabled(op);
        jtxtSenha.setEnabled(op);
        jckAtivo.setEnabled(op);
        jcbPerfil.setEnabled(op);
        jbtNovo.setEnabled(!op);
        jbtGravar.setEnabled(op);
        jbtEditar.setEnabled(!op);
        jbtCancelar.setEnabled(op);
        jbtExcluir.setEnabled(!op);
        jbtLocaliza.setEnabled(!op);
        jtxtPesquisa.setEnabled(!op);
    }
    //CARREGA OS USUARIO CADASTRADOS NO BANCO DE DADOS PARA A TABELA.    
    private void carregaUsuario(String Pesq){
        String ativo = null;
        ArrayList<ModelUsuario> ListaModelUsuario = new ArrayList<>();
        mod.setPesquisa(jtxtPesquisa.getText());
        ListaModelUsuario = control.listaUsuarioNome(mod);
        DefaultTableModel modelo = (DefaultTableModel) jtbUsuarios.getModel();        
        jtbUsuarios.getColumnModel().getColumn(0).setPreferredWidth(05);
        jtbUsuarios.getColumnModel().getColumn(1).setPreferredWidth(220);
        jtbUsuarios.getColumnModel().getColumn(2).setPreferredWidth(70);
        jtbUsuarios.getColumnModel().getColumn(3).setPreferredWidth(30);
        jtbUsuarios.getColumnModel().getColumn(4).setPreferredWidth(05);
        modelo.setNumRows(0);
        for (int i = 0; i < ListaModelUsuario.size(); i++) {
            if(ListaModelUsuario.get(i).getAtivo().equals(1)){
                ativo = "A";
            }else{
                ativo = "I";
            }
            modelo.addRow(new Object[]{
                ListaModelUsuario.get(i).getCodigo(),
                ListaModelUsuario.get(i).getNome(),
                ListaModelUsuario.get(i).getLogin(),
                ListaModelUsuario.get(i).getPerfil(),
                ativo
            });
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtEditar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtGravar;
    private javax.swing.JButton jbtLocaliza;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JComboBox<String> jcbPerfil;
    private javax.swing.JCheckBox jckAtivo;
    private javax.swing.JTable jtbUsuarios;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtLogin;
    private javax.swing.JTextField jtxtNomeUser;
    private javax.swing.JTextField jtxtPesquisa;
    private javax.swing.JPasswordField jtxtSenha;
    // End of variables declaration//GEN-END:variables
}
