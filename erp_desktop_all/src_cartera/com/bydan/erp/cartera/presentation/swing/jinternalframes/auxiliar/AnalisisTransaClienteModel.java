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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.cartera.util.AnalisisTransaClienteConstantesFunciones;
import com.bydan.erp.cartera.util.AnalisisTransaClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.AnalisisTransaClienteParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.AnalisisTransaClienteBeanSwingJInternalFrame;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.AnalisisTransaClienteJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.AnalisisTransaClienteDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class AnalisisTransaClienteModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,AnalisisTransaClienteConstantesFunciones.LABEL_ID
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDEMPRESA
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDMODULO
										,AnalisisTransaClienteConstantesFunciones.LABEL_NOMBRE
										,AnalisisTransaClienteConstantesFunciones.LABEL_DESCRIPCION
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION1
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION2
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION3
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION4
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION5
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION6
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION7
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION8
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION9
										,AnalisisTransaClienteConstantesFunciones.LABEL_IDTRANSACCION10
										};
	   
	    public List<AnalisisTransaCliente> analisistransaclientes;
	  	 
	    //NO SE UTILIZA
	    public AnalisisTransaClienteModel(List<AnalisisTransaCliente> analisistransaclientes,JInternalFrameBase jInternalFrameBase) {
	    	this.analisistransaclientes=analisistransaclientes;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public AnalisisTransaClienteModel(JInternalFrameBase jInternalFrameBase) {
	    	this.analisistransaclientes=new ArrayList<AnalisisTransaCliente>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.analisistransaclientes.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.analisistransaclientes.get(rowIndex).getIsSelected();
	            
				case 1: return this.analisistransaclientes.get(rowIndex).getId();
				case 2: return this.analisistransaclientes.get(rowIndex).getid_empresa();
				case 3: return this.analisistransaclientes.get(rowIndex).getid_modulo();
				case 4: return this.analisistransaclientes.get(rowIndex).getnombre();
				case 5: return this.analisistransaclientes.get(rowIndex).getdescripcion();
				case 6: return this.analisistransaclientes.get(rowIndex).getid_transaccion();
				case 7: return this.analisistransaclientes.get(rowIndex).getid_transaccion1();
				case 8: return this.analisistransaclientes.get(rowIndex).getid_transaccion2();
				case 9: return this.analisistransaclientes.get(rowIndex).getid_transaccion3();
				case 10: return this.analisistransaclientes.get(rowIndex).getid_transaccion4();
				case 11: return this.analisistransaclientes.get(rowIndex).getid_transaccion5();
				case 12: return this.analisistransaclientes.get(rowIndex).getid_transaccion6();
				case 13: return this.analisistransaclientes.get(rowIndex).getid_transaccion7();
				case 14: return this.analisistransaclientes.get(rowIndex).getid_transaccion8();
				case 15: return this.analisistransaclientes.get(rowIndex).getid_transaccion9();
				case 16: return this.analisistransaclientes.get(rowIndex).getid_transaccion10();	            
	            default: return null;
	        }
	    }
	 
	    @Override
	    public Class<?> getColumnClass(int columnIndex) {
	    	switch (columnIndex) {
				case 0: return Boolean.class;
	            
				case 1: return Long.class;
				case 2: return Long.class;
				case 3: return Long.class;
				case 4: return String.class;
				case 5: return String.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	AnalisisTransaCliente analisistransacliente = this.analisistransaclientes.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			AnalisisTransaClienteBeanSwingJInternalFrame analisistransaclienteBeanSwingJInternalFrame=(AnalisisTransaClienteBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {analisistransacliente.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {analisistransacliente.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {analisistransacliente.setid_empresa((Long) value);analisistransacliente.setempresa_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {analisistransacliente.setid_modulo((Long) value);analisistransacliente.setmodulo_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {analisistransacliente.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {analisistransacliente.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {analisistransacliente.setid_transaccion((Long) value);analisistransacliente.settransaccion_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {analisistransacliente.setid_transaccion1((Long) value);analisistransacliente.settransaccion1_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion1ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {analisistransacliente.setid_transaccion2((Long) value);analisistransacliente.settransaccion2_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion2ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {analisistransacliente.setid_transaccion3((Long) value);analisistransacliente.settransaccion3_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion3ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {analisistransacliente.setid_transaccion4((Long) value);analisistransacliente.settransaccion4_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion4ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {analisistransacliente.setid_transaccion5((Long) value);analisistransacliente.settransaccion5_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion5ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {analisistransacliente.setid_transaccion6((Long) value);analisistransacliente.settransaccion6_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion6ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {analisistransacliente.setid_transaccion7((Long) value);analisistransacliente.settransaccion7_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion7ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {analisistransacliente.setid_transaccion8((Long) value);analisistransacliente.settransaccion8_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion8ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {analisistransacliente.setid_transaccion9((Long) value);analisistransacliente.settransaccion9_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion9ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {analisistransacliente.setid_transaccion10((Long) value);analisistransacliente.settransaccion10_descripcion(analisistransaclienteBeanSwingJInternalFrame.getActualTransaccion10ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private AnalisisTransaClienteDetalleFormJInternalFrame analisistransaclienteJInternalFrame=null;
		
		public AnalisisTransaClienteModel(AnalisisTransaClienteDetalleFormJInternalFrame analisistransaclienteJInternalFrame) {
			this.analisistransaclienteJInternalFrame=analisistransaclienteJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.analisistransaclienteJInternalFrame.getjButtonActualizarToolBarAnalisisTransaCliente();
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.getjButtonActualizarToolBarAnalisisTransaCliente())) {
				componentTab=this.analisistransaclienteJInternalFrame.getjButtonEliminarToolBarAnalisisTransaCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.getjButtonEliminarToolBarAnalisisTransaCliente())) {
				componentTab=this.analisistransaclienteJInternalFrame.getjButtonCancelarToolBarAnalisisTransaCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.getjButtonCancelarToolBarAnalisisTransaCliente())) {
				componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_empresaAnalisisTransaCliente;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion10AnalisisTransaCliente)) {
				componentTab=this.analisistransaclienteJInternalFrame.jComboBoxTiposAccionesFormularioAnalisisTransaCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxTiposAccionesFormularioAnalisisTransaCliente)) {
				componentTab=this.analisistransaclienteJInternalFrame.jButtonEliminarAnalisisTransaCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jButtonEliminarAnalisisTransaCliente)) {
				componentTab=this.analisistransaclienteJInternalFrame.jButtonActualizarAnalisisTransaCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jButtonActualizarAnalisisTransaCliente)) {
				componentTab=this.analisistransaclienteJInternalFrame.jButtonCancelarAnalisisTransaCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_empresaAnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_moduloAnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_moduloAnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jTextAreanombreAnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jTextAreanombreAnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jTextAreadescripcionAnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jTextAreadescripcionAnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccionAnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccionAnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion1AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion1AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion2AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion2AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion3AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion3AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion4AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion4AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion5AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion5AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion6AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion6AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion7AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion7AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion8AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion8AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion9AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion9AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion10AnalisisTransaCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.analisistransaclienteJInternalFrame.getjButtonActualizarToolBarAnalisisTransaCliente();
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.getjButtonEliminarToolBarAnalisisTransaCliente())) {
				componentTab=this.analisistransaclienteJInternalFrame.getjButtonActualizarToolBarAnalisisTransaCliente();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.getjButtonCancelarToolBarAnalisisTransaCliente())) {
				componentTab=this.analisistransaclienteJInternalFrame.getjButtonEliminarToolBarAnalisisTransaCliente();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_empresaAnalisisTransaCliente)) {
				
				componentTab=this.analisistransaclienteJInternalFrame.getjButtonCancelarToolBarAnalisisTransaCliente();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxTiposAccionesFormularioAnalisisTransaCliente)) {
				componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion10AnalisisTransaCliente;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jButtonEliminarAnalisisTransaCliente)) {
				componentTab=this.analisistransaclienteJInternalFrame.jComboBoxTiposAccionesFormularioAnalisisTransaCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jButtonActualizarAnalisisTransaCliente)) {
				componentTab=this.analisistransaclienteJInternalFrame.jButtonEliminarAnalisisTransaCliente;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jButtonCancelarAnalisisTransaCliente)) {
				componentTab=this.analisistransaclienteJInternalFrame.jButtonActualizarAnalisisTransaCliente;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_moduloAnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_empresaAnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jTextAreanombreAnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_moduloAnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jTextAreadescripcionAnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jTextAreanombreAnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccionAnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jTextAreadescripcionAnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion1AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccionAnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion2AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion1AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion3AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion2AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion4AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion3AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion5AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion4AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion6AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion5AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion7AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion6AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion8AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion7AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion9AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion8AnalisisTransaCliente;
			return componentTab;
		}

		if(component!=null && component.equals(this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion10AnalisisTransaCliente)) {
			componentTab=this.analisistransaclienteJInternalFrame.jComboBoxid_transaccion9AnalisisTransaCliente;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.analisistransaclienteJInternalFrame.getjButtonActualizarToolBarAnalisisTransaCliente();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.analisistransaclienteJInternalFrame.getjButtonActualizarToolBarAnalisisTransaCliente();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.analisistransaclienteJInternalFrame.getjButtonCancelarToolBarAnalisisTransaCliente();
			
			
			return componentTab;		
		}
		
		public AnalisisTransaClienteDetalleFormJInternalFrame getanalisistransaclienteJInternalFrame() {
			return this.analisistransaclienteJInternalFrame;
		}
		
		public void setanalisistransaclienteJInternalFrame(AnalisisTransaClienteDetalleFormJInternalFrame analisistransaclienteJInternalFrame) {
			this.analisistransaclienteJInternalFrame=analisistransaclienteJInternalFrame;
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
