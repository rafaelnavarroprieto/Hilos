/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosDeFuncionamiento;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import GUI.NumeroMagico;

/**
 * Clase que contiene el funcionamiento del hilo que controla el tiempo del juego número mágico
 * 
 * @author Rafael Navarro Prieto
 * @version 1.0
 */
public class Temporizador extends Thread {
    /**
     * Barra que contiene el tiempo transcurrido
     */
    JProgressBar contador;
    /**
     * ventana del juego
     */
    NumeroMagico ventanaNumeroMagico;
    /**
     * Constructor
     * @param name nombre del hilo
     * @param temporizador barra de progreso del tiempo
     * @param aThis ventana del juego
     */
    public Temporizador(String name,JProgressBar temporizador,NumeroMagico aThis) {
        super(name);
        this.contador = temporizador;
        this.ventanaNumeroMagico=aThis;
    }
    /**
     * Funcionamiento del programa en ejecución
     */
    @Override
    public void run() {
        int valor=0;
            try {
                while(valor < 150){
                sleep(100);
                contador.setValue(++valor);//incrementamos en 1 el valor de la barra de progreso
                }
             JOptionPane.showMessageDialog(null, "Has perdido", "Derrota", MIN_PRIORITY);
             ventanaNumeroMagico.dispose();
             ventanaNumeroMagico.ventanaPrincipal.setVisible(true);
            } catch (InterruptedException ex) {
                Logger.getLogger(Temporizador.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    
}
