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

import com.bydan.erp.inventario.util.DefinicionConstantesFunciones;
import com.bydan.erp.inventario.util.DefinicionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DefinicionParameterGeneral;

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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DefinicionBeanSwingJInternalFrame;
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
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DefinicionJInternalFrame;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.DefinicionDetalleFormJInternalFrame;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class DefinicionModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,DefinicionConstantesFunciones.LABEL_ID
										,DefinicionConstantesFunciones.LABEL_IDEMPRESA
										,DefinicionConstantesFunciones.LABEL_IDMODULO
										,DefinicionConstantesFunciones.LABEL_SECUENCIALFORMATO
										,DefinicionConstantesFunciones.LABEL_SECUENCIAL
										,DefinicionConstantesFunciones.LABEL_IDTIPODEFINICION
										,DefinicionConstantesFunciones.LABEL_IDTRANSACCION
										,DefinicionConstantesFunciones.LABEL_IDSUCURSAL
										,DefinicionConstantesFunciones.LABEL_IDTIPOIVAITEM
										,DefinicionConstantesFunciones.LABEL_CONMOSTRARBODEGA
										,DefinicionConstantesFunciones.LABEL_FACTOR
										,DefinicionConstantesFunciones.LABEL_CONOTRORECARGO
										,DefinicionConstantesFunciones.LABEL_IDTIPOGLOBALCLIENTE
										,DefinicionConstantesFunciones.LABEL_CONCOA
										,DefinicionConstantesFunciones.LABEL_IDTIPOCOSTEODEFINICION
										,DefinicionConstantesFunciones.LABEL_CONRETENCION
										,DefinicionConstantesFunciones.LABEL_IDTIPOCOSTODEFINICION
										,DefinicionConstantesFunciones.LABEL_CONNOVEDADPRODUCTO
										,DefinicionConstantesFunciones.LABEL_CONICE
										,DefinicionConstantesFunciones.LABEL_CONCANTIDAD
										,DefinicionConstantesFunciones.LABEL_CONPRODUCTOPORPROVEEDOR
										,DefinicionConstantesFunciones.LABEL_CONLOTECLIENTE
										,DefinicionConstantesFunciones.LABEL_CONCUENTACONTABLE
										,DefinicionConstantesFunciones.LABEL_CONDETALLE
										,DefinicionConstantesFunciones.LABEL_CONIVAINCLUIDO
										,DefinicionConstantesFunciones.LABEL_CONLOTES
										,DefinicionConstantesFunciones.LABEL_NUMERODESCUENTOS
										,DefinicionConstantesFunciones.LABEL_CONPRECIO
										,DefinicionConstantesFunciones.LABEL_NUMEROREGISTROS
										,DefinicionConstantesFunciones.LABEL_CONCENTROCOSTO
										,DefinicionConstantesFunciones.LABEL_CONORDENIVA
										,DefinicionConstantesFunciones.LABEL_CONMULTIEMPRESA
										,DefinicionConstantesFunciones.LABEL_IDFORMATO
										,DefinicionConstantesFunciones.LABEL_CONENLINEA
										,DefinicionConstantesFunciones.LABEL_IDTIPOTRIBUTARIO
										,DefinicionConstantesFunciones.LABEL_IDTIPORETENCION
										,DefinicionConstantesFunciones.LABEL_CONEVALUACION
										,DefinicionConstantesFunciones.LABEL_CONOT
										,DefinicionConstantesFunciones.LABEL_CONANTICIPO
										,DefinicionConstantesFunciones.LABEL_CONCIERRE
										,DefinicionConstantesFunciones.LABEL_CONGENERAL
										,DefinicionConstantesFunciones.LABEL_CONPORPRODUCTO
										,DefinicionConstantesFunciones.LABEL_CONDESCUENTO
										,DefinicionConstantesFunciones.LABEL_CONSERIES
										,DefinicionConstantesFunciones.LABEL_CANTIDAD
										,DefinicionConstantesFunciones.LABEL_IDTIPODOCUMENTO
										,DefinicionConstantesFunciones.LABEL_IDLIBROCONTABLE
										,DefinicionConstantesFunciones.LABEL_CONINTERNO
										,DefinicionConstantesFunciones.LABEL_CONRESERVA
										,DefinicionConstantesFunciones.LABEL_CONPRECIOPROVEEDOR
										,DefinicionConstantesFunciones.LABEL_CONPRODUCCION
										,DefinicionConstantesFunciones.LABEL_CONCODIGOBARRA
										,DefinicionConstantesFunciones.LABEL_CONROMANEOS
										};
	   
	    public List<Definicion> definicions;
	  	 
	    //NO SE UTILIZA
	    public DefinicionModel(List<Definicion> definicions,JInternalFrameBase jInternalFrameBase) {
	    	this.definicions=definicions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public DefinicionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.definicions=new ArrayList<Definicion>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.definicions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.definicions.get(rowIndex).getIsSelected();
	            
				case 1: return this.definicions.get(rowIndex).getId();
				case 2: return this.definicions.get(rowIndex).getid_empresa();
				case 3: return this.definicions.get(rowIndex).getid_modulo();
				case 4: return this.definicions.get(rowIndex).getsecuencial_formato();
				case 5: return this.definicions.get(rowIndex).getsecuencial();
				case 6: return this.definicions.get(rowIndex).getid_tipo_definicion();
				case 7: return this.definicions.get(rowIndex).getid_transaccion();
				case 8: return this.definicions.get(rowIndex).getid_sucursal();
				case 9: return this.definicions.get(rowIndex).getid_tipo_iva_item();
				case 10: return this.definicions.get(rowIndex).getcon_mostrar_bodega();
				case 11: return this.definicions.get(rowIndex).getfactor();
				case 12: return this.definicions.get(rowIndex).getcon_otro_recargo();
				case 13: return this.definicions.get(rowIndex).getid_tipo_global_cliente();
				case 14: return this.definicions.get(rowIndex).getcon_coa();
				case 15: return this.definicions.get(rowIndex).getid_tipo_costeo_definicion();
				case 16: return this.definicions.get(rowIndex).getcon_retencion();
				case 17: return this.definicions.get(rowIndex).getid_tipo_costo_definicion();
				case 18: return this.definicions.get(rowIndex).getcon_novedad_producto();
				case 19: return this.definicions.get(rowIndex).getcon_ice();
				case 20: return this.definicions.get(rowIndex).getcon_cantidad();
				case 21: return this.definicions.get(rowIndex).getcon_producto_por_proveedor();
				case 22: return this.definicions.get(rowIndex).getcon_lote_cliente();
				case 23: return this.definicions.get(rowIndex).getcon_cuenta_contable();
				case 24: return this.definicions.get(rowIndex).getcon_detalle();
				case 25: return this.definicions.get(rowIndex).getcon_iva_incluido();
				case 26: return this.definicions.get(rowIndex).getcon_lotes();
				case 27: return this.definicions.get(rowIndex).getnumero_descuentos();
				case 28: return this.definicions.get(rowIndex).getcon_precio();
				case 29: return this.definicions.get(rowIndex).getnumero_registros();
				case 30: return this.definicions.get(rowIndex).getcon_centro_costo();
				case 31: return this.definicions.get(rowIndex).getcon_orden_iva();
				case 32: return this.definicions.get(rowIndex).getcon_multi_empresa();
				case 33: return this.definicions.get(rowIndex).getid_formato();
				case 34: return this.definicions.get(rowIndex).getcon_en_linea();
				case 35: return this.definicions.get(rowIndex).getid_tipo_tributario();
				case 36: return this.definicions.get(rowIndex).getid_tipo_retencion();
				case 37: return this.definicions.get(rowIndex).getcon_evaluacion();
				case 38: return this.definicions.get(rowIndex).getcon_ot();
				case 39: return this.definicions.get(rowIndex).getcon_anticipo();
				case 40: return this.definicions.get(rowIndex).getcon_cierre();
				case 41: return this.definicions.get(rowIndex).getcon_general();
				case 42: return this.definicions.get(rowIndex).getcon_por_producto();
				case 43: return this.definicions.get(rowIndex).getcon_descuento();
				case 44: return this.definicions.get(rowIndex).getcon_series();
				case 45: return this.definicions.get(rowIndex).getcantidad();
				case 46: return this.definicions.get(rowIndex).getid_tipo_documento();
				case 47: return this.definicions.get(rowIndex).getid_libro_contable();
				case 48: return this.definicions.get(rowIndex).getcon_interno();
				case 49: return this.definicions.get(rowIndex).getcon_reserva();
				case 50: return this.definicions.get(rowIndex).getcon_precio_proveedor();
				case 51: return this.definicions.get(rowIndex).getcon_produccion();
				case 52: return this.definicions.get(rowIndex).getcon_codigo_barra();
				case 53: return this.definicions.get(rowIndex).getcon_romaneos();	            
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
				case 4: return String.class;
				case 5: return Long.class;
				case 6: return Long.class;
				case 7: return Long.class;
				case 8: return Long.class;
				case 9: return Long.class;
				case 10: return Boolean.class;
				case 11: return Double.class;
				case 12: return Boolean.class;
				case 13: return Long.class;
				case 14: return Boolean.class;
				case 15: return Long.class;
				case 16: return Boolean.class;
				case 17: return Long.class;
				case 18: return Boolean.class;
				case 19: return Boolean.class;
				case 20: return Boolean.class;
				case 21: return Boolean.class;
				case 22: return Boolean.class;
				case 23: return Boolean.class;
				case 24: return Boolean.class;
				case 25: return Boolean.class;
				case 26: return Boolean.class;
				case 27: return Integer.class;
				case 28: return Boolean.class;
				case 29: return Integer.class;
				case 30: return Boolean.class;
				case 31: return Boolean.class;
				case 32: return Boolean.class;
				case 33: return Long.class;
				case 34: return Boolean.class;
				case 35: return Long.class;
				case 36: return Long.class;
				case 37: return Boolean.class;
				case 38: return Boolean.class;
				case 39: return Boolean.class;
				case 40: return Boolean.class;
				case 41: return Boolean.class;
				case 42: return Boolean.class;
				case 43: return Boolean.class;
				case 44: return Boolean.class;
				case 45: return Integer.class;
				case 46: return Long.class;
				case 47: return Long.class;
				case 48: return Boolean.class;
				case 49: return Boolean.class;
				case 50: return Boolean.class;
				case 51: return Boolean.class;
				case 52: return Boolean.class;
				case 53: return Boolean.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Definicion definicion = this.definicions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=(DefinicionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {definicion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {definicion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {definicion.setid_empresa((Long) value);definicion.setempresa_descripcion(definicionBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {definicion.setid_modulo((Long) value);definicion.setmodulo_descripcion(definicionBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {definicion.setsecuencial_formato((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {definicion.setsecuencial((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {definicion.setid_tipo_definicion((Long) value);definicion.settipodefinicion_descripcion(definicionBeanSwingJInternalFrame.getActualTipoDefinicionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {definicion.setid_transaccion((Long) value);definicion.settransaccion_descripcion(definicionBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {definicion.setid_sucursal((Long) value);definicion.setsucursal_descripcion(definicionBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {definicion.setid_tipo_iva_item((Long) value);definicion.settipoivaitem_descripcion(definicionBeanSwingJInternalFrame.getActualTipoIvaItemForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {definicion.setcon_mostrar_bodega((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {definicion.setfactor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {definicion.setcon_otro_recargo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {definicion.setid_tipo_global_cliente((Long) value);definicion.settipoglobalcliente_descripcion(definicionBeanSwingJInternalFrame.getActualTipoGlobalClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {definicion.setcon_coa((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {definicion.setid_tipo_costeo_definicion((Long) value);definicion.settipocosteodefinicion_descripcion(definicionBeanSwingJInternalFrame.getActualTipoCosteoDefinicionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {definicion.setcon_retencion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {definicion.setid_tipo_costo_definicion((Long) value);definicion.settipocostodefinicion_descripcion(definicionBeanSwingJInternalFrame.getActualTipoCostoDefinicionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {definicion.setcon_novedad_producto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {definicion.setcon_ice((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {definicion.setcon_cantidad((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {definicion.setcon_producto_por_proveedor((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {definicion.setcon_lote_cliente((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {definicion.setcon_cuenta_contable((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {definicion.setcon_detalle((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {definicion.setcon_iva_incluido((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {definicion.setcon_lotes((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {definicion.setnumero_descuentos((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {definicion.setcon_precio((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {definicion.setnumero_registros((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {definicion.setcon_centro_costo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {definicion.setcon_orden_iva((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {definicion.setcon_multi_empresa((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {definicion.setid_formato((Long) value);definicion.setformato_descripcion(definicionBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {definicion.setcon_en_linea((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {definicion.setid_tipo_tributario((Long) value);definicion.settipotributario_descripcion(definicionBeanSwingJInternalFrame.getActualTipoTributarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {definicion.setid_tipo_retencion((Long) value);definicion.settiporetencion_descripcion(definicionBeanSwingJInternalFrame.getActualTipoRetencionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {definicion.setcon_evaluacion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {definicion.setcon_ot((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {definicion.setcon_anticipo((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {definicion.setcon_cierre((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {definicion.setcon_general((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {definicion.setcon_por_producto((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {definicion.setcon_descuento((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {definicion.setcon_series((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {definicion.setcantidad((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {definicion.setid_tipo_documento((Long) value);definicion.settipodocumento_descripcion(definicionBeanSwingJInternalFrame.getActualTipoDocumentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 47: try {definicion.setid_libro_contable((Long) value);definicion.setlibrocontable_descripcion(definicionBeanSwingJInternalFrame.getActualLibroContableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 48: try {definicion.setcon_interno((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 49: try {definicion.setcon_reserva((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 50: try {definicion.setcon_precio_proveedor((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 51: try {definicion.setcon_produccion((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 52: try {definicion.setcon_codigo_barra((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 53: try {definicion.setcon_romaneos((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public DefinicionModel(JInternalFrameBase jInternalFrameBase) {
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
		private DefinicionDetalleFormJInternalFrame definicionJInternalFrame=null;
		
		public DefinicionModel(DefinicionDetalleFormJInternalFrame definicionJInternalFrame) {
			this.definicionJInternalFrame=definicionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.definicionJInternalFrame.getjButtonActualizarToolBarDefinicion();
			
			if(component!=null && component.equals(this.definicionJInternalFrame.getjButtonActualizarToolBarDefinicion())) {
				componentTab=this.definicionJInternalFrame.getjButtonEliminarToolBarDefinicion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.definicionJInternalFrame.getjButtonEliminarToolBarDefinicion())) {
				componentTab=this.definicionJInternalFrame.getjButtonCancelarToolBarDefinicion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.definicionJInternalFrame.getjButtonCancelarToolBarDefinicion())) {
				componentTab=this.definicionJInternalFrame.jComboBoxid_empresaDefinicion;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_cuenta_contableDefinicion)) {
				componentTab=this.definicionJInternalFrame.jComboBoxTiposAccionesFormularioDefinicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxTiposAccionesFormularioDefinicion)) {
				componentTab=this.definicionJInternalFrame.jButtonEliminarDefinicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.definicionJInternalFrame.jButtonEliminarDefinicion)) {
				componentTab=this.definicionJInternalFrame.jButtonActualizarDefinicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.definicionJInternalFrame.jButtonActualizarDefinicion)) {
				componentTab=this.definicionJInternalFrame.jButtonCancelarDefinicion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_empresaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_moduloDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_moduloDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldsecuencial_formatoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldsecuencial_formatoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldsecuencialDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldsecuencialDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_definicionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_definicionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_transaccionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_transaccionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_sucursalDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_sucursalDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_iva_itemDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_iva_itemDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_mostrar_bodegaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_mostrar_bodegaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldfactorDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldfactorDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_otro_recargoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_otro_recargoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_global_clienteDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_global_clienteDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_coaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_coaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_costeo_definicionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_costeo_definicionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_retencionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_retencionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_costo_definicionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_costo_definicionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_novedad_productoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_novedad_productoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_iceDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_iceDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_cantidadDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_cantidadDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_producto_por_proveedorDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_producto_por_proveedorDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_lote_clienteDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_lote_clienteDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_cuenta_contableDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_cuenta_contableDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_detalleDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_detalleDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_iva_incluidoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_iva_incluidoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_lotesDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_lotesDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldnumero_descuentosDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldnumero_descuentosDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_precioDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_precioDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldnumero_registrosDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldnumero_registrosDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_centro_costoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_centro_costoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_orden_ivaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_orden_ivaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_multi_empresaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_multi_empresaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_formatoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_formatoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_en_lineaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_en_lineaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_tributarioDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_tributarioDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_retencionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_retencionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_evaluacionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_evaluacionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_otDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_otDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_anticipoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_anticipoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_cierreDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_cierreDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_generalDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_generalDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_por_productoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_por_productoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_descuentoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_descuentoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_seriesDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_seriesDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldcantidadDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldcantidadDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_documentoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_documentoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_libro_contableDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_libro_contableDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_internoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_internoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_reservaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_reservaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_precio_proveedorDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_precio_proveedorDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_produccionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_produccionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_codigo_barraDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_codigo_barraDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_romaneosDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_romaneosDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_transaccion_moduloDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_transaccion_moduloDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_cuenta_contableDefinicion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.definicionJInternalFrame.getjButtonActualizarToolBarDefinicion();
			
			if(component!=null && component.equals(this.definicionJInternalFrame.getjButtonEliminarToolBarDefinicion())) {
				componentTab=this.definicionJInternalFrame.getjButtonActualizarToolBarDefinicion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.definicionJInternalFrame.getjButtonCancelarToolBarDefinicion())) {
				componentTab=this.definicionJInternalFrame.getjButtonEliminarToolBarDefinicion();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_empresaDefinicion)) {
				
				componentTab=this.definicionJInternalFrame.getjButtonCancelarToolBarDefinicion();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxTiposAccionesFormularioDefinicion)) {
				componentTab=this.definicionJInternalFrame.jComboBoxid_cuenta_contableDefinicion;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.definicionJInternalFrame.jButtonEliminarDefinicion)) {
				componentTab=this.definicionJInternalFrame.jComboBoxTiposAccionesFormularioDefinicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.definicionJInternalFrame.jButtonActualizarDefinicion)) {
				componentTab=this.definicionJInternalFrame.jButtonEliminarDefinicion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.definicionJInternalFrame.jButtonCancelarDefinicion)) {
				componentTab=this.definicionJInternalFrame.jButtonActualizarDefinicion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_moduloDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_empresaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldsecuencial_formatoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_moduloDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldsecuencialDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldsecuencial_formatoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_definicionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldsecuencialDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_transaccionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_definicionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_sucursalDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_transaccionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_iva_itemDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_sucursalDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_mostrar_bodegaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_iva_itemDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldfactorDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_mostrar_bodegaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_otro_recargoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldfactorDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_global_clienteDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_otro_recargoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_coaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_global_clienteDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_costeo_definicionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_coaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_retencionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_costeo_definicionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_costo_definicionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_retencionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_novedad_productoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_costo_definicionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_iceDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_novedad_productoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_cantidadDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_iceDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_producto_por_proveedorDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_cantidadDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_lote_clienteDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_producto_por_proveedorDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_cuenta_contableDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_lote_clienteDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_detalleDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_cuenta_contableDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_iva_incluidoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_detalleDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_lotesDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_iva_incluidoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldnumero_descuentosDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_lotesDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_precioDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldnumero_descuentosDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldnumero_registrosDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_precioDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_centro_costoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldnumero_registrosDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_orden_ivaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_centro_costoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_multi_empresaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_orden_ivaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_formatoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_multi_empresaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_en_lineaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_formatoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_tributarioDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_en_lineaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_retencionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_tributarioDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_evaluacionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_retencionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_otDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_evaluacionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_anticipoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_otDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_cierreDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_anticipoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_generalDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_cierreDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_por_productoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_generalDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_descuentoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_por_productoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_seriesDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_descuentoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jTextFieldcantidadDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_seriesDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_documentoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jTextFieldcantidadDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_libro_contableDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_documentoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_internoDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_libro_contableDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_reservaDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_internoDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_precio_proveedorDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_reservaDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_produccionDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_precio_proveedorDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_codigo_barraDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_produccionDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jCheckBoxcon_romaneosDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_codigo_barraDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_tipo_transaccion_moduloDefinicion)) {
			componentTab=this.definicionJInternalFrame.jCheckBoxcon_romaneosDefinicion;
			return componentTab;
		}

		if(component!=null && component.equals(this.definicionJInternalFrame.jComboBoxid_cuenta_contableDefinicion)) {
			componentTab=this.definicionJInternalFrame.jComboBoxid_tipo_transaccion_moduloDefinicion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.definicionJInternalFrame.getjButtonActualizarToolBarDefinicion();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.definicionJInternalFrame.getjButtonActualizarToolBarDefinicion();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.definicionJInternalFrame.getjButtonCancelarToolBarDefinicion();
			
			
			return componentTab;		
		}
		
		public DefinicionDetalleFormJInternalFrame getdefinicionJInternalFrame() {
			return this.definicionJInternalFrame;
		}
		
		public void setdefinicionJInternalFrame(DefinicionDetalleFormJInternalFrame definicionJInternalFrame) {
			this.definicionJInternalFrame=definicionJInternalFrame;
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
