
package paquete;

public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public float primernumero;
    public float segundonumero;
    public String operador; 
    
    public Calculadora() {
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
        casilla = new javax.swing.JLabel();
        Numero1 = new javax.swing.JButton();
        BIN = new javax.swing.JButton();
        Numero2 = new javax.swing.JButton();
        Coma = new javax.swing.JButton();
        Numero0 = new javax.swing.JButton();
        Numero3 = new javax.swing.JButton();
        Numero7 = new javax.swing.JButton();
        Numero8 = new javax.swing.JButton();
        Numero9 = new javax.swing.JButton();
        Numero4 = new javax.swing.JButton();
        Numero5 = new javax.swing.JButton();
        Numero6 = new javax.swing.JButton();
        Sumar = new javax.swing.JButton();
        Restar = new javax.swing.JButton();
        Multiplicar = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Resultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        casilla.setBackground(new java.awt.Color(255, 255, 255));
        casilla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        casilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 3));
        casilla.setOpaque(true);

        Numero1.setBackground(new java.awt.Color(51, 153, 255));
        Numero1.setForeground(new java.awt.Color(255, 255, 255));
        Numero1.setText("1");
        Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero1ActionPerformed(evt);
            }
        });

        BIN.setBackground(new java.awt.Color(51, 153, 255));
        BIN.setForeground(new java.awt.Color(255, 255, 255));
        BIN.setText("BIN");
        BIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BINActionPerformed(evt);
            }
        });

        Numero2.setBackground(new java.awt.Color(51, 153, 255));
        Numero2.setForeground(new java.awt.Color(255, 255, 255));
        Numero2.setText("2");
        Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero2ActionPerformed(evt);
            }
        });

        Coma.setBackground(new java.awt.Color(51, 153, 255));
        Coma.setForeground(new java.awt.Color(255, 255, 255));
        Coma.setText(",");
        Coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComaActionPerformed(evt);
            }
        });

        Numero0.setBackground(new java.awt.Color(51, 153, 255));
        Numero0.setForeground(new java.awt.Color(255, 255, 255));
        Numero0.setText("0");
        Numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero0ActionPerformed(evt);
            }
        });

        Numero3.setBackground(new java.awt.Color(51, 153, 255));
        Numero3.setForeground(new java.awt.Color(255, 255, 255));
        Numero3.setText("3");
        Numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero3ActionPerformed(evt);
            }
        });

        Numero7.setBackground(new java.awt.Color(51, 153, 255));
        Numero7.setForeground(new java.awt.Color(255, 255, 255));
        Numero7.setText("7");
        Numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero7ActionPerformed(evt);
            }
        });

        Numero8.setBackground(new java.awt.Color(51, 153, 255));
        Numero8.setForeground(new java.awt.Color(255, 255, 255));
        Numero8.setText("8");
        Numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero8ActionPerformed(evt);
            }
        });

        Numero9.setBackground(new java.awt.Color(51, 153, 255));
        Numero9.setForeground(new java.awt.Color(255, 255, 255));
        Numero9.setText("9");
        Numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero9ActionPerformed(evt);
            }
        });

        Numero4.setBackground(new java.awt.Color(51, 153, 255));
        Numero4.setForeground(new java.awt.Color(255, 255, 255));
        Numero4.setText("4");
        Numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero4ActionPerformed(evt);
            }
        });

        Numero5.setBackground(new java.awt.Color(51, 153, 255));
        Numero5.setForeground(new java.awt.Color(255, 255, 255));
        Numero5.setText("5");
        Numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero5ActionPerformed(evt);
            }
        });

        Numero6.setBackground(new java.awt.Color(51, 153, 255));
        Numero6.setForeground(new java.awt.Color(255, 255, 255));
        Numero6.setText("6");
        Numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero6ActionPerformed(evt);
            }
        });

        Sumar.setBackground(new java.awt.Color(51, 153, 255));
        Sumar.setForeground(new java.awt.Color(255, 255, 255));
        Sumar.setText("+");
        Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarActionPerformed(evt);
            }
        });

        Restar.setBackground(new java.awt.Color(51, 153, 255));
        Restar.setForeground(new java.awt.Color(255, 255, 255));
        Restar.setText("-");
        Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarActionPerformed(evt);
            }
        });

        Multiplicar.setBackground(new java.awt.Color(51, 153, 255));
        Multiplicar.setForeground(new java.awt.Color(255, 255, 255));
        Multiplicar.setText("X");
        Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicarActionPerformed(evt);
            }
        });

        Dividir.setBackground(new java.awt.Color(51, 153, 255));
        Dividir.setForeground(new java.awt.Color(255, 255, 255));
        Dividir.setText(":");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });

        Borrar.setBackground(new java.awt.Color(51, 153, 255));
        Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Borrar.setText("CE");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Resultado.setBackground(new java.awt.Color(51, 153, 255));
        Resultado.setForeground(new java.awt.Color(255, 255, 255));
        Resultado.setText("=");
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(casilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Numero7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Numero1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BIN, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Coma, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Restar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(casilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Restar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Coma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BIN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero7ActionPerformed
       this.casilla.setText(this.casilla.getText()+"7");
    }//GEN-LAST:event_Numero7ActionPerformed

    private void Numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero0ActionPerformed
       this.casilla.setText(this.casilla.getText()+"0");
    }//GEN-LAST:event_Numero0ActionPerformed

    private void Numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero8ActionPerformed
       this.casilla.setText(this.casilla.getText()+"8");
    }//GEN-LAST:event_Numero8ActionPerformed

    private void Numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero9ActionPerformed
        this.casilla.setText(this.casilla.getText()+"9");
    }//GEN-LAST:event_Numero9ActionPerformed

    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed
        this.casilla.setText(this.casilla.getText()+"1");
    }//GEN-LAST:event_Numero1ActionPerformed

    private void Numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero2ActionPerformed
        this.casilla.setText(this.casilla.getText()+"2");
    }//GEN-LAST:event_Numero2ActionPerformed

    private void Numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero3ActionPerformed
        this.casilla.setText(this.casilla.getText()+"3");
    }//GEN-LAST:event_Numero3ActionPerformed

    private void Numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero4ActionPerformed
        this.casilla.setText(this.casilla.getText()+"4");
    }//GEN-LAST:event_Numero4ActionPerformed

    private void Numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero5ActionPerformed
        this.casilla.setText(this.casilla.getText()+"5");
    }//GEN-LAST:event_Numero5ActionPerformed

    private void Numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero6ActionPerformed
        this.casilla.setText(this.casilla.getText()+"6");
    }//GEN-LAST:event_Numero6ActionPerformed

    /**
     * ------ FUNCION ENTERO ------
     * FUNCION PARA QUE CUANDO SE ENTERO SIN DECIMAL NO SE MUERTRE CON EL 0.0---
     * @param resultado
     * @return retorno 
     */
    public String entero(float resultado){
        String retorno="";
        retorno=Float.toString(resultado);
        if (resultado%1==0){
            retorno=retorno.substring(0,retorno.length()-2);
        }
        return retorno;
    }
    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        this.casilla.setText("");
    }//GEN-LAST:event_BorrarActionPerformed

    private void SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarActionPerformed
        this.primernumero=Float.parseFloat(this.casilla.getText());
        this.operador="+";
        this.casilla.setText("");
        
    }//GEN-LAST:event_SumarActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        this.segundonumero=Float.parseFloat(this.casilla.getText());
        
        /**
         * -------SWICH CON DIFERENTES OPERACIONES ----- 
         * Aqui utilizamos la funcion entero para saber si es un entero o un decimal y como mostralo en casilla
         * -------DIVISION -------
         * Hay que especificar que no se puede dividir un numero entre 0, ya que java lo reconoce como infinito
         * Esto lo solucionamos con el if else que compruebe si se cumpleo o no la condicion 
         */
        switch (this.operador){
            case "+":this.casilla.setText(entero(this.primernumero+this.segundonumero));break;
            case "-":this.casilla.setText(entero(this.primernumero-this.segundonumero));break;
            case "x":this.casilla.setText(entero(this.primernumero*this.segundonumero));break;
            case ":":if (this.segundonumero==0){ this.casilla.setText("No se divide entre 0" );
            }
            else{   
                this.casilla.setText(entero(this.primernumero/this.segundonumero));};break;
        }
            
    }//GEN-LAST:event_ResultadoActionPerformed

    private void RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarActionPerformed
        this.primernumero=Float.parseFloat(this.casilla.getText());
        this.operador="-";
        this.casilla.setText("");
    }//GEN-LAST:event_RestarActionPerformed

    private void MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicarActionPerformed
        this.primernumero=Float.parseFloat(this.casilla.getText());
        this.operador="x";
        this.casilla.setText("");
    }//GEN-LAST:event_MultiplicarActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        this.primernumero=Float.parseFloat(this.casilla.getText());
        this.operador=":";
        this.casilla.setText("");        
    }//GEN-LAST:event_DividirActionPerformed

    private void ComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComaActionPerformed
        if (!this.casilla.getText().contains(".")){
            this.casilla.setText(this.casilla.getText()+".");
            
        }
    }//GEN-LAST:event_ComaActionPerformed

    private void BINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BINActionPerformed
        this.primernumero=Float.parseFloat(this.casilla.getText());
        int Convertir = (int)this.primernumero;
        String binario=Integer.toBinaryString(Convertir);
        this.casilla.setText(binario);
        
    }//GEN-LAST:event_BINActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BIN;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Coma;
    private javax.swing.JButton Dividir;
    private javax.swing.JButton Multiplicar;
    private javax.swing.JButton Numero0;
    private javax.swing.JButton Numero1;
    private javax.swing.JButton Numero2;
    private javax.swing.JButton Numero3;
    private javax.swing.JButton Numero4;
    private javax.swing.JButton Numero5;
    private javax.swing.JButton Numero6;
    private javax.swing.JButton Numero7;
    private javax.swing.JButton Numero8;
    private javax.swing.JButton Numero9;
    private javax.swing.JButton Restar;
    private javax.swing.JButton Resultado;
    private javax.swing.JButton Sumar;
    private javax.swing.JLabel casilla;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
