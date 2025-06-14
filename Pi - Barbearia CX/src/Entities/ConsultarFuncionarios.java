/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Entities;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class ConsultarFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarHora
     */
    public ConsultarFuncionarios() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaFuncionarios.setModel(consultarFuncionarios());
        jScrollPane1.setViewportView(tabelaFuncionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarFuncionarios().setVisible(true);
            }
        });
    }

    private DefaultTableModel consultarFuncionarios() {
        String[] colunas = {"Nome", "Idade", "Cargo", "CPF"};
        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);

        List<Funcionario> listarFuncionarios = BarbeariaDAO.listarFuncionarios();
        for (int i = 0; i < listarFuncionarios.size(); i++) {
            Funcionario f = listarFuncionarios.get(i);
            String[] linhas = {
                f.getNome(),
                f.getIdade(),
                f.getCargo(),
                f.getCpf(),};
            tabela.addRow(linhas);
        }
        return tabela;
    }
    
    /*private DefaultTableModel pesquisarFuncionarios(String nome) {
        String[] colunas = {"Nome", "Idade", "Cargo", "CPF"};
        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);
        
        List<Funcionario> listarFuncionarios = BarbeariaDAO.buscarNomeBarbeiro(nome);
        for (int i = 0; i < listarFuncionarios.size(); i++) {
            Funcionario f = listarFuncionarios.get(i);
            String[] linhas = {
                f.getNome(),
                f.getIdade(),
                f.getCargo(),
                f.getCpf(),
                };
            tabela.addRow(linhas);
        }
        if(tabela.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum funcionário encontrado com esse nome", "!!!", JOptionPane.ERROR_MESSAGE);
        }
        return tabela;
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionarios;
    // End of variables declaration//GEN-END:variables
}
