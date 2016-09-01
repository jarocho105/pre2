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

import com.bydan.erp.inventario.util.BodegaConstantesFunciones;
import com.bydan.erp.inventario.util.BodegaParameterReturnGeneral;
//import com.bydan.erp.inventario.util.BodegaParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.BodegaBeanSwingJInternalFrame;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.BodegaJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.BodegaDetalleFormJInternalFrame;

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
import com.bydan.erp.nomina.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class BodegaModel extends FocusTraversalPolicy implements TableModel, Serializable {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,BodegaConstantesFunciones.LABEL_ID
										,BodegaConstantesFunciones.LABEL_IDEMPRESA
										,BodegaConstantesFunciones.LABEL_IDGRUPOBODEGA
										,BodegaConstantesFunciones.LABEL_IDCALIDADPRODUCTO
										,BodegaConstantesFunciones.LABEL_CODIGO
										,BodegaConstantesFunciones.LABEL_NOMBRE
										,BodegaConstantesFunciones.LABEL_SIGLAS
										,BodegaConstantesFunciones.LABEL_DIRECCION
										,BodegaConstantesFunciones.LABEL_TELEFONO
										,BodegaConstantesFunciones.LABEL_RUC
										,BodegaConstantesFunciones.LABEL_RESPONSABLENOMBRE
										,BodegaConstantesFunciones.LABEL_DESCRIPCION
										,BodegaConstantesFunciones.LABEL_IDPAIS
										,BodegaConstantesFunciones.LABEL_IDCIUDAD
										,BodegaConstantesFunciones.LABEL_IDCENTROCOSTO
										,BodegaConstantesFunciones.LABEL_IDEMPLEADO
										,BodegaConstantesFunciones.LABEL_ESMULTIEMPRESA
										,BodegaConstantesFunciones.LABEL_CONMOSTRARSTOCK
										,BodegaConstantesFunciones.LABEL_ESBODEGATRANSITO
										,BodegaConstantesFunciones.LABEL_CONSTOCKNEGATIVO
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEBONIFICA
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION
										,BodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOBONIFICA
										};
	   
	    public List<Bodega> bodegas;
	  	 
	    //NO SE UTILIZA
	    public BodegaModel(List<Bodega> bodegas,JInternalFrameBase jInternalFrameBase) {
	    	this.bodegas=bodegas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public BodegaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.bodegas=new ArrayList<Bodega>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.bodegas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.bodegas.get(rowIndex).getIsSelected();
	            
				case 1: return this.bodegas.get(rowIndex).getId();
				case 2: return this.bodegas.get(rowIndex).getid_empresa();
				case 3: return this.bodegas.get(rowIndex).getid_grupo_bodega();
				case 4: return this.bodegas.get(rowIndex).getid_calidad_producto();
				case 5: return this.bodegas.get(rowIndex).getcodigo();
				case 6: return this.bodegas.get(rowIndex).getnombre();
				case 7: return this.bodegas.get(rowIndex).getsiglas();
				case 8: return this.bodegas.get(rowIndex).getdireccion();
				case 9: return this.bodegas.get(rowIndex).gettelefono();
				case 10: return this.bodegas.get(rowIndex).getruc();
				case 11: return this.bodegas.get(rowIndex).getresponsable_nombre();
				case 12: return this.bodegas.get(rowIndex).getdescripcion();
				case 13: return this.bodegas.get(rowIndex).getid_pais();
				case 14: return this.bodegas.get(rowIndex).getid_ciudad();
				case 15: return this.bodegas.get(rowIndex).getid_centro_costo();
				case 16: return this.bodegas.get(rowIndex).getid_empleado();
				case 17: return this.bodegas.get(rowIndex).getes_multi_empresa();
				case 18: return this.bodegas.get(rowIndex).getcon_mostrar_stock();
				case 19: return this.bodegas.get(rowIndex).getes_bodega_transito();
				case 20: return this.bodegas.get(rowIndex).getcon_stock_negativo();
				case 21: return this.bodegas.get(rowIndex).getid_cuenta_contable_inventario();
				case 22: return this.bodegas.get(rowIndex).getid_cuenta_contable_costo();
				case 23: return this.bodegas.get(rowIndex).getid_cuenta_contable_venta();
				case 24: return this.bodegas.get(rowIndex).getid_cuenta_contable_descuento();
				case 25: return this.bodegas.get(rowIndex).getid_cuenta_contable_devolucion();
				case 26: return this.bodegas.get(rowIndex).getid_cuenta_contable_debito();
				case 27: return this.bodegas.get(rowIndex).getid_cuenta_contable_credito();
				case 28: return this.bodegas.get(rowIndex).getid_cuenta_contable_bonifica();
				case 29: return this.bodegas.get(rowIndex).getid_cuenta_contable_produccion();
				case 30: return this.bodegas.get(rowIndex).getid_cuenta_contable_costo_bonifica();	            
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
				case 5: return String.class;
				case 6: return String.class;
				case 7: return String.class;
				case 8: return String.class;
				case 9: return String.class;
				case 10: return String.class;
				case 11: return String.class;
				case 12: return String.class;
				case 13: return Long.class;
				case 14: return Long.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Boolean.class;
				case 18: return Boolean.class;
				case 19: return Boolean.class;
				case 20: return Boolean.class;
				case 21: return Long.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return Long.class;
				case 27: return Long.class;
				case 28: return Long.class;
				case 29: return Long.class;
				case 30: return Long.class;	            
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
				case 24: return true;
				case 25: return true;
				case 26: return true;
				case 27: return true;
				case 28: return true;
				case 29: return true;
				case 30: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Bodega bodega = this.bodegas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame=(BodegaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {bodega.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {bodega.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {bodega.setid_empresa((Long) value);bodega.setempresa_descripcion(bodegaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {bodega.setid_grupo_bodega((Long) value);bodega.setgrupobodega_descripcion(bodegaBeanSwingJInternalFrame.getActualGrupoBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {bodega.setid_calidad_producto((Long) value);bodega.setcalidadproducto_descripcion(bodegaBeanSwingJInternalFrame.getActualCalidadProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {bodega.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {bodega.setnombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {bodega.setsiglas((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {bodega.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {bodega.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {bodega.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {bodega.setresponsable_nombre((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {bodega.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {bodega.setid_pais((Long) value);bodega.setpais_descripcion(bodegaBeanSwingJInternalFrame.getActualPaisForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {bodega.setid_ciudad((Long) value);bodega.setciudad_descripcion(bodegaBeanSwingJInternalFrame.getActualCiudadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {bodega.setid_centro_costo((Long) value);bodega.setcentrocosto_descripcion(bodegaBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {bodega.setid_empleado((Long) value);bodega.setempleado_descripcion(bodegaBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {bodega.setes_multi_empresa((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {bodega.setcon_mostrar_stock((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {bodega.setes_bodega_transito((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {bodega.setcon_stock_negativo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {bodega.setid_cuenta_contable_inventario((Long) value);bodega.setcuentacontableinventario_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {bodega.setid_cuenta_contable_costo((Long) value);bodega.setcuentacontablecosto_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {bodega.setid_cuenta_contable_venta((Long) value);bodega.setcuentacontableventa_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {bodega.setid_cuenta_contable_descuento((Long) value);bodega.setcuentacontabledescuento_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableDescuentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {bodega.setid_cuenta_contable_devolucion((Long) value);bodega.setcuentacontabledevolucion_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableDevolucionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {bodega.setid_cuenta_contable_debito((Long) value);bodega.setcuentacontabledebito_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {bodega.setid_cuenta_contable_credito((Long) value);bodega.setcuentacontablecredito_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {bodega.setid_cuenta_contable_bonifica((Long) value);bodega.setcuentacontablebonifica_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableBonificaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {bodega.setid_cuenta_contable_produccion((Long) value);bodega.setcuentacontableproduccion_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableProduccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {bodega.setid_cuenta_contable_costo_bonifica((Long) value);bodega.setcuentacontablecostobonifica_descripcion(bodegaBeanSwingJInternalFrame.getActualCuentaContableCostoBonificaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		
			
		/*FUNCIONES PARA FOCUS TRAVERSAL POLICY*/
		
		private Component componentTab=new JTextField();
		private BodegaDetalleFormJInternalFrame bodegaJInternalFrame=null;
		
		public BodegaModel(BodegaDetalleFormJInternalFrame bodegaJInternalFrame) {
			this.bodegaJInternalFrame=bodegaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.bodegaJInternalFrame.getjButtonActualizarToolBarBodega();
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.getjButtonActualizarToolBarBodega())) {
				componentTab=this.bodegaJInternalFrame.getjButtonEliminarToolBarBodega();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.getjButtonEliminarToolBarBodega())) {
				componentTab=this.bodegaJInternalFrame.getjButtonCancelarToolBarBodega();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.getjButtonCancelarToolBarBodega())) {
				componentTab=this.bodegaJInternalFrame.jComboBoxid_empresaBodega;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_costo_bonificaBodega)) {
				componentTab=this.bodegaJInternalFrame.jComboBoxTiposAccionesFormularioBodega;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxTiposAccionesFormularioBodega)) {
				componentTab=this.bodegaJInternalFrame.jButtonEliminarBodega;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.jButtonEliminarBodega)) {
				componentTab=this.bodegaJInternalFrame.jButtonActualizarBodega;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.jButtonActualizarBodega)) {
				componentTab=this.bodegaJInternalFrame.jButtonCancelarBodega;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_empresaBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_grupo_bodegaBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_grupo_bodegaBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_calidad_productoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_calidad_productoBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextAreacodigoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextAreacodigoBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextAreanombreBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextAreanombreBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextFieldsiglasBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextFieldsiglasBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextAreadireccionBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextAreadireccionBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextFieldtelefonoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextFieldtelefonoBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextFieldrucBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextFieldrucBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextArearesponsable_nombreBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextArearesponsable_nombreBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextAreadescripcionBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextAreadescripcionBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_paisBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_paisBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_ciudadBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_ciudadBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_centro_costoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_centro_costoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_empleadoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_empleadoBodega)) {
			componentTab=this.bodegaJInternalFrame.jCheckBoxes_multi_empresaBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jCheckBoxes_multi_empresaBodega)) {
			componentTab=this.bodegaJInternalFrame.jCheckBoxcon_mostrar_stockBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jCheckBoxcon_mostrar_stockBodega)) {
			componentTab=this.bodegaJInternalFrame.jCheckBoxes_bodega_transitoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jCheckBoxes_bodega_transitoBodega)) {
			componentTab=this.bodegaJInternalFrame.jCheckBoxcon_stock_negativoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jCheckBoxcon_stock_negativoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_inventarioBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_inventarioBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_costoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_costoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_ventaBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_ventaBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_descuentoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_descuentoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_devolucionBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_devolucionBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_debitoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_debitoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_creditoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_creditoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_bonificaBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_bonificaBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_produccionBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_produccionBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_costo_bonificaBodega;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.bodegaJInternalFrame.getjButtonActualizarToolBarBodega();
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.getjButtonEliminarToolBarBodega())) {
				componentTab=this.bodegaJInternalFrame.getjButtonActualizarToolBarBodega();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.getjButtonCancelarToolBarBodega())) {
				componentTab=this.bodegaJInternalFrame.getjButtonEliminarToolBarBodega();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_empresaBodega)) {
				
				componentTab=this.bodegaJInternalFrame.getjButtonCancelarToolBarBodega();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxTiposAccionesFormularioBodega)) {
				componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_costo_bonificaBodega;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.jButtonEliminarBodega)) {
				componentTab=this.bodegaJInternalFrame.jComboBoxTiposAccionesFormularioBodega;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.jButtonActualizarBodega)) {
				componentTab=this.bodegaJInternalFrame.jButtonEliminarBodega;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaJInternalFrame.jButtonCancelarBodega)) {
				componentTab=this.bodegaJInternalFrame.jButtonActualizarBodega;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_grupo_bodegaBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_empresaBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_calidad_productoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_grupo_bodegaBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextAreacodigoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_calidad_productoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextAreanombreBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextAreacodigoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextFieldsiglasBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextAreanombreBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextAreadireccionBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextFieldsiglasBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextFieldtelefonoBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextAreadireccionBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextFieldrucBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextFieldtelefonoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextArearesponsable_nombreBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextFieldrucBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jTextAreadescripcionBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextArearesponsable_nombreBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_paisBodega)) {
			componentTab=this.bodegaJInternalFrame.jTextAreadescripcionBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_ciudadBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_paisBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_centro_costoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_ciudadBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_empleadoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_centro_costoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jCheckBoxes_multi_empresaBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_empleadoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jCheckBoxcon_mostrar_stockBodega)) {
			componentTab=this.bodegaJInternalFrame.jCheckBoxes_multi_empresaBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jCheckBoxes_bodega_transitoBodega)) {
			componentTab=this.bodegaJInternalFrame.jCheckBoxcon_mostrar_stockBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jCheckBoxcon_stock_negativoBodega)) {
			componentTab=this.bodegaJInternalFrame.jCheckBoxes_bodega_transitoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_inventarioBodega)) {
			componentTab=this.bodegaJInternalFrame.jCheckBoxcon_stock_negativoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_costoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_inventarioBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_ventaBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_costoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_descuentoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_ventaBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_devolucionBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_descuentoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_debitoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_devolucionBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_creditoBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_debitoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_bonificaBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_creditoBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_produccionBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_bonificaBodega;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_costo_bonificaBodega)) {
			componentTab=this.bodegaJInternalFrame.jComboBoxid_cuenta_contable_produccionBodega;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.bodegaJInternalFrame.getjButtonActualizarToolBarBodega();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.bodegaJInternalFrame.getjButtonActualizarToolBarBodega();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.bodegaJInternalFrame.getjButtonCancelarToolBarBodega();
			
			
			return componentTab;		
		}
		
		public BodegaDetalleFormJInternalFrame getbodegaJInternalFrame() {
			return this.bodegaJInternalFrame;
		}
		
		public void setbodegaJInternalFrame(BodegaDetalleFormJInternalFrame bodegaJInternalFrame) {
			this.bodegaJInternalFrame=bodegaJInternalFrame;
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
