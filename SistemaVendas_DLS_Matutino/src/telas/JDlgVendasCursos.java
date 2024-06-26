/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import bean.Cursos;
import bean.Vendas;
import bean.Vendascursos;
import bean.VendascursosId;
import dao.CursosDAO;
import dao.VendasCursosDAO;
import dao.VendasDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author Daniel Lopes
 */
public class JDlgVendasCursos extends javax.swing.JDialog {

    private CursosDAO cursosDAO = new CursosDAO();
    private VendasCursosDAO vendasCursosDAO = new VendasCursosDAO();
    private JDlgVendas jDlgVendas;
    private JDlgVendasCursos vendasCursos;
    private int codigoVenda;
    private boolean incluirCursos;
    private ArrayList<Cursos> listaCursos = cursosDAO.listAll();
    private Util util = new Util();

    //private int codVendasCursos;
    /**
     * Creates new form JDlgVendasCursos
     */
    public JDlgVendasCursos(java.awt.Frame parent, boolean modal, boolean incluirCursos, Cursos cursos, int codVendasCursos) {
        super(parent, modal);
        initComponents();
        this.incluirCursos = incluirCursos;
        setLocationRelativeTo(null);
        util.habilitarNovo(false, jTxtTotal, jTxtValoUnitario);

        if (incluirCursos) {

            jCboCursos.removeAllItems();
            for (Cursos C : listaCursos) {
                jCboCursos.addItem(C);
            }
        } else {
            jCboCursos.addItem(cursos);
        }

        //this.codVendasCursos  = codVendasCursos;
    }

    public void setTelaAnterior(JDlgVendas vendas, int codigo) {
        this.jDlgVendas = vendas;
        this.codigoVenda = codigo;

        if (incluirCursos) {
            for (int i = 0; i < vendas.vendasCursosPesquisa.getRowCount(); i++) {
                for (int j = 0; j < listaCursos.size(); j++) {
                    if (vendas.vendasCursosPesquisa.getRowCount() > 0) {
                        if ((vendas.vendasCursosPesquisa.getRegistro(i)).getCursos().getIdcursos() == (listaCursos.get(j)).getIdcursos()) {
                            listaCursos.remove(listaCursos.get(j));
                        }
                    }
                }
            }
            jCboCursos.removeAllItems();
            for (Cursos C : listaCursos) {
            jCboCursos.addItem(C);
        }
    }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnOk = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCboCursos = new javax.swing.JComboBox<Cursos>();
        jLabel2 = new javax.swing.JLabel();
        jTxtQuantModulos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtValoUnitario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/check_mark.png"))); // NOI18N
        jBtnOk.setText("OK");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnOk);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cross.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar);

        jLabel1.setText("Cursos");

        jCboCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboCursosActionPerformed(evt);
            }
        });

        jLabel2.setText("Quant Modulos");

        jTxtQuantModulos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtQuantModulosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtQuantModulosFocusLost(evt);
            }
        });

        jLabel3.setText("Valor unitário");

        jTxtValoUnitario.setText("0.0");

        jLabel4.setText("Total");

        jTxtTotal.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCboCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTxtQuantModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtValoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCboCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtQuantModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtValoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        // TODO add your handling code here
        Vendascursos vendasCursos = new Vendascursos();
        VendascursosId vendascursosid = new VendascursosId();
        vendascursosid.setIdvendas(codigoVenda);
        vendascursosid.setCurso(((Cursos)jCboCursos.getSelectedItem()).getIdcursos());
        
        vendasCursos.setCursos((Cursos) jCboCursos.getSelectedItem());
        vendasCursos.setValorUnitario(util.strDouble(jTxtValoUnitario.getText()));
        vendasCursos.setTotal(util.strDouble(jTxtTotal.getText()));
        vendasCursos.setId(vendascursosid);
        vendasCursos.setQuantidadeModulos(util.strInt(jTxtQuantModulos.getText()));

        if (incluirCursos) {
            //List lista = vendasCursosDAO.listAll();
            //this.codVendasCursos  = lista.size();

            //vendasCursos.setIdVendasCursos(this.codVendasCursos + 1);
            //vendasCursosDAO.insert(vendasCursos);
            jDlgVendas.vendasCursosPesquisa.addList(vendasCursos);
            
            if(jDlgVendas.listaExcluir.contains(vendasCursos)){
                jDlgVendas.listaExcluir.remove(vendasCursos);
                jDlgVendas.listaAtualizar.add(vendasCursos);
            }else{
                jDlgVendas.listaInseir.add(vendasCursos);
            }
            jDlgVendas.teste();
        } else {

            //vendasCursos.setIdVendasCursos(this.codVendasCursos);
            //vendasCursosDAO.update(vendasCursos);
            jDlgVendas.vendasCursosPesquisa.updateList(vendasCursos);
        }

        Double total = 0.0;
        for (int i = 0; i < jDlgVendas.vendasCursosPesquisa.getRowCount(); i++) {
            total += (jDlgVendas.vendasCursosPesquisa.getRegistro(i)).getTotal();
        }
        jDlgVendas.vendasTotal(total);

        setVisible(false);
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtQuantModulosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtQuantModulosFocusLost
        // TODO add your handling code here:
        jTxtQuantModulos.setBackground(java.awt.Color.white);
        if (util.strInt(jTxtQuantModulos.getText()) < 0 || util.strInt(jTxtQuantModulos.getText()) > ((Cursos) jCboCursos.getSelectedItem()).getModulos()) {
            util.mostrar("A quantidade de modulos carece ou excede a quantidade de modulos do curso selecionado");
            jTxtQuantModulos.setText(util.intStr(((Cursos) jCboCursos.getSelectedItem()).getModulos()));
        } else {
            jTxtTotal.setText(util.doubleStr(util.strDouble(jTxtValoUnitario.getText()) * util.strInt(jTxtQuantModulos.getText())));
        }


    }//GEN-LAST:event_jTxtQuantModulosFocusLost

    private void jTxtQuantModulosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtQuantModulosFocusGained
        // TODO add your handling code here:
        jTxtQuantModulos.setBackground(new java.awt.Color(64, 224, 208));
    }//GEN-LAST:event_jTxtQuantModulosFocusGained

    private void jCboCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboCursosActionPerformed
        // TODO add your handling code here:
        if (jCboCursos.getSelectedIndex() != -1) {
            int modulos = ((Cursos) jCboCursos.getSelectedItem()).getModulos();
            double valorUnitario = ((Cursos) jCboCursos.getSelectedItem()).getValorUnitario();
            jTxtQuantModulos.setText(util.intStr(modulos));
            jTxtValoUnitario.setText(util.doubleStr(valorUnitario));
            jTxtTotal.setText(util.doubleStr(util.strDouble(jTxtValoUnitario.getText()) * util.strInt(jTxtQuantModulos.getText())));

        }
    }//GEN-LAST:event_jCboCursosActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendasCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendasCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendasCursos dialog = new JDlgVendasCursos(new javax.swing.JFrame(), true, true, null, 0);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JComboBox<Cursos> jCboCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtQuantModulos;
    private javax.swing.JTextField jTxtTotal;
    private javax.swing.JTextField jTxtValoUnitario;
    // End of variables declaration//GEN-END:variables
}
