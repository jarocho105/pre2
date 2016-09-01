package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import com.bydan.framework.erp.util.Constantes;
import com.toedter.calendar.JDateChooser;

@SuppressWarnings("unused")
public class JPanelDateTimeMe extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JDateChooser jDateChooserFecha;
	public JSpinner jSpinnerHora;
	protected GridBagConstraints gridBagConstraintsFechaHora;
	
	
	private Boolean conRepeatImage=true;
	private Image image=null;
	private String sPathImagen=null;
	
	protected Boolean conEnabled=true;
	
	public JPanelDateTimeMe(Boolean conEnabled) {
		super();
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
		this.inicializar();
	}
	
	public JPanelDateTimeMe() {
		this(true);
	}
	
	public JPanelDateTimeMe(String sPathImagen,Boolean conRepeatImage,Boolean conEnabled) {
		super();
		
		/*
		this.sPathImagen=sPathImagen;
		this.conRepeatImage=conRepeatImage;
		*/
		
		this.conEnabled=conEnabled;
		this.setEnabled(this.conEnabled);
		
		this.inicializar();
	}
	
	public JPanelDateTimeMe(String sPathImagen,Boolean conRepeatImage) {
		this(sPathImagen,conRepeatImage,true);
	}
	
	/*
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //BYDAN_COMENTAR (PARA WINDOWS BUILDER VISUALIZAR)
        image=FuncionesSwing.getImagenFondo(this.sPathImagen);
        
        if(image!=null) {
	        if (conRepeatImage) {
	            int iw = image.getWidth(this);
	            int ih = image.getHeight(this);
	            
	            if (iw > 0 && ih > 0) {
	                for (int x = 0; x < getWidth(); x += iw) {
	                    for (int y = 0; y < getHeight(); y += ih) {
	                        g.drawImage(image, x, y, iw, ih, this);
	                    }
	                }
	            }
	            
	        } else {
	            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	        }
        }
        
    }
	*/
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
	
	public void inicializar() {
		this.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		this.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		this.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		
		/*
		this.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL*2,Constantes.ISWING_ALTO_CONTROL*2));
		this.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL*2,Constantes.ISWING_ALTO_CONTROL*2));
		this.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL*2,Constantes.ISWING_ALTO_CONTROL*2));
		*/
		
		//FECHA
		this.jDateChooserFecha= new JDateChooser();
		
		this.jDateChooserFecha.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,80),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		this.jDateChooserFecha.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,80),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		this.jDateChooserFecha.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,80),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		this.jDateChooserFecha.setDate(new Date());
		this.jDateChooserFecha.setDateFormatString("yyyy-MM-dd");
		
		
		//HORA
		this.jSpinnerHora= new JSpinner(new SpinnerDateModel());;
		JSpinner.DateEditor timeEditorHora = new JSpinner.DateEditor(this.jSpinnerHora, "HH:mm:ss");

		this.jSpinnerHora.setEditor(timeEditorHora);
		this.jSpinnerHora.setValue(new Date());

		this.jSpinnerHora.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,80),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		this.jSpinnerHora.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,80),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		this.jSpinnerHora.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,80),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		
		
		//ADD PANEL
		this.gridBagConstraintsFechaHora = new GridBagConstraints();
		
		this.gridBagConstraintsFechaHora.fill = GridBagConstraints.NONE;//HORIZONTAL
		this.gridBagConstraintsFechaHora.anchor=GridBagConstraints.WEST;
		this.gridBagConstraintsFechaHora.gridy = 0;
		this.gridBagConstraintsFechaHora.gridx = 0;
		this.gridBagConstraintsFechaHora.ipadx = 0;
		this.gridBagConstraintsFechaHora.insets = new Insets(2, 2, 2, 2);
		
		this.add(this.jDateChooserFecha, this.gridBagConstraintsFechaHora);
		
		
		
		this.gridBagConstraintsFechaHora = new GridBagConstraints();
		
		this.gridBagConstraintsFechaHora.fill = GridBagConstraints.NONE;//HORIZONTAL
		this.gridBagConstraintsFechaHora.anchor=GridBagConstraints.WEST;
		this.gridBagConstraintsFechaHora.gridy = 0;
		this.gridBagConstraintsFechaHora.gridx = 1;
		this.gridBagConstraintsFechaHora.ipadx = 0;
		this.gridBagConstraintsFechaHora.insets = new Insets(2, 2, 2, 2);
		
		this.add(this.jSpinnerHora, this.gridBagConstraintsFechaHora);

	}
	
	public void setDate(Timestamp timestamp) {
		this.setValor(timestamp);
	}
	
	public void setValue(Timestamp timestamp) {
		this.setValor(timestamp);
	}
	
	public void setValor(Timestamp timestamp) {
		this.jDateChooserFecha.setDate(timestamp);
		
		Time time=new Time(timestamp.getTime());
		
		this.jSpinnerHora.setValue(time);
	}
	
	public void setDateFormatString(String sDateFormat) {
		this.jDateChooserFecha.setDateFormatString(sDateFormat);
	}
	
	public Timestamp getDate() {
		return this.getValor();
	}
	
	public Timestamp getValue() {
		return this.getValor();
	}
	
	public Timestamp getValor() {//Date
		/*
		String sTimestamp=this.jDateChooserFecha.getDate().toString();
		sTimestamp+=" "+this.jSpinnerHora.getValue();
		
		Timestamp timestamp=Timestamp.valueOf(sTimestamp);
		
		//return this.jDateChooserFecha.getDate();
		*/
		
		String sDateTime ="";
		
		//DATE
		DateFormat dateFormatDate = new SimpleDateFormat("yyyy-MM-dd");		
		String sDate = dateFormatDate.format(this.jDateChooserFecha.getDate());
		sDateTime =sDate;
		
		
		//TIME
		DateFormat dateFormatTime = new SimpleDateFormat("HH:mm:ss");
		Time time=new Time(((Date)this.jSpinnerHora.getValue()).getTime());
		
		String sTimeValue=dateFormatTime.format(time);		
		//String sTimeValue=this.jSpinnerHora.getValue().toString();
		
		JFormattedTextField jFormattedTextFieldEditor=(JFormattedTextField)this.jSpinnerHora.getEditor().getComponent(0);
		
		if(!jFormattedTextFieldEditor.getText().equals("")) {
			sTimeValue=jFormattedTextFieldEditor.getText();
    	}
		
		//DATETIME
		sDateTime=sDateTime + " "+sTimeValue;
		
		
		Timestamp timestamp=Timestamp.valueOf(sDateTime);
		
		
		return timestamp;
	}

	public JDateChooser getjDateChooserFecha() {
		return jDateChooserFecha;
	}

	public void setjDateChooserFecha(JDateChooser jDateChooserFecha) {
		this.jDateChooserFecha = jDateChooserFecha;
	}

	public JSpinner getjSpinnerHora() {
		return jSpinnerHora;
	}

	public void setjSpinnerHora(JSpinner jSpinnerHora) {
		this.jSpinnerHora = jSpinnerHora;
	}
	
	
}
