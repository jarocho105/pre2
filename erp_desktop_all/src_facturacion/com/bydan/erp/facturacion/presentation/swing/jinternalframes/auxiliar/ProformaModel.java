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

import com.bydan.erp.facturacion.util.ProformaConstantesFunciones;
import com.bydan.erp.facturacion.util.ProformaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ProformaParameterGeneral;

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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ProformaBeanSwingJInternalFrame;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ProformaJInternalFrame;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.ProformaDetalleFormJInternalFrame;

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


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class ProformaModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,ProformaConstantesFunciones.LABEL_ID
										,ProformaConstantesFunciones.LABEL_IDEMPRESA
										,ProformaConstantesFunciones.LABEL_IDSUCURSAL
										,ProformaConstantesFunciones.LABEL_IDUSUARIO
										,ProformaConstantesFunciones.LABEL_IDEJERCICIO
										,ProformaConstantesFunciones.LABEL_IDPERIODO
										,ProformaConstantesFunciones.LABEL_IDANIO
										,ProformaConstantesFunciones.LABEL_IDMES
										,ProformaConstantesFunciones.LABEL_NUMEROPREIMPRESO
										,ProformaConstantesFunciones.LABEL_FECHAEMISION
										,ProformaConstantesFunciones.LABEL_DIAS
										,ProformaConstantesFunciones.LABEL_FECHAVENCIMIENTO
										,ProformaConstantesFunciones.LABEL_IDMONEDA
										,ProformaConstantesFunciones.LABEL_COTIZACION
										,ProformaConstantesFunciones.LABEL_IDEMPLEADO
										,ProformaConstantesFunciones.LABEL_IDFORMATO
										,ProformaConstantesFunciones.LABEL_IDESTADOPROFORMA
										,ProformaConstantesFunciones.LABEL_DIRECCION
										,ProformaConstantesFunciones.LABEL_IDCLIENTE
										,ProformaConstantesFunciones.LABEL_RUC
										,ProformaConstantesFunciones.LABEL_ESOFERTA
										,ProformaConstantesFunciones.LABEL_TELEFONO
										,ProformaConstantesFunciones.LABEL_IDTIPOPRECIO
										,ProformaConstantesFunciones.LABEL_IDVENDEDOR
										,ProformaConstantesFunciones.LABEL_IDSUBCLIENTE
										,ProformaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE
										,ProformaConstantesFunciones.LABEL_IDTRANSPORTE
										,ProformaConstantesFunciones.LABEL_IDRUTATRANSPORTE
										,ProformaConstantesFunciones.LABEL_DESCRIPCION
										,ProformaConstantesFunciones.LABEL_DESCUENTOPORCENTAJE
										,ProformaConstantesFunciones.LABEL_MONTOCONIVA
										,ProformaConstantesFunciones.LABEL_SUMAN
										,ProformaConstantesFunciones.LABEL_DESCUENTOVALOR
										,ProformaConstantesFunciones.LABEL_MONTOSINIVA
										,ProformaConstantesFunciones.LABEL_DESCUENTOGENERAL
										,ProformaConstantesFunciones.LABEL_FLETE
										,ProformaConstantesFunciones.LABEL_ULTIMOCOSTO
										,ProformaConstantesFunciones.LABEL_SUBTOTAL
										,ProformaConstantesFunciones.LABEL_OTROSCARGOS
										,ProformaConstantesFunciones.LABEL_MARGENUTILIDAD
										,ProformaConstantesFunciones.LABEL_IVA
										,ProformaConstantesFunciones.LABEL_FINANCIAMIENTO
										,ProformaConstantesFunciones.LABEL_TOTAL
										,ProformaConstantesFunciones.LABEL_OTROSVALORES
										,ProformaConstantesFunciones.LABEL_ANTICIPO
										};
	   
	    public List<Proforma> proformas;
	  	 
	    //NO SE UTILIZA
	    public ProformaModel(List<Proforma> proformas,JInternalFrameBase jInternalFrameBase) {
	    	this.proformas=proformas;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public ProformaModel(JInternalFrameBase jInternalFrameBase) {
	    	this.proformas=new ArrayList<Proforma>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.proformas.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.proformas.get(rowIndex).getIsSelected();
	            
				case 1: return this.proformas.get(rowIndex).getId();
				case 2: return this.proformas.get(rowIndex).getid_empresa();
				case 3: return this.proformas.get(rowIndex).getid_sucursal();
				case 4: return this.proformas.get(rowIndex).getid_usuario();
				case 5: return this.proformas.get(rowIndex).getid_ejercicio();
				case 6: return this.proformas.get(rowIndex).getid_periodo();
				case 7: return this.proformas.get(rowIndex).getid_anio();
				case 8: return this.proformas.get(rowIndex).getid_mes();
				case 9: return this.proformas.get(rowIndex).getnumero_pre_impreso();
				case 10: return this.proformas.get(rowIndex).getfecha_emision();
				case 11: return this.proformas.get(rowIndex).getdias();
				case 12: return this.proformas.get(rowIndex).getfecha_vencimiento();
				case 13: return this.proformas.get(rowIndex).getid_moneda();
				case 14: return this.proformas.get(rowIndex).getcotizacion();
				case 15: return this.proformas.get(rowIndex).getid_empleado();
				case 16: return this.proformas.get(rowIndex).getid_formato();
				case 17: return this.proformas.get(rowIndex).getid_estado_proforma();
				case 18: return this.proformas.get(rowIndex).getdireccion();
				case 19: return this.proformas.get(rowIndex).getid_cliente();
				case 20: return this.proformas.get(rowIndex).getruc();
				case 21: return this.proformas.get(rowIndex).getes_oferta();
				case 22: return this.proformas.get(rowIndex).gettelefono();
				case 23: return this.proformas.get(rowIndex).getid_tipo_precio();
				case 24: return this.proformas.get(rowIndex).getid_vendedor();
				case 25: return this.proformas.get(rowIndex).getid_sub_cliente();
				case 26: return this.proformas.get(rowIndex).getid_tipo_via_transporte();
				case 27: return this.proformas.get(rowIndex).getid_transporte();
				case 28: return this.proformas.get(rowIndex).getid_ruta_transporte();
				case 29: return this.proformas.get(rowIndex).getdescripcion();
				case 30: return this.proformas.get(rowIndex).getdescuento_porcentaje();
				case 31: return this.proformas.get(rowIndex).getmonto_con_iva();
				case 32: return this.proformas.get(rowIndex).getsuman();
				case 33: return this.proformas.get(rowIndex).getdescuento_valor();
				case 34: return this.proformas.get(rowIndex).getmonto_sin_iva();
				case 35: return this.proformas.get(rowIndex).getdescuento_general();
				case 36: return this.proformas.get(rowIndex).getflete();
				case 37: return this.proformas.get(rowIndex).getultimo_costo();
				case 38: return this.proformas.get(rowIndex).getsubtotal();
				case 39: return this.proformas.get(rowIndex).getotros_cargos();
				case 40: return this.proformas.get(rowIndex).getmargen_utilidad();
				case 41: return this.proformas.get(rowIndex).getiva();
				case 42: return this.proformas.get(rowIndex).getfinanciamiento();
				case 43: return this.proformas.get(rowIndex).gettotal();
				case 44: return this.proformas.get(rowIndex).getotros_valores();
				case 45: return this.proformas.get(rowIndex).getanticipo();	            
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
				case 17: return Long.class;
				case 18: return String.class;
				case 19: return Long.class;
				case 20: return String.class;
				case 21: return Boolean.class;
				case 22: return String.class;
				case 23: return Long.class;
				case 24: return Long.class;
				case 25: return Long.class;
				case 26: return Long.class;
				case 27: return Long.class;
				case 28: return Long.class;
				case 29: return String.class;
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
				case 42: return Double.class;
				case 43: return Double.class;
				case 44: return Double.class;
				case 45: return Double.class;	            
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
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	Proforma proforma = this.proformas.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=(ProformaBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {proforma.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {proforma.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {proforma.setid_empresa((Long) value);proforma.setempresa_descripcion(proformaBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {proforma.setid_sucursal((Long) value);proforma.setsucursal_descripcion(proformaBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {proforma.setid_usuario((Long) value);proforma.setusuario_descripcion(proformaBeanSwingJInternalFrame.getActualUsuarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {proforma.setid_ejercicio((Long) value);proforma.setejercicio_descripcion(proformaBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {proforma.setid_periodo((Long) value);proforma.setperiodo_descripcion(proformaBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {proforma.setid_anio((Long) value);proforma.setanio_descripcion(proformaBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {proforma.setid_mes((Long) value);proforma.setmes_descripcion(proformaBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {proforma.setnumero_pre_impreso((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {proforma.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {proforma.setdias((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {proforma.setfecha_vencimiento((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {proforma.setid_moneda((Long) value);proforma.setmoneda_descripcion(proformaBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {proforma.setcotizacion((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {proforma.setid_empleado((Long) value);proforma.setempleado_descripcion(proformaBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {proforma.setid_formato((Long) value);proforma.setformato_descripcion(proformaBeanSwingJInternalFrame.getActualFormatoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {proforma.setid_estado_proforma((Long) value);proforma.setestadoproforma_descripcion(proformaBeanSwingJInternalFrame.getActualEstadoProformaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {proforma.setdireccion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {proforma.setid_cliente((Long) value);proforma.setcliente_descripcion(proformaBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {proforma.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {proforma.setes_oferta((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {proforma.settelefono((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {proforma.setid_tipo_precio((Long) value);proforma.settipoprecio_descripcion(proformaBeanSwingJInternalFrame.getActualTipoPrecioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {proforma.setid_vendedor((Long) value);proforma.setvendedor_descripcion(proformaBeanSwingJInternalFrame.getActualVendedorForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {proforma.setid_sub_cliente((Long) value);proforma.setsubcliente_descripcion(proformaBeanSwingJInternalFrame.getActualSubClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {proforma.setid_tipo_via_transporte((Long) value);proforma.settipoviatransporte_descripcion(proformaBeanSwingJInternalFrame.getActualTipoViaTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {proforma.setid_transporte((Long) value);proforma.settransporte_descripcion(proformaBeanSwingJInternalFrame.getActualTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {proforma.setid_ruta_transporte((Long) value);proforma.setrutatransporte_descripcion(proformaBeanSwingJInternalFrame.getActualRutaTransporteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {proforma.setdescripcion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {proforma.setdescuento_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {proforma.setmonto_con_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {proforma.setsuman((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {proforma.setdescuento_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {proforma.setmonto_sin_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {proforma.setdescuento_general((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {proforma.setflete((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {proforma.setultimo_costo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {proforma.setsubtotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {proforma.setotros_cargos((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {proforma.setmargen_utilidad((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {proforma.setiva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {proforma.setfinanciamiento((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {proforma.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {proforma.setotros_valores((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {proforma.setanticipo((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public ProformaModel(JInternalFrameBase jInternalFrameBase) {
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
		private ProformaDetalleFormJInternalFrame proformaJInternalFrame=null;
		
		public ProformaModel(ProformaDetalleFormJInternalFrame proformaJInternalFrame) {
			this.proformaJInternalFrame=proformaJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.proformaJInternalFrame.getjButtonActualizarToolBarProforma();
			
			if(component!=null && component.equals(this.proformaJInternalFrame.getjButtonActualizarToolBarProforma())) {
				componentTab=this.proformaJInternalFrame.getjButtonEliminarToolBarProforma();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.proformaJInternalFrame.getjButtonEliminarToolBarProforma())) {
				componentTab=this.proformaJInternalFrame.getjButtonCancelarToolBarProforma();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.proformaJInternalFrame.getjButtonCancelarToolBarProforma())) {
				componentTab=this.proformaJInternalFrame.jComboBoxid_empresaProforma;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_tipo_cambioProforma)) {
				componentTab=this.proformaJInternalFrame.jComboBoxTiposAccionesFormularioProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxTiposAccionesFormularioProforma)) {
				componentTab=this.proformaJInternalFrame.jButtonEliminarProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.proformaJInternalFrame.jButtonEliminarProforma)) {
				componentTab=this.proformaJInternalFrame.jButtonActualizarProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.proformaJInternalFrame.jButtonActualizarProforma)) {
				componentTab=this.proformaJInternalFrame.jButtonCancelarProforma;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_empresaProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_sucursalProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_sucursalProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_usuarioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_usuarioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_ejercicioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_ejercicioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_periodoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_periodoProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_anioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_anioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_mesProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_mesProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldnumero_pre_impresoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldnumero_pre_impresoProforma)) {
			componentTab=this.proformaJInternalFrame.jDateChooserfecha_emisionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jDateChooserfecha_emisionProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFielddiasProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFielddiasProforma)) {
			componentTab=this.proformaJInternalFrame.jDateChooserfecha_vencimientoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jDateChooserfecha_vencimientoProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_monedaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_monedaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldcotizacionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldcotizacionProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_empleadoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_empleadoProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_formatoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_formatoProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_estado_proformaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_estado_proformaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextAreadireccionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextAreadireccionProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_clienteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_clienteProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldrucProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldrucProforma)) {
			componentTab=this.proformaJInternalFrame.jCheckBoxes_ofertaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jCheckBoxes_ofertaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldtelefonoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldtelefonoProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_tipo_precioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_tipo_precioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_vendedorProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_vendedorProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_sub_clienteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_sub_clienteProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_tipo_via_transporteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_tipo_via_transporteProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_transporteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_transporteProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_ruta_transporteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_ruta_transporteProforma)) {
			componentTab=this.proformaJInternalFrame.jTextAreadescripcionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextAreadescripcionProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFielddescuento_porcentajeProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFielddescuento_porcentajeProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldmonto_con_ivaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldmonto_con_ivaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldsumanProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldsumanProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFielddescuento_valorProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFielddescuento_valorProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldmonto_sin_ivaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldmonto_sin_ivaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFielddescuento_generalProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFielddescuento_generalProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldfleteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldfleteProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldultimo_costoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldultimo_costoProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldsubtotalProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldsubtotalProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldotros_cargosProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldotros_cargosProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldmargen_utilidadProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldmargen_utilidadProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldivaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldivaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldfinanciamientoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldfinanciamientoProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldtotalProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldtotalProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldotros_valoresProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldotros_valoresProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldanticipoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldanticipoProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldiceProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldiceProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldmonto_retencionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldmonto_retencionProforma)) {
			componentTab=this.proformaJInternalFrame.jDateChooserfechaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jDateChooserfechaProforma)) {
			componentTab=this.proformaJInternalFrame.jDateChooserfecha_servidorProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jDateChooserfecha_servidorProforma)) {
			componentTab=this.proformaJInternalFrame.jSpinnerhora_inicioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jSpinnerhora_inicioProforma)) {
			componentTab=this.proformaJInternalFrame.jSpinnerhora_finProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jSpinnerhora_finProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_centro_costoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_centro_costoProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_tipo_proformaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_tipo_proformaProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_consignatarioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_consignatarioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_tipo_cambioProforma;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.proformaJInternalFrame.getjButtonActualizarToolBarProforma();
			
			if(component!=null && component.equals(this.proformaJInternalFrame.getjButtonEliminarToolBarProforma())) {
				componentTab=this.proformaJInternalFrame.getjButtonActualizarToolBarProforma();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.proformaJInternalFrame.getjButtonCancelarToolBarProforma())) {
				componentTab=this.proformaJInternalFrame.getjButtonEliminarToolBarProforma();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_empresaProforma)) {
				
				componentTab=this.proformaJInternalFrame.getjButtonCancelarToolBarProforma();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxTiposAccionesFormularioProforma)) {
				componentTab=this.proformaJInternalFrame.jComboBoxid_tipo_cambioProforma;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.proformaJInternalFrame.jButtonEliminarProforma)) {
				componentTab=this.proformaJInternalFrame.jComboBoxTiposAccionesFormularioProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.proformaJInternalFrame.jButtonActualizarProforma)) {
				componentTab=this.proformaJInternalFrame.jButtonEliminarProforma;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.proformaJInternalFrame.jButtonCancelarProforma)) {
				componentTab=this.proformaJInternalFrame.jButtonActualizarProforma;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_sucursalProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_empresaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_usuarioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_sucursalProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_ejercicioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_usuarioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_periodoProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_ejercicioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_anioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_periodoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_mesProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_anioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldnumero_pre_impresoProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_mesProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jDateChooserfecha_emisionProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldnumero_pre_impresoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFielddiasProforma)) {
			componentTab=this.proformaJInternalFrame.jDateChooserfecha_emisionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jDateChooserfecha_vencimientoProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFielddiasProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_monedaProforma)) {
			componentTab=this.proformaJInternalFrame.jDateChooserfecha_vencimientoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldcotizacionProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_monedaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_empleadoProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldcotizacionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_formatoProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_empleadoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_estado_proformaProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_formatoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextAreadireccionProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_estado_proformaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_clienteProforma)) {
			componentTab=this.proformaJInternalFrame.jTextAreadireccionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldrucProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_clienteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jCheckBoxes_ofertaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldrucProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldtelefonoProforma)) {
			componentTab=this.proformaJInternalFrame.jCheckBoxes_ofertaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_tipo_precioProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldtelefonoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_vendedorProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_tipo_precioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_sub_clienteProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_vendedorProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_tipo_via_transporteProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_sub_clienteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_transporteProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_tipo_via_transporteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_ruta_transporteProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_transporteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextAreadescripcionProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_ruta_transporteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFielddescuento_porcentajeProforma)) {
			componentTab=this.proformaJInternalFrame.jTextAreadescripcionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldmonto_con_ivaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFielddescuento_porcentajeProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldsumanProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldmonto_con_ivaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFielddescuento_valorProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldsumanProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldmonto_sin_ivaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFielddescuento_valorProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFielddescuento_generalProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldmonto_sin_ivaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldfleteProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFielddescuento_generalProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldultimo_costoProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldfleteProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldsubtotalProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldultimo_costoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldotros_cargosProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldsubtotalProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldmargen_utilidadProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldotros_cargosProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldivaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldmargen_utilidadProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldfinanciamientoProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldivaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldtotalProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldfinanciamientoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldotros_valoresProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldtotalProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldanticipoProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldotros_valoresProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldiceProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldanticipoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jTextFieldmonto_retencionProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldiceProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jDateChooserfechaProforma)) {
			componentTab=this.proformaJInternalFrame.jTextFieldmonto_retencionProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jDateChooserfecha_servidorProforma)) {
			componentTab=this.proformaJInternalFrame.jDateChooserfechaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jSpinnerhora_inicioProforma)) {
			componentTab=this.proformaJInternalFrame.jDateChooserfecha_servidorProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jSpinnerhora_finProforma)) {
			componentTab=this.proformaJInternalFrame.jSpinnerhora_inicioProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_centro_costoProforma)) {
			componentTab=this.proformaJInternalFrame.jSpinnerhora_finProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_tipo_proformaProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_centro_costoProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_consignatarioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_tipo_proformaProforma;
			return componentTab;
		}

		if(component!=null && component.equals(this.proformaJInternalFrame.jComboBoxid_tipo_cambioProforma)) {
			componentTab=this.proformaJInternalFrame.jComboBoxid_consignatarioProforma;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.proformaJInternalFrame.getjButtonActualizarToolBarProforma();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.proformaJInternalFrame.getjButtonActualizarToolBarProforma();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.proformaJInternalFrame.getjButtonCancelarToolBarProforma();
			
			
			return componentTab;		
		}
		
		public ProformaDetalleFormJInternalFrame getproformaJInternalFrame() {
			return this.proformaJInternalFrame;
		}
		
		public void setproformaJInternalFrame(ProformaDetalleFormJInternalFrame proformaJInternalFrame) {
			this.proformaJInternalFrame=proformaJInternalFrame;
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
