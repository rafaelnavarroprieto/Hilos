/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosDeFuncionamiento;

import GUI.Laberinto;

import java.awt.geom.Area;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Clase que contiene el funcionamiento del hilo que controla la meta del
 * laberinto
 * 
 * @author Rafael Navarro Prieto
 * @version 1.0
 */
public class salida extends Thread {
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
	 * ventana del juego
	 */
	Laberinto ventana;
	/**
	 * JLabel de la salida
	 */
	JLabel finish;
	/**
	 * JLabel del esbirro
	 */
	JLabel criatura;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            nombre del hilo
	 * @param personajeJuego
	 *            JLabel del personaje
	 * @param laberinto
	 *            ventana del juego
	 * @param fin
	 *            JLabel de la salida
	 * @param esbirro
	 *            JLabel del esbirro
	 */
	public salida(String name, JLabel personajeJuego, Laberinto laberinto,
			JLabel fin, JLabel esbirro) {
		super(name);
		personaje = personajeJuego;
		ventana = laberinto;
		finish = fin;
		criatura = esbirro;

	}

	/**
	 * Funcionamiento del hilo
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		while (!comprobarGanador()) {
			if (interseccion(personaje, criatura)) {
				JOptionPane.showMessageDialog(null, "Has perdido", "Derrota",
						MIN_PRIORITY);
				ventana.dispose();
				ventana.ventanaPrincipal.setVisible(true);
				stop();

			}

		}
	}

	/**
	 * Comprueba constantemente si el personaje llego a la meta
	 * 
	 * @return devuelve false si el jugador llego a la meta o devuelve true si
	 *         el jugador no llego a la meta
	 */
	@SuppressWarnings("deprecation")
	private boolean comprobarGanador() {
		if (interseccion(personaje, finish)) {

			JOptionPane.showMessageDialog(null, "Has llegado a la meta ",
					"Victoria", MIN_PRIORITY);
			ventana.dispose();
			ventana.ventanaPrincipal.setVisible(true);
			stop();
			return true;
		}
		return false;

	}

	/**
	 * Conprueba las posibles colisiones
	 * 
	 * @param personaje
	 *            JLabel del personaje
	 * @param finish
	 *            JLabel de la meta
	 * @return devuelte true si existe una colisión o false si no existe ninguna
	 *         colisión
	 */
	public boolean interseccion(JLabel personaje, JLabel finish) {
		Area areaA = new Area(personaje.getBounds());
		Area areaB = new Area(finish.getBounds());

		return areaA.intersects(areaB.getBounds2D());
	}
}
