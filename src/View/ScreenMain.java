package View;

import java.awt.Color;
import javax.swing.BorderFactory;
import Data.CadastroFilmesDAO;
import Data.CadastroFilmes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

public class ScreenMain extends javax.swing.JFrame {

	/**
	 * Creates new form CadastroDeFilmes
	 */
	public ScreenMain() {
		initComponents();
		setLocationRelativeTo(null);
		jtSubTitle_CadastroDeFilmes.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,
				  Color.BLACK));
	}

	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jlTitle_CenaFlix = new javax.swing.JLabel();
      jtSubTitle_CadastroDeFilmes = new javax.swing.JLabel();
      jbNomeDoFilme = new javax.swing.JLabel();
      jbDataDeLancamento = new javax.swing.JLabel();
      jbCategoria = new javax.swing.JLabel();
      bntCadastrar = new javax.swing.JButton();
      bntLimpar = new javax.swing.JButton();
      txtNomeFilme = new javax.swing.JTextField();
      fTxtDataLancamento = new javax.swing.JFormattedTextField();
      txtCategoria = new javax.swing.JTextField();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("CENAFLIX");
      setBackground(new java.awt.Color(255, 255, 255));

      jPanel1.setBackground(new java.awt.Color(204, 204, 204));

      jlTitle_CenaFlix.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jlTitle_CenaFlix.setText("CENAFLIX");

      jtSubTitle_CadastroDeFilmes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
      jtSubTitle_CadastroDeFilmes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jtSubTitle_CadastroDeFilmes.setText("CADASTRO DE FILMES");

      jbNomeDoFilme.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      jbNomeDoFilme.setText("Nome do Filme:");

      jbDataDeLancamento.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      jbDataDeLancamento.setText("Data de Lançamento:");

      jbCategoria.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      jbCategoria.setText("Categoria:");

      bntCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      bntCadastrar.setText("Cadastrar");
      bntCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntCadastrarActionPerformed(evt);
         }
      });

      bntLimpar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      bntLimpar.setText("Limpar");
      bntLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      bntLimpar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntLimparActionPerformed(evt);
         }
      });

      txtNomeFilme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      txtNomeFilme.setToolTipText("Informe o Nome do Filme");
      txtNomeFilme.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtNomeFilmeActionPerformed(evt);
         }
      });

      try {
         fTxtDataLancamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      fTxtDataLancamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      fTxtDataLancamento.setToolTipText("Digite a Data de Lançamento");
      fTxtDataLancamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

      txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      txtCategoria.setToolTipText("Digite a Categoria ex: Ação, Ficção, Romance");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(216, 216, 216)
                  .addComponent(jtSubTitle_CadastroDeFilmes))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(267, 267, 267)
                  .addComponent(jlTitle_CenaFlix))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(44, 44, 44)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jbNomeDoFilme)
                     .addComponent(jbDataDeLancamento)
                     .addComponent(jbCategoria))
                  .addGap(24, 24, 24)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(fTxtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                           .addComponent(bntCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(bntLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNomeFilme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap(96, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jlTitle_CenaFlix)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jtSubTitle_CadastroDeFilmes)
            .addGap(26, 26, 26)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jbNomeDoFilme)
               .addComponent(txtNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jbDataDeLancamento)
               .addComponent(fTxtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jbCategoria)
               .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(bntCadastrar)
               .addComponent(bntLimpar))
            .addGap(46, 46, 46))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(34, Short.MAX_VALUE))
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

   private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed

		CadastroFilmes cadastro = new CadastroFilmes();
		CadastroFilmesDAO dao = new CadastroFilmesDAO();

		boolean status;
		int resposta;

		cadastro.setNomeDoFilme(txtNomeFilme.getText());

		
		String dataString = fTxtDataLancamento.getText();
		SimpleDateFormat formatEntrada = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = null;
		try {
			dataFormatada = formatEntrada.parse(dataString);
		} catch (ParseException ex) {
			// tratamento de exceção
		}
		cadastro.setDataLacamento(dataFormatada);

		cadastro.setCategoria(txtCategoria.getText());

		dao = new CadastroFilmesDAO();

		status = dao.conectar();

		if (status == false) {

			JOptionPane.showMessageDialog(null, "Erro de Conexão");

		} else {

			resposta = dao.salvar(cadastro);

			if (resposta == 1) {

				JOptionPane.showMessageDialog(null, "Filme salvo com sucesso!");
				limparDados();
				txtNomeFilme.requestFocus();

			} else {

				JOptionPane.showMessageDialog(null, "Erro ao Salvar");
			}

			dao.desconectar();
		}

   }//GEN-LAST:event_bntCadastrarActionPerformed

   private void bntLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparActionPerformed

		limparDados();
		
		
   }//GEN-LAST:event_bntLimparActionPerformed

   private void txtNomeFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFilmeActionPerformed

   }//GEN-LAST:event_txtNomeFilmeActionPerformed

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;

				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ScreenMain.class
					  .getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ScreenMain.class
					  .getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ScreenMain.class
					  .getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ScreenMain.class
					  .getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ScreenMain().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton bntCadastrar;
   private javax.swing.JButton bntLimpar;
   private javax.swing.JFormattedTextField fTxtDataLancamento;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JLabel jbCategoria;
   private javax.swing.JLabel jbDataDeLancamento;
   private javax.swing.JLabel jbNomeDoFilme;
   private javax.swing.JLabel jlTitle_CenaFlix;
   private javax.swing.JLabel jtSubTitle_CadastroDeFilmes;
   private javax.swing.JTextField txtCategoria;
   private javax.swing.JTextField txtNomeFilme;
   // End of variables declaration//GEN-END:variables

	public void limparDados() {

		txtNomeFilme.setText("");
		fTxtDataLancamento.setText("");
		txtCategoria.setText("");

	}

}
