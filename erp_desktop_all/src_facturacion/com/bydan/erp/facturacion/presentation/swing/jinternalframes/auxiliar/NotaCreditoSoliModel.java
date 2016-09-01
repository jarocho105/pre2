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

import com.bydan.erp.facturacion.util.NotaCreditoSoliConstantesFunciones;
import com.bydan.erp.facturacion.util.NotaCreditoSoliParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.NotaCreditoSoliParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.NotaCreditoSoliBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.NotaCreditoSoliJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.NotaCreditoSoliDetalleFormJInternalFrame;

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

public class NotaCreditoSoliModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,NotaCreditoSoliConstantesFunciones.LABEL_ID
										,NotaCreditoSoliConstantesFunciones.LABEL_IDEMPRESA
										,NotaCreditoSoliConstantesFunciones.LABEL_IDSUCURSAL
										,NotaCreditoSoliConstantesFunciones.LABEL_IDEJERCICIO
										,NotaCreditoSoliConstantesFunciones.LABEL_IDPERIODO
										,NotaCreditoSoliConstantesFunciones.LABEL_IDANIO
										,NotaCreditoSoliConstantesFunciones.LABEL_IDMES
										,NotaCreditoSoliConstantesFunciones.LABEL_IDUSUARIO
										,NotaCreditoSoliConstantesFunciones.LABEL_CODIGO
										,NotaCreditoSoliConstantesFunciones.LABEL_NUMEROPREIMPRESO
										,NotaCreditoSoliConstantesFunciones.LABEL_FECHAEMISION
										,NotaCreditoSoliConstantesFunciones.LABEL_NUMERODIAS
										,NotaCreditoSoliConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,NotaCreditoSoliConstantesFunciones.LABEL_IDMONEDA
										,NotaCreditoSoliConstantesFunciones.LABEL_IDEMPLEADO
										,NotaCreditoSoliConstantesFunciones.LABEL_COTIZACION
										,NotaCreditoSoliConstantesFunciones.LABEL_IDFORMATO
										,NotaCreditoSoliConstantesFunciones.LABEL_IDTIPOPRECIO
										,NotaCreditoSoliConstantesFunciones.LABEL_IDCLIENTE
										,NotaCreditoSoliConstantesFunciones.LABEL_IDFACTURA
										,NotaCreditoSoliConstantesFunciones.LABEL_DIRECCION
										,NotaCreditoSoliConstantesFunciones.LABEL_TELEFONO
										,NotaCreditoSoliConstantesFunciones.LABEL_RUC
										,NotaCreditoSoliConstantesFunciones.LABEL_IDTIPONOTACREDITOSOLI
										,NotaCreditoSoliConstantesFunciones.LABEL_IDRESPONSABLE
										,NotaCreditoSoliConstantesFunciones.LABEL_IDESTADONOTACREDITOSOLI
										,NotaCreditoSoliConstantesFunciones.LABEL_DESCRIPCION
										,NotaCreditoSoliConstantesFunciones.LABEL_PENALIZADO
										,NotaCreditoSoliConstantesFunciones.LABEL_DESCUENTOPORCENTAJE
										,NotaCreditoSoliConstantesFunciones.LABEL_TOTALIVA
										,NotaCreditoSoliConstantesFunciones.LABEL_SUMAN
										,NotaCreditoSoliConstantesFunciones.LABEL_DESCUENTOVALOR
										,NotaCreditoSoliConstantesFunciones.LABEL_TOTALSINIVA
										,NotaCreditoSoliConstantesFunciones.LABEL_DESCUENTOGENERAL
										,NotaCreditoSoliConstantesFunciones.LABEL_FLETE
										,NotaCreditoSoliConstantesFunciones.LABEL_TOTAL
										,NotaCreditoSoliConstantesFunciones.LABEL_SUBTOTAL
										,NotaCreditoSoliConstantesFunciones.LABEL_OTRO
										,NotaCreditoSoliConstantesFunciones.LABEL_IVA
										,NotaCreditoSoliConstantesFunciones.LABEL_FINANCIAMIENTO
										,NotaCreditoSoliConstantesFunciones.LABEL_OTROVALOR
										};
	   
	    public List<NotaCreditoSoli> notacreditosolis;
	  	 
	    //NO SE UTILIZA
	    public NotaCreditoSoliModel(List<NotaCreditoSoli> notacreditosolis,JInternalFrameBase jInternalFrameBase) {
	    	this.notacreditosolis=notacreditosolis;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public NotaCreditoSoliModel(JInternalFrameBase jInternalFrameBase) {
	    	this.notacreditosolis=new ArrayList<NotaCreditoSoli>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.notacreditosolis.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.notacreditosolis.get(rowIndex).getIsSelected();
	            
				case 1: return this.notacreditosolis.get(rowIndex).getId();
				case 2: return this.notacreditosolis.get(rowIndex).getid_empresa();
				case 3: return this.notacreditosolis.get(rowIndex).getid_sucursal();
				case 4: return this.notacreditosolis.get(rowIndex).getid_ejercicio();
				case 5: return this.notacreditosolis.get(rowIndex).getid_periodo();
				case 6: return this.notacreditosolis.get(rowIndex).getid_anio();
				case 7: return this.notacreditosolis.get(rowIndex).getid_mes();
				case 8: return this.notacreditosolis.get(rowIndex).getid_usuario();
				case 9: return this.notacreditosolis.get(rowIndex).getcodigo();
				case 10: return this.notacreditosolis.get(rowIndex).getnumero();
				case 11: return this.notacreditosolis.get(rowIndex).getfecha_emision();
				case 12: return this.notacreditosolis.get(rowIndex).getnumero_dias();
				case 13: return this.notacreditosolis.get(rowIndex).getfecha_vencimiento();
				case 14: return this.notacreditosolis.get(rowIndex).getid_moneda();
				case 15: return this.notacreditosolis.get(rowIndex).getid_empleado();
				case 16: return this.notacreditosolis.get(rowIndex).getcotizacion();
				case 17: return this.notacreditosolis.get(rowIndex).getid_formato();
				case 18: return this.notacreditosolis.get(rowIndex).getid_tipo_precio();
				case 19: return this.notacreditosolis.get(rowIndex).getid_cliente();
				case 20: return this.notacreditosolis.get(rowIndex).getid_factura();
				case 21: return this.notacreditosolis.get(rowIndex).getdireccion();
				case 22: return this.notacreditosolis.get(rowIndex).gettelefono();
				case 23: return this.notacreditosolis.get(rowIndex).getruc();
				case 24: return this.notacreditosolis.get(rowIndex).getid_tipo_nota_credito_soli();
				case 25: return this.notacreditosolis.get(rowIndex).getid_responsable();
				case 26: return this.notacreditosolis.get(rowIndex).getid_estado_nota_credito();
				case 27: return this.notacreditosolis.get(rowIndex).getdescripcion();
				case 28: return this.notacreditosolis.get(rowIndex).getpenalizado();
				case 29: return this.notacreditosolis.get(rowIndex).getdescuento_porcentaje();
				case 30: return this.notacreditosolis.get(rowIndex).gettotal_iva();
				case 31: return this.notacreditosolis.get(rowIndex).getsuman();
				case 32: return this.notacreditosolis.get(rowIndex).getdescuento_valor();
				case 33: return this.notacreditosolis.get(rowIndex).gettotal_sin_iva();
				case 34: return this.notacreditosolis.get(rowIndex).getdescuento_general();
				case 35: return this.notacreditosolis.get(rowIndex).getflete();
				case 36: return this.notacreditosolis.get(rowIndex).gettotal();
				case 37: return this.notacreditosolis.get(rowIndex).getsub_total();
				case 38: return this.notacreditosolis.get(rowIndex).getotro();
				case 39: return this.notacreditosolis.get(rowIndex).getiva();
				case 40: return this.notacreditosolis.get(rowIndex).getfinanciamiento();
				case 41: return this.notacreditosolis.get(rowIndex).getotro_valor();	            
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
				case 15: return Long.class;
				case 16: return Double.class;
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
				case 28: return Boolean.class;
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
	    	NotaCreditoSoli notacreditosoli = this.notacreditosolis.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=(NotaCreditoSoliBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {notacreditosoli.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {notacreditosoli.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {notacreditosoli.setid_empresa((Long) value);notacreditosoli.setempresa_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {notacreditosoli.setid_sucursal((Long) value);notacreditosoli.setsucursal_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {notacreditosoli.setid_ejercicio((Long) value);notacreditosoli.setejercicio_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {notacreditosoli.setid_periodo((Long) value);notacreditosoli.setperiodo_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {notacreditosoli.setid_anio((Long) value);notacreditosoli.setanio_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {notacreditosoli.setid_mes((Long) value);notacreditosoli.setmes_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {notacreditosoli.setid_usuario((Long) value);notacreditosoli.setusuario_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {notacreditosoli.setcodigo((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {notacreditosoli.setnumero((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {notacreditosoli.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {notacreditosoli.setnumero_dias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {notacreditosoli.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {notacreditosoli.setid_moneda((Long) value);notacreditosoli.setmoneda_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {notacreditosoli.setid_empleado((Long) value);notacreditosoli.setempleado_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {notacreditosoli.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {notacreditosoli.setid_formato((Long) value);notacreditosoli.setformato_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {notacreditosoli.setid_tipo_precio((Long) value);notacreditosoli.settipoprecio_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {notacreditosoli.setid_cliente((Long) value);notacreditosoli.setcliente_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {notacreditosoli.setid_factura((Long) value);notacreditosoli.setfactura_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {notacreditosoli.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {notacreditosoli.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {notacreditosoli.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {notacreditosoli.setid_tipo_nota_credito_soli((Long) value);notacreditosoli.settiponotacreditosoli_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualTipoNotaCreditoSoliForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {notacreditosoli.setid_responsable((Long) value);notacreditosoli.setresponsable_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualResponsableForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {notacreditosoli.setid_estado_nota_credito((Long) value);notacreditosoli.setestadonotacreditosoli_descripcion(notacreditosoliBeanSwingJInternalFrame.getActualEstadoNotaCreditoSoliForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {notacreditosoli.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {notacreditosoli.setpenalizado((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {notacreditosoli.setdescuento_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {notacreditosoli.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {notacreditosoli.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {notacreditosoli.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {notacreditosoli.settotal_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {notacreditosoli.setdescuento_general((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {notacreditosoli.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {notacreditosoli.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {notacreditosoli.setsub_total((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {notacreditosoli.setotro((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {notacreditosoli.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {notacreditosoli.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {notacreditosoli.setotro_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public NotaCreditoSoliModel(JInternalFrameBase jInternalFrameBase) {
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
		private NotaCreditoSoliDetalleFormJInternalFrame notacreditosoliJInternalFrame=null;
		
		public NotaCreditoSoliModel(NotaCreditoSoliDetalleFormJInternalFrame notacreditosoliJInternalFrame) {
			this.notacreditosoliJInternalFrame=notacreditosoliJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.notacreditosoliJInternalFrame.getjButtonActualizarToolBarNotaCreditoSoli();
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.getjButtonActualizarToolBarNotaCreditoSoli())) {
				componentTab=this.notacreditosoliJInternalFrame.getjButtonEliminarToolBarNotaCreditoSoli();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.getjButtonEliminarToolBarNotaCreditoSoli())) {
				componentTab=this.notacreditosoliJInternalFrame.getjButtonCancelarToolBarNotaCreditoSoli();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.getjButtonCancelarToolBarNotaCreditoSoli())) {
				componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_empresaNotaCreditoSoli;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfecha_autorizacionNotaCreditoSoli)) {
				componentTab=this.notacreditosoliJInternalFrame.jComboBoxTiposAccionesFormularioNotaCreditoSoli;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxTiposAccionesFormularioNotaCreditoSoli)) {
				componentTab=this.notacreditosoliJInternalFrame.jButtonEliminarNotaCreditoSoli;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jButtonEliminarNotaCreditoSoli)) {
				componentTab=this.notacreditosoliJInternalFrame.jButtonActualizarNotaCreditoSoli;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jButtonActualizarNotaCreditoSoli)) {
				componentTab=this.notacreditosoliJInternalFrame.jButtonCancelarNotaCreditoSoli;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_empresaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_sucursalNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_sucursalNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_ejercicioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_ejercicioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_periodoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_periodoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_anioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_anioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_mesNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_mesNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_usuarioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_usuarioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldcodigoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldcodigoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldnumeroNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldnumeroNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jDateChooserfecha_emisionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfecha_emisionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldnumero_diasNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldnumero_diasNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jDateChooserfecha_vencimientoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfecha_vencimientoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_monedaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_monedaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_empleadoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_empleadoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldcotizacionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldcotizacionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_formatoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_formatoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_tipo_precioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_tipo_precioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_clienteNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_clienteNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_facturaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_facturaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextAreadireccionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextAreadireccionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldtelefonoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldtelefonoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldrucNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldrucNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_responsableNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_responsableNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_estado_nota_creditoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_estado_nota_creditoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextAreadescripcionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextAreadescripcionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jCheckBoxpenalizadoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jCheckBoxpenalizadoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFielddescuento_porcentajeNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFielddescuento_porcentajeNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldtotal_ivaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldtotal_ivaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldsumanNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldsumanNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFielddescuento_valorNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFielddescuento_valorNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldtotal_sin_ivaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldtotal_sin_ivaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFielddescuento_generalNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFielddescuento_generalNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldfleteNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldfleteNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldtotalNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldtotalNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldsub_totalNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldsub_totalNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldotroNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldotroNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldivaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldivaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldfinanciamientoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldfinanciamientoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldotro_valorNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldotro_valorNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldretencionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldretencionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldiceNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldiceNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jDateChooserfechaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfechaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_centro_costoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_centro_costoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_vendedorNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_vendedorNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_tipo_cambioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_tipo_cambioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_transporteNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_transporteNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_transportistaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_transportistaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jDateChooserfecha_clienteNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfecha_clienteNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jDateChooserfecha_autorizacionNotaCreditoSoli;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.notacreditosoliJInternalFrame.getjButtonActualizarToolBarNotaCreditoSoli();
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.getjButtonEliminarToolBarNotaCreditoSoli())) {
				componentTab=this.notacreditosoliJInternalFrame.getjButtonActualizarToolBarNotaCreditoSoli();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.getjButtonCancelarToolBarNotaCreditoSoli())) {
				componentTab=this.notacreditosoliJInternalFrame.getjButtonEliminarToolBarNotaCreditoSoli();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_empresaNotaCreditoSoli)) {
				
				componentTab=this.notacreditosoliJInternalFrame.getjButtonCancelarToolBarNotaCreditoSoli();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxTiposAccionesFormularioNotaCreditoSoli)) {
				componentTab=this.notacreditosoliJInternalFrame.jDateChooserfecha_autorizacionNotaCreditoSoli;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jButtonEliminarNotaCreditoSoli)) {
				componentTab=this.notacreditosoliJInternalFrame.jComboBoxTiposAccionesFormularioNotaCreditoSoli;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jButtonActualizarNotaCreditoSoli)) {
				componentTab=this.notacreditosoliJInternalFrame.jButtonEliminarNotaCreditoSoli;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jButtonCancelarNotaCreditoSoli)) {
				componentTab=this.notacreditosoliJInternalFrame.jButtonActualizarNotaCreditoSoli;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_sucursalNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_empresaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_ejercicioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_sucursalNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_periodoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_ejercicioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_anioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_periodoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_mesNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_anioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_usuarioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_mesNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldcodigoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_usuarioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldnumeroNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldcodigoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfecha_emisionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldnumeroNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldnumero_diasNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jDateChooserfecha_emisionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfecha_vencimientoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldnumero_diasNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_monedaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jDateChooserfecha_vencimientoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_empleadoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_monedaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldcotizacionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_empleadoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_formatoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldcotizacionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_tipo_precioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_formatoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_clienteNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_tipo_precioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_facturaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_clienteNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextAreadireccionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_facturaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldtelefonoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextAreadireccionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldrucNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldtelefonoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldrucNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_responsableNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_estado_nota_creditoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_responsableNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextAreadescripcionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_estado_nota_creditoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jCheckBoxpenalizadoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextAreadescripcionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFielddescuento_porcentajeNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jCheckBoxpenalizadoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldtotal_ivaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFielddescuento_porcentajeNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldsumanNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldtotal_ivaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFielddescuento_valorNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldsumanNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldtotal_sin_ivaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFielddescuento_valorNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFielddescuento_generalNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldtotal_sin_ivaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldfleteNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFielddescuento_generalNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldtotalNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldfleteNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldsub_totalNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldtotalNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldotroNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldsub_totalNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldivaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldotroNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldfinanciamientoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldivaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldotro_valorNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldfinanciamientoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldretencionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldotro_valorNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jTextFieldiceNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldretencionNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfechaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jTextFieldiceNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_centro_costoNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jDateChooserfechaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_vendedorNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_centro_costoNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_tipo_cambioNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_vendedorNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_transporteNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_tipo_cambioNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jComboBoxid_transportistaNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_transporteNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfecha_clienteNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jComboBoxid_transportistaNotaCreditoSoli;
			return componentTab;
		}

		if(component!=null && component.equals(this.notacreditosoliJInternalFrame.jDateChooserfecha_autorizacionNotaCreditoSoli)) {
			componentTab=this.notacreditosoliJInternalFrame.jDateChooserfecha_clienteNotaCreditoSoli;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.notacreditosoliJInternalFrame.getjButtonActualizarToolBarNotaCreditoSoli();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.notacreditosoliJInternalFrame.getjButtonActualizarToolBarNotaCreditoSoli();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.notacreditosoliJInternalFrame.getjButtonCancelarToolBarNotaCreditoSoli();
			
			
			return componentTab;		
		}
		
		public NotaCreditoSoliDetalleFormJInternalFrame getnotacreditosoliJInternalFrame() {
			return this.notacreditosoliJInternalFrame;
		}
		
		public void setnotacreditosoliJInternalFrame(NotaCreditoSoliDetalleFormJInternalFrame notacreditosoliJInternalFrame) {
			this.notacreditosoliJInternalFrame=notacreditosoliJInternalFrame;
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
