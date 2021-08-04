
package view;
//author ti03
import javax.swing.JOptionPane;
import br.com.parg.viacep.*;
import controller.ControllerPaciente;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelPaciente;
public class TCadPaciente extends javax.swing.JFrame {
    ModelPaciente modP = new ModelPaciente();
    private TPesPac tpac;
    ControllerPaciente control = new ControllerPaciente();
    public TCadPaciente() {
        initComponents();
        this.tpac = new TPesPac(this, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jbtLocalizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jdtNascimento = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jtxtMae = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtPai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtxtCpf = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtCns = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtRg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtTel = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtCel = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtContato = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtxtIbge = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtxtEnd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtxtBairro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxtCidade = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxtNumero = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtxtComp = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jcbUf = new javax.swing.JComboBox<>();
        jckStatus = new javax.swing.JCheckBox();
        jbtNovo = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtFechar = new javax.swing.JButton();
        jtxtCep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Código:");

        jtxtCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Nome:");

        jtxtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtNome.setEnabled(false);

        jbtLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imganes/procurar.png"))); // NOI18N
        jbtLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLocalizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Nascimento:");

        jdtNascimento.setEnabled(false);
        jdtNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Mâe:");

        jtxtMae.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtMae.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Pai:");

        jtxtPai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtPai.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Sexo:");

        jcbSexo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "FEMININO", "MASCULINO" }));
        jcbSexo.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("CPF:");

        try {
            jtxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCpf.setEnabled(false);
        jtxtCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("CNS:");

        jtxtCns.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtxtCns.setEnabled(false);
        jtxtCns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Identidade:");

        jtxtRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtRg.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Telefone:");

        try {
            jtxtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxtTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTel.setEnabled(false);
        jtxtTel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Celular:");

        try {
            jtxtCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxtCel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCel.setEnabled(false);
        jtxtCel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Contato:");

        jtxtContato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtContato.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Email:");

        jtxtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtEmail.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("CEP:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("IBGE:");

        jtxtIbge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtIbge.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Endereço:");

        jtxtEnd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtEnd.setEnabled(false);
        jtxtEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtEndKeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Bairro:");

        jtxtBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtBairro.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Cidade:");

        jtxtCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtCidade.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setText("Numero:");

        jtxtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtNumero.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Complemento:");

        jtxtComp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtComp.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setText("Estado:");

        jcbUf.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jcbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jcbUf.setEnabled(false);

        jckStatus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jckStatus.setText("Ativo");
        jckStatus.setEnabled(false);

        jbtNovo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtNovo.setForeground(new java.awt.Color(0, 51, 204));
        jbtNovo.setText("NOVO");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jbtCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtCancelar.setForeground(new java.awt.Color(255, 102, 0));
        jbtCancelar.setText("CANCELAR");
        jbtCancelar.setEnabled(false);
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtSalvar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtSalvar.setForeground(new java.awt.Color(0, 153, 0));
        jbtSalvar.setText("SALVAR");
        jbtSalvar.setEnabled(false);
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtFechar.setText("FECHAR");
        jbtFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFecharActionPerformed(evt);
            }
        });

        jtxtCep.setEnabled(false);
        jtxtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtCepKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCepKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jcbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jckStatus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxtEmail))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxtIbge)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jbtLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jdtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtxtMae, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jtxtPai)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtCns, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 61, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jbtNovo)
                                .addGap(480, 480, 480)
                                .addComponent(jbtSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtCancelar)
                                .addGap(35, 35, 35)
                                .addComponent(jbtFechar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtComp)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtxtPai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbtLocalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jdtNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtxtMae, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtCns, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jtxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jtxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jtxtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(jtxtIbge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jtxtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jtxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jtxtComp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jcbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtNovo)
                    .addComponent(jbtCancelar)
                    .addComponent(jbtSalvar)
                    .addComponent(jbtFechar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        this.habDesabilita(true);
        jtxtCodigo.setText("NOVO");
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
       this.habDesabilita(false);
       this.limparForm();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtFecharActionPerformed

    private void jtxtCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCepKeyReleased

    }//GEN-LAST:event_jtxtCepKeyReleased

    private void jtxtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCepKeyPressed
        if((evt.getKeyCode()== KeyEvent.VK_ENTER)){
          ViaCEP viaCep = new ViaCEP();
            try {
                viaCep.buscar(jtxtCep.getText());
                jtxtEnd.setText(viaCep.getLogradouro());
                jtxtBairro.setText(viaCep.getBairro());
                jtxtCidade.setText(viaCep.getLocalidade());
                jcbUf.setSelectedItem(viaCep.getUf());
                jtxtComp.setText(viaCep.getComplemento());
                jtxtIbge.setText(viaCep.getIbge());                
            } catch (ViaCEPException ex) {
                JOptionPane.showMessageDialog(this,"Cep não encontrado por favor verifique o cep digitado :","Erro",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jtxtCepKeyPressed

    private void jtxtEndKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEndKeyPressed

    }//GEN-LAST:event_jtxtEndKeyPressed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
       if(jtxtCodigo.getText().equals("NOVO")){
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
           modP.setNome(jtxtNome.getText());
           String dataf = null;
           dataf = dateFormat.format(jdtNascimento.getDate());
           modP.setNascimento(dataf);
           //modP.setNascimento(dateFormat.format(jdtNascimento.getDate()));
           modP.setMae(jtxtMae.getText());
           modP.setPai(jtxtPai.getText());
           modP.setSexo((String) jcbSexo.getSelectedItem());
           modP.setCpf(jtxtCpf.getText());
           modP.setCns(Integer.parseInt(jtxtCns.getText()));
           modP.setRg(jtxtRg.getText());
           modP.setTelefone(jtxtTel.getText());
           modP.setCelular(jtxtCel.getText());
           modP.setContato(jtxtContato.getText());
           modP.setEmail(jtxtEmail.getText());
           modP.setCep(jtxtCep.getText());
           modP.setIbge(Integer.parseInt(jtxtIbge.getText()));
           modP.setEndereco(jtxtEnd.getText());
           modP.setNumero(jtxtNumero.getText());
           modP.setComplemento(jtxtComp.getText());
           modP.setBairro(jtxtBairro.getText());
           modP.setCidade(jtxtCidade.getText());
           modP.setUf((String) jcbUf.getSelectedItem());
           if(jckStatus.isSelected()){
             modP.setStatus(1);
            }else{
             modP.setStatus(0);
            }
           this.control.cadastrarPac(modP);
           this.limparForm();
       }else{
           modP.setIdPaciente(Integer.parseInt(jtxtCodigo.getText()));
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
           modP.setNome(jtxtNome.getText());
           String dataf = null;
           dataf = dateFormat.format(jdtNascimento.getDate());
           modP.setNascimento(dataf);
           modP.setMae(jtxtMae.getText());
           modP.setPai(jtxtPai.getText());
           modP.setSexo((String) jcbSexo.getSelectedItem());
           modP.setCpf(jtxtCpf.getText());
           modP.setCns(Integer.parseInt(jtxtCns.getText()));
           modP.setRg(jtxtRg.getText());
           modP.setTelefone(jtxtTel.getText());
           modP.setCelular(jtxtCel.getText());
           modP.setContato(jtxtContato.getText());
           modP.setEmail(jtxtEmail.getText());
           modP.setCep(jtxtCep.getText());
           modP.setIbge(Integer.parseInt(jtxtIbge.getText()));
           modP.setEndereco(jtxtEnd.getText());
           modP.setNumero(jtxtNumero.getText());
           modP.setComplemento(jtxtComp.getText());
           modP.setBairro(jtxtBairro.getText());
           modP.setCidade(jtxtCidade.getText());
           modP.setUf((String) jcbUf.getSelectedItem());
           if(jckStatus.isSelected()){
             modP.setStatus(1);
            }else{
             modP.setStatus(0);
            }
           control.atualizaPac(modP);
       }
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLocalizarActionPerformed
        this.tpac.setVisible(true);        
        if(tpac.getEdit() == null){            
        }else{
            this.preencherForm();
            this.habDesabilita(true);
            jtxtCodigo.setEnabled(false);
        }
    }//GEN-LAST:event_jbtLocalizarActionPerformed
//METODO PARA HABILITAR E DESABILITAR CAMPOS DO FORMULARO:
    public void habDesabilita(boolean op){
        jtxtCodigo.setEnabled(op);
        jtxtNome.setEnabled(op);
        jbtLocalizar.setEnabled(!op);
        jdtNascimento.setEnabled(op);
        jtxtMae.setEnabled(op);
        jtxtPai.setEnabled(op);
        jcbSexo.setEnabled(op);
        jtxtCpf.setEnabled(op);
        jtxtCns.setEnabled(op);
        jtxtRg.setEnabled(op);
        jtxtTel.setEnabled(op);
        jtxtCel.setEnabled(op);
        jtxtContato.setEnabled(op);
        jtxtEmail.setEnabled(op);
        jtxtCep.setEnabled(op);
        jtxtIbge.setEnabled(op);
        jtxtEnd.setEnabled(op);
        jtxtNumero.setEnabled(op);
        jtxtComp.setEnabled(op);
        jtxtBairro.setEnabled(op);
        jtxtCidade.setEnabled(op);
        jcbUf.setEnabled(op);
        jckStatus.setEnabled(op);
        jckStatus.setSelected(op);
        jbtSalvar.setEnabled(op);
        jbtCancelar.setEnabled(op);
        jbtNovo.setEnabled(!op);
        jbtFechar.setEnabled(!op);
    }
    //METODO PARA LIMPAR CAMPOS DO FORMULARIO:
    public void limparForm(){
        jtxtCodigo.setText("");
        jtxtNome.setText("");
        jdtNascimento.setDate(null);
        jtxtMae.setText("");
        jtxtPai.setText("");
        jcbSexo.setSelectedItem("SELECIONE");
        jtxtCpf.setText("");
        jtxtCns.setText("");
        jtxtRg.setText("");
        jtxtTel.setText("");
        jtxtCel.setText("");
        jtxtContato.setText("");
        jtxtEmail.setText("");
        jtxtCep.setText("");
        jtxtIbge.setText("");
        jtxtEnd.setText("");
        jtxtNumero.setText("");
        jtxtComp.setText("");
        jtxtBairro.setText("");
        jtxtCidade.setText("");
        jcbUf.setSelectedItem("SELECIONE");
        jckStatus.setSelected(false);
    }
    
    //METODO PARA PREENCHER O FORMULARIO COM DADOS DO BANCO DE DADOS;
    public void preencherForm(){
        ModelPaciente mod = control.pesqPac(tpac.getEdit());
        jtxtCodigo.setText(String.valueOf(mod.getIdPaciente()));
        jtxtNome.setText(mod.getNome());
        try {        
            jdtNascimento.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(mod.getNascimento()));
        } catch (ParseException ex) {
            Logger.getLogger(TCadEnfermagem.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtxtMae.setText(mod.getMae());
        jtxtPai.setText(mod.getPai());
        jcbSexo.setSelectedItem(mod.getSexo());
        jtxtCpf.setText(mod.getCpf());
        jtxtCns.setText(String.valueOf(mod.getCns()));
        jtxtRg.setText(mod.getRg());
        jtxtTel.setText(mod.getTelefone());
        jtxtCel.setText(mod.getCelular());
        jtxtContato.setText(mod.getContato());
        jtxtEmail.setText(mod.getEmail());
        jtxtCep.setText(mod.getCep());
        jtxtIbge.setText(String.valueOf(mod.getIbge()));
        jtxtEnd.setText(mod.getEndereco());
        jtxtNumero.setText(mod.getNumero());
        jtxtComp.setText(mod.getComplemento());
        jtxtBairro.setText(mod.getBairro());
        jtxtCidade.setText(mod.getCidade());
        jcbUf.setSelectedItem(mod.getUf());
        if(mod.getStatus()== 1){
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
            java.util.logging.Logger.getLogger(TCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCadPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtFechar;
    private javax.swing.JButton jbtLocalizar;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JComboBox<String> jcbUf;
    private javax.swing.JCheckBox jckStatus;
    private com.toedter.calendar.JDateChooser jdtNascimento;
    private javax.swing.JTextField jtxtBairro;
    private javax.swing.JFormattedTextField jtxtCel;
    private javax.swing.JTextField jtxtCep;
    private javax.swing.JTextField jtxtCidade;
    private javax.swing.JFormattedTextField jtxtCns;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtComp;
    private javax.swing.JTextField jtxtContato;
    private javax.swing.JFormattedTextField jtxtCpf;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtEnd;
    private javax.swing.JTextField jtxtIbge;
    private javax.swing.JTextField jtxtMae;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextField jtxtNumero;
    private javax.swing.JTextField jtxtPai;
    private javax.swing.JTextField jtxtRg;
    private javax.swing.JFormattedTextField jtxtTel;
    // End of variables declaration//GEN-END:variables
}
