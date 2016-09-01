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

import com.bydan.erp.inventario.util.DetalleRequisicionCompraConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleRequisicionCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleRequisicionCompraParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleRequisicionCompraBeanSwingJInternalFrame;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleRequisicionCompraJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleRequisicionCompraDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleRequisicionCompraModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleRequisicionCompraConstantesFunciones.LABEL_ID
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDREQUISICIONCOMPRA
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDEMPRESA
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDPERIODO
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDANIO
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDMES
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDBODEGA
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDUNIDAD
										,DetalleRequisicionCompraConstantesFunciones.LABEL_IDCENTROCOSTO
										,DetalleRequisicionCompraConstantesFunciones.LABEL_CANTIDADREQUISICION
										,DetalleRequisicionCompraConstantesFunciones.LABEL_COSTOUNITARIO
										,DetalleRequisicionCompraConstantesFunciones.LABEL_COSTOTOTAL
										,DetalleRequisicionCompraConstantesFunciones.LABEL_DESCRIPCION
										,DetalleRequisicionCompraConstantesFunciones.LABEL_CANTIDADENTREGADA
										,DetalleRequisicionCompraConstantesFunciones.LABEL_CANTIDADPENDIENTE
										};
	   
	    public List<DetalleRequisicionCompra> detallerequisicioncompras;
	  	 
	    //NO SE UTILIZA
	    public DetalleRequisicionCompraModel(List<DetalleRequisicionCompra> detallerequisicioncompras,JInternalFrameBase jInternalFrameBase) {
	    	this.detallerequisicioncompras=detallerequisicioncompras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleRequisicionCompraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detallerequisicioncompras=new ArrayList<DetalleRequisicionCompra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detallerequisicioncompras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detallerequisicioncompras.get(rowIndex).getIsSelected();
	            
				case 1: return this.detallerequisicioncompras.get(rowIndex).getId();
				case 2: return this.detallerequisicioncompras.get(rowIndex).getid_requisicion_compra();
				case 3: return this.detallerequisicioncompras.get(rowIndex).getid_empresa();
				case 4: return this.detallerequisicioncompras.get(rowIndex).getid_sucursal();
				case 5: return this.detallerequisicioncompras.get(rowIndex).getid_ejercicio();
				case 6: return this.detallerequisicioncompras.get(rowIndex).getid_periodo();
				case 7: return this.detallerequisicioncompras.get(rowIndex).getid_anio();
				case 8: return this.detallerequisicioncompras.get(rowIndex).getid_mes();
				case 9: return this.detallerequisicioncompras.get(rowIndex).getid_bodega();
				case 10: return this.detallerequisicioncompras.get(rowIndex).getid_producto();
				case 11: return this.detallerequisicioncompras.get(rowIndex).getid_unidad();
				case 12: return this.detallerequisicioncompras.get(rowIndex).getid_centro_costo();
				case 13: return this.detallerequisicioncompras.get(rowIndex).getcantidad_requisicion();
				case 14: return this.detallerequisicioncompras.get(rowIndex).getcosto_unitario();
				case 15: return this.detallerequisicioncompras.get(rowIndex).getcosto_total();
				case 16: return this.detallerequisicioncompras.get(rowIndex).getdescripcion();
				case 17: return this.detallerequisicioncompras.get(rowIndex).getcantidad_entregada();
				case 18: return this.detallerequisicioncompras.get(rowIndex).getcantidad_pendiente();	            
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
				case 9: return Long.class;
				case 10: return Long.class;
				case 11: return Long.class;
				case 12: return Long.class;
				case 13: return Integer.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return String.class;
				case 17: return Integer.class;
				case 18: return Integer.class;	            
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
	    	DetalleRequisicionCompra detallerequisicioncompra = this.detallerequisicioncompras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleRequisicionCompraBeanSwingJInternalFrame detallerequisicioncompraBeanSwingJInternalFrame=(DetalleRequisicionCompraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallerequisicioncompra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallerequisicioncompra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallerequisicioncompra.setid_requisicion_compra((Long) value);detallerequisicioncompra.setrequisicioncompra_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualRequisicionCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallerequisicioncompra.setid_empresa((Long) value);detallerequisicioncompra.setempresa_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallerequisicioncompra.setid_sucursal((Long) value);detallerequisicioncompra.setsucursal_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallerequisicioncompra.setid_ejercicio((Long) value);detallerequisicioncompra.setejercicio_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallerequisicioncompra.setid_periodo((Long) value);detallerequisicioncompra.setperiodo_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallerequisicioncompra.setid_anio((Long) value);detallerequisicioncompra.setanio_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallerequisicioncompra.setid_mes((Long) value);detallerequisicioncompra.setmes_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallerequisicioncompra.setid_bodega((Long) value);detallerequisicioncompra.setbodega_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallerequisicioncompra.setid_producto((Long) value);detallerequisicioncompra.setproducto_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallerequisicioncompra.setid_unidad((Long) value);detallerequisicioncompra.setunidad_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallerequisicioncompra.setid_centro_costo((Long) value);detallerequisicioncompra.setcentrocosto_descripcion(detallerequisicioncompraBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallerequisicioncompra.setcantidad_requisicion((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallerequisicioncompra.setcosto_unitario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallerequisicioncompra.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallerequisicioncompra.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallerequisicioncompra.setcantidad_entregada((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detallerequisicioncompra.setcantidad_pendiente((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleRequisicionCompraModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleRequisicionCompraDetalleFormJInternalFrame detallerequisicioncompraJInternalFrame=null;
		
		public DetalleRequisicionCompraModel(DetalleRequisicionCompraDetalleFormJInternalFrame detallerequisicioncompraJInternalFrame) {
			this.detallerequisicioncompraJInternalFrame=detallerequisicioncompraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonActualizarToolBarDetalleRequisicionCompra();
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.getjButtonActualizarToolBarDetalleRequisicionCompra())) {
				componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonEliminarToolBarDetalleRequisicionCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.getjButtonEliminarToolBarDetalleRequisicionCompra())) {
				componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonCancelarToolBarDetalleRequisicionCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.getjButtonCancelarToolBarDetalleRequisicionCompra())) {
				componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_requisicion_compraDetalleRequisicionCompra;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jTextFieldcantidad_pendienteDetalleRequisicionCompra)) {
				componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra)) {
				componentTab=this.detallerequisicioncompraJInternalFrame.jButtonEliminarDetalleRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jButtonEliminarDetalleRequisicionCompra)) {
				componentTab=this.detallerequisicioncompraJInternalFrame.jButtonActualizarDetalleRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jButtonActualizarDetalleRequisicionCompra)) {
				componentTab=this.detallerequisicioncompraJInternalFrame.jButtonCancelarDetalleRequisicionCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_requisicion_compraDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_empresaDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_empresaDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_sucursalDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_sucursalDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_ejercicioDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_ejercicioDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_periodoDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_periodoDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_anioDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_anioDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_mesDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_mesDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_bodegaDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_bodegaDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_productoDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_productoDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_unidadDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_unidadDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_centro_costoDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_centro_costoDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jTextFieldcantidad_requisicionDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jTextFieldcantidad_requisicionDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jTextFieldcosto_totalDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jTextAreadescripcionDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jTextFieldcantidad_pendienteDetalleRequisicionCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonActualizarToolBarDetalleRequisicionCompra();
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.getjButtonEliminarToolBarDetalleRequisicionCompra())) {
				componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonActualizarToolBarDetalleRequisicionCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.getjButtonCancelarToolBarDetalleRequisicionCompra())) {
				componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonEliminarToolBarDetalleRequisicionCompra();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_requisicion_compraDetalleRequisicionCompra)) {
				
				componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonCancelarToolBarDetalleRequisicionCompra();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra)) {
				componentTab=this.detallerequisicioncompraJInternalFrame.jTextFieldcantidad_pendienteDetalleRequisicionCompra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jButtonEliminarDetalleRequisicionCompra)) {
				componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jButtonActualizarDetalleRequisicionCompra)) {
				componentTab=this.detallerequisicioncompraJInternalFrame.jButtonEliminarDetalleRequisicionCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jButtonCancelarDetalleRequisicionCompra)) {
				componentTab=this.detallerequisicioncompraJInternalFrame.jButtonActualizarDetalleRequisicionCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_empresaDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_requisicion_compraDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_sucursalDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_empresaDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_ejercicioDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_sucursalDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_periodoDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_ejercicioDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_anioDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_periodoDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_mesDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_anioDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_bodegaDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_mesDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_productoDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_bodegaDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_unidadDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_productoDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jComboBoxid_centro_costoDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_unidadDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jTextFieldcantidad_requisicionDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jComboBoxid_centro_costoDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jTextFieldcosto_totalDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jTextFieldcantidad_requisicionDetalleRequisicionCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallerequisicioncompraJInternalFrame.jTextFieldcantidad_pendienteDetalleRequisicionCompra)) {
			componentTab=this.detallerequisicioncompraJInternalFrame.jTextAreadescripcionDetalleRequisicionCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonActualizarToolBarDetalleRequisicionCompra();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonActualizarToolBarDetalleRequisicionCompra();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detallerequisicioncompraJInternalFrame.getjButtonCancelarToolBarDetalleRequisicionCompra();
			
			
			return componentTab;		
		}
		
		public DetalleRequisicionCompraDetalleFormJInternalFrame getdetallerequisicioncompraJInternalFrame() {
			return this.detallerequisicioncompraJInternalFrame;
		}
		
		public void setdetallerequisicioncompraJInternalFrame(DetalleRequisicionCompraDetalleFormJInternalFrame detallerequisicioncompraJInternalFrame) {
			this.detallerequisicioncompraJInternalFrame=detallerequisicioncompraJInternalFrame;
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
