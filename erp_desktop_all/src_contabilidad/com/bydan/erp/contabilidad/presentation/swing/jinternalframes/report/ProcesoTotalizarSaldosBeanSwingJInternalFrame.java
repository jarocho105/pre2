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

//import com.bydan.erp.contabilidad.util.ProcesoTotalizarSaldosConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ProcesoTotalizarSaldosParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ProcesoTotalizarSaldosParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ProcesoTotalizarSaldosBean;
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
public class ProcesoTotalizarSaldosBeanSwingJInternalFrame extends ProcesoTotalizarSaldosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoTotalizarSaldosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoTotalizarSaldos> procesototalizarsaldosValidator = new ClassValidator<ProcesoTotalizarSaldos>(ProcesoTotalizarSaldos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoTotalizarSaldos procesototalizarsaldos;	
	public ProcesoTotalizarSaldos procesototalizarsaldosAux;
	public ProcesoTotalizarSaldos procesototalizarsaldosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoTotalizarSaldos procesototalizarsaldosTotales;
	public Long idProcesoTotalizarSaldosActual;
	public Long iIdNuevoProcesoTotalizarSaldos=0L;
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
	
	public Boolean isPermisoTodoProcesoTotalizarSaldos;
	public Boolean isPermisoNuevoProcesoTotalizarSaldos;
	public Boolean isPermisoActualizarProcesoTotalizarSaldos;
	public Boolean isPermisoActualizarOriginalProcesoTotalizarSaldos;
	public Boolean isPermisoEliminarProcesoTotalizarSaldos;
	public Boolean isPermisoGuardarCambiosProcesoTotalizarSaldos;
	public Boolean isPermisoConsultaProcesoTotalizarSaldos;
	public Boolean isPermisoBusquedaProcesoTotalizarSaldos;
	public Boolean isPermisoReporteProcesoTotalizarSaldos;
	public Boolean isPermisoPaginacionMedioProcesoTotalizarSaldos;
	public Boolean isPermisoPaginacionAltoProcesoTotalizarSaldos;
	public Boolean isPermisoPaginacionTodoProcesoTotalizarSaldos;
	public Boolean isPermisoCopiarProcesoTotalizarSaldos;
	public Boolean isPermisoVerFormProcesoTotalizarSaldos;
	public Boolean isPermisoDuplicarProcesoTotalizarSaldos;
	public Boolean isPermisoOrdenProcesoTotalizarSaldos;
	
	
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
	
	public ProcesoTotalizarSaldosParameterReturnGeneral procesototalizarsaldosReturnGeneral;
	public ProcesoTotalizarSaldosParameterReturnGeneral procesototalizarsaldosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoTotalizarSaldos=false;
	public Boolean esParaAccionDesdeFormularioProcesoTotalizarSaldos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoTotalizarSaldosSessionBeanAdditional procesototalizarsaldosSessionBeanAdditional=null;
	
	public ProcesoTotalizarSaldosSessionBeanAdditional getProcesoTotalizarSaldosSessionBeanAdditional() {
		return this.procesototalizarsaldosSessionBeanAdditional;
	}
	
	public void setProcesoTotalizarSaldosSessionBeanAdditional(ProcesoTotalizarSaldosSessionBeanAdditional procesototalizarsaldosSessionBeanAdditional) {
		try {
			this.procesototalizarsaldosSessionBeanAdditional=procesototalizarsaldosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional procesototalizarsaldosBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoTotalizarSaldosBeanSwingJInternalFrame
	
	public ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional getProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional() {
		return this.procesototalizarsaldosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional(ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional procesototalizarsaldosBeanSwingJInternalFrameAdditional) {
		try {
			this.procesototalizarsaldosBeanSwingJInternalFrameAdditional=procesototalizarsaldosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoTotalizarSaldosLogic procesototalizarsaldosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoTotalizarSaldos procesototalizarsaldosBean;
	public ProcesoTotalizarSaldosConstantesFunciones procesototalizarsaldosConstantesFunciones;
	//public ProcesoTotalizarSaldosParameterReturnGeneral procesototalizarsaldosReturnGeneral;
	
	//FK
	
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoTotalizarSaldos> procesototalizarsaldoss;	
	//public List<ProcesoTotalizarSaldos> procesototalizarsaldossEliminados;
	//public List<ProcesoTotalizarSaldos> procesototalizarsaldossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoTotalizarSaldos=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoTotalizarSaldos=true;
	public Boolean isVisibilidadCeldaCopiarProcesoTotalizarSaldos=true;
	public Boolean isVisibilidadCeldaVerFormProcesoTotalizarSaldos=true;
	public Boolean isVisibilidadCeldaOrdenProcesoTotalizarSaldos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
	public Boolean isVisibilidadCeldaModificarProcesoTotalizarSaldos=false;
	public Boolean isVisibilidadCeldaActualizarProcesoTotalizarSaldos=false;
	public Boolean isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
	public Boolean isVisibilidadCeldaCancelarProcesoTotalizarSaldos=false;
	public Boolean isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=false;	
	
	
	public Boolean isVisibilidadBusquedaPorEjercicioPorPeriodo=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	
	public Long getiIdNuevoProcesoTotalizarSaldos() {
		return this.iIdNuevoProcesoTotalizarSaldos;
	}

	public void setiIdNuevoProcesoTotalizarSaldos(Long iIdNuevoProcesoTotalizarSaldos) {
		this.iIdNuevoProcesoTotalizarSaldos = iIdNuevoProcesoTotalizarSaldos;
	}
	
	public Long getidProcesoTotalizarSaldosActual() {
		return this.idProcesoTotalizarSaldosActual;
	}

	public void setidProcesoTotalizarSaldosActual(Long idProcesoTotalizarSaldosActual) {
		this.idProcesoTotalizarSaldosActual = idProcesoTotalizarSaldosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoTotalizarSaldos getprocesototalizarsaldos() {
		return this.procesototalizarsaldos;
	}

	public void setprocesototalizarsaldos(ProcesoTotalizarSaldos procesototalizarsaldos) {
		this.procesototalizarsaldos = procesototalizarsaldos;
	}
	
	public ProcesoTotalizarSaldos getprocesototalizarsaldosAux() {
		return this.procesototalizarsaldosAux;
	}

	public void setprocesototalizarsaldosAux(ProcesoTotalizarSaldos procesototalizarsaldosAux) {
		this.procesototalizarsaldosAux = procesototalizarsaldosAux;
	}				
	
	public ProcesoTotalizarSaldos getprocesototalizarsaldosAnterior() {
		return this.procesototalizarsaldosAnterior;
	}

	public void setprocesototalizarsaldosAnterior(ProcesoTotalizarSaldos procesototalizarsaldosAnterior) {
		this.procesototalizarsaldosAnterior = procesototalizarsaldosAnterior;
	}	
	
	public ProcesoTotalizarSaldos getprocesototalizarsaldosTotales() {
		return this.procesototalizarsaldosTotales;
	}

	public void setprocesototalizarsaldosTotales(ProcesoTotalizarSaldos procesototalizarsaldosTotales) {
		this.procesototalizarsaldosTotales = procesototalizarsaldosTotales;
	}	
	
	public ProcesoTotalizarSaldos getprocesototalizarsaldosBean() {
		return this.procesototalizarsaldosBean;
	}

	public void setprocesototalizarsaldosBean(ProcesoTotalizarSaldos procesototalizarsaldosBean) {
		this.procesototalizarsaldosBean = procesototalizarsaldosBean;
	}	
	
	public ProcesoTotalizarSaldosParameterReturnGeneral getprocesototalizarsaldosReturnGeneral() {
		return this.procesototalizarsaldosReturnGeneral;
	}

	public void setprocesototalizarsaldosReturnGeneral(ProcesoTotalizarSaldosParameterReturnGeneral procesototalizarsaldosReturnGeneral) {
		this.procesototalizarsaldosReturnGeneral = procesototalizarsaldosReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaPorEjercicioPorPeriodo=-1L;

	public Long getid_ejercicioBusquedaPorEjercicioPorPeriodo() {
		return this.id_ejercicioBusquedaPorEjercicioPorPeriodo;
	}

	public void setid_ejercicioBusquedaPorEjercicioPorPeriodo(Long id_ejercicioBusquedaPorEjercicioPorPeriodo) {
		this.id_ejercicioBusquedaPorEjercicioPorPeriodo = id_ejercicioBusquedaPorEjercicioPorPeriodo;
	}

;
	public Long id_periodoBusquedaPorEjercicioPorPeriodo=-1L;

	public Long getid_periodoBusquedaPorEjercicioPorPeriodo() {
		return this.id_periodoBusquedaPorEjercicioPorPeriodo;
	}

	public void setid_periodoBusquedaPorEjercicioPorPeriodo(Long id_periodoBusquedaPorEjercicioPorPeriodo) {
		this.id_periodoBusquedaPorEjercicioPorPeriodo = id_periodoBusquedaPorEjercicioPorPeriodo;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoTotalizarSaldosLogic getProcesoTotalizarSaldosLogic()	{		
		return procesototalizarsaldosLogic;
	}

	public void setProcesoTotalizarSaldosLogic(ProcesoTotalizarSaldosLogic procesototalizarsaldosLogic) {
		this.procesototalizarsaldosLogic = procesototalizarsaldosLogic;
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
	
	public Boolean getIsEsNuevoProcesoTotalizarSaldos() {
		return isEsNuevoProcesoTotalizarSaldos;
	}

	public void setIsEsNuevoProcesoTotalizarSaldos(Boolean isEsNuevoProcesoTotalizarSaldos) {
		this.isEsNuevoProcesoTotalizarSaldos = isEsNuevoProcesoTotalizarSaldos;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoTotalizarSaldos() {
		return esParaAccionDesdeFormularioProcesoTotalizarSaldos;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoTotalizarSaldos(Boolean esParaAccionDesdeFormularioProcesoTotalizarSaldos) {
		this.esParaAccionDesdeFormularioProcesoTotalizarSaldos = esParaAccionDesdeFormularioProcesoTotalizarSaldos;
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

			if(this.procesototalizarsaldosSessionBean==null) {
				this.procesototalizarsaldosSessionBean=new ProcesoTotalizarSaldosSessionBean();
			}

			if(!this.procesototalizarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(procesototalizarsaldosSessionBean.getlidEjercicioActual());
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

			if(this.procesototalizarsaldosSessionBean==null) {
				this.procesototalizarsaldosSessionBean=new ProcesoTotalizarSaldosSessionBean();
			}

			if(!this.procesototalizarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(procesototalizarsaldosSessionBean.getlidPeriodoActual());
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

					if(this.procesototalizarsaldos!=null) {
						this.procesototalizarsaldos.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioProcesoTotalizarSaldos.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
						if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorPeriodo") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos!=null) {
						jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos!=null) {
							//jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioProcesoTotalizarSaldosGenerico)throws Exception
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
				jComboBoxid_ejercicioProcesoTotalizarSaldosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioProcesoTotalizarSaldosGenerico!=null && jComboBoxid_ejercicioProcesoTotalizarSaldosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioProcesoTotalizarSaldosGenerico.setSelectedIndex(0);
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

					if(this.procesototalizarsaldos!=null) {
						this.procesototalizarsaldos.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoProcesoTotalizarSaldos.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
						if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorPeriodo") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos!=null) {
						jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos!=null) {
							//jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.getItemCount()>0) {
								jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoProcesoTotalizarSaldosGenerico)throws Exception
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
				jComboBoxid_periodoProcesoTotalizarSaldosGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoProcesoTotalizarSaldosGenerico!=null && jComboBoxid_periodoProcesoTotalizarSaldosGenerico.getItemCount()>0) {
					jComboBoxid_periodoProcesoTotalizarSaldosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ProcesoTotalizarSaldos procesototalizarsaldos,JComboBox jComboBoxid_ejercicioProcesoTotalizarSaldosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioProcesoTotalizarSaldosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioProcesoTotalizarSaldosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				procesototalizarsaldos.setid_ejercicio(ejercicioAux.getId());
				procesototalizarsaldos.setejercicio_descripcion(ProcesoTotalizarSaldosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				procesototalizarsaldos.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(ProcesoTotalizarSaldos procesototalizarsaldos,JComboBox jComboBoxid_periodoProcesoTotalizarSaldosGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoProcesoTotalizarSaldosGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoProcesoTotalizarSaldosGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				procesototalizarsaldos.setid_periodo(periodoAux.getId());
				procesototalizarsaldos.setperiodo_descripcion(ProcesoTotalizarSaldosConstantesFunciones.getPeriodoDescripcion(periodoAux));
				procesototalizarsaldos.setPeriodo(periodoAux);			}
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

					if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { 
							this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { 
					}

					if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorPeriodo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.addItem(ejercicio);
							}
						}

						if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { 
							this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { 
					}

					if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorPeriodo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.addItem(periodo);
							}
						}

						if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoTotalizarSaldos() throws Exception {
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
		
	public ProcesoTotalizarSaldosParameterReturnGeneral getProcesoTotalizarSaldosParameterGeneral() {
		return this.procesototalizarsaldosParameterGeneral;
	}
	
	public void setProcesoTotalizarSaldosParameterGeneral(ProcesoTotalizarSaldosParameterReturnGeneral procesototalizarsaldosParameterGeneral) {
		this.procesototalizarsaldosParameterGeneral = procesototalizarsaldosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoTotalizarSaldos() {
		return isPermisoTodoProcesoTotalizarSaldos;
	}

	public void setIsPermisoTodoProcesoTotalizarSaldos(Boolean isPermisoTodoProcesoTotalizarSaldos) {
		this.isPermisoTodoProcesoTotalizarSaldos = isPermisoTodoProcesoTotalizarSaldos;
	}

	public Boolean getIsPermisoNuevoProcesoTotalizarSaldos() {
		return isPermisoNuevoProcesoTotalizarSaldos;
	}

	public void setIsPermisoNuevoProcesoTotalizarSaldos(Boolean isPermisoNuevoProcesoTotalizarSaldos) {
		this.isPermisoNuevoProcesoTotalizarSaldos = isPermisoNuevoProcesoTotalizarSaldos;
	}

	public Boolean getIsPermisoActualizarProcesoTotalizarSaldos() {
		return isPermisoActualizarProcesoTotalizarSaldos;
	}

	public void setIsPermisoActualizarProcesoTotalizarSaldos(Boolean isPermisoActualizarProcesoTotalizarSaldos) {
		this.isPermisoActualizarProcesoTotalizarSaldos = isPermisoActualizarProcesoTotalizarSaldos;
	}

	public Boolean getIsPermisoEliminarProcesoTotalizarSaldos() {
		return isPermisoEliminarProcesoTotalizarSaldos;
	}

	public void setIsPermisoEliminarProcesoTotalizarSaldos(Boolean isPermisoEliminarProcesoTotalizarSaldos) {
		this.isPermisoEliminarProcesoTotalizarSaldos = isPermisoEliminarProcesoTotalizarSaldos;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoTotalizarSaldos() {
		return isPermisoGuardarCambiosProcesoTotalizarSaldos;
	}

	public void setIsPermisoGuardarCambiosProcesoTotalizarSaldos(Boolean isPermisoGuardarCambiosProcesoTotalizarSaldos) {
		this.isPermisoGuardarCambiosProcesoTotalizarSaldos = isPermisoGuardarCambiosProcesoTotalizarSaldos;
	}
	
	public Boolean getIsPermisoConsultaProcesoTotalizarSaldos() {
		return isPermisoConsultaProcesoTotalizarSaldos;
	}

	public void setIsPermisoConsultaProcesoTotalizarSaldos(Boolean isPermisoConsultaProcesoTotalizarSaldos) {
		this.isPermisoConsultaProcesoTotalizarSaldos = isPermisoConsultaProcesoTotalizarSaldos;
	}

	public Boolean getIsPermisoBusquedaProcesoTotalizarSaldos() {
		return isPermisoBusquedaProcesoTotalizarSaldos;
	}

	public void setIsPermisoBusquedaProcesoTotalizarSaldos(Boolean isPermisoBusquedaProcesoTotalizarSaldos) {
		this.isPermisoBusquedaProcesoTotalizarSaldos = isPermisoBusquedaProcesoTotalizarSaldos;
	}

	public Boolean getIsPermisoReporteProcesoTotalizarSaldos() {
		return isPermisoReporteProcesoTotalizarSaldos;
	}

	public void setIsPermisoReporteProcesoTotalizarSaldos(Boolean isPermisoReporteProcesoTotalizarSaldos) {
		this.isPermisoReporteProcesoTotalizarSaldos = isPermisoReporteProcesoTotalizarSaldos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoTotalizarSaldos() {
		return isPermisoPaginacionMedioProcesoTotalizarSaldos;
	}

	public void setIsPermisoPaginacionMedioProcesoTotalizarSaldos(Boolean isPermisoPaginacionMedioProcesoTotalizarSaldos) {
		this.isPermisoPaginacionMedioProcesoTotalizarSaldos = isPermisoPaginacionMedioProcesoTotalizarSaldos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoTotalizarSaldos() {
		return isPermisoPaginacionTodoProcesoTotalizarSaldos;
	}

	public void setIsPermisoPaginacionTodoProcesoTotalizarSaldos(Boolean isPermisoPaginacionTodoProcesoTotalizarSaldos) {
		this.isPermisoPaginacionTodoProcesoTotalizarSaldos = isPermisoPaginacionTodoProcesoTotalizarSaldos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoTotalizarSaldos() {
		return isPermisoPaginacionAltoProcesoTotalizarSaldos;
	}

	public void setIsPermisoPaginacionAltoProcesoTotalizarSaldos(Boolean isPermisoPaginacionAltoProcesoTotalizarSaldos) {
		this.isPermisoPaginacionAltoProcesoTotalizarSaldos = isPermisoPaginacionAltoProcesoTotalizarSaldos;
	}
	
	public Boolean getIsPermisoCopiarProcesoTotalizarSaldos() {
		return isPermisoCopiarProcesoTotalizarSaldos;
	}

	public void setIsPermisoCopiarProcesoTotalizarSaldos(Boolean isPermisoCopiarProcesoTotalizarSaldos) {
		this.isPermisoCopiarProcesoTotalizarSaldos = isPermisoCopiarProcesoTotalizarSaldos;
	}
	
	public Boolean getIsPermisoVerFormProcesoTotalizarSaldos() {
		return isPermisoVerFormProcesoTotalizarSaldos;
	}

	public void setIsPermisoVerFormProcesoTotalizarSaldos(Boolean isPermisoVerFormProcesoTotalizarSaldos) {
		this.isPermisoVerFormProcesoTotalizarSaldos = isPermisoVerFormProcesoTotalizarSaldos;
	}
	
	public Boolean getIsPermisoDuplicarProcesoTotalizarSaldos() {
		return isPermisoDuplicarProcesoTotalizarSaldos;
	}

	public void setIsPermisoDuplicarProcesoTotalizarSaldos(Boolean isPermisoDuplicarProcesoTotalizarSaldos) {
		this.isPermisoDuplicarProcesoTotalizarSaldos = isPermisoDuplicarProcesoTotalizarSaldos;
	}
	
	public Boolean getIsPermisoOrdenProcesoTotalizarSaldos() {
		return isPermisoOrdenProcesoTotalizarSaldos;
	}

	public void setIsPermisoOrdenProcesoTotalizarSaldos(Boolean isPermisoOrdenProcesoTotalizarSaldos) {
		this.isPermisoOrdenProcesoTotalizarSaldos = isPermisoOrdenProcesoTotalizarSaldos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoTotalizarSaldos() {
		return isVisibilidadCeldaNuevoProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaNuevoProcesoTotalizarSaldos(Boolean isVisibilidadCeldaNuevoProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos = isVisibilidadCeldaNuevoProcesoTotalizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoTotalizarSaldos() {
		return isVisibilidadCeldaDuplicarProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoTotalizarSaldos(Boolean isVisibilidadCeldaDuplicarProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaDuplicarProcesoTotalizarSaldos = isVisibilidadCeldaDuplicarProcesoTotalizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoTotalizarSaldos() {
		return isVisibilidadCeldaCopiarProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaCopiarProcesoTotalizarSaldos(Boolean isVisibilidadCeldaCopiarProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaCopiarProcesoTotalizarSaldos = isVisibilidadCeldaCopiarProcesoTotalizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoTotalizarSaldos() {
		return isVisibilidadCeldaVerFormProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaVerFormProcesoTotalizarSaldos(Boolean isVisibilidadCeldaVerFormProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaVerFormProcesoTotalizarSaldos = isVisibilidadCeldaVerFormProcesoTotalizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoTotalizarSaldos() {
		return isVisibilidadCeldaOrdenProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaOrdenProcesoTotalizarSaldos(Boolean isVisibilidadCeldaOrdenProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaOrdenProcesoTotalizarSaldos = isVisibilidadCeldaOrdenProcesoTotalizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos() {
		return isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos(Boolean isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos = isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoTotalizarSaldos() {
		return isVisibilidadCeldaModificarProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaModificarProcesoTotalizarSaldos(Boolean isVisibilidadCeldaModificarProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaModificarProcesoTotalizarSaldos = isVisibilidadCeldaModificarProcesoTotalizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoTotalizarSaldos() {
		return isVisibilidadCeldaActualizarProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaActualizarProcesoTotalizarSaldos(Boolean isVisibilidadCeldaActualizarProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos = isVisibilidadCeldaActualizarProcesoTotalizarSaldos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoTotalizarSaldos() {
		return isVisibilidadCeldaEliminarProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaEliminarProcesoTotalizarSaldos(Boolean isVisibilidadCeldaEliminarProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos = isVisibilidadCeldaEliminarProcesoTotalizarSaldos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoTotalizarSaldos() {
		return isVisibilidadCeldaCancelarProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaCancelarProcesoTotalizarSaldos(Boolean isVisibilidadCeldaCancelarProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos = isVisibilidadCeldaCancelarProcesoTotalizarSaldos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoTotalizarSaldos() {
		return isVisibilidadCeldaGuardarProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaGuardarProcesoTotalizarSaldos(Boolean isVisibilidadCeldaGuardarProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos = isVisibilidadCeldaGuardarProcesoTotalizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos() {
		return isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos(Boolean isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos) {
		this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos = isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos;
	}
		
	public ProcesoTotalizarSaldosSessionBean getprocesototalizarsaldosSessionBean() {
		return this.procesototalizarsaldosSessionBean;
	}
	
	public void setprocesototalizarsaldosSessionBean(ProcesoTotalizarSaldosSessionBean procesototalizarsaldosSessionBean) {
		this.procesototalizarsaldosSessionBean=procesototalizarsaldosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorEjercicioPorPeriodo() {
		return this.isVisibilidadBusquedaPorEjercicioPorPeriodo;
	}

	public void setisVisibilidadBusquedaPorEjercicioPorPeriodo(Boolean isVisibilidadBusquedaPorEjercicioPorPeriodo) {
		this.isVisibilidadBusquedaPorEjercicioPorPeriodo=isVisibilidadBusquedaPorEjercicioPorPeriodo;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos)throws Exception {
		try {
			
				this.setActualParaGuardarEjercicioForeignKey(procesototalizarsaldos,null);
				this.setActualParaGuardarPeriodoForeignKey(procesototalizarsaldos,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoTotalizarSaldos procesototalizarsaldos,ProcesoTotalizarSaldos procesototalizarsaldosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoTotalizarSaldos(procesototalizarsaldos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesototalizarsaldosAux.setId(procesototalizarsaldos.getId());
		procesototalizarsaldosAux.setVersionRow(procesototalizarsaldos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoTotalizarSaldos procesototalizarsaldosLocal) throws Exception {
		
		if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoTotalizarSaldos procesototalizarsaldosLocal) throws Exception {	
		if(this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				procesototalizarsaldosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				procesototalizarsaldosLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoTotalizarSaldosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesototalizarsaldosValidator.getInvalidValues(this.procesototalizarsaldos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoTotalizarSaldos procesototalizarsaldos,List<ProcesoTotalizarSaldos> procesototalizarsaldoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoTotalizarSaldos procesototalizarsaldos,List<ProcesoTotalizarSaldos> procesototalizarsaldoss) throws Exception {
		try	{			
			ProcesoTotalizarSaldosConstantesFunciones.actualizarSelectedLista(procesototalizarsaldos,procesototalizarsaldoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoTotalizarSaldos> procesototalizarsaldossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesototalizarsaldossLocal=this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesototalizarsaldossLocal=this.procesototalizarsaldoss;
			}
			//ARCHITECTURE
		
			for(ProcesoTotalizarSaldos procesototalizarsaldosLocal:procesototalizarsaldossLocal) {
				if(this.permiteMantenimiento(procesototalizarsaldosLocal) && procesototalizarsaldosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoTotalizarSaldosConstantesFunciones.getProcesoTotalizarSaldosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoTotalizarSaldosConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelid_ejercicioProcesoTotalizarSaldos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoTotalizarSaldosConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelid_periodoProcesoTotalizarSaldos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelid_ejercicioProcesoTotalizarSaldos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelid_periodoProcesoTotalizarSaldos,"");
		
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
		this.iIdNuevoProcesoTotalizarSaldos--;	
		
		
		this.procesototalizarsaldosAux=new ProcesoTotalizarSaldos();
		
		this.procesototalizarsaldosAux.setId(this.iIdNuevoProcesoTotalizarSaldos);
		this.procesototalizarsaldosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().add(this.procesototalizarsaldosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesototalizarsaldoss.add(this.procesototalizarsaldosAux);
		}
		//ARCHITECTURE
		
		this.procesototalizarsaldos=this.procesototalizarsaldosAux;
		
		if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoTotalizarSaldos(this.procesototalizarsaldos);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoTotalizarSaldos(this.procesototalizarsaldos);
		}
				
		//this.setDefaultControlesProcesoTotalizarSaldos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoTotalizarSaldos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoTotalizarSaldos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoTotalizarSaldos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoTotalizarSaldos(this.procesototalizarsaldosBean,this.procesototalizarsaldos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoTotalizarSaldos(this.procesototalizarsaldosReturnGeneral,this.procesototalizarsaldosBean,false);
		
		if(this.procesototalizarsaldosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoTotalizarSaldos(this.procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoTotalizarSaldos(this.procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldos());
		}
		
		if(this.procesototalizarsaldosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoTotalizarSaldos(this.procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldos(),classes);//this.procesototalizarsaldosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.procesototalizarsaldos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoTotalizarSaldos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoTotalizarSaldos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.RecargarFormProcesoTotalizarSaldos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
						
			if(procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoTotalizarSaldos();
			}
			
			this.actualizarVisualTableDatosProcesoTotalizarSaldos();
			
			this.jTableDatosProcesoTotalizarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoTotalizarSaldos(), this.getIndiceNuevoProcesoTotalizarSaldos());
			
			this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
						
			this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoTotalizarSaldos(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.setEnabled(isHabilitar && this.procesototalizarsaldosConstantesFunciones.activarid_ejercicioProcesoTotalizarSaldos);//
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.setEnabled(isHabilitar && this.procesototalizarsaldosConstantesFunciones.activarid_periodoProcesoTotalizarSaldos);
	};
	
	public void setDefaultControlesProcesoTotalizarSaldos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoTotalizarSaldos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesototalizarsaldosSessionBean.setConGuardarRelaciones(true);			
			this.procesototalizarsaldosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTabbedPaneRelacionesProcesoTotalizarSaldos.setVisible(true);
			
					
		} else {
			//this.procesototalizarsaldosSessionBean.setConGuardarRelaciones(false);			
			this.procesototalizarsaldosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTabbedPaneRelacionesProcesoTotalizarSaldos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoTotalizarSaldos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
				if(procesototalizarsaldosAux.getId().equals(this.iIdNuevoProcesoTotalizarSaldos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldoss) {
				if(procesototalizarsaldosAux.getId().equals(this.iIdNuevoProcesoTotalizarSaldos)) {
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
	
	public int getIndiceActualProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
				if(procesototalizarsaldosAux.getId().equals(procesototalizarsaldos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldoss) {
				if(procesototalizarsaldosAux.getId().equals(procesototalizarsaldos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
				if(procesototalizarsaldosAux.getProcesoTotalizarSaldosOriginal().getId().equals(procesototalizarsaldosOriginal.getId())) {
					existe=true;
					procesototalizarsaldosOriginal.setId(procesototalizarsaldosAux.getId());
					procesototalizarsaldosOriginal.setVersionRow(procesototalizarsaldosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldoss) {
				if(procesototalizarsaldosAux.getProcesoTotalizarSaldosOriginal().getId().equals(procesototalizarsaldosOriginal.getId())) {
					existe=true;
					procesototalizarsaldosOriginal.setId(procesototalizarsaldosAux.getId());
					procesototalizarsaldosOriginal.setVersionRow(procesototalizarsaldosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoTotalizarSaldos(Boolean esParaCancelar) throws Exception {
		procesototalizarsaldossAux=new ArrayList<ProcesoTotalizarSaldos>();
		procesototalizarsaldosAux=new ProcesoTotalizarSaldos();
		
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
					if(procesototalizarsaldosAux.getId()<0) {
						procesototalizarsaldossAux.add(procesototalizarsaldosAux);
					}		
				}
				this.iIdNuevoProcesoTotalizarSaldos=0L;
				this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().removeAll(procesototalizarsaldossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldoss) {
					if(procesototalizarsaldosAux.getId()<0) {
						procesototalizarsaldossAux.add(procesototalizarsaldosAux);
					}		
				}
				this.iIdNuevoProcesoTotalizarSaldos=0L;
				this.procesototalizarsaldoss.removeAll(procesototalizarsaldossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoTotalizarSaldos 
					&& this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().size()>0
					) {
					procesototalizarsaldosAux=this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().get(this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().size() - 1);
				
					if(procesototalizarsaldosAux.getId()<0) {
						this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().remove(procesototalizarsaldosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoTotalizarSaldos && this.procesototalizarsaldoss.size()>0) {
					procesototalizarsaldosAux=this.procesototalizarsaldoss.get(this.procesototalizarsaldoss.size() - 1);
				
					if(procesototalizarsaldosAux.getId()<0) {
						this.procesototalizarsaldoss.remove(procesototalizarsaldosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoTotalizarSaldos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesototalizarsaldos.getId()<0) {
				this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().remove(this.procesototalizarsaldos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesototalizarsaldos.getId()<0) {
				this.procesototalizarsaldoss.remove(this.procesototalizarsaldos);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoTotalizarSaldos(List<ProcesoTotalizarSaldos> procesototalizarsaldossAux) throws Exception {
		ProcesoTotalizarSaldosConstantesFunciones.setEstadosInicialesProcesoTotalizarSaldos(procesototalizarsaldossAux);
	}
	
	public void setEstadosInicialesProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldosAux) throws Exception {
		ProcesoTotalizarSaldosConstantesFunciones.setEstadosInicialesProcesoTotalizarSaldos(procesototalizarsaldosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoTotalizarSaldosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoTotalizarSaldosActual()) {
				if(!this.isEsNuevoProcesoTotalizarSaldos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoTotalizarSaldos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoTotalizarSaldosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Totalizar Saldos ?", "MANTENIMIENTO DE Proceso Totalizar Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoTotalizarSaldos procesototalizarsaldos) throws Exception {
		ProcesoTotalizarSaldosConstantesFunciones.seleccionarAsignar(this.procesototalizarsaldos,procesototalizarsaldos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoTotalizarSaldos=this.isPermisoActualizarOriginalProcesoTotalizarSaldos;
			
			
			this.seleccionarAsignar(procesototalizarsaldos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesototalizarsaldosSessionBean.setsFuncionBusquedaRapida(this.procesototalizarsaldosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoTotalizarSaldos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoTotalizarSaldos(esParaCancelar);				
				this.cancelarNuevoProcesoTotalizarSaldos(esParaCancelar);								
			}
			
			this.procesototalizarsaldos=new ProcesoTotalizarSaldos();
			
			this.inicializarProcesoTotalizarSaldos();
			
			this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoTotalizarSaldos() throws Exception {
		try {
			ProcesoTotalizarSaldosConstantesFunciones.inicializarProcesoTotalizarSaldos(this.procesototalizarsaldos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoTotalizarSaldoss(String sAccionBusqueda,List<ProcesoTotalizarSaldos> procesototalizarsaldossParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoTotalizarSaldos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoTotalizarSaldosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoTotalizarSaldosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoTotalizarSaldos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Totalizar Saldoses");		
		parameters.put("busquedapor", ProcesoTotalizarSaldosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoTotalizarSaldos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoTotalizarSaldos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoTotalizarSaldosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoTotalizarSaldosBean.TraerProcesoTotalizarSaldosBeans(procesototalizarsaldossParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoTotalizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesototalizarsaldossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoTotalizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesototalizarsaldossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldosActionPerformed(null);
					//this.generarExcelReporteProcesoTotalizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesototalizarsaldossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoTotalizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesototalizarsaldossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoTotalizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesototalizarsaldossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoTotalizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesototalizarsaldossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoTotalizarSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoTotalizarSaldos> procesototalizarsaldossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesototalizarsaldos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoTotalizarSaldoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoTotalizarSaldos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoTotalizarSaldos procesototalizarsaldos : procesototalizarsaldossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoTotalizarSaldosConstantesFunciones.generarExcelReporteDataProcesoTotalizarSaldos("NORMAL",row,workbook,procesototalizarsaldos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Totalizar Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoTotalizarSaldos(String sTipo,Row row,Workbook workbook) {
		
		ProcesoTotalizarSaldosConstantesFunciones.generarExcelReporteHeaderProcesoTotalizarSaldos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoTotalizarSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoTotalizarSaldos> procesototalizarsaldossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesototalizarsaldos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoTotalizarSaldoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoTotalizarSaldos procesototalizarsaldos : procesototalizarsaldossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.getProcesoTotalizarSaldosDescripcion(procesototalizarsaldos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesototalizarsaldos.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesototalizarsaldos.getperiodo_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Totalizar Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoTotalizarSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoTotalizarSaldos> procesototalizarsaldossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoTotalizarSaldos> procesototalizarsaldossRespaldo=null;
		
		classes=ProcesoTotalizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoTotalizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesototalizarsaldosLogic.setDatosCliente(this.datosCliente);
		this.procesototalizarsaldosLogic.setDatosDeep(this.datosDeep);
		this.procesototalizarsaldosLogic.setIsConDeep(true);
		
		procesototalizarsaldossRespaldo=this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss();
		
		this.procesototalizarsaldosLogic.setProcesoTotalizarSaldoss(procesototalizarsaldossParaReportes);	
		this.procesototalizarsaldosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesototalizarsaldossParaReportes=this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss();
		this.procesototalizarsaldosLogic.setProcesoTotalizarSaldoss(procesototalizarsaldossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesototalizarsaldos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoTotalizarSaldoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoTotalizarSaldos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoTotalizarSaldos procesototalizarsaldos : procesototalizarsaldossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoTotalizarSaldos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoTotalizarSaldosConstantesFunciones.generarExcelReporteDataProcesoTotalizarSaldos("NORMAL",row,workbook,procesototalizarsaldos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.getProcesoTotalizarSaldosDescripcion(procesototalizarsaldos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Totalizar Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoTotalizarSaldos() throws Exception {		
		this.startProcessProcesoTotalizarSaldos(true);
	}
	
	public void startProcessProcesoTotalizarSaldos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoTotalizarSaldos ,this.jPanelParametrosReportesProcesoTotalizarSaldos, this.jScrollPanelDatosProcesoTotalizarSaldos,this.jPanelPaginacionProcesoTotalizarSaldos, this.jScrollPanelDatosEdicionProcesoTotalizarSaldos, this.jPanelAccionesProcesoTotalizarSaldos,this.jPanelAccionesFormularioProcesoTotalizarSaldos,this.jmenuBarProcesoTotalizarSaldos,this.jmenuBarDetalleProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,this.jTtoolBarDetalleProcesoTotalizarSaldos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoTotalizarSaldos=this.jTabbedPaneBusquedasProcesoTotalizarSaldos; 
		
		final JPanel jPanelParametrosReportesProcesoTotalizarSaldos=this.jPanelParametrosReportesProcesoTotalizarSaldos;
		//final JScrollPane jScrollPanelDatosProcesoTotalizarSaldos=this.jScrollPanelDatosProcesoTotalizarSaldos;
		final JTable jTableDatosProcesoTotalizarSaldos=this.jTableDatosProcesoTotalizarSaldos;		
		final JPanel jPanelPaginacionProcesoTotalizarSaldos=this.jPanelPaginacionProcesoTotalizarSaldos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoTotalizarSaldos=this.jScrollPanelDatosEdicionProcesoTotalizarSaldos;
		final JPanel jPanelAccionesProcesoTotalizarSaldos=this.jPanelAccionesProcesoTotalizarSaldos;
		
		JPanel jPanelCamposAuxiliarProcesoTotalizarSaldos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoTotalizarSaldos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			jPanelCamposAuxiliarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jPanelCamposProcesoTotalizarSaldos;
			jPanelAccionesFormularioAuxiliarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jPanelAccionesFormularioProcesoTotalizarSaldos;
		}
		
		final JPanel jPanelCamposProcesoTotalizarSaldos=jPanelCamposAuxiliarProcesoTotalizarSaldos;
		final JPanel jPanelAccionesFormularioProcesoTotalizarSaldos=jPanelAccionesFormularioAuxiliarProcesoTotalizarSaldos;
		
		
		final JMenuBar jmenuBarProcesoTotalizarSaldos=this.jmenuBarProcesoTotalizarSaldos;
		final JToolBar jTtoolBarProcesoTotalizarSaldos=this.jTtoolBarProcesoTotalizarSaldos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoTotalizarSaldos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoTotalizarSaldos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			jmenuBarDetalleAuxiliarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jmenuBarDetalleProcesoTotalizarSaldos;
			jTtoolBarDetalleAuxiliarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTtoolBarDetalleProcesoTotalizarSaldos;
		}
		
		final JMenuBar jmenuBarDetalleProcesoTotalizarSaldos=jmenuBarDetalleAuxiliarProcesoTotalizarSaldos;
		final JToolBar jTtoolBarDetalleProcesoTotalizarSaldos=jTtoolBarDetalleAuxiliarProcesoTotalizarSaldos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoTotalizarSaldos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoTotalizarSaldos;
			processRunnable.jTableDatos=jTableDatosProcesoTotalizarSaldos;
			processRunnable.jPanelCampos=jPanelCamposProcesoTotalizarSaldos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoTotalizarSaldos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoTotalizarSaldos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoTotalizarSaldos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoTotalizarSaldos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoTotalizarSaldos;
			processRunnable.jTtoolBar=jTtoolBarProcesoTotalizarSaldos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoTotalizarSaldos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoTotalizarSaldos ,jPanelParametrosReportesProcesoTotalizarSaldos,jTableDatosProcesoTotalizarSaldos, /*jScrollPanelDatosProcesoTotalizarSaldos,*/jPanelCamposProcesoTotalizarSaldos,jPanelPaginacionProcesoTotalizarSaldos, /*jScrollPanelDatosEdicionProcesoTotalizarSaldos,*/ jPanelAccionesProcesoTotalizarSaldos,jPanelAccionesFormularioProcesoTotalizarSaldos,jmenuBarProcesoTotalizarSaldos,jmenuBarDetalleProcesoTotalizarSaldos,jTtoolBarProcesoTotalizarSaldos,jTtoolBarDetalleProcesoTotalizarSaldos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoTotalizarSaldos ,jPanelParametrosReportesProcesoTotalizarSaldos, jScrollPanelDatosProcesoTotalizarSaldos,jPanelPaginacionProcesoTotalizarSaldos, jScrollPanelDatosEdicionProcesoTotalizarSaldos, jPanelAccionesProcesoTotalizarSaldos,jPanelAccionesFormularioProcesoTotalizarSaldos,jmenuBarProcesoTotalizarSaldos,jmenuBarDetalleProcesoTotalizarSaldos,jTtoolBarProcesoTotalizarSaldos,jTtoolBarDetalleProcesoTotalizarSaldos);
						
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
	
	public void finishProcessProcesoTotalizarSaldos() {// throws Exception 
		this.finishProcessProcesoTotalizarSaldos(true);
	}
	
	public void finishProcessProcesoTotalizarSaldos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoTotalizarSaldos ,this.jPanelParametrosReportesProcesoTotalizarSaldos, this.jScrollPanelDatosProcesoTotalizarSaldos,this.jPanelPaginacionProcesoTotalizarSaldos, this.jScrollPanelDatosEdicionProcesoTotalizarSaldos, this.jPanelAccionesProcesoTotalizarSaldos,this.jPanelAccionesFormularioProcesoTotalizarSaldos,this.jmenuBarProcesoTotalizarSaldos,this.jmenuBarDetalleProcesoTotalizarSaldos,this.jTtoolBarProcesoTotalizarSaldos,this.jTtoolBarDetalleProcesoTotalizarSaldos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoTotalizarSaldos=this.jTabbedPaneBusquedasProcesoTotalizarSaldos; 
		
		final JPanel jPanelParametrosReportesProcesoTotalizarSaldos=this.jPanelParametrosReportesProcesoTotalizarSaldos;
		//final JScrollPane jScrollPanelDatosProcesoTotalizarSaldos=this.jScrollPanelDatosProcesoTotalizarSaldos;
		final JTable jTableDatosProcesoTotalizarSaldos=this.jTableDatosProcesoTotalizarSaldos;		
		final JPanel jPanelPaginacionProcesoTotalizarSaldos=this.jPanelPaginacionProcesoTotalizarSaldos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoTotalizarSaldos=this.jScrollPanelDatosEdicionProcesoTotalizarSaldos;
		final JPanel jPanelAccionesProcesoTotalizarSaldos=this.jPanelAccionesProcesoTotalizarSaldos;
		
		JPanel jPanelCamposAuxiliarProcesoTotalizarSaldos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoTotalizarSaldos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			jPanelCamposAuxiliarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jPanelCamposProcesoTotalizarSaldos;
			jPanelAccionesFormularioAuxiliarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jPanelAccionesFormularioProcesoTotalizarSaldos;
		}
		
		final JPanel jPanelCamposProcesoTotalizarSaldos=jPanelCamposAuxiliarProcesoTotalizarSaldos;
		final JPanel jPanelAccionesFormularioProcesoTotalizarSaldos=jPanelAccionesFormularioAuxiliarProcesoTotalizarSaldos;
		
		
		final JMenuBar jmenuBarProcesoTotalizarSaldos=this.jmenuBarProcesoTotalizarSaldos;		
		final JToolBar jTtoolBarProcesoTotalizarSaldos=this.jTtoolBarProcesoTotalizarSaldos;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoTotalizarSaldos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoTotalizarSaldos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			jmenuBarDetalleAuxiliarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jmenuBarDetalleProcesoTotalizarSaldos;
			jTtoolBarDetalleAuxiliarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTtoolBarDetalleProcesoTotalizarSaldos;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoTotalizarSaldos=jmenuBarDetalleAuxiliarProcesoTotalizarSaldos;
		final JToolBar jTtoolBarDetalleProcesoTotalizarSaldos=jTtoolBarDetalleAuxiliarProcesoTotalizarSaldos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoTotalizarSaldos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoTotalizarSaldos;
			processRunnable.jTableDatos=jTableDatosProcesoTotalizarSaldos;
			processRunnable.jPanelCampos=jPanelCamposProcesoTotalizarSaldos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoTotalizarSaldos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoTotalizarSaldos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoTotalizarSaldos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoTotalizarSaldos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoTotalizarSaldos;
			processRunnable.jTtoolBar=jTtoolBarProcesoTotalizarSaldos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoTotalizarSaldos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoTotalizarSaldos ,jPanelParametrosReportesProcesoTotalizarSaldos, jTableDatosProcesoTotalizarSaldos,/*jScrollPanelDatosProcesoTotalizarSaldos,*/jPanelCamposProcesoTotalizarSaldos,jPanelPaginacionProcesoTotalizarSaldos, /*jScrollPanelDatosEdicionProcesoTotalizarSaldos,*/ jPanelAccionesProcesoTotalizarSaldos,jPanelAccionesFormularioProcesoTotalizarSaldos,jmenuBarProcesoTotalizarSaldos,jmenuBarDetalleProcesoTotalizarSaldos,jTtoolBarProcesoTotalizarSaldos,jTtoolBarDetalleProcesoTotalizarSaldos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoTotalizarSaldos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoTotalizarSaldos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoTotalizarSaldos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoTotalizarSaldos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoTotalizarSaldos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoTotalizarSaldos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoTotalizarSaldos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoTotalizarSaldos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoTotalizarSaldos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesototalizarsaldosConstantesFunciones.getsFinalQueryProcesoTotalizarSaldos();
		String  finalQueryPaginacionTodos=this.procesototalizarsaldosConstantesFunciones.getsFinalQueryProcesoTotalizarSaldos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoTotalizarSaldosConstantesFunciones.getArrayColumnasGlobalesNoProcesoTotalizarSaldos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoTotalizarSaldosConstantesFunciones.getArrayColumnasGlobalesProcesoTotalizarSaldos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoTotalizarSaldosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesototalizarsaldossEliminados= new ArrayList<ProcesoTotalizarSaldos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoTotalizarSaldos();
		
				///*ProcesoTotalizarSaldosSessionBean*/this.procesototalizarsaldosSessionBean=new ProcesoTotalizarSaldosSessionBean();
			
			if(this.procesototalizarsaldosSessionBean==null) {
				this.procesototalizarsaldosSessionBean=new ProcesoTotalizarSaldosSessionBean();
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
					this.iNumeroPaginacion=ProcesoTotalizarSaldosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoTotalizarSaldosConstantesFunciones.getClassesForeignKeysOfProcesoTotalizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesototalizarsaldos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesototalizarsaldossAux= new ArrayList<ProcesoTotalizarSaldos>();
			
				
			procesototalizarsaldosLogic.setDatosCliente(this.datosCliente);
			procesototalizarsaldosLogic.setDatosDeep(this.datosDeep);
			procesototalizarsaldosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorEjercicioPorPeriodo")) {
				this.sDetalleReporte=ProcesoTotalizarSaldosConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorPeriodo(id_ejercicioBusquedaPorEjercicioPorPeriodo,id_periodoBusquedaPorEjercicioPorPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesototalizarsaldosLogic.getProcesoTotalizarSaldossBusquedaPorEjercicioPorPeriodo(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaPorEjercicioPorPeriodo,id_periodoBusquedaPorEjercicioPorPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoTotalizarSaldosConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorPeriodo(id_ejercicioBusquedaPorEjercicioPorPeriodo,id_periodoBusquedaPorEjercicioPorPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoTotalizarSaldosConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorPeriodo(id_ejercicioBusquedaPorEjercicioPorPeriodo,id_periodoBusquedaPorEjercicioPorPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()==null||procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesototalizarsaldoss==null|| procesototalizarsaldoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesototalizarsaldossAux=new ArrayList<ProcesoTotalizarSaldos>();
						procesototalizarsaldossAux.addAll(procesototalizarsaldosLogic.getProcesoTotalizarSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesototalizarsaldossAux=new ArrayList<ProcesoTotalizarSaldos>();
							procesototalizarsaldossAux.addAll(procesototalizarsaldoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesototalizarsaldosLogic.getProcesoTotalizarSaldossBusquedaPorEjercicioPorPeriodo(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaPorEjercicioPorPeriodo,id_periodoBusquedaPorEjercicioPorPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoTotalizarSaldosConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorPeriodo(id_ejercicioBusquedaPorEjercicioPorPeriodo,id_periodoBusquedaPorEjercicioPorPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoTotalizarSaldosConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorPeriodo(id_ejercicioBusquedaPorEjercicioPorPeriodo,id_periodoBusquedaPorEjercicioPorPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoTotalizarSaldoss("BusquedaPorEjercicioPorPeriodo",procesototalizarsaldosLogic.getProcesoTotalizarSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoTotalizarSaldoss("BusquedaPorEjercicioPorPeriodo",procesototalizarsaldoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesototalizarsaldosLogic.setProcesoTotalizarSaldoss(new ArrayList<ProcesoTotalizarSaldos>());
						procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().addAll(procesototalizarsaldossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesototalizarsaldoss=new ArrayList<ProcesoTotalizarSaldos>();
							procesototalizarsaldoss.addAll(procesototalizarsaldossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoTotalizarSaldos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoTotalizarSaldos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesototalizarsaldoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesototalizarsaldoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoTotalizarSaldos procesototalizarsaldos) {
		Boolean permite=true;
		
		if(this.procesototalizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoTotalizarSaldosConstantesFunciones.getOrderByListaProcesoTotalizarSaldos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoTotalizarSaldosConstantesFunciones.getOrderByListaProcesoTotalizarSaldos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTotalizarSaldos procesototalizarsaldos:procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
				if(procesototalizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesototalizarsaldosTotales=procesototalizarsaldos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTotalizarSaldos procesototalizarsaldos:this.procesototalizarsaldoss) {
				if(procesototalizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesototalizarsaldosTotales=procesototalizarsaldos;
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
			this.procesototalizarsaldosAux=new ProcesoTotalizarSaldos();
			this.procesototalizarsaldosAux.setsType(Constantes2.S_TOTALES);
			this.procesototalizarsaldosAux.setIsNew(false);
			this.procesototalizarsaldosAux.setIsChanged(false);
			this.procesototalizarsaldosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoTotalizarSaldosConstantesFunciones.TotalizarValoresFilaProcesoTotalizarSaldos(this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss(),this.procesototalizarsaldosAux);
				
				//this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().add(this.procesototalizarsaldosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoTotalizarSaldosConstantesFunciones.TotalizarValoresFilaProcesoTotalizarSaldos(this.procesototalizarsaldoss,this.procesototalizarsaldosAux);
				
				this.procesototalizarsaldoss.add(this.procesototalizarsaldosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesototalizarsaldosTotales=new ProcesoTotalizarSaldos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().remove(procesototalizarsaldosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesototalizarsaldoss.remove(procesototalizarsaldosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesototalizarsaldosTotales=new ProcesoTotalizarSaldos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoTotalizarSaldos procesototalizarsaldos:procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
				if(procesototalizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesototalizarsaldosTotales=procesototalizarsaldos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoTotalizarSaldosConstantesFunciones.TotalizarValoresFilaProcesoTotalizarSaldos(this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss(),procesototalizarsaldosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoTotalizarSaldos procesototalizarsaldos:this.procesototalizarsaldoss) {
				if(procesototalizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesototalizarsaldosTotales=procesototalizarsaldos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoTotalizarSaldosConstantesFunciones.TotalizarValoresFilaProcesoTotalizarSaldos(this.procesototalizarsaldoss,procesototalizarsaldosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoTotalizarSaldossBusquedaPorEjercicioPorPeriodo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorEjercicioPorPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoTotalizarSaldossFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoTotalizarSaldossFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoTotalizarSaldossBusquedaPorEjercicioPorPeriodo(String sFinalQuery,Long id_ejercicio,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesototalizarsaldosLogic.getProcesoTotalizarSaldossBusquedaPorEjercicioPorPeriodo(sFinalQuery,this.pagination,id_ejercicio,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoTotalizarSaldossFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesototalizarsaldosLogic.getProcesoTotalizarSaldossFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoTotalizarSaldossFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesototalizarsaldosLogic.getProcesoTotalizarSaldossFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
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
	
	public void inicializarPermisosProcesoTotalizarSaldos() {
		this.isPermisoTodoProcesoTotalizarSaldos=false;
		this.isPermisoNuevoProcesoTotalizarSaldos=false;
		this.isPermisoActualizarProcesoTotalizarSaldos=false;
		this.isPermisoActualizarOriginalProcesoTotalizarSaldos=false;
		this.isPermisoEliminarProcesoTotalizarSaldos=false;
		this.isPermisoGuardarCambiosProcesoTotalizarSaldos=false;
		this.isPermisoConsultaProcesoTotalizarSaldos=true;
		this.isPermisoBusquedaProcesoTotalizarSaldos=true;
		this.isPermisoReporteProcesoTotalizarSaldos=true;
		this.isPermisoOrdenProcesoTotalizarSaldos=false;		
		this.isPermisoPaginacionMedioProcesoTotalizarSaldos=false;		
		this.isPermisoPaginacionAltoProcesoTotalizarSaldos=false;		
		this.isPermisoPaginacionTodoProcesoTotalizarSaldos=false;		
		this.isPermisoCopiarProcesoTotalizarSaldos=false;		
		this.isPermisoVerFormProcesoTotalizarSaldos=false;		
		this.isPermisoDuplicarProcesoTotalizarSaldos=false;
		this.isPermisoOrdenProcesoTotalizarSaldos=false;
	}
	
	public void setPermisosUsuarioProcesoTotalizarSaldos(Boolean isPermiso) {
		this.isPermisoTodoProcesoTotalizarSaldos=isPermiso;
		this.isPermisoNuevoProcesoTotalizarSaldos=isPermiso;
		this.isPermisoActualizarProcesoTotalizarSaldos=isPermiso;
		this.isPermisoActualizarOriginalProcesoTotalizarSaldos=isPermiso;
		this.isPermisoEliminarProcesoTotalizarSaldos=isPermiso;
		this.isPermisoGuardarCambiosProcesoTotalizarSaldos=isPermiso;
		this.isPermisoConsultaProcesoTotalizarSaldos=isPermiso;
		this.isPermisoBusquedaProcesoTotalizarSaldos=isPermiso;
		this.isPermisoReporteProcesoTotalizarSaldos=isPermiso;
		this.isPermisoOrdenProcesoTotalizarSaldos=isPermiso;		
		this.isPermisoPaginacionMedioProcesoTotalizarSaldos=isPermiso;		
		this.isPermisoPaginacionAltoProcesoTotalizarSaldos=isPermiso;		
		this.isPermisoPaginacionTodoProcesoTotalizarSaldos=isPermiso;		
		this.isPermisoCopiarProcesoTotalizarSaldos=isPermiso;		
		this.isPermisoVerFormProcesoTotalizarSaldos=isPermiso;		
		this.isPermisoDuplicarProcesoTotalizarSaldos=isPermiso;
		this.isPermisoOrdenProcesoTotalizarSaldos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoTotalizarSaldos(Boolean isPermiso) {
		//this.isPermisoTodoProcesoTotalizarSaldos=isPermiso;
		this.isPermisoNuevoProcesoTotalizarSaldos=isPermiso;
		this.isPermisoActualizarProcesoTotalizarSaldos=isPermiso;
		this.isPermisoActualizarOriginalProcesoTotalizarSaldos=isPermiso;
		this.isPermisoEliminarProcesoTotalizarSaldos=isPermiso;
		this.isPermisoGuardarCambiosProcesoTotalizarSaldos=isPermiso;
		//this.isPermisoConsultaProcesoTotalizarSaldos=isPermiso;
		//this.isPermisoBusquedaProcesoTotalizarSaldos=isPermiso;
		//this.isPermisoReporteProcesoTotalizarSaldos=isPermiso;
		//this.isPermisoOrdenProcesoTotalizarSaldos=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoTotalizarSaldos=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoTotalizarSaldos=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoTotalizarSaldos=isPermiso;		
		//this.isPermisoCopiarProcesoTotalizarSaldos=isPermiso;		
		//this.isPermisoDuplicarProcesoTotalizarSaldos=isPermiso;
		//this.isPermisoOrdenProcesoTotalizarSaldos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoTotalizarSaldosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoTotalizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoTotalizarSaldos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoTotalizarSaldosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoTotalizarSaldosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoTotalizarSaldosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoTotalizarSaldosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoTotalizarSaldos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoTotalizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoTotalizarSaldosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoTotalizarSaldos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoTotalizarSaldos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoTotalizarSaldos=this.isPermisoActualizarProcesoTotalizarSaldos;
			this.isPermisoEliminarProcesoTotalizarSaldos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoTotalizarSaldos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoTotalizarSaldos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoTotalizarSaldos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoTotalizarSaldos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoTotalizarSaldos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoTotalizarSaldos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoTotalizarSaldos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoTotalizarSaldos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoTotalizarSaldos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoTotalizarSaldos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoTotalizarSaldos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoTotalizarSaldos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoTotalizarSaldos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoTotalizarSaldos.setToolTipText(this.jTableDatosProcesoTotalizarSaldos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoTotalizarSaldos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoTotalizarSaldos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoTotalizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoTotalizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoTotalizarSaldos() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoTotalizarSaldosListas()throws Exception {
		try	{						
			
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoTotalizarSaldosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoTotalizarSaldosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoTotalizarSaldos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {
			if(this.procesototalizarsaldosSessionBean==null) {
				this.procesototalizarsaldosSessionBean=new ProcesoTotalizarSaldosSessionBean();
			}

			if(!this.procesototalizarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.procesototalizarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoTotalizarSaldos()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEjercicio("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoTotalizarSaldos(String sFormularioTipoBusqueda)throws Exception {
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
					if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.addItemListener(new ComboBoxItemListener(this,"id_ejercicioProcesoTotalizarSaldos"));
						this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioProcesoTotalizarSaldos"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.addActionListener(new ComboBoxActionListener(this,"id_ejercicioProcesoTotalizarSaldos"));
						this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioProcesoTotalizarSaldos"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos"));

						this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos"));

					} else {
						this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos"));

						this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProcesoTotalizarSaldos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoTotalizarSaldos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoTotalizarSaldos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoTotalizarSaldos()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoTotalizarSaldos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoTotalizarSaldos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoTotalizarSaldos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoTotalizarSaldos()throws Exception {
		try {
			

			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoTotalizarSaldos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoTotalizarSaldos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos!=null && this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos!=null && this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormProcesoTotalizarSaldosEjercicio(JComboBox<?> jComboBoxGenericoEjercicio,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProcesoTotalizarSaldosid_periodo(jComboBoxGenericoEjercicio,sFormularioTipoBusqueda,"Ejercicio",false);
	}


	
	



	public void recargarFormProcesoTotalizarSaldosid_periodo(JComboBox<?> jComboBoxGenericoPeriodo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Ejercicio")){
				this.setActualParaGuardarEjercicioForeignKey(this.procesototalizarsaldos,jComboBoxGenericoPeriodo);
			}

			if(this.procesototalizarsaldos.getid_ejercicio()!=null && this.procesototalizarsaldos.getid_ejercicio()!=0L) {
				sFinalQuery+="  WHERE  id_ejercicio="+this.procesototalizarsaldos.getid_ejercicio();
			} else {
				sFinalQuery+="  WHERE  id_ejercicio=-1";
			}



			//BUCLE RECURSIVO
			this.setActualPeriodoForeignKey(this.procesototalizarsaldos.getid_ejercicio(),true,sFormularioTipoBusqueda);

			this.cargarCombosPeriodosForeignKeyLista(sFinalQuery);

			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProcesoTotalizarSaldosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoTotalizarSaldosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoTotalizarSaldosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesototalizarsaldosSessionBean=new ProcesoTotalizarSaldosSessionBean(); 
		this.procesototalizarsaldosConstantesFunciones=new ProcesoTotalizarSaldosConstantesFunciones(); 
		this.procesototalizarsaldosBean=new ProcesoTotalizarSaldos();//(this.procesototalizarsaldosConstantesFunciones); 		
		this.procesototalizarsaldosReturnGeneral=new ProcesoTotalizarSaldosParameterReturnGeneral(); 
		
		this.procesototalizarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesototalizarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoTotalizarSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoTotalizarSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoTotalizarSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoTotalizarSaldos(true);
			
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
			
			this.procesototalizarsaldosConstantesFunciones=new ProcesoTotalizarSaldosConstantesFunciones(); 
			this.procesototalizarsaldosBean=new ProcesoTotalizarSaldos();//this.procesototalizarsaldosConstantesFunciones); 			
			this.procesototalizarsaldosReturnGeneral=new ProcesoTotalizarSaldosParameterReturnGeneral(); 
		
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Totalizar Saldos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesototalizarsaldos=new ProcesoTotalizarSaldos();
			this.procesototalizarsaldoss = new ArrayList<ProcesoTotalizarSaldos>();
			this.procesototalizarsaldossAux = new ArrayList<ProcesoTotalizarSaldos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic=new ProcesoTotalizarSaldosLogic();
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			//this.procesototalizarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesototalizarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoTotalizarSaldos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos);	
					}
					
					if(this.jInternalFrameImportacionProcesoTotalizarSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoTotalizarSaldos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoTotalizarSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoTotalizarSaldos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoTotalizarSaldos);
				this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setVisible(false);
				this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos);
					this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoTotalizarSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoTotalizarSaldos);
					this.jInternalFrameImportacionProcesoTotalizarSaldos.setVisible(false);
					this.jInternalFrameImportacionProcesoTotalizarSaldos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoTotalizarSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoTotalizarSaldos);
					this.jInternalFrameOrderByProcesoTotalizarSaldos.setVisible(false);
					this.jInternalFrameOrderByProcesoTotalizarSaldos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoTotalizarSaldosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoTotalizarSaldosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesototalizarsaldosReturnGeneral=new ProcesoTotalizarSaldosParameterReturnGeneral();
			
			this.procesototalizarsaldosParameterGeneral=new ProcesoTotalizarSaldosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesototalizarsaldosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoTotalizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoTotalizarSaldosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado(),this.procesototalizarsaldosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoTotalizarSaldosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado(),this.procesototalizarsaldosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaDuplicarProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaCopiarProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaVerFormProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaOrdenProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=false;
			
			
			this.isVisibilidadBusquedaPorEjercicioPorPeriodo=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdPeriodo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoTotalizarSaldos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoTotalizarSaldos(false);
			
			this.setPermisosUsuarioProcesoTotalizarSaldos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado() 
				|| (this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado() && this.procesototalizarsaldosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoTotalizarSaldosClasesRelacionadas();
			}
			
			if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoTotalizarSaldosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoTotalizarSaldos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoTotalizarSaldos();
			}
			
			if(!this.isPermisoBusquedaProcesoTotalizarSaldos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoTotalizarSaldosConstantesFunciones.getTiposSeleccionarProcesoTotalizarSaldos());
				
				this.tiposColumnasSelect=ProcesoTotalizarSaldosConstantesFunciones.getTiposSeleccionarProcesoTotalizarSaldos(true);
				
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
			//if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoTotalizarSaldos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoTotalizarSaldos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoTotalizarSaldos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoTotalizarSaldos() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesototalizarsaldosImplementable= (ProcesoTotalizarSaldosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoTotalizarSaldosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesototalizarsaldosImplementableHome= (ProcesoTotalizarSaldosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoTotalizarSaldosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesototalizarsaldoss= new ArrayList<ProcesoTotalizarSaldos>();
			this.procesototalizarsaldossEliminados= new ArrayList<ProcesoTotalizarSaldos>();
						
			this.isEsNuevoProcesoTotalizarSaldos=false;
			this.esParaAccionDesdeFormularioProcesoTotalizarSaldos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoTotalizarSaldos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoTotalizarSaldos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoTotalizarSaldosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoTotalizarSaldos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoTotalizarSaldos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoTotalizarSaldos();
			}
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoTotalizarSaldos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoTotalizarSaldos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoTotalizarSaldos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoTotalizarSaldos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoTotalizarSaldos")) {
				iIndex=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTabbedPaneRelacionesProcesoTotalizarSaldos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTabbedPaneRelacionesProcesoTotalizarSaldos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoTotalizarSaldos();	
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
	
	public void cargarCombosForeignKeyProcesoTotalizarSaldos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoTotalizarSaldos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoTotalizarSaldos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoTotalizarSaldosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoTotalizarSaldos();
		
		this.cargarCombosFrameForeignKeyProcesoTotalizarSaldos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoTotalizarSaldos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoTotalizarSaldos();
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
	
	public void jButtonNuevoProcesoTotalizarSaldosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
			
			if(jTableDatosProcesoTotalizarSaldos.getRowCount()>=1) {
				jTableDatosProcesoTotalizarSaldos.removeRowSelectionInterval(0, jTableDatosProcesoTotalizarSaldos.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoTotalizarSaldos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoTotalizarSaldos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoTotalizarSaldos(true);			
			//this.procesototalizarsaldos=new ProcesoTotalizarSaldos();
			//this.procesototalizarsaldos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoTotalizarSaldos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos() ;
			
			if(ProcesoTotalizarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoTotalizarSaldos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesototalizarsaldos);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);				
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
			if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoTotalizarSaldos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoTotalizarSaldosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoTotalizarSaldos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoTotalizarSaldos.getSelectedRows().length;			
			}
			
			procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoTotalizarSaldos--;			
				//ProcesoTotalizarSaldos procesototalizarsaldosAux= new ProcesoTotalizarSaldos();			
				//procesototalizarsaldosAux.setId(this.iIdNuevoProcesoTotalizarSaldos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoTotalizarSaldos procesototalizarsaldosOrigen=new ProcesoTotalizarSaldos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoTotalizarSaldos procesototalizarsaldosOrigen : procesototalizarsaldossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesototalizarsaldosOrigen =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesototalizarsaldosOrigen =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoTotalizarSaldos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesototalizarsaldos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoTotalizarSaldos(procesototalizarsaldosOrigen,this.procesototalizarsaldos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().add(this.procesototalizarsaldosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesototalizarsaldoss.add(this.procesototalizarsaldosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
				
				this.jTableDatosProcesoTotalizarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoTotalizarSaldos(), this.getIndiceNuevoProcesoTotalizarSaldos());
				
				int iLastRow =  this.jTableDatosProcesoTotalizarSaldos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoTotalizarSaldos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoTotalizarSaldos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();									
		
			ProcesoTotalizarSaldos procesototalizarsaldosOrigen=new ProcesoTotalizarSaldos();
			ProcesoTotalizarSaldos procesototalizarsaldosDestino=new ProcesoTotalizarSaldos();
				
			procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoTotalizarSaldos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesototalizarsaldossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoTotalizarSaldos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesototalizarsaldosOrigen =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesototalizarsaldosOrigen =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesototalizarsaldosDestino =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesototalizarsaldosDestino =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesototalizarsaldosOrigen =procesototalizarsaldossSeleccionados.get(0);
				procesototalizarsaldosDestino =procesototalizarsaldossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoTotalizarSaldos(procesototalizarsaldosOrigen,procesototalizarsaldosDestino,true,false);
				
				procesototalizarsaldosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesototalizarsaldosDestino,procesototalizarsaldosLogic.getProcesoTotalizarSaldoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesototalizarsaldosDestino,procesototalizarsaldoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
				
				//this.jTableDatosProcesoTotalizarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoTotalizarSaldos(), this.getIndiceNuevoProcesoTotalizarSaldos());
				
				int iLastRow =  this.jTableDatosProcesoTotalizarSaldos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoTotalizarSaldos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoTotalizarSaldos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoTotalizarSaldos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(!isVisible);
			this.jPanelPaginacionProcesoTotalizarSaldos.setVisible(!isVisible);
			this.jPanelAccionesProcesoTotalizarSaldos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoTotalizarSaldos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoTotalizarSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoTotalizarSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoTotalizarSaldos();
			
			this.abrirFrameOrderByProcesoTotalizarSaldos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoTotalizarSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoTotalizarSaldos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoTotalizarSaldos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setSize(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.iWidthFormulario,this.jInternalFrameDetalleFormProcesoTotalizarSaldos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoTotalizarSaldos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoTotalizarSaldos.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jContentPaneDetalleProcesoTotalizarSaldos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTabbedPaneRelacionesProcesoTotalizarSaldos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jContentPaneDetalleProcesoTotalizarSaldos.getWidth(),ProcesoTotalizarSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTabbedPaneRelacionesProcesoTotalizarSaldos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jContentPaneDetalleProcesoTotalizarSaldos.getWidth(),ProcesoTotalizarSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTabbedPaneRelacionesProcesoTotalizarSaldos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jContentPaneDetalleProcesoTotalizarSaldos.getWidth(),ProcesoTotalizarSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoTotalizarSaldos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoTotalizarSaldos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoTotalizarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoTotalizarSaldos,false,this);
				} else {
					this.jInternalFrameOrderByProcesoTotalizarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoTotalizarSaldos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoTotalizarSaldos);
				this.jInternalFrameOrderByProcesoTotalizarSaldos.setVisible(false);
				this.jInternalFrameOrderByProcesoTotalizarSaldos.setSelected(false);
				
				this.jInternalFrameOrderByProcesoTotalizarSaldos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoTotalizarSaldos"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoTotalizarSaldos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoTotalizarSaldos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoTotalizarSaldos==null) {
				
				this.jInternalFrameImportacionProcesoTotalizarSaldos=new ImportacionJInternalFrame(ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoTotalizarSaldos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoTotalizarSaldos);
				this.jInternalFrameImportacionProcesoTotalizarSaldos.setVisible(false);
				this.jInternalFrameImportacionProcesoTotalizarSaldos.setSelected(false);


				this.jInternalFrameImportacionProcesoTotalizarSaldos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoTotalizarSaldos"));
				this.jInternalFrameImportacionProcesoTotalizarSaldos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoTotalizarSaldos"));
				this.jInternalFrameImportacionProcesoTotalizarSaldos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoTotalizarSaldos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoTotalizarSaldos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos==null) {
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos=new ReporteDinamicoJInternalFrame(ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos);
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoTotalizarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoTotalizarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoTotalizarSaldos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoTotalizarSaldos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoTotalizarSaldos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoTotalizarSaldos);
			
	       	this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoTotalizarSaldos.dispose();
			//this.jInternalFrameDetalleFormProcesoTotalizarSaldos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoTotalizarSaldos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoTotalizarSaldos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoTotalizarSaldos.setVisible(true);
	        this.jInternalFrameImportacionProcesoTotalizarSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoTotalizarSaldos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setVisible(true);
	        this.jInternalFrameOrderByProcesoTotalizarSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoTotalizarSaldos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoTotalizarSaldos.setVisible(false);
	        this.jInternalFrameOrderByProcesoTotalizarSaldos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoTotalizarSaldos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoTotalizarSaldos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoTotalizarSaldos.setVisible(false);
	        this.jInternalFrameImportacionProcesoTotalizarSaldos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoTotalizarSaldos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoTotalizarSaldos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoTotalizarSaldos(true);
			//this.isEsNuevoProcesoTotalizarSaldos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoTotalizarSaldos(false) ;
			
			if(procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoTotalizarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoTotalizarSaldos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoTotalizarSaldosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoTotalizarSaldos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoTotalizarSaldos(true);
			//this.isEsNuevoProcesoTotalizarSaldos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesototalizarsaldos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoTotalizarSaldos(false) ;
			
			if(ProcesoTotalizarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoTotalizarSaldos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaPeriodo(List<Periodo> periodosForeignKey)throws Exception{
		TableColumn tableColumnPeriodo=this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoTotalizarSaldos,ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO));
		TableCellEditor tableCellEditorPeriodo =tableColumnPeriodo.getCellEditor();

		PeriodoTableCell periodoTableCellFk=(PeriodoTableCell)tableCellEditorPeriodo;

		if(periodoTableCellFk!=null) {
			periodoTableCellFk.setperiodosForeignKey(periodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periodoTableCellFk.setRowActual(intSelectedRow);
			//periodoTableCellFk.setperiodosForeignKeyActual(periodosForeignKey);
		//}


		if(periodoTableCellFk!=null) {
			periodoTableCellFk.RecargarPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoTotalizarSaldos(false);
			
			//if(!this.isEsNuevoProcesoTotalizarSaldos) {								
				int intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.procesototalizarsaldos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
				
			}
			
			if(this.permiteMantenimiento(this.procesototalizarsaldos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoTotalizarSaldos=true;
					this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
					this.isEsNuevoProcesoTotalizarSaldos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoTotalizarSaldos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoTotalizarSaldos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoTotalizarSaldos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos(false);
				
				this.habilitarDeshabilitarControlesProcesoTotalizarSaldos(false);
			
												
				
				if(ProcesoTotalizarSaldosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoTotalizarSaldos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,procesototalizarsaldosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoTotalizarSaldos(this.procesototalizarsaldos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoTotalizarSaldos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesototalizarsaldosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesototalizarsaldos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				this.procesototalizarsaldos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				this.procesototalizarsaldos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesototalizarsaldos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoTotalizarSaldosModel) this.jTableDatosProcesoTotalizarSaldos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoTotalizarSaldos=true;
				this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
				this.isEsNuevoProcesoTotalizarSaldos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoTotalizarSaldos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos(false);
				
				this.habilitarDeshabilitarControlesProcesoTotalizarSaldos(false);
				
				
				
				if(ProcesoTotalizarSaldosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoTotalizarSaldos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoTotalizarSaldos.getRowCount()>=1) {
				jTableDatosProcesoTotalizarSaldos.removeRowSelectionInterval(0, jTableDatosProcesoTotalizarSaldos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoTotalizarSaldos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoTotalizarSaldos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos(false) ;
			
			this.isEsNuevoProcesoTotalizarSaldos=false;
			
			if(ProcesoTotalizarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoTotalizarSaldos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
				
				//SI ES MANUAL
				if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoTotalizarSaldos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoTotalizarSaldos--;			
			//ProcesoTotalizarSaldos procesototalizarsaldosAux= new ProcesoTotalizarSaldos();			
			//procesototalizarsaldosAux.setId(this.iIdNuevoProcesoTotalizarSaldos);
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoTotalizarSaldos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
			
			this.procesototalizarsaldos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().add(this.procesototalizarsaldosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesototalizarsaldoss.add(this.procesototalizarsaldosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
			
			this.jTableDatosProcesoTotalizarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoTotalizarSaldos(), this.getIndiceNuevoProcesoTotalizarSaldos());
			
			int iLastRow =  this.jTableDatosProcesoTotalizarSaldos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoTotalizarSaldos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoTotalizarSaldos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoTotalizarSaldos();
			}
			
			//this.abrirFrameTreeProcesoTotalizarSaldos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoTotalizarSaldos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoTotalizarSaldos.setFileImportacion(this.jInternalFrameImportacionProcesoTotalizarSaldos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoTotalizarSaldos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoTotalizarSaldos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoTotalizarSaldos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoTotalizarSaldos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();		

		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoTotalizarSaldosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoTotalizarSaldosBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoTotalizarSaldoss("Todos",procesototalizarsaldossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Totalizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();		
		
		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesototalizarsaldos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoTotalizarSaldoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ProcesoTotalizarSaldos procesototalizarsaldos:procesototalizarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesototalizarsaldos.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(ProcesoTotalizarSaldos procesototalizarsaldos:procesototalizarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesototalizarsaldos.getperiodo_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesoTotalizarSaldos(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoTotalizarSaldos(procesototalizarsaldosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Totalizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoTotalizarSaldos(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoTotalizarSaldos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoTotalizarSaldos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoTotalizarSaldos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoTotalizarSaldos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoTotalizarSaldos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoTotalizarSaldos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoTotalizarSaldos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoTotalizarSaldos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoTotalizarSaldos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoTotalizarSaldos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoTotalizarSaldos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoTotalizarSaldos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoTotalizarSaldos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoTotalizarSaldos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoTotalizarSaldos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoTotalizarSaldos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoTotalizarSaldos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoTotalizarSaldos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoTotalizarSaldos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoTotalizarSaldos();
		
		this.inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoTotalizarSaldos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoTotalizarSaldos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoTotalizarSaldos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoTotalizarSaldos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoTotalizarSaldos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jCheckBoxPostAccionNuevoProcesoTotalizarSaldos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jCheckBoxPostAccionSinCerrarProcesoTotalizarSaldos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jCheckBoxPostAccionSinMensajeProcesoTotalizarSaldos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoTotalizarSaldos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoTotalizarSaldos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
				this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jCheckBoxPostAccionNuevoProcesoTotalizarSaldos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jCheckBoxPostAccionSinCerrarProcesoTotalizarSaldos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jCheckBoxPostAccionSinMensajeProcesoTotalizarSaldos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoTotalizarSaldos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoTotalizarSaldos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoTotalizarSaldos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoTotalizarSaldos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoTotalizarSaldos() throws Exception {
		try	{
			if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoTotalizarSaldos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoTotalizarSaldos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoTotalizarSaldos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoTotalizarSaldos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoTotalizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoTotalizarSaldos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoTotalizarSaldos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.addItem(reporte);
			}
			
			
			if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoTotalizarSaldos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoTotalizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoTotalizarSaldos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoTotalizarSaldos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoTotalizarSaldos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos!=null) {
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos!=null) {
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoTotalizarSaldos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.getSelectedItem()!=null){this.id_ejercicioBusquedaPorEjercicioPorPeriodo=((Ejercicio)this.jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.getSelectedItem()!=null){this.id_periodoBusquedaPorEjercicioPorPeriodo=((Periodo)this.jComboBoxid_periodoBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoTotalizarSaldos(Boolean esInicializar) throws Exception {				
		if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoTotalizarSaldos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoTotalizarSaldos() throws Exception {
		this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoTotalizarSaldos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoTotalizarSaldosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoTotalizarSaldosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoTotalizarSaldosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoTotalizarSaldosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoTotalizarSaldosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoTotalizarSaldosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoTotalizarSaldos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesototalizarsaldoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoTotalizarSaldos.setModel(new ProcesoTotalizarSaldosModel(this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoTotalizarSaldos.setModel(new ProcesoTotalizarSaldosModel(this.procesototalizarsaldoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoTotalizarSaldos!=null && this.jInternalFrameOrderByProcesoTotalizarSaldos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoTotalizarSaldos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoTotalizarSaldos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoTotalizarSaldosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO,procesototalizarsaldosConstantesFunciones.resaltarSeleccionarProcesoTotalizarSaldos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoTotalizarSaldosConstantesFunciones.SCLASSWEBTITULO,procesototalizarsaldosConstantesFunciones.resaltarSeleccionarProcesoTotalizarSaldos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoTotalizarSaldos,ProcesoTotalizarSaldosConstantesFunciones.LABEL_ID));

		if(this.procesototalizarsaldosConstantesFunciones.mostraridProcesoTotalizarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoTotalizarSaldosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesototalizarsaldosConstantesFunciones.resaltaridProcesoTotalizarSaldos,this.procesototalizarsaldosConstantesFunciones.activaridProcesoTotalizarSaldos,this,true,"idProcesoTotalizarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesototalizarsaldosConstantesFunciones.resaltaridProcesoTotalizarSaldos,this.procesototalizarsaldosConstantesFunciones.activaridProcesoTotalizarSaldos,this,true,"idProcesoTotalizarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoTotalizarSaldos,ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.procesototalizarsaldosConstantesFunciones.mostrarid_ejercicioProcesoTotalizarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.procesototalizarsaldosConstantesFunciones.resaltarid_ejercicioProcesoTotalizarSaldos,this,this.procesototalizarsaldosConstantesFunciones.activarid_ejercicioProcesoTotalizarSaldos));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.procesototalizarsaldosConstantesFunciones.resaltarid_ejercicioProcesoTotalizarSaldos,this,this.procesototalizarsaldosConstantesFunciones.activarid_ejercicioProcesoTotalizarSaldos,false,"id_ejercicioProcesoTotalizarSaldos","GLOBAL-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoTotalizarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoTotalizarSaldos,ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO));

		if(this.procesototalizarsaldosConstantesFunciones.mostrarid_periodoProcesoTotalizarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.procesototalizarsaldosConstantesFunciones.resaltarid_periodoProcesoTotalizarSaldos,this,this.procesototalizarsaldosConstantesFunciones.activarid_periodoProcesoTotalizarSaldos));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.procesototalizarsaldosConstantesFunciones.resaltarid_periodoProcesoTotalizarSaldos,this,this.procesototalizarsaldosConstantesFunciones.activarid_periodoProcesoTotalizarSaldos,false,"id_periodoProcesoTotalizarSaldos","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoTotalizarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoTotalizarSaldos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoTotalizarSaldos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoTotalizarSaldos.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoTotalizarSaldos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoTotalizarSaldos.moveColumn(this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoTotalizarSaldos.moveColumn(this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoTotalizarSaldos.moveColumn(this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoTotalizarSaldos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoTotalizarSaldos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoTotalizarSaldos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoTotalizarSaldos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoTotalizarSaldos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoTotalizarSaldos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesototalizarsaldoss.size()-1;
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
		//this.jTableDatosProcesoTotalizarSaldos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoTotalizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoTotalizarSaldos();
			
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
				
				//this.isEsNuevoProcesoTotalizarSaldos=false;
					
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
				if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoTotalizarSaldos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesototalizarsaldos.getsType().equals("DUPLICADO")
				   || this.procesototalizarsaldos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoTotalizarSaldos=true;
				
				} else {
					this.isEsNuevoProcesoTotalizarSaldos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
					if(this.procesototalizarsaldos.getId()>=0 && !this.procesototalizarsaldos.getIsNew()) {						
						this.isEsNuevoProcesoTotalizarSaldos=false;
						
					} else {
						this.isEsNuevoProcesoTotalizarSaldos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoTotalizarSaldos(esRelaciones);						
				
				this.seleccionarProcesoTotalizarSaldos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesototalizarsaldos.getId()<0) {
					this.isEsNuevoProcesoTotalizarSaldos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoTotalizarSaldos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoTotalizarSaldos(evt,rowIndex);
				}	
				
				if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoTotalizarSaldos: " + this.dDif); 
					}
				}								
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoTotalizarSaldos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesototalizarsaldos)) {
					if(this.procesototalizarsaldos.getId()>0) {
						this.procesototalizarsaldos.setIsDeleted(true);
						
						this.procesototalizarsaldossEliminados.add(this.procesototalizarsaldos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().remove(this.procesototalizarsaldos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesototalizarsaldoss.remove(this.procesototalizarsaldos);				
					}
					
					
					((ProcesoTotalizarSaldosModel) this.jTableDatosProcesoTotalizarSaldos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoTotalizarSaldos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoTotalizarSaldos) {
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoTotalizarSaldos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoTotalizarSaldos(this.procesototalizarsaldos);
				}
				
				//ARCHITECTURE
				try {
					

					//Ejercicio
					if(!this.procesototalizarsaldosConstantesFunciones.cargarid_ejercicioProcesoTotalizarSaldos || this.procesototalizarsaldosConstantesFunciones.event_dependid_ejercicioProcesoTotalizarSaldos) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.procesototalizarsaldos.getid_ejercicio());
									//this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(procesototalizarsaldos.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(procesototalizarsaldos.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.procesototalizarsaldos.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.procesototalizarsaldosConstantesFunciones.cargarid_periodoProcesoTotalizarSaldos || this.procesototalizarsaldosConstantesFunciones.event_dependid_periodoProcesoTotalizarSaldos) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.procesototalizarsaldos.getid_periodo());
									//this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(procesototalizarsaldos.getPeriodo()!=null) {
							this.periodosForeignKey.add(procesototalizarsaldos.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.procesototalizarsaldos.getid_periodo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoTotalizarSaldos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoTotalizarSaldos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoTotalizarSaldos(procesototalizarsaldos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoTotalizarSaldos(procesototalizarsaldos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoTotalizarSaldos(procesototalizarsaldos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoTotalizarSaldos(procesototalizarsaldos);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.setText(procesototalizarsaldos.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoTotalizarSaldos procesototalizarsaldosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesototalizarsaldosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoTotalizarSaldos procesototalizarsaldosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesototalizarsaldosLocal=this.procesototalizarsaldos;
			} else {
				procesototalizarsaldosLocal=this.procesototalizarsaldosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesototalizarsaldosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoTotalizarSaldos(procesototalizarsaldosLocal,true);
					
					if(procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesototalizarsaldosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesototalizarsaldosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(procesototalizarsaldos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(procesototalizarsaldos);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(procesototalizarsaldos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.getText()==null || this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.getText()=="" || this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.setText("0");
			}

			if(conColumnasBase) {procesototalizarsaldos.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoTotalizarSaldosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelIdProcesoTotalizarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldosBean,ProcesoTotalizarSaldos procesototalizarsaldos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldosOrigen,ProcesoTotalizarSaldos procesototalizarsaldos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesototalizarsaldosOrigen.getId()!=null && !procesototalizarsaldosOrigen.getId().equals(0L))) {procesototalizarsaldos.setId(procesototalizarsaldosOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.setText(procesototalizarsaldos.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoTotalizarSaldos(ProcesoTotalizarSaldosBean procesototalizarsaldosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.setText(procesototalizarsaldosBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoTotalizarSaldos(ProcesoTotalizarSaldosParameterReturnGeneral procesototalizarsaldosReturnGeneral,ProcesoTotalizarSaldosBean procesototalizarsaldosBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoTotalizarSaldos procesototalizarsaldosLocal=new ProcesoTotalizarSaldos();
			
			procesototalizarsaldosLocal=procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesototalizarsaldosLocal.getId()!=null && !procesototalizarsaldosLocal.getId().equals(0L))) {procesototalizarsaldosBean.setId(procesototalizarsaldosLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoTotalizarSaldosGenerico(Long idProcesoTotalizarSaldosSeleccionado,JComboBox jComboBoxProcesoTotalizarSaldos,List<ProcesoTotalizarSaldos> procesototalizarsaldossLocal)throws Exception {
		try {
			ProcesoTotalizarSaldos  procesototalizarsaldosTemp=null;

			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldossLocal) {
				if(procesototalizarsaldosAux.getId()!=null && procesototalizarsaldosAux.getId().equals(idProcesoTotalizarSaldosSeleccionado)) {
					procesototalizarsaldosTemp=procesototalizarsaldosAux;
					break;
				}
			}

			jComboBoxProcesoTotalizarSaldos.setSelectedItem(procesototalizarsaldosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoTotalizarSaldosGenerico(JComboBox jComboBoxProcesoTotalizarSaldos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoTotalizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoTotalizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoTotalizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoTotalizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoTotalizarSaldos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoTotalizarSaldos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoTotalizarSaldos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoTotalizarSaldos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoTotalizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoTotalizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesototalizarsaldos=(ProcesoTotalizarSaldos) procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesototalizarsaldos =(ProcesoTotalizarSaldos) procesototalizarsaldoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!procesototalizarsaldos.getIsNew() && !procesototalizarsaldos.getIsChanged() && !procesototalizarsaldos.getIsDeleted()) {
				sDescripcion=procesototalizarsaldos.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=procesototalizarsaldos.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!procesototalizarsaldos.getIsNew() && !procesototalizarsaldos.getIsChanged() && !procesototalizarsaldos.getIsDeleted()) {
				sDescripcion=procesototalizarsaldos.getperiodo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=procesototalizarsaldos.getperiodo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoTotalizarSaldos procesototalizarsaldosRow=new ProcesoTotalizarSaldos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesototalizarsaldosRow=(ProcesoTotalizarSaldos) procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesototalizarsaldosRow=(ProcesoTotalizarSaldos) procesototalizarsaldoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos && this.isPermisoNuevoProcesoTotalizarSaldos));			
			this.jButtonDuplicarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaDuplicarProcesoTotalizarSaldos && this.isPermisoDuplicarProcesoTotalizarSaldos));			
			this.jButtonCopiarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaCopiarProcesoTotalizarSaldos && this.isPermisoCopiarProcesoTotalizarSaldos));
			this.jButtonVerFormProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaVerFormProcesoTotalizarSaldos && this.isPermisoVerFormProcesoTotalizarSaldos));
			
			this.jButtonAbrirOrderByProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoTotalizarSaldos && this.isPermisoOrdenProcesoTotalizarSaldos));			
			
			this.jButtonNuevoRelacionesProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos && this.isPermisoNuevoProcesoTotalizarSaldos));			
			this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos && this.isPermisoNuevoProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonModificarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaModificarProcesoTotalizarSaldos && this.isPermisoActualizarProcesoTotalizarSaldos));	
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos && this.isPermisoActualizarProcesoTotalizarSaldos));	
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos && this.isPermisoEliminarProcesoTotalizarSaldos));
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarProcesoTotalizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos);							
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos && this.isPermisoNuevoProcesoTotalizarSaldos));						
			this.jButtonDuplicarToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaDuplicarProcesoTotalizarSaldos && this.isPermisoDuplicarProcesoTotalizarSaldos));						
			this.jButtonCopiarToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaCopiarProcesoTotalizarSaldos && this.isPermisoCopiarProcesoTotalizarSaldos));			
			this.jButtonVerFormToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaVerFormProcesoTotalizarSaldos && this.isPermisoVerFormProcesoTotalizarSaldos));			
			this.jButtonAbrirOrderByToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoTotalizarSaldos && this.isPermisoOrdenProcesoTotalizarSaldos));
			this.jButtonNuevoRelacionesToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos && this.isPermisoNuevoProcesoTotalizarSaldos));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos && this.isPermisoNuevoProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));			
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonModificarToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaModificarProcesoTotalizarSaldos && this.isPermisoActualizarProcesoTotalizarSaldos));	
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos  && this.isPermisoActualizarProcesoTotalizarSaldos));	
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos && this.isPermisoEliminarProcesoTotalizarSaldos));
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarToolBarProcesoTotalizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos);				
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos && this.isPermisoNuevoProcesoTotalizarSaldos));			
			this.jMenuItemDuplicarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaDuplicarProcesoTotalizarSaldos && this.isPermisoDuplicarProcesoTotalizarSaldos));			
			this.jMenuItemCopiarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaCopiarProcesoTotalizarSaldos && this.isPermisoCopiarProcesoTotalizarSaldos));			
			this.jMenuItemVerFormProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaVerFormProcesoTotalizarSaldos && this.isPermisoVerFormProcesoTotalizarSaldos));			
			this.jMenuItemAbrirOrderByProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoTotalizarSaldos && this.isPermisoOrdenProcesoTotalizarSaldos));			
			//this.jMenuItemMostrarOcultarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoTotalizarSaldos && this.isPermisoOrdenProcesoTotalizarSaldos));
			this.jMenuItemDetalleAbrirOrderByProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoTotalizarSaldos && this.isPermisoOrdenProcesoTotalizarSaldos));			
			//this.jMenuItemDetalleMostrarOcultarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoTotalizarSaldos && this.isPermisoOrdenProcesoTotalizarSaldos));			
			this.jMenuItemNuevoRelacionesProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos && this.isPermisoNuevoProcesoTotalizarSaldos));			
			this.jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos && this.isPermisoNuevoProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));									
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemModificarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaModificarProcesoTotalizarSaldos && this.isPermisoActualizarProcesoTotalizarSaldos));	
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemActualizarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos && this.isPermisoActualizarProcesoTotalizarSaldos));	
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemEliminarProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos && this.isPermisoEliminarProcesoTotalizarSaldos));
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemCancelarProcesoTotalizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos);				
			}
			
			this.jMenuItemGuardarCambiosProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));						
			this.jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=this.jButtonNuevoProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoTotalizarSaldos=this.jButtonDuplicarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaCopiarProcesoTotalizarSaldos=this.jButtonCopiarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaVerFormProcesoTotalizarSaldos=this.jButtonVerFormProcesoTotalizarSaldos.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoTotalizarSaldos=this.jButtonAbrirOrderByProcesoTotalizarSaldos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=this.jButtonNuevoRelacionesProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=this.jButtonModificarProcesoTotalizarSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosProcesoTotalizarSaldos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=this.jButtonNuevoToolBarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=this.jButtonNuevoRelacionesToolBarProcesoTotalizarSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonModificarToolBarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarToolBarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarToolBarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarToolBarProcesoTotalizarSaldos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=this.jButtonGuardarCambiosToolBarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=this.jButtonGuardarCambiosTablaToolBarProcesoTotalizarSaldos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=this.jMenuItemNuevoProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=this.jMenuItemNuevoRelacionesProcesoTotalizarSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemModificarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemActualizarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemEliminarProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemCancelarProcesoTotalizarSaldos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=this.jMenuItemGuardarCambiosProcesoTotalizarSaldos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=this.jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoTotalizarSaldos(Boolean esInicializar) {
		if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
				//if(this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoTotalizarSaldos();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoTotalizarSaldos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoTotalizarSaldos() {
		this.jButtonNuevoProcesoTotalizarSaldos.setVisible(this.isPermisoNuevoProcesoTotalizarSaldos);			
		this.jButtonDuplicarProcesoTotalizarSaldos.setVisible(this.isPermisoDuplicarProcesoTotalizarSaldos);			
		this.jButtonCopiarProcesoTotalizarSaldos.setVisible(this.isPermisoCopiarProcesoTotalizarSaldos);			
		this.jButtonVerFormProcesoTotalizarSaldos.setVisible(this.isPermisoVerFormProcesoTotalizarSaldos);			
		
		this.jButtonAbrirOrderByProcesoTotalizarSaldos.setVisible(this.isPermisoOrdenProcesoTotalizarSaldos);					
		
		this.jButtonNuevoRelacionesProcesoTotalizarSaldos.setVisible(this.isPermisoNuevoProcesoTotalizarSaldos);			
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonModificarProcesoTotalizarSaldos.setVisible(this.isPermisoActualizarProcesoTotalizarSaldos);	
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarProcesoTotalizarSaldos.setVisible(this.isPermisoActualizarProcesoTotalizarSaldos);	
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarProcesoTotalizarSaldos.setVisible(this.isPermisoEliminarProcesoTotalizarSaldos);
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarProcesoTotalizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos);						
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosProcesoTotalizarSaldos.setVisible(this.isPermisoGuardarCambiosProcesoTotalizarSaldos);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.setVisible(this.isPermisoActualizarProcesoTotalizarSaldos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoTotalizarSaldos() {
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonModificarProcesoTotalizarSaldos.setVisible(this.isPermisoActualizarProcesoTotalizarSaldos);	
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarProcesoTotalizarSaldos.setVisible(this.isPermisoActualizarProcesoTotalizarSaldos);	
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarProcesoTotalizarSaldos.setVisible(this.isPermisoEliminarProcesoTotalizarSaldos);
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarProcesoTotalizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos);							
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosProcesoTotalizarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos && this.isPermisoGuardarCambiosProcesoTotalizarSaldos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoTotalizarSaldos() {
		if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoTotalizarSaldos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoTotalizarSaldos() {
	}
	
	public void jTableDatosProcesoTotalizarSaldosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoTotalizarSaldos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoTotalizarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.getprocesototalizarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesototalizarsaldos==null) {
						this.procesototalizarsaldos = new ProcesoTotalizarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.procesototalizarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
				}

				if(this.procesototalizarsaldos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesototalizarsaldos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioProcesoTotalizarSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebProcesoTotalizarSaldos(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoTotalizarSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoTotalizarSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.getprocesototalizarsaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.procesototalizarsaldosLogic.getConnexion());

				if(this.procesototalizarsaldos.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.procesototalizarsaldos.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoTotalizarSaldos=(TitledBorder)this.jScrollPanelDatosProcesoTotalizarSaldos.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderProcesoTotalizarSaldos.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioProcesoTotalizarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.getprocesototalizarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesototalizarsaldos==null) {
						this.procesototalizarsaldos = new ProcesoTotalizarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.procesototalizarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
				}

				if(this.procesototalizarsaldos.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.procesototalizarsaldos.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoProcesoTotalizarSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebProcesoTotalizarSaldos(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoTotalizarSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoTotalizarSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.getprocesototalizarsaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.procesototalizarsaldosLogic.getConnexion());

				if(this.procesototalizarsaldos.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.procesototalizarsaldos.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoTotalizarSaldos=(TitledBorder)this.jScrollPanelDatosProcesoTotalizarSaldos.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderProcesoTotalizarSaldos.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoProcesoTotalizarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.getprocesototalizarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesototalizarsaldos==null) {
						this.procesototalizarsaldos = new ProcesoTotalizarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.procesototalizarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);
				}

				if(this.procesototalizarsaldos.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.procesototalizarsaldos.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);

			this.getProcesoTotalizarSaldossBusquedaPorEjercicioPorPeriodo();

			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);

			//if(ProcesoTotalizarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);

			this.getProcesoTotalizarSaldossFK_IdEjercicio();

			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);

			//if(ProcesoTotalizarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoProcesoTotalizarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);

			this.getProcesoTotalizarSaldossFK_IdPeriodo();

			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);

			//if(ProcesoTotalizarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesototalizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoTotalizarSaldos() {
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.dispose();
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos!=null) {
			this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.dispose();
			this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos=null;
		}
		
		if(this.jInternalFrameImportacionProcesoTotalizarSaldos!=null) {
			this.jInternalFrameImportacionProcesoTotalizarSaldos.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoTotalizarSaldos.dispose();
			this.jInternalFrameImportacionProcesoTotalizarSaldos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoTotalizarSaldos();
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoTotalizarSaldos")) {
				jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoTotalizarSaldos")) {
				jButtonDuplicarProcesoTotalizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoTotalizarSaldos")) {
				jButtonCopiarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoTotalizarSaldos")) {
				jButtonVerFormProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoTotalizarSaldos")) {
				jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoTotalizarSaldos")) {
				jButtonDuplicarProcesoTotalizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoTotalizarSaldos")) {
				jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoTotalizarSaldos")) {
				jButtonDuplicarProcesoTotalizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoTotalizarSaldos")) {
				jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoTotalizarSaldos")) {
				jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoTotalizarSaldos")) {
				jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoTotalizarSaldos")) {
				jButtonModificarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoTotalizarSaldos")) {
				jButtonModificarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoTotalizarSaldos")) {
				jButtonModificarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoTotalizarSaldos")) {
				jButtonActualizarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoTotalizarSaldos")) {
				jButtonActualizarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoTotalizarSaldos")) {
				jButtonActualizarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoTotalizarSaldos")) {
				jButtonEliminarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoTotalizarSaldos")) {
				jButtonEliminarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoTotalizarSaldos")) {
				jButtonEliminarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoTotalizarSaldos")) {
				jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoTotalizarSaldos")) {
				jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoTotalizarSaldos")) {
				jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoTotalizarSaldos")) {
				jButtonCerrarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoTotalizarSaldos")) {
				jButtonCerrarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoTotalizarSaldos")) {
				jButtonCerrarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoTotalizarSaldos")) {
				jButtonMostrarOcultarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoTotalizarSaldos")) {
				jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoTotalizarSaldos")) {
				jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoTotalizarSaldos")) {
				jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoTotalizarSaldos")) {
				jButtonCopiarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoTotalizarSaldos")) {
				jButtonVerFormProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoTotalizarSaldos")) {
				jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoTotalizarSaldos")) {
				jButtonCopiarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoTotalizarSaldos")) {
				jButtonVerFormProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoTotalizarSaldos")) {
				jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoTotalizarSaldos")) {
				jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoTotalizarSaldos")) {
				jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoTotalizarSaldos")) {
				jButtonRecargarInformacionProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoTotalizarSaldos")) {
				jButtonRecargarInformacionProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoTotalizarSaldos")) {
				jButtonRecargarInformacionProcesoTotalizarSaldosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoTotalizarSaldos")) {
				jButtonAnterioresProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoTotalizarSaldos")) {
				jButtonAnterioresProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoTotalizarSaldos")) {
				jButtonAnterioresProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoTotalizarSaldos")) {
				jButtonSiguientesProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoTotalizarSaldos")) {
				jButtonSiguientesProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoTotalizarSaldos")) {
				jButtonSiguientesProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoTotalizarSaldos") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoTotalizarSaldos")) {
				jButtonAbrirOrderByProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoTotalizarSaldos") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoTotalizarSaldos")) {
				jButtonMostrarOcultarProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoTotalizarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoTotalizarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoTotalizarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoTotalizarSaldos")) {
				jButtonProcesarInformacionProcesoTotalizarSaldosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoTotalizarSaldos")) {
				jButtonCerrarReporteDinamicoProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoTotalizarSaldos")) {
				jButtonGenerarReporteDinamicoProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoTotalizarSaldos")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoTotalizarSaldos")) {
				jButtonCerrarImportacionProcesoTotalizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoTotalizarSaldos")) {
				
				jButtonGenerarImportacionProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoTotalizarSaldos")) {
				
				jButtonAbrirImportacionProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoTotalizarSaldos")) {
				jComboBoxTiposAccionesProcesoTotalizarSaldosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoTotalizarSaldos")) {
				jComboBoxTiposRelacionesProcesoTotalizarSaldosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoTotalizarSaldos")) {
				jComboBoxTiposAccionesProcesoTotalizarSaldosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoTotalizarSaldos")) {
				
				jComboBoxTiposSeleccionarProcesoTotalizarSaldosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoTotalizarSaldos")) {
				jTextFieldValorCampoGeneralProcesoTotalizarSaldosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoTotalizarSaldos")) {
				jButtonAbrirOrderByProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoTotalizarSaldos")) {
				jButtonAbrirOrderByProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoTotalizarSaldos")) {
				jButtonCerrarOrderByProcesoTotalizarSaldosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoTotalizarSaldosBusqueda")) {
				this.jButtonidProcesoTotalizarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoTotalizarSaldosUpdate")) {
				this.jButtonid_ejercicioProcesoTotalizarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoTotalizarSaldosBusqueda")) {
				this.jButtonid_ejercicioProcesoTotalizarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoProcesoTotalizarSaldosUpdate")) {
				this.jButtonid_periodoProcesoTotalizarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoProcesoTotalizarSaldosBusqueda")) {
				this.jButtonid_periodoProcesoTotalizarSaldosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos")) {
				this.jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldosActionPerformed(evt);
			}
			
			;
			
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoTotalizarSaldos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				


				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoTotalizarSaldos procesototalizarsaldosLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesototalizarsaldosLocal=this.procesototalizarsaldos;
			} else {
				procesototalizarsaldosLocal=this.procesototalizarsaldosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
							
				
				


				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
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
			
			


			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
								
						
				


				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
								
				
				


				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
							
				
				


				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
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
			
			


			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
								
				
				


				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoTotalizarSaldos")) {
					jCheckBoxSeleccionarTodosProcesoTotalizarSaldosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoTotalizarSaldos")) {
					jCheckBoxSeleccionadosProcesoTotalizarSaldosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoTotalizarSaldos")) {
					
				}
				
				


				
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
												
				
				


				
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
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
			
			


			if(sTipo.equals("id_ejercicioProcesoTotalizarSaldos")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos;
				}

				if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoTotalizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoTotalizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoTotalizarSaldos(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,"BusquedaPorEjercicioPorPeriodo");
				//recargarFormProcesoTotalizarSaldosEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,"BusquedaPorEjercicioPorPeriodo");
			}
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_ejercicioProcesoTotalizarSaldos")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos;
				}

				if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoTotalizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoTotalizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoTotalizarSaldos(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,"BusquedaPorEjercicioPorPeriodo");
				//recargarFormProcesoTotalizarSaldosEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,"BusquedaPorEjercicioPorPeriodo");
			}
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesototalizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesototalizarsaldos);
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
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
				
				


			if(sTipo.equals("id_ejercicioProcesoTotalizarSaldos")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos;
				}

				if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoTotalizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoTotalizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoTotalizarSaldos(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,"BusquedaPorEjercicioPorPeriodo");
				//recargarFormProcesoTotalizarSaldosEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos,"BusquedaPorEjercicioPorPeriodo");
			}
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoTotalizarSaldos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoTotalizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoTotalizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesototalizarsaldosAnterior =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoTotalizarSaldos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoTotalizarSaldosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoTotalizarSaldos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesototalizarsaldos =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesototalizarsaldos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoTotalizarSaldos")) {
				
				}
				
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoTotalizarSaldos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoTotalizarSaldos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoTotalizarSaldos")) {
			
			}
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoTotalizarSaldos();
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoTotalizarSaldos")) {
				jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoTotalizarSaldos")) {
				jButtonDuplicarProcesoTotalizarSaldosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoTotalizarSaldos")) {
				jButtonCopiarProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoTotalizarSaldos")) {
				jButtonVerFormProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoTotalizarSaldos")) {
				jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoTotalizarSaldos")) {
				jButtonModificarProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoTotalizarSaldos")) {
				jButtonActualizarProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoTotalizarSaldos")) {
				jButtonEliminarProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoTotalizarSaldos")) {
				jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoTotalizarSaldos")) {
				jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoTotalizarSaldos")) {
				jButtonCerrarProcesoTotalizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoTotalizarSaldos")) {
				jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoTotalizarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoTotalizarSaldos")) {
				jButtonAbrirOrderByProcesoTotalizarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoTotalizarSaldos")) {
				jButtonRecargarInformacionProcesoTotalizarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoTotalizarSaldos")) {
				jButtonAnterioresProcesoTotalizarSaldosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoTotalizarSaldos")) {
				jButtonSiguientesProcesoTotalizarSaldosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoTotalizarSaldosBusqueda")) {
				this.jButtonidProcesoTotalizarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoTotalizarSaldosUpdate")) {
				this.jButtonid_ejercicioProcesoTotalizarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoTotalizarSaldosBusqueda")) {
				this.jButtonid_ejercicioProcesoTotalizarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoProcesoTotalizarSaldosUpdate")) {
				this.jButtonid_periodoProcesoTotalizarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoProcesoTotalizarSaldosBusqueda")) {
				this.jButtonid_periodoProcesoTotalizarSaldosBusquedaActionPerformed(evt);
			}
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoTotalizarSaldos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoTotalizarSaldos")) {
				closingInternalFrameProcesoTotalizarSaldos();
				
			} else if(sTipo.equals("jButtonCancelarProcesoTotalizarSaldos")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoTotalizarSaldos = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoTotalizarSaldosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoTotalizarSaldosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoTotalizarSaldos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoTotalizarSaldosActionPerformed(null);
			}
			
			ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesototalizarsaldos,new Object(),this.procesototalizarsaldosParameterGeneral,this.procesototalizarsaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoTotalizarSaldos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoTotalizarSaldos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoTotalizarSaldos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesototalizarsaldos)) {
			if(!esControlTabla) {
				if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.procesototalizarsaldos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);			
				}
				
				if(this.procesototalizarsaldosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoTotalizarSaldos(this.procesototalizarsaldos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoTotalizarSaldos(this.procesototalizarsaldosReturnGeneral,this.procesototalizarsaldosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesototalizarsaldosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoTotalizarSaldos(classes,this.procesototalizarsaldosReturnGeneral,this.procesototalizarsaldosBean,false);
					}
						
					if(this.procesototalizarsaldosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoTotalizarSaldos(this.procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoTotalizarSaldos(this.procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldos());	
					}
						
					if(this.procesototalizarsaldosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoTotalizarSaldos(this.procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldos(),classes);//this.procesototalizarsaldosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoTotalizarSaldos(this.procesototalizarsaldos,classes);//this.procesototalizarsaldosBean);									
				}
			
				if(ProcesoTotalizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoTotalizarSaldos(this.procesototalizarsaldos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoTotalizarSaldos(this.procesototalizarsaldos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesototalizarsaldosAnterior!=null) {
						this.procesototalizarsaldos=this.procesototalizarsaldosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesototalizarsaldosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldos(),procesototalizarsaldosLogic.getProcesoTotalizarSaldoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldos(),this.procesototalizarsaldoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoTotalizarSaldos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoTotalizarSaldos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoTotalizarSaldos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoTotalizarSaldos() throws Exception {
		
		ProcesoTotalizarSaldosModel procesototalizarsaldosModel=(ProcesoTotalizarSaldosModel)this.jTableDatosProcesoTotalizarSaldos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesototalizarsaldosModel.procesototalizarsaldoss=this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesototalizarsaldosModel.procesototalizarsaldoss=this.procesototalizarsaldoss;
		}
		
		
		((ProcesoTotalizarSaldosModel) this.jTableDatosProcesoTotalizarSaldos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoTotalizarSaldos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesototalizarsaldosAnterior(),this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesototalizarsaldosAnterior(),this.procesototalizarsaldoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoTotalizarSaldos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
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
										
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesototalizarsaldos,new Object(),generalEntityParameterGeneral,this.procesototalizarsaldosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoTotalizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoTotalizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoTotalizarSaldosConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoTotalizarSaldos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoTotalizarSaldos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesototalizarsaldos,new Object(),generalEntityParameterGeneral,this.procesototalizarsaldosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoTotalizarSaldos(ProcesoTotalizarSaldosBean procesototalizarsaldosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoTotalizarSaldos(ArrayList<Classe> classes,ProcesoTotalizarSaldosReturnGeneral procesototalizarsaldosReturnGeneral,ProcesoTotalizarSaldosBean procesototalizarsaldosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesototalizarsaldos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos = new ProcesoTotalizarSaldosDetalleFormJInternalFrame(jDesktopPane,this.procesototalizarsaldosSessionBean.getConGuardarRelaciones(),this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoTotalizarSaldos);
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setVisible(false);
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.procesototalizarsaldosLogic=this.procesototalizarsaldosLogic;
		
		this.cargarCombosFrameForeignKeyProcesoTotalizarSaldos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoTotalizarSaldos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoTotalizarSaldos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoTotalizarSaldos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoTotalizarSaldos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoTotalizarSaldos"));
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonModificarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"ModificarProcesoTotalizarSaldos"));

		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonModificarToolBarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoTotalizarSaldos"));
					
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemModificarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoTotalizarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoTotalizarSaldos"));
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarToolBarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoTotalizarSaldos"));
						
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemActualizarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoTotalizarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"EliminarProcesoTotalizarSaldos"));
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoTotalizarSaldos"));
								
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemEliminarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoTotalizarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"CancelarProcesoTotalizarSaldos"));
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoTotalizarSaldos"));
					
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemCancelarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoTotalizarSaldos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemDetalleCerrarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoTotalizarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoTotalizarSaldos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoTotalizarSaldos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoTotalizarSaldos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonidProcesoTotalizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoTotalizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_ejercicioProcesoTotalizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoTotalizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoTotalizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_periodoProcesoTotalizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoTotalizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_periodoProcesoTotalizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoTotalizarSaldosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTabbedPaneRelacionesProcesoTotalizarSaldos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoTotalizarSaldos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoTotalizarSaldos"));
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoTotalizarSaldos"));
		}
		
		this.jTableDatosProcesoTotalizarSaldos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoTotalizarSaldos"));
		
		this.jTableDatosProcesoTotalizarSaldos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoTotalizarSaldos"));
		
		this.jButtonNuevoProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"NuevoProcesoTotalizarSaldos"));
		
		this.jButtonDuplicarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"DuplicarProcesoTotalizarSaldos"));
		
		this.jButtonCopiarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"CopiarProcesoTotalizarSaldos"));
		
		this.jButtonVerFormProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"VerFormProcesoTotalizarSaldos"));
		
		
		this.jButtonNuevoToolBarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoTotalizarSaldos"));
			
		this.jButtonDuplicarToolBarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoTotalizarSaldos"));
			
		this.jMenuItemNuevoProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoTotalizarSaldos"));
			
		this.jMenuItemDuplicarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoTotalizarSaldos"));		
		
		
		this.jButtonNuevoRelacionesProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoTotalizarSaldos"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoTotalizarSaldos"));
			
		this.jMenuItemNuevoRelacionesProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoTotalizarSaldos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonModificarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"ModificarProcesoTotalizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonModificarToolBarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoTotalizarSaldos"));
			
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemModificarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoTotalizarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoTotalizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonActualizarToolBarProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoTotalizarSaldos"));
				
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemActualizarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoTotalizarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"EliminarProcesoTotalizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonEliminarToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoTotalizarSaldos"));
						
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemEliminarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoTotalizarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"CancelarProcesoTotalizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonCancelarToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoTotalizarSaldos"));
			
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemCancelarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoTotalizarSaldos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoTotalizarSaldos"));		
		
		
		this.jButtonCerrarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"CerrarProcesoTotalizarSaldos"));
		
		
		this.jButtonCerrarToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoTotalizarSaldos"));
			
		this.jMenuItemCerrarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoTotalizarSaldos"));
			
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jMenuItemDetalleCerrarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoTotalizarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoTotalizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoTotalizarSaldos"));
		}
		
		this.jButtonCopiarToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoTotalizarSaldos"));
			
		this.jButtonVerFormToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoTotalizarSaldos"));
		
		this.jMenuItemGuardarCambiosProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoTotalizarSaldos"));
			
		this.jMenuItemCopiarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoTotalizarSaldos"));		
		
		this.jMenuItemVerFormProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoTotalizarSaldos"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoTotalizarSaldos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoTotalizarSaldos"));
			
		this.jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoTotalizarSaldos"));		
		
		
		
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoTotalizarSaldos"));
					
		this.jButtonRecargarInformacionToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoTotalizarSaldos"));
		
		this.jMenuItemRecargarInformacionProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoTotalizarSaldos"));		
		
		
		
		this.jButtonAnterioresProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"AnterioresProcesoTotalizarSaldos"));
		
		
		this.jButtonAnterioresToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoTotalizarSaldos"));
		
		this.jMenuItemAnterioresProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoTotalizarSaldos"));		
		
		
		this.jButtonSiguientesProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"SiguientesProcesoTotalizarSaldos"));
		
		
		this.jButtonSiguientesToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoTotalizarSaldos"));
			
		this.jMenuItemSiguientesProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoTotalizarSaldos"));
			
		this.jMenuItemAbrirOrderByProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoTotalizarSaldos"));
			
		this.jMenuItemMostrarOcultarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoTotalizarSaldos"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoTotalizarSaldos"));
			
		this.jMenuItemDetalleMostarOcultarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoTotalizarSaldos"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoTotalizarSaldos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoTotalizarSaldos"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoTotalizarSaldos"));		
		
		
		this.jButtonProcesarInformacionProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoTotalizarSaldos"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoTotalizarSaldos"));

		this.jCheckBoxSeleccionadosProcesoTotalizarSaldos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoTotalizarSaldos"));
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoTotalizarSaldos"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoTotalizarSaldos"));
			
		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoTotalizarSaldos"));
					
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoTotalizarSaldos"));
			
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoTotalizarSaldos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonidProcesoTotalizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoTotalizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_ejercicioProcesoTotalizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoTotalizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoTotalizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_periodoProcesoTotalizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoTotalizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_periodoProcesoTotalizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoTotalizarSaldosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"BusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos!=null) {
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoTotalizarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoTotalizarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoTotalizarSaldos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoTotalizarSaldos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoTotalizarSaldos"));				
			//this.jButtonGenerarReporteDinamicoProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoTotalizarSaldos"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoTotalizarSaldos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoTotalizarSaldos!=null) {
				this.jInternalFrameImportacionProcesoTotalizarSaldos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoTotalizarSaldos"));
				this.jInternalFrameImportacionProcesoTotalizarSaldos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoTotalizarSaldos"));
				this.jInternalFrameImportacionProcesoTotalizarSaldos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoTotalizarSaldos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoTotalizarSaldos"));
			
			this.jButtonAbrirOrderByToolBarProcesoTotalizarSaldos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoTotalizarSaldos"));			
			
			if(this.jInternalFrameOrderByProcesoTotalizarSaldos!=null) {
				this.jInternalFrameOrderByProcesoTotalizarSaldos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoTotalizarSaldos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jTabbedPaneRelacionesProcesoTotalizarSaldos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoTotalizarSaldos"));
		
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
            		closingInternalFrameProcesoTotalizarSaldos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoTotalizarSaldos = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoTotalizarSaldosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoTotalizarSaldosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoTotalizarSaldos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoTotalizarSaldosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoTotalizarSaldos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoTotalizarSaldosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoTotalizarSaldos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoTotalizarSaldos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoTotalizarSaldos";
		inputMap = this.jButtonNuevoProcesoTotalizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoTotalizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoTotalizarSaldos";
		inputMap = this.jButtonNuevoRelacionesProcesoTotalizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoTotalizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoTotalizarSaldosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoTotalizarSaldos";
		inputMap = this.jButtonModificarProcesoTotalizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoTotalizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoTotalizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoTotalizarSaldos";
		inputMap = this.jButtonActualizarProcesoTotalizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoTotalizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoTotalizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoTotalizarSaldos";
		inputMap = this.jButtonEliminarProcesoTotalizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoTotalizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoTotalizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoTotalizarSaldos";
		inputMap = this.jButtonCancelarProcesoTotalizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoTotalizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoTotalizarSaldos";
		inputMap = this.jButtonCerrarProcesoTotalizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoTotalizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoTotalizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoTotalizarSaldos";
		inputMap = this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosProcesoTotalizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonGuardarCambiosProcesoTotalizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoTotalizarSaldos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoTotalizarSaldosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoTotalizarSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoTotalizarSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoTotalizarSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoTotalizarSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonidProcesoTotalizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoTotalizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_ejercicioProcesoTotalizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoTotalizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_ejercicioProcesoTotalizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoTotalizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_periodoProcesoTotalizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoTotalizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jButtonid_periodoProcesoTotalizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoTotalizarSaldosBusqueda"));
		
		
		this.jButtonBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos.addActionListener(new ButtonActionListener(this,"BusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoTotalizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoTotalizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoTotalizarSaldosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoTotalizarSaldos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoTotalizarSaldos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
					procesototalizarsaldosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldoss) {
					procesototalizarsaldosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoTotalizarSaldosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
						procesototalizarsaldosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldoss) {
						procesototalizarsaldosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoTotalizarSaldos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoTotalizarSaldos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoTotalizarSaldos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoTotalizarSaldosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoTotalizarSaldos.getSelectedRows();
			
			ProcesoTotalizarSaldos procesototalizarsaldosLocal=new ProcesoTotalizarSaldos();
			
			//this.seleccionarTodosProcesoTotalizarSaldos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesototalizarsaldosLocal =(ProcesoTotalizarSaldos) this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss().toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesototalizarsaldosLocal =(ProcesoTotalizarSaldos) this.procesototalizarsaldoss.toArray()[this.jTableDatosProcesoTotalizarSaldos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesototalizarsaldosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
						procesototalizarsaldosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldoss) {
						procesototalizarsaldosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoTotalizarSaldos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoTotalizarSaldos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoTotalizarSaldos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoTotalizarSaldosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoTotalizarSaldosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoTotalizarSaldosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoTotalizarSaldos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldoss) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoTotalizarSaldosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoTotalizarSaldos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoTotalizarSaldos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoTotalizarSaldos) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoTotalizarSaldos(conSplash);
				
					this.generarReporteProcesoTotalizarSaldossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoTotalizarSaldossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoTotalizarSaldossSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoTotalizarSaldossSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoTotalizarSaldos();
				
				this.exportarProcesoTotalizarSaldossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoTotalizarSaldoss();
				//this.importarProcesoTotalizarSaldoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoTotalizarSaldos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoTotalizarSaldossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Totalizar Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoTotalizarSaldos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoTotalizarSaldos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoTotalizarSaldos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Totalizar Saldos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoTotalizarSaldosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoTotalizarSaldos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoTotalizarSaldos(conSplash);
					
						//this.actualizarParametrosGeneralProcesoTotalizarSaldos();
						
						this.generarReporteProcesoAccionProcesoTotalizarSaldossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Totalizar SaldosES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Totalizar Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoTotalizarSaldos();
				
						this.actualizarParametrosGeneralProcesoTotalizarSaldos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesototalizarsaldosReturnGeneral=procesototalizarsaldosLogic.procesarAccionProcesoTotalizarSaldossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss(),this.procesototalizarsaldosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoTotalizarSaldosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoTotalizarSaldos();
					
					ProcesoTotalizarSaldosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoTotalizarSaldosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoTotalizarSaldos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxTiposAccionesFormularioProcesoTotalizarSaldos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoTotalizarSaldos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoTotalizarSaldosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoTotalizarSaldos();
			
			if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();		
			ProcesoTotalizarSaldos procesototalizarsaldos=new ProcesoTotalizarSaldos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoTotalizarSaldos.getSelectedItem();
			
			
			
			
			procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesototalizarsaldossSeleccionados.size()==1) {
				for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldossSeleccionados) {
					procesototalizarsaldos=procesototalizarsaldosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoTotalizarSaldos();
			
      		//this.finishProcessProcesoTotalizarSaldos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoTotalizarSaldosReturnGeneral() throws Exception {
		if(this.procesototalizarsaldosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesototalizarsaldosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesototalizarsaldosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesototalizarsaldosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesototalizarsaldosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesototalizarsaldosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
		}
		
		if(this.procesototalizarsaldosReturnGeneral.getConRetornoLista() || this.procesototalizarsaldosReturnGeneral.getConRetornoObjeto()) {
			if(this.procesototalizarsaldosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesototalizarsaldosLogic.setProcesoTotalizarSaldoss(this.procesototalizarsaldosReturnGeneral.getProcesoTotalizarSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoTotalizarSaldos(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoTotalizarSaldos() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoTotalizarSaldos> getProcesoTotalizarSaldossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoTotalizarSaldos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldosLogic.getProcesoTotalizarSaldoss()) {
					if(procesototalizarsaldosAux.getIsSelected()) {
						procesototalizarsaldossSeleccionados.add(procesototalizarsaldosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoTotalizarSaldos procesototalizarsaldosAux:this.procesototalizarsaldoss) {
					if(procesototalizarsaldosAux.getIsSelected()) {
						procesototalizarsaldossSeleccionados.add(procesototalizarsaldosAux);				
					}
				}
			}
			
			if(procesototalizarsaldossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesototalizarsaldossSeleccionados.addAll(this.procesototalizarsaldosLogic.getProcesoTotalizarSaldoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesototalizarsaldossSeleccionados.addAll(this.procesototalizarsaldoss);				
					}
				}
			}
		} else {
			procesototalizarsaldossSeleccionados.add(this.procesototalizarsaldos);
		}
		
		return procesototalizarsaldossSeleccionados;
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
	
	public void generarReporteProcesoTotalizarSaldossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoTotalizarSaldossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoTotalizarSaldossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoTotalizarSaldossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoTotalizarSaldossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Totalizar Saldos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoTotalizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();		
		
		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoTotalizarSaldoss("Todos",procesototalizarsaldossSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoTotalizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();		
		
		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoTotalizarSaldoss("Todos",procesototalizarsaldossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoTotalizarSaldossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();
		
		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoTotalizarSaldoss("Todos",procesototalizarsaldossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoTotalizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoTotalizarSaldos();
		
		
		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoTotalizarSaldos();
		
		
		//this.generarReporteProcesoTotalizarSaldoss("Todos",procesototalizarsaldossSeleccionados ,procesototalizarsaldosImplementable,procesototalizarsaldosImplementableHome);
	}
	
	public void mostrarImportacionProcesoTotalizarSaldoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoTotalizarSaldos();
		
		this.abrirFrameImportacionProcesoTotalizarSaldos();		
		
			
		//this.generarReporteProcesoTotalizarSaldoss("Todos",procesototalizarsaldossSeleccionados ,procesototalizarsaldosImplementable,procesototalizarsaldosImplementableHome);
	}
	
	public void importarProcesoTotalizarSaldoss() throws Exception {		
	
	}
	
	public void exportarProcesoTotalizarSaldossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoTotalizarSaldossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoTotalizarSaldossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoTotalizarSaldossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Totalizar Saldos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoTotalizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();		
		
		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesototalizarsaldos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoTotalizarSaldos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoTotalizarSaldos(procesototalizarsaldosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesototalizarsaldosAux.setsDetalleGeneralEntityReporte(procesototalizarsaldosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Totalizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoTotalizarSaldos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoTotalizarSaldosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoTotalizarSaldosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesototalizarsaldos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesototalizarsaldos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesototalizarsaldos.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesototalizarsaldos.getperiodo_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoTotalizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();		
		
		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesototalizarsaldos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoTotalizarSaldoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoTotalizarSaldos(row);				
				iRow++;
			}				
			
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoTotalizarSaldos(procesototalizarsaldosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Totalizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoTotalizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();		
		
		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesototalizarsaldos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesototalizarsaldoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesototalizarsaldos");
			//elementRoot.appendChild(element);
		
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldossSeleccionados) {
				element = document.createElement("procesototalizarsaldos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoTotalizarSaldos(procesototalizarsaldosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Totalizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoTotalizarSaldos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesototalizarsaldos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesototalizarsaldos.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesototalizarsaldos.getperiodo_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesoTotalizarSaldos(ProcesoTotalizarSaldos procesototalizarsaldos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoTotalizarSaldosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesototalizarsaldos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoTotalizarSaldosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesototalizarsaldos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementejercicio_descripcion = document.createElement(ProcesoTotalizarSaldosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(procesototalizarsaldos.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(ProcesoTotalizarSaldosConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(procesototalizarsaldos.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesoTotalizarSaldossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados=new ArrayList<ProcesoTotalizarSaldos>();
		
		procesototalizarsaldossSeleccionados=this.getProcesoTotalizarSaldossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoTotalizarSaldos(procesototalizarsaldossSeleccionados);
		
		this.generarReporteProcesoTotalizarSaldoss("Todos",procesototalizarsaldossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoTotalizarSaldos(ArrayList<ProcesoTotalizarSaldos> procesototalizarsaldossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoTotalizarSaldos procesototalizarsaldosAux:procesototalizarsaldossSeleccionados) {
				procesototalizarsaldosAux.setsDetalleGeneralEntityReporte(procesototalizarsaldosAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					procesototalizarsaldosAux.setsDescripcionGeneralEntityReporte1(procesototalizarsaldosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoTotalizarSaldosConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					procesototalizarsaldosAux.setsDescripcionGeneralEntityReporte1(procesototalizarsaldosAux.getperiodo_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoTotalizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoTotalizarSaldos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoTotalizarSaldosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=true;
		} else {
			this.actualizarEstadoPanelsProcesoTotalizarSaldos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoTotalizarSaldos=false;
			//this.isVisibilidadCeldaVerFormProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaDuplicarProcesoTotalizarSaldos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			if(!procesototalizarsaldosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;												
			}
			
			this.jButtonCerrarProcesoTotalizarSaldos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
		}
		
		if(!this.permiteMantenimiento(this.procesototalizarsaldos)) {
			this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoTotalizarSaldos=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoTotalizarSaldos=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoTotalizarSaldos=false;
		//this.isVisibilidadCeldaModificarProcesoTotalizarSaldos=true;
		this.isVisibilidadCeldaActualizarProcesoTotalizarSaldos=false;
		this.isVisibilidadCeldaEliminarProcesoTotalizarSaldos=false;
		//this.isVisibilidadCeldaCancelarProcesoTotalizarSaldos=true;			
		this.isVisibilidadCeldaGuardarProcesoTotalizarSaldos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoTotalizarSaldos() {
	}
	
	public void actualizarEstadoPanelsProcesoTotalizarSaldos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosProcesoTotalizarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoTotalizarSaldos!=null) {
				this.jPanelPaginacionProcesoTotalizarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoTotalizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosProcesoTotalizarSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoTotalizarSaldos!=null) {
				this.jPanelPaginacionProcesoTotalizarSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoTotalizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosProcesoTotalizarSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoTotalizarSaldos!=null) {
				this.jPanelPaginacionProcesoTotalizarSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoTotalizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosProcesoTotalizarSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoTotalizarSaldos!=null) {
				this.jPanelPaginacionProcesoTotalizarSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoTotalizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosProcesoTotalizarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoTotalizarSaldos!=null) {
				this.jPanelPaginacionProcesoTotalizarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoTotalizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosProcesoTotalizarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoTotalizarSaldos!=null) {
				this.jPanelPaginacionProcesoTotalizarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoTotalizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoTotalizarSaldos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoTotalizarSaldos!=null) {
				this.jScrollPanelDatosProcesoTotalizarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoTotalizarSaldos!=null) {
				this.jPanelPaginacionProcesoTotalizarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoTotalizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos!=null) {
					this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoTotalizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesototalizarsaldosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoTotalizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoTotalizarSaldos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPorEjercicioPorPeriodo=isParaEjercicio;
			if(!this.isVisibilidadBusquedaPorEjercicioPorPeriodo) {this.jTabbedPaneBusquedasProcesoTotalizarSaldos.remove(jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaPorEjercicioPorPeriodo=isParaPeriodo;
			if(!this.isVisibilidadBusquedaPorEjercicioPorPeriodo) {this.jTabbedPaneBusquedasProcesoTotalizarSaldos.remove(jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);}
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
			
			this.inicializarActualizarBindingTablaProcesoTotalizarSaldos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoTotalizarSaldos() {
		this.updateBorderResaltarBusquedasFormularioProcesoTotalizarSaldos();
		this.updateVisibilidadBusquedasFormularioProcesoTotalizarSaldos();
		this.updateHabilitarBusquedasFormularioProcesoTotalizarSaldos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoTotalizarSaldos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos.getComponents().length>0) {
	

		if(this.procesototalizarsaldosConstantesFunciones.resaltarBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos!=null) {
			index= this.jTabbedPaneBusquedasProcesoTotalizarSaldos.indexOfComponent(this.jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoTotalizarSaldos.getComponent(index);
				jPanel.setBorder(this.procesototalizarsaldosConstantesFunciones.resaltarBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoTotalizarSaldos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoTotalizarSaldos.indexOfComponent(this.jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoTotalizarSaldos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesototalizarsaldosConstantesFunciones.mostrarBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);
			if(!this.procesototalizarsaldosConstantesFunciones.mostrarBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos && index>-1) {
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoTotalizarSaldos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoTotalizarSaldos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoTotalizarSaldos.indexOfComponent(this.jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoTotalizarSaldos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesototalizarsaldosConstantesFunciones.activarBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);
				this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setEnabledAt(index,this.procesototalizarsaldosConstantesFunciones.activarBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoTotalizarSaldos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorEjercicioPorPeriodo")) {
			index= this.jTabbedPaneBusquedasProcesoTotalizarSaldos.indexOfComponent(this.jPanelBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);

			this.jTabbedPaneBusquedasProcesoTotalizarSaldos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoTotalizarSaldos.getComponent(index);

			this.procesototalizarsaldosConstantesFunciones.setResaltarBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos(resaltar);

			jPanel.setBorder(this.procesototalizarsaldosConstantesFunciones.resaltarBusquedaPorEjercicioPorPeriodoProcesoTotalizarSaldos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoTotalizarSaldos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoTotalizarSaldos() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoTotalizarSaldos();
		this.updateVisibilidadResaltarControlesFormularioProcesoTotalizarSaldos();
		this.updateHabilitarResaltarControlesFormularioProcesoTotalizarSaldos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoTotalizarSaldos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesototalizarsaldosConstantesFunciones.resaltaridProcesoTotalizarSaldos!=null && this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.setBorder(this.procesototalizarsaldosConstantesFunciones.resaltaridProcesoTotalizarSaldos);}
		if(this.procesototalizarsaldosConstantesFunciones.resaltarid_ejercicioProcesoTotalizarSaldos!=null && this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.setBorder(this.procesototalizarsaldosConstantesFunciones.resaltarid_ejercicioProcesoTotalizarSaldos);}
		if(this.procesototalizarsaldosConstantesFunciones.resaltarid_periodoProcesoTotalizarSaldos!=null && this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.setBorder(this.procesototalizarsaldosConstantesFunciones.resaltarid_periodoProcesoTotalizarSaldos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoTotalizarSaldos() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
	
		//this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.setVisible(this.procesototalizarsaldosConstantesFunciones.mostraridProcesoTotalizarSaldos);
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jPanelidProcesoTotalizarSaldos.setVisible(this.procesototalizarsaldosConstantesFunciones.mostraridProcesoTotalizarSaldos);
		//this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.setVisible(this.procesototalizarsaldosConstantesFunciones.mostrarid_ejercicioProcesoTotalizarSaldos);
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jPanelid_ejercicioProcesoTotalizarSaldos.setVisible(this.procesototalizarsaldosConstantesFunciones.mostrarid_ejercicioProcesoTotalizarSaldos);
		//this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.setVisible(this.procesototalizarsaldosConstantesFunciones.mostrarid_periodoProcesoTotalizarSaldos);
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jPanelid_periodoProcesoTotalizarSaldos.setVisible(this.procesototalizarsaldosConstantesFunciones.mostrarid_periodoProcesoTotalizarSaldos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoTotalizarSaldos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoTotalizarSaldos!=null) {
	
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jLabelidProcesoTotalizarSaldos.setEnabled(this.procesototalizarsaldosConstantesFunciones.activaridProcesoTotalizarSaldos);
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_ejercicioProcesoTotalizarSaldos.setEnabled(this.procesototalizarsaldosConstantesFunciones.activarid_ejercicioProcesoTotalizarSaldos);
		this.jInternalFrameDetalleFormProcesoTotalizarSaldos.jComboBoxid_periodoProcesoTotalizarSaldos.setEnabled(this.procesototalizarsaldosConstantesFunciones.activarid_periodoProcesoTotalizarSaldos);
		}
	}
	
		
}