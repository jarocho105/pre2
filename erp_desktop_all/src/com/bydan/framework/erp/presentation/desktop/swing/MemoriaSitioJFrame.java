package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class MemoriaSitioJFrame extends JFrame implements Runnable,ActionListener {

	public MemoriaSitioJFrame memoriaSitioJFrame=null;
	public String sTipo="";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldMemoriaTotal;
	private JTextField textFieldMemoriaLibre;
	private JTextField textFieldMemoriaUsada;
	private JTextField textFieldMemoriaMaxima;

	public MemoriaSitioJFrame(MemoriaSitioJFrame memoriaSitioJFrame,String sTipo) {
		this.memoriaSitioJFrame=memoriaSitioJFrame;
		this.sTipo=sTipo;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemoriaSitioJFrame frame = new MemoriaSitioJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		*/
		
		EventQueue.invokeLater(new MemoriaSitioJFrame(null,"main"));
	}

	public void run() {
		try {
			
			if(this.sTipo.equals("main")) {
				
				MemoriaSitioJFrame frame = new MemoriaSitioJFrame();
				
				frame.setVisible(true);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the frame.
	 */
	public MemoriaSitioJFrame() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		/*
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				MemoriaSitioJFrame.this.cargarMemoria();
			}
			@Override
			public void windowClosed(WindowEvent e) {
				
				//System.out.println("Ventana Cerrada");
			}
		});
		*/
		
		addWindowListener(new WindowAdapterGeneral(this,"MemoriaSitioJFrame"));
		
		setTitle("Memoria en Uso");
		setBounds(100, 100, 286, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("General", null, panel, null);
		panel.setLayout(new MigLayout("", "[][grow]", "[][][][][]"));
		
		JLabel lblMemoriaTotal = new JLabel("Memoria Total(MB)");
		panel.add(lblMemoriaTotal, "cell 0 0,alignx trailing");
		
		textFieldMemoriaTotal = new JTextField();
		panel.add(textFieldMemoriaTotal, "cell 1 0,alignx left");
		textFieldMemoriaTotal.setColumns(10);
		
		JLabel lblMemoriaLibre = new JLabel("Memoria Libre(MB)");
		panel.add(lblMemoriaLibre, "cell 0 1,alignx trailing");
		
		textFieldMemoriaLibre = new JTextField();
		panel.add(textFieldMemoriaLibre, "cell 1 1,alignx left");
		textFieldMemoriaLibre.setColumns(10);
		
		JLabel lblMemoriaUsada = new JLabel("Memoria Usada(MB)");
		panel.add(lblMemoriaUsada, "cell 0 2,alignx trailing");
		
		textFieldMemoriaUsada = new JTextField();
		panel.add(textFieldMemoriaUsada, "cell 1 2,alignx left");
		textFieldMemoriaUsada.setColumns(10);
		
		JLabel lblMemoriaMaxima = new JLabel("Memoria Maxima(MB)");
		panel.add(lblMemoriaMaxima, "cell 0 3,alignx trailing");
		
		textFieldMemoriaMaxima = new JTextField();
		panel.add(textFieldMemoriaMaxima, "cell 1 3,alignx left");
		textFieldMemoriaMaxima.setColumns(10);
		
		JButton btnActualizar = new JButton("Actualizar");
		
		/*
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemoriaSitioJFrame.this.cargarMemoria();
			}
		});
		*/
		
		btnActualizar.addActionListener(new MemoriaSitioJFrame(this,"btnActualizar"));
		
		panel.add(btnActualizar, "flowx,cell 0 4");
		
		JButton btnForzarLimpiar = new JButton("Forzar Limpiar");
		
		/*
		btnForzarLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.gc();
			}
		});
		*/
		
		btnForzarLimpiar.addActionListener(new MemoriaSitioJFrame(this,"btnForzarLimpiar"));
		
		panel.add(btnForzarLimpiar, "cell 1 4");
	}

	public void actionPerformed(ActionEvent e) {
		if(this.sTipo.equals("btnForzarLimpiar")) {
			System.gc();
		
		} else if(this.sTipo.equals("btnActualizar")) {
			MemoriaSitioJFrame.this.cargarMemoria();
		}
	}
	
	public void cargarMemoria() {
		Runtime runtime = Runtime.getRuntime();
		int megabytes = 1024 * 1024; 		
		
		this.textFieldMemoriaTotal.setText(Long.toString(runtime.totalMemory()/megabytes));
		this.textFieldMemoriaLibre.setText(Long.toString(runtime.freeMemory()/megabytes));
		this.textFieldMemoriaUsada.setText(Long.toString((runtime.totalMemory() - runtime.freeMemory())/megabytes));
		this.textFieldMemoriaMaxima.setText(Long.toString(runtime.maxMemory()/megabytes));
		
		//System.out.println("Memoria Cargada");
		
	}
}
