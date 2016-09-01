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

import com.bydan.erp.contabilidad.util.FacturaProveedorConstantesFunciones;
import com.bydan.erp.contabilidad.util.FacturaProveedorParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.FacturaProveedorParameterGeneral;

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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.FacturaProveedorBeanSwingJInternalFrame;
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
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.FacturaProveedorJInternalFrame;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.FacturaProveedorDetalleFormJInternalFrame;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")

public class FacturaProveedorModel extends FocusTraversalPolicy implements TableModel, Serializable,PropertyChangeListener  {	
		private static final long serialVersionUID = 1L;
		
		public JInternalFrameBase jInternalFrameBase;
		
	    private String[] columnNames = {
										Constantes2.S_SELECCIONAR
										,FacturaProveedorConstantesFunciones.LABEL_ID
										,FacturaProveedorConstantesFunciones.LABEL_IDEMPRESA
										,FacturaProveedorConstantesFunciones.LABEL_IDSUCURSAL
										,FacturaProveedorConstantesFunciones.LABEL_IDEJERCICIO
										,FacturaProveedorConstantesFunciones.LABEL_IDPERIODO
										,FacturaProveedorConstantesFunciones.LABEL_IDANIO
										,FacturaProveedorConstantesFunciones.LABEL_IDMES
										,FacturaProveedorConstantesFunciones.LABEL_IDMODULO
										,FacturaProveedorConstantesFunciones.LABEL_IDPLANTILLAFACTURA
										,FacturaProveedorConstantesFunciones.LABEL_IDTIPODOCUMENTO
										,FacturaProveedorConstantesFunciones.LABEL_PLAZO
										,FacturaProveedorConstantesFunciones.LABEL_IDFACTURA
										,FacturaProveedorConstantesFunciones.LABEL_NUMEROFACTURA
										,FacturaProveedorConstantesFunciones.LABEL_IDTRANSACCION
										,FacturaProveedorConstantesFunciones.LABEL_FECHAEMISION
										,FacturaProveedorConstantesFunciones.LABEL_IDCLIENTE
										,FacturaProveedorConstantesFunciones.LABEL_RUC
										,FacturaProveedorConstantesFunciones.LABEL_IDEMPLEADOSOLICITA
										,FacturaProveedorConstantesFunciones.LABEL_FECHAVENCE
										,FacturaProveedorConstantesFunciones.LABEL_IDMONEDA
										,FacturaProveedorConstantesFunciones.LABEL_IDEMPLEADO
										,FacturaProveedorConstantesFunciones.LABEL_CONACTIVOS
										,FacturaProveedorConstantesFunciones.LABEL_CONRISE
										,FacturaProveedorConstantesFunciones.LABEL_CONSITIOS
										,FacturaProveedorConstantesFunciones.LABEL_DETALLE
										,FacturaProveedorConstantesFunciones.LABEL_VALORBIENES12
										,FacturaProveedorConstantesFunciones.LABEL_VALORSERVICIOS12
										,FacturaProveedorConstantesFunciones.LABEL_TOTALVALOR12
										,FacturaProveedorConstantesFunciones.LABEL_VALORBIENES0
										,FacturaProveedorConstantesFunciones.LABEL_VALORSERVICIOS0
										,FacturaProveedorConstantesFunciones.LABEL_TOTALVALOR0
										,FacturaProveedorConstantesFunciones.LABEL_BIENESICE
										,FacturaProveedorConstantesFunciones.LABEL_SERVICIOSICE
										,FacturaProveedorConstantesFunciones.LABEL_TOTALICE
										,FacturaProveedorConstantesFunciones.LABEL_BIENESIVA
										,FacturaProveedorConstantesFunciones.LABEL_SERVICIOSIVA
										,FacturaProveedorConstantesFunciones.LABEL_TOTALIVA
										,FacturaProveedorConstantesFunciones.LABEL_IVAPORCENTAJE
										,FacturaProveedorConstantesFunciones.LABEL_TOTAL
										,FacturaProveedorConstantesFunciones.LABEL_CONMONTOOBJETOIVA
										,FacturaProveedorConstantesFunciones.LABEL_NUMERORETENCION
										,FacturaProveedorConstantesFunciones.LABEL_NUMEROSERIE
										,FacturaProveedorConstantesFunciones.LABEL_NUMEROAUTORIZACION
										,FacturaProveedorConstantesFunciones.LABEL_FECHAVALIDEZ
										,FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONFUENTE1
										,FacturaProveedorConstantesFunciones.LABEL_RETFUENTE1PORCENTAJE
										,FacturaProveedorConstantesFunciones.LABEL_RETFUENTE1BASE
										,FacturaProveedorConstantesFunciones.LABEL_RETFUENTE1RETENIDO
										,FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONFUENTE2
										,FacturaProveedorConstantesFunciones.LABEL_RETFUENTE2PORCENTAJE
										,FacturaProveedorConstantesFunciones.LABEL_RETFUENTE2BASE
										,FacturaProveedorConstantesFunciones.LABEL_RETFUENTE2RETENIDO
										,FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONIVA1
										,FacturaProveedorConstantesFunciones.LABEL_RETIVABIENPORCENTAJE
										,FacturaProveedorConstantesFunciones.LABEL_RETIVABIENBASE
										,FacturaProveedorConstantesFunciones.LABEL_RETIVABIENRETENIDO
										,FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONIVA2
										,FacturaProveedorConstantesFunciones.LABEL_RETIVASERVICIOPORCENTAJE
										,FacturaProveedorConstantesFunciones.LABEL_RETIVASERVICIOBASE
										,FacturaProveedorConstantesFunciones.LABEL_RETIVASERVICIORETENIDO
										,FacturaProveedorConstantesFunciones.LABEL_ANEXONUMEROAUTORIZACION
										,FacturaProveedorConstantesFunciones.LABEL_ANEXONUMESOSERIE
										,FacturaProveedorConstantesFunciones.LABEL_ANEXOFECHAVALIDEZ
										,FacturaProveedorConstantesFunciones.LABEL_IDTIPOTRIBUTARIO
										,FacturaProveedorConstantesFunciones.LABEL_ANEXOFACTURAINICIO
										,FacturaProveedorConstantesFunciones.LABEL_ANEXOFACTURAFIN
										,FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCALBIENES
										,FacturaProveedorConstantesFunciones.LABEL_IDRESPONSABLEFONDO
										,FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCALSERVICIOS
										,FacturaProveedorConstantesFunciones.LABEL_SECUENCIAL
										,FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO
										,FacturaProveedorConstantesFunciones.LABEL_GASTOVALOR
										,FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO2
										,FacturaProveedorConstantesFunciones.LABEL_GASTOVALOR2
										};
	   
	    public List<FacturaProveedor> facturaproveedors;
	  	 
	    //NO SE UTILIZA
	    public FacturaProveedorModel(List<FacturaProveedor> facturaproveedors,JInternalFrameBase jInternalFrameBase) {
	    	this.facturaproveedors=facturaproveedors;
			this.jInternalFrameBase=jInternalFrameBase;
	    }
	    
	    public FacturaProveedorModel(JInternalFrameBase jInternalFrameBase) {
	    	this.facturaproveedors=new ArrayList<FacturaProveedor>();
			this.jInternalFrameBase=jInternalFrameBase;
	    }	    	    
	    
	    @Override
	    public String getColumnName(int columnIndex) {
	    	return columnNames[columnIndex];	    	
	    }
	 
	    @Override
	    public int getRowCount() {
	        return this.facturaproveedors.size();
	    }
	 
	    @Override
	    public int getColumnCount() {	    	
	        return this.columnNames.length;
	    }
	 
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) {
	        switch (columnIndex) {
				case 0: return this.facturaproveedors.get(rowIndex).getIsSelected();
	            
				case 1: return this.facturaproveedors.get(rowIndex).getId();
				case 2: return this.facturaproveedors.get(rowIndex).getid_empresa();
				case 3: return this.facturaproveedors.get(rowIndex).getid_sucursal();
				case 4: return this.facturaproveedors.get(rowIndex).getid_ejercicio();
				case 5: return this.facturaproveedors.get(rowIndex).getid_periodo();
				case 6: return this.facturaproveedors.get(rowIndex).getid_anio();
				case 7: return this.facturaproveedors.get(rowIndex).getid_mes();
				case 8: return this.facturaproveedors.get(rowIndex).getid_modulo();
				case 9: return this.facturaproveedors.get(rowIndex).getid_plantilla_factura();
				case 10: return this.facturaproveedors.get(rowIndex).getid_tipo_documento();
				case 11: return this.facturaproveedors.get(rowIndex).getplazo();
				case 12: return this.facturaproveedors.get(rowIndex).getid_factura();
				case 13: return this.facturaproveedors.get(rowIndex).getnumero_factura();
				case 14: return this.facturaproveedors.get(rowIndex).getid_transaccion();
				case 15: return this.facturaproveedors.get(rowIndex).getfecha_emision();
				case 16: return this.facturaproveedors.get(rowIndex).getid_cliente();
				case 17: return this.facturaproveedors.get(rowIndex).getruc();
				case 18: return this.facturaproveedors.get(rowIndex).getid_empleado_solicita();
				case 19: return this.facturaproveedors.get(rowIndex).getfecha_vence();
				case 20: return this.facturaproveedors.get(rowIndex).getid_moneda();
				case 21: return this.facturaproveedors.get(rowIndex).getid_empleado();
				case 22: return this.facturaproveedors.get(rowIndex).getcon_activos();
				case 23: return this.facturaproveedors.get(rowIndex).getcon_rise();
				case 24: return this.facturaproveedors.get(rowIndex).getcon_sitios();
				case 25: return this.facturaproveedors.get(rowIndex).getdetalle();
				case 26: return this.facturaproveedors.get(rowIndex).getvalor_bienes12();
				case 27: return this.facturaproveedors.get(rowIndex).getvalor_servicios12();
				case 28: return this.facturaproveedors.get(rowIndex).gettotal_valor12();
				case 29: return this.facturaproveedors.get(rowIndex).getvalor_bienes0();
				case 30: return this.facturaproveedors.get(rowIndex).getvalor_servicios0();
				case 31: return this.facturaproveedors.get(rowIndex).gettotal_valor0();
				case 32: return this.facturaproveedors.get(rowIndex).getbienes_ice();
				case 33: return this.facturaproveedors.get(rowIndex).getservicios_ice();
				case 34: return this.facturaproveedors.get(rowIndex).gettotal_ice();
				case 35: return this.facturaproveedors.get(rowIndex).getbienes_iva();
				case 36: return this.facturaproveedors.get(rowIndex).getservicios_iva();
				case 37: return this.facturaproveedors.get(rowIndex).gettotal_iva();
				case 38: return this.facturaproveedors.get(rowIndex).getiva_porcentaje();
				case 39: return this.facturaproveedors.get(rowIndex).gettotal();
				case 40: return this.facturaproveedors.get(rowIndex).getcon_monto_objeto_iva();
				case 41: return this.facturaproveedors.get(rowIndex).getnumero_retencion();
				case 42: return this.facturaproveedors.get(rowIndex).getnumero_serie();
				case 43: return this.facturaproveedors.get(rowIndex).getnumero_autorizacion();
				case 44: return this.facturaproveedors.get(rowIndex).getfecha_validez();
				case 45: return this.facturaproveedors.get(rowIndex).getid_tipo_retencion_fuente1();
				case 46: return this.facturaproveedors.get(rowIndex).getret_fuente1_porcentaje();
				case 47: return this.facturaproveedors.get(rowIndex).getret_fuente1_base();
				case 48: return this.facturaproveedors.get(rowIndex).getret_fuente1_retenido();
				case 49: return this.facturaproveedors.get(rowIndex).getid_tipo_retencion_fuente2();
				case 50: return this.facturaproveedors.get(rowIndex).getret_fuente2_porcentaje();
				case 51: return this.facturaproveedors.get(rowIndex).getret_fuente2_base();
				case 52: return this.facturaproveedors.get(rowIndex).getret_fuente2_retenido();
				case 53: return this.facturaproveedors.get(rowIndex).getid_tipo_retencion_iva1();
				case 54: return this.facturaproveedors.get(rowIndex).getret_iva_bien_porcentaje();
				case 55: return this.facturaproveedors.get(rowIndex).getret_iva_bien_base();
				case 56: return this.facturaproveedors.get(rowIndex).getret_iva_bien_retenido();
				case 57: return this.facturaproveedors.get(rowIndex).getid_tipo_retencion_iva2();
				case 58: return this.facturaproveedors.get(rowIndex).getret_iva_servicio_porcentaje();
				case 59: return this.facturaproveedors.get(rowIndex).getret_iva_servicio_base();
				case 60: return this.facturaproveedors.get(rowIndex).getret_iva_servicio_retenido();
				case 61: return this.facturaproveedors.get(rowIndex).getanexo_numero_autorizacion();
				case 62: return this.facturaproveedors.get(rowIndex).getanexo_numeso_serie();
				case 63: return this.facturaproveedors.get(rowIndex).getanexo_fecha_validez();
				case 64: return this.facturaproveedors.get(rowIndex).getid_tipo_tributario();
				case 65: return this.facturaproveedors.get(rowIndex).getanexo_factura_inicio();
				case 66: return this.facturaproveedors.get(rowIndex).getanexo_factura_fin();
				case 67: return this.facturaproveedors.get(rowIndex).getid_cuenta_contable_credito_fiscal_bienes();
				case 68: return this.facturaproveedors.get(rowIndex).getid_responsable_fondo();
				case 69: return this.facturaproveedors.get(rowIndex).getid_cuenta_contable_credito_fiscal_servicios();
				case 70: return this.facturaproveedors.get(rowIndex).getsecuencial();
				case 71: return this.facturaproveedors.get(rowIndex).getid_cuenta_contable_gasto();
				case 72: return this.facturaproveedors.get(rowIndex).getgasto_valor();
				case 73: return this.facturaproveedors.get(rowIndex).getid_cuenta_contable_gasto2();
				case 74: return this.facturaproveedors.get(rowIndex).getgasto_valor2();	            
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
				case 10: return Long.class;
				case 11: return Integer.class;
				case 12: return Long.class;
				case 13: return String.class;
				case 14: return Long.class;
				case 15: return Date.class;
				case 16: return Long.class;
				case 17: return String.class;
				case 18: return Long.class;
				case 19: return Date.class;
				case 20: return Long.class;
				case 21: return Long.class;
				case 22: return Boolean.class;
				case 23: return Boolean.class;
				case 24: return Boolean.class;
				case 25: return String.class;
				case 26: return Double.class;
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
				case 38: return Double.class;
				case 39: return Double.class;
				case 40: return Boolean.class;
				case 41: return String.class;
				case 42: return String.class;
				case 43: return String.class;
				case 44: return Date.class;
				case 45: return Long.class;
				case 46: return Double.class;
				case 47: return Double.class;
				case 48: return Double.class;
				case 49: return Long.class;
				case 50: return Double.class;
				case 51: return Double.class;
				case 52: return Double.class;
				case 53: return Long.class;
				case 54: return Double.class;
				case 55: return Double.class;
				case 56: return Double.class;
				case 57: return Long.class;
				case 58: return Double.class;
				case 59: return Double.class;
				case 60: return Double.class;
				case 61: return String.class;
				case 62: return String.class;
				case 63: return Date.class;
				case 64: return Long.class;
				case 65: return String.class;
				case 66: return String.class;
				case 67: return Long.class;
				case 68: return Long.class;
				case 69: return Long.class;
				case 70: return String.class;
				case 71: return Long.class;
				case 72: return Double.class;
				case 73: return Long.class;
				case 74: return Double.class;	            
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
				case 60: return true;
				case 61: return true;
				case 62: return true;
				case 63: return true;
				case 64: return true;
				case 65: return true;
				case 66: return true;
				case 67: return true;
				case 68: return true;
				case 69: return true;
				case 70: return true;
				case 71: return true;
				case 72: return true;
				case 73: return true;
				case 74: return true;	            
	            default: return true;
	        }	
	    }
	 
	    @Override
	    public void setValueAt(Object value, int rowIndex, int columnIndex) {
	    	FacturaProveedor facturaproveedor = this.facturaproveedors.get(rowIndex);
	    	Boolean esCampoValor=false;
			String sTipo="";
			
			FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame=(FacturaProveedorBeanSwingJInternalFrame)this.jInternalFrameBase; 
			
	        switch (columnIndex) {
				case 0: try {facturaproveedor.setIsSelected((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
	            
				case 1: try {facturaproveedor.setId((Long) value);} catch (Exception e) {e.printStackTrace();} break;
				case 2: try {facturaproveedor.setid_empresa((Long) value);facturaproveedor.setempresa_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualEmpresaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 3: try {facturaproveedor.setid_sucursal((Long) value);facturaproveedor.setsucursal_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualSucursalForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 4: try {facturaproveedor.setid_ejercicio((Long) value);facturaproveedor.setejercicio_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualEjercicioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 5: try {facturaproveedor.setid_periodo((Long) value);facturaproveedor.setperiodo_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualPeriodoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 6: try {facturaproveedor.setid_anio((Long) value);facturaproveedor.setanio_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualAnioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 7: try {facturaproveedor.setid_mes((Long) value);facturaproveedor.setmes_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualMesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 8: try {facturaproveedor.setid_modulo((Long) value);facturaproveedor.setmodulo_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualModuloForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 9: try {facturaproveedor.setid_plantilla_factura((Long) value);facturaproveedor.setplantillafactura_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualPlantillaFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 10: try {facturaproveedor.setid_tipo_documento((Long) value);facturaproveedor.settipodocumento_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualTipoDocumentoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 11: try {facturaproveedor.setplazo((Integer) value);} catch (Exception e) {e.printStackTrace();} break;
				case 12: try {facturaproveedor.setid_factura((Long) value);facturaproveedor.setfactura_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualFacturaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 13: try {facturaproveedor.setnumero_factura((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 14: try {facturaproveedor.setid_transaccion((Long) value);facturaproveedor.settransaccion_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualTransaccionForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 15: try {facturaproveedor.setfecha_emision((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 16: try {facturaproveedor.setid_cliente((Long) value);facturaproveedor.setcliente_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualClienteForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 17: try {facturaproveedor.setruc((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 18: try {facturaproveedor.setid_empleado_solicita((Long) value);facturaproveedor.setempleadosolicita_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualEmpleadoSolicitaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 19: try {facturaproveedor.setfecha_vence((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 20: try {facturaproveedor.setid_moneda((Long) value);facturaproveedor.setmoneda_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualMonedaForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 21: try {facturaproveedor.setid_empleado((Long) value);facturaproveedor.setempleado_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualEmpleadoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 22: try {facturaproveedor.setcon_activos((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 23: try {facturaproveedor.setcon_rise((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 24: try {facturaproveedor.setcon_sitios((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 25: try {facturaproveedor.setdetalle((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 26: try {facturaproveedor.setvalor_bienes12((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 27: try {facturaproveedor.setvalor_servicios12((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 28: try {facturaproveedor.settotal_valor12((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 29: try {facturaproveedor.setvalor_bienes0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 30: try {facturaproveedor.setvalor_servicios0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 31: try {facturaproveedor.settotal_valor0((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 32: try {facturaproveedor.setbienes_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 33: try {facturaproveedor.setservicios_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 34: try {facturaproveedor.settotal_ice((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 35: try {facturaproveedor.setbienes_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 36: try {facturaproveedor.setservicios_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 37: try {facturaproveedor.settotal_iva((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 38: try {facturaproveedor.setiva_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 39: try {facturaproveedor.settotal((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 40: try {facturaproveedor.setcon_monto_objeto_iva((Boolean) value);} catch (Exception e) {e.printStackTrace();} break;
				case 41: try {facturaproveedor.setnumero_retencion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 42: try {facturaproveedor.setnumero_serie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 43: try {facturaproveedor.setnumero_autorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 44: try {facturaproveedor.setfecha_validez((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 45: try {facturaproveedor.setid_tipo_retencion_fuente1((Long) value);facturaproveedor.settiporetencionfuente1_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualTipoRetencionFuente1ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 46: try {facturaproveedor.setret_fuente1_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 47: try {facturaproveedor.setret_fuente1_base((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 48: try {facturaproveedor.setret_fuente1_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 49: try {facturaproveedor.setid_tipo_retencion_fuente2((Long) value);facturaproveedor.settiporetencionfuente2_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualTipoRetencionFuente2ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 50: try {facturaproveedor.setret_fuente2_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 51: try {facturaproveedor.setret_fuente2_base((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 52: try {facturaproveedor.setret_fuente2_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 53: try {facturaproveedor.setid_tipo_retencion_iva1((Long) value);facturaproveedor.settiporetencioniva1_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualTipoRetencionIva1ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 54: try {facturaproveedor.setret_iva_bien_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 55: try {facturaproveedor.setret_iva_bien_base((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 56: try {facturaproveedor.setret_iva_bien_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 57: try {facturaproveedor.setid_tipo_retencion_iva2((Long) value);facturaproveedor.settiporetencioniva2_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualTipoRetencionIva2ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 58: try {facturaproveedor.setret_iva_servicio_porcentaje((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 59: try {facturaproveedor.setret_iva_servicio_base((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 60: try {facturaproveedor.setret_iva_servicio_retenido((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 61: try {facturaproveedor.setanexo_numero_autorizacion((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 62: try {facturaproveedor.setanexo_numeso_serie((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 63: try {facturaproveedor.setanexo_fecha_validez((Date) value);} catch (Exception e) {e.printStackTrace();} break;
				case 64: try {facturaproveedor.setid_tipo_tributario((Long) value);facturaproveedor.settipotributario_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualTipoTributarioForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 65: try {facturaproveedor.setanexo_factura_inicio((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 66: try {facturaproveedor.setanexo_factura_fin((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 67: try {facturaproveedor.setid_cuenta_contable_credito_fiscal_bienes((Long) value);facturaproveedor.setcuentacontablecreditofiscalbienes_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualCuentaContableCreditoFiscalBienesForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 68: try {facturaproveedor.setid_responsable_fondo((Long) value);facturaproveedor.setresponsablefondo_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualResponsableFondoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 69: try {facturaproveedor.setid_cuenta_contable_credito_fiscal_servicios((Long) value);facturaproveedor.setcuentacontablecreditofiscalservicios_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualCuentaContableCreditoFiscalServiciosForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 70: try {facturaproveedor.setsecuencial((String) value);} catch (Exception e) {e.printStackTrace();} break;
				case 71: try {facturaproveedor.setid_cuenta_contable_gasto((Long) value);facturaproveedor.setcuentacontablegasto_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualCuentaContableGastoForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 72: try {facturaproveedor.setgasto_valor((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
				case 73: try {facturaproveedor.setid_cuenta_contable_gasto2((Long) value);facturaproveedor.setcuentacontablegasto2_descripcion(facturaproveedorBeanSwingJInternalFrame.getActualCuentaContableGasto2ForeignKeyDescripcion((Long)value));} catch (Exception e) {e.printStackTrace();} break;
				case 74: try {facturaproveedor.setgasto_valor2((Double) value);esCampoValor=true;} catch (Exception e) {e.printStackTrace();} break;
	        }
	        
	        fireTableCellUpdated(rowIndex, columnIndex);
			
			if(esCampoValor) {
				jInternalFrameBase.procesoActualizarFilaTotales(esCampoValor,sTipo);
			}
	    }
		
		
		//PARTE PARA EL PROPERTYVALORCHANGELISTENER
		//public JInternalFrameBase jInternalFrameBase;
		/*
		public FacturaProveedorModel(JInternalFrameBase jInternalFrameBase) {
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
		private FacturaProveedorDetalleFormJInternalFrame facturaproveedorJInternalFrame=null;
		
		public FacturaProveedorModel(FacturaProveedorDetalleFormJInternalFrame facturaproveedorJInternalFrame) {
			this.facturaproveedorJInternalFrame=facturaproveedorJInternalFrame;
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturaproveedorJInternalFrame.getjButtonActualizarToolBarFacturaProveedor();
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.getjButtonActualizarToolBarFacturaProveedor())) {
				componentTab=this.facturaproveedorJInternalFrame.getjButtonEliminarToolBarFacturaProveedor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.getjButtonEliminarToolBarFacturaProveedor())) {
				componentTab=this.facturaproveedorJInternalFrame.getjButtonCancelarToolBarFacturaProveedor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.getjButtonCancelarToolBarFacturaProveedor())) {
				componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_empresaFacturaProveedor;
				return componentTab;
			}				
			
			
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldcodigo_asientoFacturaProveedor)) {
				componentTab=this.facturaproveedorJInternalFrame.jComboBoxTiposAccionesFormularioFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxTiposAccionesFormularioFacturaProveedor)) {
				componentTab=this.facturaproveedorJInternalFrame.jButtonEliminarFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jButtonEliminarFacturaProveedor)) {
				componentTab=this.facturaproveedorJInternalFrame.jButtonActualizarFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jButtonActualizarFacturaProveedor)) {
				componentTab=this.facturaproveedorJInternalFrame.jButtonCancelarFacturaProveedor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_empresaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_sucursalFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_sucursalFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_ejercicioFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_ejercicioFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_periodoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_periodoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_anioFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_anioFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_mesFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_mesFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_moduloFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_moduloFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_plantilla_facturaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_plantilla_facturaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_documentoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_documentoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldplazoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldplazoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_facturaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_facturaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_facturaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_facturaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_transaccionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_transaccionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jDateChooserfecha_emisionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jDateChooserfecha_emisionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_clienteFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_clienteFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldrucFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldrucFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_empleado_solicitaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_empleado_solicitaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jDateChooserfecha_venceFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jDateChooserfecha_venceFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_monedaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_monedaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_empleadoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_empleadoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jCheckBoxcon_activosFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jCheckBoxcon_activosFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jCheckBoxcon_riseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jCheckBoxcon_riseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jCheckBoxcon_sitiosFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jCheckBoxcon_sitiosFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextAreadetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextAreadetalleFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldvalor_bienes12FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldvalor_bienes12FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldvalor_servicios12FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldvalor_servicios12FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotal_valor12FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotal_valor12FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldvalor_bienes0FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldvalor_bienes0FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldvalor_servicios0FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldvalor_servicios0FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotal_valor0FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotal_valor0FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldbienes_iceFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldbienes_iceFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldservicios_iceFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldservicios_iceFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotal_iceFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotal_iceFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldbienes_ivaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldbienes_ivaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldservicios_ivaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldservicios_ivaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotal_ivaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotal_ivaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldiva_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldiva_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotalFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotalFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jCheckBoxcon_monto_objeto_ivaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jCheckBoxcon_monto_objeto_ivaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_retencionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_retencionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_serieFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_serieFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_autorizacionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_autorizacionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jDateChooserfecha_validezFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jDateChooserfecha_validezFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_fuente1FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_fuente1FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_baseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_baseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_retenidoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_retenidoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_fuente2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_fuente2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_baseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_baseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_retenidoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_retenidoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_iva1FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_iva1FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_baseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_baseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_retenidoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_retenidoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_iva2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_iva2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_baseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_baseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_retenidoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_retenidoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldanexo_numero_autorizacionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldanexo_numero_autorizacionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldanexo_numeso_serieFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldanexo_numeso_serieFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jDateChooseranexo_fecha_validezFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jDateChooseranexo_fecha_validezFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_tributarioFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_tributarioFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldanexo_factura_inicioFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldanexo_factura_inicioFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldanexo_factura_finFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldanexo_factura_finFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_responsable_fondoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_responsable_fondoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldsecuencialFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldsecuencialFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_gastoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_gastoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldgasto_valorFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldgasto_valorFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_gasto2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_gasto2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldgasto_valor2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldgasto_valor2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldgasto_nombreFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldgasto_nombreFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldgasto_nombre2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldgasto_nombre2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_finFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_finFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_creditoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_creditoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextAreadescripcionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextAreadescripcionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_movimientoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_movimientoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_movimiento_moduloFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_movimiento_moduloFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_transaccion_moduloFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_transaccion_moduloFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_mayorFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_mayorFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldcodigo_asientoFacturaProveedor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component component) {
			
			componentTab=this.facturaproveedorJInternalFrame.getjButtonActualizarToolBarFacturaProveedor();
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.getjButtonEliminarToolBarFacturaProveedor())) {
				componentTab=this.facturaproveedorJInternalFrame.getjButtonActualizarToolBarFacturaProveedor();
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.getjButtonCancelarToolBarFacturaProveedor())) {
				componentTab=this.facturaproveedorJInternalFrame.getjButtonEliminarToolBarFacturaProveedor();
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_empresaFacturaProveedor)) {
				
				componentTab=this.facturaproveedorJInternalFrame.getjButtonCancelarToolBarFacturaProveedor();
				
				
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxTiposAccionesFormularioFacturaProveedor)) {
				componentTab=this.facturaproveedorJInternalFrame.jTextFieldcodigo_asientoFacturaProveedor;
				return componentTab;
			}
			
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jButtonEliminarFacturaProveedor)) {
				componentTab=this.facturaproveedorJInternalFrame.jComboBoxTiposAccionesFormularioFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jButtonActualizarFacturaProveedor)) {
				componentTab=this.facturaproveedorJInternalFrame.jButtonEliminarFacturaProveedor;
				return componentTab;
			}
			
			if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jButtonCancelarFacturaProveedor)) {
				componentTab=this.facturaproveedorJInternalFrame.jButtonActualizarFacturaProveedor;
				return componentTab;
			}
			
			

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_sucursalFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_empresaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_ejercicioFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_sucursalFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_periodoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_ejercicioFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_anioFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_periodoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_mesFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_anioFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_moduloFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_mesFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_plantilla_facturaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_moduloFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_documentoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_plantilla_facturaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldplazoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_documentoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_facturaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldplazoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_facturaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_facturaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_transaccionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_facturaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jDateChooserfecha_emisionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_transaccionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_clienteFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jDateChooserfecha_emisionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldrucFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_clienteFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_empleado_solicitaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldrucFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jDateChooserfecha_venceFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_empleado_solicitaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_monedaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jDateChooserfecha_venceFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_empleadoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_monedaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jCheckBoxcon_activosFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_empleadoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jCheckBoxcon_riseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jCheckBoxcon_activosFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jCheckBoxcon_sitiosFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jCheckBoxcon_riseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextAreadetalleFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jCheckBoxcon_sitiosFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldvalor_bienes12FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextAreadetalleFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldvalor_servicios12FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldvalor_bienes12FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotal_valor12FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldvalor_servicios12FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldvalor_bienes0FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotal_valor12FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldvalor_servicios0FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldvalor_bienes0FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotal_valor0FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldvalor_servicios0FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldbienes_iceFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotal_valor0FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldservicios_iceFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldbienes_iceFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotal_iceFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldservicios_iceFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldbienes_ivaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotal_iceFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldservicios_ivaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldbienes_ivaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotal_ivaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldservicios_ivaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldiva_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotal_ivaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldtotalFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldiva_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jCheckBoxcon_monto_objeto_ivaFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldtotalFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_retencionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jCheckBoxcon_monto_objeto_ivaFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_serieFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_retencionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_autorizacionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_serieFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jDateChooserfecha_validezFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_autorizacionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_fuente1FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jDateChooserfecha_validezFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_fuente1FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_baseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_retenidoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_baseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_fuente2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente1_retenidoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_fuente2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_baseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_retenidoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_baseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_iva1FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_fuente2_retenidoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_iva1FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_baseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_retenidoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_baseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_iva2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_bien_retenidoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_porcentajeFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_retencion_iva2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_baseFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_porcentajeFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_retenidoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_baseFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldanexo_numero_autorizacionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldret_iva_servicio_retenidoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldanexo_numeso_serieFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldanexo_numero_autorizacionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jDateChooseranexo_fecha_validezFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldanexo_numeso_serieFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_tributarioFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jDateChooseranexo_fecha_validezFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldanexo_factura_inicioFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_tributarioFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldanexo_factura_finFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldanexo_factura_inicioFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldanexo_factura_finFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_responsable_fondoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_responsable_fondoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldsecuencialFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_gastoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldsecuencialFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldgasto_valorFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_gastoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_gasto2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldgasto_valorFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldgasto_valor2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_gasto2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldgasto_nombreFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldgasto_valor2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldgasto_nombre2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldgasto_nombreFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_finFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldgasto_nombre2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_finFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_creditoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextAreadescripcionFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_cuenta_contable_creditoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_movimientoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextAreadescripcionFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_movimiento_moduloFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_movimientoFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jComboBoxid_tipo_transaccion_moduloFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_movimiento_moduloFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldnumero_mayorFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jComboBoxid_tipo_transaccion_moduloFacturaProveedor;
			return componentTab;
		}

		if(component!=null && component.equals(this.facturaproveedorJInternalFrame.jTextFieldcodigo_asientoFacturaProveedor)) {
			componentTab=this.facturaproveedorJInternalFrame.jTextFieldnumero_mayorFacturaProveedor;
			return componentTab;
		}
			
			return componentTab;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			
			componentTab=this.facturaproveedorJInternalFrame.getjButtonActualizarToolBarFacturaProveedor();
			
			
			return componentTab;		
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			
			componentTab=this.facturaproveedorJInternalFrame.getjButtonActualizarToolBarFacturaProveedor();
			
			
			return componentTab;		
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			
			componentTab=this.facturaproveedorJInternalFrame.getjButtonCancelarToolBarFacturaProveedor();
			
			
			return componentTab;		
		}
		
		public FacturaProveedorDetalleFormJInternalFrame getfacturaproveedorJInternalFrame() {
			return this.facturaproveedorJInternalFrame;
		}
		
		public void setfacturaproveedorJInternalFrame(FacturaProveedorDetalleFormJInternalFrame facturaproveedorJInternalFrame) {
			this.facturaproveedorJInternalFrame=facturaproveedorJInternalFrame;
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
