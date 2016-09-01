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

import com.bydan.erp.facturacion.util.ConsignacionConstantesFunciones;
import com.bydan.erp.facturacion.util.ConsignacionParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ConsignacionParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ConsignacionBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ConsignacionJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ConsignacionDetalleFormJInternalFrame;

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

public class ConsignacionModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ConsignacionConstantesFunciones.LABEL_ID
										,ConsignacionConstantesFunciones.LABEL_IDEMPRESA
										,ConsignacionConstantesFunciones.LABEL_IDSUCURSAL
										,ConsignacionConstantesFunciones.LABEL_IDEJERCICIO
										,ConsignacionConstantesFunciones.LABEL_IDPERIODO
										,ConsignacionConstantesFunciones.LABEL_IDANIO
										,ConsignacionConstantesFunciones.LABEL_IDMES
										,ConsignacionConstantesFunciones.LABEL_IDUSUARIO
										,ConsignacionConstantesFunciones.LABEL_NUMERO
										,ConsignacionConstantesFunciones.LABEL_NUMEROAUTORIZACION
										,ConsignacionConstantesFunciones.LABEL_FECHAEMISION
										,ConsignacionConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,ConsignacionConstantesFunciones.LABEL_IDMONEDA
										,ConsignacionConstantesFunciones.LABEL_COTIZACION
										,ConsignacionConstantesFunciones.LABEL_IDEMPLEADO
										,ConsignacionConstantesFunciones.LABEL_IDTIPOPRECIO
										,ConsignacionConstantesFunciones.LABEL_IDFORMATO
										,ConsignacionConstantesFunciones.LABEL_DIRECCION
										,ConsignacionConstantesFunciones.LABEL_IDCLIENTE
										,ConsignacionConstantesFunciones.LABEL_TELEFONO
										,ConsignacionConstantesFunciones.LABEL_RUC
										,ConsignacionConstantesFunciones.LABEL_IDSUBCLIENTE
										,ConsignacionConstantesFunciones.LABEL_IDCONSIGNATARIO
										,ConsignacionConstantesFunciones.LABEL_IDVENDEDOR
										,ConsignacionConstantesFunciones.LABEL_DESCRIPCION
										,ConsignacionConstantesFunciones.LABEL_IDESTADOPEDIDO
										,ConsignacionConstantesFunciones.LABEL_DESCUENTOPORCENTAJE
										,ConsignacionConstantesFunciones.LABEL_TOTALCONIVA
										,ConsignacionConstantesFunciones.LABEL_SUMAN
										,ConsignacionConstantesFunciones.LABEL_DESCUENTOVALOR
										,ConsignacionConstantesFunciones.LABEL_TOTALSINIVA
										,ConsignacionConstantesFunciones.LABEL_TOTALDESCUENTO
										,ConsignacionConstantesFunciones.LABEL_FLETE
										,ConsignacionConstantesFunciones.LABEL_TOTAL
										,ConsignacionConstantesFunciones.LABEL_SUBTOTAL
										,ConsignacionConstantesFunciones.LABEL_OTRO
										,ConsignacionConstantesFunciones.LABEL_FINANCIAMIENTO
										};
	   
	    public List<Consignacion> consignacions;
	  	 
	    //NO SE UTILIZA
	    public ConsignacionModel(List<Consignacion> consignacions,JInternalFrameBase jInternalFrameBase) {
	    	this.consignacions=consignacions;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ConsignacionModel(JInternalFrameBase jInternalFrameBase) {
	    	this.consignacions=new ArrayList<Consignacion>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.consignacions.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.consignacions.get(rowIndex).getIsSelected();
	            
				case 1: return this.consignacions.get(rowIndex).getId();
				case 2: return this.consignacions.get(rowIndex).getid_empresa();
				case 3: return this.consignacions.get(rowIndex).getid_sucursal();
				case 4: return this.consignacions.get(rowIndex).getid_ejercicio();
				case 5: return this.consignacions.get(rowIndex).getid_periodo();
				case 6: return this.consignacions.get(rowIndex).getid_anio();
				case 7: return this.consignacions.get(rowIndex).getid_mes();
				case 8: return this.consignacions.get(rowIndex).getid_usuario();
				case 9: return this.consignacions.get(rowIndex).getnumero();
				case 10: return this.consignacions.get(rowIndex).getnumero_autorizacion();
				case 11: return this.consignacions.get(rowIndex).getfecha_emision();
				case 12: return this.consignacions.get(rowIndex).getfecha_vencimiento();
				case 13: return this.consignacions.get(rowIndex).getid_moneda();
				case 14: return this.consignacions.get(rowIndex).getcotizacion();
				case 15: return this.consignacions.get(rowIndex).getid_empleado();
				case 16: return this.consignacions.get(rowIndex).getid_tipo_precio();
				case 17: return this.consignacions.get(rowIndex).getid_formato();
				case 18: return this.consignacions.get(rowIndex).getdireccion();
				case 19: return this.consignacions.get(rowIndex).getid_cliente();
				case 20: return this.consignacions.get(rowIndex).gettelefono();
				case 21: return this.consignacions.get(rowIndex).getruc();
				case 22: return this.consignacions.get(rowIndex).getid_sub_cliente();
				case 23: return this.consignacions.get(rowIndex).getid_consignatario();
				case 24: return this.consignacions.get(rowIndex).getid_vendedor();
				case 25: return this.consignacions.get(rowIndex).getdescripcion();
				case 26: return this.consignacions.get(rowIndex).getid_estado_pedido();
				case 27: return this.consignacions.get(rowIndex).getdescuento_porcentaje();
				case 28: return this.consignacions.get(rowIndex).gettotal_con_iva();
				case 29: return this.consignacions.get(rowIndex).getsuman();
				case 30: return this.consignacions.get(rowIndex).getdescuento_valor();
				case 31: return this.consignacions.get(rowIndex).gettotal_sin_iva();
				case 32: return this.consignacions.get(rowIndex).gettotal_descuento();
				case 33: return this.consignacions.get(rowIndex).getflete();
				case 34: return this.consignacions.get(rowIndex).gettotal();
				case 35: return this.consignacions.get(rowIndex).getsubtotal();
				case 36: return this.consignacions.get(rowIndex).getotro();
				case 37: return this.consignacions.get(rowIndex).getfinanciamiento();	            
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
				case 12: return Date.class;
				case 13: return Long.class;
				case 14: return Double.class;
				case 15: return Long.class;
				case 16: return Long.class;
				case 17: return Long.class;
				case 18: return String.class;
				case 19: return Long.class;
				case 20: return String.class;
				case 21: return String.class;
				case 22: return Long.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return String.class;
				case 26: return Long.class;
				case 27: return Double.class;
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Consignacion consignacion = this.consignacions.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=(ConsignacionBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {consignacion.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {consignacion.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {consignacion.setid_empresa((Long) value);consignacion.setempresa_descripcion(consignacionBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {consignacion.setid_sucursal((Long) value);consignacion.setsucursal_descripcion(consignacionBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {consignacion.setid_ejercicio((Long) value);consignacion.setejercicio_descripcion(consignacionBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {consignacion.setid_periodo((Long) value);consignacion.setperiodo_descripcion(consignacionBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {consignacion.setid_anio((Long) value);consignacion.setanio_descripcion(consignacionBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {consignacion.setid_mes((Long) value);consignacion.setmes_descripcion(consignacionBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {consignacion.setid_usuario((Long) value);consignacion.setusuario_descripcion(consignacionBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {consignacion.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {consignacion.setnumero_autorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {consignacion.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {consignacion.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {consignacion.setid_moneda((Long) value);consignacion.setmoneda_descripcion(consignacionBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {consignacion.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {consignacion.setid_empleado((Long) value);consignacion.setempleado_descripcion(consignacionBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {consignacion.setid_tipo_precio((Long) value);consignacion.settipoprecio_descripcion(consignacionBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {consignacion.setid_formato((Long) value);consignacion.setformato_descripcion(consignacionBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {consignacion.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {consignacion.setid_cliente((Long) value);consignacion.setcliente_descripcion(consignacionBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {consignacion.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {consignacion.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {consignacion.setid_sub_cliente((Long) value);consignacion.setsubcliente_descripcion(consignacionBeanSwingJInternalFrame.getActualSubClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {consignacion.setid_consignatario((Long) value);consignacion.setconsignatario_descripcion(consignacionBeanSwingJInternalFrame.getActualConsignatarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {consignacion.setid_vendedor((Long) value);consignacion.setvendedor_descripcion(consignacionBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {consignacion.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {consignacion.setid_estado_pedido((Long) value);consignacion.setestadopedido_descripcion(consignacionBeanSwingJInternalFrame.getActualEstadoPedidoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {consignacion.setdescuento_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {consignacion.settotal_con_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {consignacion.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {consignacion.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {consignacion.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {consignacion.settotal_descuento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {consignacion.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {consignacion.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {consignacion.setsubtotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {consignacion.setotro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {consignacion.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ConsignacionModel(JInternalFrameBase jInternalFrameBase) {
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
		private ConsignacionDetalleFormJInternalFrame consignacionJInternalFrame=null;
		
		public ConsignacionModel(ConsignacionDetalleFormJInternalFrame consignacionJInternalFrame) {
			this.consignacionJInternalFrame=consignacionJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.consignacionJInternalFrame.getjButtonActualizarToolBarConsignacion();
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.getjButtonActualizarToolBarConsignacion())) {
				componentTab=this.consignacionJInternalFrame.getjButtonEliminarToolBarConsignacion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.getjButtonEliminarToolBarConsignacion())) {
				componentTab=this.consignacionJInternalFrame.getjButtonCancelarToolBarConsignacion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.getjButtonCancelarToolBarConsignacion())) {
				componentTab=this.consignacionJInternalFrame.jComboBoxid_empresaConsignacion;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_transporteConsignacion)) {
				componentTab=this.consignacionJInternalFrame.jComboBoxTiposAccionesFormularioConsignacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxTiposAccionesFormularioConsignacion)) {
				componentTab=this.consignacionJInternalFrame.jButtonEliminarConsignacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.jButtonEliminarConsignacion)) {
				componentTab=this.consignacionJInternalFrame.jButtonActualizarConsignacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.jButtonActualizarConsignacion)) {
				componentTab=this.consignacionJInternalFrame.jButtonCancelarConsignacion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_empresaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_sucursalConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_sucursalConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_ejercicioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_ejercicioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_periodoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_periodoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_anioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_anioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_mesConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_mesConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_usuarioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_usuarioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldnumeroConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldnumeroConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldnumero_autorizacionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldnumero_autorizacionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jDateChooserfecha_emisionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jDateChooserfecha_emisionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jDateChooserfecha_vencimientoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jDateChooserfecha_vencimientoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_monedaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_monedaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldcotizacionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldcotizacionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_empleadoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_empleadoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_tipo_precioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_tipo_precioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_formatoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_formatoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextAreadireccionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextAreadireccionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_clienteConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_clienteConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtelefonoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtelefonoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldrucConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldrucConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_sub_clienteConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_sub_clienteConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_consignatarioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_consignatarioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_vendedorConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_vendedorConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextAreadescripcionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextAreadescripcionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_estado_pedidoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_estado_pedidoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFielddescuento_porcentajeConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFielddescuento_porcentajeConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtotal_con_ivaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtotal_con_ivaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldsumanConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldsumanConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFielddescuento_valorConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFielddescuento_valorConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtotal_sin_ivaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtotal_sin_ivaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtotal_descuentoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtotal_descuentoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldfleteConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldfleteConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtotalConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtotalConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldsubtotalConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldsubtotalConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldotroConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldotroConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldfinanciamientoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldfinanciamientoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldivaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldivaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldiceConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldiceConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldmonto_retencionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldmonto_retencionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_tipo_cambioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_tipo_cambioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldnumero_fueConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldnumero_fueConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_zonaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_zonaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jDateChooserfechaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jDateChooserfechaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_centro_costoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_centro_costoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jDateChooserfecha_servidorConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jDateChooserfecha_servidorConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_responsableConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_responsableConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jSpinnerhora_inicioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jSpinnerhora_inicioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jSpinnerhora_finConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jSpinnerhora_finConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_transportistaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_transportistaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_transporteConsignacion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.consignacionJInternalFrame.getjButtonActualizarToolBarConsignacion();
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.getjButtonEliminarToolBarConsignacion())) {
				componentTab=this.consignacionJInternalFrame.getjButtonActualizarToolBarConsignacion();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.getjButtonCancelarToolBarConsignacion())) {
				componentTab=this.consignacionJInternalFrame.getjButtonEliminarToolBarConsignacion();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_empresaConsignacion)) {
				
				componentTab=this.consignacionJInternalFrame.getjButtonCancelarToolBarConsignacion();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxTiposAccionesFormularioConsignacion)) {
				componentTab=this.consignacionJInternalFrame.jComboBoxid_transporteConsignacion;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.jButtonEliminarConsignacion)) {
				componentTab=this.consignacionJInternalFrame.jComboBoxTiposAccionesFormularioConsignacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.jButtonActualizarConsignacion)) {
				componentTab=this.consignacionJInternalFrame.jButtonEliminarConsignacion;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.consignacionJInternalFrame.jButtonCancelarConsignacion)) {
				componentTab=this.consignacionJInternalFrame.jButtonActualizarConsignacion;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_sucursalConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_empresaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_ejercicioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_sucursalConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_periodoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_ejercicioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_anioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_periodoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_mesConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_anioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_usuarioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_mesConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldnumeroConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_usuarioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldnumero_autorizacionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldnumeroConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jDateChooserfecha_emisionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldnumero_autorizacionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jDateChooserfecha_vencimientoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jDateChooserfecha_emisionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_monedaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jDateChooserfecha_vencimientoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldcotizacionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_monedaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_empleadoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldcotizacionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_tipo_precioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_empleadoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_formatoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_tipo_precioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextAreadireccionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_formatoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_clienteConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextAreadireccionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtelefonoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_clienteConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldrucConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtelefonoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_sub_clienteConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldrucConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_consignatarioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_sub_clienteConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_vendedorConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_consignatarioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextAreadescripcionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_vendedorConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_estado_pedidoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextAreadescripcionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFielddescuento_porcentajeConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_estado_pedidoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtotal_con_ivaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFielddescuento_porcentajeConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldsumanConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtotal_con_ivaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFielddescuento_valorConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldsumanConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtotal_sin_ivaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFielddescuento_valorConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtotal_descuentoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtotal_sin_ivaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldfleteConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtotal_descuentoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldtotalConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldfleteConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldsubtotalConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldtotalConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldotroConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldsubtotalConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldfinanciamientoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldotroConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldivaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldfinanciamientoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldiceConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldivaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldmonto_retencionConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldiceConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_tipo_cambioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldmonto_retencionConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jTextFieldnumero_fueConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_tipo_cambioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_zonaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jTextFieldnumero_fueConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jDateChooserfechaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_zonaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_centro_costoConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jDateChooserfechaConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jDateChooserfecha_servidorConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_centro_costoConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_responsableConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jDateChooserfecha_servidorConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jSpinnerhora_inicioConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_responsableConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jSpinnerhora_finConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jSpinnerhora_inicioConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_transportistaConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jSpinnerhora_finConsignacion;
			return componentTab;
		}

		if(component!=null && component.equals(this.consignacionJInternalFrame.jComboBoxid_transporteConsignacion)) {
			componentTab=this.consignacionJInternalFrame.jComboBoxid_transportistaConsignacion;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.consignacionJInternalFrame.getjButtonActualizarToolBarConsignacion();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.consignacionJInternalFrame.getjButtonActualizarToolBarConsignacion();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.consignacionJInternalFrame.getjButtonCancelarToolBarConsignacion();
			
			
			return componentTab;		
		}
		
		public ConsignacionDetalleFormJInternalFrame getconsignacionJInternalFrame() {
			return this.consignacionJInternalFrame;
		}
		
		public void setconsignacionJInternalFrame(ConsignacionDetalleFormJInternalFrame consignacionJInternalFrame) {
			this.consignacionJInternalFrame=consignacionJInternalFrame;
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
