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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.contabilidad.util.ProcesoCierrePeriodoConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ProcesoCierrePeriodoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ProcesoCierrePeriodoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ProcesoCierrePeriodoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.contabilidad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.contabilidad.util.*;

import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.contabilidad.business.logic.report.*;

import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoCierrePeriodoBeanSwingJInternalFrame extends ProcesoCierrePeriodoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCierrePeriodoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCierrePeriodo> procesocierreperiodoValidator = new ClassValidator<ProcesoCierrePeriodo>(ProcesoCierrePeriodo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCierrePeriodo procesocierreperiodo;	
	public ProcesoCierrePeriodo procesocierreperiodoAux;
	public ProcesoCierrePeriodo procesocierreperiodoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCierrePeriodo procesocierreperiodoTotales;
	public Long idProcesoCierrePeriodoActual;
	public Long iIdNuevoProcesoCierrePeriodo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboEstadoPeriodo="";

	public List<EstadoPeriodo> estadoperiodosForeignKey;

	public List<EstadoPeriodo> getestadoperiodosForeignKey() {
		return estadoperiodosForeignKey;
	}

	public void setestadoperiodosForeignKey(List<EstadoPeriodo> estadoperiodosForeignKey) {
		this.estadoperiodosForeignKey = estadoperiodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoPeriodo estadoperiodoForeignKey;

	public EstadoPeriodo getestadoperiodoForeignKey() {
		return estadoperiodoForeignKey;
	}

	public void setestadoperiodoForeignKey(EstadoPeriodo estadoperiodoForeignKey) {
		this.estadoperiodoForeignKey = estadoperiodoForeignKey;
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
	
	public Boolean isPermisoTodoProcesoCierrePeriodo;
	public Boolean isPermisoNuevoProcesoCierrePeriodo;
	public Boolean isPermisoActualizarProcesoCierrePeriodo;
	public Boolean isPermisoActualizarOriginalProcesoCierrePeriodo;
	public Boolean isPermisoEliminarProcesoCierrePeriodo;
	public Boolean isPermisoGuardarCambiosProcesoCierrePeriodo;
	public Boolean isPermisoConsultaProcesoCierrePeriodo;
	public Boolean isPermisoBusquedaProcesoCierrePeriodo;
	public Boolean isPermisoReporteProcesoCierrePeriodo;
	public Boolean isPermisoPaginacionMedioProcesoCierrePeriodo;
	public Boolean isPermisoPaginacionAltoProcesoCierrePeriodo;
	public Boolean isPermisoPaginacionTodoProcesoCierrePeriodo;
	public Boolean isPermisoCopiarProcesoCierrePeriodo;
	public Boolean isPermisoVerFormProcesoCierrePeriodo;
	public Boolean isPermisoDuplicarProcesoCierrePeriodo;
	public Boolean isPermisoOrdenProcesoCierrePeriodo;
	
	
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
	
	public ProcesoCierrePeriodoParameterReturnGeneral procesocierreperiodoReturnGeneral;
	public ProcesoCierrePeriodoParameterReturnGeneral procesocierreperiodoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCierrePeriodo=false;
	public Boolean esParaAccionDesdeFormularioProcesoCierrePeriodo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCierrePeriodoSessionBeanAdditional procesocierreperiodoSessionBeanAdditional=null;
	
	public ProcesoCierrePeriodoSessionBeanAdditional getProcesoCierrePeriodoSessionBeanAdditional() {
		return this.procesocierreperiodoSessionBeanAdditional;
	}
	
	public void setProcesoCierrePeriodoSessionBeanAdditional(ProcesoCierrePeriodoSessionBeanAdditional procesocierreperiodoSessionBeanAdditional) {
		try {
			this.procesocierreperiodoSessionBeanAdditional=procesocierreperiodoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional procesocierreperiodoBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCierrePeriodoBeanSwingJInternalFrame
	
	public ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional getProcesoCierrePeriodoBeanSwingJInternalFrameAdditional() {
		return this.procesocierreperiodoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCierrePeriodoBeanSwingJInternalFrameAdditional(ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional procesocierreperiodoBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocierreperiodoBeanSwingJInternalFrameAdditional=procesocierreperiodoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCierrePeriodoLogic procesocierreperiodoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCierrePeriodo procesocierreperiodoBean;
	public ProcesoCierrePeriodoConstantesFunciones procesocierreperiodoConstantesFunciones;
	//public ProcesoCierrePeriodoParameterReturnGeneral procesocierreperiodoReturnGeneral;
	
	//FK
	
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public EstadoPeriodoLogic estadoperiodoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCierrePeriodo> procesocierreperiodos;	
	//public List<ProcesoCierrePeriodo> procesocierreperiodosEliminados;
	//public List<ProcesoCierrePeriodo> procesocierreperiodosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCierrePeriodo=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCierrePeriodo=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCierrePeriodo=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCierrePeriodo=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCierrePeriodo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
	public Boolean isVisibilidadCeldaModificarProcesoCierrePeriodo=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCierrePeriodo=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCierrePeriodo=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado=false;
	
	public Long getiIdNuevoProcesoCierrePeriodo() {
		return this.iIdNuevoProcesoCierrePeriodo;
	}

	public void setiIdNuevoProcesoCierrePeriodo(Long iIdNuevoProcesoCierrePeriodo) {
		this.iIdNuevoProcesoCierrePeriodo = iIdNuevoProcesoCierrePeriodo;
	}
	
	public Long getidProcesoCierrePeriodoActual() {
		return this.idProcesoCierrePeriodoActual;
	}

	public void setidProcesoCierrePeriodoActual(Long idProcesoCierrePeriodoActual) {
		this.idProcesoCierrePeriodoActual = idProcesoCierrePeriodoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCierrePeriodo getprocesocierreperiodo() {
		return this.procesocierreperiodo;
	}

	public void setprocesocierreperiodo(ProcesoCierrePeriodo procesocierreperiodo) {
		this.procesocierreperiodo = procesocierreperiodo;
	}
	
	public ProcesoCierrePeriodo getprocesocierreperiodoAux() {
		return this.procesocierreperiodoAux;
	}

	public void setprocesocierreperiodoAux(ProcesoCierrePeriodo procesocierreperiodoAux) {
		this.procesocierreperiodoAux = procesocierreperiodoAux;
	}				
	
	public ProcesoCierrePeriodo getprocesocierreperiodoAnterior() {
		return this.procesocierreperiodoAnterior;
	}

	public void setprocesocierreperiodoAnterior(ProcesoCierrePeriodo procesocierreperiodoAnterior) {
		this.procesocierreperiodoAnterior = procesocierreperiodoAnterior;
	}	
	
	public ProcesoCierrePeriodo getprocesocierreperiodoTotales() {
		return this.procesocierreperiodoTotales;
	}

	public void setprocesocierreperiodoTotales(ProcesoCierrePeriodo procesocierreperiodoTotales) {
		this.procesocierreperiodoTotales = procesocierreperiodoTotales;
	}	
	
	public ProcesoCierrePeriodo getprocesocierreperiodoBean() {
		return this.procesocierreperiodoBean;
	}

	public void setprocesocierreperiodoBean(ProcesoCierrePeriodo procesocierreperiodoBean) {
		this.procesocierreperiodoBean = procesocierreperiodoBean;
	}	
	
	public ProcesoCierrePeriodoParameterReturnGeneral getprocesocierreperiodoReturnGeneral() {
		return this.procesocierreperiodoReturnGeneral;
	}

	public void setprocesocierreperiodoReturnGeneral(ProcesoCierrePeriodoParameterReturnGeneral procesocierreperiodoReturnGeneral) {
		this.procesocierreperiodoReturnGeneral = procesocierreperiodoReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado=-1L;

	public Long getid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado() {
		return this.id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado;
	}

	public void setid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado(Long id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado) {
		this.id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado = id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado;
	}

;
	public Long id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado=-1L;

	public Long getid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado() {
		return this.id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado;
	}

	public void setid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado(Long id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado) {
		this.id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado = id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado;
	}

;
	public Long id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado=-1L;

	public Long getid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado() {
		return this.id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado;
	}

	public void setid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado(Long id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado) {
		this.id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado = id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoCierrePeriodoLogic getProcesoCierrePeriodoLogic()	{		
		return procesocierreperiodoLogic;
	}

	public void setProcesoCierrePeriodoLogic(ProcesoCierrePeriodoLogic procesocierreperiodoLogic) {
		this.procesocierreperiodoLogic = procesocierreperiodoLogic;
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
	
	public Boolean getIsEsNuevoProcesoCierrePeriodo() {
		return isEsNuevoProcesoCierrePeriodo;
	}

	public void setIsEsNuevoProcesoCierrePeriodo(Boolean isEsNuevoProcesoCierrePeriodo) {
		this.isEsNuevoProcesoCierrePeriodo = isEsNuevoProcesoCierrePeriodo;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCierrePeriodo() {
		return esParaAccionDesdeFormularioProcesoCierrePeriodo;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCierrePeriodo(Boolean esParaAccionDesdeFormularioProcesoCierrePeriodo) {
		this.esParaAccionDesdeFormularioProcesoCierrePeriodo = esParaAccionDesdeFormularioProcesoCierrePeriodo;
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
	
	
	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.procesocierreperiodoSessionBean==null) {
				this.procesocierreperiodoSessionBean=new ProcesoCierrePeriodoSessionBean();
			}

			if(!this.procesocierreperiodoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(procesocierreperiodoSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocierreperiodoSessionBean==null) {
				this.procesocierreperiodoSessionBean=new ProcesoCierrePeriodoSessionBean();
			}

			if(!this.procesocierreperiodoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(procesocierreperiodoSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosEstadoPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadoperiodosForeignKey=new ArrayList<EstadoPeriodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoPeriodoLogic estadoperiodoLogic=new EstadoPeriodoLogic();

			//estadoperiodoLogic.getEstadoPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocierreperiodoSessionBean==null) {
				this.procesocierreperiodoSessionBean=new ProcesoCierrePeriodoSessionBean();
			}

			if(!this.procesocierreperiodoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadoperiodoLogic.getEstadoPeriodoDataAccess().setIsForForeingKeyData(true);

					estadoperiodoLogic.getTodosEstadoPeriodosWithConnection(sFinalQuery,new Pagination());

					this.estadoperiodosForeignKey=estadoperiodoLogic.getEstadoPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoperiodoLogic.getEntityWithConnection(procesocierreperiodoSessionBean.getlidEstadoPeriodoActual());
					this.estadoperiodosForeignKey.add(estadoperiodoLogic.getEstadoPeriodo());
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

	
	
	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.procesocierreperiodo!=null) {
						this.procesocierreperiodo.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioProcesoCierrePeriodo.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodoPorEstado") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo!=null) {
						jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo!=null) {
							//jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioProcesoCierrePeriodoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioProcesoCierrePeriodoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioProcesoCierrePeriodoGenerico!=null && jComboBoxid_ejercicioProcesoCierrePeriodoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioProcesoCierrePeriodoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.procesocierreperiodo!=null) {
						this.procesocierreperiodo.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoProcesoCierrePeriodo.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodoPorEstado") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo!=null) {
						jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo!=null) {
							//jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.getItemCount()>0) {
								jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoProcesoCierrePeriodoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoProcesoCierrePeriodoGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoProcesoCierrePeriodoGenerico!=null && jComboBoxid_periodoProcesoCierrePeriodoGenerico.getItemCount()>0) {
					jComboBoxid_periodoProcesoCierrePeriodoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoPeriodoForeignKey(Long idEstadoPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoPeriodo  estadoperiodoTemp=null;

			for(EstadoPeriodo estadoperiodoAux:estadoperiodosForeignKey) {
				if(estadoperiodoAux.getId()!=null && estadoperiodoAux.getId().equals(idEstadoPeriodoSeleccionado)) {
					estadoperiodoTemp=estadoperiodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadoperiodoTemp!=null) {

					if(this.procesocierreperiodo!=null) {
						this.procesocierreperiodo.setEstadoPeriodo(estadoperiodoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.setSelectedItem(estadoperiodoTemp);
					}
				} else {
					//jComboBoxid_estado_periodoProcesoCierrePeriodo.setSelectedItem(estadoperiodoTemp);
					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodoPorEstado") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadoperiodoTemp!=null && jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo!=null) {
						jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedItem(estadoperiodoTemp);
					} else {
						if(jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo!=null) {
							//jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedItem(estadoperiodoTemp);
							if(jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.getItemCount()>0) {
								jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedIndex(0);
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

	public String getActualEstadoPeriodoForeignKeyDescripcion(Long idEstadoPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoPeriodo  estadoperiodoTemp=null;

			for(EstadoPeriodo estadoperiodoAux:estadoperiodosForeignKey) {
				if(estadoperiodoAux.getId()!=null && estadoperiodoAux.getId().equals(idEstadoPeriodoSeleccionado)) {
					estadoperiodoTemp=estadoperiodoAux;
					break;
				}
			}


			sDescripcion=EstadoPeriodoConstantesFunciones.getEstadoPeriodoDescripcion(estadoperiodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoPeriodoForeignKeyGenerico(Long idEstadoPeriodoSeleccionado,JComboBox jComboBoxid_estado_periodoProcesoCierrePeriodoGenerico)throws Exception
	{
		try
		{
			EstadoPeriodo  estadoperiodoTemp=null;

			for(EstadoPeriodo estadoperiodoAux:estadoperiodosForeignKey) {
				if(estadoperiodoAux.getId()!=null && estadoperiodoAux.getId().equals(idEstadoPeriodoSeleccionado)) {
					estadoperiodoTemp=estadoperiodoAux;
					break;
				}
			}

			if(estadoperiodoTemp!=null) {
				jComboBoxid_estado_periodoProcesoCierrePeriodoGenerico.setSelectedItem(estadoperiodoTemp);
			} else {
				if(jComboBoxid_estado_periodoProcesoCierrePeriodoGenerico!=null && jComboBoxid_estado_periodoProcesoCierrePeriodoGenerico.getItemCount()>0) {
					jComboBoxid_estado_periodoProcesoCierrePeriodoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ProcesoCierrePeriodo procesocierreperiodo,JComboBox jComboBoxid_ejercicioProcesoCierrePeriodoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioProcesoCierrePeriodoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioProcesoCierrePeriodoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				procesocierreperiodo.setid_ejercicio(ejercicioAux.getId());
				procesocierreperiodo.setejercicio_descripcion(ProcesoCierrePeriodoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				procesocierreperiodo.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(ProcesoCierrePeriodo procesocierreperiodo,JComboBox jComboBoxid_periodoProcesoCierrePeriodoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoProcesoCierrePeriodoGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoProcesoCierrePeriodoGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				procesocierreperiodo.setid_periodo(periodoAux.getId());
				procesocierreperiodo.setperiodo_descripcion(ProcesoCierrePeriodoConstantesFunciones.getPeriodoDescripcion(periodoAux));
				procesocierreperiodo.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoPeriodoForeignKey(ProcesoCierrePeriodo procesocierreperiodo,JComboBox jComboBoxid_estado_periodoProcesoCierrePeriodoGenerico)throws Exception
	{
		try
		{
			EstadoPeriodo  estadoperiodoAux=new EstadoPeriodo();

			if(jComboBoxid_estado_periodoProcesoCierrePeriodoGenerico==null) {
				estadoperiodoAux=(EstadoPeriodo)this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.getSelectedItem();
			} else {
				estadoperiodoAux=(EstadoPeriodo)jComboBoxid_estado_periodoProcesoCierrePeriodoGenerico.getSelectedItem();
			}

			if(estadoperiodoAux!=null && estadoperiodoAux.getId()!=null) {
				procesocierreperiodo.setid_estado_periodo(estadoperiodoAux.getId());
				procesocierreperiodo.setestadoperiodo_descripcion(ProcesoCierrePeriodoConstantesFunciones.getEstadoPeriodoDescripcion(estadoperiodoAux));
				procesocierreperiodo.setEstadoPeriodo(estadoperiodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { 
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { 
					}

					if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodoPorEstado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.addItem(ejercicio);
							}
						}

						if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { 
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { 
					}

					if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodoPorEstado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.addItem(periodo);
							}
						}

						if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoPeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { 
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.removeAllItems();

							for(EstadoPeriodo estadoperiodo:this.estadoperiodosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.addItem(estadoperiodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { 
					}

					if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodoPorEstado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.removeAllItems();

							for(EstadoPeriodo estadoperiodo:this.estadoperiodosForeignKey) {
								this.jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.addItem(estadoperiodo);
							}
						}

						if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoPeriodoForeignKey(EstadoPeriodo estadoperiodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.setSelectedItem(estadoperiodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedItem(estadoperiodo);
						} else {
							this.jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCierrePeriodo() throws Exception {
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
		
	public ProcesoCierrePeriodoParameterReturnGeneral getProcesoCierrePeriodoParameterGeneral() {
		return this.procesocierreperiodoParameterGeneral;
	}
	
	public void setProcesoCierrePeriodoParameterGeneral(ProcesoCierrePeriodoParameterReturnGeneral procesocierreperiodoParameterGeneral) {
		this.procesocierreperiodoParameterGeneral = procesocierreperiodoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCierrePeriodo() {
		return isPermisoTodoProcesoCierrePeriodo;
	}

	public void setIsPermisoTodoProcesoCierrePeriodo(Boolean isPermisoTodoProcesoCierrePeriodo) {
		this.isPermisoTodoProcesoCierrePeriodo = isPermisoTodoProcesoCierrePeriodo;
	}

	public Boolean getIsPermisoNuevoProcesoCierrePeriodo() {
		return isPermisoNuevoProcesoCierrePeriodo;
	}

	public void setIsPermisoNuevoProcesoCierrePeriodo(Boolean isPermisoNuevoProcesoCierrePeriodo) {
		this.isPermisoNuevoProcesoCierrePeriodo = isPermisoNuevoProcesoCierrePeriodo;
	}

	public Boolean getIsPermisoActualizarProcesoCierrePeriodo() {
		return isPermisoActualizarProcesoCierrePeriodo;
	}

	public void setIsPermisoActualizarProcesoCierrePeriodo(Boolean isPermisoActualizarProcesoCierrePeriodo) {
		this.isPermisoActualizarProcesoCierrePeriodo = isPermisoActualizarProcesoCierrePeriodo;
	}

	public Boolean getIsPermisoEliminarProcesoCierrePeriodo() {
		return isPermisoEliminarProcesoCierrePeriodo;
	}

	public void setIsPermisoEliminarProcesoCierrePeriodo(Boolean isPermisoEliminarProcesoCierrePeriodo) {
		this.isPermisoEliminarProcesoCierrePeriodo = isPermisoEliminarProcesoCierrePeriodo;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCierrePeriodo() {
		return isPermisoGuardarCambiosProcesoCierrePeriodo;
	}

	public void setIsPermisoGuardarCambiosProcesoCierrePeriodo(Boolean isPermisoGuardarCambiosProcesoCierrePeriodo) {
		this.isPermisoGuardarCambiosProcesoCierrePeriodo = isPermisoGuardarCambiosProcesoCierrePeriodo;
	}
	
	public Boolean getIsPermisoConsultaProcesoCierrePeriodo() {
		return isPermisoConsultaProcesoCierrePeriodo;
	}

	public void setIsPermisoConsultaProcesoCierrePeriodo(Boolean isPermisoConsultaProcesoCierrePeriodo) {
		this.isPermisoConsultaProcesoCierrePeriodo = isPermisoConsultaProcesoCierrePeriodo;
	}

	public Boolean getIsPermisoBusquedaProcesoCierrePeriodo() {
		return isPermisoBusquedaProcesoCierrePeriodo;
	}

	public void setIsPermisoBusquedaProcesoCierrePeriodo(Boolean isPermisoBusquedaProcesoCierrePeriodo) {
		this.isPermisoBusquedaProcesoCierrePeriodo = isPermisoBusquedaProcesoCierrePeriodo;
	}

	public Boolean getIsPermisoReporteProcesoCierrePeriodo() {
		return isPermisoReporteProcesoCierrePeriodo;
	}

	public void setIsPermisoReporteProcesoCierrePeriodo(Boolean isPermisoReporteProcesoCierrePeriodo) {
		this.isPermisoReporteProcesoCierrePeriodo = isPermisoReporteProcesoCierrePeriodo;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCierrePeriodo() {
		return isPermisoPaginacionMedioProcesoCierrePeriodo;
	}

	public void setIsPermisoPaginacionMedioProcesoCierrePeriodo(Boolean isPermisoPaginacionMedioProcesoCierrePeriodo) {
		this.isPermisoPaginacionMedioProcesoCierrePeriodo = isPermisoPaginacionMedioProcesoCierrePeriodo;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCierrePeriodo() {
		return isPermisoPaginacionTodoProcesoCierrePeriodo;
	}

	public void setIsPermisoPaginacionTodoProcesoCierrePeriodo(Boolean isPermisoPaginacionTodoProcesoCierrePeriodo) {
		this.isPermisoPaginacionTodoProcesoCierrePeriodo = isPermisoPaginacionTodoProcesoCierrePeriodo;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCierrePeriodo() {
		return isPermisoPaginacionAltoProcesoCierrePeriodo;
	}

	public void setIsPermisoPaginacionAltoProcesoCierrePeriodo(Boolean isPermisoPaginacionAltoProcesoCierrePeriodo) {
		this.isPermisoPaginacionAltoProcesoCierrePeriodo = isPermisoPaginacionAltoProcesoCierrePeriodo;
	}
	
	public Boolean getIsPermisoCopiarProcesoCierrePeriodo() {
		return isPermisoCopiarProcesoCierrePeriodo;
	}

	public void setIsPermisoCopiarProcesoCierrePeriodo(Boolean isPermisoCopiarProcesoCierrePeriodo) {
		this.isPermisoCopiarProcesoCierrePeriodo = isPermisoCopiarProcesoCierrePeriodo;
	}
	
	public Boolean getIsPermisoVerFormProcesoCierrePeriodo() {
		return isPermisoVerFormProcesoCierrePeriodo;
	}

	public void setIsPermisoVerFormProcesoCierrePeriodo(Boolean isPermisoVerFormProcesoCierrePeriodo) {
		this.isPermisoVerFormProcesoCierrePeriodo = isPermisoVerFormProcesoCierrePeriodo;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCierrePeriodo() {
		return isPermisoDuplicarProcesoCierrePeriodo;
	}

	public void setIsPermisoDuplicarProcesoCierrePeriodo(Boolean isPermisoDuplicarProcesoCierrePeriodo) {
		this.isPermisoDuplicarProcesoCierrePeriodo = isPermisoDuplicarProcesoCierrePeriodo;
	}
	
	public Boolean getIsPermisoOrdenProcesoCierrePeriodo() {
		return isPermisoOrdenProcesoCierrePeriodo;
	}

	public void setIsPermisoOrdenProcesoCierrePeriodo(Boolean isPermisoOrdenProcesoCierrePeriodo) {
		this.isPermisoOrdenProcesoCierrePeriodo = isPermisoOrdenProcesoCierrePeriodo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCierrePeriodo() {
		return isVisibilidadCeldaNuevoProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCierrePeriodo(Boolean isVisibilidadCeldaNuevoProcesoCierrePeriodo) {
		this.isVisibilidadCeldaNuevoProcesoCierrePeriodo = isVisibilidadCeldaNuevoProcesoCierrePeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCierrePeriodo() {
		return isVisibilidadCeldaDuplicarProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCierrePeriodo(Boolean isVisibilidadCeldaDuplicarProcesoCierrePeriodo) {
		this.isVisibilidadCeldaDuplicarProcesoCierrePeriodo = isVisibilidadCeldaDuplicarProcesoCierrePeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCierrePeriodo() {
		return isVisibilidadCeldaCopiarProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCierrePeriodo(Boolean isVisibilidadCeldaCopiarProcesoCierrePeriodo) {
		this.isVisibilidadCeldaCopiarProcesoCierrePeriodo = isVisibilidadCeldaCopiarProcesoCierrePeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCierrePeriodo() {
		return isVisibilidadCeldaVerFormProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCierrePeriodo(Boolean isVisibilidadCeldaVerFormProcesoCierrePeriodo) {
		this.isVisibilidadCeldaVerFormProcesoCierrePeriodo = isVisibilidadCeldaVerFormProcesoCierrePeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCierrePeriodo() {
		return isVisibilidadCeldaOrdenProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCierrePeriodo(Boolean isVisibilidadCeldaOrdenProcesoCierrePeriodo) {
		this.isVisibilidadCeldaOrdenProcesoCierrePeriodo = isVisibilidadCeldaOrdenProcesoCierrePeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo = isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCierrePeriodo() {
		return isVisibilidadCeldaModificarProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaModificarProcesoCierrePeriodo(Boolean isVisibilidadCeldaModificarProcesoCierrePeriodo) {
		this.isVisibilidadCeldaModificarProcesoCierrePeriodo = isVisibilidadCeldaModificarProcesoCierrePeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCierrePeriodo() {
		return isVisibilidadCeldaActualizarProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCierrePeriodo(Boolean isVisibilidadCeldaActualizarProcesoCierrePeriodo) {
		this.isVisibilidadCeldaActualizarProcesoCierrePeriodo = isVisibilidadCeldaActualizarProcesoCierrePeriodo;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCierrePeriodo() {
		return isVisibilidadCeldaEliminarProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCierrePeriodo(Boolean isVisibilidadCeldaEliminarProcesoCierrePeriodo) {
		this.isVisibilidadCeldaEliminarProcesoCierrePeriodo = isVisibilidadCeldaEliminarProcesoCierrePeriodo;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCierrePeriodo() {
		return isVisibilidadCeldaCancelarProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCierrePeriodo(Boolean isVisibilidadCeldaCancelarProcesoCierrePeriodo) {
		this.isVisibilidadCeldaCancelarProcesoCierrePeriodo = isVisibilidadCeldaCancelarProcesoCierrePeriodo;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCierrePeriodo() {
		return isVisibilidadCeldaGuardarProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCierrePeriodo(Boolean isVisibilidadCeldaGuardarProcesoCierrePeriodo) {
		this.isVisibilidadCeldaGuardarProcesoCierrePeriodo = isVisibilidadCeldaGuardarProcesoCierrePeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo() {
		return isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo(Boolean isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo = isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo;
	}
		
	public ProcesoCierrePeriodoSessionBean getprocesocierreperiodoSessionBean() {
		return this.procesocierreperiodoSessionBean;
	}
	
	public void setprocesocierreperiodoSessionBean(ProcesoCierrePeriodoSessionBean procesocierreperiodoSessionBean) {
		this.procesocierreperiodoSessionBean=procesocierreperiodoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado() {
		return this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado;
	}

	public void setisVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado(Boolean isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado) {
		this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado=isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo)throws Exception {
		try {
			
				this.setActualParaGuardarEjercicioForeignKey(procesocierreperiodo,null);
				this.setActualParaGuardarPeriodoForeignKey(procesocierreperiodo,null);
				this.setActualParaGuardarEstadoPeriodoForeignKey(procesocierreperiodo,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCierrePeriodo procesocierreperiodo,ProcesoCierrePeriodo procesocierreperiodoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCierrePeriodo(procesocierreperiodo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocierreperiodoAux.setId(procesocierreperiodo.getId());
		procesocierreperiodoAux.setVersionRow(procesocierreperiodo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCierrePeriodo procesocierreperiodoLocal) throws Exception {
		
		if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCierrePeriodo procesocierreperiodoLocal) throws Exception {	
		if(this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				procesocierreperiodoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				procesocierreperiodoLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoPeriodoDetalleFormJInternalFrame.class)) {
				EstadoPeriodoBeanSwingJInternalFrame estadoperiodoBeanSwingJInternalFrameLocal=(EstadoPeriodoBeanSwingJInternalFrame) ((EstadoPeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadoperiodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoPeriodo(estadoperiodoBeanSwingJInternalFrameLocal.getestadoperiodo(),true);
				estadoperiodoBeanSwingJInternalFrameLocal.actualizarLista(estadoperiodoBeanSwingJInternalFrameLocal.estadoperiodo,this.estadoperiodosForeignKey);

				estadoperiodoBeanSwingJInternalFrameLocal.actualizarRelaciones(estadoperiodoBeanSwingJInternalFrameLocal.estadoperiodo);

				procesocierreperiodoLocal.setEstadoPeriodo(estadoperiodoBeanSwingJInternalFrameLocal.estadoperiodo);

				this.addItemDefectoCombosForeignKeyEstadoPeriodo();
				this.cargarCombosFrameEstadoPeriodosForeignKey("Formulario");
				this.setActualEstadoPeriodoForeignKey(estadoperiodoBeanSwingJInternalFrameLocal.estadoperiodo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCierrePeriodoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocierreperiodoValidator.getInvalidValues(this.procesocierreperiodo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCierrePeriodo procesocierreperiodo,List<ProcesoCierrePeriodo> procesocierreperiodos) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCierrePeriodo procesocierreperiodo,List<ProcesoCierrePeriodo> procesocierreperiodos) throws Exception {
		try	{			
			ProcesoCierrePeriodoConstantesFunciones.actualizarSelectedLista(procesocierreperiodo,procesocierreperiodos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCierrePeriodo> procesocierreperiodosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocierreperiodosLocal=this.procesocierreperiodoLogic.getProcesoCierrePeriodos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocierreperiodosLocal=this.procesocierreperiodos;
			}
			//ARCHITECTURE
		
			for(ProcesoCierrePeriodo procesocierreperiodoLocal:procesocierreperiodosLocal) {
				if(this.permiteMantenimiento(procesocierreperiodoLocal) && procesocierreperiodoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCierrePeriodoConstantesFunciones.getProcesoCierrePeriodoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoCierrePeriodoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelid_ejercicioProcesoCierrePeriodo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelid_ejercicioProcesoCierrePeriodo,"");
		
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
		this.iIdNuevoProcesoCierrePeriodo--;	
		
		
		this.procesocierreperiodoAux=new ProcesoCierrePeriodo();
		
		this.procesocierreperiodoAux.setId(this.iIdNuevoProcesoCierrePeriodo);
		this.procesocierreperiodoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierreperiodoLogic.getProcesoCierrePeriodos().add(this.procesocierreperiodoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocierreperiodos.add(this.procesocierreperiodoAux);
		}
		//ARCHITECTURE
		
		this.procesocierreperiodo=this.procesocierreperiodoAux;
		
		if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCierrePeriodo(this.procesocierreperiodo);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierrePeriodo(this.procesocierreperiodo);
		}
				
		//this.setDefaultControlesProcesoCierrePeriodo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCierrePeriodo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCierrePeriodo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierrePeriodo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodoBean,this.procesocierreperiodo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCierrePeriodo(this.procesocierreperiodoReturnGeneral,this.procesocierreperiodoBean,false);
		
		if(this.procesocierreperiodoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierrePeriodo(this.procesocierreperiodoReturnGeneral.getProcesoCierrePeriodo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCierrePeriodo(this.procesocierreperiodoReturnGeneral.getProcesoCierrePeriodo());
		}
		
		if(this.procesocierreperiodoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCierrePeriodo(this.procesocierreperiodoReturnGeneral.getProcesoCierrePeriodo(),classes);//this.procesocierreperiodoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCierrePeriodo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCierrePeriodo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.RecargarFormProcesoCierrePeriodo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCierrePeriodo(false);
						
			if(procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierrePeriodo();
			}
			
			this.actualizarVisualTableDatosProcesoCierrePeriodo();
			
			this.jTableDatosProcesoCierrePeriodo.setRowSelectionInterval(this.getIndiceNuevoProcesoCierrePeriodo(), this.getIndiceNuevoProcesoCierrePeriodo());
			
			this.seleccionarFilaTablaProcesoCierrePeriodoActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCierrePeriodo(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.setEnabled(isHabilitar && this.procesocierreperiodoConstantesFunciones.activarid_ejercicioProcesoCierrePeriodo);//
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.setEnabled(isHabilitar && this.procesocierreperiodoConstantesFunciones.activarid_periodoProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.setEnabled(isHabilitar && this.procesocierreperiodoConstantesFunciones.activarid_estado_periodoProcesoCierrePeriodo);
	};
	
	public void setDefaultControlesProcesoCierrePeriodo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCierrePeriodo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocierreperiodoSessionBean.setConGuardarRelaciones(true);			
			this.procesocierreperiodoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTabbedPaneRelacionesProcesoCierrePeriodo.setVisible(true);
			
					
		} else {
			//this.procesocierreperiodoSessionBean.setConGuardarRelaciones(false);			
			this.procesocierreperiodoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTabbedPaneRelacionesProcesoCierrePeriodo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCierrePeriodo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
				if(procesocierreperiodoAux.getId().equals(this.iIdNuevoProcesoCierrePeriodo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodos) {
				if(procesocierreperiodoAux.getId().equals(this.iIdNuevoProcesoCierrePeriodo)) {
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
	
	public int getIndiceActualProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
				if(procesocierreperiodoAux.getId().equals(procesocierreperiodo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodos) {
				if(procesocierreperiodoAux.getId().equals(procesocierreperiodo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
				if(procesocierreperiodoAux.getProcesoCierrePeriodoOriginal().getId().equals(procesocierreperiodoOriginal.getId())) {
					existe=true;
					procesocierreperiodoOriginal.setId(procesocierreperiodoAux.getId());
					procesocierreperiodoOriginal.setVersionRow(procesocierreperiodoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodos) {
				if(procesocierreperiodoAux.getProcesoCierrePeriodoOriginal().getId().equals(procesocierreperiodoOriginal.getId())) {
					existe=true;
					procesocierreperiodoOriginal.setId(procesocierreperiodoAux.getId());
					procesocierreperiodoOriginal.setVersionRow(procesocierreperiodoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCierrePeriodo(Boolean esParaCancelar) throws Exception {
		procesocierreperiodosAux=new ArrayList<ProcesoCierrePeriodo>();
		procesocierreperiodoAux=new ProcesoCierrePeriodo();
		
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
					if(procesocierreperiodoAux.getId()<0) {
						procesocierreperiodosAux.add(procesocierreperiodoAux);
					}		
				}
				this.iIdNuevoProcesoCierrePeriodo=0L;
				this.procesocierreperiodoLogic.getProcesoCierrePeriodos().removeAll(procesocierreperiodosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodos) {
					if(procesocierreperiodoAux.getId()<0) {
						procesocierreperiodosAux.add(procesocierreperiodoAux);
					}		
				}
				this.iIdNuevoProcesoCierrePeriodo=0L;
				this.procesocierreperiodos.removeAll(procesocierreperiodosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCierrePeriodo 
					&& this.procesocierreperiodoLogic.getProcesoCierrePeriodos().size()>0
					) {
					procesocierreperiodoAux=this.procesocierreperiodoLogic.getProcesoCierrePeriodos().get(this.procesocierreperiodoLogic.getProcesoCierrePeriodos().size() - 1);
				
					if(procesocierreperiodoAux.getId()<0) {
						this.procesocierreperiodoLogic.getProcesoCierrePeriodos().remove(procesocierreperiodoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCierrePeriodo && this.procesocierreperiodos.size()>0) {
					procesocierreperiodoAux=this.procesocierreperiodos.get(this.procesocierreperiodos.size() - 1);
				
					if(procesocierreperiodoAux.getId()<0) {
						this.procesocierreperiodos.remove(procesocierreperiodoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCierrePeriodo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocierreperiodo.getId()<0) {
				this.procesocierreperiodoLogic.getProcesoCierrePeriodos().remove(this.procesocierreperiodo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocierreperiodo.getId()<0) {
				this.procesocierreperiodos.remove(this.procesocierreperiodo);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCierrePeriodo(List<ProcesoCierrePeriodo> procesocierreperiodosAux) throws Exception {
		ProcesoCierrePeriodoConstantesFunciones.setEstadosInicialesProcesoCierrePeriodo(procesocierreperiodosAux);
	}
	
	public void setEstadosInicialesProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodoAux) throws Exception {
		ProcesoCierrePeriodoConstantesFunciones.setEstadosInicialesProcesoCierrePeriodo(procesocierreperiodoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCierrePeriodoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCierrePeriodoActual()) {
				if(!this.isEsNuevoProcesoCierrePeriodo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCierrePeriodo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCierrePeriodoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cierre Periodo Mensual ?", "MANTENIMIENTO DE Cierre Periodo Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCierrePeriodo procesocierreperiodo) throws Exception {
		ProcesoCierrePeriodoConstantesFunciones.seleccionarAsignar(this.procesocierreperiodo,procesocierreperiodo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCierrePeriodo=this.isPermisoActualizarOriginalProcesoCierrePeriodo;
			
			
			this.seleccionarAsignar(procesocierreperiodo);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocierreperiodoSessionBean.setsFuncionBusquedaRapida(this.procesocierreperiodoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCierrePeriodo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCierrePeriodo(esParaCancelar);				
				this.cancelarNuevoProcesoCierrePeriodo(esParaCancelar);								
			}
			
			this.procesocierreperiodo=new ProcesoCierrePeriodo();
			
			this.inicializarProcesoCierrePeriodo();
			
			this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCierrePeriodo() throws Exception {
		try {
			ProcesoCierrePeriodoConstantesFunciones.inicializarProcesoCierrePeriodo(this.procesocierreperiodo);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocierreperiodoLogic.getProcesoCierrePeriodos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCierrePeriodos(String sAccionBusqueda,List<ProcesoCierrePeriodo> procesocierreperiodosParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCierrePeriodo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCierrePeriodoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCierrePeriodoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCierrePeriodo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cierre Periodo Mensuales");		
		parameters.put("busquedapor", ProcesoCierrePeriodoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCierrePeriodo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCierrePeriodo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCierrePeriodoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCierrePeriodoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCierrePeriodoBean.TraerProcesoCierrePeriodoBeans(procesocierreperiodosParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCierrePeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocierreperiodosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCierrePeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocierreperiodosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodoActionPerformed(null);
					//this.generarExcelReporteProcesoCierrePeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocierreperiodosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCierrePeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocierreperiodosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCierrePeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocierreperiodosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCierrePeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocierreperiodosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCierrePeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierrePeriodo> procesocierreperiodosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreperiodo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierrePeriodos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierrePeriodo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCierrePeriodo procesocierreperiodo : procesocierreperiodosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCierrePeriodoConstantesFunciones.generarExcelReporteDataProcesoCierrePeriodo("NORMAL",row,workbook,procesocierreperiodo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Periodo Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCierrePeriodo(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCierrePeriodoConstantesFunciones.generarExcelReporteHeaderProcesoCierrePeriodo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCierrePeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierrePeriodo> procesocierreperiodosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreperiodo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierrePeriodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCierrePeriodo procesocierreperiodo : procesocierreperiodosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.getProcesoCierrePeriodoDescripcion(procesocierreperiodo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierreperiodo.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierreperiodo.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierreperiodo.getestadoperiodo_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Periodo Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCierrePeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierrePeriodo> procesocierreperiodosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCierrePeriodo> procesocierreperiodosRespaldo=null;
		
		classes=ProcesoCierrePeriodoConstantesFunciones.getClassesRelationshipsOfProcesoCierrePeriodo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocierreperiodoLogic.setDatosCliente(this.datosCliente);
		this.procesocierreperiodoLogic.setDatosDeep(this.datosDeep);
		this.procesocierreperiodoLogic.setIsConDeep(true);
		
		procesocierreperiodosRespaldo=this.procesocierreperiodoLogic.getProcesoCierrePeriodos();
		
		this.procesocierreperiodoLogic.setProcesoCierrePeriodos(procesocierreperiodosParaReportes);	
		this.procesocierreperiodoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocierreperiodosParaReportes=this.procesocierreperiodoLogic.getProcesoCierrePeriodos();
		this.procesocierreperiodoLogic.setProcesoCierrePeriodos(procesocierreperiodosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreperiodo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierrePeriodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierrePeriodo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCierrePeriodo procesocierreperiodo : procesocierreperiodosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCierrePeriodo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCierrePeriodoConstantesFunciones.generarExcelReporteDataProcesoCierrePeriodo("NORMAL",row,workbook,procesocierreperiodo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.getProcesoCierrePeriodoDescripcion(procesocierreperiodo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Periodo Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCierrePeriodo() throws Exception {		
		this.startProcessProcesoCierrePeriodo(true);
	}
	
	public void startProcessProcesoCierrePeriodo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCierrePeriodo ,this.jPanelParametrosReportesProcesoCierrePeriodo, this.jScrollPanelDatosProcesoCierrePeriodo,this.jPanelPaginacionProcesoCierrePeriodo, this.jScrollPanelDatosEdicionProcesoCierrePeriodo, this.jPanelAccionesProcesoCierrePeriodo,this.jPanelAccionesFormularioProcesoCierrePeriodo,this.jmenuBarProcesoCierrePeriodo,this.jmenuBarDetalleProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,this.jTtoolBarDetalleProcesoCierrePeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierrePeriodo=this.jTabbedPaneBusquedasProcesoCierrePeriodo; 
		
		final JPanel jPanelParametrosReportesProcesoCierrePeriodo=this.jPanelParametrosReportesProcesoCierrePeriodo;
		//final JScrollPane jScrollPanelDatosProcesoCierrePeriodo=this.jScrollPanelDatosProcesoCierrePeriodo;
		final JTable jTableDatosProcesoCierrePeriodo=this.jTableDatosProcesoCierrePeriodo;		
		final JPanel jPanelPaginacionProcesoCierrePeriodo=this.jPanelPaginacionProcesoCierrePeriodo;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierrePeriodo=this.jScrollPanelDatosEdicionProcesoCierrePeriodo;
		final JPanel jPanelAccionesProcesoCierrePeriodo=this.jPanelAccionesProcesoCierrePeriodo;
		
		JPanel jPanelCamposAuxiliarProcesoCierrePeriodo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierrePeriodo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			jPanelCamposAuxiliarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jPanelCamposProcesoCierrePeriodo;
			jPanelAccionesFormularioAuxiliarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jPanelAccionesFormularioProcesoCierrePeriodo;
		}
		
		final JPanel jPanelCamposProcesoCierrePeriodo=jPanelCamposAuxiliarProcesoCierrePeriodo;
		final JPanel jPanelAccionesFormularioProcesoCierrePeriodo=jPanelAccionesFormularioAuxiliarProcesoCierrePeriodo;
		
		
		final JMenuBar jmenuBarProcesoCierrePeriodo=this.jmenuBarProcesoCierrePeriodo;
		final JToolBar jTtoolBarProcesoCierrePeriodo=this.jTtoolBarProcesoCierrePeriodo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierrePeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierrePeriodo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			jmenuBarDetalleAuxiliarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jmenuBarDetalleProcesoCierrePeriodo;
			jTtoolBarDetalleAuxiliarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTtoolBarDetalleProcesoCierrePeriodo;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierrePeriodo=jmenuBarDetalleAuxiliarProcesoCierrePeriodo;
		final JToolBar jTtoolBarDetalleProcesoCierrePeriodo=jTtoolBarDetalleAuxiliarProcesoCierrePeriodo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierrePeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierrePeriodo;
			processRunnable.jTableDatos=jTableDatosProcesoCierrePeriodo;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierrePeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierrePeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierrePeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierrePeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierrePeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierrePeriodo;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierrePeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierrePeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierrePeriodo ,jPanelParametrosReportesProcesoCierrePeriodo,jTableDatosProcesoCierrePeriodo, /*jScrollPanelDatosProcesoCierrePeriodo,*/jPanelCamposProcesoCierrePeriodo,jPanelPaginacionProcesoCierrePeriodo, /*jScrollPanelDatosEdicionProcesoCierrePeriodo,*/ jPanelAccionesProcesoCierrePeriodo,jPanelAccionesFormularioProcesoCierrePeriodo,jmenuBarProcesoCierrePeriodo,jmenuBarDetalleProcesoCierrePeriodo,jTtoolBarProcesoCierrePeriodo,jTtoolBarDetalleProcesoCierrePeriodo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierrePeriodo ,jPanelParametrosReportesProcesoCierrePeriodo, jScrollPanelDatosProcesoCierrePeriodo,jPanelPaginacionProcesoCierrePeriodo, jScrollPanelDatosEdicionProcesoCierrePeriodo, jPanelAccionesProcesoCierrePeriodo,jPanelAccionesFormularioProcesoCierrePeriodo,jmenuBarProcesoCierrePeriodo,jmenuBarDetalleProcesoCierrePeriodo,jTtoolBarProcesoCierrePeriodo,jTtoolBarDetalleProcesoCierrePeriodo);
						
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
	
	public void finishProcessProcesoCierrePeriodo() {// throws Exception 
		this.finishProcessProcesoCierrePeriodo(true);
	}
	
	public void finishProcessProcesoCierrePeriodo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCierrePeriodo ,this.jPanelParametrosReportesProcesoCierrePeriodo, this.jScrollPanelDatosProcesoCierrePeriodo,this.jPanelPaginacionProcesoCierrePeriodo, this.jScrollPanelDatosEdicionProcesoCierrePeriodo, this.jPanelAccionesProcesoCierrePeriodo,this.jPanelAccionesFormularioProcesoCierrePeriodo,this.jmenuBarProcesoCierrePeriodo,this.jmenuBarDetalleProcesoCierrePeriodo,this.jTtoolBarProcesoCierrePeriodo,this.jTtoolBarDetalleProcesoCierrePeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierrePeriodo=this.jTabbedPaneBusquedasProcesoCierrePeriodo; 
		
		final JPanel jPanelParametrosReportesProcesoCierrePeriodo=this.jPanelParametrosReportesProcesoCierrePeriodo;
		//final JScrollPane jScrollPanelDatosProcesoCierrePeriodo=this.jScrollPanelDatosProcesoCierrePeriodo;
		final JTable jTableDatosProcesoCierrePeriodo=this.jTableDatosProcesoCierrePeriodo;		
		final JPanel jPanelPaginacionProcesoCierrePeriodo=this.jPanelPaginacionProcesoCierrePeriodo;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierrePeriodo=this.jScrollPanelDatosEdicionProcesoCierrePeriodo;
		final JPanel jPanelAccionesProcesoCierrePeriodo=this.jPanelAccionesProcesoCierrePeriodo;
		
		JPanel jPanelCamposAuxiliarProcesoCierrePeriodo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierrePeriodo=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			jPanelCamposAuxiliarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jPanelCamposProcesoCierrePeriodo;
			jPanelAccionesFormularioAuxiliarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jPanelAccionesFormularioProcesoCierrePeriodo;
		}
		
		final JPanel jPanelCamposProcesoCierrePeriodo=jPanelCamposAuxiliarProcesoCierrePeriodo;
		final JPanel jPanelAccionesFormularioProcesoCierrePeriodo=jPanelAccionesFormularioAuxiliarProcesoCierrePeriodo;
		
		
		final JMenuBar jmenuBarProcesoCierrePeriodo=this.jmenuBarProcesoCierrePeriodo;		
		final JToolBar jTtoolBarProcesoCierrePeriodo=this.jTtoolBarProcesoCierrePeriodo;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierrePeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierrePeriodo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			jmenuBarDetalleAuxiliarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jmenuBarDetalleProcesoCierrePeriodo;
			jTtoolBarDetalleAuxiliarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTtoolBarDetalleProcesoCierrePeriodo;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierrePeriodo=jmenuBarDetalleAuxiliarProcesoCierrePeriodo;
		final JToolBar jTtoolBarDetalleProcesoCierrePeriodo=jTtoolBarDetalleAuxiliarProcesoCierrePeriodo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierrePeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierrePeriodo;
			processRunnable.jTableDatos=jTableDatosProcesoCierrePeriodo;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierrePeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierrePeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierrePeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierrePeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierrePeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierrePeriodo;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierrePeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierrePeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCierrePeriodo ,jPanelParametrosReportesProcesoCierrePeriodo, jTableDatosProcesoCierrePeriodo,/*jScrollPanelDatosProcesoCierrePeriodo,*/jPanelCamposProcesoCierrePeriodo,jPanelPaginacionProcesoCierrePeriodo, /*jScrollPanelDatosEdicionProcesoCierrePeriodo,*/ jPanelAccionesProcesoCierrePeriodo,jPanelAccionesFormularioProcesoCierrePeriodo,jmenuBarProcesoCierrePeriodo,jmenuBarDetalleProcesoCierrePeriodo,jTtoolBarProcesoCierrePeriodo,jTtoolBarDetalleProcesoCierrePeriodo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCierrePeriodo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCierrePeriodo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCierrePeriodo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCierrePeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCierrePeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCierrePeriodo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCierrePeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCierrePeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCierrePeriodo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocierreperiodoConstantesFunciones.getsFinalQueryProcesoCierrePeriodo();
		String  finalQueryPaginacionTodos=this.procesocierreperiodoConstantesFunciones.getsFinalQueryProcesoCierrePeriodo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCierrePeriodoConstantesFunciones.getArrayColumnasGlobalesNoProcesoCierrePeriodo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCierrePeriodoConstantesFunciones.getArrayColumnasGlobalesProcesoCierrePeriodo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCierrePeriodoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocierreperiodosEliminados= new ArrayList<ProcesoCierrePeriodo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCierrePeriodo();
		
				///*ProcesoCierrePeriodoSessionBean*/this.procesocierreperiodoSessionBean=new ProcesoCierrePeriodoSessionBean();
			
			if(this.procesocierreperiodoSessionBean==null) {
				this.procesocierreperiodoSessionBean=new ProcesoCierrePeriodoSessionBean();
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
					this.iNumeroPaginacion=ProcesoCierrePeriodoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCierrePeriodoConstantesFunciones.getClassesForeignKeysOfProcesoCierrePeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocierreperiodo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocierreperiodosAux= new ArrayList<ProcesoCierrePeriodo>();
			
				
			procesocierreperiodoLogic.setDatosCliente(this.datosCliente);
			procesocierreperiodoLogic.setDatosDeep(this.datosDeep);
			procesocierreperiodoLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodoPorEstado")) {
				this.sDetalleReporte=ProcesoCierrePeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodoPorEstado(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocierreperiodoLogic.getProcesoCierrePeriodosBusquedaPorIdEjercicioPorIdPeriodoPorEstado(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierrePeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodoPorEstado(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierrePeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodoPorEstado(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocierreperiodoLogic.getProcesoCierrePeriodos()==null||procesocierreperiodoLogic.getProcesoCierrePeriodos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocierreperiodos==null|| procesocierreperiodos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreperiodosAux=new ArrayList<ProcesoCierrePeriodo>();
						procesocierreperiodosAux.addAll(procesocierreperiodoLogic.getProcesoCierrePeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierreperiodosAux=new ArrayList<ProcesoCierrePeriodo>();
							procesocierreperiodosAux.addAll(procesocierreperiodos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocierreperiodoLogic.getProcesoCierrePeriodosBusquedaPorIdEjercicioPorIdPeriodoPorEstado(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierrePeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodoPorEstado(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierrePeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodoPorEstado(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado,id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCierrePeriodos("BusquedaPorIdEjercicioPorIdPeriodoPorEstado",procesocierreperiodoLogic.getProcesoCierrePeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCierrePeriodos("BusquedaPorIdEjercicioPorIdPeriodoPorEstado",procesocierreperiodos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreperiodoLogic.setProcesoCierrePeriodos(new ArrayList<ProcesoCierrePeriodo>());
						procesocierreperiodoLogic.getProcesoCierrePeriodos().addAll(procesocierreperiodosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierreperiodos=new ArrayList<ProcesoCierrePeriodo>();
							procesocierreperiodos.addAll(procesocierreperiodosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCierrePeriodo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCierrePeriodo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierreperiodoLogic.getProcesoCierrePeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierreperiodos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierreperiodoLogic.getProcesoCierrePeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierreperiodos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCierrePeriodo procesocierreperiodo) {
		Boolean permite=true;
		
		if(this.procesocierreperiodo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCierrePeriodoConstantesFunciones.getOrderByListaProcesoCierrePeriodo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCierrePeriodoConstantesFunciones.getOrderByListaProcesoCierrePeriodo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierrePeriodo procesocierreperiodo:procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
				if(procesocierreperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreperiodoTotales=procesocierreperiodo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierrePeriodo procesocierreperiodo:this.procesocierreperiodos) {
				if(procesocierreperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreperiodoTotales=procesocierreperiodo;
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
			this.procesocierreperiodoAux=new ProcesoCierrePeriodo();
			this.procesocierreperiodoAux.setsType(Constantes2.S_TOTALES);
			this.procesocierreperiodoAux.setIsNew(false);
			this.procesocierreperiodoAux.setIsChanged(false);
			this.procesocierreperiodoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCierrePeriodoConstantesFunciones.TotalizarValoresFilaProcesoCierrePeriodo(this.procesocierreperiodoLogic.getProcesoCierrePeriodos(),this.procesocierreperiodoAux);
				
				//this.procesocierreperiodoLogic.getProcesoCierrePeriodos().add(this.procesocierreperiodoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCierrePeriodoConstantesFunciones.TotalizarValoresFilaProcesoCierrePeriodo(this.procesocierreperiodos,this.procesocierreperiodoAux);
				
				this.procesocierreperiodos.add(this.procesocierreperiodoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocierreperiodoTotales=new ProcesoCierrePeriodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierreperiodoLogic.getProcesoCierrePeriodos().remove(procesocierreperiodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierreperiodos.remove(procesocierreperiodoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocierreperiodoTotales=new ProcesoCierrePeriodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierrePeriodo procesocierreperiodo:procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
				if(procesocierreperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreperiodoTotales=procesocierreperiodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierrePeriodoConstantesFunciones.TotalizarValoresFilaProcesoCierrePeriodo(this.procesocierreperiodoLogic.getProcesoCierrePeriodos(),procesocierreperiodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierrePeriodo procesocierreperiodo:this.procesocierreperiodos) {
				if(procesocierreperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreperiodoTotales=procesocierreperiodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierrePeriodoConstantesFunciones.TotalizarValoresFilaProcesoCierrePeriodo(this.procesocierreperiodos,procesocierreperiodoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCierrePeriodosBusquedaPorIdEjercicioPorIdPeriodoPorEstado()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdEjercicioPorIdPeriodoPorEstado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCierrePeriodosBusquedaPorIdEjercicioPorIdPeriodoPorEstado(String sFinalQuery,Long id_ejercicio,Long id_periodo,Long id_estado_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierreperiodoLogic.getProcesoCierrePeriodosBusquedaPorIdEjercicioPorIdPeriodoPorEstado(sFinalQuery,this.pagination,id_ejercicio,id_periodo,id_estado_periodo);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosProcesoCierrePeriodo() {
		this.isPermisoTodoProcesoCierrePeriodo=false;
		this.isPermisoNuevoProcesoCierrePeriodo=false;
		this.isPermisoActualizarProcesoCierrePeriodo=false;
		this.isPermisoActualizarOriginalProcesoCierrePeriodo=false;
		this.isPermisoEliminarProcesoCierrePeriodo=false;
		this.isPermisoGuardarCambiosProcesoCierrePeriodo=false;
		this.isPermisoConsultaProcesoCierrePeriodo=true;
		this.isPermisoBusquedaProcesoCierrePeriodo=true;
		this.isPermisoReporteProcesoCierrePeriodo=true;
		this.isPermisoOrdenProcesoCierrePeriodo=false;		
		this.isPermisoPaginacionMedioProcesoCierrePeriodo=false;		
		this.isPermisoPaginacionAltoProcesoCierrePeriodo=false;		
		this.isPermisoPaginacionTodoProcesoCierrePeriodo=false;		
		this.isPermisoCopiarProcesoCierrePeriodo=false;		
		this.isPermisoVerFormProcesoCierrePeriodo=false;		
		this.isPermisoDuplicarProcesoCierrePeriodo=false;
		this.isPermisoOrdenProcesoCierrePeriodo=false;
	}
	
	public void setPermisosUsuarioProcesoCierrePeriodo(Boolean isPermiso) {
		this.isPermisoTodoProcesoCierrePeriodo=isPermiso;
		this.isPermisoNuevoProcesoCierrePeriodo=isPermiso;
		this.isPermisoActualizarProcesoCierrePeriodo=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierrePeriodo=isPermiso;
		this.isPermisoEliminarProcesoCierrePeriodo=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierrePeriodo=isPermiso;
		this.isPermisoConsultaProcesoCierrePeriodo=isPermiso;
		this.isPermisoBusquedaProcesoCierrePeriodo=isPermiso;
		this.isPermisoReporteProcesoCierrePeriodo=isPermiso;
		this.isPermisoOrdenProcesoCierrePeriodo=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCierrePeriodo=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCierrePeriodo=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCierrePeriodo=isPermiso;		
		this.isPermisoCopiarProcesoCierrePeriodo=isPermiso;		
		this.isPermisoVerFormProcesoCierrePeriodo=isPermiso;		
		this.isPermisoDuplicarProcesoCierrePeriodo=isPermiso;
		this.isPermisoOrdenProcesoCierrePeriodo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCierrePeriodo(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCierrePeriodo=isPermiso;
		this.isPermisoNuevoProcesoCierrePeriodo=isPermiso;
		this.isPermisoActualizarProcesoCierrePeriodo=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierrePeriodo=isPermiso;
		this.isPermisoEliminarProcesoCierrePeriodo=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierrePeriodo=isPermiso;
		//this.isPermisoConsultaProcesoCierrePeriodo=isPermiso;
		//this.isPermisoBusquedaProcesoCierrePeriodo=isPermiso;
		//this.isPermisoReporteProcesoCierrePeriodo=isPermiso;
		//this.isPermisoOrdenProcesoCierrePeriodo=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCierrePeriodo=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCierrePeriodo=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCierrePeriodo=isPermiso;		
		//this.isPermisoCopiarProcesoCierrePeriodo=isPermiso;		
		//this.isPermisoDuplicarProcesoCierrePeriodo=isPermiso;
		//this.isPermisoOrdenProcesoCierrePeriodo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierrePeriodoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCierrePeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCierrePeriodo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierrePeriodoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCierrePeriodoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCierrePeriodoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCierrePeriodoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCierrePeriodo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCierrePeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCierrePeriodoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCierrePeriodo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCierrePeriodo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCierrePeriodo=this.isPermisoActualizarProcesoCierrePeriodo;
			this.isPermisoEliminarProcesoCierrePeriodo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCierrePeriodo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCierrePeriodo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCierrePeriodo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCierrePeriodo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCierrePeriodo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierrePeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCierrePeriodo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCierrePeriodo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCierrePeriodo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCierrePeriodo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCierrePeriodo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCierrePeriodo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierrePeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCierrePeriodo.setToolTipText(this.jTableDatosProcesoCierrePeriodo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCierrePeriodo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCierrePeriodo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCierrePeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCierrePeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCierrePeriodo() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCierrePeriodoListas()throws Exception {
		try	{						
			
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.estadoperiodosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCierrePeriodoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCierrePeriodoJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadoperiodosForeignKey==null||this.estadoperiodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoPeriodoConstantesFunciones.getArrayColumnasGlobalesEstadoPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoPeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoPeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCierrePeriodo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyEstadoPeriodo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {
			if(this.procesocierreperiodoSessionBean==null) {
				this.procesocierreperiodoSessionBean=new ProcesoCierrePeriodoSessionBean();
			}

			if(!this.procesocierreperiodoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.procesocierreperiodoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoPeriodo()throws Exception {
		try {

			if(!this.procesocierreperiodoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPeriodo()) {
				EstadoPeriodo estadoperiodo=new EstadoPeriodo();
				EstadoPeriodoConstantesFunciones.setEstadoPeriodoDescripcion(estadoperiodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadoperiodo.setId(null);

				if(!EstadoPeriodoConstantesFunciones.ExisteEnLista(this.estadoperiodosForeignKey,estadoperiodo,true)) {

					this.estadoperiodosForeignKey.add(0,estadoperiodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierrePeriodo()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEjercicio("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierrePeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEjercicio(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyEjercicio(JComboBox jComboBoxEjercicioGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Ejercicio ejercicioLocal=(Ejercicio)jComboBoxEjercicioGenerico.getSelectedItem();

			if(ejercicioLocal!=null  && ejercicioLocal.getId()!=null  && ejercicioLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_ejercicio="+ejercicioLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboPeriodo=sFinalQueryCombo;

			this.periodosForeignKey=new ArrayList<Periodo>();
			this.cargarCombosForeignKeyPeriodo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyEjercicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.addItemListener(new ComboBoxItemListener(this,"id_ejercicioProcesoCierrePeriodo"));
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioProcesoCierrePeriodo"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.addActionListener(new ComboBoxActionListener(this,"id_ejercicioProcesoCierrePeriodo"));
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioProcesoCierrePeriodo"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo"));

						this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo"));

					} else {
						this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo"));

						this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProcesoCierrePeriodo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierrePeriodo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCierrePeriodo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierrePeriodo()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCierrePeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCierrePeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCierrePeriodo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCierrePeriodo()throws Exception {
		try {
			

			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameEstadoPeriodosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCierrePeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoPeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCierrePeriodo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo!=null && this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo!=null && this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo!=null && this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormProcesoCierrePeriodoEjercicio(JComboBox<?> jComboBoxGenericoEjercicio,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProcesoCierrePeriodoid_periodo(jComboBoxGenericoEjercicio,sFormularioTipoBusqueda,"Ejercicio",false);
	}




	
	



	public void recargarFormProcesoCierrePeriodoid_periodo(JComboBox<?> jComboBoxGenericoPeriodo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Ejercicio")){
				this.setActualParaGuardarEjercicioForeignKey(this.procesocierreperiodo,jComboBoxGenericoPeriodo);
			}

			if(this.procesocierreperiodo.getid_ejercicio()!=null && this.procesocierreperiodo.getid_ejercicio()!=0L) {
				sFinalQuery+="  WHERE  id_ejercicio="+this.procesocierreperiodo.getid_ejercicio();
			} else {
				sFinalQuery+="  WHERE  id_ejercicio=-1";
			}



			//BUCLE RECURSIVO
			this.setActualPeriodoForeignKey(this.procesocierreperiodo.getid_ejercicio(),true,sFormularioTipoBusqueda);

			this.cargarCombosPeriodosForeignKeyLista(sFinalQuery);

			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProcesoCierrePeriodoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCierrePeriodoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCierrePeriodoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocierreperiodoSessionBean=new ProcesoCierrePeriodoSessionBean(); 
		this.procesocierreperiodoConstantesFunciones=new ProcesoCierrePeriodoConstantesFunciones(); 
		this.procesocierreperiodoBean=new ProcesoCierrePeriodo();//(this.procesocierreperiodoConstantesFunciones); 		
		this.procesocierreperiodoReturnGeneral=new ProcesoCierrePeriodoParameterReturnGeneral(); 
		
		this.procesocierreperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierreperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCierrePeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCierrePeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCierrePeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCierrePeriodo(true);
			
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
			
			this.procesocierreperiodoConstantesFunciones=new ProcesoCierrePeriodoConstantesFunciones(); 
			this.procesocierreperiodoBean=new ProcesoCierrePeriodo();//this.procesocierreperiodoConstantesFunciones); 			
			this.procesocierreperiodoReturnGeneral=new ProcesoCierrePeriodoParameterReturnGeneral(); 
		
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cierre Periodo Mensual Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesocierreperiodo=new ProcesoCierrePeriodo();
			this.procesocierreperiodos = new ArrayList<ProcesoCierrePeriodo>();
			this.procesocierreperiodosAux = new ArrayList<ProcesoCierrePeriodo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic=new ProcesoCierrePeriodoLogic();
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocierreperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocierreperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCierrePeriodo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierrePeriodo);	
					}
					
					if(this.jInternalFrameImportacionProcesoCierrePeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierrePeriodo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCierrePeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCierrePeriodo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierrePeriodo);
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo);
					this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCierrePeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierrePeriodo);
					this.jInternalFrameImportacionProcesoCierrePeriodo.setVisible(false);
					this.jInternalFrameImportacionProcesoCierrePeriodo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCierrePeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierrePeriodo);
					this.jInternalFrameOrderByProcesoCierrePeriodo.setVisible(false);
					this.jInternalFrameOrderByProcesoCierrePeriodo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCierrePeriodoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCierrePeriodoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocierreperiodoReturnGeneral=new ProcesoCierrePeriodoParameterReturnGeneral();
			
			this.procesocierreperiodoParameterGeneral=new ProcesoCierrePeriodoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocierreperiodoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCierrePeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierrePeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierreperiodoSessionBean.getEsGuardarRelacionado(),this.procesocierreperiodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierrePeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierreperiodoSessionBean.getEsGuardarRelacionado(),this.procesocierreperiodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaDuplicarProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaCopiarProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaVerFormProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaOrdenProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=false;
			
			
			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCierrePeriodo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCierrePeriodo(false);
			
			this.setPermisosUsuarioProcesoCierrePeriodo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocierreperiodoSessionBean.getEsGuardarRelacionado() && this.procesocierreperiodoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCierrePeriodoClasesRelacionadas();
			}
			
			if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCierrePeriodoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCierrePeriodo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCierrePeriodo();
			}
			
			if(!this.isPermisoBusquedaProcesoCierrePeriodo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCierrePeriodoConstantesFunciones.getTiposSeleccionarProcesoCierrePeriodo());
				
				this.tiposColumnasSelect=ProcesoCierrePeriodoConstantesFunciones.getTiposSeleccionarProcesoCierrePeriodo(true);
				
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
			//if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCierrePeriodo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoCierrePeriodo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoCierrePeriodo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierrePeriodo() ;
			
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
			
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.estadoperiodoLogic=new EstadoPeriodoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocierreperiodoImplementable= (ProcesoCierrePeriodoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierrePeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocierreperiodoImplementableHome= (ProcesoCierrePeriodoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierrePeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocierreperiodos= new ArrayList<ProcesoCierrePeriodo>();
			this.procesocierreperiodosEliminados= new ArrayList<ProcesoCierrePeriodo>();
						
			this.isEsNuevoProcesoCierrePeriodo=false;
			this.esParaAccionDesdeFormularioProcesoCierrePeriodo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.estadoperiodosForeignKey=new ArrayList<EstadoPeriodo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCierrePeriodo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCierrePeriodo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCierrePeriodoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCierrePeriodo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCierrePeriodo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCierrePeriodo();
			}
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCierrePeriodo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCierrePeriodo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCierrePeriodo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCierrePeriodo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCierrePeriodo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCierrePeriodo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCierrePeriodo")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTabbedPaneRelacionesProcesoCierrePeriodo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTabbedPaneRelacionesProcesoCierrePeriodo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCierrePeriodo();	
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
	
	public void cargarCombosForeignKeyProcesoCierrePeriodo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCierrePeriodo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCierrePeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCierrePeriodoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCierrePeriodo();
		
		this.cargarCombosFrameForeignKeyProcesoCierrePeriodo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCierrePeriodo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCierrePeriodo();
		}
	}
	
	

	public void cargarCombosForeignKeyPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyEjercicio("Todos");
				}

			this.recargarComboTablaPeriodo(this.periodosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoPeriodo();
				this.cargarCombosFrameEstadoPeriodosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyEjercicio("Todos");
				}

			this.recargarComboTablaEstadoPeriodo(this.estadoperiodosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoCierrePeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
			
			if(jTableDatosProcesoCierrePeriodo.getRowCount()>=1) {
				jTableDatosProcesoCierrePeriodo.removeRowSelectionInterval(0, jTableDatosProcesoCierrePeriodo.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCierrePeriodo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCierrePeriodo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCierrePeriodo(true);			
			//this.procesocierreperiodo=new ProcesoCierrePeriodo();
			//this.procesocierreperiodo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierrePeriodo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierrePeriodo() ;
			
			if(ProcesoCierrePeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierrePeriodo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocierreperiodo);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);				
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
			if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCierrePeriodo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCierrePeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCierrePeriodo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCierrePeriodo.getSelectedRows().length;			
			}
			
			procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCierrePeriodo--;			
				//ProcesoCierrePeriodo procesocierreperiodoAux= new ProcesoCierrePeriodo();			
				//procesocierreperiodoAux.setId(this.iIdNuevoProcesoCierrePeriodo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCierrePeriodo procesocierreperiodoOrigen=new ProcesoCierrePeriodo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCierrePeriodo procesocierreperiodoOrigen : procesocierreperiodosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocierreperiodoOrigen =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierreperiodoOrigen =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCierrePeriodo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocierreperiodo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCierrePeriodo(procesocierreperiodoOrigen,this.procesocierreperiodo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierreperiodoLogic.getProcesoCierrePeriodos().add(this.procesocierreperiodoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierreperiodos.add(this.procesocierreperiodoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
				
				this.jTableDatosProcesoCierrePeriodo.setRowSelectionInterval(this.getIndiceNuevoProcesoCierrePeriodo(), this.getIndiceNuevoProcesoCierrePeriodo());
				
				int iLastRow =  this.jTableDatosProcesoCierrePeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierrePeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierrePeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();									
		
			ProcesoCierrePeriodo procesocierreperiodoOrigen=new ProcesoCierrePeriodo();
			ProcesoCierrePeriodo procesocierreperiodoDestino=new ProcesoCierrePeriodo();
				
			procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCierrePeriodo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocierreperiodosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCierrePeriodo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreperiodoOrigen =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierreperiodoOrigen =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreperiodoDestino =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierreperiodoDestino =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocierreperiodoOrigen =procesocierreperiodosSeleccionados.get(0);
				procesocierreperiodoDestino =procesocierreperiodosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCierrePeriodo(procesocierreperiodoOrigen,procesocierreperiodoDestino,true,false);
				
				procesocierreperiodoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocierreperiodoDestino,procesocierreperiodoLogic.getProcesoCierrePeriodos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocierreperiodoDestino,procesocierreperiodos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
				
				//this.jTableDatosProcesoCierrePeriodo.setRowSelectionInterval(this.getIndiceNuevoProcesoCierrePeriodo(), this.getIndiceNuevoProcesoCierrePeriodo());
				
				int iLastRow =  this.jTableDatosProcesoCierrePeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierrePeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierrePeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCierrePeriodo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCierrePeriodo.setVisible(!isVisible);
			this.jPanelAccionesProcesoCierrePeriodo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCierrePeriodo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCierrePeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCierrePeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCierrePeriodo();
			
			this.abrirFrameOrderByProcesoCierrePeriodo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCierrePeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCierrePeriodo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierrePeriodo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCierrePeriodo.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCierrePeriodo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCierrePeriodo.setSize(this.jInternalFrameDetalleFormProcesoCierrePeriodo.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCierrePeriodo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCierrePeriodo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCierrePeriodo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCierrePeriodo.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jContentPaneDetalleProcesoCierrePeriodo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTabbedPaneRelacionesProcesoCierrePeriodo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jContentPaneDetalleProcesoCierrePeriodo.getWidth(),ProcesoCierrePeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTabbedPaneRelacionesProcesoCierrePeriodo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jContentPaneDetalleProcesoCierrePeriodo.getWidth(),ProcesoCierrePeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTabbedPaneRelacionesProcesoCierrePeriodo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jContentPaneDetalleProcesoCierrePeriodo.getWidth(),ProcesoCierrePeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCierrePeriodo.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCierrePeriodo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCierrePeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCierrePeriodo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCierrePeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierrePeriodo,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCierrePeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierrePeriodo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierrePeriodo);
				this.jInternalFrameOrderByProcesoCierrePeriodo.setVisible(false);
				this.jInternalFrameOrderByProcesoCierrePeriodo.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCierrePeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierrePeriodo"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCierrePeriodo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCierrePeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCierrePeriodo==null) {
				
				this.jInternalFrameImportacionProcesoCierrePeriodo=new ImportacionJInternalFrame(ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierrePeriodo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierrePeriodo);
				this.jInternalFrameImportacionProcesoCierrePeriodo.setVisible(false);
				this.jInternalFrameImportacionProcesoCierrePeriodo.setSelected(false);


				this.jInternalFrameImportacionProcesoCierrePeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierrePeriodo"));
				this.jInternalFrameImportacionProcesoCierrePeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierrePeriodo"));
				this.jInternalFrameImportacionProcesoCierrePeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierrePeriodo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCierrePeriodo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo==null) {
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo=new ReporteDinamicoJInternalFrame(ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierrePeriodo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo);
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierrePeriodo"));
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierrePeriodo"));
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierrePeriodo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierrePeriodo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCierrePeriodo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierrePeriodo);
			
	       	this.jInternalFrameDetalleFormProcesoCierrePeriodo.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCierrePeriodo.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCierrePeriodo.dispose();
			//this.jInternalFrameDetalleFormProcesoCierrePeriodo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCierrePeriodo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCierrePeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCierrePeriodo.setVisible(true);
	        this.jInternalFrameImportacionProcesoCierrePeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCierrePeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCierrePeriodo.setVisible(true);
	        this.jInternalFrameOrderByProcesoCierrePeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCierrePeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCierrePeriodo.setVisible(false);
	        this.jInternalFrameOrderByProcesoCierrePeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCierrePeriodo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCierrePeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCierrePeriodo.setVisible(false);
	        this.jInternalFrameImportacionProcesoCierrePeriodo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCierrePeriodo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCierrePeriodo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCierrePeriodo(true);
			//this.isEsNuevoProcesoCierrePeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierrePeriodo(false) ;
			
			if(procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCierrePeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierrePeriodo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierrePeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCierrePeriodoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCierrePeriodo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCierrePeriodo(true);
			//this.isEsNuevoProcesoCierrePeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocierreperiodo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCierrePeriodo(false) ;
			
			if(ProcesoCierrePeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierrePeriodo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierrePeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaPeriodo(List<Periodo> periodosForeignKey)throws Exception{
		TableColumn tableColumnPeriodo=this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierrePeriodo,ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO));
		TableCellEditor tableCellEditorPeriodo =tableColumnPeriodo.getCellEditor();

		PeriodoTableCell periodoTableCellFk=(PeriodoTableCell)tableCellEditorPeriodo;

		if(periodoTableCellFk!=null) {
			periodoTableCellFk.setperiodosForeignKey(periodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierrePeriodo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periodoTableCellFk.setRowActual(intSelectedRow);
			//periodoTableCellFk.setperiodosForeignKeyActual(periodosForeignKey);
		//}


		if(periodoTableCellFk!=null) {
			periodoTableCellFk.RecargarPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoPeriodo(List<EstadoPeriodo> estadoperiodosForeignKey)throws Exception{
		TableColumn tableColumnEstadoPeriodo=this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierrePeriodo,ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO));
		TableCellEditor tableCellEditorEstadoPeriodo =tableColumnEstadoPeriodo.getCellEditor();

		EstadoPeriodoTableCell estadoperiodoTableCellFk=(EstadoPeriodoTableCell)tableCellEditorEstadoPeriodo;

		if(estadoperiodoTableCellFk!=null) {
			estadoperiodoTableCellFk.setestadoperiodosForeignKey(estadoperiodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierrePeriodo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadoperiodoTableCellFk.setRowActual(intSelectedRow);
			//estadoperiodoTableCellFk.setestadoperiodosForeignKeyActual(estadoperiodosForeignKey);
		//}


		if(estadoperiodoTableCellFk!=null) {
			estadoperiodoTableCellFk.RecargarEstadoPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierrePeriodo(false);
			
			//if(!this.isEsNuevoProcesoCierrePeriodo) {								
				int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
				
			}
			
			if(this.permiteMantenimiento(this.procesocierreperiodo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCierrePeriodo=true;
					this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
					this.isEsNuevoProcesoCierrePeriodo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCierrePeriodo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCierrePeriodo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierrePeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierrePeriodo(false);
				
				this.habilitarDeshabilitarControlesProcesoCierrePeriodo(false);
			
												
				
				if(ProcesoCierrePeriodoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCierrePeriodo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,procesocierreperiodoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCierrePeriodo(this.procesocierreperiodo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCierrePeriodo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocierreperiodoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocierreperiodo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				this.procesocierreperiodo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				this.procesocierreperiodo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocierreperiodo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCierrePeriodoModel) this.jTableDatosProcesoCierrePeriodo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCierrePeriodo=true;
				this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
				this.isEsNuevoProcesoCierrePeriodo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierrePeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierrePeriodo(false);
				
				this.habilitarDeshabilitarControlesProcesoCierrePeriodo(false);
				
				
				
				if(ProcesoCierrePeriodoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCierrePeriodo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCierrePeriodo.getRowCount()>=1) {
				jTableDatosProcesoCierrePeriodo.removeRowSelectionInterval(0, jTableDatosProcesoCierrePeriodo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCierrePeriodo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierrePeriodo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierrePeriodo(false) ;
			
			this.isEsNuevoProcesoCierrePeriodo=false;
			
			if(ProcesoCierrePeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCierrePeriodo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCierrePeriodo(false);
				
				//SI ES MANUAL
				if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCierrePeriodo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCierrePeriodo--;			
			//ProcesoCierrePeriodo procesocierreperiodoAux= new ProcesoCierrePeriodo();			
			//procesocierreperiodoAux.setId(this.iIdNuevoProcesoCierrePeriodo);
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCierrePeriodo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
			
			this.procesocierreperiodo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocierreperiodoLogic.getProcesoCierrePeriodos().add(this.procesocierreperiodoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocierreperiodos.add(this.procesocierreperiodoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
			
			this.jTableDatosProcesoCierrePeriodo.setRowSelectionInterval(this.getIndiceNuevoProcesoCierrePeriodo(), this.getIndiceNuevoProcesoCierrePeriodo());
			
			int iLastRow =  this.jTableDatosProcesoCierrePeriodo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCierrePeriodo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCierrePeriodo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCierrePeriodo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierrePeriodo(false);
			
			//SI ES MANUAL
			if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierrePeriodo();
			}
			
			//this.abrirFrameTreeProcesoCierrePeriodo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCierrePeriodo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCierrePeriodo.setFileImportacion(this.jInternalFrameImportacionProcesoCierrePeriodo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCierrePeriodo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCierrePeriodo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCierrePeriodo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCierrePeriodo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();		

		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCierrePeriodoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCierrePeriodoBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCierrePeriodos("Todos",procesocierreperiodosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Periodo Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();		
		
		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreperiodo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCierrePeriodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ProcesoCierrePeriodo procesocierreperiodo:procesocierreperiodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierreperiodo.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(ProcesoCierrePeriodo procesocierreperiodo:procesocierreperiodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierreperiodo.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO);
					iRow++;

					for(ProcesoCierrePeriodo procesocierreperiodo:procesocierreperiodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierreperiodo.getestadoperiodo_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesoCierrePeriodo(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCierrePeriodo(procesocierreperiodoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Periodo Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoCierrePeriodo(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierrePeriodo(false);
			
			//SI ES MANUAL
			if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierrePeriodo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierrePeriodo(false);
			
			//SI ES MANUAL
			if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierrePeriodo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierrePeriodo(false);
			
			//SI ES MANUAL
			if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierrePeriodo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCierrePeriodo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCierrePeriodo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCierrePeriodo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCierrePeriodo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCierrePeriodo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCierrePeriodo.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCierrePeriodo.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCierrePeriodo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCierrePeriodo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCierrePeriodo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCierrePeriodo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCierrePeriodo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCierrePeriodo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCierrePeriodo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierrePeriodo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierrePeriodo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCierrePeriodo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCierrePeriodo();
		
		this.inicializarActualizarBindingBotonesManualProcesoCierrePeriodo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierrePeriodo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierrePeriodo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierrePeriodo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierrePeriodo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCierrePeriodo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCierrePeriodo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jCheckBoxPostAccionNuevoProcesoCierrePeriodo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jCheckBoxPostAccionSinCerrarProcesoCierrePeriodo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jCheckBoxPostAccionSinMensajeProcesoCierrePeriodo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCierrePeriodo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCierrePeriodo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.jCheckBoxPostAccionNuevoProcesoCierrePeriodo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.jCheckBoxPostAccionSinCerrarProcesoCierrePeriodo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.jCheckBoxPostAccionSinMensajeProcesoCierrePeriodo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCierrePeriodo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCierrePeriodo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCierrePeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCierrePeriodo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCierrePeriodo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCierrePeriodo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCierrePeriodo(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierrePeriodo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierrePeriodo() throws Exception {
		try	{
			if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierrePeriodo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierrePeriodo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierrePeriodo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCierrePeriodo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCierrePeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCierrePeriodo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCierrePeriodo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCierrePeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCierrePeriodo.addItem(reporte);
			}
			
			
			if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCierrePeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCierrePeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCierrePeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCierrePeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCierrePeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCierrePeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierrePeriodo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierrePeriodo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCierrePeriodo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.getSelectedItem()!=null){this.id_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstado=((Ejercicio)this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.getSelectedItem()!=null){this.id_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado=((Periodo)this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.getSelectedItem()!=null){this.id_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstado=((EstadoPeriodo)this.jComboBoxid_estado_periodoBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCierrePeriodo(Boolean esInicializar) throws Exception {				
		if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierrePeriodo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCierrePeriodo() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCierrePeriodo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCierrePeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCierrePeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCierrePeriodoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierrePeriodoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCierrePeriodoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCierrePeriodoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCierrePeriodo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocierreperiodoLogic.getProcesoCierrePeriodos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocierreperiodos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCierrePeriodo.setModel(new ProcesoCierrePeriodoModel(this.procesocierreperiodoLogic.getProcesoCierrePeriodos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCierrePeriodo.setModel(new ProcesoCierrePeriodoModel(this.procesocierreperiodos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCierrePeriodo!=null && this.jInternalFrameOrderByProcesoCierrePeriodo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCierrePeriodo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierrePeriodo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCierrePeriodoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO,procesocierreperiodoConstantesFunciones.resaltarSeleccionarProcesoCierrePeriodo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCierrePeriodoConstantesFunciones.SCLASSWEBTITULO,procesocierreperiodoConstantesFunciones.resaltarSeleccionarProcesoCierrePeriodo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierrePeriodo,ProcesoCierrePeriodoConstantesFunciones.LABEL_ID));

		if(this.procesocierreperiodoConstantesFunciones.mostraridProcesoCierrePeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierrePeriodoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocierreperiodoConstantesFunciones.resaltaridProcesoCierrePeriodo,this.procesocierreperiodoConstantesFunciones.activaridProcesoCierrePeriodo,this,true,"idProcesoCierrePeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocierreperiodoConstantesFunciones.resaltaridProcesoCierrePeriodo,this.procesocierreperiodoConstantesFunciones.activaridProcesoCierrePeriodo,this,true,"idProcesoCierrePeriodo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierrePeriodo,ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.procesocierreperiodoConstantesFunciones.mostrarid_ejercicioProcesoCierrePeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.procesocierreperiodoConstantesFunciones.resaltarid_ejercicioProcesoCierrePeriodo,this,this.procesocierreperiodoConstantesFunciones.activarid_ejercicioProcesoCierrePeriodo));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.procesocierreperiodoConstantesFunciones.resaltarid_ejercicioProcesoCierrePeriodo,this,this.procesocierreperiodoConstantesFunciones.activarid_ejercicioProcesoCierrePeriodo,false,"id_ejercicioProcesoCierrePeriodo","GLOBAL-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierrePeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierrePeriodo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierrePeriodo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCierrePeriodo.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCierrePeriodo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCierrePeriodo.moveColumn(this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCierrePeriodo.moveColumn(this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCierrePeriodo.moveColumn(this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCierrePeriodo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCierrePeriodo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCierrePeriodo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCierrePeriodo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCierrePeriodo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCierrePeriodo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocierreperiodoLogic.getProcesoCierrePeriodos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocierreperiodos.size()-1;
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
		//this.jTableDatosProcesoCierrePeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCierrePeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCierrePeriodo();
			
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
				
				//this.isEsNuevoProcesoCierrePeriodo=false;
					
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
				if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierrePeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierrePeriodo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocierreperiodo.getsType().equals("DUPLICADO")
				   || this.procesocierreperiodo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCierrePeriodo=true;
				
				} else {
					this.isEsNuevoProcesoCierrePeriodo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocierreperiodo.getId()>=0 && !this.procesocierreperiodo.getIsNew()) {						
						this.isEsNuevoProcesoCierrePeriodo=false;
						
					} else {
						this.isEsNuevoProcesoCierrePeriodo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCierrePeriodo(esRelaciones);						
				
				this.seleccionarProcesoCierrePeriodo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocierreperiodo.getId()<0) {
					this.isEsNuevoProcesoCierrePeriodo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCierrePeriodo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCierrePeriodo(evt,rowIndex);
				}	
				
				if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCierrePeriodo: " + this.dDif); 
					}
				}								
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCierrePeriodo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocierreperiodo)) {
					if(this.procesocierreperiodo.getId()>0) {
						this.procesocierreperiodo.setIsDeleted(true);
						
						this.procesocierreperiodosEliminados.add(this.procesocierreperiodo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierreperiodoLogic.getProcesoCierrePeriodos().remove(this.procesocierreperiodo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierreperiodos.remove(this.procesocierreperiodo);				
					}
					
					
					((ProcesoCierrePeriodoModel) this.jTableDatosProcesoCierrePeriodo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCierrePeriodo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCierrePeriodo) {
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierrePeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierrePeriodo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCierrePeriodo(this.procesocierreperiodo);
				}
				
				//ARCHITECTURE
				try {
					

					//Ejercicio
					if(!this.procesocierreperiodoConstantesFunciones.cargarid_ejercicioProcesoCierrePeriodo || this.procesocierreperiodoConstantesFunciones.event_dependid_ejercicioProcesoCierrePeriodo) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.procesocierreperiodo.getid_ejercicio());
									//this.inicializarActualizarBindingProcesoCierrePeriodo(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(procesocierreperiodo.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(procesocierreperiodo.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.procesocierreperiodo.getid_ejercicio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCierrePeriodo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCierrePeriodo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierrePeriodo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCierrePeriodo(procesocierreperiodo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCierrePeriodo(procesocierreperiodo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCierrePeriodo(procesocierreperiodo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierrePeriodo(procesocierreperiodo);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.setText(procesocierreperiodo.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCierrePeriodo procesocierreperiodoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocierreperiodoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCierrePeriodo procesocierreperiodoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocierreperiodoLocal=this.procesocierreperiodo;
			} else {
				procesocierreperiodoLocal=this.procesocierreperiodoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocierreperiodoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCierrePeriodo(procesocierreperiodoLocal,true);
					
					if(procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocierreperiodoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocierreperiodoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(procesocierreperiodo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(procesocierreperiodo);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(procesocierreperiodo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.getText()==null || this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.getText()=="" || this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.setText("0");
			}

			if(conColumnasBase) {procesocierreperiodo.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCierrePeriodoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelIdProcesoCierrePeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodoBean,ProcesoCierrePeriodo procesocierreperiodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodoOrigen,ProcesoCierrePeriodo procesocierreperiodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierreperiodoOrigen.getId()!=null && !procesocierreperiodoOrigen.getId().equals(0L))) {procesocierreperiodo.setId(procesocierreperiodoOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.setText(procesocierreperiodo.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierrePeriodo(ProcesoCierrePeriodoBean procesocierreperiodoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.setText(procesocierreperiodoBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCierrePeriodo(ProcesoCierrePeriodoParameterReturnGeneral procesocierreperiodoReturnGeneral,ProcesoCierrePeriodoBean procesocierreperiodoBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCierrePeriodo procesocierreperiodoLocal=new ProcesoCierrePeriodo();
			
			procesocierreperiodoLocal=procesocierreperiodoReturnGeneral.getProcesoCierrePeriodo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierreperiodoLocal.getId()!=null && !procesocierreperiodoLocal.getId().equals(0L))) {procesocierreperiodoBean.setId(procesocierreperiodoLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCierrePeriodoGenerico(Long idProcesoCierrePeriodoSeleccionado,JComboBox jComboBoxProcesoCierrePeriodo,List<ProcesoCierrePeriodo> procesocierreperiodosLocal)throws Exception {
		try {
			ProcesoCierrePeriodo  procesocierreperiodoTemp=null;

			for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodosLocal) {
				if(procesocierreperiodoAux.getId()!=null && procesocierreperiodoAux.getId().equals(idProcesoCierrePeriodoSeleccionado)) {
					procesocierreperiodoTemp=procesocierreperiodoAux;
					break;
				}
			}

			jComboBoxProcesoCierrePeriodo.setSelectedItem(procesocierreperiodoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCierrePeriodoGenerico(JComboBox jComboBoxProcesoCierrePeriodo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierrePeriodo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCierrePeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierrePeriodo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCierrePeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCierrePeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCierrePeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierreperiodo=(ProcesoCierrePeriodo) procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierreperiodo =(ProcesoCierrePeriodo) procesocierreperiodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!procesocierreperiodo.getIsNew() && !procesocierreperiodo.getIsChanged() && !procesocierreperiodo.getIsDeleted()) {
				sDescripcion=procesocierreperiodo.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierreperiodo.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!procesocierreperiodo.getIsNew() && !procesocierreperiodo.getIsChanged() && !procesocierreperiodo.getIsDeleted()) {
				sDescripcion=procesocierreperiodo.getperiodo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=procesocierreperiodo.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("EstadoPeriodo")) {
			//sDescripcion=this.getActualEstadoPeriodoForeignKeyDescripcion((Long)value);
			if(!procesocierreperiodo.getIsNew() && !procesocierreperiodo.getIsChanged() && !procesocierreperiodo.getIsDeleted()) {
				sDescripcion=procesocierreperiodo.getestadoperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierreperiodo.getestadoperiodo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCierrePeriodo procesocierreperiodoRow=new ProcesoCierrePeriodo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierreperiodoRow=(ProcesoCierrePeriodo) procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierreperiodoRow=(ProcesoCierrePeriodo) procesocierreperiodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCierrePeriodo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCierrePeriodo && this.isPermisoNuevoProcesoCierrePeriodo));			
			this.jButtonDuplicarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierrePeriodo && this.isPermisoDuplicarProcesoCierrePeriodo));			
			this.jButtonCopiarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaCopiarProcesoCierrePeriodo && this.isPermisoCopiarProcesoCierrePeriodo));
			this.jButtonVerFormProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaVerFormProcesoCierrePeriodo && this.isPermisoVerFormProcesoCierrePeriodo));
			
			this.jButtonAbrirOrderByProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCierrePeriodo && this.isPermisoOrdenProcesoCierrePeriodo));			
			
			this.jButtonNuevoRelacionesProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo && this.isPermisoNuevoProcesoCierrePeriodo));			
			this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCierrePeriodo && this.isPermisoNuevoProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonModificarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaModificarProcesoCierrePeriodo && this.isPermisoActualizarProcesoCierrePeriodo));	
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaActualizarProcesoCierrePeriodo && this.isPermisoActualizarProcesoCierrePeriodo));	
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaEliminarProcesoCierrePeriodo && this.isPermisoEliminarProcesoCierrePeriodo));
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarProcesoCierrePeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCierrePeriodo);							
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaGuardarProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCierrePeriodo && this.isPermisoNuevoProcesoCierrePeriodo));						
			this.jButtonDuplicarToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierrePeriodo && this.isPermisoDuplicarProcesoCierrePeriodo));						
			this.jButtonCopiarToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaCopiarProcesoCierrePeriodo && this.isPermisoCopiarProcesoCierrePeriodo));			
			this.jButtonVerFormToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaVerFormProcesoCierrePeriodo && this.isPermisoVerFormProcesoCierrePeriodo));			
			this.jButtonAbrirOrderByToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCierrePeriodo && this.isPermisoOrdenProcesoCierrePeriodo));
			this.jButtonNuevoRelacionesToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo && this.isPermisoNuevoProcesoCierrePeriodo));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCierrePeriodo && this.isPermisoNuevoProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));			
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonModificarToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaModificarProcesoCierrePeriodo && this.isPermisoActualizarProcesoCierrePeriodo));	
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaActualizarProcesoCierrePeriodo  && this.isPermisoActualizarProcesoCierrePeriodo));	
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaEliminarProcesoCierrePeriodo && this.isPermisoEliminarProcesoCierrePeriodo));
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarToolBarProcesoCierrePeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCierrePeriodo);				
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaGuardarProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCierrePeriodo && this.isPermisoNuevoProcesoCierrePeriodo));			
			this.jMenuItemDuplicarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierrePeriodo && this.isPermisoDuplicarProcesoCierrePeriodo));			
			this.jMenuItemCopiarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaCopiarProcesoCierrePeriodo && this.isPermisoCopiarProcesoCierrePeriodo));			
			this.jMenuItemVerFormProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaVerFormProcesoCierrePeriodo && this.isPermisoVerFormProcesoCierrePeriodo));			
			this.jMenuItemAbrirOrderByProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCierrePeriodo && this.isPermisoOrdenProcesoCierrePeriodo));			
			//this.jMenuItemMostrarOcultarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCierrePeriodo && this.isPermisoOrdenProcesoCierrePeriodo));
			this.jMenuItemDetalleAbrirOrderByProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCierrePeriodo && this.isPermisoOrdenProcesoCierrePeriodo));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCierrePeriodo && this.isPermisoOrdenProcesoCierrePeriodo));			
			this.jMenuItemNuevoRelacionesProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo && this.isPermisoNuevoProcesoCierrePeriodo));			
			this.jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCierrePeriodo && this.isPermisoNuevoProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));									
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemModificarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaModificarProcesoCierrePeriodo && this.isPermisoActualizarProcesoCierrePeriodo));	
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemActualizarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaActualizarProcesoCierrePeriodo && this.isPermisoActualizarProcesoCierrePeriodo));	
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemEliminarProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaEliminarProcesoCierrePeriodo && this.isPermisoEliminarProcesoCierrePeriodo));
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemCancelarProcesoCierrePeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCierrePeriodo);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaGuardarProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));						
			this.jMenuItemGuardarCambiosTablaProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=this.jButtonNuevoProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCierrePeriodo=this.jButtonDuplicarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCierrePeriodo=this.jButtonCopiarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCierrePeriodo=this.jButtonVerFormProcesoCierrePeriodo.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCierrePeriodo=this.jButtonAbrirOrderByProcesoCierrePeriodo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=this.jButtonNuevoRelacionesProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=this.jButtonModificarProcesoCierrePeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosProcesoCierrePeriodo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=this.jButtonNuevoToolBarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=this.jButtonNuevoRelacionesToolBarProcesoCierrePeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonModificarToolBarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarToolBarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarToolBarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarToolBarProcesoCierrePeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=this.jButtonGuardarCambiosToolBarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=this.jButtonGuardarCambiosTablaToolBarProcesoCierrePeriodo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=this.jMenuItemNuevoProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=this.jMenuItemNuevoRelacionesProcesoCierrePeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemModificarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemActualizarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemEliminarProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemCancelarProcesoCierrePeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=this.jMenuItemGuardarCambiosProcesoCierrePeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=this.jMenuItemGuardarCambiosTablaProcesoCierrePeriodo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCierrePeriodo(Boolean esInicializar) {
		if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierrePeriodo();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCierrePeriodo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCierrePeriodo() {
		this.jButtonNuevoProcesoCierrePeriodo.setVisible(this.isPermisoNuevoProcesoCierrePeriodo);			
		this.jButtonDuplicarProcesoCierrePeriodo.setVisible(this.isPermisoDuplicarProcesoCierrePeriodo);			
		this.jButtonCopiarProcesoCierrePeriodo.setVisible(this.isPermisoCopiarProcesoCierrePeriodo);			
		this.jButtonVerFormProcesoCierrePeriodo.setVisible(this.isPermisoVerFormProcesoCierrePeriodo);			
		
		this.jButtonAbrirOrderByProcesoCierrePeriodo.setVisible(this.isPermisoOrdenProcesoCierrePeriodo);					
		
		this.jButtonNuevoRelacionesProcesoCierrePeriodo.setVisible(this.isPermisoNuevoProcesoCierrePeriodo);			
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonModificarProcesoCierrePeriodo.setVisible(this.isPermisoActualizarProcesoCierrePeriodo);	
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarProcesoCierrePeriodo.setVisible(this.isPermisoActualizarProcesoCierrePeriodo);	
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarProcesoCierrePeriodo.setVisible(this.isPermisoEliminarProcesoCierrePeriodo);
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarProcesoCierrePeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCierrePeriodo);						
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosProcesoCierrePeriodo.setVisible(this.isPermisoGuardarCambiosProcesoCierrePeriodo);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.setVisible(this.isPermisoActualizarProcesoCierrePeriodo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierrePeriodo() {
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonModificarProcesoCierrePeriodo.setVisible(this.isPermisoActualizarProcesoCierrePeriodo);	
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarProcesoCierrePeriodo.setVisible(this.isPermisoActualizarProcesoCierrePeriodo);	
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarProcesoCierrePeriodo.setVisible(this.isPermisoEliminarProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarProcesoCierrePeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCierrePeriodo);							
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosProcesoCierrePeriodo.setVisible((this.isVisibilidadCeldaGuardarProcesoCierrePeriodo && this.isPermisoGuardarCambiosProcesoCierrePeriodo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCierrePeriodo() {
		if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCierrePeriodo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCierrePeriodo() {
	}
	
	public void jTableDatosProcesoCierrePeriodoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCierrePeriodo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCierrePeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.getprocesocierreperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreperiodo==null) {
						this.procesocierreperiodo = new ProcesoCierrePeriodo();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
				}

				if(this.procesocierreperiodo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocierreperiodo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierrePeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioProcesoCierrePeriodoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebProcesoCierrePeriodo(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierrePeriodo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierrePeriodo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.getprocesocierreperiodo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.procesocierreperiodoLogic.getConnexion());

				if(this.procesocierreperiodo.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.procesocierreperiodo.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierrePeriodo=(TitledBorder)this.jScrollPanelDatosProcesoCierrePeriodo.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderProcesoCierrePeriodo.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioProcesoCierrePeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.getprocesocierreperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreperiodo==null) {
						this.procesocierreperiodo = new ProcesoCierrePeriodo();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
				}

				if(this.procesocierreperiodo.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.procesocierreperiodo.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierrePeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoProcesoCierrePeriodoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebProcesoCierrePeriodo(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierrePeriodo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierrePeriodo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.getprocesocierreperiodo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.procesocierreperiodoLogic.getConnexion());

				if(this.procesocierreperiodo.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.procesocierreperiodo.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierrePeriodo=(TitledBorder)this.jScrollPanelDatosProcesoCierrePeriodo.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderProcesoCierrePeriodo.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoProcesoCierrePeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.getprocesocierreperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreperiodo==null) {
						this.procesocierreperiodo = new ProcesoCierrePeriodo();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
				}

				if(this.procesocierreperiodo.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.procesocierreperiodo.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierrePeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_periodoProcesoCierrePeriodoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadoperiodo=true;

			idTienePermisoestadoperiodo=this.tienePermisosUsuarioEnPaginaWebProcesoCierrePeriodo(EstadoPeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierrePeriodo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierrePeriodo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.getprocesocierreperiodo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);

				this.estadoperiodoBeanSwingJInternalFrame=new EstadoPeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadoperiodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadoperiodoBeanSwingJInternalFrame.getEstadoPeriodoLogic().setConnexion(this.procesocierreperiodoLogic.getConnexion());

				if(this.procesocierreperiodo.getid_estado_periodo()!=null) {
					this.estadoperiodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadoperiodoBeanSwingJInternalFrame.setIdActual(this.procesocierreperiodo.getid_estado_periodo());
					this.estadoperiodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadoperiodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadoperiodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.estadoperiodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierrePeriodo=(TitledBorder)this.jScrollPanelDatosProcesoCierrePeriodo.getBorder();
				TitledBorder titledBorderestadoperiodo=(TitledBorder)this.estadoperiodoBeanSwingJInternalFrame.jScrollPanelDatosEstadoPeriodo.getBorder();

				titledBorderestadoperiodo.setTitle(titledBorderProcesoCierrePeriodo.getTitle() + " -> Estado Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_periodoProcesoCierrePeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.getprocesocierreperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreperiodo==null) {
						this.procesocierreperiodo = new ProcesoCierrePeriodo();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);
				}

				if(this.procesocierreperiodo.getid_estado_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_periodo = "+this.procesocierreperiodo.getid_estado_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierrePeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierrePeriodo(false,false);

			this.getProcesoCierrePeriodosBusquedaPorIdEjercicioPorIdPeriodoPorEstado();

			this.inicializarActualizarBindingProcesoCierrePeriodo(false);

			//if(ProcesoCierrePeriodoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierrePeriodo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCierrePeriodo() {
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.dispose();
			this.jInternalFrameDetalleFormProcesoCierrePeriodo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo!=null) {
			this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.dispose();
			this.jInternalFrameReporteDinamicoProcesoCierrePeriodo=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCierrePeriodo!=null) {
			this.jInternalFrameImportacionProcesoCierrePeriodo.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCierrePeriodo.dispose();
			this.jInternalFrameImportacionProcesoCierrePeriodo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCierrePeriodo();
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCierrePeriodo")) {
				jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCierrePeriodo")) {
				jButtonDuplicarProcesoCierrePeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCierrePeriodo")) {
				jButtonCopiarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCierrePeriodo")) {
				jButtonVerFormProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCierrePeriodo")) {
				jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCierrePeriodo")) {
				jButtonDuplicarProcesoCierrePeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCierrePeriodo")) {
				jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCierrePeriodo")) {
				jButtonDuplicarProcesoCierrePeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCierrePeriodo")) {
				jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCierrePeriodo")) {
				jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCierrePeriodo")) {
				jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCierrePeriodo")) {
				jButtonModificarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCierrePeriodo")) {
				jButtonModificarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCierrePeriodo")) {
				jButtonModificarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCierrePeriodo")) {
				jButtonActualizarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCierrePeriodo")) {
				jButtonActualizarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCierrePeriodo")) {
				jButtonActualizarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCierrePeriodo")) {
				jButtonEliminarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCierrePeriodo")) {
				jButtonEliminarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCierrePeriodo")) {
				jButtonEliminarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCierrePeriodo")) {
				jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCierrePeriodo")) {
				jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCierrePeriodo")) {
				jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCierrePeriodo")) {
				jButtonCerrarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCierrePeriodo")) {
				jButtonCerrarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCierrePeriodo")) {
				jButtonCerrarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCierrePeriodo")) {
				jButtonMostrarOcultarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCierrePeriodo")) {
				jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCierrePeriodo")) {
				jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCierrePeriodo")) {
				jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCierrePeriodo")) {
				jButtonCopiarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCierrePeriodo")) {
				jButtonVerFormProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCierrePeriodo")) {
				jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCierrePeriodo")) {
				jButtonCopiarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCierrePeriodo")) {
				jButtonVerFormProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierrePeriodo")) {
				jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCierrePeriodo")) {
				jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCierrePeriodo")) {
				jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCierrePeriodo")) {
				jButtonRecargarInformacionProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCierrePeriodo")) {
				jButtonRecargarInformacionProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCierrePeriodo")) {
				jButtonRecargarInformacionProcesoCierrePeriodoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCierrePeriodo")) {
				jButtonAnterioresProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCierrePeriodo")) {
				jButtonAnterioresProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCierrePeriodo")) {
				jButtonAnterioresProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCierrePeriodo")) {
				jButtonSiguientesProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCierrePeriodo")) {
				jButtonSiguientesProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCierrePeriodo")) {
				jButtonSiguientesProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCierrePeriodo") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCierrePeriodo")) {
				jButtonAbrirOrderByProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCierrePeriodo") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCierrePeriodo")) {
				jButtonMostrarOcultarProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierrePeriodo")) {
				jButtonNuevoGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCierrePeriodo")) {
				jButtonNuevoGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCierrePeriodo")) {
				jButtonNuevoGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoCierrePeriodo")) {
				jButtonProcesarInformacionProcesoCierrePeriodoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCierrePeriodo")) {
				jButtonCerrarReporteDinamicoProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCierrePeriodo")) {
				jButtonGenerarReporteDinamicoProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCierrePeriodo")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCierrePeriodo")) {
				jButtonCerrarImportacionProcesoCierrePeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCierrePeriodo")) {
				
				jButtonGenerarImportacionProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCierrePeriodo")) {
				
				jButtonAbrirImportacionProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCierrePeriodo")) {
				jComboBoxTiposAccionesProcesoCierrePeriodoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCierrePeriodo")) {
				jComboBoxTiposRelacionesProcesoCierrePeriodoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCierrePeriodo")) {
				jComboBoxTiposAccionesProcesoCierrePeriodoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCierrePeriodo")) {
				
				jComboBoxTiposSeleccionarProcesoCierrePeriodoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCierrePeriodo")) {
				jTextFieldValorCampoGeneralProcesoCierrePeriodoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCierrePeriodo")) {
				jButtonAbrirOrderByProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCierrePeriodo")) {
				jButtonAbrirOrderByProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCierrePeriodo")) {
				jButtonCerrarOrderByProcesoCierrePeriodoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierrePeriodoBusqueda")) {
				this.jButtonidProcesoCierrePeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoCierrePeriodoUpdate")) {
				this.jButtonid_ejercicioProcesoCierrePeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoCierrePeriodoBusqueda")) {
				this.jButtonid_ejercicioProcesoCierrePeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoProcesoCierrePeriodoUpdate")) {
				this.jButtonid_periodoProcesoCierrePeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoProcesoCierrePeriodoBusqueda")) {
				this.jButtonid_periodoProcesoCierrePeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_periodoProcesoCierrePeriodoUpdate")) {
				this.jButtonid_estado_periodoProcesoCierrePeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_periodoProcesoCierrePeriodoBusqueda")) {
				this.jButtonid_estado_periodoProcesoCierrePeriodoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo")) {
				this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodoActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCierrePeriodo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				


				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCierrePeriodo procesocierreperiodoLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocierreperiodoLocal=this.procesocierreperiodo;
			} else {
				procesocierreperiodoLocal=this.procesocierreperiodoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
							
				
				


				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
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
			
			


			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierrePeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
								
						
				


				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
								
				
				


				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierrePeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
							
				
				


				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
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
			
			


			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
								
				
				


				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierrePeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierrePeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCierrePeriodo")) {
					jCheckBoxSeleccionarTodosProcesoCierrePeriodoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCierrePeriodo")) {
					jCheckBoxSeleccionadosProcesoCierrePeriodoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCierrePeriodo")) {
					
				}
				
				


				
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
												
				
				


				
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierrePeriodoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
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
			
			


			if(sTipo.equals("id_ejercicioProcesoCierrePeriodo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo;
				}

				if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoCierrePeriodoConstantesFunciones.getClassesRelationshipsOfProcesoCierrePeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoCierrePeriodo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,"BusquedaPorIdEjercicioPorIdPeriodoPorEstado");
				//recargarFormProcesoCierrePeriodoEjercicio(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,"BusquedaPorIdEjercicioPorIdPeriodoPorEstado");
			}
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_ejercicioProcesoCierrePeriodo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo;
				}

				if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoCierrePeriodoConstantesFunciones.getClassesRelationshipsOfProcesoCierrePeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoCierrePeriodo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,"BusquedaPorIdEjercicioPorIdPeriodoPorEstado");
				//recargarFormProcesoCierrePeriodoEjercicio(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,"BusquedaPorIdEjercicioPorIdPeriodoPorEstado");
			}
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreperiodo);
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
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
				
				


			if(sTipo.equals("id_ejercicioProcesoCierrePeriodo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo;
				}

				if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoCierrePeriodoConstantesFunciones.getClassesRelationshipsOfProcesoCierrePeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoCierrePeriodo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,"BusquedaPorIdEjercicioPorIdPeriodoPorEstado");
				//recargarFormProcesoCierrePeriodoEjercicio(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo,"BusquedaPorIdEjercicioPorIdPeriodoPorEstado");
			}
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierrePeriodo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierrePeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierrePeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreperiodoAnterior =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCierrePeriodo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCierrePeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCierrePeriodo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocierreperiodo =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocierreperiodo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCierrePeriodo")) {
				
				}
				
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCierrePeriodo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCierrePeriodo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCierrePeriodo")) {
			
			}
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCierrePeriodo();
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCierrePeriodo")) {
				jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCierrePeriodo")) {
				jButtonDuplicarProcesoCierrePeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCierrePeriodo")) {
				jButtonCopiarProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCierrePeriodo")) {
				jButtonVerFormProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCierrePeriodo")) {
				jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCierrePeriodo")) {
				jButtonModificarProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCierrePeriodo")) {
				jButtonActualizarProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCierrePeriodo")) {
				jButtonEliminarProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierrePeriodo")) {
				jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCierrePeriodo")) {
				jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCierrePeriodo")) {
				jButtonCerrarProcesoCierrePeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCierrePeriodo")) {
				jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierrePeriodo")) {
				jButtonNuevoGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCierrePeriodo")) {
				jButtonAbrirOrderByProcesoCierrePeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCierrePeriodo")) {
				jButtonRecargarInformacionProcesoCierrePeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCierrePeriodo")) {
				jButtonAnterioresProcesoCierrePeriodoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCierrePeriodo")) {
				jButtonSiguientesProcesoCierrePeriodoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierrePeriodoBusqueda")) {
				this.jButtonidProcesoCierrePeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoCierrePeriodoUpdate")) {
				this.jButtonid_ejercicioProcesoCierrePeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoCierrePeriodoBusqueda")) {
				this.jButtonid_ejercicioProcesoCierrePeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoProcesoCierrePeriodoUpdate")) {
				this.jButtonid_periodoProcesoCierrePeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoProcesoCierrePeriodoBusqueda")) {
				this.jButtonid_periodoProcesoCierrePeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_periodoProcesoCierrePeriodoUpdate")) {
				this.jButtonid_estado_periodoProcesoCierrePeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_periodoProcesoCierrePeriodoBusqueda")) {
				this.jButtonid_estado_periodoProcesoCierrePeriodoBusquedaActionPerformed(evt);
			}
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCierrePeriodo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCierrePeriodo")) {
				closingInternalFrameProcesoCierrePeriodo();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCierrePeriodo")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCierrePeriodo = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCierrePeriodoBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierrePeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierrePeriodo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCierrePeriodoActionPerformed(null);
			}
			
			ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierreperiodo,new Object(),this.procesocierreperiodoParameterGeneral,this.procesocierreperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCierrePeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCierrePeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCierrePeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocierreperiodo)) {
			if(!esControlTabla) {
				if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);			
				}
				
				if(this.procesocierreperiodoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCierrePeriodo(this.procesocierreperiodoReturnGeneral,this.procesocierreperiodoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocierreperiodoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierrePeriodo(classes,this.procesocierreperiodoReturnGeneral,this.procesocierreperiodoBean,false);
					}
						
					if(this.procesocierreperiodoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierrePeriodo(this.procesocierreperiodoReturnGeneral.getProcesoCierrePeriodo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCierrePeriodo(this.procesocierreperiodoReturnGeneral.getProcesoCierrePeriodo());	
					}
						
					if(this.procesocierreperiodoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCierrePeriodo(this.procesocierreperiodoReturnGeneral.getProcesoCierrePeriodo(),classes);//this.procesocierreperiodoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCierrePeriodo(this.procesocierreperiodo,classes);//this.procesocierreperiodoBean);									
				}
			
				if(ProcesoCierrePeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCierrePeriodo(this.procesocierreperiodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierrePeriodo(this.procesocierreperiodo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocierreperiodoAnterior!=null) {
						this.procesocierreperiodo=this.procesocierreperiodoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocierreperiodoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocierreperiodoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocierreperiodoReturnGeneral.getProcesoCierrePeriodo(),procesocierreperiodoLogic.getProcesoCierrePeriodos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocierreperiodoReturnGeneral.getProcesoCierrePeriodo(),this.procesocierreperiodos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCierrePeriodo.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCierrePeriodo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCierrePeriodo();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCierrePeriodo() throws Exception {
		
		ProcesoCierrePeriodoModel procesocierreperiodoModel=(ProcesoCierrePeriodoModel)this.jTableDatosProcesoCierrePeriodo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierreperiodoModel.procesocierreperiodos=this.procesocierreperiodoLogic.getProcesoCierrePeriodos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocierreperiodoModel.procesocierreperiodos=this.procesocierreperiodos;
		}
		
		
		((ProcesoCierrePeriodoModel) this.jTableDatosProcesoCierrePeriodo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCierrePeriodo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocierreperiodoAnterior(),this.procesocierreperiodoLogic.getProcesoCierrePeriodos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocierreperiodoAnterior(),this.procesocierreperiodos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCierrePeriodo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
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
										
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierreperiodo,new Object(),generalEntityParameterGeneral,this.procesocierreperiodoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCierrePeriodoConstantesFunciones.getClassesRelationshipsOfProcesoCierrePeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCierrePeriodoConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCierrePeriodo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCierrePeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierreperiodo,new Object(),generalEntityParameterGeneral,this.procesocierreperiodoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCierrePeriodo(ProcesoCierrePeriodoBean procesocierreperiodoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierrePeriodo(ArrayList<Classe> classes,ProcesoCierrePeriodoReturnGeneral procesocierreperiodoReturnGeneral,ProcesoCierrePeriodoBean procesocierreperiodoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocierreperiodo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo = new ProcesoCierrePeriodoDetalleFormJInternalFrame(jDesktopPane,this.procesocierreperiodoSessionBean.getConGuardarRelaciones(),this.procesocierreperiodoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.procesocierreperiodoLogic=this.procesocierreperiodoLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCierrePeriodo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierrePeriodo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierrePeriodo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCierrePeriodo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCierrePeriodo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierrePeriodo"));
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonModificarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierrePeriodo"));

		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonModificarToolBarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierrePeriodo"));
					
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemModificarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierrePeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierrePeriodo"));
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarToolBarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierrePeriodo"));
						
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemActualizarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierrePeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierrePeriodo"));
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierrePeriodo"));
								
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemEliminarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierrePeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierrePeriodo"));
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierrePeriodo"));
					
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemCancelarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierrePeriodo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemDetalleCerrarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierrePeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierrePeriodo"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierrePeriodo"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierrePeriodo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonidProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierrePeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_ejercicioProcesoCierrePeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoCierrePeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoCierrePeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_periodoProcesoCierrePeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoCierrePeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_periodoProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoCierrePeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_estado_periodoProcesoCierrePeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_periodoProcesoCierrePeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_periodoProcesoCierrePeriodoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTabbedPaneRelacionesProcesoCierrePeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierrePeriodo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCierrePeriodo"));
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierrePeriodo"));
		}
		
		this.jTableDatosProcesoCierrePeriodo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCierrePeriodo"));
		
		this.jTableDatosProcesoCierrePeriodo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCierrePeriodo"));
		
		this.jButtonNuevoProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"NuevoProcesoCierrePeriodo"));
		
		this.jButtonDuplicarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCierrePeriodo"));
		
		this.jButtonCopiarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"CopiarProcesoCierrePeriodo"));
		
		this.jButtonVerFormProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"VerFormProcesoCierrePeriodo"));
		
		
		this.jButtonNuevoToolBarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCierrePeriodo"));
			
		this.jButtonDuplicarToolBarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCierrePeriodo"));
			
		this.jMenuItemNuevoProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCierrePeriodo"));
			
		this.jMenuItemDuplicarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCierrePeriodo"));		
		
		
		this.jButtonNuevoRelacionesProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCierrePeriodo"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCierrePeriodo"));
			
		this.jMenuItemNuevoRelacionesProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCierrePeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonModificarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierrePeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonModificarToolBarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierrePeriodo"));
			
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemModificarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierrePeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierrePeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonActualizarToolBarProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierrePeriodo"));
				
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemActualizarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierrePeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierrePeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonEliminarToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierrePeriodo"));
						
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemEliminarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierrePeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierrePeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonCancelarToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierrePeriodo"));
			
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemCancelarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierrePeriodo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCierrePeriodo"));		
		
		
		this.jButtonCerrarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"CerrarProcesoCierrePeriodo"));
		
		
		this.jButtonCerrarToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCierrePeriodo"));
			
		this.jMenuItemCerrarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCierrePeriodo"));
			
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jMenuItemDetalleCerrarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierrePeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCierrePeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierrePeriodo"));
		}
		
		this.jButtonCopiarToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCierrePeriodo"));
			
		this.jButtonVerFormToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCierrePeriodo"));
		
		this.jMenuItemGuardarCambiosProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCierrePeriodo"));
			
		this.jMenuItemCopiarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCierrePeriodo"));		
		
		this.jMenuItemVerFormProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCierrePeriodo"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierrePeriodo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCierrePeriodo"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierrePeriodo"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCierrePeriodo"));
					
		this.jButtonRecargarInformacionToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCierrePeriodo"));
		
		this.jMenuItemRecargarInformacionProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCierrePeriodo"));		
		
		
		
		this.jButtonAnterioresProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCierrePeriodo"));
		
		
		this.jButtonAnterioresToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCierrePeriodo"));
		
		this.jMenuItemAnterioresProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCierrePeriodo"));		
		
		
		this.jButtonSiguientesProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCierrePeriodo"));
		
		
		this.jButtonSiguientesToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCierrePeriodo"));
			
		this.jMenuItemSiguientesProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCierrePeriodo"));
			
		this.jMenuItemAbrirOrderByProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCierrePeriodo"));
			
		this.jMenuItemMostrarOcultarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCierrePeriodo"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCierrePeriodo"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCierrePeriodo"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCierrePeriodo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCierrePeriodo"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCierrePeriodo"));		
		
		
		this.jButtonProcesarInformacionProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoCierrePeriodo"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCierrePeriodo"));

		this.jCheckBoxSeleccionadosProcesoCierrePeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCierrePeriodo"));
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierrePeriodo"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCierrePeriodo"));
			
		this.jComboBoxTiposAccionesProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCierrePeriodo"));
					
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCierrePeriodo"));
			
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCierrePeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonidProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierrePeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_ejercicioProcesoCierrePeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoCierrePeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoCierrePeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_periodoProcesoCierrePeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoCierrePeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_periodoProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoCierrePeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_estado_periodoProcesoCierrePeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_periodoProcesoCierrePeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_periodoProcesoCierrePeriodoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCierrePeriodo!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierrePeriodo"));
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierrePeriodo"));
				this.jInternalFrameReporteDinamicoProcesoCierrePeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierrePeriodo"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierrePeriodo"));				
			//this.jButtonGenerarReporteDinamicoProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierrePeriodo"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierrePeriodo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCierrePeriodo!=null) {
				this.jInternalFrameImportacionProcesoCierrePeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierrePeriodo"));
				this.jInternalFrameImportacionProcesoCierrePeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierrePeriodo"));
				this.jInternalFrameImportacionProcesoCierrePeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierrePeriodo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCierrePeriodo"));
			
			this.jButtonAbrirOrderByToolBarProcesoCierrePeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCierrePeriodo"));			
			
			if(this.jInternalFrameOrderByProcesoCierrePeriodo!=null) {
				this.jInternalFrameOrderByProcesoCierrePeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierrePeriodo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierrePeriodo.jTabbedPaneRelacionesProcesoCierrePeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierrePeriodo"));
		
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
            		closingInternalFrameProcesoCierrePeriodo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCierrePeriodo = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCierrePeriodoBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierrePeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierrePeriodo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCierrePeriodoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCierrePeriodo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCierrePeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCierrePeriodo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCierrePeriodo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCierrePeriodo";
		inputMap = this.jButtonNuevoProcesoCierrePeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCierrePeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCierrePeriodo";
		inputMap = this.jButtonNuevoRelacionesProcesoCierrePeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCierrePeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierrePeriodoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCierrePeriodo";
		inputMap = this.jButtonModificarProcesoCierrePeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCierrePeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCierrePeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCierrePeriodo";
		inputMap = this.jButtonActualizarProcesoCierrePeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCierrePeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCierrePeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCierrePeriodo";
		inputMap = this.jButtonEliminarProcesoCierrePeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCierrePeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCierrePeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCierrePeriodo";
		inputMap = this.jButtonCancelarProcesoCierrePeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCierrePeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCierrePeriodo";
		inputMap = this.jButtonCerrarProcesoCierrePeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCierrePeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCierrePeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCierrePeriodo";
		inputMap = this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosProcesoCierrePeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonGuardarCambiosProcesoCierrePeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCierrePeriodo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCierrePeriodoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCierrePeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCierrePeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCierrePeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCierrePeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCierrePeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonidProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierrePeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_ejercicioProcesoCierrePeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoCierrePeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_ejercicioProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoCierrePeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_periodoProcesoCierrePeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoCierrePeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_periodoProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoCierrePeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_estado_periodoProcesoCierrePeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_periodoProcesoCierrePeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jButtonid_estado_periodoProcesoCierrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_periodoProcesoCierrePeriodoBusqueda"));
		
		
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCierrePeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCierrePeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCierrePeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCierrePeriodo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCierrePeriodo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
					procesocierreperiodoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodos) {
					procesocierreperiodoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCierrePeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierrePeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
						procesocierreperiodoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodos) {
						procesocierreperiodoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierrePeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierrePeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierrePeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCierrePeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierrePeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCierrePeriodo.getSelectedRows();
			
			ProcesoCierrePeriodo procesocierreperiodoLocal=new ProcesoCierrePeriodo();
			
			//this.seleccionarTodosProcesoCierrePeriodo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocierreperiodoLocal =(ProcesoCierrePeriodo) this.procesocierreperiodoLogic.getProcesoCierrePeriodos().toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocierreperiodoLocal =(ProcesoCierrePeriodo) this.procesocierreperiodos.toArray()[this.jTableDatosProcesoCierrePeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocierreperiodoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
						procesocierreperiodoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodos) {
						procesocierreperiodoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierrePeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierrePeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierrePeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCierrePeriodoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCierrePeriodoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCierrePeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCierrePeriodo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCierrePeriodo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodos) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCierrePeriodoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCierrePeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCierrePeriodo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCierrePeriodo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCierrePeriodo) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCierrePeriodo(conSplash);
				
					this.generarReporteProcesoCierrePeriodosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCierrePeriodosSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierrePeriodosSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierrePeriodosSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierrePeriodo();
				
				this.exportarProcesoCierrePeriodosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCierrePeriodos();
				//this.importarProcesoCierrePeriodos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierrePeriodo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCierrePeriodosSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cierre Periodo Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCierrePeriodo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCierrePeriodo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCierrePeriodo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cierre Periodo Mensual",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCierrePeriodoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCierrePeriodo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCierrePeriodo(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCierrePeriodo();
						
						this.generarReporteProcesoAccionProcesoCierrePeriodosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cierre Periodo MensualES SELECCIONADOS?", "MANTENIMIENTO DE Cierre Periodo Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCierrePeriodo();
				
						this.actualizarParametrosGeneralProcesoCierrePeriodo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocierreperiodoReturnGeneral=procesocierreperiodoLogic.procesarAccionProcesoCierrePeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocierreperiodoLogic.getProcesoCierrePeriodos(),this.procesocierreperiodoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCierrePeriodoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCierrePeriodo();
					
					ProcesoCierrePeriodoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCierrePeriodoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierrePeriodo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxTiposAccionesFormularioProcesoCierrePeriodo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCierrePeriodo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCierrePeriodoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCierrePeriodo();
			
			if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();		
			ProcesoCierrePeriodo procesocierreperiodo=new ProcesoCierrePeriodo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCierrePeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCierrePeriodo.getSelectedItem();
			
			
			
			
			procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocierreperiodosSeleccionados.size()==1) {
				for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodosSeleccionados) {
					procesocierreperiodo=procesocierreperiodoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCierrePeriodo();
			
      		//this.finishProcessProcesoCierrePeriodo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCierrePeriodoReturnGeneral() throws Exception {
		if(this.procesocierreperiodoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocierreperiodoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocierreperiodoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocierreperiodoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocierreperiodoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocierreperiodoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCierrePeriodo(false);
		}
		
		if(this.procesocierreperiodoReturnGeneral.getConRetornoLista() || this.procesocierreperiodoReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocierreperiodoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesocierreperiodoLogic.setProcesoCierrePeriodos(this.procesocierreperiodoReturnGeneral.getProcesoCierrePeriodos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCierrePeriodo(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCierrePeriodo() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCierrePeriodo> getProcesoCierrePeriodosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCierrePeriodo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodoLogic.getProcesoCierrePeriodos()) {
					if(procesocierreperiodoAux.getIsSelected()) {
						procesocierreperiodosSeleccionados.add(procesocierreperiodoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierrePeriodo procesocierreperiodoAux:this.procesocierreperiodos) {
					if(procesocierreperiodoAux.getIsSelected()) {
						procesocierreperiodosSeleccionados.add(procesocierreperiodoAux);				
					}
				}
			}
			
			if(procesocierreperiodosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocierreperiodosSeleccionados.addAll(this.procesocierreperiodoLogic.getProcesoCierrePeriodos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocierreperiodosSeleccionados.addAll(this.procesocierreperiodos);				
					}
				}
			}
		} else {
			procesocierreperiodosSeleccionados.add(this.procesocierreperiodo);
		}
		
		return procesocierreperiodosSeleccionados;
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
	
	public void generarReporteProcesoCierrePeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCierrePeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCierrePeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierrePeriodosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierrePeriodosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cierre Periodo Mensual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCierrePeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();		
		
		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCierrePeriodos("Todos",procesocierreperiodosSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCierrePeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();		
		
		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCierrePeriodos("Todos",procesocierreperiodosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCierrePeriodosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();
		
		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCierrePeriodos("Todos",procesocierreperiodosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCierrePeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCierrePeriodo();
		
		
		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCierrePeriodo();
		
		
		//this.generarReporteProcesoCierrePeriodos("Todos",procesocierreperiodosSeleccionados ,procesocierreperiodoImplementable,procesocierreperiodoImplementableHome);
	}
	
	public void mostrarImportacionProcesoCierrePeriodos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCierrePeriodo();
		
		this.abrirFrameImportacionProcesoCierrePeriodo();		
		
			
		//this.generarReporteProcesoCierrePeriodos("Todos",procesocierreperiodosSeleccionados ,procesocierreperiodoImplementable,procesocierreperiodoImplementableHome);
	}
	
	public void importarProcesoCierrePeriodos() throws Exception {		
	
	}
	
	public void exportarProcesoCierrePeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCierrePeriodosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCierrePeriodosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCierrePeriodosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cierre Periodo Mensual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCierrePeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();		
		
		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreperiodo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCierrePeriodo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCierrePeriodo(procesocierreperiodoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocierreperiodoAux.setsDetalleGeneralEntityReporte(procesocierreperiodoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Periodo Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCierrePeriodo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCierrePeriodoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierrePeriodoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocierreperiodo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreperiodo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreperiodo.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreperiodo.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreperiodo.getestadoperiodo_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCierrePeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();		
		
		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreperiodo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCierrePeriodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCierrePeriodo(row);				
				iRow++;
			}				
			
			for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCierrePeriodo(procesocierreperiodoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Periodo Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCierrePeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();		
		
		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreperiodo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocierreperiodos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocierreperiodo");
			//elementRoot.appendChild(element);
		
			for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodosSeleccionados) {
				element = document.createElement("procesocierreperiodo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCierrePeriodo(procesocierreperiodoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Periodo Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCierrePeriodo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreperiodo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreperiodo.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreperiodo.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreperiodo.getestadoperiodo_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesoCierrePeriodo(ProcesoCierrePeriodo procesocierreperiodo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCierrePeriodoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocierreperiodo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCierrePeriodoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocierreperiodo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementejercicio_descripcion = document.createElement(ProcesoCierrePeriodoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(procesocierreperiodo.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(ProcesoCierrePeriodoConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(procesocierreperiodo.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementestadoperiodo_descripcion = document.createElement(ProcesoCierrePeriodoConstantesFunciones.IDESTADOPERIODO);
		elementestadoperiodo_descripcion.appendChild(document.createTextNode(procesocierreperiodo.getestadoperiodo_descripcion()));
		element.appendChild(elementestadoperiodo_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesoCierrePeriodosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados=new ArrayList<ProcesoCierrePeriodo>();
		
		procesocierreperiodosSeleccionados=this.getProcesoCierrePeriodosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCierrePeriodo(procesocierreperiodosSeleccionados);
		
		this.generarReporteProcesoCierrePeriodos("Todos",procesocierreperiodosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCierrePeriodo(ArrayList<ProcesoCierrePeriodo> procesocierreperiodosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCierrePeriodo procesocierreperiodoAux:procesocierreperiodosSeleccionados) {
				procesocierreperiodoAux.setsDetalleGeneralEntityReporte(procesocierreperiodoAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					procesocierreperiodoAux.setsDescripcionGeneralEntityReporte1(procesocierreperiodoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					procesocierreperiodoAux.setsDescripcionGeneralEntityReporte1(procesocierreperiodoAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierrePeriodoConstantesFunciones.LABEL_IDESTADOPERIODO)) {
					existe=true;
					procesocierreperiodoAux.setsDescripcionGeneralEntityReporte1(procesocierreperiodoAux.getestadoperiodo_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierrePeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCierrePeriodo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCierrePeriodoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=true;
		} else {
			this.actualizarEstadoPanelsProcesoCierrePeriodo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCierrePeriodo=false;
			//this.isVisibilidadCeldaVerFormProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaDuplicarProcesoCierrePeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocierreperiodoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			if(!procesocierreperiodoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;												
			}
			
			this.jButtonCerrarProcesoCierrePeriodo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocierreperiodo)) {
			this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCierrePeriodo=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierrePeriodo=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCierrePeriodo=false;
		//this.isVisibilidadCeldaModificarProcesoCierrePeriodo=true;
		this.isVisibilidadCeldaActualizarProcesoCierrePeriodo=false;
		this.isVisibilidadCeldaEliminarProcesoCierrePeriodo=false;
		//this.isVisibilidadCeldaCancelarProcesoCierrePeriodo=true;			
		this.isVisibilidadCeldaGuardarProcesoCierrePeriodo=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierrePeriodo() {
	}
	
	public void actualizarEstadoPanelsProcesoCierrePeriodo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierrePeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosProcesoCierrePeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierrePeriodo!=null) {
				this.jPanelPaginacionProcesoCierrePeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierrePeriodo!=null) {
				this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierrePeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosProcesoCierrePeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierrePeriodo!=null) {
				this.jPanelPaginacionProcesoCierrePeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierrePeriodo!=null) {
				this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierrePeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosProcesoCierrePeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierrePeriodo!=null) {
				this.jPanelPaginacionProcesoCierrePeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierrePeriodo!=null) {
				this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierrePeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosProcesoCierrePeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierrePeriodo!=null) {
				this.jPanelPaginacionProcesoCierrePeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierrePeriodo!=null) {
				this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierrePeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosProcesoCierrePeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierrePeriodo!=null) {
				this.jPanelPaginacionProcesoCierrePeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierrePeriodo!=null) {
				this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierrePeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosProcesoCierrePeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierrePeriodo!=null) {
				this.jPanelPaginacionProcesoCierrePeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierrePeriodo!=null) {
				this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCierrePeriodo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierrePeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierrePeriodo!=null) {
				this.jScrollPanelDatosProcesoCierrePeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierrePeriodo!=null) {
				this.jPanelPaginacionProcesoCierrePeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierrePeriodo!=null) {
				this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCierrePeriodo!=null) {
					this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCierrePeriodo!=null) {
				this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocierreperiodoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierrePeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCierrePeriodo!=null) {
				this.jPanelParametrosReportesProcesoCierrePeriodo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado=isParaEjercicio;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado) {this.jTabbedPaneBusquedasProcesoCierrePeriodo.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado=isParaPeriodo;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado) {this.jTabbedPaneBusquedasProcesoCierrePeriodo.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoPeriodo(Boolean isParaEstadoPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoPeriodoNegation=!isParaEstadoPeriodo;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado=isParaEstadoPeriodo;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodoPorEstado) {this.jTabbedPaneBusquedasProcesoCierrePeriodo.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProcesoCierrePeriodo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCierrePeriodo() {
		this.updateBorderResaltarBusquedasFormularioProcesoCierrePeriodo();
		this.updateVisibilidadBusquedasFormularioProcesoCierrePeriodo();
		this.updateHabilitarBusquedasFormularioProcesoCierrePeriodo();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCierrePeriodo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCierrePeriodo.getComponents().length>0) {
	

		if(this.procesocierreperiodoConstantesFunciones.resaltarBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo!=null) {
			index= this.jTabbedPaneBusquedasProcesoCierrePeriodo.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierrePeriodo.getComponent(index);
				jPanel.setBorder(this.procesocierreperiodoConstantesFunciones.resaltarBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCierrePeriodo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCierrePeriodo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierrePeriodo.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierrePeriodo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocierreperiodoConstantesFunciones.mostrarBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);
			if(!this.procesocierreperiodoConstantesFunciones.mostrarBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo && index>-1) {
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCierrePeriodo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCierrePeriodo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierrePeriodo.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierrePeriodo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocierreperiodoConstantesFunciones.activarBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);
				this.jTabbedPaneBusquedasProcesoCierrePeriodo.setEnabledAt(index,this.procesocierreperiodoConstantesFunciones.activarBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCierrePeriodo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodoPorEstado")) {
			index= this.jTabbedPaneBusquedasProcesoCierrePeriodo.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);

			this.jTabbedPaneBusquedasProcesoCierrePeriodo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierrePeriodo.getComponent(index);

			this.procesocierreperiodoConstantesFunciones.setResaltarBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo(resaltar);

			jPanel.setBorder(this.procesocierreperiodoConstantesFunciones.resaltarBusquedaPorIdEjercicioPorIdPeriodoPorEstadoProcesoCierrePeriodo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCierrePeriodo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCierrePeriodo() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCierrePeriodo();
		this.updateVisibilidadResaltarControlesFormularioProcesoCierrePeriodo();
		this.updateHabilitarResaltarControlesFormularioProcesoCierrePeriodo();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCierrePeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocierreperiodoConstantesFunciones.resaltaridProcesoCierrePeriodo!=null && this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.setBorder(this.procesocierreperiodoConstantesFunciones.resaltaridProcesoCierrePeriodo);}
		if(this.procesocierreperiodoConstantesFunciones.resaltarid_ejercicioProcesoCierrePeriodo!=null && this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.setBorder(this.procesocierreperiodoConstantesFunciones.resaltarid_ejercicioProcesoCierrePeriodo);}
		if(this.procesocierreperiodoConstantesFunciones.resaltarid_periodoProcesoCierrePeriodo!=null && this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.setBorder(this.procesocierreperiodoConstantesFunciones.resaltarid_periodoProcesoCierrePeriodo);}
		if(this.procesocierreperiodoConstantesFunciones.resaltarid_estado_periodoProcesoCierrePeriodo!=null && this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.setBorder(this.procesocierreperiodoConstantesFunciones.resaltarid_estado_periodoProcesoCierrePeriodo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCierrePeriodo() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.setVisible(this.procesocierreperiodoConstantesFunciones.mostraridProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jPanelidProcesoCierrePeriodo.setVisible(this.procesocierreperiodoConstantesFunciones.mostraridProcesoCierrePeriodo);
		//this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.setVisible(this.procesocierreperiodoConstantesFunciones.mostrarid_ejercicioProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jPanelid_ejercicioProcesoCierrePeriodo.setVisible(this.procesocierreperiodoConstantesFunciones.mostrarid_ejercicioProcesoCierrePeriodo);
		//this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.setVisible(this.procesocierreperiodoConstantesFunciones.mostrarid_periodoProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jPanelid_periodoProcesoCierrePeriodo.setVisible(this.procesocierreperiodoConstantesFunciones.mostrarid_periodoProcesoCierrePeriodo);
		//this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.setVisible(this.procesocierreperiodoConstantesFunciones.mostrarid_estado_periodoProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jPanelid_estado_periodoProcesoCierrePeriodo.setVisible(this.procesocierreperiodoConstantesFunciones.mostrarid_estado_periodoProcesoCierrePeriodo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCierrePeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierrePeriodo!=null) {
	
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jLabelidProcesoCierrePeriodo.setEnabled(this.procesocierreperiodoConstantesFunciones.activaridProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_ejercicioProcesoCierrePeriodo.setEnabled(this.procesocierreperiodoConstantesFunciones.activarid_ejercicioProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_periodoProcesoCierrePeriodo.setEnabled(this.procesocierreperiodoConstantesFunciones.activarid_periodoProcesoCierrePeriodo);
		this.jInternalFrameDetalleFormProcesoCierrePeriodo.jComboBoxid_estado_periodoProcesoCierrePeriodo.setEnabled(this.procesocierreperiodoConstantesFunciones.activarid_estado_periodoProcesoCierrePeriodo);
		}
	}
	
		
}