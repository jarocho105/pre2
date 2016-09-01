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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.inventario.util.RequisicionCompraConstantesFunciones;
import com.bydan.erp.inventario.util.RequisicionCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.RequisicionCompraParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.RequisicionCompraBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.RequisicionCompraJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.RequisicionCompraDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class RequisicionCompraModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,RequisicionCompraConstantesFunciones.LABEL_ID
										,RequisicionCompraConstantesFunciones.LABEL_IDEMPRESA
										,RequisicionCompraConstantesFunciones.LABEL_IDSUCURSAL
										,RequisicionCompraConstantesFunciones.LABEL_IDMODULO
										,RequisicionCompraConstantesFunciones.LABEL_IDEJERCICIO
										,RequisicionCompraConstantesFunciones.LABEL_IDPERIODO
										,RequisicionCompraConstantesFunciones.LABEL_IDANIO
										,RequisicionCompraConstantesFunciones.LABEL_IDMES
										,RequisicionCompraConstantesFunciones.LABEL_NUMEROSECUENCIAL
										,RequisicionCompraConstantesFunciones.LABEL_IDCLIENTE
										,RequisicionCompraConstantesFunciones.LABEL_IDUSUARIO
										,RequisicionCompraConstantesFunciones.LABEL_IDESTADOREQUISICIONCOMPRA
										,RequisicionCompraConstantesFunciones.LABEL_IDEMPLEADO
										,RequisicionCompraConstantesFunciones.LABEL_RESPONSABLE
										,RequisicionCompraConstantesFunciones.LABEL_SOLICITADOPOR
										,RequisicionCompraConstantesFunciones.LABEL_MOTIVOSOLICITUD
										,RequisicionCompraConstantesFunciones.LABEL_AREASOLICITUD
										,RequisicionCompraConstantesFunciones.LABEL_PARAUSODE
										,RequisicionCompraConstantesFunciones.LABEL_LUGARENTREGA
										,RequisicionCompraConstantesFunciones.LABEL_DESCRIPCION
										,RequisicionCompraConstantesFunciones.LABEL_FECHAEMISION
										,RequisicionCompraConstantesFunciones.LABEL_FECHAENTREGA
										,RequisicionCompraConstantesFunciones.LABEL_IDFORMATO
										};
	   
	    public List<RequisicionCompra> requisicioncompras;
	  	 
	    //NO SE UTILIZA
	    public RequisicionCompraModel(List<RequisicionCompra> requisicioncompras,JInternalFrameBase jInternalFrameBase) {
	    	this.requisicioncompras=requisicioncompras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public RequisicionCompraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.requisicioncompras=new ArrayList<RequisicionCompra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.requisicioncompras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.requisicioncompras.get(rowIndex).getIsSelected();
	            
				case 1: return this.requisicioncompras.get(rowIndex).getId();
				case 2: return this.requisicioncompras.get(rowIndex).getid_empresa();
				case 3: return this.requisicioncompras.get(rowIndex).getid_sucursal();
				case 4: return this.requisicioncompras.get(rowIndex).getid_modulo();
				case 5: return this.requisicioncompras.get(rowIndex).getid_ejercicio();
				case 6: return this.requisicioncompras.get(rowIndex).getid_periodo();
				case 7: return this.requisicioncompras.get(rowIndex).getid_anio();
				case 8: return this.requisicioncompras.get(rowIndex).getid_mes();
				case 9: return this.requisicioncompras.get(rowIndex).getnumero_secuencial();
				case 10: return this.requisicioncompras.get(rowIndex).getid_cliente();
				case 11: return this.requisicioncompras.get(rowIndex).getid_usuario();
				case 12: return this.requisicioncompras.get(rowIndex).getid_estado_requisicion_compra();
				case 13: return this.requisicioncompras.get(rowIndex).getid_empleado();
				case 14: return this.requisicioncompras.get(rowIndex).getresponsable();
				case 15: return this.requisicioncompras.get(rowIndex).getsolicitado_por();
				case 16: return this.requisicioncompras.get(rowIndex).getmotivo_solicitud();
				case 17: return this.requisicioncompras.get(rowIndex).getarea_solicitud();
				case 18: return this.requisicioncompras.get(rowIndex).getpara_uso_de();
				case 19: return this.requisicioncompras.get(rowIndex).getlugar_entrega();
				case 20: return this.requisicioncompras.get(rowIndex).getdescripcion();
				case 21: return this.requisicioncompras.get(rowIndex).getfecha_emision();
				case 22: return this.requisicioncompras.get(rowIndex).getfecha_entrega();
				case 23: return this.requisicioncompras.get(rowIndex).getid_formato();	            
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
				case 8: return Long.class;
				case 9: return String.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Long.class;
				case 14: return String.class;
				case 15: return String.class;
				case 16: return String.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return String.class;
				case 20: return String.class;
				case 21: return Date.class;
				case 22: return Date.class;
				case 23: return Long.class;	            
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
				case 21: return true;
				case 22: return true;
				case 23: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	RequisicionCompra requisicioncompra = this.requisicioncompras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFrame=(RequisicionCompraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {requisicioncompra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {requisicioncompra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {requisicioncompra.setid_empresa((Long) value);requisicioncompra.setempresa_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {requisicioncompra.setid_sucursal((Long) value);requisicioncompra.setsucursal_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {requisicioncompra.setid_modulo((Long) value);requisicioncompra.setmodulo_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {requisicioncompra.setid_ejercicio((Long) value);requisicioncompra.setejercicio_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {requisicioncompra.setid_periodo((Long) value);requisicioncompra.setperiodo_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {requisicioncompra.setid_anio((Long) value);requisicioncompra.setanio_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {requisicioncompra.setid_mes((Long) value);requisicioncompra.setmes_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {requisicioncompra.setnumero_secuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {requisicioncompra.setid_cliente((Long) value);requisicioncompra.setcliente_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {requisicioncompra.setid_usuario((Long) value);requisicioncompra.setusuario_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {requisicioncompra.setid_estado_requisicion_compra((Long) value);requisicioncompra.setestadorequisicioncompra_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualEstadoRequisicionCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {requisicioncompra.setid_empleado((Long) value);requisicioncompra.setempleado_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {requisicioncompra.setresponsable((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {requisicioncompra.setsolicitado_por((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {requisicioncompra.setmotivo_solicitud((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {requisicioncompra.setarea_solicitud((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {requisicioncompra.setpara_uso_de((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {requisicioncompra.setlugar_entrega((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {requisicioncompra.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {requisicioncompra.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {requisicioncompra.setfecha_entrega((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {requisicioncompra.setid_formato((Long) value);requisicioncompra.setformato_descripcion(requisicioncompraBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public RequisicionCompraModel(JInternalFrameBase jInternalFrameBase) {
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
		private RequisicionCompraDetalleFormJInternalFrame requisicioncompraJInternalFrame=null;
		
		public RequisicionCompraModel(RequisicionCompraDetalleFormJInternalFrame requisicioncompraJInternalFrame) {
			this.requisicioncompraJInternalFrame=requisicioncompraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.requisicioncompraJInternalFrame.getjButtonActualizarToolBarRequisicionCompra();
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.getjButtonActualizarToolBarRequisicionCompra())) {
				componentTab=this.requisicioncompraJInternalFrame.getjButtonEliminarToolBarRequisicionCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.getjButtonEliminarToolBarRequisicionCompra())) {
				componentTab=this.requisicioncompraJInternalFrame.getjButtonCancelarToolBarRequisicionCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.getjButtonCancelarToolBarRequisicionCompra())) {
				componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_empresaRequisicionCompra;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_tipo_cambioRequisicionCompra)) {
				componentTab=this.requisicioncompraJInternalFrame.jComboBoxTiposAccionesFormularioRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxTiposAccionesFormularioRequisicionCompra)) {
				componentTab=this.requisicioncompraJInternalFrame.jButtonEliminarRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jButtonEliminarRequisicionCompra)) {
				componentTab=this.requisicioncompraJInternalFrame.jButtonActualizarRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jButtonActualizarRequisicionCompra)) {
				componentTab=this.requisicioncompraJInternalFrame.jButtonCancelarRequisicionCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_empresaRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_sucursalRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_sucursalRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_moduloRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_moduloRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_ejercicioRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_ejercicioRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_periodoRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_periodoRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_anioRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_anioRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_mesRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_mesRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_clienteRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_clienteRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_usuarioRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_usuarioRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_monedaRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_monedaRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextFieldtotalRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextFieldtotalRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jDateChooserfechaRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jDateChooserfechaRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_empleadoRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_empleadoRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextArearesponsableRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextArearesponsableRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreasolicitado_porRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreasolicitado_porRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreamotivo_solicitudRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreamotivo_solicitudRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreaarea_solicitudRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreaarea_solicitudRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreapara_uso_deRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreapara_uso_deRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextFieldlugar_entregaRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextFieldlugar_entregaRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreadescripcionRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreadescripcionRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jDateChooserfecha_emisionRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jDateChooserfecha_emisionRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jDateChooserfecha_entregaRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jDateChooserfecha_entregaRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_formatoRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_formatoRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_tipo_cambioRequisicionCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.requisicioncompraJInternalFrame.getjButtonActualizarToolBarRequisicionCompra();
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.getjButtonEliminarToolBarRequisicionCompra())) {
				componentTab=this.requisicioncompraJInternalFrame.getjButtonActualizarToolBarRequisicionCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.getjButtonCancelarToolBarRequisicionCompra())) {
				componentTab=this.requisicioncompraJInternalFrame.getjButtonEliminarToolBarRequisicionCompra();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_empresaRequisicionCompra)) {
				
				componentTab=this.requisicioncompraJInternalFrame.getjButtonCancelarToolBarRequisicionCompra();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxTiposAccionesFormularioRequisicionCompra)) {
				componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_tipo_cambioRequisicionCompra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jButtonEliminarRequisicionCompra)) {
				componentTab=this.requisicioncompraJInternalFrame.jComboBoxTiposAccionesFormularioRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jButtonActualizarRequisicionCompra)) {
				componentTab=this.requisicioncompraJInternalFrame.jButtonEliminarRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jButtonCancelarRequisicionCompra)) {
				componentTab=this.requisicioncompraJInternalFrame.jButtonActualizarRequisicionCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_sucursalRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_empresaRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_moduloRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_sucursalRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_ejercicioRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_moduloRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_periodoRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_ejercicioRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_anioRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_periodoRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_mesRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_anioRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_clienteRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_mesRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_usuarioRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_clienteRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_monedaRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_usuarioRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextFieldtotalRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_monedaRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jDateChooserfechaRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextFieldtotalRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_empleadoRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jDateChooserfechaRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextArearesponsableRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_empleadoRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreasolicitado_porRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextArearesponsableRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreamotivo_solicitudRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreasolicitado_porRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreaarea_solicitudRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreamotivo_solicitudRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreapara_uso_deRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreaarea_solicitudRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextFieldlugar_entregaRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreapara_uso_deRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jTextAreadescripcionRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextFieldlugar_entregaRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jDateChooserfecha_emisionRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jTextAreadescripcionRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jDateChooserfecha_entregaRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jDateChooserfecha_emisionRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_formatoRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jDateChooserfecha_entregaRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.requisicioncompraJInternalFrame.jComboBoxid_tipo_cambioRequisicionCompra)) {
			componentTab=this.requisicioncompraJInternalFrame.jComboBoxid_formatoRequisicionCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.requisicioncompraJInternalFrame.getjButtonActualizarToolBarRequisicionCompra();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.requisicioncompraJInternalFrame.getjButtonActualizarToolBarRequisicionCompra();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.requisicioncompraJInternalFrame.getjButtonCancelarToolBarRequisicionCompra();
			
			
			return componentTab;		
		}
		
		public RequisicionCompraDetalleFormJInternalFrame getrequisicioncompraJInternalFrame() {
			return this.requisicioncompraJInternalFrame;
		}
		
		public void setrequisicioncompraJInternalFrame(RequisicionCompraDetalleFormJInternalFrame requisicioncompraJInternalFrame) {
			this.requisicioncompraJInternalFrame=requisicioncompraJInternalFrame;
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
