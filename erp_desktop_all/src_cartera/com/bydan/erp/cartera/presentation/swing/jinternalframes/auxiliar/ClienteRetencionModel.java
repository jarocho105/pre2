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

import com.bydan.erp.cartera.util.ClienteRetencionConstantesFunciones;
import com.bydan.erp.cartera.util.ClienteRetencionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ClienteRetencionParameterGeneral;

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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ClienteRetencionBeanSwingJInternalFrame;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ClienteRetencionJInternalFrame;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.ClienteRetencionDetalleFormJInternalFrame;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ClienteRetencionModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ClienteRetencionConstantesFunciones.LABEL_ID
										,ClienteRetencionConstantesFunciones.LABEL_IDEMPRESA
										,ClienteRetencionConstantesFunciones.LABEL_IDSUCURSAL
										,ClienteRetencionConstantesFunciones.LABEL_IDEJERCICIO
										,ClienteRetencionConstantesFunciones.LABEL_IDPERIODO
										,ClienteRetencionConstantesFunciones.LABEL_IDANIO
										,ClienteRetencionConstantesFunciones.LABEL_IDMES
										,ClienteRetencionConstantesFunciones.LABEL_FECHA
										,ClienteRetencionConstantesFunciones.LABEL_IDCLIENTE
										,ClienteRetencionConstantesFunciones.LABEL_IDFACTURA
										,ClienteRetencionConstantesFunciones.LABEL_IDTRANSACCION
										,ClienteRetencionConstantesFunciones.LABEL_IDTIPORETENCION
										,ClienteRetencionConstantesFunciones.LABEL_PORCENTAJE
										,ClienteRetencionConstantesFunciones.LABEL_BASEIMPONIBLE
										,ClienteRetencionConstantesFunciones.LABEL_VALOR
										,ClienteRetencionConstantesFunciones.LABEL_NUMERORETENCION
										,ClienteRetencionConstantesFunciones.LABEL_DESCRIPCION
										};
	   
	    public List<ClienteRetencion> clienteretencions;
	  	 
	    //NO SE UTILIZA
	    public ClienteRetencionModel(List<ClienteRetencion> clienteretencions,JInternalFrameBase jInternalFrameBase) {
	    	this.clienteretencions=clienteretencions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ClienteRetencionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.clienteretencions=new ArrayList<ClienteRetencion>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.clienteretencions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.clienteretencions.get(rowIndex).getIsSelected();
	            
				case 1: return this.clienteretencions.get(rowIndex).getId();
				case 2: return this.clienteretencions.get(rowIndex).getid_empresa();
				case 3: return this.clienteretencions.get(rowIndex).getid_sucursal();
				case 4: return this.clienteretencions.get(rowIndex).getid_ejercicio();
				case 5: return this.clienteretencions.get(rowIndex).getid_periodo();
				case 6: return this.clienteretencions.get(rowIndex).getid_anio();
				case 7: return this.clienteretencions.get(rowIndex).getid_mes();
				case 8: return this.clienteretencions.get(rowIndex).getfecha();
				case 9: return this.clienteretencions.get(rowIndex).getid_cliente();
				case 10: return this.clienteretencions.get(rowIndex).getid_factura();
				case 11: return this.clienteretencions.get(rowIndex).getid_transaccion();
				case 12: return this.clienteretencions.get(rowIndex).getid_tipo_retencion();
				case 13: return this.clienteretencions.get(rowIndex).getporcentaje();
				case 14: return this.clienteretencions.get(rowIndex).getbase_imponible();
				case 15: return this.clienteretencions.get(rowIndex).getvalor();
				case 16: return this.clienteretencions.get(rowIndex).getnumero_retencion();
				case 17: return this.clienteretencions.get(rowIndex).getdescripcion();	            
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
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Date.class;
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return String.class;
				case 17: return String.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ClienteRetencion clienteretencion = this.clienteretencions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ClienteRetencionBeanSwingJInternalFrame clienteretencionBeanSwingJInternalFrame=(ClienteRetencionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {clienteretencion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {clienteretencion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {clienteretencion.setid_empresa((Long) value);clienteretencion.setempresa_descripcion(clienteretencionBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {clienteretencion.setid_sucursal((Long) value);clienteretencion.setsucursal_descripcion(clienteretencionBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {clienteretencion.setid_ejercicio((Long) value);clienteretencion.setejercicio_descripcion(clienteretencionBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {clienteretencion.setid_periodo((Long) value);clienteretencion.setperiodo_descripcion(clienteretencionBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {clienteretencion.setid_anio((Long) value);clienteretencion.setanio_descripcion(clienteretencionBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {clienteretencion.setid_mes((Long) value);clienteretencion.setmes_descripcion(clienteretencionBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {clienteretencion.setfecha((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {clienteretencion.setid_cliente((Long) value);clienteretencion.setcliente_descripcion(clienteretencionBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {clienteretencion.setid_factura((Long) value);clienteretencion.setfactura_descripcion(clienteretencionBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {clienteretencion.setid_transaccion((Long) value);clienteretencion.settransaccion_descripcion(clienteretencionBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {clienteretencion.setid_tipo_retencion((Long) value);clienteretencion.settiporetencion_descripcion(clienteretencionBeanSwingJInternalFrame.getActualTipoRetencionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {clienteretencion.setporcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {clienteretencion.setbase_imponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {clienteretencion.setvalor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {clienteretencion.setnumero_retencion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {clienteretencion.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ClienteRetencionModel(JInternalFrameBase jInternalFrameBase) {
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
		private ClienteRetencionDetalleFormJInternalFrame clienteretencionJInternalFrame=null;
		
		public ClienteRetencionModel(ClienteRetencionDetalleFormJInternalFrame clienteretencionJInternalFrame) {
			this.clienteretencionJInternalFrame=clienteretencionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.clienteretencionJInternalFrame.getjButtonActualizarToolBarClienteRetencion();
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.getjButtonActualizarToolBarClienteRetencion())) {
				componentTab=this.clienteretencionJInternalFrame.getjButtonEliminarToolBarClienteRetencion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.getjButtonEliminarToolBarClienteRetencion())) {
				componentTab=this.clienteretencionJInternalFrame.getjButtonCancelarToolBarClienteRetencion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.getjButtonCancelarToolBarClienteRetencion())) {
				componentTab=this.clienteretencionJInternalFrame.jComboBoxid_empresaClienteRetencion;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_estado_retencionClienteRetencion)) {
				componentTab=this.clienteretencionJInternalFrame.jComboBoxTiposAccionesFormularioClienteRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxTiposAccionesFormularioClienteRetencion)) {
				componentTab=this.clienteretencionJInternalFrame.jButtonEliminarClienteRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.jButtonEliminarClienteRetencion)) {
				componentTab=this.clienteretencionJInternalFrame.jButtonActualizarClienteRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.jButtonActualizarClienteRetencion)) {
				componentTab=this.clienteretencionJInternalFrame.jButtonCancelarClienteRetencion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_empresaClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_sucursalClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_sucursalClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_ejercicioClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_ejercicioClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_periodoClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_periodoClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_anioClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_anioClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_mesClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_mesClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jDateChooserfechaClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jDateChooserfechaClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_clienteClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_clienteClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_facturaClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_facturaClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_transaccionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_transaccionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_tipo_retencionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_tipo_retencionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldporcentajeClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldporcentajeClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldbase_imponibleClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldbase_imponibleClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldvalorClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldvalorClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldnumero_retencionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldnumero_retencionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreadescripcionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreadescripcionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_asiento_contableClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_asiento_contableClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_cuenta_contable_retencionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_cuenta_contable_retencionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldvalor_tipo_cambioClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldvalor_tipo_cambioClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFielddebito_mone_localClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFielddebito_mone_localClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldcredito_mone_localClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldcredito_mone_localClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFielddebito_mone_extraClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFielddebito_mone_extraClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldcredito_mone_extraClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldcredito_mone_extraClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreabeneficiarioClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreabeneficiarioClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreanombre_benefClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreanombre_benefClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreadireccion_benefClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreadireccion_benefClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreatelefono_benefClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreatelefono_benefClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldruc_benefClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldruc_benefClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_estado_retencionClienteRetencion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.clienteretencionJInternalFrame.getjButtonActualizarToolBarClienteRetencion();
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.getjButtonEliminarToolBarClienteRetencion())) {
				componentTab=this.clienteretencionJInternalFrame.getjButtonActualizarToolBarClienteRetencion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.getjButtonCancelarToolBarClienteRetencion())) {
				componentTab=this.clienteretencionJInternalFrame.getjButtonEliminarToolBarClienteRetencion();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_empresaClienteRetencion)) {
				
				componentTab=this.clienteretencionJInternalFrame.getjButtonCancelarToolBarClienteRetencion();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxTiposAccionesFormularioClienteRetencion)) {
				componentTab=this.clienteretencionJInternalFrame.jComboBoxid_estado_retencionClienteRetencion;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.jButtonEliminarClienteRetencion)) {
				componentTab=this.clienteretencionJInternalFrame.jComboBoxTiposAccionesFormularioClienteRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.jButtonActualizarClienteRetencion)) {
				componentTab=this.clienteretencionJInternalFrame.jButtonEliminarClienteRetencion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.clienteretencionJInternalFrame.jButtonCancelarClienteRetencion)) {
				componentTab=this.clienteretencionJInternalFrame.jButtonActualizarClienteRetencion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_sucursalClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_empresaClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_ejercicioClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_sucursalClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_periodoClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_ejercicioClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_anioClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_periodoClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_mesClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_anioClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jDateChooserfechaClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_mesClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_clienteClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jDateChooserfechaClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_facturaClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_clienteClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_transaccionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_facturaClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_tipo_retencionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_transaccionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldporcentajeClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_tipo_retencionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldbase_imponibleClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldporcentajeClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldvalorClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldbase_imponibleClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldnumero_retencionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldvalorClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreadescripcionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldnumero_retencionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_asiento_contableClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreadescripcionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_cuenta_contable_retencionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_asiento_contableClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldvalor_tipo_cambioClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jComboBoxid_cuenta_contable_retencionClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFielddebito_mone_localClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldvalor_tipo_cambioClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldcredito_mone_localClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFielddebito_mone_localClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFielddebito_mone_extraClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldcredito_mone_localClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldcredito_mone_extraClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFielddebito_mone_extraClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreabeneficiarioClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldcredito_mone_extraClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreanombre_benefClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreabeneficiarioClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreadireccion_benefClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreanombre_benefClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextAreatelefono_benefClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreadireccion_benefClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jTextFieldruc_benefClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextAreatelefono_benefClienteRetencion;
			return componentTab;
		}

		if(component!=null && component.equals(this.clienteretencionJInternalFrame.jComboBoxid_estado_retencionClienteRetencion)) {
			componentTab=this.clienteretencionJInternalFrame.jTextFieldruc_benefClienteRetencion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.clienteretencionJInternalFrame.getjButtonActualizarToolBarClienteRetencion();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.clienteretencionJInternalFrame.getjButtonActualizarToolBarClienteRetencion();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.clienteretencionJInternalFrame.getjButtonCancelarToolBarClienteRetencion();
			
			
			return componentTab;		
		}
		
		public ClienteRetencionDetalleFormJInternalFrame getclienteretencionJInternalFrame() {
			return this.clienteretencionJInternalFrame;
		}
		
		public void setclienteretencionJInternalFrame(ClienteRetencionDetalleFormJInternalFrame clienteretencionJInternalFrame) {
			this.clienteretencionJInternalFrame=clienteretencionJInternalFrame;
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
