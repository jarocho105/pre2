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

import com.bydan.erp.inventario.util.DetalleTransferenciaConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleTransferenciaParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleTransferenciaParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleTransferenciaBeanSwingJInternalFrame;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleTransferenciaJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DetalleTransferenciaDetalleFormJInternalFrame;

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

public class DetalleTransferenciaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleTransferenciaConstantesFunciones.LABEL_ID
										,DetalleTransferenciaConstantesFunciones.LABEL_IDTRANSFERENCIA
										,DetalleTransferenciaConstantesFunciones.LABEL_IDEMPRESA
										,DetalleTransferenciaConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleTransferenciaConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleTransferenciaConstantesFunciones.LABEL_IDPERIODO
										,DetalleTransferenciaConstantesFunciones.LABEL_IDANIO
										,DetalleTransferenciaConstantesFunciones.LABEL_IDMES
										,DetalleTransferenciaConstantesFunciones.LABEL_IDBODEGA
										,DetalleTransferenciaConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleTransferenciaConstantesFunciones.LABEL_IDUNIDAD
										,DetalleTransferenciaConstantesFunciones.LABEL_IDBODEGAENVIAR
										,DetalleTransferenciaConstantesFunciones.LABEL_DESCRIPCION
										,DetalleTransferenciaConstantesFunciones.LABEL_IDNOVEDADPRODUCTO
										,DetalleTransferenciaConstantesFunciones.LABEL_IDESTADODETALLEINVENTARIO
										,DetalleTransferenciaConstantesFunciones.LABEL_CANTIDAD
										,DetalleTransferenciaConstantesFunciones.LABEL_COSTOUNITARIO
										,DetalleTransferenciaConstantesFunciones.LABEL_COSTOTOTAL
										,DetalleTransferenciaConstantesFunciones.LABEL_DISPONIBLE
										,DetalleTransferenciaConstantesFunciones.LABEL_LOTE
										,DetalleTransferenciaConstantesFunciones.LABEL_FECHAELABORACIONLOTE
										,DetalleTransferenciaConstantesFunciones.LABEL_FECHACADUCIDADLOTE
										};
	   
	    public List<DetalleTransferencia> detalletransferencias;
	  	 
	    //NO SE UTILIZA
	    public DetalleTransferenciaModel(List<DetalleTransferencia> detalletransferencias,JInternalFrameBase jInternalFrameBase) {
	    	this.detalletransferencias=detalletransferencias;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleTransferenciaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalletransferencias=new ArrayList<DetalleTransferencia>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalletransferencias.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalletransferencias.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalletransferencias.get(rowIndex).getId();
				case 2: return this.detalletransferencias.get(rowIndex).getid_transferencia();
				case 3: return this.detalletransferencias.get(rowIndex).getid_empresa();
				case 4: return this.detalletransferencias.get(rowIndex).getid_sucursal();
				case 5: return this.detalletransferencias.get(rowIndex).getid_ejercicio();
				case 6: return this.detalletransferencias.get(rowIndex).getid_periodo();
				case 7: return this.detalletransferencias.get(rowIndex).getid_anio();
				case 8: return this.detalletransferencias.get(rowIndex).getid_mes();
				case 9: return this.detalletransferencias.get(rowIndex).getid_bodega();
				case 10: return this.detalletransferencias.get(rowIndex).getid_producto();
				case 11: return this.detalletransferencias.get(rowIndex).getid_unidad();
				case 12: return this.detalletransferencias.get(rowIndex).getid_bodega_enviar();
				case 13: return this.detalletransferencias.get(rowIndex).getdescripcion();
				case 14: return this.detalletransferencias.get(rowIndex).getid_novedad_producto();
				case 15: return this.detalletransferencias.get(rowIndex).getid_estado_detalle_inventario();
				case 16: return this.detalletransferencias.get(rowIndex).getcantidad();
				case 17: return this.detalletransferencias.get(rowIndex).getcosto_unitario();
				case 18: return this.detalletransferencias.get(rowIndex).getcosto_total();
				case 19: return this.detalletransferencias.get(rowIndex).getdisponible();
				case 20: return this.detalletransferencias.get(rowIndex).getlote();
				case 21: return this.detalletransferencias.get(rowIndex).getfecha_elaboracion_lote();
				case 22: return this.detalletransferencias.get(rowIndex).getfecha_caducidad_lote();	            
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
				case 13: return String.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Integer.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Integer.class;
				case 20: return String.class;
				case 21: return Date.class;
				case 22: return Date.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleTransferencia detalletransferencia = this.detalletransferencias.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFrame=(DetalleTransferenciaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalletransferencia.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalletransferencia.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalletransferencia.setid_transferencia((Long) value);detalletransferencia.settransferencia_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualTransferenciaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalletransferencia.setid_empresa((Long) value);detalletransferencia.setempresa_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalletransferencia.setid_sucursal((Long) value);detalletransferencia.setsucursal_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalletransferencia.setid_ejercicio((Long) value);detalletransferencia.setejercicio_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalletransferencia.setid_periodo((Long) value);detalletransferencia.setperiodo_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalletransferencia.setid_anio((Long) value);detalletransferencia.setanio_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalletransferencia.setid_mes((Long) value);detalletransferencia.setmes_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalletransferencia.setid_bodega((Long) value);detalletransferencia.setbodega_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalletransferencia.setid_producto((Long) value);detalletransferencia.setproducto_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalletransferencia.setid_unidad((Long) value);detalletransferencia.setunidad_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalletransferencia.setid_bodega_enviar((Long) value);detalletransferencia.setbodegaenviar_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualBodegaEnviarForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalletransferencia.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalletransferencia.setid_novedad_producto((Long) value);detalletransferencia.setnovedadproducto_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualNovedadProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalletransferencia.setid_estado_detalle_inventario((Long) value);detalletransferencia.setestadodetalleinventario_descripcion(detalletransferenciaBeanSwingJInternalFrame.getActualEstadoDetalleInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detalletransferencia.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detalletransferencia.setcosto_unitario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detalletransferencia.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detalletransferencia.setdisponible((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detalletransferencia.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detalletransferencia.setfecha_elaboracion_lote((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detalletransferencia.setfecha_caducidad_lote((Date) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleTransferenciaModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleTransferenciaDetalleFormJInternalFrame detalletransferenciaJInternalFrame=null;
		
		public DetalleTransferenciaModel(DetalleTransferenciaDetalleFormJInternalFrame detalletransferenciaJInternalFrame) {
			this.detalletransferenciaJInternalFrame=detalletransferenciaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.detalletransferenciaJInternalFrame.getjButtonActualizarToolBarDetalleTransferencia();
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.getjButtonActualizarToolBarDetalleTransferencia())) {
				componentTab=this.detalletransferenciaJInternalFrame.getjButtonEliminarToolBarDetalleTransferencia();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.getjButtonEliminarToolBarDetalleTransferencia())) {
				componentTab=this.detalletransferenciaJInternalFrame.getjButtonCancelarToolBarDetalleTransferencia();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.getjButtonCancelarToolBarDetalleTransferencia())) {
				componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_transferenciaDetalleTransferencia;
				return componentTab;
			}				
			
			*/
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldlote_clienteDetalleTransferencia)) {
				componentTab=this.detalletransferenciaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleTransferencia)) {
				componentTab=this.detalletransferenciaJInternalFrame.jButtonEliminarDetalleTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jButtonEliminarDetalleTransferencia)) {
				componentTab=this.detalletransferenciaJInternalFrame.jButtonActualizarDetalleTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jButtonActualizarDetalleTransferencia)) {
				componentTab=this.detalletransferenciaJInternalFrame.jButtonCancelarDetalleTransferencia;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_transferenciaDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_empresaDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_empresaDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_sucursalDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_sucursalDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_ejercicioDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_ejercicioDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_periodoDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_periodoDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_anioDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_anioDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_mesDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_mesDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_bodegaDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_bodegaDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_productoDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_productoDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_unidadDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_unidadDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_bodega_enviarDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_bodega_enviarDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextAreadescripcionDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextAreadescripcionDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_novedad_productoDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_novedad_productoDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldcantidadDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldcantidadDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFielddescuentoDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFielddescuentoDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldcosto_unitarioDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldcosto_unitarioDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldcosto_totalDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldcosto_totalDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFielddisponibleDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFielddisponibleDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldloteDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldloteDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jDateChooserfecha_caducidad_loteDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jDateChooserfecha_caducidad_loteDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldnumero_comprobanteDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldnumero_comprobanteDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldlote_clienteDetalleTransferencia;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			/*
			componentTab=this.detalletransferenciaJInternalFrame.getjButtonActualizarToolBarDetalleTransferencia();
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.getjButtonEliminarToolBarDetalleTransferencia())) {
				componentTab=this.detalletransferenciaJInternalFrame.getjButtonActualizarToolBarDetalleTransferencia();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.getjButtonCancelarToolBarDetalleTransferencia())) {
				componentTab=this.detalletransferenciaJInternalFrame.getjButtonEliminarToolBarDetalleTransferencia();
				
				return componentTab;
			}
			*/
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_transferenciaDetalleTransferencia)) {
				/*
				componentTab=this.detalletransferenciaJInternalFrame.getjButtonCancelarToolBarDetalleTransferencia();
				*/
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleTransferencia)) {
				componentTab=this.detalletransferenciaJInternalFrame.jTextFieldlote_clienteDetalleTransferencia;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jButtonEliminarDetalleTransferencia)) {
				componentTab=this.detalletransferenciaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jButtonActualizarDetalleTransferencia)) {
				componentTab=this.detalletransferenciaJInternalFrame.jButtonEliminarDetalleTransferencia;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jButtonCancelarDetalleTransferencia)) {
				componentTab=this.detalletransferenciaJInternalFrame.jButtonActualizarDetalleTransferencia;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_empresaDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_transferenciaDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_sucursalDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_empresaDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_ejercicioDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_sucursalDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_periodoDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_ejercicioDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_anioDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_periodoDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_mesDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_anioDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_bodegaDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_mesDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_productoDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_bodegaDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_unidadDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_productoDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_bodega_enviarDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_unidadDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextAreadescripcionDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_bodega_enviarDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jComboBoxid_novedad_productoDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextAreadescripcionDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldcantidadDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jComboBoxid_novedad_productoDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFielddescuentoDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldcantidadDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldcosto_unitarioDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFielddescuentoDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldcosto_totalDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldcosto_unitarioDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFielddisponibleDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldcosto_totalDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldloteDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFielddisponibleDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldloteDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jDateChooserfecha_caducidad_loteDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldnumero_comprobanteDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jDateChooserfecha_caducidad_loteDetalleTransferencia;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalletransferenciaJInternalFrame.jTextFieldlote_clienteDetalleTransferencia)) {
			componentTab=this.detalletransferenciaJInternalFrame.jTextFieldnumero_comprobanteDetalleTransferencia;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detalletransferenciaJInternalFrame.getjButtonActualizarToolBarDetalleTransferencia();
			*/
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detalletransferenciaJInternalFrame.getjButtonActualizarToolBarDetalleTransferencia();
			*/
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			/*
			componentTab=this.detalletransferenciaJInternalFrame.getjButtonCancelarToolBarDetalleTransferencia();
			*/
			
			return componentTab;		
		}
		
		public DetalleTransferenciaDetalleFormJInternalFrame getdetalletransferenciaJInternalFrame() {
			return this.detalletransferenciaJInternalFrame;
		}
		
		public void setdetalletransferenciaJInternalFrame(DetalleTransferenciaDetalleFormJInternalFrame detalletransferenciaJInternalFrame) {
			this.detalletransferenciaJInternalFrame=detalletransferenciaJInternalFrame;
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
