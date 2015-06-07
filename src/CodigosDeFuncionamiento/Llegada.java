/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosDeFuncionamiento;

import java.awt.geom.Area;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import GUI.Imposible;

/**
 * Clase que contiene el funcionamiento del hilo que controla la meta del juego imposible
 * @author Rafael Navarro Prieto
 * @version 1.0
 */
public class Llegada extends Thread {
	/**
	 * Eje x de la meta
	 */
    int x = 590;
    /**
     * Eje y de la meta
     */
    int y = 50;
    /**
     * JLabel del personaje
     */
    JLabel personaje;
    /**
     * Ventana del juego
     */
    Imposible ventana;
    /**
     * JLabel que indica la salida
     */
    JLabel finish;
    /**
     * Constructor
     * @param name nombre del hilo
     * @param personajeJuego JLabel del personaje
     * @param laberinto Ventana del juego
     * @param fin JLabel de la salida
     */
    public Llegada(String name, JLabel personajeJuego, Imposible laberinto, JLabel fin) {
        super(name);
        personaje = personajeJuego;
        ventana = laberinto;
        finish = fin;

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
     * Comprueba constantemente si el personaje llego a la meta
     * @return devuelve false si el jugador llego a la meta o devuelve true si el jugador no llego a la meta
     */
    @SuppressWarnings("deprecation")
	private boolean comprobarGanador() {
        if (interseccion(personaje, finish)) {

            JOptionPane.showMessageDialog(null, "Has llegado a la meta ", "Victoria", MIN_PRIORITY);
            ventana.ventanaPrincipal.setVisible(true);
            ventana.dispose();

            stop();
            return true;
        }
        return false;

    }
    /**
     * Conprueba las posibles colisiones
     * @param personaje JLabel del personaje
     * @param finish JLabel de la meta
     * @return devuelte true si existe una colisión o false si no existe ninguna colisión
     */
    public boolean interseccion(JLabel personaje, JLabel finish) {
        Area areaA = new Area(personaje.getBounds());
        Area areaB = new Area(finish.getBounds());

        return areaA.intersects(areaB.getBounds2D());
    }
}
