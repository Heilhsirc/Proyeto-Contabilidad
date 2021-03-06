
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUANS
 */
public class PanelCRUD extends javax.swing.JFrame {

    /**
     * Creates new form PanelCRUD
     */
    public PanelCRUD() {
        initComponents();
        
        cNombre.setVisible(false);
        cID.setVisible(false);
        cPresentacion.setVisible(false);
        cDistri.setVisible(false);

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
        consultar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        cNombre = new javax.swing.JButton();
        cID = new javax.swing.JButton();
        cDistri = new javax.swing.JButton();
        cPresentacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 1200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        consultar.setText("CONSULTAR");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        actualizar.setText("ACTUALIZAR");
        jPanel1.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        borrar.setText("BORRAR");
        jPanel1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        crear.setText("CREAR");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        jPanel1.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        cNombre.setText("Consulta por nombre");
        jPanel1.add(cNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        cID.setText("Consulta por ID");
        jPanel1.add(cID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        cDistri.setText("Distribuidora");
        jPanel1.add(cDistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        cPresentacion.setText("Presentacion");
        jPanel1.add(cPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 607, 289));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("CRUD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        //Esconde los botones principales
        crear.setVisible(false);
        consultar.setVisible(false);
        actualizar.setVisible(false);
        borrar.setVisible(false);
        //Solicita los datos para el registro
        String dato=JOptionPane.showInputDialog(null,"ID paquete");
        String dato2=JOptionPane.showInputDialog(null,"Distribuidora");
        String dato3=JOptionPane.showInputDialog(null,"Presentacion");
        String dato4=JOptionPane.showInputDialog(null,"Nombre producto");
        
        System.out.println(dato+dato2+dato3+dato4);
        
 

    }//GEN-LAST:event_crearActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        //Esconde los botones principales
        crear.setVisible(false);
        consultar.setVisible(false);
        actualizar.setVisible(false);
        borrar.setVisible(false);
        //Muestra los botones para el tipo de consulta
        cNombre.setVisible(true);
        cID.setVisible(true);
        cPresentacion.setVisible(true);
        cDistri.setVisible(true);
        
        
     

    }//GEN-LAST:event_consultarActionPerformed

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
            java.util.logging.Logger.getLogger(PanelCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cDistri;
    private javax.swing.JButton cID;
    private javax.swing.JButton cNombre;
    private javax.swing.JButton cPresentacion;
    private javax.swing.JButton consultar;
    private javax.swing.JButton crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
