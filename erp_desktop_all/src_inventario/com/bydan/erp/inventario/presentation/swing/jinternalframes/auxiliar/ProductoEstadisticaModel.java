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

import com.bydan.erp.inventario.util.ProductoEstadisticaConstantesFunciones;
import com.bydan.erp.inventario.util.ProductoEstadisticaParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProductoEstadisticaParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ProductoEstadisticaBeanSwingJInternalFrame;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ProductoEstadisticaJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.ProductoEstadisticaDetalleFormJInternalFrame;

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

public class ProductoEstadisticaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ProductoEstadisticaConstantesFunciones.LABEL_ID
										,ProductoEstadisticaConstantesFunciones.LABEL_IDEMPRESA
										,ProductoEstadisticaConstantesFunciones.LABEL_IDSUCURSAL
										,ProductoEstadisticaConstantesFunciones.LABEL_IDBODEGA
										,ProductoEstadisticaConstantesFunciones.LABEL_IDPRODUCTO
										,ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMACOMPRA
										,ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMAVENTA
										,ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMACOTIZACION
										,ProductoEstadisticaConstantesFunciones.LABEL_PRECIOULTIMAPROFORMA
										,ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADDISPONIBLE
										,ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADRESERVADA
										,ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADDEMANDA
										,ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADMAXIMO
										,ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADMINIMO
										,ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADFISICA
										,ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADORDENCOMPRA
										,ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADPEDIDA
										,ProductoEstadisticaConstantesFunciones.LABEL_CANTIDADREQUISICION
										,ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAINGRESO
										,ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAEGRESO
										,ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAPRODUCCION
										,ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMACOMPRA
										,ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAVENTA
										,ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMADEVOLUCION
										,ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAORDENCOMPRA
										,ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAPEDIDO
										,ProductoEstadisticaConstantesFunciones.LABEL_FECHAULTIMAREQUISICION
										,ProductoEstadisticaConstantesFunciones.LABEL_TOTALINGRESO
										,ProductoEstadisticaConstantesFunciones.LABEL_TOTALEGRESO
										,ProductoEstadisticaConstantesFunciones.LABEL_TOTALCOMPRA
										,ProductoEstadisticaConstantesFunciones.LABEL_TOTALVENTA
										,ProductoEstadisticaConstantesFunciones.LABEL_TOTALPRODUCIDO
										,ProductoEstadisticaConstantesFunciones.LABEL_TOTALDEVUELTO
										,ProductoEstadisticaConstantesFunciones.LABEL_COSTOULTIMO
										,ProductoEstadisticaConstantesFunciones.LABEL_COSTOTOTAL
										,ProductoEstadisticaConstantesFunciones.LABEL_COSTOPRODUCCION
										};
	   
	    public List<ProductoEstadistica> productoestadisticas;
	  	 
	    //NO SE UTILIZA
	    public ProductoEstadisticaModel(List<ProductoEstadistica> productoestadisticas,JInternalFrameBase jInternalFrameBase) {
	    	this.productoestadisticas=productoestadisticas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ProductoEstadisticaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.productoestadisticas=new ArrayList<ProductoEstadistica>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.productoestadisticas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.productoestadisticas.get(rowIndex).getIsSelected();
	            
				case 1: return this.productoestadisticas.get(rowIndex).getId();
				case 2: return this.productoestadisticas.get(rowIndex).getid_empresa();
				case 3: return this.productoestadisticas.get(rowIndex).getid_sucursal();
				case 4: return this.productoestadisticas.get(rowIndex).getid_bodega();
				case 5: return this.productoestadisticas.get(rowIndex).getid_producto();
				case 6: return this.productoestadisticas.get(rowIndex).getprecio_ultima_compra();
				case 7: return this.productoestadisticas.get(rowIndex).getprecio_ultima_venta();
				case 8: return this.productoestadisticas.get(rowIndex).getprecio_ultima_cotizacion();
				case 9: return this.productoestadisticas.get(rowIndex).getprecio_ultima_proforma();
				case 10: return this.productoestadisticas.get(rowIndex).getcantidad_disponible();
				case 11: return this.productoestadisticas.get(rowIndex).getcantidad_reservada();
				case 12: return this.productoestadisticas.get(rowIndex).getcantidad_demanda();
				case 13: return this.productoestadisticas.get(rowIndex).getcantidad_maximo();
				case 14: return this.productoestadisticas.get(rowIndex).getcantidad_minimo();
				case 15: return this.productoestadisticas.get(rowIndex).getcantidad_fisica();
				case 16: return this.productoestadisticas.get(rowIndex).getcantidad_orden_compra();
				case 17: return this.productoestadisticas.get(rowIndex).getcantidad_pedida();
				case 18: return this.productoestadisticas.get(rowIndex).getcantidad_requisicion();
				case 19: return this.productoestadisticas.get(rowIndex).getfecha_ultima_ingreso();
				case 20: return this.productoestadisticas.get(rowIndex).getfecha_ultima_egreso();
				case 21: return this.productoestadisticas.get(rowIndex).getfecha_ultima_produccion();
				case 22: return this.productoestadisticas.get(rowIndex).getfecha_ultima_compra();
				case 23: return this.productoestadisticas.get(rowIndex).getfecha_ultima_venta();
				case 24: return this.productoestadisticas.get(rowIndex).getfecha_ultima_devolucion();
				case 25: return this.productoestadisticas.get(rowIndex).getfecha_ultima_orden_compra();
				case 26: return this.productoestadisticas.get(rowIndex).getfecha_ultima_pedido();
				case 27: return this.productoestadisticas.get(rowIndex).getfecha_ultima_requisicion();
				case 28: return this.productoestadisticas.get(rowIndex).gettotal_ingreso();
				case 29: return this.productoestadisticas.get(rowIndex).gettotal_egreso();
				case 30: return this.productoestadisticas.get(rowIndex).gettotal_compra();
				case 31: return this.productoestadisticas.get(rowIndex).gettotal_venta();
				case 32: return this.productoestadisticas.get(rowIndex).gettotal_producido();
				case 33: return this.productoestadisticas.get(rowIndex).gettotal_devuelto();
				case 34: return this.productoestadisticas.get(rowIndex).getcosto_ultimo();
				case 35: return this.productoestadisticas.get(rowIndex).getcosto_total();
				case 36: return this.productoestadisticas.get(rowIndex).getcosto_produccion();	            
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
				case 6: return Double.class;
				case 7: return Double.class;
				case 8: return Double.class;
				case 9: return Double.class;
				case 10: return Integer.class;
				case 11: return Double.class;
				case 12: return Double.class;
				case 13: return Integer.class;
				case 14: return Integer.class;
				case 15: return Double.class;
				case 16: return Double.class;
				case 17: return Double.class;
				case 18: return Double.class;
				case 19: return Date.class;
				case 20: return Date.class;
				case 21: return Date.class;
				case 22: return Date.class;
				case 23: return Date.class;
				case 24: return Date.class;
				case 25: return Date.class;
				case 26: return Date.class;
				case 27: return Date.class;
				case 28: return Double.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return Double.class;
				case 32: return Double.class;
				case 33: return Double.class;
				case 34: return Double.class;
				case 35: return Double.class;
				case 36: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	ProductoEstadistica productoestadistica = this.productoestadisticas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ProductoEstadisticaBeanSwingJInternalFrame productoestadisticaBeanSwingJInternalFrame=(ProductoEstadisticaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {productoestadistica.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {productoestadistica.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {productoestadistica.setid_empresa((Long) value);productoestadistica.setempresa_descripcion(productoestadisticaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {productoestadistica.setid_sucursal((Long) value);productoestadistica.setsucursal_descripcion(productoestadisticaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {productoestadistica.setid_bodega((Long) value);productoestadistica.setbodega_descripcion(productoestadisticaBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {productoestadistica.setid_producto((Long) value);productoestadistica.setproducto_descripcion(productoestadisticaBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {productoestadistica.setprecio_ultima_compra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {productoestadistica.setprecio_ultima_venta((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {productoestadistica.setprecio_ultima_cotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {productoestadistica.setprecio_ultima_proforma((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {productoestadistica.setcantidad_disponible((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {productoestadistica.setcantidad_reservada((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {productoestadistica.setcantidad_demanda((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {productoestadistica.setcantidad_maximo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {productoestadistica.setcantidad_minimo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {productoestadistica.setcantidad_fisica((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {productoestadistica.setcantidad_orden_compra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {productoestadistica.setcantidad_pedida((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {productoestadistica.setcantidad_requisicion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {productoestadistica.setfecha_ultima_ingreso((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {productoestadistica.setfecha_ultima_egreso((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {productoestadistica.setfecha_ultima_produccion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {productoestadistica.setfecha_ultima_compra((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {productoestadistica.setfecha_ultima_venta((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {productoestadistica.setfecha_ultima_devolucion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {productoestadistica.setfecha_ultima_orden_compra((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {productoestadistica.setfecha_ultima_pedido((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {productoestadistica.setfecha_ultima_requisicion((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {productoestadistica.settotal_ingreso((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {productoestadistica.settotal_egreso((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {productoestadistica.settotal_compra((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {productoestadistica.settotal_venta((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {productoestadistica.settotal_producido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {productoestadistica.settotal_devuelto((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {productoestadistica.setcosto_ultimo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {productoestadistica.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {productoestadistica.setcosto_produccion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ProductoEstadisticaModel(JInternalFrameBase jInternalFrameBase) {
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
		private ProductoEstadisticaDetalleFormJInternalFrame productoestadisticaJInternalFrame=null;
		
		public ProductoEstadisticaModel(ProductoEstadisticaDetalleFormJInternalFrame productoestadisticaJInternalFrame) {
			this.productoestadisticaJInternalFrame=productoestadisticaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.productoestadisticaJInternalFrame.getjButtonActualizarToolBarProductoEstadistica();
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.getjButtonActualizarToolBarProductoEstadistica())) {
				componentTab=this.productoestadisticaJInternalFrame.getjButtonEliminarToolBarProductoEstadistica();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.getjButtonEliminarToolBarProductoEstadistica())) {
				componentTab=this.productoestadisticaJInternalFrame.getjButtonCancelarToolBarProductoEstadistica();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.getjButtonCancelarToolBarProductoEstadistica())) {
				componentTab=this.productoestadisticaJInternalFrame.jComboBoxid_empresaProductoEstadistica;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcosto_produccionProductoEstadistica)) {
				componentTab=this.productoestadisticaJInternalFrame.jComboBoxTiposAccionesFormularioProductoEstadistica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxTiposAccionesFormularioProductoEstadistica)) {
				componentTab=this.productoestadisticaJInternalFrame.jButtonEliminarProductoEstadistica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jButtonEliminarProductoEstadistica)) {
				componentTab=this.productoestadisticaJInternalFrame.jButtonActualizarProductoEstadistica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jButtonActualizarProductoEstadistica)) {
				componentTab=this.productoestadisticaJInternalFrame.jButtonCancelarProductoEstadistica;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxid_empresaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jComboBoxid_sucursalProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxid_sucursalProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jComboBoxid_bodegaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxid_bodegaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jComboBoxid_productoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxid_productoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_ventaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_ventaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_cotizacionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_cotizacionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_proformaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_proformaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_disponibleProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_disponibleProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_reservadaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_reservadaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_demandaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_demandaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_maximoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_maximoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_minimoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_minimoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_fisicaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_fisicaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_orden_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_orden_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_pedidaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_pedidaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_requisicionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_requisicionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_ingresoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_ingresoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_egresoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_egresoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_produccionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_produccionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_ventaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_ventaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_devolucionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_devolucionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_orden_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_orden_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_pedidoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_pedidoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_requisicionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_requisicionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_ingresoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_ingresoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_egresoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_egresoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_ventaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_ventaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_producidoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_producidoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_devueltoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_devueltoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcosto_ultimoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcosto_ultimoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcosto_totalProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcosto_totalProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcosto_produccionProductoEstadistica;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.productoestadisticaJInternalFrame.getjButtonActualizarToolBarProductoEstadistica();
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.getjButtonEliminarToolBarProductoEstadistica())) {
				componentTab=this.productoestadisticaJInternalFrame.getjButtonActualizarToolBarProductoEstadistica();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.getjButtonCancelarToolBarProductoEstadistica())) {
				componentTab=this.productoestadisticaJInternalFrame.getjButtonEliminarToolBarProductoEstadistica();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxid_empresaProductoEstadistica)) {
				
				componentTab=this.productoestadisticaJInternalFrame.getjButtonCancelarToolBarProductoEstadistica();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxTiposAccionesFormularioProductoEstadistica)) {
				componentTab=this.productoestadisticaJInternalFrame.jTextFieldcosto_produccionProductoEstadistica;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jButtonEliminarProductoEstadistica)) {
				componentTab=this.productoestadisticaJInternalFrame.jComboBoxTiposAccionesFormularioProductoEstadistica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jButtonActualizarProductoEstadistica)) {
				componentTab=this.productoestadisticaJInternalFrame.jButtonEliminarProductoEstadistica;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jButtonCancelarProductoEstadistica)) {
				componentTab=this.productoestadisticaJInternalFrame.jButtonActualizarProductoEstadistica;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxid_sucursalProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jComboBoxid_empresaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxid_bodegaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jComboBoxid_sucursalProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jComboBoxid_productoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jComboBoxid_bodegaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jComboBoxid_productoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_ventaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_cotizacionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_ventaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_proformaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_cotizacionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_disponibleProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldprecio_ultima_proformaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_reservadaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_disponibleProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_demandaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_reservadaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_maximoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_demandaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_minimoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_maximoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_fisicaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_minimoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_orden_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_fisicaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_pedidaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_orden_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcantidad_requisicionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_pedidaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_ingresoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcantidad_requisicionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_egresoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_ingresoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_produccionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_egresoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_produccionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_ventaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_devolucionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_ventaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_orden_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_devolucionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_pedidoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_orden_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_requisicionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_pedidoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_ingresoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jDateChooserfecha_ultima_requisicionProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_egresoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_ingresoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_compraProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_egresoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_ventaProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_compraProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_producidoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_ventaProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldtotal_devueltoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_producidoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcosto_ultimoProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldtotal_devueltoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcosto_totalProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcosto_ultimoProductoEstadistica;
			return componentTab;
		}

		if(component!=null && component.equals(this.productoestadisticaJInternalFrame.jTextFieldcosto_produccionProductoEstadistica)) {
			componentTab=this.productoestadisticaJInternalFrame.jTextFieldcosto_totalProductoEstadistica;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.productoestadisticaJInternalFrame.getjButtonActualizarToolBarProductoEstadistica();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.productoestadisticaJInternalFrame.getjButtonActualizarToolBarProductoEstadistica();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.productoestadisticaJInternalFrame.getjButtonCancelarToolBarProductoEstadistica();
			
			
			return componentTab;		
		}
		
		public ProductoEstadisticaDetalleFormJInternalFrame getproductoestadisticaJInternalFrame() {
			return this.productoestadisticaJInternalFrame;
		}
		
		public void setproductoestadisticaJInternalFrame(ProductoEstadisticaDetalleFormJInternalFrame productoestadisticaJInternalFrame) {
			this.productoestadisticaJInternalFrame=productoestadisticaJInternalFrame;
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
