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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report;




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

//import com.bydan.erp.inventario.util.AutorizarRequisicionesConstantesFunciones;
import com.bydan.erp.inventario.util.report.AutorizarRequisicionesParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.AutorizarRequisicionesParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.AutorizarRequisicionesBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.AutorizarRequisicionesJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.report.AutorizarRequisicionesDetalleFormJInternalFrame;

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

public class AutorizarRequisicionesModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,AutorizarRequisicionesConstantesFunciones.LABEL_ID
										,AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION
										,AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO
										,AutorizarRequisicionesConstantesFunciones.LABEL_FECHA
										,AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE
										,AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA
										,AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO
										,AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD
										,AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA
										};
	   
	    public List<AutorizarRequisiciones> autorizarrequisicioness;
	  	 
	    //NO SE UTILIZA
	    public AutorizarRequisicionesModel(List<AutorizarRequisiciones> autorizarrequisicioness,JInternalFrameBase jInternalFrameBase) {
	    	this.autorizarrequisicioness=autorizarrequisicioness;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public AutorizarRequisicionesModel(JInternalFrameBase jInternalFrameBase) {
	    	this.autorizarrequisicioness=new ArrayList<AutorizarRequisiciones>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.autorizarrequisicioness.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.autorizarrequisicioness.get(rowIndex).getIsSelected();
	            
				case 1: return this.autorizarrequisicioness.get(rowIndex).getId();
				case 2: return this.autorizarrequisicioness.get(rowIndex).getcodigo_tipo_requisicion();
				case 3: return this.autorizarrequisicioness.get(rowIndex).getcodigo();
				case 4: return this.autorizarrequisicioness.get(rowIndex).getfecha();
				case 5: return this.autorizarrequisicioness.get(rowIndex).getnombre_completo_cliente();
				case 6: return this.autorizarrequisicioness.get(rowIndex).getnombre_bodega();
				case 7: return this.autorizarrequisicioness.get(rowIndex).getnombre_producto();
				case 8: return this.autorizarrequisicioness.get(rowIndex).getcantidad();
				case 9: return this.autorizarrequisicioness.get(rowIndex).getfecha_autoriza();	            
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
				case 4: return Date.class;
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return Long.class;
				case 9: return Date.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	AutorizarRequisiciones autorizarrequisiciones = this.autorizarrequisicioness.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			AutorizarRequisicionesBeanSwingJInternalFrame autorizarrequisicionesBeanSwingJInternalFrame=(AutorizarRequisicionesBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {autorizarrequisiciones.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {autorizarrequisiciones.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {autorizarrequisiciones.setcodigo_tipo_requisicion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {autorizarrequisiciones.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {autorizarrequisiciones.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {autorizarrequisiciones.setnombre_completo_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {autorizarrequisiciones.setnombre_bodega((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {autorizarrequisiciones.setnombre_producto((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {autorizarrequisiciones.setcantidad((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {autorizarrequisiciones.setfecha_autoriza((Date) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private AutorizarRequisicionesDetalleFormJInternalFrame autorizarrequisicionesJInternalFrame=null;
		
		public AutorizarRequisicionesModel(AutorizarRequisicionesDetalleFormJInternalFrame autorizarrequisicionesJInternalFrame) {
			this.autorizarrequisicionesJInternalFrame=autorizarrequisicionesJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonActualizarToolBarAutorizarRequisiciones();
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.getjButtonActualizarToolBarAutorizarRequisiciones())) {
				componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonEliminarToolBarAutorizarRequisiciones();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.getjButtonEliminarToolBarAutorizarRequisiciones())) {
				componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonCancelarToolBarAutorizarRequisiciones();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.getjButtonCancelarToolBarAutorizarRequisiciones())) {
				componentTab=this.autorizarrequisicionesJInternalFrame.jComboBoxid_empresaAutorizarRequisiciones;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_autorizaAutorizarRequisiciones)) {
				componentTab=this.autorizarrequisicionesJInternalFrame.jComboBoxTiposAccionesFormularioAutorizarRequisiciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jComboBoxTiposAccionesFormularioAutorizarRequisiciones)) {
				componentTab=this.autorizarrequisicionesJInternalFrame.jButtonEliminarAutorizarRequisiciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jButtonEliminarAutorizarRequisiciones)) {
				componentTab=this.autorizarrequisicionesJInternalFrame.jButtonActualizarAutorizarRequisiciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jButtonActualizarAutorizarRequisiciones)) {
				componentTab=this.autorizarrequisicionesJInternalFrame.jButtonCancelarAutorizarRequisiciones;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jComboBoxid_empresaAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jComboBoxid_sucursalAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jComboBoxid_sucursalAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_desdeAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_desdeAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_hastaAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_hastaAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextFieldcodigoAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextFieldcodigoAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jDateChooserfechaAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jDateChooserfechaAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextAreanombre_completo_clienteAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextAreanombre_completo_clienteAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextAreanombre_bodegaAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextAreanombre_bodegaAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextAreanombre_productoAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextAreanombre_productoAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextFieldcantidadAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextFieldcantidadAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_autorizaAutorizarRequisiciones;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonActualizarToolBarAutorizarRequisiciones();
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.getjButtonEliminarToolBarAutorizarRequisiciones())) {
				componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonActualizarToolBarAutorizarRequisiciones();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.getjButtonCancelarToolBarAutorizarRequisiciones())) {
				componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonEliminarToolBarAutorizarRequisiciones();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jComboBoxid_empresaAutorizarRequisiciones)) {
				
				componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonCancelarToolBarAutorizarRequisiciones();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jComboBoxTiposAccionesFormularioAutorizarRequisiciones)) {
				componentTab=this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_autorizaAutorizarRequisiciones;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jButtonEliminarAutorizarRequisiciones)) {
				componentTab=this.autorizarrequisicionesJInternalFrame.jComboBoxTiposAccionesFormularioAutorizarRequisiciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jButtonActualizarAutorizarRequisiciones)) {
				componentTab=this.autorizarrequisicionesJInternalFrame.jButtonEliminarAutorizarRequisiciones;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jButtonCancelarAutorizarRequisiciones)) {
				componentTab=this.autorizarrequisicionesJInternalFrame.jButtonActualizarAutorizarRequisiciones;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jComboBoxid_sucursalAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jComboBoxid_empresaAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_desdeAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jComboBoxid_sucursalAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_hastaAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_desdeAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_hastaAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextFieldcodigoAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jDateChooserfechaAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextFieldcodigoAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextAreanombre_completo_clienteAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jDateChooserfechaAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextAreanombre_bodegaAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextAreanombre_completo_clienteAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextAreanombre_productoAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextAreanombre_bodegaAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jTextFieldcantidadAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextAreanombre_productoAutorizarRequisiciones;
			return componentTab;
		}

		if(component!=null && component.equals(this.autorizarrequisicionesJInternalFrame.jDateChooserfecha_autorizaAutorizarRequisiciones)) {
			componentTab=this.autorizarrequisicionesJInternalFrame.jTextFieldcantidadAutorizarRequisiciones;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonActualizarToolBarAutorizarRequisiciones();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonActualizarToolBarAutorizarRequisiciones();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.autorizarrequisicionesJInternalFrame.getjButtonCancelarToolBarAutorizarRequisiciones();
			
			
			return componentTab;		
		}
		
		public AutorizarRequisicionesDetalleFormJInternalFrame getautorizarrequisicionesJInternalFrame() {
			return this.autorizarrequisicionesJInternalFrame;
		}
		
		public void setautorizarrequisicionesJInternalFrame(AutorizarRequisicionesDetalleFormJInternalFrame autorizarrequisicionesJInternalFrame) {
			this.autorizarrequisicionesJInternalFrame=autorizarrequisicionesJInternalFrame;
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
