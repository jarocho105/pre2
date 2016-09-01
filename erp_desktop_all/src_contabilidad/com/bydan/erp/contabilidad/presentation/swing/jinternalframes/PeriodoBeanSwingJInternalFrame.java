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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.PeriodoConstantesFunciones;
import com.bydan.erp.contabilidad.util.PeriodoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PeriodoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PeriodoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class PeriodoBeanSwingJInternalFrame extends PeriodoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PeriodoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Periodo> periodoValidator = new ClassValidator<Periodo>(Periodo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Periodo periodo;	
	public Periodo periodoAux;
	public Periodo periodoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Periodo periodoTotales;
	public Long idPeriodoActual;
	public Long iIdNuevoPeriodo=0L;
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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

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

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
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
	
	public Boolean isPermisoTodoPeriodo;
	public Boolean isPermisoNuevoPeriodo;
	public Boolean isPermisoActualizarPeriodo;
	public Boolean isPermisoActualizarOriginalPeriodo;
	public Boolean isPermisoEliminarPeriodo;
	public Boolean isPermisoGuardarCambiosPeriodo;
	public Boolean isPermisoConsultaPeriodo;
	public Boolean isPermisoBusquedaPeriodo;
	public Boolean isPermisoReportePeriodo;
	public Boolean isPermisoPaginacionMedioPeriodo;
	public Boolean isPermisoPaginacionAltoPeriodo;
	public Boolean isPermisoPaginacionTodoPeriodo;
	public Boolean isPermisoCopiarPeriodo;
	public Boolean isPermisoVerFormPeriodo;
	public Boolean isPermisoDuplicarPeriodo;
	public Boolean isPermisoOrdenPeriodo;
	
	
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
	
	public PeriodoParameterReturnGeneral periodoReturnGeneral;
	public PeriodoParameterReturnGeneral periodoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPeriodo=false;
	public Boolean esParaAccionDesdeFormularioPeriodo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PeriodoSessionBeanAdditional periodoSessionBeanAdditional=null;
	
	public PeriodoSessionBeanAdditional getPeriodoSessionBeanAdditional() {
		return this.periodoSessionBeanAdditional;
	}
	
	public void setPeriodoSessionBeanAdditional(PeriodoSessionBeanAdditional periodoSessionBeanAdditional) {
		try {
			this.periodoSessionBeanAdditional=periodoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PeriodoBeanSwingJInternalFrameAdditional periodoBeanSwingJInternalFrameAdditional=null;
	//public class PeriodoBeanSwingJInternalFrame
	
	public PeriodoBeanSwingJInternalFrameAdditional getPeriodoBeanSwingJInternalFrameAdditional() {
		return this.periodoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPeriodoBeanSwingJInternalFrameAdditional(PeriodoBeanSwingJInternalFrameAdditional periodoBeanSwingJInternalFrameAdditional) {
		try {
			this.periodoBeanSwingJInternalFrameAdditional=periodoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PeriodoLogic periodoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Periodo periodoBean;
	public PeriodoConstantesFunciones periodoConstantesFunciones;
	//public PeriodoParameterReturnGeneral periodoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public AnioLogic anioLogic;
	public EjercicioLogic ejercicioLogic;
	public MesLogic mesLogic;
	public EstadoPeriodoLogic estadoperiodoLogic;
	
	//PARAMETROS
	
	
	//public List<Periodo> periodos;	
	//public List<Periodo> periodosEliminados;
	//public List<Periodo> periodosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPeriodo=false;
	public Boolean isVisibilidadCeldaDuplicarPeriodo=true;
	public Boolean isVisibilidadCeldaCopiarPeriodo=true;
	public Boolean isVisibilidadCeldaVerFormPeriodo=true;
	public Boolean isVisibilidadCeldaOrdenPeriodo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPeriodo=false;
	public Boolean isVisibilidadCeldaModificarPeriodo=false;
	public Boolean isVisibilidadCeldaActualizarPeriodo=false;
	public Boolean isVisibilidadCeldaEliminarPeriodo=false;
	public Boolean isVisibilidadCeldaCancelarPeriodo=false;
	public Boolean isVisibilidadCeldaGuardarPeriodo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPeriodo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdAnioPorIdEjercicio=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoPeriodo=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoPeriodo() {
		return this.iIdNuevoPeriodo;
	}

	public void setiIdNuevoPeriodo(Long iIdNuevoPeriodo) {
		this.iIdNuevoPeriodo = iIdNuevoPeriodo;
	}
	
	public Long getidPeriodoActual() {
		return this.idPeriodoActual;
	}

	public void setidPeriodoActual(Long idPeriodoActual) {
		this.idPeriodoActual = idPeriodoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Periodo getperiodo() {
		return this.periodo;
	}

	public void setperiodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
	public Periodo getperiodoAux() {
		return this.periodoAux;
	}

	public void setperiodoAux(Periodo periodoAux) {
		this.periodoAux = periodoAux;
	}				
	
	public Periodo getperiodoAnterior() {
		return this.periodoAnterior;
	}

	public void setperiodoAnterior(Periodo periodoAnterior) {
		this.periodoAnterior = periodoAnterior;
	}	
	
	public Periodo getperiodoTotales() {
		return this.periodoTotales;
	}

	public void setperiodoTotales(Periodo periodoTotales) {
		this.periodoTotales = periodoTotales;
	}	
	
	public Periodo getperiodoBean() {
		return this.periodoBean;
	}

	public void setperiodoBean(Periodo periodoBean) {
		this.periodoBean = periodoBean;
	}	
	
	public PeriodoParameterReturnGeneral getperiodoReturnGeneral() {
		return this.periodoReturnGeneral;
	}

	public void setperiodoReturnGeneral(PeriodoParameterReturnGeneral periodoReturnGeneral) {
		this.periodoReturnGeneral = periodoReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaPorIdAnioPorIdEjercicio=null;

	public Long getid_anioBusquedaPorIdAnioPorIdEjercicio() {
		return this.id_anioBusquedaPorIdAnioPorIdEjercicio;
	}

	public void setid_anioBusquedaPorIdAnioPorIdEjercicio(Long id_anioBusquedaPorIdAnioPorIdEjercicio) {
		this.id_anioBusquedaPorIdAnioPorIdEjercicio = id_anioBusquedaPorIdAnioPorIdEjercicio;
	}

;
	public Long id_ejercicioBusquedaPorIdAnioPorIdEjercicio=-1L;

	public Long getid_ejercicioBusquedaPorIdAnioPorIdEjercicio() {
		return this.id_ejercicioBusquedaPorIdAnioPorIdEjercicio;
	}

	public void setid_ejercicioBusquedaPorIdAnioPorIdEjercicio(Long id_ejercicioBusquedaPorIdAnioPorIdEjercicio) {
		this.id_ejercicioBusquedaPorIdAnioPorIdEjercicio = id_ejercicioBusquedaPorIdAnioPorIdEjercicio;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_periodoFK_IdEstadoPeriodo=-1L;

	public Long getid_estado_periodoFK_IdEstadoPeriodo() {
		return this.id_estado_periodoFK_IdEstadoPeriodo;
	}

	public void setid_estado_periodoFK_IdEstadoPeriodo(Long id_estado_periodoFK_IdEstadoPeriodo) {
		this.id_estado_periodoFK_IdEstadoPeriodo = id_estado_periodoFK_IdEstadoPeriodo;
	}

	public Long id_mesFK_IdMes=-1L;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PeriodoLogic getPeriodoLogic()	{		
		return periodoLogic;
	}

	public void setPeriodoLogic(PeriodoLogic periodoLogic) {
		this.periodoLogic = periodoLogic;
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
	
	public Boolean getIsEsNuevoPeriodo() {
		return isEsNuevoPeriodo;
	}

	public void setIsEsNuevoPeriodo(Boolean isEsNuevoPeriodo) {
		this.isEsNuevoPeriodo = isEsNuevoPeriodo;
	}

	public Boolean getEsParaAccionDesdeFormularioPeriodo() {
		return esParaAccionDesdeFormularioPeriodo;
	}
	
	public void setEsParaAccionDesdeFormularioPeriodo(Boolean esParaAccionDesdeFormularioPeriodo) {
		this.esParaAccionDesdeFormularioPeriodo = esParaAccionDesdeFormularioPeriodo;
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

			if(this.periodoSessionBean==null) {
				this.periodoSessionBean=new PeriodoSessionBean();
			}

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(periodoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.periodoSessionBean==null) {
				this.periodoSessionBean=new PeriodoSessionBean();
			}

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(periodoSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

			if(this.periodoSessionBean==null) {
				this.periodoSessionBean=new PeriodoSessionBean();
			}

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(periodoSessionBean.getlidEjercicioActual());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.periodoSessionBean==null) {
				this.periodoSessionBean=new PeriodoSessionBean();
			}

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(periodoSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

			if(this.periodoSessionBean==null) {
				this.periodoSessionBean=new PeriodoSessionBean();
			}

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPeriodo()) {
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
					estadoperiodoLogic.getEntityWithConnection(periodoSessionBean.getlidEstadoPeriodoActual());
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

					if(this.periodo!=null) {
						this.periodo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPeriodo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPeriodoGenerico)throws Exception
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
				jComboBoxid_empresaPeriodoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPeriodoGenerico!=null && jComboBoxid_empresaPeriodoGenerico.getItemCount()>0) {
					jComboBoxid_empresaPeriodoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.periodo!=null) {
						this.periodo.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioPeriodo.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioPorIdEjercicio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo!=null) {
						jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo!=null) {
							//jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.getItemCount()>0) {
								jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioPeriodo!=null) {
						jComboBoxid_anioFK_IdAnioPeriodo.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioPeriodo!=null) {
							//jComboBoxid_anioFK_IdAnioPeriodo.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioPeriodo.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioPeriodo.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioPeriodoGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioPeriodoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioPeriodoGenerico!=null && jComboBoxid_anioPeriodoGenerico.getItemCount()>0) {
					jComboBoxid_anioPeriodoGenerico.setSelectedIndex(0);
				}
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

					if(this.periodo!=null) {
						this.periodo.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPeriodo.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioPorIdEjercicio") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo!=null) {
						jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo!=null) {
							//jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPeriodoGenerico)throws Exception
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
				jComboBoxid_ejercicioPeriodoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPeriodoGenerico!=null && jComboBoxid_ejercicioPeriodoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPeriodoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.periodo!=null) {
						this.periodo.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesPeriodo.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesPeriodoGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesPeriodoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesPeriodoGenerico!=null && jComboBoxid_mesPeriodoGenerico.getItemCount()>0) {
					jComboBoxid_mesPeriodoGenerico.setSelectedIndex(0);
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

					if(this.periodo!=null) {
						this.periodo.setEstadoPeriodo(estadoperiodoTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.setSelectedItem(estadoperiodoTemp);
					}
				} else {
					//jComboBoxid_estado_periodoPeriodo.setSelectedItem(estadoperiodoTemp);
					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.setSelectedIndex(0);
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
	public void setActualEstadoPeriodoForeignKeyGenerico(Long idEstadoPeriodoSeleccionado,JComboBox jComboBoxid_estado_periodoPeriodoGenerico)throws Exception
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
				jComboBoxid_estado_periodoPeriodoGenerico.setSelectedItem(estadoperiodoTemp);
			} else {
				if(jComboBoxid_estado_periodoPeriodoGenerico!=null && jComboBoxid_estado_periodoPeriodoGenerico.getItemCount()>0) {
					jComboBoxid_estado_periodoPeriodoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Periodo periodo,JComboBox jComboBoxid_empresaPeriodoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPeriodoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPeriodoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				periodo.setid_empresa(empresaAux.getId());
				periodo.setempresa_descripcion(PeriodoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				periodo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(Periodo periodo,JComboBox jComboBoxid_anioPeriodoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioPeriodoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioPeriodoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				periodo.setid_anio(anioAux.getId());
				periodo.setanio_descripcion(PeriodoConstantesFunciones.getAnioDescripcion(anioAux));
				periodo.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(Periodo periodo,JComboBox jComboBoxid_ejercicioPeriodoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPeriodoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPeriodoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				periodo.setid_ejercicio(ejercicioAux.getId());
				periodo.setejercicio_descripcion(PeriodoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				periodo.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(Periodo periodo,JComboBox jComboBoxid_mesPeriodoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesPeriodoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesPeriodoGenerico.getSelectedItem();
			}

			if(mesAux!=null && mesAux.getId()!=null) {
				periodo.setid_mes(mesAux.getId());
				periodo.setmes_descripcion(PeriodoConstantesFunciones.getMesDescripcion(mesAux));
				periodo.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoPeriodoForeignKey(Periodo periodo,JComboBox jComboBoxid_estado_periodoPeriodoGenerico)throws Exception
	{
		try
		{
			EstadoPeriodo  estadoperiodoAux=new EstadoPeriodo();

			if(jComboBoxid_estado_periodoPeriodoGenerico==null) {
				estadoperiodoAux=(EstadoPeriodo)this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.getSelectedItem();
			} else {
				estadoperiodoAux=(EstadoPeriodo)jComboBoxid_estado_periodoPeriodoGenerico.getSelectedItem();
			}

			if(estadoperiodoAux!=null && estadoperiodoAux.getId()!=null) {
				periodo.setid_estado_periodo(estadoperiodoAux.getId());
				periodo.setestadoperiodo_descripcion(PeriodoConstantesFunciones.getEstadoPeriodoDescripcion(estadoperiodoAux));
				periodo.setEstadoPeriodo(estadoperiodoAux);			}
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

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) { 
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) { 
					}

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) { 
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) { 
					}

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioPorIdEjercicio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.addItem(anio);
							}
						}

						if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioPeriodo.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioPeriodo.addItem(anio);
							}
						}

						if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) { 
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) { 
					}

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdAnioPorIdEjercicio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.addItem(ejercicio);
							}
						}

						if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) { 
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) { 
					}

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) { 
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.removeAllItems();

							for(EstadoPeriodo estadoperiodo:this.estadoperiodosForeignKey) {
								if(estadoperiodo.getes_defecto()) {
									this.periodoBean.setid_estado_periodo(estadoperiodo.getId());
								}

								this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.addItem(estadoperiodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodo!=null) { 
					}

					if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioPeriodo.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioPeriodo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstadoPeriodoForeignKey(EstadoPeriodo estadoperiodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.setSelectedItem(estadoperiodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodo!=null) {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPeriodo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PeriodoConstantesFunciones.refrescarForeignKeysDescripcionesPeriodo(this.periodoLogic.getPeriodos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PeriodoConstantesFunciones.refrescarForeignKeysDescripcionesPeriodo(this.periodos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Mes.class));
		classes.add(new Classe(EstadoPeriodo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//periodoLogic.setPeriodos(this.periodos);
			periodoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PeriodoParameterReturnGeneral getPeriodoParameterGeneral() {
		return this.periodoParameterGeneral;
	}
	
	public void setPeriodoParameterGeneral(PeriodoParameterReturnGeneral periodoParameterGeneral) {
		this.periodoParameterGeneral = periodoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPeriodo() {
		return isPermisoTodoPeriodo;
	}

	public void setIsPermisoTodoPeriodo(Boolean isPermisoTodoPeriodo) {
		this.isPermisoTodoPeriodo = isPermisoTodoPeriodo;
	}

	public Boolean getIsPermisoNuevoPeriodo() {
		return isPermisoNuevoPeriodo;
	}

	public void setIsPermisoNuevoPeriodo(Boolean isPermisoNuevoPeriodo) {
		this.isPermisoNuevoPeriodo = isPermisoNuevoPeriodo;
	}

	public Boolean getIsPermisoActualizarPeriodo() {
		return isPermisoActualizarPeriodo;
	}

	public void setIsPermisoActualizarPeriodo(Boolean isPermisoActualizarPeriodo) {
		this.isPermisoActualizarPeriodo = isPermisoActualizarPeriodo;
	}

	public Boolean getIsPermisoEliminarPeriodo() {
		return isPermisoEliminarPeriodo;
	}

	public void setIsPermisoEliminarPeriodo(Boolean isPermisoEliminarPeriodo) {
		this.isPermisoEliminarPeriodo = isPermisoEliminarPeriodo;
	}

	public Boolean getIsPermisoGuardarCambiosPeriodo() {
		return isPermisoGuardarCambiosPeriodo;
	}

	public void setIsPermisoGuardarCambiosPeriodo(Boolean isPermisoGuardarCambiosPeriodo) {
		this.isPermisoGuardarCambiosPeriodo = isPermisoGuardarCambiosPeriodo;
	}
	
	public Boolean getIsPermisoConsultaPeriodo() {
		return isPermisoConsultaPeriodo;
	}

	public void setIsPermisoConsultaPeriodo(Boolean isPermisoConsultaPeriodo) {
		this.isPermisoConsultaPeriodo = isPermisoConsultaPeriodo;
	}

	public Boolean getIsPermisoBusquedaPeriodo() {
		return isPermisoBusquedaPeriodo;
	}

	public void setIsPermisoBusquedaPeriodo(Boolean isPermisoBusquedaPeriodo) {
		this.isPermisoBusquedaPeriodo = isPermisoBusquedaPeriodo;
	}

	public Boolean getIsPermisoReportePeriodo() {
		return isPermisoReportePeriodo;
	}

	public void setIsPermisoReportePeriodo(Boolean isPermisoReportePeriodo) {
		this.isPermisoReportePeriodo = isPermisoReportePeriodo;
	}
	
	public Boolean getIsPermisoPaginacionMedioPeriodo() {
		return isPermisoPaginacionMedioPeriodo;
	}

	public void setIsPermisoPaginacionMedioPeriodo(Boolean isPermisoPaginacionMedioPeriodo) {
		this.isPermisoPaginacionMedioPeriodo = isPermisoPaginacionMedioPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionTodoPeriodo() {
		return isPermisoPaginacionTodoPeriodo;
	}

	public void setIsPermisoPaginacionTodoPeriodo(Boolean isPermisoPaginacionTodoPeriodo) {
		this.isPermisoPaginacionTodoPeriodo = isPermisoPaginacionTodoPeriodo;
	}
	
	public Boolean getIsPermisoPaginacionAltoPeriodo() {
		return isPermisoPaginacionAltoPeriodo;
	}

	public void setIsPermisoPaginacionAltoPeriodo(Boolean isPermisoPaginacionAltoPeriodo) {
		this.isPermisoPaginacionAltoPeriodo = isPermisoPaginacionAltoPeriodo;
	}
	
	public Boolean getIsPermisoCopiarPeriodo() {
		return isPermisoCopiarPeriodo;
	}

	public void setIsPermisoCopiarPeriodo(Boolean isPermisoCopiarPeriodo) {
		this.isPermisoCopiarPeriodo = isPermisoCopiarPeriodo;
	}
	
	public Boolean getIsPermisoVerFormPeriodo() {
		return isPermisoVerFormPeriodo;
	}

	public void setIsPermisoVerFormPeriodo(Boolean isPermisoVerFormPeriodo) {
		this.isPermisoVerFormPeriodo = isPermisoVerFormPeriodo;
	}
	
	public Boolean getIsPermisoDuplicarPeriodo() {
		return isPermisoDuplicarPeriodo;
	}

	public void setIsPermisoDuplicarPeriodo(Boolean isPermisoDuplicarPeriodo) {
		this.isPermisoDuplicarPeriodo = isPermisoDuplicarPeriodo;
	}
	
	public Boolean getIsPermisoOrdenPeriodo() {
		return isPermisoOrdenPeriodo;
	}

	public void setIsPermisoOrdenPeriodo(Boolean isPermisoOrdenPeriodo) {
		this.isPermisoOrdenPeriodo = isPermisoOrdenPeriodo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPeriodo() {
		return isVisibilidadCeldaNuevoPeriodo;
	}

	public void setIsVisibilidadCeldaNuevoPeriodo(Boolean isVisibilidadCeldaNuevoPeriodo) {
		this.isVisibilidadCeldaNuevoPeriodo = isVisibilidadCeldaNuevoPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPeriodo() {
		return isVisibilidadCeldaDuplicarPeriodo;
	}

	public void setIsVisibilidadCeldaDuplicarPeriodo(Boolean isVisibilidadCeldaDuplicarPeriodo) {
		this.isVisibilidadCeldaDuplicarPeriodo = isVisibilidadCeldaDuplicarPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPeriodo() {
		return isVisibilidadCeldaCopiarPeriodo;
	}

	public void setIsVisibilidadCeldaCopiarPeriodo(Boolean isVisibilidadCeldaCopiarPeriodo) {
		this.isVisibilidadCeldaCopiarPeriodo = isVisibilidadCeldaCopiarPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPeriodo() {
		return isVisibilidadCeldaVerFormPeriodo;
	}

	public void setIsVisibilidadCeldaVerFormPeriodo(Boolean isVisibilidadCeldaVerFormPeriodo) {
		this.isVisibilidadCeldaVerFormPeriodo = isVisibilidadCeldaVerFormPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPeriodo() {
		return isVisibilidadCeldaOrdenPeriodo;
	}

	public void setIsVisibilidadCeldaOrdenPeriodo(Boolean isVisibilidadCeldaOrdenPeriodo) {
		this.isVisibilidadCeldaOrdenPeriodo = isVisibilidadCeldaOrdenPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPeriodo() {
		return isVisibilidadCeldaNuevoRelacionesPeriodo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPeriodo(Boolean isVisibilidadCeldaNuevoRelacionesPeriodo) {
		this.isVisibilidadCeldaNuevoRelacionesPeriodo = isVisibilidadCeldaNuevoRelacionesPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPeriodo() {
		return isVisibilidadCeldaModificarPeriodo;
	}

	public void setIsVisibilidadCeldaModificarPeriodo(Boolean isVisibilidadCeldaModificarPeriodo) {
		this.isVisibilidadCeldaModificarPeriodo = isVisibilidadCeldaModificarPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPeriodo() {
		return isVisibilidadCeldaActualizarPeriodo;
	}

	public void setIsVisibilidadCeldaActualizarPeriodo(Boolean isVisibilidadCeldaActualizarPeriodo) {
		this.isVisibilidadCeldaActualizarPeriodo = isVisibilidadCeldaActualizarPeriodo;
	}

	public Boolean getIsVisibilidadCeldaEliminarPeriodo() {
		return isVisibilidadCeldaEliminarPeriodo;
	}

	public void setIsVisibilidadCeldaEliminarPeriodo(Boolean isVisibilidadCeldaEliminarPeriodo) {
		this.isVisibilidadCeldaEliminarPeriodo = isVisibilidadCeldaEliminarPeriodo;
	}

	public Boolean getIsVisibilidadCeldaCancelarPeriodo() {
		return isVisibilidadCeldaCancelarPeriodo;
	}

	public void setIsVisibilidadCeldaCancelarPeriodo(Boolean isVisibilidadCeldaCancelarPeriodo) {
		this.isVisibilidadCeldaCancelarPeriodo = isVisibilidadCeldaCancelarPeriodo;
	}

	public Boolean getIsVisibilidadCeldaGuardarPeriodo() {
		return isVisibilidadCeldaGuardarPeriodo;
	}

	public void setIsVisibilidadCeldaGuardarPeriodo(Boolean isVisibilidadCeldaGuardarPeriodo) {
		this.isVisibilidadCeldaGuardarPeriodo = isVisibilidadCeldaGuardarPeriodo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPeriodo() {
		return isVisibilidadCeldaGuardarCambiosPeriodo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPeriodo(Boolean isVisibilidadCeldaGuardarCambiosPeriodo) {
		this.isVisibilidadCeldaGuardarCambiosPeriodo = isVisibilidadCeldaGuardarCambiosPeriodo;
	}
		
	public PeriodoSessionBean getperiodoSessionBean() {
		return this.periodoSessionBean;
	}
	
	public void setperiodoSessionBean(PeriodoSessionBean periodoSessionBean) {
		this.periodoSessionBean=periodoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdAnioPorIdEjercicio() {
		return this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio;
	}

	public void setisVisibilidadBusquedaPorIdAnioPorIdEjercicio(Boolean isVisibilidadBusquedaPorIdAnioPorIdEjercicio) {
		this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio=isVisibilidadBusquedaPorIdAnioPorIdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoPeriodo() {
		return this.isVisibilidadFK_IdEstadoPeriodo;
	}

	public void setisVisibilidadFK_IdEstadoPeriodo(Boolean isVisibilidadFK_IdEstadoPeriodo) {
		this.isVisibilidadFK_IdEstadoPeriodo=isVisibilidadFK_IdEstadoPeriodo;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPeriodo(Periodo periodo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(periodo,null);
				this.setActualParaGuardarAnioForeignKey(periodo,null);
				this.setActualParaGuardarEjercicioForeignKey(periodo,null);
				this.setActualParaGuardarMesForeignKey(periodo,null);
				this.setActualParaGuardarEstadoPeriodoForeignKey(periodo,null);
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
	
	public void bugActualizarReferenciaActual(Periodo periodo,Periodo periodoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPeriodo(periodo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		periodoAux.setId(periodo.getId());
		periodoAux.setVersionRow(periodo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPeriodo();
		
			int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = periodoValidator.getInvalidValues(this.periodo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			periodoLogic.setDatosCliente(datosCliente);
			periodoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				periodoAux=new  Periodo();
				
				periodoAux.setIsNew(true);
				periodoAux.setIsChanged(true);
				
				periodoAux.setPeriodoOriginal(this.periodo);
				
				periodoAux.setId(this.periodo.getId());	
				periodoAux.setVersionRow(this.periodo.getVersionRow());	
				periodoAux.setid_empresa(this.periodo.getid_empresa());	
				periodoAux.setid_anio(this.periodo.getid_anio());	
				periodoAux.setid_ejercicio(this.periodo.getid_ejercicio());	
				periodoAux.setid_mes(this.periodo.getid_mes());	
				periodoAux.setfecha_inicio(this.periodo.getfecha_inicio());	
				periodoAux.setfecha_fin(this.periodo.getfecha_fin());	
				periodoAux.setnombre(this.periodo.getnombre());	
				periodoAux.setdescripcion(this.periodo.getdescripcion());	
				periodoAux.setid_estado_periodo(this.periodo.getid_estado_periodo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.periodoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.periodoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(periodoAux,periodoLogic.getPeriodos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoAux,periodos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.periodoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periodoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoLogic.savePeriodos();//WithConnection
						//periodoLogic.getSetVersionRowPeriodos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.periodo,periodoAux);
					
					this.refrescarForeignKeysDescripcionesPeriodo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				periodoAux=new  Periodo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.periodoSessionBean.getEsGuardarRelacionado() 
					|| (this.periodoSessionBean.getEsGuardarRelacionado() && this.periodo.getId()>=0)) {
						
					periodoAux.setIsNew(false);
				}
				
				periodoAux.setIsDeleted(false);
			
				periodoAux.setId(this.periodo.getId());	
				periodoAux.setVersionRow(this.periodo.getVersionRow());	
				periodoAux.setid_empresa(this.periodo.getid_empresa());	
				periodoAux.setid_anio(this.periodo.getid_anio());	
				periodoAux.setid_ejercicio(this.periodo.getid_ejercicio());	
				periodoAux.setid_mes(this.periodo.getid_mes());	
				periodoAux.setfecha_inicio(this.periodo.getfecha_inicio());	
				periodoAux.setfecha_fin(this.periodo.getfecha_fin());	
				periodoAux.setnombre(this.periodo.getnombre());	
				periodoAux.setdescripcion(this.periodo.getdescripcion());	
				periodoAux.setid_estado_periodo(this.periodo.getid_estado_periodo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(periodoAux,periodoLogic.getPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoAux,periodos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.periodoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periodoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoLogic.savePeriodos();//WithConnection
						//periodoLogic.getSetVersionRowPeriodos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.periodo,periodoAux);
					
					this.refrescarForeignKeysDescripcionesPeriodo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				periodoAux=new  Periodo();
				
				periodoAux.setIsNew(false);
				periodoAux.setIsChanged(false);
				
				periodoAux.setIsDeleted(true);
				
				periodoAux.setId(this.periodo.getId());	
				periodoAux.setVersionRow(this.periodo.getVersionRow());	
				periodoAux.setid_empresa(this.periodo.getid_empresa());	
				periodoAux.setid_anio(this.periodo.getid_anio());	
				periodoAux.setid_ejercicio(this.periodo.getid_ejercicio());	
				periodoAux.setid_mes(this.periodo.getid_mes());	
				periodoAux.setfecha_inicio(this.periodo.getfecha_inicio());	
				periodoAux.setfecha_fin(this.periodo.getfecha_fin());	
				periodoAux.setnombre(this.periodo.getnombre());	
				periodoAux.setdescripcion(this.periodo.getdescripcion());	
				periodoAux.setid_estado_periodo(this.periodo.getid_estado_periodo());	
				
				if(this.periodoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.periodoAux.getId()>=0) {	
						this.periodosEliminados.add(periodoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(periodoAux,periodoLogic.getPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoAux,periodos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.periodoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periodoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoLogic.savePeriodos();//WithConnection
						//periodoLogic.getSetVersionRowPeriodos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getPeriodos().addAll(this.periodosEliminados);
					
					periodoLogic.savePeriodos();//WithConnection
					//periodoLogic.getSetVersionRowPeriodos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPeriodo();
				
				this.periodosEliminados= new ArrayList<Periodo>();		
			}
			
			if(this.periodoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Periodo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.periodo=periodoAux;
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
      		//this.finishProcessPeriodo();
      	}
		
	}	
	
	public void actualizarRelaciones(Periodo periodoLocal) throws Exception {
		
		if(this.periodoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Periodo periodoLocal) throws Exception {	
		if(this.periodoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				periodoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				periodoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				periodoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				periodoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoPeriodoDetalleFormJInternalFrame.class)) {
				EstadoPeriodoBeanSwingJInternalFrame estadoperiodoBeanSwingJInternalFrameLocal=(EstadoPeriodoBeanSwingJInternalFrame) ((EstadoPeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadoperiodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoPeriodo(estadoperiodoBeanSwingJInternalFrameLocal.getestadoperiodo(),true);
				estadoperiodoBeanSwingJInternalFrameLocal.actualizarLista(estadoperiodoBeanSwingJInternalFrameLocal.estadoperiodo,this.estadoperiodosForeignKey);

				estadoperiodoBeanSwingJInternalFrameLocal.actualizarRelaciones(estadoperiodoBeanSwingJInternalFrameLocal.estadoperiodo);

				periodoLocal.setEstadoPeriodo(estadoperiodoBeanSwingJInternalFrameLocal.estadoperiodo);

				this.addItemDefectoCombosForeignKeyEstadoPeriodo();
				this.cargarCombosFrameEstadoPeriodosForeignKey("Formulario");
				this.setActualEstadoPeriodoForeignKey(estadoperiodoBeanSwingJInternalFrameLocal.estadoperiodo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPeriodoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = periodoValidator.getInvalidValues(this.periodo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Periodo periodo,List<Periodo> periodos) throws Exception {
		try	{		
			PeriodoConstantesFunciones.actualizarLista(periodo,periodos,this.periodoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Periodo periodo,List<Periodo> periodos) throws Exception {
		try	{			
			PeriodoConstantesFunciones.actualizarSelectedLista(periodo,periodos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Periodo> periodosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				periodosLocal=this.periodoLogic.getPeriodos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				periodosLocal=this.periodos;
			}
			//ARCHITECTURE
		
			for(Periodo periodoLocal:periodosLocal) {
				if(this.permiteMantenimiento(periodoLocal) && periodoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PeriodoConstantesFunciones.getPeriodoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PeriodoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelid_empresaPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelid_anioPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelid_ejercicioPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelid_mesPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelfecha_inicioPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelfecha_finPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelnombrePeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabeldescripcionPeriodo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoConstantesFunciones.IDESTADOPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelid_estado_periodoPeriodo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodo.jLabelid_empresaPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodo.jLabelid_anioPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodo.jLabelid_ejercicioPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodo.jLabelid_mesPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodo.jLabelfecha_inicioPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodo.jLabelfecha_finPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodo.jLabelnombrePeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodo.jLabeldescripcionPeriodo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodo.jLabelid_estado_periodoPeriodo,"");
		
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
		this.iIdNuevoPeriodo--;	
		
		
		this.periodoAux=new Periodo();
		
		this.periodoAux.setId(this.iIdNuevoPeriodo);
		this.periodoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.periodoLogic.getPeriodos().add(this.periodoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.periodos.add(this.periodoAux);
		}
		//ARCHITECTURE
		
		this.periodo=this.periodoAux;
		
		if(PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPeriodo(this.periodo);
			this.setVariablesObjetoActualToFormularioForeignKeyPeriodo(this.periodo);
		}
				
		//this.setDefaultControlesPeriodo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPeriodo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPeriodo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPeriodo(this.periodoBean,this.periodo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PeriodoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.periodoSessionBean.getConGuardarRelaciones()) {
			classes=PeriodoConstantesFunciones.getClassesRelationshipsOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.periodoReturnGeneral=periodoLogic.procesarEventosPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periodoLogic.getPeriodos(),this.periodo,this.periodoParameterGeneral,this.isEsNuevoPeriodo,classes);//this.periodoLogic.getPeriodo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPeriodo(this.periodoReturnGeneral,this.periodoBean,false);
		
		if(this.periodoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPeriodo(this.periodoReturnGeneral.getPeriodo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPeriodo(this.periodoReturnGeneral.getPeriodo());
		}
		
		if(this.periodoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPeriodo(this.periodoReturnGeneral.getPeriodo(),classes);//this.periodoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPeriodo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPeriodo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PeriodoBeanSwingJInternalFrameAdditional.RecargarFormPeriodo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPeriodo(false);
						
			if(periodoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodo();
			}
			
			this.actualizarVisualTableDatosPeriodo();
			
			this.jTableDatosPeriodo.setRowSelectionInterval(this.getIndiceNuevoPeriodo(), this.getIndiceNuevoPeriodo());
			
			this.seleccionarFilaTablaPeriodoActual();
						
			this.actualizarEstadoCeldasBotonesPeriodo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPeriodo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_inicioPeriodo.setEnabled(isHabilitar && this.periodoConstantesFunciones.activarfecha_inicioPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_finPeriodo.setEnabled(isHabilitar && this.periodoConstantesFunciones.activarfecha_finPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jTextFieldnombrePeriodo.setEnabled(isHabilitar && this.periodoConstantesFunciones.activarnombrePeriodo);
		this.jInternalFrameDetalleFormPeriodo.jTextAreadescripcionPeriodo.setEnabled(isHabilitar && this.periodoConstantesFunciones.activardescripcionPeriodo);	
		//
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.setEnabled(isHabilitar && this.periodoConstantesFunciones.activarid_empresaPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.setEnabled(isHabilitar && this.periodoConstantesFunciones.activarid_anioPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.setEnabled(isHabilitar && this.periodoConstantesFunciones.activarid_ejercicioPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.setEnabled(isHabilitar && this.periodoConstantesFunciones.activarid_mesPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.setEnabled(isHabilitar && this.periodoConstantesFunciones.activarid_estado_periodoPeriodo);
	};
	
	public void setDefaultControlesPeriodo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPeriodo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.periodoSessionBean.setConGuardarRelaciones(true);			
			this.periodoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPeriodo.jTabbedPaneRelacionesPeriodo.setVisible(true);
			
					
		} else {
			//this.periodoSessionBean.setConGuardarRelaciones(false);			
			this.periodoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPeriodo.jTabbedPaneRelacionesPeriodo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPeriodo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Periodo periodoAux:this.periodoLogic.getPeriodos()) {
				if(periodoAux.getId().equals(this.iIdNuevoPeriodo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Periodo periodoAux:this.periodos) {
				if(periodoAux.getId().equals(this.iIdNuevoPeriodo)) {
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
	
	public int getIndiceActualPeriodo(Periodo periodo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Periodo periodoAux:this.periodoLogic.getPeriodos()) {
				if(periodoAux.getId().equals(periodo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Periodo periodoAux:this.periodos) {
				if(periodoAux.getId().equals(periodo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPeriodo(Periodo periodoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Periodo periodoAux:this.periodoLogic.getPeriodos()) {
				if(periodoAux.getPeriodoOriginal().getId().equals(periodoOriginal.getId())) {
					existe=true;
					periodoOriginal.setId(periodoAux.getId());
					periodoOriginal.setVersionRow(periodoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Periodo periodoAux:this.periodos) {
				if(periodoAux.getPeriodoOriginal().getId().equals(periodoOriginal.getId())) {
					existe=true;
					periodoOriginal.setId(periodoAux.getId());
					periodoOriginal.setVersionRow(periodoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPeriodo(Boolean esParaCancelar) throws Exception {
		periodosAux=new ArrayList<Periodo>();
		periodoAux=new Periodo();
		
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Periodo periodoAux:this.periodoLogic.getPeriodos()) {
					if(periodoAux.getId()<0) {
						periodosAux.add(periodoAux);
					}		
				}
				this.iIdNuevoPeriodo=0L;
				this.periodoLogic.getPeriodos().removeAll(periodosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Periodo periodoAux:this.periodos) {
					if(periodoAux.getId()<0) {
						periodosAux.add(periodoAux);
					}		
				}
				this.iIdNuevoPeriodo=0L;
				this.periodos.removeAll(periodosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPeriodo 
					&& this.periodoLogic.getPeriodos().size()>0
					) {
					periodoAux=this.periodoLogic.getPeriodos().get(this.periodoLogic.getPeriodos().size() - 1);
				
					if(periodoAux.getId()<0) {
						this.periodoLogic.getPeriodos().remove(periodoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPeriodo && this.periodos.size()>0) {
					periodoAux=this.periodos.get(this.periodos.size() - 1);
				
					if(periodoAux.getId()<0) {
						this.periodos.remove(periodoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPeriodo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(periodo.getId()<0) {
				this.periodoLogic.getPeriodos().remove(this.periodo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(periodo.getId()<0) {
				this.periodos.remove(this.periodo);
			}
		}			
	}
	
	public void setEstadosInicialesPeriodo(List<Periodo> periodosAux) throws Exception {
		PeriodoConstantesFunciones.setEstadosInicialesPeriodo(periodosAux);
	}
	
	public void setEstadosInicialesPeriodo(Periodo periodoAux) throws Exception {
		PeriodoConstantesFunciones.setEstadosInicialesPeriodo(periodoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPeriodoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPeriodoActual()) {
				if(!this.isEsNuevoPeriodo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPeriodo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPeriodoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Periodo ?", "MANTENIMIENTO DE Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Periodo periodo) throws Exception {
		PeriodoConstantesFunciones.seleccionarAsignar(this.periodo,periodo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPeriodo=this.isPermisoActualizarOriginalPeriodo;
			
			
			this.seleccionarAsignar(periodo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PeriodoConstantesFunciones.quitarEspaciosPeriodo(this.periodo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.periodoSessionBean.setsFuncionBusquedaRapida(this.periodoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPeriodo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPeriodo(esParaCancelar);				
				this.cancelarNuevoPeriodo(esParaCancelar);								
			}
			
			this.periodo=new Periodo();
			
			this.inicializarPeriodo();
			
			this.actualizarEstadoCeldasBotonesPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPeriodo() throws Exception {
		try {
			PeriodoConstantesFunciones.inicializarPeriodo(this.periodo);
			
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
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.periodoLogic.getPeriodos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePeriodos(String sAccionBusqueda,List<Periodo> periodosParaReportes) throws Exception {
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
					sPathReporteFinal="Periodo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PeriodoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PeriodoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Periodo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Periodos");		
		parameters.put("busquedapor", PeriodoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePeriodo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PeriodoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePeriodo=new JRBeanArrayDataSource(PeriodoJInternalFrame.TraerPeriodoBeans(periodosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePeriodo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PeriodoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PeriodoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PeriodoBean.TraerPeriodoBeans(periodosParaReportes).toArray()));
							
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
				this.generarExcelReportePeriodos(sAccionBusqueda,sTipoArchivoReporte,periodosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPeriodos(sAccionBusqueda,sTipoArchivoReporte,periodosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPeriodoActionPerformed(null);
					//this.generarExcelReportePeriodos(sAccionBusqueda,sTipoArchivoReporte,periodosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPeriodos(sAccionBusqueda,sTipoArchivoReporte,periodosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPeriodos(sAccionBusqueda,sTipoArchivoReporte,periodosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPeriodos(sAccionBusqueda,sTipoArchivoReporte,periodosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<Periodo> periodosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Periodos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPeriodo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Periodo periodo : periodosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PeriodoConstantesFunciones.generarExcelReporteDataPeriodo("NORMAL",row,workbook,periodo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPeriodo(String sTipo,Row row,Workbook workbook) {
		
		PeriodoConstantesFunciones.generarExcelReporteHeaderPeriodo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<Periodo> periodosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Periodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Periodo periodo : periodosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PeriodoConstantesFunciones.getPeriodoDescripcion(periodo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodo.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodo.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodo.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodo.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodo.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodo.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodo.getestadoperiodo_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPeriodos(String sAccionBusqueda,String sTipoArchivoReporte,List<Periodo> periodosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Periodo> periodosRespaldo=null;
		
		classes=PeriodoConstantesFunciones.getClassesRelationshipsOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.periodoLogic.setDatosCliente(this.datosCliente);
		this.periodoLogic.setDatosDeep(this.datosDeep);
		this.periodoLogic.setIsConDeep(true);
		
		periodosRespaldo=this.periodoLogic.getPeriodos();
		
		this.periodoLogic.setPeriodos(periodosParaReportes);	
		this.periodoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		periodosParaReportes=this.periodoLogic.getPeriodos();
		this.periodoLogic.setPeriodos(periodosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Periodos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPeriodo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Periodo periodo : periodosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPeriodo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PeriodoConstantesFunciones.generarExcelReporteDataPeriodo("NORMAL",row,workbook,periodo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PeriodoConstantesFunciones.getPeriodoDescripcion(periodo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPeriodo() throws Exception {		
		this.startProcessPeriodo(true);
	}
	
	public void startProcessPeriodo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPeriodo ,this.jPanelParametrosReportesPeriodo, this.jScrollPanelDatosPeriodo,this.jPanelPaginacionPeriodo, this.jScrollPanelDatosEdicionPeriodo, this.jPanelAccionesPeriodo,this.jPanelAccionesFormularioPeriodo,this.jmenuBarPeriodo,this.jmenuBarDetallePeriodo,this.jTtoolBarPeriodo,this.jTtoolBarDetallePeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasPeriodo=this.jTabbedPaneBusquedasPeriodo; 
		
		final JPanel jPanelParametrosReportesPeriodo=this.jPanelParametrosReportesPeriodo;
		//final JScrollPane jScrollPanelDatosPeriodo=this.jScrollPanelDatosPeriodo;
		final JTable jTableDatosPeriodo=this.jTableDatosPeriodo;		
		final JPanel jPanelPaginacionPeriodo=this.jPanelPaginacionPeriodo;
		//final JScrollPane jScrollPanelDatosEdicionPeriodo=this.jScrollPanelDatosEdicionPeriodo;
		final JPanel jPanelAccionesPeriodo=this.jPanelAccionesPeriodo;
		
		JPanel jPanelCamposAuxiliarPeriodo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPeriodo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) {
			jPanelCamposAuxiliarPeriodo=this.jInternalFrameDetalleFormPeriodo.jPanelCamposPeriodo;
			jPanelAccionesFormularioAuxiliarPeriodo=this.jInternalFrameDetalleFormPeriodo.jPanelAccionesFormularioPeriodo;
		}
		
		final JPanel jPanelCamposPeriodo=jPanelCamposAuxiliarPeriodo;
		final JPanel jPanelAccionesFormularioPeriodo=jPanelAccionesFormularioAuxiliarPeriodo;
		
		
		final JMenuBar jmenuBarPeriodo=this.jmenuBarPeriodo;
		final JToolBar jTtoolBarPeriodo=this.jTtoolBarPeriodo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPeriodo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) {
			jmenuBarDetalleAuxiliarPeriodo=this.jInternalFrameDetalleFormPeriodo.jmenuBarDetallePeriodo;
			jTtoolBarDetalleAuxiliarPeriodo=this.jInternalFrameDetalleFormPeriodo.jTtoolBarDetallePeriodo;
		}
		
		final JMenuBar jmenuBarDetallePeriodo=jmenuBarDetalleAuxiliarPeriodo;
		final JToolBar jTtoolBarDetallePeriodo=jTtoolBarDetalleAuxiliarPeriodo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPeriodo;
			processRunnable.jTableDatos=jTableDatosPeriodo;
			processRunnable.jPanelCampos=jPanelCamposPeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionPeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesPeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarPeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePeriodo;
			processRunnable.jTtoolBar=jTtoolBarPeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPeriodo ,jPanelParametrosReportesPeriodo,jTableDatosPeriodo, /*jScrollPanelDatosPeriodo,*/jPanelCamposPeriodo,jPanelPaginacionPeriodo, /*jScrollPanelDatosEdicionPeriodo,*/ jPanelAccionesPeriodo,jPanelAccionesFormularioPeriodo,jmenuBarPeriodo,jmenuBarDetallePeriodo,jTtoolBarPeriodo,jTtoolBarDetallePeriodo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPeriodo ,jPanelParametrosReportesPeriodo, jScrollPanelDatosPeriodo,jPanelPaginacionPeriodo, jScrollPanelDatosEdicionPeriodo, jPanelAccionesPeriodo,jPanelAccionesFormularioPeriodo,jmenuBarPeriodo,jmenuBarDetallePeriodo,jTtoolBarPeriodo,jTtoolBarDetallePeriodo);
						
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
	
	public void finishProcessPeriodo() {// throws Exception 
		this.finishProcessPeriodo(true);
	}
	
	public void finishProcessPeriodo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPeriodo ,this.jPanelParametrosReportesPeriodo, this.jScrollPanelDatosPeriodo,this.jPanelPaginacionPeriodo, this.jScrollPanelDatosEdicionPeriodo, this.jPanelAccionesPeriodo,this.jPanelAccionesFormularioPeriodo,this.jmenuBarPeriodo,this.jmenuBarDetallePeriodo,this.jTtoolBarPeriodo,this.jTtoolBarDetallePeriodo);		
		
		final JTabbedPane jTabbedPaneBusquedasPeriodo=this.jTabbedPaneBusquedasPeriodo; 
		
		final JPanel jPanelParametrosReportesPeriodo=this.jPanelParametrosReportesPeriodo;
		//final JScrollPane jScrollPanelDatosPeriodo=this.jScrollPanelDatosPeriodo;
		final JTable jTableDatosPeriodo=this.jTableDatosPeriodo;		
		final JPanel jPanelPaginacionPeriodo=this.jPanelPaginacionPeriodo;
		//final JScrollPane jScrollPanelDatosEdicionPeriodo=this.jScrollPanelDatosEdicionPeriodo;
		final JPanel jPanelAccionesPeriodo=this.jPanelAccionesPeriodo;
		
		JPanel jPanelCamposAuxiliarPeriodo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPeriodo=new JPanel();
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) {
			jPanelCamposAuxiliarPeriodo=this.jInternalFrameDetalleFormPeriodo.jPanelCamposPeriodo;
			jPanelAccionesFormularioAuxiliarPeriodo=this.jInternalFrameDetalleFormPeriodo.jPanelAccionesFormularioPeriodo;
		}
		
		final JPanel jPanelCamposPeriodo=jPanelCamposAuxiliarPeriodo;
		final JPanel jPanelAccionesFormularioPeriodo=jPanelAccionesFormularioAuxiliarPeriodo;
		
		
		final JMenuBar jmenuBarPeriodo=this.jmenuBarPeriodo;		
		final JToolBar jTtoolBarPeriodo=this.jTtoolBarPeriodo;
				
		JMenuBar jmenuBarDetalleAuxiliarPeriodo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPeriodo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) {
			jmenuBarDetalleAuxiliarPeriodo=this.jInternalFrameDetalleFormPeriodo.jmenuBarDetallePeriodo;
			jTtoolBarDetalleAuxiliarPeriodo=this.jInternalFrameDetalleFormPeriodo.jTtoolBarDetallePeriodo;		
		}
		
		final JMenuBar jmenuBarDetallePeriodo=jmenuBarDetalleAuxiliarPeriodo;
		final JToolBar jTtoolBarDetallePeriodo=jTtoolBarDetalleAuxiliarPeriodo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPeriodo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPeriodo;
			processRunnable.jTableDatos=jTableDatosPeriodo;
			processRunnable.jPanelCampos=jPanelCamposPeriodo;
			processRunnable.jPanelPaginacion=jPanelPaginacionPeriodo;
			processRunnable.jPanelAcciones=jPanelAccionesPeriodo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPeriodo;
			
			
			processRunnable.jmenuBar=jmenuBarPeriodo;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePeriodo;
			processRunnable.jTtoolBar=jTtoolBarPeriodo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePeriodo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPeriodo ,jPanelParametrosReportesPeriodo, jTableDatosPeriodo,/*jScrollPanelDatosPeriodo,*/jPanelCamposPeriodo,jPanelPaginacionPeriodo, /*jScrollPanelDatosEdicionPeriodo,*/ jPanelAccionesPeriodo,jPanelAccionesFormularioPeriodo,jmenuBarPeriodo,jmenuBarDetallePeriodo,jTtoolBarPeriodo,jTtoolBarDetallePeriodo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPeriodo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPeriodo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePeriodo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPeriodo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPeriodo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePeriodo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.periodoConstantesFunciones.getsFinalQueryPeriodo();
		String  finalQueryPaginacionTodos=this.periodoConstantesFunciones.getsFinalQueryPeriodo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PeriodoConstantesFunciones.getArrayColumnasGlobalesNoPeriodo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.periodosEliminados= new ArrayList<Periodo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPeriodo();
		
				///*PeriodoSessionBean*/this.periodoSessionBean=new PeriodoSessionBean();
			
			if(this.periodoSessionBean==null) {
				this.periodoSessionBean=new PeriodoSessionBean();
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
					this.iNumeroPaginacion=PeriodoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PeriodoConstantesFunciones.getClassesForeignKeysOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/periodo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			periodosAux= new ArrayList<Periodo>();
			
				
			periodoLogic.setDatosCliente(this.datosCliente);
			periodoLogic.setDatosDeep(this.datosDeep);
			periodoLogic.setIsConDeep(true);
			
			
			periodoLogic.getPeriodoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					periodoLogic.getTodosPeriodos(finalQueryGlobal,pagination);
					
					//periodoLogic.getTodosPeriodosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(periodoLogic.getPeriodos()==null|| periodoLogic.getPeriodos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periodosAux= new ArrayList<Periodo>();
							periodosAux.addAll(periodoLogic.getPeriodos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodosAux= new ArrayList<Periodo>();
							periodosAux.addAll(periodos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periodoLogic.getTodosPeriodos(finalQueryGlobal+"",this.pagination);												
							
							//periodoLogic.getTodosPeriodosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePeriodos("Todos",periodoLogic.getPeriodos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periodoLogic.setPeriodos(new ArrayList<Periodo>());					
							periodoLogic.getPeriodos().addAll(periodosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodos=new ArrayList<Periodo>();
							periodos.addAll(periodosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPeriodo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPeriodo=this.idActual;
				
				} else if(this.idPeriodoActual!=null && this.idPeriodoActual!=0L) {
					idPeriodo=idPeriodoActual;
				}
				
					
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndicePorId(idPeriodo);
				
				this.periodos=new ArrayList<Periodo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					periodoLogic.getEntity(idPeriodo);
					
					//periodoLogic.getEntityWithConnection(idPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.setPeriodos(new ArrayList<Periodo>());
					periodoLogic.getPeriodos().add(periodoLogic.getPeriodo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodos=new ArrayList<Periodo>();
					this.periodos.add(periodo);
				}
				
				if(periodoLogic.getPeriodo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdAnioPorIdEjercicio")) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdEjercicio(id_anioBusquedaPorIdAnioPorIdEjercicio,id_ejercicioBusquedaPorIdAnioPorIdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periodoLogic.getPeriodosBusquedaPorIdAnioPorIdEjercicio(finalQueryGlobal,pagination,id_anioBusquedaPorIdAnioPorIdEjercicio,id_ejercicioBusquedaPorIdAnioPorIdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdEjercicio(id_anioBusquedaPorIdAnioPorIdEjercicio,id_ejercicioBusquedaPorIdAnioPorIdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdEjercicio(id_anioBusquedaPorIdAnioPorIdEjercicio,id_ejercicioBusquedaPorIdAnioPorIdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periodoLogic.getPeriodos()==null||periodoLogic.getPeriodos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periodos==null|| periodos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periodosAux=new ArrayList<Periodo>();
						periodosAux.addAll(periodoLogic.getPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodosAux=new ArrayList<Periodo>();
							periodosAux.addAll(periodos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periodoLogic.getPeriodosBusquedaPorIdAnioPorIdEjercicio(finalQueryGlobal,pagination,id_anioBusquedaPorIdAnioPorIdEjercicio,id_ejercicioBusquedaPorIdAnioPorIdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdEjercicio(id_anioBusquedaPorIdAnioPorIdEjercicio,id_ejercicioBusquedaPorIdAnioPorIdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceBusquedaPorIdAnioPorIdEjercicio(id_anioBusquedaPorIdAnioPorIdEjercicio,id_ejercicioBusquedaPorIdAnioPorIdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodos("BusquedaPorIdAnioPorIdEjercicio",periodoLogic.getPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodos("BusquedaPorIdAnioPorIdEjercicio",periodos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoLogic.setPeriodos(new ArrayList<Periodo>());
						periodoLogic.getPeriodos().addAll(periodosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodos=new ArrayList<Periodo>();
							periodos.addAll(periodosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periodoLogic.getPeriodosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periodoLogic.getPeriodos()==null||periodoLogic.getPeriodos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periodos==null|| periodos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periodosAux=new ArrayList<Periodo>();
						periodosAux.addAll(periodoLogic.getPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodosAux=new ArrayList<Periodo>();
							periodosAux.addAll(periodos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periodoLogic.getPeriodosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodos("FK_IdAnio",periodoLogic.getPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodos("FK_IdAnio",periodos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoLogic.setPeriodos(new ArrayList<Periodo>());
						periodoLogic.getPeriodos().addAll(periodosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodos=new ArrayList<Periodo>();
							periodos.addAll(periodosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periodoLogic.getPeriodosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periodoLogic.getPeriodos()==null||periodoLogic.getPeriodos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periodos==null|| periodos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periodosAux=new ArrayList<Periodo>();
						periodosAux.addAll(periodoLogic.getPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodosAux=new ArrayList<Periodo>();
							periodosAux.addAll(periodos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periodoLogic.getPeriodosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodos("FK_IdEmpresa",periodoLogic.getPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodos("FK_IdEmpresa",periodos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoLogic.setPeriodos(new ArrayList<Periodo>());
						periodoLogic.getPeriodos().addAll(periodosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodos=new ArrayList<Periodo>();
							periodos.addAll(periodosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPeriodo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPeriodo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=periodoLogic.getPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periodos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=periodoLogic.getPeriodos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periodos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Periodo periodo) {
		Boolean permite=true;
		
		if(this.periodo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PeriodoConstantesFunciones.getOrderByListaPeriodo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PeriodoConstantesFunciones.getOrderByListaPeriodo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Periodo periodo:periodoLogic.getPeriodos()) {
				if(periodo.getsType().equals(Constantes2.S_TOTALES)) {
					periodoTotales=periodo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Periodo periodo:this.periodos) {
				if(periodo.getsType().equals(Constantes2.S_TOTALES)) {
					periodoTotales=periodo;
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
			this.periodoAux=new Periodo();
			this.periodoAux.setsType(Constantes2.S_TOTALES);
			this.periodoAux.setIsNew(false);
			this.periodoAux.setIsChanged(false);
			this.periodoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PeriodoConstantesFunciones.TotalizarValoresFilaPeriodo(this.periodoLogic.getPeriodos(),this.periodoAux);
				
				this.periodoLogic.getPeriodos().add(this.periodoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PeriodoConstantesFunciones.TotalizarValoresFilaPeriodo(this.periodos,this.periodoAux);
				
				this.periodos.add(this.periodoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		periodoTotales=new Periodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.periodoLogic.getPeriodos().remove(periodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.periodos.remove(periodoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		periodoTotales=new Periodo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Periodo periodo:periodoLogic.getPeriodos()) {
				if(periodo.getsType().equals(Constantes2.S_TOTALES)) {
					periodoTotales=periodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PeriodoConstantesFunciones.TotalizarValoresFilaPeriodo(this.periodoLogic.getPeriodos(),periodoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Periodo periodo:this.periodos) {
				if(periodo.getsType().equals(Constantes2.S_TOTALES)) {
					periodoTotales=periodo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PeriodoConstantesFunciones.TotalizarValoresFilaPeriodo(this.periodos,periodoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPeriodosBusquedaPorIdAnioPorIdEjercicio()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdAnioPorIdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodosFK_IdEstadoPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodoPorEmprePorAnioPorMes()throws Exception {
		try {
			sAccionBusqueda="PorEmprePorAnioPorMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodoPorIdPorEmprePorEjerPorAnioPorMes()throws Exception {
		try {
			sAccionBusqueda="PorIdPorEmprePorEjerPorAnioPorMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getPeriodosBusquedaPorIdAnioPorIdEjercicio(String sFinalQuery,Long id_anio,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getPeriodosBusquedaPorIdAnioPorIdEjercicio(sFinalQuery,this.pagination,id_anio,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getPeriodosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getPeriodosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getPeriodosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodosFK_IdEstadoPeriodo(String sFinalQuery,Long id_estado_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getPeriodosFK_IdEstadoPeriodo(sFinalQuery,this.pagination,id_estado_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getPeriodosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodoPorEmprePorAnioPorMes(Long id_empresa,Long id_anio,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getPeriodoPorEmprePorAnioPorMes(id_empresa,id_anio,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodoPorIdPorEmprePorEjerPorAnioPorMes(Long id,Long id_empresa,Long id_ejercicio,Long id_anio,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getPeriodoPorIdPorEmprePorEjerPorAnioPorMes(id,id_empresa,id_ejercicio,id_anio,id_mes);
				
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
	
	public void inicializarPermisosPeriodo() {
		this.isPermisoTodoPeriodo=false;
		this.isPermisoNuevoPeriodo=false;
		this.isPermisoActualizarPeriodo=false;
		this.isPermisoActualizarOriginalPeriodo=false;
		this.isPermisoEliminarPeriodo=false;
		this.isPermisoGuardarCambiosPeriodo=false;
		this.isPermisoConsultaPeriodo=false;
		this.isPermisoBusquedaPeriodo=false;
		this.isPermisoReportePeriodo=false;		
		this.isPermisoOrdenPeriodo=false;		
		this.isPermisoPaginacionMedioPeriodo=false;		
		this.isPermisoPaginacionAltoPeriodo=false;
		this.isPermisoPaginacionTodoPeriodo=false;
		this.isPermisoCopiarPeriodo=false;		
		this.isPermisoVerFormPeriodo=false;		
		this.isPermisoDuplicarPeriodo=false;		
		this.isPermisoOrdenPeriodo=false;		
	}
	
	public void setPermisosUsuarioPeriodo(Boolean isPermiso) {
		this.isPermisoTodoPeriodo=isPermiso;
		this.isPermisoNuevoPeriodo=isPermiso;
		this.isPermisoActualizarPeriodo=isPermiso;
		this.isPermisoActualizarOriginalPeriodo=isPermiso;
		this.isPermisoEliminarPeriodo=isPermiso;
		this.isPermisoGuardarCambiosPeriodo=isPermiso;
		this.isPermisoConsultaPeriodo=isPermiso;
		this.isPermisoBusquedaPeriodo=isPermiso;
		this.isPermisoReportePeriodo=isPermiso;
		this.isPermisoOrdenPeriodo=isPermiso;		
		this.isPermisoPaginacionMedioPeriodo=isPermiso;		
		this.isPermisoPaginacionAltoPeriodo=isPermiso;		
		this.isPermisoPaginacionTodoPeriodo=isPermiso;		
		this.isPermisoCopiarPeriodo=isPermiso;		
		this.isPermisoVerFormPeriodo=isPermiso;		
		this.isPermisoDuplicarPeriodo=isPermiso;
		this.isPermisoOrdenPeriodo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPeriodo(Boolean isPermiso) {
		//this.isPermisoTodoPeriodo=isPermiso;
		this.isPermisoNuevoPeriodo=isPermiso;
		this.isPermisoActualizarPeriodo=isPermiso;
		this.isPermisoActualizarOriginalPeriodo=isPermiso;
		this.isPermisoEliminarPeriodo=isPermiso;
		this.isPermisoGuardarCambiosPeriodo=isPermiso;
		//this.isPermisoConsultaPeriodo=isPermiso;
		//this.isPermisoBusquedaPeriodo=isPermiso;
		//this.isPermisoReportePeriodo=isPermiso;
		//this.isPermisoOrdenPeriodo=isPermiso;		
		//this.isPermisoPaginacionMedioPeriodo=isPermiso;		
		//this.isPermisoPaginacionAltoPeriodo=isPermiso;		
		//this.isPermisoPaginacionTodoPeriodo=isPermiso;		
		//this.isPermisoCopiarPeriodo=isPermiso;		
		//this.isPermisoDuplicarPeriodo=isPermiso;
		//this.isPermisoOrdenPeriodo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPeriodoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPeriodo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPeriodoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPeriodoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPeriodoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPeriodoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPeriodo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.periodoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PeriodoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPeriodo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPeriodo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPeriodo=this.isPermisoActualizarPeriodo;
			this.isPermisoEliminarPeriodo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPeriodo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPeriodo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPeriodo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPeriodo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePeriodo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPeriodo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPeriodo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPeriodo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPeriodo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPeriodo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPeriodo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPeriodo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.periodoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPeriodo.setToolTipText(this.jTableDatosPeriodo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPeriodo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPeriodo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPeriodo() throws Exception {
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
	public void inicializarCombosForeignKeyPeriodoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.estadoperiodosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPeriodoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PeriodoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPeriodoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
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

			if(cargarCombosDependencia && (this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
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

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyPeriodoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PeriodoParameterReturnGeneral periodoReturnGeneral=new PeriodoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.periodoConstantesFunciones.cargarid_empresaPeriodo)
					 || (this.esRecargarFks && this.periodoConstantesFunciones.cargarid_empresaPeriodo)) {

					if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+periodoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.periodoConstantesFunciones.cargarid_anioPeriodo)
					 || (this.esRecargarFks && this.periodoConstantesFunciones.cargarid_anioPeriodo)) {

					if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+periodoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(cargarCombosDependencia && ((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.periodoConstantesFunciones.cargarid_ejercicioPeriodo)
					 || (this.esRecargarFks && this.periodoConstantesFunciones.cargarid_ejercicioPeriodo)) {

					if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+periodoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.periodoConstantesFunciones.cargarid_mesPeriodo)
					 || (this.esRecargarFks && this.periodoConstantesFunciones.cargarid_mesPeriodo)) {

					if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+periodoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}


				String finalQueryGlobalEstadoPeriodo="";

				if(((this.estadoperiodosForeignKey==null||this.estadoperiodosForeignKey.size()<=0) && this.periodoConstantesFunciones.cargarid_estado_periodoPeriodo)
					 || (this.esRecargarFks && this.periodoConstantesFunciones.cargarid_estado_periodoPeriodo)) {

					if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoPeriodoConstantesFunciones.getArrayColumnasGlobalesEstadoPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoPeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoPeriodo, "");
						finalQueryGlobalEstadoPeriodo+=EstadoPeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoPeriodo=" WHERE " + ConstantesSql.ID + "="+periodoSessionBean.getlidEstadoPeriodoActual();
					}
				} else {
					finalQueryGlobalEstadoPeriodo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				periodoReturnGeneral=periodoLogic.cargarCombosLoteForeignKeyPeriodo(finalQueryGlobalEmpresa,finalQueryGlobalAnio,finalQueryGlobalEjercicio,finalQueryGlobalMes,finalQueryGlobalEstadoPeriodo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=periodoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=periodoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=periodoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=periodoReturnGeneral.getmessForeignKey();
			}

			if(!finalQueryGlobalEstadoPeriodo.equals("NONE")) {
				this.estadoperiodosForeignKey=periodoReturnGeneral.getestadoperiodosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPeriodo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyEstadoPeriodo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.periodoSessionBean==null) {
				this.periodoSessionBean=new PeriodoSessionBean();
			}

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoPeriodo()throws Exception {
		try {

			if(!this.periodoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoPeriodo()) {
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
	
	public void initActionsCombosTodosForeignKeyPeriodo()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEmpresa("Todos");
			this.initActionsCombosForeignKeyAnio("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEmpresa(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyAnio(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyEmpresa(JComboBox jComboBoxEmpresaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Empresa empresaLocal=(Empresa)jComboBoxEmpresaGenerico.getSelectedItem();

			if(empresaLocal!=null  && empresaLocal.getId()!=null  && empresaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_empresa="+empresaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboEjercicio=sFinalQueryCombo;

			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();
			this.cargarCombosForeignKeyEjercicio(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyAnio(JComboBox jComboBoxAnioGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Anio anioLocal=(Anio)jComboBoxAnioGenerico.getSelectedItem();

			if(anioLocal!=null  && anioLocal.getId()!=null  && anioLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_anio="+anioLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboEjercicio=sFinalQueryCombo;

			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();
			this.cargarCombosForeignKeyEjercicio(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.addItemListener(new ComboBoxItemListener(this,"id_empresaPeriodo"));
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.addFocusListener(new ComboBoxFocusListener(this,"id_empresaPeriodo"));
					}
				} else {
					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.addActionListener(new ComboBoxActionListener(this,"id_empresaPeriodo"));
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.addFocusListener(new ComboBoxFocusListener(this,"id_empresaPeriodo"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyAnio(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.addItemListener(new ComboBoxItemListener(this,"id_anioPeriodo"));
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.addFocusListener(new ComboBoxFocusListener(this,"id_anioPeriodo"));
					}
				} else {
					if(this.jInternalFrameDetalleFormPeriodo!=null) {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.addActionListener(new ComboBoxActionListener(this,"id_anioPeriodo"));
						this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.addFocusListener(new ComboBoxFocusListener(this,"id_anioPeriodo"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo"));

						this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo"));

					} else {
						this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo"));

						this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_anioFK_IdAnioPeriodo.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_anioFK_IdAnioPeriodo"));

						this.jComboBoxid_anioFK_IdAnioPeriodo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_anioFK_IdAnioPeriodo"));

					} else {
						this.jComboBoxid_anioFK_IdAnioPeriodo.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_anioFK_IdAnioPeriodo"));

						this.jComboBoxid_anioFK_IdAnioPeriodo.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_anioFK_IdAnioPeriodo"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyPeriodo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.periodo.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.periodo.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPeriodo(Periodo periodo)throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(periodo.getid_ejercicio(),false,"Formulario");
			this.setActualEstadoPeriodoForeignKey(periodo.getid_estado_periodo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPeriodo(Periodo periodo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPeriodo()throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(this.periodoConstantesFunciones.getid_ejercicio(),false,"Formulario");
			this.setActualEstadoPeriodoForeignKey(this.periodoConstantesFunciones.getid_estado_periodo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPeriodo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPeriodo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPeriodo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameEstadoPeriodosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPeriodo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoPeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo!=null && this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo!=null && this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo!=null && this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo!=null && this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo!=null && this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormPeriodoEmpresa(JComboBox<?> jComboBoxGenericoEmpresa,String sFormularioTipoBusqueda) throws Exception {

	}

	public void recargarFormPeriodoAnio(JComboBox<?> jComboBoxGenericoAnio,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormPeriodoid_ejercicio(jComboBoxGenericoAnio,sFormularioTipoBusqueda,"Anio",false);
	}






	
	



	public void recargarFormPeriodoid_ejercicio(JComboBox<?> jComboBoxGenericoEjercicio,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Anio")){
				this.setActualParaGuardarAnioForeignKey(this.periodo,jComboBoxGenericoEjercicio);
			}

			if(this.periodo.getid_anio()!=null && this.periodo.getid_anio()!=0L) {
				sFinalQuery+="  WHERE  id_anio="+this.periodo.getid_anio();
			} else {
				sFinalQuery+="  WHERE  id_anio=-1";
			}



			//BUCLE RECURSIVO
			this.setActualEjercicioForeignKey(this.periodo.getid_anio(),true,sFormularioTipoBusqueda);

			this.cargarCombosEjerciciosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public PeriodoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PeriodoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PeriodoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.periodoSessionBean=new PeriodoSessionBean(); 
		this.periodoConstantesFunciones=new PeriodoConstantesFunciones(); 
		this.periodoBean=new Periodo();//(this.periodoConstantesFunciones); 		
		this.periodoReturnGeneral=new PeriodoParameterReturnGeneral(); 
		
		this.periodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PeriodoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPeriodo(true);
			
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
			
			this.periodoConstantesFunciones=new PeriodoConstantesFunciones(); 
			this.periodoBean=new Periodo();//this.periodoConstantesFunciones); 			
			this.periodoReturnGeneral=new PeriodoParameterReturnGeneral(); 
		
			PeriodoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Periodo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.periodo=new Periodo();
			this.periodos = new ArrayList<Periodo>();
			this.periodosAux = new ArrayList<Periodo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic=new PeriodoLogic();
				this.periodoLogic.getNewConnexionToDeep("");
			}
			
			//this.periodoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.periodoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPeriodo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPeriodo);	
					}
					
					if(this.jInternalFrameImportacionPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPeriodo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPeriodo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPeriodo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPeriodo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPeriodo);
				this.jInternalFrameDetalleFormPeriodo.setVisible(false);
				this.jInternalFrameDetalleFormPeriodo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPeriodo);
					this.jInternalFrameReporteDinamicoPeriodo.setVisible(false);
					this.jInternalFrameReporteDinamicoPeriodo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPeriodo);
					this.jInternalFrameImportacionPeriodo.setVisible(false);
					this.jInternalFrameImportacionPeriodo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPeriodo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPeriodo);
					this.jInternalFrameOrderByPeriodo.setVisible(false);
					this.jInternalFrameOrderByPeriodo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPeriodoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PeriodoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.periodoReturnGeneral=new PeriodoParameterReturnGeneral();
			
			this.periodoParameterGeneral=new PeriodoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.periodoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PeriodoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.periodoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.periodoSessionBean.getEsGuardarRelacionado(),this.periodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PeriodoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.periodoSessionBean.getEsGuardarRelacionado(),this.periodoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPeriodo=false;
			this.isVisibilidadCeldaDuplicarPeriodo=true;
			this.isVisibilidadCeldaCopiarPeriodo=true;
			this.isVisibilidadCeldaVerFormPeriodo=true;
			this.isVisibilidadCeldaOrdenPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=false;
			this.isVisibilidadCeldaModificarPeriodo=false;
			this.isVisibilidadCeldaActualizarPeriodo=false;
			this.isVisibilidadCeldaEliminarPeriodo=false;
			this.isVisibilidadCeldaCancelarPeriodo=false;
			this.isVisibilidadCeldaGuardarPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodo=false;
			
			
			this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoPeriodo=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPeriodo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPeriodo(false);
			
			this.setPermisosUsuarioPeriodo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periodoSessionBean.getEsGuardarRelacionado() 
				|| (this.periodoSessionBean.getEsGuardarRelacionado() && this.periodoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPeriodoClasesRelacionadas();
			}
			
			if(this.periodoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPeriodoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPeriodo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPeriodo();
			}
			
			if(!this.isPermisoBusquedaPeriodo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPeriodo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periodoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPeriodo,this.isPermisoPaginacionMedioPeriodo,this.isPermisoPaginacionTodoPeriodo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PeriodoConstantesFunciones.getTiposSeleccionarPeriodo());
				
				this.tiposColumnasSelect=PeriodoConstantesFunciones.getTiposSeleccionarPeriodo(true);
				
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
			//if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPeriodo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPeriodo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPeriodo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodo() ;
			
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
			this.anioLogic=new AnioLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.mesLogic=new MesLogic();
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
				periodoImplementable= (PeriodoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				periodoImplementableHome= (PeriodoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PeriodoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.periodos= new ArrayList<Periodo>();
			this.periodosEliminados= new ArrayList<Periodo>();
						
			this.isEsNuevoPeriodo=false;
			this.esParaAccionDesdeFormularioPeriodo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.estadoperiodosForeignKey=new ArrayList<EstadoPeriodo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPeriodo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPeriodo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PeriodoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PeriodoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPeriodo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPeriodo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPeriodo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPeriodo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPeriodo();
			}
			
			PeriodoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPeriodo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPeriodo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPeriodo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPeriodo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Periodo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPeriodo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPeriodo")) {
				iIndex=this.jInternalFrameDetalleFormPeriodo.jTabbedPaneRelacionesPeriodo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPeriodo.jTabbedPaneRelacionesPeriodo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPeriodo();	
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
	
	public void cargarCombosForeignKeyPeriodo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPeriodo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPeriodoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPeriodo();
		
		this.cargarCombosFrameForeignKeyPeriodo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPeriodo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPeriodo();
		}
	}
	
	

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyAnio("Todos");
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEjercicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyAnio("Todos");
				}

			this.recargarComboTablaEjercicio(this.ejerciciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyAnio("Todos");
				}

			this.recargarComboTablaMes(this.messForeignKey);

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
					this.initActionsCombosForeignKeyAnio("Todos");
				}

			this.recargarComboTablaEstadoPeriodo(this.estadoperiodosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.periodoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
			
			if(jTableDatosPeriodo.getRowCount()>=1) {
				jTableDatosPeriodo.removeRowSelectionInterval(0, jTableDatosPeriodo.getRowCount()-1);						
			}
			
			this.isEsNuevoPeriodo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPeriodo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPeriodo(true);			
			//this.periodo=new Periodo();
			//this.periodo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodo() ;
			
			if(PeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.periodo);	
			this.actualizarInformacion("INFO_PADRE",false,this.periodo);				
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
			if(this.periodoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Periodo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPeriodoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPeriodo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPeriodo.getSelectedRows().length;			
			}
			
			periodosSeleccionados=this.getPeriodosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPeriodo--;			
				//Periodo periodoAux= new Periodo();			
				//periodoAux.setId(this.iIdNuevoPeriodo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Periodo periodoOrigen=new Periodo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Periodo periodoOrigen : periodosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							periodoOrigen =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoOrigen =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPeriodo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.periodo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPeriodo(periodoOrigen,this.periodo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.periodoLogic.getPeriodos().add(this.periodoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.periodos.add(this.periodoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPeriodo(false);
				
				this.jTableDatosPeriodo.setRowSelectionInterval(this.getIndiceNuevoPeriodo(), this.getIndiceNuevoPeriodo());
				
				int iLastRow =  this.jTableDatosPeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();									
		
			Periodo periodoOrigen=new Periodo();
			Periodo periodoDestino=new Periodo();
				
			periodosSeleccionados=this.getPeriodosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPeriodo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || periodosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPeriodo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoOrigen =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						periodoOrigen =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoDestino =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						periodoDestino =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				periodoOrigen =periodosSeleccionados.get(0);
				periodoDestino =periodosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPeriodo(periodoOrigen,periodoDestino,true,false);
				
				periodoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(periodoDestino,periodoLogic.getPeriodos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoDestino,periodos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPeriodo(false);
				
				//this.jTableDatosPeriodo.setRowSelectionInterval(this.getIndiceNuevoPeriodo(), this.getIndiceNuevoPeriodo());
				
				int iLastRow =  this.jTableDatosPeriodo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPeriodo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPeriodo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPeriodo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPeriodo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPeriodo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPeriodo.setVisible(!isVisible);
			this.jPanelPaginacionPeriodo.setVisible(!isVisible);
			this.jPanelAccionesPeriodo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePeriodo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPeriodo();
			
			this.abrirFrameOrderByPeriodo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPeriodo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePeriodo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPeriodo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPeriodo.isMaximum()) {
					this.jInternalFrameDetalleFormPeriodo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPeriodo.setSize(this.jInternalFrameDetalleFormPeriodo.iWidthFormulario,this.jInternalFrameDetalleFormPeriodo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPeriodo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPeriodo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPeriodo.isMaximum()) {
						this.jInternalFrameDetalleFormPeriodo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPeriodo.jContentPaneDetallePeriodo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPeriodo.jTabbedPaneRelacionesPeriodo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPeriodo.jContentPaneDetallePeriodo.getWidth(),PeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPeriodo.jTabbedPaneRelacionesPeriodo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPeriodo.jContentPaneDetallePeriodo.getWidth(),PeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPeriodo.jTabbedPaneRelacionesPeriodo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPeriodo.jContentPaneDetallePeriodo.getWidth(),PeriodoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPeriodo.setVisible(true);
	        this.jInternalFrameDetalleFormPeriodo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPeriodo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodo,false,this);
				} else {
					this.jInternalFrameOrderByPeriodo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPeriodo);
				this.jInternalFrameOrderByPeriodo.setVisible(false);
				this.jInternalFrameOrderByPeriodo.setSelected(false);
				
				this.jInternalFrameOrderByPeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPeriodo"));
				
				this.inicializarActualizarBindingTablaOrderByPeriodo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPeriodo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPeriodo==null) {
				
				this.jInternalFrameImportacionPeriodo=new ImportacionJInternalFrame(PeriodoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPeriodo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPeriodo);
				this.jInternalFrameImportacionPeriodo.setVisible(false);
				this.jInternalFrameImportacionPeriodo.setSelected(false);


				this.jInternalFrameImportacionPeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPeriodo"));
				this.jInternalFrameImportacionPeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPeriodo"));
				this.jInternalFrameImportacionPeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPeriodo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPeriodo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPeriodo==null) {
				this.jInternalFrameReporteDinamicoPeriodo=new ReporteDinamicoJInternalFrame(PeriodoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPeriodo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPeriodo);
				this.jInternalFrameReporteDinamicoPeriodo.setVisible(false);
				this.jInternalFrameReporteDinamicoPeriodo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodo"));
				this.jInternalFrameReporteDinamicoPeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodo"));
				this.jInternalFrameReporteDinamicoPeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetallePeriodo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPeriodo);
			
	       	this.jInternalFrameDetalleFormPeriodo.setVisible(false);
	        this.jInternalFrameDetalleFormPeriodo.setSelected(false);
			
			//this.jInternalFrameDetalleFormPeriodo.dispose();
			//this.jInternalFrameDetalleFormPeriodo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPeriodo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPeriodo.setVisible(true);
	        this.jInternalFrameReporteDinamicoPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPeriodo.setVisible(true);
	        this.jInternalFrameImportacionPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPeriodo.setVisible(true);
	        this.jInternalFrameOrderByPeriodo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPeriodo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPeriodo.setVisible(false);
	        this.jInternalFrameOrderByPeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPeriodo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPeriodo.setVisible(false);
	        this.jInternalFrameReporteDinamicoPeriodo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPeriodo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPeriodo.setVisible(false);
	        this.jInternalFrameImportacionPeriodo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPeriodo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPeriodo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPeriodo(true);
			//this.isEsNuevoPeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodo(false) ;
			
			if(periodoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPeriodoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPeriodo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPeriodo(true);
			//this.isEsNuevoPeriodo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.periodo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPeriodo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPeriodo(false) ;
			
			if(PeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPeriodo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEjercicio(List<Ejercicio> ejerciciosForeignKey)throws Exception{
		TableColumn tableColumnEjercicio=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_IDEJERCICIO));
		TableCellEditor tableCellEditorEjercicio =tableColumnEjercicio.getCellEditor();

		EjercicioTableCell ejercicioTableCellFk=(EjercicioTableCell)tableCellEditorEjercicio;

		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.setejerciciosForeignKey(ejerciciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPeriodo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ejercicioTableCellFk.setRowActual(intSelectedRow);
			//ejercicioTableCellFk.setejerciciosForeignKeyActual(ejerciciosForeignKey);
		//}


		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.RecargarEjerciciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPeriodo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoPeriodo(List<EstadoPeriodo> estadoperiodosForeignKey)throws Exception{
		TableColumn tableColumnEstadoPeriodo=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO));
		TableCellEditor tableCellEditorEstadoPeriodo =tableColumnEstadoPeriodo.getCellEditor();

		EstadoPeriodoTableCell estadoperiodoTableCellFk=(EstadoPeriodoTableCell)tableCellEditorEstadoPeriodo;

		if(estadoperiodoTableCellFk!=null) {
			estadoperiodoTableCellFk.setestadoperiodosForeignKey(estadoperiodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPeriodo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadoperiodoTableCellFk.setRowActual(intSelectedRow);
			//estadoperiodoTableCellFk.setestadoperiodosForeignKeyActual(estadoperiodosForeignKey);
		//}


		if(estadoperiodoTableCellFk!=null) {
			estadoperiodoTableCellFk.RecargarEstadoPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPeriodo(false);
			
			//if(!this.isEsNuevoPeriodo) {								
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				
			}
			
			if(this.permiteMantenimiento(this.periodo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.periodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPeriodo=true;
					this.inicializarActualizarBindingTablaPeriodo(false);
					this.isEsNuevoPeriodo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPeriodo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPeriodo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodo(false);
				
				this.habilitarDeshabilitarControlesPeriodo(false);
			
												
				
				if(PeriodoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePeriodo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPeriodoActionPerformed(evt,periodoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPeriodo(this.periodo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPeriodo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,periodoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.periodo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPeriodoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				this.periodo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				this.periodo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.periodo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.periodoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PeriodoModel) this.jTableDatosPeriodo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPeriodo=true;
				this.inicializarActualizarBindingTablaPeriodo(false);
				this.isEsNuevoPeriodo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPeriodo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodo(false);
				
				this.habilitarDeshabilitarControlesPeriodo(false);
				
				
				
				if(PeriodoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePeriodo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPeriodoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPeriodo.getRowCount()>=1) {
				jTableDatosPeriodo.removeRowSelectionInterval(0, jTableDatosPeriodo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPeriodo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPeriodo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodo(false) ;
			
			this.isEsNuevoPeriodo=false;
			
			if(PeriodoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePeriodo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPeriodo(false);
				
				//SI ES MANUAL
				if(PeriodoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPeriodo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPeriodo--;			
			//Periodo periodoAux= new Periodo();			
			//periodoAux.setId(this.iIdNuevoPeriodo);
			
			if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPeriodo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
			
			this.periodo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.periodoLogic.getPeriodos().add(this.periodoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.periodos.add(this.periodoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPeriodo(false);
			
			this.jTableDatosPeriodo.setRowSelectionInterval(this.getIndiceNuevoPeriodo(), this.getIndiceNuevoPeriodo());
			
			int iLastRow =  this.jTableDatosPeriodo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPeriodo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPeriodo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPeriodo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPeriodo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodo(false);
			
			//SI ES MANUAL
			if(PeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodo();
			}
			
			//this.abrirFrameTreePeriodo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE PeriodoS ?", "MANTENIMIENTO DE Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPeriodo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPeriodo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.periodoReturnGeneral=periodoLogic.procesarImportacionPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.periodoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPeriodoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPeriodoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPeriodo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPeriodo.setFileImportacion(this.jInternalFrameImportacionPeriodo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPeriodo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPeriodo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPeriodo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPeriodo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();		

		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PeriodoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PeriodoBaseDesign.jrxml";
			
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
			
			this.generarReportePeriodos("Todos",periodosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PeriodoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoPeriodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoPeriodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoPeriodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoPeriodo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPeriodo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PeriodoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PeriodoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case PeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PeriodoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case PeriodoConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case PeriodoConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case PeriodoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PeriodoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO:
					sNombreCampoCategoria="id_estado_periodo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PeriodoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PeriodoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case PeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PeriodoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case PeriodoConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case PeriodoConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case PeriodoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PeriodoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO:
					sNombreCampoCategoriaValor="id_estado_periodo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PeriodoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PeriodoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case PeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PeriodoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case PeriodoConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case PeriodoConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case PeriodoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PeriodoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_periodo");
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
	
	public void jButtonGenerarExcelReporteDinamicoPeriodoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();		
		
		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Periodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PeriodoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Periodo periodo:periodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(Periodo periodo:periodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodo.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(Periodo periodo:periodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodo.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(Periodo periodo:periodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodo.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(Periodo periodo:periodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodo.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(Periodo periodo:periodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodo.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Periodo periodo:periodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Periodo periodo:periodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodo.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO);
					iRow++;

					for(Periodo periodo:periodosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodo.getestadoperiodo_descripcion());
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
			//	this.getFilaCabeceraExportarExcelPeriodo(row);				
			//	iRow++;
			//}				
			
			//for(Periodo periodoAux:periodosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPeriodo(periodoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
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
				this.periodoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodo(false);
			
			//SI ES MANUAL
			if(PeriodoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodo(false);
			
			//SI ES MANUAL
			if(PeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPeriodo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPeriodoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodo(false);
			
			//SI ES MANUAL
			if(PeriodoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPeriodo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPeriodo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPeriodo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPeriodo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPeriodo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPeriodo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPeriodo.setMinimumSize(dimensionMinimum);
		this.jTableDatosPeriodo.setMaximumSize(dimensionMaximum);
		this.jTableDatosPeriodo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPeriodo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPeriodo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPeriodo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPeriodo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPeriodo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPeriodo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPeriodo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PeriodoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPeriodo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPeriodo();
		
		this.inicializarActualizarBindingBotonesManualPeriodo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPeriodo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPeriodo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPeriodo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePeriodo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPeriodo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPeriodo.jCheckBoxPostAccionNuevoPeriodo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPeriodo.jCheckBoxPostAccionSinCerrarPeriodo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPeriodo.jCheckBoxPostAccionSinMensajePeriodo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPeriodo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPeriodo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePeriodo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPeriodo!=null) {
				this.jInternalFrameDetalleFormPeriodo.jCheckBoxPostAccionNuevoPeriodo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPeriodo.jCheckBoxPostAccionSinCerrarPeriodo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPeriodo.jCheckBoxPostAccionSinMensajePeriodo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPeriodo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPeriodo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPeriodo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPeriodo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPeriodo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPeriodo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPeriodo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPeriodo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPeriodo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPeriodo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPeriodo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPeriodo(Boolean esInicializar) throws Exception {
		try	{	
			if(PeriodoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPeriodo() throws Exception {
		try	{
			if(PeriodoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPeriodo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePeriodo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPeriodo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPeriodo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPeriodo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPeriodo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPeriodo.addItem(reporte);
			}
			
			
			if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPeriodo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPeriodo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPeriodo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPeriodo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPeriodo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPeriodo!=null) {
				this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPeriodo!=null) {
				this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPeriodo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPeriodo!=null) {
				
				if(this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPeriodo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPeriodo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPeriodo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPeriodo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPeriodo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.getSelectedItem()!=null){this.id_anioBusquedaPorIdAnioPorIdEjercicio=((Anio)this.jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo.getSelectedItem()).getId();}
		if(this.jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.getSelectedItem()!=null){this.id_ejercicioBusquedaPorIdAnioPorIdEjercicio=((Ejercicio)this.jComboBoxid_ejercicioBusquedaPorIdAnioPorIdEjercicioPeriodo.getSelectedItem()).getId();}
		if(this.jComboBoxid_anioFK_IdAnioPeriodo.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioPeriodo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPeriodo(Boolean esInicializar) throws Exception {				
		if(PeriodoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPeriodo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPeriodo() throws Exception {
		this.inicializarActualizarBindingTablaPeriodo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPeriodo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPeriodoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPeriodo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=periodoLogic.getPeriodos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=periodos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPeriodo.setModel(new PeriodoModel(this.periodoLogic.getPeriodos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPeriodo.setModel(new PeriodoModel(this.periodos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPeriodo!=null && this.jInternalFrameOrderByPeriodo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPeriodo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PeriodoConstantesFunciones.SCLASSWEBTITULO,periodoConstantesFunciones.resaltarSeleccionarPeriodo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PeriodoConstantesFunciones.SCLASSWEBTITULO,periodoConstantesFunciones.resaltarSeleccionarPeriodo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_ID));

		if(this.periodoConstantesFunciones.mostraridPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.periodoConstantesFunciones.resaltaridPeriodo,this.periodoConstantesFunciones.activaridPeriodo,this,true,"idPeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.periodoConstantesFunciones.resaltaridPeriodo,this.periodoConstantesFunciones.activaridPeriodo,this,true,"idPeriodo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.periodoConstantesFunciones.mostrarid_empresaPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.periodoConstantesFunciones.resaltarid_empresaPeriodo,this,this.periodoConstantesFunciones.activarid_empresaPeriodo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.periodoConstantesFunciones.resaltarid_empresaPeriodo,this,this.periodoConstantesFunciones.activarid_empresaPeriodo,false,"id_empresaPeriodo","GLOBAL-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_IDANIO));

		if(this.periodoConstantesFunciones.mostrarid_anioPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.periodoConstantesFunciones.resaltarid_anioPeriodo,this,this.periodoConstantesFunciones.activarid_anioPeriodo));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.periodoConstantesFunciones.resaltarid_anioPeriodo,this,this.periodoConstantesFunciones.activarid_anioPeriodo,true,"id_anioPeriodo","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.periodoConstantesFunciones.mostrarid_ejercicioPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.periodoConstantesFunciones.resaltarid_ejercicioPeriodo,this,this.periodoConstantesFunciones.activarid_ejercicioPeriodo));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.periodoConstantesFunciones.resaltarid_ejercicioPeriodo,this,this.periodoConstantesFunciones.activarid_ejercicioPeriodo,true,"id_ejercicioPeriodo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_IDMES));

		if(this.periodoConstantesFunciones.mostrarid_mesPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.periodoConstantesFunciones.resaltarid_mesPeriodo,this,this.periodoConstantesFunciones.activarid_mesPeriodo));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.periodoConstantesFunciones.resaltarid_mesPeriodo,this,this.periodoConstantesFunciones.activarid_mesPeriodo,true,"id_mesPeriodo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_FECHAINICIO));

		if(this.periodoConstantesFunciones.mostrarfecha_inicioPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.periodoConstantesFunciones.resaltarfecha_inicioPeriodo,this.periodoConstantesFunciones.activarfecha_inicioPeriodo,this,true,"fecha_inicioPeriodo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.periodoConstantesFunciones.resaltarfecha_inicioPeriodo,this.periodoConstantesFunciones.activarfecha_inicioPeriodo,this,true,"fecha_inicioPeriodo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_FECHAFIN));

		if(this.periodoConstantesFunciones.mostrarfecha_finPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.periodoConstantesFunciones.resaltarfecha_finPeriodo,this.periodoConstantesFunciones.activarfecha_finPeriodo,this,true,"fecha_finPeriodo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.periodoConstantesFunciones.resaltarfecha_finPeriodo,this.periodoConstantesFunciones.activarfecha_finPeriodo,this,true,"fecha_finPeriodo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_NOMBRE));

		if(this.periodoConstantesFunciones.mostrarnombrePeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.periodoConstantesFunciones.resaltarnombrePeriodo,this.periodoConstantesFunciones.activarnombrePeriodo,this,true,"nombrePeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.periodoConstantesFunciones.resaltarnombrePeriodo,this.periodoConstantesFunciones.activarnombrePeriodo,this,true,"nombrePeriodo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.periodoConstantesFunciones.mostrardescripcionPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.periodoConstantesFunciones.resaltardescripcionPeriodo,this.periodoConstantesFunciones.activardescripcionPeriodo,this,true,"descripcionPeriodo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.periodoConstantesFunciones.resaltardescripcionPeriodo,this.periodoConstantesFunciones.activardescripcionPeriodo,this,true,"descripcionPeriodo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO));

		if(this.periodoConstantesFunciones.mostrarid_estado_periodoPeriodo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoPeriodoTableCell(this.estadoperiodosForeignKey,this.periodoConstantesFunciones.resaltarid_estado_periodoPeriodo,this,this.periodoConstantesFunciones.activarid_estado_periodoPeriodo));
			tableColumn.setCellEditor(new EstadoPeriodoTableCell(this.estadoperiodosForeignKey,this.periodoConstantesFunciones.resaltarid_estado_periodoPeriodo,this,this.periodoConstantesFunciones.activarid_estado_periodoPeriodo,true,"id_estado_periodoPeriodo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.periodoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.periodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.periodoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPeriodo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.periodoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.periodoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPeriodo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPeriodo && this.isPermisoGuardarCambiosPeriodo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.periodoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.periodoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPeriodo.addColumn(tableColumn);
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
			
			this.jTableDatosPeriodo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPeriodo && this.isPermisoGuardarCambiosPeriodo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPeriodo && this.isPermisoGuardarCambiosPeriodo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPeriodo.moveColumn(this.jTableDatosPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPeriodo.moveColumn(this.jTableDatosPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPeriodo.moveColumn(this.jTableDatosPeriodo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPeriodo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPeriodo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPeriodo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPeriodo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPeriodo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPeriodo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPeriodo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPeriodo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=periodoLogic.getPeriodos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=periodos.size()-1;
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
		//this.jTableDatosPeriodo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPeriodo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPeriodo();
			
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
				
				//this.isEsNuevoPeriodo=false;
					
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
				if(this.periodoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPeriodo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPeriodo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.periodo.getsType().equals("DUPLICADO")
				   || this.periodo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPeriodo=true;
				
				} else {
					this.isEsNuevoPeriodo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.periodoSessionBean.getEsGuardarRelacionado()) {
					if(this.periodo.getId()>=0 && !this.periodo.getIsNew()) {						
						this.isEsNuevoPeriodo=false;
						
					} else {
						this.isEsNuevoPeriodo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPeriodo(esRelaciones);						
				
				this.seleccionarPeriodo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.periodo.getId()<0) {
					this.isEsNuevoPeriodo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPeriodo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPeriodo(evt,rowIndex);
				}	
				
				if(this.periodoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Periodo: " + this.dDif); 
					}
				}								
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPeriodo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.periodo)) {
					if(this.periodo.getId()>0) {
						this.periodo.setIsDeleted(true);
						
						this.periodosEliminados.add(this.periodo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.periodoLogic.getPeriodos().remove(this.periodo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.periodos.remove(this.periodo);				
					}
					
					
					((PeriodoModel) this.jTableDatosPeriodo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPeriodo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPeriodo) {
			
			if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPeriodo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPeriodo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPeriodo(this.periodo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.periodoConstantesFunciones.cargarid_empresaPeriodo || this.periodoConstantesFunciones.event_dependid_empresaPeriodo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.periodo.getid_empresa());
									//this.inicializarActualizarBindingPeriodo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(periodo.getEmpresa()!=null) {
							this.empresasForeignKey.add(periodo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.periodo.getid_empresa(),false,"Formulario");

					//Anio
					if(!this.periodoConstantesFunciones.cargarid_anioPeriodo || this.periodoConstantesFunciones.event_dependid_anioPeriodo) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.periodo.getid_anio());
									//this.inicializarActualizarBindingPeriodo(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(periodo.getAnio()!=null) {
							this.aniosForeignKey.add(periodo.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.periodo.getid_anio(),false,"Formulario");

					//Ejercicio
					if(!this.periodoConstantesFunciones.cargarid_ejercicioPeriodo || this.periodoConstantesFunciones.event_dependid_ejercicioPeriodo) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.periodo.getid_ejercicio());
									//this.inicializarActualizarBindingPeriodo(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(periodo.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(periodo.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.periodo.getid_ejercicio(),false,"Formulario");

					//Mes
					if(!this.periodoConstantesFunciones.cargarid_mesPeriodo || this.periodoConstantesFunciones.event_dependid_mesPeriodo) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.periodo.getid_mes());
									//this.inicializarActualizarBindingPeriodo(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(periodo.getMes()!=null) {
							this.messForeignKey.add(periodo.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.periodo.getid_mes(),false,"Formulario");

					//EstadoPeriodo
					if(!this.periodoConstantesFunciones.cargarid_estado_periodoPeriodo || this.periodoConstantesFunciones.event_dependid_estado_periodoPeriodo) {
						//this.cargarCombosEstadoPeriodosForeignKeyLista(" where id="+this.periodo.getid_estado_periodo());
									//this.inicializarActualizarBindingPeriodo(false,false);
						this.estadoperiodosForeignKey=new ArrayList<EstadoPeriodo>();

						if(periodo.getEstadoPeriodo()!=null) {
							this.estadoperiodosForeignKey.add(periodo.getEstadoPeriodo());
						}

						this.addItemDefectoCombosForeignKeyEstadoPeriodo();
						this.cargarCombosFrameEstadoPeriodosForeignKey("Todos");
					}
					this.setActualEstadoPeriodoForeignKey(this.periodo.getid_estado_periodo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPeriodo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPeriodo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPeriodo(Periodo periodo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPeriodo(periodo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPeriodo(Periodo periodo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPeriodo(periodo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPeriodo(periodo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPeriodo(periodo);
	}
	
	public void setVariablesObjetoActualToFormularioPeriodo(Periodo periodo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.setText(periodo.getId().toString());
			this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_inicioPeriodo.setDate(periodo.getfecha_inicio());
			this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_finPeriodo.setDate(periodo.getfecha_fin());
			this.jInternalFrameDetalleFormPeriodo.jTextFieldnombrePeriodo.setText(periodo.getnombre());
			this.jInternalFrameDetalleFormPeriodo.jTextAreadescripcionPeriodo.setText(periodo.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Periodo periodoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,periodoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Periodo periodoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				periodoLocal=this.periodo;
			} else {
				periodoLocal=this.periodoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(periodoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPeriodo(periodoLocal,true);
					
					if(periodoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(periodoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.periodoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(periodoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPeriodo(Periodo periodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPeriodo(periodo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(periodo);
	}
	
	public void setVariablesFormularioToObjetoActualPeriodo(Periodo periodo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPeriodo(periodo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPeriodo(Periodo periodo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.getText()==null || this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.getText()=="" || this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.getText()=="Id") {
				this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.setText("0");
			}

			if(conColumnasBase) {periodo.setId(Long.parseLong(this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelIdPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periodo.setfecha_inicio(this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_inicioPeriodo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelfecha_inicioPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periodo.setfecha_fin(this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_finPeriodo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelfecha_finPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periodo.setnombre(this.jInternalFrameDetalleFormPeriodo.jTextFieldnombrePeriodo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabelnombrePeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periodo.setdescripcion(this.jInternalFrameDetalleFormPeriodo.jTextAreadescripcionPeriodo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodo.jLabeldescripcionPeriodo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPeriodo(Periodo periodoBean,Periodo periodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPeriodo(Periodo periodoOrigen,Periodo periodo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && periodoOrigen.getId()!=null && !periodoOrigen.getId().equals(0L))) {periodo.setId(periodoOrigen.getId());}}
			if(conDefault || (!conDefault && periodoOrigen.getfecha_inicio()!=null && !periodoOrigen.getfecha_inicio().equals(new Date()))) {periodo.setfecha_inicio(periodoOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && periodoOrigen.getfecha_fin()!=null && !periodoOrigen.getfecha_fin().equals(new Date()))) {periodo.setfecha_fin(periodoOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && periodoOrigen.getnombre()!=null && !periodoOrigen.getnombre().equals(""))) {periodo.setnombre(periodoOrigen.getnombre());}
			if(conDefault || (!conDefault && periodoOrigen.getdescripcion()!=null && !periodoOrigen.getdescripcion().equals(""))) {periodo.setdescripcion(periodoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPeriodo(Periodo periodo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.setText(periodo.getId().toString());
			this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_inicioPeriodo.setDate(periodo.getfecha_inicio());
			this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_finPeriodo.setDate(periodo.getfecha_fin());
			this.jInternalFrameDetalleFormPeriodo.jTextFieldnombrePeriodo.setText(periodo.getnombre());
			this.jInternalFrameDetalleFormPeriodo.jTextAreadescripcionPeriodo.setText(periodo.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPeriodo(PeriodoBean periodoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.setText(periodoBean.getId().toString());
			this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_inicioPeriodo.setDate(periodoBean.getfecha_inicio());
			this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_finPeriodo.setDate(periodoBean.getfecha_fin());
			this.jInternalFrameDetalleFormPeriodo.jTextFieldnombrePeriodo.setText(periodoBean.getnombre());
			this.jInternalFrameDetalleFormPeriodo.jTextAreadescripcionPeriodo.setText(periodoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPeriodo(PeriodoParameterReturnGeneral periodoReturnGeneral,PeriodoBean periodoBean,Boolean conDefault) throws Exception { 
		try {
			Periodo periodoLocal=new Periodo();
			
			periodoLocal=periodoReturnGeneral.getPeriodo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && periodoLocal.getId()!=null && !periodoLocal.getId().equals(0L))) {periodoBean.setId(periodoLocal.getId());}}
			if(conDefault || (!conDefault && periodoLocal.getfecha_inicio()!=null && !periodoLocal.getfecha_inicio().equals(new Date()))) {periodoBean.setfecha_inicio(periodoLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && periodoLocal.getfecha_fin()!=null && !periodoLocal.getfecha_fin().equals(new Date()))) {periodoBean.setfecha_fin(periodoLocal.getfecha_fin());}
			if(conDefault || (!conDefault && periodoLocal.getnombre()!=null && !periodoLocal.getnombre().equals(""))) {periodoBean.setnombre(periodoLocal.getnombre());}
			if(conDefault || (!conDefault && periodoLocal.getdescripcion()!=null && !periodoLocal.getdescripcion().equals(""))) {periodoBean.setdescripcion(periodoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPeriodoGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxPeriodo,List<Periodo> periodosLocal)throws Exception {
		try {
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosLocal) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			jComboBoxPeriodo.setSelectedItem(periodoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPeriodoGenerico(JComboBox jComboBoxPeriodo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPeriodo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPeriodo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPeriodo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPeriodo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPeriodo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periodo=(Periodo) periodoLogic.getPeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			periodo =(Periodo) periodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!periodo.getIsNew() && !periodo.getIsChanged() && !periodo.getIsDeleted()) {
				sDescripcion=periodo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=periodo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!periodo.getIsNew() && !periodo.getIsChanged() && !periodo.getIsDeleted()) {
				sDescripcion=periodo.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=periodo.getanio_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!periodo.getIsNew() && !periodo.getIsChanged() && !periodo.getIsDeleted()) {
				sDescripcion=periodo.getejercicio_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=periodo.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!periodo.getIsNew() && !periodo.getIsChanged() && !periodo.getIsDeleted()) {
				sDescripcion=periodo.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=periodo.getmes_descripcion();
			}
		}

		if(sTipo.equals("EstadoPeriodo")) {
			//sDescripcion=this.getActualEstadoPeriodoForeignKeyDescripcion((Long)value);
			if(!periodo.getIsNew() && !periodo.getIsChanged() && !periodo.getIsDeleted()) {
				sDescripcion=periodo.getestadoperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=periodo.getestadoperiodo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Periodo periodoRow=new Periodo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periodoRow=(Periodo) periodoLogic.getPeriodos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			periodoRow=(Periodo) periodos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPeriodo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPeriodo.setVisible((this.isVisibilidadCeldaNuevoPeriodo && this.isPermisoNuevoPeriodo));			
			this.jButtonDuplicarPeriodo.setVisible((this.isVisibilidadCeldaDuplicarPeriodo && this.isPermisoDuplicarPeriodo));			
			this.jButtonCopiarPeriodo.setVisible((this.isVisibilidadCeldaCopiarPeriodo && this.isPermisoCopiarPeriodo));
			this.jButtonVerFormPeriodo.setVisible((this.isVisibilidadCeldaVerFormPeriodo && this.isPermisoVerFormPeriodo));
			
			this.jButtonAbrirOrderByPeriodo.setVisible((this.isVisibilidadCeldaOrdenPeriodo && this.isPermisoOrdenPeriodo));			
			
			this.jButtonNuevoRelacionesPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodo && this.isPermisoNuevoPeriodo));			
			this.jButtonNuevoGuardarCambiosPeriodo.setVisible((this.isVisibilidadCeldaNuevoPeriodo && this.isPermisoNuevoPeriodo && this.isPermisoGuardarCambiosPeriodo));
			
			if(this.jInternalFrameDetalleFormPeriodo!=null) {
			this.jInternalFrameDetalleFormPeriodo.jButtonModificarPeriodo.setVisible((this.isVisibilidadCeldaModificarPeriodo && this.isPermisoActualizarPeriodo));	
			this.jInternalFrameDetalleFormPeriodo.jButtonActualizarPeriodo.setVisible((this.isVisibilidadCeldaActualizarPeriodo && this.isPermisoActualizarPeriodo));	
			this.jInternalFrameDetalleFormPeriodo.jButtonEliminarPeriodo.setVisible((this.isVisibilidadCeldaEliminarPeriodo && this.isPermisoEliminarPeriodo));
			this.jInternalFrameDetalleFormPeriodo.jButtonCancelarPeriodo.setVisible(this.isVisibilidadCeldaCancelarPeriodo);							
			this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosPeriodo.setVisible((this.isVisibilidadCeldaGuardarPeriodo && this.isPermisoGuardarCambiosPeriodo));			
			
			}
						
			this.jButtonGuardarCambiosTablaPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodo && this.isPermisoGuardarCambiosPeriodo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPeriodo.setVisible((this.isVisibilidadCeldaNuevoPeriodo && this.isPermisoNuevoPeriodo));						
			this.jButtonDuplicarToolBarPeriodo.setVisible((this.isVisibilidadCeldaDuplicarPeriodo && this.isPermisoDuplicarPeriodo));						
			this.jButtonCopiarToolBarPeriodo.setVisible((this.isVisibilidadCeldaCopiarPeriodo && this.isPermisoCopiarPeriodo));			
			this.jButtonVerFormToolBarPeriodo.setVisible((this.isVisibilidadCeldaVerFormPeriodo && this.isPermisoVerFormPeriodo));			
			this.jButtonAbrirOrderByToolBarPeriodo.setVisible((this.isVisibilidadCeldaOrdenPeriodo && this.isPermisoOrdenPeriodo));
			this.jButtonNuevoRelacionesToolBarPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodo && this.isPermisoNuevoPeriodo));			
			this.jButtonNuevoGuardarCambiosToolBarPeriodo.setVisible((this.isVisibilidadCeldaNuevoPeriodo && this.isPermisoNuevoPeriodo && this.isPermisoGuardarCambiosPeriodo));			
			
			if(this.jInternalFrameDetalleFormPeriodo!=null) {
			this.jInternalFrameDetalleFormPeriodo.jButtonModificarToolBarPeriodo.setVisible((this.isVisibilidadCeldaModificarPeriodo && this.isPermisoActualizarPeriodo));	
			this.jInternalFrameDetalleFormPeriodo.jButtonActualizarToolBarPeriodo.setVisible((this.isVisibilidadCeldaActualizarPeriodo  && this.isPermisoActualizarPeriodo));	
			this.jInternalFrameDetalleFormPeriodo.jButtonEliminarToolBarPeriodo.setVisible((this.isVisibilidadCeldaEliminarPeriodo && this.isPermisoEliminarPeriodo));
			this.jInternalFrameDetalleFormPeriodo.jButtonCancelarToolBarPeriodo.setVisible(this.isVisibilidadCeldaCancelarPeriodo);				
			this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosToolBarPeriodo.setVisible((this.isVisibilidadCeldaGuardarPeriodo && this.isPermisoGuardarCambiosPeriodo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodo && this.isPermisoGuardarCambiosPeriodo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPeriodo.setVisible((this.isVisibilidadCeldaNuevoPeriodo && this.isPermisoNuevoPeriodo));			
			this.jMenuItemDuplicarPeriodo.setVisible((this.isVisibilidadCeldaDuplicarPeriodo && this.isPermisoDuplicarPeriodo));			
			this.jMenuItemCopiarPeriodo.setVisible((this.isVisibilidadCeldaCopiarPeriodo && this.isPermisoCopiarPeriodo));			
			this.jMenuItemVerFormPeriodo.setVisible((this.isVisibilidadCeldaVerFormPeriodo && this.isPermisoVerFormPeriodo));			
			this.jMenuItemAbrirOrderByPeriodo.setVisible((this.isVisibilidadCeldaOrdenPeriodo && this.isPermisoOrdenPeriodo));			
			//this.jMenuItemMostrarOcultarPeriodo.setVisible((this.isVisibilidadCeldaOrdenPeriodo && this.isPermisoOrdenPeriodo));
			this.jMenuItemDetalleAbrirOrderByPeriodo.setVisible((this.isVisibilidadCeldaOrdenPeriodo && this.isPermisoOrdenPeriodo));			
			//this.jMenuItemDetalleMostrarOcultarPeriodo.setVisible((this.isVisibilidadCeldaOrdenPeriodo && this.isPermisoOrdenPeriodo));			
			this.jMenuItemNuevoRelacionesPeriodo.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodo && this.isPermisoNuevoPeriodo));			
			this.jMenuItemNuevoGuardarCambiosPeriodo.setVisible((this.isVisibilidadCeldaNuevoPeriodo && this.isPermisoNuevoPeriodo && this.isPermisoGuardarCambiosPeriodo));									
			
			if(this.jInternalFrameDetalleFormPeriodo!=null) {
			this.jInternalFrameDetalleFormPeriodo.jMenuItemModificarPeriodo.setVisible((this.isVisibilidadCeldaModificarPeriodo && this.isPermisoActualizarPeriodo));	
			this.jInternalFrameDetalleFormPeriodo.jMenuItemActualizarPeriodo.setVisible((this.isVisibilidadCeldaActualizarPeriodo && this.isPermisoActualizarPeriodo));	
			this.jInternalFrameDetalleFormPeriodo.jMenuItemEliminarPeriodo.setVisible((this.isVisibilidadCeldaEliminarPeriodo && this.isPermisoEliminarPeriodo));
			this.jInternalFrameDetalleFormPeriodo.jMenuItemCancelarPeriodo.setVisible(this.isVisibilidadCeldaCancelarPeriodo);				
			}
			
			this.jMenuItemGuardarCambiosPeriodo.setVisible((this.isVisibilidadCeldaGuardarPeriodo && this.isPermisoGuardarCambiosPeriodo));						
			this.jMenuItemGuardarCambiosTablaPeriodo.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodo && this.isPermisoGuardarCambiosPeriodo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPeriodo=this.jButtonNuevoPeriodo.isVisible();
			this.isVisibilidadCeldaDuplicarPeriodo=this.jButtonDuplicarPeriodo.isVisible();
			this.isVisibilidadCeldaCopiarPeriodo=this.jButtonCopiarPeriodo.isVisible();
			this.isVisibilidadCeldaVerFormPeriodo=this.jButtonVerFormPeriodo.isVisible();
			
			this.isVisibilidadCeldaOrdenPeriodo=this.jButtonAbrirOrderByPeriodo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=this.jButtonNuevoRelacionesPeriodo.isVisible();
			this.isVisibilidadCeldaModificarPeriodo=this.jButtonModificarPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodo!=null) {
			this.isVisibilidadCeldaActualizarPeriodo=this.jInternalFrameDetalleFormPeriodo.jButtonActualizarPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarPeriodo=this.jInternalFrameDetalleFormPeriodo.jButtonEliminarPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarPeriodo=this.jInternalFrameDetalleFormPeriodo.jButtonCancelarPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarPeriodo=this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosPeriodo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPeriodo=this.jButtonGuardarCambiosTablaPeriodo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPeriodo=this.jButtonNuevoToolBarPeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=this.jButtonNuevoRelacionesToolBarPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodo!=null) {
			this.isVisibilidadCeldaModificarPeriodo=this.jInternalFrameDetalleFormPeriodo.jButtonModificarToolBarPeriodo.isVisible();
			this.isVisibilidadCeldaActualizarPeriodo=this.jInternalFrameDetalleFormPeriodo.jButtonActualizarToolBarPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarPeriodo=this.jInternalFrameDetalleFormPeriodo.jButtonEliminarToolBarPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarPeriodo=this.jInternalFrameDetalleFormPeriodo.jButtonCancelarToolBarPeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPeriodo=this.jButtonGuardarCambiosToolBarPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPeriodo=this.jButtonGuardarCambiosTablaToolBarPeriodo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPeriodo=this.jMenuItemNuevoPeriodo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=this.jMenuItemNuevoRelacionesPeriodo.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodo!=null) {
			this.isVisibilidadCeldaModificarPeriodo=this.jInternalFrameDetalleFormPeriodo.jMenuItemModificarPeriodo.isVisible();
			this.isVisibilidadCeldaActualizarPeriodo=this.jInternalFrameDetalleFormPeriodo.jMenuItemActualizarPeriodo.isVisible();
			this.isVisibilidadCeldaEliminarPeriodo=this.jInternalFrameDetalleFormPeriodo.jMenuItemEliminarPeriodo.isVisible();
			this.isVisibilidadCeldaCancelarPeriodo=this.jInternalFrameDetalleFormPeriodo.jMenuItemCancelarPeriodo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPeriodo=this.jMenuItemGuardarCambiosPeriodo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPeriodo=this.jMenuItemGuardarCambiosTablaPeriodo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPeriodo(Boolean esInicializar) {
		if(PeriodoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.periodoSessionBean.getConGuardarRelaciones()) {
				//if(this.periodoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPeriodo();
			}
			
			this.inicializarActualizarBindingBotonesManualPeriodo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPeriodo() {
		this.jButtonNuevoPeriodo.setVisible(this.isPermisoNuevoPeriodo);			
		this.jButtonDuplicarPeriodo.setVisible(this.isPermisoDuplicarPeriodo);			
		this.jButtonCopiarPeriodo.setVisible(this.isPermisoCopiarPeriodo);			
		this.jButtonVerFormPeriodo.setVisible(this.isPermisoVerFormPeriodo);			
		
		this.jButtonAbrirOrderByPeriodo.setVisible(this.isPermisoOrdenPeriodo);					
		
		this.jButtonNuevoRelacionesPeriodo.setVisible(this.isPermisoNuevoPeriodo);			
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonModificarPeriodo.setVisible(this.isPermisoActualizarPeriodo);	
			this.jInternalFrameDetalleFormPeriodo.jButtonActualizarPeriodo.setVisible(this.isPermisoActualizarPeriodo);	
			this.jInternalFrameDetalleFormPeriodo.jButtonEliminarPeriodo.setVisible(this.isPermisoEliminarPeriodo);
			this.jInternalFrameDetalleFormPeriodo.jButtonCancelarPeriodo.setVisible(this.isVisibilidadCeldaCancelarPeriodo);						
			this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosPeriodo.setVisible(this.isPermisoGuardarCambiosPeriodo);							
		}
		
		this.jButtonGuardarCambiosTablaPeriodo.setVisible(this.isPermisoActualizarPeriodo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePeriodo() {
		this.jInternalFrameDetalleFormPeriodo.jButtonModificarPeriodo.setVisible(this.isPermisoActualizarPeriodo);	
		this.jInternalFrameDetalleFormPeriodo.jButtonActualizarPeriodo.setVisible(this.isPermisoActualizarPeriodo);	
		this.jInternalFrameDetalleFormPeriodo.jButtonEliminarPeriodo.setVisible(this.isPermisoEliminarPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jButtonCancelarPeriodo.setVisible(this.isVisibilidadCeldaCancelarPeriodo);							
		this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosPeriodo.setVisible((this.isVisibilidadCeldaGuardarPeriodo && this.isPermisoGuardarCambiosPeriodo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPeriodo() {
		if(PeriodoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPeriodo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPeriodo() {
	}
	
	public void jTableDatosPeriodoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPeriodo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.periodo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPeriodoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPeriodo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.periodoLogic.getConnexion());

				if(this.periodo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.periodo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodo=(TitledBorder)this.jScrollPanelDatosPeriodo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPeriodo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.periodo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioPeriodoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebPeriodo(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.periodoLogic.getConnexion());

				if(this.periodo.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.periodo.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodo=(TitledBorder)this.jScrollPanelDatosPeriodo.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderPeriodo.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.periodo.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPeriodoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPeriodo(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.periodoLogic.getConnexion());

				if(this.periodo.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.periodo.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodo=(TitledBorder)this.jScrollPanelDatosPeriodo.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPeriodo.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.periodo.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesPeriodoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebPeriodo(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.periodoLogic.getConnexion());

				if(this.periodo.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.periodo.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodo=(TitledBorder)this.jScrollPanelDatosPeriodo.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderPeriodo.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.periodo.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.periodo.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.periodo.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.periodo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.periodo.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_periodoPeriodoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadoperiodo=true;

			idTienePermisoestadoperiodo=this.tienePermisosUsuarioEnPaginaWebPeriodo(EstadoPeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);

				this.estadoperiodoBeanSwingJInternalFrame=new EstadoPeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadoperiodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadoperiodoBeanSwingJInternalFrame.getEstadoPeriodoLogic().setConnexion(this.periodoLogic.getConnexion());

				if(this.periodo.getid_estado_periodo()!=null) {
					this.estadoperiodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadoperiodoBeanSwingJInternalFrame.setIdActual(this.periodo.getid_estado_periodo());
					this.estadoperiodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadoperiodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadoperiodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.estadoperiodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodo=(TitledBorder)this.jScrollPanelDatosPeriodo.getBorder();
				TitledBorder titledBorderestadoperiodo=(TitledBorder)this.estadoperiodoBeanSwingJInternalFrame.jScrollPanelDatosEstadoPeriodo.getBorder();

				titledBorderestadoperiodo.setTitle(titledBorderPeriodo.getTitle() + " -> Estado Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_periodoPeriodoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.getperiodo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodo==null) {
						this.periodo = new Periodo();
					}

					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);
				}

				if(this.periodo.getid_estado_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_periodo = "+this.periodo.getid_estado_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdAnioPorIdEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodo(false,false);

			this.getPeriodosBusquedaPorIdAnioPorIdEjercicio();

			this.inicializarActualizarBindingPeriodo(false);

			//if(PeriodoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioPeriodoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodo(false,false);

			this.getPeriodosFK_IdAnio();

			this.inicializarActualizarBindingPeriodo(false);

			//if(PeriodoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPeriodoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodo(false,false);

			this.getPeriodosFK_IdEjercicio();

			this.inicializarActualizarBindingPeriodo(false);

			//if(PeriodoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPeriodoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodo(false,false);

			this.getPeriodosFK_IdEmpresa();

			this.inicializarActualizarBindingPeriodo(false);

			//if(PeriodoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoPeriodoPeriodoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodo(false,false);

			this.getPeriodosFK_IdEstadoPeriodo();

			this.inicializarActualizarBindingPeriodo(false);

			//if(PeriodoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesPeriodoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodo(false,false);

			this.getPeriodosFK_IdMes();

			this.inicializarActualizarBindingPeriodo(false);

			//if(PeriodoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePeriodo() {
		if(this.jInternalFrameDetalleFormPeriodo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) {
			this.jInternalFrameDetalleFormPeriodo.setVisible(false);	    			
			this.jInternalFrameDetalleFormPeriodo.dispose();
			this.jInternalFrameDetalleFormPeriodo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPeriodo!=null) {
			this.jInternalFrameReporteDinamicoPeriodo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPeriodo.dispose();
			this.jInternalFrameReporteDinamicoPeriodo=null;
		}
		
		if(this.jInternalFrameImportacionPeriodo!=null) {
			this.jInternalFrameImportacionPeriodo.setVisible(false);	    			
			this.jInternalFrameImportacionPeriodo.dispose();
			this.jInternalFrameImportacionPeriodo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPeriodo();
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPeriodo")) {
				jButtonNuevoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPeriodo")) {
				jButtonDuplicarPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPeriodo")) {
				jButtonCopiarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPeriodo")) {
				jButtonVerFormPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPeriodo")) {
				jButtonNuevoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPeriodo")) {
				jButtonDuplicarPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPeriodo")) {
				jButtonNuevoPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPeriodo")) {
				jButtonDuplicarPeriodoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPeriodo")) {
				jButtonNuevoPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPeriodo")) {
				jButtonNuevoPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPeriodo")) {
				jButtonNuevoPeriodoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPeriodo")) {
				jButtonModificarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPeriodo")) {
				jButtonModificarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPeriodo")) {
				jButtonModificarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPeriodo")) {
				jButtonActualizarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPeriodo")) {
				jButtonActualizarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPeriodo")) {
				jButtonActualizarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPeriodo")) {
				jButtonEliminarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPeriodo")) {
				jButtonEliminarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPeriodo")) {
				jButtonEliminarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPeriodo")) {
				jButtonCancelarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPeriodo")) {
				jButtonCancelarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPeriodo")) {
				jButtonCancelarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPeriodo")) {
				jButtonCerrarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPeriodo")) {
				jButtonCerrarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPeriodo")) {
				jButtonCerrarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPeriodo")) {
				jButtonMostrarOcultarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPeriodo")) {
				jButtonCancelarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPeriodo")) {
				jButtonGuardarCambiosPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPeriodo")) {
				jButtonGuardarCambiosPeriodoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPeriodo")) {
				jButtonCopiarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPeriodo")) {
				jButtonVerFormPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPeriodo")) {
				jButtonGuardarCambiosPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPeriodo")) {
				jButtonCopiarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPeriodo")) {
				jButtonVerFormPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPeriodo")) {
				jButtonGuardarCambiosPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPeriodo")) {
				jButtonGuardarCambiosPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPeriodo")) {
				jButtonGuardarCambiosPeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPeriodo")) {
				jButtonRecargarInformacionPeriodoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPeriodo")) {
				jButtonRecargarInformacionPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPeriodo")) {
				jButtonRecargarInformacionPeriodoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPeriodo")) {
				jButtonAnterioresPeriodoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPeriodo")) {
				jButtonAnterioresPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePeriodo")) {
				jButtonAnterioresPeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPeriodo")) {
				jButtonSiguientesPeriodoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPeriodo")) {
				jButtonSiguientesPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPeriodo")) {
				jButtonSiguientesPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPeriodo") || sTipo.equals("MenuItemDetalleAbrirOrderByPeriodo")) {
				jButtonAbrirOrderByPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPeriodo") || sTipo.equals("MenuItemDetalleMostrarOcultarPeriodo")) {
				jButtonMostrarOcultarPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPeriodo")) {
				jButtonNuevoGuardarCambiosPeriodoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPeriodo")) {
				jButtonNuevoGuardarCambiosPeriodoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPeriodo")) {
				jButtonNuevoGuardarCambiosPeriodoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPeriodo")) {
				jButtonCerrarReporteDinamicoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPeriodo")) {
				jButtonGenerarReporteDinamicoPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPeriodo")) {
				
				jButtonGenerarExcelReporteDinamicoPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPeriodo")) {
				jButtonCerrarImportacionPeriodoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPeriodo")) {
				
				jButtonGenerarImportacionPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPeriodo")) {
				
				jButtonAbrirImportacionPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPeriodo")) {
				jComboBoxTiposAccionesPeriodoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPeriodo")) {
				jComboBoxTiposRelacionesPeriodoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPeriodo")) {
				jComboBoxTiposAccionesPeriodoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPeriodo")) {
				
				jComboBoxTiposSeleccionarPeriodoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPeriodo")) {
				jTextFieldValorCampoGeneralPeriodoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPeriodo")) {
				jButtonAbrirOrderByPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPeriodo")) {
				jButtonAbrirOrderByPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPeriodo")) {
				jButtonCerrarOrderByPeriodoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPeriodoBusqueda")) {
				this.jButtonidPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPeriodoUpdate")) {
				this.jButtonid_empresaPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPeriodoBusqueda")) {
				this.jButtonid_empresaPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPeriodoUpdate")) {
				this.jButtonid_anioPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPeriodoBusqueda")) {
				this.jButtonid_anioPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPeriodoUpdate")) {
				this.jButtonid_ejercicioPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPeriodoBusqueda")) {
				this.jButtonid_ejercicioPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPeriodoUpdate")) {
				this.jButtonid_mesPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPeriodoBusqueda")) {
				this.jButtonid_mesPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioPeriodoBusqueda")) {
				this.jButtonfecha_inicioPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finPeriodoBusqueda")) {
				this.jButtonfecha_finPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePeriodoBusqueda")) {
				this.jButtonnombrePeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPeriodoBusqueda")) {
				this.jButtondescripcionPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_periodoPeriodoUpdate")) {
				this.jButtonid_estado_periodoPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_periodoPeriodoBusqueda")) {
				this.jButtonid_estado_periodoPeriodoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdAnioPorIdEjercicioPeriodo")) {
				this.jButtonBusquedaPorIdAnioPorIdEjercicioPeriodoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdAnioPeriodo")) {
				this.jButtonFK_IdAnioPeriodoActionPerformed(evt);
			}
			
			;
			
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPeriodo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				


				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Periodo periodoLocal=null;
			
			if(!this.getEsControlTabla()) {
				periodoLocal=this.periodo;
			} else {
				periodoLocal=this.periodoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
							
				
				


				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoAnterior =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoAnterior =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
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
			
			


			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
								
						
				


				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
								
				
				


				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoAnterior =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoAnterior =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoAnterior =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoAnterior =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
							
				
				


				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoAnterior =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.periodoAnterior =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
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
			
			


			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
								
				
				


				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoAnterior =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoAnterior =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPeriodo")) {
					jCheckBoxSeleccionarTodosPeriodoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPeriodo")) {
					jCheckBoxSeleccionadosPeriodoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPeriodo")) {
					
				}
				
				


				
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
												
				
				


				
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoAnterior =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.periodoAnterior =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
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
			
			


			if(sTipo.equals("id_empresaPeriodo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo;
				}

				if(this.periodoSessionBean.getConGuardarRelaciones()) {
					//classes=PeriodoConstantesFunciones.getClassesRelationshipsOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEmpresa(jComboBoxGenerico,"Formulario");

				this.recargarFormPeriodo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_anioPeriodo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo;
				}

				if(this.periodoSessionBean.getConGuardarRelaciones()) {
					//classes=PeriodoConstantesFunciones.getClassesRelationshipsOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyAnio(jComboBoxGenerico,"Formulario");

				this.recargarFormPeriodo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo")) {
				this.procesarActionsCombosForeignKeyAnio(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo,"BusquedaPorIdAnioPorIdEjercicio");
				//recargarFormPeriodoAnio(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo,"BusquedaPorIdAnioPorIdEjercicio");
			}
			 else if(sTipo.equals("jComboBoxid_anioFK_IdAnioPeriodo")) {
				this.procesarActionsCombosForeignKeyAnio(jComboBoxid_anioFK_IdAnioPeriodo,"FK_IdAnio");
				//recargarFormPeriodoAnio(jComboBoxid_anioFK_IdAnioPeriodo,"FK_IdAnio");
			}
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_empresaPeriodo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo;
				}

				if(this.periodoSessionBean.getConGuardarRelaciones()) {
					//classes=PeriodoConstantesFunciones.getClassesRelationshipsOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEmpresa(jComboBoxGenerico,"Formulario");

				this.recargarFormPeriodo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_anioPeriodo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo;
				}

				if(this.periodoSessionBean.getConGuardarRelaciones()) {
					//classes=PeriodoConstantesFunciones.getClassesRelationshipsOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyAnio(jComboBoxGenerico,"Formulario");

				this.recargarFormPeriodo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo")) {
				this.procesarActionsCombosForeignKeyAnio(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo,"BusquedaPorIdAnioPorIdEjercicio");
				//recargarFormPeriodoAnio(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo,"BusquedaPorIdAnioPorIdEjercicio");
			}
			 else if(sTipo.equals("jComboBoxid_anioFK_IdAnioPeriodo")) {
				this.procesarActionsCombosForeignKeyAnio(jComboBoxid_anioFK_IdAnioPeriodo,"FK_IdAnio");
				//recargarFormPeriodoAnio(jComboBoxid_anioFK_IdAnioPeriodo,"FK_IdAnio");
			}
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodo);
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
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
				
				


			if(sTipo.equals("id_empresaPeriodo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo;
				}

				if(this.periodoSessionBean.getConGuardarRelaciones()) {
					//classes=PeriodoConstantesFunciones.getClassesRelationshipsOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEmpresa(jComboBoxGenerico,"Formulario");

				this.recargarFormPeriodo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_anioPeriodo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo;
				}

				if(this.periodoSessionBean.getConGuardarRelaciones()) {
					//classes=PeriodoConstantesFunciones.getClassesRelationshipsOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyAnio(jComboBoxGenerico,"Formulario");

				this.recargarFormPeriodo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo")) {
				this.procesarActionsCombosForeignKeyAnio(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo,"BusquedaPorIdAnioPorIdEjercicio");
				//recargarFormPeriodoAnio(jComboBoxid_anioBusquedaPorIdAnioPorIdEjercicioPeriodo,"BusquedaPorIdAnioPorIdEjercicio");
			}
			 else if(sTipo.equals("jComboBoxid_anioFK_IdAnioPeriodo")) {
				this.procesarActionsCombosForeignKeyAnio(jComboBoxid_anioFK_IdAnioPeriodo,"FK_IdAnio");
				//recargarFormPeriodoAnio(jComboBoxid_anioFK_IdAnioPeriodo,"FK_IdAnio");
			}
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Periodo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Periodo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoAnterior =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoAnterior =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPeriodo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPeriodo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.periodo =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.periodo =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.periodo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPeriodo")) {
				
				}
				
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPeriodo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPeriodo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPeriodo")) {
			
			}
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPeriodo();
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
			if(sTipo.equals("NuevoPeriodo")) {
				jButtonNuevoPeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPeriodo")) {
				jButtonDuplicarPeriodoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPeriodo")) {
				jButtonCopiarPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPeriodo")) {
				jButtonVerFormPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPeriodo")) {
				jButtonNuevoPeriodoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPeriodo")) {
				jButtonModificarPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPeriodo")) {
				jButtonActualizarPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPeriodo")) {
				jButtonEliminarPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPeriodo")) {
				jButtonGuardarCambiosPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPeriodo")) {
				jButtonCancelarPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPeriodo")) {
				jButtonCerrarPeriodoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPeriodo")) {
				jButtonGuardarCambiosPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPeriodo")) {
				jButtonNuevoGuardarCambiosPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPeriodo")) {
				jButtonAbrirOrderByPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPeriodo")) {
				jButtonRecargarInformacionPeriodoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPeriodo")) {
				jButtonAnterioresPeriodoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPeriodo")) {
				jButtonSiguientesPeriodoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPeriodoBusqueda")) {
				this.jButtonidPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPeriodoUpdate")) {
				this.jButtonid_empresaPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPeriodoBusqueda")) {
				this.jButtonid_empresaPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPeriodoUpdate")) {
				this.jButtonid_anioPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPeriodoBusqueda")) {
				this.jButtonid_anioPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPeriodoUpdate")) {
				this.jButtonid_ejercicioPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPeriodoBusqueda")) {
				this.jButtonid_ejercicioPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPeriodoUpdate")) {
				this.jButtonid_mesPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPeriodoBusqueda")) {
				this.jButtonid_mesPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioPeriodoBusqueda")) {
				this.jButtonfecha_inicioPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finPeriodoBusqueda")) {
				this.jButtonfecha_finPeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePeriodoBusqueda")) {
				this.jButtonnombrePeriodoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPeriodoBusqueda")) {
				this.jButtondescripcionPeriodoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_periodoPeriodoUpdate")) {
				this.jButtonid_estado_periodoPeriodoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_periodoPeriodoBusqueda")) {
				this.jButtonid_estado_periodoPeriodoBusquedaActionPerformed(evt);
			}
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPeriodo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePeriodo")) {
				closingInternalFramePeriodo();
				
			} else if(sTipo.equals("jButtonCancelarPeriodo")) {
				JInternalFrameBase jInternalFrameDetalleFormPeriodo = (JInternalFrameBase)evt.getSource();
	            	
	            PeriodoBeanSwingJInternalFrame jInternalFrameParent=(PeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormPeriodo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPeriodoActionPerformed(null);
			}
			
			PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.periodo,new Object(),this.periodoParameterGeneral,this.periodoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPeriodo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.periodo)) {
			if(!esControlTabla) {
				if(PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);			
				}
				
				if(this.periodoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPeriodo(this.periodo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.periodoReturnGeneral=periodoLogic.procesarEventosPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoLogic.getPeriodos(),this.periodo,this.periodoParameterGeneral,this.isEsNuevoPeriodo,classes);//this.periodoLogic.getPeriodo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPeriodo(this.periodoReturnGeneral,this.periodoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.periodoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPeriodo(classes,this.periodoReturnGeneral,this.periodoBean,false);
					}
						
					if(this.periodoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPeriodo(this.periodoReturnGeneral.getPeriodo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPeriodo(this.periodoReturnGeneral.getPeriodo());	
					}
						
					if(this.periodoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPeriodo(this.periodoReturnGeneral.getPeriodo(),classes);//this.periodoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPeriodo(this.periodo,classes);//this.periodoBean);									
				}
			
				if(PeriodoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPeriodo(this.periodo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodo(this.periodo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.periodoAnterior!=null) {
						this.periodo=this.periodoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.periodoReturnGeneral=periodoLogic.procesarEventosPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoLogic.getPeriodos(),this.periodo,this.periodoParameterGeneral,this.isEsNuevoPeriodo,classes);//this.periodoLogic.getPeriodo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.periodoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.periodoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.periodoReturnGeneral.getPeriodo(),periodoLogic.getPeriodos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.periodoReturnGeneral.getPeriodo(),this.periodos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPeriodo.repaint();
				
				//((AbstractTableModel) this.jTableDatosPeriodo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPeriodo();
			}
		}
	}
	
	public void actualizarVisualTableDatosPeriodo() throws Exception {
		
		PeriodoModel periodoModel=(PeriodoModel)this.jTableDatosPeriodo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periodoModel.periodos=this.periodoLogic.getPeriodos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			periodoModel.periodos=this.periodos;
		}
		
		
		((PeriodoModel) this.jTableDatosPeriodo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPeriodo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getperiodoAnterior(),this.periodoLogic.getPeriodos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getperiodoAnterior(),this.periodos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPeriodo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPeriodo(Periodo periodo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
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
										
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodo,new Object(),generalEntityParameterGeneral,this.periodoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.periodoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PeriodoConstantesFunciones.getClassesRelationshipsOfPeriodo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PeriodoConstantesFunciones.getClassesRelationshipsFromStringsOfPeriodo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPeriodo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PeriodoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodo,new Object(),generalEntityParameterGeneral,this.periodoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPeriodo(PeriodoBean periodoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPeriodo(ArrayList<Classe> classes,PeriodoReturnGeneral periodoReturnGeneral,PeriodoBean periodoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPeriodo(Periodo periodo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.periodo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPeriodo = new PeriodoDetalleFormJInternalFrame(jDesktopPane,this.periodoSessionBean.getConGuardarRelaciones(),this.periodoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPeriodo);
		this.jInternalFrameDetalleFormPeriodo.setVisible(false);
		this.jInternalFrameDetalleFormPeriodo.setSelected(false);						
		
		this.jInternalFrameDetalleFormPeriodo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPeriodo.periodoLogic=this.periodoLogic;
		
		this.cargarCombosFrameForeignKeyPeriodo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePeriodo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePeriodo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPeriodo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPeriodo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPeriodo"));
		
		this.jInternalFrameDetalleFormPeriodo.jButtonModificarPeriodo.addActionListener(new ButtonActionListener(this,"ModificarPeriodo"));

		
		this.jInternalFrameDetalleFormPeriodo.jButtonModificarToolBarPeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarPeriodo"));
					
		this.jInternalFrameDetalleFormPeriodo.jMenuItemModificarPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodo.jButtonActualizarPeriodo.addActionListener (new ButtonActionListener(this,"ActualizarPeriodo"));
		
		
		this.jInternalFrameDetalleFormPeriodo.jButtonActualizarToolBarPeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPeriodo"));
						
		this.jInternalFrameDetalleFormPeriodo.jMenuItemActualizarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodo.jButtonEliminarPeriodo.addActionListener (new ButtonActionListener(this,"EliminarPeriodo"));
		
		
		this.jInternalFrameDetalleFormPeriodo.jButtonEliminarToolBarPeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarPeriodo"));
								
		this.jInternalFrameDetalleFormPeriodo.jMenuItemEliminarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodo.jButtonCancelarPeriodo.addActionListener (new ButtonActionListener(this,"CancelarPeriodo"));
		
		
		this.jInternalFrameDetalleFormPeriodo.jButtonCancelarToolBarPeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarPeriodo"));
					
		this.jInternalFrameDetalleFormPeriodo.jMenuItemCancelarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPeriodo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPeriodo.jMenuItemDetalleCerrarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPeriodo"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosToolBarPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodo"));
		
		
		
		this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosToolBarPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodo"));
		
		
		
		this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPeriodo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonidPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_empresaPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_empresaPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_anioPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_anioPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_anioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_ejercicioPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_ejercicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_mesPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_mesPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_mesPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonfecha_inicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonfecha_finPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonnombrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtondescripcionPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_estado_periodoPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_periodoPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_estado_periodoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_periodoPeriodoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPeriodo.jTabbedPaneRelacionesPeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPeriodo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePeriodo"));
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPeriodo"));
		}
		
		this.jTableDatosPeriodo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPeriodo"));
		
		this.jTableDatosPeriodo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPeriodo"));
		
		this.jButtonNuevoPeriodo.addActionListener(new ButtonActionListener(this,"NuevoPeriodo"));
		
		this.jButtonDuplicarPeriodo.addActionListener(new ButtonActionListener(this,"DuplicarPeriodo"));
		
		this.jButtonCopiarPeriodo.addActionListener(new ButtonActionListener(this,"CopiarPeriodo"));
		
		this.jButtonVerFormPeriodo.addActionListener(new ButtonActionListener(this,"VerFormPeriodo"));
		
		
		this.jButtonNuevoToolBarPeriodo.addActionListener(new ButtonActionListener(this,"NuevoToolBarPeriodo"));
			
		this.jButtonDuplicarToolBarPeriodo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPeriodo"));
			
		this.jMenuItemNuevoPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPeriodo"));
			
		this.jMenuItemDuplicarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPeriodo"));		
		
		
		this.jButtonNuevoRelacionesPeriodo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPeriodo"));
		
		
		this.jButtonNuevoRelacionesToolBarPeriodo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPeriodo"));
			
		this.jMenuItemNuevoRelacionesPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonModificarPeriodo.addActionListener(new ButtonActionListener(this,"ModificarPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonModificarToolBarPeriodo.addActionListener(new ButtonActionListener(this,"ModificarToolBarPeriodo"));
			
			this.jInternalFrameDetalleFormPeriodo.jMenuItemModificarPeriodo.addActionListener(new ButtonActionListener(this,"MenuItemModificarPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPeriodo.jButtonActualizarPeriodo.addActionListener (new ButtonActionListener(this,"ActualizarPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonActualizarToolBarPeriodo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPeriodo"));
				
			this.jInternalFrameDetalleFormPeriodo.jMenuItemActualizarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonEliminarPeriodo.addActionListener (new ButtonActionListener(this,"EliminarPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonEliminarToolBarPeriodo.addActionListener (new ButtonActionListener(this,"EliminarToolBarPeriodo"));
						
			this.jInternalFrameDetalleFormPeriodo.jMenuItemEliminarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonCancelarPeriodo.addActionListener (new ButtonActionListener(this,"CancelarPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonCancelarToolBarPeriodo.addActionListener (new ButtonActionListener(this,"CancelarToolBarPeriodo"));
			
			this.jInternalFrameDetalleFormPeriodo.jMenuItemCancelarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPeriodo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPeriodo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPeriodo"));		
		
		
		this.jButtonCerrarPeriodo.addActionListener (new ButtonActionListener(this,"CerrarPeriodo"));
		
		
		this.jButtonCerrarToolBarPeriodo.addActionListener (new ButtonActionListener(this,"CerrarToolBarPeriodo"));
			
		this.jMenuItemCerrarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPeriodo"));
			
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jMenuItemDetalleCerrarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPeriodo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosPeriodo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosToolBarPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodo"));
		}
		
		this.jButtonCopiarToolBarPeriodo.addActionListener (new ButtonActionListener(this,"CopiarToolBarPeriodo"));
			
		this.jButtonVerFormToolBarPeriodo.addActionListener (new ButtonActionListener(this,"VerFormToolBarPeriodo"));
		
		this.jMenuItemGuardarCambiosPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPeriodo"));
			
		this.jMenuItemCopiarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPeriodo"));		
		
		this.jMenuItemVerFormPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPeriodo"));		
		
		
		this.jButtonGuardarCambiosTablaPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPeriodo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPeriodo"));
			
		this.jMenuItemGuardarCambiosTablaPeriodo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPeriodo"));		
		
		
		
		this.jButtonRecargarInformacionPeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionPeriodo"));
					
		this.jButtonRecargarInformacionToolBarPeriodo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPeriodo"));
		
		this.jMenuItemRecargarInformacionPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPeriodo"));		
		
		
		
		this.jButtonAnterioresPeriodo.addActionListener (new ButtonActionListener(this,"AnterioresPeriodo"));
		
		
		this.jButtonAnterioresToolBarPeriodo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPeriodo"));
		
		this.jMenuItemAnterioresPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPeriodo"));		
		
		
		this.jButtonSiguientesPeriodo.addActionListener (new ButtonActionListener(this,"SiguientesPeriodo"));
		
		
		this.jButtonSiguientesToolBarPeriodo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPeriodo"));
			
		this.jMenuItemSiguientesPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPeriodo"));
			
		this.jMenuItemAbrirOrderByPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPeriodo"));
			
		this.jMenuItemMostrarOcultarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPeriodo"));
			
		this.jMenuItemDetalleAbrirOrderByPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPeriodo"));
			
		this.jMenuItemDetalleMostarOcultarPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPeriodo"));		
		
		
		this.jButtonNuevoGuardarCambiosPeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPeriodo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPeriodo"));
			
		this.jMenuItemNuevoGuardarCambiosPeriodo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPeriodo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPeriodo"));

		this.jCheckBoxSeleccionadosPeriodo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPeriodo"));
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPeriodo"));
		}
		
		
		this.jComboBoxTiposRelacionesPeriodo.addActionListener (new ButtonActionListener(this,"TiposRelacionesPeriodo"));
			
		this.jComboBoxTiposAccionesPeriodo.addActionListener (new ButtonActionListener(this,"TiposAccionesPeriodo"));
					
		this.jComboBoxTiposSeleccionarPeriodo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPeriodo"));
			
		this.jTextFieldValorCampoGeneralPeriodo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPeriodo"));		
		
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonidPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_empresaPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_empresaPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_anioPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_anioPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_anioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_ejercicioPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_ejercicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_mesPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_mesPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_mesPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonfecha_inicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonfecha_finPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonnombrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtondescripcionPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_estado_periodoPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_periodoPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_estado_periodoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_periodoPeriodoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdAnioPorIdEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdAnioPorIdEjercicioPeriodo"));

			this.jButtonFK_IdAnioPeriodo.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPeriodo!=null) {
				this.jInternalFrameReporteDinamicoPeriodo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodo"));
				this.jInternalFrameReporteDinamicoPeriodo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodo"));
				this.jInternalFrameReporteDinamicoPeriodo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodo"));
			}
			
			//this.jButtonCerrarReporteDinamicoPeriodo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodo"));				
			//this.jButtonGenerarReporteDinamicoPeriodo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodo"));
			//this.jButtonGenerarExcelReporteDinamicoPeriodo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPeriodo!=null) {
				this.jInternalFrameImportacionPeriodo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPeriodo"));
				this.jInternalFrameImportacionPeriodo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPeriodo"));
				this.jInternalFrameImportacionPeriodo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPeriodo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByPeriodo"));
			
			this.jButtonAbrirOrderByToolBarPeriodo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPeriodo"));			
			
			if(this.jInternalFrameOrderByPeriodo!=null) {
				this.jInternalFrameOrderByPeriodo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPeriodo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPeriodo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodo.jTabbedPaneRelacionesPeriodo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPeriodo"));
		
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
            		closingInternalFramePeriodo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPeriodo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPeriodo = (JInternalFrameBase)event.getSource();
	            	
	            PeriodoBeanSwingJInternalFrame jInternalFrameParent=(PeriodoBeanSwingJInternalFrame)jInternalFrameDetalleFormPeriodo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPeriodoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPeriodo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPeriodoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPeriodo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPeriodo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPeriodo";
		inputMap = this.jButtonNuevoPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPeriodoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPeriodo";
		inputMap = this.jButtonNuevoRelacionesPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPeriodoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPeriodo";
		inputMap = this.jButtonModificarPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPeriodo";
		inputMap = this.jButtonActualizarPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPeriodo";
		inputMap = this.jButtonEliminarPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPeriodo";
		inputMap = this.jButtonCancelarPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPeriodo";
		inputMap = this.jButtonCerrarPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPeriodo";
		inputMap = this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosPeriodo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPeriodo.jButtonGuardarCambiosPeriodo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPeriodoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPeriodo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPeriodoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPeriodo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPeriodoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonidPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_empresaPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_empresaPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_anioPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_anioPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_anioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_ejercicioPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_ejercicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_mesPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_mesPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_mesPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonfecha_inicioPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonfecha_finPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finPeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonnombrePeriodoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePeriodoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtondescripcionPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPeriodoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodo.jButtonid_estado_periodoPeriodoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_periodoPeriodoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodo.jButtonid_estado_periodoPeriodoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_periodoPeriodoBusqueda"));
		
		
		this.jButtonBusquedaPorIdAnioPorIdEjercicioPeriodo.addActionListener(new ButtonActionListener(this,"BusquedaPorIdAnioPorIdEjercicioPeriodo"));

		this.jButtonFK_IdAnioPeriodo.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPeriodo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPeriodoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPeriodo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPeriodo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Periodo periodoAux:this.periodoLogic.getPeriodos()) {
					periodoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Periodo periodoAux:periodos) {
					periodoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Periodo periodoAux:this.periodoLogic.getPeriodos()) {
						periodoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Periodo periodoAux:periodos) {
						periodoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Periodo periodoAux:this.periodoLogic.getPeriodos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Periodo periodoAux:periodos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPeriodoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPeriodo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPeriodo.getSelectedRows();
			
			Periodo periodoLocal=new Periodo();
			
			//this.seleccionarTodosPeriodo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLocal =(Periodo) this.periodoLogic.getPeriodos().toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					periodoLocal =(Periodo) this.periodos.toArray()[this.jTableDatosPeriodo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				periodoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Periodo periodoAux:this.periodoLogic.getPeriodos()) {
						periodoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Periodo periodoAux:periodos) {
						periodoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPeriodo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPeriodo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPeriodo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPeriodo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPeriodoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPeriodoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPeriodoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPeriodo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPeriodo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Periodo periodoAux:this.periodoLogic.getPeriodos()) {
				
						if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							periodoAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							periodoAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							periodoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							periodoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Periodo periodoAux:periodos) {
					
						if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							periodoAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							periodoAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							periodoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							periodoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPeriodo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPeriodoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPeriodo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPeriodo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePeriodo) {				
					conSplash=true;//false;										
					
					//this.startProcessPeriodo(conSplash);
				
					this.generarReportePeriodosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPeriodosSeleccionados();
				//this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPeriodosSeleccionados(false);
				//this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPeriodosSeleccionados(true);
				//this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPeriodo();
				
				this.exportarPeriodosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPeriodos();
				//this.importarPeriodos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPeriodo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPeriodosSeleccionados();
				//this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPeriodo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPeriodo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPeriodo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.setSelectedIndex(0);					
				}	
			} 			
			else if(PeriodoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePeriodo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPeriodo(conSplash);
					
						//this.actualizarParametrosGeneralPeriodo();
						
						this.generarReporteProcesoAccionPeriodosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PeriodoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO PeriodoS SELECCIONADOS?", "MANTENIMIENTO DE Periodo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPeriodo();
				
						this.actualizarParametrosGeneralPeriodo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.periodoReturnGeneral=periodoLogic.procesarAccionPeriodosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.periodoLogic.getPeriodos(),this.periodoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPeriodoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPeriodo();
					
					PeriodoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPeriodoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPeriodo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPeriodo.jComboBoxTiposAccionesFormularioPeriodo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPeriodo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPeriodoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPeriodo();
			
			if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();		
			Periodo periodo=new Periodo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPeriodo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPeriodo.getSelectedItem();
			
			
			
			
			periodosSeleccionados=this.getPeriodosSeleccionados(true);
			//this.sTipoAccion;
			
			if(periodosSeleccionados.size()==1) {
				for(Periodo periodoAux:periodosSeleccionados) {
					periodo=periodoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPeriodo();
			
      		//this.finishProcessPeriodo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPeriodoReturnGeneral() throws Exception {
		if(this.periodoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.periodoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.periodoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.periodoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.periodoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.periodoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPeriodo(false);
		}
		
		if(this.periodoReturnGeneral.getConRetornoLista() || this.periodoReturnGeneral.getConRetornoObjeto()) {
			if(this.periodoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.periodoLogic.setPeriodos(this.periodoReturnGeneral.getPeriodos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.periodoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.periodoLogic.setPeriodo(this.periodoReturnGeneral.getPeriodo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPeriodo(false);
		}
	}
	
	public void actualizarParametrosGeneralPeriodo() throws Exception {
		
		
	}
	
	public ArrayList<Periodo> getPeriodosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPeriodo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Periodo periodoAux:periodoLogic.getPeriodos()) {
					if(periodoAux.getIsSelected()) {
						periodosSeleccionados.add(periodoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Periodo periodoAux:this.periodos) {
					if(periodoAux.getIsSelected()) {
						periodosSeleccionados.add(periodoAux);				
					}
				}
			}
			
			if(periodosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						periodosSeleccionados.addAll(this.periodoLogic.getPeriodos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						periodosSeleccionados.addAll(this.periodos);				
					}
				}
			}
		} else {
			periodosSeleccionados.add(this.periodo);
		}
		
		return periodosSeleccionados;
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
	
	public void generarReportePeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPeriodosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPeriodosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPeriodosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Periodo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPeriodosSeleccionados() throws Exception {
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();		
		
		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePeriodos("Todos",periodosSeleccionados);
		
	}	
	
	public void generarReporteNormalPeriodosSeleccionados() throws Exception {
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();		
		
		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePeriodos("Todos",periodosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPeriodosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();
		
		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePeriodos("Todos",periodosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPeriodosSeleccionados() throws Exception {
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPeriodo();
		
		
		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPeriodo();
		
		
		//this.generarReportePeriodos("Todos",periodosSeleccionados ,periodoImplementable,periodoImplementableHome);
	}
	
	public void mostrarImportacionPeriodos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPeriodo();
		
		this.abrirFrameImportacionPeriodo();		
		
			
		//this.generarReportePeriodos("Todos",periodosSeleccionados ,periodoImplementable,periodoImplementableHome);
	}
	
	public void importarPeriodos() throws Exception {		
	
	}
	
	public void exportarPeriodosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPeriodosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPeriodosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPeriodosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Periodo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPeriodosSeleccionados() throws Exception {
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();		
		
		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPeriodo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Periodo periodoAux:periodosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPeriodo(periodoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//periodoAux.setsDetalleGeneralEntityReporte(periodoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPeriodo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPeriodo(Periodo periodo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=periodo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodo.getestadoperiodo_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPeriodosSeleccionados() throws Exception {
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();		
		
		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Periodos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPeriodo(row);				
				iRow++;
			}				
			
			for(Periodo periodoAux:periodosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPeriodo(periodoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPeriodosSeleccionados() throws Exception {
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();		
		
		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("periodos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("periodo");
			//elementRoot.appendChild(element);
		
			for(Periodo periodoAux:periodosSeleccionados) {
				element = document.createElement("periodo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPeriodo(periodoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPeriodo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPeriodo(Periodo periodo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periodo.getestadoperiodo_descripcion());				
	}
	
	public void setFilaDatosExportarXmlPeriodo(Periodo periodo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PeriodoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(periodo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PeriodoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(periodo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PeriodoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(periodo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementanio_descripcion = document.createElement(PeriodoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(periodo.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementejercicio_descripcion = document.createElement(PeriodoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(periodo.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementmes_descripcion = document.createElement(PeriodoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(periodo.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementfecha_inicio = document.createElement(PeriodoConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(periodo.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(PeriodoConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(periodo.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnombre = document.createElement(PeriodoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(periodo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(PeriodoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(periodo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementestadoperiodo_descripcion = document.createElement(PeriodoConstantesFunciones.IDESTADOPERIODO);
		elementestadoperiodo_descripcion.appendChild(document.createTextNode(periodo.getestadoperiodo_descripcion()));
		element.appendChild(elementestadoperiodo_descripcion);
	}
	
	public void generarReporteGroupGenericoPeriodosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Periodo> periodosSeleccionados=new ArrayList<Periodo>();
		
		periodosSeleccionados=this.getPeriodosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPeriodo(periodosSeleccionados);
		
		this.generarReportePeriodos("Todos",periodosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPeriodo(ArrayList<Periodo> periodosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Periodo periodoAux:periodosSeleccionados) {
				periodoAux.setsDetalleGeneralEntityReporte(periodoAux.toString());
			
				if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					periodoAux.setsDescripcionGeneralEntityReporte1(periodoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					periodoAux.setsDescripcionGeneralEntityReporte1(periodoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					periodoAux.setsDescripcionGeneralEntityReporte1(periodoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					periodoAux.setsDescripcionGeneralEntityReporte1(periodoAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					periodoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(periodoAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					periodoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(periodoAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					periodoAux.setsDescripcionGeneralEntityReporte1(periodoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					periodoAux.setsDescripcionGeneralEntityReporte1(periodoAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoConstantesFunciones.LABEL_IDESTADOPERIODO)) {
					existe=true;
					periodoAux.setsDescripcionGeneralEntityReporte1(periodoAux.getestadoperiodo_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPeriodo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPeriodo=true;
				this.isVisibilidadCeldaNuevoRelacionesPeriodo=true;
				this.isVisibilidadCeldaGuardarCambiosPeriodo=true;
			}
			
			this.isVisibilidadCeldaModificarPeriodo=false;
			this.isVisibilidadCeldaActualizarPeriodo=false;
			this.isVisibilidadCeldaEliminarPeriodo=false;
			this.isVisibilidadCeldaCancelarPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodo=false;
			this.isVisibilidadCeldaModificarPeriodo=false;
			this.isVisibilidadCeldaActualizarPeriodo=true;
			this.isVisibilidadCeldaEliminarPeriodo=false;
			this.isVisibilidadCeldaCancelarPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodo=false;
			this.isVisibilidadCeldaModificarPeriodo=false;
			this.isVisibilidadCeldaActualizarPeriodo=true;
			this.isVisibilidadCeldaEliminarPeriodo=true;
			this.isVisibilidadCeldaCancelarPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodo=false;
			this.isVisibilidadCeldaModificarPeriodo=false;
			this.isVisibilidadCeldaActualizarPeriodo=true;
			this.isVisibilidadCeldaEliminarPeriodo=false;
			this.isVisibilidadCeldaCancelarPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosPeriodo=true;
			this.isVisibilidadCeldaModificarPeriodo=false;
			this.isVisibilidadCeldaActualizarPeriodo=false;
			this.isVisibilidadCeldaEliminarPeriodo=false;
			this.isVisibilidadCeldaCancelarPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodo=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodo=false;
			this.isVisibilidadCeldaActualizarPeriodo=false;
			this.isVisibilidadCeldaEliminarPeriodo=false;
			this.isVisibilidadCeldaCancelarPeriodo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPeriodo=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodo=false;
			this.isVisibilidadCeldaModificarPeriodo=true;
			this.isVisibilidadCeldaActualizarPeriodo=false;
			this.isVisibilidadCeldaEliminarPeriodo=false;
			this.isVisibilidadCeldaCancelarPeriodo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PeriodoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPeriodo=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=true;
			this.isVisibilidadCeldaGuardarCambiosPeriodo=true;
		} else {
			this.actualizarEstadoPanelsPeriodo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPeriodo=false;
			//this.isVisibilidadCeldaVerFormPeriodo=false;
			this.isVisibilidadCeldaDuplicarPeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!periodoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=false;
		} else {
			this.isVisibilidadCeldaNuevoPeriodo=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(periodoSessionBean.getEsGuardarRelacionado()) {
			if(!periodoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPeriodo=false;												
			}
			
			this.jButtonCerrarPeriodo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPeriodo=false;
		}
		
		if(!this.permiteMantenimiento(this.periodo)) {
			this.isVisibilidadCeldaActualizarPeriodo=false;
			this.isVisibilidadCeldaEliminarPeriodo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPeriodo() {
	}
	
	public void actualizarEstadoPanelsPeriodo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPeriodo!=null) {
				this.jScrollPanelDatosEdicionPeriodo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodo!=null) {
				this.jTabbedPaneBusquedasPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodo!=null) {
				this.jScrollPanelDatosPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodo!=null) {
				this.jPanelPaginacionPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodo!=null) {
				this.jPanelParametrosReportesPeriodo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPeriodo!=null) {
				this.jScrollPanelDatosEdicionPeriodo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodo!=null) {
				this.jTabbedPaneBusquedasPeriodo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPeriodo!=null) {
				this.jScrollPanelDatosPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodo!=null) {
				this.jPanelPaginacionPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodo!=null) {
				this.jPanelParametrosReportesPeriodo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPeriodo!=null) {
				this.jScrollPanelDatosEdicionPeriodo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodo!=null) {
				this.jTabbedPaneBusquedasPeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPeriodo!=null) {
				this.jScrollPanelDatosPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodo!=null) {
				this.jPanelPaginacionPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodo!=null) {
				this.jPanelParametrosReportesPeriodo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPeriodo!=null) {
				this.jScrollPanelDatosEdicionPeriodo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodo!=null) {
				this.jTabbedPaneBusquedasPeriodo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPeriodo!=null) {
				this.jScrollPanelDatosPeriodo.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodo!=null) {
				this.jPanelPaginacionPeriodo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodo!=null) {
				this.jPanelParametrosReportesPeriodo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPeriodo!=null) {
				this.jScrollPanelDatosEdicionPeriodo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodo!=null) {
				this.jTabbedPaneBusquedasPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodo!=null) {
				this.jScrollPanelDatosPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodo!=null) {
				this.jPanelPaginacionPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodo!=null) {
				this.jPanelParametrosReportesPeriodo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPeriodo!=null) {
				this.jScrollPanelDatosEdicionPeriodo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodo!=null) {
				this.jTabbedPaneBusquedasPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodo!=null) {
				this.jScrollPanelDatosPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodo!=null) {
				this.jPanelPaginacionPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodo!=null) {
				this.jPanelParametrosReportesPeriodo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPeriodo!=null) {
				this.jScrollPanelDatosEdicionPeriodo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodo!=null) {
				this.jTabbedPaneBusquedasPeriodo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodo!=null) {
				this.jScrollPanelDatosPeriodo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodo!=null) {
				this.jPanelPaginacionPeriodo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodo!=null) {
				this.jPanelParametrosReportesPeriodo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.periodoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPeriodo!=null) {
					this.jTabbedPaneBusquedasPeriodo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPeriodo!=null) {
				this.jPanelParametrosReportesPeriodo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.periodoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodo!=null) {
				this.jTabbedPaneBusquedasPeriodo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPeriodo!=null) {
				this.jPanelParametrosReportesPeriodo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);}

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelFK_IdAnioPeriodo);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio=isParaAnio;
			if(!this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);}

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelFK_IdAnioPeriodo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio=isParaEjercicio;
			if(!this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);}

			this.isVisibilidadFK_IdAnio=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelFK_IdAnioPeriodo);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio=isParaMesNegation;
			if(!this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);}

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelFK_IdAnioPeriodo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoPeriodo(Boolean isParaEstadoPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoPeriodoNegation=!isParaEstadoPeriodo;

			this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio=isParaEstadoPeriodoNegation;
			if(!this.isVisibilidadBusquedaPorIdAnioPorIdEjercicio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);}

			this.isVisibilidadFK_IdAnio=isParaEstadoPeriodoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasPeriodo.remove(jPanelFK_IdAnioPeriodo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PeriodoSessionBean periodoSessionBean=new PeriodoSessionBean();
		
		if(this.periodoSessionBean==null) {
			this.periodoSessionBean=new PeriodoSessionBean();
		}
		
		this.periodoSessionBean.setsUltimaBusquedaPeriodo(this.getsAccionBusqueda());
		this.periodoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.periodoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdAnioPorIdEjercicio")) {
			periodoSessionBean.setid_anio(this.getid_anioBusquedaPorIdAnioPorIdEjercicio());	
			periodoSessionBean.setid_ejercicio(this.getid_ejercicioBusquedaPorIdAnioPorIdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			periodoSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			periodoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PeriodoSessionBean periodoSessionBean=new PeriodoSessionBean();
		
		if(this.periodoSessionBean==null) {
			this.periodoSessionBean=new PeriodoSessionBean();
		}
		
		if(this.periodoSessionBean.getsUltimaBusquedaPeriodo()!=null&&!this.periodoSessionBean.getsUltimaBusquedaPeriodo().equals("")) {
			this.setsAccionBusqueda(periodoSessionBean.getsUltimaBusquedaPeriodo());
			this.setiNumeroPaginacion(periodoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(periodoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdAnioPorIdEjercicio")) {
				this.setid_anioBusquedaPorIdAnioPorIdEjercicio(periodoSessionBean.getid_anio());
				periodoSessionBean.setid_anio(null);
				this.setid_ejercicioBusquedaPorIdAnioPorIdEjercicio(periodoSessionBean.getid_ejercicio());
				periodoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(periodoSessionBean.getid_anio());
				periodoSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(periodoSessionBean.getid_empresa());
				periodoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.periodoSessionBean.setsUltimaBusquedaPeriodo("");
		this.periodoSessionBean.setiNumeroPaginacion(PeriodoConstantesFunciones.INUMEROPAGINACION);
		this.periodoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPeriodo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPeriodo() {
		this.updateBorderResaltarBusquedasFormularioPeriodo();
		this.updateVisibilidadBusquedasFormularioPeriodo();
		this.updateHabilitarBusquedasFormularioPeriodo();
	}
	
	public void updateBorderResaltarBusquedasFormularioPeriodo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPeriodo.getComponents().length>0) {
	

		if(this.periodoConstantesFunciones.resaltarBusquedaPorIdAnioPorIdEjercicioPeriodo!=null) {
			index= this.jTabbedPaneBusquedasPeriodo.indexOfComponent(this.jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodo.getComponent(index);
				jPanel.setBorder(this.periodoConstantesFunciones.resaltarBusquedaPorIdAnioPorIdEjercicioPeriodo);
			}
		}

		if(this.periodoConstantesFunciones.resaltarFK_IdAnioPeriodo!=null) {
			index= this.jTabbedPaneBusquedasPeriodo.indexOfComponent(this.jPanelFK_IdAnioPeriodo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodo.getComponent(index);
				jPanel.setBorder(this.periodoConstantesFunciones.resaltarFK_IdAnioPeriodo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPeriodo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPeriodo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPeriodo.indexOfComponent(this.jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.periodoConstantesFunciones.mostrarBusquedaPorIdAnioPorIdEjercicioPeriodo);
			if(!this.periodoConstantesFunciones.mostrarBusquedaPorIdAnioPorIdEjercicioPeriodo && index>-1) {
				this.jTabbedPaneBusquedasPeriodo.remove(index);
			}

			index= this.jTabbedPaneBusquedasPeriodo.indexOfComponent(this.jPanelFK_IdAnioPeriodo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.periodoConstantesFunciones.mostrarFK_IdAnioPeriodo);
			if(!this.periodoConstantesFunciones.mostrarFK_IdAnioPeriodo && index>-1) {
				this.jTabbedPaneBusquedasPeriodo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPeriodo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPeriodo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPeriodo.indexOfComponent(this.jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.periodoConstantesFunciones.activarBusquedaPorIdAnioPorIdEjercicioPeriodo);
				this.jTabbedPaneBusquedasPeriodo.setEnabledAt(index,this.periodoConstantesFunciones.activarBusquedaPorIdAnioPorIdEjercicioPeriodo);
			}

			index= this.jTabbedPaneBusquedasPeriodo.indexOfComponent(this.jPanelFK_IdAnioPeriodo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.periodoConstantesFunciones.activarFK_IdAnioPeriodo);
				this.jTabbedPaneBusquedasPeriodo.setEnabledAt(index,this.periodoConstantesFunciones.activarFK_IdAnioPeriodo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPeriodo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdAnioPorIdEjercicio")) {
			index= this.jTabbedPaneBusquedasPeriodo.indexOfComponent(this.jPanelBusquedaPorIdAnioPorIdEjercicioPeriodo);

			this.jTabbedPaneBusquedasPeriodo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodo.getComponent(index);

			this.periodoConstantesFunciones.setResaltarBusquedaPorIdAnioPorIdEjercicioPeriodo(resaltar);

			jPanel.setBorder(this.periodoConstantesFunciones.resaltarBusquedaPorIdAnioPorIdEjercicioPeriodo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasPeriodo.indexOfComponent(this.jPanelFK_IdAnioPeriodo);

			this.jTabbedPaneBusquedasPeriodo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodo.getComponent(index);

			this.periodoConstantesFunciones.setResaltarFK_IdAnioPeriodo(resaltar);

			jPanel.setBorder(this.periodoConstantesFunciones.resaltarFK_IdAnioPeriodo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPeriodo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPeriodo() throws Exception {

		if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPeriodo();
		this.updateVisibilidadResaltarControlesFormularioPeriodo();
		this.updateHabilitarResaltarControlesFormularioPeriodo();
		
	}
	
	public void updateBorderResaltarControlesFormularioPeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.periodoConstantesFunciones.resaltaridPeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.setBorder(this.periodoConstantesFunciones.resaltaridPeriodo);}
		if(this.periodoConstantesFunciones.resaltarid_empresaPeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.setBorder(this.periodoConstantesFunciones.resaltarid_empresaPeriodo);}
		if(this.periodoConstantesFunciones.resaltarid_anioPeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.setBorder(this.periodoConstantesFunciones.resaltarid_anioPeriodo);}
		if(this.periodoConstantesFunciones.resaltarid_ejercicioPeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.setBorder(this.periodoConstantesFunciones.resaltarid_ejercicioPeriodo);}
		if(this.periodoConstantesFunciones.resaltarid_mesPeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.setBorder(this.periodoConstantesFunciones.resaltarid_mesPeriodo);}
		if(this.periodoConstantesFunciones.resaltarfecha_inicioPeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_inicioPeriodo.setBorder(this.periodoConstantesFunciones.resaltarfecha_inicioPeriodo);}
		if(this.periodoConstantesFunciones.resaltarfecha_finPeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_finPeriodo.setBorder(this.periodoConstantesFunciones.resaltarfecha_finPeriodo);}
		if(this.periodoConstantesFunciones.resaltarnombrePeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jTextFieldnombrePeriodo.setBorder(this.periodoConstantesFunciones.resaltarnombrePeriodo);}
		if(this.periodoConstantesFunciones.resaltardescripcionPeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jTextAreadescripcionPeriodo.setBorder(this.periodoConstantesFunciones.resaltardescripcionPeriodo);}
		if(this.periodoConstantesFunciones.resaltarid_estado_periodoPeriodo!=null && this.jInternalFrameDetalleFormPeriodo!=null) {this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.setBorder(this.periodoConstantesFunciones.resaltarid_estado_periodoPeriodo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPeriodo() throws Exception {		
		if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) {
	
		//this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.setVisible(this.periodoConstantesFunciones.mostraridPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPanelidPeriodo.setVisible(this.periodoConstantesFunciones.mostraridPeriodo);
		//this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_empresaPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPanelid_empresaPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_empresaPeriodo);
		//this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_anioPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPanelid_anioPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_anioPeriodo);
		//this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_ejercicioPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPanelid_ejercicioPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_ejercicioPeriodo);
		//this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_mesPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPanelid_mesPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_mesPeriodo);
		//this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_inicioPeriodo.setVisible(this.periodoConstantesFunciones.mostrarfecha_inicioPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPanelfecha_inicioPeriodo.setVisible(this.periodoConstantesFunciones.mostrarfecha_inicioPeriodo);
		//this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_finPeriodo.setVisible(this.periodoConstantesFunciones.mostrarfecha_finPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPanelfecha_finPeriodo.setVisible(this.periodoConstantesFunciones.mostrarfecha_finPeriodo);
		//this.jInternalFrameDetalleFormPeriodo.jTextFieldnombrePeriodo.setVisible(this.periodoConstantesFunciones.mostrarnombrePeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPanelnombrePeriodo.setVisible(this.periodoConstantesFunciones.mostrarnombrePeriodo);
		//this.jInternalFrameDetalleFormPeriodo.jTextAreadescripcionPeriodo.setVisible(this.periodoConstantesFunciones.mostrardescripcionPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPaneldescripcionPeriodo.setVisible(this.periodoConstantesFunciones.mostrardescripcionPeriodo);
		//this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_estado_periodoPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jPanelid_estado_periodoPeriodo.setVisible(this.periodoConstantesFunciones.mostrarid_estado_periodoPeriodo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPeriodo() throws Exception {
		if(this.jInternalFrameDetalleFormPeriodo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPeriodo!=null) {
	
		this.jInternalFrameDetalleFormPeriodo.jLabelidPeriodo.setEnabled(this.periodoConstantesFunciones.activaridPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_empresaPeriodo.setEnabled(this.periodoConstantesFunciones.activarid_empresaPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_anioPeriodo.setEnabled(this.periodoConstantesFunciones.activarid_anioPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_ejercicioPeriodo.setEnabled(this.periodoConstantesFunciones.activarid_ejercicioPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_mesPeriodo.setEnabled(this.periodoConstantesFunciones.activarid_mesPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_inicioPeriodo.setEnabled(this.periodoConstantesFunciones.activarfecha_inicioPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jDateChooserfecha_finPeriodo.setEnabled(this.periodoConstantesFunciones.activarfecha_finPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jTextFieldnombrePeriodo.setEnabled(this.periodoConstantesFunciones.activarnombrePeriodo);
		this.jInternalFrameDetalleFormPeriodo.jTextAreadescripcionPeriodo.setEnabled(this.periodoConstantesFunciones.activardescripcionPeriodo);
		this.jInternalFrameDetalleFormPeriodo.jComboBoxid_estado_periodoPeriodo.setEnabled(this.periodoConstantesFunciones.activarid_estado_periodoPeriodo);
		}
	}
	
		
}