
package calculator;

import java.awt.Color;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class calculator extends javax.swing.JFrame {

ScriptEngineManager sem = new ScriptEngineManager(); //es un modo que ayuda a hacer las operaciones 
ScriptEngine se = sem.getEngineByName("JavaScript");

    public calculator() {
        initComponents();
        setLocationRelativeTo(null); //mantiene la ventana de la calculadora centrada 
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_8 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_borrauno = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_ce = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JLabel();
        btn_cambio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();

        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(26, 89, 124));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_8.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorderPainted(false);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 100, 100));

        btn_4.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorderPainted(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 100, 100));

        btn_5.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorderPainted(false);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 100, 100));

        btn_6.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorderPainted(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 100, 100));

        btn_7.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorderPainted(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 100, 100));

        btn_9.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorderPainted(false);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 100, 100));

        btn_0.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorderPainted(false);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 100, 100));

        btn_borrauno.setBackground(new java.awt.Color(204, 204, 204));
        btn_borrauno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/borrar.png"))); // NOI18N
        btn_borrauno.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_borrauno.setInheritsPopupMenu(true);
        btn_borrauno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borraunoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrauno, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 130, 80));

        btn_resta.setBackground(new java.awt.Color(204, 204, 204));
        btn_resta.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/menos-contorno.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 130, 80));

        btn_ce.setBackground(new java.awt.Color(204, 204, 204));
        btn_ce.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_ce.setText("CE");
        btn_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 130, 80));

        btn_punto.setBackground(new java.awt.Color(204, 204, 204));
        btn_punto.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/circulo-negro.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 130, 80));

        btn_igual.setBackground(new java.awt.Color(204, 204, 204));
        btn_igual.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/igual.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 130, 80));

        btn_division.setBackground(new java.awt.Color(204, 204, 204));
        btn_division.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/division.png"))); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 130, 80));

        btn_suma.setBackground(new java.awt.Color(204, 204, 204));
        btn_suma.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/mas.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 130, 80));

        btn_multiplicacion.setBackground(new java.awt.Color(204, 204, 204));
        btn_multiplicacion.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btn_multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/ha-fallado.png"))); // NOI18N
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 130, 80));

        jPanel1.setBackground(new java.awt.Color(219, 247, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 480, 50));

        txtOperacion.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 440, 43));

        btn_cambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_switch_modonormal.png"))); // NOI18N
        btn_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 110, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 20));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1000, 150));

        btn_3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorderPainted(false);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 100, 100));

        btn_2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorderPainted(false);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 100, 100));

        btn_1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_1.setBorderPainted(false);
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/imagenes/btn_numeros_2.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 100, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
         anadirnumero("-");
             
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_ceActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        anadirnumero(".");
            //btn_igual.doClick(); //sirve para que cada vez que se precione lo vaya evaludando en la operacion con el metodo creado
    }//GEN-LAST:event_btn_puntoActionPerformed
    
    
    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
      try{
        String resultado = se.eval(txtOperacion.getText()).toString();
        txtResultado.setText(resultado);
      }catch (Exception e){
          //txtOperacion.setText("SyntaxError");
      }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
         anadirnumero("/");
             
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        anadirnumero("+");
           
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
         anadirnumero("*");
            
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
       anadirnumero("1");
           //btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    boolean mododaltonico = false;
    private void btn_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambioActionPerformed
        if(!mododaltonico){
        
        jPanel1.setBackground(Color.decode("#b5b5b5"));
        jPanel2.setBackground(Color.decode("#ffffff"));
        txtOperacion.setForeground(Color.decode("#0e0e0e"));
        txtResultado.setForeground(Color.decode("#0e0e0e"));
       
  
       cambiarColorBtn2(btn_1);
        cambiarColorBtn2(btn_2);
         cambiarColorBtn2(btn_3);
          cambiarColorBtn2(btn_4);
           cambiarColorBtn2(btn_5);
            cambiarColorBtn2(btn_6);
             cambiarColorBtn2(btn_7);
              cambiarColorBtn2(btn_8);
               cambiarColorBtn2(btn_9);
                cambiarColorBtn2(btn_0);
                btn_cambio.setIcon(new ImageIcon(getClass().getResource("/images_oscuro/porfavor.png")));
                mododaltonico = true;  
        }else{
        calculator frame = new calculator();
        this.dispose();
        frame.setVisible(true);
        }
    }//GEN-LAST:event_btn_cambioActionPerformed

    
    private void btn_borraunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borraunoActionPerformed
   String texto =txtOperacion.getText().substring(0,txtOperacion.getText().length()-1); //se dice con la variable txtOperacion que empieze a borrar desde 0 hasta el ultimo digito
        txtOperacion.setText(texto);   
        //btn_igual.doClick();
    }//GEN-LAST:event_btn_borraunoActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
      anadirnumero("7");
          //btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
         anadirnumero("2");
             //btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
         anadirnumero("3");
             //btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
         anadirnumero("4");
             //btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        anadirnumero("5");
            //btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
       anadirnumero("6");
           //btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
         anadirnumero("8");
             //btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        anadirnumero("9");
            //btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
         anadirnumero("0");
             //btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }
    public void cambiarColorBtn2(JButton btn){
    btn.setIcon(new ImageIcon(getClass().getResource("/images_oscuro/btn_gris_original.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images_oscuro/btn_cambio_gris.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images_oscuro/btn_cambio_gris.png"))); 
        btn.setForeground(Color.decode("#0e0e0e"));  
    }
  

    public void anadirnumero(String digito){ //metodo que se llama para cuando se presiona cada boton y añade a el txtdeOperacion el digito que se precione
         txtOperacion.setText(txtOperacion.getText()+digito);   
   
    }
         
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_borrauno;
    private javax.swing.JButton btn_cambio;
    private javax.swing.JButton btn_ce;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables

    private void btn_cambio(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
