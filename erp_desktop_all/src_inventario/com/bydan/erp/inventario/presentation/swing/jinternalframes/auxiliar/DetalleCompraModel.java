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

import com.bydan.erp.inventario.util.DetalleCompraConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleCompraParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleCompraBeanSwingJInternalFrame;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleCompraJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleCompraDetalleFormJInternalFrame;

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

public class DetalleCompraModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleCompraConstantesFunciones.LABEL_ID
										,DetalleCompraConstantesFunciones.LABEL_IDCOMPRA
										,DetalleCompraConstantesFunciones.LABEL_IDEMPRESA
										,DetalleCompraConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleCompraConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleCompraConstantesFunciones.LABEL_IDPERIODO
										,DetalleCompraConstantesFunciones.LABEL_IDANIO
										,DetalleCompraConstantesFunciones.LABEL_IDMES
										,DetalleCompraConstantesFunciones.LABEL_IDBODEGA
										,DetalleCompraConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleCompraConstantesFunciones.LABEL_IDUNIDAD
										,DetalleCompraConstantesFunciones.LABEL_DESCRIPCION
										,DetalleCompraConstantesFunciones.LABEL_IDNOVEDADPRODUCTO
										,DetalleCompraConstantesFunciones.LABEL_CANTIDAD
										,DetalleCompraConstantesFunciones.LABEL_COSTOUNITARIO
										,DetalleCompraConstantesFunciones.LABEL_IVA
										,DetalleCompraConstantesFunciones.LABEL_IVAVALOR
										,DetalleCompraConstantesFunciones.LABEL_COSTOTOTAL
										,DetalleCompraConstantesFunciones.LABEL_DISPONIBLE
										,DetalleCompraConstantesFunciones.LABEL_SERIE
										,DetalleCompraConstantesFunciones.LABEL_LOTE
										,DetalleCompraConstantesFunciones.LABEL_FECHAELABORACIONLOTE
										,DetalleCompraConstantesFunciones.LABEL_FECHACADUCIDADLOTE
										};
	   
	    public List<DetalleCompra> detallecompras;
	  	 
	    //NO SE UTILIZA
	    public DetalleCompraModel(List<DetalleCompra> detallecompras,JInternalFrameBase jInternalFrameBase) {
	    	this.detallecompras=detallecompras;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleCompraModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detallecompras=new ArrayList<DetalleCompra>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detallecompras.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detallecompras.get(rowIndex).getIsSelected();
	            
				case 1: return this.detallecompras.get(rowIndex).getId();
				case 2: return this.detallecompras.get(rowIndex).getid_compra();
				case 3: return this.detallecompras.get(rowIndex).getid_empresa();
				case 4: return this.detallecompras.get(rowIndex).getid_sucursal();
				case 5: return this.detallecompras.get(rowIndex).getid_ejercicio();
				case 6: return this.detallecompras.get(rowIndex).getid_periodo();
				case 7: return this.detallecompras.get(rowIndex).getid_anio();
				case 8: return this.detallecompras.get(rowIndex).getid_mes();
				case 9: return this.detallecompras.get(rowIndex).getid_bodega();
				case 10: return this.detallecompras.get(rowIndex).getid_producto();
				case 11: return this.detallecompras.get(rowIndex).getid_unidad();
				case 12: return this.detallecompras.get(rowIndex).getdescripcion();
				case 13: return this.detallecompras.get(rowIndex).getid_novedad_producto();
				case 14: return this.detallecompras.get(rowIndex).getcantidad();
				case 15: return this.detallecompras.get(rowIndex).getcosto_unitario();
				case 16: return this.detallecompras.get(rowIndex).getiva();
				case 17: return this.detallecompras.get(rowIndex).getiva_valor();
				case 18: return this.detallecompras.get(rowIndex).getcosto_total();
				case 19: return this.detallecompras.get(rowIndex).getdisponible();
				case 20: return this.detallecompras.get(rowIndex).getserie();
				case 21: return this.detallecompras.get(rowIndex).getlote();
				case 22: return this.detallecompras.get(rowIndex).getfecha_elaboracion_lote();
				case 23: return this.detallecompras.get(rowIndex).getfecha_caducidad_lote();	            
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
				case 13: return Long.class;
				case 14: return Integer.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Integer.class;
				case 20: return String.class;
				case 21: return String.class;
				case 22: return Date.class;
				case 23: return Date.class;	            
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
	    	DetalleCompra detallecompra = this.detallecompras.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleCompraBeanSwingJInternalFrame detallecompraBeanSwingJInternalFrame=(DetalleCompraBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallecompra.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallecompra.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallecompra.setid_compra((Long) value);detallecompra.setcompra_descripcion(detallecompraBeanSwingJInternalFrame.getActualCompraForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallecompra.setid_empresa((Long) value);detallecompra.setempresa_descripcion(detallecompraBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallecompra.setid_sucursal((Long) value);detallecompra.setsucursal_descripcion(detallecompraBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallecompra.setid_ejercicio((Long) value);detallecompra.setejercicio_descripcion(detallecompraBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallecompra.setid_periodo((Long) value);detallecompra.setperiodo_descripcion(detallecompraBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallecompra.setid_anio((Long) value);detallecompra.setanio_descripcion(detallecompraBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallecompra.setid_mes((Long) value);detallecompra.setmes_descripcion(detallecompraBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallecompra.setid_bodega((Long) value);detallecompra.setbodega_descripcion(detallecompraBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallecompra.setid_producto((Long) value);detallecompra.setproducto_descripcion(detallecompraBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallecompra.setid_unidad((Long) value);detallecompra.setunidad_descripcion(detallecompraBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallecompra.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallecompra.setid_novedad_producto((Long) value);detallecompra.setnovedadproducto_descripcion(detallecompraBeanSwingJInternalFrame.getActualNovedadProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallecompra.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallecompra.setcosto_unitario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallecompra.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallecompra.setiva_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detallecompra.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detallecompra.setdisponible((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detallecompra.setserie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detallecompra.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detallecompra.setfecha_elaboracion_lote((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detallecompra.setfecha_caducidad_lote((Date) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleCompraModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleCompraDetalleFormJInternalFrame detallecompraJInternalFrame=null;
		
		public DetalleCompraModel(DetalleCompraDetalleFormJInternalFrame detallecompraJInternalFrame) {
			this.detallecompraJInternalFrame=detallecompraJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.detallecompraJInternalFrame.getjButtonActualizarToolBarDetalleCompra();
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.getjButtonActualizarToolBarDetalleCompra())) {
				componentTab=this.detallecompraJInternalFrame.getjButtonEliminarToolBarDetalleCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.getjButtonEliminarToolBarDetalleCompra())) {
				componentTab=this.detallecompraJInternalFrame.getjButtonCancelarToolBarDetalleCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.getjButtonCancelarToolBarDetalleCompra())) {
				componentTab=this.detallecompraJInternalFrame.jComboBoxid_compraDetalleCompra;
				return componentTab;
			}				
			
			*/
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldlote_clienteDetalleCompra)) {
				componentTab=this.detallecompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleCompra)) {
				componentTab=this.detallecompraJInternalFrame.jButtonEliminarDetalleCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.jButtonEliminarDetalleCompra)) {
				componentTab=this.detallecompraJInternalFrame.jButtonActualizarDetalleCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.jButtonActualizarDetalleCompra)) {
				componentTab=this.detallecompraJInternalFrame.jButtonCancelarDetalleCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_compraDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_empresaDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_empresaDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_sucursalDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_sucursalDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_ejercicioDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_ejercicioDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_periodoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_periodoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_anioDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_anioDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_mesDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_mesDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_estado_detalle_inventarioDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_estado_detalle_inventarioDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_bodegaDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_bodegaDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_productoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_productoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_unidadDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_unidadDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextAreadescripcionDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextAreadescripcionDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_novedad_productoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_novedad_productoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldcantidadDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldcantidadDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFielddescuentoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFielddescuentoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldcosto_unitarioDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldcosto_unitarioDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldivaDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldivaDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldiva_valorDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldiva_valorDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldcosto_totalDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldcosto_totalDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFielddisponibleDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFielddisponibleDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jCheckBoxcosto_ivaDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jCheckBoxcosto_ivaDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldiceDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldiceDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldice_valorDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldice_valorDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFielddescuento1DetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFielddescuento1DetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFielddescuento2DetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFielddescuento2DetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldserieDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldserieDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldloteDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldloteDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jDateChooserfecha_caducidad_loteDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jDateChooserfecha_caducidad_loteDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_centro_costoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_centro_costoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldnumero_comprobanteDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldnumero_comprobanteDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldlote_clienteDetalleCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.detallecompraJInternalFrame.getjButtonActualizarToolBarDetalleCompra();
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.getjButtonEliminarToolBarDetalleCompra())) {
				componentTab=this.detallecompraJInternalFrame.getjButtonActualizarToolBarDetalleCompra();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.getjButtonCancelarToolBarDetalleCompra())) {
				componentTab=this.detallecompraJInternalFrame.getjButtonEliminarToolBarDetalleCompra();
				
				return componentTab;
			}
			*/
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_compraDetalleCompra)) {
				/*
				componentTab=this.detallecompraJInternalFrame.getjButtonCancelarToolBarDetalleCompra();
				*/
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleCompra)) {
				componentTab=this.detallecompraJInternalFrame.jTextFieldlote_clienteDetalleCompra;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.jButtonEliminarDetalleCompra)) {
				componentTab=this.detallecompraJInternalFrame.jComboBoxTiposAccionesFormularioDetalleCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.jButtonActualizarDetalleCompra)) {
				componentTab=this.detallecompraJInternalFrame.jButtonEliminarDetalleCompra;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallecompraJInternalFrame.jButtonCancelarDetalleCompra)) {
				componentTab=this.detallecompraJInternalFrame.jButtonActualizarDetalleCompra;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_empresaDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_compraDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_sucursalDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_empresaDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_ejercicioDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_sucursalDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_periodoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_ejercicioDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_anioDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_periodoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_mesDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_anioDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_estado_detalle_inventarioDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_mesDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_bodegaDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_estado_detalle_inventarioDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_productoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_bodegaDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_unidadDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_productoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextAreadescripcionDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_unidadDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_novedad_productoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextAreadescripcionDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldcantidadDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_novedad_productoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFielddescuentoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldcantidadDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldcosto_unitarioDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFielddescuentoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldivaDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldcosto_unitarioDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldiva_valorDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldivaDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldcosto_totalDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldiva_valorDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFielddisponibleDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldcosto_totalDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jCheckBoxcosto_ivaDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFielddisponibleDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldiceDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jCheckBoxcosto_ivaDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldice_valorDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldiceDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFielddescuento1DetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldice_valorDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFielddescuento2DetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFielddescuento1DetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldserieDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFielddescuento2DetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldloteDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldserieDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldloteDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jDateChooserfecha_caducidad_loteDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_centro_costoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jDateChooserfecha_caducidad_loteDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_centro_costoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldnumero_comprobanteDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleCompra;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallecompraJInternalFrame.jTextFieldlote_clienteDetalleCompra)) {
			componentTab=this.detallecompraJInternalFrame.jTextFieldnumero_comprobanteDetalleCompra;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detallecompraJInternalFrame.getjButtonActualizarToolBarDetalleCompra();
			*/
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detallecompraJInternalFrame.getjButtonActualizarToolBarDetalleCompra();
			*/
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detallecompraJInternalFrame.getjButtonCancelarToolBarDetalleCompra();
			*/
			
			return componentTab;		
		}
		
		public DetalleCompraDetalleFormJInternalFrame getdetallecompraJInternalFrame() {
			return this.detallecompraJInternalFrame;
		}
		
		public void setdetallecompraJInternalFrame(DetalleCompraDetalleFormJInternalFrame detallecompraJInternalFrame) {
			this.detallecompraJInternalFrame=detallecompraJInternalFrame;
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
