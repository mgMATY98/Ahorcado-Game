/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public final class Juego extends javax.swing.JFrame {

    int contar = 0;
    static char[] LetrasVec;
    List<String> lala = new ArrayList<>();
    static String PCompleta;
    ImageIcon Ahorcado = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AhorcadoJuego\\src\\Imagenes\\Ahorcado.png");
    ImageIcon BIzq = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AhorcadoJuego\\src\\Imagenes\\BIzq-removebg.png");
    ImageIcon BDer = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AhorcadoJuego\\src\\Imagenes\\BrazoDer-removebg.png");
    ImageIcon Cabeza = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AhorcadoJuego\\src\\Imagenes\\Cabeza-removebg.png");
    ImageIcon Completo = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AhorcadoJuego\\src\\Imagenes\\Completo.png");
    ImageIcon Cuerpo = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AhorcadoJuego\\src\\Imagenes\\Cuerpo-removebg.png");
    ImageIcon PIzq = new ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AhorcadoJuego\\src\\Imagenes\\PIzq-removebg.png");

    /**
     * Creates new form Juego
     */
    public Juego() throws IOException {
        initComponents();
        Scanner scan = new Scanner(System.in);
        PalabrasU.setBackground(new java.awt.Color(0, 0, 0, 1));
        Ingresar.setBackground(new java.awt.Color(0, 0, 0, 1));
        obtenerPalabra(Palabra);
        System.out.println(PCompleta);
    }

    static void obtenerPalabra(JTextField Palabra) throws IOException {
        PCompleta = getPalabraSecreta();
        LetrasVec = new char[PCompleta.length()];
        Palabra.setText(PalabrasAGuiones(LetrasVec));
    }

    static String getPalabraSecreta() throws IOException {
        List<String> pala = Files.readAllLines(Paths.get("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\AhorcadoJuego\\src\\Texto\\spanish.txt")); // creo un vector de palabras
        Random r = new Random();
        String Palabra = pala.get(r.nextInt(pala.size())); // selecciono una palabra random y me lo guardo en Palabra
        return Palabra;
    }

    static String PalabrasAGuiones(char[] LetrasVec) {
        String guion = "";
        for (int j = 0; j < LetrasVec.length; j++) {
            guion = "_" + guion;
        }
        return guion;
    }

    static class PanelGradient extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            Color color1 = new Color(139, 69, 19);
            Color color2 = new Color(70, 130, 180);
            GradientPaint gp = new GradientPaint(0, 0, color2, 0, height * 0.6f, color1);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
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

        jPanel1 = new PanelGradient();
        LabelImagen = new javax.swing.JLabel();
        Ingresar = new javax.swing.JTextField();
        Palabra = new javax.swing.JTextField();
        Letra = new javax.swing.JTextField();
        BtnConfirmar = new javax.swing.JButton();
        CancelarJuego = new javax.swing.JButton();
        Usadas = new javax.swing.JTextField();
        PalabrasU = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Horca-removebg-preview.png"))); // NOI18N

        Ingresar.setEditable(false);
        Ingresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Ingresar.setText("Ingrese una letra:");
        Ingresar.setBorder(null);
        Ingresar.setOpaque(false);

        Palabra.setEditable(false);
        Palabra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalabraActionPerformed(evt);
            }
        });

        BtnConfirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnConfirmarMouseClicked(evt);
            }
        });

        CancelarJuego.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CancelarJuego.setText("Cancelar");
        CancelarJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarJuegoMouseClicked(evt);
            }
        });
        CancelarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarJuegoActionPerformed(evt);
            }
        });

        Usadas.setEditable(false);
        Usadas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        PalabrasU.setEditable(false);
        PalabrasU.setBackground(new java.awt.Color(255, 255, 255));
        PalabrasU.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PalabrasU.setText("Palabras usadas:");
        PalabrasU.setBorder(null);
        PalabrasU.setOpaque(false);
        PalabrasU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalabrasUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LabelImagen)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Usadas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Palabra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CancelarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PalabrasU, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(PalabrasU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usadas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(Palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnConfirmar)
                    .addComponent(CancelarJuego))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PalabraActionPerformed

    private void BtnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConfirmarMouseClicked
        String letraStr = Letra.getText().trim(); // Obtener la letra como String
        if (esVacio(letraStr)) {  // Método para verificar si el campo es vacío
            return;
        }
        char letra = letraStr.charAt(0); // Obtener el primer carácter
        Letra.setText(""); // Limpiar el campo de texto Letra

        // Convertir el texto actual en un array de caracteres
        char[] textoVector = Palabra.getText().toCharArray();

        boolean letraEncontrada = false;
        for (int j = 0; j < PCompleta.length(); j++) {
            if (PCompleta.charAt(j) == letra) {
                textoVector[j] = letra; // Reemplazar guion bajo con la letra si coincide
                letraEncontrada = true;
            }
        }

        // Mostrar un mensaje si la letra no se encuentra en la palabra completa
        if (!letraEncontrada) {
            if (!lala.contains(String.valueOf(letra))) {
                lala.add(String.valueOf(letra)); // Agregar la letra a la lista de usadas
            }
            // Actualizar el JTextField Usadas con las letras usadas
            StringBuilder usadasBuilder = new StringBuilder();
            lala.stream().forEach((letraUsada) -> {
                usadasBuilder.append(letraUsada).append(' '); // Agregar letras usadas separadas por espacio
            });
            Usadas.setText(usadasBuilder.toString().trim());

            // Actualizar la imagen del ahorcado según el número de intentos
            switch (contar) {
                case 0:
                    LabelImagen.setIcon(Cabeza);
                    contar++;
                    break;
                case 1:
                    LabelImagen.setIcon(Cuerpo);
                    contar++;
                    break;
                case 2:
                    LabelImagen.setIcon(BIzq);
                    contar++;
                    break;
                case 3:
                    LabelImagen.setIcon(BDer);
                    contar++;
                    break;
                case 4:
                    LabelImagen.setIcon(PIzq);
                    contar++;
                    break;
                case 5:
                    LabelImagen.setIcon(Completo);
                    contar++;
                    JOptionPane.showMessageDialog(null, "Cuidado solo te queda 1 oportunidad");
                    break;
                case 6:
                    LabelImagen.setIcon(Ahorcado);
                    contar++;
                    JOptionPane.showMessageDialog(null, "Perdiste, la palabra era " + PCompleta + " ,inténtalo de nuevo");
                    System.exit(0);
                    break;
            }
        } else {
            // Si no hay guiones en el textoVector, significa que el usuario ha ganado
            if (!hayGuiones(textoVector)) {
                JOptionPane.showMessageDialog(null, "Ganaste, felicidades");
            }
        }

        // Actualizar el texto en el JTextField Palabra
        Palabra.setText(new String(textoVector).trim());


    }//GEN-LAST:event_BtnConfirmarMouseClicked

    private void CancelarJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarJuegoMouseClicked

        MenuInicio j = new MenuInicio();
        j.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_CancelarJuegoMouseClicked

    private void CancelarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarJuegoActionPerformed

    private void PalabrasUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabrasUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PalabrasUActionPerformed
    static boolean esVacio(String letraStr) {
        if (letraStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una letra válida");
            return true;
        }
        return false;
    }

    static boolean hayGuiones(char[] textoVector) {
        for (char c : textoVector) {
            if (c == '_') {
                return true; // Hay al menos un guion bajo
            }
        }
        return false; // No hay guiones bajos
    }

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
            java.util.logging.Logger.getLogger(Juego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Juego().setVisible(true);
                
            } catch (IOException ex) {
                Logger.getLogger(Juego.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton CancelarJuego;
    public javax.swing.JTextField Ingresar;
    private javax.swing.JLabel LabelImagen;
    public javax.swing.JTextField Letra;
    public javax.swing.JTextField Palabra;
    public javax.swing.JTextField PalabrasU;
    private javax.swing.JTextField Usadas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
