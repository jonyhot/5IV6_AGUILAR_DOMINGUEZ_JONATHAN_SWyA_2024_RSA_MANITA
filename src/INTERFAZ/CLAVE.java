/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFAZ;

/**
 *
 * @author JONATHAN
 */
public class CLAVE extends javax.swing.JFrame {

    /**
     * Creates new form CLAVE
     */
    private String txt;
    public CLAVE() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn512 = new javax.swing.JButton();
        btn1024 = new javax.swing.JButton();
        btn2048 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(153, 255, 204));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" PARA CIFRAR ?");

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿ QUÉ TAMAÑO DE CLAVE DESEA");

        btn512.setBackground(new java.awt.Color(0, 102, 204));
        btn512.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn512.setForeground(new java.awt.Color(255, 255, 255));
        btn512.setText("512");
        btn512.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn512ActionPerformed(evt);
            }
        });

        btn1024.setBackground(new java.awt.Color(0, 102, 204));
        btn1024.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1024.setForeground(new java.awt.Color(255, 255, 255));
        btn1024.setText("1024");
        btn1024.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1024ActionPerformed(evt);
            }
        });

        btn2048.setBackground(new java.awt.Color(0, 102, 204));
        btn2048.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn2048.setForeground(new java.awt.Color(255, 255, 255));
        btn2048.setText("2048");
        btn2048.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2048ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn2048)
                    .addComponent(btn1024)
                    .addComponent(btn512, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(98, 98, 98)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(btn512)
                .addGap(39, 39, 39)
                .addComponent(btn1024)
                .addGap(37, 37, 37)
                .addComponent(btn2048)
                .addContainerGap(38, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setTexto(String txt){
        this.txt = txt;
    }
    private void btn512ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn512ActionPerformed
        resultado res = new resultado();
        res.setLLave(512, txt);
        res.setVisible(true);
        res.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn512ActionPerformed

    private void btn1024ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1024ActionPerformed
        resultado res = new resultado();
        res.setLLave(1024, txt);
        res.setVisible(true);
        res.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn1024ActionPerformed

    private void btn2048ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2048ActionPerformed
        resultado res = new resultado();
        res.setLLave(2048, txt);
        res.setVisible(true);
        res.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn2048ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1024;
    private javax.swing.JButton btn2048;
    private javax.swing.JButton btn512;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
