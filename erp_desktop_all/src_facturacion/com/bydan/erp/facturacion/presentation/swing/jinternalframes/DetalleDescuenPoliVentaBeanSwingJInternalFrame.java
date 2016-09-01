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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.facturacion.util.DetalleDescuenPoliVentaConstantesFunciones;
import com.bydan.erp.facturacion.util.DetalleDescuenPoliVentaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetalleDescuenPoliVentaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.DetalleDescuenPoliVentaBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
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
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
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
import java.util.Collections;
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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
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

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleDescuenPoliVentaBeanSwingJInternalFrame extends DetalleDescuenPoliVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleDescuenPoliVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleDescuenPoliVenta> detalledescuenpoliventaValidator = new ClassValidator<DetalleDescuenPoliVenta>(DetalleDescuenPoliVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleDescuenPoliVenta detalledescuenpoliventa;	
	public DetalleDescuenPoliVenta detalledescuenpoliventaAux;
	public DetalleDescuenPoliVenta detalledescuenpoliventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleDescuenPoliVenta detalledescuenpoliventaTotales;
	public Long idDetalleDescuenPoliVentaActual;
	public Long iIdNuevoDetalleDescuenPoliVenta=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoDetalleDescuenPoliVenta;
	public Boolean isPermisoNuevoDetalleDescuenPoliVenta;
	public Boolean isPermisoActualizarDetalleDescuenPoliVenta;
	public Boolean isPermisoActualizarOriginalDetalleDescuenPoliVenta;
	public Boolean isPermisoEliminarDetalleDescuenPoliVenta;
	public Boolean isPermisoGuardarCambiosDetalleDescuenPoliVenta;
	public Boolean isPermisoConsultaDetalleDescuenPoliVenta;
	public Boolean isPermisoBusquedaDetalleDescuenPoliVenta;
	public Boolean isPermisoReporteDetalleDescuenPoliVenta;
	public Boolean isPermisoPaginacionMedioDetalleDescuenPoliVenta;
	public Boolean isPermisoPaginacionAltoDetalleDescuenPoliVenta;
	public Boolean isPermisoPaginacionTodoDetalleDescuenPoliVenta;
	public Boolean isPermisoCopiarDetalleDescuenPoliVenta;
	public Boolean isPermisoVerFormDetalleDescuenPoliVenta;
	public Boolean isPermisoDuplicarDetalleDescuenPoliVenta;
	public Boolean isPermisoOrdenDetalleDescuenPoliVenta;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public DetalleDescuenPoliVentaParameterReturnGeneral detalledescuenpoliventaReturnGeneral;
	public DetalleDescuenPoliVentaParameterReturnGeneral detalledescuenpoliventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleDescuenPoliVenta=false;
	public Boolean esParaAccionDesdeFormularioDetalleDescuenPoliVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleDescuenPoliVentaSessionBeanAdditional detalledescuenpoliventaSessionBeanAdditional=null;
	
	public DetalleDescuenPoliVentaSessionBeanAdditional getDetalleDescuenPoliVentaSessionBeanAdditional() {
		return this.detalledescuenpoliventaSessionBeanAdditional;
	}
	
	public void setDetalleDescuenPoliVentaSessionBeanAdditional(DetalleDescuenPoliVentaSessionBeanAdditional detalledescuenpoliventaSessionBeanAdditional) {
		try {
			this.detalledescuenpoliventaSessionBeanAdditional=detalledescuenpoliventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional detalledescuenpoliventaBeanSwingJInternalFrameAdditional=null;
	//public class DetalleDescuenPoliVentaBeanSwingJInternalFrame
	
	public DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional getDetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional() {
		return this.detalledescuenpoliventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional(DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional detalledescuenpoliventaBeanSwingJInternalFrameAdditional) {
		try {
			this.detalledescuenpoliventaBeanSwingJInternalFrameAdditional=detalledescuenpoliventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleDescuenPoliVentaLogic detalledescuenpoliventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleDescuenPoliVenta detalledescuenpoliventaBean;
	public DetalleDescuenPoliVentaConstantesFunciones detalledescuenpoliventaConstantesFunciones;
	//public DetalleDescuenPoliVentaParameterReturnGeneral detalledescuenpoliventaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleDescuenPoliVenta> detalledescuenpoliventas;	
	//public List<DetalleDescuenPoliVenta> detalledescuenpoliventasEliminados;
	//public List<DetalleDescuenPoliVenta> detalledescuenpoliventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta=true;
	public Boolean isVisibilidadCeldaCopiarDetalleDescuenPoliVenta=true;
	public Boolean isVisibilidadCeldaVerFormDetalleDescuenPoliVenta=true;
	public Boolean isVisibilidadCeldaOrdenDetalleDescuenPoliVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;
	public Boolean isVisibilidadCeldaModificarDetalleDescuenPoliVenta=false;
	public Boolean isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=false;
	public Boolean isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=false;
	public Boolean isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=false;
	public Boolean isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDetalleDescuenPoliVenta() {
		return this.iIdNuevoDetalleDescuenPoliVenta;
	}

	public void setiIdNuevoDetalleDescuenPoliVenta(Long iIdNuevoDetalleDescuenPoliVenta) {
		this.iIdNuevoDetalleDescuenPoliVenta = iIdNuevoDetalleDescuenPoliVenta;
	}
	
	public Long getidDetalleDescuenPoliVentaActual() {
		return this.idDetalleDescuenPoliVentaActual;
	}

	public void setidDetalleDescuenPoliVentaActual(Long idDetalleDescuenPoliVentaActual) {
		this.idDetalleDescuenPoliVentaActual = idDetalleDescuenPoliVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleDescuenPoliVenta getdetalledescuenpoliventa() {
		return this.detalledescuenpoliventa;
	}

	public void setdetalledescuenpoliventa(DetalleDescuenPoliVenta detalledescuenpoliventa) {
		this.detalledescuenpoliventa = detalledescuenpoliventa;
	}
	
	public DetalleDescuenPoliVenta getdetalledescuenpoliventaAux() {
		return this.detalledescuenpoliventaAux;
	}

	public void setdetalledescuenpoliventaAux(DetalleDescuenPoliVenta detalledescuenpoliventaAux) {
		this.detalledescuenpoliventaAux = detalledescuenpoliventaAux;
	}				
	
	public DetalleDescuenPoliVenta getdetalledescuenpoliventaAnterior() {
		return this.detalledescuenpoliventaAnterior;
	}

	public void setdetalledescuenpoliventaAnterior(DetalleDescuenPoliVenta detalledescuenpoliventaAnterior) {
		this.detalledescuenpoliventaAnterior = detalledescuenpoliventaAnterior;
	}	
	
	public DetalleDescuenPoliVenta getdetalledescuenpoliventaTotales() {
		return this.detalledescuenpoliventaTotales;
	}

	public void setdetalledescuenpoliventaTotales(DetalleDescuenPoliVenta detalledescuenpoliventaTotales) {
		this.detalledescuenpoliventaTotales = detalledescuenpoliventaTotales;
	}	
	
	public DetalleDescuenPoliVenta getdetalledescuenpoliventaBean() {
		return this.detalledescuenpoliventaBean;
	}

	public void setdetalledescuenpoliventaBean(DetalleDescuenPoliVenta detalledescuenpoliventaBean) {
		this.detalledescuenpoliventaBean = detalledescuenpoliventaBean;
	}	
	
	public DetalleDescuenPoliVentaParameterReturnGeneral getdetalledescuenpoliventaReturnGeneral() {
		return this.detalledescuenpoliventaReturnGeneral;
	}

	public void setdetalledescuenpoliventaReturnGeneral(DetalleDescuenPoliVentaParameterReturnGeneral detalledescuenpoliventaReturnGeneral) {
		this.detalledescuenpoliventaReturnGeneral = detalledescuenpoliventaReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleDescuenPoliVentaLogic getDetalleDescuenPoliVentaLogic()	{		
		return detalledescuenpoliventaLogic;
	}

	public void setDetalleDescuenPoliVentaLogic(DetalleDescuenPoliVentaLogic detalledescuenpoliventaLogic) {
		this.detalledescuenpoliventaLogic = detalledescuenpoliventaLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoDetalleDescuenPoliVenta() {
		return isEsNuevoDetalleDescuenPoliVenta;
	}

	public void setIsEsNuevoDetalleDescuenPoliVenta(Boolean isEsNuevoDetalleDescuenPoliVenta) {
		this.isEsNuevoDetalleDescuenPoliVenta = isEsNuevoDetalleDescuenPoliVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleDescuenPoliVenta() {
		return esParaAccionDesdeFormularioDetalleDescuenPoliVenta;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleDescuenPoliVenta(Boolean esParaAccionDesdeFormularioDetalleDescuenPoliVenta) {
		this.esParaAccionDesdeFormularioDetalleDescuenPoliVenta = esParaAccionDesdeFormularioDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.detalledescuenpoliventaSessionBean==null) {
				this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
			}

			if(!this.detalledescuenpoliventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(detalledescuenpoliventaSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.detalledescuenpoliventaSessionBean==null) {
				this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
			}

			if(!this.detalledescuenpoliventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(detalledescuenpoliventaSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.detalledescuenpoliventaSessionBean==null) {
				this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
			}

			if(!this.detalledescuenpoliventaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(detalledescuenpoliventaSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.detalledescuenpoliventa!=null) {
						this.detalledescuenpoliventa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
						this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleDescuenPoliVenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleDescuenPoliVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaDetalleDescuenPoliVentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleDescuenPoliVentaGenerico!=null && jComboBoxid_empresaDetalleDescuenPoliVentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleDescuenPoliVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.detalledescuenpoliventa!=null) {
						this.detalledescuenpoliventa.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
						this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleDescuenPoliVenta.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleDescuenPoliVentaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalDetalleDescuenPoliVentaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleDescuenPoliVentaGenerico!=null && jComboBoxid_sucursalDetalleDescuenPoliVentaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleDescuenPoliVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.detalledescuenpoliventa!=null) {
						this.detalledescuenpoliventa.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
						this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteDetalleDescuenPoliVenta.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta!=null) {
						jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta!=null) {
							//jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteDetalleDescuenPoliVentaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteDetalleDescuenPoliVentaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteDetalleDescuenPoliVentaGenerico!=null && jComboBoxid_clienteDetalleDescuenPoliVentaGenerico.getItemCount()>0) {
					jComboBoxid_clienteDetalleDescuenPoliVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleDescuenPoliVenta detalledescuenpoliventa,JComboBox jComboBoxid_empresaDetalleDescuenPoliVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleDescuenPoliVentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleDescuenPoliVentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalledescuenpoliventa.setid_empresa(empresaAux.getId());
				detalledescuenpoliventa.setempresa_descripcion(DetalleDescuenPoliVentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalledescuenpoliventa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleDescuenPoliVenta detalledescuenpoliventa,JComboBox jComboBoxid_sucursalDetalleDescuenPoliVentaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleDescuenPoliVentaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleDescuenPoliVentaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detalledescuenpoliventa.setid_sucursal(sucursalAux.getId());
				detalledescuenpoliventa.setsucursal_descripcion(DetalleDescuenPoliVentaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detalledescuenpoliventa.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(DetalleDescuenPoliVenta detalledescuenpoliventa,JComboBox jComboBoxid_clienteDetalleDescuenPoliVentaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteDetalleDescuenPoliVentaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteDetalleDescuenPoliVentaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				detalledescuenpoliventa.setid_cliente(clienteAux.getId());
				detalledescuenpoliventa.setcliente_descripcion(DetalleDescuenPoliVentaConstantesFunciones.getClienteDescripcion(clienteAux));
				detalledescuenpoliventa.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { 
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { 
					}

					if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { 
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { 
					}

					if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { 
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { 
					}

					if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.addItem(cliente);
							}
						}

						if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleDescuenPoliVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleDescuenPoliVentaConstantesFunciones.refrescarForeignKeysDescripcionesDetalleDescuenPoliVenta(this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleDescuenPoliVentaConstantesFunciones.refrescarForeignKeysDescripcionesDetalleDescuenPoliVenta(this.detalledescuenpoliventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalledescuenpoliventaLogic.setDetalleDescuenPoliVentas(this.detalledescuenpoliventas);
			detalledescuenpoliventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public DetalleDescuenPoliVentaParameterReturnGeneral getDetalleDescuenPoliVentaParameterGeneral() {
		return this.detalledescuenpoliventaParameterGeneral;
	}
	
	public void setDetalleDescuenPoliVentaParameterGeneral(DetalleDescuenPoliVentaParameterReturnGeneral detalledescuenpoliventaParameterGeneral) {
		this.detalledescuenpoliventaParameterGeneral = detalledescuenpoliventaParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoDetalleDescuenPoliVenta() {
		return isPermisoTodoDetalleDescuenPoliVenta;
	}

	public void setIsPermisoTodoDetalleDescuenPoliVenta(Boolean isPermisoTodoDetalleDescuenPoliVenta) {
		this.isPermisoTodoDetalleDescuenPoliVenta = isPermisoTodoDetalleDescuenPoliVenta;
	}

	public Boolean getIsPermisoNuevoDetalleDescuenPoliVenta() {
		return isPermisoNuevoDetalleDescuenPoliVenta;
	}

	public void setIsPermisoNuevoDetalleDescuenPoliVenta(Boolean isPermisoNuevoDetalleDescuenPoliVenta) {
		this.isPermisoNuevoDetalleDescuenPoliVenta = isPermisoNuevoDetalleDescuenPoliVenta;
	}

	public Boolean getIsPermisoActualizarDetalleDescuenPoliVenta() {
		return isPermisoActualizarDetalleDescuenPoliVenta;
	}

	public void setIsPermisoActualizarDetalleDescuenPoliVenta(Boolean isPermisoActualizarDetalleDescuenPoliVenta) {
		this.isPermisoActualizarDetalleDescuenPoliVenta = isPermisoActualizarDetalleDescuenPoliVenta;
	}

	public Boolean getIsPermisoEliminarDetalleDescuenPoliVenta() {
		return isPermisoEliminarDetalleDescuenPoliVenta;
	}

	public void setIsPermisoEliminarDetalleDescuenPoliVenta(Boolean isPermisoEliminarDetalleDescuenPoliVenta) {
		this.isPermisoEliminarDetalleDescuenPoliVenta = isPermisoEliminarDetalleDescuenPoliVenta;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleDescuenPoliVenta() {
		return isPermisoGuardarCambiosDetalleDescuenPoliVenta;
	}

	public void setIsPermisoGuardarCambiosDetalleDescuenPoliVenta(Boolean isPermisoGuardarCambiosDetalleDescuenPoliVenta) {
		this.isPermisoGuardarCambiosDetalleDescuenPoliVenta = isPermisoGuardarCambiosDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsPermisoConsultaDetalleDescuenPoliVenta() {
		return isPermisoConsultaDetalleDescuenPoliVenta;
	}

	public void setIsPermisoConsultaDetalleDescuenPoliVenta(Boolean isPermisoConsultaDetalleDescuenPoliVenta) {
		this.isPermisoConsultaDetalleDescuenPoliVenta = isPermisoConsultaDetalleDescuenPoliVenta;
	}

	public Boolean getIsPermisoBusquedaDetalleDescuenPoliVenta() {
		return isPermisoBusquedaDetalleDescuenPoliVenta;
	}

	public void setIsPermisoBusquedaDetalleDescuenPoliVenta(Boolean isPermisoBusquedaDetalleDescuenPoliVenta) {
		this.isPermisoBusquedaDetalleDescuenPoliVenta = isPermisoBusquedaDetalleDescuenPoliVenta;
	}

	public Boolean getIsPermisoReporteDetalleDescuenPoliVenta() {
		return isPermisoReporteDetalleDescuenPoliVenta;
	}

	public void setIsPermisoReporteDetalleDescuenPoliVenta(Boolean isPermisoReporteDetalleDescuenPoliVenta) {
		this.isPermisoReporteDetalleDescuenPoliVenta = isPermisoReporteDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleDescuenPoliVenta() {
		return isPermisoPaginacionMedioDetalleDescuenPoliVenta;
	}

	public void setIsPermisoPaginacionMedioDetalleDescuenPoliVenta(Boolean isPermisoPaginacionMedioDetalleDescuenPoliVenta) {
		this.isPermisoPaginacionMedioDetalleDescuenPoliVenta = isPermisoPaginacionMedioDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleDescuenPoliVenta() {
		return isPermisoPaginacionTodoDetalleDescuenPoliVenta;
	}

	public void setIsPermisoPaginacionTodoDetalleDescuenPoliVenta(Boolean isPermisoPaginacionTodoDetalleDescuenPoliVenta) {
		this.isPermisoPaginacionTodoDetalleDescuenPoliVenta = isPermisoPaginacionTodoDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleDescuenPoliVenta() {
		return isPermisoPaginacionAltoDetalleDescuenPoliVenta;
	}

	public void setIsPermisoPaginacionAltoDetalleDescuenPoliVenta(Boolean isPermisoPaginacionAltoDetalleDescuenPoliVenta) {
		this.isPermisoPaginacionAltoDetalleDescuenPoliVenta = isPermisoPaginacionAltoDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsPermisoCopiarDetalleDescuenPoliVenta() {
		return isPermisoCopiarDetalleDescuenPoliVenta;
	}

	public void setIsPermisoCopiarDetalleDescuenPoliVenta(Boolean isPermisoCopiarDetalleDescuenPoliVenta) {
		this.isPermisoCopiarDetalleDescuenPoliVenta = isPermisoCopiarDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsPermisoVerFormDetalleDescuenPoliVenta() {
		return isPermisoVerFormDetalleDescuenPoliVenta;
	}

	public void setIsPermisoVerFormDetalleDescuenPoliVenta(Boolean isPermisoVerFormDetalleDescuenPoliVenta) {
		this.isPermisoVerFormDetalleDescuenPoliVenta = isPermisoVerFormDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsPermisoDuplicarDetalleDescuenPoliVenta() {
		return isPermisoDuplicarDetalleDescuenPoliVenta;
	}

	public void setIsPermisoDuplicarDetalleDescuenPoliVenta(Boolean isPermisoDuplicarDetalleDescuenPoliVenta) {
		this.isPermisoDuplicarDetalleDescuenPoliVenta = isPermisoDuplicarDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsPermisoOrdenDetalleDescuenPoliVenta() {
		return isPermisoOrdenDetalleDescuenPoliVenta;
	}

	public void setIsPermisoOrdenDetalleDescuenPoliVenta(Boolean isPermisoOrdenDetalleDescuenPoliVenta) {
		this.isPermisoOrdenDetalleDescuenPoliVenta = isPermisoOrdenDetalleDescuenPoliVenta;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaNuevoDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaNuevoDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaNuevoDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta = isVisibilidadCeldaNuevoDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta = isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaCopiarDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaCopiarDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaCopiarDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaCopiarDetalleDescuenPoliVenta = isVisibilidadCeldaCopiarDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaVerFormDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaVerFormDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaVerFormDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaVerFormDetalleDescuenPoliVenta = isVisibilidadCeldaVerFormDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaOrdenDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaOrdenDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaOrdenDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaOrdenDetalleDescuenPoliVenta = isVisibilidadCeldaOrdenDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta = isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaModificarDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaModificarDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaModificarDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta = isVisibilidadCeldaModificarDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaActualizarDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaActualizarDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaActualizarDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta = isVisibilidadCeldaActualizarDetalleDescuenPoliVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaEliminarDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaEliminarDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaEliminarDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta = isVisibilidadCeldaEliminarDetalleDescuenPoliVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaCancelarDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaCancelarDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaCancelarDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta = isVisibilidadCeldaCancelarDetalleDescuenPoliVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaGuardarDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaGuardarDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaGuardarDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta = isVisibilidadCeldaGuardarDetalleDescuenPoliVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta() {
		return isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta(Boolean isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta) {
		this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta = isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta;
	}
		
	public DetalleDescuenPoliVentaSessionBean getdetalledescuenpoliventaSessionBean() {
		return this.detalledescuenpoliventaSessionBean;
	}
	
	public void setdetalledescuenpoliventaSessionBean(DetalleDescuenPoliVentaSessionBean detalledescuenpoliventaSessionBean) {
		this.detalledescuenpoliventaSessionBean=detalledescuenpoliventaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detalledescuenpoliventa,null);
				this.setActualParaGuardarSucursalForeignKey(detalledescuenpoliventa,null);
				this.setActualParaGuardarClienteForeignKey(detalledescuenpoliventa,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(DetalleDescuenPoliVenta detalledescuenpoliventa,DetalleDescuenPoliVenta detalledescuenpoliventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleDescuenPoliVenta(detalledescuenpoliventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalledescuenpoliventaAux.setId(detalledescuenpoliventa.getId());
		detalledescuenpoliventaAux.setVersionRow(detalledescuenpoliventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleDescuenPoliVenta();
		
			int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalledescuenpoliventaValidator.getInvalidValues(this.detalledescuenpoliventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalledescuenpoliventaLogic.setDatosCliente(datosCliente);
			detalledescuenpoliventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalledescuenpoliventaAux=new  DetalleDescuenPoliVenta();
				
				detalledescuenpoliventaAux.setIsNew(true);
				detalledescuenpoliventaAux.setIsChanged(true);
				
				detalledescuenpoliventaAux.setDetalleDescuenPoliVentaOriginal(this.detalledescuenpoliventa);
				
				detalledescuenpoliventaAux.setId(this.detalledescuenpoliventa.getId());	
				detalledescuenpoliventaAux.setVersionRow(this.detalledescuenpoliventa.getVersionRow());	
				detalledescuenpoliventaAux.setid_empresa(this.detalledescuenpoliventa.getid_empresa());	
				detalledescuenpoliventaAux.setid_sucursal(this.detalledescuenpoliventa.getid_sucursal());	
				detalledescuenpoliventaAux.setid_cliente(this.detalledescuenpoliventa.getid_cliente());	
				detalledescuenpoliventaAux.setvalor(this.detalledescuenpoliventa.getvalor());	
				detalledescuenpoliventaAux.setdescripcion(this.detalledescuenpoliventa.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventaLogic.saveDetalleDescuenPoliVentas();//WithConnection
						//detalledescuenpoliventaLogic.getSetVersionRowDetalleDescuenPoliVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalledescuenpoliventa,detalledescuenpoliventaAux);
					
					this.refrescarForeignKeysDescripcionesDetalleDescuenPoliVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalledescuenpoliventaLogic.saveDetalleDescuenPoliVentaRelaciones(detalledescuenpoliventaAux);//WithConnection
								//detalledescuenpoliventaLogic.getSetVersionRowDetalleDescuenPoliVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalledescuenpoliventa,detalledescuenpoliventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalledescuenpoliventa,detalledescuenpoliventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalledescuenpoliventaAux=new  DetalleDescuenPoliVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado() 
					|| (this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado() && this.detalledescuenpoliventa.getId()>=0)) {
						
					detalledescuenpoliventaAux.setIsNew(false);
				}
				
				detalledescuenpoliventaAux.setIsDeleted(false);
			
				detalledescuenpoliventaAux.setId(this.detalledescuenpoliventa.getId());	
				detalledescuenpoliventaAux.setVersionRow(this.detalledescuenpoliventa.getVersionRow());	
				detalledescuenpoliventaAux.setid_empresa(this.detalledescuenpoliventa.getid_empresa());	
				detalledescuenpoliventaAux.setid_sucursal(this.detalledescuenpoliventa.getid_sucursal());	
				detalledescuenpoliventaAux.setid_cliente(this.detalledescuenpoliventa.getid_cliente());	
				detalledescuenpoliventaAux.setvalor(this.detalledescuenpoliventa.getvalor());	
				detalledescuenpoliventaAux.setdescripcion(this.detalledescuenpoliventa.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventaLogic.saveDetalleDescuenPoliVentas();//WithConnection
						//detalledescuenpoliventaLogic.getSetVersionRowDetalleDescuenPoliVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalledescuenpoliventa,detalledescuenpoliventaAux);
					
					this.refrescarForeignKeysDescripcionesDetalleDescuenPoliVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalledescuenpoliventaLogic.saveDetalleDescuenPoliVentaRelaciones(detalledescuenpoliventaAux);//WithConnection
								//detalledescuenpoliventaLogic.getSetVersionRowDetalleDescuenPoliVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalledescuenpoliventa,detalledescuenpoliventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalledescuenpoliventa,detalledescuenpoliventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalledescuenpoliventaAux=new  DetalleDescuenPoliVenta();
				
				detalledescuenpoliventaAux.setIsNew(false);
				detalledescuenpoliventaAux.setIsChanged(false);
				
				detalledescuenpoliventaAux.setIsDeleted(true);
				
				detalledescuenpoliventaAux.setId(this.detalledescuenpoliventa.getId());	
				detalledescuenpoliventaAux.setVersionRow(this.detalledescuenpoliventa.getVersionRow());	
				detalledescuenpoliventaAux.setid_empresa(this.detalledescuenpoliventa.getid_empresa());	
				detalledescuenpoliventaAux.setid_sucursal(this.detalledescuenpoliventa.getid_sucursal());	
				detalledescuenpoliventaAux.setid_cliente(this.detalledescuenpoliventa.getid_cliente());	
				detalledescuenpoliventaAux.setvalor(this.detalledescuenpoliventa.getvalor());	
				detalledescuenpoliventaAux.setdescripcion(this.detalledescuenpoliventa.getdescripcion());	
				
				if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalledescuenpoliventaAux.getId()>=0) {	
						this.detalledescuenpoliventasEliminados.add(detalledescuenpoliventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventaLogic.saveDetalleDescuenPoliVentas();//WithConnection
						//detalledescuenpoliventaLogic.getSetVersionRowDetalleDescuenPoliVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalledescuenpoliventaLogic.saveDetalleDescuenPoliVentaRelaciones(detalledescuenpoliventaAux);//WithConnection
								//detalledescuenpoliventaLogic.getSetVersionRowDetalleDescuenPoliVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalledescuenpoliventaAux,detalledescuenpoliventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().addAll(this.detalledescuenpoliventasEliminados);
					
					detalledescuenpoliventaLogic.saveDetalleDescuenPoliVentas();//WithConnection
					//detalledescuenpoliventaLogic.getSetVersionRowDetalleDescuenPoliVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleDescuenPoliVenta();
				
				this.detalledescuenpoliventasEliminados= new ArrayList<DetalleDescuenPoliVenta>();		
			}
			
			if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Descuen Poli Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalledescuenpoliventa=detalledescuenpoliventaAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessDetalleDescuenPoliVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleDescuenPoliVenta detalledescuenpoliventaLocal) throws Exception {
		
		if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleDescuenPoliVenta detalledescuenpoliventaLocal) throws Exception {	
		if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalledescuenpoliventaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detalledescuenpoliventaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				detalledescuenpoliventaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleDescuenPoliVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalledescuenpoliventaValidator.getInvalidValues(this.detalledescuenpoliventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleDescuenPoliVenta detalledescuenpoliventa,List<DetalleDescuenPoliVenta> detalledescuenpoliventas) throws Exception {
		try	{		
			DetalleDescuenPoliVentaConstantesFunciones.actualizarLista(detalledescuenpoliventa,detalledescuenpoliventas,this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleDescuenPoliVenta detalledescuenpoliventa,List<DetalleDescuenPoliVenta> detalledescuenpoliventas) throws Exception {
		try	{			
			DetalleDescuenPoliVentaConstantesFunciones.actualizarSelectedLista(detalledescuenpoliventa,detalledescuenpoliventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleDescuenPoliVenta> detalledescuenpoliventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalledescuenpoliventasLocal=this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalledescuenpoliventasLocal=this.detalledescuenpoliventas;
			}
			//ARCHITECTURE
		
			for(DetalleDescuenPoliVenta detalledescuenpoliventaLocal:detalledescuenpoliventasLocal) {
				if(this.permiteMantenimiento(detalledescuenpoliventaLocal) && detalledescuenpoliventaLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+DetalleDescuenPoliVentaConstantesFunciones.getDetalleDescuenPoliVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleDescuenPoliVentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelid_empresaDetalleDescuenPoliVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleDescuenPoliVentaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelid_sucursalDetalleDescuenPoliVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleDescuenPoliVentaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelid_clienteDetalleDescuenPoliVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleDescuenPoliVentaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelvalorDetalleDescuenPoliVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleDescuenPoliVentaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabeldescripcionDetalleDescuenPoliVenta,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelid_empresaDetalleDescuenPoliVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelid_sucursalDetalleDescuenPoliVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelid_clienteDetalleDescuenPoliVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelvalorDetalleDescuenPoliVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabeldescripcionDetalleDescuenPoliVenta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoDetalleDescuenPoliVenta--;	
		
		
		this.detalledescuenpoliventaAux=new DetalleDescuenPoliVenta();
		
		this.detalledescuenpoliventaAux.setId(this.iIdNuevoDetalleDescuenPoliVenta);
		this.detalledescuenpoliventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().add(this.detalledescuenpoliventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalledescuenpoliventas.add(this.detalledescuenpoliventaAux);
		}
		//ARCHITECTURE
		
		this.detalledescuenpoliventa=this.detalledescuenpoliventaAux;
		
		if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
		}
				
		//this.setDefaultControlesDetalleDescuenPoliVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleDescuenPoliVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleDescuenPoliVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleDescuenPoliVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventaBean,this.detalledescuenpoliventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
			classes=DetalleDescuenPoliVentaConstantesFunciones.getClassesRelationshipsOfDetalleDescuenPoliVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalledescuenpoliventaReturnGeneral=detalledescuenpoliventaLogic.procesarEventosDetalleDescuenPoliVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas(),this.detalledescuenpoliventa,this.detalledescuenpoliventaParameterGeneral,this.isEsNuevoDetalleDescuenPoliVenta,classes);//this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleDescuenPoliVenta(this.detalledescuenpoliventaReturnGeneral,this.detalledescuenpoliventaBean,false);
		
		if(this.detalledescuenpoliventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleDescuenPoliVenta(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleDescuenPoliVenta(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta());
		}
		
		if(this.detalledescuenpoliventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleDescuenPoliVenta(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta(),classes);//this.detalledescuenpoliventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleDescuenPoliVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleDescuenPoliVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.RecargarFormDetalleDescuenPoliVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
						
			if(detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleDescuenPoliVenta();
			}
			
			this.actualizarVisualTableDatosDetalleDescuenPoliVenta();
			
			this.jTableDatosDetalleDescuenPoliVenta.setRowSelectionInterval(this.getIndiceNuevoDetalleDescuenPoliVenta(), this.getIndiceNuevoDetalleDescuenPoliVenta());
			
			this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
						
			this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleDescuenPoliVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextFieldvalorDetalleDescuenPoliVenta.setEnabled(isHabilitar && this.detalledescuenpoliventaConstantesFunciones.activarvalorDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextAreadescripcionDetalleDescuenPoliVenta.setEnabled(isHabilitar && this.detalledescuenpoliventaConstantesFunciones.activardescripcionDetalleDescuenPoliVenta);	
		//
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.setEnabled(isHabilitar && this.detalledescuenpoliventaConstantesFunciones.activarid_empresaDetalleDescuenPoliVenta);//
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.setEnabled(isHabilitar && this.detalledescuenpoliventaConstantesFunciones.activarid_sucursalDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.setEnabled(isHabilitar && this.detalledescuenpoliventaConstantesFunciones.activarid_clienteDetalleDescuenPoliVenta);
	};
	
	public void setDefaultControlesDetalleDescuenPoliVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleDescuenPoliVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalledescuenpoliventaSessionBean.setConGuardarRelaciones(true);			
			this.detalledescuenpoliventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTabbedPaneRelacionesDetalleDescuenPoliVenta.setVisible(true);
			
					
		} else {
			//this.detalledescuenpoliventaSessionBean.setConGuardarRelaciones(false);			
			this.detalledescuenpoliventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTabbedPaneRelacionesDetalleDescuenPoliVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleDescuenPoliVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
				if(detalledescuenpoliventaAux.getId().equals(this.iIdNuevoDetalleDescuenPoliVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventas) {
				if(detalledescuenpoliventaAux.getId().equals(this.iIdNuevoDetalleDescuenPoliVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
				if(detalledescuenpoliventaAux.getId().equals(detalledescuenpoliventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventas) {
				if(detalledescuenpoliventaAux.getId().equals(detalledescuenpoliventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
				if(detalledescuenpoliventaAux.getDetalleDescuenPoliVentaOriginal().getId().equals(detalledescuenpoliventaOriginal.getId())) {
					existe=true;
					detalledescuenpoliventaOriginal.setId(detalledescuenpoliventaAux.getId());
					detalledescuenpoliventaOriginal.setVersionRow(detalledescuenpoliventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventas) {
				if(detalledescuenpoliventaAux.getDetalleDescuenPoliVentaOriginal().getId().equals(detalledescuenpoliventaOriginal.getId())) {
					existe=true;
					detalledescuenpoliventaOriginal.setId(detalledescuenpoliventaAux.getId());
					detalledescuenpoliventaOriginal.setVersionRow(detalledescuenpoliventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleDescuenPoliVenta(Boolean esParaCancelar) throws Exception {
		detalledescuenpoliventasAux=new ArrayList<DetalleDescuenPoliVenta>();
		detalledescuenpoliventaAux=new DetalleDescuenPoliVenta();
		
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
					if(detalledescuenpoliventaAux.getId()<0) {
						detalledescuenpoliventasAux.add(detalledescuenpoliventaAux);
					}		
				}
				this.iIdNuevoDetalleDescuenPoliVenta=0L;
				this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().removeAll(detalledescuenpoliventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventas) {
					if(detalledescuenpoliventaAux.getId()<0) {
						detalledescuenpoliventasAux.add(detalledescuenpoliventaAux);
					}		
				}
				this.iIdNuevoDetalleDescuenPoliVenta=0L;
				this.detalledescuenpoliventas.removeAll(detalledescuenpoliventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleDescuenPoliVenta 
					&& this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size()>0
					) {
					detalledescuenpoliventaAux=this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().get(this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size() - 1);
				
					if(detalledescuenpoliventaAux.getId()<0) {
						this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().remove(detalledescuenpoliventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleDescuenPoliVenta && this.detalledescuenpoliventas.size()>0) {
					detalledescuenpoliventaAux=this.detalledescuenpoliventas.get(this.detalledescuenpoliventas.size() - 1);
				
					if(detalledescuenpoliventaAux.getId()<0) {
						this.detalledescuenpoliventas.remove(detalledescuenpoliventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleDescuenPoliVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalledescuenpoliventa.getId()<0) {
				this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().remove(this.detalledescuenpoliventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalledescuenpoliventa.getId()<0) {
				this.detalledescuenpoliventas.remove(this.detalledescuenpoliventa);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleDescuenPoliVenta(List<DetalleDescuenPoliVenta> detalledescuenpoliventasAux) throws Exception {
		DetalleDescuenPoliVentaConstantesFunciones.setEstadosInicialesDetalleDescuenPoliVenta(detalledescuenpoliventasAux);
	}
	
	public void setEstadosInicialesDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventaAux) throws Exception {
		DetalleDescuenPoliVentaConstantesFunciones.setEstadosInicialesDetalleDescuenPoliVenta(detalledescuenpoliventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleDescuenPoliVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleDescuenPoliVentaActual()) {
				if(!this.isEsNuevoDetalleDescuenPoliVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleDescuenPoliVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleDescuenPoliVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Descuen Poli Venta ?", "MANTENIMIENTO DE Detalle Descuen Poli Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleDescuenPoliVenta detalledescuenpoliventa) throws Exception {
		DetalleDescuenPoliVentaConstantesFunciones.seleccionarAsignar(this.detalledescuenpoliventa,detalledescuenpoliventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleDescuenPoliVenta=this.isPermisoActualizarOriginalDetalleDescuenPoliVenta;
			
			
			this.seleccionarAsignar(detalledescuenpoliventa);
			
			

			idClienteActual=detalledescuenpoliventa.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleDescuenPoliVentaConstantesFunciones.quitarEspaciosDetalleDescuenPoliVenta(this.detalledescuenpoliventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalledescuenpoliventaSessionBean.setsFuncionBusquedaRapida(this.detalledescuenpoliventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleDescuenPoliVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleDescuenPoliVenta(esParaCancelar);				
				this.cancelarNuevoDetalleDescuenPoliVenta(esParaCancelar);								
			}
			
			this.detalledescuenpoliventa=new DetalleDescuenPoliVenta();
			
			this.inicializarDetalleDescuenPoliVenta();
			
			this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleDescuenPoliVenta() throws Exception {
		try {
			DetalleDescuenPoliVentaConstantesFunciones.inicializarDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleDescuenPoliVentas(String sAccionBusqueda,List<DetalleDescuenPoliVenta> detalledescuenpoliventasParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="DetalleDescuenPoliVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleDescuenPoliVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleDescuenPoliVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleDescuenPoliVenta"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Detalle Descuen Poli Ventas");		
		parameters.put("busquedapor", DetalleDescuenPoliVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleDescuenPoliVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleDescuenPoliVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleDescuenPoliVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleDescuenPoliVenta=new JRBeanArrayDataSource(DetalleDescuenPoliVentaJInternalFrame.TraerDetalleDescuenPoliVentaBeans(detalledescuenpoliventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleDescuenPoliVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleDescuenPoliVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleDescuenPoliVentaBean.TraerDetalleDescuenPoliVentaBeans(detalledescuenpoliventasParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteDetalleDescuenPoliVentas(sAccionBusqueda,sTipoArchivoReporte,detalledescuenpoliventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleDescuenPoliVentas(sAccionBusqueda,sTipoArchivoReporte,detalledescuenpoliventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVentaActionPerformed(null);
					//this.generarExcelReporteDetalleDescuenPoliVentas(sAccionBusqueda,sTipoArchivoReporte,detalledescuenpoliventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleDescuenPoliVentas(sAccionBusqueda,sTipoArchivoReporte,detalledescuenpoliventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleDescuenPoliVentas(sAccionBusqueda,sTipoArchivoReporte,detalledescuenpoliventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleDescuenPoliVentas(sAccionBusqueda,sTipoArchivoReporte,detalledescuenpoliventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleDescuenPoliVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleDescuenPoliVenta> detalledescuenpoliventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledescuenpoliventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleDescuenPoliVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleDescuenPoliVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleDescuenPoliVenta detalledescuenpoliventa : detalledescuenpoliventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleDescuenPoliVentaConstantesFunciones.generarExcelReporteDataDetalleDescuenPoliVenta("NORMAL",row,workbook,detalledescuenpoliventa,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleDescuenPoliVenta(String sTipo,Row row,Workbook workbook) {
		
		DetalleDescuenPoliVentaConstantesFunciones.generarExcelReporteHeaderDetalleDescuenPoliVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleDescuenPoliVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleDescuenPoliVenta> detalledescuenpoliventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledescuenpoliventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleDescuenPoliVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleDescuenPoliVenta detalledescuenpoliventa : detalledescuenpoliventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.getDetalleDescuenPoliVentaDescripcion(detalledescuenpoliventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledescuenpoliventa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledescuenpoliventa.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledescuenpoliventa.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledescuenpoliventa.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalledescuenpoliventa.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleDescuenPoliVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleDescuenPoliVenta> detalledescuenpoliventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleDescuenPoliVenta> detalledescuenpoliventasRespaldo=null;
		
		classes=DetalleDescuenPoliVentaConstantesFunciones.getClassesRelationshipsOfDetalleDescuenPoliVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalledescuenpoliventaLogic.setDatosCliente(this.datosCliente);
		this.detalledescuenpoliventaLogic.setDatosDeep(this.datosDeep);
		this.detalledescuenpoliventaLogic.setIsConDeep(true);
		
		detalledescuenpoliventasRespaldo=this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas();
		
		this.detalledescuenpoliventaLogic.setDetalleDescuenPoliVentas(detalledescuenpoliventasParaReportes);	
		this.detalledescuenpoliventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalledescuenpoliventasParaReportes=this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas();
		this.detalledescuenpoliventaLogic.setDetalleDescuenPoliVentas(detalledescuenpoliventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledescuenpoliventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleDescuenPoliVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleDescuenPoliVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleDescuenPoliVenta detalledescuenpoliventa : detalledescuenpoliventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleDescuenPoliVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleDescuenPoliVentaConstantesFunciones.generarExcelReporteDataDetalleDescuenPoliVenta("NORMAL",row,workbook,detalledescuenpoliventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.getDetalleDescuenPoliVentaDescripcion(detalledescuenpoliventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleDescuenPoliVenta() throws Exception {		
		this.startProcessDetalleDescuenPoliVenta(true);
	}
	
	public void startProcessDetalleDescuenPoliVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleDescuenPoliVenta ,this.jPanelParametrosReportesDetalleDescuenPoliVenta, this.jScrollPanelDatosDetalleDescuenPoliVenta,this.jPanelPaginacionDetalleDescuenPoliVenta, this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta, this.jPanelAccionesDetalleDescuenPoliVenta,this.jPanelAccionesFormularioDetalleDescuenPoliVenta,this.jmenuBarDetalleDescuenPoliVenta,this.jmenuBarDetalleDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDetalleDescuenPoliVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleDescuenPoliVenta=this.jTabbedPaneBusquedasDetalleDescuenPoliVenta; 
		
		final JPanel jPanelParametrosReportesDetalleDescuenPoliVenta=this.jPanelParametrosReportesDetalleDescuenPoliVenta;
		//final JScrollPane jScrollPanelDatosDetalleDescuenPoliVenta=this.jScrollPanelDatosDetalleDescuenPoliVenta;
		final JTable jTableDatosDetalleDescuenPoliVenta=this.jTableDatosDetalleDescuenPoliVenta;		
		final JPanel jPanelPaginacionDetalleDescuenPoliVenta=this.jPanelPaginacionDetalleDescuenPoliVenta;
		//final JScrollPane jScrollPanelDatosEdicionDetalleDescuenPoliVenta=this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta;
		final JPanel jPanelAccionesDetalleDescuenPoliVenta=this.jPanelAccionesDetalleDescuenPoliVenta;
		
		JPanel jPanelCamposAuxiliarDetalleDescuenPoliVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleDescuenPoliVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			jPanelCamposAuxiliarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPanelCamposDetalleDescuenPoliVenta;
			jPanelAccionesFormularioAuxiliarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPanelAccionesFormularioDetalleDescuenPoliVenta;
		}
		
		final JPanel jPanelCamposDetalleDescuenPoliVenta=jPanelCamposAuxiliarDetalleDescuenPoliVenta;
		final JPanel jPanelAccionesFormularioDetalleDescuenPoliVenta=jPanelAccionesFormularioAuxiliarDetalleDescuenPoliVenta;
		
		
		final JMenuBar jmenuBarDetalleDescuenPoliVenta=this.jmenuBarDetalleDescuenPoliVenta;
		final JToolBar jTtoolBarDetalleDescuenPoliVenta=this.jTtoolBarDetalleDescuenPoliVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleDescuenPoliVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleDescuenPoliVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			jmenuBarDetalleAuxiliarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jmenuBarDetalleDetalleDescuenPoliVenta;
			jTtoolBarDetalleAuxiliarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTtoolBarDetalleDetalleDescuenPoliVenta;
		}
		
		final JMenuBar jmenuBarDetalleDetalleDescuenPoliVenta=jmenuBarDetalleAuxiliarDetalleDescuenPoliVenta;
		final JToolBar jTtoolBarDetalleDetalleDescuenPoliVenta=jTtoolBarDetalleAuxiliarDetalleDescuenPoliVenta;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleDescuenPoliVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleDescuenPoliVenta;
			processRunnable.jTableDatos=jTableDatosDetalleDescuenPoliVenta;
			processRunnable.jPanelCampos=jPanelCamposDetalleDescuenPoliVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleDescuenPoliVenta;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleDescuenPoliVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleDescuenPoliVenta;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleDescuenPoliVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleDescuenPoliVenta;
			processRunnable.jTtoolBar=jTtoolBarDetalleDescuenPoliVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleDescuenPoliVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleDescuenPoliVenta ,jPanelParametrosReportesDetalleDescuenPoliVenta,jTableDatosDetalleDescuenPoliVenta, /*jScrollPanelDatosDetalleDescuenPoliVenta,*/jPanelCamposDetalleDescuenPoliVenta,jPanelPaginacionDetalleDescuenPoliVenta, /*jScrollPanelDatosEdicionDetalleDescuenPoliVenta,*/ jPanelAccionesDetalleDescuenPoliVenta,jPanelAccionesFormularioDetalleDescuenPoliVenta,jmenuBarDetalleDescuenPoliVenta,jmenuBarDetalleDetalleDescuenPoliVenta,jTtoolBarDetalleDescuenPoliVenta,jTtoolBarDetalleDetalleDescuenPoliVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleDescuenPoliVenta ,jPanelParametrosReportesDetalleDescuenPoliVenta, jScrollPanelDatosDetalleDescuenPoliVenta,jPanelPaginacionDetalleDescuenPoliVenta, jScrollPanelDatosEdicionDetalleDescuenPoliVenta, jPanelAccionesDetalleDescuenPoliVenta,jPanelAccionesFormularioDetalleDescuenPoliVenta,jmenuBarDetalleDescuenPoliVenta,jmenuBarDetalleDetalleDescuenPoliVenta,jTtoolBarDetalleDescuenPoliVenta,jTtoolBarDetalleDetalleDescuenPoliVenta);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessDetalleDescuenPoliVenta() {// throws Exception 
		this.finishProcessDetalleDescuenPoliVenta(true);
	}
	
	public void finishProcessDetalleDescuenPoliVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleDescuenPoliVenta ,this.jPanelParametrosReportesDetalleDescuenPoliVenta, this.jScrollPanelDatosDetalleDescuenPoliVenta,this.jPanelPaginacionDetalleDescuenPoliVenta, this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta, this.jPanelAccionesDetalleDescuenPoliVenta,this.jPanelAccionesFormularioDetalleDescuenPoliVenta,this.jmenuBarDetalleDescuenPoliVenta,this.jmenuBarDetalleDetalleDescuenPoliVenta,this.jTtoolBarDetalleDescuenPoliVenta,this.jTtoolBarDetalleDetalleDescuenPoliVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleDescuenPoliVenta=this.jTabbedPaneBusquedasDetalleDescuenPoliVenta; 
		
		final JPanel jPanelParametrosReportesDetalleDescuenPoliVenta=this.jPanelParametrosReportesDetalleDescuenPoliVenta;
		//final JScrollPane jScrollPanelDatosDetalleDescuenPoliVenta=this.jScrollPanelDatosDetalleDescuenPoliVenta;
		final JTable jTableDatosDetalleDescuenPoliVenta=this.jTableDatosDetalleDescuenPoliVenta;		
		final JPanel jPanelPaginacionDetalleDescuenPoliVenta=this.jPanelPaginacionDetalleDescuenPoliVenta;
		//final JScrollPane jScrollPanelDatosEdicionDetalleDescuenPoliVenta=this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta;
		final JPanel jPanelAccionesDetalleDescuenPoliVenta=this.jPanelAccionesDetalleDescuenPoliVenta;
		
		JPanel jPanelCamposAuxiliarDetalleDescuenPoliVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleDescuenPoliVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			jPanelCamposAuxiliarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPanelCamposDetalleDescuenPoliVenta;
			jPanelAccionesFormularioAuxiliarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPanelAccionesFormularioDetalleDescuenPoliVenta;
		}
		
		final JPanel jPanelCamposDetalleDescuenPoliVenta=jPanelCamposAuxiliarDetalleDescuenPoliVenta;
		final JPanel jPanelAccionesFormularioDetalleDescuenPoliVenta=jPanelAccionesFormularioAuxiliarDetalleDescuenPoliVenta;
		
		
		final JMenuBar jmenuBarDetalleDescuenPoliVenta=this.jmenuBarDetalleDescuenPoliVenta;		
		final JToolBar jTtoolBarDetalleDescuenPoliVenta=this.jTtoolBarDetalleDescuenPoliVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleDescuenPoliVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleDescuenPoliVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			jmenuBarDetalleAuxiliarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jmenuBarDetalleDetalleDescuenPoliVenta;
			jTtoolBarDetalleAuxiliarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTtoolBarDetalleDetalleDescuenPoliVenta;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleDescuenPoliVenta=jmenuBarDetalleAuxiliarDetalleDescuenPoliVenta;
		final JToolBar jTtoolBarDetalleDetalleDescuenPoliVenta=jTtoolBarDetalleAuxiliarDetalleDescuenPoliVenta;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleDescuenPoliVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleDescuenPoliVenta;
			processRunnable.jTableDatos=jTableDatosDetalleDescuenPoliVenta;
			processRunnable.jPanelCampos=jPanelCamposDetalleDescuenPoliVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleDescuenPoliVenta;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleDescuenPoliVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleDescuenPoliVenta;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleDescuenPoliVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleDescuenPoliVenta;
			processRunnable.jTtoolBar=jTtoolBarDetalleDescuenPoliVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleDescuenPoliVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleDescuenPoliVenta ,jPanelParametrosReportesDetalleDescuenPoliVenta, jTableDatosDetalleDescuenPoliVenta,/*jScrollPanelDatosDetalleDescuenPoliVenta,*/jPanelCamposDetalleDescuenPoliVenta,jPanelPaginacionDetalleDescuenPoliVenta, /*jScrollPanelDatosEdicionDetalleDescuenPoliVenta,*/ jPanelAccionesDetalleDescuenPoliVenta,jPanelAccionesFormularioDetalleDescuenPoliVenta,jmenuBarDetalleDescuenPoliVenta,jmenuBarDetalleDetalleDescuenPoliVenta,jTtoolBarDetalleDescuenPoliVenta,jTtoolBarDetalleDetalleDescuenPoliVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleDescuenPoliVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleDescuenPoliVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleDescuenPoliVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleDescuenPoliVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDescuenPoliVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleDescuenPoliVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleDescuenPoliVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDescuenPoliVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleDescuenPoliVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalledescuenpoliventaConstantesFunciones.getsFinalQueryDetalleDescuenPoliVenta();
		String  finalQueryPaginacionTodos=this.detalledescuenpoliventaConstantesFunciones.getsFinalQueryDetalleDescuenPoliVenta();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleDescuenPoliVentaConstantesFunciones.getArrayColumnasGlobalesNoDetalleDescuenPoliVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleDescuenPoliVentaConstantesFunciones.getArrayColumnasGlobalesDetalleDescuenPoliVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleDescuenPoliVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalledescuenpoliventasEliminados= new ArrayList<DetalleDescuenPoliVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleDescuenPoliVenta();
		
				///*DetalleDescuenPoliVentaSessionBean*/this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
			
			if(this.detalledescuenpoliventaSessionBean==null) {
				this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=DetalleDescuenPoliVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleDescuenPoliVentaConstantesFunciones.getClassesForeignKeysOfDetalleDescuenPoliVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalledescuenpoliventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalledescuenpoliventasAux= new ArrayList<DetalleDescuenPoliVenta>();
			
				
			detalledescuenpoliventaLogic.setDatosCliente(this.datosCliente);
			detalledescuenpoliventaLogic.setDatosDeep(this.datosDeep);
			detalledescuenpoliventaLogic.setIsConDeep(true);
			
			
			detalledescuenpoliventaLogic.getDetalleDescuenPoliVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalledescuenpoliventaLogic.getTodosDetalleDescuenPoliVentas(finalQueryGlobal,pagination);
					
					//detalledescuenpoliventaLogic.getTodosDetalleDescuenPoliVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()==null|| detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalledescuenpoliventasAux= new ArrayList<DetalleDescuenPoliVenta>();
							detalledescuenpoliventasAux.addAll(detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledescuenpoliventasAux= new ArrayList<DetalleDescuenPoliVenta>();
							detalledescuenpoliventasAux.addAll(detalledescuenpoliventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalledescuenpoliventaLogic.getTodosDetalleDescuenPoliVentas(finalQueryGlobal+"",this.pagination);												
							
							//detalledescuenpoliventaLogic.getTodosDetalleDescuenPoliVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleDescuenPoliVentas("Todos",detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalledescuenpoliventaLogic.setDetalleDescuenPoliVentas(new ArrayList<DetalleDescuenPoliVenta>());					
							detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().addAll(detalledescuenpoliventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledescuenpoliventas=new ArrayList<DetalleDescuenPoliVenta>();
							detalledescuenpoliventas.addAll(detalledescuenpoliventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleDescuenPoliVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleDescuenPoliVenta=this.idActual;
				
				} else if(this.idDetalleDescuenPoliVentaActual!=null && this.idDetalleDescuenPoliVentaActual!=0L) {
					idDetalleDescuenPoliVenta=idDetalleDescuenPoliVentaActual;
				}
				
					
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndicePorId(idDetalleDescuenPoliVenta);
				
				this.detalledescuenpoliventas=new ArrayList<DetalleDescuenPoliVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalledescuenpoliventaLogic.getEntity(idDetalleDescuenPoliVenta);
					
					//detalledescuenpoliventaLogic.getEntityWithConnection(idDetalleDescuenPoliVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledescuenpoliventaLogic.setDetalleDescuenPoliVentas(new ArrayList<DetalleDescuenPoliVenta>());
					detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().add(detalledescuenpoliventaLogic.getDetalleDescuenPoliVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledescuenpoliventas=new ArrayList<DetalleDescuenPoliVenta>();
					this.detalledescuenpoliventas.add(detalledescuenpoliventa);
				}
				
				if(detalledescuenpoliventaLogic.getDetalleDescuenPoliVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalledescuenpoliventaLogic.getDetalleDescuenPoliVentasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()==null||detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalledescuenpoliventas==null|| detalledescuenpoliventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventasAux=new ArrayList<DetalleDescuenPoliVenta>();
						detalledescuenpoliventasAux.addAll(detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledescuenpoliventasAux=new ArrayList<DetalleDescuenPoliVenta>();
							detalledescuenpoliventasAux.addAll(detalledescuenpoliventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalledescuenpoliventaLogic.getDetalleDescuenPoliVentasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleDescuenPoliVentas("FK_IdCliente",detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleDescuenPoliVentas("FK_IdCliente",detalledescuenpoliventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventaLogic.setDetalleDescuenPoliVentas(new ArrayList<DetalleDescuenPoliVenta>());
						detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().addAll(detalledescuenpoliventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledescuenpoliventas=new ArrayList<DetalleDescuenPoliVenta>();
							detalledescuenpoliventas.addAll(detalledescuenpoliventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalledescuenpoliventaLogic.getDetalleDescuenPoliVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()==null||detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalledescuenpoliventas==null|| detalledescuenpoliventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventasAux=new ArrayList<DetalleDescuenPoliVenta>();
						detalledescuenpoliventasAux.addAll(detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledescuenpoliventasAux=new ArrayList<DetalleDescuenPoliVenta>();
							detalledescuenpoliventasAux.addAll(detalledescuenpoliventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalledescuenpoliventaLogic.getDetalleDescuenPoliVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleDescuenPoliVentas("FK_IdEmpresa",detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleDescuenPoliVentas("FK_IdEmpresa",detalledescuenpoliventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventaLogic.setDetalleDescuenPoliVentas(new ArrayList<DetalleDescuenPoliVenta>());
						detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().addAll(detalledescuenpoliventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledescuenpoliventas=new ArrayList<DetalleDescuenPoliVenta>();
							detalledescuenpoliventas.addAll(detalledescuenpoliventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalledescuenpoliventaLogic.getDetalleDescuenPoliVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()==null||detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalledescuenpoliventas==null|| detalledescuenpoliventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventasAux=new ArrayList<DetalleDescuenPoliVenta>();
						detalledescuenpoliventasAux.addAll(detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledescuenpoliventasAux=new ArrayList<DetalleDescuenPoliVenta>();
							detalledescuenpoliventasAux.addAll(detalledescuenpoliventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalledescuenpoliventaLogic.getDetalleDescuenPoliVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleDescuenPoliVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleDescuenPoliVentas("FK_IdSucursal",detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleDescuenPoliVentas("FK_IdSucursal",detalledescuenpoliventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventaLogic.setDetalleDescuenPoliVentas(new ArrayList<DetalleDescuenPoliVenta>());
						detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().addAll(detalledescuenpoliventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledescuenpoliventas=new ArrayList<DetalleDescuenPoliVenta>();
							detalledescuenpoliventas.addAll(detalledescuenpoliventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleDescuenPoliVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleDescuenPoliVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalledescuenpoliventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalledescuenpoliventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleDescuenPoliVenta detalledescuenpoliventa) {
		Boolean permite=true;
		
		if(this.detalledescuenpoliventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleDescuenPoliVentaConstantesFunciones.getOrderByListaDetalleDescuenPoliVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleDescuenPoliVentaConstantesFunciones.getOrderByListaDetalleDescuenPoliVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventa:detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
				if(detalledescuenpoliventa.getsType().equals(Constantes2.S_TOTALES)) {
					detalledescuenpoliventaTotales=detalledescuenpoliventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventa:this.detalledescuenpoliventas) {
				if(detalledescuenpoliventa.getsType().equals(Constantes2.S_TOTALES)) {
					detalledescuenpoliventaTotales=detalledescuenpoliventa;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.detalledescuenpoliventaAux=new DetalleDescuenPoliVenta();
			this.detalledescuenpoliventaAux.setsType(Constantes2.S_TOTALES);
			this.detalledescuenpoliventaAux.setIsNew(false);
			this.detalledescuenpoliventaAux.setIsChanged(false);
			this.detalledescuenpoliventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleDescuenPoliVentaConstantesFunciones.TotalizarValoresFilaDetalleDescuenPoliVenta(this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas(),this.detalledescuenpoliventaAux);
				
				this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().add(this.detalledescuenpoliventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleDescuenPoliVentaConstantesFunciones.TotalizarValoresFilaDetalleDescuenPoliVenta(this.detalledescuenpoliventas,this.detalledescuenpoliventaAux);
				
				this.detalledescuenpoliventas.add(this.detalledescuenpoliventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalledescuenpoliventaTotales=new DetalleDescuenPoliVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().remove(detalledescuenpoliventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalledescuenpoliventas.remove(detalledescuenpoliventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalledescuenpoliventaTotales=new DetalleDescuenPoliVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventa:detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
				if(detalledescuenpoliventa.getsType().equals(Constantes2.S_TOTALES)) {
					detalledescuenpoliventaTotales=detalledescuenpoliventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleDescuenPoliVentaConstantesFunciones.TotalizarValoresFilaDetalleDescuenPoliVenta(this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas(),detalledescuenpoliventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleDescuenPoliVenta detalledescuenpoliventa:this.detalledescuenpoliventas) {
				if(detalledescuenpoliventa.getsType().equals(Constantes2.S_TOTALES)) {
					detalledescuenpoliventaTotales=detalledescuenpoliventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleDescuenPoliVentaConstantesFunciones.TotalizarValoresFilaDetalleDescuenPoliVenta(this.detalledescuenpoliventas,detalledescuenpoliventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleDescuenPoliVentasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleDescuenPoliVentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleDescuenPoliVentasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleDescuenPoliVentasFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledescuenpoliventaLogic.getDetalleDescuenPoliVentasFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleDescuenPoliVentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledescuenpoliventaLogic.getDetalleDescuenPoliVentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleDescuenPoliVentasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledescuenpoliventaLogic.getDetalleDescuenPoliVentasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosDetalleDescuenPoliVenta() {
		this.isPermisoTodoDetalleDescuenPoliVenta=false;
		this.isPermisoNuevoDetalleDescuenPoliVenta=false;
		this.isPermisoActualizarDetalleDescuenPoliVenta=false;
		this.isPermisoActualizarOriginalDetalleDescuenPoliVenta=false;
		this.isPermisoEliminarDetalleDescuenPoliVenta=false;
		this.isPermisoGuardarCambiosDetalleDescuenPoliVenta=false;
		this.isPermisoConsultaDetalleDescuenPoliVenta=false;
		this.isPermisoBusquedaDetalleDescuenPoliVenta=false;
		this.isPermisoReporteDetalleDescuenPoliVenta=false;		
		this.isPermisoOrdenDetalleDescuenPoliVenta=false;		
		this.isPermisoPaginacionMedioDetalleDescuenPoliVenta=false;		
		this.isPermisoPaginacionAltoDetalleDescuenPoliVenta=false;
		this.isPermisoPaginacionTodoDetalleDescuenPoliVenta=false;
		this.isPermisoCopiarDetalleDescuenPoliVenta=false;		
		this.isPermisoVerFormDetalleDescuenPoliVenta=false;		
		this.isPermisoDuplicarDetalleDescuenPoliVenta=false;		
		this.isPermisoOrdenDetalleDescuenPoliVenta=false;		
	}
	
	public void setPermisosUsuarioDetalleDescuenPoliVenta(Boolean isPermiso) {
		this.isPermisoTodoDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoNuevoDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoActualizarDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoActualizarOriginalDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoEliminarDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoGuardarCambiosDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoConsultaDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoBusquedaDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoReporteDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoOrdenDetalleDescuenPoliVenta=isPermiso;		
		this.isPermisoPaginacionMedioDetalleDescuenPoliVenta=isPermiso;		
		this.isPermisoPaginacionAltoDetalleDescuenPoliVenta=isPermiso;		
		this.isPermisoPaginacionTodoDetalleDescuenPoliVenta=isPermiso;		
		this.isPermisoCopiarDetalleDescuenPoliVenta=isPermiso;		
		this.isPermisoVerFormDetalleDescuenPoliVenta=isPermiso;		
		this.isPermisoDuplicarDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoOrdenDetalleDescuenPoliVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleDescuenPoliVenta(Boolean isPermiso) {
		//this.isPermisoTodoDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoNuevoDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoActualizarDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoActualizarOriginalDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoEliminarDetalleDescuenPoliVenta=isPermiso;
		this.isPermisoGuardarCambiosDetalleDescuenPoliVenta=isPermiso;
		//this.isPermisoConsultaDetalleDescuenPoliVenta=isPermiso;
		//this.isPermisoBusquedaDetalleDescuenPoliVenta=isPermiso;
		//this.isPermisoReporteDetalleDescuenPoliVenta=isPermiso;
		//this.isPermisoOrdenDetalleDescuenPoliVenta=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleDescuenPoliVenta=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleDescuenPoliVenta=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleDescuenPoliVenta=isPermiso;		
		//this.isPermisoCopiarDetalleDescuenPoliVenta=isPermiso;		
		//this.isPermisoDuplicarDetalleDescuenPoliVenta=isPermiso;
		//this.isPermisoOrdenDetalleDescuenPoliVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleDescuenPoliVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleDescuenPoliVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleDescuenPoliVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleDescuenPoliVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleDescuenPoliVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleDescuenPoliVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleDescuenPoliVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleDescuenPoliVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleDescuenPoliVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleDescuenPoliVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleDescuenPoliVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleDescuenPoliVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleDescuenPoliVenta=this.isPermisoActualizarDetalleDescuenPoliVenta;
			this.isPermisoEliminarDetalleDescuenPoliVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleDescuenPoliVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleDescuenPoliVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleDescuenPoliVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleDescuenPoliVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleDescuenPoliVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleDescuenPoliVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleDescuenPoliVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleDescuenPoliVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleDescuenPoliVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleDescuenPoliVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleDescuenPoliVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleDescuenPoliVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleDescuenPoliVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleDescuenPoliVenta.setToolTipText(this.jTableDatosDetalleDescuenPoliVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleDescuenPoliVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleDescuenPoliVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleDescuenPoliVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(DetalleDescuenPoliVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioDetalleDescuenPoliVenta() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyDetalleDescuenPoliVentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleDescuenPoliVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleDescuenPoliVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleDescuenPoliVentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleDescuenPoliVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleDescuenPoliVentaParameterReturnGeneral detalledescuenpoliventaReturnGeneral=new DetalleDescuenPoliVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalledescuenpoliventaConstantesFunciones.cargarid_empresaDetalleDescuenPoliVenta)
					 || (this.esRecargarFks && this.detalledescuenpoliventaConstantesFunciones.cargarid_empresaDetalleDescuenPoliVenta)) {

					if(!this.detalledescuenpoliventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalledescuenpoliventaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detalledescuenpoliventaConstantesFunciones.cargarid_sucursalDetalleDescuenPoliVenta)
					 || (this.esRecargarFks && this.detalledescuenpoliventaConstantesFunciones.cargarid_sucursalDetalleDescuenPoliVenta)) {

					if(!this.detalledescuenpoliventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detalledescuenpoliventaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.detalledescuenpoliventaConstantesFunciones.cargarid_clienteDetalleDescuenPoliVenta)
					 || (this.esRecargarFks && this.detalledescuenpoliventaConstantesFunciones.cargarid_clienteDetalleDescuenPoliVenta)) {

					if(!this.detalledescuenpoliventaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+detalledescuenpoliventaSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalledescuenpoliventaReturnGeneral=detalledescuenpoliventaLogic.cargarCombosLoteForeignKeyDetalleDescuenPoliVenta(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalledescuenpoliventaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detalledescuenpoliventaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=detalledescuenpoliventaReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleDescuenPoliVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detalledescuenpoliventaSessionBean==null) {
				this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
			}

			if(!this.detalledescuenpoliventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.detalledescuenpoliventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.detalledescuenpoliventaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleDescuenPoliVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleDescuenPoliVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleDescuenPoliVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleDescuenPoliVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(detalledescuenpoliventa.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detalledescuenpoliventa.getCliente()!=null && !sTipoEvento.equals("id_clienteDetalleDescuenPoliVenta")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(detalledescuenpoliventa.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleDescuenPoliVenta()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.detalledescuenpoliventaConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleDescuenPoliVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleDescuenPoliVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleDescuenPoliVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleDescuenPoliVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleDescuenPoliVenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleDescuenPoliVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleDescuenPoliVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta!=null && this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta!=null && this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta!=null && this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public DetalleDescuenPoliVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleDescuenPoliVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleDescuenPoliVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean(); 
		this.detalledescuenpoliventaConstantesFunciones=new DetalleDescuenPoliVentaConstantesFunciones(); 
		this.detalledescuenpoliventaBean=new DetalleDescuenPoliVenta();//(this.detalledescuenpoliventaConstantesFunciones); 		
		this.detalledescuenpoliventaReturnGeneral=new DetalleDescuenPoliVentaParameterReturnGeneral(); 
		
		this.detalledescuenpoliventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalledescuenpoliventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleDescuenPoliVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleDescuenPoliVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleDescuenPoliVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleDescuenPoliVenta(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.detalledescuenpoliventaConstantesFunciones=new DetalleDescuenPoliVentaConstantesFunciones(); 
			this.detalledescuenpoliventaBean=new DetalleDescuenPoliVenta();//this.detalledescuenpoliventaConstantesFunciones); 			
			this.detalledescuenpoliventaReturnGeneral=new DetalleDescuenPoliVentaParameterReturnGeneral(); 
		
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Descuen Poli Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalledescuenpoliventa=new DetalleDescuenPoliVenta();
			this.detalledescuenpoliventas = new ArrayList<DetalleDescuenPoliVenta>();
			this.detalledescuenpoliventasAux = new ArrayList<DetalleDescuenPoliVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic=new DetalleDescuenPoliVentaLogic();
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}
			
			//this.detalledescuenpoliventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalledescuenpoliventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta);	
					}
					
					if(this.jInternalFrameImportacionDetalleDescuenPoliVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleDescuenPoliVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleDescuenPoliVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleDescuenPoliVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta);
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setVisible(false);
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta);
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleDescuenPoliVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleDescuenPoliVenta);
					this.jInternalFrameImportacionDetalleDescuenPoliVenta.setVisible(false);
					this.jInternalFrameImportacionDetalleDescuenPoliVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleDescuenPoliVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleDescuenPoliVenta);
					this.jInternalFrameOrderByDetalleDescuenPoliVenta.setVisible(false);
					this.jInternalFrameOrderByDetalleDescuenPoliVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleDescuenPoliVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleDescuenPoliVentaConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.detalledescuenpoliventaReturnGeneral=new DetalleDescuenPoliVentaParameterReturnGeneral();
			
			this.detalledescuenpoliventaParameterGeneral=new DetalleDescuenPoliVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalledescuenpoliventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(DetalleDescuenPoliVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleDescuenPoliVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleDescuenPoliVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaCopiarDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaVerFormDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaOrdenDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleDescuenPoliVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleDescuenPoliVenta(false);
			
			this.setPermisosUsuarioDetalleDescuenPoliVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado() 
				|| (this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado() && this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleDescuenPoliVentaClasesRelacionadas();
			}
			
			if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleDescuenPoliVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleDescuenPoliVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleDescuenPoliVenta();
			}
			
			if(!this.isPermisoBusquedaDetalleDescuenPoliVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleDescuenPoliVenta,this.isPermisoPaginacionMedioDetalleDescuenPoliVenta,this.isPermisoPaginacionTodoDetalleDescuenPoliVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleDescuenPoliVentaConstantesFunciones.getTiposSeleccionarDetalleDescuenPoliVenta());
				
				this.tiposColumnasSelect=DetalleDescuenPoliVentaConstantesFunciones.getTiposSeleccionarDetalleDescuenPoliVenta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleDescuenPoliVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleDescuenPoliVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleDescuenPoliVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleDescuenPoliVenta() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalledescuenpoliventaImplementable= (DetalleDescuenPoliVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleDescuenPoliVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalledescuenpoliventaImplementableHome= (DetalleDescuenPoliVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleDescuenPoliVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalledescuenpoliventas= new ArrayList<DetalleDescuenPoliVenta>();
			this.detalledescuenpoliventasEliminados= new ArrayList<DetalleDescuenPoliVenta>();
						
			this.isEsNuevoDetalleDescuenPoliVenta=false;
			this.esParaAccionDesdeFormularioDetalleDescuenPoliVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleDescuenPoliVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleDescuenPoliVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleDescuenPoliVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleDescuenPoliVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleDescuenPoliVenta();
			}
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleDescuenPoliVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleDescuenPoliVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleDescuenPoliVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleDescuenPoliVenta")) {
				iIndex=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTabbedPaneRelacionesDetalleDescuenPoliVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTabbedPaneRelacionesDetalleDescuenPoliVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleDescuenPoliVenta();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyDetalleDescuenPoliVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleDescuenPoliVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleDescuenPoliVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleDescuenPoliVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleDescuenPoliVenta();
		
		this.cargarCombosFrameForeignKeyDetalleDescuenPoliVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleDescuenPoliVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleDescuenPoliVenta();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleDescuenPoliVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
			
			if(jTableDatosDetalleDescuenPoliVenta.getRowCount()>=1) {
				jTableDatosDetalleDescuenPoliVenta.removeRowSelectionInterval(0, jTableDatosDetalleDescuenPoliVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleDescuenPoliVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleDescuenPoliVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleDescuenPoliVenta(true);			
			//this.detalledescuenpoliventa=new DetalleDescuenPoliVenta();
			//this.detalledescuenpoliventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleDescuenPoliVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta() ;
			
			if(DetalleDescuenPoliVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleDescuenPoliVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalledescuenpoliventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);				
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
			if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleDescuenPoliVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleDescuenPoliVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleDescuenPoliVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleDescuenPoliVenta.getSelectedRows().length;			
			}
			
			detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleDescuenPoliVenta--;			
				//DetalleDescuenPoliVenta detalledescuenpoliventaAux= new DetalleDescuenPoliVenta();			
				//detalledescuenpoliventaAux.setId(this.iIdNuevoDetalleDescuenPoliVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleDescuenPoliVenta detalledescuenpoliventaOrigen=new DetalleDescuenPoliVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleDescuenPoliVenta detalledescuenpoliventaOrigen : detalledescuenpoliventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalledescuenpoliventaOrigen =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalledescuenpoliventaOrigen =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleDescuenPoliVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalledescuenpoliventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleDescuenPoliVenta(detalledescuenpoliventaOrigen,this.detalledescuenpoliventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().add(this.detalledescuenpoliventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalledescuenpoliventas.add(this.detalledescuenpoliventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
				
				this.jTableDatosDetalleDescuenPoliVenta.setRowSelectionInterval(this.getIndiceNuevoDetalleDescuenPoliVenta(), this.getIndiceNuevoDetalleDescuenPoliVenta());
				
				int iLastRow =  this.jTableDatosDetalleDescuenPoliVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleDescuenPoliVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleDescuenPoliVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();									
		
			DetalleDescuenPoliVenta detalledescuenpoliventaOrigen=new DetalleDescuenPoliVenta();
			DetalleDescuenPoliVenta detalledescuenpoliventaDestino=new DetalleDescuenPoliVenta();
				
			detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleDescuenPoliVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalledescuenpoliventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleDescuenPoliVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventaOrigen =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalledescuenpoliventaOrigen =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalledescuenpoliventaDestino =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalledescuenpoliventaDestino =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalledescuenpoliventaOrigen =detalledescuenpoliventasSeleccionados.get(0);
				detalledescuenpoliventaDestino =detalledescuenpoliventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleDescuenPoliVenta(detalledescuenpoliventaOrigen,detalledescuenpoliventaDestino,true,false);
				
				detalledescuenpoliventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalledescuenpoliventaDestino,detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalledescuenpoliventaDestino,detalledescuenpoliventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
				
				//this.jTableDatosDetalleDescuenPoliVenta.setRowSelectionInterval(this.getIndiceNuevoDetalleDescuenPoliVenta(), this.getIndiceNuevoDetalleDescuenPoliVenta());
				
				int iLastRow =  this.jTableDatosDetalleDescuenPoliVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleDescuenPoliVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleDescuenPoliVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleDescuenPoliVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(!isVisible);
			this.jPanelPaginacionDetalleDescuenPoliVenta.setVisible(!isVisible);
			this.jPanelAccionesDetalleDescuenPoliVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleDescuenPoliVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleDescuenPoliVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleDescuenPoliVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleDescuenPoliVenta();
			
			this.abrirFrameOrderByDetalleDescuenPoliVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleDescuenPoliVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleDescuenPoliVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleDescuenPoliVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setSize(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.iWidthFormulario,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jContentPaneDetalleDetalleDescuenPoliVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTabbedPaneRelacionesDetalleDescuenPoliVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jContentPaneDetalleDetalleDescuenPoliVenta.getWidth(),DetalleDescuenPoliVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTabbedPaneRelacionesDetalleDescuenPoliVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jContentPaneDetalleDetalleDescuenPoliVenta.getWidth(),DetalleDescuenPoliVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTabbedPaneRelacionesDetalleDescuenPoliVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jContentPaneDetalleDetalleDescuenPoliVenta.getWidth(),DetalleDescuenPoliVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleDescuenPoliVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleDescuenPoliVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleDescuenPoliVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleDescuenPoliVenta,false,this);
				} else {
					this.jInternalFrameOrderByDetalleDescuenPoliVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleDescuenPoliVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleDescuenPoliVenta);
				this.jInternalFrameOrderByDetalleDescuenPoliVenta.setVisible(false);
				this.jInternalFrameOrderByDetalleDescuenPoliVenta.setSelected(false);
				
				this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleDescuenPoliVenta"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleDescuenPoliVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleDescuenPoliVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleDescuenPoliVenta==null) {
				
				this.jInternalFrameImportacionDetalleDescuenPoliVenta=new ImportacionJInternalFrame(DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleDescuenPoliVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleDescuenPoliVenta);
				this.jInternalFrameImportacionDetalleDescuenPoliVenta.setVisible(false);
				this.jInternalFrameImportacionDetalleDescuenPoliVenta.setSelected(false);


				this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleDescuenPoliVenta"));
				this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleDescuenPoliVenta"));
				this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleDescuenPoliVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleDescuenPoliVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta==null) {
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta=new ReporteDinamicoJInternalFrame(DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta);
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleDescuenPoliVenta"));
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleDescuenPoliVenta"));
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleDescuenPoliVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleDescuenPoliVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleDescuenPoliVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleDescuenPoliVenta);
			
	       	this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.dispose();
			//this.jInternalFrameDetalleFormDetalleDescuenPoliVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleDescuenPoliVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleDescuenPoliVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleDescuenPoliVenta.setVisible(true);
	        this.jInternalFrameImportacionDetalleDescuenPoliVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleDescuenPoliVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setVisible(true);
	        this.jInternalFrameOrderByDetalleDescuenPoliVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleDescuenPoliVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleDescuenPoliVenta.setVisible(false);
	        this.jInternalFrameOrderByDetalleDescuenPoliVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleDescuenPoliVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleDescuenPoliVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleDescuenPoliVenta.setVisible(false);
	        this.jInternalFrameImportacionDetalleDescuenPoliVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleDescuenPoliVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleDescuenPoliVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleDescuenPoliVenta(true);
			//this.isEsNuevoDetalleDescuenPoliVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleDescuenPoliVenta(false) ;
			
			if(detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleDescuenPoliVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleDescuenPoliVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleDescuenPoliVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleDescuenPoliVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleDescuenPoliVenta(true);
			//this.isEsNuevoDetalleDescuenPoliVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalledescuenpoliventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleDescuenPoliVenta(false) ;
			
			if(DetalleDescuenPoliVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleDescuenPoliVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.detalledescuenpoliventaConstantesFunciones.cargarid_clienteDetalleDescuenPoliVenta) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleDescuenPoliVenta(false);
			
			//if(!this.isEsNuevoDetalleDescuenPoliVenta) {								
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
				
			}
			
			if(this.permiteMantenimiento(this.detalledescuenpoliventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleDescuenPoliVenta=true;
					this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
					this.isEsNuevoDetalleDescuenPoliVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleDescuenPoliVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleDescuenPoliVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleDescuenPoliVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta(false);
				
				this.habilitarDeshabilitarControlesDetalleDescuenPoliVenta(false);
			
												
				
				if(DetalleDescuenPoliVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleDescuenPoliVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,detalledescuenpoliventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleDescuenPoliVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalledescuenpoliventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalledescuenpoliventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				this.detalledescuenpoliventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				this.detalledescuenpoliventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalledescuenpoliventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleDescuenPoliVentaModel) this.jTableDatosDetalleDescuenPoliVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleDescuenPoliVenta=true;
				this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
				this.isEsNuevoDetalleDescuenPoliVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleDescuenPoliVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta(false);
				
				this.habilitarDeshabilitarControlesDetalleDescuenPoliVenta(false);
				
				
				
				if(DetalleDescuenPoliVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleDescuenPoliVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleDescuenPoliVenta.getRowCount()>=1) {
				jTableDatosDetalleDescuenPoliVenta.removeRowSelectionInterval(0, jTableDatosDetalleDescuenPoliVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleDescuenPoliVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleDescuenPoliVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta(false) ;
			
			this.isEsNuevoDetalleDescuenPoliVenta=false;
			
			if(DetalleDescuenPoliVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleDescuenPoliVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
				
				//SI ES MANUAL
				if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleDescuenPoliVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleDescuenPoliVenta--;			
			//DetalleDescuenPoliVenta detalledescuenpoliventaAux= new DetalleDescuenPoliVenta();			
			//detalledescuenpoliventaAux.setId(this.iIdNuevoDetalleDescuenPoliVenta);
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleDescuenPoliVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
			
			this.detalledescuenpoliventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().add(this.detalledescuenpoliventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalledescuenpoliventas.add(this.detalledescuenpoliventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
			
			this.jTableDatosDetalleDescuenPoliVenta.setRowSelectionInterval(this.getIndiceNuevoDetalleDescuenPoliVenta(), this.getIndiceNuevoDetalleDescuenPoliVenta());
			
			int iLastRow =  this.jTableDatosDetalleDescuenPoliVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleDescuenPoliVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleDescuenPoliVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
			
			//SI ES MANUAL
			if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleDescuenPoliVenta();
			}
			
			//this.abrirFrameTreeDetalleDescuenPoliVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Descuen Poli VentaS ?", "MANTENIMIENTO DE Detalle Descuen Poli Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleDescuenPoliVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleDescuenPoliVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalledescuenpoliventaReturnGeneral=detalledescuenpoliventaLogic.procesarImportacionDetalleDescuenPoliVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalledescuenpoliventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleDescuenPoliVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleDescuenPoliVenta.setFileImportacion(this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleDescuenPoliVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleDescuenPoliVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();		

		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleDescuenPoliVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleDescuenPoliVentaBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteDetalleDescuenPoliVentas("Todos",detalledescuenpoliventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();		
		
		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledescuenpoliventa";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("DetalleDescuenPoliVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleDescuenPoliVenta detalledescuenpoliventa:detalledescuenpoliventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledescuenpoliventa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleDescuenPoliVenta detalledescuenpoliventa:detalledescuenpoliventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledescuenpoliventa.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(DetalleDescuenPoliVenta detalledescuenpoliventa:detalledescuenpoliventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledescuenpoliventa.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(DetalleDescuenPoliVenta detalledescuenpoliventa:detalledescuenpoliventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledescuenpoliventa.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleDescuenPoliVenta detalledescuenpoliventa:detalledescuenpoliventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalledescuenpoliventa.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelDetalleDescuenPoliVenta(row);				
			//	iRow++;
			//}				
			
			//for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleDescuenPoliVenta(detalledescuenpoliventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
			
			//SI ES MANUAL
			if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleDescuenPoliVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
			
			//SI ES MANUAL
			if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleDescuenPoliVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
			
			//SI ES MANUAL
			if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleDescuenPoliVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleDescuenPoliVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleDescuenPoliVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleDescuenPoliVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleDescuenPoliVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleDescuenPoliVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleDescuenPoliVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleDescuenPoliVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleDescuenPoliVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleDescuenPoliVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleDescuenPoliVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleDescuenPoliVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleDescuenPoliVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleDescuenPoliVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleDescuenPoliVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleDescuenPoliVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleDescuenPoliVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta();
		
		this.inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleDescuenPoliVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleDescuenPoliVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleDescuenPoliVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleDescuenPoliVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jCheckBoxPostAccionNuevoDetalleDescuenPoliVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jCheckBoxPostAccionSinCerrarDetalleDescuenPoliVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jCheckBoxPostAccionSinMensajeDetalleDescuenPoliVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleDescuenPoliVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jCheckBoxPostAccionNuevoDetalleDescuenPoliVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jCheckBoxPostAccionSinCerrarDetalleDescuenPoliVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jCheckBoxPostAccionSinMensajeDetalleDescuenPoliVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleDescuenPoliVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleDescuenPoliVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleDescuenPoliVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleDescuenPoliVenta() throws Exception {
		try	{
			if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleDescuenPoliVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleDescuenPoliVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleDescuenPoliVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleDescuenPoliVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleDescuenPoliVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleDescuenPoliVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleDescuenPoliVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.addItem(reporte);
			}
			
			
			if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleDescuenPoliVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleDescuenPoliVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleDescuenPoliVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta!=null) {
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta!=null) {
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleDescuenPoliVentaConstantesFunciones.getTiposSeleccionarDetalleDescuenPoliVenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleDescuenPoliVentaConstantesFunciones.getTiposSeleccionarDetalleDescuenPoliVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleDescuenPoliVentaConstantesFunciones.getTiposSeleccionarDetalleDescuenPoliVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleDescuenPoliVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteDetalleDescuenPoliVenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleDescuenPoliVenta(Boolean esInicializar) throws Exception {				
		if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleDescuenPoliVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleDescuenPoliVenta() throws Exception {
		this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleDescuenPoliVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleDescuenPoliVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleDescuenPoliVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalledescuenpoliventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleDescuenPoliVenta.setModel(new DetalleDescuenPoliVentaModel(this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleDescuenPoliVenta.setModel(new DetalleDescuenPoliVentaModel(this.detalledescuenpoliventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleDescuenPoliVenta!=null && this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleDescuenPoliVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO,detalledescuenpoliventaConstantesFunciones.resaltarSeleccionarDetalleDescuenPoliVenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleDescuenPoliVentaConstantesFunciones.SCLASSWEBTITULO,detalledescuenpoliventaConstantesFunciones.resaltarSeleccionarDetalleDescuenPoliVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,DetalleDescuenPoliVentaConstantesFunciones.LABEL_ID));

		if(this.detalledescuenpoliventaConstantesFunciones.mostraridDetalleDescuenPoliVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDescuenPoliVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalledescuenpoliventaConstantesFunciones.resaltaridDetalleDescuenPoliVenta,this.detalledescuenpoliventaConstantesFunciones.activaridDetalleDescuenPoliVenta,iSizeTabla,this,true,"idDetalleDescuenPoliVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalledescuenpoliventaConstantesFunciones.resaltaridDetalleDescuenPoliVenta,this.detalledescuenpoliventaConstantesFunciones.activaridDetalleDescuenPoliVenta,this,true,"idDetalleDescuenPoliVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalledescuenpoliventaConstantesFunciones.mostrarid_empresaDetalleDescuenPoliVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalledescuenpoliventaConstantesFunciones.resaltarid_empresaDetalleDescuenPoliVenta,this,this.detalledescuenpoliventaConstantesFunciones.activarid_empresaDetalleDescuenPoliVenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalledescuenpoliventaConstantesFunciones.resaltarid_empresaDetalleDescuenPoliVenta,this,this.detalledescuenpoliventaConstantesFunciones.activarid_empresaDetalleDescuenPoliVenta,false,"id_empresaDetalleDescuenPoliVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detalledescuenpoliventaConstantesFunciones.mostrarid_sucursalDetalleDescuenPoliVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detalledescuenpoliventaConstantesFunciones.resaltarid_sucursalDetalleDescuenPoliVenta,this,this.detalledescuenpoliventaConstantesFunciones.activarid_sucursalDetalleDescuenPoliVenta,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detalledescuenpoliventaConstantesFunciones.resaltarid_sucursalDetalleDescuenPoliVenta,this,this.detalledescuenpoliventaConstantesFunciones.activarid_sucursalDetalleDescuenPoliVenta,false,"id_sucursalDetalleDescuenPoliVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE));

		if(this.detalledescuenpoliventaConstantesFunciones.mostrarid_clienteDetalleDescuenPoliVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.detalledescuenpoliventaConstantesFunciones.resaltarid_clienteDetalleDescuenPoliVenta,this,this.detalledescuenpoliventaConstantesFunciones.activarid_clienteDetalleDescuenPoliVenta,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.detalledescuenpoliventaConstantesFunciones.resaltarid_clienteDetalleDescuenPoliVenta,this,this.detalledescuenpoliventaConstantesFunciones.activarid_clienteDetalleDescuenPoliVenta,true,"id_clienteDetalleDescuenPoliVenta","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR));

		if(this.detalledescuenpoliventaConstantesFunciones.mostrarvalorDetalleDescuenPoliVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalledescuenpoliventaConstantesFunciones.resaltarvalorDetalleDescuenPoliVenta,this.detalledescuenpoliventaConstantesFunciones.activarvalorDetalleDescuenPoliVenta,iSizeTabla,this,true,"valorDetalleDescuenPoliVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalledescuenpoliventaConstantesFunciones.resaltarvalorDetalleDescuenPoliVenta,this.detalledescuenpoliventaConstantesFunciones.activarvalorDetalleDescuenPoliVenta,this,true,"valorDetalleDescuenPoliVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detalledescuenpoliventaConstantesFunciones.mostrardescripcionDetalleDescuenPoliVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalledescuenpoliventaConstantesFunciones.resaltardescripcionDetalleDescuenPoliVenta,this.detalledescuenpoliventaConstantesFunciones.activardescripcionDetalleDescuenPoliVenta,iSizeTabla,this,true,"descripcionDetalleDescuenPoliVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalledescuenpoliventaConstantesFunciones.resaltardescripcionDetalleDescuenPoliVenta,this.detalledescuenpoliventaConstantesFunciones.activardescripcionDetalleDescuenPoliVenta,this,true,"descripcionDetalleDescuenPoliVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleDescuenPoliVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleDescuenPoliVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleDescuenPoliVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleDescuenPoliVenta.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosDetalleDescuenPoliVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleDescuenPoliVenta.moveColumn(this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleDescuenPoliVenta.moveColumn(this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleDescuenPoliVenta.moveColumn(this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleDescuenPoliVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleDescuenPoliVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleDescuenPoliVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleDescuenPoliVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleDescuenPoliVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleDescuenPoliVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalledescuenpoliventas.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosDetalleDescuenPoliVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleDescuenPoliVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleDescuenPoliVenta();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoDetalleDescuenPoliVenta=false;
					
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
				if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleDescuenPoliVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalledescuenpoliventa.getsType().equals("DUPLICADO")
				   || this.detalledescuenpoliventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleDescuenPoliVenta=true;
				
				} else {
					this.isEsNuevoDetalleDescuenPoliVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
					if(this.detalledescuenpoliventa.getId()>=0 && !this.detalledescuenpoliventa.getIsNew()) {						
						this.isEsNuevoDetalleDescuenPoliVenta=false;
						
					} else {
						this.isEsNuevoDetalleDescuenPoliVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleDescuenPoliVenta(esRelaciones);						
				
				this.seleccionarDetalleDescuenPoliVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalledescuenpoliventa.getId()<0) {
					this.isEsNuevoDetalleDescuenPoliVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleDescuenPoliVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleDescuenPoliVenta(evt,rowIndex);
				}	
				
				if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleDescuenPoliVenta: " + this.dDif); 
					}
				}								
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleDescuenPoliVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalledescuenpoliventa)) {
					if(this.detalledescuenpoliventa.getId()>0) {
						this.detalledescuenpoliventa.setIsDeleted(true);
						
						this.detalledescuenpoliventasEliminados.add(this.detalledescuenpoliventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().remove(this.detalledescuenpoliventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalledescuenpoliventas.remove(this.detalledescuenpoliventa);				
					}
					
					
					((DetalleDescuenPoliVentaModel) this.jTableDatosDetalleDescuenPoliVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleDescuenPoliVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleDescuenPoliVenta) {
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleDescuenPoliVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detalledescuenpoliventaConstantesFunciones.cargarid_empresaDetalleDescuenPoliVenta || this.detalledescuenpoliventaConstantesFunciones.event_dependid_empresaDetalleDescuenPoliVenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalledescuenpoliventa.getid_empresa());
									//this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalledescuenpoliventa.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalledescuenpoliventa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalledescuenpoliventa.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detalledescuenpoliventaConstantesFunciones.cargarid_sucursalDetalleDescuenPoliVenta || this.detalledescuenpoliventaConstantesFunciones.event_dependid_sucursalDetalleDescuenPoliVenta) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detalledescuenpoliventa.getid_sucursal());
									//this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detalledescuenpoliventa.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detalledescuenpoliventa.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detalledescuenpoliventa.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.detalledescuenpoliventaConstantesFunciones.cargarid_clienteDetalleDescuenPoliVenta || this.detalledescuenpoliventaConstantesFunciones.event_dependid_clienteDetalleDescuenPoliVenta) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.detalledescuenpoliventa.getid_cliente());
									//this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(detalledescuenpoliventa.getCliente()!=null) {
							this.clientesForeignKey.add(detalledescuenpoliventa.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.detalledescuenpoliventa.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleDescuenPoliVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleDescuenPoliVenta(detalledescuenpoliventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleDescuenPoliVenta(detalledescuenpoliventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleDescuenPoliVenta(detalledescuenpoliventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleDescuenPoliVenta(detalledescuenpoliventa);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.setText(detalledescuenpoliventa.getId().toString());
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextFieldvalorDetalleDescuenPoliVenta.setText(detalledescuenpoliventa.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextAreadescripcionDetalleDescuenPoliVenta.setText(detalledescuenpoliventa.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleDescuenPoliVenta detalledescuenpoliventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalledescuenpoliventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleDescuenPoliVenta detalledescuenpoliventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalledescuenpoliventaLocal=this.detalledescuenpoliventa;
			} else {
				detalledescuenpoliventaLocal=this.detalledescuenpoliventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalledescuenpoliventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleDescuenPoliVenta(detalledescuenpoliventaLocal,true);
					
					if(detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalledescuenpoliventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalledescuenpoliventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(detalledescuenpoliventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(detalledescuenpoliventa);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(detalledescuenpoliventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.getText()==null || this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.getText()=="" || this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.setText("0");
			}

			if(conColumnasBase) {detalledescuenpoliventa.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleDescuenPoliVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelIdDetalleDescuenPoliVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalledescuenpoliventa.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextFieldvalorDetalleDescuenPoliVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelvalorDetalleDescuenPoliVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalledescuenpoliventa.setdescripcion(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextAreadescripcionDetalleDescuenPoliVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabeldescripcionDetalleDescuenPoliVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventaBean,DetalleDescuenPoliVenta detalledescuenpoliventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalledescuenpoliventaBean.getid_cliente()!=null && !detalledescuenpoliventaBean.getid_cliente().equals(-1L))) {detalledescuenpoliventa.setid_cliente(detalledescuenpoliventaBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventaOrigen,DetalleDescuenPoliVenta detalledescuenpoliventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalledescuenpoliventaOrigen.getId()!=null && !detalledescuenpoliventaOrigen.getId().equals(0L))) {detalledescuenpoliventa.setId(detalledescuenpoliventaOrigen.getId());}}
			if(conDefault || (!conDefault && detalledescuenpoliventaOrigen.getid_cliente()!=null && !detalledescuenpoliventaOrigen.getid_cliente().equals(-1L))) {detalledescuenpoliventa.setid_cliente(detalledescuenpoliventaOrigen.getid_cliente());}
			if(conDefault || (!conDefault && detalledescuenpoliventaOrigen.getvalor()!=null && !detalledescuenpoliventaOrigen.getvalor().equals(0.0))) {detalledescuenpoliventa.setvalor(detalledescuenpoliventaOrigen.getvalor());}
			if(conDefault || (!conDefault && detalledescuenpoliventaOrigen.getdescripcion()!=null && !detalledescuenpoliventaOrigen.getdescripcion().equals(""))) {detalledescuenpoliventa.setdescripcion(detalledescuenpoliventaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.setText(detalledescuenpoliventa.getId().toString());
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextFieldvalorDetalleDescuenPoliVenta.setText(detalledescuenpoliventa.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextAreadescripcionDetalleDescuenPoliVenta.setText(detalledescuenpoliventa.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleDescuenPoliVenta(DetalleDescuenPoliVentaBean detalledescuenpoliventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.setText(detalledescuenpoliventaBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextFieldvalorDetalleDescuenPoliVenta.setText(detalledescuenpoliventaBean.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextAreadescripcionDetalleDescuenPoliVenta.setText(detalledescuenpoliventaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleDescuenPoliVenta(DetalleDescuenPoliVentaParameterReturnGeneral detalledescuenpoliventaReturnGeneral,DetalleDescuenPoliVentaBean detalledescuenpoliventaBean,Boolean conDefault) throws Exception { 
		try {
			DetalleDescuenPoliVenta detalledescuenpoliventaLocal=new DetalleDescuenPoliVenta();
			
			detalledescuenpoliventaLocal=detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalledescuenpoliventaLocal.getId()!=null && !detalledescuenpoliventaLocal.getId().equals(0L))) {detalledescuenpoliventaBean.setId(detalledescuenpoliventaLocal.getId());}}
			if(conDefault || (!conDefault && detalledescuenpoliventaLocal.getid_cliente()!=null && !detalledescuenpoliventaLocal.getid_cliente().equals(-1L))) {detalledescuenpoliventaBean.setid_cliente(detalledescuenpoliventaLocal.getid_cliente());}
			if(conDefault || (!conDefault && detalledescuenpoliventaLocal.getvalor()!=null && !detalledescuenpoliventaLocal.getvalor().equals(0.0))) {detalledescuenpoliventaBean.setvalor(detalledescuenpoliventaLocal.getvalor());}
			if(conDefault || (!conDefault && detalledescuenpoliventaLocal.getdescripcion()!=null && !detalledescuenpoliventaLocal.getdescripcion().equals(""))) {detalledescuenpoliventaBean.setdescripcion(detalledescuenpoliventaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleDescuenPoliVentaGenerico(Long idDetalleDescuenPoliVentaSeleccionado,JComboBox jComboBoxDetalleDescuenPoliVenta,List<DetalleDescuenPoliVenta> detalledescuenpoliventasLocal)throws Exception {
		try {
			DetalleDescuenPoliVenta  detalledescuenpoliventaTemp=null;

			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventasLocal) {
				if(detalledescuenpoliventaAux.getId()!=null && detalledescuenpoliventaAux.getId().equals(idDetalleDescuenPoliVentaSeleccionado)) {
					detalledescuenpoliventaTemp=detalledescuenpoliventaAux;
					break;
				}
			}

			jComboBoxDetalleDescuenPoliVenta.setSelectedItem(detalledescuenpoliventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleDescuenPoliVentaGenerico(JComboBox jComboBoxDetalleDescuenPoliVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleDescuenPoliVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleDescuenPoliVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleDescuenPoliVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleDescuenPoliVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleDescuenPoliVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleDescuenPoliVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalledescuenpoliventa=(DetalleDescuenPoliVenta) detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalledescuenpoliventa =(DetalleDescuenPoliVenta) detalledescuenpoliventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalledescuenpoliventa.getIsNew() && !detalledescuenpoliventa.getIsChanged() && !detalledescuenpoliventa.getIsDeleted()) {
				sDescripcion=detalledescuenpoliventa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalledescuenpoliventa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detalledescuenpoliventa.getIsNew() && !detalledescuenpoliventa.getIsChanged() && !detalledescuenpoliventa.getIsDeleted()) {
				sDescripcion=detalledescuenpoliventa.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detalledescuenpoliventa.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!detalledescuenpoliventa.getIsNew() && !detalledescuenpoliventa.getIsChanged() && !detalledescuenpoliventa.getIsDeleted()) {
				sDescripcion=detalledescuenpoliventa.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=detalledescuenpoliventa.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleDescuenPoliVenta detalledescuenpoliventaRow=new DetalleDescuenPoliVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalledescuenpoliventaRow=(DetalleDescuenPoliVenta) detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalledescuenpoliventaRow=(DetalleDescuenPoliVenta) detalledescuenpoliventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta && this.isPermisoNuevoDetalleDescuenPoliVenta));			
			this.jButtonDuplicarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta && this.isPermisoDuplicarDetalleDescuenPoliVenta));			
			this.jButtonCopiarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaCopiarDetalleDescuenPoliVenta && this.isPermisoCopiarDetalleDescuenPoliVenta));
			this.jButtonVerFormDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaVerFormDetalleDescuenPoliVenta && this.isPermisoVerFormDetalleDescuenPoliVenta));
			
			this.jButtonAbrirOrderByDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleDescuenPoliVenta && this.isPermisoOrdenDetalleDescuenPoliVenta));			
			
			this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta && this.isPermisoNuevoDetalleDescuenPoliVenta));			
			this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta && this.isPermisoNuevoDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonModificarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta && this.isPermisoActualizarDetalleDescuenPoliVenta));	
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta && this.isPermisoActualizarDetalleDescuenPoliVenta));	
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta && this.isPermisoEliminarDetalleDescuenPoliVenta));
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarDetalleDescuenPoliVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta);							
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta && this.isPermisoNuevoDetalleDescuenPoliVenta));						
			this.jButtonDuplicarToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta && this.isPermisoDuplicarDetalleDescuenPoliVenta));						
			this.jButtonCopiarToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaCopiarDetalleDescuenPoliVenta && this.isPermisoCopiarDetalleDescuenPoliVenta));			
			this.jButtonVerFormToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaVerFormDetalleDescuenPoliVenta && this.isPermisoVerFormDetalleDescuenPoliVenta));			
			this.jButtonAbrirOrderByToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleDescuenPoliVenta && this.isPermisoOrdenDetalleDescuenPoliVenta));
			this.jButtonNuevoRelacionesToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta && this.isPermisoNuevoDetalleDescuenPoliVenta));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta && this.isPermisoNuevoDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));			
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonModificarToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta && this.isPermisoActualizarDetalleDescuenPoliVenta));	
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta  && this.isPermisoActualizarDetalleDescuenPoliVenta));	
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta && this.isPermisoEliminarDetalleDescuenPoliVenta));
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarToolBarDetalleDescuenPoliVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta);				
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta && this.isPermisoNuevoDetalleDescuenPoliVenta));			
			this.jMenuItemDuplicarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta && this.isPermisoDuplicarDetalleDescuenPoliVenta));			
			this.jMenuItemCopiarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaCopiarDetalleDescuenPoliVenta && this.isPermisoCopiarDetalleDescuenPoliVenta));			
			this.jMenuItemVerFormDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaVerFormDetalleDescuenPoliVenta && this.isPermisoVerFormDetalleDescuenPoliVenta));			
			this.jMenuItemAbrirOrderByDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleDescuenPoliVenta && this.isPermisoOrdenDetalleDescuenPoliVenta));			
			//this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleDescuenPoliVenta && this.isPermisoOrdenDetalleDescuenPoliVenta));
			this.jMenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleDescuenPoliVenta && this.isPermisoOrdenDetalleDescuenPoliVenta));			
			//this.jMenuItemDetalleMostrarOcultarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaOrdenDetalleDescuenPoliVenta && this.isPermisoOrdenDetalleDescuenPoliVenta));			
			this.jMenuItemNuevoRelacionesDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta && this.isPermisoNuevoDetalleDescuenPoliVenta));			
			this.jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta && this.isPermisoNuevoDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));									
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemModificarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta && this.isPermisoActualizarDetalleDescuenPoliVenta));	
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemActualizarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta && this.isPermisoActualizarDetalleDescuenPoliVenta));	
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemEliminarDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta && this.isPermisoEliminarDetalleDescuenPoliVenta));
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemCancelarDetalleDescuenPoliVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta);				
			}
			
			this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));						
			this.jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=this.jButtonNuevoDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta=this.jButtonDuplicarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaCopiarDetalleDescuenPoliVenta=this.jButtonCopiarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaVerFormDetalleDescuenPoliVenta=this.jButtonVerFormDetalleDescuenPoliVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleDescuenPoliVenta=this.jButtonAbrirOrderByDetalleDescuenPoliVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=this.jButtonModificarDetalleDescuenPoliVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosDetalleDescuenPoliVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=this.jButtonNuevoToolBarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=this.jButtonNuevoRelacionesToolBarDetalleDescuenPoliVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonModificarToolBarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarToolBarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarToolBarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarToolBarDetalleDescuenPoliVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=this.jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=this.jButtonGuardarCambiosTablaToolBarDetalleDescuenPoliVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=this.jMenuItemNuevoDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=this.jMenuItemNuevoRelacionesDetalleDescuenPoliVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemModificarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemActualizarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemEliminarDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemCancelarDetalleDescuenPoliVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=this.jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleDescuenPoliVenta(Boolean esInicializar) {
		if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
				//if(this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleDescuenPoliVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleDescuenPoliVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleDescuenPoliVenta() {
		this.jButtonNuevoDetalleDescuenPoliVenta.setVisible(this.isPermisoNuevoDetalleDescuenPoliVenta);			
		this.jButtonDuplicarDetalleDescuenPoliVenta.setVisible(this.isPermisoDuplicarDetalleDescuenPoliVenta);			
		this.jButtonCopiarDetalleDescuenPoliVenta.setVisible(this.isPermisoCopiarDetalleDescuenPoliVenta);			
		this.jButtonVerFormDetalleDescuenPoliVenta.setVisible(this.isPermisoVerFormDetalleDescuenPoliVenta);			
		
		this.jButtonAbrirOrderByDetalleDescuenPoliVenta.setVisible(this.isPermisoOrdenDetalleDescuenPoliVenta);					
		
		this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.setVisible(this.isPermisoNuevoDetalleDescuenPoliVenta);			
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonModificarDetalleDescuenPoliVenta.setVisible(this.isPermisoActualizarDetalleDescuenPoliVenta);	
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarDetalleDescuenPoliVenta.setVisible(this.isPermisoActualizarDetalleDescuenPoliVenta);	
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarDetalleDescuenPoliVenta.setVisible(this.isPermisoEliminarDetalleDescuenPoliVenta);
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarDetalleDescuenPoliVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta);						
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosDetalleDescuenPoliVenta.setVisible(this.isPermisoGuardarCambiosDetalleDescuenPoliVenta);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.setVisible(this.isPermisoActualizarDetalleDescuenPoliVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleDescuenPoliVenta() {
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonModificarDetalleDescuenPoliVenta.setVisible(this.isPermisoActualizarDetalleDescuenPoliVenta);	
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarDetalleDescuenPoliVenta.setVisible(this.isPermisoActualizarDetalleDescuenPoliVenta);	
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarDetalleDescuenPoliVenta.setVisible(this.isPermisoEliminarDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarDetalleDescuenPoliVenta.setVisible(this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta);							
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosDetalleDescuenPoliVenta.setVisible((this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta && this.isPermisoGuardarCambiosDetalleDescuenPoliVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleDescuenPoliVenta() {
		if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleDescuenPoliVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleDescuenPoliVenta() {
	}
	
	public void jTableDatosDetalleDescuenPoliVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleDescuenPoliVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleDescuenPoliVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.getdetalledescuenpoliventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledescuenpoliventa==null) {
						this.detalledescuenpoliventa = new DetalleDescuenPoliVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
				}

				if(this.detalledescuenpoliventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalledescuenpoliventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleDescuenPoliVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleDescuenPoliVenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleDescuenPoliVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleDescuenPoliVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.getdetalledescuenpoliventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalledescuenpoliventaLogic.getConnexion());

				if(this.detalledescuenpoliventa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalledescuenpoliventa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleDescuenPoliVenta=(TitledBorder)this.jScrollPanelDatosDetalleDescuenPoliVenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleDescuenPoliVenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleDescuenPoliVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.getdetalledescuenpoliventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledescuenpoliventa==null) {
						this.detalledescuenpoliventa = new DetalleDescuenPoliVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
				}

				if(this.detalledescuenpoliventa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalledescuenpoliventa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleDescuenPoliVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleDescuenPoliVenta(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleDescuenPoliVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleDescuenPoliVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.getdetalledescuenpoliventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detalledescuenpoliventaLogic.getConnexion());

				if(this.detalledescuenpoliventa.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detalledescuenpoliventa.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleDescuenPoliVenta=(TitledBorder)this.jScrollPanelDatosDetalleDescuenPoliVenta.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleDescuenPoliVenta.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleDescuenPoliVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.getdetalledescuenpoliventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledescuenpoliventa==null) {
						this.detalledescuenpoliventa = new DetalleDescuenPoliVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
				}

				if(this.detalledescuenpoliventa.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detalledescuenpoliventa.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteDetalleDescuenPoliVentaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleDescuenPoliVenta=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosDetalleDescuenPoliVenta.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleDescuenPoliVenta=(TitledBorder)this.jScrollPanelDatosDetalleDescuenPoliVenta.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderDetalleDescuenPoliVenta.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteDetalleDescuenPoliVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebDetalleDescuenPoliVenta(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleDescuenPoliVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleDescuenPoliVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.getdetalledescuenpoliventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.detalledescuenpoliventaLogic.getConnexion());

				if(this.detalledescuenpoliventa.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.detalledescuenpoliventa.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleDescuenPoliVenta=(TitledBorder)this.jScrollPanelDatosDetalleDescuenPoliVenta.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderDetalleDescuenPoliVenta.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteDetalleDescuenPoliVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.getdetalledescuenpoliventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledescuenpoliventa==null) {
						this.detalledescuenpoliventa = new DetalleDescuenPoliVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
				}

				if(this.detalledescuenpoliventa.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.detalledescuenpoliventa.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorDetalleDescuenPoliVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.getdetalledescuenpoliventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledescuenpoliventa==null) {
						this.detalledescuenpoliventa = new DetalleDescuenPoliVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
				}

				if(this.detalledescuenpoliventa.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.detalledescuenpoliventa.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleDescuenPoliVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.getdetalledescuenpoliventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalledescuenpoliventa==null) {
						this.detalledescuenpoliventa = new DetalleDescuenPoliVenta();
					}

					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);
				}

				if(this.detalledescuenpoliventa.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detalledescuenpoliventa.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);

			this.getDetalleDescuenPoliVentasFK_IdCliente();

			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);

			//if(DetalleDescuenPoliVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);

			this.getDetalleDescuenPoliVentasFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);

			//if(DetalleDescuenPoliVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleDescuenPoliVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);

			this.getDetalleDescuenPoliVentasFK_IdSucursal();

			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);

			//if(DetalleDescuenPoliVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalledescuenpoliventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleDescuenPoliVenta() {
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.dispose();
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta!=null) {
			this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.dispose();
			this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta=null;
		}
		
		if(this.jInternalFrameImportacionDetalleDescuenPoliVenta!=null) {
			this.jInternalFrameImportacionDetalleDescuenPoliVenta.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleDescuenPoliVenta.dispose();
			this.jInternalFrameImportacionDetalleDescuenPoliVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleDescuenPoliVenta();
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleDescuenPoliVenta")) {
				jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleDescuenPoliVenta")) {
				jButtonDuplicarDetalleDescuenPoliVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleDescuenPoliVenta")) {
				jButtonCopiarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleDescuenPoliVenta")) {
				jButtonVerFormDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleDescuenPoliVenta")) {
				jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleDescuenPoliVenta")) {
				jButtonDuplicarDetalleDescuenPoliVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleDescuenPoliVenta")) {
				jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleDescuenPoliVenta")) {
				jButtonDuplicarDetalleDescuenPoliVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleDescuenPoliVenta")) {
				jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleDescuenPoliVenta")) {
				jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleDescuenPoliVenta")) {
				jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleDescuenPoliVenta")) {
				jButtonModificarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleDescuenPoliVenta")) {
				jButtonModificarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleDescuenPoliVenta")) {
				jButtonModificarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleDescuenPoliVenta")) {
				jButtonActualizarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleDescuenPoliVenta")) {
				jButtonActualizarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleDescuenPoliVenta")) {
				jButtonActualizarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleDescuenPoliVenta")) {
				jButtonEliminarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleDescuenPoliVenta")) {
				jButtonEliminarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleDescuenPoliVenta")) {
				jButtonEliminarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleDescuenPoliVenta")) {
				jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleDescuenPoliVenta")) {
				jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleDescuenPoliVenta")) {
				jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleDescuenPoliVenta")) {
				jButtonCerrarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleDescuenPoliVenta")) {
				jButtonCerrarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleDescuenPoliVenta")) {
				jButtonCerrarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleDescuenPoliVenta")) {
				jButtonMostrarOcultarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleDescuenPoliVenta")) {
				jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleDescuenPoliVenta")) {
				jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleDescuenPoliVenta")) {
				jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleDescuenPoliVenta")) {
				jButtonCopiarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleDescuenPoliVenta")) {
				jButtonVerFormDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleDescuenPoliVenta")) {
				jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleDescuenPoliVenta")) {
				jButtonCopiarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleDescuenPoliVenta")) {
				jButtonVerFormDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleDescuenPoliVenta")) {
				jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleDescuenPoliVenta")) {
				jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleDescuenPoliVenta")) {
				jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleDescuenPoliVenta")) {
				jButtonRecargarInformacionDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleDescuenPoliVenta")) {
				jButtonRecargarInformacionDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleDescuenPoliVenta")) {
				jButtonRecargarInformacionDetalleDescuenPoliVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleDescuenPoliVenta")) {
				jButtonAnterioresDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleDescuenPoliVenta")) {
				jButtonAnterioresDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleDescuenPoliVenta")) {
				jButtonAnterioresDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleDescuenPoliVenta")) {
				jButtonSiguientesDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleDescuenPoliVenta")) {
				jButtonSiguientesDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleDescuenPoliVenta")) {
				jButtonSiguientesDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleDescuenPoliVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta")) {
				jButtonAbrirOrderByDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleDescuenPoliVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleDescuenPoliVenta")) {
				jButtonMostrarOcultarDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleDescuenPoliVenta")) {
				jButtonNuevoGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleDescuenPoliVenta")) {
				jButtonNuevoGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta")) {
				jButtonNuevoGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleDescuenPoliVenta")) {
				jButtonCerrarReporteDinamicoDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleDescuenPoliVenta")) {
				jButtonGenerarReporteDinamicoDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleDescuenPoliVenta")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleDescuenPoliVenta")) {
				jButtonCerrarImportacionDetalleDescuenPoliVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleDescuenPoliVenta")) {
				
				jButtonGenerarImportacionDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleDescuenPoliVenta")) {
				
				jButtonAbrirImportacionDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleDescuenPoliVenta")) {
				jComboBoxTiposAccionesDetalleDescuenPoliVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleDescuenPoliVenta")) {
				jComboBoxTiposRelacionesDetalleDescuenPoliVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleDescuenPoliVenta")) {
				jComboBoxTiposAccionesDetalleDescuenPoliVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleDescuenPoliVenta")) {
				
				jComboBoxTiposSeleccionarDetalleDescuenPoliVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleDescuenPoliVenta")) {
				jTextFieldValorCampoGeneralDetalleDescuenPoliVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleDescuenPoliVenta")) {
				jButtonAbrirOrderByDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleDescuenPoliVenta")) {
				jButtonAbrirOrderByDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleDescuenPoliVenta")) {
				jButtonCerrarOrderByDetalleDescuenPoliVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonidDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleDescuenPoliVentaUpdate")) {
				this.jButtonid_empresaDetalleDescuenPoliVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonid_empresaDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleDescuenPoliVentaUpdate")) {
				this.jButtonid_sucursalDetalleDescuenPoliVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonid_sucursalDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteDetalleDescuenPoliVenta")) {
				this.jButtonid_clienteDetalleDescuenPoliVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteDetalleDescuenPoliVentaUpdate")) {
				this.jButtonid_clienteDetalleDescuenPoliVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonid_clienteDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonvalorDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleDescuenPoliVentaBusqueda")) {
				this.jButtondescripcionDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteDetalleDescuenPoliVenta")) {
				this.jButtonid_clienteDetalleDescuenPoliVentaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteDetalleDescuenPoliVenta")) {
				this.jButtonFK_IdClienteDetalleDescuenPoliVentaActionPerformed(evt);
			}
			
			;
			
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleDescuenPoliVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				


				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleDescuenPoliVenta detalledescuenpoliventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalledescuenpoliventaLocal=this.detalledescuenpoliventa;
			} else {
				detalledescuenpoliventaLocal=this.detalledescuenpoliventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
							
				
				


				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
								
						
				


				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
								
				
				


				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
							
				
				


				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
								
				
				


				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleDescuenPoliVenta")) {
					jCheckBoxSeleccionarTodosDetalleDescuenPoliVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleDescuenPoliVenta")) {
					jCheckBoxSeleccionadosDetalleDescuenPoliVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleDescuenPoliVenta")) {
					
				}
				
				


				
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
												
				
				


				
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalledescuenpoliventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalledescuenpoliventa);
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleDescuenPoliVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleDescuenPoliVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleDescuenPoliVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalledescuenpoliventaAnterior =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleDescuenPoliVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleDescuenPoliVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleDescuenPoliVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalledescuenpoliventa =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalledescuenpoliventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleDescuenPoliVenta")) {
				
				}
				
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleDescuenPoliVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleDescuenPoliVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleDescuenPoliVenta")) {
			
			}
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleDescuenPoliVenta();
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleDescuenPoliVenta")) {
				jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleDescuenPoliVenta")) {
				jButtonDuplicarDetalleDescuenPoliVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleDescuenPoliVenta")) {
				jButtonCopiarDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleDescuenPoliVenta")) {
				jButtonVerFormDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleDescuenPoliVenta")) {
				jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleDescuenPoliVenta")) {
				jButtonModificarDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleDescuenPoliVenta")) {
				jButtonActualizarDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleDescuenPoliVenta")) {
				jButtonEliminarDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleDescuenPoliVenta")) {
				jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleDescuenPoliVenta")) {
				jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleDescuenPoliVenta")) {
				jButtonCerrarDetalleDescuenPoliVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleDescuenPoliVenta")) {
				jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleDescuenPoliVenta")) {
				jButtonNuevoGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleDescuenPoliVenta")) {
				jButtonAbrirOrderByDetalleDescuenPoliVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleDescuenPoliVenta")) {
				jButtonRecargarInformacionDetalleDescuenPoliVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleDescuenPoliVenta")) {
				jButtonAnterioresDetalleDescuenPoliVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleDescuenPoliVenta")) {
				jButtonSiguientesDetalleDescuenPoliVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonidDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleDescuenPoliVentaUpdate")) {
				this.jButtonid_empresaDetalleDescuenPoliVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonid_empresaDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleDescuenPoliVentaUpdate")) {
				this.jButtonid_sucursalDetalleDescuenPoliVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonid_sucursalDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteDetalleDescuenPoliVenta")) {
				this.jButtonid_clienteDetalleDescuenPoliVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteDetalleDescuenPoliVentaUpdate")) {
				this.jButtonid_clienteDetalleDescuenPoliVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonid_clienteDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleDescuenPoliVentaBusqueda")) {
				this.jButtonvalorDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleDescuenPoliVentaBusqueda")) {
				this.jButtondescripcionDetalleDescuenPoliVentaBusquedaActionPerformed(evt);
			}
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleDescuenPoliVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleDescuenPoliVenta")) {
				closingInternalFrameDetalleDescuenPoliVenta();
				
			} else if(sTipo.equals("jButtonCancelarDetalleDescuenPoliVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleDescuenPoliVenta = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleDescuenPoliVentaBeanSwingJInternalFrame jInternalFrameParent=(DetalleDescuenPoliVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleDescuenPoliVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleDescuenPoliVentaActionPerformed(null);
			}
			
			DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalledescuenpoliventa,new Object(),this.detalledescuenpoliventaParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleDescuenPoliVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleDescuenPoliVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleDescuenPoliVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalledescuenpoliventa)) {
			if(!esControlTabla) {
				if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);			
				}
				
				if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalledescuenpoliventaReturnGeneral=detalledescuenpoliventaLogic.procesarEventosDetalleDescuenPoliVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas(),this.detalledescuenpoliventa,this.detalledescuenpoliventaParameterGeneral,this.isEsNuevoDetalleDescuenPoliVenta,classes);//this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleDescuenPoliVenta(this.detalledescuenpoliventaReturnGeneral,this.detalledescuenpoliventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleDescuenPoliVenta(classes,this.detalledescuenpoliventaReturnGeneral,this.detalledescuenpoliventaBean,false);
					}
						
					if(this.detalledescuenpoliventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleDescuenPoliVenta(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleDescuenPoliVenta(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta());	
					}
						
					if(this.detalledescuenpoliventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleDescuenPoliVenta(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta(),classes);//this.detalledescuenpoliventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleDescuenPoliVenta(this.detalledescuenpoliventa,classes);//this.detalledescuenpoliventaBean);									
				}
			
				if(DetalleDescuenPoliVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleDescuenPoliVenta(this.detalledescuenpoliventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleDescuenPoliVenta(this.detalledescuenpoliventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalledescuenpoliventaAnterior!=null) {
						this.detalledescuenpoliventa=this.detalledescuenpoliventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalledescuenpoliventaReturnGeneral=detalledescuenpoliventaLogic.procesarEventosDetalleDescuenPoliVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas(),this.detalledescuenpoliventa,this.detalledescuenpoliventaParameterGeneral,this.isEsNuevoDetalleDescuenPoliVenta,classes);//this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalledescuenpoliventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta(),detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta(),this.detalledescuenpoliventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleDescuenPoliVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleDescuenPoliVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleDescuenPoliVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleDescuenPoliVenta() throws Exception {
		
		DetalleDescuenPoliVentaModel detalledescuenpoliventaModel=(DetalleDescuenPoliVentaModel)this.jTableDatosDetalleDescuenPoliVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalledescuenpoliventaModel.detalledescuenpoliventas=this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalledescuenpoliventaModel.detalledescuenpoliventas=this.detalledescuenpoliventas;
		}
		
		
		((DetalleDescuenPoliVentaModel) this.jTableDatosDetalleDescuenPoliVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleDescuenPoliVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalledescuenpoliventaAnterior(),this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalledescuenpoliventaAnterior(),this.detalledescuenpoliventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleDescuenPoliVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalledescuenpoliventa,new Object(),generalEntityParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleDescuenPoliVentaConstantesFunciones.getClassesRelationshipsOfDetalleDescuenPoliVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleDescuenPoliVentaConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleDescuenPoliVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleDescuenPoliVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalledescuenpoliventa,new Object(),generalEntityParameterGeneral,this.detalledescuenpoliventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleDescuenPoliVenta(DetalleDescuenPoliVentaBean detalledescuenpoliventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleDescuenPoliVenta(ArrayList<Classe> classes,DetalleDescuenPoliVentaReturnGeneral detalledescuenpoliventaReturnGeneral,DetalleDescuenPoliVentaBean detalledescuenpoliventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalledescuenpoliventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta = new DetalleDescuenPoliVentaDetalleFormJInternalFrame(jDesktopPane,this.detalledescuenpoliventaSessionBean.getConGuardarRelaciones(),this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setVisible(false);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.detalledescuenpoliventaLogic=this.detalledescuenpoliventaLogic;
		
		this.cargarCombosFrameForeignKeyDetalleDescuenPoliVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleDescuenPoliVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleDescuenPoliVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleDescuenPoliVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleDescuenPoliVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleDescuenPoliVenta"));
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonModificarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"ModificarDetalleDescuenPoliVenta"));

		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonModificarToolBarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleDescuenPoliVenta"));
					
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemModificarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleDescuenPoliVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"ActualizarDetalleDescuenPoliVenta"));
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarToolBarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleDescuenPoliVenta"));
						
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemActualizarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleDescuenPoliVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"EliminarDetalleDescuenPoliVenta"));
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleDescuenPoliVenta"));
								
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemEliminarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleDescuenPoliVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"CancelarDetalleDescuenPoliVenta"));
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleDescuenPoliVenta"));
					
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemCancelarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleDescuenPoliVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemDetalleCerrarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleDescuenPoliVenta"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleDescuenPoliVenta"));
		
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleDescuenPoliVenta"));
		
		
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleDescuenPoliVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonidDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleDescuenPoliVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_empresaDetalleDescuenPoliVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDescuenPoliVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDescuenPoliVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_sucursalDetalleDescuenPoliVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleDescuenPoliVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleDescuenPoliVentaBusqueda"));
		//jButtonid_clienteDetalleDescuenPoliVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteDetalleDescuenPoliVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVentaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonvalorDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleDescuenPoliVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtondescripcionDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleDescuenPoliVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTabbedPaneRelacionesDetalleDescuenPoliVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleDescuenPoliVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleDescuenPoliVenta"));
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleDescuenPoliVenta"));
		}
		
		this.jTableDatosDetalleDescuenPoliVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleDescuenPoliVenta"));
		
		this.jTableDatosDetalleDescuenPoliVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleDescuenPoliVenta"));
		
		this.jButtonNuevoDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"NuevoDetalleDescuenPoliVenta"));
		
		this.jButtonDuplicarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"DuplicarDetalleDescuenPoliVenta"));
		
		this.jButtonCopiarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"CopiarDetalleDescuenPoliVenta"));
		
		this.jButtonVerFormDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"VerFormDetalleDescuenPoliVenta"));
		
		
		this.jButtonNuevoToolBarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleDescuenPoliVenta"));
			
		this.jButtonDuplicarToolBarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleDescuenPoliVenta"));
			
		this.jMenuItemNuevoDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleDescuenPoliVenta"));
			
		this.jMenuItemDuplicarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleDescuenPoliVenta"));		
		
		
		this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleDescuenPoliVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleDescuenPoliVenta"));
			
		this.jMenuItemNuevoRelacionesDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleDescuenPoliVenta"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonModificarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"ModificarDetalleDescuenPoliVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonModificarToolBarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleDescuenPoliVenta"));
			
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemModificarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleDescuenPoliVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"ActualizarDetalleDescuenPoliVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonActualizarToolBarDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleDescuenPoliVenta"));
				
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemActualizarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleDescuenPoliVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"EliminarDetalleDescuenPoliVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonEliminarToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleDescuenPoliVenta"));
						
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemEliminarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleDescuenPoliVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"CancelarDetalleDescuenPoliVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonCancelarToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleDescuenPoliVenta"));
			
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemCancelarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleDescuenPoliVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleDescuenPoliVenta"));		
		
		
		this.jButtonCerrarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"CerrarDetalleDescuenPoliVenta"));
		
		
		this.jButtonCerrarToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleDescuenPoliVenta"));
			
		this.jMenuItemCerrarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleDescuenPoliVenta"));
			
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jMenuItemDetalleCerrarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleDescuenPoliVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleDescuenPoliVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleDescuenPoliVenta"));
		}
		
		this.jButtonCopiarToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleDescuenPoliVenta"));
			
		this.jButtonVerFormToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleDescuenPoliVenta"));
		
		this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleDescuenPoliVenta"));
			
		this.jMenuItemCopiarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleDescuenPoliVenta"));		
		
		this.jMenuItemVerFormDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleDescuenPoliVenta"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleDescuenPoliVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleDescuenPoliVenta"));
			
		this.jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleDescuenPoliVenta"));		
		
		
		
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleDescuenPoliVenta"));
					
		this.jButtonRecargarInformacionToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleDescuenPoliVenta"));
		
		this.jMenuItemRecargarInformacionDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleDescuenPoliVenta"));		
		
		
		
		this.jButtonAnterioresDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"AnterioresDetalleDescuenPoliVenta"));
		
		
		this.jButtonAnterioresToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleDescuenPoliVenta"));
		
		this.jMenuItemAnterioresDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleDescuenPoliVenta"));		
		
		
		this.jButtonSiguientesDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"SiguientesDetalleDescuenPoliVenta"));
		
		
		this.jButtonSiguientesToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleDescuenPoliVenta"));
			
		this.jMenuItemSiguientesDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleDescuenPoliVenta"));
			
		this.jMenuItemAbrirOrderByDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleDescuenPoliVenta"));
			
		this.jMenuItemMostrarOcultarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleDescuenPoliVenta"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleDescuenPoliVenta"));
			
		this.jMenuItemDetalleMostarOcultarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleDescuenPoliVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleDescuenPoliVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleDescuenPoliVenta"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleDescuenPoliVenta"));

		this.jCheckBoxSeleccionadosDetalleDescuenPoliVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleDescuenPoliVenta"));
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleDescuenPoliVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleDescuenPoliVenta"));
			
		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleDescuenPoliVenta"));
					
		this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleDescuenPoliVenta"));
			
		this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleDescuenPoliVenta"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonidDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleDescuenPoliVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_empresaDetalleDescuenPoliVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDescuenPoliVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDescuenPoliVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_sucursalDetalleDescuenPoliVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleDescuenPoliVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleDescuenPoliVentaBusqueda"));
		//jButtonid_clienteDetalleDescuenPoliVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteDetalleDescuenPoliVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVentaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonvalorDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleDescuenPoliVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtondescripcionDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleDescuenPoliVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"FK_IdClienteDetalleDescuenPoliVenta"));

			this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta!=null) {
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleDescuenPoliVenta"));
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleDescuenPoliVenta"));
				this.jInternalFrameReporteDinamicoDetalleDescuenPoliVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleDescuenPoliVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleDescuenPoliVenta"));				
			//this.jButtonGenerarReporteDinamicoDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleDescuenPoliVenta"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleDescuenPoliVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleDescuenPoliVenta!=null) {
				this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleDescuenPoliVenta"));
				this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleDescuenPoliVenta"));
				this.jInternalFrameImportacionDetalleDescuenPoliVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleDescuenPoliVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleDescuenPoliVenta"));
			
			this.jButtonAbrirOrderByToolBarDetalleDescuenPoliVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleDescuenPoliVenta"));			
			
			if(this.jInternalFrameOrderByDetalleDescuenPoliVenta!=null) {
				this.jInternalFrameOrderByDetalleDescuenPoliVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleDescuenPoliVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTabbedPaneRelacionesDetalleDescuenPoliVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleDescuenPoliVenta"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameDetalleDescuenPoliVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleDescuenPoliVenta = (JInternalFrameBase)event.getSource();
	            	
	            DetalleDescuenPoliVentaBeanSwingJInternalFrame jInternalFrameParent=(DetalleDescuenPoliVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleDescuenPoliVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleDescuenPoliVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleDescuenPoliVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleDescuenPoliVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleDescuenPoliVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleDescuenPoliVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleDescuenPoliVenta";
		inputMap = this.jButtonNuevoDetalleDescuenPoliVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleDescuenPoliVenta";
		inputMap = this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleDescuenPoliVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleDescuenPoliVenta";
		inputMap = this.jButtonModificarDetalleDescuenPoliVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleDescuenPoliVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleDescuenPoliVenta";
		inputMap = this.jButtonActualizarDetalleDescuenPoliVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleDescuenPoliVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleDescuenPoliVenta";
		inputMap = this.jButtonEliminarDetalleDescuenPoliVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleDescuenPoliVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleDescuenPoliVenta";
		inputMap = this.jButtonCancelarDetalleDescuenPoliVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleDescuenPoliVenta";
		inputMap = this.jButtonCerrarDetalleDescuenPoliVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleDescuenPoliVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleDescuenPoliVenta";
		inputMap = this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosDetalleDescuenPoliVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonGuardarCambiosDetalleDescuenPoliVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleDescuenPoliVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleDescuenPoliVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleDescuenPoliVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleDescuenPoliVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleDescuenPoliVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonidDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleDescuenPoliVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_empresaDetalleDescuenPoliVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDescuenPoliVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_empresaDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleDescuenPoliVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_sucursalDetalleDescuenPoliVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleDescuenPoliVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_sucursalDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleDescuenPoliVentaBusqueda"));
		//jButtonid_clienteDetalleDescuenPoliVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteDetalleDescuenPoliVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVentaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonvalorDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleDescuenPoliVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtondescripcionDetalleDescuenPoliVentaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleDescuenPoliVentaBusqueda"));
		
		
		this.jButtonFK_IdClienteDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"FK_IdClienteDetalleDescuenPoliVenta"));

		this.jButtonBuscarFK_IdClienteid_clienteDetalleDescuenPoliVenta.addActionListener(new ButtonActionListener(this,"id_clienteDetalleDescuenPoliVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleDescuenPoliVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleDescuenPoliVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleDescuenPoliVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleDescuenPoliVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleDescuenPoliVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
					detalledescuenpoliventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventas) {
					detalledescuenpoliventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleDescuenPoliVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
						detalledescuenpoliventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventas) {
						detalledescuenpoliventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleDescuenPoliVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleDescuenPoliVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleDescuenPoliVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleDescuenPoliVenta.getSelectedRows();
			
			DetalleDescuenPoliVenta detalledescuenpoliventaLocal=new DetalleDescuenPoliVenta();
			
			//this.seleccionarTodosDetalleDescuenPoliVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalledescuenpoliventaLocal =(DetalleDescuenPoliVenta) this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas().toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalledescuenpoliventaLocal =(DetalleDescuenPoliVenta) this.detalledescuenpoliventas.toArray()[this.jTableDatosDetalleDescuenPoliVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalledescuenpoliventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
						detalledescuenpoliventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventas) {
						detalledescuenpoliventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleDescuenPoliVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleDescuenPoliVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleDescuenPoliVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleDescuenPoliVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleDescuenPoliVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleDescuenPoliVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleDescuenPoliVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
				
						if(sTipoSeleccionar.equals(DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalledescuenpoliventaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalledescuenpoliventaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventas) {
					
						if(sTipoSeleccionar.equals(DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalledescuenpoliventaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalledescuenpoliventaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleDescuenPoliVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleDescuenPoliVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleDescuenPoliVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleDescuenPoliVenta(conSplash);
				
					this.generarReporteDetalleDescuenPoliVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleDescuenPoliVentasSeleccionados();
				//this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleDescuenPoliVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleDescuenPoliVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleDescuenPoliVenta();
				
				this.exportarDetalleDescuenPoliVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleDescuenPoliVentas();
				//this.importarDetalleDescuenPoliVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleDescuenPoliVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleDescuenPoliVentasSeleccionados();
				//this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Descuen Poli Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleDescuenPoliVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleDescuenPoliVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleDescuenPoliVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleDescuenPoliVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleDescuenPoliVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleDescuenPoliVenta(conSplash);
					
						//this.actualizarParametrosGeneralDetalleDescuenPoliVenta();
						
						this.generarReporteProcesoAccionDetalleDescuenPoliVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Descuen Poli VentaS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Descuen Poli Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleDescuenPoliVenta();
				
						this.actualizarParametrosGeneralDetalleDescuenPoliVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalledescuenpoliventaReturnGeneral=detalledescuenpoliventaLogic.procesarAccionDetalleDescuenPoliVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas(),this.detalledescuenpoliventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleDescuenPoliVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleDescuenPoliVenta();
					
					DetalleDescuenPoliVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleDescuenPoliVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleDescuenPoliVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxTiposAccionesFormularioDetalleDescuenPoliVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleDescuenPoliVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleDescuenPoliVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleDescuenPoliVenta();
			
			if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();		
			DetalleDescuenPoliVenta detalledescuenpoliventa=new DetalleDescuenPoliVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleDescuenPoliVenta.getSelectedItem();
			
			
			
			
			detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalledescuenpoliventasSeleccionados.size()==1) {
				for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventasSeleccionados) {
					detalledescuenpoliventa=detalledescuenpoliventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleDescuenPoliVenta();
			
      		//this.finishProcessDetalleDescuenPoliVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleDescuenPoliVentaReturnGeneral() throws Exception {
		if(this.detalledescuenpoliventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalledescuenpoliventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalledescuenpoliventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalledescuenpoliventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalledescuenpoliventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalledescuenpoliventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
		}
		
		if(this.detalledescuenpoliventaReturnGeneral.getConRetornoLista() || this.detalledescuenpoliventaReturnGeneral.getConRetornoObjeto()) {
			if(this.detalledescuenpoliventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalledescuenpoliventaLogic.setDetalleDescuenPoliVentas(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalledescuenpoliventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalledescuenpoliventaLogic.setDetalleDescuenPoliVenta(this.detalledescuenpoliventaReturnGeneral.getDetalleDescuenPoliVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleDescuenPoliVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleDescuenPoliVenta() throws Exception {
		
		
	}
	
	public ArrayList<DetalleDescuenPoliVenta> getDetalleDescuenPoliVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleDescuenPoliVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas()) {
					if(detalledescuenpoliventaAux.getIsSelected()) {
						detalledescuenpoliventasSeleccionados.add(detalledescuenpoliventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:this.detalledescuenpoliventas) {
					if(detalledescuenpoliventaAux.getIsSelected()) {
						detalledescuenpoliventasSeleccionados.add(detalledescuenpoliventaAux);				
					}
				}
			}
			
			if(detalledescuenpoliventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalledescuenpoliventasSeleccionados.addAll(this.detalledescuenpoliventaLogic.getDetalleDescuenPoliVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalledescuenpoliventasSeleccionados.addAll(this.detalledescuenpoliventas);				
					}
				}
			}
		} else {
			detalledescuenpoliventasSeleccionados.add(this.detalledescuenpoliventa);
		}
		
		return detalledescuenpoliventasSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteDetalleDescuenPoliVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleDescuenPoliVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleDescuenPoliVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleDescuenPoliVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleDescuenPoliVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Descuen Poli Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleDescuenPoliVentasSeleccionados() throws Exception {
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();		
		
		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleDescuenPoliVentas("Todos",detalledescuenpoliventasSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleDescuenPoliVentasSeleccionados() throws Exception {
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();		
		
		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleDescuenPoliVentas("Todos",detalledescuenpoliventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleDescuenPoliVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();
		
		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleDescuenPoliVentas("Todos",detalledescuenpoliventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleDescuenPoliVentasSeleccionados() throws Exception {
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleDescuenPoliVenta();
		
		
		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleDescuenPoliVenta();
		
		
		//this.generarReporteDetalleDescuenPoliVentas("Todos",detalledescuenpoliventasSeleccionados ,detalledescuenpoliventaImplementable,detalledescuenpoliventaImplementableHome);
	}
	
	public void mostrarImportacionDetalleDescuenPoliVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleDescuenPoliVenta();
		
		this.abrirFrameImportacionDetalleDescuenPoliVenta();		
		
			
		//this.generarReporteDetalleDescuenPoliVentas("Todos",detalledescuenpoliventasSeleccionados ,detalledescuenpoliventaImplementable,detalledescuenpoliventaImplementableHome);
	}
	
	public void importarDetalleDescuenPoliVentas() throws Exception {		
	
	}
	
	public void exportarDetalleDescuenPoliVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleDescuenPoliVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleDescuenPoliVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleDescuenPoliVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Descuen Poli Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleDescuenPoliVentasSeleccionados() throws Exception {
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();		
		
		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledescuenpoliventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleDescuenPoliVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleDescuenPoliVenta(detalledescuenpoliventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalledescuenpoliventaAux.setsDetalleGeneralEntityReporte(detalledescuenpoliventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleDescuenPoliVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleDescuenPoliVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDescuenPoliVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalledescuenpoliventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledescuenpoliventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledescuenpoliventa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledescuenpoliventa.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledescuenpoliventa.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledescuenpoliventa.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalledescuenpoliventa.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleDescuenPoliVentasSeleccionados() throws Exception {
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();		
		
		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledescuenpoliventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleDescuenPoliVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleDescuenPoliVenta(row);				
				iRow++;
			}				
			
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleDescuenPoliVenta(detalledescuenpoliventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleDescuenPoliVentasSeleccionados() throws Exception {
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();		
		
		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalledescuenpoliventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalledescuenpoliventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalledescuenpoliventa");
			//elementRoot.appendChild(element);
		
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventasSeleccionados) {
				element = document.createElement("detalledescuenpoliventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleDescuenPoliVenta(detalledescuenpoliventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Descuen Poli Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleDescuenPoliVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalledescuenpoliventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledescuenpoliventa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledescuenpoliventa.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledescuenpoliventa.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledescuenpoliventa.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(detalledescuenpoliventa.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleDescuenPoliVenta(DetalleDescuenPoliVenta detalledescuenpoliventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleDescuenPoliVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalledescuenpoliventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleDescuenPoliVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalledescuenpoliventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleDescuenPoliVentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalledescuenpoliventa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleDescuenPoliVentaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detalledescuenpoliventa.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(DetalleDescuenPoliVentaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(detalledescuenpoliventa.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementvalor = document.createElement(DetalleDescuenPoliVentaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(detalledescuenpoliventa.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementdescripcion = document.createElement(DetalleDescuenPoliVentaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detalledescuenpoliventa.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDetalleDescuenPoliVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados=new ArrayList<DetalleDescuenPoliVenta>();
		
		detalledescuenpoliventasSeleccionados=this.getDetalleDescuenPoliVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleDescuenPoliVenta(detalledescuenpoliventasSeleccionados);
		
		this.generarReporteDetalleDescuenPoliVentas("Todos",detalledescuenpoliventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleDescuenPoliVenta(ArrayList<DetalleDescuenPoliVenta> detalledescuenpoliventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleDescuenPoliVenta detalledescuenpoliventaAux:detalledescuenpoliventasSeleccionados) {
				detalledescuenpoliventaAux.setsDetalleGeneralEntityReporte(detalledescuenpoliventaAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalledescuenpoliventaAux.setsDescripcionGeneralEntityReporte1(detalledescuenpoliventaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detalledescuenpoliventaAux.setsDescripcionGeneralEntityReporte1(detalledescuenpoliventaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleDescuenPoliVentaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					detalledescuenpoliventaAux.setsDescripcionGeneralEntityReporte1(detalledescuenpoliventaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleDescuenPoliVentaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detalledescuenpoliventaAux.setsDescripcionGeneralEntityReporte1(detalledescuenpoliventaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleDescuenPoliVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleDescuenPoliVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaModificarDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaCancelarDetalleDescuenPoliVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleDescuenPoliVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleDescuenPoliVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=true;
		} else {
			this.actualizarEstadoPanelsDetalleDescuenPoliVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleDescuenPoliVenta=false;
			//this.isVisibilidadCeldaVerFormDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaDuplicarDetalleDescuenPoliVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleDescuenPoliVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			if(!detalledescuenpoliventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;												
			}
			
			this.jButtonCerrarDetalleDescuenPoliVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleDescuenPoliVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.detalledescuenpoliventa)) {
			this.isVisibilidadCeldaActualizarDetalleDescuenPoliVenta=false;
			this.isVisibilidadCeldaEliminarDetalleDescuenPoliVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleDescuenPoliVenta() {
	}
	
	public void actualizarEstadoPanelsDetalleDescuenPoliVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta!=null) {
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosDetalleDescuenPoliVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleDescuenPoliVenta!=null) {
				this.jPanelPaginacionDetalleDescuenPoliVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleDescuenPoliVenta!=null) {
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta!=null) {
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosDetalleDescuenPoliVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleDescuenPoliVenta!=null) {
				this.jPanelPaginacionDetalleDescuenPoliVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleDescuenPoliVenta!=null) {
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta!=null) {
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosDetalleDescuenPoliVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleDescuenPoliVenta!=null) {
				this.jPanelPaginacionDetalleDescuenPoliVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleDescuenPoliVenta!=null) {
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta!=null) {
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosDetalleDescuenPoliVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleDescuenPoliVenta!=null) {
				this.jPanelPaginacionDetalleDescuenPoliVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleDescuenPoliVenta!=null) {
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta!=null) {
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosDetalleDescuenPoliVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleDescuenPoliVenta!=null) {
				this.jPanelPaginacionDetalleDescuenPoliVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleDescuenPoliVenta!=null) {
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta!=null) {
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosDetalleDescuenPoliVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleDescuenPoliVenta!=null) {
				this.jPanelPaginacionDetalleDescuenPoliVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleDescuenPoliVenta!=null) {
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosEdicionDetalleDescuenPoliVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta!=null) {
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleDescuenPoliVenta!=null) {
				this.jScrollPanelDatosDetalleDescuenPoliVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleDescuenPoliVenta!=null) {
				this.jPanelPaginacionDetalleDescuenPoliVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleDescuenPoliVenta!=null) {
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta!=null) {
					this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleDescuenPoliVenta!=null) {
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalledescuenpoliventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta!=null) {
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleDescuenPoliVenta!=null) {
				this.jPanelParametrosReportesDetalleDescuenPoliVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.remove(jPanelFK_IdClienteDetalleDescuenPoliVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.remove(jPanelFK_IdClienteDetalleDescuenPoliVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.remove(jPanelFK_IdClienteDetalleDescuenPoliVenta);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetalleDescuenPoliVentaParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(detalledescuenpoliventaSessionBean==null) {
				detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(detalledescuenpoliventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.detalledescuenpoliventaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(DetalleDescuenPoliVentaConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionDetalleDescuenPoliVenta(true);
			//clienteSessionBean.setlidDetalleDescuenPoliVentaActual(this.idDetalleDescuenPoliVentaActual);

			detalledescuenpoliventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleDescuenPoliVenta(true);
			detalledescuenpoliventaSessionBean.setlIdDetalleDescuenPoliVentaActualForeignKey(this.idDetalleDescuenPoliVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleDescuenPoliVentaSessionBean detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
		
		if(this.detalledescuenpoliventaSessionBean==null) {
			this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
		}
		
		this.detalledescuenpoliventaSessionBean.setsUltimaBusquedaDetalleDescuenPoliVenta(this.getsAccionBusqueda());
		this.detalledescuenpoliventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalledescuenpoliventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			detalledescuenpoliventaSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalledescuenpoliventaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detalledescuenpoliventaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleDescuenPoliVentaSessionBean detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
		
		if(this.detalledescuenpoliventaSessionBean==null) {
			this.detalledescuenpoliventaSessionBean=new DetalleDescuenPoliVentaSessionBean();
		}
		
		if(this.detalledescuenpoliventaSessionBean.getsUltimaBusquedaDetalleDescuenPoliVenta()!=null&&!this.detalledescuenpoliventaSessionBean.getsUltimaBusquedaDetalleDescuenPoliVenta().equals("")) {
			this.setsAccionBusqueda(detalledescuenpoliventaSessionBean.getsUltimaBusquedaDetalleDescuenPoliVenta());
			this.setiNumeroPaginacion(detalledescuenpoliventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalledescuenpoliventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(detalledescuenpoliventaSessionBean.getid_cliente());
				detalledescuenpoliventaSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalledescuenpoliventaSessionBean.getid_empresa());
				detalledescuenpoliventaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detalledescuenpoliventaSessionBean.getid_sucursal());
				detalledescuenpoliventaSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.detalledescuenpoliventaSessionBean.setsUltimaBusquedaDetalleDescuenPoliVenta("");
		this.detalledescuenpoliventaSessionBean.setiNumeroPaginacion(DetalleDescuenPoliVentaConstantesFunciones.INUMEROPAGINACION);
		this.detalledescuenpoliventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleDescuenPoliVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleDescuenPoliVenta() {
		this.updateBorderResaltarBusquedasFormularioDetalleDescuenPoliVenta();
		this.updateVisibilidadBusquedasFormularioDetalleDescuenPoliVenta();
		this.updateHabilitarBusquedasFormularioDetalleDescuenPoliVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleDescuenPoliVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.getComponents().length>0) {
	

		if(this.detalledescuenpoliventaConstantesFunciones.resaltarFK_IdClienteDetalleDescuenPoliVenta!=null) {
			index= this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.indexOfComponent(this.jPanelFK_IdClienteDetalleDescuenPoliVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.getComponent(index);
				jPanel.setBorder(this.detalledescuenpoliventaConstantesFunciones.resaltarFK_IdClienteDetalleDescuenPoliVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleDescuenPoliVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.indexOfComponent(this.jPanelFK_IdClienteDetalleDescuenPoliVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarFK_IdClienteDetalleDescuenPoliVenta);
			if(!this.detalledescuenpoliventaConstantesFunciones.mostrarFK_IdClienteDetalleDescuenPoliVenta && index>-1) {
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleDescuenPoliVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.indexOfComponent(this.jPanelFK_IdClienteDetalleDescuenPoliVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalledescuenpoliventaConstantesFunciones.activarFK_IdClienteDetalleDescuenPoliVenta);
				this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setEnabledAt(index,this.detalledescuenpoliventaConstantesFunciones.activarFK_IdClienteDetalleDescuenPoliVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleDescuenPoliVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.indexOfComponent(this.jPanelFK_IdClienteDetalleDescuenPoliVenta);

			this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleDescuenPoliVenta.getComponent(index);

			this.detalledescuenpoliventaConstantesFunciones.setResaltarFK_IdClienteDetalleDescuenPoliVenta(resaltar);

			jPanel.setBorder(this.detalledescuenpoliventaConstantesFunciones.resaltarFK_IdClienteDetalleDescuenPoliVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleDescuenPoliVenta.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioDetalleDescuenPoliVenta() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleDescuenPoliVenta();
		this.updateVisibilidadResaltarControlesFormularioDetalleDescuenPoliVenta();
		this.updateHabilitarResaltarControlesFormularioDetalleDescuenPoliVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleDescuenPoliVenta() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalledescuenpoliventaConstantesFunciones.resaltaridDetalleDescuenPoliVenta!=null && this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.setBorder(this.detalledescuenpoliventaConstantesFunciones.resaltaridDetalleDescuenPoliVenta);}
		if(this.detalledescuenpoliventaConstantesFunciones.resaltarid_empresaDetalleDescuenPoliVenta!=null && this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.setBorder(this.detalledescuenpoliventaConstantesFunciones.resaltarid_empresaDetalleDescuenPoliVenta);}
		if(this.detalledescuenpoliventaConstantesFunciones.resaltarid_sucursalDetalleDescuenPoliVenta!=null && this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.setBorder(this.detalledescuenpoliventaConstantesFunciones.resaltarid_sucursalDetalleDescuenPoliVenta);}
		if(this.detalledescuenpoliventaConstantesFunciones.resaltarid_clienteDetalleDescuenPoliVenta!=null && this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.setBorder(this.detalledescuenpoliventaConstantesFunciones.resaltarid_clienteDetalleDescuenPoliVenta);}
		if(this.detalledescuenpoliventaConstantesFunciones.resaltarvalorDetalleDescuenPoliVenta!=null && this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextFieldvalorDetalleDescuenPoliVenta.setBorder(this.detalledescuenpoliventaConstantesFunciones.resaltarvalorDetalleDescuenPoliVenta);}
		if(this.detalledescuenpoliventaConstantesFunciones.resaltardescripcionDetalleDescuenPoliVenta!=null && this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextAreadescripcionDetalleDescuenPoliVenta.setBorder(this.detalledescuenpoliventaConstantesFunciones.resaltardescripcionDetalleDescuenPoliVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleDescuenPoliVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
	
		//this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostraridDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPanelidDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostraridDetalleDescuenPoliVenta);
		//this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarid_empresaDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPanelid_empresaDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarid_empresaDetalleDescuenPoliVenta);
		//this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarid_sucursalDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPanelid_sucursalDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarid_sucursalDetalleDescuenPoliVenta);
		//this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarid_clienteDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPanelid_clienteDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarid_clienteDetalleDescuenPoliVenta);
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarid_clienteDetalleDescuenPoliVenta);
		//this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextFieldvalorDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarvalorDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPanelvalorDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrarvalorDetalleDescuenPoliVenta);
		//this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextAreadescripcionDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrardescripcionDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jPaneldescripcionDetalleDescuenPoliVenta.setVisible(this.detalledescuenpoliventaConstantesFunciones.mostrardescripcionDetalleDescuenPoliVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleDescuenPoliVenta() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleDescuenPoliVenta!=null) {
	
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jLabelidDetalleDescuenPoliVenta.setEnabled(this.detalledescuenpoliventaConstantesFunciones.activaridDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_empresaDetalleDescuenPoliVenta.setEnabled(this.detalledescuenpoliventaConstantesFunciones.activarid_empresaDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_sucursalDetalleDescuenPoliVenta.setEnabled(this.detalledescuenpoliventaConstantesFunciones.activarid_sucursalDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jComboBoxid_clienteDetalleDescuenPoliVenta.setEnabled(this.detalledescuenpoliventaConstantesFunciones.activarid_clienteDetalleDescuenPoliVenta);
			this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jButtonid_clienteDetalleDescuenPoliVenta.setEnabled(this.detalledescuenpoliventaConstantesFunciones.activarid_clienteDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextFieldvalorDetalleDescuenPoliVenta.setEnabled(this.detalledescuenpoliventaConstantesFunciones.activarvalorDetalleDescuenPoliVenta);
		this.jInternalFrameDetalleFormDetalleDescuenPoliVenta.jTextAreadescripcionDetalleDescuenPoliVenta.setEnabled(this.detalledescuenpoliventaConstantesFunciones.activardescripcionDetalleDescuenPoliVenta);
		}
	}
	
		
}