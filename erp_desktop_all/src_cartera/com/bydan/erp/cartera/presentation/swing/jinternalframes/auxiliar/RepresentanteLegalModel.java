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

import com.bydan.erp.cartera.util.RepresentanteLegalConstantesFunciones;
import com.bydan.erp.cartera.util.RepresentanteLegalParameterReturnGeneral;
//import com.bydan.erp.cartera.util.RepresentanteLegalParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.RepresentanteLegalBeanSwingJInternalFrame;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.RepresentanteLegalJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.RepresentanteLegalDetalleFormJInternalFrame;

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

public class RepresentanteLegalModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,RepresentanteLegalConstantesFunciones.LABEL_ID
										,RepresentanteLegalConstantesFunciones.LABEL_IDCLIENTE
										,RepresentanteLegalConstantesFunciones.LABEL_IDTIPOIDENTIFICACION
										,RepresentanteLegalConstantesFunciones.LABEL_IDPAIS
										,RepresentanteLegalConstantesFunciones.LABEL_IDCIUDAD
										,RepresentanteLegalConstantesFunciones.LABEL_IDENTIFICACION
										,RepresentanteLegalConstantesFunciones.LABEL_APELLIDOPATERNO
										,RepresentanteLegalConstantesFunciones.LABEL_APELLIDOMATERNO
										,RepresentanteLegalConstantesFunciones.LABEL_PRIMERNOMBRE
										,RepresentanteLegalConstantesFunciones.LABEL_SEGUNDONOMBRE
										,RepresentanteLegalConstantesFunciones.LABEL_DIRECCION
										,RepresentanteLegalConstantesFunciones.LABEL_TELEFONO
										,RepresentanteLegalConstantesFunciones.LABEL_TELEFONOCODIGOAREA
										,RepresentanteLegalConstantesFunciones.LABEL_EXTENSION
										,RepresentanteLegalConstantesFunciones.LABEL_TELEFONOMOVIL
										,RepresentanteLegalConstantesFunciones.LABEL_MONTOAURORIZADO
										,RepresentanteLegalConstantesFunciones.LABEL_EMAIL
										,RepresentanteLegalConstantesFunciones.LABEL_ESTAACTIVO
										};
	   
	    public List<RepresentanteLegal> representantelegals;
	  	 
	    //NO SE UTILIZA
	    public RepresentanteLegalModel(List<RepresentanteLegal> representantelegals,JInternalFrameBase jInternalFrameBase) {
	    	this.representantelegals=representantelegals;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public RepresentanteLegalModel(JInternalFrameBase jInternalFrameBase) {
	    	this.representantelegals=new ArrayList<RepresentanteLegal>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.representantelegals.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.representantelegals.get(rowIndex).getIsSelected();
	            
				case 1: return this.representantelegals.get(rowIndex).getId();
				case 2: return this.representantelegals.get(rowIndex).getidcliente();
				case 3: return this.representantelegals.get(rowIndex).getidvalorclientedocumento();
				case 4: return this.representantelegals.get(rowIndex).getid_pais();
				case 5: return this.representantelegals.get(rowIndex).getidciudad();
				case 6: return this.representantelegals.get(rowIndex).getidentificacion();
				case 7: return this.representantelegals.get(rowIndex).getapellidopaterno();
				case 8: return this.representantelegals.get(rowIndex).getapellidomaterno();
				case 9: return this.representantelegals.get(rowIndex).getprimernombre();
				case 10: return this.representantelegals.get(rowIndex).getsegundonombre();
				case 11: return this.representantelegals.get(rowIndex).getdireccion();
				case 12: return this.representantelegals.get(rowIndex).gettelefono();
				case 13: return this.representantelegals.get(rowIndex).gettelefonocodigoarea();
				case 14: return this.representantelegals.get(rowIndex).getextension();
				case 15: return this.representantelegals.get(rowIndex).gettelefonomovil();
				case 16: return this.representantelegals.get(rowIndex).getmontoaurorizado();
				case 17: return this.representantelegals.get(rowIndex).getemail();
				case 18: return this.representantelegals.get(rowIndex).getestaactivo();	            
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
				case 4: return Long.class;
				case 5: return Long.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return String.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return Double.class;
				case 17: return String.class;
				case 18: return Boolean.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	RepresentanteLegal representantelegal = this.representantelegals.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			RepresentanteLegalBeanSwingJInternalFrame representantelegalBeanSwingJInternalFrame=(RepresentanteLegalBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {representantelegal.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {representantelegal.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {representantelegal.setidcliente((Long) value);representantelegal.setcliente_descripcion(representantelegalBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {representantelegal.setidvalorclientedocumento((Long) value);representantelegal.settipoidentificacion_descripcion(representantelegalBeanSwingJInternalFrame.getActualTipoIdentificacionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {representantelegal.setid_pais((Long) value);representantelegal.setpais_descripcion(representantelegalBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {representantelegal.setidciudad((Long) value);representantelegal.setciudad_descripcion(representantelegalBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {representantelegal.setidentificacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {representantelegal.setapellidopaterno((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {representantelegal.setapellidomaterno((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {representantelegal.setprimernombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {representantelegal.setsegundonombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {representantelegal.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {representantelegal.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {representantelegal.settelefonocodigoarea((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {representantelegal.setextension((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {representantelegal.settelefonomovil((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {representantelegal.setmontoaurorizado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {representantelegal.setemail((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {representantelegal.setestaactivo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public RepresentanteLegalModel(JInternalFrameBase jInternalFrameBase) {
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
		private RepresentanteLegalDetalleFormJInternalFrame representantelegalJInternalFrame=null;
		
		public RepresentanteLegalModel(RepresentanteLegalDetalleFormJInternalFrame representantelegalJInternalFrame) {
			this.representantelegalJInternalFrame=representantelegalJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.representantelegalJInternalFrame.getjButtonActualizarToolBarRepresentanteLegal();
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.getjButtonActualizarToolBarRepresentanteLegal())) {
				componentTab=this.representantelegalJInternalFrame.getjButtonEliminarToolBarRepresentanteLegal();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.getjButtonEliminarToolBarRepresentanteLegal())) {
				componentTab=this.representantelegalJInternalFrame.getjButtonCancelarToolBarRepresentanteLegal();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.getjButtonCancelarToolBarRepresentanteLegal())) {
				componentTab=this.representantelegalJInternalFrame.jComboBoxidclienteRepresentanteLegal;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.jCheckBoxestaactivoRepresentanteLegal)) {
				componentTab=this.representantelegalJInternalFrame.jComboBoxTiposAccionesFormularioRepresentanteLegal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxTiposAccionesFormularioRepresentanteLegal)) {
				componentTab=this.representantelegalJInternalFrame.jButtonEliminarRepresentanteLegal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.jButtonEliminarRepresentanteLegal)) {
				componentTab=this.representantelegalJInternalFrame.jButtonActualizarRepresentanteLegal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.jButtonActualizarRepresentanteLegal)) {
				componentTab=this.representantelegalJInternalFrame.jButtonCancelarRepresentanteLegal;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxidclienteRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jComboBoxidvalorclientedocumentoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxidvalorclientedocumentoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jComboBoxid_paisRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxid_paisRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jComboBoxidciudadRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxidciudadRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextFieldidentificacionRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextFieldidentificacionRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreaapellidopaternoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreaapellidopaternoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreaapellidomaternoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreaapellidomaternoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreaprimernombreRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreaprimernombreRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreasegundonombreRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreasegundonombreRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreadireccionRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreadireccionRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreatelefonoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreatelefonoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextFieldtelefonocodigoareaRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextFieldtelefonocodigoareaRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextFieldextensionRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextFieldextensionRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreatelefonomovilRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreatelefonomovilRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextFieldmontoaurorizadoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextFieldmontoaurorizadoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreaemailRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreaemailRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jCheckBoxestaactivoRepresentanteLegal;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.representantelegalJInternalFrame.getjButtonActualizarToolBarRepresentanteLegal();
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.getjButtonEliminarToolBarRepresentanteLegal())) {
				componentTab=this.representantelegalJInternalFrame.getjButtonActualizarToolBarRepresentanteLegal();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.getjButtonCancelarToolBarRepresentanteLegal())) {
				componentTab=this.representantelegalJInternalFrame.getjButtonEliminarToolBarRepresentanteLegal();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxidclienteRepresentanteLegal)) {
				
				componentTab=this.representantelegalJInternalFrame.getjButtonCancelarToolBarRepresentanteLegal();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxTiposAccionesFormularioRepresentanteLegal)) {
				componentTab=this.representantelegalJInternalFrame.jCheckBoxestaactivoRepresentanteLegal;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.jButtonEliminarRepresentanteLegal)) {
				componentTab=this.representantelegalJInternalFrame.jComboBoxTiposAccionesFormularioRepresentanteLegal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.jButtonActualizarRepresentanteLegal)) {
				componentTab=this.representantelegalJInternalFrame.jButtonEliminarRepresentanteLegal;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.representantelegalJInternalFrame.jButtonCancelarRepresentanteLegal)) {
				componentTab=this.representantelegalJInternalFrame.jButtonActualizarRepresentanteLegal;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxidvalorclientedocumentoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jComboBoxidclienteRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxid_paisRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jComboBoxidvalorclientedocumentoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jComboBoxidciudadRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jComboBoxid_paisRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextFieldidentificacionRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jComboBoxidciudadRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreaapellidopaternoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextFieldidentificacionRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreaapellidomaternoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreaapellidopaternoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreaprimernombreRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreaapellidomaternoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreasegundonombreRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreaprimernombreRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreadireccionRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreasegundonombreRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreatelefonoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreadireccionRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextFieldtelefonocodigoareaRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreatelefonoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextFieldextensionRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextFieldtelefonocodigoareaRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreatelefonomovilRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextFieldextensionRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextFieldmontoaurorizadoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreatelefonomovilRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jTextAreaemailRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextFieldmontoaurorizadoRepresentanteLegal;
			return componentTab;
		}

		if(component!=null && component.equals(this.representantelegalJInternalFrame.jCheckBoxestaactivoRepresentanteLegal)) {
			componentTab=this.representantelegalJInternalFrame.jTextAreaemailRepresentanteLegal;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.representantelegalJInternalFrame.getjButtonActualizarToolBarRepresentanteLegal();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.representantelegalJInternalFrame.getjButtonActualizarToolBarRepresentanteLegal();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.representantelegalJInternalFrame.getjButtonCancelarToolBarRepresentanteLegal();
			
			
			return componentTab;		
		}
		
		public RepresentanteLegalDetalleFormJInternalFrame getrepresentantelegalJInternalFrame() {
			return this.representantelegalJInternalFrame;
		}
		
		public void setrepresentantelegalJInternalFrame(RepresentanteLegalDetalleFormJInternalFrame representantelegalJInternalFrame) {
			this.representantelegalJInternalFrame=representantelegalJInternalFrame;
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
