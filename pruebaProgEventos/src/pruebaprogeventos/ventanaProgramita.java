/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pruebaprogeventos;


import java.awt.Graphics;

/**
 *
 * @author rperc
 */
public class ventanaProgramita extends javax.swing.JFrame {
    int x2,y2;
    String pass = "";

    private void colorea() {
        etiqueta.setBackground(new java.awt.Color((byte) (jSlider1.getValue() + jSliderA.getValue()) + 128,(byte) (jSlider1.getValue() + jSliderB.getValue()) + 128,(byte) (jSlider1.getValue() + jSliderC.getValue()) + 128));
    }
    
    /**
     * Creates new form NewJFrame
     */
    public ventanaProgramita() {
        initComponents();
        initOverride();
    }

    private void initOverride() {
        //<editor-fold defaultstate="collapsed" desc=" Something something magick ">
        int anchoBlanco = 92;
        int trescuartos = ((getContentPane().getWidth() - anchoBlanco)/4)*3;
        blanco.setBounds(trescuartos, 10, anchoBlanco, 23);
        
        pack();
        getContentPane().setLayout(null);
        // </editor-fold> 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoB = new javax.swing.ButtonGroup();
        blanco = new javax.swing.JToggleButton();
        busca = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        etiqueta = new javax.swing.JLabel();
        jSliderA = new javax.swing.JSlider();
        jSliderB = new javax.swing.JSlider();
        jSliderC = new javax.swing.JSlider();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        passLabel = new javax.swing.JLabel();
        passColor = new javax.swing.JPasswordField();
        passBut = new javax.swing.JButton();
        canvas = new java.awt.Canvas();

        grupoB.add(jRadioButton1);
        grupoB.add(jRadioButton2);
        grupoB.add(jRadioButton3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pruebas de GUI");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blanco.setText("PintaBlanco");
        getContentPane().add(blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 93, -1));

        busca.setText("busca");
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });
        getContentPane().add(busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 60, -1));

        jButton1.setText("Botón");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 112, -1, -1));

        etiqueta.setBackground(new java.awt.Color(153, 255, 204));
        etiqueta.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setOpaque(true);
        getContentPane().add(etiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 50, 25));

        jSliderA.setMaximum(255);
        jSliderA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderAStateChanged(evt);
            }
        });
        getContentPane().add(jSliderA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, -1));

        jSliderB.setMaximum(255);
        jSliderB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderBStateChanged(evt);
            }
        });
        getContentPane().add(jSliderB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 80, -1));

        jSliderC.setMaximum(255);
        jSliderC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderCStateChanged(evt);
            }
        });
        getContentPane().add(jSliderC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 80, -1));

        jSlider1.setMaximum(255);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 94, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 0, 60, 32));

        jRadioButton1.setText("finico");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jRadioButton2.setText("gordaco");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 67, -1));

        jRadioButton3.setText("aleatorio");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 69, -1));

        passLabel.setFont(new java.awt.Font("Liberation Mono", 1, 8)); // NOI18N
        passLabel.setText("Escribe el password para color:");
        passLabel.setFocusable(false);
        getContentPane().add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

        passColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passColorActionPerformed(evt);
            }
        });
        getContentPane().add(passColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, -1));

        passBut.setText("este");
        passBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passButMouseClicked(evt);
            }
        });
        getContentPane().add(passBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 60, -1));
        getContentPane().add(canvas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //<editor-fold defaultstate="collapsed" desc=" Mi código para cuando se hace click ">
        
        int x = (int) (Math.random()*this.getWidth());
        int y = (int) (Math.random()*this.getHeight());
        
        jLabel1.setText(x+" , " +y);
        
        Graphics g = canvas.getGraphics();
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
        if (blanco.isSelected()) g2.setColor(java.awt.Color.white); else g2.setColor(java.awt.Color.black);
        
        if (pass.equals("color")) {
            jLabel1.setText("MaGiCk");
            g2.setColor(etiqueta.getBackground());
            g2.setPaintMode();
        }
        if (jRadioButton1.isSelected()) g2.setStroke(new java.awt.BasicStroke((float) 1));
        else
            if (jRadioButton2.isSelected()) {
                float stroke = (float) (this.getHeight()/2);
                g2.setStroke(new java.awt.BasicStroke(stroke));
            }
            else
                if (jRadioButton3.isSelected())
                {
                    float stroke = (float) (Math.random() * (this.getHeight()/10));
                    g2.setStroke(new java.awt.BasicStroke(stroke));
                }
        
        g2.drawLine(x2, y2, x, y);
        
        if (busca.isSelected()) {
            int a = (int) (Math.random()*(java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()));
            int b = (int) (Math.random()*(java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()));
            super.setLocation(a, b);
        }
        
        
        if (etiqueta.getText().equals("hola")) 
        {
            etiqueta.setText("");            
        }
        else  
        {
            etiqueta.setText("hola");     
            //etiqueta.setLocation(x, y);
        }
        x2 = x;
        y2 = y;
        
        // </editor-fold>
    }//GEN-LAST:event_jButton1MouseClicked
    
    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        colorea();
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSliderAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderAStateChanged
        colorea();
    }//GEN-LAST:event_jSliderAStateChanged

    private void jSliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderBStateChanged
        colorea();
    }//GEN-LAST:event_jSliderBStateChanged

    private void jSliderCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderCStateChanged
        colorea();
    }//GEN-LAST:event_jSliderCStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        canvas.setSize(this.getWidth(), this.getHeight());        
    }//GEN-LAST:event_formComponentResized

    private void passColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passColorActionPerformed

    private void passButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passButMouseClicked
        // TODO add your handling code here:
        pass = new String(passColor.getPassword());
        jLabel1.setText(pass);
    }//GEN-LAST:event_passButMouseClicked

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
            java.util.logging.Logger.getLogger(ventanaProgramita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaProgramita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaProgramita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaProgramita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaProgramita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton blanco;
    private javax.swing.JCheckBox busca;
    private java.awt.Canvas canvas;
    private javax.swing.JLabel etiqueta;
    private javax.swing.ButtonGroup grupoB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSliderA;
    private javax.swing.JSlider jSliderB;
    private javax.swing.JSlider jSliderC;
    private javax.swing.JButton passBut;
    private javax.swing.JPasswordField passColor;
    private javax.swing.JLabel passLabel;
    // End of variables declaration//GEN-END:variables
}