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

import com.bydan.erp.inventario.util.DetalleOrdenCompraConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleOrdenCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleOrdenCompraParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleOrdenCompraBeanSwingJInternalFrame;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleOrdenCompraJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleOrdenCompraDetalleFormJInternalFrame;

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

public class DetalleOrdenCompraModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleOrdenCompraConstantesFunciones.LABEL_ID
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDORDENCOMPRA
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDEMPRESA
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDPERIODO
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDANIO
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDMES
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDBODEGA
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDUNIDAD
										,DetalleOrdenCompraConstantesFunciones.LABEL_DESCRIPCION
										,DetalleOrdenCompraConstantesFunciones.LABEL_CANTIDAD
										,DetalleOrdenCompraConstantesFunciones.LABEL_COSTOUNITARIO
										,DetalleOrdenCompraConstantesFunciones.LABEL_IVA
										,DetalleOrdenCompraConstantesFunciones.LABEL_IVAVALOR
										,DetalleOrdenCompraConstantesFunciones.LABEL_COSTOTOTAL
										,DetalleOrdenCompraConstantesFunciones.LABEL_DISPONIBLE
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDNOVEDADPRODUCTO
										,DetalleOrdenCompraConstantesFunciones.LABEL_IDESTADODETALLEORDENCOMPRA
										};
	   
	    public List<DetalleOrdenCompra> detalleordencompras;
	  	 
	    //NO SE UTILIZA
	    public DetalleOrdenCompraModel(List<DetalleOrdenCompra> detalleordencompras,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleordencompras=detalleordencompras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleOrdenCompraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleordencompras=new ArrayList<DetalleOrdenCompra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleordencompras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleordencompras.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleordencompras.get(rowIndex).getId();
				case 2: return this.detalleordencompras.get(rowIndex).getid_orden_compra();
				case 3: return this.detalleordencompras.get(rowIndex).getid_empresa();
				case 4: return this.detalleordencompras.get(rowIndex).getid_sucursal();
				case 5: return this.detalleordencompras.get(rowIndex).getid_ejercicio();
				case 6: return this.detalleordencompras.get(rowIndex).getid_periodo();
				case 7: return this.detalleordencompras.get(rowIndex).getid_anio();
				case 8: return this.detalleordencompras.get(rowIndex).getid_mes();
				case 9: return this.detalleordencompras.get(rowIndex).getid_bodega();
				case 10: return this.detalleordencompras.get(rowIndex).getid_producto();
				case 11: return this.detalleordencompras.get(rowIndex).getid_unidad();
				case 12: return this.detalleordencompras.get(rowIndex).getdescripcion();
				case 13: return this.detalleordencompras.get(rowIndex).getcantidad();
				case 14: return this.detalleordencompras.get(rowIndex).getcosto_unitario();
				case 15: return this.detalleordencompras.get(rowIndex).getiva();
				case 16: return this.detalleordencompras.get(rowIndex).getiva_valor();
				case 17: return this.detalleordencompras.get(rowIndex).getcosto_total();
				case 18: return this.detalleordencompras.get(rowIndex).getdisponible();
				case 19: return this.detalleordencompras.get(rowIndex).getid_novedad_producto();
				case 20: return this.detalleordencompras.get(rowIndex).getid_estado_detalle_orden_compra();	            
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
				case 12: return String.class;
				case 13: return Integer.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Integer.class;
				case 19: return Long.class;
				case 20: return Long.class;	            
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
	    	DetalleOrdenCompra detalleordencompra = this.detalleordencompras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame=(DetalleOrdenCompraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalleordencompra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalleordencompra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalleordencompra.setid_orden_compra((Long) value);detalleordencompra.setordencompra_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualOrdenCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalleordencompra.setid_empresa((Long) value);detalleordencompra.setempresa_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalleordencompra.setid_sucursal((Long) value);detalleordencompra.setsucursal_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalleordencompra.setid_ejercicio((Long) value);detalleordencompra.setejercicio_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalleordencompra.setid_periodo((Long) value);detalleordencompra.setperiodo_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalleordencompra.setid_anio((Long) value);detalleordencompra.setanio_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalleordencompra.setid_mes((Long) value);detalleordencompra.setmes_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalleordencompra.setid_bodega((Long) value);detalleordencompra.setbodega_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalleordencompra.setid_producto((Long) value);detalleordencompra.setproducto_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalleordencompra.setid_unidad((Long) value);detalleordencompra.setunidad_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalleordencompra.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalleordencompra.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalleordencompra.setcosto_unitario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalleordencompra.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detalleordencompra.setiva_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detalleordencompra.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detalleordencompra.setdisponible((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detalleordencompra.setid_novedad_producto((Long) value);detalleordencompra.setnovedadproducto_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualNovedadProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detalleordencompra.setid_estado_detalle_orden_compra((Long) value);detalleordencompra.setestadodetalleordencompra_descripcion(detalleordencompraBeanSwingJInternalFrame.getActualEstadoDetalleOrdenCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleOrdenCompraModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleOrdenCompraDetalleFormJInternalFrame detalleordencompraJInternalFrame=null;
		
		public DetalleOrdenCompraModel(DetalleOrdenCompraDetalleFormJInternalFrame detalleordencompraJInternalFrame) {
			this.detalleordencompraJInternalFrame=detalleordencompraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.detalleordencompraJInternalFrame.getjButtonActualizarToolBarDetalleOrdenCompra();
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.getjButtonActualizarToolBarDetalleOrdenCompra())) {
				componentTab=this.detalleordencompraJInternalFrame.getjButtonEliminarToolBarDetalleOrdenCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.getjButtonEliminarToolBarDetalleOrdenCompra())) {
				componentTab=this.detalleordencompraJInternalFrame.getjButtonCancelarToolBarDetalleOrdenCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.getjButtonCancelarToolBarDetalleOrdenCompra())) {
				componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_orden_compraDetalleOrdenCompra;
				return componentTab;
			}				
			
			*/
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldlote_clienteDetalleOrdenCompra)) {
				componentTab=this.detalleordencompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleOrdenCompra)) {
				componentTab=this.detalleordencompraJInternalFrame.jButtonEliminarDetalleOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jButtonEliminarDetalleOrdenCompra)) {
				componentTab=this.detalleordencompraJInternalFrame.jButtonActualizarDetalleOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jButtonActualizarDetalleOrdenCompra)) {
				componentTab=this.detalleordencompraJInternalFrame.jButtonCancelarDetalleOrdenCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_orden_compraDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_empresaDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_empresaDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_sucursalDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_sucursalDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_ejercicioDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_ejercicioDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_periodoDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_periodoDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_anioDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_anioDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_mesDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_mesDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_bodegaDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_bodegaDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_productoDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_productoDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_unidadDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_unidadDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextAreadescripcionDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextAreadescripcionDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldcantidadDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldcantidadDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFielddescuentoDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFielddescuentoDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldcosto_unitarioDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldcosto_unitarioDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldivaDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldivaDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldiva_valorDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldiva_valorDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldcosto_totalDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldcosto_totalDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFielddisponibleDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFielddisponibleDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_novedad_productoDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_novedad_productoDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldnumero_comprobanteDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldnumero_comprobanteDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldlote_clienteDetalleOrdenCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.detalleordencompraJInternalFrame.getjButtonActualizarToolBarDetalleOrdenCompra();
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.getjButtonEliminarToolBarDetalleOrdenCompra())) {
				componentTab=this.detalleordencompraJInternalFrame.getjButtonActualizarToolBarDetalleOrdenCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.getjButtonCancelarToolBarDetalleOrdenCompra())) {
				componentTab=this.detalleordencompraJInternalFrame.getjButtonEliminarToolBarDetalleOrdenCompra();
				
				return componentTab;
			}
			*/
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_orden_compraDetalleOrdenCompra)) {
				/*
				componentTab=this.detalleordencompraJInternalFrame.getjButtonCancelarToolBarDetalleOrdenCompra();
				*/
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleOrdenCompra)) {
				componentTab=this.detalleordencompraJInternalFrame.jTextFieldlote_clienteDetalleOrdenCompra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jButtonEliminarDetalleOrdenCompra)) {
				componentTab=this.detalleordencompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jButtonActualizarDetalleOrdenCompra)) {
				componentTab=this.detalleordencompraJInternalFrame.jButtonEliminarDetalleOrdenCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jButtonCancelarDetalleOrdenCompra)) {
				componentTab=this.detalleordencompraJInternalFrame.jButtonActualizarDetalleOrdenCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_empresaDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_orden_compraDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_sucursalDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_empresaDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_ejercicioDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_sucursalDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_periodoDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_ejercicioDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_anioDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_periodoDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_mesDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_anioDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_bodegaDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_mesDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_productoDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_bodegaDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_unidadDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_productoDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextAreadescripcionDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_unidadDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldcantidadDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextAreadescripcionDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFielddescuentoDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldcantidadDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldcosto_unitarioDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFielddescuentoDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldivaDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldcosto_unitarioDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldiva_valorDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldivaDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldcosto_totalDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldiva_valorDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFielddisponibleDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldcosto_totalDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jComboBoxid_novedad_productoDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFielddisponibleDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldnumero_comprobanteDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jComboBoxid_novedad_productoDetalleOrdenCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleordencompraJInternalFrame.jTextFieldlote_clienteDetalleOrdenCompra)) {
			componentTab=this.detalleordencompraJInternalFrame.jTextFieldnumero_comprobanteDetalleOrdenCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detalleordencompraJInternalFrame.getjButtonActualizarToolBarDetalleOrdenCompra();
			*/
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detalleordencompraJInternalFrame.getjButtonActualizarToolBarDetalleOrdenCompra();
			*/
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detalleordencompraJInternalFrame.getjButtonCancelarToolBarDetalleOrdenCompra();
			*/
			
			return componentTab;		
		}
		
		public DetalleOrdenCompraDetalleFormJInternalFrame getdetalleordencompraJInternalFrame() {
			return this.detalleordencompraJInternalFrame;
		}
		
		public void setdetalleordencompraJInternalFrame(DetalleOrdenCompraDetalleFormJInternalFrame detalleordencompraJInternalFrame) {
			this.detalleordencompraJInternalFrame=detalleordencompraJInternalFrame;
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
