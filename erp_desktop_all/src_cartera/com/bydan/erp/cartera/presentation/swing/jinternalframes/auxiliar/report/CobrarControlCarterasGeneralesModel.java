/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report;


import java.sql.Time;


import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

//import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

//import com.bydan.erp.cartera.util.CobrarControlCarterasGeneralesConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarControlCarterasGeneralesParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarControlCarterasGeneralesParameterGeneral;

import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.CobrarControlCarterasGeneralesBeanSwingJInternalFrame;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;






import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

//import org.hibernate.collection.PersistentBag;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.CobrarControlCarterasGeneralesJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.CobrarControlCarterasGeneralesDetalleFormJInternalFrame;

import java.util.EventObject;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;



import com.bydan.erp.seguridad.business.entity.*;


import com.bydan.erp.seguridad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class CobrarControlCarterasGeneralesModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_ID
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECIUDAD
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREZONA
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBREVENDEDOR
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CODIGO
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NOMBRECOMPLETO
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_LIMITECREDITO
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_REPRESENTANTE
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAPAGO
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_NUMEROFACTURA
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIRECCIONDIRECCION
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_TELEFONOTELEFONO
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAEMISIO
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_FECHAVENCE
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DIAS
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_SALDO
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_DEBITOMONELOCAL
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_CREDITOMONELOCAL
										,CobrarControlCarterasGeneralesConstantesFunciones.LABEL_HORAPAGO
										};
	   
	    public List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneraless;
	  	 
	    //NO SE UTILIZA
	    public CobrarControlCarterasGeneralesModel(List<CobrarControlCarterasGenerales> cobrarcontrolcarterasgeneraless,JInternalFrameBase jInternalFrameBase) {
	    	this.cobrarcontrolcarterasgeneraless=cobrarcontrolcarterasgeneraless;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public CobrarControlCarterasGeneralesModel(JInternalFrameBase jInternalFrameBase) {
	    	this.cobrarcontrolcarterasgeneraless=new ArrayList<CobrarControlCarterasGenerales>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.cobrarcontrolcarterasgeneraless.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getIsSelected();
	            
				case 1: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getId();
				case 2: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getnombre_ciudad();
				case 3: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getnombre_zona();
				case 4: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getnombre_vendedor();
				case 5: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getcodigo();
				case 6: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getnombre_completo();
				case 7: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getlimite_credito();
				case 8: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getrepresentante();
				case 9: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getdia_pago();
				case 10: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getnumero_comprobante();
				case 11: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getnumero_factura();
				case 12: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getdireccion_direccion();
				case 13: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).gettelefono_telefono();
				case 14: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getfecha_emisio();
				case 15: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getfecha_vence();
				case 16: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getdias();
				case 17: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getsaldo();
				case 18: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getdebito_mone_local();
				case 19: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).getcredito_mone_local();
				case 20: return this.cobrarcontrolcarterasgeneraless.get(rowIndex).gethora_pago();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return String.class;
				case 3: return String.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return Double.class;
				case 8: return String.class;
				case 9: return Integer.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return Date.class;
				case 15: return Date.class;
				case 16: return Integer.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Time.class;	            
	            default: return String.class;
	        }	    		        
	    }
	 
	    @Override
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	    	switch (columnIndex) {
				case 0: return true;
            	
				case 1: return true;
				case 2: return true;
				case 3: return true;
				case 4: return true;
				case 5: return true;
				case 6: return true;
				case 7: return true;
				case 8: return true;
				case 9: return true;
				case 10: return true;
				case 11: return true;
				case 12: return true;
				case 13: return true;
				case 14: return true;
				case 15: return true;
				case 16: return true;
				case 17: return true;
				case 18: return true;
				case 19: return true;
				case 20: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	CobrarControlCarterasGenerales cobrarcontrolcarterasgenerales = this.cobrarcontrolcarterasgeneraless.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			CobrarControlCarterasGeneralesBeanSwingJInternalFrame cobrarcontrolcarterasgeneralesBeanSwingJInternalFrame=(CobrarControlCarterasGeneralesBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {cobrarcontrolcarterasgenerales.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {cobrarcontrolcarterasgenerales.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {cobrarcontrolcarterasgenerales.setnombre_ciudad((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {cobrarcontrolcarterasgenerales.setnombre_zona((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {cobrarcontrolcarterasgenerales.setnombre_vendedor((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {cobrarcontrolcarterasgenerales.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {cobrarcontrolcarterasgenerales.setnombre_completo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {cobrarcontrolcarterasgenerales.setlimite_credito((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {cobrarcontrolcarterasgenerales.setrepresentante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {cobrarcontrolcarterasgenerales.setdia_pago((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {cobrarcontrolcarterasgenerales.setnumero_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {cobrarcontrolcarterasgenerales.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {cobrarcontrolcarterasgenerales.setdireccion_direccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {cobrarcontrolcarterasgenerales.settelefono_telefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {cobrarcontrolcarterasgenerales.setfecha_emisio((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {cobrarcontrolcarterasgenerales.setfecha_vence((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {cobrarcontrolcarterasgenerales.setdias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {cobrarcontrolcarterasgenerales.setsaldo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {cobrarcontrolcarterasgenerales.setdebito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {cobrarcontrolcarterasgenerales.setcredito_mone_local((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {cobrarcontrolcarterasgenerales.sethora_pago((Time) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public CobrarControlCarterasGeneralesModel(JInternalFrameBase jInternalFrameBase) {
			this.jInternalFrameBase=jInternalFrameBase;
		}
		*/
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			try {
				this.jInternalFrameBase.procesoActualizarFilaTotales();
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER FIN
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private CobrarControlCarterasGeneralesDetalleFormJInternalFrame cobrarcontrolcarterasgeneralesJInternalFrame=null;
		
		public CobrarControlCarterasGeneralesModel(CobrarControlCarterasGeneralesDetalleFormJInternalFrame cobrarcontrolcarterasgeneralesJInternalFrame) {
			this.cobrarcontrolcarterasgeneralesJInternalFrame=cobrarcontrolcarterasgeneralesJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonActualizarToolBarCobrarControlCarterasGenerales();
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonActualizarToolBarCobrarControlCarterasGenerales())) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonEliminarToolBarCobrarControlCarterasGenerales();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonEliminarToolBarCobrarControlCarterasGenerales())) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonCancelarToolBarCobrarControlCarterasGenerales();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonCancelarToolBarCobrarControlCarterasGenerales())) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jComboBoxid_empresaCobrarControlCarterasGenerales;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jSpinnerhora_pagoCobrarControlCarterasGenerales)) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales)) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonEliminarCobrarControlCarterasGenerales;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonEliminarCobrarControlCarterasGenerales)) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonActualizarCobrarControlCarterasGenerales;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonActualizarCobrarControlCarterasGenerales)) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonCancelarCobrarControlCarterasGenerales;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jComboBoxid_empresaCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_ciudadCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_ciudadCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnombre_zonaCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnombre_zonaCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_vendedorCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_vendedorCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldcodigoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldcodigoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_completoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_completoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldlimite_creditoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldlimite_creditoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextArearepresentanteCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextArearepresentanteCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddia_pagoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddia_pagoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnumero_facturaCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnumero_facturaCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreadireccion_direccionCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreadireccion_direccionCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreatelefono_telefonoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreatelefono_telefonoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_emisioCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_emisioCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_venceCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_venceCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddiasCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddiasCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldsaldoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldsaldoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddebito_mone_localCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddebito_mone_localCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldcredito_mone_localCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldcredito_mone_localCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jSpinnerhora_pagoCobrarControlCarterasGenerales;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonActualizarToolBarCobrarControlCarterasGenerales();
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonEliminarToolBarCobrarControlCarterasGenerales())) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonActualizarToolBarCobrarControlCarterasGenerales();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonCancelarToolBarCobrarControlCarterasGenerales())) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonEliminarToolBarCobrarControlCarterasGenerales();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jComboBoxid_empresaCobrarControlCarterasGenerales)) {
				
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonCancelarToolBarCobrarControlCarterasGenerales();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales)) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jSpinnerhora_pagoCobrarControlCarterasGenerales;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonEliminarCobrarControlCarterasGenerales)) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jComboBoxTiposAccionesFormularioCobrarControlCarterasGenerales;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonActualizarCobrarControlCarterasGenerales)) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonEliminarCobrarControlCarterasGenerales;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonCancelarCobrarControlCarterasGenerales)) {
				componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jButtonActualizarCobrarControlCarterasGenerales;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jComboBoxid_empresaCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_ciudadCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_emision_hastaCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnombre_zonaCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_ciudadCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_vendedorCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnombre_zonaCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldcodigoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_vendedorCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_completoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldcodigoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldlimite_creditoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreanombre_completoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextArearepresentanteCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldlimite_creditoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddia_pagoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextArearepresentanteCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddia_pagoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnumero_facturaCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnumero_comprobanteCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreadireccion_direccionCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldnumero_facturaCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreatelefono_telefonoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreadireccion_direccionCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_emisioCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextAreatelefono_telefonoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_venceCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_emisioCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddiasCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jDateChooserfecha_venceCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldsaldoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddiasCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddebito_mone_localCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldsaldoCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldcredito_mone_localCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFielddebito_mone_localCobrarControlCarterasGenerales;
			return componentTab;
		}

		if(component!=null && component.equals(this.cobrarcontrolcarterasgeneralesJInternalFrame.jSpinnerhora_pagoCobrarControlCarterasGenerales)) {
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.jTextFieldcredito_mone_localCobrarControlCarterasGenerales;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonActualizarToolBarCobrarControlCarterasGenerales();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonActualizarToolBarCobrarControlCarterasGenerales();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.cobrarcontrolcarterasgeneralesJInternalFrame.getjButtonCancelarToolBarCobrarControlCarterasGenerales();
			
			
			return componentTab;		
		}
		
		public CobrarControlCarterasGeneralesDetalleFormJInternalFrame getcobrarcontrolcarterasgeneralesJInternalFrame() {
			return this.cobrarcontrolcarterasgeneralesJInternalFrame;
		}
		
		public void setcobrarcontrolcarterasgeneralesJInternalFrame(CobrarControlCarterasGeneralesDetalleFormJInternalFrame cobrarcontrolcarterasgeneralesJInternalFrame) {
			this.cobrarcontrolcarterasgeneralesJInternalFrame=cobrarcontrolcarterasgeneralesJInternalFrame;
		}
		
		public Component getComponentTab() {
			return this.componentTab;
		}
		
		public void setComponentTab(Component componentTab) {
			this.componentTab=componentTab;
		}
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY FIN*/
		
		
		/*FUNCIONES PARA AbstractTableModel*/
		/*
		Notas:
		* Si Cambia version se copia variables y metodos que no son sobreescritos en esta clase.(Usa Jdk 8)
		* Se copia del Jdk javax.swing.table.AbstractTableModel
		* Los argumentos usados es de tipo Interface TableModel no de Clase AbstractTableModel
		* Si se cambia y/o actualiza jdj, toca actualizar el código nuevamente
		*/
		
		protected EventListenerList listenerList = new EventListenerList();

		public int findColumn(String columnName) {
			for (int i = 0; i < getColumnCount(); i++) {
				if (columnName.equals(getColumnName(i))) {
					return i;
				}
			}
			return -1;
		}
		
		public void addTableModelListener(TableModelListener l) {
        	listenerList.add(TableModelListener.class, l);
    	}
		
		public void removeTableModelListener(TableModelListener l) {
        	listenerList.remove(TableModelListener.class, l);
    	}
		
		public TableModelListener[] getTableModelListeners() {
			return listenerList.getListeners(TableModelListener.class);
		}
		
		public void fireTableDataChanged() {
			fireTableChanged(new TableModelEvent(this));
		}
		
		public void fireTableStructureChanged() {
        	fireTableChanged(new TableModelEvent(this, TableModelEvent.HEADER_ROW));
    	}
		
		public void fireTableRowsInserted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
		}
	
		public void fireTableRowsUpdated(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE));
		}
		
		public void fireTableRowsDeleted(int firstRow, int lastRow) {
			fireTableChanged(new TableModelEvent(this, firstRow, lastRow,
								TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE));
		}
	
		public void fireTableCellUpdated(int row, int column) {
			fireTableChanged(new TableModelEvent(this, row, row, column));
		}
		
		public void fireTableChanged(TableModelEvent e) {
			// Guaranteed to return a non-null array
			Object[] listeners = listenerList.getListenerList();
			// Process the listeners last to first, notifying
			// those that are interested in this event
			for (int i = listeners.length-2; i>=0; i-=2) {
				if (listeners[i]==TableModelListener.class) {
					((TableModelListener)listeners[i+1]).tableChanged(e);
				}
			}
		}
		
		public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
			return listenerList.getListeners(listenerType);
		}
		/*FUNCIONES PARA AbstractTableModel FIN*/
}
