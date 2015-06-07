/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CodigosDeFuncionamiento.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 * Ventana del juego Laberinto
 * 
 * @author Rafael Navarro Prieto
 * @version 1.0
 */
public class Laberinto extends javax.swing.JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ArrayList que contien los muros del juego
	 */
	ArrayList<JLabel> arrayMuros;
	/**
	 * Hilo de la meta
	 */
	Thread meta;
	/**
	 * Hilo del esbirro
	 */
	Thread esbirro;
	/**
	 * Valores iniciales de los ejes X e Y del jugador
	 */
	int xDefecto, yDefecto;
	/**
	 * Ventana principal
	 */
	public Minijuegos ventanaPrincipal;

	/**
	 * Creates new form Laberinto
	 */
	public Laberinto(Minijuegos ventana) {
		this.arrayMuros = new ArrayList<JLabel>();
		initComponents();
		rellenarArrayList();
		this.meta = new salida("salida", personaje, this, fin, esbirrillo);
		this.esbirro = new Desplazamiento("Esbirro", esbirrillo, personaje,
				muro56, muro51);
		ventanaPrincipal = ventana;
		meta.start();
		esbirro.start();
		xDefecto = personaje.getX();
		yDefecto = personaje.getY();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		personaje = new javax.swing.JLabel();
		muro = new javax.swing.JLabel();
		muro1 = new javax.swing.JLabel();
		muro2 = new javax.swing.JLabel();
		muro3 = new javax.swing.JLabel();
		muro4 = new javax.swing.JLabel();
		muro5 = new javax.swing.JLabel();
		muro6 = new javax.swing.JLabel();
		muro7 = new javax.swing.JLabel();
		muro8 = new javax.swing.JLabel();
		muro9 = new javax.swing.JLabel();
		muro10 = new javax.swing.JLabel();
		muro11 = new javax.swing.JLabel();
		muro12 = new javax.swing.JLabel();
		muro13 = new javax.swing.JLabel();
		muro14 = new javax.swing.JLabel();
		muro15 = new javax.swing.JLabel();
		muro16 = new javax.swing.JLabel();
		muro17 = new javax.swing.JLabel();
		muro18 = new javax.swing.JLabel();
		muro19 = new javax.swing.JLabel();
		muro20 = new javax.swing.JLabel();
		muro21 = new javax.swing.JLabel();
		muro22 = new javax.swing.JLabel();
		muro23 = new javax.swing.JLabel();
		muro24 = new javax.swing.JLabel();
		muro25 = new javax.swing.JLabel();
		muro26 = new javax.swing.JLabel();
		muro27 = new javax.swing.JLabel();
		muro28 = new javax.swing.JLabel();
		muro29 = new javax.swing.JLabel();
		muro30 = new javax.swing.JLabel();
		muro31 = new javax.swing.JLabel();
		muro32 = new javax.swing.JLabel();
		muro33 = new javax.swing.JLabel();
		muro34 = new javax.swing.JLabel();
		muro35 = new javax.swing.JLabel();
		muro36 = new javax.swing.JLabel();
		muro37 = new javax.swing.JLabel();
		muro38 = new javax.swing.JLabel();
		muro39 = new javax.swing.JLabel();
		muro40 = new javax.swing.JLabel();
		muro41 = new javax.swing.JLabel();
		muro42 = new javax.swing.JLabel();
		muro43 = new javax.swing.JLabel();
		muro44 = new javax.swing.JLabel();
		muro45 = new javax.swing.JLabel();
		muro46 = new javax.swing.JLabel();
		muro47 = new javax.swing.JLabel();
		muro48 = new javax.swing.JLabel();
		muro49 = new javax.swing.JLabel();
		muro50 = new javax.swing.JLabel();
		muro51 = new javax.swing.JLabel();
		muro52 = new javax.swing.JLabel();
		muro53 = new javax.swing.JLabel();
		muro54 = new javax.swing.JLabel();
		muro55 = new javax.swing.JLabel();
		muro56 = new javax.swing.JLabel();
		muro57 = new javax.swing.JLabel();
		muro58 = new javax.swing.JLabel();
		muro59 = new javax.swing.JLabel();
		muro60 = new javax.swing.JLabel();
		muro61 = new javax.swing.JLabel();
		muro62 = new javax.swing.JLabel();
		muro63 = new javax.swing.JLabel();
		muro64 = new javax.swing.JLabel();
		muro65 = new javax.swing.JLabel();
		muro66 = new javax.swing.JLabel();
		muro67 = new javax.swing.JLabel();
		muro68 = new javax.swing.JLabel();
		muro69 = new javax.swing.JLabel();
		muro70 = new javax.swing.JLabel();
		muro71 = new javax.swing.JLabel();
		muro72 = new javax.swing.JLabel();
		muro73 = new javax.swing.JLabel();
		muro74 = new javax.swing.JLabel();
		muro75 = new javax.swing.JLabel();
		muro76 = new javax.swing.JLabel();
		muro77 = new javax.swing.JLabel();
		muro78 = new javax.swing.JLabel();
		muro79 = new javax.swing.JLabel();
		muro80 = new javax.swing.JLabel();
		muro82 = new javax.swing.JLabel();
		muro83 = new javax.swing.JLabel();
		esbirrillo = new javax.swing.JLabel();
		muro85 = new javax.swing.JLabel();
		fin = new javax.swing.JLabel();
		fondo = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Laberinto del esbirro");
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});
		addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				formKeyPressed(evt);
			}
		});
		getContentPane().setLayout(
				new org.netbeans.lib.awtextra.AbsoluteLayout());

		personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/personaje.png"))); // NOI18N
		personaje.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				personajeKeyPressed(evt);
			}
		});
		getContentPane().add(
				personaje,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1,
						-1));

		muro.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro.setName(""); // NOI18N
		getContentPane().add(
				muro,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 30,
						30));

		muro1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro1.setName(""); // NOI18N
		getContentPane()
				.add(muro1,
						new org.netbeans.lib.awtextra.AbsoluteConstraints(0,
								70, 30, 60));

		muro2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro2.setName(""); // NOI18N
		getContentPane().add(
				muro2,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 30,
						30));

		muro3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro3.setName(""); // NOI18N
		getContentPane().add(
				muro3,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 30,
						30));

		muro4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro4.setName(""); // NOI18N
		getContentPane().add(
				muro4,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 30,
						30));

		muro5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro5.setName(""); // NOI18N
		getContentPane().add(
				muro5,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 30,
						30));

		muro6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro6.setName(""); // NOI18N
		getContentPane().add(
				muro6,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 30,
						30));

		muro7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro7.setName(""); // NOI18N
		getContentPane().add(
				muro7,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 30,
						30));

		muro8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro8.setName(""); // NOI18N
		getContentPane().add(
				muro8,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 30,
						30));

		muro9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro9.setName(""); // NOI18N
		getContentPane().add(
				muro9,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 30,
						30));

		muro10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro10.setName(""); // NOI18N
		getContentPane().add(
				muro10,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 30,
						30));

		muro11.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro11.setName(""); // NOI18N
		getContentPane().add(
				muro11,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 30,
						30));

		muro12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro12.setName(""); // NOI18N
		getContentPane().add(
				muro12,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 30,
						30));

		muro13.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro13.setName(""); // NOI18N
		getContentPane().add(
				muro13,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 30,
						30));

		muro14.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro14.setName(""); // NOI18N
		getContentPane().add(
				muro14,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30,
						30));

		muro15.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro15.setName(""); // NOI18N
		getContentPane().add(
				muro15,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 30,
						30));

		muro16.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro16.setName(""); // NOI18N
		getContentPane().add(
				muro16,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 30,
						30));

		muro17.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro17.setName(""); // NOI18N
		getContentPane().add(
				muro17,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 30,
						30));

		muro18.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro18.setName(""); // NOI18N
		getContentPane().add(
				muro18,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 30,
						50));

		muro19.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro19.setName(""); // NOI18N
		getContentPane().add(
				muro19,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30,
						30));

		muro20.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro20.setName(""); // NOI18N
		getContentPane().add(
				muro20,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 30,
						30));

		muro21.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro21.setName(""); // NOI18N
		getContentPane().add(
				muro21,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 30,
						30));

		muro22.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro22.setName(""); // NOI18N
		getContentPane().add(
				muro22,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 30,
						30));

		muro23.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro23.setName(""); // NOI18N
		getContentPane().add(
				muro23,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 30,
						30));

		muro24.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro24.setName(""); // NOI18N
		getContentPane().add(
				muro24,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 30,
						30));

		muro25.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro25.setName(""); // NOI18N
		getContentPane().add(
				muro25,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 30,
						30));

		muro26.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro26.setName(""); // NOI18N
		getContentPane().add(
				muro26,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 30,
						30));

		muro27.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro27.setName(""); // NOI18N
		getContentPane().add(
				muro27,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 30,
						30));

		muro28.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro28.setName(""); // NOI18N
		getContentPane().add(
				muro28,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 30,
						30));

		muro29.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro29.setName(""); // NOI18N
		getContentPane().add(
				muro29,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 30,
						30));

		muro30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro30.setName(""); // NOI18N
		getContentPane().add(
				muro30,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 30,
						30));

		muro31.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro31.setName(""); // NOI18N
		getContentPane().add(
				muro31,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 30,
						30));

		muro32.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro32.setName(""); // NOI18N
		getContentPane().add(
				muro32,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 30,
						30));

		muro33.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro33.setName(""); // NOI18N
		getContentPane().add(
				muro33,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 30,
						30));

		muro34.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro34.setName(""); // NOI18N
		getContentPane().add(
				muro34,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 30,
						30));

		muro35.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro35.setName(""); // NOI18N
		getContentPane().add(
				muro35,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 30,
						30));

		muro36.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro36.setName(""); // NOI18N
		getContentPane().add(
				muro36,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 30,
						30));

		muro37.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro37.setName(""); // NOI18N
		getContentPane().add(
				muro37,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 30,
						30));

		muro38.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro38.setName(""); // NOI18N
		getContentPane().add(
				muro38,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 30,
						30));

		muro39.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro39.setName(""); // NOI18N
		getContentPane().add(
				muro39,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 30,
						30));

		muro40.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro40.setName(""); // NOI18N
		getContentPane().add(
				muro40,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 30,
						30));

		muro41.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro41.setName(""); // NOI18N
		getContentPane().add(
				muro41,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30,
						30));

		muro42.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro42.setName(""); // NOI18N
		getContentPane().add(
				muro42,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 30,
						30));

		muro43.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro43.setName(""); // NOI18N
		getContentPane().add(
				muro43,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 30,
						30));

		muro44.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro44.setName(""); // NOI18N
		getContentPane().add(
				muro44,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 30,
						30));

		muro45.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro45.setName(""); // NOI18N
		getContentPane().add(
				muro45,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 30,
						30));

		muro46.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro46.setName(""); // NOI18N
		getContentPane().add(
				muro46,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 30,
						30));

		muro47.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro47.setName(""); // NOI18N
		getContentPane().add(
				muro47,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 30,
						30));

		muro48.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro48.setName(""); // NOI18N
		getContentPane().add(
				muro48,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 30,
						30));

		muro49.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro49.setName(""); // NOI18N
		getContentPane().add(
				muro49,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 30,
						30));

		muro50.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro50.setName(""); // NOI18N
		getContentPane().add(
				muro50,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 30,
						30));

		muro51.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro51.setName(""); // NOI18N
		getContentPane().add(
				muro51,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 30,
						30));

		muro52.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro52.setName(""); // NOI18N
		getContentPane().add(
				muro52,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 30,
						30));

		muro53.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro53.setName(""); // NOI18N
		getContentPane().add(
				muro53,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 30,
						30));

		muro54.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro54.setName(""); // NOI18N
		getContentPane().add(
				muro54,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 30,
						30));

		muro55.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro55.setName(""); // NOI18N
		getContentPane().add(
				muro55,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 30,
						30));

		muro56.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro56.setName(""); // NOI18N
		getContentPane().add(
				muro56,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 30,
						30));

		muro57.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro57.setName(""); // NOI18N
		getContentPane().add(
				muro57,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 30,
						30));

		muro58.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro58.setName(""); // NOI18N
		getContentPane().add(
				muro58,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 30,
						30));

		muro59.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro59.setName(""); // NOI18N
		getContentPane().add(
				muro59,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 30,
						30));

		muro60.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro60.setName(""); // NOI18N
		getContentPane().add(
				muro60,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 30,
						30));

		muro61.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro61.setName(""); // NOI18N
		getContentPane().add(
				muro61,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 30,
						30));

		muro62.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro62.setName(""); // NOI18N
		getContentPane().add(
				muro62,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 30,
						30));

		muro63.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro63.setName(""); // NOI18N
		getContentPane().add(
				muro63,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 30,
						30));

		muro64.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro64.setName(""); // NOI18N
		getContentPane().add(
				muro64,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 30,
						30));

		muro65.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro65.setName(""); // NOI18N
		getContentPane().add(
				muro65,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 30,
						30));

		muro66.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro66.setName(""); // NOI18N
		getContentPane().add(
				muro66,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 30,
						30));

		muro67.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro67.setName(""); // NOI18N
		getContentPane().add(
				muro67,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 30,
						30));

		muro68.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro68.setName(""); // NOI18N
		getContentPane().add(
				muro68,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 30,
						30));

		muro69.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro69.setName(""); // NOI18N
		getContentPane().add(
				muro69,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 30,
						30));

		muro70.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro70.setName(""); // NOI18N
		getContentPane().add(
				muro70,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 30,
						30));

		muro71.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro71.setName(""); // NOI18N
		getContentPane().add(
				muro71,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 30,
						30));

		muro72.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro72.setName(""); // NOI18N
		getContentPane().add(
				muro72,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 30,
						30));

		muro73.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro73.setName(""); // NOI18N
		getContentPane().add(
				muro73,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 30,
						30));

		muro74.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro74.setName(""); // NOI18N
		getContentPane().add(
				muro74,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 30,
						30));

		muro75.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro75.setName(""); // NOI18N
		getContentPane().add(
				muro75,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 30,
						30));

		muro76.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro76.setName(""); // NOI18N
		getContentPane().add(
				muro76,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 30,
						30));

		muro77.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro77.setName(""); // NOI18N
		getContentPane().add(
				muro77,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 30,
						30));

		muro78.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro78.setName(""); // NOI18N
		getContentPane().add(
				muro78,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 30,
						30));

		muro79.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro79.setName(""); // NOI18N
		getContentPane().add(
				muro79,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 30,
						30));

		muro80.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro80.setName(""); // NOI18N
		getContentPane().add(
				muro80,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 30,
						30));

		muro82.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro82.setName(""); // NOI18N
		getContentPane().add(
				muro82,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 40,
						30));

		muro83.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro83.setName(""); // NOI18N
		getContentPane().add(
				muro83,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 30,
						30));

		esbirrillo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/esbirrillo.png"))); // NOI18N
		getContentPane().add(
				esbirrillo,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 200, 20,
						-1));

		muro85.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imagenes/muro.jpg"))); // NOI18N
		muro85.setName(""); // NOI18N
		getContentPane().add(
				muro85,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 40,
						30));

		fin.setBackground(new java.awt.Color(255, 0, 0));
		fin.setForeground(new java.awt.Color(51, 255, 51));
		fin.setOpaque(true);
		getContentPane().add(
				fin,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 40,
						30));

		fondo.setBackground(new java.awt.Color(0, 0, 0));
		fondo.setOpaque(true);
		getContentPane().add(
				fondo,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640,
						370));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void personajeKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_personajeKeyPressed

	}// GEN-LAST:event_personajeKeyPressed

	private void formKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_formKeyPressed
		switch (evt.getKeyCode()) {
		case KeyEvent.VK_LEFT: // MOVE LEFT
			desplazamiento(-5, 0);
			break;
		case KeyEvent.VK_RIGHT:// MOVE RIGHT
			desplazamiento(5, 0);
			break;
		case KeyEvent.VK_UP: // MOVE UP
			desplazamiento(0, -5);
			break;
		case KeyEvent.VK_DOWN: // MOVE DOWN
			desplazamiento(0, 5);
			break;
		}

	}// GEN-LAST:event_formKeyPressed

	/**
	 * Desplazamiento del personaje
	 * 
	 * @param x
	 *            valor a incrementar en el eje x
	 * @param y
	 *            valor a incrementar en el eje y
	 */
	private void desplazamiento(int x, int y) {
		if (ComprobarColisionMuros(personaje, arrayMuros)) { // si no hay
															// colisi�n
			personaje.setLocation(personaje.getX() + x, personaje.getY() + y); // nos
																				// desplazamos
		} else { // en caso contrario
			personaje.setLocation(xDefecto, yDefecto); // volvemos a la posici�n
														// inicial
		}
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
		cerrar();
	}// GEN-LAST:event_formWindowClosing

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel esbirrillo;
	private javax.swing.JLabel fin;
	private javax.swing.JLabel fondo;
	private javax.swing.JLabel muro;
	private javax.swing.JLabel muro1;
	private javax.swing.JLabel muro10;
	private javax.swing.JLabel muro11;
	private javax.swing.JLabel muro12;
	private javax.swing.JLabel muro13;
	private javax.swing.JLabel muro14;
	private javax.swing.JLabel muro15;
	private javax.swing.JLabel muro16;
	private javax.swing.JLabel muro17;
	private javax.swing.JLabel muro18;
	private javax.swing.JLabel muro19;
	private javax.swing.JLabel muro2;
	private javax.swing.JLabel muro20;
	private javax.swing.JLabel muro21;
	private javax.swing.JLabel muro22;
	private javax.swing.JLabel muro23;
	private javax.swing.JLabel muro24;
	private javax.swing.JLabel muro25;
	private javax.swing.JLabel muro26;
	private javax.swing.JLabel muro27;
	private javax.swing.JLabel muro28;
	private javax.swing.JLabel muro29;
	private javax.swing.JLabel muro3;
	private javax.swing.JLabel muro30;
	private javax.swing.JLabel muro31;
	private javax.swing.JLabel muro32;
	private javax.swing.JLabel muro33;
	private javax.swing.JLabel muro34;
	private javax.swing.JLabel muro35;
	private javax.swing.JLabel muro36;
	private javax.swing.JLabel muro37;
	private javax.swing.JLabel muro38;
	private javax.swing.JLabel muro39;
	private javax.swing.JLabel muro4;
	private javax.swing.JLabel muro40;
	private javax.swing.JLabel muro41;
	private javax.swing.JLabel muro42;
	private javax.swing.JLabel muro43;
	private javax.swing.JLabel muro44;
	private javax.swing.JLabel muro45;
	private javax.swing.JLabel muro46;
	private javax.swing.JLabel muro47;
	private javax.swing.JLabel muro48;
	private javax.swing.JLabel muro49;
	private javax.swing.JLabel muro5;
	private javax.swing.JLabel muro50;
	private javax.swing.JLabel muro51;
	private javax.swing.JLabel muro52;
	private javax.swing.JLabel muro53;
	private javax.swing.JLabel muro54;
	private javax.swing.JLabel muro55;
	private javax.swing.JLabel muro56;
	private javax.swing.JLabel muro57;
	private javax.swing.JLabel muro58;
	private javax.swing.JLabel muro59;
	private javax.swing.JLabel muro6;
	private javax.swing.JLabel muro60;
	private javax.swing.JLabel muro61;
	private javax.swing.JLabel muro62;
	private javax.swing.JLabel muro63;
	private javax.swing.JLabel muro64;
	private javax.swing.JLabel muro65;
	private javax.swing.JLabel muro66;
	private javax.swing.JLabel muro67;
	private javax.swing.JLabel muro68;
	private javax.swing.JLabel muro69;
	private javax.swing.JLabel muro7;
	private javax.swing.JLabel muro70;
	private javax.swing.JLabel muro71;
	private javax.swing.JLabel muro72;
	private javax.swing.JLabel muro73;
	private javax.swing.JLabel muro74;
	private javax.swing.JLabel muro75;
	private javax.swing.JLabel muro76;
	private javax.swing.JLabel muro77;
	private javax.swing.JLabel muro78;
	private javax.swing.JLabel muro79;
	private javax.swing.JLabel muro8;
	private javax.swing.JLabel muro80;
	private javax.swing.JLabel muro82;
	private javax.swing.JLabel muro83;
	private javax.swing.JLabel muro85;
	private javax.swing.JLabel muro9;
	private javax.swing.JLabel personaje;

	// End of variables declaration//GEN-END:variables
	/**
     * Comprueba las posibles colisiones al desplazarse el jugador
     * @param personaje JLabel del jugador
     * @param array ArrayList que contiene todos los posibles obst�culos
     * @return devuelve false si ocurre alguna colisi�n o true si no se realizo una colisi�n
     */
	public boolean ComprobarColisionMuros(JLabel personaje,
			ArrayList<JLabel> array) {

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
	 * Rellena el arrayList
	 */
	private void rellenarArrayList() {
		arrayMuros.add(muro);
		arrayMuros.add(muro1);
		arrayMuros.add(muro2);
		arrayMuros.add(muro3);
		arrayMuros.add(muro4);
		arrayMuros.add(muro5);
		arrayMuros.add(muro6);
		arrayMuros.add(muro7);
		arrayMuros.add(muro8);
		arrayMuros.add(muro9);
		arrayMuros.add(muro10);
		arrayMuros.add(muro11);
		arrayMuros.add(muro12);
		arrayMuros.add(muro13);
		arrayMuros.add(muro14);
		arrayMuros.add(muro15);
		arrayMuros.add(muro16);
		arrayMuros.add(muro17);
		arrayMuros.add(muro18);
		arrayMuros.add(muro19);
		arrayMuros.add(muro20);
		arrayMuros.add(muro21);
		arrayMuros.add(muro22);
		arrayMuros.add(muro23);
		arrayMuros.add(muro24);
		arrayMuros.add(muro25);
		arrayMuros.add(muro26);
		arrayMuros.add(muro27);
		arrayMuros.add(muro28);
		arrayMuros.add(muro29);
		arrayMuros.add(muro30);
		arrayMuros.add(muro31);
		arrayMuros.add(muro32);
		arrayMuros.add(muro33);
		arrayMuros.add(muro34);
		arrayMuros.add(muro35);
		arrayMuros.add(muro36);
		arrayMuros.add(muro37);
		arrayMuros.add(muro38);
		arrayMuros.add(muro39);
		arrayMuros.add(muro40);
		arrayMuros.add(muro41);
		arrayMuros.add(muro42);
		arrayMuros.add(muro43);
		arrayMuros.add(muro44);
		arrayMuros.add(muro45);
		arrayMuros.add(muro46);
		arrayMuros.add(muro47);
		arrayMuros.add(muro48);
		arrayMuros.add(muro49);
		arrayMuros.add(muro50);
		arrayMuros.add(muro51);
		arrayMuros.add(muro52);
		arrayMuros.add(muro53);
		arrayMuros.add(muro54);
		arrayMuros.add(muro55);
		arrayMuros.add(muro56);
		arrayMuros.add(muro57);
		arrayMuros.add(muro58);
		arrayMuros.add(muro59);
		arrayMuros.add(muro60);
		arrayMuros.add(muro61);
		arrayMuros.add(muro62);
		arrayMuros.add(muro63);
		arrayMuros.add(muro64);
		arrayMuros.add(muro65);
		arrayMuros.add(muro66);
		arrayMuros.add(muro67);
		arrayMuros.add(muro68);
		arrayMuros.add(muro69);
		arrayMuros.add(muro77);
		arrayMuros.add(muro78);
		arrayMuros.add(muro79);
		arrayMuros.add(muro80);
		arrayMuros.add(muro82);
		arrayMuros.add(muro83);

	}
	 /**
     * Se ejecuta cada vez que la ventana se esta cerrando
     * @return devuelve -1
     */
	private int cerrar() {

		dispose();
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.toFront();
		return -1;
	}

}