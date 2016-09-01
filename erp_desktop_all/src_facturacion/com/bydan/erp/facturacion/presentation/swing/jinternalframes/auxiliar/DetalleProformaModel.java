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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.facturacion.util.DetalleProformaConstantesFunciones;
import com.bydan.erp.facturacion.util.DetalleProformaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetalleProformaParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetalleProformaBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetalleProformaJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.DetalleProformaDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleProformaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleProformaConstantesFunciones.LABEL_ID
										,DetalleProformaConstantesFunciones.LABEL_IDEMPRESA
										,DetalleProformaConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleProformaConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleProformaConstantesFunciones.LABEL_IDPERIODO
										,DetalleProformaConstantesFunciones.LABEL_IDANIO
										,DetalleProformaConstantesFunciones.LABEL_IDMES
										,DetalleProformaConstantesFunciones.LABEL_IDPROFORMA
										,DetalleProformaConstantesFunciones.LABEL_IDBODEGA
										,DetalleProformaConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleProformaConstantesFunciones.LABEL_IDUNIDAD
										,DetalleProformaConstantesFunciones.LABEL_IDEMPAQUE
										,DetalleProformaConstantesFunciones.LABEL_IDCENTROCOSTO
										,DetalleProformaConstantesFunciones.LABEL_IDESTADODETALLEPROFORMA
										,DetalleProformaConstantesFunciones.LABEL_DESCRIPCION
										,DetalleProformaConstantesFunciones.LABEL_CANTIDADENVASES
										,DetalleProformaConstantesFunciones.LABEL_CANTIDAD
										,DetalleProformaConstantesFunciones.LABEL_PRECIO
										,DetalleProformaConstantesFunciones.LABEL_IVA
										,DetalleProformaConstantesFunciones.LABEL_DESCUENTOPORCENTAJE
										,DetalleProformaConstantesFunciones.LABEL_DESCUENTOVALOR
										,DetalleProformaConstantesFunciones.LABEL_LOTE
										,DetalleProformaConstantesFunciones.LABEL_TOTAL
										};
	   
	    public List<DetalleProforma> detalleproformas;
	  	 
	    //NO SE UTILIZA
	    public DetalleProformaModel(List<DetalleProforma> detalleproformas,JInternalFrameBase jInternalFrameBase) {
	    	this.detalleproformas=detalleproformas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleProformaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detalleproformas=new ArrayList<DetalleProforma>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detalleproformas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detalleproformas.get(rowIndex).getIsSelected();
	            
				case 1: return this.detalleproformas.get(rowIndex).getId();
				case 2: return this.detalleproformas.get(rowIndex).getid_empresa();
				case 3: return this.detalleproformas.get(rowIndex).getid_sucursal();
				case 4: return this.detalleproformas.get(rowIndex).getid_ejercicio();
				case 5: return this.detalleproformas.get(rowIndex).getid_periodo();
				case 6: return this.detalleproformas.get(rowIndex).getid_anio();
				case 7: return this.detalleproformas.get(rowIndex).getid_mes();
				case 8: return this.detalleproformas.get(rowIndex).getid_proforma();
				case 9: return this.detalleproformas.get(rowIndex).getid_bodega();
				case 10: return this.detalleproformas.get(rowIndex).getid_producto();
				case 11: return this.detalleproformas.get(rowIndex).getid_unidad();
				case 12: return this.detalleproformas.get(rowIndex).getid_empaque();
				case 13: return this.detalleproformas.get(rowIndex).getid_centro_costo();
				case 14: return this.detalleproformas.get(rowIndex).getid_estado_detalle_proforma();
				case 15: return this.detalleproformas.get(rowIndex).getdescripcion();
				case 16: return this.detalleproformas.get(rowIndex).getcantidad_envases();
				case 17: return this.detalleproformas.get(rowIndex).getcantidad();
				case 18: return this.detalleproformas.get(rowIndex).getprecio();
				case 19: return this.detalleproformas.get(rowIndex).getiva();
				case 20: return this.detalleproformas.get(rowIndex).getdescuento_porcentaje();
				case 21: return this.detalleproformas.get(rowIndex).getdescuento_valor();
				case 22: return this.detalleproformas.get(rowIndex).getlote();
				case 23: return this.detalleproformas.get(rowIndex).gettotal();	            
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
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return String.class;
				case 16: return Double.class;
				case 17: return Integer.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return String.class;
				case 23: return Double.class;	            
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
	    	DetalleProforma detalleproforma = this.detalleproformas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFrame=(DetalleProformaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detalleproforma.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detalleproforma.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detalleproforma.setid_empresa((Long) value);detalleproforma.setempresa_descripcion(detalleproformaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detalleproforma.setid_sucursal((Long) value);detalleproforma.setsucursal_descripcion(detalleproformaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detalleproforma.setid_ejercicio((Long) value);detalleproforma.setejercicio_descripcion(detalleproformaBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detalleproforma.setid_periodo((Long) value);detalleproforma.setperiodo_descripcion(detalleproformaBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detalleproforma.setid_anio((Long) value);detalleproforma.setanio_descripcion(detalleproformaBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detalleproforma.setid_mes((Long) value);detalleproforma.setmes_descripcion(detalleproformaBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detalleproforma.setid_proforma((Long) value);detalleproforma.setproforma_descripcion(detalleproformaBeanSwingJInternalFrame.getActualProformaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detalleproforma.setid_bodega((Long) value);detalleproforma.setbodega_descripcion(detalleproformaBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detalleproforma.setid_producto((Long) value);detalleproforma.setproducto_descripcion(detalleproformaBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detalleproforma.setid_unidad((Long) value);detalleproforma.setunidad_descripcion(detalleproformaBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detalleproforma.setid_empaque((Long) value);detalleproforma.setempaque_descripcion(detalleproformaBeanSwingJInternalFrame.getActualEmpaqueForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detalleproforma.setid_centro_costo((Long) value);detalleproforma.setcentrocosto_descripcion(detalleproformaBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detalleproforma.setid_estado_detalle_proforma((Long) value);detalleproforma.setestadodetalleproforma_descripcion(detalleproformaBeanSwingJInternalFrame.getActualEstadoDetalleProformaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detalleproforma.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detalleproforma.setcantidad_envases((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detalleproforma.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detalleproforma.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detalleproforma.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detalleproforma.setdescuento_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detalleproforma.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detalleproforma.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detalleproforma.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleProformaModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleProformaDetalleFormJInternalFrame detalleproformaJInternalFrame=null;
		
		public DetalleProformaModel(DetalleProformaDetalleFormJInternalFrame detalleproformaJInternalFrame) {
			this.detalleproformaJInternalFrame=detalleproformaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleproformaJInternalFrame.getjButtonActualizarToolBarDetalleProforma();
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.getjButtonActualizarToolBarDetalleProforma())) {
				componentTab=this.detalleproformaJInternalFrame.getjButtonEliminarToolBarDetalleProforma();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.getjButtonEliminarToolBarDetalleProforma())) {
				componentTab=this.detalleproformaJInternalFrame.getjButtonCancelarToolBarDetalleProforma();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.getjButtonCancelarToolBarDetalleProforma())) {
				componentTab=this.detalleproformaJInternalFrame.jComboBoxid_empresaDetalleProforma;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextAreamedidaDetalleProforma)) {
				componentTab=this.detalleproformaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleProforma)) {
				componentTab=this.detalleproformaJInternalFrame.jButtonEliminarDetalleProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.jButtonEliminarDetalleProforma)) {
				componentTab=this.detalleproformaJInternalFrame.jButtonActualizarDetalleProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.jButtonActualizarDetalleProforma)) {
				componentTab=this.detalleproformaJInternalFrame.jButtonCancelarDetalleProforma;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_empresaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_sucursalDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_sucursalDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_ejercicioDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_ejercicioDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_periodoDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_periodoDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_anioDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_anioDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_mesDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_mesDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_proformaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_proformaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_bodegaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_bodegaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_productoDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_productoDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_unidadDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_unidadDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_empaqueDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_empaqueDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_centro_costoDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_centro_costoDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_estado_detalle_proformaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_estado_detalle_proformaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextAreadescripcionDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextAreadescripcionDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldcantidad_envasesDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldcantidad_envasesDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldcantidadDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldcantidadDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldprecioDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldprecioDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldivaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldivaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFielddescuento_porcentajeDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFielddescuento_porcentajeDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFielddescuento_valorDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFielddescuento_valorDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldloteDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldloteDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldtotalDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldtotalDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldiceDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldiceDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldcostoDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldcostoDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldutilidadDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldutilidadDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextAreaareaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextAreaareaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextAreamedidaDetalleProforma;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detalleproformaJInternalFrame.getjButtonActualizarToolBarDetalleProforma();
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.getjButtonEliminarToolBarDetalleProforma())) {
				componentTab=this.detalleproformaJInternalFrame.getjButtonActualizarToolBarDetalleProforma();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.getjButtonCancelarToolBarDetalleProforma())) {
				componentTab=this.detalleproformaJInternalFrame.getjButtonEliminarToolBarDetalleProforma();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_empresaDetalleProforma)) {
				
				componentTab=this.detalleproformaJInternalFrame.getjButtonCancelarToolBarDetalleProforma();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleProforma)) {
				componentTab=this.detalleproformaJInternalFrame.jTextAreamedidaDetalleProforma;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.jButtonEliminarDetalleProforma)) {
				componentTab=this.detalleproformaJInternalFrame.jComboBoxTiposAccionesFormularioDetalleProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.jButtonActualizarDetalleProforma)) {
				componentTab=this.detalleproformaJInternalFrame.jButtonEliminarDetalleProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detalleproformaJInternalFrame.jButtonCancelarDetalleProforma)) {
				componentTab=this.detalleproformaJInternalFrame.jButtonActualizarDetalleProforma;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_sucursalDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_empresaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_ejercicioDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_sucursalDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_periodoDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_ejercicioDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_anioDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_periodoDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_mesDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_anioDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_proformaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_mesDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_bodegaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_proformaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_productoDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_bodegaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_unidadDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_productoDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_empaqueDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_unidadDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_centro_costoDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_empaqueDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jComboBoxid_estado_detalle_proformaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_centro_costoDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextAreadescripcionDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jComboBoxid_estado_detalle_proformaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldcantidad_envasesDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextAreadescripcionDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldcantidadDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldcantidad_envasesDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldprecioDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldcantidadDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldivaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldprecioDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFielddescuento_porcentajeDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldivaDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFielddescuento_valorDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFielddescuento_porcentajeDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldloteDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFielddescuento_valorDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldtotalDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldloteDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldiceDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldtotalDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldcostoDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldiceDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextFieldutilidadDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldcostoDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextAreaareaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextFieldutilidadDetalleProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.detalleproformaJInternalFrame.jTextAreamedidaDetalleProforma)) {
			componentTab=this.detalleproformaJInternalFrame.jTextAreaareaDetalleProforma;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleproformaJInternalFrame.getjButtonActualizarToolBarDetalleProforma();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleproformaJInternalFrame.getjButtonActualizarToolBarDetalleProforma();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detalleproformaJInternalFrame.getjButtonCancelarToolBarDetalleProforma();
			
			
			return componentTab;		
		}
		
		public DetalleProformaDetalleFormJInternalFrame getdetalleproformaJInternalFrame() {
			return this.detalleproformaJInternalFrame;
		}
		
		public void setdetalleproformaJInternalFrame(DetalleProformaDetalleFormJInternalFrame detalleproformaJInternalFrame) {
			this.detalleproformaJInternalFrame=detalleproformaJInternalFrame;
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
