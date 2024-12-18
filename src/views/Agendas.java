/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;

/**
 *
 * @author JorgeDevs
 */
public class Agendas extends javax.swing.JFrame {
      
     
      
    
    public Agendas() {
        initComponents();
       // DefaultTableModel tb = (DefaultTableModel) agenda_tabela.getModel();    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        agenda_tabela = new javax.swing.JTable();
        semana = new javax.swing.JTextField();
        ver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        atividades = new javax.swing.JTextArea();
        linha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        data_d = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        adds = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        remove_l = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(73, 147, 220));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setLayout(null);

        agenda_tabela.setForeground(new java.awt.Color(24, 67, 162));
        agenda_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Segunda", "23/12/2024", "07:30", "Aula de calculo numerico"},
                {"Segunda", "23/12/2024", "14:30", "trabalho"},
                {"Terça", "24/12/2024", "17:30", "Ginásio"},
                {"Terça", "24/12/2024", "22:00", null}
            },
            new String [] {
                "Semana", "Data", "Hora", "Atividade"
            }
        ));
        agenda_tabela.setColumnSelectionAllowed(true);
        agenda_tabela.setGridColor(new java.awt.Color(102, 51, 255));
        agenda_tabela.setName(""); // NOI18N
        agenda_tabela.setRowHeight(20);
        agenda_tabela.setRowMargin(10);
        agenda_tabela.setSelectionForeground(new java.awt.Color(102, 102, 255));
        agenda_tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        agenda_tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agenda_tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(agenda_tabela);
        agenda_tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        dashboard.add(jScrollPane1);
        jScrollPane1.setBounds(330, 80, 470, 290);
        dashboard.add(semana);
        semana.setBounds(20, 110, 210, 30);

        ver.setText("Visualizar");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        dashboard.add(ver);
        ver.setBounds(680, 380, 110, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("dd /mm /nn ");
        dashboard.add(jLabel4);
        jLabel4.setBounds(110, 150, 100, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("AGENDAMENTO DE ATIVIDADE");
        dashboard.add(jLabel5);
        jLabel5.setBounds(210, 20, 390, 40);

        atividades.setColumns(20);
        atividades.setRows(5);
        jScrollPane2.setViewportView(atividades);

        dashboard.add(jScrollPane2);
        jScrollPane2.setBounds(10, 260, 310, 100);

        linha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        linha.setEnabled(false);
        dashboard.add(linha);
        linha.setBounds(480, 380, 50, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Seleciona a linha");
        dashboard.add(jLabel6);
        jLabel6.setBounds(340, 380, 140, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Hora");
        dashboard.add(jLabel7);
        jLabel7.setBounds(20, 150, 50, 20);
        dashboard.add(data_d);
        data_d.setBounds(110, 180, 120, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Atividade");
        dashboard.add(jLabel8);
        jLabel8.setBounds(20, 230, 90, 20);

        adds.setText("Adicionar");
        adds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsActionPerformed(evt);
            }
        });
        dashboard.add(adds);
        adds.setBounds(10, 370, 110, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Semana");
        dashboard.add(jLabel9);
        jLabel9.setBounds(20, 80, 90, 20);
        dashboard.add(hora);
        hora.setBounds(20, 180, 70, 30);

        remove_l.setText("Remover");
        remove_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_lActionPerformed(evt);
            }
        });
        dashboard.add(remove_l);
        remove_l.setBounds(550, 380, 110, 30);

        getContentPane().add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 810, 420));

        btn_exit.setForeground(new java.awt.Color(24, 67, 162));
        btn_exit.setText("Volta");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/assets/desktop-wallpaper-backgrounds-for-login-page-login-page.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agenda_tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agenda_tabelaMouseClicked
        int linha_s = this.agenda_tabela.getSelectedRow();
        Object linha_c = linha_s;
        this.linha.setText(linha_c.toString());
    }//GEN-LAST:event_agenda_tabelaMouseClicked

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
           new Perfil().setVisible(true);
             dispose();      
    }//GEN-LAST:event_btn_exitActionPerformed

      @SuppressWarnings("empty-statement")
    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
         DefaultTableModel tb = (DefaultTableModel) this.agenda_tabela.getModel(); 
       
       JOptionPane.showMessageDialog(null, this.agenda_tabela.getValueAt(this.agenda_tabela.getSelectedRow(), this.agenda_tabela.getSelectedColumn()));
     
    }//GEN-LAST:event_verActionPerformed

    private void addsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tb = (DefaultTableModel) this.agenda_tabela.getModel();    

      
      Object[] lista_dados = {semana.getText().toUpperCase(),hora.getText(),data_d.getText(),atividades.getText().toUpperCase()};
      
     tb.addRow(lista_dados);
     
     semana.setText(null);
     hora.setText(null);
     data_d.setText(null);
     atividades.setText(null);
     
    }//GEN-LAST:event_addsActionPerformed

    private void remove_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_lActionPerformed
        if(this.agenda_tabela.getSelectedRow() != -1){
            DefaultTableModel tb = (DefaultTableModel) this.agenda_tabela.getModel(); 
            tb.removeRow(this.agenda_tabela.getSelectedRow());
       }else{
           JOptionPane.showMessageDialog(null, "Selecione um linha para excluir");
       }
    }//GEN-LAST:event_remove_lActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adds;
    private javax.swing.JTable agenda_tabela;
    private javax.swing.JTextArea atividades;
    private javax.swing.JButton btn_exit;
    private javax.swing.JPanel dashboard;
    private javax.swing.JTextField data_d;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField linha;
    private javax.swing.JButton remove_l;
    private javax.swing.JTextField semana;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
