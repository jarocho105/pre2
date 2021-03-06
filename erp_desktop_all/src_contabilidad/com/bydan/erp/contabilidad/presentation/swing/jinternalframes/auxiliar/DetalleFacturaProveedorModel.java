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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar;




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

import com.bydan.erp.contabilidad.util.DetalleFacturaProveedorConstantesFunciones;
import com.bydan.erp.contabilidad.util.DetalleFacturaProveedorParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.DetalleFacturaProveedorParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.DetalleFacturaProveedorBeanSwingJInternalFrame;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.DetalleFacturaProveedorJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.DetalleFacturaProveedorDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DetalleFacturaProveedorModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DetalleFacturaProveedorConstantesFunciones.LABEL_ID
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDFACTURAPROVEEDOR
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDEMPRESA
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDSUCURSAL
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDBODEGA
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDPRODUCTO
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDUNIDAD
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDEJERCICIO
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDPERIODO
										,DetalleFacturaProveedorConstantesFunciones.LABEL_NUMEROCOMPROBANTE
										,DetalleFacturaProveedorConstantesFunciones.LABEL_CANTIDAD
										,DetalleFacturaProveedorConstantesFunciones.LABEL_CANTIDADAUXILIAR
										,DetalleFacturaProveedorConstantesFunciones.LABEL_DESCUENTO
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IVA
										,DetalleFacturaProveedorConstantesFunciones.LABEL_LOTE
										,DetalleFacturaProveedorConstantesFunciones.LABEL_FECHAELABORACIONLOTE
										,DetalleFacturaProveedorConstantesFunciones.LABEL_FECHACADUCIDADLOTE
										,DetalleFacturaProveedorConstantesFunciones.LABEL_COSTOIVA
										,DetalleFacturaProveedorConstantesFunciones.LABEL_COSTOUNITARIO
										,DetalleFacturaProveedorConstantesFunciones.LABEL_COSTOTOTAL
										,DetalleFacturaProveedorConstantesFunciones.LABEL_ICE
										,DetalleFacturaProveedorConstantesFunciones.LABEL_DESCUENTO1
										,DetalleFacturaProveedorConstantesFunciones.LABEL_DESCUENTO2
										,DetalleFacturaProveedorConstantesFunciones.LABEL_DESCRIPCION
										,DetalleFacturaProveedorConstantesFunciones.LABEL_PRECIOVENTA
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDNOVEDADPRODUCTO
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDCENTROCOSTO
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDBODEGAENVIAR
										,DetalleFacturaProveedorConstantesFunciones.LABEL_LOTECLIENTE
										,DetalleFacturaProveedorConstantesFunciones.LABEL_DISPONIBLE
										,DetalleFacturaProveedorConstantesFunciones.LABEL_SERIE
										,DetalleFacturaProveedorConstantesFunciones.LABEL_ICEVALOR
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDANIO
										,DetalleFacturaProveedorConstantesFunciones.LABEL_IDMES
										};
	   
	    public List<DetalleFacturaProveedor> detallefacturaproveedors;
	  	 
	    //NO SE UTILIZA
	    public DetalleFacturaProveedorModel(List<DetalleFacturaProveedor> detallefacturaproveedors,JInternalFrameBase jInternalFrameBase) {
	    	this.detallefacturaproveedors=detallefacturaproveedors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DetalleFacturaProveedorModel(JInternalFrameBase jInternalFrameBase) {
	    	this.detallefacturaproveedors=new ArrayList<DetalleFacturaProveedor>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.detallefacturaproveedors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.detallefacturaproveedors.get(rowIndex).getIsSelected();
	            
				case 1: return this.detallefacturaproveedors.get(rowIndex).getId();
				case 2: return this.detallefacturaproveedors.get(rowIndex).getid_factura_proveedor();
				case 3: return this.detallefacturaproveedors.get(rowIndex).getid_empresa();
				case 4: return this.detallefacturaproveedors.get(rowIndex).getid_sucursal();
				case 5: return this.detallefacturaproveedors.get(rowIndex).getid_bodega();
				case 6: return this.detallefacturaproveedors.get(rowIndex).getid_producto();
				case 7: return this.detallefacturaproveedors.get(rowIndex).getid_unidad();
				case 8: return this.detallefacturaproveedors.get(rowIndex).getid_ejercicio();
				case 9: return this.detallefacturaproveedors.get(rowIndex).getid_periodo();
				case 10: return this.detallefacturaproveedors.get(rowIndex).getnumero_comprobante();
				case 11: return this.detallefacturaproveedors.get(rowIndex).getcantidad();
				case 12: return this.detallefacturaproveedors.get(rowIndex).getcantidad_auxiliar();
				case 13: return this.detallefacturaproveedors.get(rowIndex).getdescuento();
				case 14: return this.detallefacturaproveedors.get(rowIndex).getiva();
				case 15: return this.detallefacturaproveedors.get(rowIndex).getlote();
				case 16: return this.detallefacturaproveedors.get(rowIndex).getfecha_elaboracion_lote();
				case 17: return this.detallefacturaproveedors.get(rowIndex).getfecha_caducidad_lote();
				case 18: return this.detallefacturaproveedors.get(rowIndex).getcosto_iva();
				case 19: return this.detallefacturaproveedors.get(rowIndex).getcosto_unitario();
				case 20: return this.detallefacturaproveedors.get(rowIndex).getcosto_total();
				case 21: return this.detallefacturaproveedors.get(rowIndex).getice();
				case 22: return this.detallefacturaproveedors.get(rowIndex).getdescuento1();
				case 23: return this.detallefacturaproveedors.get(rowIndex).getdescuento2();
				case 24: return this.detallefacturaproveedors.get(rowIndex).getdescripcion();
				case 25: return this.detallefacturaproveedors.get(rowIndex).getprecio_venta();
				case 26: return this.detallefacturaproveedors.get(rowIndex).getid_novedad_producto();
				case 27: return this.detallefacturaproveedors.get(rowIndex).getid_centro_costo();
				case 28: return this.detallefacturaproveedors.get(rowIndex).getid_cuenta_contable_costo();
				case 29: return this.detallefacturaproveedors.get(rowIndex).getid_bodega_enviar();
				case 30: return this.detallefacturaproveedors.get(rowIndex).getlote_cliente();
				case 31: return this.detallefacturaproveedors.get(rowIndex).getdisponible();
				case 32: return this.detallefacturaproveedors.get(rowIndex).getserie();
				case 33: return this.detallefacturaproveedors.get(rowIndex).getice_valor();
				case 34: return this.detallefacturaproveedors.get(rowIndex).getid_anio();
				case 35: return this.detallefacturaproveedors.get(rowIndex).getid_mes();	            
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
				case 10: return String.class;
				case 11: return Integer.class;
				case 12: return Integer.class;
				case 13: return Double.class;
				case 14: return Double.class;
				case 15: return String.class;
				case 16: return Date.class;
				case 17: return Date.class;
				case 18: return Boolean.class;
				case 19: return Double.class;
				case 20: return Double.class;
				case 21: return Double.class;
				case 22: return Double.class;
				case 23: return Double.class;
				case 24: return String.class;
				case 25: return Double.class;
				case 26: return Long.class;
				case 27: return Long.class;
				case 28: return Long.class;
				case 29: return Long.class;
				case 30: return String.class;
				case 31: return Double.class;
				case 32: return String.class;
				case 33: return Double.class;
				case 34: return Long.class;
				case 35: return Long.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	DetalleFacturaProveedor detallefacturaproveedor = this.detallefacturaproveedors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DetalleFacturaProveedorBeanSwingJInternalFrame detallefacturaproveedorBeanSwingJInternalFrame=(DetalleFacturaProveedorBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {detallefacturaproveedor.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {detallefacturaproveedor.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {detallefacturaproveedor.setid_factura_proveedor((Long) value);detallefacturaproveedor.setfacturaproveedor_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualFacturaProveedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {detallefacturaproveedor.setid_empresa((Long) value);detallefacturaproveedor.setempresa_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {detallefacturaproveedor.setid_sucursal((Long) value);detallefacturaproveedor.setsucursal_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {detallefacturaproveedor.setid_bodega((Long) value);detallefacturaproveedor.setbodega_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualBodegaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {detallefacturaproveedor.setid_producto((Long) value);detallefacturaproveedor.setproducto_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {detallefacturaproveedor.setid_unidad((Long) value);detallefacturaproveedor.setunidad_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualUnidadForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {detallefacturaproveedor.setid_ejercicio((Long) value);detallefacturaproveedor.setejercicio_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {detallefacturaproveedor.setid_periodo((Long) value);detallefacturaproveedor.setperiodo_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {detallefacturaproveedor.setnumero_comprobante((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {detallefacturaproveedor.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {detallefacturaproveedor.setcantidad_auxiliar((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {detallefacturaproveedor.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {detallefacturaproveedor.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {detallefacturaproveedor.setlote((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {detallefacturaproveedor.setfecha_elaboracion_lote((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {detallefacturaproveedor.setfecha_caducidad_lote((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {detallefacturaproveedor.setcosto_iva((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {detallefacturaproveedor.setcosto_unitario((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {detallefacturaproveedor.setcosto_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {detallefacturaproveedor.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {detallefacturaproveedor.setdescuento1((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {detallefacturaproveedor.setdescuento2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {detallefacturaproveedor.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {detallefacturaproveedor.setprecio_venta((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {detallefacturaproveedor.setid_novedad_producto((Long) value);detallefacturaproveedor.setnovedadproducto_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualNovedadProductoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {detallefacturaproveedor.setid_centro_costo((Long) value);detallefacturaproveedor.setcentrocosto_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualCentroCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {detallefacturaproveedor.setid_cuenta_contable_costo((Long) value);detallefacturaproveedor.setcuentacontablecosto_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualCuentaContableCostoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {detallefacturaproveedor.setid_bodega_enviar((Long) value);detallefacturaproveedor.setbodegaenviar_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualBodegaEnviarForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {detallefacturaproveedor.setlote_cliente((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {detallefacturaproveedor.setdisponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {detallefacturaproveedor.setserie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {detallefacturaproveedor.setice_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {detallefacturaproveedor.setid_anio((Long) value);detallefacturaproveedor.setanio_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {detallefacturaproveedor.setid_mes((Long) value);detallefacturaproveedor.setmes_descripcion(detallefacturaproveedorBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DetalleFacturaProveedorModel(JInternalFrameBase jInternalFrameBase) {
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
		private DetalleFacturaProveedorDetalleFormJInternalFrame detallefacturaproveedorJInternalFrame=null;
		
		public DetalleFacturaProveedorModel(DetalleFacturaProveedorDetalleFormJInternalFrame detallefacturaproveedorJInternalFrame) {
			this.detallefacturaproveedorJInternalFrame=detallefacturaproveedorJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonActualizarToolBarDetalleFacturaProveedor();
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.getjButtonActualizarToolBarDetalleFacturaProveedor())) {
				componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonEliminarToolBarDetalleFacturaProveedor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.getjButtonEliminarToolBarDetalleFacturaProveedor())) {
				componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonCancelarToolBarDetalleFacturaProveedor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.getjButtonCancelarToolBarDetalleFacturaProveedor())) {
				componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_factura_proveedorDetalleFacturaProveedor;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_mesDetalleFacturaProveedor)) {
				componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor)) {
				componentTab=this.detallefacturaproveedorJInternalFrame.jButtonEliminarDetalleFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jButtonEliminarDetalleFacturaProveedor)) {
				componentTab=this.detallefacturaproveedorJInternalFrame.jButtonActualizarDetalleFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jButtonActualizarDetalleFacturaProveedor)) {
				componentTab=this.detallefacturaproveedorJInternalFrame.jButtonCancelarDetalleFacturaProveedor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_factura_proveedorDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_empresaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_empresaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_sucursalDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_sucursalDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_bodegaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_bodegaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_productoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_productoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_unidadDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_unidadDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_ejercicioDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_ejercicioDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_periodoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_periodoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldnumero_comprobanteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldnumero_comprobanteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldcantidadDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldcantidadDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldcantidad_auxiliarDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldcantidad_auxiliarDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFielddescuentoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFielddescuentoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldivaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldivaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldloteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldloteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jDateChooserfecha_caducidad_loteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jDateChooserfecha_caducidad_loteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jCheckBoxcosto_ivaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jCheckBoxcosto_ivaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldcosto_unitarioDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldcosto_unitarioDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldcosto_totalDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldcosto_totalDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldiceDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldiceDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFielddescuento1DetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFielddescuento1DetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFielddescuento2DetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFielddescuento2DetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextAreadescripcionDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextAreadescripcionDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldprecio_ventaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldprecio_ventaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_novedad_productoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_novedad_productoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_centro_costoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_centro_costoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_bodega_enviarDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_bodega_enviarDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldlote_clienteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldlote_clienteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFielddisponibleDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFielddisponibleDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldserieDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldserieDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldice_valorDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldice_valorDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_anioDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_anioDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_mesDetalleFacturaProveedor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonActualizarToolBarDetalleFacturaProveedor();
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.getjButtonEliminarToolBarDetalleFacturaProveedor())) {
				componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonActualizarToolBarDetalleFacturaProveedor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.getjButtonCancelarToolBarDetalleFacturaProveedor())) {
				componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonEliminarToolBarDetalleFacturaProveedor();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_factura_proveedorDetalleFacturaProveedor)) {
				
				componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonCancelarToolBarDetalleFacturaProveedor();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor)) {
				componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_mesDetalleFacturaProveedor;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jButtonEliminarDetalleFacturaProveedor)) {
				componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxTiposAccionesFormularioDetalleFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jButtonActualizarDetalleFacturaProveedor)) {
				componentTab=this.detallefacturaproveedorJInternalFrame.jButtonEliminarDetalleFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jButtonCancelarDetalleFacturaProveedor)) {
				componentTab=this.detallefacturaproveedorJInternalFrame.jButtonActualizarDetalleFacturaProveedor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_empresaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_factura_proveedorDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_sucursalDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_empresaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_bodegaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_sucursalDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_productoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_bodegaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_unidadDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_productoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_ejercicioDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_unidadDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_periodoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_ejercicioDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldnumero_comprobanteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_periodoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldcantidadDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldnumero_comprobanteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldcantidad_auxiliarDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldcantidadDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFielddescuentoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldcantidad_auxiliarDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldivaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFielddescuentoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldloteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldivaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldloteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jDateChooserfecha_caducidad_loteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jDateChooserfecha_elaboracion_loteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jCheckBoxcosto_ivaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jDateChooserfecha_caducidad_loteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldcosto_unitarioDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jCheckBoxcosto_ivaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldcosto_totalDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldcosto_unitarioDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldiceDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldcosto_totalDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFielddescuento1DetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldiceDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFielddescuento2DetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFielddescuento1DetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextAreadescripcionDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFielddescuento2DetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldprecio_ventaDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextAreadescripcionDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_novedad_productoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldprecio_ventaDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_centro_costoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_novedad_productoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_centro_costoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_bodega_enviarDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_costoDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldlote_clienteDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_bodega_enviarDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFielddisponibleDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldlote_clienteDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldserieDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFielddisponibleDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jTextFieldice_valorDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldserieDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_anioDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jTextFieldice_valorDetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.detallefacturaproveedorJInternalFrame.jComboBoxid_mesDetalleFacturaProveedor)) {
			componentTab=this.detallefacturaproveedorJInternalFrame.jComboBoxid_anioDetalleFacturaProveedor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonActualizarToolBarDetalleFacturaProveedor();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonActualizarToolBarDetalleFacturaProveedor();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.detallefacturaproveedorJInternalFrame.getjButtonCancelarToolBarDetalleFacturaProveedor();
			
			
			return componentTab;		
		}
		
		public DetalleFacturaProveedorDetalleFormJInternalFrame getdetallefacturaproveedorJInternalFrame() {
			return this.detallefacturaproveedorJInternalFrame;
		}
		
		public void setdetallefacturaproveedorJInternalFrame(DetalleFacturaProveedorDetalleFormJInternalFrame detallefacturaproveedorJInternalFrame) {
			this.detallefacturaproveedorJInternalFrame=detallefacturaproveedorJInternalFrame;
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
