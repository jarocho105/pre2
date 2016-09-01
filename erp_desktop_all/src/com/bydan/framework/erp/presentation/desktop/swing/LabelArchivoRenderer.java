package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import org.jdesktop.beansbinding.Converter;

import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.Constantes2;
import com.bydan.framework.erp.util.Funciones2;

@SuppressWarnings("unused")
public class LabelArchivoRenderer extends DefaultTableCellRenderer implements TableCellRenderer{	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	/*
	protected JTextField jtextField = new JTextField();
	protected String sLabel=""; 	
	protected Boolean conRowLabel=false;
	*/
	protected String sToolTip="";
	protected Border borderResaltar=null;
	protected Boolean conEnabled=true;
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	
	public LabelArchivoRenderer() {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.sToolTip="";
		this.conEnabled=true;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}

	public LabelArchivoRenderer(Border borderResaltar,Boolean conEnabled) {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public LabelArchivoRenderer(Border borderResaltar) {
		this(borderResaltar,true);
	}
	
	public LabelArchivoRenderer(String sLabel,Boolean conEnabled) {
		/*
		this.jtextField = new JTextField();
		this.sLabel=sLabel;
		*/
		this.sToolTip="";
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public LabelArchivoRenderer(String sLabel) {
		this(sLabel,true);
	}
	
	public LabelArchivoRenderer(Boolean conRowLabel,Boolean conEnabled) {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";				
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip="";
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public LabelArchivoRenderer(Boolean conRowLabel) {
		this(conRowLabel,true);
	}
	
	public LabelArchivoRenderer(Boolean conRowLabel,String sToolTip,Boolean conEnabled) {
		/*
		this.jtextField = new JTextField();
		this.sLabel="";		
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip=sToolTip;
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
	}
	
	public LabelArchivoRenderer(Boolean conRowLabel,String sToolTip) {
		this(conRowLabel,sToolTip,true);
	}
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		Component component=super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		
		if(this.sToolTip!="") {
	    	this.setToolTipText(this.sToolTip);
	    }
		
		if(this.borderResaltar!=null) {
			this.setBorder(this.borderResaltar);
		}
		
		//this.setBorder(Funciones2.getBorderResaltar());
		
		this.setOpaque(true);
	    this.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //Funciones2.getColorFilaTabla1()
	   
	    
	    
	    //NO VALE (ES PARA IMAGENES)
	    /*
	    Image imageActual=null;
	    ImageIcon imageIcon = null;//createImageIcon("images/" + name + ".gif");	            
       
	    this.setText("Imagen");
	    
	    if(value!=null) {
	    	this.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*3,Constantes2.ISWING_ALTO_CONTROL_LABEL*5));
        	this.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*3,Constantes2.ISWING_ALTO_CONTROL_LABEL*5));
        	this.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL*3,Constantes2.ISWING_ALTO_CONTROL_LABEL*5));
    		
	    	//imageActual=ImageIO.read(this.jFileChooserimagenClienteImagen.getSelectedFile()).getScaledInstance(this.jLabelImagenimagenClienteImagen.getWidth(), this.jLabelImagenimagenClienteImagen.getHeight(), Image.SCALE_DEFAULT);
        	//imageIcon=new ImageIcon((byte[])value);
        	
        	imageActual=FuncionesSwing.getImageFromBytes((byte[])value);
        	
        	if(imageActual!=null) {
        		imageIcon=new ImageIcon(imageActual);
        		
        		if (imageIcon != null) {        	        	
                	this.setIcon(imageIcon);        	
                    this.setText(null);            
                    this.updateUI();
                } else {
                	this.setText("Imagen no Encontrada");
                }
        	}	    	
	    }
	    */
        
		
	    this.setEnabled(this.conEnabled);
	    
	    if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldLabel(this, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
	    
		return this;
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}
}