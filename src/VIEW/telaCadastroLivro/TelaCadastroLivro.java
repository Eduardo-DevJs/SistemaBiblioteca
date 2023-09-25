package VIEW.telaCadastroLivro;

import DAO.LivroBiblioteca;
import MODEL.Livros;
import VIEW.MensagemLivroSucesso.livroCadastroSucesso;
import VIEW.MenuOpcoes.menuOpcoes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroLivro extends javax.swing.JFrame {

    public TelaCadastroLivro() {
        initComponents();
        listarLivros();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTituloLivro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutorLivro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAnoPublicacao = new javax.swing.JTextField();
        txtDataCadastro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBloco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEditora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();
        btnMostraLivros = new javax.swing.JButton();
        btnVoltarAoMenu = new javax.swing.JButton();
        btnCarregarCampos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnMostraLivros1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setText("CADASTRO DE LIVRO");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setText("Titulo do Livro");

        txtTituloLivro.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtTituloLivro.setMargin(new java.awt.Insets(2, 12, 2, 6));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel3.setText("Autor do Livro");

        txtAutorLivro.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtAutorLivro.setMargin(new java.awt.Insets(2, 12, 2, 6));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel4.setText("Ano de publicacão");

        txtAnoPublicacao.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtAnoPublicacao.setMargin(new java.awt.Insets(2, 12, 2, 6));

        txtDataCadastro.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtDataCadastro.setMargin(new java.awt.Insets(2, 12, 2, 6));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel5.setText("Data de cadastro");

        txtBloco.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtBloco.setMargin(new java.awt.Insets(2, 12, 2, 6));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel6.setText("Bloco");

        txtEditora.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtEditora.setMargin(new java.awt.Insets(2, 12, 2, 6));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel7.setText("Editora");

        btnCadastrar.setBackground(new java.awt.Color(0, 153, 0));
        btnCadastrar.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tabelaLivros.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo do Livro", "Titulo", "Autor", "Data de cadastro", "Ano de Publicacao", "Editora", "id_bloco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLivros.setRowHeight(30);
        tabelaLivros.setRowMargin(10);
        tabelaLivros.setRowSelectionAllowed(false);
        tabelaLivros.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaLivros);

        btnMostraLivros.setBackground(new java.awt.Color(0, 153, 0));
        btnMostraLivros.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnMostraLivros.setForeground(new java.awt.Color(255, 255, 255));
        btnMostraLivros.setText("MOSTRAR ACERVO");
        btnMostraLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraLivrosActionPerformed(evt);
            }
        });

        btnVoltarAoMenu.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnVoltarAoMenu.setForeground(new java.awt.Color(102, 102, 102));
        btnVoltarAoMenu.setText("VOLTAR AO MENU");
        btnVoltarAoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAoMenuActionPerformed(evt);
            }
        });

        btnCarregarCampos.setBackground(new java.awt.Color(0, 51, 51));
        btnCarregarCampos.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnCarregarCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregarCampos.setText("CARREGAR CAMPOS");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel8.setText("Codigo do Livro");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel9.setText("Tabela");

        btnMostraLivros1.setBackground(new java.awt.Color(0, 153, 0));
        btnMostraLivros1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnMostraLivros1.setForeground(new java.awt.Color(255, 255, 255));
        btnMostraLivros1.setText("LIMPAR CAMPOS");
        btnMostraLivros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCampos(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCodigo))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCarregarCampos)))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostraLivros)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostraLivros1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVoltarAoMenu)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAutorLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3))
                            .addComponent(txtAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCodigo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCarregarCampos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVoltarAoMenu)
                    .addComponent(btnMostraLivros)
                    .addComponent(btnMostraLivros1))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastroDeLivro();
        listarLivros();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnMostraLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraLivrosActionPerformed
        // TODO add your handling code here:
        listarLivros();
    }//GEN-LAST:event_btnMostraLivrosActionPerformed

    private void btnVoltarAoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarAoMenuActionPerformed
        // TODO add your handling code here:
        menuOpcoes menuOpcoes = new menuOpcoes();
        menuOpcoes.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVoltarAoMenuActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        // TODO add your handling code here:
        carregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnLimparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCampos
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimparCampos

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroLivro().setVisible(true);
            }
        });
    }

    private void cadastroDeLivro() {
        Livros livros = new Livros();

        String tituloLivro = txtTituloLivro.getText();
        String autorLivro = txtAutorLivro.getText();
        String editora = txtEditora.getText();
        int bloco = Integer.parseInt(txtBloco.getText());
        String dataCadastro = txtDataCadastro.getText();
        int anoPublicacao = Integer.parseInt(txtAnoPublicacao.getText());
        
      
        livros.setTitulo_livro(tituloLivro);
        livros.setAutor_livro(autorLivro);
        livros.setEditora(editora);
        livros.setBloco(bloco);
        livros.setData_cadastro(dataCadastro);
        livros.setAnoPublicacao(anoPublicacao);

        if (tituloLivro.isEmpty() && autorLivro.isEmpty() && editora.isEmpty() && dataCadastro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
            livroBiblioteca.create(livros);

            livroCadastroSucesso livroCadastroSucesso = new livroCadastroSucesso();
            livroCadastroSucesso.setVisible(true);

            dispose();
        }
    }

    private void listarLivros() {
        try {
            LivroBiblioteca livroBiblioteca = new LivroBiblioteca();

            DefaultTableModel model = (DefaultTableModel) tabelaLivros.getModel();

            model.setNumRows(0);

            for (Livros livroBibliotecaLivro : livroBiblioteca.mostrarLivros()) {
                model.addRow(new Object[]{
                    livroBibliotecaLivro.getId_livro(),
                    livroBibliotecaLivro.getTitulo_livro(),
                    livroBibliotecaLivro.getAutor_livro(),
                    livroBibliotecaLivro.getData_cadastro(),
                    livroBibliotecaLivro.getAnoPublicacao(),
                    livroBibliotecaLivro.getEditora(),
                    livroBibliotecaLivro.getBloco()
                });
            }

            livroBiblioteca.mostrarLivros();

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }

    private void carregarCampos() {
        // Selecionando a linha da tabela
        int setar = tabelaLivros.getSelectedRow();

        txtCodigo.setText(tabelaLivros.getModel().getValueAt(setar, 0).toString());
        txtTituloLivro.setText(tabelaLivros.getModel().getValueAt(setar, 1).toString());
        txtAutorLivro.setText(tabelaLivros.getModel().getValueAt(setar, 2).toString());
        txtDataCadastro.setText(tabelaLivros.getModel().getValueAt(setar,3).toString());
        txtAnoPublicacao.setText(tabelaLivros.getModel().getValueAt(setar, 4).toString());
        txtEditora.setText(tabelaLivros.getModel().getValueAt(setar, 5).toString());
        txtBloco.setText(tabelaLivros.getModel().getValueAt(setar, 6).toString());

    }
    
    private void limparCampos(){
        txtCodigo.setText("");
        txtTituloLivro.setText("");
        txtAutorLivro.setText("");
        txtDataCadastro.setText("");
        txtAnoPublicacao.setText("");
        txtEditora.setText("");
        txtBloco.setText("");
        txtTituloLivro.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnMostraLivros;
    private javax.swing.JButton btnMostraLivros1;
    private javax.swing.JButton btnVoltarAoMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaLivros;
    private javax.swing.JTextField txtAnoPublicacao;
    private javax.swing.JTextField txtAutorLivro;
    private javax.swing.JTextField txtBloco;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDataCadastro;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtTituloLivro;
    // End of variables declaration//GEN-END:variables
}
