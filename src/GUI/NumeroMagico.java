/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CodigosDeFuncionamiento.*;
import static java.lang.Thread.MIN_PRIORITY;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;


/**
 * Ventana del juego n�mero m�gico
 * 
 * @author Rafael Navarro Prieto
 * @version 1.0
 */
public class NumeroMagico extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Patr�n para la introducci�n de n�meros
	 */
    static final Pattern PATRON = Pattern.compile("^\\d$");
    /**
     * Hilo con el tiempo
     */
    Thread temporizador;
    /**
     * Ventana principall
     */
    public Minijuegos ventanaPrincipal;
    /**
     * N�mero para adivinar
     */
    int numeroAlAzar = (int) (Math.random() * 20 + 1);

    /**
     * Creates new form NumeroMagico
     */
    public NumeroMagico(Minijuegos aThis) {
        initComponents();
        pista.setText("del 1 al 20");
        ventanaPrincipal = aThis;
        temporizador = new Temporizador("temporizador", barraDeTiempo, this);
        temporizador.start();

    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pista = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enviar = new javax.swing.JButton();
        numero = new javax.swing.JTextField();
        barraDeTiempo = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("N�mero m�gico");
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(310, 350));
        setPreferredSize(new java.awt.Dimension(300, 350));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pista.setForeground(new java.awt.Color(102, 255, 102));
        pista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 250, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Adivina el n�mero m�gico");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 30));

        enviar.setText("responder");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 60, 30));

        barraDeTiempo.setMaximum(150);
        getContentPane().add(barraDeTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, 20));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Magic_stones.jpg"))); // NOI18N
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(null);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-690, -620, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cerrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        if (PATRON.matcher(numero.getText().trim()).matches()) {
            comprobarValor();
        } else {
            reiniciarValor();
        }


    }//GEN-LAST:event_enviarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraDeTiempo;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField numero;
    private javax.swing.JLabel pista;
    // End of variables declaration//GEN-END:variables
    /**
     * Se ejecuta cada vez que la ventana se esta cerrando
     * @return devuelve -1
     */
    @SuppressWarnings("deprecation")
	private int cerrar() {
        dispose();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.toFront();
        temporizador.stop();
        return -1;
    }
    /**
     * Comprueba el valor introducido con el n�mero a adivinar
     */
    @SuppressWarnings("deprecation")
	private void comprobarValor() {
        if (Integer.parseInt(numero.getText().trim()) == numeroAlAzar) {
            temporizador.stop();
            JOptionPane.showMessageDialog(null, "Has Ganado", "Victoria", MIN_PRIORITY);
            dispose();
            ventanaPrincipal.setVisible(true);

        } else {
            reiniciarValor();

        }
    }
    /**
     * Reinicia el n�mero escrito y posiciona el foco para escribir un n�mero nuevo
     */
    private void reiniciarValor() {
        numero.setText("");
        enviar.transferFocusBackward();
    }
}
