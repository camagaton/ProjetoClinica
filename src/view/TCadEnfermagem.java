
package view;
// @author Clayton A. Magaton
import controller.ControllerEnfermagem;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelEnfermargem;

public class TCadEnfermagem extends javax.swing.JFrame {
    ModelEnfermargem mod = new ModelEnfermargem();
    ControllerEnfermagem control = new ControllerEnfermagem();

    /**
     * Creates new form TCadEnfermagem
     */
    public TCadEnfermagem() {
        initComponents();
        this.carregaTab();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPCadEnf = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbEstCivil = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jftxTelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jftxCelular = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtContato = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtCoren = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jckStatus = new javax.swing.JCheckBox();
        jbtNovo = new javax.swing.JButton();
        jbtGravar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jbtSair = new javax.swing.JButton();
        jdtNascimento = new com.toedter.calendar.JDateChooser();
        jPPesqEnf = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtxtPesqEnf = new javax.swing.JTextField();
        jbtPesqEnf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbEnfermagem = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jcbOrdEnf = new javax.swing.JComboBox<>();
        jbtEditar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtSairPesq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Codigo:");

        jtxtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtCodigo.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jtxtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtNome.setEnabled(false);
        jtxtNome.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Data de Nascimento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Estado Civil:");

        jcbEstCivil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcbEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Solteirto(a)", "Casado(a)", "Divorciado(a)", "União Estavél", "Viuvo(a)" }));
        jcbEstCivil.setEnabled(false);
        jcbEstCivil.setPreferredSize(new java.awt.Dimension(156, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Telefone:");

        try {
            jftxTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxTelefone.setEnabled(false);
        jftxTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jftxTelefone.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Celular:");

        try {
            jftxCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxCelular.setEnabled(false);
        jftxCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jftxCelular.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Contato:");

        jtxtContato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtContato.setEnabled(false);
        jtxtContato.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Email:");

        jtxtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtEmail.setEnabled(false);
        jtxtEmail.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Coren:");

        jtxtCoren.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtCoren.setEnabled(false);
        jtxtCoren.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Tipo:");

        jcbTipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Aux. de Enfermagem", "Tec. de Enfermagem", "Superior em Enfermagem" }));
        jcbTipo.setEnabled(false);
        jcbTipo.setPreferredSize(new java.awt.Dimension(264, 30));

        jckStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jckStatus.setSelected(true);
        jckStatus.setText("Ativo");
        jckStatus.setEnabled(false);
        jckStatus.setPreferredSize(new java.awt.Dimension(71, 30));

        jbtNovo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtNovo.setForeground(new java.awt.Color(0, 0, 255));
        jbtNovo.setText("Novo");
        jbtNovo.setPreferredSize(new java.awt.Dimension(73, 40));
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jbtGravar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtGravar.setForeground(new java.awt.Color(0, 204, 0));
        jbtGravar.setText("Gravar");
        jbtGravar.setPreferredSize(new java.awt.Dimension(73, 40));
        jbtGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGravarActionPerformed(evt);
            }
        });

        jbtCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtCancelar.setForeground(new java.awt.Color(255, 0, 51));
        jbtCancelar.setText("Cancelar");
        jbtCancelar.setPreferredSize(new java.awt.Dimension(73, 40));
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtSair.setForeground(new java.awt.Color(255, 153, 0));
        jbtSair.setText("Sair");
        jbtSair.setPreferredSize(new java.awt.Dimension(73, 40));
        jbtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairActionPerformed(evt);
            }
        });

        jdtNascimento.setEnabled(false);
        jdtNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jdtNascimento.setPreferredSize(new java.awt.Dimension(87, 30));

        javax.swing.GroupLayout jPCadEnfLayout = new javax.swing.GroupLayout(jPCadEnf);
        jPCadEnf.setLayout(jPCadEnfLayout);
        jPCadEnfLayout.setHorizontalGroup(
            jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadEnfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPCadEnfLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jdtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jcbEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftxTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPCadEnfLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadEnfLayout.createSequentialGroup()
                        .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCadEnfLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jftxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadEnfLayout.createSequentialGroup()
                                .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCadEnfLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtCoren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10))
                                    .addGroup(jPCadEnfLayout.createSequentialGroup()
                                        .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCadEnfLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPCadEnfLayout.createSequentialGroup()
                                        .addComponent(jckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(251, 251, 251))
                                    .addComponent(jtxtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPCadEnfLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jbtSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCadEnfLayout.setVerticalGroup(
            jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadEnfLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jcbEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jftxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCadEnfLayout.createSequentialGroup()
                        .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)))
                .addGap(43, 43, 43)
                .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jftxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtCoren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPCadEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro de Enfermagem", jPCadEnf);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Pesquisa:");

        jtxtPesqEnf.setPreferredSize(new java.awt.Dimension(6, 30));

        jbtPesqEnf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtPesqEnf.setForeground(new java.awt.Color(204, 51, 255));
        jbtPesqEnf.setText("Localizar");
        jbtPesqEnf.setPreferredSize(new java.awt.Dimension(73, 30));
        jbtPesqEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesqEnfActionPerformed(evt);
            }
        });

        jtbEnfermagem.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jtbEnfermagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Coren", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbEnfermagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbEnfermagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbEnfermagem);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Ordernar por:");

        jcbOrdEnf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbOrdEnf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nome" }));
        jcbOrdEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOrdEnfActionPerformed(evt);
            }
        });
        jcbOrdEnf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbOrdEnfKeyPressed(evt);
            }
        });

        jbtEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtEditar.setForeground(new java.awt.Color(51, 0, 255));
        jbtEditar.setText("Editar");
        jbtEditar.setPreferredSize(new java.awt.Dimension(73, 30));
        jbtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditarActionPerformed(evt);
            }
        });

        jbtExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtExcluir.setForeground(new java.awt.Color(255, 51, 0));
        jbtExcluir.setText("Excluir");
        jbtExcluir.setPreferredSize(new java.awt.Dimension(73, 30));
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtSairPesq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtSairPesq.setForeground(new java.awt.Color(255, 153, 51));
        jbtSairPesq.setText("Sair");
        jbtSairPesq.setPreferredSize(new java.awt.Dimension(73, 30));
        jbtSairPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairPesqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPesqEnfLayout = new javax.swing.GroupLayout(jPPesqEnf);
        jPPesqEnf.setLayout(jPPesqEnfLayout);
        jPPesqEnfLayout.setHorizontalGroup(
            jPPesqEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPesqEnfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPesqEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPPesqEnfLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtPesqEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtPesqEnf, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                    .addGroup(jPPesqEnfLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbOrdEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPPesqEnfLayout.createSequentialGroup()
                        .addComponent(jbtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(316, 316, 316)
                        .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtSairPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPPesqEnfLayout.setVerticalGroup(
            jPPesqEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPesqEnfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPesqEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtPesqEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtPesqEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPesqEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jcbOrdEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPesqEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSairPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pesquisa", jPPesqEnf);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setSize(new java.awt.Dimension(972, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtSairActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.limpaForm();
        this.habitaDesabilita(false);
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        this.habitaDesabilita(true);
        jtxtCodigo.setText("NOVO");
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGravarActionPerformed
    if(jtxtCodigo.getText().equals("NOVO")){
       mod.setNome(jtxtNome.getText());
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
       String dataf = null;
       dataf = dateFormat.format(jdtNascimento.getDate());
       mod.setNascimento(dataf);
       mod.setCivil((String) jcbEstCivil.getSelectedItem());
       mod.setTelefone(jftxTelefone.getText());
       mod.setCelular(jftxCelular.getText());
       mod.setContato(jtxtContato.getText());
       mod.setEmail(jtxtEmail.getText());
       mod.setCoren(jtxtCoren.getText());
       mod.setTipo((String) jcbTipo.getSelectedItem());
       if(jckStatus.isSelected()){
             mod.setStatus(1);
            }else{
             mod.setStatus(0);
            }
       this.control.salvarEnf(mod);
       this.carregaTab();
       this.limpaForm();
       jtxtNome.requestFocus();
    }else{
       mod.setCod(Integer.parseInt(jtxtCodigo.getText()));
       mod.setNome(jtxtNome.getText());
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
       String dataf = null;
       dataf = dateFormat.format(jdtNascimento.getDate());
       mod.setNascimento(dataf);
       mod.setCivil((String) jcbEstCivil.getSelectedItem());
       mod.setTelefone(jftxTelefone.getText());
       mod.setCelular(jftxCelular.getText());
       mod.setContato(jtxtContato.getText());
       mod.setEmail(jtxtEmail.getText());
       mod.setCoren(jtxtCoren.getText());
       mod.setTipo((String) jcbTipo.getSelectedItem());
       if(jckStatus.isSelected()){
             mod.setStatus(1);
            }else{
             mod.setStatus(0);
            }
       this.control.atualizarEnf(mod);
       this.carregaTab();
       this.limpaForm();
    }
    }//GEN-LAST:event_jbtGravarActionPerformed

    private void jcbOrdEnfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbOrdEnfKeyPressed
       if(evt.KEY_PRESSED == KeyEvent.VK_ENTER || evt.KEY_PRESSED == KeyEvent.VK_TAB){
           if(jcbOrdEnf.getSelectedItem().equals("Codigo")){
              carregaTab();
           }else{
               carregaTab();
           }
       }
    }//GEN-LAST:event_jcbOrdEnfKeyPressed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
       int resposta = 0;
       int linha = jtbEnfermagem.getSelectedRow();
       resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este enfermeiro(a)?","Confirmação",JOptionPane.YES_NO_OPTION);
       if(resposta == JOptionPane.YES_OPTION){
           mod.setCod((Integer) jtbEnfermagem.getValueAt(linha, 0));
           control.excluirEnf(mod);
           this.carregaTab();
       }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtSairPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairPesqActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtSairPesqActionPerformed

    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed
       this.preencherForm(); 
       this.habitaDesabilita(true);
       jTabbedPane1.setSelectedIndex(0);       
    }//GEN-LAST:event_jbtEditarActionPerformed

    private void jbtPesqEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesqEnfActionPerformed
        this.carregaTab();
    }//GEN-LAST:event_jbtPesqEnfActionPerformed

    private void jcbOrdEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOrdEnfActionPerformed
       
    }//GEN-LAST:event_jcbOrdEnfActionPerformed

    private void jtbEnfermagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbEnfermagemMouseClicked
        if(evt.getClickCount() == 2){
          this.preencherForm(); 
          this.habitaDesabilita(true);
          jTabbedPane1.setSelectedIndex(0);
       }        
    }//GEN-LAST:event_jtbEnfermagemMouseClicked

    //METODO PARA LIMPAR O FORMULARIO DE CADASTRO DE ENFERMAGEM;
    public void limpaForm(){
        jtxtCodigo.setText("");
        jtxtNome.setText("");
        jdtNascimento.setDate(null);
        jcbEstCivil.setSelectedItem("Selecione");
        jftxTelefone.setText("");
        jftxCelular.setText("");
        jtxtContato.setText("");
        jtxtEmail.setText("");
        jtxtCoren.setText("");
        jcbTipo.setSelectedItem("Selecione");
        jckStatus.setSelected(false);
    }
    //METODO PARA HABILITAR OU DESABILITAR OS CAMPOS DO FORMULARIO;
    public void habitaDesabilita(boolean op){
        jtxtCodigo.setEnabled(!op);
        jtxtNome.setEnabled(op);
        jdtNascimento.setEnabled(op);
        jcbEstCivil.setEnabled(op);
        jftxTelefone.setEnabled(op);
        jftxCelular.setEnabled(op);
        jtxtContato.setEnabled(op);
        jtxtEmail.setEnabled(op);
        jtxtCoren.setEnabled(op);
        jcbTipo.setEnabled(op);
        jckStatus.setEnabled(op);
        jbtNovo.setEnabled(!op);
        jbtSair.setEnabled(!op);        
    }
    //METODO PARA CARREGA DADOS NA TABELA DE ENFERMAGEM:
    private void carregaTab (){
        ArrayList<ModelEnfermargem> listaModelEnf = new ArrayList<>();
        if(jcbOrdEnf.getSelectedItem().equals("Codigo")){
            mod.setOrdem("idenf");
            mod.setPesquisa(jtxtPesqEnf.getText());
        }else{
            mod.setOrdem("enf_nome");
            mod.setPesquisa(jtxtPesqEnf.getText());
        }
        listaModelEnf = control.listaEnf(mod);
        DefaultTableModel modelo = (DefaultTableModel) jtbEnfermagem.getModel();
        jtbEnfermagem.getColumnModel().getColumn(0).setPreferredWidth(01);
        jtbEnfermagem.getColumnModel().getColumn(1).setPreferredWidth(280);
        jtbEnfermagem.getColumnModel().getColumn(2).setPreferredWidth(80);
        jtbEnfermagem.getColumnModel().getColumn(3).setPreferredWidth(80);
        modelo.setNumRows(0);
        for(int i = 0; i < listaModelEnf.size(); i++ ){
             modelo.addRow(new Object[]{
                 listaModelEnf.get(i).getCod(),
                 listaModelEnf.get(i).getNome(),
                 listaModelEnf.get(i).getCoren(),
                 listaModelEnf.get(i).getTipo()
             });
        }
    }
    
    //METODO PARA PREENCHER O FORMULARIO COM DADOS DO BANCO DE DADOS;
    public void preencherForm(){
        int linha = jtbEnfermagem.getSelectedRow();
        mod.setCod((Integer) jtbEnfermagem.getValueAt(linha, 0));
        ModelEnfermargem model = control.PesqEnf((Integer) jtbEnfermagem.getValueAt(linha, 0));
        jtxtCodigo.setText(String.valueOf(model.getCod()));
        jtxtNome.setText(model.getNome());
        try {        
            jdtNascimento.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(model.getNascimento()));
        } catch (ParseException ex) {
            Logger.getLogger(TCadEnfermagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        jcbEstCivil.setSelectedItem(model.getCivil());
        jftxTelefone.setText(model.getTelefone());
        jftxCelular.setText(model.getCelular());
        jtxtContato.setText(model.getContato());
        jtxtEmail.setText(model.getEmail());
        jtxtCoren.setText(model.getCoren());
        jcbTipo.setSelectedItem(model.getTipo());
        if(model.getStatus()== 1){
           jckStatus.setSelected(true);
       }else{
           jckStatus.setSelected(false);
       }
        
    }
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
            java.util.logging.Logger.getLogger(TCadEnfermagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCadEnfermagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCadEnfermagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCadEnfermagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCadEnfermagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPCadEnf;
    private javax.swing.JPanel jPPesqEnf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtEditar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtGravar;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesqEnf;
    private javax.swing.JButton jbtSair;
    private javax.swing.JButton jbtSairPesq;
    private javax.swing.JComboBox<String> jcbEstCivil;
    private javax.swing.JComboBox<String> jcbOrdEnf;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JCheckBox jckStatus;
    private com.toedter.calendar.JDateChooser jdtNascimento;
    private javax.swing.JFormattedTextField jftxCelular;
    private javax.swing.JFormattedTextField jftxTelefone;
    private javax.swing.JTable jtbEnfermagem;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtContato;
    private javax.swing.JTextField jtxtCoren;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextField jtxtPesqEnf;
    // End of variables declaration//GEN-END:variables
}
