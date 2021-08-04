
package view;
import javax.swing.table.DefaultTableModel;
import model.ModelPaciente;
import controller.ControllerPaciente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//@author ti03

public class TPesPac extends javax.swing.JDialog {
    ModelPaciente modPac = new ModelPaciente();
    ControllerPaciente controlPac = new ControllerPaciente();
    private Integer edit;
    
    public TPesPac(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregaTab();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtPesq = new javax.swing.JTextField();
        jbtLocalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPacientes = new javax.swing.JTable();
        jbtEditar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pesquisa:");

        jtxtPesq.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jbtLocalizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtLocalizar.setText("Localizar");

        jtbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PACIENTE", "IDENTIDADE", "CPF", "MAE", "NASCIMENTO", "CNS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbPacientes);

        jbtEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtEditar.setForeground(new java.awt.Color(0, 0, 204));
        jbtEditar.setText("Editar");
        jbtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditarActionPerformed(evt);
            }
        });

        jbtExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtExcluir.setForeground(new java.awt.Color(255, 0, 51));
        jbtExcluir.setText("Excluir");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtFechar.setForeground(new java.awt.Color(204, 102, 0));
        jbtFechar.setText("Fechar");
        jbtFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtPesq)
                        .addGap(18, 18, 18)
                        .addComponent(jbtLocalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtEditar)
                        .addGap(518, 518, 518)
                        .addComponent(jbtFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                        .addComponent(jbtExcluir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFecharActionPerformed
        edit=null;
        this.dispose();
    }//GEN-LAST:event_jbtFecharActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        int resposta = 0;
        int linha = jtbPacientes.getSelectedRow();
        resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este paciente?","Confirmação",JOptionPane.YES_NO_OPTION);
        if(resposta == JOptionPane.YES_OPTION){
           controlPac.excluirPac((Integer) jtbPacientes.getValueAt(linha, 0));
           this.carregaTab();
       }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed
        int linha = jtbPacientes.getSelectedRow();
        edit = (Integer) jtbPacientes.getValueAt(linha, 0);
        this.dispose();
    }//GEN-LAST:event_jbtEditarActionPerformed

     //METODO PARA CARREGA INFORMAÇÃO DO BANCO NA TABELA:
    public void carregaTab(){
        ArrayList<ModelPaciente> listaPac = new ArrayList<>();
        listaPac = controlPac.listarPac(jtxtPesq.getText());        
        DefaultTableModel modelo = (DefaultTableModel) jtbPacientes.getModel();
        jtbPacientes.getColumnModel().getColumn(0).setPreferredWidth(05);
        jtbPacientes.getColumnModel().getColumn(1).setPreferredWidth(300);
        jtbPacientes.getColumnModel().getColumn(2).setPreferredWidth(70);
        jtbPacientes.getColumnModel().getColumn(3).setPreferredWidth(70);
        jtbPacientes.getColumnModel().getColumn(4).setPreferredWidth(200);
        jtbPacientes.getColumnModel().getColumn(5).setPreferredWidth(70);
        jtbPacientes.getColumnModel().getColumn(6).setPreferredWidth(90);
        modelo.setRowCount(0);
        for(int i = 0; i < listaPac.size(); i++ ){
        LocalDate data = LocalDate.parse(listaPac.get(i).getNascimento());
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataConvertida = fmt.format(data);            
                modelo.addRow(new Object[]{
                    listaPac.get(i).getIdPaciente(),
                    listaPac.get(i).getNome(),
                    listaPac.get(i).getRg(),
                    listaPac.get(i).getCpf(),
                    listaPac.get(i).getMae(),
                    dataConvertida,                    
                    listaPac.get(i).getCns()
                });           
        }
    }
    
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
            java.util.logging.Logger.getLogger(TPesPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPesPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPesPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPesPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TPesPac dialog = new TPesPac(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    /**
     * @return the edit
     */
    public Integer getEdit() {
        return edit;
    }

    /**
     * @param edit the edit to set
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtEditar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtFechar;
    private javax.swing.JButton jbtLocalizar;
    private javax.swing.JTable jtbPacientes;
    private javax.swing.JTextField jtxtPesq;
    // End of variables declaration//GEN-END:variables
}
