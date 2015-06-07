/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosDeFuncionamiento;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 * Clase que contiene el funcionamiento de los obstáculos que andan de forma
 * horizontal
 * 
 * @author Rafael Navarro Prieto
 * @version 1.0
 */
public class Desplazamiento extends Thread {
	/**
	 * ArrayList que contiene los muros con posibilidad de colisión
	 */
	ArrayList<JLabel> muros = new ArrayList<JLabel>();
	/**
	 * JLabel del obstáculo
	 */
	JLabel imagen;
	/**
	 * JLabel del personaje
	 */
	JLabel personaje;
	/**
	 * Valores iniciales del personaje
	 */
	int xDefecto, yDefecto;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            nombre del hilo
	 * @param imagenEsbirro
	 *            JLabel del obstáculo
	 * @param jugador
	 *            JLabel del jugador
	 * @param muroIzquierda
	 *            muro de la izquierda de la ventana del programa
	 * @param muroDerecha
	 *            muro de la derecha de la ventana del programa
	 */
	public Desplazamiento(String name, JLabel imagenEsbirro,
			JLabel jugador, JLabel muroIzquierda, JLabel muroDerecha) {
		super(name);
		muros.add(muroIzquierda);
		muros.add(muroDerecha);
		imagen = imagenEsbirro;
		personaje = jugador;
		xDefecto = jugador.getX();
		yDefecto = jugador.getY();

	}

	/**
	 * contiene el funcionamiento del hilo al ejecutarlo
	 */
	@Override
	public void run() {
		int aleatorio = (int) (Math.random() * 4 + 1);
		do {
			if (super.getName().equals("Pala2")||super.getName().equals("Pala3")) {
			if (aleatorio <= 2) {
				desplazamiento(-5,0);
				desplazamiento(+5,0);

			} else {

				desplazamiento(+5,0);
				desplazamiento(-5,0);
			}
		}else{
			if (aleatorio <= 2) {
				desplazamiento(0,-5);
				desplazamiento(0,+5);

			} else {

				desplazamiento(0,+5);
				desplazamiento(0,-5);
			}
		}
			
		} while (true);
	}
	/**
	 * comprueba las posibles colisiones causadas con este hilo
	 * @param personaje JLabel del personaje
	 * @param array arrayList con los posibles JLabel a colisionar
	 * @return devuelve true si se ocasiono una colisión , si no se producen colisiones devuelve false
	 */
	public boolean comprobarColision(JLabel personaje, ArrayList<JLabel> array) {
		Area areaA = new Area(personaje.getBounds());
		for (int i = 0; i < array.size(); i++) {
			Area areaB = new Area(array.get(i).getBounds());
			if (areaA.intersects(areaB.getBounds2D())) {
				return false;
			}

		}

		return true;
	}
	/**
	 * Desplazamiento de los posibles obstáculos
	 * @param ejeX cantidad de desplazamiento que se realiza en el eje x
	 */
	private void desplazamiento(int ejeX,int ejeY) {
		do {
			try {
				imagen.setLocation(imagen.getX() + ejeX, imagen.getY()+ejeY);
				sleep(60);
				if (comprobarColision(personaje, imagen))
					personaje.setLocation(xDefecto, yDefecto);
			} catch (InterruptedException ex) {
				Logger.getLogger(Desplazamiento.class.getName()).log(
						Level.SEVERE, null, ex);
			}
		} while (comprobarColision(imagen, muros));
	}
	/**
	 * comprueba las posibles colisiones causadas con este hilo
	 * @param personaje JLabel del personaje
	 * @param imagen JLabel del obstáculo
	 * @return devuelve true si se ocasiono una colisión , si no se producen colisiones devuelve false
	 */
	private boolean comprobarColision(JLabel personaje, JLabel imagen) {
		Area areaA = new Area(personaje.getBounds());
		Area areaB = new Area(imagen.getBounds());
		if (areaA.intersects(areaB.getBounds2D())) {
			return true;
		}

		return false;
	}
}
