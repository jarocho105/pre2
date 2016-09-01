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

import com.bydan.erp.facturacion.util.NotaCreditoConstantesFunciones;
import com.bydan.erp.facturacion.util.NotaCreditoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.NotaCreditoParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.NotaCreditoBeanSwingJInternalFrame;
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
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;

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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;






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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.NotaCreditoJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.NotaCreditoDetalleFormJInternalFrame;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class NotaCreditoModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,NotaCreditoConstantesFunciones.LABEL_ID
										,NotaCreditoConstantesFunciones.LABEL_IDEMPRESA
										,NotaCreditoConstantesFunciones.LABEL_IDSUCURSAL
										,NotaCreditoConstantesFunciones.LABEL_IDEJERCICIO
										,NotaCreditoConstantesFunciones.LABEL_IDPERIODO
										,NotaCreditoConstantesFunciones.LABEL_IDANIO
										,NotaCreditoConstantesFunciones.LABEL_IDMES
										,NotaCreditoConstantesFunciones.LABEL_IDUSUARIO
										,NotaCreditoConstantesFunciones.LABEL_CODIGO
										,NotaCreditoConstantesFunciones.LABEL_NUMEROPREIMPRESO
										,NotaCreditoConstantesFunciones.LABEL_FECHAEMISION
										,NotaCreditoConstantesFunciones.LABEL_NUMERODIAS
										,NotaCreditoConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,NotaCreditoConstantesFunciones.LABEL_IDMONEDA
										,NotaCreditoConstantesFunciones.LABEL_COTIZACION
										,NotaCreditoConstantesFunciones.LABEL_IDEMPLEADO
										,NotaCreditoConstantesFunciones.LABEL_IDFORMATO
										,NotaCreditoConstantesFunciones.LABEL_IDTIPOPRECIO
										,NotaCreditoConstantesFunciones.LABEL_IDCLIENTE
										,NotaCreditoConstantesFunciones.LABEL_IDFACTURA
										,NotaCreditoConstantesFunciones.LABEL_DIRECCION
										,NotaCreditoConstantesFunciones.LABEL_TELEFONO
										,NotaCreditoConstantesFunciones.LABEL_RUC
										,NotaCreditoConstantesFunciones.LABEL_IDVENDEDOR
										,NotaCreditoConstantesFunciones.LABEL_IDRESPONSABLE
										,NotaCreditoConstantesFunciones.LABEL_IDESTADONOTACREDITO
										,NotaCreditoConstantesFunciones.LABEL_DESCRIPCION
										,NotaCreditoConstantesFunciones.LABEL_DESCUENTOPORCENTAJE
										,NotaCreditoConstantesFunciones.LABEL_TOTALIVA
										,NotaCreditoConstantesFunciones.LABEL_SUMAN
										,NotaCreditoConstantesFunciones.LABEL_DESCUENTOVALOR
										,NotaCreditoConstantesFunciones.LABEL_TOTALSINIVA
										,NotaCreditoConstantesFunciones.LABEL_TOTALDESCUENTO
										,NotaCreditoConstantesFunciones.LABEL_FLETE
										,NotaCreditoConstantesFunciones.LABEL_TOTAL
										,NotaCreditoConstantesFunciones.LABEL_SUBTOTAL
										,NotaCreditoConstantesFunciones.LABEL_OTRO
										,NotaCreditoConstantesFunciones.LABEL_IVA
										,NotaCreditoConstantesFunciones.LABEL_FINANCIAMIENTO
										,NotaCreditoConstantesFunciones.LABEL_ICE
										,NotaCreditoConstantesFunciones.LABEL_OTROVALOR
										};
	   
	    public List<NotaCredito> notacreditos;
	  	 
	    //NO SE UTILIZA
	    public NotaCreditoModel(List<NotaCredito> notacreditos,JInternalFrameBase jInternalFrameBase) {
	    	this.notacreditos=notacreditos;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public NotaCreditoModel(JInternalFrameBase jInternalFrameBase) {
	    	this.notacreditos=new ArrayList<NotaCredito>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.notacreditos.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.notacreditos.get(rowIndex).getIsSelected();
	            
				case 1: return this.notacreditos.get(rowIndex).getId();
				case 2: return this.notacreditos.get(rowIndex).getid_empresa();
				case 3: return this.notacreditos.get(rowIndex).getid_sucursal();
				case 4: return this.notacreditos.get(rowIndex).getid_ejercicio();
				case 5: return this.notacreditos.get(rowIndex).getid_periodo();
				case 6: return this.notacreditos.get(rowIndex).getid_anio();
				case 7: return this.notacreditos.get(rowIndex).getid_mes();
				case 8: return this.notacreditos.get(rowIndex).getid_usuario();
				case 9: return this.notacreditos.get(rowIndex).getcodigo();
				case 10: return this.notacreditos.get(rowIndex).getnumero();
				case 11: return this.notacreditos.get(rowIndex).getfecha_emision();
				case 12: return this.notacreditos.get(rowIndex).getnumero_dias();
				case 13: return this.notacreditos.get(rowIndex).getfecha_vencimiento();
				case 14: return this.notacreditos.get(rowIndex).getid_moneda();
				case 15: return this.notacreditos.get(rowIndex).getcotizacion();
				case 16: return this.notacreditos.get(rowIndex).getid_empleado();
				case 17: return this.notacreditos.get(rowIndex).getid_formato();
				case 18: return this.notacreditos.get(rowIndex).getid_tipo_precio();
				case 19: return this.notacreditos.get(rowIndex).getid_cliente();
				case 20: return this.notacreditos.get(rowIndex).getid_factura();
				case 21: return this.notacreditos.get(rowIndex).getdireccion();
				case 22: return this.notacreditos.get(rowIndex).gettelefono();
				case 23: return this.notacreditos.get(rowIndex).getruc();
				case 24: return this.notacreditos.get(rowIndex).getid_vendedor();
				case 25: return this.notacreditos.get(rowIndex).getid_responsable();
				case 26: return this.notacreditos.get(rowIndex).getid_estado_nota_credito();
				case 27: return this.notacreditos.get(rowIndex).getdescripcion();
				case 28: return this.notacreditos.get(rowIndex).getdescuento_porcentaje();
				case 29: return this.notacreditos.get(rowIndex).gettotal_iva();
				case 30: return this.notacreditos.get(rowIndex).getsuman();
				case 31: return this.notacreditos.get(rowIndex).getdescuento_valor();
				case 32: return this.notacreditos.get(rowIndex).gettotal_sin_iva();
				case 33: return this.notacreditos.get(rowIndex).gettotal_descuento();
				case 34: return this.notacreditos.get(rowIndex).getflete();
				case 35: return this.notacreditos.get(rowIndex).gettotal();
				case 36: return this.notacreditos.get(rowIndex).getsub_total();
				case 37: return this.notacreditos.get(rowIndex).getotro();
				case 38: return this.notacreditos.get(rowIndex).getiva();
				case 39: return this.notacreditos.get(rowIndex).getfinanciamiento();
				case 40: return this.notacreditos.get(rowIndex).getice();
				case 41: return this.notacreditos.get(rowIndex).getotro_valor();	            
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
				case 10: return String.class;
				case 11: return Date.class;
				case 12: return Integer.class;
				case 13: return Date.class;
				case 14: return Long.class;
				case 15: return Double.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return Long.class;
				case 19: return Long.class;
				case 20: return Long.class;
				case 21: return String.class;
				case 22: return String.class;
				case 23: return String.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return Long.class;
				case 27: return String.class;
				case 28: return Double.class;
				case 29: return Double.class;
				case 30: return Double.class;
				case 31: return Double.class;
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	NotaCredito notacredito = this.notacreditos.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			NotaCreditoBeanSwingJInternalFrame notacreditoBeanSwingJInternalFrame=(NotaCreditoBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {notacredito.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {notacredito.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {notacredito.setid_empresa((Long) value);notacredito.setempresa_descripcion(notacreditoBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {notacredito.setid_sucursal((Long) value);notacredito.setsucursal_descripcion(notacreditoBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {notacredito.setid_ejercicio((Long) value);notacredito.setejercicio_descripcion(notacreditoBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {notacredito.setid_periodo((Long) value);notacredito.setperiodo_descripcion(notacreditoBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {notacredito.setid_anio((Long) value);notacredito.setanio_descripcion(notacreditoBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {notacredito.setid_mes((Long) value);notacredito.setmes_descripcion(notacreditoBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {notacredito.setid_usuario((Long) value);notacredito.setusuario_descripcion(notacreditoBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {notacredito.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {notacredito.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {notacredito.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {notacredito.setnumero_dias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {notacredito.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {notacredito.setid_moneda((Long) value);notacredito.setmoneda_descripcion(notacreditoBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {notacredito.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {notacredito.setid_empleado((Long) value);notacredito.setempleado_descripcion(notacreditoBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {notacredito.setid_formato((Long) value);notacredito.setformato_descripcion(notacreditoBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {notacredito.setid_tipo_precio((Long) value);notacredito.settipoprecio_descripcion(notacreditoBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {notacredito.setid_cliente((Long) value);notacredito.setcliente_descripcion(notacreditoBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {notacredito.setid_factura((Long) value);notacredito.setfactura_descripcion(notacreditoBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {notacredito.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {notacredito.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {notacredito.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {notacredito.setid_vendedor((Long) value);notacredito.setvendedor_descripcion(notacreditoBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {notacredito.setid_responsable((Long) value);notacredito.setresponsable_descripcion(notacreditoBeanSwingJInternalFrame.getActualResponsableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {notacredito.setid_estado_nota_credito((Long) value);notacredito.setestadonotacredito_descripcion(notacreditoBeanSwingJInternalFrame.getActualEstadoNotaCreditoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {notacredito.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {notacredito.setdescuento_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {notacredito.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {notacredito.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {notacredito.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {notacredito.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {notacredito.settotal_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {notacredito.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {notacredito.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {notacredito.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {notacredito.setotro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {notacredito.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {notacredito.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {notacredito.setice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {notacredito.setotro_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public NotaCreditoModel(JInternalFrameBase jInternalFrameBase) {
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
		private NotaCreditoDetalleFormJInternalFrame notacreditoJInternalFrame=null;
		
		public NotaCreditoModel(NotaCreditoDetalleFormJInternalFrame notacreditoJInternalFrame) {
			this.notacreditoJInternalFrame=notacreditoJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.notacreditoJInternalFrame.getjButtonActualizarToolBarNotaCredito();
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.getjButtonActualizarToolBarNotaCredito())) {
				componentTab=this.notacreditoJInternalFrame.getjButtonEliminarToolBarNotaCredito();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.getjButtonEliminarToolBarNotaCredito())) {
				componentTab=this.notacreditoJInternalFrame.getjButtonCancelarToolBarNotaCredito();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.getjButtonCancelarToolBarNotaCredito())) {
				componentTab=this.notacreditoJInternalFrame.jComboBoxid_empresaNotaCredito;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfecha_autorizacionNotaCredito)) {
				componentTab=this.notacreditoJInternalFrame.jComboBoxTiposAccionesFormularioNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxTiposAccionesFormularioNotaCredito)) {
				componentTab=this.notacreditoJInternalFrame.jButtonEliminarNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.jButtonEliminarNotaCredito)) {
				componentTab=this.notacreditoJInternalFrame.jButtonActualizarNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.jButtonActualizarNotaCredito)) {
				componentTab=this.notacreditoJInternalFrame.jButtonCancelarNotaCredito;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_empresaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_sucursalNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_sucursalNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_ejercicioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_ejercicioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_periodoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_periodoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_anioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_anioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_mesNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_mesNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_usuarioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_usuarioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldcodigoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldcodigoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldnumeroNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldnumeroNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jDateChooserfecha_emisionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfecha_emisionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldnumero_diasNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldnumero_diasNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jDateChooserfecha_vencimientoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfecha_vencimientoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_monedaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_monedaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldcotizacionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldcotizacionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_empleadoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_empleadoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_formatoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_formatoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_tipo_precioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_tipo_precioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_clienteNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_clienteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_facturaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_facturaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextAreadireccionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextAreadireccionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtelefonoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtelefonoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldrucNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldrucNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_vendedorNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_vendedorNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_responsableNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_responsableNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_estado_nota_creditoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_estado_nota_creditoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextAreadescripcionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextAreadescripcionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFielddescuento_porcentajeNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFielddescuento_porcentajeNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtotal_ivaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtotal_ivaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldsumanNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldsumanNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFielddescuento_valorNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFielddescuento_valorNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtotal_sin_ivaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtotal_sin_ivaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtotal_descuentoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtotal_descuentoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldfleteNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldfleteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtotalNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtotalNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldsub_totalNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldsub_totalNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldotroNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldotroNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldivaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldivaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldfinanciamientoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldfinanciamientoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldiceNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldiceNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldotro_valorNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldotro_valorNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldretencionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldretencionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jDateChooserfechaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfechaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jCheckBoxes_clienteNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jCheckBoxes_clienteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_centro_costoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_centro_costoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_tipo_cambioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_tipo_cambioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_transporteNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_transporteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_transportistaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_transportistaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jDateChooserfecha_clienteNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfecha_clienteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jDateChooserfecha_autorizacionNotaCredito;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.notacreditoJInternalFrame.getjButtonActualizarToolBarNotaCredito();
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.getjButtonEliminarToolBarNotaCredito())) {
				componentTab=this.notacreditoJInternalFrame.getjButtonActualizarToolBarNotaCredito();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.getjButtonCancelarToolBarNotaCredito())) {
				componentTab=this.notacreditoJInternalFrame.getjButtonEliminarToolBarNotaCredito();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_empresaNotaCredito)) {
				
				componentTab=this.notacreditoJInternalFrame.getjButtonCancelarToolBarNotaCredito();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxTiposAccionesFormularioNotaCredito)) {
				componentTab=this.notacreditoJInternalFrame.jDateChooserfecha_autorizacionNotaCredito;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.jButtonEliminarNotaCredito)) {
				componentTab=this.notacreditoJInternalFrame.jComboBoxTiposAccionesFormularioNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.jButtonActualizarNotaCredito)) {
				componentTab=this.notacreditoJInternalFrame.jButtonEliminarNotaCredito;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditoJInternalFrame.jButtonCancelarNotaCredito)) {
				componentTab=this.notacreditoJInternalFrame.jButtonActualizarNotaCredito;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_sucursalNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_empresaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_ejercicioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_sucursalNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_periodoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_ejercicioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_anioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_periodoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_mesNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_anioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_usuarioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_mesNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldcodigoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_usuarioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldnumeroNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldcodigoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfecha_emisionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldnumeroNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldnumero_diasNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jDateChooserfecha_emisionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfecha_vencimientoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldnumero_diasNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_monedaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jDateChooserfecha_vencimientoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldcotizacionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_monedaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_empleadoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldcotizacionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_formatoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_empleadoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_tipo_precioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_formatoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_clienteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_tipo_precioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_facturaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_clienteNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextAreadireccionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_facturaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtelefonoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextAreadireccionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldrucNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtelefonoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_vendedorNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldrucNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_responsableNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_vendedorNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_estado_nota_creditoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_responsableNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextAreadescripcionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_estado_nota_creditoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFielddescuento_porcentajeNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextAreadescripcionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtotal_ivaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFielddescuento_porcentajeNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldsumanNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtotal_ivaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFielddescuento_valorNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldsumanNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtotal_sin_ivaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFielddescuento_valorNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtotal_descuentoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtotal_sin_ivaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldfleteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtotal_descuentoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldtotalNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldfleteNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldsub_totalNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldtotalNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldotroNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldsub_totalNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldivaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldotroNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldfinanciamientoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldivaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldiceNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldfinanciamientoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldotro_valorNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldiceNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jTextFieldretencionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldotro_valorNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfechaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jTextFieldretencionNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jCheckBoxes_clienteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jDateChooserfechaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_centro_costoNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jCheckBoxes_clienteNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_tipo_cambioNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_centro_costoNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_transporteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_tipo_cambioNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jComboBoxid_transportistaNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_transporteNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfecha_clienteNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jComboBoxid_transportistaNotaCredito;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditoJInternalFrame.jDateChooserfecha_autorizacionNotaCredito)) {
			componentTab=this.notacreditoJInternalFrame.jDateChooserfecha_clienteNotaCredito;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.notacreditoJInternalFrame.getjButtonActualizarToolBarNotaCredito();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.notacreditoJInternalFrame.getjButtonActualizarToolBarNotaCredito();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.notacreditoJInternalFrame.getjButtonCancelarToolBarNotaCredito();
			
			
			return componentTab;		
		}
		
		public NotaCreditoDetalleFormJInternalFrame getnotacreditoJInternalFrame() {
			return this.notacreditoJInternalFrame;
		}
		
		public void setnotacreditoJInternalFrame(NotaCreditoDetalleFormJInternalFrame notacreditoJInternalFrame) {
			this.notacreditoJInternalFrame=notacreditoJInternalFrame;
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
