/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosDeFuncionamiento;

import java.awt.geom.Area;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 * Clase que contiene el funcionamiento de los esbirros que andan en circulos
 * 
 * @author Rafael Navarro Prieto
 * @version 1.0
 */
public class DesplazamientoCiclico extends Thread {
	/**
	 * Nombre del hilo
	 */
	private String nombre;
	/**
	 * Variable que contiene el JLabel del esbirro
	 */
	JLabel esbirro;
	/**
	 * Variable que contiene el JLabel del jugador
	 */
	JLabel personaje;
	/**
	 * Variables que contienen la posición inicial del jugador
	 */
	int xDefecto, yDefecto;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            nombre del hilo
	 * @param esbirrillo
	 *            JLabel del esbirro
	 * @param imagen
	 *            JLabel del jugador
	 */
	public DesplazamientoCiclico(String name, JLabel esbirrillo, JLabel imagen) {
		super(name);
		nombre = name;
		esbirro = esbirrillo;
		personaje = imagen;
		// asignamos la posición inicial en los ejes x e y
		xDefecto = imagen.getX();
		yDefecto = imagen.getY();
	}

	/**
	 * contiene el funcionamiento del hilo al ejecutarlo
	 */
	@Override
	public void run() {
		do {
			if (nombre.equals("esbirro")) {
				desplazamiento(-1, 0, 240, false);
				desplazamiento(0, 1, 200, true);
				desplazamiento(1, 0, 450, false);
				desplazamiento(0, -1, 80, true);
			} else {
				desplazamiento(1, 0, 450, false);
				desplazamiento(0, -1, 80, true);
				desplazamiento(-1, 0, 240, false);
				desplazamiento(0, 1, 200, true);
			}
		} while (true);
	}

	/**
	 * Desplazamiento de los esbirros segun unas condiciones
	 * 
	 * @param ejeX
	 *            valor que incrementa el eje x
	 * @param ejeY
	 *            valor que uncrementa el eje y
	 * @param condicion
	 *            condición que debe cumplirse para que no se salga del método
	 * @param ejeComprobar
	 *            booleano que delimita que eje debe comprobarse, si el campo es
	 *            true se debe comprobar el ejeY en el bucle si el campo
	 *            booleano es false se debe comprobar el ejeX en el bucle.
	 */
	private void desplazamiento(int ejeX, int ejeY, int condicion,
			boolean ejeComprobar) {
		do {
			try {
				esbirro.setLocation(esbirro.getX() + ejeX, esbirro.getY()
						+ ejeY);
				sleep(10);
				if (comprobarColision(personaje, esbirro)) // comprobamos continuamente si hay colisiones por parte del hilo
					personaje.setLocation(xDefecto, yDefecto);
			} catch (InterruptedException ex) {
				Logger.getLogger(DesplazamientoCiclico.class.getName()).log(
						Level.SEVERE, null, ex);
			}
		} while (comprobarEje(ejeComprobar) != condicion);
	}
	/**
	 * comprueba que eje a de comprobar
	 * @param ejeComprobar campo booleano 
	 * @return devuelve el eje de Y si el parámetro es true o devuelve el eje de x si el parámetro es false
	 */
	private int comprobarEje(boolean ejeComprobar) {
		if (ejeComprobar)
			return esbirro.getY();
		else
			return esbirro.getX();
	}
	/**
	 * comprueba las posibles colisiones causadas con este hilo
	 * @param personaje JLabel del personaje
	 * @param esbirro JLabel del esbirro
	 * @return devuelve true si se ocasiono una colisión , si no se producen colisiones devuelve false
	 */
	private boolean comprobarColision(JLabel personaje, JLabel esbirro) {
		Area areaA = new Area(personaje.getBounds());
		Area areaB = new Area(esbirro.getBounds());
		if (areaA.intersects(areaB.getBounds2D())) 
			return true;
		return false;
	}

}
