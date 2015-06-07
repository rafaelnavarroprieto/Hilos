/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosDeFuncionamiento;

import GUI.*;

import javax.swing.JOptionPane;

/**
 * Clase que contiene el funcionamiento del hilo que controla la meta de los coches
 * @author Rafael Navarro Prieto
 * @version 1.0
 */
public class meta extends Thread {
	/**
	 * Nombre del hilo
	 */
    String meta;
    /**
     *  hilo del primer coche
     */
    Thread coche1;
    /**
     * Hilo del segundo coche
     */
    Thread coche2;
    /**
     * Ventana principal
     */
    Minijuegos ventanaP;
    /**
     * Ventana del juego
     */
    Coches ventanaC;
    /**
     * Constructor	
     * @param name nombre del hilo
     * @param coche1 hilo del primer coche
     * @param coche2 hilo del segundo coche
     * @param ventanaPrincipal ventana principal
     * @param ventanaCoches ventana del juego
     */
    public meta(String name, Thread coche1, Thread coche2, Minijuegos ventanaPrincipal,Coches ventanaCoches) {
        super(name);
        meta = name;
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.ventanaP = ventanaPrincipal;
        ventanaC = ventanaCoches;
    }
    /**
     * Funcionamiento del hilo
     */
    @Override
    public void run() {

        while (!comprobarGanador()) {
        }

    }
    /**
     * Comprueba el ganador de la carrera
     * @return devuelve true si uno de los coches llego a la meta o devuelve false si aun no llego ningún coche a la meta
     */
    @SuppressWarnings("deprecation")
	private boolean comprobarGanador() {
        if (!coche1.isAlive()) {
            coche2.stop();
            JOptionPane.showMessageDialog(null, "Gana el " + coche1.getName(), "Victoria", MIN_PRIORITY);
            
            ventanaC.dispose();
            ventanaP.setVisible(true);
            return true;
        } else if (!coche2.isAlive()) {
            coche1.stop();
            JOptionPane.showMessageDialog(null, "Gana el " + coche2.getName(), "Victoria", MIN_PRIORITY);
            ventanaC.dispose();
            ventanaP.setVisible(true);
            return true;
        } else {
            return false;
        }
    }
}
