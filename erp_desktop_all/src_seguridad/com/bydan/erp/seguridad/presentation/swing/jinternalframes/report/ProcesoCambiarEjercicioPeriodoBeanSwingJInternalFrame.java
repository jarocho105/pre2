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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.seguridad.util.ProcesoCambiarEjercicioPeriodoConstantesFunciones;
import com.bydan.erp.seguridad.util.report.ProcesoCambiarEjercicioPeriodoParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.report.ProcesoCambiarEjercicioPeriodoParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.report.ProcesoCambiarEjercicioPeriodoBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.seguridad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.seguridad.util.*;

import com.bydan.erp.seguridad.util.report.*;
import com.bydan.erp.seguridad.business.logic.report.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.report.*;

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




@SuppressWarnings("unused")
public class ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame extends ProcesoCambiarEjercicioPeriodoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodoValidator = new ClassValidator<ProcesoCambiarEjercicioPeriodo>(ProcesoCambiarEjercicioPeriodo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo;	
	public ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux;
	public ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoTotales;
	public Long idProcesoCambiarEjercicioPeriodoActual;
	public Long iIdNuevoProcesoCambiarEjercicioPeriodo=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoNuevoProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoActualizarProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoActualizarOriginalProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoEliminarProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoConsultaProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoBusquedaProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoReporteProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoCopiarProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoVerFormProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoDuplicarProcesoCambiarEjercicioPeriodo;
	public Boolean isPermisoOrdenProcesoCambiarEjercicioPeriodo;
	
	
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
	
	public ProcesoCambiarEjercicioPeriodoParameterReturnGeneral procesocambiarejercicioperiodoReturnGeneral;
	public ProcesoCambiarEjercicioPeriodoParameterReturnGeneral procesocambiarejercicioperiodoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCambiarEjercicioPeriodo=false;
	public Boolean esParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCambiarEjercicioPeriodoSessionBeanAdditional procesocambiarejercicioperiodoSessionBeanAdditional=null;
	
	public ProcesoCambiarEjercicioPeriodoSessionBeanAdditional getProcesoCambiarEjercicioPeriodoSessionBeanAdditional() {
		return this.procesocambiarejercicioperiodoSessionBeanAdditional;
	}
	
	public void setProcesoCambiarEjercicioPeriodoSessionBeanAdditional(ProcesoCambiarEjercicioPeriodoSessionBeanAdditional procesocambiarejercicioperiodoSessionBeanAdditional) {
		try {
			this.procesocambiarejercicioperiodoSessionBeanAdditional=procesocambiarejercicioperiodoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional procesocambiarejercicioperiodoBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame
	
	public ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional getProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional() {
		return this.procesocambiarejercicioperiodoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional(ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional procesocambiarejercicioperiodoBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocambiarejercicioperiodoBeanSwingJInternalFrameAdditional=procesocambiarejercicioperiodoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCambiarEjercicioPeriodoLogic procesocambiarejercicioperiodoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoBean;
	public ProcesoCambiarEjercicioPeriodoConstantesFunciones procesocambiarejercicioperiodoConstantesFunciones;
	//public ProcesoCambiarEjercicioPeriodoParameterReturnGeneral procesocambiarejercicioperiodoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodos;	
	//public List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosEliminados;
	//public List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
	public Boolean isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCambiarEjercicioPeriodo=false;
	
	public Long getiIdNuevoProcesoCambiarEjercicioPeriodo() {
		return this.iIdNuevoProcesoCambiarEjercicioPeriodo;
	}

	public void setiIdNuevoProcesoCambiarEjercicioPeriodo(Long iIdNuevoProcesoCambiarEjercicioPeriodo) {
		this.iIdNuevoProcesoCambiarEjercicioPeriodo = iIdNuevoProcesoCambiarEjercicioPeriodo;
	}
	
	public Long getidProcesoCambiarEjercicioPeriodoActual() {
		return this.idProcesoCambiarEjercicioPeriodoActual;
	}

	public void setidProcesoCambiarEjercicioPeriodoActual(Long idProcesoCambiarEjercicioPeriodoActual) {
		this.idProcesoCambiarEjercicioPeriodoActual = idProcesoCambiarEjercicioPeriodoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCambiarEjercicioPeriodo getprocesocambiarejercicioperiodo() {
		return this.procesocambiarejercicioperiodo;
	}

	public void setprocesocambiarejercicioperiodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo) {
		this.procesocambiarejercicioperiodo = procesocambiarejercicioperiodo;
	}
	
	public ProcesoCambiarEjercicioPeriodo getprocesocambiarejercicioperiodoAux() {
		return this.procesocambiarejercicioperiodoAux;
	}

	public void setprocesocambiarejercicioperiodoAux(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux) {
		this.procesocambiarejercicioperiodoAux = procesocambiarejercicioperiodoAux;
	}				
	
	public ProcesoCambiarEjercicioPeriodo getprocesocambiarejercicioperiodoAnterior() {
		return this.procesocambiarejercicioperiodoAnterior;
	}

	public void setprocesocambiarejercicioperiodoAnterior(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAnterior) {
		this.procesocambiarejercicioperiodoAnterior = procesocambiarejercicioperiodoAnterior;
	}	
	
	public ProcesoCambiarEjercicioPeriodo getprocesocambiarejercicioperiodoTotales() {
		return this.procesocambiarejercicioperiodoTotales;
	}

	public void setprocesocambiarejercicioperiodoTotales(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoTotales) {
		this.procesocambiarejercicioperiodoTotales = procesocambiarejercicioperiodoTotales;
	}	
	
	public ProcesoCambiarEjercicioPeriodo getprocesocambiarejercicioperiodoBean() {
		return this.procesocambiarejercicioperiodoBean;
	}

	public void setprocesocambiarejercicioperiodoBean(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoBean) {
		this.procesocambiarejercicioperiodoBean = procesocambiarejercicioperiodoBean;
	}	
	
	public ProcesoCambiarEjercicioPeriodoParameterReturnGeneral getprocesocambiarejercicioperiodoReturnGeneral() {
		return this.procesocambiarejercicioperiodoReturnGeneral;
	}

	public void setprocesocambiarejercicioperiodoReturnGeneral(ProcesoCambiarEjercicioPeriodoParameterReturnGeneral procesocambiarejercicioperiodoReturnGeneral) {
		this.procesocambiarejercicioperiodoReturnGeneral = procesocambiarejercicioperiodoReturnGeneral;
	}	
	
	
	public Date fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo=new Date();

	public Date getfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo() {
		return this.fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo;
	}

	public void setfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo(Date fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo) {
		this.fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo = fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoCambiarEjercicioPeriodoLogic getProcesoCambiarEjercicioPeriodoLogic()	{		
		return procesocambiarejercicioperiodoLogic;
	}

	public void setProcesoCambiarEjercicioPeriodoLogic(ProcesoCambiarEjercicioPeriodoLogic procesocambiarejercicioperiodoLogic) {
		this.procesocambiarejercicioperiodoLogic = procesocambiarejercicioperiodoLogic;
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
	
	public Boolean getIsEsNuevoProcesoCambiarEjercicioPeriodo() {
		return isEsNuevoProcesoCambiarEjercicioPeriodo;
	}

	public void setIsEsNuevoProcesoCambiarEjercicioPeriodo(Boolean isEsNuevoProcesoCambiarEjercicioPeriodo) {
		this.isEsNuevoProcesoCambiarEjercicioPeriodo = isEsNuevoProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo() {
		return esParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo(Boolean esParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo) {
		this.esParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo = esParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesProcesoCambiarEjercicioPeriodo() throws Exception {
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
		
	public ProcesoCambiarEjercicioPeriodoParameterReturnGeneral getProcesoCambiarEjercicioPeriodoParameterGeneral() {
		return this.procesocambiarejercicioperiodoParameterGeneral;
	}
	
	public void setProcesoCambiarEjercicioPeriodoParameterGeneral(ProcesoCambiarEjercicioPeriodoParameterReturnGeneral procesocambiarejercicioperiodoParameterGeneral) {
		this.procesocambiarejercicioperiodoParameterGeneral = procesocambiarejercicioperiodoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCambiarEjercicioPeriodo() {
		return isPermisoTodoProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoTodoProcesoCambiarEjercicioPeriodo(Boolean isPermisoTodoProcesoCambiarEjercicioPeriodo) {
		this.isPermisoTodoProcesoCambiarEjercicioPeriodo = isPermisoTodoProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getIsPermisoNuevoProcesoCambiarEjercicioPeriodo() {
		return isPermisoNuevoProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoNuevoProcesoCambiarEjercicioPeriodo(Boolean isPermisoNuevoProcesoCambiarEjercicioPeriodo) {
		this.isPermisoNuevoProcesoCambiarEjercicioPeriodo = isPermisoNuevoProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getIsPermisoActualizarProcesoCambiarEjercicioPeriodo() {
		return isPermisoActualizarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoActualizarProcesoCambiarEjercicioPeriodo(Boolean isPermisoActualizarProcesoCambiarEjercicioPeriodo) {
		this.isPermisoActualizarProcesoCambiarEjercicioPeriodo = isPermisoActualizarProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getIsPermisoEliminarProcesoCambiarEjercicioPeriodo() {
		return isPermisoEliminarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoEliminarProcesoCambiarEjercicioPeriodo(Boolean isPermisoEliminarProcesoCambiarEjercicioPeriodo) {
		this.isPermisoEliminarProcesoCambiarEjercicioPeriodo = isPermisoEliminarProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo() {
		return isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo(Boolean isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo) {
		this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo = isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsPermisoConsultaProcesoCambiarEjercicioPeriodo() {
		return isPermisoConsultaProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoConsultaProcesoCambiarEjercicioPeriodo(Boolean isPermisoConsultaProcesoCambiarEjercicioPeriodo) {
		this.isPermisoConsultaProcesoCambiarEjercicioPeriodo = isPermisoConsultaProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getIsPermisoBusquedaProcesoCambiarEjercicioPeriodo() {
		return isPermisoBusquedaProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoBusquedaProcesoCambiarEjercicioPeriodo(Boolean isPermisoBusquedaProcesoCambiarEjercicioPeriodo) {
		this.isPermisoBusquedaProcesoCambiarEjercicioPeriodo = isPermisoBusquedaProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getIsPermisoReporteProcesoCambiarEjercicioPeriodo() {
		return isPermisoReporteProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoReporteProcesoCambiarEjercicioPeriodo(Boolean isPermisoReporteProcesoCambiarEjercicioPeriodo) {
		this.isPermisoReporteProcesoCambiarEjercicioPeriodo = isPermisoReporteProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo() {
		return isPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo(Boolean isPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo) {
		this.isPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo = isPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo() {
		return isPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo(Boolean isPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo) {
		this.isPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo = isPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo() {
		return isPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo(Boolean isPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo) {
		this.isPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo = isPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsPermisoCopiarProcesoCambiarEjercicioPeriodo() {
		return isPermisoCopiarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoCopiarProcesoCambiarEjercicioPeriodo(Boolean isPermisoCopiarProcesoCambiarEjercicioPeriodo) {
		this.isPermisoCopiarProcesoCambiarEjercicioPeriodo = isPermisoCopiarProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsPermisoVerFormProcesoCambiarEjercicioPeriodo() {
		return isPermisoVerFormProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoVerFormProcesoCambiarEjercicioPeriodo(Boolean isPermisoVerFormProcesoCambiarEjercicioPeriodo) {
		this.isPermisoVerFormProcesoCambiarEjercicioPeriodo = isPermisoVerFormProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCambiarEjercicioPeriodo() {
		return isPermisoDuplicarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoDuplicarProcesoCambiarEjercicioPeriodo(Boolean isPermisoDuplicarProcesoCambiarEjercicioPeriodo) {
		this.isPermisoDuplicarProcesoCambiarEjercicioPeriodo = isPermisoDuplicarProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsPermisoOrdenProcesoCambiarEjercicioPeriodo() {
		return isPermisoOrdenProcesoCambiarEjercicioPeriodo;
	}

	public void setIsPermisoOrdenProcesoCambiarEjercicioPeriodo(Boolean isPermisoOrdenProcesoCambiarEjercicioPeriodo) {
		this.isPermisoOrdenProcesoCambiarEjercicioPeriodo = isPermisoOrdenProcesoCambiarEjercicioPeriodo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo() {
		return isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo = isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo;
	}
		
	public ProcesoCambiarEjercicioPeriodoSessionBean getprocesocambiarejercicioperiodoSessionBean() {
		return this.procesocambiarejercicioperiodoSessionBean;
	}
	
	public void setprocesocambiarejercicioperiodoSessionBean(ProcesoCambiarEjercicioPeriodoSessionBean procesocambiarejercicioperiodoSessionBean) {
		this.procesocambiarejercicioperiodoSessionBean=procesocambiarejercicioperiodoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCambiarEjercicioPeriodo() {
		return this.isVisibilidadBusquedaProcesoCambiarEjercicioPeriodo;
	}

	public void setisVisibilidadBusquedaProcesoCambiarEjercicioPeriodo(Boolean isVisibilidadBusquedaProcesoCambiarEjercicioPeriodo) {
		this.isVisibilidadBusquedaProcesoCambiarEjercicioPeriodo=isVisibilidadBusquedaProcesoCambiarEjercicioPeriodo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocambiarejercicioperiodoAux.setId(procesocambiarejercicioperiodo.getId());
		procesocambiarejercicioperiodoAux.setVersionRow(procesocambiarejercicioperiodo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoLocal) throws Exception {
		
		if(this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoLocal) throws Exception {	
		if(this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarProcesoCambiarEjercicioPeriodoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocambiarejercicioperiodoValidator.getInvalidValues(this.procesocambiarejercicioperiodo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodos) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodos) throws Exception {
		try	{			
			ProcesoCambiarEjercicioPeriodoConstantesFunciones.actualizarSelectedLista(procesocambiarejercicioperiodo,procesocambiarejercicioperiodos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocambiarejercicioperiodosLocal=this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocambiarejercicioperiodosLocal=this.procesocambiarejercicioperiodos;
			}
			//ARCHITECTURE
		
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoLocal:procesocambiarejercicioperiodosLocal) {
				if(this.permiteMantenimiento(procesocambiarejercicioperiodoLocal) && procesocambiarejercicioperiodoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCambiarEjercicioPeriodoConstantesFunciones.getProcesoCambiarEjercicioPeriodoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
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
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		
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
		this.iIdNuevoProcesoCambiarEjercicioPeriodo--;	
		
		
		this.procesocambiarejercicioperiodoAux=new ProcesoCambiarEjercicioPeriodo();
		
		this.procesocambiarejercicioperiodoAux.setId(this.iIdNuevoProcesoCambiarEjercicioPeriodo);
		this.procesocambiarejercicioperiodoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().add(this.procesocambiarejercicioperiodoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocambiarejercicioperiodos.add(this.procesocambiarejercicioperiodoAux);
		}
		//ARCHITECTURE
		
		this.procesocambiarejercicioperiodo=this.procesocambiarejercicioperiodoAux;
		
		if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
		}
				
		//this.setDefaultControlesProcesoCambiarEjercicioPeriodo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCambiarEjercicioPeriodo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCambiarEjercicioPeriodo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCambiarEjercicioPeriodo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoBean,this.procesocambiarejercicioperiodo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoReturnGeneral,this.procesocambiarejercicioperiodoBean,false);
		
		if(this.procesocambiarejercicioperiodoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodo());
		}
		
		if(this.procesocambiarejercicioperiodoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodo(),classes);//this.procesocambiarejercicioperiodoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCambiarEjercicioPeriodo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCambiarEjercicioPeriodo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.RecargarFormProcesoCambiarEjercicioPeriodo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
						
			if(procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCambiarEjercicioPeriodo();
			}
			
			this.actualizarVisualTableDatosProcesoCambiarEjercicioPeriodo();
			
			this.jTableDatosProcesoCambiarEjercicioPeriodo.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarEjercicioPeriodo(), this.getIndiceNuevoProcesoCambiarEjercicioPeriodo());
			
			this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCambiarEjercicioPeriodo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setEnabled(isHabilitar && this.procesocambiarejercicioperiodoConstantesFunciones.activarfecha_sistemaProcesoCambiarEjercicioPeriodo);	
		
	};
	
	public void setDefaultControlesProcesoCambiarEjercicioPeriodo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCambiarEjercicioPeriodo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocambiarejercicioperiodoSessionBean.setConGuardarRelaciones(true);			
			this.procesocambiarejercicioperiodoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.setVisible(true);
			
					
		} else {
			//this.procesocambiarejercicioperiodoSessionBean.setConGuardarRelaciones(false);			
			this.procesocambiarejercicioperiodoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCambiarEjercicioPeriodo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
				if(procesocambiarejercicioperiodoAux.getId().equals(this.iIdNuevoProcesoCambiarEjercicioPeriodo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodos) {
				if(procesocambiarejercicioperiodoAux.getId().equals(this.iIdNuevoProcesoCambiarEjercicioPeriodo)) {
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
	
	public int getIndiceActualProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
				if(procesocambiarejercicioperiodoAux.getId().equals(procesocambiarejercicioperiodo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodos) {
				if(procesocambiarejercicioperiodoAux.getId().equals(procesocambiarejercicioperiodo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
				if(procesocambiarejercicioperiodoAux.getProcesoCambiarEjercicioPeriodoOriginal().getId().equals(procesocambiarejercicioperiodoOriginal.getId())) {
					existe=true;
					procesocambiarejercicioperiodoOriginal.setId(procesocambiarejercicioperiodoAux.getId());
					procesocambiarejercicioperiodoOriginal.setVersionRow(procesocambiarejercicioperiodoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodos) {
				if(procesocambiarejercicioperiodoAux.getProcesoCambiarEjercicioPeriodoOriginal().getId().equals(procesocambiarejercicioperiodoOriginal.getId())) {
					existe=true;
					procesocambiarejercicioperiodoOriginal.setId(procesocambiarejercicioperiodoAux.getId());
					procesocambiarejercicioperiodoOriginal.setVersionRow(procesocambiarejercicioperiodoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCambiarEjercicioPeriodo(Boolean esParaCancelar) throws Exception {
		procesocambiarejercicioperiodosAux=new ArrayList<ProcesoCambiarEjercicioPeriodo>();
		procesocambiarejercicioperiodoAux=new ProcesoCambiarEjercicioPeriodo();
		
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
					if(procesocambiarejercicioperiodoAux.getId()<0) {
						procesocambiarejercicioperiodosAux.add(procesocambiarejercicioperiodoAux);
					}		
				}
				this.iIdNuevoProcesoCambiarEjercicioPeriodo=0L;
				this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().removeAll(procesocambiarejercicioperiodosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodos) {
					if(procesocambiarejercicioperiodoAux.getId()<0) {
						procesocambiarejercicioperiodosAux.add(procesocambiarejercicioperiodoAux);
					}		
				}
				this.iIdNuevoProcesoCambiarEjercicioPeriodo=0L;
				this.procesocambiarejercicioperiodos.removeAll(procesocambiarejercicioperiodosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCambiarEjercicioPeriodo 
					&& this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().size()>0
					) {
					procesocambiarejercicioperiodoAux=this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().get(this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().size() - 1);
				
					if(procesocambiarejercicioperiodoAux.getId()<0) {
						this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().remove(procesocambiarejercicioperiodoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCambiarEjercicioPeriodo && this.procesocambiarejercicioperiodos.size()>0) {
					procesocambiarejercicioperiodoAux=this.procesocambiarejercicioperiodos.get(this.procesocambiarejercicioperiodos.size() - 1);
				
					if(procesocambiarejercicioperiodoAux.getId()<0) {
						this.procesocambiarejercicioperiodos.remove(procesocambiarejercicioperiodoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCambiarEjercicioPeriodo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocambiarejercicioperiodo.getId()<0) {
				this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().remove(this.procesocambiarejercicioperiodo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocambiarejercicioperiodo.getId()<0) {
				this.procesocambiarejercicioperiodos.remove(this.procesocambiarejercicioperiodo);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCambiarEjercicioPeriodo(List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosAux) throws Exception {
		ProcesoCambiarEjercicioPeriodoConstantesFunciones.setEstadosInicialesProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodosAux);
	}
	
	public void setEstadosInicialesProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux) throws Exception {
		ProcesoCambiarEjercicioPeriodoConstantesFunciones.setEstadosInicialesProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCambiarEjercicioPeriodoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCambiarEjercicioPeriodoActual()) {
				if(!this.isEsNuevoProcesoCambiarEjercicioPeriodo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCambiarEjercicioPeriodoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Cambiar Ejercicio Periodo ?", "MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo) throws Exception {
		ProcesoCambiarEjercicioPeriodoConstantesFunciones.seleccionarAsignar(this.procesocambiarejercicioperiodo,procesocambiarejercicioperiodo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCambiarEjercicioPeriodo=this.isPermisoActualizarOriginalProcesoCambiarEjercicioPeriodo;
			
			
			this.seleccionarAsignar(procesocambiarejercicioperiodo);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocambiarejercicioperiodoSessionBean.setsFuncionBusquedaRapida(this.procesocambiarejercicioperiodoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCambiarEjercicioPeriodo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCambiarEjercicioPeriodo(esParaCancelar);				
				this.cancelarNuevoProcesoCambiarEjercicioPeriodo(esParaCancelar);								
			}
			
			this.procesocambiarejercicioperiodo=new ProcesoCambiarEjercicioPeriodo();
			
			this.inicializarProcesoCambiarEjercicioPeriodo();
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCambiarEjercicioPeriodo() throws Exception {
		try {
			ProcesoCambiarEjercicioPeriodoConstantesFunciones.inicializarProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCambiarEjercicioPeriodos(String sAccionBusqueda,List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCambiarEjercicioPeriodo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCambiarEjercicioPeriodoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCambiarEjercicioPeriodoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCambiarEjercicioPeriodo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Cambiar Ejercicio Periodos");		
		parameters.put("busquedapor", ProcesoCambiarEjercicioPeriodoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCambiarEjercicioPeriodo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCambiarEjercicioPeriodo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCambiarEjercicioPeriodoBean.TraerProcesoCambiarEjercicioPeriodoBeans(procesocambiarejercicioperiodosParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCambiarEjercicioPeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocambiarejercicioperiodosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCambiarEjercicioPeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocambiarejercicioperiodosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(null);
					//this.generarExcelReporteProcesoCambiarEjercicioPeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocambiarejercicioperiodosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCambiarEjercicioPeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocambiarejercicioperiodosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCambiarEjercicioPeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocambiarejercicioperiodosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCambiarEjercicioPeriodos(sAccionBusqueda,sTipoArchivoReporte,procesocambiarejercicioperiodosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCambiarEjercicioPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarejercicioperiodo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCambiarEjercicioPeriodos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCambiarEjercicioPeriodo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo : procesocambiarejercicioperiodosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCambiarEjercicioPeriodoConstantesFunciones.generarExcelReporteDataProcesoCambiarEjercicioPeriodo("NORMAL",row,workbook,procesocambiarejercicioperiodo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCambiarEjercicioPeriodo(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCambiarEjercicioPeriodoConstantesFunciones.generarExcelReporteHeaderProcesoCambiarEjercicioPeriodo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCambiarEjercicioPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarejercicioperiodo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCambiarEjercicioPeriodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo : procesocambiarejercicioperiodosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCambiarEjercicioPeriodoConstantesFunciones.getProcesoCambiarEjercicioPeriodoDescripcion(procesocambiarejercicioperiodo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocambiarejercicioperiodo.getfecha_sistema());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCambiarEjercicioPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosRespaldo=null;
		
		classes=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getClassesRelationshipsOfProcesoCambiarEjercicioPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocambiarejercicioperiodoLogic.setDatosCliente(this.datosCliente);
		this.procesocambiarejercicioperiodoLogic.setDatosDeep(this.datosDeep);
		this.procesocambiarejercicioperiodoLogic.setIsConDeep(true);
		
		procesocambiarejercicioperiodosRespaldo=this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos();
		
		this.procesocambiarejercicioperiodoLogic.setProcesoCambiarEjercicioPeriodos(procesocambiarejercicioperiodosParaReportes);	
		this.procesocambiarejercicioperiodoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocambiarejercicioperiodosParaReportes=this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos();
		this.procesocambiarejercicioperiodoLogic.setProcesoCambiarEjercicioPeriodos(procesocambiarejercicioperiodosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarejercicioperiodo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCambiarEjercicioPeriodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCambiarEjercicioPeriodo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo : procesocambiarejercicioperiodosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCambiarEjercicioPeriodo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCambiarEjercicioPeriodoConstantesFunciones.generarExcelReporteDataProcesoCambiarEjercicioPeriodo("NORMAL",row,workbook,procesocambiarejercicioperiodo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCambiarEjercicioPeriodoConstantesFunciones.getProcesoCambiarEjercicioPeriodoDescripcion(procesocambiarejercicioperiodo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCambiarEjercicioPeriodo() throws Exception {		
		this.startProcessProcesoCambiarEjercicioPeriodo(true);
	}
	
	public void startProcessProcesoCambiarEjercicioPeriodo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo ,this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo, this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo,this.jPanelPaginacionProcesoCambiarEjercicioPeriodo, this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo, this.jPanelAccionesProcesoCambiarEjercicioPeriodo,this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo,this.jmenuBarProcesoCambiarEjercicioPeriodo,this.jmenuBarDetalleProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo=this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo; 
		
		final JPanel jPanelParametrosReportesProcesoCambiarEjercicioPeriodo=this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo;
		//final JScrollPane jScrollPanelDatosProcesoCambiarEjercicioPeriodo=this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo;
		final JTable jTableDatosProcesoCambiarEjercicioPeriodo=this.jTableDatosProcesoCambiarEjercicioPeriodo;		
		final JPanel jPanelPaginacionProcesoCambiarEjercicioPeriodo=this.jPanelPaginacionProcesoCambiarEjercicioPeriodo;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo=this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo;
		final JPanel jPanelAccionesProcesoCambiarEjercicioPeriodo=this.jPanelAccionesProcesoCambiarEjercicioPeriodo;
		
		JPanel jPanelCamposAuxiliarProcesoCambiarEjercicioPeriodo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCambiarEjercicioPeriodo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			jPanelCamposAuxiliarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jPanelCamposProcesoCambiarEjercicioPeriodo;
			jPanelAccionesFormularioAuxiliarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo;
		}
		
		final JPanel jPanelCamposProcesoCambiarEjercicioPeriodo=jPanelCamposAuxiliarProcesoCambiarEjercicioPeriodo;
		final JPanel jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo=jPanelAccionesFormularioAuxiliarProcesoCambiarEjercicioPeriodo;
		
		
		final JMenuBar jmenuBarProcesoCambiarEjercicioPeriodo=this.jmenuBarProcesoCambiarEjercicioPeriodo;
		final JToolBar jTtoolBarProcesoCambiarEjercicioPeriodo=this.jTtoolBarProcesoCambiarEjercicioPeriodo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			jmenuBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jmenuBarDetalleProcesoCambiarEjercicioPeriodo;
			jTtoolBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCambiarEjercicioPeriodo=jmenuBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo;
		final JToolBar jTtoolBarDetalleProcesoCambiarEjercicioPeriodo=jTtoolBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCambiarEjercicioPeriodo;
			processRunnable.jTableDatos=jTableDatosProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelCampos=jPanelCamposProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCambiarEjercicioPeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCambiarEjercicioPeriodo;
			processRunnable.jTtoolBar=jTtoolBarProcesoCambiarEjercicioPeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCambiarEjercicioPeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo ,jPanelParametrosReportesProcesoCambiarEjercicioPeriodo,jTableDatosProcesoCambiarEjercicioPeriodo, /*jScrollPanelDatosProcesoCambiarEjercicioPeriodo,*/jPanelCamposProcesoCambiarEjercicioPeriodo,jPanelPaginacionProcesoCambiarEjercicioPeriodo, /*jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo,*/ jPanelAccionesProcesoCambiarEjercicioPeriodo,jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo,jmenuBarProcesoCambiarEjercicioPeriodo,jmenuBarDetalleProcesoCambiarEjercicioPeriodo,jTtoolBarProcesoCambiarEjercicioPeriodo,jTtoolBarDetalleProcesoCambiarEjercicioPeriodo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo ,jPanelParametrosReportesProcesoCambiarEjercicioPeriodo, jScrollPanelDatosProcesoCambiarEjercicioPeriodo,jPanelPaginacionProcesoCambiarEjercicioPeriodo, jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo, jPanelAccionesProcesoCambiarEjercicioPeriodo,jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo,jmenuBarProcesoCambiarEjercicioPeriodo,jmenuBarDetalleProcesoCambiarEjercicioPeriodo,jTtoolBarProcesoCambiarEjercicioPeriodo,jTtoolBarDetalleProcesoCambiarEjercicioPeriodo);
						
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
	
	public void finishProcessProcesoCambiarEjercicioPeriodo() {// throws Exception 
		this.finishProcessProcesoCambiarEjercicioPeriodo(true);
	}
	
	public void finishProcessProcesoCambiarEjercicioPeriodo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo ,this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo, this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo,this.jPanelPaginacionProcesoCambiarEjercicioPeriodo, this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo, this.jPanelAccionesProcesoCambiarEjercicioPeriodo,this.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo,this.jmenuBarProcesoCambiarEjercicioPeriodo,this.jmenuBarDetalleProcesoCambiarEjercicioPeriodo,this.jTtoolBarProcesoCambiarEjercicioPeriodo,this.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo=this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo; 
		
		final JPanel jPanelParametrosReportesProcesoCambiarEjercicioPeriodo=this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo;
		//final JScrollPane jScrollPanelDatosProcesoCambiarEjercicioPeriodo=this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo;
		final JTable jTableDatosProcesoCambiarEjercicioPeriodo=this.jTableDatosProcesoCambiarEjercicioPeriodo;		
		final JPanel jPanelPaginacionProcesoCambiarEjercicioPeriodo=this.jPanelPaginacionProcesoCambiarEjercicioPeriodo;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo=this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo;
		final JPanel jPanelAccionesProcesoCambiarEjercicioPeriodo=this.jPanelAccionesProcesoCambiarEjercicioPeriodo;
		
		JPanel jPanelCamposAuxiliarProcesoCambiarEjercicioPeriodo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCambiarEjercicioPeriodo=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			jPanelCamposAuxiliarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jPanelCamposProcesoCambiarEjercicioPeriodo;
			jPanelAccionesFormularioAuxiliarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo;
		}
		
		final JPanel jPanelCamposProcesoCambiarEjercicioPeriodo=jPanelCamposAuxiliarProcesoCambiarEjercicioPeriodo;
		final JPanel jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo=jPanelAccionesFormularioAuxiliarProcesoCambiarEjercicioPeriodo;
		
		
		final JMenuBar jmenuBarProcesoCambiarEjercicioPeriodo=this.jmenuBarProcesoCambiarEjercicioPeriodo;		
		final JToolBar jTtoolBarProcesoCambiarEjercicioPeriodo=this.jTtoolBarProcesoCambiarEjercicioPeriodo;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			jmenuBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jmenuBarDetalleProcesoCambiarEjercicioPeriodo;
			jTtoolBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCambiarEjercicioPeriodo=jmenuBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo;
		final JToolBar jTtoolBarDetalleProcesoCambiarEjercicioPeriodo=jTtoolBarDetalleAuxiliarProcesoCambiarEjercicioPeriodo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCambiarEjercicioPeriodo;
			processRunnable.jTableDatos=jTableDatosProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelCampos=jPanelCamposProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCambiarEjercicioPeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCambiarEjercicioPeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCambiarEjercicioPeriodo;
			processRunnable.jTtoolBar=jTtoolBarProcesoCambiarEjercicioPeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCambiarEjercicioPeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo ,jPanelParametrosReportesProcesoCambiarEjercicioPeriodo, jTableDatosProcesoCambiarEjercicioPeriodo,/*jScrollPanelDatosProcesoCambiarEjercicioPeriodo,*/jPanelCamposProcesoCambiarEjercicioPeriodo,jPanelPaginacionProcesoCambiarEjercicioPeriodo, /*jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo,*/ jPanelAccionesProcesoCambiarEjercicioPeriodo,jPanelAccionesFormularioProcesoCambiarEjercicioPeriodo,jmenuBarProcesoCambiarEjercicioPeriodo,jmenuBarDetalleProcesoCambiarEjercicioPeriodo,jTtoolBarProcesoCambiarEjercicioPeriodo,jTtoolBarDetalleProcesoCambiarEjercicioPeriodo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCambiarEjercicioPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCambiarEjercicioPeriodo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCambiarEjercicioPeriodo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCambiarEjercicioPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCambiarEjercicioPeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCambiarEjercicioPeriodo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCambiarEjercicioPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCambiarEjercicioPeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCambiarEjercicioPeriodo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocambiarejercicioperiodoConstantesFunciones.getsFinalQueryProcesoCambiarEjercicioPeriodo();
		String  finalQueryPaginacionTodos=this.procesocambiarejercicioperiodoConstantesFunciones.getsFinalQueryProcesoCambiarEjercicioPeriodo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getArrayColumnasGlobalesNoProcesoCambiarEjercicioPeriodo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getArrayColumnasGlobalesProcesoCambiarEjercicioPeriodo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCambiarEjercicioPeriodoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocambiarejercicioperiodosEliminados= new ArrayList<ProcesoCambiarEjercicioPeriodo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCambiarEjercicioPeriodo();
		
				///*ProcesoCambiarEjercicioPeriodoSessionBean*/this.procesocambiarejercicioperiodoSessionBean=new ProcesoCambiarEjercicioPeriodoSessionBean();
			
			if(this.procesocambiarejercicioperiodoSessionBean==null) {
				this.procesocambiarejercicioperiodoSessionBean=new ProcesoCambiarEjercicioPeriodoSessionBean();
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
					this.iNumeroPaginacion=ProcesoCambiarEjercicioPeriodoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getClassesForeignKeysOfProcesoCambiarEjercicioPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocambiarejercicioperiodo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocambiarejercicioperiodosAux= new ArrayList<ProcesoCambiarEjercicioPeriodo>();
			
				
			procesocambiarejercicioperiodoLogic.setDatosCliente(this.datosCliente);
			procesocambiarejercicioperiodoLogic.setDatosDeep(this.datosDeep);
			procesocambiarejercicioperiodoLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCambiarEjercicioPeriodo")) {
				this.sDetalleReporte=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEjercicioPeriodo(fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodosBusquedaProcesoCambiarEjercicioPeriodo(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEjercicioPeriodo(fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEjercicioPeriodo(fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()==null||procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocambiarejercicioperiodos==null|| procesocambiarejercicioperiodos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarejercicioperiodosAux=new ArrayList<ProcesoCambiarEjercicioPeriodo>();
						procesocambiarejercicioperiodosAux.addAll(procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocambiarejercicioperiodosAux=new ArrayList<ProcesoCambiarEjercicioPeriodo>();
							procesocambiarejercicioperiodosAux.addAll(procesocambiarejercicioperiodos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodosBusquedaProcesoCambiarEjercicioPeriodo(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEjercicioPeriodo(fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getDetalleIndiceBusquedaProcesoCambiarEjercicioPeriodo(fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCambiarEjercicioPeriodos("BusquedaProcesoCambiarEjercicioPeriodo",procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCambiarEjercicioPeriodos("BusquedaProcesoCambiarEjercicioPeriodo",procesocambiarejercicioperiodos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarejercicioperiodoLogic.setProcesoCambiarEjercicioPeriodos(new ArrayList<ProcesoCambiarEjercicioPeriodo>());
						procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().addAll(procesocambiarejercicioperiodosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocambiarejercicioperiodos=new ArrayList<ProcesoCambiarEjercicioPeriodo>();
							procesocambiarejercicioperiodos.addAll(procesocambiarejercicioperiodosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCambiarEjercicioPeriodo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCambiarEjercicioPeriodo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocambiarejercicioperiodos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocambiarejercicioperiodos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo) {
		Boolean permite=true;
		
		if(this.procesocambiarejercicioperiodo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getOrderByListaProcesoCambiarEjercicioPeriodo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getOrderByListaProcesoCambiarEjercicioPeriodo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo:procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
				if(procesocambiarejercicioperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarejercicioperiodoTotales=procesocambiarejercicioperiodo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo:this.procesocambiarejercicioperiodos) {
				if(procesocambiarejercicioperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarejercicioperiodoTotales=procesocambiarejercicioperiodo;
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
			this.procesocambiarejercicioperiodoAux=new ProcesoCambiarEjercicioPeriodo();
			this.procesocambiarejercicioperiodoAux.setsType(Constantes2.S_TOTALES);
			this.procesocambiarejercicioperiodoAux.setIsNew(false);
			this.procesocambiarejercicioperiodoAux.setIsChanged(false);
			this.procesocambiarejercicioperiodoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCambiarEjercicioPeriodoConstantesFunciones.TotalizarValoresFilaProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos(),this.procesocambiarejercicioperiodoAux);
				
				//this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().add(this.procesocambiarejercicioperiodoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCambiarEjercicioPeriodoConstantesFunciones.TotalizarValoresFilaProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodos,this.procesocambiarejercicioperiodoAux);
				
				this.procesocambiarejercicioperiodos.add(this.procesocambiarejercicioperiodoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocambiarejercicioperiodoTotales=new ProcesoCambiarEjercicioPeriodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().remove(procesocambiarejercicioperiodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocambiarejercicioperiodos.remove(procesocambiarejercicioperiodoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocambiarejercicioperiodoTotales=new ProcesoCambiarEjercicioPeriodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo:procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
				if(procesocambiarejercicioperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarejercicioperiodoTotales=procesocambiarejercicioperiodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCambiarEjercicioPeriodoConstantesFunciones.TotalizarValoresFilaProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos(),procesocambiarejercicioperiodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo:this.procesocambiarejercicioperiodos) {
				if(procesocambiarejercicioperiodo.getsType().equals(Constantes2.S_TOTALES)) {
					procesocambiarejercicioperiodoTotales=procesocambiarejercicioperiodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCambiarEjercicioPeriodoConstantesFunciones.TotalizarValoresFilaProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodos,procesocambiarejercicioperiodoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCambiarEjercicioPeriodosBusquedaProcesoCambiarEjercicioPeriodo()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCambiarEjercicioPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCambiarEjercicioPeriodosBusquedaProcesoCambiarEjercicioPeriodo(String sFinalQuery,Date fecha_sistema)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodosBusquedaProcesoCambiarEjercicioPeriodo(sFinalQuery,this.pagination,fecha_sistema);
				
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
	
	public void inicializarPermisosProcesoCambiarEjercicioPeriodo() {
		this.isPermisoTodoProcesoCambiarEjercicioPeriodo=false;
		this.isPermisoNuevoProcesoCambiarEjercicioPeriodo=false;
		this.isPermisoActualizarProcesoCambiarEjercicioPeriodo=false;
		this.isPermisoActualizarOriginalProcesoCambiarEjercicioPeriodo=false;
		this.isPermisoEliminarProcesoCambiarEjercicioPeriodo=false;
		this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo=false;
		this.isPermisoConsultaProcesoCambiarEjercicioPeriodo=true;
		this.isPermisoBusquedaProcesoCambiarEjercicioPeriodo=true;
		this.isPermisoReporteProcesoCambiarEjercicioPeriodo=true;
		this.isPermisoOrdenProcesoCambiarEjercicioPeriodo=false;		
		this.isPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo=false;		
		this.isPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo=false;		
		this.isPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo=false;		
		this.isPermisoCopiarProcesoCambiarEjercicioPeriodo=false;		
		this.isPermisoVerFormProcesoCambiarEjercicioPeriodo=false;		
		this.isPermisoDuplicarProcesoCambiarEjercicioPeriodo=false;
		this.isPermisoOrdenProcesoCambiarEjercicioPeriodo=false;
	}
	
	public void setPermisosUsuarioProcesoCambiarEjercicioPeriodo(Boolean isPermiso) {
		this.isPermisoTodoProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoNuevoProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoActualizarProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoActualizarOriginalProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoEliminarProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoConsultaProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoBusquedaProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoReporteProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoOrdenProcesoCambiarEjercicioPeriodo=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo=isPermiso;		
		this.isPermisoCopiarProcesoCambiarEjercicioPeriodo=isPermiso;		
		this.isPermisoVerFormProcesoCambiarEjercicioPeriodo=isPermiso;		
		this.isPermisoDuplicarProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoOrdenProcesoCambiarEjercicioPeriodo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCambiarEjercicioPeriodo(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoNuevoProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoActualizarProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoActualizarOriginalProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoEliminarProcesoCambiarEjercicioPeriodo=isPermiso;
		this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo=isPermiso;
		//this.isPermisoConsultaProcesoCambiarEjercicioPeriodo=isPermiso;
		//this.isPermisoBusquedaProcesoCambiarEjercicioPeriodo=isPermiso;
		//this.isPermisoReporteProcesoCambiarEjercicioPeriodo=isPermiso;
		//this.isPermisoOrdenProcesoCambiarEjercicioPeriodo=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo=isPermiso;		
		//this.isPermisoCopiarProcesoCambiarEjercicioPeriodo=isPermiso;		
		//this.isPermisoDuplicarProcesoCambiarEjercicioPeriodo=isPermiso;
		//this.isPermisoOrdenProcesoCambiarEjercicioPeriodo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCambiarEjercicioPeriodoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCambiarEjercicioPeriodo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCambiarEjercicioPeriodoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCambiarEjercicioPeriodoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCambiarEjercicioPeriodoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCambiarEjercicioPeriodoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCambiarEjercicioPeriodo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCambiarEjercicioPeriodoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCambiarEjercicioPeriodo=this.isPermisoActualizarProcesoCambiarEjercicioPeriodo;
			this.isPermisoEliminarProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCambiarEjercicioPeriodo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCambiarEjercicioPeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCambiarEjercicioPeriodo.setToolTipText(this.jTableDatosProcesoCambiarEjercicioPeriodo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCambiarEjercicioPeriodo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCambiarEjercicioPeriodo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCambiarEjercicioPeriodo() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyProcesoCambiarEjercicioPeriodoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCambiarEjercicioPeriodoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCambiarEjercicioPeriodo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyProcesoCambiarEjercicioPeriodo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCambiarEjercicioPeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoCambiarEjercicioPeriodo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCambiarEjercicioPeriodo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCambiarEjercicioPeriodo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCambiarEjercicioPeriodo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCambiarEjercicioPeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCambiarEjercicioPeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCambiarEjercicioPeriodo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCambiarEjercicioPeriodo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCambiarEjercicioPeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCambiarEjercicioPeriodo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocambiarejercicioperiodoSessionBean=new ProcesoCambiarEjercicioPeriodoSessionBean(); 
		this.procesocambiarejercicioperiodoConstantesFunciones=new ProcesoCambiarEjercicioPeriodoConstantesFunciones(); 
		this.procesocambiarejercicioperiodoBean=new ProcesoCambiarEjercicioPeriodo();//(this.procesocambiarejercicioperiodoConstantesFunciones); 		
		this.procesocambiarejercicioperiodoReturnGeneral=new ProcesoCambiarEjercicioPeriodoParameterReturnGeneral(); 
		
		this.procesocambiarejercicioperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocambiarejercicioperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCambiarEjercicioPeriodo(true);
			
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
			
			this.procesocambiarejercicioperiodoConstantesFunciones=new ProcesoCambiarEjercicioPeriodoConstantesFunciones(); 
			this.procesocambiarejercicioperiodoBean=new ProcesoCambiarEjercicioPeriodo();//this.procesocambiarejercicioperiodoConstantesFunciones); 			
			this.procesocambiarejercicioperiodoReturnGeneral=new ProcesoCambiarEjercicioPeriodoParameterReturnGeneral(); 
		
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cambiar Ejercicio Periodo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesocambiarejercicioperiodo=new ProcesoCambiarEjercicioPeriodo();
			this.procesocambiarejercicioperiodos = new ArrayList<ProcesoCambiarEjercicioPeriodo>();
			this.procesocambiarejercicioperiodosAux = new ArrayList<ProcesoCambiarEjercicioPeriodo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic=new ProcesoCambiarEjercicioPeriodoLogic();
				this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocambiarejercicioperiodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocambiarejercicioperiodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo);	
					}
					
					if(this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo);
				this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo);
					this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo);
					this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setVisible(false);
					this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo);
					this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setVisible(false);
					this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCambiarEjercicioPeriodoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCambiarEjercicioPeriodoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocambiarejercicioperiodoReturnGeneral=new ProcesoCambiarEjercicioPeriodoParameterReturnGeneral();
			
			this.procesocambiarejercicioperiodoParameterGeneral=new ProcesoCambiarEjercicioPeriodoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocambiarejercicioperiodoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCambiarEjercicioPeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado(),this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCambiarEjercicioPeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado(),this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=false;
			
			
			this.isVisibilidadBusquedaProcesoCambiarEjercicioPeriodo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCambiarEjercicioPeriodo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCambiarEjercicioPeriodo(false);
			
			this.setPermisosUsuarioProcesoCambiarEjercicioPeriodo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado() && this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCambiarEjercicioPeriodoClasesRelacionadas();
			}
			
			if(this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCambiarEjercicioPeriodoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCambiarEjercicioPeriodo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCambiarEjercicioPeriodo();
			}
			
			if(!this.isPermisoBusquedaProcesoCambiarEjercicioPeriodo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCambiarEjercicioPeriodoConstantesFunciones.getTiposSeleccionarProcesoCambiarEjercicioPeriodo());
				
				this.tiposColumnasSelect=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getTiposSeleccionarProcesoCambiarEjercicioPeriodo(true);
				
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
			//if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCambiarEjercicioPeriodo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioProcesoCambiarEjercicioPeriodo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioProcesoCambiarEjercicioPeriodo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarEjercicioPeriodo() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocambiarejercicioperiodoImplementable= (ProcesoCambiarEjercicioPeriodoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocambiarejercicioperiodoImplementableHome= (ProcesoCambiarEjercicioPeriodoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocambiarejercicioperiodos= new ArrayList<ProcesoCambiarEjercicioPeriodo>();
			this.procesocambiarejercicioperiodosEliminados= new ArrayList<ProcesoCambiarEjercicioPeriodo>();
						
			this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;
			this.esParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCambiarEjercicioPeriodo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCambiarEjercicioPeriodo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCambiarEjercicioPeriodoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCambiarEjercicioPeriodo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCambiarEjercicioPeriodo();
			}
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCambiarEjercicioPeriodo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCambiarEjercicioPeriodo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCambiarEjercicioPeriodo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCambiarEjercicioPeriodo")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCambiarEjercicioPeriodo();	
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
	
	public void cargarCombosForeignKeyProcesoCambiarEjercicioPeriodo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCambiarEjercicioPeriodo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCambiarEjercicioPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCambiarEjercicioPeriodoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCambiarEjercicioPeriodo();
		
		this.cargarCombosFrameForeignKeyProcesoCambiarEjercicioPeriodo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCambiarEjercicioPeriodo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCambiarEjercicioPeriodo();
		}
	}
	
	
	
	public void jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
			
			if(jTableDatosProcesoCambiarEjercicioPeriodo.getRowCount()>=1) {
				jTableDatosProcesoCambiarEjercicioPeriodo.removeRowSelectionInterval(0, jTableDatosProcesoCambiarEjercicioPeriodo.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCambiarEjercicioPeriodo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCambiarEjercicioPeriodo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCambiarEjercicioPeriodo(true);			
			//this.procesocambiarejercicioperiodo=new ProcesoCambiarEjercicioPeriodo();
			//this.procesocambiarejercicioperiodo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCambiarEjercicioPeriodo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo() ;
			
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCambiarEjercicioPeriodo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocambiarejercicioperiodo);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);				
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
			if(this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCambiarEjercicioPeriodo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRows().length;			
			}
			
			procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCambiarEjercicioPeriodo--;			
				//ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux= new ProcesoCambiarEjercicioPeriodo();			
				//procesocambiarejercicioperiodoAux.setId(this.iIdNuevoProcesoCambiarEjercicioPeriodo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoOrigen=new ProcesoCambiarEjercicioPeriodo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoOrigen : procesocambiarejercicioperiodosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocambiarejercicioperiodoOrigen =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocambiarejercicioperiodoOrigen =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCambiarEjercicioPeriodo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocambiarejercicioperiodo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodoOrigen,this.procesocambiarejercicioperiodo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().add(this.procesocambiarejercicioperiodoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocambiarejercicioperiodos.add(this.procesocambiarejercicioperiodoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
				
				this.jTableDatosProcesoCambiarEjercicioPeriodo.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarEjercicioPeriodo(), this.getIndiceNuevoProcesoCambiarEjercicioPeriodo());
				
				int iLastRow =  this.jTableDatosProcesoCambiarEjercicioPeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCambiarEjercicioPeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCambiarEjercicioPeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();									
		
			ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoOrigen=new ProcesoCambiarEjercicioPeriodo();
			ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoDestino=new ProcesoCambiarEjercicioPeriodo();
				
			procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocambiarejercicioperiodosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarejercicioperiodoOrigen =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocambiarejercicioperiodoOrigen =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocambiarejercicioperiodoDestino =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocambiarejercicioperiodoDestino =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocambiarejercicioperiodoOrigen =procesocambiarejercicioperiodosSeleccionados.get(0);
				procesocambiarejercicioperiodoDestino =procesocambiarejercicioperiodosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodoOrigen,procesocambiarejercicioperiodoDestino,true,false);
				
				procesocambiarejercicioperiodoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocambiarejercicioperiodoDestino,procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocambiarejercicioperiodoDestino,procesocambiarejercicioperiodos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
				
				//this.jTableDatosProcesoCambiarEjercicioPeriodo.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarEjercicioPeriodo(), this.getIndiceNuevoProcesoCambiarEjercicioPeriodo());
				
				int iLastRow =  this.jTableDatosProcesoCambiarEjercicioPeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCambiarEjercicioPeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCambiarEjercicioPeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setVisible(!isVisible);
			this.jPanelAccionesProcesoCambiarEjercicioPeriodo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCambiarEjercicioPeriodo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCambiarEjercicioPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCambiarEjercicioPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCambiarEjercicioPeriodo();
			
			this.abrirFrameOrderByProcesoCambiarEjercicioPeriodo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCambiarEjercicioPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCambiarEjercicioPeriodo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setSize(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.getWidth(),ProcesoCambiarEjercicioPeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.getWidth(),ProcesoCambiarEjercicioPeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jContentPaneDetalleProcesoCambiarEjercicioPeriodo.getWidth(),ProcesoCambiarEjercicioPeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCambiarEjercicioPeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo);
				this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setVisible(false);
				this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCambiarEjercicioPeriodo"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCambiarEjercicioPeriodo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCambiarEjercicioPeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo==null) {
				
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo=new ImportacionJInternalFrame(ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo);
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setVisible(false);
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setSelected(false);


				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCambiarEjercicioPeriodo"));
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCambiarEjercicioPeriodo"));
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCambiarEjercicioPeriodo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCambiarEjercicioPeriodo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo==null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo=new ReporteDinamicoJInternalFrame(ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo);
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCambiarEjercicioPeriodo"));
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCambiarEjercicioPeriodo"));
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCambiarEjercicioPeriodo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCambiarEjercicioPeriodo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo);
			
	       	this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.dispose();
			//this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCambiarEjercicioPeriodo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCambiarEjercicioPeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setVisible(true);
	        this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCambiarEjercicioPeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setVisible(true);
	        this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCambiarEjercicioPeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setVisible(false);
	        this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCambiarEjercicioPeriodo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCambiarEjercicioPeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setVisible(false);
	        this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCambiarEjercicioPeriodo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCambiarEjercicioPeriodo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCambiarEjercicioPeriodo(true);
			//this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCambiarEjercicioPeriodo(false) ;
			
			if(procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCambiarEjercicioPeriodo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCambiarEjercicioPeriodo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCambiarEjercicioPeriodo(true);
			//this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocambiarejercicioperiodo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCambiarEjercicioPeriodo(false) ;
			
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCambiarEjercicioPeriodo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCambiarEjercicioPeriodo(false);
			
			//if(!this.isEsNuevoProcesoCambiarEjercicioPeriodo) {								
				int intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
				
			}
			
			if(this.permiteMantenimiento(this.procesocambiarejercicioperiodo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCambiarEjercicioPeriodo=true;
					this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
					this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCambiarEjercicioPeriodo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCambiarEjercicioPeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo(false);
				
				this.habilitarDeshabilitarControlesProcesoCambiarEjercicioPeriodo(false);
			
												
				
				if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCambiarEjercicioPeriodo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCambiarEjercicioPeriodo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocambiarejercicioperiodo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				this.procesocambiarejercicioperiodo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				this.procesocambiarejercicioperiodo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocambiarejercicioperiodo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCambiarEjercicioPeriodoModel) this.jTableDatosProcesoCambiarEjercicioPeriodo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCambiarEjercicioPeriodo=true;
				this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
				this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCambiarEjercicioPeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo(false);
				
				this.habilitarDeshabilitarControlesProcesoCambiarEjercicioPeriodo(false);
				
				
				
				if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCambiarEjercicioPeriodo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCambiarEjercicioPeriodo.getRowCount()>=1) {
				jTableDatosProcesoCambiarEjercicioPeriodo.removeRowSelectionInterval(0, jTableDatosProcesoCambiarEjercicioPeriodo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCambiarEjercicioPeriodo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCambiarEjercicioPeriodo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo(false) ;
			
			this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;
			
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCambiarEjercicioPeriodo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
				
				//SI ES MANUAL
				if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCambiarEjercicioPeriodo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCambiarEjercicioPeriodo--;			
			//ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux= new ProcesoCambiarEjercicioPeriodo();			
			//procesocambiarejercicioperiodoAux.setId(this.iIdNuevoProcesoCambiarEjercicioPeriodo);
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCambiarEjercicioPeriodo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
			
			this.procesocambiarejercicioperiodo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().add(this.procesocambiarejercicioperiodoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocambiarejercicioperiodos.add(this.procesocambiarejercicioperiodoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
			
			this.jTableDatosProcesoCambiarEjercicioPeriodo.setRowSelectionInterval(this.getIndiceNuevoProcesoCambiarEjercicioPeriodo(), this.getIndiceNuevoProcesoCambiarEjercicioPeriodo());
			
			int iLastRow =  this.jTableDatosProcesoCambiarEjercicioPeriodo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCambiarEjercicioPeriodo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCambiarEjercicioPeriodo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCambiarEjercicioPeriodo();
			}
			
			//this.abrirFrameTreeProcesoCambiarEjercicioPeriodo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setFileImportacion(this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCambiarEjercicioPeriodo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();		

		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCambiarEjercicioPeriodoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCambiarEjercicioPeriodoBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCambiarEjercicioPeriodos("Todos",procesocambiarejercicioperiodosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
									
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
		
		if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
								
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
								
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
									
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();		
		
		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarejercicioperiodo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCambiarEjercicioPeriodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA);
					iRow++;

					for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo:procesocambiarejercicioperiodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocambiarejercicioperiodo.getfecha_sistema());
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
			//	this.getFilaCabeceraExportarExcelProcesoCambiarEjercicioPeriodo(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoCambiarEjercicioPeriodo(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCambiarEjercicioPeriodo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCambiarEjercicioPeriodo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
			
			//SI ES MANUAL
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCambiarEjercicioPeriodo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCambiarEjercicioPeriodo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCambiarEjercicioPeriodo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCambiarEjercicioPeriodo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCambiarEjercicioPeriodo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCambiarEjercicioPeriodo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCambiarEjercicioPeriodo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCambiarEjercicioPeriodo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarEjercicioPeriodo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCambiarEjercicioPeriodo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCambiarEjercicioPeriodo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo();
		
		this.inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCambiarEjercicioPeriodo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarEjercicioPeriodo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCambiarEjercicioPeriodo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCambiarEjercicioPeriodo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jCheckBoxPostAccionNuevoProcesoCambiarEjercicioPeriodo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jCheckBoxPostAccionSinCerrarProcesoCambiarEjercicioPeriodo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jCheckBoxPostAccionSinMensajeProcesoCambiarEjercicioPeriodo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCambiarEjercicioPeriodo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
				this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jCheckBoxPostAccionNuevoProcesoCambiarEjercicioPeriodo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jCheckBoxPostAccionSinCerrarProcesoCambiarEjercicioPeriodo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jCheckBoxPostAccionSinMensajeProcesoCambiarEjercicioPeriodo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCambiarEjercicioPeriodo(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCambiarEjercicioPeriodo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCambiarEjercicioPeriodo() throws Exception {
		try	{
			if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCambiarEjercicioPeriodo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCambiarEjercicioPeriodo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCambiarEjercicioPeriodo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCambiarEjercicioPeriodo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCambiarEjercicioPeriodo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCambiarEjercicioPeriodo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.addItem(reporte);
			}
			
			
			if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCambiarEjercicioPeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCambiarEjercicioPeriodo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCambiarEjercicioPeriodo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo!=null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo!=null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCambiarEjercicioPeriodo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_sistemaBusquedaProcesoCambiarEjercicioPeriodo=new Date(this.jDateChooserfecha_sistemaBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCambiarEjercicioPeriodo(Boolean esInicializar) throws Exception {				
		if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCambiarEjercicioPeriodo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCambiarEjercicioPeriodo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCambiarEjercicioPeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCambiarEjercicioPeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCambiarEjercicioPeriodoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEjercicioPeriodoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCambiarEjercicioPeriodoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCambiarEjercicioPeriodoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocambiarejercicioperiodos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCambiarEjercicioPeriodo.setModel(new ProcesoCambiarEjercicioPeriodoModel(this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCambiarEjercicioPeriodo.setModel(new ProcesoCambiarEjercicioPeriodoModel(this.procesocambiarejercicioperiodos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo!=null && this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCambiarEjercicioPeriodo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEjercicioPeriodo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCambiarEjercicioPeriodoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO,procesocambiarejercicioperiodoConstantesFunciones.resaltarSeleccionarProcesoCambiarEjercicioPeriodo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCambiarEjercicioPeriodoConstantesFunciones.SCLASSWEBTITULO,procesocambiarejercicioperiodoConstantesFunciones.resaltarSeleccionarProcesoCambiarEjercicioPeriodo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEjercicioPeriodo,ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_ID));

		if(this.procesocambiarejercicioperiodoConstantesFunciones.mostraridProcesoCambiarEjercicioPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocambiarejercicioperiodoConstantesFunciones.resaltaridProcesoCambiarEjercicioPeriodo,this.procesocambiarejercicioperiodoConstantesFunciones.activaridProcesoCambiarEjercicioPeriodo,this,true,"idProcesoCambiarEjercicioPeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocambiarejercicioperiodoConstantesFunciones.resaltaridProcesoCambiarEjercicioPeriodo,this.procesocambiarejercicioperiodoConstantesFunciones.activaridProcesoCambiarEjercicioPeriodo,this,true,"idProcesoCambiarEjercicioPeriodo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCambiarEjercicioPeriodo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCambiarEjercicioPeriodo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCambiarEjercicioPeriodo.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCambiarEjercicioPeriodo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCambiarEjercicioPeriodo.moveColumn(this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCambiarEjercicioPeriodo.moveColumn(this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCambiarEjercicioPeriodo.moveColumn(this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCambiarEjercicioPeriodo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCambiarEjercicioPeriodo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCambiarEjercicioPeriodo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCambiarEjercicioPeriodo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocambiarejercicioperiodos.size()-1;
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
		//this.jTableDatosProcesoCambiarEjercicioPeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCambiarEjercicioPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCambiarEjercicioPeriodo();
			
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
				
				//this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;
					
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
				if(this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocambiarejercicioperiodo.getsType().equals("DUPLICADO")
				   || this.procesocambiarejercicioperiodo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCambiarEjercicioPeriodo=true;
				
				} else {
					this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocambiarejercicioperiodo.getId()>=0 && !this.procesocambiarejercicioperiodo.getIsNew()) {						
						this.isEsNuevoProcesoCambiarEjercicioPeriodo=false;
						
					} else {
						this.isEsNuevoProcesoCambiarEjercicioPeriodo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCambiarEjercicioPeriodo(esRelaciones);						
				
				this.seleccionarProcesoCambiarEjercicioPeriodo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocambiarejercicioperiodo.getId()<0) {
					this.isEsNuevoProcesoCambiarEjercicioPeriodo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCambiarEjercicioPeriodo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCambiarEjercicioPeriodo(evt,rowIndex);
				}	
				
				if(this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCambiarEjercicioPeriodo: " + this.dDif); 
					}
				}								
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCambiarEjercicioPeriodo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocambiarejercicioperiodo)) {
					if(this.procesocambiarejercicioperiodo.getId()>0) {
						this.procesocambiarejercicioperiodo.setIsDeleted(true);
						
						this.procesocambiarejercicioperiodosEliminados.add(this.procesocambiarejercicioperiodo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().remove(this.procesocambiarejercicioperiodo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocambiarejercicioperiodos.remove(this.procesocambiarejercicioperiodo);				
					}
					
					
					((ProcesoCambiarEjercicioPeriodoModel) this.jTableDatosProcesoCambiarEjercicioPeriodo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCambiarEjercicioPeriodo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCambiarEjercicioPeriodo) {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCambiarEjercicioPeriodo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodo);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.setText(procesocambiarejercicioperiodo.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocambiarejercicioperiodoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocambiarejercicioperiodoLocal=this.procesocambiarejercicioperiodo;
			} else {
				procesocambiarejercicioperiodoLocal=this.procesocambiarejercicioperiodoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocambiarejercicioperiodoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodoLocal,true);
					
					if(procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocambiarejercicioperiodoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocambiarejercicioperiodoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodo);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.getText()==null || this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.getText()=="" || this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.setText("0");
			}

			if(conColumnasBase) {procesocambiarejercicioperiodo.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelIdProcesoCambiarEjercicioPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoBean,ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoOrigen,ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocambiarejercicioperiodoOrigen.getId()!=null && !procesocambiarejercicioperiodoOrigen.getId().equals(0L))) {procesocambiarejercicioperiodo.setId(procesocambiarejercicioperiodoOrigen.getId());}}
			if(conDefault || (!conDefault && procesocambiarejercicioperiodoOrigen.getfecha_sistema()!=null && !procesocambiarejercicioperiodoOrigen.getfecha_sistema().equals(new Date()))) {procesocambiarejercicioperiodo.setfecha_sistema(procesocambiarejercicioperiodoOrigen.getfecha_sistema());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.setText(procesocambiarejercicioperiodo.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodoBean procesocambiarejercicioperiodoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.setText(procesocambiarejercicioperiodoBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodoParameterReturnGeneral procesocambiarejercicioperiodoReturnGeneral,ProcesoCambiarEjercicioPeriodoBean procesocambiarejercicioperiodoBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoLocal=new ProcesoCambiarEjercicioPeriodo();
			
			procesocambiarejercicioperiodoLocal=procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocambiarejercicioperiodoLocal.getId()!=null && !procesocambiarejercicioperiodoLocal.getId().equals(0L))) {procesocambiarejercicioperiodoBean.setId(procesocambiarejercicioperiodoLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCambiarEjercicioPeriodoGenerico(Long idProcesoCambiarEjercicioPeriodoSeleccionado,JComboBox jComboBoxProcesoCambiarEjercicioPeriodo,List<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosLocal)throws Exception {
		try {
			ProcesoCambiarEjercicioPeriodo  procesocambiarejercicioperiodoTemp=null;

			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodosLocal) {
				if(procesocambiarejercicioperiodoAux.getId()!=null && procesocambiarejercicioperiodoAux.getId().equals(idProcesoCambiarEjercicioPeriodoSeleccionado)) {
					procesocambiarejercicioperiodoTemp=procesocambiarejercicioperiodoAux;
					break;
				}
			}

			jComboBoxProcesoCambiarEjercicioPeriodo.setSelectedItem(procesocambiarejercicioperiodoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCambiarEjercicioPeriodoGenerico(JComboBox jComboBoxProcesoCambiarEjercicioPeriodo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCambiarEjercicioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCambiarEjercicioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCambiarEjercicioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCambiarEjercicioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCambiarEjercicioPeriodo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCambiarEjercicioPeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCambiarEjercicioPeriodo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCambiarEjercicioPeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCambiarEjercicioPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCambiarEjercicioPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocambiarejercicioperiodo=(ProcesoCambiarEjercicioPeriodo) procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) procesocambiarejercicioperiodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoRow=new ProcesoCambiarEjercicioPeriodo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocambiarejercicioperiodoRow=(ProcesoCambiarEjercicioPeriodo) procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocambiarejercicioperiodoRow=(ProcesoCambiarEjercicioPeriodo) procesocambiarejercicioperiodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo && this.isPermisoNuevoProcesoCambiarEjercicioPeriodo));			
			this.jButtonDuplicarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo && this.isPermisoDuplicarProcesoCambiarEjercicioPeriodo));			
			this.jButtonCopiarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo && this.isPermisoCopiarProcesoCambiarEjercicioPeriodo));
			this.jButtonVerFormProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo && this.isPermisoVerFormProcesoCambiarEjercicioPeriodo));
			
			this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo && this.isPermisoOrdenProcesoCambiarEjercicioPeriodo));			
			
			this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo && this.isPermisoNuevoProcesoCambiarEjercicioPeriodo));			
			this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo && this.isPermisoNuevoProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonModificarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo && this.isPermisoActualizarProcesoCambiarEjercicioPeriodo));	
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo && this.isPermisoActualizarProcesoCambiarEjercicioPeriodo));	
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo && this.isPermisoEliminarProcesoCambiarEjercicioPeriodo));
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarProcesoCambiarEjercicioPeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo);							
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo && this.isPermisoNuevoProcesoCambiarEjercicioPeriodo));						
			this.jButtonDuplicarToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo && this.isPermisoDuplicarProcesoCambiarEjercicioPeriodo));						
			this.jButtonCopiarToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo && this.isPermisoCopiarProcesoCambiarEjercicioPeriodo));			
			this.jButtonVerFormToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo && this.isPermisoVerFormProcesoCambiarEjercicioPeriodo));			
			this.jButtonAbrirOrderByToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo && this.isPermisoOrdenProcesoCambiarEjercicioPeriodo));
			this.jButtonNuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo && this.isPermisoNuevoProcesoCambiarEjercicioPeriodo));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo && this.isPermisoNuevoProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));			
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonModificarToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo && this.isPermisoActualizarProcesoCambiarEjercicioPeriodo));	
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo  && this.isPermisoActualizarProcesoCambiarEjercicioPeriodo));	
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo && this.isPermisoEliminarProcesoCambiarEjercicioPeriodo));
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo);				
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo && this.isPermisoNuevoProcesoCambiarEjercicioPeriodo));			
			this.jMenuItemDuplicarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo && this.isPermisoDuplicarProcesoCambiarEjercicioPeriodo));			
			this.jMenuItemCopiarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo && this.isPermisoCopiarProcesoCambiarEjercicioPeriodo));			
			this.jMenuItemVerFormProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo && this.isPermisoVerFormProcesoCambiarEjercicioPeriodo));			
			this.jMenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo && this.isPermisoOrdenProcesoCambiarEjercicioPeriodo));			
			//this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo && this.isPermisoOrdenProcesoCambiarEjercicioPeriodo));
			this.jMenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo && this.isPermisoOrdenProcesoCambiarEjercicioPeriodo));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo && this.isPermisoOrdenProcesoCambiarEjercicioPeriodo));			
			this.jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo && this.isPermisoNuevoProcesoCambiarEjercicioPeriodo));			
			this.jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo && this.isPermisoNuevoProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));									
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemModificarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo && this.isPermisoActualizarProcesoCambiarEjercicioPeriodo));	
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemActualizarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo && this.isPermisoActualizarProcesoCambiarEjercicioPeriodo));	
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemEliminarProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo && this.isPermisoEliminarProcesoCambiarEjercicioPeriodo));
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemCancelarProcesoCambiarEjercicioPeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));						
			this.jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=this.jButtonNuevoProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo=this.jButtonDuplicarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo=this.jButtonCopiarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo=this.jButtonVerFormProcesoCambiarEjercicioPeriodo.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCambiarEjercicioPeriodo=this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=this.jButtonModificarProcesoCambiarEjercicioPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=this.jButtonNuevoToolBarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=this.jButtonNuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonModificarToolBarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=this.jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=this.jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemModificarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemActualizarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemEliminarProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemCancelarProcesoCambiarEjercicioPeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=this.jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCambiarEjercicioPeriodo(Boolean esInicializar) {
		if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCambiarEjercicioPeriodo();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCambiarEjercicioPeriodo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCambiarEjercicioPeriodo() {
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoNuevoProcesoCambiarEjercicioPeriodo);			
		this.jButtonDuplicarProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoDuplicarProcesoCambiarEjercicioPeriodo);			
		this.jButtonCopiarProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoCopiarProcesoCambiarEjercicioPeriodo);			
		this.jButtonVerFormProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoVerFormProcesoCambiarEjercicioPeriodo);			
		
		this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoOrdenProcesoCambiarEjercicioPeriodo);					
		
		this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoNuevoProcesoCambiarEjercicioPeriodo);			
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonModificarProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoActualizarProcesoCambiarEjercicioPeriodo);	
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoActualizarProcesoCambiarEjercicioPeriodo);	
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoEliminarProcesoCambiarEjercicioPeriodo);
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarProcesoCambiarEjercicioPeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo);						
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoActualizarProcesoCambiarEjercicioPeriodo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCambiarEjercicioPeriodo() {
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonModificarProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoActualizarProcesoCambiarEjercicioPeriodo);	
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoActualizarProcesoCambiarEjercicioPeriodo);	
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarProcesoCambiarEjercicioPeriodo.setVisible(this.isPermisoEliminarProcesoCambiarEjercicioPeriodo);
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarProcesoCambiarEjercicioPeriodo.setVisible(this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo);							
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.setVisible((this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo && this.isPermisoGuardarCambiosProcesoCambiarEjercicioPeriodo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCambiarEjercicioPeriodo() {
		if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCambiarEjercicioPeriodo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCambiarEjercicioPeriodo() {
	}
	
	public void jTableDatosProcesoCambiarEjercicioPeriodoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCambiarEjercicioPeriodo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCambiarEjercicioPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(this.getprocesocambiarejercicioperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarejercicioperiodo==null) {
						this.procesocambiarejercicioperiodo = new ProcesoCambiarEjercicioPeriodo();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
				}

				if(this.procesocambiarejercicioperiodo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocambiarejercicioperiodo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(this.getprocesocambiarejercicioperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocambiarejercicioperiodo==null) {
						this.procesocambiarejercicioperiodo = new ProcesoCambiarEjercicioPeriodo();
					}

					this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);
				}

				if(this.procesocambiarejercicioperiodo.getfecha_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_sistema = '"+Funciones2.getStringPostgresDate(this.procesocambiarejercicioperiodo.getfecha_sistema())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false,false);

			this.getProcesoCambiarEjercicioPeriodosBusquedaProcesoCambiarEjercicioPeriodo();

			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);

			//if(ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocambiarejercicioperiodoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCambiarEjercicioPeriodo() {
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.dispose();
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo!=null) {
			this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.dispose();
			this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo!=null) {
			this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.dispose();
			this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCambiarEjercicioPeriodo();
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCambiarEjercicioPeriodo")) {
				jButtonDuplicarProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCambiarEjercicioPeriodo")) {
				jButtonCopiarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCambiarEjercicioPeriodo")) {
				jButtonVerFormProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonDuplicarProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCambiarEjercicioPeriodo")) {
				jButtonDuplicarProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCambiarEjercicioPeriodo")) {
				jButtonModificarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonModificarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCambiarEjercicioPeriodo")) {
				jButtonModificarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCambiarEjercicioPeriodo")) {
				jButtonActualizarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonActualizarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCambiarEjercicioPeriodo")) {
				jButtonActualizarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCambiarEjercicioPeriodo")) {
				jButtonEliminarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonEliminarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCambiarEjercicioPeriodo")) {
				jButtonEliminarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCambiarEjercicioPeriodo")) {
				jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCambiarEjercicioPeriodo")) {
				jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCambiarEjercicioPeriodo")) {
				jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCambiarEjercicioPeriodo")) {
				jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonMostrarOcultarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo")) {
				jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCambiarEjercicioPeriodo")) {
				jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonCopiarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonVerFormProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo")) {
				jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCambiarEjercicioPeriodo")) {
				jButtonCopiarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCambiarEjercicioPeriodo")) {
				jButtonVerFormProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCambiarEjercicioPeriodo")) {
				jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo")) {
				jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCambiarEjercicioPeriodo")) {
				jButtonRecargarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonRecargarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo")) {
				jButtonRecargarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCambiarEjercicioPeriodo")) {
				jButtonAnterioresProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonAnterioresProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCambiarEjercicioPeriodo")) {
				jButtonAnterioresProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCambiarEjercicioPeriodo")) {
				jButtonSiguientesProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonSiguientesProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCambiarEjercicioPeriodo")) {
				jButtonSiguientesProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo")) {
				jButtonAbrirOrderByProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCambiarEjercicioPeriodo")) {
				jButtonMostrarOcultarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoCambiarEjercicioPeriodo")) {
				jButtonProcesarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCambiarEjercicioPeriodo")) {
				jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCambiarEjercicioPeriodo")) {
				jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCambiarEjercicioPeriodo")) {
				jButtonCerrarImportacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCambiarEjercicioPeriodo")) {
				
				jButtonGenerarImportacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCambiarEjercicioPeriodo")) {
				
				jButtonAbrirImportacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCambiarEjercicioPeriodo")) {
				jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCambiarEjercicioPeriodo")) {
				jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCambiarEjercicioPeriodo")) {
				jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCambiarEjercicioPeriodo")) {
				
				jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCambiarEjercicioPeriodo")) {
				jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCambiarEjercicioPeriodo")) {
				jButtonAbrirOrderByProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCambiarEjercicioPeriodo")) {
				jButtonAbrirOrderByProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCambiarEjercicioPeriodo")) {
				jButtonCerrarOrderByProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCambiarEjercicioPeriodoBusqueda")) {
				this.jButtonidProcesoCambiarEjercicioPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda")) {
				this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo")) {
				this.jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCambiarEjercicioPeriodo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				


				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocambiarejercicioperiodoLocal=this.procesocambiarejercicioperiodo;
			} else {
				procesocambiarejercicioperiodoLocal=this.procesocambiarejercicioperiodoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
							
				
				


				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
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
			
			


			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
								
						
				


				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
								
				
				


				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
							
				
				


				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
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
			
			


			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
								
				
				


				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCambiarEjercicioPeriodo")) {
					jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCambiarEjercicioPeriodo")) {
					jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCambiarEjercicioPeriodo")) {
					
				}
				
				


				
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
												
				
				


				
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
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
			
			


			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocambiarejercicioperiodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocambiarejercicioperiodo);
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
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
				
				


				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCambiarEjercicioPeriodo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCambiarEjercicioPeriodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCambiarEjercicioPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocambiarejercicioperiodoAnterior =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCambiarEjercicioPeriodo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCambiarEjercicioPeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocambiarejercicioperiodo =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocambiarejercicioperiodo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCambiarEjercicioPeriodo")) {
				
				}
				
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCambiarEjercicioPeriodo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCambiarEjercicioPeriodo")) {
			
			}
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCambiarEjercicioPeriodo();
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCambiarEjercicioPeriodo")) {
				jButtonDuplicarProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCambiarEjercicioPeriodo")) {
				jButtonCopiarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCambiarEjercicioPeriodo")) {
				jButtonVerFormProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCambiarEjercicioPeriodo")) {
				jButtonModificarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCambiarEjercicioPeriodo")) {
				jButtonActualizarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCambiarEjercicioPeriodo")) {
				jButtonEliminarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCambiarEjercicioPeriodo")) {
				jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCambiarEjercicioPeriodo")) {
				jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCambiarEjercicioPeriodo")) {
				jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCambiarEjercicioPeriodo")) {
				jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCambiarEjercicioPeriodo")) {
				jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCambiarEjercicioPeriodo")) {
				jButtonAbrirOrderByProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCambiarEjercicioPeriodo")) {
				jButtonRecargarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCambiarEjercicioPeriodo")) {
				jButtonAnterioresProcesoCambiarEjercicioPeriodoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCambiarEjercicioPeriodo")) {
				jButtonSiguientesProcesoCambiarEjercicioPeriodoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCambiarEjercicioPeriodoBusqueda")) {
				this.jButtonidProcesoCambiarEjercicioPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda")) {
				this.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusquedaActionPerformed(evt);
			}
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCambiarEjercicioPeriodo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCambiarEjercicioPeriodo")) {
				closingInternalFrameProcesoCambiarEjercicioPeriodo();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCambiarEjercicioPeriodo")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(null);
			}
			
			ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocambiarejercicioperiodo,new Object(),this.procesocambiarejercicioperiodoParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCambiarEjercicioPeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCambiarEjercicioPeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCambiarEjercicioPeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocambiarejercicioperiodo)) {
			if(!esControlTabla) {
				if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);			
				}
				
				if(this.procesocambiarejercicioperiodoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoReturnGeneral,this.procesocambiarejercicioperiodoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocambiarejercicioperiodoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCambiarEjercicioPeriodo(classes,this.procesocambiarejercicioperiodoReturnGeneral,this.procesocambiarejercicioperiodoBean,false);
					}
						
					if(this.procesocambiarejercicioperiodoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodo());	
					}
						
					if(this.procesocambiarejercicioperiodoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodo(),classes);//this.procesocambiarejercicioperiodoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo,classes);//this.procesocambiarejercicioperiodoBean);									
				}
			
				if(ProcesoCambiarEjercicioPeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCambiarEjercicioPeriodo(this.procesocambiarejercicioperiodo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocambiarejercicioperiodoAnterior!=null) {
						this.procesocambiarejercicioperiodo=this.procesocambiarejercicioperiodoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocambiarejercicioperiodoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodo(),procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodo(),this.procesocambiarejercicioperiodos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCambiarEjercicioPeriodo.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCambiarEjercicioPeriodo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCambiarEjercicioPeriodo();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCambiarEjercicioPeriodo() throws Exception {
		
		ProcesoCambiarEjercicioPeriodoModel procesocambiarejercicioperiodoModel=(ProcesoCambiarEjercicioPeriodoModel)this.jTableDatosProcesoCambiarEjercicioPeriodo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocambiarejercicioperiodoModel.procesocambiarejercicioperiodos=this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocambiarejercicioperiodoModel.procesocambiarejercicioperiodos=this.procesocambiarejercicioperiodos;
		}
		
		
		((ProcesoCambiarEjercicioPeriodoModel) this.jTableDatosProcesoCambiarEjercicioPeriodo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCambiarEjercicioPeriodo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocambiarejercicioperiodoAnterior(),this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocambiarejercicioperiodoAnterior(),this.procesocambiarejercicioperiodos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCambiarEjercicioPeriodo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
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
										
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocambiarejercicioperiodo,new Object(),generalEntityParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getClassesRelationshipsOfProcesoCambiarEjercicioPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCambiarEjercicioPeriodoConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCambiarEjercicioPeriodo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCambiarEjercicioPeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocambiarejercicioperiodo,new Object(),generalEntityParameterGeneral,this.procesocambiarejercicioperiodoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodoBean procesocambiarejercicioperiodoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCambiarEjercicioPeriodo(ArrayList<Classe> classes,ProcesoCambiarEjercicioPeriodoReturnGeneral procesocambiarejercicioperiodoReturnGeneral,ProcesoCambiarEjercicioPeriodoBean procesocambiarejercicioperiodoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocambiarejercicioperiodo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo = new ProcesoCambiarEjercicioPeriodoDetalleFormJInternalFrame(jDesktopPane,this.procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones(),this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo);
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.procesocambiarejercicioperiodoLogic=this.procesocambiarejercicioperiodoLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCambiarEjercicioPeriodo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCambiarEjercicioPeriodo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCambiarEjercicioPeriodo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCambiarEjercicioPeriodo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCambiarEjercicioPeriodo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCambiarEjercicioPeriodo"));
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonModificarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"ModificarProcesoCambiarEjercicioPeriodo"));

		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonModificarToolBarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCambiarEjercicioPeriodo"));
					
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemModificarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCambiarEjercicioPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCambiarEjercicioPeriodo"));
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCambiarEjercicioPeriodo"));
						
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemActualizarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCambiarEjercicioPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"EliminarProcesoCambiarEjercicioPeriodo"));
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCambiarEjercicioPeriodo"));
								
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemEliminarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCambiarEjercicioPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"CancelarProcesoCambiarEjercicioPeriodo"));
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCambiarEjercicioPeriodo"));
					
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemCancelarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCambiarEjercicioPeriodo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCambiarEjercicioPeriodo"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCambiarEjercicioPeriodo"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCambiarEjercicioPeriodo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonidProcesoCambiarEjercicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCambiarEjercicioPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCambiarEjercicioPeriodo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCambiarEjercicioPeriodo"));
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCambiarEjercicioPeriodo"));
		}
		
		this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCambiarEjercicioPeriodo"));
		
		this.jTableDatosProcesoCambiarEjercicioPeriodo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCambiarEjercicioPeriodo"));
		
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"NuevoProcesoCambiarEjercicioPeriodo"));
		
		this.jButtonDuplicarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCambiarEjercicioPeriodo"));
		
		this.jButtonCopiarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"CopiarProcesoCambiarEjercicioPeriodo"));
		
		this.jButtonVerFormProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"VerFormProcesoCambiarEjercicioPeriodo"));
		
		
		this.jButtonNuevoToolBarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCambiarEjercicioPeriodo"));
			
		this.jButtonDuplicarToolBarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemDuplicarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCambiarEjercicioPeriodo"));		
		
		
		this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCambiarEjercicioPeriodo"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonModificarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"ModificarProcesoCambiarEjercicioPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonModificarToolBarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCambiarEjercicioPeriodo"));
			
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemModificarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCambiarEjercicioPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCambiarEjercicioPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCambiarEjercicioPeriodo"));
				
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemActualizarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCambiarEjercicioPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"EliminarProcesoCambiarEjercicioPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCambiarEjercicioPeriodo"));
						
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemEliminarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCambiarEjercicioPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"CancelarProcesoCambiarEjercicioPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCambiarEjercicioPeriodo"));
			
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemCancelarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCambiarEjercicioPeriodo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCambiarEjercicioPeriodo"));		
		
		
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"CerrarProcesoCambiarEjercicioPeriodo"));
		
		
		this.jButtonCerrarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCambiarEjercicioPeriodo"));
			
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCambiarEjercicioPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCambiarEjercicioPeriodo"));
		}
		
		this.jButtonCopiarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCambiarEjercicioPeriodo"));
			
		this.jButtonVerFormToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCambiarEjercicioPeriodo"));
		
		this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemCopiarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCambiarEjercicioPeriodo"));		
		
		this.jMenuItemVerFormProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCambiarEjercicioPeriodo"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCambiarEjercicioPeriodo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCambiarEjercicioPeriodo"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCambiarEjercicioPeriodo"));
					
		this.jButtonRecargarInformacionToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCambiarEjercicioPeriodo"));
		
		this.jMenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo"));		
		
		
		
		this.jButtonAnterioresProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCambiarEjercicioPeriodo"));
		
		
		this.jButtonAnterioresToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCambiarEjercicioPeriodo"));
		
		this.jMenuItemAnterioresProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCambiarEjercicioPeriodo"));		
		
		
		this.jButtonSiguientesProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCambiarEjercicioPeriodo"));
		
		
		this.jButtonSiguientesToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemSiguientesProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCambiarEjercicioPeriodo"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCambiarEjercicioPeriodo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo"));		
		
		
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoCambiarEjercicioPeriodo"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCambiarEjercicioPeriodo"));

		this.jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCambiarEjercicioPeriodo"));
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCambiarEjercicioPeriodo"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCambiarEjercicioPeriodo"));
			
		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCambiarEjercicioPeriodo"));
					
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCambiarEjercicioPeriodo"));
			
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCambiarEjercicioPeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonidProcesoCambiarEjercicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCambiarEjercicioPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo!=null) {
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCambiarEjercicioPeriodo"));
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCambiarEjercicioPeriodo"));
				this.jInternalFrameReporteDinamicoProcesoCambiarEjercicioPeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCambiarEjercicioPeriodo"));				
			//this.jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCambiarEjercicioPeriodo"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo!=null) {
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCambiarEjercicioPeriodo"));
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCambiarEjercicioPeriodo"));
				this.jInternalFrameImportacionProcesoCambiarEjercicioPeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCambiarEjercicioPeriodo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCambiarEjercicioPeriodo"));
			
			this.jButtonAbrirOrderByToolBarProcesoCambiarEjercicioPeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCambiarEjercicioPeriodo"));			
			
			if(this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo!=null) {
				this.jInternalFrameOrderByProcesoCambiarEjercicioPeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCambiarEjercicioPeriodo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jTabbedPaneRelacionesProcesoCambiarEjercicioPeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCambiarEjercicioPeriodo"));
		
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
            		closingInternalFrameProcesoCambiarEjercicioPeriodo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCambiarEjercicioPeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCambiarEjercicioPeriodo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonNuevoProcesoCambiarEjercicioPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCambiarEjercicioPeriodoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonModificarProcesoCambiarEjercicioPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCambiarEjercicioPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonActualizarProcesoCambiarEjercicioPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCambiarEjercicioPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonEliminarProcesoCambiarEjercicioPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCambiarEjercicioPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonCancelarProcesoCambiarEjercicioPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCambiarEjercicioPeriodo";
		inputMap = this.jButtonCerrarProcesoCambiarEjercicioPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCambiarEjercicioPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCambiarEjercicioPeriodo";
		inputMap = this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonGuardarCambiosProcesoCambiarEjercicioPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonidProcesoCambiarEjercicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCambiarEjercicioPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jButtonfecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_sistemaProcesoCambiarEjercicioPeriodoBusqueda"));
		
		
		this.jButtonBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCambiarEjercicioPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCambiarEjercicioPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCambiarEjercicioPeriodo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCambiarEjercicioPeriodo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
					procesocambiarejercicioperiodoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodos) {
					procesocambiarejercicioperiodoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCambiarEjercicioPeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
						procesocambiarejercicioperiodoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodos) {
						procesocambiarejercicioperiodoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCambiarEjercicioPeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCambiarEjercicioPeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEjercicioPeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCambiarEjercicioPeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCambiarEjercicioPeriodo.getSelectedRows();
			
			ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoLocal=new ProcesoCambiarEjercicioPeriodo();
			
			//this.seleccionarTodosProcesoCambiarEjercicioPeriodo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocambiarejercicioperiodoLocal =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos().toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocambiarejercicioperiodoLocal =(ProcesoCambiarEjercicioPeriodo) this.procesocambiarejercicioperiodos.toArray()[this.jTableDatosProcesoCambiarEjercicioPeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocambiarejercicioperiodoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
						procesocambiarejercicioperiodoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodos) {
						procesocambiarejercicioperiodoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCambiarEjercicioPeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCambiarEjercicioPeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCambiarEjercicioPeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCambiarEjercicioPeriodoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCambiarEjercicioPeriodoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCambiarEjercicioPeriodo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
				
						if(sTipoSeleccionar.equals(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA)) {
							existe=true;
							procesocambiarejercicioperiodoAux.setfecha_sistema(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodos) {
					
						if(sTipoSeleccionar.equals(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA)) {
							existe=true;
							procesocambiarejercicioperiodoAux.setfecha_sistema(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCambiarEjercicioPeriodo) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCambiarEjercicioPeriodo(conSplash);
				
					this.generarReporteProcesoCambiarEjercicioPeriodosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCambiarEjercicioPeriodosSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCambiarEjercicioPeriodosSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCambiarEjercicioPeriodosSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCambiarEjercicioPeriodo();
				
				this.exportarProcesoCambiarEjercicioPeriodosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCambiarEjercicioPeriodos();
				//this.importarProcesoCambiarEjercicioPeriodos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCambiarEjercicioPeriodo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCambiarEjercicioPeriodosSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCambiarEjercicioPeriodo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCambiarEjercicioPeriodo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCambiarEjercicioPeriodo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCambiarEjercicioPeriodo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCambiarEjercicioPeriodo(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCambiarEjercicioPeriodo();
						
						this.generarReporteProcesoAccionProcesoCambiarEjercicioPeriodosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Cambiar Ejercicio PeriodoS SELECCIONADOS?", "MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCambiarEjercicioPeriodo();
				
						this.actualizarParametrosGeneralProcesoCambiarEjercicioPeriodo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocambiarejercicioperiodoReturnGeneral=procesocambiarejercicioperiodoLogic.procesarAccionProcesoCambiarEjercicioPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos(),this.procesocambiarejercicioperiodoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCambiarEjercicioPeriodoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCambiarEjercicioPeriodo();
					
					ProcesoCambiarEjercicioPeriodoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCambiarEjercicioPeriodoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jComboBoxTiposAccionesFormularioProcesoCambiarEjercicioPeriodo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCambiarEjercicioPeriodo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCambiarEjercicioPeriodo();
			
			if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();		
			ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo=new ProcesoCambiarEjercicioPeriodo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCambiarEjercicioPeriodo.getSelectedItem();
			
			
			
			
			procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocambiarejercicioperiodosSeleccionados.size()==1) {
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodosSeleccionados) {
					procesocambiarejercicioperiodo=procesocambiarejercicioperiodoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCambiarEjercicioPeriodo();
			
      		//this.finishProcessProcesoCambiarEjercicioPeriodo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCambiarEjercicioPeriodoReturnGeneral() throws Exception {
		if(this.procesocambiarejercicioperiodoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocambiarejercicioperiodoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocambiarejercicioperiodoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocambiarejercicioperiodoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocambiarejercicioperiodoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocambiarejercicioperiodoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
		}
		
		if(this.procesocambiarejercicioperiodoReturnGeneral.getConRetornoLista() || this.procesocambiarejercicioperiodoReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocambiarejercicioperiodoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesocambiarejercicioperiodoLogic.setProcesoCambiarEjercicioPeriodos(this.procesocambiarejercicioperiodoReturnGeneral.getProcesoCambiarEjercicioPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCambiarEjercicioPeriodo(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCambiarEjercicioPeriodo() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCambiarEjercicioPeriodo> getProcesoCambiarEjercicioPeriodosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCambiarEjercicioPeriodo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos()) {
					if(procesocambiarejercicioperiodoAux.getIsSelected()) {
						procesocambiarejercicioperiodosSeleccionados.add(procesocambiarejercicioperiodoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:this.procesocambiarejercicioperiodos) {
					if(procesocambiarejercicioperiodoAux.getIsSelected()) {
						procesocambiarejercicioperiodosSeleccionados.add(procesocambiarejercicioperiodoAux);				
					}
				}
			}
			
			if(procesocambiarejercicioperiodosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocambiarejercicioperiodosSeleccionados.addAll(this.procesocambiarejercicioperiodoLogic.getProcesoCambiarEjercicioPeriodos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocambiarejercicioperiodosSeleccionados.addAll(this.procesocambiarejercicioperiodos);				
					}
				}
			}
		} else {
			procesocambiarejercicioperiodosSeleccionados.add(this.procesocambiarejercicioperiodo);
		}
		
		return procesocambiarejercicioperiodosSeleccionados;
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
	
	public void generarReporteProcesoCambiarEjercicioPeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCambiarEjercicioPeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCambiarEjercicioPeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCambiarEjercicioPeriodosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCambiarEjercicioPeriodosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Cambiar Ejercicio Periodo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCambiarEjercicioPeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();		
		
		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCambiarEjercicioPeriodos("Todos",procesocambiarejercicioperiodosSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCambiarEjercicioPeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();		
		
		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCambiarEjercicioPeriodos("Todos",procesocambiarejercicioperiodosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCambiarEjercicioPeriodosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();
		
		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCambiarEjercicioPeriodos("Todos",procesocambiarejercicioperiodosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCambiarEjercicioPeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCambiarEjercicioPeriodo();
		
		
		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCambiarEjercicioPeriodo();
		
		
		//this.generarReporteProcesoCambiarEjercicioPeriodos("Todos",procesocambiarejercicioperiodosSeleccionados ,procesocambiarejercicioperiodoImplementable,procesocambiarejercicioperiodoImplementableHome);
	}
	
	public void mostrarImportacionProcesoCambiarEjercicioPeriodos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCambiarEjercicioPeriodo();
		
		this.abrirFrameImportacionProcesoCambiarEjercicioPeriodo();		
		
			
		//this.generarReporteProcesoCambiarEjercicioPeriodos("Todos",procesocambiarejercicioperiodosSeleccionados ,procesocambiarejercicioperiodoImplementable,procesocambiarejercicioperiodoImplementableHome);
	}
	
	public void importarProcesoCambiarEjercicioPeriodos() throws Exception {		
	
	}
	
	public void exportarProcesoCambiarEjercicioPeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCambiarEjercicioPeriodosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCambiarEjercicioPeriodosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCambiarEjercicioPeriodosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Cambiar Ejercicio Periodo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCambiarEjercicioPeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();		
		
		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarejercicioperiodo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCambiarEjercicioPeriodo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocambiarejercicioperiodoAux.setsDetalleGeneralEntityReporte(procesocambiarejercicioperiodoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCambiarEjercicioPeriodo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocambiarejercicioperiodo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarejercicioperiodo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocambiarejercicioperiodo.getfecha_sistema().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCambiarEjercicioPeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();		
		
		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarejercicioperiodo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCambiarEjercicioPeriodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCambiarEjercicioPeriodo(row);				
				iRow++;
			}				
			
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCambiarEjercicioPeriodosSeleccionados() throws Exception {
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();		
		
		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocambiarejercicioperiodo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocambiarejercicioperiodos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocambiarejercicioperiodo");
			//elementRoot.appendChild(element);
		
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodosSeleccionados) {
				element = document.createElement("procesocambiarejercicioperiodo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cambiar Ejercicio Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCambiarEjercicioPeriodo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA);
	}
	
	public void getFilaDatosExportarExcelProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarejercicioperiodo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocambiarejercicioperiodo.getfecha_sistema());				
	}
	
	public void setFilaDatosExportarXmlProcesoCambiarEjercicioPeriodo(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCambiarEjercicioPeriodoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocambiarejercicioperiodo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCambiarEjercicioPeriodoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocambiarejercicioperiodo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementfecha_sistema = document.createElement(ProcesoCambiarEjercicioPeriodoConstantesFunciones.FECHASISTEMA);
		elementfecha_sistema.appendChild(document.createTextNode(procesocambiarejercicioperiodo.getfecha_sistema().toString().trim()));
		element.appendChild(elementfecha_sistema);
	}
	
	public void generarReporteGroupGenericoProcesoCambiarEjercicioPeriodosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados=new ArrayList<ProcesoCambiarEjercicioPeriodo>();
		
		procesocambiarejercicioperiodosSeleccionados=this.getProcesoCambiarEjercicioPeriodosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCambiarEjercicioPeriodo(procesocambiarejercicioperiodosSeleccionados);
		
		this.generarReporteProcesoCambiarEjercicioPeriodos("Todos",procesocambiarejercicioperiodosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCambiarEjercicioPeriodo(ArrayList<ProcesoCambiarEjercicioPeriodo> procesocambiarejercicioperiodosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCambiarEjercicioPeriodo procesocambiarejercicioperiodoAux:procesocambiarejercicioperiodosSeleccionados) {
				procesocambiarejercicioperiodoAux.setsDetalleGeneralEntityReporte(procesocambiarejercicioperiodoAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCambiarEjercicioPeriodoConstantesFunciones.LABEL_FECHASISTEMA)) {
					existe=true;
					procesocambiarejercicioperiodoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesocambiarejercicioperiodoAux.getfecha_sistema()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCambiarEjercicioPeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCambiarEjercicioPeriodo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCambiarEjercicioPeriodoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=true;
		} else {
			this.actualizarEstadoPanelsProcesoCambiarEjercicioPeriodo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCambiarEjercicioPeriodo=false;
			//this.isVisibilidadCeldaVerFormProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaDuplicarProcesoCambiarEjercicioPeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			if(!procesocambiarejercicioperiodoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;												
			}
			
			this.jButtonCerrarProcesoCambiarEjercicioPeriodo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocambiarejercicioperiodo)) {
			this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=false;
			this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCambiarEjercicioPeriodo=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCambiarEjercicioPeriodo=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCambiarEjercicioPeriodo=false;
		//this.isVisibilidadCeldaModificarProcesoCambiarEjercicioPeriodo=true;
		this.isVisibilidadCeldaActualizarProcesoCambiarEjercicioPeriodo=false;
		this.isVisibilidadCeldaEliminarProcesoCambiarEjercicioPeriodo=false;
		//this.isVisibilidadCeldaCancelarProcesoCambiarEjercicioPeriodo=true;			
		this.isVisibilidadCeldaGuardarProcesoCambiarEjercicioPeriodo=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCambiarEjercicioPeriodo() {
	}
	
	public void actualizarEstadoPanelsProcesoCambiarEjercicioPeriodo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosEdicionProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo!=null) {
				this.jScrollPanelDatosProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelPaginacionProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo!=null) {
					this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocambiarejercicioperiodoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo!=null) {
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo!=null) {
				this.jPanelParametrosReportesProcesoCambiarEjercicioPeriodo.setVisible(true);
			}
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
			
			this.inicializarActualizarBindingTablaProcesoCambiarEjercicioPeriodo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCambiarEjercicioPeriodo() {
		this.updateBorderResaltarBusquedasFormularioProcesoCambiarEjercicioPeriodo();
		this.updateVisibilidadBusquedasFormularioProcesoCambiarEjercicioPeriodo();
		this.updateHabilitarBusquedasFormularioProcesoCambiarEjercicioPeriodo();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCambiarEjercicioPeriodo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.getComponents().length>0) {
	

		if(this.procesocambiarejercicioperiodoConstantesFunciones.resaltarBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo!=null) {
			index= this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.indexOfComponent(this.jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.getComponent(index);
				jPanel.setBorder(this.procesocambiarejercicioperiodoConstantesFunciones.resaltarBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCambiarEjercicioPeriodo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.indexOfComponent(this.jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocambiarejercicioperiodoConstantesFunciones.mostrarBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);
			if(!this.procesocambiarejercicioperiodoConstantesFunciones.mostrarBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo && index>-1) {
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCambiarEjercicioPeriodo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.indexOfComponent(this.jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocambiarejercicioperiodoConstantesFunciones.activarBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);
				this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setEnabledAt(index,this.procesocambiarejercicioperiodoConstantesFunciones.activarBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCambiarEjercicioPeriodo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCambiarEjercicioPeriodo")) {
			index= this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.indexOfComponent(this.jPanelBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);

			this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCambiarEjercicioPeriodo.getComponent(index);

			this.procesocambiarejercicioperiodoConstantesFunciones.setResaltarBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo(resaltar);

			jPanel.setBorder(this.procesocambiarejercicioperiodoConstantesFunciones.resaltarBusquedaProcesoCambiarEjercicioPeriodoProcesoCambiarEjercicioPeriodo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCambiarEjercicioPeriodo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCambiarEjercicioPeriodo() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCambiarEjercicioPeriodo();
		this.updateVisibilidadResaltarControlesFormularioProcesoCambiarEjercicioPeriodo();
		this.updateHabilitarResaltarControlesFormularioProcesoCambiarEjercicioPeriodo();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCambiarEjercicioPeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocambiarejercicioperiodoConstantesFunciones.resaltaridProcesoCambiarEjercicioPeriodo!=null && this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.setBorder(this.procesocambiarejercicioperiodoConstantesFunciones.resaltaridProcesoCambiarEjercicioPeriodo);}
		if(this.procesocambiarejercicioperiodoConstantesFunciones.resaltarfecha_sistemaProcesoCambiarEjercicioPeriodo!=null && this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setBorder(this.procesocambiarejercicioperiodoConstantesFunciones.resaltarfecha_sistemaProcesoCambiarEjercicioPeriodo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCambiarEjercicioPeriodo() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.setVisible(this.procesocambiarejercicioperiodoConstantesFunciones.mostraridProcesoCambiarEjercicioPeriodo);
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jPanelidProcesoCambiarEjercicioPeriodo.setVisible(this.procesocambiarejercicioperiodoConstantesFunciones.mostraridProcesoCambiarEjercicioPeriodo);
		//this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setVisible(this.procesocambiarejercicioperiodoConstantesFunciones.mostrarfecha_sistemaProcesoCambiarEjercicioPeriodo);
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jPanelfecha_sistemaProcesoCambiarEjercicioPeriodo.setVisible(this.procesocambiarejercicioperiodoConstantesFunciones.mostrarfecha_sistemaProcesoCambiarEjercicioPeriodo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCambiarEjercicioPeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo!=null) {
	
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jLabelidProcesoCambiarEjercicioPeriodo.setEnabled(this.procesocambiarejercicioperiodoConstantesFunciones.activaridProcesoCambiarEjercicioPeriodo);
		this.jInternalFrameDetalleFormProcesoCambiarEjercicioPeriodo.jDateChooserfecha_sistemaProcesoCambiarEjercicioPeriodo.setEnabled(this.procesocambiarejercicioperiodoConstantesFunciones.activarfecha_sistemaProcesoCambiarEjercicioPeriodo);
		}
	}
	
		
}