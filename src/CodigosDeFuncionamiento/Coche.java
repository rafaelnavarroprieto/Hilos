/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosDeFuncionamiento;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 * Clase que contiene el funcionamiento de los coches del juego de coches
 * 
 * @author Rafael Navarro Prieto
 * @version 1.0
 */
public class Coche extends Thread {
	/**
	 * variable que almacenara el jlabel del coche
	 */
	JLabel etiqueta = new JLabel();
	/**
	 * Nombre del hilo
	 */
	String nombre;
	/**
	 * Posición de la meta
	 */
	int limite;
	/**
	 * Posición inicial del eje x donde se encuentra el coche
	 */
	int posicion = 0;
	/**
	 * Barra progresiva que muestra la distancia ya recorrida
	 */
	JProgressBar barraCoche;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            nombre del hilo
	 * @param limite
	 *            distancia donde esta situada la meta
	 * @param imgCoche
	 *            JLabel que contiene la imagen del coche
	 * @param barraCoche1
	 *            barra de progreso correspondiente a un coche
	 * @param prioridad
	 *            prioridad del hilo
	 */
	public Coche(String name, int limite, JLabel imgCoche,
			JProgressBar barraCoche, int prioridad) {
		super(name);
		setNombre(name);
		setLimite(limite);
		setEtiqueta(imgCoche);
		setPriority(calcularPrioridad(prioridad)); // damos prioridad X al hilo
		setBarraCoche(barraCoche);

	}

	/**
	 * @param etiqueta
	 *            the etiqueta to set
	 */
	private void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param limite
	 *            the limite to set
	 */
	private void setLimite(int limite) {
		this.limite = limite;
	}

	/**
	 * @param barraCoche
	 *            the barraCoche to set
	 */
	private void setBarraCoche(JProgressBar barraCoche) {
		this.barraCoche = barraCoche;
	}

	/**
	 * Contiene el funcionamiento del hilo al ejecutarlo
	 */
	@Override
	public void run() {
		while (posicion < limite) {
			try {
				avanzar();
				sleep((int) (Math.random() * 20)); // tiempo de espera en ms
				etiqueta.setLocation(posicion, etiqueta.getY());
				barraCoche.setValue(posicion); // rellenamos la barra de
												// progreso a la misma cantidad
												// que la distancia recorrida
			} catch (InterruptedException ex) {
				Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null,
						ex);
			}
		}

	}

	/**
	 * aumenta de 0 a 5 el eje x del coche
	 */
	private void avanzar() {
		posicion += (int) (Math.random() * 5);
	}

	/**
	 * Calcula la prioridad de cada hilo al ejecutarse
	 * 
	 * @param prioridad
	 *            valor aleatorio
	 * @return devuelve la prioridad mínima si el valor aleatorio es menor de
	 *         15, prioridad máxima si el valor aleatorio esta entre el 15 y el
	 *         24 y la prioridad normal si el valor aleatorio es mayor de 24
	 */
	private int calcularPrioridad(int prioridad) {
		if (prioridad < 15) {
			return MIN_PRIORITY;
		} else if (prioridad > 15 && prioridad < 25) {
			return MAX_PRIORITY;
		} else {
			return NORM_PRIORITY;
		}
	}

}
