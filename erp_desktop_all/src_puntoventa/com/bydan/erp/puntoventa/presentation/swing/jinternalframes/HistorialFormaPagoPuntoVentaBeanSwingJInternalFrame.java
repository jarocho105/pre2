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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.HistorialFormaPagoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.HistorialFormaPagoPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.HistorialFormaPagoPuntoVentaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.HistorialFormaPagoPuntoVentaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame extends HistorialFormaPagoPuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<HistorialFormaPagoPuntoVenta> historialformapagopuntoventaValidator = new ClassValidator<HistorialFormaPagoPuntoVenta>(HistorialFormaPagoPuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public HistorialFormaPagoPuntoVenta historialformapagopuntoventa;	
	public HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux;
	public HistorialFormaPagoPuntoVenta historialformapagopuntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public HistorialFormaPagoPuntoVenta historialformapagopuntoventaTotales;
	public Long idHistorialFormaPagoPuntoVentaActual;
	public Long iIdNuevoHistorialFormaPagoPuntoVenta=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboFacturaPuntoVenta="";

	public List<FacturaPuntoVenta> facturapuntoventasForeignKey;

	public List<FacturaPuntoVenta> getfacturapuntoventasForeignKey() {
		return facturapuntoventasForeignKey;
	}

	public void setfacturapuntoventasForeignKey(List<FacturaPuntoVenta> facturapuntoventasForeignKey) {
		this.facturapuntoventasForeignKey = facturapuntoventasForeignKey;
	}

	//OBJETO FK ACTUAL
	public FacturaPuntoVenta facturapuntoventaForeignKey;

	public FacturaPuntoVenta getfacturapuntoventaForeignKey() {
		return facturapuntoventaForeignKey;
	}

	public void setfacturapuntoventaForeignKey(FacturaPuntoVenta facturapuntoventaForeignKey) {
		this.facturapuntoventaForeignKey = facturapuntoventaForeignKey;
	}

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
	
	public Boolean isPermisoTodoHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoNuevoHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoActualizarHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoActualizarOriginalHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoEliminarHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoConsultaHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoBusquedaHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoReporteHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoPaginacionAltoHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoCopiarHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoVerFormHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoDuplicarHistorialFormaPagoPuntoVenta;
	public Boolean isPermisoOrdenHistorialFormaPagoPuntoVenta;
	
	
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
	
	public HistorialFormaPagoPuntoVentaParameterReturnGeneral historialformapagopuntoventaReturnGeneral;
	public HistorialFormaPagoPuntoVentaParameterReturnGeneral historialformapagopuntoventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoHistorialFormaPagoPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected HistorialFormaPagoPuntoVentaSessionBeanAdditional historialformapagopuntoventaSessionBeanAdditional=null;
	
	public HistorialFormaPagoPuntoVentaSessionBeanAdditional getHistorialFormaPagoPuntoVentaSessionBeanAdditional() {
		return this.historialformapagopuntoventaSessionBeanAdditional;
	}
	
	public void setHistorialFormaPagoPuntoVentaSessionBeanAdditional(HistorialFormaPagoPuntoVentaSessionBeanAdditional historialformapagopuntoventaSessionBeanAdditional) {
		try {
			this.historialformapagopuntoventaSessionBeanAdditional=historialformapagopuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional historialformapagopuntoventaBeanSwingJInternalFrameAdditional=null;
	//public class HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame
	
	public HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional getHistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional() {
		return this.historialformapagopuntoventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setHistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional(HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional historialformapagopuntoventaBeanSwingJInternalFrameAdditional) {
		try {
			this.historialformapagopuntoventaBeanSwingJInternalFrameAdditional=historialformapagopuntoventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public HistorialFormaPagoPuntoVentaLogic historialformapagopuntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public HistorialFormaPagoPuntoVenta historialformapagopuntoventaBean;
	public HistorialFormaPagoPuntoVentaConstantesFunciones historialformapagopuntoventaConstantesFunciones;
	//public HistorialFormaPagoPuntoVentaParameterReturnGeneral historialformapagopuntoventaReturnGeneral;
	
	//FK
	
	public FacturaPuntoVentaLogic facturapuntoventaLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventas;	
	//public List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasEliminados;
	//public List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFacturaPuntoVenta=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoHistorialFormaPagoPuntoVenta() {
		return this.iIdNuevoHistorialFormaPagoPuntoVenta;
	}

	public void setiIdNuevoHistorialFormaPagoPuntoVenta(Long iIdNuevoHistorialFormaPagoPuntoVenta) {
		this.iIdNuevoHistorialFormaPagoPuntoVenta = iIdNuevoHistorialFormaPagoPuntoVenta;
	}
	
	public Long getidHistorialFormaPagoPuntoVentaActual() {
		return this.idHistorialFormaPagoPuntoVentaActual;
	}

	public void setidHistorialFormaPagoPuntoVentaActual(Long idHistorialFormaPagoPuntoVentaActual) {
		this.idHistorialFormaPagoPuntoVentaActual = idHistorialFormaPagoPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public HistorialFormaPagoPuntoVenta gethistorialformapagopuntoventa() {
		return this.historialformapagopuntoventa;
	}

	public void sethistorialformapagopuntoventa(HistorialFormaPagoPuntoVenta historialformapagopuntoventa) {
		this.historialformapagopuntoventa = historialformapagopuntoventa;
	}
	
	public HistorialFormaPagoPuntoVenta gethistorialformapagopuntoventaAux() {
		return this.historialformapagopuntoventaAux;
	}

	public void sethistorialformapagopuntoventaAux(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux) {
		this.historialformapagopuntoventaAux = historialformapagopuntoventaAux;
	}				
	
	public HistorialFormaPagoPuntoVenta gethistorialformapagopuntoventaAnterior() {
		return this.historialformapagopuntoventaAnterior;
	}

	public void sethistorialformapagopuntoventaAnterior(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAnterior) {
		this.historialformapagopuntoventaAnterior = historialformapagopuntoventaAnterior;
	}	
	
	public HistorialFormaPagoPuntoVenta gethistorialformapagopuntoventaTotales() {
		return this.historialformapagopuntoventaTotales;
	}

	public void sethistorialformapagopuntoventaTotales(HistorialFormaPagoPuntoVenta historialformapagopuntoventaTotales) {
		this.historialformapagopuntoventaTotales = historialformapagopuntoventaTotales;
	}	
	
	public HistorialFormaPagoPuntoVenta gethistorialformapagopuntoventaBean() {
		return this.historialformapagopuntoventaBean;
	}

	public void sethistorialformapagopuntoventaBean(HistorialFormaPagoPuntoVenta historialformapagopuntoventaBean) {
		this.historialformapagopuntoventaBean = historialformapagopuntoventaBean;
	}	
	
	public HistorialFormaPagoPuntoVentaParameterReturnGeneral gethistorialformapagopuntoventaReturnGeneral() {
		return this.historialformapagopuntoventaReturnGeneral;
	}

	public void sethistorialformapagopuntoventaReturnGeneral(HistorialFormaPagoPuntoVentaParameterReturnGeneral historialformapagopuntoventaReturnGeneral) {
		this.historialformapagopuntoventaReturnGeneral = historialformapagopuntoventaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_factura_punto_ventaFK_IdFacturaPuntoVenta=-1L;

	public Long getid_factura_punto_ventaFK_IdFacturaPuntoVenta() {
		return this.id_factura_punto_ventaFK_IdFacturaPuntoVenta;
	}

	public void setid_factura_punto_ventaFK_IdFacturaPuntoVenta(Long id_factura_punto_ventaFK_IdFacturaPuntoVenta) {
		this.id_factura_punto_ventaFK_IdFacturaPuntoVenta = id_factura_punto_ventaFK_IdFacturaPuntoVenta;
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
	
	
	public HistorialFormaPagoPuntoVentaLogic getHistorialFormaPagoPuntoVentaLogic()	{		
		return historialformapagopuntoventaLogic;
	}

	public void setHistorialFormaPagoPuntoVentaLogic(HistorialFormaPagoPuntoVentaLogic historialformapagopuntoventaLogic) {
		this.historialformapagopuntoventaLogic = historialformapagopuntoventaLogic;
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
	
	public Boolean getIsEsNuevoHistorialFormaPagoPuntoVenta() {
		return isEsNuevoHistorialFormaPagoPuntoVenta;
	}

	public void setIsEsNuevoHistorialFormaPagoPuntoVenta(Boolean isEsNuevoHistorialFormaPagoPuntoVenta) {
		this.isEsNuevoHistorialFormaPagoPuntoVenta = isEsNuevoHistorialFormaPagoPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta() {
		return esParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta(Boolean esParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta) {
		this.esParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta = esParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta;
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
	
	
	public void cargarCombosFacturaPuntoVentasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturapuntoventasForeignKey=new ArrayList<FacturaPuntoVenta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaPuntoVentaLogic facturapuntoventaLogic=new FacturaPuntoVentaLogic();

			facturapuntoventaLogic.getFacturaPuntoVentaDataAccess().setIsForForeingKeyData(true);

			if(this.historialformapagopuntoventaSessionBean==null) {
				this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
			}

			if(!this.historialformapagopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionFacturaPuntoVenta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturapuntoventaLogic.getFacturaPuntoVentaDataAccess().setIsForForeingKeyData(true);

					facturapuntoventaLogic.getTodosFacturaPuntoVentasWithConnection(sFinalQuery,new Pagination());

					this.facturapuntoventasForeignKey=facturapuntoventaLogic.getFacturaPuntoVentas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFacturaPuntoVenta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturapuntoventaLogic.getEntityWithConnection(historialformapagopuntoventaSessionBean.getlidFacturaPuntoVentaActual());
					this.facturapuntoventasForeignKey.add(facturapuntoventaLogic.getFacturaPuntoVenta());
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

			if(this.historialformapagopuntoventaSessionBean==null) {
				this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
			}

			if(!this.historialformapagopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(historialformapagopuntoventaSessionBean.getlidEmpresaActual());
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

			if(this.historialformapagopuntoventaSessionBean==null) {
				this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
			}

			if(!this.historialformapagopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(historialformapagopuntoventaSessionBean.getlidSucursalActual());
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

	
	
	public void setActualFacturaPuntoVentaForeignKey(Long idFacturaPuntoVentaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			FacturaPuntoVenta  facturapuntoventaTemp=null;

			for(FacturaPuntoVenta facturapuntoventaAux:facturapuntoventasForeignKey) {
				if(facturapuntoventaAux.getId()!=null && facturapuntoventaAux.getId().equals(idFacturaPuntoVentaSeleccionado)) {
					facturapuntoventaTemp=facturapuntoventaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturapuntoventaTemp!=null) {

					if(this.historialformapagopuntoventa!=null) {
						this.historialformapagopuntoventa.setFacturaPuntoVenta(facturapuntoventaTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setSelectedItem(facturapuntoventaTemp);
					}
				} else {
					//jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setSelectedItem(facturapuntoventaTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFacturaPuntoVenta") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturapuntoventaTemp!=null && jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta!=null) {
						jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setSelectedItem(facturapuntoventaTemp);
					} else {
						if(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta!=null) {
							//jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setSelectedItem(facturapuntoventaTemp);
							if(jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.getItemCount()>0) {
								jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setSelectedIndex(0);
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

	public String getActualFacturaPuntoVentaForeignKeyDescripcion(Long idFacturaPuntoVentaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			FacturaPuntoVenta  facturapuntoventaTemp=null;

			for(FacturaPuntoVenta facturapuntoventaAux:facturapuntoventasForeignKey) {
				if(facturapuntoventaAux.getId()!=null && facturapuntoventaAux.getId().equals(idFacturaPuntoVentaSeleccionado)) {
					facturapuntoventaTemp=facturapuntoventaAux;
					break;
				}
			}


			sDescripcion=FacturaPuntoVentaConstantesFunciones.getFacturaPuntoVentaDescripcion(facturapuntoventaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaPuntoVentaForeignKeyGenerico(Long idFacturaPuntoVentaSeleccionado,JComboBox jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVentaGenerico)throws Exception
	{
		try
		{
			FacturaPuntoVenta  facturapuntoventaTemp=null;

			for(FacturaPuntoVenta facturapuntoventaAux:facturapuntoventasForeignKey) {
				if(facturapuntoventaAux.getId()!=null && facturapuntoventaAux.getId().equals(idFacturaPuntoVentaSeleccionado)) {
					facturapuntoventaTemp=facturapuntoventaAux;
					break;
				}
			}

			if(facturapuntoventaTemp!=null) {
				jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVentaGenerico.setSelectedItem(facturapuntoventaTemp);
			} else {
				if(jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVentaGenerico!=null && jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVentaGenerico.setSelectedIndex(0);
				}
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

					if(this.historialformapagopuntoventa!=null) {
						this.historialformapagopuntoventa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaHistorialFormaPagoPuntoVentaGenerico)throws Exception
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
				jComboBoxid_empresaHistorialFormaPagoPuntoVentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaHistorialFormaPagoPuntoVentaGenerico!=null && jComboBoxid_empresaHistorialFormaPagoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaHistorialFormaPagoPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.historialformapagopuntoventa!=null) {
						this.historialformapagopuntoventa.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalHistorialFormaPagoPuntoVentaGenerico)throws Exception
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
				jComboBoxid_sucursalHistorialFormaPagoPuntoVentaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalHistorialFormaPagoPuntoVentaGenerico!=null && jComboBoxid_sucursalHistorialFormaPagoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalHistorialFormaPagoPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaPuntoVentaForeignKey(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,JComboBox jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVentaGenerico)throws Exception
	{
		try
		{
			FacturaPuntoVenta  facturapuntoventaAux=new FacturaPuntoVenta();

			if(jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVentaGenerico==null) {
				facturapuntoventaAux=(FacturaPuntoVenta)this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.getSelectedItem();
			} else {
				facturapuntoventaAux=(FacturaPuntoVenta)jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVentaGenerico.getSelectedItem();
			}

			if(facturapuntoventaAux!=null && facturapuntoventaAux.getId()!=null) {
				historialformapagopuntoventa.setid_factura_punto_venta(facturapuntoventaAux.getId());
				historialformapagopuntoventa.setfacturapuntoventa_descripcion(HistorialFormaPagoPuntoVentaConstantesFunciones.getFacturaPuntoVentaDescripcion(facturapuntoventaAux));
				historialformapagopuntoventa.setFacturaPuntoVenta(facturapuntoventaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,JComboBox jComboBoxid_empresaHistorialFormaPagoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaHistorialFormaPagoPuntoVentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaHistorialFormaPagoPuntoVentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				historialformapagopuntoventa.setid_empresa(empresaAux.getId());
				historialformapagopuntoventa.setempresa_descripcion(HistorialFormaPagoPuntoVentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				historialformapagopuntoventa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,JComboBox jComboBoxid_sucursalHistorialFormaPagoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalHistorialFormaPagoPuntoVentaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalHistorialFormaPagoPuntoVentaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				historialformapagopuntoventa.setid_sucursal(sucursalAux.getId());
				historialformapagopuntoventa.setsucursal_descripcion(HistorialFormaPagoPuntoVentaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				historialformapagopuntoventa.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturaPuntoVentasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFacturaPuntoVenta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.removeAllItems();

							for(FacturaPuntoVenta facturapuntoventa:this.facturapuntoventasForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.addItem(facturapuntoventa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { 
					}

					if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFacturaPuntoVenta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.removeAllItems();

							for(FacturaPuntoVenta facturapuntoventa:this.facturapuntoventasForeignKey) {
								this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.addItem(facturapuntoventa);
							}
						}

						if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { 
					}

					if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { 
					}

					if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameFacturaPuntoVentaForeignKey(FacturaPuntoVenta facturapuntoventa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setSelectedItem(facturapuntoventa);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setSelectedItem(facturapuntoventa);
						} else {
							this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesHistorialFormaPagoPuntoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			HistorialFormaPagoPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			HistorialFormaPagoPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(FacturaPuntoVenta.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVentas(this.historialformapagopuntoventas);
			historialformapagopuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public HistorialFormaPagoPuntoVentaParameterReturnGeneral getHistorialFormaPagoPuntoVentaParameterGeneral() {
		return this.historialformapagopuntoventaParameterGeneral;
	}
	
	public void setHistorialFormaPagoPuntoVentaParameterGeneral(HistorialFormaPagoPuntoVentaParameterReturnGeneral historialformapagopuntoventaParameterGeneral) {
		this.historialformapagopuntoventaParameterGeneral = historialformapagopuntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoHistorialFormaPagoPuntoVenta() {
		return isPermisoTodoHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoTodoHistorialFormaPagoPuntoVenta(Boolean isPermisoTodoHistorialFormaPagoPuntoVenta) {
		this.isPermisoTodoHistorialFormaPagoPuntoVenta = isPermisoTodoHistorialFormaPagoPuntoVenta;
	}

	public Boolean getIsPermisoNuevoHistorialFormaPagoPuntoVenta() {
		return isPermisoNuevoHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoNuevoHistorialFormaPagoPuntoVenta(Boolean isPermisoNuevoHistorialFormaPagoPuntoVenta) {
		this.isPermisoNuevoHistorialFormaPagoPuntoVenta = isPermisoNuevoHistorialFormaPagoPuntoVenta;
	}

	public Boolean getIsPermisoActualizarHistorialFormaPagoPuntoVenta() {
		return isPermisoActualizarHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoActualizarHistorialFormaPagoPuntoVenta(Boolean isPermisoActualizarHistorialFormaPagoPuntoVenta) {
		this.isPermisoActualizarHistorialFormaPagoPuntoVenta = isPermisoActualizarHistorialFormaPagoPuntoVenta;
	}

	public Boolean getIsPermisoEliminarHistorialFormaPagoPuntoVenta() {
		return isPermisoEliminarHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoEliminarHistorialFormaPagoPuntoVenta(Boolean isPermisoEliminarHistorialFormaPagoPuntoVenta) {
		this.isPermisoEliminarHistorialFormaPagoPuntoVenta = isPermisoEliminarHistorialFormaPagoPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosHistorialFormaPagoPuntoVenta() {
		return isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosHistorialFormaPagoPuntoVenta(Boolean isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta) {
		this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta = isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaHistorialFormaPagoPuntoVenta() {
		return isPermisoConsultaHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoConsultaHistorialFormaPagoPuntoVenta(Boolean isPermisoConsultaHistorialFormaPagoPuntoVenta) {
		this.isPermisoConsultaHistorialFormaPagoPuntoVenta = isPermisoConsultaHistorialFormaPagoPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaHistorialFormaPagoPuntoVenta() {
		return isPermisoBusquedaHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoBusquedaHistorialFormaPagoPuntoVenta(Boolean isPermisoBusquedaHistorialFormaPagoPuntoVenta) {
		this.isPermisoBusquedaHistorialFormaPagoPuntoVenta = isPermisoBusquedaHistorialFormaPagoPuntoVenta;
	}

	public Boolean getIsPermisoReporteHistorialFormaPagoPuntoVenta() {
		return isPermisoReporteHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoReporteHistorialFormaPagoPuntoVenta(Boolean isPermisoReporteHistorialFormaPagoPuntoVenta) {
		this.isPermisoReporteHistorialFormaPagoPuntoVenta = isPermisoReporteHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioHistorialFormaPagoPuntoVenta() {
		return isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioHistorialFormaPagoPuntoVenta(Boolean isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta) {
		this.isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta = isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoHistorialFormaPagoPuntoVenta() {
		return isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoHistorialFormaPagoPuntoVenta(Boolean isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta) {
		this.isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta = isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoHistorialFormaPagoPuntoVenta() {
		return isPermisoPaginacionAltoHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoHistorialFormaPagoPuntoVenta(Boolean isPermisoPaginacionAltoHistorialFormaPagoPuntoVenta) {
		this.isPermisoPaginacionAltoHistorialFormaPagoPuntoVenta = isPermisoPaginacionAltoHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarHistorialFormaPagoPuntoVenta() {
		return isPermisoCopiarHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoCopiarHistorialFormaPagoPuntoVenta(Boolean isPermisoCopiarHistorialFormaPagoPuntoVenta) {
		this.isPermisoCopiarHistorialFormaPagoPuntoVenta = isPermisoCopiarHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormHistorialFormaPagoPuntoVenta() {
		return isPermisoVerFormHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoVerFormHistorialFormaPagoPuntoVenta(Boolean isPermisoVerFormHistorialFormaPagoPuntoVenta) {
		this.isPermisoVerFormHistorialFormaPagoPuntoVenta = isPermisoVerFormHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarHistorialFormaPagoPuntoVenta() {
		return isPermisoDuplicarHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoDuplicarHistorialFormaPagoPuntoVenta(Boolean isPermisoDuplicarHistorialFormaPagoPuntoVenta) {
		this.isPermisoDuplicarHistorialFormaPagoPuntoVenta = isPermisoDuplicarHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenHistorialFormaPagoPuntoVenta() {
		return isPermisoOrdenHistorialFormaPagoPuntoVenta;
	}

	public void setIsPermisoOrdenHistorialFormaPagoPuntoVenta(Boolean isPermisoOrdenHistorialFormaPagoPuntoVenta) {
		this.isPermisoOrdenHistorialFormaPagoPuntoVenta = isPermisoOrdenHistorialFormaPagoPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta = isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta = isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta = isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta = isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta = isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta = isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta = isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta = isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta = isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta = isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta = isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta = isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta;
	}
		
	public HistorialFormaPagoPuntoVentaSessionBean gethistorialformapagopuntoventaSessionBean() {
		return this.historialformapagopuntoventaSessionBean;
	}
	
	public void sethistorialformapagopuntoventaSessionBean(HistorialFormaPagoPuntoVentaSessionBean historialformapagopuntoventaSessionBean) {
		this.historialformapagopuntoventaSessionBean=historialformapagopuntoventaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFacturaPuntoVenta() {
		return this.isVisibilidadFK_IdFacturaPuntoVenta;
	}

	public void setisVisibilidadFK_IdFacturaPuntoVenta(Boolean isVisibilidadFK_IdFacturaPuntoVenta) {
		this.isVisibilidadFK_IdFacturaPuntoVenta=isVisibilidadFK_IdFacturaPuntoVenta;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa)throws Exception {
		try {
			
				this.setActualParaGuardarFacturaPuntoVentaForeignKey(historialformapagopuntoventa,null);
				this.setActualParaGuardarEmpresaForeignKey(historialformapagopuntoventa,null);
				this.setActualParaGuardarSucursalForeignKey(historialformapagopuntoventa,null);
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
	
	public void bugActualizarReferenciaActual(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalHistorialFormaPagoPuntoVenta(historialformapagopuntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		historialformapagopuntoventaAux.setId(historialformapagopuntoventa.getId());
		historialformapagopuntoventaAux.setVersionRow(historialformapagopuntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessHistorialFormaPagoPuntoVenta();
		
			int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = historialformapagopuntoventaValidator.getInvalidValues(this.historialformapagopuntoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			historialformapagopuntoventaLogic.setDatosCliente(datosCliente);
			historialformapagopuntoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				historialformapagopuntoventaAux=new  HistorialFormaPagoPuntoVenta();
				
				historialformapagopuntoventaAux.setIsNew(true);
				historialformapagopuntoventaAux.setIsChanged(true);
				
				historialformapagopuntoventaAux.setHistorialFormaPagoPuntoVentaOriginal(this.historialformapagopuntoventa);
				
				historialformapagopuntoventaAux.setId(this.historialformapagopuntoventa.getId());	
				historialformapagopuntoventaAux.setVersionRow(this.historialformapagopuntoventa.getVersionRow());	
				historialformapagopuntoventaAux.setid_factura_punto_venta(this.historialformapagopuntoventa.getid_factura_punto_venta());	
				historialformapagopuntoventaAux.setid_empresa(this.historialformapagopuntoventa.getid_empresa());	
				historialformapagopuntoventaAux.setid_sucursal(this.historialformapagopuntoventa.getid_sucursal());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventaLogic.saveHistorialFormaPagoPuntoVentas();//WithConnection
						//historialformapagopuntoventaLogic.getSetVersionRowHistorialFormaPagoPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialformapagopuntoventa,historialformapagopuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesHistorialFormaPagoPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialformapagopuntoventaLogic.saveHistorialFormaPagoPuntoVentaRelaciones(historialformapagopuntoventaAux);//WithConnection
								//historialformapagopuntoventaLogic.getSetVersionRowHistorialFormaPagoPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialformapagopuntoventa,historialformapagopuntoventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialformapagopuntoventa,historialformapagopuntoventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				historialformapagopuntoventaAux=new  HistorialFormaPagoPuntoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado() && this.historialformapagopuntoventa.getId()>=0)) {
						
					historialformapagopuntoventaAux.setIsNew(false);
				}
				
				historialformapagopuntoventaAux.setIsDeleted(false);
			
				historialformapagopuntoventaAux.setId(this.historialformapagopuntoventa.getId());	
				historialformapagopuntoventaAux.setVersionRow(this.historialformapagopuntoventa.getVersionRow());	
				historialformapagopuntoventaAux.setid_factura_punto_venta(this.historialformapagopuntoventa.getid_factura_punto_venta());	
				historialformapagopuntoventaAux.setid_empresa(this.historialformapagopuntoventa.getid_empresa());	
				historialformapagopuntoventaAux.setid_sucursal(this.historialformapagopuntoventa.getid_sucursal());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventaLogic.saveHistorialFormaPagoPuntoVentas();//WithConnection
						//historialformapagopuntoventaLogic.getSetVersionRowHistorialFormaPagoPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialformapagopuntoventa,historialformapagopuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesHistorialFormaPagoPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialformapagopuntoventaLogic.saveHistorialFormaPagoPuntoVentaRelaciones(historialformapagopuntoventaAux);//WithConnection
								//historialformapagopuntoventaLogic.getSetVersionRowHistorialFormaPagoPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialformapagopuntoventa,historialformapagopuntoventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialformapagopuntoventa,historialformapagopuntoventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				historialformapagopuntoventaAux=new  HistorialFormaPagoPuntoVenta();
				
				historialformapagopuntoventaAux.setIsNew(false);
				historialformapagopuntoventaAux.setIsChanged(false);
				
				historialformapagopuntoventaAux.setIsDeleted(true);
				
				historialformapagopuntoventaAux.setId(this.historialformapagopuntoventa.getId());	
				historialformapagopuntoventaAux.setVersionRow(this.historialformapagopuntoventa.getVersionRow());	
				historialformapagopuntoventaAux.setid_factura_punto_venta(this.historialformapagopuntoventa.getid_factura_punto_venta());	
				historialformapagopuntoventaAux.setid_empresa(this.historialformapagopuntoventa.getid_empresa());	
				historialformapagopuntoventaAux.setid_sucursal(this.historialformapagopuntoventa.getid_sucursal());	
				
				if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.historialformapagopuntoventaAux.getId()>=0) {	
						this.historialformapagopuntoventasEliminados.add(historialformapagopuntoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventaLogic.saveHistorialFormaPagoPuntoVentas();//WithConnection
						//historialformapagopuntoventaLogic.getSetVersionRowHistorialFormaPagoPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialformapagopuntoventaLogic.saveHistorialFormaPagoPuntoVentaRelaciones(historialformapagopuntoventaAux);//WithConnection
								//historialformapagopuntoventaLogic.getSetVersionRowHistorialFormaPagoPuntoVentas();//WithConnection
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
							if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(historialformapagopuntoventaAux,historialformapagopuntoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().addAll(this.historialformapagopuntoventasEliminados);
					
					historialformapagopuntoventaLogic.saveHistorialFormaPagoPuntoVentas();//WithConnection
					//historialformapagopuntoventaLogic.getSetVersionRowHistorialFormaPagoPuntoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesHistorialFormaPagoPuntoVenta();
				
				this.historialformapagopuntoventasEliminados= new ArrayList<HistorialFormaPagoPuntoVenta>();		
			}
			
			if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Historial Forma Pago Punto Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.historialformapagopuntoventa=historialformapagopuntoventaAux;
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
      		//this.finishProcessHistorialFormaPagoPuntoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(HistorialFormaPagoPuntoVenta historialformapagopuntoventaLocal) throws Exception {
		
		if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(HistorialFormaPagoPuntoVenta historialformapagopuntoventaLocal) throws Exception {	
		if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(FacturaPuntoVentaDetalleFormJInternalFrame.class)) {
				FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrameLocal=(FacturaPuntoVentaBeanSwingJInternalFrame) ((FacturaPuntoVentaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturapuntoventaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFacturaPuntoVenta(facturapuntoventaBeanSwingJInternalFrameLocal.getfacturapuntoventa(),true);
				facturapuntoventaBeanSwingJInternalFrameLocal.actualizarLista(facturapuntoventaBeanSwingJInternalFrameLocal.facturapuntoventa,this.facturapuntoventasForeignKey);

				facturapuntoventaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturapuntoventaBeanSwingJInternalFrameLocal.facturapuntoventa);

				historialformapagopuntoventaLocal.setFacturaPuntoVenta(facturapuntoventaBeanSwingJInternalFrameLocal.facturapuntoventa);

				this.addItemDefectoCombosForeignKeyFacturaPuntoVenta();
				this.cargarCombosFrameFacturaPuntoVentasForeignKey("Formulario");
				this.setActualFacturaPuntoVentaForeignKey(facturapuntoventaBeanSwingJInternalFrameLocal.facturapuntoventa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				historialformapagopuntoventaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				historialformapagopuntoventaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarHistorialFormaPagoPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = historialformapagopuntoventaValidator.getInvalidValues(this.historialformapagopuntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventas) throws Exception {
		try	{		
			HistorialFormaPagoPuntoVentaConstantesFunciones.actualizarLista(historialformapagopuntoventa,historialformapagopuntoventas,this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventas) throws Exception {
		try	{			
			HistorialFormaPagoPuntoVentaConstantesFunciones.actualizarSelectedLista(historialformapagopuntoventa,historialformapagopuntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				historialformapagopuntoventasLocal=this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				historialformapagopuntoventasLocal=this.historialformapagopuntoventas;
			}
			//ARCHITECTURE
		
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaLocal:historialformapagopuntoventasLocal) {
				if(this.permiteMantenimiento(historialformapagopuntoventaLocal) && historialformapagopuntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+HistorialFormaPagoPuntoVentaConstantesFunciones.getHistorialFormaPagoPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoPuntoVentaConstantesFunciones.IDFACTURAPUNTOVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoPuntoVentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelid_empresaHistorialFormaPagoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialFormaPagoPuntoVentaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelid_sucursalHistorialFormaPagoPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelid_factura_punto_ventaHistorialFormaPagoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelid_empresaHistorialFormaPagoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelid_sucursalHistorialFormaPagoPuntoVenta,"");
		
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
		this.iIdNuevoHistorialFormaPagoPuntoVenta--;	
		
		
		this.historialformapagopuntoventaAux=new HistorialFormaPagoPuntoVenta();
		
		this.historialformapagopuntoventaAux.setId(this.iIdNuevoHistorialFormaPagoPuntoVenta);
		this.historialformapagopuntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().add(this.historialformapagopuntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.historialformapagopuntoventas.add(this.historialformapagopuntoventaAux);
		}
		//ARCHITECTURE
		
		this.historialformapagopuntoventa=this.historialformapagopuntoventaAux;
		
		if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
		}
				
		//this.setDefaultControlesHistorialFormaPagoPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyHistorialFormaPagoPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyHistorialFormaPagoPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialFormaPagoPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaBean,this.historialformapagopuntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
			classes=HistorialFormaPagoPuntoVentaConstantesFunciones.getClassesRelationshipsOfHistorialFormaPagoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.historialformapagopuntoventaReturnGeneral=historialformapagopuntoventaLogic.procesarEventosHistorialFormaPagoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas(),this.historialformapagopuntoventa,this.historialformapagopuntoventaParameterGeneral,this.isEsNuevoHistorialFormaPagoPuntoVenta,classes);//this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaReturnGeneral,this.historialformapagopuntoventaBean,false);
		
		if(this.historialformapagopuntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta());
		}
		
		if(this.historialformapagopuntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta(),classes);//this.historialformapagopuntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyHistorialFormaPagoPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyHistorialFormaPagoPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.RecargarFormHistorialFormaPagoPuntoVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
						
			if(historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialFormaPagoPuntoVenta();
			}
			
			this.actualizarVisualTableDatosHistorialFormaPagoPuntoVenta();
			
			this.jTableDatosHistorialFormaPagoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoHistorialFormaPagoPuntoVenta(), this.getIndiceNuevoHistorialFormaPagoPuntoVenta());
			
			this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesHistorialFormaPagoPuntoVenta(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setEnabled(isHabilitar && this.historialformapagopuntoventaConstantesFunciones.activarid_factura_punto_ventaHistorialFormaPagoPuntoVenta);//
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setEnabled(isHabilitar && this.historialformapagopuntoventaConstantesFunciones.activarid_empresaHistorialFormaPagoPuntoVenta);//
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setEnabled(isHabilitar && this.historialformapagopuntoventaConstantesFunciones.activarid_sucursalHistorialFormaPagoPuntoVenta);
	};
	
	public void setDefaultControlesHistorialFormaPagoPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoHistorialFormaPagoPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.historialformapagopuntoventaSessionBean.setConGuardarRelaciones(true);			
			this.historialformapagopuntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.setVisible(true);
			
					
		} else {
			//this.historialformapagopuntoventaSessionBean.setConGuardarRelaciones(false);			
			this.historialformapagopuntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoHistorialFormaPagoPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
				if(historialformapagopuntoventaAux.getId().equals(this.iIdNuevoHistorialFormaPagoPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventas) {
				if(historialformapagopuntoventaAux.getId().equals(this.iIdNuevoHistorialFormaPagoPuntoVenta)) {
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
	
	public int getIndiceActualHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
				if(historialformapagopuntoventaAux.getId().equals(historialformapagopuntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventas) {
				if(historialformapagopuntoventaAux.getId().equals(historialformapagopuntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
				if(historialformapagopuntoventaAux.getHistorialFormaPagoPuntoVentaOriginal().getId().equals(historialformapagopuntoventaOriginal.getId())) {
					existe=true;
					historialformapagopuntoventaOriginal.setId(historialformapagopuntoventaAux.getId());
					historialformapagopuntoventaOriginal.setVersionRow(historialformapagopuntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventas) {
				if(historialformapagopuntoventaAux.getHistorialFormaPagoPuntoVentaOriginal().getId().equals(historialformapagopuntoventaOriginal.getId())) {
					existe=true;
					historialformapagopuntoventaOriginal.setId(historialformapagopuntoventaAux.getId());
					historialformapagopuntoventaOriginal.setVersionRow(historialformapagopuntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosHistorialFormaPagoPuntoVenta(Boolean esParaCancelar) throws Exception {
		historialformapagopuntoventasAux=new ArrayList<HistorialFormaPagoPuntoVenta>();
		historialformapagopuntoventaAux=new HistorialFormaPagoPuntoVenta();
		
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
					if(historialformapagopuntoventaAux.getId()<0) {
						historialformapagopuntoventasAux.add(historialformapagopuntoventaAux);
					}		
				}
				this.iIdNuevoHistorialFormaPagoPuntoVenta=0L;
				this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().removeAll(historialformapagopuntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventas) {
					if(historialformapagopuntoventaAux.getId()<0) {
						historialformapagopuntoventasAux.add(historialformapagopuntoventaAux);
					}		
				}
				this.iIdNuevoHistorialFormaPagoPuntoVenta=0L;
				this.historialformapagopuntoventas.removeAll(historialformapagopuntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoHistorialFormaPagoPuntoVenta 
					&& this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size()>0
					) {
					historialformapagopuntoventaAux=this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().get(this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size() - 1);
				
					if(historialformapagopuntoventaAux.getId()<0) {
						this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().remove(historialformapagopuntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoHistorialFormaPagoPuntoVenta && this.historialformapagopuntoventas.size()>0) {
					historialformapagopuntoventaAux=this.historialformapagopuntoventas.get(this.historialformapagopuntoventas.size() - 1);
				
					if(historialformapagopuntoventaAux.getId()<0) {
						this.historialformapagopuntoventas.remove(historialformapagopuntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoHistorialFormaPagoPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(historialformapagopuntoventa.getId()<0) {
				this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().remove(this.historialformapagopuntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(historialformapagopuntoventa.getId()<0) {
				this.historialformapagopuntoventas.remove(this.historialformapagopuntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesHistorialFormaPagoPuntoVenta(List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasAux) throws Exception {
		HistorialFormaPagoPuntoVentaConstantesFunciones.setEstadosInicialesHistorialFormaPagoPuntoVenta(historialformapagopuntoventasAux);
	}
	
	public void setEstadosInicialesHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux) throws Exception {
		HistorialFormaPagoPuntoVentaConstantesFunciones.setEstadosInicialesHistorialFormaPagoPuntoVenta(historialformapagopuntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarHistorialFormaPagoPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarHistorialFormaPagoPuntoVentaActual()) {
				if(!this.isEsNuevoHistorialFormaPagoPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoHistorialFormaPagoPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarHistorialFormaPagoPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Historial Forma Pago Punto Venta ?", "MANTENIMIENTO DE Historial Forma Pago Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(HistorialFormaPagoPuntoVenta historialformapagopuntoventa) throws Exception {
		HistorialFormaPagoPuntoVentaConstantesFunciones.seleccionarAsignar(this.historialformapagopuntoventa,historialformapagopuntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarHistorialFormaPagoPuntoVenta=this.isPermisoActualizarOriginalHistorialFormaPagoPuntoVenta;
			
			
			this.seleccionarAsignar(historialformapagopuntoventa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialFormaPagoPuntoVentaConstantesFunciones.quitarEspaciosHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.historialformapagopuntoventaSessionBean.setsFuncionBusquedaRapida(this.historialformapagopuntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoHistorialFormaPagoPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosHistorialFormaPagoPuntoVenta(esParaCancelar);				
				this.cancelarNuevoHistorialFormaPagoPuntoVenta(esParaCancelar);								
			}
			
			this.historialformapagopuntoventa=new HistorialFormaPagoPuntoVenta();
			
			this.inicializarHistorialFormaPagoPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarHistorialFormaPagoPuntoVenta() throws Exception {
		try {
			HistorialFormaPagoPuntoVentaConstantesFunciones.inicializarHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteHistorialFormaPagoPuntoVentas(String sAccionBusqueda,List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="HistorialFormaPagoPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="HistorialFormaPagoPuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("HistorialFormaPagoPuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="HistorialFormaPagoPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Historial Forma Pago Punto Ventas");		
		parameters.put("busquedapor", HistorialFormaPagoPuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceHistorialFormaPagoPuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			HistorialFormaPagoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			HistorialFormaPagoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceHistorialFormaPagoPuntoVenta=new JRBeanArrayDataSource(HistorialFormaPagoPuntoVentaJInternalFrame.TraerHistorialFormaPagoPuntoVentaBeans(historialformapagopuntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceHistorialFormaPagoPuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+HistorialFormaPagoPuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(HistorialFormaPagoPuntoVentaBean.TraerHistorialFormaPagoPuntoVentaBeans(historialformapagopuntoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteHistorialFormaPagoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,historialformapagopuntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalHistorialFormaPagoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,historialformapagopuntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(null);
					//this.generarExcelReporteHistorialFormaPagoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,historialformapagopuntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalHistorialFormaPagoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,historialformapagopuntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesHistorialFormaPagoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,historialformapagopuntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesHistorialFormaPagoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,historialformapagopuntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHistorialFormaPagoPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapagopuntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialFormaPagoPuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialFormaPagoPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa : historialformapagopuntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			HistorialFormaPagoPuntoVentaConstantesFunciones.generarExcelReporteDataHistorialFormaPagoPuntoVenta("NORMAL",row,workbook,historialformapagopuntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderHistorialFormaPagoPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		HistorialFormaPagoPuntoVentaConstantesFunciones.generarExcelReporteHeaderHistorialFormaPagoPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalHistorialFormaPagoPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapagopuntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialFormaPagoPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa : historialformapagopuntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.getHistorialFormaPagoPuntoVentaDescripcion(historialformapagopuntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapagopuntoventa.getfacturapuntoventa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapagopuntoventa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialformapagopuntoventa.getsucursal_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesHistorialFormaPagoPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasRespaldo=null;
		
		classes=HistorialFormaPagoPuntoVentaConstantesFunciones.getClassesRelationshipsOfHistorialFormaPagoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.historialformapagopuntoventaLogic.setDatosCliente(this.datosCliente);
		this.historialformapagopuntoventaLogic.setDatosDeep(this.datosDeep);
		this.historialformapagopuntoventaLogic.setIsConDeep(true);
		
		historialformapagopuntoventasRespaldo=this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas();
		
		this.historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVentas(historialformapagopuntoventasParaReportes);	
		this.historialformapagopuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		historialformapagopuntoventasParaReportes=this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas();
		this.historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVentas(historialformapagopuntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapagopuntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialFormaPagoPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialFormaPagoPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa : historialformapagopuntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderHistorialFormaPagoPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			HistorialFormaPagoPuntoVentaConstantesFunciones.generarExcelReporteDataHistorialFormaPagoPuntoVenta("NORMAL",row,workbook,historialformapagopuntoventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.getHistorialFormaPagoPuntoVentaDescripcion(historialformapagopuntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessHistorialFormaPagoPuntoVenta() throws Exception {		
		this.startProcessHistorialFormaPagoPuntoVenta(true);
	}
	
	public void startProcessHistorialFormaPagoPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta ,this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta, this.jScrollPanelDatosHistorialFormaPagoPuntoVenta,this.jPanelPaginacionHistorialFormaPagoPuntoVenta, this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta, this.jPanelAccionesHistorialFormaPagoPuntoVenta,this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta,this.jmenuBarHistorialFormaPagoPuntoVenta,this.jmenuBarDetalleHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarDetalleHistorialFormaPagoPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta=this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta; 
		
		final JPanel jPanelParametrosReportesHistorialFormaPagoPuntoVenta=this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta;
		//final JScrollPane jScrollPanelDatosHistorialFormaPagoPuntoVenta=this.jScrollPanelDatosHistorialFormaPagoPuntoVenta;
		final JTable jTableDatosHistorialFormaPagoPuntoVenta=this.jTableDatosHistorialFormaPagoPuntoVenta;		
		final JPanel jPanelPaginacionHistorialFormaPagoPuntoVenta=this.jPanelPaginacionHistorialFormaPagoPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta=this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta;
		final JPanel jPanelAccionesHistorialFormaPagoPuntoVenta=this.jPanelAccionesHistorialFormaPagoPuntoVenta;
		
		JPanel jPanelCamposAuxiliarHistorialFormaPagoPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarHistorialFormaPagoPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			jPanelCamposAuxiliarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jPanelCamposHistorialFormaPagoPuntoVenta;
			jPanelAccionesFormularioAuxiliarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta;
		}
		
		final JPanel jPanelCamposHistorialFormaPagoPuntoVenta=jPanelCamposAuxiliarHistorialFormaPagoPuntoVenta;
		final JPanel jPanelAccionesFormularioHistorialFormaPagoPuntoVenta=jPanelAccionesFormularioAuxiliarHistorialFormaPagoPuntoVenta;
		
		
		final JMenuBar jmenuBarHistorialFormaPagoPuntoVenta=this.jmenuBarHistorialFormaPagoPuntoVenta;
		final JToolBar jTtoolBarHistorialFormaPagoPuntoVenta=this.jTtoolBarHistorialFormaPagoPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarHistorialFormaPagoPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialFormaPagoPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jmenuBarDetalleHistorialFormaPagoPuntoVenta;
			jTtoolBarDetalleAuxiliarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTtoolBarDetalleHistorialFormaPagoPuntoVenta;
		}
		
		final JMenuBar jmenuBarDetalleHistorialFormaPagoPuntoVenta=jmenuBarDetalleAuxiliarHistorialFormaPagoPuntoVenta;
		final JToolBar jTtoolBarDetalleHistorialFormaPagoPuntoVenta=jTtoolBarDetalleAuxiliarHistorialFormaPagoPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialFormaPagoPuntoVenta;
			processRunnable.jTableDatos=jTableDatosHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialFormaPagoPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialFormaPagoPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialFormaPagoPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarHistorialFormaPagoPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialFormaPagoPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta ,jPanelParametrosReportesHistorialFormaPagoPuntoVenta,jTableDatosHistorialFormaPagoPuntoVenta, /*jScrollPanelDatosHistorialFormaPagoPuntoVenta,*/jPanelCamposHistorialFormaPagoPuntoVenta,jPanelPaginacionHistorialFormaPagoPuntoVenta, /*jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta,*/ jPanelAccionesHistorialFormaPagoPuntoVenta,jPanelAccionesFormularioHistorialFormaPagoPuntoVenta,jmenuBarHistorialFormaPagoPuntoVenta,jmenuBarDetalleHistorialFormaPagoPuntoVenta,jTtoolBarHistorialFormaPagoPuntoVenta,jTtoolBarDetalleHistorialFormaPagoPuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta ,jPanelParametrosReportesHistorialFormaPagoPuntoVenta, jScrollPanelDatosHistorialFormaPagoPuntoVenta,jPanelPaginacionHistorialFormaPagoPuntoVenta, jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta, jPanelAccionesHistorialFormaPagoPuntoVenta,jPanelAccionesFormularioHistorialFormaPagoPuntoVenta,jmenuBarHistorialFormaPagoPuntoVenta,jmenuBarDetalleHistorialFormaPagoPuntoVenta,jTtoolBarHistorialFormaPagoPuntoVenta,jTtoolBarDetalleHistorialFormaPagoPuntoVenta);
						
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
	
	public void finishProcessHistorialFormaPagoPuntoVenta() {// throws Exception 
		this.finishProcessHistorialFormaPagoPuntoVenta(true);
	}
	
	public void finishProcessHistorialFormaPagoPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta ,this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta, this.jScrollPanelDatosHistorialFormaPagoPuntoVenta,this.jPanelPaginacionHistorialFormaPagoPuntoVenta, this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta, this.jPanelAccionesHistorialFormaPagoPuntoVenta,this.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta,this.jmenuBarHistorialFormaPagoPuntoVenta,this.jmenuBarDetalleHistorialFormaPagoPuntoVenta,this.jTtoolBarHistorialFormaPagoPuntoVenta,this.jTtoolBarDetalleHistorialFormaPagoPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta=this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta; 
		
		final JPanel jPanelParametrosReportesHistorialFormaPagoPuntoVenta=this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta;
		//final JScrollPane jScrollPanelDatosHistorialFormaPagoPuntoVenta=this.jScrollPanelDatosHistorialFormaPagoPuntoVenta;
		final JTable jTableDatosHistorialFormaPagoPuntoVenta=this.jTableDatosHistorialFormaPagoPuntoVenta;		
		final JPanel jPanelPaginacionHistorialFormaPagoPuntoVenta=this.jPanelPaginacionHistorialFormaPagoPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta=this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta;
		final JPanel jPanelAccionesHistorialFormaPagoPuntoVenta=this.jPanelAccionesHistorialFormaPagoPuntoVenta;
		
		JPanel jPanelCamposAuxiliarHistorialFormaPagoPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarHistorialFormaPagoPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			jPanelCamposAuxiliarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jPanelCamposHistorialFormaPagoPuntoVenta;
			jPanelAccionesFormularioAuxiliarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jPanelAccionesFormularioHistorialFormaPagoPuntoVenta;
		}
		
		final JPanel jPanelCamposHistorialFormaPagoPuntoVenta=jPanelCamposAuxiliarHistorialFormaPagoPuntoVenta;
		final JPanel jPanelAccionesFormularioHistorialFormaPagoPuntoVenta=jPanelAccionesFormularioAuxiliarHistorialFormaPagoPuntoVenta;
		
		
		final JMenuBar jmenuBarHistorialFormaPagoPuntoVenta=this.jmenuBarHistorialFormaPagoPuntoVenta;		
		final JToolBar jTtoolBarHistorialFormaPagoPuntoVenta=this.jTtoolBarHistorialFormaPagoPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarHistorialFormaPagoPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialFormaPagoPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jmenuBarDetalleHistorialFormaPagoPuntoVenta;
			jTtoolBarDetalleAuxiliarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTtoolBarDetalleHistorialFormaPagoPuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleHistorialFormaPagoPuntoVenta=jmenuBarDetalleAuxiliarHistorialFormaPagoPuntoVenta;
		final JToolBar jTtoolBarDetalleHistorialFormaPagoPuntoVenta=jTtoolBarDetalleAuxiliarHistorialFormaPagoPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialFormaPagoPuntoVenta;
			processRunnable.jTableDatos=jTableDatosHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialFormaPagoPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialFormaPagoPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialFormaPagoPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialFormaPagoPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarHistorialFormaPagoPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialFormaPagoPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta ,jPanelParametrosReportesHistorialFormaPagoPuntoVenta, jTableDatosHistorialFormaPagoPuntoVenta,/*jScrollPanelDatosHistorialFormaPagoPuntoVenta,*/jPanelCamposHistorialFormaPagoPuntoVenta,jPanelPaginacionHistorialFormaPagoPuntoVenta, /*jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta,*/ jPanelAccionesHistorialFormaPagoPuntoVenta,jPanelAccionesFormularioHistorialFormaPagoPuntoVenta,jmenuBarHistorialFormaPagoPuntoVenta,jmenuBarDetalleHistorialFormaPagoPuntoVenta,jTtoolBarHistorialFormaPagoPuntoVenta,jTtoolBarDetalleHistorialFormaPagoPuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesHistorialFormaPagoPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarHistorialFormaPagoPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuHistorialFormaPagoPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarHistorialFormaPagoPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarHistorialFormaPagoPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleHistorialFormaPagoPuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuHistorialFormaPagoPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarHistorialFormaPagoPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleHistorialFormaPagoPuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.historialformapagopuntoventaConstantesFunciones.getsFinalQueryHistorialFormaPagoPuntoVenta();
		String  finalQueryPaginacionTodos=this.historialformapagopuntoventaConstantesFunciones.getsFinalQueryHistorialFormaPagoPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=HistorialFormaPagoPuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoHistorialFormaPagoPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=HistorialFormaPagoPuntoVentaConstantesFunciones.getArrayColumnasGlobalesHistorialFormaPagoPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,HistorialFormaPagoPuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.historialformapagopuntoventasEliminados= new ArrayList<HistorialFormaPagoPuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessHistorialFormaPagoPuntoVenta();
		
				///*HistorialFormaPagoPuntoVentaSessionBean*/this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
			
			if(this.historialformapagopuntoventaSessionBean==null) {
				this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
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
					this.iNumeroPaginacion=HistorialFormaPagoPuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=HistorialFormaPagoPuntoVentaConstantesFunciones.getClassesForeignKeysOfHistorialFormaPagoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/historialformapagopuntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			historialformapagopuntoventasAux= new ArrayList<HistorialFormaPagoPuntoVenta>();
			
				
			historialformapagopuntoventaLogic.setDatosCliente(this.datosCliente);
			historialformapagopuntoventaLogic.setDatosDeep(this.datosDeep);
			historialformapagopuntoventaLogic.setIsConDeep(true);
			
			
			historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					historialformapagopuntoventaLogic.getTodosHistorialFormaPagoPuntoVentas(finalQueryGlobal,pagination);
					
					//historialformapagopuntoventaLogic.getTodosHistorialFormaPagoPuntoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()==null|| historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialformapagopuntoventasAux= new ArrayList<HistorialFormaPagoPuntoVenta>();
							historialformapagopuntoventasAux.addAll(historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagopuntoventasAux= new ArrayList<HistorialFormaPagoPuntoVenta>();
							historialformapagopuntoventasAux.addAll(historialformapagopuntoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialformapagopuntoventaLogic.getTodosHistorialFormaPagoPuntoVentas(finalQueryGlobal+"",this.pagination);												
							
							//historialformapagopuntoventaLogic.getTodosHistorialFormaPagoPuntoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteHistorialFormaPagoPuntoVentas("Todos",historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVentas(new ArrayList<HistorialFormaPagoPuntoVenta>());					
							historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().addAll(historialformapagopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagopuntoventas=new ArrayList<HistorialFormaPagoPuntoVenta>();
							historialformapagopuntoventas.addAll(historialformapagopuntoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idHistorialFormaPagoPuntoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idHistorialFormaPagoPuntoVenta=this.idActual;
				
				} else if(this.idHistorialFormaPagoPuntoVentaActual!=null && this.idHistorialFormaPagoPuntoVentaActual!=0L) {
					idHistorialFormaPagoPuntoVenta=idHistorialFormaPagoPuntoVentaActual;
				}
				
					
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndicePorId(idHistorialFormaPagoPuntoVenta);
				
				this.historialformapagopuntoventas=new ArrayList<HistorialFormaPagoPuntoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					historialformapagopuntoventaLogic.getEntity(idHistorialFormaPagoPuntoVenta);
					
					//historialformapagopuntoventaLogic.getEntityWithConnection(idHistorialFormaPagoPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVentas(new ArrayList<HistorialFormaPagoPuntoVenta>());
					historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().add(historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapagopuntoventas=new ArrayList<HistorialFormaPagoPuntoVenta>();
					this.historialformapagopuntoventas.add(historialformapagopuntoventa);
				}
				
				if(historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()==null||historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagopuntoventas==null|| historialformapagopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventasAux=new ArrayList<HistorialFormaPagoPuntoVenta>();
						historialformapagopuntoventasAux.addAll(historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagopuntoventasAux=new ArrayList<HistorialFormaPagoPuntoVenta>();
							historialformapagopuntoventasAux.addAll(historialformapagopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagoPuntoVentas("FK_IdEmpresa",historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagoPuntoVentas("FK_IdEmpresa",historialformapagopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVentas(new ArrayList<HistorialFormaPagoPuntoVenta>());
						historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().addAll(historialformapagopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagopuntoventas=new ArrayList<HistorialFormaPagoPuntoVenta>();
							historialformapagopuntoventas.addAll(historialformapagopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFacturaPuntoVenta")) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentasFK_IdFacturaPuntoVenta(finalQueryGlobal,pagination,id_factura_punto_ventaFK_IdFacturaPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()==null||historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagopuntoventas==null|| historialformapagopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventasAux=new ArrayList<HistorialFormaPagoPuntoVenta>();
						historialformapagopuntoventasAux.addAll(historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagopuntoventasAux=new ArrayList<HistorialFormaPagoPuntoVenta>();
							historialformapagopuntoventasAux.addAll(historialformapagopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentasFK_IdFacturaPuntoVenta(finalQueryGlobal,pagination,id_factura_punto_ventaFK_IdFacturaPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdFacturaPuntoVenta(id_factura_punto_ventaFK_IdFacturaPuntoVenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagoPuntoVentas("FK_IdFacturaPuntoVenta",historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagoPuntoVentas("FK_IdFacturaPuntoVenta",historialformapagopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVentas(new ArrayList<HistorialFormaPagoPuntoVenta>());
						historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().addAll(historialformapagopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagopuntoventas=new ArrayList<HistorialFormaPagoPuntoVenta>();
							historialformapagopuntoventas.addAll(historialformapagopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()==null||historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialformapagopuntoventas==null|| historialformapagopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventasAux=new ArrayList<HistorialFormaPagoPuntoVenta>();
						historialformapagopuntoventasAux.addAll(historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagopuntoventasAux=new ArrayList<HistorialFormaPagoPuntoVenta>();
							historialformapagopuntoventasAux.addAll(historialformapagopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialFormaPagoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialFormaPagoPuntoVentas("FK_IdSucursal",historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialFormaPagoPuntoVentas("FK_IdSucursal",historialformapagopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVentas(new ArrayList<HistorialFormaPagoPuntoVenta>());
						historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().addAll(historialformapagopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagopuntoventas=new ArrayList<HistorialFormaPagoPuntoVenta>();
							historialformapagopuntoventas.addAll(historialformapagopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesHistorialFormaPagoPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessHistorialFormaPagoPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialformapagopuntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialformapagopuntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(HistorialFormaPagoPuntoVenta historialformapagopuntoventa) {
		Boolean permite=true;
		
		if(this.historialformapagopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=HistorialFormaPagoPuntoVentaConstantesFunciones.getOrderByListaHistorialFormaPagoPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=HistorialFormaPagoPuntoVentaConstantesFunciones.getOrderByListaHistorialFormaPagoPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa:historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
				if(historialformapagopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					historialformapagopuntoventaTotales=historialformapagopuntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa:this.historialformapagopuntoventas) {
				if(historialformapagopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					historialformapagopuntoventaTotales=historialformapagopuntoventa;
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
			this.historialformapagopuntoventaAux=new HistorialFormaPagoPuntoVenta();
			this.historialformapagopuntoventaAux.setsType(Constantes2.S_TOTALES);
			this.historialformapagopuntoventaAux.setIsNew(false);
			this.historialformapagopuntoventaAux.setIsChanged(false);
			this.historialformapagopuntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				HistorialFormaPagoPuntoVentaConstantesFunciones.TotalizarValoresFilaHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas(),this.historialformapagopuntoventaAux);
				
				this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().add(this.historialformapagopuntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				HistorialFormaPagoPuntoVentaConstantesFunciones.TotalizarValoresFilaHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventas,this.historialformapagopuntoventaAux);
				
				this.historialformapagopuntoventas.add(this.historialformapagopuntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		historialformapagopuntoventaTotales=new HistorialFormaPagoPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().remove(historialformapagopuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialformapagopuntoventas.remove(historialformapagopuntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		historialformapagopuntoventaTotales=new HistorialFormaPagoPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa:historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
				if(historialformapagopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					historialformapagopuntoventaTotales=historialformapagopuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialFormaPagoPuntoVentaConstantesFunciones.TotalizarValoresFilaHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas(),historialformapagopuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa:this.historialformapagopuntoventas) {
				if(historialformapagopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					historialformapagopuntoventaTotales=historialformapagopuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialFormaPagoPuntoVentaConstantesFunciones.TotalizarValoresFilaHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventas,historialformapagopuntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getHistorialFormaPagoPuntoVentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagoPuntoVentasFK_IdFacturaPuntoVenta()throws Exception {
		try {
			sAccionBusqueda="FK_IdFacturaPuntoVenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialFormaPagoPuntoVentasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getHistorialFormaPagoPuntoVentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagoPuntoVentasFK_IdFacturaPuntoVenta(String sFinalQuery,Long id_factura_punto_venta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentasFK_IdFacturaPuntoVenta(sFinalQuery,this.pagination,id_factura_punto_venta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialFormaPagoPuntoVentasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosHistorialFormaPagoPuntoVenta() {
		this.isPermisoTodoHistorialFormaPagoPuntoVenta=false;
		this.isPermisoNuevoHistorialFormaPagoPuntoVenta=false;
		this.isPermisoActualizarHistorialFormaPagoPuntoVenta=false;
		this.isPermisoActualizarOriginalHistorialFormaPagoPuntoVenta=false;
		this.isPermisoEliminarHistorialFormaPagoPuntoVenta=false;
		this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta=false;
		this.isPermisoConsultaHistorialFormaPagoPuntoVenta=false;
		this.isPermisoBusquedaHistorialFormaPagoPuntoVenta=false;
		this.isPermisoReporteHistorialFormaPagoPuntoVenta=false;		
		this.isPermisoOrdenHistorialFormaPagoPuntoVenta=false;		
		this.isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta=false;		
		this.isPermisoPaginacionAltoHistorialFormaPagoPuntoVenta=false;
		this.isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta=false;
		this.isPermisoCopiarHistorialFormaPagoPuntoVenta=false;		
		this.isPermisoVerFormHistorialFormaPagoPuntoVenta=false;		
		this.isPermisoDuplicarHistorialFormaPagoPuntoVenta=false;		
		this.isPermisoOrdenHistorialFormaPagoPuntoVenta=false;		
	}
	
	public void setPermisosUsuarioHistorialFormaPagoPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoNuevoHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoActualizarHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoEliminarHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoConsultaHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoBusquedaHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoReporteHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoOrdenHistorialFormaPagoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoHistorialFormaPagoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta=isPermiso;		
		this.isPermisoCopiarHistorialFormaPagoPuntoVenta=isPermiso;		
		this.isPermisoVerFormHistorialFormaPagoPuntoVenta=isPermiso;		
		this.isPermisoDuplicarHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoOrdenHistorialFormaPagoPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioHistorialFormaPagoPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoNuevoHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoActualizarHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoEliminarHistorialFormaPagoPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta=isPermiso;
		//this.isPermisoConsultaHistorialFormaPagoPuntoVenta=isPermiso;
		//this.isPermisoBusquedaHistorialFormaPagoPuntoVenta=isPermiso;
		//this.isPermisoReporteHistorialFormaPagoPuntoVenta=isPermiso;
		//this.isPermisoOrdenHistorialFormaPagoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoHistorialFormaPagoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta=isPermiso;		
		//this.isPermisoCopiarHistorialFormaPagoPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarHistorialFormaPagoPuntoVenta=isPermiso;
		//this.isPermisoOrdenHistorialFormaPagoPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioHistorialFormaPagoPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebHistorialFormaPagoPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioHistorialFormaPagoPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioHistorialFormaPagoPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionHistorialFormaPagoPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioHistorialFormaPagoPuntoVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioHistorialFormaPagoPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, HistorialFormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalHistorialFormaPagoPuntoVenta=this.isPermisoActualizarHistorialFormaPagoPuntoVenta;
			this.isPermisoEliminarHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormHistorialFormaPagoPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialFormaPagoPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosHistorialFormaPagoPuntoVenta.setToolTipText(this.jTableDatosHistorialFormaPagoPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioHistorialFormaPagoPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioHistorialFormaPagoPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioHistorialFormaPagoPuntoVenta() throws Exception {
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
	public void inicializarCombosForeignKeyHistorialFormaPagoPuntoVentaListas()throws Exception {
		try	{						
			
				this.facturapuntoventasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyHistorialFormaPagoPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(HistorialFormaPagoPuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyHistorialFormaPagoPuntoVentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyFacturaPuntoVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyFacturaPuntoVentaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturapuntoventasForeignKey==null||this.facturapuntoventasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesFacturaPuntoVenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaPuntoVentaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaPuntoVentaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturaPuntoVentasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyHistorialFormaPagoPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			HistorialFormaPagoPuntoVentaParameterReturnGeneral historialformapagopuntoventaReturnGeneral=new HistorialFormaPagoPuntoVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalFacturaPuntoVenta="";

				if(((this.facturapuntoventasForeignKey==null||this.facturapuntoventasForeignKey.size()<=0) && this.historialformapagopuntoventaConstantesFunciones.cargarid_factura_punto_ventaHistorialFormaPagoPuntoVenta)
					 || (this.esRecargarFks && this.historialformapagopuntoventaConstantesFunciones.cargarid_factura_punto_ventaHistorialFormaPagoPuntoVenta)) {

					if(!this.historialformapagopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionFacturaPuntoVenta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesFacturaPuntoVenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFacturaPuntoVenta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaPuntoVentaConstantesFunciones.TABLENAME);

						finalQueryGlobalFacturaPuntoVenta=Funciones.GetFinalQueryAppend(finalQueryGlobalFacturaPuntoVenta, "");
						finalQueryGlobalFacturaPuntoVenta+=FacturaPuntoVentaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturaPuntoVentasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFacturaPuntoVenta=" WHERE " + ConstantesSql.ID + "="+historialformapagopuntoventaSessionBean.getlidFacturaPuntoVentaActual();
					}
				} else {
					finalQueryGlobalFacturaPuntoVenta="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.historialformapagopuntoventaConstantesFunciones.cargarid_empresaHistorialFormaPagoPuntoVenta)
					 || (this.esRecargarFks && this.historialformapagopuntoventaConstantesFunciones.cargarid_empresaHistorialFormaPagoPuntoVenta)) {

					if(!this.historialformapagopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+historialformapagopuntoventaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.historialformapagopuntoventaConstantesFunciones.cargarid_sucursalHistorialFormaPagoPuntoVenta)
					 || (this.esRecargarFks && this.historialformapagopuntoventaConstantesFunciones.cargarid_sucursalHistorialFormaPagoPuntoVenta)) {

					if(!this.historialformapagopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+historialformapagopuntoventaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				historialformapagopuntoventaReturnGeneral=historialformapagopuntoventaLogic.cargarCombosLoteForeignKeyHistorialFormaPagoPuntoVenta(finalQueryGlobalFacturaPuntoVenta,finalQueryGlobalEmpresa,finalQueryGlobalSucursal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalFacturaPuntoVenta.equals("NONE")) {
				this.facturapuntoventasForeignKey=historialformapagopuntoventaReturnGeneral.getfacturapuntoventasForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=historialformapagopuntoventaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=historialformapagopuntoventaReturnGeneral.getsucursalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyHistorialFormaPagoPuntoVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyFacturaPuntoVenta();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyFacturaPuntoVenta()throws Exception {
		try {
			if(this.historialformapagopuntoventaSessionBean==null) {
				this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
			}

			if(!this.historialformapagopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionFacturaPuntoVenta()) {
				FacturaPuntoVenta facturapuntoventa=new FacturaPuntoVenta();
				FacturaPuntoVentaConstantesFunciones.setFacturaPuntoVentaDescripcion(facturapuntoventa,Constantes.SMENSAJE_ESCOJA_OPCION);
				facturapuntoventa.setId(null);

				if(!FacturaPuntoVentaConstantesFunciones.ExisteEnLista(this.facturapuntoventasForeignKey,facturapuntoventa,true)) {

					this.facturapuntoventasForeignKey.add(0,facturapuntoventa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.historialformapagopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.historialformapagopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyHistorialFormaPagoPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyHistorialFormaPagoPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyHistorialFormaPagoPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialFormaPagoPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa)throws Exception {	
		try {
			
			this.setActualFacturaPuntoVentaForeignKey(historialformapagopuntoventa.getid_factura_punto_venta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyHistorialFormaPagoPuntoVenta()throws Exception {	
		try {
			
			this.setActualFacturaPuntoVentaForeignKey(this.historialformapagopuntoventaConstantesFunciones.getid_factura_punto_venta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialFormaPagoPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyHistorialFormaPagoPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyHistorialFormaPagoPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroHistorialFormaPagoPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyHistorialFormaPagoPuntoVenta()throws Exception {
		try {
			

			this.cargarCombosFrameFacturaPuntoVentasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyHistorialFormaPagoPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameFacturaPuntoVentasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyHistorialFormaPagoPuntoVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta!=null && this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta!=null && this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta!=null && this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean(); 
		this.historialformapagopuntoventaConstantesFunciones=new HistorialFormaPagoPuntoVentaConstantesFunciones(); 
		this.historialformapagopuntoventaBean=new HistorialFormaPagoPuntoVenta();//(this.historialformapagopuntoventaConstantesFunciones); 		
		this.historialformapagopuntoventaReturnGeneral=new HistorialFormaPagoPuntoVentaParameterReturnGeneral(); 
		
		this.historialformapagopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialformapagopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessHistorialFormaPagoPuntoVenta(true);
			
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
			
			this.historialformapagopuntoventaConstantesFunciones=new HistorialFormaPagoPuntoVentaConstantesFunciones(); 
			this.historialformapagopuntoventaBean=new HistorialFormaPagoPuntoVenta();//this.historialformapagopuntoventaConstantesFunciones); 			
			this.historialformapagopuntoventaReturnGeneral=new HistorialFormaPagoPuntoVentaParameterReturnGeneral(); 
		
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Forma Pago Punto Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.historialformapagopuntoventa=new HistorialFormaPagoPuntoVenta();
			this.historialformapagopuntoventas = new ArrayList<HistorialFormaPagoPuntoVenta>();
			this.historialformapagopuntoventasAux = new ArrayList<HistorialFormaPagoPuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic=new HistorialFormaPagoPuntoVentaLogic();
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.historialformapagopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.historialformapagopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta);
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta);
					this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta);
					this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta);
					this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idHistorialFormaPagoPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=HistorialFormaPagoPuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.historialformapagopuntoventaReturnGeneral=new HistorialFormaPagoPuntoVentaParameterReturnGeneral();
			
			this.historialformapagopuntoventaParameterGeneral=new HistorialFormaPagoPuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.historialformapagopuntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialFormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado(),this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialFormaPagoPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado(),this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFacturaPuntoVenta=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosHistorialFormaPagoPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioHistorialFormaPagoPuntoVenta(false);
			
			this.setPermisosUsuarioHistorialFormaPagoPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado() && this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioHistorialFormaPagoPuntoVentaClasesRelacionadas();
			}
			
			if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioHistorialFormaPagoPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosHistorialFormaPagoPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualHistorialFormaPagoPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaHistorialFormaPagoPuntoVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta,this.isPermisoPaginacionMedioHistorialFormaPagoPuntoVenta,this.isPermisoPaginacionTodoHistorialFormaPagoPuntoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(HistorialFormaPagoPuntoVentaConstantesFunciones.getTiposSeleccionarHistorialFormaPagoPuntoVenta());
				
				this.tiposColumnasSelect=HistorialFormaPagoPuntoVentaConstantesFunciones.getTiposSeleccionarHistorialFormaPagoPuntoVenta(true);
				
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
			//if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioHistorialFormaPagoPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioHistorialFormaPagoPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioHistorialFormaPagoPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialFormaPagoPuntoVenta() ;
			
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
			
			this.facturapuntoventaLogic=new FacturaPuntoVentaLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				historialformapagopuntoventaImplementable= (HistorialFormaPagoPuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialFormaPagoPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				historialformapagopuntoventaImplementableHome= (HistorialFormaPagoPuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialFormaPagoPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.historialformapagopuntoventas= new ArrayList<HistorialFormaPagoPuntoVenta>();
			this.historialformapagopuntoventasEliminados= new ArrayList<HistorialFormaPagoPuntoVenta>();
						
			this.isEsNuevoHistorialFormaPagoPuntoVenta=false;
			this.esParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.facturapuntoventasForeignKey=new ArrayList<FacturaPuntoVenta>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyHistorialFormaPagoPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroHistorialFormaPagoPuntoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=HistorialFormaPagoPuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioHistorialFormaPagoPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioHistorialFormaPagoPuntoVenta();
			}
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessHistorialFormaPagoPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga HistorialFormaPagoPuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectHistorialFormaPagoPuntoVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesHistorialFormaPagoPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessHistorialFormaPagoPuntoVenta();	
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
	
	public void cargarCombosForeignKeyHistorialFormaPagoPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyHistorialFormaPagoPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyHistorialFormaPagoPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyHistorialFormaPagoPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyHistorialFormaPagoPuntoVenta();
		
		this.cargarCombosFrameForeignKeyHistorialFormaPagoPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyHistorialFormaPagoPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyHistorialFormaPagoPuntoVenta();
		}
	}
	
	

	public void cargarCombosForeignKeyFacturaPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaPuntoVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFacturaPuntoVenta();
				this.cargarCombosFrameFacturaPuntoVentasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFacturaPuntoVenta(this.facturapuntoventasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
			
			if(jTableDatosHistorialFormaPagoPuntoVenta.getRowCount()>=1) {
				jTableDatosHistorialFormaPagoPuntoVenta.removeRowSelectionInterval(0, jTableDatosHistorialFormaPagoPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoHistorialFormaPagoPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoHistorialFormaPagoPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesHistorialFormaPagoPuntoVenta(true);			
			//this.historialformapagopuntoventa=new HistorialFormaPagoPuntoVenta();
			//this.historialformapagopuntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialFormaPagoPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta() ;
			
			if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialFormaPagoPuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.historialformapagopuntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);				
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
			if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar HistorialFormaPagoPuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRows().length;			
			}
			
			historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoHistorialFormaPagoPuntoVenta--;			
				//HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux= new HistorialFormaPagoPuntoVenta();			
				//historialformapagopuntoventaAux.setId(this.iIdNuevoHistorialFormaPagoPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//HistorialFormaPagoPuntoVenta historialformapagopuntoventaOrigen=new HistorialFormaPagoPuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaOrigen : historialformapagopuntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							historialformapagopuntoventaOrigen =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialformapagopuntoventaOrigen =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaHistorialFormaPagoPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.historialformapagopuntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosHistorialFormaPagoPuntoVenta(historialformapagopuntoventaOrigen,this.historialformapagopuntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().add(this.historialformapagopuntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialformapagopuntoventas.add(this.historialformapagopuntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
				
				this.jTableDatosHistorialFormaPagoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoHistorialFormaPagoPuntoVenta(), this.getIndiceNuevoHistorialFormaPagoPuntoVenta());
				
				int iLastRow =  this.jTableDatosHistorialFormaPagoPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialFormaPagoPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialFormaPagoPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();									
		
			HistorialFormaPagoPuntoVenta historialformapagopuntoventaOrigen=new HistorialFormaPagoPuntoVenta();
			HistorialFormaPagoPuntoVenta historialformapagopuntoventaDestino=new HistorialFormaPagoPuntoVenta();
				
			historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || historialformapagopuntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventaOrigen =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialformapagopuntoventaOrigen =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialformapagopuntoventaDestino =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialformapagopuntoventaDestino =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				historialformapagopuntoventaOrigen =historialformapagopuntoventasSeleccionados.get(0);
				historialformapagopuntoventaDestino =historialformapagopuntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosHistorialFormaPagoPuntoVenta(historialformapagopuntoventaOrigen,historialformapagopuntoventaDestino,true,false);
				
				historialformapagopuntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialformapagopuntoventaDestino,historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialformapagopuntoventaDestino,historialformapagopuntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
				
				//this.jTableDatosHistorialFormaPagoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoHistorialFormaPagoPuntoVenta(), this.getIndiceNuevoHistorialFormaPagoPuntoVenta());
				
				int iLastRow =  this.jTableDatosHistorialFormaPagoPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialFormaPagoPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialFormaPagoPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionHistorialFormaPagoPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesHistorialFormaPagoPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameHistorialFormaPagoPuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoHistorialFormaPagoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionHistorialFormaPagoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByHistorialFormaPagoPuntoVenta();
			
			this.abrirFrameOrderByHistorialFormaPagoPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByHistorialFormaPagoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleHistorialFormaPagoPuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setSize(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jContentPaneDetalleHistorialFormaPagoPuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jContentPaneDetalleHistorialFormaPagoPuntoVenta.getWidth(),HistorialFormaPagoPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jContentPaneDetalleHistorialFormaPagoPuntoVenta.getWidth(),HistorialFormaPagoPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jContentPaneDetalleHistorialFormaPagoPuntoVenta.getWidth(),HistorialFormaPagoPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByHistorialFormaPagoPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta);
				this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialFormaPagoPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByHistorialFormaPagoPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionHistorialFormaPagoPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta==null) {
				
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta=new ImportacionJInternalFrame(HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta);
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialFormaPagoPuntoVenta"));
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialFormaPagoPuntoVenta"));
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialFormaPagoPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoHistorialFormaPagoPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta=new ReporteDinamicoJInternalFrame(HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta);
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialFormaPagoPuntoVenta"));
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialFormaPagoPuntoVenta"));
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialFormaPagoPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleHistorialFormaPagoPuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta);
			
	       	this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoHistorialFormaPagoPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionHistorialFormaPagoPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByHistorialFormaPagoPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByHistorialFormaPagoPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoHistorialFormaPagoPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionHistorialFormaPagoPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarHistorialFormaPagoPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarHistorialFormaPagoPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesHistorialFormaPagoPuntoVenta(true);
			//this.isEsNuevoHistorialFormaPagoPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialFormaPagoPuntoVenta(false) ;
			
			if(historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialFormaPagoPuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarHistorialFormaPagoPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesHistorialFormaPagoPuntoVenta(true);
			//this.isEsNuevoHistorialFormaPagoPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.historialformapagopuntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesHistorialFormaPagoPuntoVenta(false) ;
			
			if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialFormaPagoPuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaFacturaPuntoVenta(List<FacturaPuntoVenta> facturapuntoventasForeignKey)throws Exception{
		TableColumn tableColumnFacturaPuntoVenta=this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoPuntoVenta,HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA));
		TableCellEditor tableCellEditorFacturaPuntoVenta =tableColumnFacturaPuntoVenta.getCellEditor();

		FacturaPuntoVentaTableCell facturapuntoventaTableCellFk=(FacturaPuntoVentaTableCell)tableCellEditorFacturaPuntoVenta;

		if(facturapuntoventaTableCellFk!=null) {
			facturapuntoventaTableCellFk.setfacturapuntoventasForeignKey(facturapuntoventasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturapuntoventaTableCellFk.setRowActual(intSelectedRow);
			//facturapuntoventaTableCellFk.setfacturapuntoventasForeignKeyActual(facturapuntoventasForeignKey);
		//}


		if(facturapuntoventaTableCellFk!=null) {
			facturapuntoventaTableCellFk.RecargarFacturaPuntoVentasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	
	public void jButtonActualizarHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesHistorialFormaPagoPuntoVenta(false);
			
			//if(!this.isEsNuevoHistorialFormaPagoPuntoVenta) {								
				int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.historialformapagopuntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoHistorialFormaPagoPuntoVenta=true;
					this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
					this.isEsNuevoHistorialFormaPagoPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoHistorialFormaPagoPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoHistorialFormaPagoPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialFormaPagoPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesHistorialFormaPagoPuntoVenta(false);
			
												
				
				if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleHistorialFormaPagoPuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,historialformapagopuntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosHistorialFormaPagoPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,historialformapagopuntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.historialformapagopuntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.historialformapagopuntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.historialformapagopuntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.historialformapagopuntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((HistorialFormaPagoPuntoVentaModel) this.jTableDatosHistorialFormaPagoPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoHistorialFormaPagoPuntoVenta=true;
				this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
				this.isEsNuevoHistorialFormaPagoPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialFormaPagoPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesHistorialFormaPagoPuntoVenta(false);
				
				
				
				if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleHistorialFormaPagoPuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosHistorialFormaPagoPuntoVenta.getRowCount()>=1) {
				jTableDatosHistorialFormaPagoPuntoVenta.removeRowSelectionInterval(0, jTableDatosHistorialFormaPagoPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesHistorialFormaPagoPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialFormaPagoPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta(false) ;
			
			this.isEsNuevoHistorialFormaPagoPuntoVenta=false;
			
			if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleHistorialFormaPagoPuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
				
				//SI ES MANUAL
				if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualHistorialFormaPagoPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoHistorialFormaPagoPuntoVenta--;			
			//HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux= new HistorialFormaPagoPuntoVenta();			
			//historialformapagopuntoventaAux.setId(this.iIdNuevoHistorialFormaPagoPuntoVenta);
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaHistorialFormaPagoPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
			
			this.historialformapagopuntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().add(this.historialformapagopuntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.historialformapagopuntoventas.add(this.historialformapagopuntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
			
			this.jTableDatosHistorialFormaPagoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoHistorialFormaPagoPuntoVenta(), this.getIndiceNuevoHistorialFormaPagoPuntoVenta());
			
			int iLastRow =  this.jTableDatosHistorialFormaPagoPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosHistorialFormaPagoPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosHistorialFormaPagoPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
			
			//SI ES MANUAL
			if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialFormaPagoPuntoVenta();
			}
			
			//this.abrirFrameTreeHistorialFormaPagoPuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Historial Forma Pago Punto VentaS ?", "MANTENIMIENTO DE Historial Forma Pago Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralHistorialFormaPagoPuntoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.historialformapagopuntoventaReturnGeneral=historialformapagopuntoventaLogic.procesarImportacionHistorialFormaPagoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.historialformapagopuntoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarHistorialFormaPagoPuntoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setFileImportacion(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionHistorialFormaPagoPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();		

		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("HistorialFormaPagoPuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"HistorialFormaPagoPuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteHistorialFormaPagoPuntoVentas("Todos",historialformapagopuntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FacturaPuntoVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FacturaPuntoVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FacturaPuntoVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FacturaPuntoVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					sNombreCampoCategoria="id_factura_punto_venta";
					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					sNombreCampoCategoriaValor="id_factura_punto_venta";
					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura Punto Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura_punto_venta");
					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
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
	
	public void jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();		
		
		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapagopuntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("HistorialFormaPagoPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA);
					iRow++;

					for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa:historialformapagopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapagopuntoventa.getfacturapuntoventa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa:historialformapagopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapagopuntoventa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(HistorialFormaPagoPuntoVenta historialformapagopuntoventa:historialformapagopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialformapagopuntoventa.getsucursal_descripcion());
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
			//	this.getFilaCabeceraExportarExcelHistorialFormaPagoPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelHistorialFormaPagoPuntoVenta(historialformapagopuntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
			
			//SI ES MANUAL
			if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialFormaPagoPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
			
			//SI ES MANUAL
			if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialFormaPagoPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
			
			//SI ES MANUAL
			if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialFormaPagoPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaHistorialFormaPagoPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosHistorialFormaPagoPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosHistorialFormaPagoPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosHistorialFormaPagoPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosHistorialFormaPagoPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosHistorialFormaPagoPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosHistorialFormaPagoPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosHistorialFormaPagoPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingHistorialFormaPagoPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingHistorialFormaPagoPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesHistorialFormaPagoPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasHistorialFormaPagoPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialFormaPagoPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesHistorialFormaPagoPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualHistorialFormaPagoPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialFormaPagoPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialFormaPagoPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialFormaPagoPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialFormaPagoPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jCheckBoxPostAccionNuevoHistorialFormaPagoPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jCheckBoxPostAccionSinCerrarHistorialFormaPagoPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jCheckBoxPostAccionSinMensajeHistorialFormaPagoPuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteHistorialFormaPagoPuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jCheckBoxPostAccionNuevoHistorialFormaPagoPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jCheckBoxPostAccionSinCerrarHistorialFormaPagoPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jCheckBoxPostAccionSinMensajeHistorialFormaPagoPuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesHistorialFormaPagoPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialFormaPagoPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesHistorialFormaPagoPuntoVenta() throws Exception {
		try	{
			if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialFormaPagoPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialFormaPagoPuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialFormaPagoPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesHistorialFormaPagoPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesHistorialFormaPagoPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesHistorialFormaPagoPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionHistorialFormaPagoPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialFormaPagoPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialFormaPagoPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualHistorialFormaPagoPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.getSelectedItem()!=null){this.id_factura_punto_ventaFK_IdFacturaPuntoVenta=((FacturaPuntoVenta)this.jComboBoxid_factura_punto_ventaFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasHistorialFormaPagoPuntoVenta(Boolean esInicializar) throws Exception {				
		if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialFormaPagoPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByHistorialFormaPagoPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosHistorialFormaPagoPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new HistorialFormaPagoPuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=historialformapagopuntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosHistorialFormaPagoPuntoVenta.setModel(new HistorialFormaPagoPuntoVentaModel(this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosHistorialFormaPagoPuntoVenta.setModel(new HistorialFormaPagoPuntoVentaModel(this.historialformapagopuntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta!=null && this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByHistorialFormaPagoPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,historialformapagopuntoventaConstantesFunciones.resaltarSeleccionarHistorialFormaPagoPuntoVenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+HistorialFormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,historialformapagopuntoventaConstantesFunciones.resaltarSeleccionarHistorialFormaPagoPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoPuntoVenta,HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_ID));

		if(this.historialformapagopuntoventaConstantesFunciones.mostraridHistorialFormaPagoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialformapagopuntoventaConstantesFunciones.resaltaridHistorialFormaPagoPuntoVenta,this.historialformapagopuntoventaConstantesFunciones.activaridHistorialFormaPagoPuntoVenta,this,true,"idHistorialFormaPagoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialformapagopuntoventaConstantesFunciones.resaltaridHistorialFormaPagoPuntoVenta,this.historialformapagopuntoventaConstantesFunciones.activaridHistorialFormaPagoPuntoVenta,this,true,"idHistorialFormaPagoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoPuntoVenta,HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA));

		if(this.historialformapagopuntoventaConstantesFunciones.mostrarid_factura_punto_ventaHistorialFormaPagoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaPuntoVentaTableCell(this.facturapuntoventasForeignKey,this.historialformapagopuntoventaConstantesFunciones.resaltarid_factura_punto_ventaHistorialFormaPagoPuntoVenta,this,this.historialformapagopuntoventaConstantesFunciones.activarid_factura_punto_ventaHistorialFormaPagoPuntoVenta));
			tableColumn.setCellEditor(new FacturaPuntoVentaTableCell(this.facturapuntoventasForeignKey,this.historialformapagopuntoventaConstantesFunciones.resaltarid_factura_punto_ventaHistorialFormaPagoPuntoVenta,this,this.historialformapagopuntoventaConstantesFunciones.activarid_factura_punto_ventaHistorialFormaPagoPuntoVenta,true,"id_factura_punto_ventaHistorialFormaPagoPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoPuntoVenta,HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.historialformapagopuntoventaConstantesFunciones.mostrarid_empresaHistorialFormaPagoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.historialformapagopuntoventaConstantesFunciones.resaltarid_empresaHistorialFormaPagoPuntoVenta,this,this.historialformapagopuntoventaConstantesFunciones.activarid_empresaHistorialFormaPagoPuntoVenta));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.historialformapagopuntoventaConstantesFunciones.resaltarid_empresaHistorialFormaPagoPuntoVenta,this,this.historialformapagopuntoventaConstantesFunciones.activarid_empresaHistorialFormaPagoPuntoVenta,false,"id_empresaHistorialFormaPagoPuntoVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoPuntoVenta,HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.historialformapagopuntoventaConstantesFunciones.mostrarid_sucursalHistorialFormaPagoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.historialformapagopuntoventaConstantesFunciones.resaltarid_sucursalHistorialFormaPagoPuntoVenta,this,this.historialformapagopuntoventaConstantesFunciones.activarid_sucursalHistorialFormaPagoPuntoVenta));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.historialformapagopuntoventaConstantesFunciones.resaltarid_sucursalHistorialFormaPagoPuntoVenta,this,this.historialformapagopuntoventaConstantesFunciones.activarid_sucursalHistorialFormaPagoPuntoVenta,false,"id_sucursalHistorialFormaPagoPuntoVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialFormaPagoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialFormaPagoPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialFormaPagoPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosHistorialFormaPagoPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosHistorialFormaPagoPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosHistorialFormaPagoPuntoVenta.moveColumn(this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosHistorialFormaPagoPuntoVenta.moveColumn(this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosHistorialFormaPagoPuntoVenta.moveColumn(this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosHistorialFormaPagoPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosHistorialFormaPagoPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosHistorialFormaPagoPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosHistorialFormaPagoPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosHistorialFormaPagoPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosHistorialFormaPagoPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=historialformapagopuntoventas.size()-1;
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
		//this.jTableDatosHistorialFormaPagoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosHistorialFormaPagoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosHistorialFormaPagoPuntoVenta();
			
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
				
				//this.isEsNuevoHistorialFormaPagoPuntoVenta=false;
					
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
				if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.historialformapagopuntoventa.getsType().equals("DUPLICADO")
				   || this.historialformapagopuntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoHistorialFormaPagoPuntoVenta=true;
				
				} else {
					this.isEsNuevoHistorialFormaPagoPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.historialformapagopuntoventa.getId()>=0 && !this.historialformapagopuntoventa.getIsNew()) {						
						this.isEsNuevoHistorialFormaPagoPuntoVenta=false;
						
					} else {
						this.isEsNuevoHistorialFormaPagoPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoHistorialFormaPagoPuntoVenta(esRelaciones);						
				
				this.seleccionarHistorialFormaPagoPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.historialformapagopuntoventa.getId()<0) {
					this.isEsNuevoHistorialFormaPagoPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarHistorialFormaPagoPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarHistorialFormaPagoPuntoVenta(evt,rowIndex);
				}	
				
				if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion HistorialFormaPagoPuntoVenta: " + this.dDif); 
					}
				}								
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarHistorialFormaPagoPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.historialformapagopuntoventa)) {
					if(this.historialformapagopuntoventa.getId()>0) {
						this.historialformapagopuntoventa.setIsDeleted(true);
						
						this.historialformapagopuntoventasEliminados.add(this.historialformapagopuntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().remove(this.historialformapagopuntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialformapagopuntoventas.remove(this.historialformapagopuntoventa);				
					}
					
					
					((HistorialFormaPagoPuntoVentaModel) this.jTableDatosHistorialFormaPagoPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarHistorialFormaPagoPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoHistorialFormaPagoPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
				}
				
				//ARCHITECTURE
				try {
					

					//FacturaPuntoVenta
					if(!this.historialformapagopuntoventaConstantesFunciones.cargarid_factura_punto_ventaHistorialFormaPagoPuntoVenta || this.historialformapagopuntoventaConstantesFunciones.event_dependid_factura_punto_ventaHistorialFormaPagoPuntoVenta) {
						//this.cargarCombosFacturaPuntoVentasForeignKeyLista(" where id="+this.historialformapagopuntoventa.getid_factura_punto_venta());
									//this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
						this.facturapuntoventasForeignKey=new ArrayList<FacturaPuntoVenta>();

						if(historialformapagopuntoventa.getFacturaPuntoVenta()!=null) {
							this.facturapuntoventasForeignKey.add(historialformapagopuntoventa.getFacturaPuntoVenta());
						}

						this.addItemDefectoCombosForeignKeyFacturaPuntoVenta();
						this.cargarCombosFrameFacturaPuntoVentasForeignKey("Todos");
					}
					this.setActualFacturaPuntoVentaForeignKey(this.historialformapagopuntoventa.getid_factura_punto_venta(),false,"Formulario");

					//Empresa
					if(!this.historialformapagopuntoventaConstantesFunciones.cargarid_empresaHistorialFormaPagoPuntoVenta || this.historialformapagopuntoventaConstantesFunciones.event_dependid_empresaHistorialFormaPagoPuntoVenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.historialformapagopuntoventa.getid_empresa());
									//this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(historialformapagopuntoventa.getEmpresa()!=null) {
							this.empresasForeignKey.add(historialformapagopuntoventa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.historialformapagopuntoventa.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.historialformapagopuntoventaConstantesFunciones.cargarid_sucursalHistorialFormaPagoPuntoVenta || this.historialformapagopuntoventaConstantesFunciones.event_dependid_sucursalHistorialFormaPagoPuntoVenta) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.historialformapagopuntoventa.getid_sucursal());
									//this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(historialformapagopuntoventa.getSucursal()!=null) {
							this.sucursalsForeignKey.add(historialformapagopuntoventa.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.historialformapagopuntoventa.getid_sucursal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesHistorialFormaPagoPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoHistorialFormaPagoPuntoVenta(historialformapagopuntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(historialformapagopuntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyHistorialFormaPagoPuntoVenta(historialformapagopuntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPagoPuntoVenta(historialformapagopuntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.setText(historialformapagopuntoventa.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,HistorialFormaPagoPuntoVenta historialformapagopuntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,historialformapagopuntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,HistorialFormaPagoPuntoVenta historialformapagopuntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				historialformapagopuntoventaLocal=this.historialformapagopuntoventa;
			} else {
				historialformapagopuntoventaLocal=this.historialformapagopuntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(historialformapagopuntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoHistorialFormaPagoPuntoVenta(historialformapagopuntoventaLocal,true);
					
					if(historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(historialformapagopuntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(historialformapagopuntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(historialformapagopuntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(historialformapagopuntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(historialformapagopuntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.getText()==null || this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.setText("0");
			}

			if(conColumnasBase) {historialformapagopuntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelIdHistorialFormaPagoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventaBean,HistorialFormaPagoPuntoVenta historialformapagopuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && historialformapagopuntoventaBean.getid_factura_punto_venta()!=null && !historialformapagopuntoventaBean.getid_factura_punto_venta().equals(-1L))) {historialformapagopuntoventa.setid_factura_punto_venta(historialformapagopuntoventaBean.getid_factura_punto_venta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventaOrigen,HistorialFormaPagoPuntoVenta historialformapagopuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialformapagopuntoventaOrigen.getId()!=null && !historialformapagopuntoventaOrigen.getId().equals(0L))) {historialformapagopuntoventa.setId(historialformapagopuntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && historialformapagopuntoventaOrigen.getid_factura_punto_venta()!=null && !historialformapagopuntoventaOrigen.getid_factura_punto_venta().equals(-1L))) {historialformapagopuntoventa.setid_factura_punto_venta(historialformapagopuntoventaOrigen.getid_factura_punto_venta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.setText(historialformapagopuntoventa.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVentaBean historialformapagopuntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.setText(historialformapagopuntoventaBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVentaParameterReturnGeneral historialformapagopuntoventaReturnGeneral,HistorialFormaPagoPuntoVentaBean historialformapagopuntoventaBean,Boolean conDefault) throws Exception { 
		try {
			HistorialFormaPagoPuntoVenta historialformapagopuntoventaLocal=new HistorialFormaPagoPuntoVenta();
			
			historialformapagopuntoventaLocal=historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialformapagopuntoventaLocal.getId()!=null && !historialformapagopuntoventaLocal.getId().equals(0L))) {historialformapagopuntoventaBean.setId(historialformapagopuntoventaLocal.getId());}}
			if(conDefault || (!conDefault && historialformapagopuntoventaLocal.getid_factura_punto_venta()!=null && !historialformapagopuntoventaLocal.getid_factura_punto_venta().equals(-1L))) {historialformapagopuntoventaBean.setid_factura_punto_venta(historialformapagopuntoventaLocal.getid_factura_punto_venta());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxHistorialFormaPagoPuntoVentaGenerico(Long idHistorialFormaPagoPuntoVentaSeleccionado,JComboBox jComboBoxHistorialFormaPagoPuntoVenta,List<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasLocal)throws Exception {
		try {
			HistorialFormaPagoPuntoVenta  historialformapagopuntoventaTemp=null;

			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventasLocal) {
				if(historialformapagopuntoventaAux.getId()!=null && historialformapagopuntoventaAux.getId().equals(idHistorialFormaPagoPuntoVentaSeleccionado)) {
					historialformapagopuntoventaTemp=historialformapagopuntoventaAux;
					break;
				}
			}

			jComboBoxHistorialFormaPagoPuntoVenta.setSelectedItem(historialformapagopuntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxHistorialFormaPagoPuntoVentaGenerico(JComboBox jComboBoxHistorialFormaPagoPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialFormaPagoPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxHistorialFormaPagoPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialFormaPagoPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxHistorialFormaPagoPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxHistorialFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxHistorialFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialformapagopuntoventa=(HistorialFormaPagoPuntoVenta) historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) historialformapagopuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("FacturaPuntoVenta")) {
			//sDescripcion=this.getActualFacturaPuntoVentaForeignKeyDescripcion((Long)value);
			if(!historialformapagopuntoventa.getIsNew() && !historialformapagopuntoventa.getIsChanged() && !historialformapagopuntoventa.getIsDeleted()) {
				sDescripcion=historialformapagopuntoventa.getfacturapuntoventa_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaPuntoVentaForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapagopuntoventa.getfacturapuntoventa_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!historialformapagopuntoventa.getIsNew() && !historialformapagopuntoventa.getIsChanged() && !historialformapagopuntoventa.getIsDeleted()) {
				sDescripcion=historialformapagopuntoventa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapagopuntoventa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!historialformapagopuntoventa.getIsNew() && !historialformapagopuntoventa.getIsChanged() && !historialformapagopuntoventa.getIsDeleted()) {
				sDescripcion=historialformapagopuntoventa.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=historialformapagopuntoventa.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		HistorialFormaPagoPuntoVenta historialformapagopuntoventaRow=new HistorialFormaPagoPuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialformapagopuntoventaRow=(HistorialFormaPagoPuntoVenta) historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialformapagopuntoventaRow=(HistorialFormaPagoPuntoVenta) historialformapagopuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta && this.isPermisoNuevoHistorialFormaPagoPuntoVenta));			
			this.jButtonDuplicarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta && this.isPermisoDuplicarHistorialFormaPagoPuntoVenta));			
			this.jButtonCopiarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta && this.isPermisoCopiarHistorialFormaPagoPuntoVenta));
			this.jButtonVerFormHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta && this.isPermisoVerFormHistorialFormaPagoPuntoVenta));
			
			this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta && this.isPermisoOrdenHistorialFormaPagoPuntoVenta));			
			
			this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta && this.isPermisoNuevoHistorialFormaPagoPuntoVenta));			
			this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta && this.isPermisoNuevoHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonModificarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta && this.isPermisoActualizarHistorialFormaPagoPuntoVenta));	
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta && this.isPermisoActualizarHistorialFormaPagoPuntoVenta));	
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta && this.isPermisoEliminarHistorialFormaPagoPuntoVenta));
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarHistorialFormaPagoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta);							
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta && this.isPermisoNuevoHistorialFormaPagoPuntoVenta));						
			this.jButtonDuplicarToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta && this.isPermisoDuplicarHistorialFormaPagoPuntoVenta));						
			this.jButtonCopiarToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta && this.isPermisoCopiarHistorialFormaPagoPuntoVenta));			
			this.jButtonVerFormToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta && this.isPermisoVerFormHistorialFormaPagoPuntoVenta));			
			this.jButtonAbrirOrderByToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta && this.isPermisoOrdenHistorialFormaPagoPuntoVenta));
			this.jButtonNuevoRelacionesToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta && this.isPermisoNuevoHistorialFormaPagoPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta && this.isPermisoNuevoHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonModificarToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta && this.isPermisoActualizarHistorialFormaPagoPuntoVenta));	
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta  && this.isPermisoActualizarHistorialFormaPagoPuntoVenta));	
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta && this.isPermisoEliminarHistorialFormaPagoPuntoVenta));
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarToolBarHistorialFormaPagoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta);				
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta && this.isPermisoNuevoHistorialFormaPagoPuntoVenta));			
			this.jMenuItemDuplicarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta && this.isPermisoDuplicarHistorialFormaPagoPuntoVenta));			
			this.jMenuItemCopiarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta && this.isPermisoCopiarHistorialFormaPagoPuntoVenta));			
			this.jMenuItemVerFormHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta && this.isPermisoVerFormHistorialFormaPagoPuntoVenta));			
			this.jMenuItemAbrirOrderByHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta && this.isPermisoOrdenHistorialFormaPagoPuntoVenta));			
			//this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta && this.isPermisoOrdenHistorialFormaPagoPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta && this.isPermisoOrdenHistorialFormaPagoPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta && this.isPermisoOrdenHistorialFormaPagoPuntoVenta));			
			this.jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta && this.isPermisoNuevoHistorialFormaPagoPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta && this.isPermisoNuevoHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemModificarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta && this.isPermisoActualizarHistorialFormaPagoPuntoVenta));	
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemActualizarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta && this.isPermisoActualizarHistorialFormaPagoPuntoVenta));	
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemEliminarHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta && this.isPermisoEliminarHistorialFormaPagoPuntoVenta));
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemCancelarHistorialFormaPagoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=this.jButtonNuevoHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta=this.jButtonDuplicarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta=this.jButtonCopiarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta=this.jButtonVerFormHistorialFormaPagoPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenHistorialFormaPagoPuntoVenta=this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=this.jButtonModificarHistorialFormaPagoPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=this.jButtonNuevoToolBarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=this.jButtonNuevoRelacionesToolBarHistorialFormaPagoPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonModificarToolBarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarToolBarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarToolBarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarToolBarHistorialFormaPagoPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=this.jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=this.jButtonGuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=this.jMenuItemNuevoHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=this.jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemModificarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemActualizarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemEliminarHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemCancelarHistorialFormaPagoPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=this.jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesHistorialFormaPagoPuntoVenta(Boolean esInicializar) {
		if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialFormaPagoPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualHistorialFormaPagoPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualHistorialFormaPagoPuntoVenta() {
		this.jButtonNuevoHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoNuevoHistorialFormaPagoPuntoVenta);			
		this.jButtonDuplicarHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoDuplicarHistorialFormaPagoPuntoVenta);			
		this.jButtonCopiarHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoCopiarHistorialFormaPagoPuntoVenta);			
		this.jButtonVerFormHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoVerFormHistorialFormaPagoPuntoVenta);			
		
		this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoOrdenHistorialFormaPagoPuntoVenta);					
		
		this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoNuevoHistorialFormaPagoPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonModificarHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoActualizarHistorialFormaPagoPuntoVenta);	
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoActualizarHistorialFormaPagoPuntoVenta);	
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoEliminarHistorialFormaPagoPuntoVenta);
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarHistorialFormaPagoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta);						
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoActualizarHistorialFormaPagoPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialFormaPagoPuntoVenta() {
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonModificarHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoActualizarHistorialFormaPagoPuntoVenta);	
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoActualizarHistorialFormaPagoPuntoVenta);	
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarHistorialFormaPagoPuntoVenta.setVisible(this.isPermisoEliminarHistorialFormaPagoPuntoVenta);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarHistorialFormaPagoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta);							
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta && this.isPermisoGuardarCambiosHistorialFormaPagoPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosHistorialFormaPagoPuntoVenta() {
		if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualHistorialFormaPagoPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesHistorialFormaPagoPuntoVenta() {
	}
	
	public void jTableDatosHistorialFormaPagoPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarHistorialFormaPagoPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidHistorialFormaPagoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.gethistorialformapagopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapagopuntoventa==null) {
						this.historialformapagopuntoventa = new HistorialFormaPagoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
				}

				if(this.historialformapagopuntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.historialformapagopuntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofacturapuntoventa=true;

			idTienePermisofacturapuntoventa=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPagoPuntoVenta(FacturaPuntoVentaConstantesFunciones.CLASSNAME);

			if(idTienePermisofacturapuntoventa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPagoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPagoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.gethistorialformapagopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);

				this.facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturapuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturapuntoventaBeanSwingJInternalFrame.getFacturaPuntoVentaLogic().setConnexion(this.historialformapagopuntoventaLogic.getConnexion());

				if(this.historialformapagopuntoventa.getid_factura_punto_venta()!=null) {
					this.facturapuntoventaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturapuntoventaBeanSwingJInternalFrame.setIdActual(this.historialformapagopuntoventa.getid_factura_punto_venta());
					this.facturapuntoventaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturapuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta();
				}

				JInternalFrameBase jinternalFrame =this.facturapuntoventaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPagoPuntoVenta=(TitledBorder)this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.getBorder();
				TitledBorder titledBorderfacturapuntoventa=(TitledBorder)this.facturapuntoventaBeanSwingJInternalFrame.jScrollPanelDatosFacturaPuntoVenta.getBorder();

				titledBorderfacturapuntoventa.setTitle(titledBorderHistorialFormaPagoPuntoVenta.getTitle() + " -> Factura Punto Venta");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.gethistorialformapagopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapagopuntoventa==null) {
						this.historialformapagopuntoventa = new HistorialFormaPagoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
				}

				if(this.historialformapagopuntoventa.getid_factura_punto_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura_punto_venta = "+this.historialformapagopuntoventa.getid_factura_punto_venta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaHistorialFormaPagoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPagoPuntoVenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPagoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPagoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.gethistorialformapagopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.historialformapagopuntoventaLogic.getConnexion());

				if(this.historialformapagopuntoventa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.historialformapagopuntoventa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPagoPuntoVenta=(TitledBorder)this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderHistorialFormaPagoPuntoVenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaHistorialFormaPagoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.gethistorialformapagopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapagopuntoventa==null) {
						this.historialformapagopuntoventa = new HistorialFormaPagoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
				}

				if(this.historialformapagopuntoventa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.historialformapagopuntoventa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebHistorialFormaPagoPuntoVenta(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialFormaPagoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialFormaPagoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.gethistorialformapagopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.historialformapagopuntoventaLogic.getConnexion());

				if(this.historialformapagopuntoventa.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.historialformapagopuntoventa.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialFormaPagoPuntoVenta=(TitledBorder)this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderHistorialFormaPagoPuntoVenta.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalHistorialFormaPagoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.gethistorialformapagopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialformapagopuntoventa==null) {
						this.historialformapagopuntoventa = new HistorialFormaPagoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);
				}

				if(this.historialformapagopuntoventa.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.historialformapagopuntoventa.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);

			this.getHistorialFormaPagoPuntoVentasFK_IdEmpresa();

			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);

			//if(HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);

			this.getHistorialFormaPagoPuntoVentasFK_IdFacturaPuntoVenta();

			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);

			//if(HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalHistorialFormaPagoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);

			this.getHistorialFormaPagoPuntoVentasFK_IdSucursal();

			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);

			//if(HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialformapagopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameHistorialFormaPagoPuntoVenta() {
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.dispose();
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta!=null) {
			this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.dispose();
			this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessHistorialFormaPagoPuntoVenta();
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarHistorialFormaPagoPuntoVenta")) {
				jButtonDuplicarHistorialFormaPagoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarHistorialFormaPagoPuntoVenta")) {
				jButtonCopiarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormHistorialFormaPagoPuntoVenta")) {
				jButtonVerFormHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonDuplicarHistorialFormaPagoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarHistorialFormaPagoPuntoVenta")) {
				jButtonDuplicarHistorialFormaPagoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarHistorialFormaPagoPuntoVenta")) {
				jButtonModificarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonModificarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarHistorialFormaPagoPuntoVenta")) {
				jButtonModificarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarHistorialFormaPagoPuntoVenta")) {
				jButtonActualizarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonActualizarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarHistorialFormaPagoPuntoVenta")) {
				jButtonActualizarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarHistorialFormaPagoPuntoVenta")) {
				jButtonEliminarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonEliminarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarHistorialFormaPagoPuntoVenta")) {
				jButtonEliminarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarHistorialFormaPagoPuntoVenta")) {
				jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarHistorialFormaPagoPuntoVenta")) {
				jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarHistorialFormaPagoPuntoVenta")) {
				jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarHistorialFormaPagoPuntoVenta")) {
				jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonMostrarOcultarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarHistorialFormaPagoPuntoVenta")) {
				jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosHistorialFormaPagoPuntoVenta")) {
				jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonCopiarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonVerFormHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosHistorialFormaPagoPuntoVenta")) {
				jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarHistorialFormaPagoPuntoVenta")) {
				jButtonCopiarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormHistorialFormaPagoPuntoVenta")) {
				jButtonVerFormHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaHistorialFormaPagoPuntoVenta")) {
				jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta")) {
				jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionHistorialFormaPagoPuntoVenta")) {
				jButtonRecargarInformacionHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonRecargarInformacionHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionHistorialFormaPagoPuntoVenta")) {
				jButtonRecargarInformacionHistorialFormaPagoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresHistorialFormaPagoPuntoVenta")) {
				jButtonAnterioresHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonAnterioresHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreHistorialFormaPagoPuntoVenta")) {
				jButtonAnterioresHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesHistorialFormaPagoPuntoVenta")) {
				jButtonSiguientesHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonSiguientesHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesHistorialFormaPagoPuntoVenta")) {
				jButtonSiguientesHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByHistorialFormaPagoPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta")) {
				jButtonAbrirOrderByHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarHistorialFormaPagoPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarHistorialFormaPagoPuntoVenta")) {
				jButtonMostrarOcultarHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoHistorialFormaPagoPuntoVenta")) {
				jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoHistorialFormaPagoPuntoVenta")) {
				jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionHistorialFormaPagoPuntoVenta")) {
				jButtonCerrarImportacionHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionHistorialFormaPagoPuntoVenta")) {
				
				jButtonGenerarImportacionHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionHistorialFormaPagoPuntoVenta")) {
				
				jButtonAbrirImportacionHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesHistorialFormaPagoPuntoVenta")) {
				jComboBoxTiposAccionesHistorialFormaPagoPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesHistorialFormaPagoPuntoVenta")) {
				jComboBoxTiposRelacionesHistorialFormaPagoPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioHistorialFormaPagoPuntoVenta")) {
				jComboBoxTiposAccionesHistorialFormaPagoPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarHistorialFormaPagoPuntoVenta")) {
				
				jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralHistorialFormaPagoPuntoVenta")) {
				jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByHistorialFormaPagoPuntoVenta")) {
				jButtonAbrirOrderByHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarHistorialFormaPagoPuntoVenta")) {
				jButtonAbrirOrderByHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByHistorialFormaPagoPuntoVenta")) {
				jButtonCerrarOrderByHistorialFormaPagoPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialFormaPagoPuntoVentaBusqueda")) {
				this.jButtonidHistorialFormaPagoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate")) {
				this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda")) {
				this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialFormaPagoPuntoVentaUpdate")) {
				this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialFormaPagoPuntoVentaBusqueda")) {
				this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalHistorialFormaPagoPuntoVentaUpdate")) {
				this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalHistorialFormaPagoPuntoVentaBusqueda")) {
				this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta")) {
				this.jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVentaActionPerformed(evt);
			}
			
			;
			
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessHistorialFormaPagoPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				


				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			HistorialFormaPagoPuntoVenta historialformapagopuntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				historialformapagopuntoventaLocal=this.historialformapagopuntoventa;
			} else {
				historialformapagopuntoventaLocal=this.historialformapagopuntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
							
				
				


				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
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
			
			


			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
								
						
				


				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
								
				
				


				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
							
				
				


				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
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
			
			


			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
								
				
				


				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosHistorialFormaPagoPuntoVenta")) {
					jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosHistorialFormaPagoPuntoVenta")) {
					jCheckBoxSeleccionadosHistorialFormaPagoPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarHistorialFormaPagoPuntoVenta")) {
					
				}
				
				


				
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
												
				
				


				
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
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
			
			


			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialformapagopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialformapagopuntoventa);
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
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
				
				


				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialFormaPagoPuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialFormaPagoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialFormaPagoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialformapagopuntoventaAnterior =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarHistorialFormaPagoPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosHistorialFormaPagoPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.historialformapagopuntoventa =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.historialformapagopuntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarHistorialFormaPagoPuntoVenta")) {
				
				}
				
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarHistorialFormaPagoPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarHistorialFormaPagoPuntoVenta")) {
			
			}
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessHistorialFormaPagoPuntoVenta();
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarHistorialFormaPagoPuntoVenta")) {
				jButtonDuplicarHistorialFormaPagoPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarHistorialFormaPagoPuntoVenta")) {
				jButtonCopiarHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormHistorialFormaPagoPuntoVenta")) {
				jButtonVerFormHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarHistorialFormaPagoPuntoVenta")) {
				jButtonModificarHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarHistorialFormaPagoPuntoVenta")) {
				jButtonActualizarHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarHistorialFormaPagoPuntoVenta")) {
				jButtonEliminarHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaHistorialFormaPagoPuntoVenta")) {
				jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarHistorialFormaPagoPuntoVenta")) {
				jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarHistorialFormaPagoPuntoVenta")) {
				jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosHistorialFormaPagoPuntoVenta")) {
				jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialFormaPagoPuntoVenta")) {
				jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByHistorialFormaPagoPuntoVenta")) {
				jButtonAbrirOrderByHistorialFormaPagoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionHistorialFormaPagoPuntoVenta")) {
				jButtonRecargarInformacionHistorialFormaPagoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresHistorialFormaPagoPuntoVenta")) {
				jButtonAnterioresHistorialFormaPagoPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesHistorialFormaPagoPuntoVenta")) {
				jButtonSiguientesHistorialFormaPagoPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialFormaPagoPuntoVentaBusqueda")) {
				this.jButtonidHistorialFormaPagoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate")) {
				this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda")) {
				this.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialFormaPagoPuntoVentaUpdate")) {
				this.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialFormaPagoPuntoVentaBusqueda")) {
				this.jButtonid_empresaHistorialFormaPagoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalHistorialFormaPagoPuntoVentaUpdate")) {
				this.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalHistorialFormaPagoPuntoVentaBusqueda")) {
				this.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusquedaActionPerformed(evt);
			}
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessHistorialFormaPagoPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameHistorialFormaPagoPuntoVenta")) {
				closingInternalFrameHistorialFormaPagoPuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarHistorialFormaPagoPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(null);
			}
			
			HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialformapagopuntoventa,new Object(),this.historialformapagopuntoventaParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormHistorialFormaPagoPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormHistorialFormaPagoPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormHistorialFormaPagoPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.historialformapagopuntoventa)) {
			if(!esControlTabla) {
				if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);			
				}
				
				if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialformapagopuntoventaReturnGeneral=historialformapagopuntoventaLogic.procesarEventosHistorialFormaPagoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas(),this.historialformapagopuntoventa,this.historialformapagopuntoventaParameterGeneral,this.isEsNuevoHistorialFormaPagoPuntoVenta,classes);//this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaReturnGeneral,this.historialformapagopuntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanHistorialFormaPagoPuntoVenta(classes,this.historialformapagopuntoventaReturnGeneral,this.historialformapagopuntoventaBean,false);
					}
						
					if(this.historialformapagopuntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta());	
					}
						
					if(this.historialformapagopuntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta(),classes);//this.historialformapagopuntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,classes);//this.historialformapagopuntoventaBean);									
				}
			
				if(HistorialFormaPagoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.historialformapagopuntoventaAnterior!=null) {
						this.historialformapagopuntoventa=this.historialformapagopuntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialformapagopuntoventaReturnGeneral=historialformapagopuntoventaLogic.procesarEventosHistorialFormaPagoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas(),this.historialformapagopuntoventa,this.historialformapagopuntoventaParameterGeneral,this.isEsNuevoHistorialFormaPagoPuntoVenta,classes);//this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialformapagopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta(),historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta(),this.historialformapagopuntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosHistorialFormaPagoPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosHistorialFormaPagoPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosHistorialFormaPagoPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosHistorialFormaPagoPuntoVenta() throws Exception {
		
		HistorialFormaPagoPuntoVentaModel historialformapagopuntoventaModel=(HistorialFormaPagoPuntoVentaModel)this.jTableDatosHistorialFormaPagoPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialformapagopuntoventaModel.historialformapagopuntoventas=this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			historialformapagopuntoventaModel.historialformapagopuntoventas=this.historialformapagopuntoventas;
		}
		
		
		((HistorialFormaPagoPuntoVentaModel) this.jTableDatosHistorialFormaPagoPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaHistorialFormaPagoPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gethistorialformapagopuntoventaAnterior(),this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gethistorialformapagopuntoventaAnterior(),this.historialformapagopuntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosHistorialFormaPagoPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
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
										
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialformapagopuntoventa,new Object(),generalEntityParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=HistorialFormaPagoPuntoVentaConstantesFunciones.getClassesRelationshipsOfHistorialFormaPagoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=HistorialFormaPagoPuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfHistorialFormaPagoPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormHistorialFormaPagoPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialformapagopuntoventa,new Object(),generalEntityParameterGeneral,this.historialformapagopuntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVentaBean historialformapagopuntoventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanHistorialFormaPagoPuntoVenta(ArrayList<Classe> classes,HistorialFormaPagoPuntoVentaReturnGeneral historialformapagopuntoventaReturnGeneral,HistorialFormaPagoPuntoVentaBean historialformapagopuntoventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.historialformapagopuntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta = new HistorialFormaPagoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.historialformapagopuntoventaSessionBean.getConGuardarRelaciones(),this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.historialformapagopuntoventaLogic=this.historialformapagopuntoventaLogic;
		
		this.cargarCombosFrameForeignKeyHistorialFormaPagoPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialFormaPagoPuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialFormaPagoPuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyHistorialFormaPagoPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyHistorialFormaPagoPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialFormaPagoPuntoVenta"));
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonModificarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarHistorialFormaPagoPuntoVenta"));

		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonModificarToolBarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialFormaPagoPuntoVenta"));
					
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemModificarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialFormaPagoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarHistorialFormaPagoPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarToolBarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialFormaPagoPuntoVenta"));
						
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemActualizarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialFormaPagoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarHistorialFormaPagoPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialFormaPagoPuntoVenta"));
								
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemEliminarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialFormaPagoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarHistorialFormaPagoPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialFormaPagoPuntoVenta"));
					
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemCancelarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialFormaPagoPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialFormaPagoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialFormaPagoPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialFormaPagoPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialFormaPagoPuntoVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonidHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialFormaPagoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialFormaPagoPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameHistorialFormaPagoPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialFormaPagoPuntoVenta"));
		}
		
		this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarHistorialFormaPagoPuntoVenta"));
		
		this.jTableDatosHistorialFormaPagoPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarHistorialFormaPagoPuntoVenta"));
		
		this.jButtonNuevoHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoHistorialFormaPagoPuntoVenta"));
		
		this.jButtonDuplicarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarHistorialFormaPagoPuntoVenta"));
		
		this.jButtonCopiarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarHistorialFormaPagoPuntoVenta"));
		
		this.jButtonVerFormHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormHistorialFormaPagoPuntoVenta"));
		
		
		this.jButtonNuevoToolBarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarHistorialFormaPagoPuntoVenta"));
			
		this.jButtonDuplicarToolBarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemNuevoHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemDuplicarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarHistorialFormaPagoPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesHistorialFormaPagoPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonModificarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarHistorialFormaPagoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonModificarToolBarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialFormaPagoPuntoVenta"));
			
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemModificarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialFormaPagoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarHistorialFormaPagoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonActualizarToolBarHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialFormaPagoPuntoVenta"));
				
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemActualizarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialFormaPagoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarHistorialFormaPagoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonEliminarToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialFormaPagoPuntoVenta"));
						
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemEliminarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialFormaPagoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarHistorialFormaPagoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonCancelarToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialFormaPagoPuntoVenta"));
			
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemCancelarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialFormaPagoPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarHistorialFormaPagoPuntoVenta"));		
		
		
		this.jButtonCerrarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarHistorialFormaPagoPuntoVenta"));
		
		
		this.jButtonCerrarToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemCerrarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarHistorialFormaPagoPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialFormaPagoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosHistorialFormaPagoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialFormaPagoPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarHistorialFormaPagoPuntoVenta"));
			
		this.jButtonVerFormToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarHistorialFormaPagoPuntoVenta"));
		
		this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemCopiarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarHistorialFormaPagoPuntoVenta"));		
		
		this.jMenuItemVerFormHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormHistorialFormaPagoPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialFormaPagoPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialFormaPagoPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionHistorialFormaPagoPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarHistorialFormaPagoPuntoVenta"));
		
		this.jMenuItemRecargarInformacionHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionHistorialFormaPagoPuntoVenta"));		
		
		
		
		this.jButtonAnterioresHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresHistorialFormaPagoPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarHistorialFormaPagoPuntoVenta"));
		
		this.jMenuItemAnterioresHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresHistorialFormaPagoPuntoVenta"));		
		
		
		this.jButtonSiguientesHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesHistorialFormaPagoPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemSiguientesHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemAbrirOrderByHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemMostrarOcultarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarHistorialFormaPagoPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosHistorialFormaPagoPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarHistorialFormaPagoPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosHistorialFormaPagoPuntoVenta"));

		this.jCheckBoxSeleccionadosHistorialFormaPagoPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosHistorialFormaPagoPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialFormaPagoPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesHistorialFormaPagoPuntoVenta"));
			
		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesHistorialFormaPagoPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarHistorialFormaPagoPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralHistorialFormaPagoPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonidHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialFormaPagoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialFormaPagoPuntoVenta"));
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialFormaPagoPuntoVenta"));
				this.jInternalFrameReporteDinamicoHistorialFormaPagoPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialFormaPagoPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialFormaPagoPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta!=null) {
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialFormaPagoPuntoVenta"));
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialFormaPagoPuntoVenta"));
				this.jInternalFrameImportacionHistorialFormaPagoPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialFormaPagoPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByHistorialFormaPagoPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarHistorialFormaPagoPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarHistorialFormaPagoPuntoVenta"));			
			
			if(this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta!=null) {
				this.jInternalFrameOrderByHistorialFormaPagoPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialFormaPagoPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jTabbedPaneRelacionesHistorialFormaPagoPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialFormaPagoPuntoVenta"));
		
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
            		closingInternalFrameHistorialFormaPagoPuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosHistorialFormaPagoPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosHistorialFormaPagoPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoHistorialFormaPagoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialFormaPagoPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonModificarHistorialFormaPagoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarHistorialFormaPagoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonActualizarHistorialFormaPagoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarHistorialFormaPagoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonEliminarHistorialFormaPagoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarHistorialFormaPagoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonCancelarHistorialFormaPagoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarHistorialFormaPagoPuntoVenta";
		inputMap = this.jButtonCerrarHistorialFormaPagoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarHistorialFormaPagoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosHistorialFormaPagoPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonGuardarCambiosHistorialFormaPagoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesHistorialFormaPagoPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonidHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialFormaPagoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaHistorialFormaPagoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_factura_punto_ventaHistorialFormaPagoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_empresaHistorialFormaPagoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_empresaHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialFormaPagoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_sucursalHistorialFormaPagoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jButtonid_sucursalHistorialFormaPagoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalHistorialFormaPagoPuntoVentaBusqueda"));
		
		
		this.jButtonFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionHistorialFormaPagoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionHistorialFormaPagoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarHistorialFormaPagoPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosHistorialFormaPagoPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
					historialformapagopuntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventas) {
					historialformapagopuntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosHistorialFormaPagoPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
						historialformapagopuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventas) {
						historialformapagopuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialFormaPagoPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialFormaPagoPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosHistorialFormaPagoPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosHistorialFormaPagoPuntoVenta.getSelectedRows();
			
			HistorialFormaPagoPuntoVenta historialformapagopuntoventaLocal=new HistorialFormaPagoPuntoVenta();
			
			//this.seleccionarTodosHistorialFormaPagoPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialformapagopuntoventaLocal =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas().toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					historialformapagopuntoventaLocal =(HistorialFormaPagoPuntoVenta) this.historialformapagopuntoventas.toArray()[this.jTableDatosHistorialFormaPagoPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				historialformapagopuntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
						historialformapagopuntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventas) {
						historialformapagopuntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialFormaPagoPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialFormaPagoPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialFormaPagoPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualHistorialFormaPagoPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarHistorialFormaPagoPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralHistorialFormaPagoPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventas) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesHistorialFormaPagoPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteHistorialFormaPagoPuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessHistorialFormaPagoPuntoVenta(conSplash);
				
					this.generarReporteHistorialFormaPagoPuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoHistorialFormaPagoPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialFormaPagoPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialFormaPagoPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialFormaPagoPuntoVenta();
				
				this.exportarHistorialFormaPagoPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionHistorialFormaPagoPuntoVentas();
				//this.importarHistorialFormaPagoPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialFormaPagoPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelHistorialFormaPagoPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Historial Forma Pago Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessHistorialFormaPagoPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoHistorialFormaPagoPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyHistorialFormaPagoPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(HistorialFormaPagoPuntoVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteHistorialFormaPagoPuntoVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessHistorialFormaPagoPuntoVenta(conSplash);
					
						//this.actualizarParametrosGeneralHistorialFormaPagoPuntoVenta();
						
						this.generarReporteProcesoAccionHistorialFormaPagoPuntoVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Historial Forma Pago Punto VentaS SELECCIONADOS?", "MANTENIMIENTO DE Historial Forma Pago Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessHistorialFormaPagoPuntoVenta();
				
						this.actualizarParametrosGeneralHistorialFormaPagoPuntoVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.historialformapagopuntoventaReturnGeneral=historialformapagopuntoventaLogic.procesarAccionHistorialFormaPagoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas(),this.historialformapagopuntoventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarHistorialFormaPagoPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralHistorialFormaPagoPuntoVenta();
					
					HistorialFormaPagoPuntoVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarHistorialFormaPagoPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxTiposAccionesFormularioHistorialFormaPagoPuntoVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessHistorialFormaPagoPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesHistorialFormaPagoPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessHistorialFormaPagoPuntoVenta();
			
			if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();		
			HistorialFormaPagoPuntoVenta historialformapagopuntoventa=new HistorialFormaPagoPuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesHistorialFormaPagoPuntoVenta.getSelectedItem();
			
			
			
			
			historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(historialformapagopuntoventasSeleccionados.size()==1) {
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventasSeleccionados) {
					historialformapagopuntoventa=historialformapagopuntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessHistorialFormaPagoPuntoVenta();
			
      		//this.finishProcessHistorialFormaPagoPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarHistorialFormaPagoPuntoVentaReturnGeneral() throws Exception {
		if(this.historialformapagopuntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.historialformapagopuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.historialformapagopuntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.historialformapagopuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.historialformapagopuntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.historialformapagopuntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
		}
		
		if(this.historialformapagopuntoventaReturnGeneral.getConRetornoLista() || this.historialformapagopuntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.historialformapagopuntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVentas(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.historialformapagopuntoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialformapagopuntoventaLogic.setHistorialFormaPagoPuntoVenta(this.historialformapagopuntoventaReturnGeneral.getHistorialFormaPagoPuntoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingHistorialFormaPagoPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralHistorialFormaPagoPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<HistorialFormaPagoPuntoVenta> getHistorialFormaPagoPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioHistorialFormaPagoPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas()) {
					if(historialformapagopuntoventaAux.getIsSelected()) {
						historialformapagopuntoventasSeleccionados.add(historialformapagopuntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:this.historialformapagopuntoventas) {
					if(historialformapagopuntoventaAux.getIsSelected()) {
						historialformapagopuntoventasSeleccionados.add(historialformapagopuntoventaAux);				
					}
				}
			}
			
			if(historialformapagopuntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						historialformapagopuntoventasSeleccionados.addAll(this.historialformapagopuntoventaLogic.getHistorialFormaPagoPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						historialformapagopuntoventasSeleccionados.addAll(this.historialformapagopuntoventas);				
					}
				}
			}
		} else {
			historialformapagopuntoventasSeleccionados.add(this.historialformapagopuntoventa);
		}
		
		return historialformapagopuntoventasSeleccionados;
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
	
	public void generarReporteHistorialFormaPagoPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalHistorialFormaPagoPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoHistorialFormaPagoPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialFormaPagoPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialFormaPagoPuntoVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Historial Forma Pago Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesHistorialFormaPagoPuntoVentasSeleccionados() throws Exception {
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();		
		
		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteHistorialFormaPagoPuntoVentas("Todos",historialformapagopuntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalHistorialFormaPagoPuntoVentasSeleccionados() throws Exception {
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();		
		
		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteHistorialFormaPagoPuntoVentas("Todos",historialformapagopuntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionHistorialFormaPagoPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();
		
		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteHistorialFormaPagoPuntoVentas("Todos",historialformapagopuntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoHistorialFormaPagoPuntoVentasSeleccionados() throws Exception {
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoHistorialFormaPagoPuntoVenta();
		
		
		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoHistorialFormaPagoPuntoVenta();
		
		
		//this.generarReporteHistorialFormaPagoPuntoVentas("Todos",historialformapagopuntoventasSeleccionados ,historialformapagopuntoventaImplementable,historialformapagopuntoventaImplementableHome);
	}
	
	public void mostrarImportacionHistorialFormaPagoPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionHistorialFormaPagoPuntoVenta();
		
		this.abrirFrameImportacionHistorialFormaPagoPuntoVenta();		
		
			
		//this.generarReporteHistorialFormaPagoPuntoVentas("Todos",historialformapagopuntoventasSeleccionados ,historialformapagopuntoventaImplementable,historialformapagopuntoventaImplementableHome);
	}
	
	public void importarHistorialFormaPagoPuntoVentas() throws Exception {		
	
	}
	
	public void exportarHistorialFormaPagoPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelHistorialFormaPagoPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoHistorialFormaPagoPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlHistorialFormaPagoPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Historial Forma Pago Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoHistorialFormaPagoPuntoVentasSeleccionados() throws Exception {
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();		
		
		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapagopuntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarHistorialFormaPagoPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarHistorialFormaPagoPuntoVenta(historialformapagopuntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//historialformapagopuntoventaAux.setsDetalleGeneralEntityReporte(historialformapagopuntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarHistorialFormaPagoPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=historialformapagopuntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapagopuntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapagopuntoventa.getfacturapuntoventa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapagopuntoventa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialformapagopuntoventa.getsucursal_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelHistorialFormaPagoPuntoVentasSeleccionados() throws Exception {
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();		
		
		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapagopuntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("HistorialFormaPagoPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelHistorialFormaPagoPuntoVenta(row);				
				iRow++;
			}				
			
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelHistorialFormaPagoPuntoVenta(historialformapagopuntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlHistorialFormaPagoPuntoVentasSeleccionados() throws Exception {
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();		
		
		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialformapagopuntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("historialformapagopuntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("historialformapagopuntoventa");
			//elementRoot.appendChild(element);
		
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventasSeleccionados) {
				element = document.createElement("historialformapagopuntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlHistorialFormaPagoPuntoVenta(historialformapagopuntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Forma Pago Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelHistorialFormaPagoPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapagopuntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapagopuntoventa.getfacturapuntoventa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapagopuntoventa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialformapagopuntoventa.getsucursal_descripcion());				
	}
	
	public void setFilaDatosExportarXmlHistorialFormaPagoPuntoVenta(HistorialFormaPagoPuntoVenta historialformapagopuntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(HistorialFormaPagoPuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(historialformapagopuntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(HistorialFormaPagoPuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(historialformapagopuntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementfacturapuntoventa_descripcion = document.createElement(HistorialFormaPagoPuntoVentaConstantesFunciones.IDFACTURAPUNTOVENTA);
		elementfacturapuntoventa_descripcion.appendChild(document.createTextNode(historialformapagopuntoventa.getfacturapuntoventa_descripcion()));
		element.appendChild(elementfacturapuntoventa_descripcion);

		Element elementempresa_descripcion = document.createElement(HistorialFormaPagoPuntoVentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(historialformapagopuntoventa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(HistorialFormaPagoPuntoVentaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(historialformapagopuntoventa.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);
	}
	
	public void generarReporteGroupGenericoHistorialFormaPagoPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados=new ArrayList<HistorialFormaPagoPuntoVenta>();
		
		historialformapagopuntoventasSeleccionados=this.getHistorialFormaPagoPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoHistorialFormaPagoPuntoVenta(historialformapagopuntoventasSeleccionados);
		
		this.generarReporteHistorialFormaPagoPuntoVentas("Todos",historialformapagopuntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoHistorialFormaPagoPuntoVenta(ArrayList<HistorialFormaPagoPuntoVenta> historialformapagopuntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(HistorialFormaPagoPuntoVenta historialformapagopuntoventaAux:historialformapagopuntoventasSeleccionados) {
				historialformapagopuntoventaAux.setsDetalleGeneralEntityReporte(historialformapagopuntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA)) {
					existe=true;
					historialformapagopuntoventaAux.setsDescripcionGeneralEntityReporte1(historialformapagopuntoventaAux.getfacturapuntoventa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					historialformapagopuntoventaAux.setsDescripcionGeneralEntityReporte1(historialformapagopuntoventaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialFormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					historialformapagopuntoventaAux.setsDescripcionGeneralEntityReporte1(historialformapagopuntoventaAux.getsucursal_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialFormaPagoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesHistorialFormaPagoPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaModificarHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarHistorialFormaPagoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialFormaPagoPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(HistorialFormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsHistorialFormaPagoPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarHistorialFormaPagoPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarHistorialFormaPagoPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialFormaPagoPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!historialformapagopuntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;												
			}
			
			this.jButtonCerrarHistorialFormaPagoPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialFormaPagoPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.historialformapagopuntoventa)) {
			this.isVisibilidadCeldaActualizarHistorialFormaPagoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarHistorialFormaPagoPuntoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialFormaPagoPuntoVenta() {
	}
	
	public void actualizarEstadoPanelsHistorialFormaPagoPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelPaginacionHistorialFormaPagoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelPaginacionHistorialFormaPagoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelPaginacionHistorialFormaPagoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelPaginacionHistorialFormaPagoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelPaginacionHistorialFormaPagoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelPaginacionHistorialFormaPagoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionHistorialFormaPagoPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialFormaPagoPuntoVenta!=null) {
				this.jScrollPanelDatosHistorialFormaPagoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelPaginacionHistorialFormaPagoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta!=null) {
					this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.historialformapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta!=null) {
				this.jPanelParametrosReportesHistorialFormaPagoPuntoVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaFacturaPuntoVenta(Boolean isParaFacturaPuntoVenta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaPuntoVentaNegation=!isParaFacturaPuntoVenta;

			this.isVisibilidadFK_IdFacturaPuntoVenta=isParaFacturaPuntoVenta;
			if(!this.isVisibilidadFK_IdFacturaPuntoVenta) {this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.remove(jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdFacturaPuntoVenta=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFacturaPuntoVenta) {this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.remove(jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdFacturaPuntoVenta=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFacturaPuntoVenta) {this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.remove(jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//HistorialFormaPagoPuntoVentaSessionBean historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
		
		if(this.historialformapagopuntoventaSessionBean==null) {
			this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
		}
		
		this.historialformapagopuntoventaSessionBean.setsUltimaBusquedaHistorialFormaPagoPuntoVenta(this.getsAccionBusqueda());
		this.historialformapagopuntoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.historialformapagopuntoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			historialformapagopuntoventaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFacturaPuntoVenta")) {
			historialformapagopuntoventaSessionBean.setid_factura_punto_venta(this.getid_factura_punto_ventaFK_IdFacturaPuntoVenta());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			historialformapagopuntoventaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//HistorialFormaPagoPuntoVentaSessionBean historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
		
		if(this.historialformapagopuntoventaSessionBean==null) {
			this.historialformapagopuntoventaSessionBean=new HistorialFormaPagoPuntoVentaSessionBean();
		}
		
		if(this.historialformapagopuntoventaSessionBean.getsUltimaBusquedaHistorialFormaPagoPuntoVenta()!=null&&!this.historialformapagopuntoventaSessionBean.getsUltimaBusquedaHistorialFormaPagoPuntoVenta().equals("")) {
			this.setsAccionBusqueda(historialformapagopuntoventaSessionBean.getsUltimaBusquedaHistorialFormaPagoPuntoVenta());
			this.setiNumeroPaginacion(historialformapagopuntoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(historialformapagopuntoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(historialformapagopuntoventaSessionBean.getid_empresa());
				historialformapagopuntoventaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFacturaPuntoVenta")) {
				this.setid_factura_punto_ventaFK_IdFacturaPuntoVenta(historialformapagopuntoventaSessionBean.getid_factura_punto_venta());
				historialformapagopuntoventaSessionBean.setid_factura_punto_venta(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(historialformapagopuntoventaSessionBean.getid_sucursal());
				historialformapagopuntoventaSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.historialformapagopuntoventaSessionBean.setsUltimaBusquedaHistorialFormaPagoPuntoVenta("");
		this.historialformapagopuntoventaSessionBean.setiNumeroPaginacion(HistorialFormaPagoPuntoVentaConstantesFunciones.INUMEROPAGINACION);
		this.historialformapagopuntoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaHistorialFormaPagoPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioHistorialFormaPagoPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioHistorialFormaPagoPuntoVenta();
		this.updateVisibilidadBusquedasFormularioHistorialFormaPagoPuntoVenta();
		this.updateHabilitarBusquedasFormularioHistorialFormaPagoPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioHistorialFormaPagoPuntoVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.getComponents().length>0) {
	

		if(this.historialformapagopuntoventaConstantesFunciones.resaltarFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.indexOfComponent(this.jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.historialformapagopuntoventaConstantesFunciones.resaltarFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioHistorialFormaPagoPuntoVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.indexOfComponent(this.jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialformapagopuntoventaConstantesFunciones.mostrarFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);
			if(!this.historialformapagopuntoventaConstantesFunciones.mostrarFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioHistorialFormaPagoPuntoVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.indexOfComponent(this.jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialformapagopuntoventaConstantesFunciones.activarFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);
				this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setEnabledAt(index,this.historialformapagopuntoventaConstantesFunciones.activarFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaHistorialFormaPagoPuntoVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdFacturaPuntoVenta")) {
			index= this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.indexOfComponent(this.jPanelFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);

			this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialFormaPagoPuntoVenta.getComponent(index);

			this.historialformapagopuntoventaConstantesFunciones.setResaltarFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta(resaltar);

			jPanel.setBorder(this.historialformapagopuntoventaConstantesFunciones.resaltarFK_IdFacturaPuntoVentaHistorialFormaPagoPuntoVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarHistorialFormaPagoPuntoVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioHistorialFormaPagoPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioHistorialFormaPagoPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioHistorialFormaPagoPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioHistorialFormaPagoPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioHistorialFormaPagoPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.historialformapagopuntoventaConstantesFunciones.resaltaridHistorialFormaPagoPuntoVenta!=null && this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.setBorder(this.historialformapagopuntoventaConstantesFunciones.resaltaridHistorialFormaPagoPuntoVenta);}
		if(this.historialformapagopuntoventaConstantesFunciones.resaltarid_factura_punto_ventaHistorialFormaPagoPuntoVenta!=null && this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setBorder(this.historialformapagopuntoventaConstantesFunciones.resaltarid_factura_punto_ventaHistorialFormaPagoPuntoVenta);}
		if(this.historialformapagopuntoventaConstantesFunciones.resaltarid_empresaHistorialFormaPagoPuntoVenta!=null && this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setBorder(this.historialformapagopuntoventaConstantesFunciones.resaltarid_empresaHistorialFormaPagoPuntoVenta);}
		if(this.historialformapagopuntoventaConstantesFunciones.resaltarid_sucursalHistorialFormaPagoPuntoVenta!=null && this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setBorder(this.historialformapagopuntoventaConstantesFunciones.resaltarid_sucursalHistorialFormaPagoPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioHistorialFormaPagoPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.setVisible(this.historialformapagopuntoventaConstantesFunciones.mostraridHistorialFormaPagoPuntoVenta);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jPanelidHistorialFormaPagoPuntoVenta.setVisible(this.historialformapagopuntoventaConstantesFunciones.mostraridHistorialFormaPagoPuntoVenta);
		//this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setVisible(this.historialformapagopuntoventaConstantesFunciones.mostrarid_factura_punto_ventaHistorialFormaPagoPuntoVenta);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jPanelid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setVisible(this.historialformapagopuntoventaConstantesFunciones.mostrarid_factura_punto_ventaHistorialFormaPagoPuntoVenta);
		//this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setVisible(this.historialformapagopuntoventaConstantesFunciones.mostrarid_empresaHistorialFormaPagoPuntoVenta);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jPanelid_empresaHistorialFormaPagoPuntoVenta.setVisible(this.historialformapagopuntoventaConstantesFunciones.mostrarid_empresaHistorialFormaPagoPuntoVenta);
		//this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setVisible(this.historialformapagopuntoventaConstantesFunciones.mostrarid_sucursalHistorialFormaPagoPuntoVenta);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jPanelid_sucursalHistorialFormaPagoPuntoVenta.setVisible(this.historialformapagopuntoventaConstantesFunciones.mostrarid_sucursalHistorialFormaPagoPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioHistorialFormaPagoPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jLabelidHistorialFormaPagoPuntoVenta.setEnabled(this.historialformapagopuntoventaConstantesFunciones.activaridHistorialFormaPagoPuntoVenta);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_factura_punto_ventaHistorialFormaPagoPuntoVenta.setEnabled(this.historialformapagopuntoventaConstantesFunciones.activarid_factura_punto_ventaHistorialFormaPagoPuntoVenta);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_empresaHistorialFormaPagoPuntoVenta.setEnabled(this.historialformapagopuntoventaConstantesFunciones.activarid_empresaHistorialFormaPagoPuntoVenta);
		this.jInternalFrameDetalleFormHistorialFormaPagoPuntoVenta.jComboBoxid_sucursalHistorialFormaPagoPuntoVenta.setEnabled(this.historialformapagopuntoventaConstantesFunciones.activarid_sucursalHistorialFormaPagoPuntoVenta);
		}
	}
	
		
}