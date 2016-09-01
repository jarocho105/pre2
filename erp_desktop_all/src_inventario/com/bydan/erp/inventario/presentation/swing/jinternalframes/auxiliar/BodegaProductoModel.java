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

import com.bydan.erp.inventario.util.BodegaProductoConstantesFunciones;
import com.bydan.erp.inventario.util.BodegaProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.BodegaProductoParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.BodegaProductoBeanSwingJInternalFrame;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.BodegaProductoJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.BodegaProductoDetalleFormJInternalFrame;

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

public class BodegaProductoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,BodegaProductoConstantesFunciones.LABEL_ID
										,BodegaProductoConstantesFunciones.LABEL_IDEMPRESA
										,BodegaProductoConstantesFunciones.LABEL_IDSUCURSAL
										,BodegaProductoConstantesFunciones.LABEL_IDBODEGA
										,BodegaProductoConstantesFunciones.LABEL_IDPRODUCTO
										,BodegaProductoConstantesFunciones.LABEL_IDUNIDAD
										,BodegaProductoConstantesFunciones.LABEL_IDCENTROCOSTO
										,BodegaProductoConstantesFunciones.LABEL_IDESTADOBODEGAPRODUCTO
										,BodegaProductoConstantesFunciones.LABEL_DESCRIPCION
										,BodegaProductoConstantesFunciones.LABEL_CANTIDADDISPONIBLE
										,BodegaProductoConstantesFunciones.LABEL_STOCKMAXIMO
										,BodegaProductoConstantesFunciones.LABEL_STOCKMINIMO
										,BodegaProductoConstantesFunciones.LABEL_IVA
										,BodegaProductoConstantesFunciones.LABEL_IVAVALOR
										,BodegaProductoConstantesFunciones.LABEL_DESCUENTO
										,BodegaProductoConstantesFunciones.LABEL_DESCUENTOVALOR
										,BodegaProductoConstantesFunciones.LABEL_ICE
										,BodegaProductoConstantesFunciones.LABEL_ICEVALOR
										,BodegaProductoConstantesFunciones.LABEL_COSTOPROMEDIO
										,BodegaProductoConstantesFunciones.LABEL_PORCENTAJECOMISION
										,BodegaProductoConstantesFunciones.LABEL_PRECIO
										,BodegaProductoConstantesFunciones.LABEL_ULTIMOCOSTO
										,BodegaProductoConstantesFunciones.LABEL_COSTO
										,BodegaProductoConstantesFunciones.LABEL_ARANCELPORCENTAJE
										,BodegaProductoConstantesFunciones.LABEL_ICEPORCENTAJE
										,BodegaProductoConstantesFunciones.LABEL_PESO
										,BodegaProductoConstantesFunciones.LABEL_CONIVA
										,BodegaProductoConstantesFunciones.LABEL_CONIMPUESTO
										,BodegaProductoConstantesFunciones.LABEL_CONICE
										,BodegaProductoConstantesFunciones.LABEL_ESTAACTIVO
										,BodegaProductoConstantesFunciones.LABEL_CONBALANZA
										,BodegaProductoConstantesFunciones.LABEL_CANTIDADPEDIDA
										,BodegaProductoConstantesFunciones.LABEL_CANTIDADFISICA
										,BodegaProductoConstantesFunciones.LABEL_CANTIDADREQUERIDO
										,BodegaProductoConstantesFunciones.LABEL_PRECIOCOSTO
										,BodegaProductoConstantesFunciones.LABEL_PRECIOPROMEDIO
										,BodegaProductoConstantesFunciones.LABEL_TOTALINGRESOS
										,BodegaProductoConstantesFunciones.LABEL_TOTALEGRESOS
										,BodegaProductoConstantesFunciones.LABEL_TOTALPROVISION
										,BodegaProductoConstantesFunciones.LABEL_TOTALPROCESO
										,BodegaProductoConstantesFunciones.LABEL_COSTOCALCULADO
										,BodegaProductoConstantesFunciones.LABEL_DIASPRODUCCION
										,BodegaProductoConstantesFunciones.LABEL_PRECIOREPOSICION
										,BodegaProductoConstantesFunciones.LABEL_FECHAULTIMOPEDIDO
										,BodegaProductoConstantesFunciones.LABEL_FECHAINGRESO
										,BodegaProductoConstantesFunciones.LABEL_FECHAEGRESO
										,BodegaProductoConstantesFunciones.LABEL_FECHAULTIMACOMPRA
										,BodegaProductoConstantesFunciones.LABEL_FECHAULTIMAVENTA
										,BodegaProductoConstantesFunciones.LABEL_FECHAULTIMADEVOLUCION
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOVENTA
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESODEBITO
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINGRESOCREDITO
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLERESULTADODEBITO
										,BodegaProductoConstantesFunciones.LABEL_IDCUENTACONTABLERESULTADOCREDITO
										};
	   
	    public List<BodegaProducto> bodegaproductos;
	  	 
	    //NO SE UTILIZA
	    public BodegaProductoModel(List<BodegaProducto> bodegaproductos,JInternalFrameBase jInternalFrameBase) {
	    	this.bodegaproductos=bodegaproductos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public BodegaProductoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.bodegaproductos=new ArrayList<BodegaProducto>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.bodegaproductos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.bodegaproductos.get(rowIndex).getIsSelected();
	            
				case 1: return this.bodegaproductos.get(rowIndex).getId();
				case 2: return this.bodegaproductos.get(rowIndex).getid_empresa();
				case 3: return this.bodegaproductos.get(rowIndex).getid_sucursal();
				case 4: return this.bodegaproductos.get(rowIndex).getid_bodega();
				case 5: return this.bodegaproductos.get(rowIndex).getid_producto();
				case 6: return this.bodegaproductos.get(rowIndex).getid_unidad();
				case 7: return this.bodegaproductos.get(rowIndex).getid_centro_costo();
				case 8: return this.bodegaproductos.get(rowIndex).getid_estado_bodega_producto();
				case 9: return this.bodegaproductos.get(rowIndex).getdescripcion();
				case 10: return this.bodegaproductos.get(rowIndex).getcantidad_disponible();
				case 11: return this.bodegaproductos.get(rowIndex).getstock_maximo();
				case 12: return this.bodegaproductos.get(rowIndex).getstock_minimo();
				case 13: return this.bodegaproductos.get(rowIndex).getiva();
				case 14: return this.bodegaproductos.get(rowIndex).getiva_valor();
				case 15: return this.bodegaproductos.get(rowIndex).getdescuento();
				case 16: return this.bodegaproductos.get(rowIndex).getdescuento_valor();
				case 17: return this.bodegaproductos.get(rowIndex).getice();
				case 18: return this.bodegaproductos.get(rowIndex).getice_valor();
				case 19: return this.bodegaproductos.get(rowIndex).getcosto_promedio();
				case 20: return this.bodegaproductos.get(rowIndex).getporcentaje_comision();
				case 21: return this.bodegaproductos.get(rowIndex).getprecio();
				case 22: return this.bodegaproductos.get(rowIndex).getultimo_costo();
				case 23: return this.bodegaproductos.get(rowIndex).getcosto();
				case 24: return this.bodegaproductos.get(rowIndex).getarancel_porcentaje();
				case 25: return this.bodegaproductos.get(rowIndex).getice_porcentaje();
				case 26: return this.bodegaproductos.get(rowIndex).getpeso();
				case 27: return this.bodegaproductos.get(rowIndex).getcon_iva();
				case 28: return this.bodegaproductos.get(rowIndex).getcon_impuesto();
				case 29: return this.bodegaproductos.get(rowIndex).getcon_ice();
				case 30: return this.bodegaproductos.get(rowIndex).getesta_activo();
				case 31: return this.bodegaproductos.get(rowIndex).getcon_balanza();
				case 32: return this.bodegaproductos.get(rowIndex).getcantidad_pedida();
				case 33: return this.bodegaproductos.get(rowIndex).getcantidad_fisica();
				case 34: return this.bodegaproductos.get(rowIndex).getcantidad_requerido();
				case 35: return this.bodegaproductos.get(rowIndex).getprecio_costo();
				case 36: return this.bodegaproductos.get(rowIndex).getprecio_promedio();
				case 37: return this.bodegaproductos.get(rowIndex).gettotal_ingresos();
				case 38: return this.bodegaproductos.get(rowIndex).gettotal_egresos();
				case 39: return this.bodegaproductos.get(rowIndex).gettotal_provision();
				case 40: return this.bodegaproductos.get(rowIndex).gettotal_proceso();
				case 41: return this.bodegaproductos.get(rowIndex).getcosto_calculado();
				case 42: return this.bodegaproductos.get(rowIndex).getdias_produccion();
				case 43: return this.bodegaproductos.get(rowIndex).getprecio_reposicion();
				case 44: return this.bodegaproductos.get(rowIndex).getfecha_ultimo_pedido();
				case 45: return this.bodegaproductos.get(rowIndex).getfecha_ingreso();
				case 46: return this.bodegaproductos.get(rowIndex).getfecha_egreso();
				case 47: return this.bodegaproductos.get(rowIndex).getfecha_ultima_compra();
				case 48: return this.bodegaproductos.get(rowIndex).getfecha_ultima_venta();
				case 49: return this.bodegaproductos.get(rowIndex).getfecha_ultima_devolucion();
				case 50: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_inventario();
				case 51: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_costo_venta();
				case 52: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_venta();
				case 53: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_descuento();
				case 54: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_produccion();
				case 55: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_devolucion();
				case 56: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_ingreso_debito();
				case 57: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_ingreso_credito();
				case 58: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_resultado_debito();
				case 59: return this.bodegaproductos.get(rowIndex).getid_cuenta_contable_resultado_credito();	            
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
				case 10: return Integer.class;
				case 11: return Integer.class;
				case 12: return Integer.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return Double.class;
				case 25: return Double.class;
				case 26: return Double.class;
				case 27: return Boolean.class;
				case 28: return Boolean.class;
				case 29: return Boolean.class;
				case 30: return Boolean.class;
				case 31: return Boolean.class;
				case 32: return Integer.class;
				case 33: return Integer.class;
				case 34: return Integer.class;
				case 35: return Double.class;
				case 36: return Double.class;
				case 37: return Integer.class;
				case 38: return Integer.class;
				case 39: return Double.class;
				case 40: return Double.class;
				case 41: return Double.class;
				case 42: return Double.class;
				case 43: return Double.class;
				case 44: return Date.class;
				case 45: return Date.class;
				case 46: return Date.class;
				case 47: return Date.class;
				case 48: return Date.class;
				case 49: return Date.class;
				case 50: return Long.class;
				case 51: return Long.class;
				case 52: return Long.class;
				case 53: return Long.class;
				case 54: return Long.class;
				case 55: return Long.class;
				case 56: return Long.class;
				case 57: return Long.class;
				case 58: return Long.class;
				case 59: return Long.class;	            
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
				case 31: return true;
				case 32: return true;
				case 33: return true;
				case 34: return true;
				case 35: return true;
				case 36: return true;
				case 37: return true;
				case 38: return true;
				case 39: return true;
				case 40: return true;
				case 41: return true;
				case 42: return true;
				case 43: return true;
				case 44: return true;
				case 45: return true;
				case 46: return true;
				case 47: return true;
				case 48: return true;
				case 49: return true;
				case 50: return true;
				case 51: return true;
				case 52: return true;
				case 53: return true;
				case 54: return true;
				case 55: return true;
				case 56: return true;
				case 57: return true;
				case 58: return true;
				case 59: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	BodegaProducto bodegaproducto = this.bodegaproductos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			BodegaProductoBeanSwingJInternalFrame bodegaproductoBeanSwingJInternalFrame=(BodegaProductoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {bodegaproducto.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {bodegaproducto.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {bodegaproducto.setid_empresa((Long) value);bodegaproducto.setempresa_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {bodegaproducto.setid_sucursal((Long) value);bodegaproducto.setsucursal_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {bodegaproducto.setid_bodega((Long) value);bodegaproducto.setbodega_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {bodegaproducto.setid_producto((Long) value);bodegaproducto.setproducto_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {bodegaproducto.setid_unidad((Long) value);bodegaproducto.setunidad_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {bodegaproducto.setid_centro_costo((Long) value);bodegaproducto.setcentrocosto_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {bodegaproducto.setid_estado_bodega_producto((Long) value);bodegaproducto.setestadobodegaproducto_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualEstadoBodegaProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {bodegaproducto.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {bodegaproducto.setcantidad_disponible((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {bodegaproducto.setstock_maximo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {bodegaproducto.setstock_minimo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {bodegaproducto.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {bodegaproducto.setiva_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {bodegaproducto.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {bodegaproducto.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {bodegaproducto.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {bodegaproducto.setice_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {bodegaproducto.setcosto_promedio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {bodegaproducto.setporcentaje_comision((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {bodegaproducto.setprecio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {bodegaproducto.setultimo_costo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {bodegaproducto.setcosto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {bodegaproducto.setarancel_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {bodegaproducto.setice_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {bodegaproducto.setpeso((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {bodegaproducto.setcon_iva((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {bodegaproducto.setcon_impuesto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {bodegaproducto.setcon_ice((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {bodegaproducto.setesta_activo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {bodegaproducto.setcon_balanza((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {bodegaproducto.setcantidad_pedida((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {bodegaproducto.setcantidad_fisica((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {bodegaproducto.setcantidad_requerido((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {bodegaproducto.setprecio_costo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {bodegaproducto.setprecio_promedio((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {bodegaproducto.settotal_ingresos((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {bodegaproducto.settotal_egresos((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {bodegaproducto.settotal_provision((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {bodegaproducto.settotal_proceso((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {bodegaproducto.setcosto_calculado((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {bodegaproducto.setdias_produccion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {bodegaproducto.setprecio_reposicion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {bodegaproducto.setfecha_ultimo_pedido((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {bodegaproducto.setfecha_ingreso((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {bodegaproducto.setfecha_egreso((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 47: try {bodegaproducto.setfecha_ultima_compra((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 48: try {bodegaproducto.setfecha_ultima_venta((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 49: try {bodegaproducto.setfecha_ultima_devolucion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 50: try {bodegaproducto.setid_cuenta_contable_inventario((Long) value);bodegaproducto.setcuentacontableinventario_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableInventarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 51: try {bodegaproducto.setid_cuenta_contable_costo_venta((Long) value);bodegaproducto.setcuentacontablecostoventa_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableCostoVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 52: try {bodegaproducto.setid_cuenta_contable_venta((Long) value);bodegaproducto.setcuentacontableventa_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableVentaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 53: try {bodegaproducto.setid_cuenta_contable_descuento((Long) value);bodegaproducto.setcuentacontabledescuento_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableDescuentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 54: try {bodegaproducto.setid_cuenta_contable_produccion((Long) value);bodegaproducto.setcuentacontableproduccion_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableProduccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 55: try {bodegaproducto.setid_cuenta_contable_devolucion((Long) value);bodegaproducto.setcuentacontabledevolucion_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableDevolucionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 56: try {bodegaproducto.setid_cuenta_contable_ingreso_debito((Long) value);bodegaproducto.setcuentacontableingresodebito_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableIngresoDebitoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 57: try {bodegaproducto.setid_cuenta_contable_ingreso_credito((Long) value);bodegaproducto.setcuentacontableingresocredito_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableIngresoCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 58: try {bodegaproducto.setid_cuenta_contable_resultado_debito((Long) value);bodegaproducto.setcuentacontableresultadodebito_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableResultadoDebitoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 59: try {bodegaproducto.setid_cuenta_contable_resultado_credito((Long) value);bodegaproducto.setcuentacontableresultadocredito_descripcion(bodegaproductoBeanSwingJInternalFrame.getActualCuentaContableResultadoCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public BodegaProductoModel(JInternalFrameBase jInternalFrameBase) {
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
		private BodegaProductoDetalleFormJInternalFrame bodegaproductoJInternalFrame=null;
		
		public BodegaProductoModel(BodegaProductoDetalleFormJInternalFrame bodegaproductoJInternalFrame) {
			this.bodegaproductoJInternalFrame=bodegaproductoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.bodegaproductoJInternalFrame.getjButtonActualizarToolBarBodegaProducto();
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.getjButtonActualizarToolBarBodegaProducto())) {
				componentTab=this.bodegaproductoJInternalFrame.getjButtonEliminarToolBarBodegaProducto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.getjButtonEliminarToolBarBodegaProducto())) {
				componentTab=this.bodegaproductoJInternalFrame.getjButtonCancelarToolBarBodegaProducto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.getjButtonCancelarToolBarBodegaProducto())) {
				componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_empresaBodegaProducto;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto)) {
				componentTab=this.bodegaproductoJInternalFrame.jComboBoxTiposAccionesFormularioBodegaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxTiposAccionesFormularioBodegaProducto)) {
				componentTab=this.bodegaproductoJInternalFrame.jButtonEliminarBodegaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jButtonEliminarBodegaProducto)) {
				componentTab=this.bodegaproductoJInternalFrame.jButtonActualizarBodegaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jButtonActualizarBodegaProducto)) {
				componentTab=this.bodegaproductoJInternalFrame.jButtonCancelarBodegaProducto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_empresaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_sucursalBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_sucursalBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_bodegaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_bodegaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_productoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_productoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_unidadBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_unidadBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_centro_costoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_centro_costoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_estado_bodega_productoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_estado_bodega_productoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextAreadescripcionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextAreadescripcionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldstock_maximoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldstock_maximoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldstock_minimoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldstock_minimoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldivaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldivaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldiva_valorBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldiva_valorBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFielddescuentoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFielddescuentoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFielddescuento_valorBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFielddescuento_valorBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldiceBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldiceBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldice_valorBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldice_valorBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldporcentaje_comisionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldporcentaje_comisionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldprecioBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldprecioBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldcostoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldcostoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldarancel_porcentajeBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldarancel_porcentajeBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldice_porcentajeBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldice_porcentajeBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldpesoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldpesoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxcon_ivaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxcon_ivaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxcon_impuestoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxcon_impuestoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxcon_iceBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxcon_iceBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxesta_activoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxesta_activoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxcon_balanzaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxcon_balanzaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldcantidad_fisicaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldcantidad_fisicaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldprecio_costoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldprecio_costoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldtotal_ingresosBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldtotal_procesoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFielddias_produccionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFielddias_produccionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldprecio_reposicionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldprecio_reposicionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ultimo_pedidoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ultimo_pedidoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ingresoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ingresoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_egresoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_egresoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_compraBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_compraBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_ventaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_ventaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_devolucionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_devolucionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_inventarioBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_inventarioBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_ventaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_ventaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ventaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ventaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_descuentoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_descuentoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_produccionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_produccionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_devolucionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_devolucionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.bodegaproductoJInternalFrame.getjButtonActualizarToolBarBodegaProducto();
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.getjButtonEliminarToolBarBodegaProducto())) {
				componentTab=this.bodegaproductoJInternalFrame.getjButtonActualizarToolBarBodegaProducto();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.getjButtonCancelarToolBarBodegaProducto())) {
				componentTab=this.bodegaproductoJInternalFrame.getjButtonEliminarToolBarBodegaProducto();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_empresaBodegaProducto)) {
				
				componentTab=this.bodegaproductoJInternalFrame.getjButtonCancelarToolBarBodegaProducto();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxTiposAccionesFormularioBodegaProducto)) {
				componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jButtonEliminarBodegaProducto)) {
				componentTab=this.bodegaproductoJInternalFrame.jComboBoxTiposAccionesFormularioBodegaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jButtonActualizarBodegaProducto)) {
				componentTab=this.bodegaproductoJInternalFrame.jButtonEliminarBodegaProducto;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jButtonCancelarBodegaProducto)) {
				componentTab=this.bodegaproductoJInternalFrame.jButtonActualizarBodegaProducto;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_sucursalBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_empresaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_bodegaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_sucursalBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_productoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_bodegaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_unidadBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_productoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_centro_costoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_unidadBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_estado_bodega_productoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_centro_costoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextAreadescripcionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_estado_bodega_productoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldstock_maximoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextAreadescripcionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldstock_minimoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldstock_maximoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldivaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldstock_minimoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldiva_valorBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldivaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFielddescuentoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldiva_valorBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFielddescuento_valorBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFielddescuentoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldiceBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFielddescuento_valorBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldice_valorBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldiceBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldporcentaje_comisionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldice_valorBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldprecioBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldporcentaje_comisionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldcostoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldprecioBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldarancel_porcentajeBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldcostoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldice_porcentajeBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldarancel_porcentajeBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldpesoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldice_porcentajeBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxcon_ivaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldpesoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxcon_impuestoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxcon_ivaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxcon_iceBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxcon_impuestoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxesta_activoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxcon_iceBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jCheckBoxcon_balanzaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxesta_activoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldcantidad_fisicaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jCheckBoxcon_balanzaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldprecio_costoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldcantidad_fisicaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldtotal_ingresosBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldprecio_costoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFielddias_produccionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldtotal_procesoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jTextFieldprecio_reposicionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFielddias_produccionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ultimo_pedidoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jTextFieldprecio_reposicionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ingresoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ultimo_pedidoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_egresoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ingresoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_compraBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_egresoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_ventaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_compraBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_devolucionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_ventaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_inventarioBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jDateChooserfecha_ultima_devolucionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_ventaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_inventarioBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ventaBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_costo_ventaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_descuentoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ventaBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_produccionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_descuentoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_devolucionBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_produccionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_devolucionBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ingreso_debitoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_ingreso_creditoBodegaProducto;
			return componentTab;
		}

		if(component!=null && component.equals(this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_resultado_creditoBodegaProducto)) {
			componentTab=this.bodegaproductoJInternalFrame.jComboBoxid_cuenta_contable_resultado_debitoBodegaProducto;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.bodegaproductoJInternalFrame.getjButtonActualizarToolBarBodegaProducto();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.bodegaproductoJInternalFrame.getjButtonActualizarToolBarBodegaProducto();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.bodegaproductoJInternalFrame.getjButtonCancelarToolBarBodegaProducto();
			
			
			return componentTab;		
		}
		
		public BodegaProductoDetalleFormJInternalFrame getbodegaproductoJInternalFrame() {
			return this.bodegaproductoJInternalFrame;
		}
		
		public void setbodegaproductoJInternalFrame(BodegaProductoDetalleFormJInternalFrame bodegaproductoJInternalFrame) {
			this.bodegaproductoJInternalFrame=bodegaproductoJInternalFrame;
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
