package view;

import estruturas.Dados;
import veterinario.Cachorro;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author EZEQUIEL
 */

public class Janela extends javax.swing.JFrame {

    Dados cadastro = new Dados();

    public Janela() {
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

        tfNome = new javax.swing.JTextField();
        Raca = new javax.swing.JTextField();
        Idade = new javax.swing.JTextField();
        Diagnostico = new javax.swing.JTextField();
        Dias = new javax.swing.JTextField();
        Inserir = new javax.swing.JButton();
        Mostra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mensagem = new javax.swing.JTextArea();
        lbNome = new javax.swing.JLabel();
        lbRaca = new javax.swing.JLabel();
        lbIdade = new javax.swing.JLabel();
        lbDias = new javax.swing.JLabel();
        lbDiagnostico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfNome.setText(" ");
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        Raca.setText(" ");

        Diagnostico.setText(" ");
        Diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosticoActionPerformed(evt);
            }
        });

        Inserir.setText("Inserir");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        Mostra.setText("Mostrar");
        Mostra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostraActionPerformed(evt);
            }
        });

        Mensagem.setColumns(20);
        Mensagem.setRows(5);
        Mensagem.setText("Registros:\n");
        jScrollPane2.setViewportView(Mensagem);

        lbNome.setText("Nome do Animal:");

        lbRaca.setText("Raça:");

        lbIdade.setText("Idade:");

        lbDias.setText("Dias de internação:");

        lbDiagnostico.setText("Diagnostico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome)
                    .addComponent(Diagnostico)
                    .addComponent(Raca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Inserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mostra))
                            .addComponent(lbNome)
                            .addComponent(lbRaca)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbIdade))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDias)
                                    .addComponent(Dias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbDiagnostico))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lbRaca)
                        .addGap(1, 1, 1)
                        .addComponent(Raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdade)
                            .addComponent(lbDias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Inserir)
                            .addComponent(Mostra))))
                .addContainerGap())
        );

        lbNome.getAccessibleContext().setAccessibleName("lbNome:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    // Cria arquivo 
    public void InsereTexto(String CaminhoArquivo, String TextoInsere ){
        
        try( 
                
             FileWriter CriaArquivo = new FileWriter(CaminhoArquivo,true);
             BufferedWriter buffer = new BufferedWriter(CriaArquivo);
             PrintWriter escritorDeArquivos = new PrintWriter(buffer);
             
             ){escritorDeArquivos.append(TextoInsere);
            
             }catch(IOException e){
                     e.printStackTrace();
                     }
               
    }
    
    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        String no, d, id, di, dg, ra, gr;
        no = tfNome.getText();
        di = Dias.getText();
        dg = Diagnostico.getText();
        id = Idade.getText();
        ra = Raca.getText();

        Cachorro ca = new Cachorro();
        if(ra.equals("")){
            Cachorro b = new Cachorro(no, Integer.parseInt(id), dg, Integer.parseInt(di));
            ca = b;
        }
        else{
            Cachorro b = new Cachorro(no, ra, Integer.parseInt(id), dg, Integer.parseInt(di));
            ca = b;
        }
        
        cadastro.insereCadastro(ca);

        tfNome.setText("");
        Dias.setText("");
        Diagnostico.setText("");
        Idade.setText("");
        Raca.setText("");
        
        
       InsereTexto("Relatório_Médico.txt", "\n\n\nNome:");   
       InsereTexto("Relatório_Médico.txt", no);   
       InsereTexto("Relatório_Médico.txt", ", Raça: ");
       InsereTexto("Relatório_Médico.txt", ra); 
       InsereTexto("Relatório_Médico.txt", "\n\nIdade: "); 
       InsereTexto("Relatório_Médico.txt", id);
       InsereTexto("Relatório_Médico.txt", ", Dias de Internação: ");   
       InsereTexto("Relatório_Médico.txt", di);   
       InsereTexto("Relatório_Médico.txt", "\n\nDiagnóstico: ");   
       InsereTexto("Relatório_Médico.txt", dg); 
       
       
      
        
        Mensagem.setText("Inserido!");
    }//GEN-LAST:event_InserirActionPerformed

    private void MostraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostraActionPerformed
        Mensagem.setText(cadastro.listarTodos());
    }//GEN-LAST:event_MostraActionPerformed

    private void DiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiagnosticoActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Diagnostico;
    private javax.swing.JTextField Dias;
    private javax.swing.JTextField Idade;
    private javax.swing.JButton Inserir;
    private javax.swing.JTextArea Mensagem;
    private javax.swing.JButton Mostra;
    private javax.swing.JTextField Raca;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDiagnostico;
    private javax.swing.JLabel lbDias;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRaca;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
