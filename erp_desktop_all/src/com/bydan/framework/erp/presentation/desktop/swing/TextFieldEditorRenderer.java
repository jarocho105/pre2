package com.bydan.framework.erp.presentation.desktop.swing;

import java.awt.Component;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventObject;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import org.jdesktop.beansbinding.Converter;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.TipoBancoBeanSwingJInternalFrame;
import com.bydan.framework.erp.util.Funciones;
import com.bydan.framework.erp.util.Funciones2;
import com.toedter.calendar.JDateChooser;

@SuppressWarnings("unused")
public class TextFieldEditorRenderer extends DefaultCellEditor  {
	private static final long serialVersionUID = 1L;
	
	/*
	protected JCheckBox jcheckBox = new JCheckBox();
	protected String sLabel=""; 
	protected Boolean conRowLabel=false;
	*/
	protected String sToolTip="";
	protected Boolean conEnabled=true;
	protected JTextField jTextField = new JTextField();
	protected Border borderResaltar=null;
	protected Class<? extends Object> classBase=null;
	
	public JInternalFrameBase jInternalFrameBase;
	protected Boolean conHotKeys=false;
	protected String sNombreHotKeyAbstractAction="";
	protected String sTipoBusqueda="NINGUNO";
	protected Boolean conEditorDobleClic=false;
	
	public TextFieldEditorRenderer() {
		super(new JTextField());	
		/*
		super(new JCheckBox());		
		this.jcheckBox = new JCheckBox();
		this.sLabel="";
		*/
		this.sToolTip="";
		this.conEnabled=true;
		this.jTextField = new JTextField();
		this.classBase=String.class;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
		this.conEditorDobleClic=false;
	}
	
	public TextFieldEditorRenderer(String sLabel,Boolean conEnabled) {
		super(new JTextField());	
		/*
		super(new JCheckBox());		
		this.jcheckBox = new JCheckBox();
		this.sLabel=sLabel;
		*/
		this.sToolTip="";
		this.conEnabled=true;
		this.jTextField = new JTextField();
		this.conEnabled=conEnabled;
		this.classBase=String.class;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
		this.conEditorDobleClic=false;
	}
	
	public TextFieldEditorRenderer(String sLabel) {
		this(sLabel,true);
	}
	
	public TextFieldEditorRenderer(Boolean conRowLabel,Boolean conEnabled) {
		super(new JTextField());
		/*
		this.jcheckBox = new JCheckBox();
		this.sLabel="";		
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip="";
		this.conEnabled=true;
		this.jTextField = new JTextField();
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
		this.conEditorDobleClic=false;
	}
	
	public TextFieldEditorRenderer(Boolean conRowLabel) {
		this(conRowLabel,true);
	}
	
	public TextFieldEditorRenderer(Boolean conRowLabel,String sToolTip,Boolean conEnabled) {
		super(new JTextField());
		/*
		this.jcheckBox = new JCheckBox();
		this.sLabel="";		
		this.conRowLabel=conRowLabel;
		*/
		this.sToolTip=sToolTip;
		this.conEnabled=true;
		this.jTextField = new JTextField();
		this.conEnabled=conEnabled;
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
		this.conEditorDobleClic=false;
	}
	
	public TextFieldEditorRenderer(Boolean conRowLabel,String sToolTip) {
		this(conRowLabel,sToolTip,true);
	}
	
	public TextFieldEditorRenderer(Border borderResaltar,Boolean conEnabled,JInternalFrameBase jInternalFrameBase,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda,Boolean conEditorDobleClic) {
		super(new JTextField());
		
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.conEnabled=conEnabled;
		this.jTextField = new JTextField();
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
		this.conEditorDobleClic=conEditorDobleClic;
	}
	
	public TextFieldEditorRenderer(Border borderResaltar,Boolean conEnabled,JInternalFrameBase jInternalFrameBase,Boolean conHotKeys,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		super(new JTextField());
		
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.conEnabled=conEnabled;
		this.jTextField = new JTextField();
		
		this.conHotKeys=conHotKeys;
		this.sNombreHotKeyAbstractAction=sNombreHotKeyAbstractAction;
		this.sTipoBusqueda=sTipoBusqueda;
		this.jInternalFrameBase=jInternalFrameBase;
		this.conEditorDobleClic=false;//conEditorDobleClic;
	}
	
	public TextFieldEditorRenderer(Border borderResaltar,Boolean conEnabled) {
		super(new JTextField());
		
		/*
		this.jtextField = new JTextField();
		this.sLabel="";
		*/
		this.borderResaltar=borderResaltar;
		this.sToolTip="";
		this.conEnabled=conEnabled;
		this.jTextField = new JTextField();
		
		this.conHotKeys=false;
		this.sNombreHotKeyAbstractAction="";
		this.sTipoBusqueda="NINGUNO";
		//this.jInternalFrameBase=jInternalFrameBase;
		this.conEditorDobleClic=false;
	}
	
	public Boolean getConEnabled() {
		return conEnabled;
	}

	public void setConEnabled(Boolean conEnabled) {
		this.conEnabled = conEnabled;
	}	
	
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		//CON TEXTO
		
		this.jTextField = new JTextField();
		 
		if (value != null) {
			String sValue="";
			
			this.classBase=value.getClass();						
			
			/*			
			
			Integer iValue=0;
			
			if(classBase.equals(Integer.class)) {
				iValue=Integer.parseInt(value.toString());
				//sValue=iValue.toString();
				
			} else {
				sValue=(String)value;
			}	
			*/
			
			//ERROR
		   	//sValue=(String)value;
    		
			
			sValue=value.toString();
			
		   	this.jTextField.setText(sValue);		    
		}
		   		    		
		this.jTextField.setHorizontalAlignment(JLabel.CENTER);
		    				
		if(this.sToolTip!="") {
		   	this.jTextField.setToolTipText(this.sToolTip+"-"+(row+1));
		}		 		
		
		//this.jTextField.setMargin(new Insets(0, 0, 0, 0));
		
		this.jTextField.setHorizontalAlignment(JTextField.LEFT);
		
		this.jTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		//this.jTextField.setFont(new Font("Serif", Font.ITALIC, 10));
		
		this.jTextField.setEnabled(this.conEnabled);
		
		
		if(this.conHotKeys) {
			this.jInternalFrameBase.setHotKeysJTextFieldGenerico(this.jTextField,this.jInternalFrameBase,this.sNombreHotKeyAbstractAction,this.sTipoBusqueda);
		}
		
		//System.out.println("EDITOR RENDERER="+this.conHotKeys);
		
		if(this.jInternalFrameBase!=null) {
			if(this.jInternalFrameBase.getConTipoTamanioTodo()) {
				FuncionesSwing.setBoldTextField(this.jTextField, this.jInternalFrameBase.getsTipoTamanioGeneralTabla(),true,false,this.jInternalFrameBase);
			}
		}
		
		return this.jTextField;
		
		
		/*
		Component component=super.getTableCellEditorComponent(table, value, isSelected, row, column);
		
		JComponent jcomponent=(JComponent)component;
		
		//this.jcheckBox=((JCheckBox)component);
		
		if(this.sToolTip!="") {
			jcomponent.setToolTipText(this.sToolTip+"-"+(row+1));
		}
		
		//this.component.setEnabled(this.conEnabled);
		
		return component;
		*/
		
		/*
		Component component=super.getTableCellEditorComponent(table, value, isSelected, row, column);
		
		this.jTextField=(JTextField)component;
		
		//this.jcheckBox=((JCheckBox)component);
		
		if(this.sToolTip!="") {
			this.jTextField.setToolTipText(this.sToolTip+"-"+(row+1));
		}
		
		this.jTextField.setEnabled(this.conEnabled);
		
		this.jTextField.setMargin(new Insets(0, 0, 0, 0));
		
		return this.jTextField;
		*/
   }
	
	
	@Override
	public boolean stopCellEditing() {		
		//System.out.println("STOP="+this.jTextField.getText());
		
		fireEditingStopped();
		
		return true;								
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public Object getCellEditorValue() {
		Object value=new Object();
		Component component=null;
		Integer iValue=0;
		Boolean bValue=false;
		Date dtValue=new Date();
		Long lValue=0L;
		Short shValue=0;
		String sValue="";
		Double dValue=0.0;
		byte[] byValue=null;
		
	    try {
	    	/*
	    	component=this.getComponent();
	    	
	    	if(component instanceof JTextField) {
	    		value=((JTextField)component).getText();
	    	}
	    	*/
	    	
	    	if(this.classBase.equals(Integer.class)) {
	    		iValue=Integer.parseInt(this.jTextField.getText());
	    		value=iValue;
	    		
	    	} else if(this.classBase.equals(Boolean.class)) {
	    		bValue=Boolean.parseBoolean(this.jTextField.getText());
	    		value=bValue;
	    	
	    	} else if(this.classBase.equals(Date.class)) {
	    		dtValue=new Date(Date.parse(this.jTextField.getText()));
	    		value=dtValue;
	    		
	    	} else if(this.classBase.equals(Long.class)) {
	    		lValue=Long.parseLong(this.jTextField.getText());
	    		value=lValue;
	    		
	    	} else if(this.classBase.equals(Short.class)) {
	    		shValue=Short.parseShort(this.jTextField.getText());
	    		value=shValue;
	    		
	    	} else if(this.classBase.equals(Double.class)) {
	    		dValue=Double.parseDouble(this.jTextField.getText());
	    		value=dValue;
	    		
	    	} else if(this.classBase.equals(String.class)) {
	    		sValue=this.jTextField.getText();
	    		value=sValue;
	    		
	    	} else {
	    		sValue=this.jTextField.getText();
	    		value=sValue;
	    	}
	    	
	    	
	    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //System.out.println("GET VALUE="+value);
	    //System.out.println(this.sNombreHotKeyAbstractAction);
	    //System.out.println(this.sTipoBusqueda);
	    
	    return value;
	}
	
	@Override
    public boolean isCellEditable(EventObject e) {
        //return false;
		
		//SE EDITA SOLO CON DOBLE CLIC,(PARA QUE SE OBLIGUE A LOST FOCUS Y SEA STANDARD LA EDICION)
		Boolean isCellEditable=false;
		int clickCount=0;
		
		if(this.conEditorDobleClic) {
			 if (e instanceof MouseEvent) {           
		            // For single-click activation
		            //clickCount = 1;
	
		            // For double-click activation
		            clickCount = 2;
	
		            // For triple-click activation
		            //clickCount = 3;
	
		            if(((MouseEvent)e).getClickCount() >= clickCount) {
		            	isCellEditable=true;
		            }	            	            
		     }
			 
		     //return true;
			 
		} else {
			isCellEditable=true;
		}
		
		 return isCellEditable;
        
    }
	
	/*	
	
    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return true;
    }

    @Override
    public void cancelCellEditing() {
        fireEditingCanceled();

    }
    */ 
}