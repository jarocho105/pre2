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


import java.sql.Time;


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

import com.bydan.erp.facturacion.util.FacturaConstantesFunciones;
import com.bydan.erp.facturacion.util.FacturaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.FacturaParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.FacturaBeanSwingJInternalFrame;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.FacturaJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.FacturaDetalleFormJInternalFrame;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class FacturaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,FacturaConstantesFunciones.LABEL_ID
										,FacturaConstantesFunciones.LABEL_IDEMPRESA
										,FacturaConstantesFunciones.LABEL_IDSUCURSAL
										,FacturaConstantesFunciones.LABEL_IDEJERCICIO
										,FacturaConstantesFunciones.LABEL_IDPERIODO
										,FacturaConstantesFunciones.LABEL_IDANIO
										,FacturaConstantesFunciones.LABEL_IDMES
										,FacturaConstantesFunciones.LABEL_IDUSUARIO
										,FacturaConstantesFunciones.LABEL_NUMEROPREIMPRESO
										,FacturaConstantesFunciones.LABEL_FECHAEMISION
										,FacturaConstantesFunciones.LABEL_NUMERODIAS
										,FacturaConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,FacturaConstantesFunciones.LABEL_IDMONEDA
										,FacturaConstantesFunciones.LABEL_COTIZACION
										,FacturaConstantesFunciones.LABEL_IDEMPLEADO
										,FacturaConstantesFunciones.LABEL_IDFORMATO
										,FacturaConstantesFunciones.LABEL_DIRECCION
										,FacturaConstantesFunciones.LABEL_RUC
										,FacturaConstantesFunciones.LABEL_IDCLIENTE
										,FacturaConstantesFunciones.LABEL_IDTIPOPRECIO
										,FacturaConstantesFunciones.LABEL_TELEFONO
										,FacturaConstantesFunciones.LABEL_IDSUBCLIENTE
										,FacturaConstantesFunciones.LABEL_IDVENDEDOR
										,FacturaConstantesFunciones.LABEL_IDTRANSPORTE
										,FacturaConstantesFunciones.LABEL_IDTRANSPORTISTA
										,FacturaConstantesFunciones.LABEL_ORDEN
										,FacturaConstantesFunciones.LABEL_IDTIPOLLAMADA
										,FacturaConstantesFunciones.LABEL_HORAINICIO
										,FacturaConstantesFunciones.LABEL_HORAFIN
										,FacturaConstantesFunciones.LABEL_IDTIPOFACTURA
										,FacturaConstantesFunciones.LABEL_DESCRIPCION
										,FacturaConstantesFunciones.LABEL_CUPO
										,FacturaConstantesFunciones.LABEL_SALDO
										,FacturaConstantesFunciones.LABEL_DOCUMENTOS
										,FacturaConstantesFunciones.LABEL_DISPONIBLE
										,FacturaConstantesFunciones.LABEL_PORCENTAJEDESCUENTO
										,FacturaConstantesFunciones.LABEL_TOTALIVA
										,FacturaConstantesFunciones.LABEL_SUMAN
										,FacturaConstantesFunciones.LABEL_DESCUENTOVALOR
										,FacturaConstantesFunciones.LABEL_TOTALSINIVA
										,FacturaConstantesFunciones.LABEL_TOTALDESCUENTO
										,FacturaConstantesFunciones.LABEL_TOTALFLETE
										,FacturaConstantesFunciones.LABEL_TOTAL
										,FacturaConstantesFunciones.LABEL_SUBTOTAL
										,FacturaConstantesFunciones.LABEL_TOTALOTRO
										,FacturaConstantesFunciones.LABEL_ULTIMOCOSTO
										,FacturaConstantesFunciones.LABEL_IVA
										,FacturaConstantesFunciones.LABEL_DESCUENTO
										,FacturaConstantesFunciones.LABEL_FINANCIAMIENTO
										,FacturaConstantesFunciones.LABEL_MARGENUTILIDAD
										,FacturaConstantesFunciones.LABEL_ICE
										,FacturaConstantesFunciones.LABEL_ANTICIPO
										,FacturaConstantesFunciones.LABEL_OTROSVALORES
										};
	   
	    public List<Factura> facturas;
	  	 
	    //NO SE UTILIZA
	    public FacturaModel(List<Factura> facturas,JInternalFrameBase jInternalFrameBase) {
	    	this.facturas=facturas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public FacturaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.facturas=new ArrayList<Factura>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.facturas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.facturas.get(rowIndex).getIsSelected();
	            
				case 1: return this.facturas.get(rowIndex).getId();
				case 2: return this.facturas.get(rowIndex).getid_empresa();
				case 3: return this.facturas.get(rowIndex).getid_sucursal();
				case 4: return this.facturas.get(rowIndex).getid_ejercicio();
				case 5: return this.facturas.get(rowIndex).getid_periodo();
				case 6: return this.facturas.get(rowIndex).getid_anio();
				case 7: return this.facturas.get(rowIndex).getid_mes();
				case 8: return this.facturas.get(rowIndex).getid_usuario();
				case 9: return this.facturas.get(rowIndex).getnumero_pre_impreso();
				case 10: return this.facturas.get(rowIndex).getfecha_emision();
				case 11: return this.facturas.get(rowIndex).getnumero_dias();
				case 12: return this.facturas.get(rowIndex).getfecha_vencimiento();
				case 13: return this.facturas.get(rowIndex).getid_moneda();
				case 14: return this.facturas.get(rowIndex).getcotizacion();
				case 15: return this.facturas.get(rowIndex).getid_empleado();
				case 16: return this.facturas.get(rowIndex).getid_formato();
				case 17: return this.facturas.get(rowIndex).getdireccion();
				case 18: return this.facturas.get(rowIndex).getruc();
				case 19: return this.facturas.get(rowIndex).getid_cliente();
				case 20: return this.facturas.get(rowIndex).getid_tipo_precio();
				case 21: return this.facturas.get(rowIndex).gettelefono();
				case 22: return this.facturas.get(rowIndex).getid_sub_cliente();
				case 23: return this.facturas.get(rowIndex).getid_vendedor();
				case 24: return this.facturas.get(rowIndex).getid_transporte();
				case 25: return this.facturas.get(rowIndex).getid_transportista();
				case 26: return this.facturas.get(rowIndex).getorden();
				case 27: return this.facturas.get(rowIndex).getid_tipo_llamada();
				case 28: return this.facturas.get(rowIndex).gethora_inicio();
				case 29: return this.facturas.get(rowIndex).gethora_fin();
				case 30: return this.facturas.get(rowIndex).getid_tipo_factura();
				case 31: return this.facturas.get(rowIndex).getdescripcion();
				case 32: return this.facturas.get(rowIndex).getcupo();
				case 33: return this.facturas.get(rowIndex).getsaldo();
				case 34: return this.facturas.get(rowIndex).getdocumentos();
				case 35: return this.facturas.get(rowIndex).getdisponible();
				case 36: return this.facturas.get(rowIndex).getporcentaje_descuento();
				case 37: return this.facturas.get(rowIndex).gettotal_iva();
				case 38: return this.facturas.get(rowIndex).getsuman();
				case 39: return this.facturas.get(rowIndex).getdescuento_valor();
				case 40: return this.facturas.get(rowIndex).gettotal_sin_iva();
				case 41: return this.facturas.get(rowIndex).gettotal_descuento();
				case 42: return this.facturas.get(rowIndex).gettotal_flete();
				case 43: return this.facturas.get(rowIndex).gettotal();
				case 44: return this.facturas.get(rowIndex).getsub_total();
				case 45: return this.facturas.get(rowIndex).gettotal_otro();
				case 46: return this.facturas.get(rowIndex).getultimo_costo();
				case 47: return this.facturas.get(rowIndex).getiva();
				case 48: return this.facturas.get(rowIndex).getdescuento();
				case 49: return this.facturas.get(rowIndex).getfinanciamiento();
				case 50: return this.facturas.get(rowIndex).getmargen_utilidad();
				case 51: return this.facturas.get(rowIndex).getice();
				case 52: return this.facturas.get(rowIndex).getanticipo();
				case 53: return this.facturas.get(rowIndex).getotros_valores();	            
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
				case 10: return Date.class;
				case 11: return Integer.class;
				case 12: return Date.class;
				case 13: return Long.class;
				case 14: return Double.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return String.class;
				case 18: return String.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return String.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return String.class;
				case 27: return Long.class;
				case 28: return Time.class;
				case 29: return Time.class;
				case 30: return Long.class;
				case 31: return String.class;
				case 32: return Double.class;
				case 33: return Double.class;
				case 34: return Double.class;
				case 35: return Double.class;
				case 36: return Double.class;
				case 37: return Double.class;
				case 38: return Double.class;
				case 39: return Double.class;
				case 40: return Double.class;
				case 41: return Double.class;
				case 42: return Double.class;
				case 43: return Double.class;
				case 44: return Double.class;
				case 45: return Double.class;
				case 46: return Double.class;
				case 47: return Double.class;
				case 48: return Double.class;
				case 49: return Double.class;
				case 50: return Double.class;
				case 51: return Double.class;
				case 52: return Double.class;
				case 53: return Double.class;	            
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
	    	Factura factura = this.facturas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=(FacturaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {factura.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {factura.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {factura.setid_empresa((Long) value);factura.setempresa_descripcion(facturaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {factura.setid_sucursal((Long) value);factura.setsucursal_descripcion(facturaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {factura.setid_ejercicio((Long) value);factura.setejercicio_descripcion(facturaBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {factura.setid_periodo((Long) value);factura.setperiodo_descripcion(facturaBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {factura.setid_anio((Long) value);factura.setanio_descripcion(facturaBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {factura.setid_mes((Long) value);factura.setmes_descripcion(facturaBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {factura.setid_usuario((Long) value);factura.setusuario_descripcion(facturaBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {factura.setnumero_pre_impreso((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {factura.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {factura.setnumero_dias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {factura.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {factura.setid_moneda((Long) value);factura.setmoneda_descripcion(facturaBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {factura.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {factura.setid_empleado((Long) value);factura.setempleado_descripcion(facturaBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {factura.setid_formato((Long) value);factura.setformato_descripcion(facturaBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {factura.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {factura.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {factura.setid_cliente((Long) value);factura.setcliente_descripcion(facturaBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {factura.setid_tipo_precio((Long) value);factura.settipoprecio_descripcion(facturaBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {factura.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {factura.setid_sub_cliente((Long) value);factura.setsubcliente_descripcion(facturaBeanSwingJInternalFrame.getActualSubClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {factura.setid_vendedor((Long) value);factura.setvendedor_descripcion(facturaBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {factura.setid_transporte((Long) value);factura.settransporte_descripcion(facturaBeanSwingJInternalFrame.getActualTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {factura.setid_transportista((Long) value);factura.settransportista_descripcion(facturaBeanSwingJInternalFrame.getActualTransportistaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {factura.setorden((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {factura.setid_tipo_llamada((Long) value);factura.settipollamada_descripcion(facturaBeanSwingJInternalFrame.getActualTipoLlamadaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {factura.sethora_inicio((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {factura.sethora_fin((Time) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {factura.setid_tipo_factura((Long) value);factura.settipofactura_descripcion(facturaBeanSwingJInternalFrame.getActualTipoFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {factura.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {factura.setcupo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {factura.setsaldo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {factura.setdocumentos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {factura.setdisponible((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {factura.setporcentaje_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {factura.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {factura.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {factura.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {factura.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {factura.settotal_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {factura.settotal_flete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {factura.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {factura.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {factura.settotal_otro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {factura.setultimo_costo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 47: try {factura.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 48: try {factura.setdescuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 49: try {factura.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 50: try {factura.setmargen_utilidad((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 51: try {factura.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 52: try {factura.setanticipo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 53: try {factura.setotros_valores((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public FacturaModel(JInternalFrameBase jInternalFrameBase) {
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
		private FacturaDetalleFormJInternalFrame facturaJInternalFrame=null;
		
		public FacturaModel(FacturaDetalleFormJInternalFrame facturaJInternalFrame) {
			this.facturaJInternalFrame=facturaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturaJInternalFrame.getjButtonActualizarToolBarFactura();
			
			if(component!=null && component.equals(this.facturaJInternalFrame.getjButtonActualizarToolBarFactura())) {
				componentTab=this.facturaJInternalFrame.getjButtonEliminarToolBarFactura();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaJInternalFrame.getjButtonEliminarToolBarFactura())) {
				componentTab=this.facturaJInternalFrame.getjButtonCancelarToolBarFactura();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaJInternalFrame.getjButtonCancelarToolBarFactura())) {
				componentTab=this.facturaJInternalFrame.jComboBoxid_empresaFactura;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldaforo_referendoFactura)) {
				componentTab=this.facturaJInternalFrame.jComboBoxTiposAccionesFormularioFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxTiposAccionesFormularioFactura)) {
				componentTab=this.facturaJInternalFrame.jButtonEliminarFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaJInternalFrame.jButtonEliminarFactura)) {
				componentTab=this.facturaJInternalFrame.jButtonActualizarFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaJInternalFrame.jButtonActualizarFactura)) {
				componentTab=this.facturaJInternalFrame.jButtonCancelarFactura;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_empresaFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_sucursalFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_sucursalFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_ejercicioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_ejercicioFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_periodoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_periodoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_anioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_anioFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_mesFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_mesFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_usuarioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_usuarioFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_pre_impresoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_pre_impresoFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_emisionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_emisionFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_diasFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_diasFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_vencimientoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_vencimientoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_monedaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_monedaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldcotizacionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldcotizacionFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_empleadoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_empleadoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_formatoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_formatoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextAreadireccionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextAreadireccionFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldrucFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldrucFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_clienteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_clienteFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_tipo_precioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_tipo_precioFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtelefonoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtelefonoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_sub_clienteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_sub_clienteFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_vendedorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_vendedorFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_transporteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_transporteFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_transportistaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_transportistaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldordenFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldordenFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_tipo_llamadaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_tipo_llamadaFactura)) {
			componentTab=this.facturaJInternalFrame.jSpinnerhora_inicioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jSpinnerhora_inicioFactura)) {
			componentTab=this.facturaJInternalFrame.jSpinnerhora_finFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jSpinnerhora_finFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_tipo_facturaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_tipo_facturaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextAreadescripcionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextAreadescripcionFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldcupoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldcupoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldsaldoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldsaldoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFielddocumentosFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFielddocumentosFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFielddisponibleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFielddisponibleFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldporcentaje_descuentoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldporcentaje_descuentoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_ivaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_ivaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldsumanFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldsumanFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFielddescuento_valorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFielddescuento_valorFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_sin_ivaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_sin_ivaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_descuentoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_descuentoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_fleteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_fleteFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotalFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotalFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldsub_totalFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldsub_totalFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_otroFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_otroFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldultimo_costoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldultimo_costoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldivaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldivaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFielddescuentoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFielddescuentoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldfinanciamientoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldfinanciamientoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldmargen_utilidadFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldmargen_utilidadFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldiceFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldiceFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldanticipoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldanticipoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldotros_valoresFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldotros_valoresFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_retencionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_retencionFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_consumo_especialFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_consumo_especialFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldretencionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldretencionFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_tipo_cambioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_tipo_cambioFactura)) {
			componentTab=this.facturaJInternalFrame.jCheckBoxes_clienteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jCheckBoxes_clienteFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_asiento_contableFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_asiento_contableFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_pedidoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_pedidoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_responsableFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_responsableFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_estado_fisico_factura_empresaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_estado_fisico_factura_empresaFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfechaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfechaFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_autorizacionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_autorizacionFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_clienteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_clienteFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_documentoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_documentoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_dauFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_dauFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_referendoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_referendoFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_referendoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_referendoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldaforo_referendoFactura;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturaJInternalFrame.getjButtonActualizarToolBarFactura();
			
			if(component!=null && component.equals(this.facturaJInternalFrame.getjButtonEliminarToolBarFactura())) {
				componentTab=this.facturaJInternalFrame.getjButtonActualizarToolBarFactura();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaJInternalFrame.getjButtonCancelarToolBarFactura())) {
				componentTab=this.facturaJInternalFrame.getjButtonEliminarToolBarFactura();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_empresaFactura)) {
				
				componentTab=this.facturaJInternalFrame.getjButtonCancelarToolBarFactura();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxTiposAccionesFormularioFactura)) {
				componentTab=this.facturaJInternalFrame.jTextFieldaforo_referendoFactura;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturaJInternalFrame.jButtonEliminarFactura)) {
				componentTab=this.facturaJInternalFrame.jComboBoxTiposAccionesFormularioFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaJInternalFrame.jButtonActualizarFactura)) {
				componentTab=this.facturaJInternalFrame.jButtonEliminarFactura;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaJInternalFrame.jButtonCancelarFactura)) {
				componentTab=this.facturaJInternalFrame.jButtonActualizarFactura;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_sucursalFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_empresaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_ejercicioFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_sucursalFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_periodoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_ejercicioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_anioFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_periodoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_mesFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_anioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_usuarioFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_mesFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_pre_impresoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_usuarioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_emisionFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_pre_impresoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_diasFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_emisionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_vencimientoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_diasFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_monedaFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_vencimientoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldcotizacionFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_monedaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_empleadoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldcotizacionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_formatoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_empleadoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextAreadireccionFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_formatoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldrucFactura)) {
			componentTab=this.facturaJInternalFrame.jTextAreadireccionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_clienteFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldrucFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_tipo_precioFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_clienteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtelefonoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_tipo_precioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_sub_clienteFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtelefonoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_vendedorFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_sub_clienteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_transporteFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_vendedorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_transportistaFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_transporteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldordenFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_transportistaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_tipo_llamadaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldordenFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jSpinnerhora_inicioFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_tipo_llamadaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jSpinnerhora_finFactura)) {
			componentTab=this.facturaJInternalFrame.jSpinnerhora_inicioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_tipo_facturaFactura)) {
			componentTab=this.facturaJInternalFrame.jSpinnerhora_finFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextAreadescripcionFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_tipo_facturaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldcupoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextAreadescripcionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldsaldoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldcupoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFielddocumentosFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldsaldoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFielddisponibleFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFielddocumentosFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldporcentaje_descuentoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFielddisponibleFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_ivaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldporcentaje_descuentoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldsumanFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_ivaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFielddescuento_valorFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldsumanFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_sin_ivaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFielddescuento_valorFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_descuentoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_sin_ivaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_fleteFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_descuentoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotalFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_fleteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldsub_totalFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotalFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_otroFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldsub_totalFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldultimo_costoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_otroFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldivaFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldultimo_costoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFielddescuentoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldivaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldfinanciamientoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFielddescuentoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldmargen_utilidadFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldfinanciamientoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldiceFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldmargen_utilidadFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldanticipoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldiceFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldotros_valoresFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldanticipoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_retencionFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldotros_valoresFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldtotal_consumo_especialFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_retencionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldretencionFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldtotal_consumo_especialFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_tipo_cambioFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldretencionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jCheckBoxes_clienteFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_tipo_cambioFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_asiento_contableFactura)) {
			componentTab=this.facturaJInternalFrame.jCheckBoxes_clienteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_pedidoFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_asiento_contableFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_responsableFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_pedidoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jComboBoxid_estado_fisico_factura_empresaFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_responsableFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfechaFactura)) {
			componentTab=this.facturaJInternalFrame.jComboBoxid_estado_fisico_factura_empresaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_autorizacionFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfechaFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_clienteFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_autorizacionFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_documentoFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_clienteFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_dauFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_documentoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldnumero_referendoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_dauFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jDateChooserfecha_referendoFactura)) {
			componentTab=this.facturaJInternalFrame.jTextFieldnumero_referendoFactura;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaJInternalFrame.jTextFieldaforo_referendoFactura)) {
			componentTab=this.facturaJInternalFrame.jDateChooserfecha_referendoFactura;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.facturaJInternalFrame.getjButtonActualizarToolBarFactura();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.facturaJInternalFrame.getjButtonActualizarToolBarFactura();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.facturaJInternalFrame.getjButtonCancelarToolBarFactura();
			
			
			return componentTab;		
		}
		
		public FacturaDetalleFormJInternalFrame getfacturaJInternalFrame() {
			return this.facturaJInternalFrame;
		}
		
		public void setfacturaJInternalFrame(FacturaDetalleFormJInternalFrame facturaJInternalFrame) {
			this.facturaJInternalFrame=facturaJInternalFrame;
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
