
package views;

import model.Usuario;
public class Perfil extends javax.swing.JFrame {

    
    public Perfil() {
        
        initComponents();
        Usuario u = new Usuario();
       this.lb_ano.setText(u.getano_L());
       this.lb_cadeira.setText(u.getTrabalho());
       this.lb_casa.setText(u.getReside());
       this.lb_curso.setText(u.getCurso());
       this.lb_data.setText(u.getDatas());
       this.lb_turma.setText(u.getTurma());
       this.lb_turno.setText(u.getTurno());
       this.lb_nome.setText(u.getNome_Completo());
       this.lb_numero.setText(u.getN_estudante());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JPanel();
        lb_ano = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lb_data = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        lb_casa = new javax.swing.JLabel();
        lb_curso = new javax.swing.JLabel();
        lb_numero = new javax.swing.JLabel();
        lb_turma = new javax.swing.JLabel();
        lb_turno = new javax.swing.JLabel();
        lb_cadeira = new javax.swing.JLabel();
        btn_perfil = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_perfil3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(73, 147, 220));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setLayout(null);

        lb_ano.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_ano.setText("nome");
        dashboard.add(lb_ano);
        lb_ano.setBounds(440, 360, 180, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("DADOS DE ESTUDANTE");
        dashboard.add(jLabel4);
        jLabel4.setBounds(230, 220, 210, 36);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Curso:");
        dashboard.add(jLabel5);
        jLabel5.setBounds(10, 260, 60, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Cadeira :");
        dashboard.add(jLabel6);
        jLabel6.setBounds(340, 260, 90, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("N de Estudante :");
        dashboard.add(jLabel7);
        jLabel7.setBounds(10, 310, 130, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Turma:");
        dashboard.add(jLabel8);
        jLabel8.setBounds(10, 360, 60, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Turno :");
        dashboard.add(jLabel9);
        jLabel9.setBounds(340, 310, 60, 30);

        jLabel10.setBackground(new java.awt.Color(102, 102, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/assets/teach.png"))); // NOI18N
        jLabel10.setText("Foto");
        dashboard.add(jLabel10);
        jLabel10.setBounds(10, 20, 140, 150);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Ano letivo :");
        dashboard.add(jLabel11);
        jLabel11.setBounds(340, 360, 100, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Localização :");
        dashboard.add(jLabel12);
        jLabel12.setBounds(200, 120, 110, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Nome :");
        dashboard.add(jLabel13);
        jLabel13.setBounds(200, 30, 60, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Data :");
        dashboard.add(jLabel14);
        jLabel14.setBounds(200, 70, 50, 30);

        lb_data.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_data.setText("nome");
        dashboard.add(lb_data);
        lb_data.setBounds(260, 70, 290, 30);

        lb_nome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_nome.setText("nome");
        dashboard.add(lb_nome);
        lb_nome.setBounds(270, 30, 290, 30);

        lb_casa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_casa.setText("nome");
        dashboard.add(lb_casa);
        lb_casa.setBounds(310, 120, 290, 30);

        lb_curso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_curso.setText("nome");
        dashboard.add(lb_curso);
        lb_curso.setBounds(70, 260, 260, 30);

        lb_numero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_numero.setText("nome");
        dashboard.add(lb_numero);
        lb_numero.setBounds(140, 310, 180, 30);

        lb_turma.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_turma.setText("nome");
        dashboard.add(lb_turma);
        lb_turma.setBounds(70, 360, 180, 30);

        lb_turno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_turno.setText("nome");
        dashboard.add(lb_turno);
        lb_turno.setBounds(400, 310, 250, 30);

        lb_cadeira.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_cadeira.setText("nome");
        dashboard.add(lb_cadeira);
        lb_cadeira.setBounds(420, 260, 250, 30);

        getContentPane().add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 710, 400));

        btn_perfil.setBackground(new java.awt.Color(24, 67, 162));
        btn_perfil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_perfil.setForeground(new java.awt.Color(24, 67, 162));
        btn_perfil.setText("Agendas");
        btn_perfil.setBorder(null);
        btn_perfil.setBorderPainted(false);
        btn_perfil.setDefaultCapable(false);
        btn_perfil.setFocusable(false);
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });
        getContentPane().add(btn_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 40));

        btn_sair.setBackground(new java.awt.Color(24, 67, 162));
        btn_sair.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(24, 67, 162));
        btn_sair.setText("Sair");
        btn_sair.setBorder(null);
        btn_sair.setBorderPainted(false);
        btn_sair.setDefaultCapable(false);
        btn_sair.setFocusable(false);
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 140, 40));

        btn_perfil3.setBackground(new java.awt.Color(24, 67, 162));
        btn_perfil3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_perfil3.setForeground(new java.awt.Color(24, 67, 162));
        btn_perfil3.setText("Dashboard");
        btn_perfil3.setBorder(null);
        btn_perfil3.setBorderPainted(false);
        btn_perfil3.setDefaultCapable(false);
        btn_perfil3.setFocusable(false);
        btn_perfil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfil3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_perfil3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seja bem vindo, Nilton");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 170, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/assets/desktop-wallpaper-backgrounds-for-login-page-login-page.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_perfil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfil3ActionPerformed
        new Perfil().setVisible(true);
             dispose();
    }//GEN-LAST:event_btn_perfil3ActionPerformed

    private void btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfilActionPerformed
          new Agendas().setVisible(true);
             dispose();
    }//GEN-LAST:event_btn_perfilActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
       new Login().setVisible(true);
             dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Iniciar() {
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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_perfil;
    private javax.swing.JButton btn_perfil3;
    private javax.swing.JButton btn_sair;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_ano;
    private javax.swing.JLabel lb_cadeira;
    private javax.swing.JLabel lb_casa;
    private javax.swing.JLabel lb_curso;
    private javax.swing.JLabel lb_data;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_numero;
    private javax.swing.JLabel lb_turma;
    private javax.swing.JLabel lb_turno;
    // End of variables declaration//GEN-END:variables
}
