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

//import com.bydan.erp.contabilidad.util.ProcesoSincronizarSaldosConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ProcesoSincronizarSaldosParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ProcesoSincronizarSaldosParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ProcesoSincronizarSaldosBean;
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
public class ProcesoSincronizarSaldosBeanSwingJInternalFrame extends ProcesoSincronizarSaldosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoSincronizarSaldosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoSincronizarSaldos> procesosincronizarsaldosValidator = new ClassValidator<ProcesoSincronizarSaldos>(ProcesoSincronizarSaldos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoSincronizarSaldos procesosincronizarsaldos;	
	public ProcesoSincronizarSaldos procesosincronizarsaldosAux;
	public ProcesoSincronizarSaldos procesosincronizarsaldosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoSincronizarSaldos procesosincronizarsaldosTotales;
	public Long idProcesoSincronizarSaldosActual;
	public Long iIdNuevoProcesoSincronizarSaldos=0L;
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
	
	public Boolean isPermisoTodoProcesoSincronizarSaldos;
	public Boolean isPermisoNuevoProcesoSincronizarSaldos;
	public Boolean isPermisoActualizarProcesoSincronizarSaldos;
	public Boolean isPermisoActualizarOriginalProcesoSincronizarSaldos;
	public Boolean isPermisoEliminarProcesoSincronizarSaldos;
	public Boolean isPermisoGuardarCambiosProcesoSincronizarSaldos;
	public Boolean isPermisoConsultaProcesoSincronizarSaldos;
	public Boolean isPermisoBusquedaProcesoSincronizarSaldos;
	public Boolean isPermisoReporteProcesoSincronizarSaldos;
	public Boolean isPermisoPaginacionMedioProcesoSincronizarSaldos;
	public Boolean isPermisoPaginacionAltoProcesoSincronizarSaldos;
	public Boolean isPermisoPaginacionTodoProcesoSincronizarSaldos;
	public Boolean isPermisoCopiarProcesoSincronizarSaldos;
	public Boolean isPermisoVerFormProcesoSincronizarSaldos;
	public Boolean isPermisoDuplicarProcesoSincronizarSaldos;
	public Boolean isPermisoOrdenProcesoSincronizarSaldos;
	
	
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
	
	public ProcesoSincronizarSaldosParameterReturnGeneral procesosincronizarsaldosReturnGeneral;
	public ProcesoSincronizarSaldosParameterReturnGeneral procesosincronizarsaldosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoSincronizarSaldos=false;
	public Boolean esParaAccionDesdeFormularioProcesoSincronizarSaldos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoSincronizarSaldosSessionBeanAdditional procesosincronizarsaldosSessionBeanAdditional=null;
	
	public ProcesoSincronizarSaldosSessionBeanAdditional getProcesoSincronizarSaldosSessionBeanAdditional() {
		return this.procesosincronizarsaldosSessionBeanAdditional;
	}
	
	public void setProcesoSincronizarSaldosSessionBeanAdditional(ProcesoSincronizarSaldosSessionBeanAdditional procesosincronizarsaldosSessionBeanAdditional) {
		try {
			this.procesosincronizarsaldosSessionBeanAdditional=procesosincronizarsaldosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional procesosincronizarsaldosBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoSincronizarSaldosBeanSwingJInternalFrame
	
	public ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional getProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional() {
		return this.procesosincronizarsaldosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional(ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional procesosincronizarsaldosBeanSwingJInternalFrameAdditional) {
		try {
			this.procesosincronizarsaldosBeanSwingJInternalFrameAdditional=procesosincronizarsaldosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoSincronizarSaldosLogic procesosincronizarsaldosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoSincronizarSaldos procesosincronizarsaldosBean;
	public ProcesoSincronizarSaldosConstantesFunciones procesosincronizarsaldosConstantesFunciones;
	//public ProcesoSincronizarSaldosParameterReturnGeneral procesosincronizarsaldosReturnGeneral;
	
	//FK
	
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoSincronizarSaldos> procesosincronizarsaldoss;	
	//public List<ProcesoSincronizarSaldos> procesosincronizarsaldossEliminados;
	//public List<ProcesoSincronizarSaldos> procesosincronizarsaldossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoSincronizarSaldos=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoSincronizarSaldos=true;
	public Boolean isVisibilidadCeldaCopiarProcesoSincronizarSaldos=true;
	public Boolean isVisibilidadCeldaVerFormProcesoSincronizarSaldos=true;
	public Boolean isVisibilidadCeldaOrdenProcesoSincronizarSaldos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
	public Boolean isVisibilidadCeldaModificarProcesoSincronizarSaldos=false;
	public Boolean isVisibilidadCeldaActualizarProcesoSincronizarSaldos=false;
	public Boolean isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
	public Boolean isVisibilidadCeldaCancelarProcesoSincronizarSaldos=false;
	public Boolean isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoSincronizarSaldos=false;
	
	public Long getiIdNuevoProcesoSincronizarSaldos() {
		return this.iIdNuevoProcesoSincronizarSaldos;
	}

	public void setiIdNuevoProcesoSincronizarSaldos(Long iIdNuevoProcesoSincronizarSaldos) {
		this.iIdNuevoProcesoSincronizarSaldos = iIdNuevoProcesoSincronizarSaldos;
	}
	
	public Long getidProcesoSincronizarSaldosActual() {
		return this.idProcesoSincronizarSaldosActual;
	}

	public void setidProcesoSincronizarSaldosActual(Long idProcesoSincronizarSaldosActual) {
		this.idProcesoSincronizarSaldosActual = idProcesoSincronizarSaldosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoSincronizarSaldos getprocesosincronizarsaldos() {
		return this.procesosincronizarsaldos;
	}

	public void setprocesosincronizarsaldos(ProcesoSincronizarSaldos procesosincronizarsaldos) {
		this.procesosincronizarsaldos = procesosincronizarsaldos;
	}
	
	public ProcesoSincronizarSaldos getprocesosincronizarsaldosAux() {
		return this.procesosincronizarsaldosAux;
	}

	public void setprocesosincronizarsaldosAux(ProcesoSincronizarSaldos procesosincronizarsaldosAux) {
		this.procesosincronizarsaldosAux = procesosincronizarsaldosAux;
	}				
	
	public ProcesoSincronizarSaldos getprocesosincronizarsaldosAnterior() {
		return this.procesosincronizarsaldosAnterior;
	}

	public void setprocesosincronizarsaldosAnterior(ProcesoSincronizarSaldos procesosincronizarsaldosAnterior) {
		this.procesosincronizarsaldosAnterior = procesosincronizarsaldosAnterior;
	}	
	
	public ProcesoSincronizarSaldos getprocesosincronizarsaldosTotales() {
		return this.procesosincronizarsaldosTotales;
	}

	public void setprocesosincronizarsaldosTotales(ProcesoSincronizarSaldos procesosincronizarsaldosTotales) {
		this.procesosincronizarsaldosTotales = procesosincronizarsaldosTotales;
	}	
	
	public ProcesoSincronizarSaldos getprocesosincronizarsaldosBean() {
		return this.procesosincronizarsaldosBean;
	}

	public void setprocesosincronizarsaldosBean(ProcesoSincronizarSaldos procesosincronizarsaldosBean) {
		this.procesosincronizarsaldosBean = procesosincronizarsaldosBean;
	}	
	
	public ProcesoSincronizarSaldosParameterReturnGeneral getprocesosincronizarsaldosReturnGeneral() {
		return this.procesosincronizarsaldosReturnGeneral;
	}

	public void setprocesosincronizarsaldosReturnGeneral(ProcesoSincronizarSaldosParameterReturnGeneral procesosincronizarsaldosReturnGeneral) {
		this.procesosincronizarsaldosReturnGeneral = procesosincronizarsaldosReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaProcesoSincronizarSaldos=-1L;

	public Long getid_ejercicioBusquedaProcesoSincronizarSaldos() {
		return this.id_ejercicioBusquedaProcesoSincronizarSaldos;
	}

	public void setid_ejercicioBusquedaProcesoSincronizarSaldos(Long id_ejercicioBusquedaProcesoSincronizarSaldos) {
		this.id_ejercicioBusquedaProcesoSincronizarSaldos = id_ejercicioBusquedaProcesoSincronizarSaldos;
	}

;
	public Long id_periodoBusquedaProcesoSincronizarSaldos=-1L;

	public Long getid_periodoBusquedaProcesoSincronizarSaldos() {
		return this.id_periodoBusquedaProcesoSincronizarSaldos;
	}

	public void setid_periodoBusquedaProcesoSincronizarSaldos(Long id_periodoBusquedaProcesoSincronizarSaldos) {
		this.id_periodoBusquedaProcesoSincronizarSaldos = id_periodoBusquedaProcesoSincronizarSaldos;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoSincronizarSaldosLogic getProcesoSincronizarSaldosLogic()	{		
		return procesosincronizarsaldosLogic;
	}

	public void setProcesoSincronizarSaldosLogic(ProcesoSincronizarSaldosLogic procesosincronizarsaldosLogic) {
		this.procesosincronizarsaldosLogic = procesosincronizarsaldosLogic;
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
	
	public Boolean getIsEsNuevoProcesoSincronizarSaldos() {
		return isEsNuevoProcesoSincronizarSaldos;
	}

	public void setIsEsNuevoProcesoSincronizarSaldos(Boolean isEsNuevoProcesoSincronizarSaldos) {
		this.isEsNuevoProcesoSincronizarSaldos = isEsNuevoProcesoSincronizarSaldos;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoSincronizarSaldos() {
		return esParaAccionDesdeFormularioProcesoSincronizarSaldos;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoSincronizarSaldos(Boolean esParaAccionDesdeFormularioProcesoSincronizarSaldos) {
		this.esParaAccionDesdeFormularioProcesoSincronizarSaldos = esParaAccionDesdeFormularioProcesoSincronizarSaldos;
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

			if(this.procesosincronizarsaldosSessionBean==null) {
				this.procesosincronizarsaldosSessionBean=new ProcesoSincronizarSaldosSessionBean();
			}

			if(!this.procesosincronizarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(procesosincronizarsaldosSessionBean.getlidEjercicioActual());
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

			if(this.procesosincronizarsaldosSessionBean==null) {
				this.procesosincronizarsaldosSessionBean=new ProcesoSincronizarSaldosSessionBean();
			}

			if(!this.procesosincronizarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(procesosincronizarsaldosSessionBean.getlidPeriodoActual());
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

					if(this.procesosincronizarsaldos!=null) {
						this.procesosincronizarsaldos.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioProcesoSincronizarSaldos.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
						if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoSincronizarSaldos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos!=null) {
						jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos!=null) {
							//jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioProcesoSincronizarSaldosGenerico)throws Exception
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
				jComboBoxid_ejercicioProcesoSincronizarSaldosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioProcesoSincronizarSaldosGenerico!=null && jComboBoxid_ejercicioProcesoSincronizarSaldosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioProcesoSincronizarSaldosGenerico.setSelectedIndex(0);
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

					if(this.procesosincronizarsaldos!=null) {
						this.procesosincronizarsaldos.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoProcesoSincronizarSaldos.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
						if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoSincronizarSaldos") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos!=null) {
						jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos!=null) {
							//jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.getItemCount()>0) {
								jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoProcesoSincronizarSaldosGenerico)throws Exception
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
				jComboBoxid_periodoProcesoSincronizarSaldosGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoProcesoSincronizarSaldosGenerico!=null && jComboBoxid_periodoProcesoSincronizarSaldosGenerico.getItemCount()>0) {
					jComboBoxid_periodoProcesoSincronizarSaldosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ProcesoSincronizarSaldos procesosincronizarsaldos,JComboBox jComboBoxid_ejercicioProcesoSincronizarSaldosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioProcesoSincronizarSaldosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioProcesoSincronizarSaldosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				procesosincronizarsaldos.setid_ejercicio(ejercicioAux.getId());
				procesosincronizarsaldos.setejercicio_descripcion(ProcesoSincronizarSaldosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				procesosincronizarsaldos.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(ProcesoSincronizarSaldos procesosincronizarsaldos,JComboBox jComboBoxid_periodoProcesoSincronizarSaldosGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoProcesoSincronizarSaldosGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoProcesoSincronizarSaldosGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				procesosincronizarsaldos.setid_periodo(periodoAux.getId());
				procesosincronizarsaldos.setperiodo_descripcion(ProcesoSincronizarSaldosConstantesFunciones.getPeriodoDescripcion(periodoAux));
				procesosincronizarsaldos.setPeriodo(periodoAux);			}
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

					if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { 
							this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { 
					}

					if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoSincronizarSaldos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.addItem(ejercicio);
							}
						}

						if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { 
							this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { 
					}

					if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoSincronizarSaldos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.addItem(periodo);
							}
						}

						if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
							this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoSincronizarSaldos() throws Exception {
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
		
	public ProcesoSincronizarSaldosParameterReturnGeneral getProcesoSincronizarSaldosParameterGeneral() {
		return this.procesosincronizarsaldosParameterGeneral;
	}
	
	public void setProcesoSincronizarSaldosParameterGeneral(ProcesoSincronizarSaldosParameterReturnGeneral procesosincronizarsaldosParameterGeneral) {
		this.procesosincronizarsaldosParameterGeneral = procesosincronizarsaldosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoSincronizarSaldos() {
		return isPermisoTodoProcesoSincronizarSaldos;
	}

	public void setIsPermisoTodoProcesoSincronizarSaldos(Boolean isPermisoTodoProcesoSincronizarSaldos) {
		this.isPermisoTodoProcesoSincronizarSaldos = isPermisoTodoProcesoSincronizarSaldos;
	}

	public Boolean getIsPermisoNuevoProcesoSincronizarSaldos() {
		return isPermisoNuevoProcesoSincronizarSaldos;
	}

	public void setIsPermisoNuevoProcesoSincronizarSaldos(Boolean isPermisoNuevoProcesoSincronizarSaldos) {
		this.isPermisoNuevoProcesoSincronizarSaldos = isPermisoNuevoProcesoSincronizarSaldos;
	}

	public Boolean getIsPermisoActualizarProcesoSincronizarSaldos() {
		return isPermisoActualizarProcesoSincronizarSaldos;
	}

	public void setIsPermisoActualizarProcesoSincronizarSaldos(Boolean isPermisoActualizarProcesoSincronizarSaldos) {
		this.isPermisoActualizarProcesoSincronizarSaldos = isPermisoActualizarProcesoSincronizarSaldos;
	}

	public Boolean getIsPermisoEliminarProcesoSincronizarSaldos() {
		return isPermisoEliminarProcesoSincronizarSaldos;
	}

	public void setIsPermisoEliminarProcesoSincronizarSaldos(Boolean isPermisoEliminarProcesoSincronizarSaldos) {
		this.isPermisoEliminarProcesoSincronizarSaldos = isPermisoEliminarProcesoSincronizarSaldos;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoSincronizarSaldos() {
		return isPermisoGuardarCambiosProcesoSincronizarSaldos;
	}

	public void setIsPermisoGuardarCambiosProcesoSincronizarSaldos(Boolean isPermisoGuardarCambiosProcesoSincronizarSaldos) {
		this.isPermisoGuardarCambiosProcesoSincronizarSaldos = isPermisoGuardarCambiosProcesoSincronizarSaldos;
	}
	
	public Boolean getIsPermisoConsultaProcesoSincronizarSaldos() {
		return isPermisoConsultaProcesoSincronizarSaldos;
	}

	public void setIsPermisoConsultaProcesoSincronizarSaldos(Boolean isPermisoConsultaProcesoSincronizarSaldos) {
		this.isPermisoConsultaProcesoSincronizarSaldos = isPermisoConsultaProcesoSincronizarSaldos;
	}

	public Boolean getIsPermisoBusquedaProcesoSincronizarSaldos() {
		return isPermisoBusquedaProcesoSincronizarSaldos;
	}

	public void setIsPermisoBusquedaProcesoSincronizarSaldos(Boolean isPermisoBusquedaProcesoSincronizarSaldos) {
		this.isPermisoBusquedaProcesoSincronizarSaldos = isPermisoBusquedaProcesoSincronizarSaldos;
	}

	public Boolean getIsPermisoReporteProcesoSincronizarSaldos() {
		return isPermisoReporteProcesoSincronizarSaldos;
	}

	public void setIsPermisoReporteProcesoSincronizarSaldos(Boolean isPermisoReporteProcesoSincronizarSaldos) {
		this.isPermisoReporteProcesoSincronizarSaldos = isPermisoReporteProcesoSincronizarSaldos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoSincronizarSaldos() {
		return isPermisoPaginacionMedioProcesoSincronizarSaldos;
	}

	public void setIsPermisoPaginacionMedioProcesoSincronizarSaldos(Boolean isPermisoPaginacionMedioProcesoSincronizarSaldos) {
		this.isPermisoPaginacionMedioProcesoSincronizarSaldos = isPermisoPaginacionMedioProcesoSincronizarSaldos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoSincronizarSaldos() {
		return isPermisoPaginacionTodoProcesoSincronizarSaldos;
	}

	public void setIsPermisoPaginacionTodoProcesoSincronizarSaldos(Boolean isPermisoPaginacionTodoProcesoSincronizarSaldos) {
		this.isPermisoPaginacionTodoProcesoSincronizarSaldos = isPermisoPaginacionTodoProcesoSincronizarSaldos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoSincronizarSaldos() {
		return isPermisoPaginacionAltoProcesoSincronizarSaldos;
	}

	public void setIsPermisoPaginacionAltoProcesoSincronizarSaldos(Boolean isPermisoPaginacionAltoProcesoSincronizarSaldos) {
		this.isPermisoPaginacionAltoProcesoSincronizarSaldos = isPermisoPaginacionAltoProcesoSincronizarSaldos;
	}
	
	public Boolean getIsPermisoCopiarProcesoSincronizarSaldos() {
		return isPermisoCopiarProcesoSincronizarSaldos;
	}

	public void setIsPermisoCopiarProcesoSincronizarSaldos(Boolean isPermisoCopiarProcesoSincronizarSaldos) {
		this.isPermisoCopiarProcesoSincronizarSaldos = isPermisoCopiarProcesoSincronizarSaldos;
	}
	
	public Boolean getIsPermisoVerFormProcesoSincronizarSaldos() {
		return isPermisoVerFormProcesoSincronizarSaldos;
	}

	public void setIsPermisoVerFormProcesoSincronizarSaldos(Boolean isPermisoVerFormProcesoSincronizarSaldos) {
		this.isPermisoVerFormProcesoSincronizarSaldos = isPermisoVerFormProcesoSincronizarSaldos;
	}
	
	public Boolean getIsPermisoDuplicarProcesoSincronizarSaldos() {
		return isPermisoDuplicarProcesoSincronizarSaldos;
	}

	public void setIsPermisoDuplicarProcesoSincronizarSaldos(Boolean isPermisoDuplicarProcesoSincronizarSaldos) {
		this.isPermisoDuplicarProcesoSincronizarSaldos = isPermisoDuplicarProcesoSincronizarSaldos;
	}
	
	public Boolean getIsPermisoOrdenProcesoSincronizarSaldos() {
		return isPermisoOrdenProcesoSincronizarSaldos;
	}

	public void setIsPermisoOrdenProcesoSincronizarSaldos(Boolean isPermisoOrdenProcesoSincronizarSaldos) {
		this.isPermisoOrdenProcesoSincronizarSaldos = isPermisoOrdenProcesoSincronizarSaldos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoSincronizarSaldos() {
		return isVisibilidadCeldaNuevoProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaNuevoProcesoSincronizarSaldos(Boolean isVisibilidadCeldaNuevoProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos = isVisibilidadCeldaNuevoProcesoSincronizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoSincronizarSaldos() {
		return isVisibilidadCeldaDuplicarProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoSincronizarSaldos(Boolean isVisibilidadCeldaDuplicarProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaDuplicarProcesoSincronizarSaldos = isVisibilidadCeldaDuplicarProcesoSincronizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoSincronizarSaldos() {
		return isVisibilidadCeldaCopiarProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaCopiarProcesoSincronizarSaldos(Boolean isVisibilidadCeldaCopiarProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaCopiarProcesoSincronizarSaldos = isVisibilidadCeldaCopiarProcesoSincronizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoSincronizarSaldos() {
		return isVisibilidadCeldaVerFormProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaVerFormProcesoSincronizarSaldos(Boolean isVisibilidadCeldaVerFormProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaVerFormProcesoSincronizarSaldos = isVisibilidadCeldaVerFormProcesoSincronizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoSincronizarSaldos() {
		return isVisibilidadCeldaOrdenProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaOrdenProcesoSincronizarSaldos(Boolean isVisibilidadCeldaOrdenProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaOrdenProcesoSincronizarSaldos = isVisibilidadCeldaOrdenProcesoSincronizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos() {
		return isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos(Boolean isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos = isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoSincronizarSaldos() {
		return isVisibilidadCeldaModificarProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaModificarProcesoSincronizarSaldos(Boolean isVisibilidadCeldaModificarProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaModificarProcesoSincronizarSaldos = isVisibilidadCeldaModificarProcesoSincronizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoSincronizarSaldos() {
		return isVisibilidadCeldaActualizarProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaActualizarProcesoSincronizarSaldos(Boolean isVisibilidadCeldaActualizarProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos = isVisibilidadCeldaActualizarProcesoSincronizarSaldos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoSincronizarSaldos() {
		return isVisibilidadCeldaEliminarProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaEliminarProcesoSincronizarSaldos(Boolean isVisibilidadCeldaEliminarProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos = isVisibilidadCeldaEliminarProcesoSincronizarSaldos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoSincronizarSaldos() {
		return isVisibilidadCeldaCancelarProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaCancelarProcesoSincronizarSaldos(Boolean isVisibilidadCeldaCancelarProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos = isVisibilidadCeldaCancelarProcesoSincronizarSaldos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoSincronizarSaldos() {
		return isVisibilidadCeldaGuardarProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaGuardarProcesoSincronizarSaldos(Boolean isVisibilidadCeldaGuardarProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos = isVisibilidadCeldaGuardarProcesoSincronizarSaldos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos() {
		return isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos(Boolean isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos) {
		this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos = isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos;
	}
		
	public ProcesoSincronizarSaldosSessionBean getprocesosincronizarsaldosSessionBean() {
		return this.procesosincronizarsaldosSessionBean;
	}
	
	public void setprocesosincronizarsaldosSessionBean(ProcesoSincronizarSaldosSessionBean procesosincronizarsaldosSessionBean) {
		this.procesosincronizarsaldosSessionBean=procesosincronizarsaldosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoSincronizarSaldos() {
		return this.isVisibilidadBusquedaProcesoSincronizarSaldos;
	}

	public void setisVisibilidadBusquedaProcesoSincronizarSaldos(Boolean isVisibilidadBusquedaProcesoSincronizarSaldos) {
		this.isVisibilidadBusquedaProcesoSincronizarSaldos=isVisibilidadBusquedaProcesoSincronizarSaldos;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos)throws Exception {
		try {
			
				this.setActualParaGuardarEjercicioForeignKey(procesosincronizarsaldos,null);
				this.setActualParaGuardarPeriodoForeignKey(procesosincronizarsaldos,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoSincronizarSaldos procesosincronizarsaldos,ProcesoSincronizarSaldos procesosincronizarsaldosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoSincronizarSaldos(procesosincronizarsaldos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesosincronizarsaldosAux.setId(procesosincronizarsaldos.getId());
		procesosincronizarsaldosAux.setVersionRow(procesosincronizarsaldos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoSincronizarSaldos procesosincronizarsaldosLocal) throws Exception {
		
		if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoSincronizarSaldos procesosincronizarsaldosLocal) throws Exception {	
		if(this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				procesosincronizarsaldosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				procesosincronizarsaldosLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoSincronizarSaldosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesosincronizarsaldosValidator.getInvalidValues(this.procesosincronizarsaldos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoSincronizarSaldos procesosincronizarsaldos,List<ProcesoSincronizarSaldos> procesosincronizarsaldoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoSincronizarSaldos procesosincronizarsaldos,List<ProcesoSincronizarSaldos> procesosincronizarsaldoss) throws Exception {
		try	{			
			ProcesoSincronizarSaldosConstantesFunciones.actualizarSelectedLista(procesosincronizarsaldos,procesosincronizarsaldoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoSincronizarSaldos> procesosincronizarsaldossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesosincronizarsaldossLocal=this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesosincronizarsaldossLocal=this.procesosincronizarsaldoss;
			}
			//ARCHITECTURE
		
			for(ProcesoSincronizarSaldos procesosincronizarsaldosLocal:procesosincronizarsaldossLocal) {
				if(this.permiteMantenimiento(procesosincronizarsaldosLocal) && procesosincronizarsaldosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoSincronizarSaldosConstantesFunciones.getProcesoSincronizarSaldosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoSincronizarSaldosConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelid_ejercicioProcesoSincronizarSaldos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelid_ejercicioProcesoSincronizarSaldos,"");
		
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
		this.iIdNuevoProcesoSincronizarSaldos--;	
		
		
		this.procesosincronizarsaldosAux=new ProcesoSincronizarSaldos();
		
		this.procesosincronizarsaldosAux.setId(this.iIdNuevoProcesoSincronizarSaldos);
		this.procesosincronizarsaldosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().add(this.procesosincronizarsaldosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesosincronizarsaldoss.add(this.procesosincronizarsaldosAux);
		}
		//ARCHITECTURE
		
		this.procesosincronizarsaldos=this.procesosincronizarsaldosAux;
		
		if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoSincronizarSaldos(this.procesosincronizarsaldos);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoSincronizarSaldos(this.procesosincronizarsaldos);
		}
				
		//this.setDefaultControlesProcesoSincronizarSaldos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoSincronizarSaldos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoSincronizarSaldos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoSincronizarSaldos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoSincronizarSaldos(this.procesosincronizarsaldosBean,this.procesosincronizarsaldos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoSincronizarSaldos(this.procesosincronizarsaldosReturnGeneral,this.procesosincronizarsaldosBean,false);
		
		if(this.procesosincronizarsaldosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoSincronizarSaldos(this.procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoSincronizarSaldos(this.procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldos());
		}
		
		if(this.procesosincronizarsaldosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoSincronizarSaldos(this.procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldos(),classes);//this.procesosincronizarsaldosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.procesosincronizarsaldos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoSincronizarSaldos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoSincronizarSaldos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.RecargarFormProcesoSincronizarSaldos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
						
			if(procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoSincronizarSaldos();
			}
			
			this.actualizarVisualTableDatosProcesoSincronizarSaldos();
			
			this.jTableDatosProcesoSincronizarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoSincronizarSaldos(), this.getIndiceNuevoProcesoSincronizarSaldos());
			
			this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
						
			this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoSincronizarSaldos(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.setEnabled(isHabilitar && this.procesosincronizarsaldosConstantesFunciones.activarid_ejercicioProcesoSincronizarSaldos);//
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.setEnabled(isHabilitar && this.procesosincronizarsaldosConstantesFunciones.activarid_periodoProcesoSincronizarSaldos);
	};
	
	public void setDefaultControlesProcesoSincronizarSaldos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoSincronizarSaldos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesosincronizarsaldosSessionBean.setConGuardarRelaciones(true);			
			this.procesosincronizarsaldosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTabbedPaneRelacionesProcesoSincronizarSaldos.setVisible(true);
			
					
		} else {
			//this.procesosincronizarsaldosSessionBean.setConGuardarRelaciones(false);			
			this.procesosincronizarsaldosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTabbedPaneRelacionesProcesoSincronizarSaldos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoSincronizarSaldos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
				if(procesosincronizarsaldosAux.getId().equals(this.iIdNuevoProcesoSincronizarSaldos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldoss) {
				if(procesosincronizarsaldosAux.getId().equals(this.iIdNuevoProcesoSincronizarSaldos)) {
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
	
	public int getIndiceActualProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
				if(procesosincronizarsaldosAux.getId().equals(procesosincronizarsaldos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldoss) {
				if(procesosincronizarsaldosAux.getId().equals(procesosincronizarsaldos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
				if(procesosincronizarsaldosAux.getProcesoSincronizarSaldosOriginal().getId().equals(procesosincronizarsaldosOriginal.getId())) {
					existe=true;
					procesosincronizarsaldosOriginal.setId(procesosincronizarsaldosAux.getId());
					procesosincronizarsaldosOriginal.setVersionRow(procesosincronizarsaldosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldoss) {
				if(procesosincronizarsaldosAux.getProcesoSincronizarSaldosOriginal().getId().equals(procesosincronizarsaldosOriginal.getId())) {
					existe=true;
					procesosincronizarsaldosOriginal.setId(procesosincronizarsaldosAux.getId());
					procesosincronizarsaldosOriginal.setVersionRow(procesosincronizarsaldosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoSincronizarSaldos(Boolean esParaCancelar) throws Exception {
		procesosincronizarsaldossAux=new ArrayList<ProcesoSincronizarSaldos>();
		procesosincronizarsaldosAux=new ProcesoSincronizarSaldos();
		
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
					if(procesosincronizarsaldosAux.getId()<0) {
						procesosincronizarsaldossAux.add(procesosincronizarsaldosAux);
					}		
				}
				this.iIdNuevoProcesoSincronizarSaldos=0L;
				this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().removeAll(procesosincronizarsaldossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldoss) {
					if(procesosincronizarsaldosAux.getId()<0) {
						procesosincronizarsaldossAux.add(procesosincronizarsaldosAux);
					}		
				}
				this.iIdNuevoProcesoSincronizarSaldos=0L;
				this.procesosincronizarsaldoss.removeAll(procesosincronizarsaldossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoSincronizarSaldos 
					&& this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().size()>0
					) {
					procesosincronizarsaldosAux=this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().get(this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().size() - 1);
				
					if(procesosincronizarsaldosAux.getId()<0) {
						this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().remove(procesosincronizarsaldosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoSincronizarSaldos && this.procesosincronizarsaldoss.size()>0) {
					procesosincronizarsaldosAux=this.procesosincronizarsaldoss.get(this.procesosincronizarsaldoss.size() - 1);
				
					if(procesosincronizarsaldosAux.getId()<0) {
						this.procesosincronizarsaldoss.remove(procesosincronizarsaldosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoSincronizarSaldos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesosincronizarsaldos.getId()<0) {
				this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().remove(this.procesosincronizarsaldos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesosincronizarsaldos.getId()<0) {
				this.procesosincronizarsaldoss.remove(this.procesosincronizarsaldos);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoSincronizarSaldos(List<ProcesoSincronizarSaldos> procesosincronizarsaldossAux) throws Exception {
		ProcesoSincronizarSaldosConstantesFunciones.setEstadosInicialesProcesoSincronizarSaldos(procesosincronizarsaldossAux);
	}
	
	public void setEstadosInicialesProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldosAux) throws Exception {
		ProcesoSincronizarSaldosConstantesFunciones.setEstadosInicialesProcesoSincronizarSaldos(procesosincronizarsaldosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoSincronizarSaldosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoSincronizarSaldosActual()) {
				if(!this.isEsNuevoProcesoSincronizarSaldos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoSincronizarSaldos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoSincronizarSaldosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sincronizar Saldos ?", "MANTENIMIENTO DE Sincronizar Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoSincronizarSaldos procesosincronizarsaldos) throws Exception {
		ProcesoSincronizarSaldosConstantesFunciones.seleccionarAsignar(this.procesosincronizarsaldos,procesosincronizarsaldos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoSincronizarSaldos=this.isPermisoActualizarOriginalProcesoSincronizarSaldos;
			
			
			this.seleccionarAsignar(procesosincronizarsaldos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesosincronizarsaldosSessionBean.setsFuncionBusquedaRapida(this.procesosincronizarsaldosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoSincronizarSaldos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoSincronizarSaldos(esParaCancelar);				
				this.cancelarNuevoProcesoSincronizarSaldos(esParaCancelar);								
			}
			
			this.procesosincronizarsaldos=new ProcesoSincronizarSaldos();
			
			this.inicializarProcesoSincronizarSaldos();
			
			this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoSincronizarSaldos() throws Exception {
		try {
			ProcesoSincronizarSaldosConstantesFunciones.inicializarProcesoSincronizarSaldos(this.procesosincronizarsaldos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoSincronizarSaldoss(String sAccionBusqueda,List<ProcesoSincronizarSaldos> procesosincronizarsaldossParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoSincronizarSaldos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoSincronizarSaldosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoSincronizarSaldosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoSincronizarSaldos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sincronizar Saldoses");		
		parameters.put("busquedapor", ProcesoSincronizarSaldosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoSincronizarSaldos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoSincronizarSaldos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoSincronizarSaldosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoSincronizarSaldosBean.TraerProcesoSincronizarSaldosBeans(procesosincronizarsaldossParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoSincronizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesosincronizarsaldossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoSincronizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesosincronizarsaldossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldosActionPerformed(null);
					//this.generarExcelReporteProcesoSincronizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesosincronizarsaldossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoSincronizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesosincronizarsaldossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoSincronizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesosincronizarsaldossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoSincronizarSaldoss(sAccionBusqueda,sTipoArchivoReporte,procesosincronizarsaldossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoSincronizarSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoSincronizarSaldos> procesosincronizarsaldossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosincronizarsaldos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoSincronizarSaldoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoSincronizarSaldos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoSincronizarSaldos procesosincronizarsaldos : procesosincronizarsaldossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoSincronizarSaldosConstantesFunciones.generarExcelReporteDataProcesoSincronizarSaldos("NORMAL",row,workbook,procesosincronizarsaldos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sincronizar Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoSincronizarSaldos(String sTipo,Row row,Workbook workbook) {
		
		ProcesoSincronizarSaldosConstantesFunciones.generarExcelReporteHeaderProcesoSincronizarSaldos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoSincronizarSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoSincronizarSaldos> procesosincronizarsaldossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosincronizarsaldos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoSincronizarSaldoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoSincronizarSaldos procesosincronizarsaldos : procesosincronizarsaldossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.getProcesoSincronizarSaldosDescripcion(procesosincronizarsaldos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosincronizarsaldos.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesosincronizarsaldos.getperiodo_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sincronizar Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoSincronizarSaldoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoSincronizarSaldos> procesosincronizarsaldossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoSincronizarSaldos> procesosincronizarsaldossRespaldo=null;
		
		classes=ProcesoSincronizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoSincronizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesosincronizarsaldosLogic.setDatosCliente(this.datosCliente);
		this.procesosincronizarsaldosLogic.setDatosDeep(this.datosDeep);
		this.procesosincronizarsaldosLogic.setIsConDeep(true);
		
		procesosincronizarsaldossRespaldo=this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss();
		
		this.procesosincronizarsaldosLogic.setProcesoSincronizarSaldoss(procesosincronizarsaldossParaReportes);	
		this.procesosincronizarsaldosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesosincronizarsaldossParaReportes=this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss();
		this.procesosincronizarsaldosLogic.setProcesoSincronizarSaldoss(procesosincronizarsaldossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosincronizarsaldos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoSincronizarSaldoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoSincronizarSaldos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoSincronizarSaldos procesosincronizarsaldos : procesosincronizarsaldossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoSincronizarSaldos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoSincronizarSaldosConstantesFunciones.generarExcelReporteDataProcesoSincronizarSaldos("NORMAL",row,workbook,procesosincronizarsaldos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.getProcesoSincronizarSaldosDescripcion(procesosincronizarsaldos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sincronizar Saldos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoSincronizarSaldos() throws Exception {		
		this.startProcessProcesoSincronizarSaldos(true);
	}
	
	public void startProcessProcesoSincronizarSaldos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoSincronizarSaldos ,this.jPanelParametrosReportesProcesoSincronizarSaldos, this.jScrollPanelDatosProcesoSincronizarSaldos,this.jPanelPaginacionProcesoSincronizarSaldos, this.jScrollPanelDatosEdicionProcesoSincronizarSaldos, this.jPanelAccionesProcesoSincronizarSaldos,this.jPanelAccionesFormularioProcesoSincronizarSaldos,this.jmenuBarProcesoSincronizarSaldos,this.jmenuBarDetalleProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,this.jTtoolBarDetalleProcesoSincronizarSaldos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoSincronizarSaldos=this.jTabbedPaneBusquedasProcesoSincronizarSaldos; 
		
		final JPanel jPanelParametrosReportesProcesoSincronizarSaldos=this.jPanelParametrosReportesProcesoSincronizarSaldos;
		//final JScrollPane jScrollPanelDatosProcesoSincronizarSaldos=this.jScrollPanelDatosProcesoSincronizarSaldos;
		final JTable jTableDatosProcesoSincronizarSaldos=this.jTableDatosProcesoSincronizarSaldos;		
		final JPanel jPanelPaginacionProcesoSincronizarSaldos=this.jPanelPaginacionProcesoSincronizarSaldos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoSincronizarSaldos=this.jScrollPanelDatosEdicionProcesoSincronizarSaldos;
		final JPanel jPanelAccionesProcesoSincronizarSaldos=this.jPanelAccionesProcesoSincronizarSaldos;
		
		JPanel jPanelCamposAuxiliarProcesoSincronizarSaldos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoSincronizarSaldos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			jPanelCamposAuxiliarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jPanelCamposProcesoSincronizarSaldos;
			jPanelAccionesFormularioAuxiliarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jPanelAccionesFormularioProcesoSincronizarSaldos;
		}
		
		final JPanel jPanelCamposProcesoSincronizarSaldos=jPanelCamposAuxiliarProcesoSincronizarSaldos;
		final JPanel jPanelAccionesFormularioProcesoSincronizarSaldos=jPanelAccionesFormularioAuxiliarProcesoSincronizarSaldos;
		
		
		final JMenuBar jmenuBarProcesoSincronizarSaldos=this.jmenuBarProcesoSincronizarSaldos;
		final JToolBar jTtoolBarProcesoSincronizarSaldos=this.jTtoolBarProcesoSincronizarSaldos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoSincronizarSaldos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoSincronizarSaldos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			jmenuBarDetalleAuxiliarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jmenuBarDetalleProcesoSincronizarSaldos;
			jTtoolBarDetalleAuxiliarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTtoolBarDetalleProcesoSincronizarSaldos;
		}
		
		final JMenuBar jmenuBarDetalleProcesoSincronizarSaldos=jmenuBarDetalleAuxiliarProcesoSincronizarSaldos;
		final JToolBar jTtoolBarDetalleProcesoSincronizarSaldos=jTtoolBarDetalleAuxiliarProcesoSincronizarSaldos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoSincronizarSaldos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoSincronizarSaldos;
			processRunnable.jTableDatos=jTableDatosProcesoSincronizarSaldos;
			processRunnable.jPanelCampos=jPanelCamposProcesoSincronizarSaldos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoSincronizarSaldos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoSincronizarSaldos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoSincronizarSaldos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoSincronizarSaldos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoSincronizarSaldos;
			processRunnable.jTtoolBar=jTtoolBarProcesoSincronizarSaldos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoSincronizarSaldos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoSincronizarSaldos ,jPanelParametrosReportesProcesoSincronizarSaldos,jTableDatosProcesoSincronizarSaldos, /*jScrollPanelDatosProcesoSincronizarSaldos,*/jPanelCamposProcesoSincronizarSaldos,jPanelPaginacionProcesoSincronizarSaldos, /*jScrollPanelDatosEdicionProcesoSincronizarSaldos,*/ jPanelAccionesProcesoSincronizarSaldos,jPanelAccionesFormularioProcesoSincronizarSaldos,jmenuBarProcesoSincronizarSaldos,jmenuBarDetalleProcesoSincronizarSaldos,jTtoolBarProcesoSincronizarSaldos,jTtoolBarDetalleProcesoSincronizarSaldos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoSincronizarSaldos ,jPanelParametrosReportesProcesoSincronizarSaldos, jScrollPanelDatosProcesoSincronizarSaldos,jPanelPaginacionProcesoSincronizarSaldos, jScrollPanelDatosEdicionProcesoSincronizarSaldos, jPanelAccionesProcesoSincronizarSaldos,jPanelAccionesFormularioProcesoSincronizarSaldos,jmenuBarProcesoSincronizarSaldos,jmenuBarDetalleProcesoSincronizarSaldos,jTtoolBarProcesoSincronizarSaldos,jTtoolBarDetalleProcesoSincronizarSaldos);
						
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
	
	public void finishProcessProcesoSincronizarSaldos() {// throws Exception 
		this.finishProcessProcesoSincronizarSaldos(true);
	}
	
	public void finishProcessProcesoSincronizarSaldos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoSincronizarSaldos ,this.jPanelParametrosReportesProcesoSincronizarSaldos, this.jScrollPanelDatosProcesoSincronizarSaldos,this.jPanelPaginacionProcesoSincronizarSaldos, this.jScrollPanelDatosEdicionProcesoSincronizarSaldos, this.jPanelAccionesProcesoSincronizarSaldos,this.jPanelAccionesFormularioProcesoSincronizarSaldos,this.jmenuBarProcesoSincronizarSaldos,this.jmenuBarDetalleProcesoSincronizarSaldos,this.jTtoolBarProcesoSincronizarSaldos,this.jTtoolBarDetalleProcesoSincronizarSaldos);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoSincronizarSaldos=this.jTabbedPaneBusquedasProcesoSincronizarSaldos; 
		
		final JPanel jPanelParametrosReportesProcesoSincronizarSaldos=this.jPanelParametrosReportesProcesoSincronizarSaldos;
		//final JScrollPane jScrollPanelDatosProcesoSincronizarSaldos=this.jScrollPanelDatosProcesoSincronizarSaldos;
		final JTable jTableDatosProcesoSincronizarSaldos=this.jTableDatosProcesoSincronizarSaldos;		
		final JPanel jPanelPaginacionProcesoSincronizarSaldos=this.jPanelPaginacionProcesoSincronizarSaldos;
		//final JScrollPane jScrollPanelDatosEdicionProcesoSincronizarSaldos=this.jScrollPanelDatosEdicionProcesoSincronizarSaldos;
		final JPanel jPanelAccionesProcesoSincronizarSaldos=this.jPanelAccionesProcesoSincronizarSaldos;
		
		JPanel jPanelCamposAuxiliarProcesoSincronizarSaldos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoSincronizarSaldos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			jPanelCamposAuxiliarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jPanelCamposProcesoSincronizarSaldos;
			jPanelAccionesFormularioAuxiliarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jPanelAccionesFormularioProcesoSincronizarSaldos;
		}
		
		final JPanel jPanelCamposProcesoSincronizarSaldos=jPanelCamposAuxiliarProcesoSincronizarSaldos;
		final JPanel jPanelAccionesFormularioProcesoSincronizarSaldos=jPanelAccionesFormularioAuxiliarProcesoSincronizarSaldos;
		
		
		final JMenuBar jmenuBarProcesoSincronizarSaldos=this.jmenuBarProcesoSincronizarSaldos;		
		final JToolBar jTtoolBarProcesoSincronizarSaldos=this.jTtoolBarProcesoSincronizarSaldos;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoSincronizarSaldos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoSincronizarSaldos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			jmenuBarDetalleAuxiliarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jmenuBarDetalleProcesoSincronizarSaldos;
			jTtoolBarDetalleAuxiliarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTtoolBarDetalleProcesoSincronizarSaldos;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoSincronizarSaldos=jmenuBarDetalleAuxiliarProcesoSincronizarSaldos;
		final JToolBar jTtoolBarDetalleProcesoSincronizarSaldos=jTtoolBarDetalleAuxiliarProcesoSincronizarSaldos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoSincronizarSaldos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoSincronizarSaldos;
			processRunnable.jTableDatos=jTableDatosProcesoSincronizarSaldos;
			processRunnable.jPanelCampos=jPanelCamposProcesoSincronizarSaldos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoSincronizarSaldos;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoSincronizarSaldos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoSincronizarSaldos;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoSincronizarSaldos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoSincronizarSaldos;
			processRunnable.jTtoolBar=jTtoolBarProcesoSincronizarSaldos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoSincronizarSaldos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoSincronizarSaldos ,jPanelParametrosReportesProcesoSincronizarSaldos, jTableDatosProcesoSincronizarSaldos,/*jScrollPanelDatosProcesoSincronizarSaldos,*/jPanelCamposProcesoSincronizarSaldos,jPanelPaginacionProcesoSincronizarSaldos, /*jScrollPanelDatosEdicionProcesoSincronizarSaldos,*/ jPanelAccionesProcesoSincronizarSaldos,jPanelAccionesFormularioProcesoSincronizarSaldos,jmenuBarProcesoSincronizarSaldos,jmenuBarDetalleProcesoSincronizarSaldos,jTtoolBarProcesoSincronizarSaldos,jTtoolBarDetalleProcesoSincronizarSaldos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoSincronizarSaldos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoSincronizarSaldos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoSincronizarSaldos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoSincronizarSaldos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoSincronizarSaldos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoSincronizarSaldos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoSincronizarSaldos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoSincronizarSaldos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoSincronizarSaldos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesosincronizarsaldosConstantesFunciones.getsFinalQueryProcesoSincronizarSaldos();
		String  finalQueryPaginacionTodos=this.procesosincronizarsaldosConstantesFunciones.getsFinalQueryProcesoSincronizarSaldos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoSincronizarSaldosConstantesFunciones.getArrayColumnasGlobalesNoProcesoSincronizarSaldos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoSincronizarSaldosConstantesFunciones.getArrayColumnasGlobalesProcesoSincronizarSaldos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoSincronizarSaldosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesosincronizarsaldossEliminados= new ArrayList<ProcesoSincronizarSaldos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoSincronizarSaldos();
		
				///*ProcesoSincronizarSaldosSessionBean*/this.procesosincronizarsaldosSessionBean=new ProcesoSincronizarSaldosSessionBean();
			
			if(this.procesosincronizarsaldosSessionBean==null) {
				this.procesosincronizarsaldosSessionBean=new ProcesoSincronizarSaldosSessionBean();
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
					this.iNumeroPaginacion=ProcesoSincronizarSaldosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoSincronizarSaldosConstantesFunciones.getClassesForeignKeysOfProcesoSincronizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesosincronizarsaldos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesosincronizarsaldossAux= new ArrayList<ProcesoSincronizarSaldos>();
			
				
			procesosincronizarsaldosLogic.setDatosCliente(this.datosCliente);
			procesosincronizarsaldosLogic.setDatosDeep(this.datosDeep);
			procesosincronizarsaldosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoSincronizarSaldos")) {
				this.sDetalleReporte=ProcesoSincronizarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoSincronizarSaldos(id_ejercicioBusquedaProcesoSincronizarSaldos,id_periodoBusquedaProcesoSincronizarSaldos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesosincronizarsaldosLogic.getProcesoSincronizarSaldossBusquedaProcesoSincronizarSaldos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaProcesoSincronizarSaldos,id_periodoBusquedaProcesoSincronizarSaldos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoSincronizarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoSincronizarSaldos(id_ejercicioBusquedaProcesoSincronizarSaldos,id_periodoBusquedaProcesoSincronizarSaldos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoSincronizarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoSincronizarSaldos(id_ejercicioBusquedaProcesoSincronizarSaldos,id_periodoBusquedaProcesoSincronizarSaldos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()==null||procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesosincronizarsaldoss==null|| procesosincronizarsaldoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesosincronizarsaldossAux=new ArrayList<ProcesoSincronizarSaldos>();
						procesosincronizarsaldossAux.addAll(procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesosincronizarsaldossAux=new ArrayList<ProcesoSincronizarSaldos>();
							procesosincronizarsaldossAux.addAll(procesosincronizarsaldoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesosincronizarsaldosLogic.getProcesoSincronizarSaldossBusquedaProcesoSincronizarSaldos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaProcesoSincronizarSaldos,id_periodoBusquedaProcesoSincronizarSaldos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoSincronizarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoSincronizarSaldos(id_ejercicioBusquedaProcesoSincronizarSaldos,id_periodoBusquedaProcesoSincronizarSaldos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoSincronizarSaldosConstantesFunciones.getDetalleIndiceBusquedaProcesoSincronizarSaldos(id_ejercicioBusquedaProcesoSincronizarSaldos,id_periodoBusquedaProcesoSincronizarSaldos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoSincronizarSaldoss("BusquedaProcesoSincronizarSaldos",procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoSincronizarSaldoss("BusquedaProcesoSincronizarSaldos",procesosincronizarsaldoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesosincronizarsaldosLogic.setProcesoSincronizarSaldoss(new ArrayList<ProcesoSincronizarSaldos>());
						procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().addAll(procesosincronizarsaldossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesosincronizarsaldoss=new ArrayList<ProcesoSincronizarSaldos>();
							procesosincronizarsaldoss.addAll(procesosincronizarsaldossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoSincronizarSaldos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoSincronizarSaldos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesosincronizarsaldoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesosincronizarsaldoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoSincronizarSaldos procesosincronizarsaldos) {
		Boolean permite=true;
		
		if(this.procesosincronizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoSincronizarSaldosConstantesFunciones.getOrderByListaProcesoSincronizarSaldos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoSincronizarSaldosConstantesFunciones.getOrderByListaProcesoSincronizarSaldos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldos:procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
				if(procesosincronizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesosincronizarsaldosTotales=procesosincronizarsaldos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldos:this.procesosincronizarsaldoss) {
				if(procesosincronizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesosincronizarsaldosTotales=procesosincronizarsaldos;
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
			this.procesosincronizarsaldosAux=new ProcesoSincronizarSaldos();
			this.procesosincronizarsaldosAux.setsType(Constantes2.S_TOTALES);
			this.procesosincronizarsaldosAux.setIsNew(false);
			this.procesosincronizarsaldosAux.setIsChanged(false);
			this.procesosincronizarsaldosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoSincronizarSaldosConstantesFunciones.TotalizarValoresFilaProcesoSincronizarSaldos(this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss(),this.procesosincronizarsaldosAux);
				
				//this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().add(this.procesosincronizarsaldosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoSincronizarSaldosConstantesFunciones.TotalizarValoresFilaProcesoSincronizarSaldos(this.procesosincronizarsaldoss,this.procesosincronizarsaldosAux);
				
				this.procesosincronizarsaldoss.add(this.procesosincronizarsaldosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesosincronizarsaldosTotales=new ProcesoSincronizarSaldos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().remove(procesosincronizarsaldosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesosincronizarsaldoss.remove(procesosincronizarsaldosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesosincronizarsaldosTotales=new ProcesoSincronizarSaldos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldos:procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
				if(procesosincronizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesosincronizarsaldosTotales=procesosincronizarsaldos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoSincronizarSaldosConstantesFunciones.TotalizarValoresFilaProcesoSincronizarSaldos(this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss(),procesosincronizarsaldosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoSincronizarSaldos procesosincronizarsaldos:this.procesosincronizarsaldoss) {
				if(procesosincronizarsaldos.getsType().equals(Constantes2.S_TOTALES)) {
					procesosincronizarsaldosTotales=procesosincronizarsaldos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoSincronizarSaldosConstantesFunciones.TotalizarValoresFilaProcesoSincronizarSaldos(this.procesosincronizarsaldoss,procesosincronizarsaldosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoSincronizarSaldossBusquedaProcesoSincronizarSaldos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoSincronizarSaldos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoSincronizarSaldossBusquedaProcesoSincronizarSaldos(String sFinalQuery,Long id_ejercicio,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesosincronizarsaldosLogic.getProcesoSincronizarSaldossBusquedaProcesoSincronizarSaldos(sFinalQuery,this.pagination,id_ejercicio,id_periodo);
				
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
	
	public void inicializarPermisosProcesoSincronizarSaldos() {
		this.isPermisoTodoProcesoSincronizarSaldos=false;
		this.isPermisoNuevoProcesoSincronizarSaldos=false;
		this.isPermisoActualizarProcesoSincronizarSaldos=false;
		this.isPermisoActualizarOriginalProcesoSincronizarSaldos=false;
		this.isPermisoEliminarProcesoSincronizarSaldos=false;
		this.isPermisoGuardarCambiosProcesoSincronizarSaldos=false;
		this.isPermisoConsultaProcesoSincronizarSaldos=true;
		this.isPermisoBusquedaProcesoSincronizarSaldos=true;
		this.isPermisoReporteProcesoSincronizarSaldos=true;
		this.isPermisoOrdenProcesoSincronizarSaldos=false;		
		this.isPermisoPaginacionMedioProcesoSincronizarSaldos=false;		
		this.isPermisoPaginacionAltoProcesoSincronizarSaldos=false;		
		this.isPermisoPaginacionTodoProcesoSincronizarSaldos=false;		
		this.isPermisoCopiarProcesoSincronizarSaldos=false;		
		this.isPermisoVerFormProcesoSincronizarSaldos=false;		
		this.isPermisoDuplicarProcesoSincronizarSaldos=false;
		this.isPermisoOrdenProcesoSincronizarSaldos=false;
	}
	
	public void setPermisosUsuarioProcesoSincronizarSaldos(Boolean isPermiso) {
		this.isPermisoTodoProcesoSincronizarSaldos=isPermiso;
		this.isPermisoNuevoProcesoSincronizarSaldos=isPermiso;
		this.isPermisoActualizarProcesoSincronizarSaldos=isPermiso;
		this.isPermisoActualizarOriginalProcesoSincronizarSaldos=isPermiso;
		this.isPermisoEliminarProcesoSincronizarSaldos=isPermiso;
		this.isPermisoGuardarCambiosProcesoSincronizarSaldos=isPermiso;
		this.isPermisoConsultaProcesoSincronizarSaldos=isPermiso;
		this.isPermisoBusquedaProcesoSincronizarSaldos=isPermiso;
		this.isPermisoReporteProcesoSincronizarSaldos=isPermiso;
		this.isPermisoOrdenProcesoSincronizarSaldos=isPermiso;		
		this.isPermisoPaginacionMedioProcesoSincronizarSaldos=isPermiso;		
		this.isPermisoPaginacionAltoProcesoSincronizarSaldos=isPermiso;		
		this.isPermisoPaginacionTodoProcesoSincronizarSaldos=isPermiso;		
		this.isPermisoCopiarProcesoSincronizarSaldos=isPermiso;		
		this.isPermisoVerFormProcesoSincronizarSaldos=isPermiso;		
		this.isPermisoDuplicarProcesoSincronizarSaldos=isPermiso;
		this.isPermisoOrdenProcesoSincronizarSaldos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoSincronizarSaldos(Boolean isPermiso) {
		//this.isPermisoTodoProcesoSincronizarSaldos=isPermiso;
		this.isPermisoNuevoProcesoSincronizarSaldos=isPermiso;
		this.isPermisoActualizarProcesoSincronizarSaldos=isPermiso;
		this.isPermisoActualizarOriginalProcesoSincronizarSaldos=isPermiso;
		this.isPermisoEliminarProcesoSincronizarSaldos=isPermiso;
		this.isPermisoGuardarCambiosProcesoSincronizarSaldos=isPermiso;
		//this.isPermisoConsultaProcesoSincronizarSaldos=isPermiso;
		//this.isPermisoBusquedaProcesoSincronizarSaldos=isPermiso;
		//this.isPermisoReporteProcesoSincronizarSaldos=isPermiso;
		//this.isPermisoOrdenProcesoSincronizarSaldos=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoSincronizarSaldos=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoSincronizarSaldos=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoSincronizarSaldos=isPermiso;		
		//this.isPermisoCopiarProcesoSincronizarSaldos=isPermiso;		
		//this.isPermisoDuplicarProcesoSincronizarSaldos=isPermiso;
		//this.isPermisoOrdenProcesoSincronizarSaldos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoSincronizarSaldosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoSincronizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoSincronizarSaldos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoSincronizarSaldosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoSincronizarSaldosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoSincronizarSaldosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoSincronizarSaldosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoSincronizarSaldos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoSincronizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoSincronizarSaldosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoSincronizarSaldos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoSincronizarSaldos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoSincronizarSaldos=this.isPermisoActualizarProcesoSincronizarSaldos;
			this.isPermisoEliminarProcesoSincronizarSaldos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoSincronizarSaldos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoSincronizarSaldos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoSincronizarSaldos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoSincronizarSaldos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoSincronizarSaldos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoSincronizarSaldos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoSincronizarSaldos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoSincronizarSaldos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoSincronizarSaldos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoSincronizarSaldos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoSincronizarSaldos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoSincronizarSaldos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoSincronizarSaldos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoSincronizarSaldos.setToolTipText(this.jTableDatosProcesoSincronizarSaldos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoSincronizarSaldos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoSincronizarSaldos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoSincronizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoSincronizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoSincronizarSaldos() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoSincronizarSaldosListas()throws Exception {
		try	{						
			
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoSincronizarSaldosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoSincronizarSaldosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoSincronizarSaldos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {
			if(this.procesosincronizarsaldosSessionBean==null) {
				this.procesosincronizarsaldosSessionBean=new ProcesoSincronizarSaldosSessionBean();
			}

			if(!this.procesosincronizarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.procesosincronizarsaldosSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoSincronizarSaldos()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEjercicio("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoSincronizarSaldos(String sFormularioTipoBusqueda)throws Exception {
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
					if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.addItemListener(new ComboBoxItemListener(this,"id_ejercicioProcesoSincronizarSaldos"));
						this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioProcesoSincronizarSaldos"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
						this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.addActionListener(new ComboBoxActionListener(this,"id_ejercicioProcesoSincronizarSaldos"));
						this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioProcesoSincronizarSaldos"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos"));

						this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos"));

					} else {
						this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos"));

						this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProcesoSincronizarSaldos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoSincronizarSaldos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoSincronizarSaldos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoSincronizarSaldos()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoSincronizarSaldos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoSincronizarSaldos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoSincronizarSaldos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoSincronizarSaldos()throws Exception {
		try {
			

			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoSincronizarSaldos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoSincronizarSaldos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos!=null && this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos!=null && this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormProcesoSincronizarSaldosEjercicio(JComboBox<?> jComboBoxGenericoEjercicio,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProcesoSincronizarSaldosid_periodo(jComboBoxGenericoEjercicio,sFormularioTipoBusqueda,"Ejercicio",false);
	}


	
	



	public void recargarFormProcesoSincronizarSaldosid_periodo(JComboBox<?> jComboBoxGenericoPeriodo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Ejercicio")){
				this.setActualParaGuardarEjercicioForeignKey(this.procesosincronizarsaldos,jComboBoxGenericoPeriodo);
			}

			if(this.procesosincronizarsaldos.getid_ejercicio()!=null && this.procesosincronizarsaldos.getid_ejercicio()!=0L) {
				sFinalQuery+="  WHERE  id_ejercicio="+this.procesosincronizarsaldos.getid_ejercicio();
			} else {
				sFinalQuery+="  WHERE  id_ejercicio=-1";
			}



			//BUCLE RECURSIVO
			this.setActualPeriodoForeignKey(this.procesosincronizarsaldos.getid_ejercicio(),true,sFormularioTipoBusqueda);

			this.cargarCombosPeriodosForeignKeyLista(sFinalQuery);

			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProcesoSincronizarSaldosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoSincronizarSaldosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoSincronizarSaldosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesosincronizarsaldosSessionBean=new ProcesoSincronizarSaldosSessionBean(); 
		this.procesosincronizarsaldosConstantesFunciones=new ProcesoSincronizarSaldosConstantesFunciones(); 
		this.procesosincronizarsaldosBean=new ProcesoSincronizarSaldos();//(this.procesosincronizarsaldosConstantesFunciones); 		
		this.procesosincronizarsaldosReturnGeneral=new ProcesoSincronizarSaldosParameterReturnGeneral(); 
		
		this.procesosincronizarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesosincronizarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoSincronizarSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoSincronizarSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoSincronizarSaldosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoSincronizarSaldos(true);
			
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
			
			this.procesosincronizarsaldosConstantesFunciones=new ProcesoSincronizarSaldosConstantesFunciones(); 
			this.procesosincronizarsaldosBean=new ProcesoSincronizarSaldos();//this.procesosincronizarsaldosConstantesFunciones); 			
			this.procesosincronizarsaldosReturnGeneral=new ProcesoSincronizarSaldosParameterReturnGeneral(); 
		
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sincronizar Saldos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesosincronizarsaldos=new ProcesoSincronizarSaldos();
			this.procesosincronizarsaldoss = new ArrayList<ProcesoSincronizarSaldos>();
			this.procesosincronizarsaldossAux = new ArrayList<ProcesoSincronizarSaldos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic=new ProcesoSincronizarSaldosLogic();
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			//this.procesosincronizarsaldosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesosincronizarsaldosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoSincronizarSaldos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos);	
					}
					
					if(this.jInternalFrameImportacionProcesoSincronizarSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoSincronizarSaldos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoSincronizarSaldos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoSincronizarSaldos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoSincronizarSaldos);
				this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setVisible(false);
				this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos);
					this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoSincronizarSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoSincronizarSaldos);
					this.jInternalFrameImportacionProcesoSincronizarSaldos.setVisible(false);
					this.jInternalFrameImportacionProcesoSincronizarSaldos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoSincronizarSaldos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoSincronizarSaldos);
					this.jInternalFrameOrderByProcesoSincronizarSaldos.setVisible(false);
					this.jInternalFrameOrderByProcesoSincronizarSaldos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoSincronizarSaldosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoSincronizarSaldosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesosincronizarsaldosReturnGeneral=new ProcesoSincronizarSaldosParameterReturnGeneral();
			
			this.procesosincronizarsaldosParameterGeneral=new ProcesoSincronizarSaldosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesosincronizarsaldosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoSincronizarSaldosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoSincronizarSaldosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado(),this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoSincronizarSaldosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado(),this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaDuplicarProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaCopiarProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaVerFormProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaOrdenProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=false;
			
			
			this.isVisibilidadBusquedaProcesoSincronizarSaldos=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoSincronizarSaldos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoSincronizarSaldos(false);
			
			this.setPermisosUsuarioProcesoSincronizarSaldos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado() 
				|| (this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado() && this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoSincronizarSaldosClasesRelacionadas();
			}
			
			if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoSincronizarSaldosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoSincronizarSaldos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoSincronizarSaldos();
			}
			
			if(!this.isPermisoBusquedaProcesoSincronizarSaldos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoSincronizarSaldosConstantesFunciones.getTiposSeleccionarProcesoSincronizarSaldos());
				
				this.tiposColumnasSelect=ProcesoSincronizarSaldosConstantesFunciones.getTiposSeleccionarProcesoSincronizarSaldos(true);
				
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
			//if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoSincronizarSaldos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoSincronizarSaldos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoSincronizarSaldos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoSincronizarSaldos() ;
			
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
				procesosincronizarsaldosImplementable= (ProcesoSincronizarSaldosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoSincronizarSaldosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesosincronizarsaldosImplementableHome= (ProcesoSincronizarSaldosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoSincronizarSaldosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesosincronizarsaldoss= new ArrayList<ProcesoSincronizarSaldos>();
			this.procesosincronizarsaldossEliminados= new ArrayList<ProcesoSincronizarSaldos>();
						
			this.isEsNuevoProcesoSincronizarSaldos=false;
			this.esParaAccionDesdeFormularioProcesoSincronizarSaldos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoSincronizarSaldos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoSincronizarSaldos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoSincronizarSaldosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoSincronizarSaldos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoSincronizarSaldos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoSincronizarSaldos();
			}
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoSincronizarSaldos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoSincronizarSaldos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoSincronizarSaldos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoSincronizarSaldos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoSincronizarSaldos")) {
				iIndex=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTabbedPaneRelacionesProcesoSincronizarSaldos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTabbedPaneRelacionesProcesoSincronizarSaldos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoSincronizarSaldos();	
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
	
	public void cargarCombosForeignKeyProcesoSincronizarSaldos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoSincronizarSaldos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoSincronizarSaldos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoSincronizarSaldosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoSincronizarSaldos();
		
		this.cargarCombosFrameForeignKeyProcesoSincronizarSaldos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoSincronizarSaldos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoSincronizarSaldos();
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
	
	public void jButtonNuevoProcesoSincronizarSaldosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
			
			if(jTableDatosProcesoSincronizarSaldos.getRowCount()>=1) {
				jTableDatosProcesoSincronizarSaldos.removeRowSelectionInterval(0, jTableDatosProcesoSincronizarSaldos.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoSincronizarSaldos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoSincronizarSaldos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoSincronizarSaldos(true);			
			//this.procesosincronizarsaldos=new ProcesoSincronizarSaldos();
			//this.procesosincronizarsaldos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoSincronizarSaldos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos() ;
			
			if(ProcesoSincronizarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoSincronizarSaldos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesosincronizarsaldos);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);				
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
			if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoSincronizarSaldos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoSincronizarSaldosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoSincronizarSaldos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoSincronizarSaldos.getSelectedRows().length;			
			}
			
			procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoSincronizarSaldos--;			
				//ProcesoSincronizarSaldos procesosincronizarsaldosAux= new ProcesoSincronizarSaldos();			
				//procesosincronizarsaldosAux.setId(this.iIdNuevoProcesoSincronizarSaldos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoSincronizarSaldos procesosincronizarsaldosOrigen=new ProcesoSincronizarSaldos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoSincronizarSaldos procesosincronizarsaldosOrigen : procesosincronizarsaldossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesosincronizarsaldosOrigen =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesosincronizarsaldosOrigen =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoSincronizarSaldos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesosincronizarsaldos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoSincronizarSaldos(procesosincronizarsaldosOrigen,this.procesosincronizarsaldos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().add(this.procesosincronizarsaldosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesosincronizarsaldoss.add(this.procesosincronizarsaldosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
				
				this.jTableDatosProcesoSincronizarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoSincronizarSaldos(), this.getIndiceNuevoProcesoSincronizarSaldos());
				
				int iLastRow =  this.jTableDatosProcesoSincronizarSaldos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoSincronizarSaldos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoSincronizarSaldos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();									
		
			ProcesoSincronizarSaldos procesosincronizarsaldosOrigen=new ProcesoSincronizarSaldos();
			ProcesoSincronizarSaldos procesosincronizarsaldosDestino=new ProcesoSincronizarSaldos();
				
			procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoSincronizarSaldos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesosincronizarsaldossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoSincronizarSaldos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesosincronizarsaldosOrigen =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesosincronizarsaldosOrigen =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesosincronizarsaldosDestino =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesosincronizarsaldosDestino =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesosincronizarsaldosOrigen =procesosincronizarsaldossSeleccionados.get(0);
				procesosincronizarsaldosDestino =procesosincronizarsaldossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoSincronizarSaldos(procesosincronizarsaldosOrigen,procesosincronizarsaldosDestino,true,false);
				
				procesosincronizarsaldosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesosincronizarsaldosDestino,procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesosincronizarsaldosDestino,procesosincronizarsaldoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
				
				//this.jTableDatosProcesoSincronizarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoSincronizarSaldos(), this.getIndiceNuevoProcesoSincronizarSaldos());
				
				int iLastRow =  this.jTableDatosProcesoSincronizarSaldos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoSincronizarSaldos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoSincronizarSaldos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoSincronizarSaldos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(!isVisible);
			this.jPanelPaginacionProcesoSincronizarSaldos.setVisible(!isVisible);
			this.jPanelAccionesProcesoSincronizarSaldos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoSincronizarSaldos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoSincronizarSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoSincronizarSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoSincronizarSaldos();
			
			this.abrirFrameOrderByProcesoSincronizarSaldos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoSincronizarSaldos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoSincronizarSaldos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoSincronizarSaldos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setSize(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.iWidthFormulario,this.jInternalFrameDetalleFormProcesoSincronizarSaldos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoSincronizarSaldos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoSincronizarSaldos.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jContentPaneDetalleProcesoSincronizarSaldos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTabbedPaneRelacionesProcesoSincronizarSaldos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jContentPaneDetalleProcesoSincronizarSaldos.getWidth(),ProcesoSincronizarSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTabbedPaneRelacionesProcesoSincronizarSaldos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jContentPaneDetalleProcesoSincronizarSaldos.getWidth(),ProcesoSincronizarSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTabbedPaneRelacionesProcesoSincronizarSaldos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jContentPaneDetalleProcesoSincronizarSaldos.getWidth(),ProcesoSincronizarSaldosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoSincronizarSaldos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoSincronizarSaldos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoSincronizarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoSincronizarSaldos,false,this);
				} else {
					this.jInternalFrameOrderByProcesoSincronizarSaldos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoSincronizarSaldos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoSincronizarSaldos);
				this.jInternalFrameOrderByProcesoSincronizarSaldos.setVisible(false);
				this.jInternalFrameOrderByProcesoSincronizarSaldos.setSelected(false);
				
				this.jInternalFrameOrderByProcesoSincronizarSaldos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoSincronizarSaldos"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoSincronizarSaldos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoSincronizarSaldos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoSincronizarSaldos==null) {
				
				this.jInternalFrameImportacionProcesoSincronizarSaldos=new ImportacionJInternalFrame(ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoSincronizarSaldos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoSincronizarSaldos);
				this.jInternalFrameImportacionProcesoSincronizarSaldos.setVisible(false);
				this.jInternalFrameImportacionProcesoSincronizarSaldos.setSelected(false);


				this.jInternalFrameImportacionProcesoSincronizarSaldos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoSincronizarSaldos"));
				this.jInternalFrameImportacionProcesoSincronizarSaldos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoSincronizarSaldos"));
				this.jInternalFrameImportacionProcesoSincronizarSaldos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoSincronizarSaldos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoSincronizarSaldos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos==null) {
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos=new ReporteDinamicoJInternalFrame(ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos);
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoSincronizarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoSincronizarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoSincronizarSaldos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoSincronizarSaldos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoSincronizarSaldos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoSincronizarSaldos);
			
	       	this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoSincronizarSaldos.dispose();
			//this.jInternalFrameDetalleFormProcesoSincronizarSaldos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoSincronizarSaldos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoSincronizarSaldos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoSincronizarSaldos.setVisible(true);
	        this.jInternalFrameImportacionProcesoSincronizarSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoSincronizarSaldos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setVisible(true);
	        this.jInternalFrameOrderByProcesoSincronizarSaldos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoSincronizarSaldos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoSincronizarSaldos.setVisible(false);
	        this.jInternalFrameOrderByProcesoSincronizarSaldos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoSincronizarSaldos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoSincronizarSaldos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoSincronizarSaldos.setVisible(false);
	        this.jInternalFrameImportacionProcesoSincronizarSaldos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoSincronizarSaldos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoSincronizarSaldos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoSincronizarSaldos(true);
			//this.isEsNuevoProcesoSincronizarSaldos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoSincronizarSaldos(false) ;
			
			if(procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoSincronizarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoSincronizarSaldos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoSincronizarSaldosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoSincronizarSaldos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoSincronizarSaldos(true);
			//this.isEsNuevoProcesoSincronizarSaldos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesosincronizarsaldos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoSincronizarSaldos(false) ;
			
			if(ProcesoSincronizarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoSincronizarSaldos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaPeriodo(List<Periodo> periodosForeignKey)throws Exception{
		TableColumn tableColumnPeriodo=this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSincronizarSaldos,ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO));
		TableCellEditor tableCellEditorPeriodo =tableColumnPeriodo.getCellEditor();

		PeriodoTableCell periodoTableCellFk=(PeriodoTableCell)tableCellEditorPeriodo;

		if(periodoTableCellFk!=null) {
			periodoTableCellFk.setperiodosForeignKey(periodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periodoTableCellFk.setRowActual(intSelectedRow);
			//periodoTableCellFk.setperiodosForeignKeyActual(periodosForeignKey);
		//}


		if(periodoTableCellFk!=null) {
			periodoTableCellFk.RecargarPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoSincronizarSaldos(false);
			
			//if(!this.isEsNuevoProcesoSincronizarSaldos) {								
				int intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.procesosincronizarsaldos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
				
			}
			
			if(this.permiteMantenimiento(this.procesosincronizarsaldos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoSincronizarSaldos=true;
					this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
					this.isEsNuevoProcesoSincronizarSaldos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoSincronizarSaldos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoSincronizarSaldos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoSincronizarSaldos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos(false);
				
				this.habilitarDeshabilitarControlesProcesoSincronizarSaldos(false);
			
												
				
				if(ProcesoSincronizarSaldosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoSincronizarSaldos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,procesosincronizarsaldosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoSincronizarSaldos(this.procesosincronizarsaldos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoSincronizarSaldos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesosincronizarsaldosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesosincronizarsaldos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				this.procesosincronizarsaldos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				this.procesosincronizarsaldos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesosincronizarsaldos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoSincronizarSaldosModel) this.jTableDatosProcesoSincronizarSaldos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoSincronizarSaldos=true;
				this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
				this.isEsNuevoProcesoSincronizarSaldos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoSincronizarSaldos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos(false);
				
				this.habilitarDeshabilitarControlesProcesoSincronizarSaldos(false);
				
				
				
				if(ProcesoSincronizarSaldosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoSincronizarSaldos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoSincronizarSaldos.getRowCount()>=1) {
				jTableDatosProcesoSincronizarSaldos.removeRowSelectionInterval(0, jTableDatosProcesoSincronizarSaldos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoSincronizarSaldos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoSincronizarSaldos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos(false) ;
			
			this.isEsNuevoProcesoSincronizarSaldos=false;
			
			if(ProcesoSincronizarSaldosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoSincronizarSaldos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
				
				//SI ES MANUAL
				if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoSincronizarSaldos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoSincronizarSaldos--;			
			//ProcesoSincronizarSaldos procesosincronizarsaldosAux= new ProcesoSincronizarSaldos();			
			//procesosincronizarsaldosAux.setId(this.iIdNuevoProcesoSincronizarSaldos);
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoSincronizarSaldos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
			
			this.procesosincronizarsaldos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().add(this.procesosincronizarsaldosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesosincronizarsaldoss.add(this.procesosincronizarsaldosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
			
			this.jTableDatosProcesoSincronizarSaldos.setRowSelectionInterval(this.getIndiceNuevoProcesoSincronizarSaldos(), this.getIndiceNuevoProcesoSincronizarSaldos());
			
			int iLastRow =  this.jTableDatosProcesoSincronizarSaldos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoSincronizarSaldos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoSincronizarSaldos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoSincronizarSaldos();
			}
			
			//this.abrirFrameTreeProcesoSincronizarSaldos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoSincronizarSaldos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoSincronizarSaldos.setFileImportacion(this.jInternalFrameImportacionProcesoSincronizarSaldos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoSincronizarSaldos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoSincronizarSaldos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoSincronizarSaldos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoSincronizarSaldos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();		

		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoSincronizarSaldosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoSincronizarSaldosBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoSincronizarSaldoss("Todos",procesosincronizarsaldossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sincronizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
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
		
		if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();		
		
		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosincronizarsaldos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoSincronizarSaldoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ProcesoSincronizarSaldos procesosincronizarsaldos:procesosincronizarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosincronizarsaldos.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(ProcesoSincronizarSaldos procesosincronizarsaldos:procesosincronizarsaldossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesosincronizarsaldos.getperiodo_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesoSincronizarSaldos(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoSincronizarSaldos(procesosincronizarsaldosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sincronizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoSincronizarSaldos(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoSincronizarSaldos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoSincronizarSaldos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
			
			//SI ES MANUAL
			if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoSincronizarSaldos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoSincronizarSaldos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoSincronizarSaldos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoSincronizarSaldos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoSincronizarSaldos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoSincronizarSaldos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoSincronizarSaldos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoSincronizarSaldos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoSincronizarSaldos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoSincronizarSaldos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoSincronizarSaldos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoSincronizarSaldos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoSincronizarSaldos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoSincronizarSaldos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoSincronizarSaldos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoSincronizarSaldos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoSincronizarSaldos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoSincronizarSaldos();
		
		this.inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoSincronizarSaldos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoSincronizarSaldos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoSincronizarSaldos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoSincronizarSaldos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoSincronizarSaldos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jCheckBoxPostAccionNuevoProcesoSincronizarSaldos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jCheckBoxPostAccionSinCerrarProcesoSincronizarSaldos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jCheckBoxPostAccionSinMensajeProcesoSincronizarSaldos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoSincronizarSaldos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoSincronizarSaldos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
				this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jCheckBoxPostAccionNuevoProcesoSincronizarSaldos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jCheckBoxPostAccionSinCerrarProcesoSincronizarSaldos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jCheckBoxPostAccionSinMensajeProcesoSincronizarSaldos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoSincronizarSaldos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoSincronizarSaldos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoSincronizarSaldos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoSincronizarSaldos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoSincronizarSaldos() throws Exception {
		try	{
			if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoSincronizarSaldos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoSincronizarSaldos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoSincronizarSaldos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoSincronizarSaldos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoSincronizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoSincronizarSaldos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoSincronizarSaldos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.addItem(reporte);
			}
			
			
			if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoSincronizarSaldos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoSincronizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoSincronizarSaldos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoSincronizarSaldos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoSincronizarSaldos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos!=null) {
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos!=null) {
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoSincronizarSaldos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.getSelectedItem()!=null){this.id_ejercicioBusquedaProcesoSincronizarSaldos=((Ejercicio)this.jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.getSelectedItem()!=null){this.id_periodoBusquedaProcesoSincronizarSaldos=((Periodo)this.jComboBoxid_periodoBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoSincronizarSaldos(Boolean esInicializar) throws Exception {				
		if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoSincronizarSaldos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoSincronizarSaldos() throws Exception {
		this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoSincronizarSaldos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoSincronizarSaldosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoSincronizarSaldosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoSincronizarSaldosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSincronizarSaldosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoSincronizarSaldosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoSincronizarSaldosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoSincronizarSaldos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesosincronizarsaldoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoSincronizarSaldos.setModel(new ProcesoSincronizarSaldosModel(this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoSincronizarSaldos.setModel(new ProcesoSincronizarSaldosModel(this.procesosincronizarsaldoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoSincronizarSaldos!=null && this.jInternalFrameOrderByProcesoSincronizarSaldos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoSincronizarSaldos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSincronizarSaldos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoSincronizarSaldosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO,procesosincronizarsaldosConstantesFunciones.resaltarSeleccionarProcesoSincronizarSaldos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoSincronizarSaldosConstantesFunciones.SCLASSWEBTITULO,procesosincronizarsaldosConstantesFunciones.resaltarSeleccionarProcesoSincronizarSaldos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSincronizarSaldos,ProcesoSincronizarSaldosConstantesFunciones.LABEL_ID));

		if(this.procesosincronizarsaldosConstantesFunciones.mostraridProcesoSincronizarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSincronizarSaldosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesosincronizarsaldosConstantesFunciones.resaltaridProcesoSincronizarSaldos,this.procesosincronizarsaldosConstantesFunciones.activaridProcesoSincronizarSaldos,this,true,"idProcesoSincronizarSaldos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesosincronizarsaldosConstantesFunciones.resaltaridProcesoSincronizarSaldos,this.procesosincronizarsaldosConstantesFunciones.activaridProcesoSincronizarSaldos,this,true,"idProcesoSincronizarSaldos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoSincronizarSaldos,ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.procesosincronizarsaldosConstantesFunciones.mostrarid_ejercicioProcesoSincronizarSaldos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.procesosincronizarsaldosConstantesFunciones.resaltarid_ejercicioProcesoSincronizarSaldos,this,this.procesosincronizarsaldosConstantesFunciones.activarid_ejercicioProcesoSincronizarSaldos));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.procesosincronizarsaldosConstantesFunciones.resaltarid_ejercicioProcesoSincronizarSaldos,this,this.procesosincronizarsaldosConstantesFunciones.activarid_ejercicioProcesoSincronizarSaldos,false,"id_ejercicioProcesoSincronizarSaldos","GLOBAL-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoSincronizarSaldosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoSincronizarSaldos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoSincronizarSaldos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoSincronizarSaldos.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoSincronizarSaldos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoSincronizarSaldos.moveColumn(this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoSincronizarSaldos.moveColumn(this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoSincronizarSaldos.moveColumn(this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoSincronizarSaldos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoSincronizarSaldos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoSincronizarSaldos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoSincronizarSaldos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoSincronizarSaldos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoSincronizarSaldos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesosincronizarsaldoss.size()-1;
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
		//this.jTableDatosProcesoSincronizarSaldos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoSincronizarSaldos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoSincronizarSaldos();
			
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
				
				//this.isEsNuevoProcesoSincronizarSaldos=false;
					
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
				if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoSincronizarSaldos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesosincronizarsaldos.getsType().equals("DUPLICADO")
				   || this.procesosincronizarsaldos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoSincronizarSaldos=true;
				
				} else {
					this.isEsNuevoProcesoSincronizarSaldos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
					if(this.procesosincronizarsaldos.getId()>=0 && !this.procesosincronizarsaldos.getIsNew()) {						
						this.isEsNuevoProcesoSincronizarSaldos=false;
						
					} else {
						this.isEsNuevoProcesoSincronizarSaldos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoSincronizarSaldos(esRelaciones);						
				
				this.seleccionarProcesoSincronizarSaldos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesosincronizarsaldos.getId()<0) {
					this.isEsNuevoProcesoSincronizarSaldos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoSincronizarSaldos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoSincronizarSaldos(evt,rowIndex);
				}	
				
				if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoSincronizarSaldos: " + this.dDif); 
					}
				}								
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoSincronizarSaldos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesosincronizarsaldos)) {
					if(this.procesosincronizarsaldos.getId()>0) {
						this.procesosincronizarsaldos.setIsDeleted(true);
						
						this.procesosincronizarsaldossEliminados.add(this.procesosincronizarsaldos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().remove(this.procesosincronizarsaldos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesosincronizarsaldoss.remove(this.procesosincronizarsaldos);				
					}
					
					
					((ProcesoSincronizarSaldosModel) this.jTableDatosProcesoSincronizarSaldos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoSincronizarSaldos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoSincronizarSaldos) {
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoSincronizarSaldos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoSincronizarSaldos(this.procesosincronizarsaldos);
				}
				
				//ARCHITECTURE
				try {
					

					//Ejercicio
					if(!this.procesosincronizarsaldosConstantesFunciones.cargarid_ejercicioProcesoSincronizarSaldos || this.procesosincronizarsaldosConstantesFunciones.event_dependid_ejercicioProcesoSincronizarSaldos) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.procesosincronizarsaldos.getid_ejercicio());
									//this.inicializarActualizarBindingProcesoSincronizarSaldos(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(procesosincronizarsaldos.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(procesosincronizarsaldos.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.procesosincronizarsaldos.getid_ejercicio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoSincronizarSaldos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoSincronizarSaldos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoSincronizarSaldos(procesosincronizarsaldos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoSincronizarSaldos(procesosincronizarsaldos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoSincronizarSaldos(procesosincronizarsaldos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoSincronizarSaldos(procesosincronizarsaldos);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.setText(procesosincronizarsaldos.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoSincronizarSaldos procesosincronizarsaldosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesosincronizarsaldosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoSincronizarSaldos procesosincronizarsaldosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesosincronizarsaldosLocal=this.procesosincronizarsaldos;
			} else {
				procesosincronizarsaldosLocal=this.procesosincronizarsaldosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesosincronizarsaldosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoSincronizarSaldos(procesosincronizarsaldosLocal,true);
					
					if(procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesosincronizarsaldosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesosincronizarsaldosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(procesosincronizarsaldos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(procesosincronizarsaldos);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(procesosincronizarsaldos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.getText()==null || this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.getText()=="" || this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.setText("0");
			}

			if(conColumnasBase) {procesosincronizarsaldos.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoSincronizarSaldosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelIdProcesoSincronizarSaldos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldosBean,ProcesoSincronizarSaldos procesosincronizarsaldos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldosOrigen,ProcesoSincronizarSaldos procesosincronizarsaldos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesosincronizarsaldosOrigen.getId()!=null && !procesosincronizarsaldosOrigen.getId().equals(0L))) {procesosincronizarsaldos.setId(procesosincronizarsaldosOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.setText(procesosincronizarsaldos.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoSincronizarSaldos(ProcesoSincronizarSaldosBean procesosincronizarsaldosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.setText(procesosincronizarsaldosBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoSincronizarSaldos(ProcesoSincronizarSaldosParameterReturnGeneral procesosincronizarsaldosReturnGeneral,ProcesoSincronizarSaldosBean procesosincronizarsaldosBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoSincronizarSaldos procesosincronizarsaldosLocal=new ProcesoSincronizarSaldos();
			
			procesosincronizarsaldosLocal=procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesosincronizarsaldosLocal.getId()!=null && !procesosincronizarsaldosLocal.getId().equals(0L))) {procesosincronizarsaldosBean.setId(procesosincronizarsaldosLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoSincronizarSaldosGenerico(Long idProcesoSincronizarSaldosSeleccionado,JComboBox jComboBoxProcesoSincronizarSaldos,List<ProcesoSincronizarSaldos> procesosincronizarsaldossLocal)throws Exception {
		try {
			ProcesoSincronizarSaldos  procesosincronizarsaldosTemp=null;

			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldossLocal) {
				if(procesosincronizarsaldosAux.getId()!=null && procesosincronizarsaldosAux.getId().equals(idProcesoSincronizarSaldosSeleccionado)) {
					procesosincronizarsaldosTemp=procesosincronizarsaldosAux;
					break;
				}
			}

			jComboBoxProcesoSincronizarSaldos.setSelectedItem(procesosincronizarsaldosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoSincronizarSaldosGenerico(JComboBox jComboBoxProcesoSincronizarSaldos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoSincronizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoSincronizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoSincronizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoSincronizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoSincronizarSaldos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoSincronizarSaldos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoSincronizarSaldos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoSincronizarSaldos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoSincronizarSaldos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoSincronizarSaldos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesosincronizarsaldos=(ProcesoSincronizarSaldos) procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesosincronizarsaldos =(ProcesoSincronizarSaldos) procesosincronizarsaldoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!procesosincronizarsaldos.getIsNew() && !procesosincronizarsaldos.getIsChanged() && !procesosincronizarsaldos.getIsDeleted()) {
				sDescripcion=procesosincronizarsaldos.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=procesosincronizarsaldos.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!procesosincronizarsaldos.getIsNew() && !procesosincronizarsaldos.getIsChanged() && !procesosincronizarsaldos.getIsDeleted()) {
				sDescripcion=procesosincronizarsaldos.getperiodo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=procesosincronizarsaldos.getperiodo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoSincronizarSaldos procesosincronizarsaldosRow=new ProcesoSincronizarSaldos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesosincronizarsaldosRow=(ProcesoSincronizarSaldos) procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesosincronizarsaldosRow=(ProcesoSincronizarSaldos) procesosincronizarsaldoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos && this.isPermisoNuevoProcesoSincronizarSaldos));			
			this.jButtonDuplicarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaDuplicarProcesoSincronizarSaldos && this.isPermisoDuplicarProcesoSincronizarSaldos));			
			this.jButtonCopiarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaCopiarProcesoSincronizarSaldos && this.isPermisoCopiarProcesoSincronizarSaldos));
			this.jButtonVerFormProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaVerFormProcesoSincronizarSaldos && this.isPermisoVerFormProcesoSincronizarSaldos));
			
			this.jButtonAbrirOrderByProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoSincronizarSaldos && this.isPermisoOrdenProcesoSincronizarSaldos));			
			
			this.jButtonNuevoRelacionesProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos && this.isPermisoNuevoProcesoSincronizarSaldos));			
			this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos && this.isPermisoNuevoProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonModificarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaModificarProcesoSincronizarSaldos && this.isPermisoActualizarProcesoSincronizarSaldos));	
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos && this.isPermisoActualizarProcesoSincronizarSaldos));	
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos && this.isPermisoEliminarProcesoSincronizarSaldos));
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarProcesoSincronizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos);							
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos && this.isPermisoNuevoProcesoSincronizarSaldos));						
			this.jButtonDuplicarToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaDuplicarProcesoSincronizarSaldos && this.isPermisoDuplicarProcesoSincronizarSaldos));						
			this.jButtonCopiarToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaCopiarProcesoSincronizarSaldos && this.isPermisoCopiarProcesoSincronizarSaldos));			
			this.jButtonVerFormToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaVerFormProcesoSincronizarSaldos && this.isPermisoVerFormProcesoSincronizarSaldos));			
			this.jButtonAbrirOrderByToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoSincronizarSaldos && this.isPermisoOrdenProcesoSincronizarSaldos));
			this.jButtonNuevoRelacionesToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos && this.isPermisoNuevoProcesoSincronizarSaldos));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos && this.isPermisoNuevoProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));			
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonModificarToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaModificarProcesoSincronizarSaldos && this.isPermisoActualizarProcesoSincronizarSaldos));	
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos  && this.isPermisoActualizarProcesoSincronizarSaldos));	
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos && this.isPermisoEliminarProcesoSincronizarSaldos));
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarToolBarProcesoSincronizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos);				
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos && this.isPermisoNuevoProcesoSincronizarSaldos));			
			this.jMenuItemDuplicarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaDuplicarProcesoSincronizarSaldos && this.isPermisoDuplicarProcesoSincronizarSaldos));			
			this.jMenuItemCopiarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaCopiarProcesoSincronizarSaldos && this.isPermisoCopiarProcesoSincronizarSaldos));			
			this.jMenuItemVerFormProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaVerFormProcesoSincronizarSaldos && this.isPermisoVerFormProcesoSincronizarSaldos));			
			this.jMenuItemAbrirOrderByProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoSincronizarSaldos && this.isPermisoOrdenProcesoSincronizarSaldos));			
			//this.jMenuItemMostrarOcultarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoSincronizarSaldos && this.isPermisoOrdenProcesoSincronizarSaldos));
			this.jMenuItemDetalleAbrirOrderByProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoSincronizarSaldos && this.isPermisoOrdenProcesoSincronizarSaldos));			
			//this.jMenuItemDetalleMostrarOcultarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaOrdenProcesoSincronizarSaldos && this.isPermisoOrdenProcesoSincronizarSaldos));			
			this.jMenuItemNuevoRelacionesProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos && this.isPermisoNuevoProcesoSincronizarSaldos));			
			this.jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos && this.isPermisoNuevoProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));									
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemModificarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaModificarProcesoSincronizarSaldos && this.isPermisoActualizarProcesoSincronizarSaldos));	
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemActualizarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos && this.isPermisoActualizarProcesoSincronizarSaldos));	
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemEliminarProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos && this.isPermisoEliminarProcesoSincronizarSaldos));
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemCancelarProcesoSincronizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos);				
			}
			
			this.jMenuItemGuardarCambiosProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));						
			this.jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=this.jButtonNuevoProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoSincronizarSaldos=this.jButtonDuplicarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaCopiarProcesoSincronizarSaldos=this.jButtonCopiarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaVerFormProcesoSincronizarSaldos=this.jButtonVerFormProcesoSincronizarSaldos.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoSincronizarSaldos=this.jButtonAbrirOrderByProcesoSincronizarSaldos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=this.jButtonNuevoRelacionesProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=this.jButtonModificarProcesoSincronizarSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosProcesoSincronizarSaldos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=this.jButtonNuevoToolBarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=this.jButtonNuevoRelacionesToolBarProcesoSincronizarSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonModificarToolBarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarToolBarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarToolBarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarToolBarProcesoSincronizarSaldos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=this.jButtonGuardarCambiosToolBarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=this.jButtonGuardarCambiosTablaToolBarProcesoSincronizarSaldos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=this.jMenuItemNuevoProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=this.jMenuItemNuevoRelacionesProcesoSincronizarSaldos.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemModificarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemActualizarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemEliminarProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemCancelarProcesoSincronizarSaldos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=this.jMenuItemGuardarCambiosProcesoSincronizarSaldos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=this.jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoSincronizarSaldos(Boolean esInicializar) {
		if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
				//if(this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoSincronizarSaldos();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoSincronizarSaldos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoSincronizarSaldos() {
		this.jButtonNuevoProcesoSincronizarSaldos.setVisible(this.isPermisoNuevoProcesoSincronizarSaldos);			
		this.jButtonDuplicarProcesoSincronizarSaldos.setVisible(this.isPermisoDuplicarProcesoSincronizarSaldos);			
		this.jButtonCopiarProcesoSincronizarSaldos.setVisible(this.isPermisoCopiarProcesoSincronizarSaldos);			
		this.jButtonVerFormProcesoSincronizarSaldos.setVisible(this.isPermisoVerFormProcesoSincronizarSaldos);			
		
		this.jButtonAbrirOrderByProcesoSincronizarSaldos.setVisible(this.isPermisoOrdenProcesoSincronizarSaldos);					
		
		this.jButtonNuevoRelacionesProcesoSincronizarSaldos.setVisible(this.isPermisoNuevoProcesoSincronizarSaldos);			
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonModificarProcesoSincronizarSaldos.setVisible(this.isPermisoActualizarProcesoSincronizarSaldos);	
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarProcesoSincronizarSaldos.setVisible(this.isPermisoActualizarProcesoSincronizarSaldos);	
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarProcesoSincronizarSaldos.setVisible(this.isPermisoEliminarProcesoSincronizarSaldos);
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarProcesoSincronizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos);						
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosProcesoSincronizarSaldos.setVisible(this.isPermisoGuardarCambiosProcesoSincronizarSaldos);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.setVisible(this.isPermisoActualizarProcesoSincronizarSaldos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoSincronizarSaldos() {
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonModificarProcesoSincronizarSaldos.setVisible(this.isPermisoActualizarProcesoSincronizarSaldos);	
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarProcesoSincronizarSaldos.setVisible(this.isPermisoActualizarProcesoSincronizarSaldos);	
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarProcesoSincronizarSaldos.setVisible(this.isPermisoEliminarProcesoSincronizarSaldos);
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarProcesoSincronizarSaldos.setVisible(this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos);							
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosProcesoSincronizarSaldos.setVisible((this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos && this.isPermisoGuardarCambiosProcesoSincronizarSaldos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoSincronizarSaldos() {
		if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoSincronizarSaldos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoSincronizarSaldos() {
	}
	
	public void jTableDatosProcesoSincronizarSaldosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoSincronizarSaldos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoSincronizarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.getprocesosincronizarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosincronizarsaldos==null) {
						this.procesosincronizarsaldos = new ProcesoSincronizarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.procesosincronizarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
				}

				if(this.procesosincronizarsaldos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesosincronizarsaldos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioProcesoSincronizarSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebProcesoSincronizarSaldos(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoSincronizarSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoSincronizarSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.getprocesosincronizarsaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.procesosincronizarsaldosLogic.getConnexion());

				if(this.procesosincronizarsaldos.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.procesosincronizarsaldos.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoSincronizarSaldos=(TitledBorder)this.jScrollPanelDatosProcesoSincronizarSaldos.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderProcesoSincronizarSaldos.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioProcesoSincronizarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.getprocesosincronizarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosincronizarsaldos==null) {
						this.procesosincronizarsaldos = new ProcesoSincronizarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.procesosincronizarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
				}

				if(this.procesosincronizarsaldos.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.procesosincronizarsaldos.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoProcesoSincronizarSaldosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebProcesoSincronizarSaldos(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoSincronizarSaldos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoSincronizarSaldos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.getprocesosincronizarsaldos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.procesosincronizarsaldosLogic.getConnexion());

				if(this.procesosincronizarsaldos.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.procesosincronizarsaldos.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoSincronizarSaldos=(TitledBorder)this.jScrollPanelDatosProcesoSincronizarSaldos.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderProcesoSincronizarSaldos.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoProcesoSincronizarSaldosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.getprocesosincronizarsaldos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesosincronizarsaldos==null) {
						this.procesosincronizarsaldos = new ProcesoSincronizarSaldos();
					}

					this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.procesosincronizarsaldos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);
				}

				if(this.procesosincronizarsaldos.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.procesosincronizarsaldos.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false,false);

			this.getProcesoSincronizarSaldossBusquedaProcesoSincronizarSaldos();

			this.inicializarActualizarBindingProcesoSincronizarSaldos(false);

			//if(ProcesoSincronizarSaldosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoSincronizarSaldos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesosincronizarsaldosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoSincronizarSaldos() {
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.dispose();
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos!=null) {
			this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.dispose();
			this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos=null;
		}
		
		if(this.jInternalFrameImportacionProcesoSincronizarSaldos!=null) {
			this.jInternalFrameImportacionProcesoSincronizarSaldos.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoSincronizarSaldos.dispose();
			this.jInternalFrameImportacionProcesoSincronizarSaldos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoSincronizarSaldos();
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoSincronizarSaldos")) {
				jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoSincronizarSaldos")) {
				jButtonDuplicarProcesoSincronizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoSincronizarSaldos")) {
				jButtonCopiarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoSincronizarSaldos")) {
				jButtonVerFormProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoSincronizarSaldos")) {
				jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoSincronizarSaldos")) {
				jButtonDuplicarProcesoSincronizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoSincronizarSaldos")) {
				jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoSincronizarSaldos")) {
				jButtonDuplicarProcesoSincronizarSaldosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoSincronizarSaldos")) {
				jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoSincronizarSaldos")) {
				jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoSincronizarSaldos")) {
				jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoSincronizarSaldos")) {
				jButtonModificarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoSincronizarSaldos")) {
				jButtonModificarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoSincronizarSaldos")) {
				jButtonModificarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoSincronizarSaldos")) {
				jButtonActualizarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoSincronizarSaldos")) {
				jButtonActualizarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoSincronizarSaldos")) {
				jButtonActualizarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoSincronizarSaldos")) {
				jButtonEliminarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoSincronizarSaldos")) {
				jButtonEliminarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoSincronizarSaldos")) {
				jButtonEliminarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoSincronizarSaldos")) {
				jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoSincronizarSaldos")) {
				jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoSincronizarSaldos")) {
				jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoSincronizarSaldos")) {
				jButtonCerrarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoSincronizarSaldos")) {
				jButtonCerrarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoSincronizarSaldos")) {
				jButtonCerrarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoSincronizarSaldos")) {
				jButtonMostrarOcultarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoSincronizarSaldos")) {
				jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoSincronizarSaldos")) {
				jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoSincronizarSaldos")) {
				jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoSincronizarSaldos")) {
				jButtonCopiarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoSincronizarSaldos")) {
				jButtonVerFormProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoSincronizarSaldos")) {
				jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoSincronizarSaldos")) {
				jButtonCopiarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoSincronizarSaldos")) {
				jButtonVerFormProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoSincronizarSaldos")) {
				jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoSincronizarSaldos")) {
				jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoSincronizarSaldos")) {
				jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoSincronizarSaldos")) {
				jButtonRecargarInformacionProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoSincronizarSaldos")) {
				jButtonRecargarInformacionProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoSincronizarSaldos")) {
				jButtonRecargarInformacionProcesoSincronizarSaldosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoSincronizarSaldos")) {
				jButtonAnterioresProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoSincronizarSaldos")) {
				jButtonAnterioresProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoSincronizarSaldos")) {
				jButtonAnterioresProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoSincronizarSaldos")) {
				jButtonSiguientesProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoSincronizarSaldos")) {
				jButtonSiguientesProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoSincronizarSaldos")) {
				jButtonSiguientesProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoSincronizarSaldos") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoSincronizarSaldos")) {
				jButtonAbrirOrderByProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoSincronizarSaldos") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoSincronizarSaldos")) {
				jButtonMostrarOcultarProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoSincronizarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoSincronizarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoSincronizarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoSincronizarSaldos")) {
				jButtonProcesarInformacionProcesoSincronizarSaldosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoSincronizarSaldos")) {
				jButtonCerrarReporteDinamicoProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoSincronizarSaldos")) {
				jButtonGenerarReporteDinamicoProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoSincronizarSaldos")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoSincronizarSaldos")) {
				jButtonCerrarImportacionProcesoSincronizarSaldosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoSincronizarSaldos")) {
				
				jButtonGenerarImportacionProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoSincronizarSaldos")) {
				
				jButtonAbrirImportacionProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoSincronizarSaldos")) {
				jComboBoxTiposAccionesProcesoSincronizarSaldosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoSincronizarSaldos")) {
				jComboBoxTiposRelacionesProcesoSincronizarSaldosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoSincronizarSaldos")) {
				jComboBoxTiposAccionesProcesoSincronizarSaldosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoSincronizarSaldos")) {
				
				jComboBoxTiposSeleccionarProcesoSincronizarSaldosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoSincronizarSaldos")) {
				jTextFieldValorCampoGeneralProcesoSincronizarSaldosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoSincronizarSaldos")) {
				jButtonAbrirOrderByProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoSincronizarSaldos")) {
				jButtonAbrirOrderByProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoSincronizarSaldos")) {
				jButtonCerrarOrderByProcesoSincronizarSaldosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoSincronizarSaldosBusqueda")) {
				this.jButtonidProcesoSincronizarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoSincronizarSaldosUpdate")) {
				this.jButtonid_ejercicioProcesoSincronizarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoSincronizarSaldosBusqueda")) {
				this.jButtonid_ejercicioProcesoSincronizarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoProcesoSincronizarSaldosUpdate")) {
				this.jButtonid_periodoProcesoSincronizarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoProcesoSincronizarSaldosBusqueda")) {
				this.jButtonid_periodoProcesoSincronizarSaldosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos")) {
				this.jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldosActionPerformed(evt);
			}
			
			;
			
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoSincronizarSaldos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				


				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoSincronizarSaldos procesosincronizarsaldosLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesosincronizarsaldosLocal=this.procesosincronizarsaldos;
			} else {
				procesosincronizarsaldosLocal=this.procesosincronizarsaldosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
							
				
				


				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
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
			
			


			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
								
						
				


				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
								
				
				


				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
							
				
				


				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
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
			
			


			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
								
				
				


				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoSincronizarSaldos")) {
					jCheckBoxSeleccionarTodosProcesoSincronizarSaldosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoSincronizarSaldos")) {
					jCheckBoxSeleccionadosProcesoSincronizarSaldosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoSincronizarSaldos")) {
					
				}
				
				


				
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
												
				
				


				
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
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
			
			


			if(sTipo.equals("id_ejercicioProcesoSincronizarSaldos")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos;
				}

				if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoSincronizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoSincronizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoSincronizarSaldos(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,"BusquedaProcesoSincronizarSaldos");
				//recargarFormProcesoSincronizarSaldosEjercicio(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,"BusquedaProcesoSincronizarSaldos");
			}
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_ejercicioProcesoSincronizarSaldos")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos;
				}

				if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoSincronizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoSincronizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoSincronizarSaldos(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,"BusquedaProcesoSincronizarSaldos");
				//recargarFormProcesoSincronizarSaldosEjercicio(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,"BusquedaProcesoSincronizarSaldos");
			}
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesosincronizarsaldos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesosincronizarsaldos);
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
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
				
				


			if(sTipo.equals("id_ejercicioProcesoSincronizarSaldos")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos;
				}

				if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
					//classes=ProcesoSincronizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoSincronizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormProcesoSincronizarSaldos(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,"BusquedaProcesoSincronizarSaldos");
				//recargarFormProcesoSincronizarSaldosEjercicio(jComboBoxid_ejercicioBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos,"BusquedaProcesoSincronizarSaldos");
			}
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoSincronizarSaldos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoSincronizarSaldos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoSincronizarSaldosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesosincronizarsaldosAnterior =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoSincronizarSaldos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoSincronizarSaldosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoSincronizarSaldos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesosincronizarsaldos =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesosincronizarsaldos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoSincronizarSaldos")) {
				
				}
				
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoSincronizarSaldos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoSincronizarSaldos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoSincronizarSaldos")) {
			
			}
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoSincronizarSaldos();
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoSincronizarSaldos")) {
				jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoSincronizarSaldos")) {
				jButtonDuplicarProcesoSincronizarSaldosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoSincronizarSaldos")) {
				jButtonCopiarProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoSincronizarSaldos")) {
				jButtonVerFormProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoSincronizarSaldos")) {
				jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoSincronizarSaldos")) {
				jButtonModificarProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoSincronizarSaldos")) {
				jButtonActualizarProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoSincronizarSaldos")) {
				jButtonEliminarProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoSincronizarSaldos")) {
				jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoSincronizarSaldos")) {
				jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoSincronizarSaldos")) {
				jButtonCerrarProcesoSincronizarSaldosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoSincronizarSaldos")) {
				jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoSincronizarSaldos")) {
				jButtonNuevoGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoSincronizarSaldos")) {
				jButtonAbrirOrderByProcesoSincronizarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoSincronizarSaldos")) {
				jButtonRecargarInformacionProcesoSincronizarSaldosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoSincronizarSaldos")) {
				jButtonAnterioresProcesoSincronizarSaldosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoSincronizarSaldos")) {
				jButtonSiguientesProcesoSincronizarSaldosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoSincronizarSaldosBusqueda")) {
				this.jButtonidProcesoSincronizarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoSincronizarSaldosUpdate")) {
				this.jButtonid_ejercicioProcesoSincronizarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoSincronizarSaldosBusqueda")) {
				this.jButtonid_ejercicioProcesoSincronizarSaldosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoProcesoSincronizarSaldosUpdate")) {
				this.jButtonid_periodoProcesoSincronizarSaldosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoProcesoSincronizarSaldosBusqueda")) {
				this.jButtonid_periodoProcesoSincronizarSaldosBusquedaActionPerformed(evt);
			}
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoSincronizarSaldos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoSincronizarSaldos")) {
				closingInternalFrameProcesoSincronizarSaldos();
				
			} else if(sTipo.equals("jButtonCancelarProcesoSincronizarSaldos")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoSincronizarSaldos = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoSincronizarSaldosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoSincronizarSaldosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoSincronizarSaldos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoSincronizarSaldosActionPerformed(null);
			}
			
			ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesosincronizarsaldos,new Object(),this.procesosincronizarsaldosParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoSincronizarSaldos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoSincronizarSaldos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoSincronizarSaldos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesosincronizarsaldos)) {
			if(!esControlTabla) {
				if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.procesosincronizarsaldos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);			
				}
				
				if(this.procesosincronizarsaldosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoSincronizarSaldos(this.procesosincronizarsaldos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoSincronizarSaldos(this.procesosincronizarsaldosReturnGeneral,this.procesosincronizarsaldosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesosincronizarsaldosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoSincronizarSaldos(classes,this.procesosincronizarsaldosReturnGeneral,this.procesosincronizarsaldosBean,false);
					}
						
					if(this.procesosincronizarsaldosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoSincronizarSaldos(this.procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoSincronizarSaldos(this.procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldos());	
					}
						
					if(this.procesosincronizarsaldosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoSincronizarSaldos(this.procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldos(),classes);//this.procesosincronizarsaldosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoSincronizarSaldos(this.procesosincronizarsaldos,classes);//this.procesosincronizarsaldosBean);									
				}
			
				if(ProcesoSincronizarSaldosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoSincronizarSaldos(this.procesosincronizarsaldos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoSincronizarSaldos(this.procesosincronizarsaldos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesosincronizarsaldosAnterior!=null) {
						this.procesosincronizarsaldos=this.procesosincronizarsaldosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesosincronizarsaldosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldos(),procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldos(),this.procesosincronizarsaldoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoSincronizarSaldos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoSincronizarSaldos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoSincronizarSaldos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoSincronizarSaldos() throws Exception {
		
		ProcesoSincronizarSaldosModel procesosincronizarsaldosModel=(ProcesoSincronizarSaldosModel)this.jTableDatosProcesoSincronizarSaldos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesosincronizarsaldosModel.procesosincronizarsaldoss=this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesosincronizarsaldosModel.procesosincronizarsaldoss=this.procesosincronizarsaldoss;
		}
		
		
		((ProcesoSincronizarSaldosModel) this.jTableDatosProcesoSincronizarSaldos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoSincronizarSaldos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesosincronizarsaldosAnterior(),this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesosincronizarsaldosAnterior(),this.procesosincronizarsaldoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoSincronizarSaldos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
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
										
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesosincronizarsaldos,new Object(),generalEntityParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoSincronizarSaldosConstantesFunciones.getClassesRelationshipsOfProcesoSincronizarSaldos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoSincronizarSaldosConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoSincronizarSaldos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoSincronizarSaldos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesosincronizarsaldos,new Object(),generalEntityParameterGeneral,this.procesosincronizarsaldosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoSincronizarSaldos(ProcesoSincronizarSaldosBean procesosincronizarsaldosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoSincronizarSaldos(ArrayList<Classe> classes,ProcesoSincronizarSaldosReturnGeneral procesosincronizarsaldosReturnGeneral,ProcesoSincronizarSaldosBean procesosincronizarsaldosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesosincronizarsaldos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos = new ProcesoSincronizarSaldosDetalleFormJInternalFrame(jDesktopPane,this.procesosincronizarsaldosSessionBean.getConGuardarRelaciones(),this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoSincronizarSaldos);
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setVisible(false);
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.procesosincronizarsaldosLogic=this.procesosincronizarsaldosLogic;
		
		this.cargarCombosFrameForeignKeyProcesoSincronizarSaldos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoSincronizarSaldos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoSincronizarSaldos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoSincronizarSaldos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoSincronizarSaldos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoSincronizarSaldos"));
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonModificarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"ModificarProcesoSincronizarSaldos"));

		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonModificarToolBarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoSincronizarSaldos"));
					
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemModificarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoSincronizarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoSincronizarSaldos"));
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarToolBarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoSincronizarSaldos"));
						
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemActualizarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoSincronizarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"EliminarProcesoSincronizarSaldos"));
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoSincronizarSaldos"));
								
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemEliminarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoSincronizarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"CancelarProcesoSincronizarSaldos"));
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoSincronizarSaldos"));
					
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemCancelarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoSincronizarSaldos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemDetalleCerrarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoSincronizarSaldos"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoSincronizarSaldos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoSincronizarSaldos"));
		
		
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoSincronizarSaldos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonidProcesoSincronizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoSincronizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_ejercicioProcesoSincronizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoSincronizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoSincronizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_periodoProcesoSincronizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoSincronizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_periodoProcesoSincronizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoSincronizarSaldosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTabbedPaneRelacionesProcesoSincronizarSaldos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoSincronizarSaldos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoSincronizarSaldos"));
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoSincronizarSaldos"));
		}
		
		this.jTableDatosProcesoSincronizarSaldos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoSincronizarSaldos"));
		
		this.jTableDatosProcesoSincronizarSaldos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoSincronizarSaldos"));
		
		this.jButtonNuevoProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"NuevoProcesoSincronizarSaldos"));
		
		this.jButtonDuplicarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"DuplicarProcesoSincronizarSaldos"));
		
		this.jButtonCopiarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"CopiarProcesoSincronizarSaldos"));
		
		this.jButtonVerFormProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"VerFormProcesoSincronizarSaldos"));
		
		
		this.jButtonNuevoToolBarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoSincronizarSaldos"));
			
		this.jButtonDuplicarToolBarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoSincronizarSaldos"));
			
		this.jMenuItemNuevoProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoSincronizarSaldos"));
			
		this.jMenuItemDuplicarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoSincronizarSaldos"));		
		
		
		this.jButtonNuevoRelacionesProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoSincronizarSaldos"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoSincronizarSaldos"));
			
		this.jMenuItemNuevoRelacionesProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoSincronizarSaldos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonModificarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"ModificarProcesoSincronizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonModificarToolBarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoSincronizarSaldos"));
			
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemModificarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoSincronizarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"ActualizarProcesoSincronizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonActualizarToolBarProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoSincronizarSaldos"));
				
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemActualizarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoSincronizarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"EliminarProcesoSincronizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonEliminarToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoSincronizarSaldos"));
						
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemEliminarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoSincronizarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"CancelarProcesoSincronizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonCancelarToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoSincronizarSaldos"));
			
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemCancelarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoSincronizarSaldos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoSincronizarSaldos"));		
		
		
		this.jButtonCerrarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"CerrarProcesoSincronizarSaldos"));
		
		
		this.jButtonCerrarToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoSincronizarSaldos"));
			
		this.jMenuItemCerrarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoSincronizarSaldos"));
			
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jMenuItemDetalleCerrarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoSincronizarSaldos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoSincronizarSaldos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoSincronizarSaldos"));
		}
		
		this.jButtonCopiarToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoSincronizarSaldos"));
			
		this.jButtonVerFormToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoSincronizarSaldos"));
		
		this.jMenuItemGuardarCambiosProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoSincronizarSaldos"));
			
		this.jMenuItemCopiarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoSincronizarSaldos"));		
		
		this.jMenuItemVerFormProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoSincronizarSaldos"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoSincronizarSaldos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoSincronizarSaldos"));
			
		this.jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoSincronizarSaldos"));		
		
		
		
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoSincronizarSaldos"));
					
		this.jButtonRecargarInformacionToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoSincronizarSaldos"));
		
		this.jMenuItemRecargarInformacionProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoSincronizarSaldos"));		
		
		
		
		this.jButtonAnterioresProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"AnterioresProcesoSincronizarSaldos"));
		
		
		this.jButtonAnterioresToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoSincronizarSaldos"));
		
		this.jMenuItemAnterioresProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoSincronizarSaldos"));		
		
		
		this.jButtonSiguientesProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"SiguientesProcesoSincronizarSaldos"));
		
		
		this.jButtonSiguientesToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoSincronizarSaldos"));
			
		this.jMenuItemSiguientesProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoSincronizarSaldos"));
			
		this.jMenuItemAbrirOrderByProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoSincronizarSaldos"));
			
		this.jMenuItemMostrarOcultarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoSincronizarSaldos"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoSincronizarSaldos"));
			
		this.jMenuItemDetalleMostarOcultarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoSincronizarSaldos"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoSincronizarSaldos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoSincronizarSaldos"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoSincronizarSaldos"));		
		
		
		this.jButtonProcesarInformacionProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoSincronizarSaldos"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoSincronizarSaldos"));

		this.jCheckBoxSeleccionadosProcesoSincronizarSaldos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoSincronizarSaldos"));
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoSincronizarSaldos"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoSincronizarSaldos"));
			
		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoSincronizarSaldos"));
					
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoSincronizarSaldos"));
			
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoSincronizarSaldos"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonidProcesoSincronizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoSincronizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_ejercicioProcesoSincronizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoSincronizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoSincronizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_periodoProcesoSincronizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoSincronizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_periodoProcesoSincronizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoSincronizarSaldosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos!=null) {
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoSincronizarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoSincronizarSaldos"));
				this.jInternalFrameReporteDinamicoProcesoSincronizarSaldos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoSincronizarSaldos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoSincronizarSaldos"));				
			//this.jButtonGenerarReporteDinamicoProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoSincronizarSaldos"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoSincronizarSaldos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoSincronizarSaldos!=null) {
				this.jInternalFrameImportacionProcesoSincronizarSaldos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoSincronizarSaldos"));
				this.jInternalFrameImportacionProcesoSincronizarSaldos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoSincronizarSaldos"));
				this.jInternalFrameImportacionProcesoSincronizarSaldos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoSincronizarSaldos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoSincronizarSaldos"));
			
			this.jButtonAbrirOrderByToolBarProcesoSincronizarSaldos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoSincronizarSaldos"));			
			
			if(this.jInternalFrameOrderByProcesoSincronizarSaldos!=null) {
				this.jInternalFrameOrderByProcesoSincronizarSaldos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoSincronizarSaldos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jTabbedPaneRelacionesProcesoSincronizarSaldos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoSincronizarSaldos"));
		
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
            		closingInternalFrameProcesoSincronizarSaldos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoSincronizarSaldos = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoSincronizarSaldosBeanSwingJInternalFrame jInternalFrameParent=(ProcesoSincronizarSaldosBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoSincronizarSaldos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoSincronizarSaldosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoSincronizarSaldos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoSincronizarSaldosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoSincronizarSaldos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoSincronizarSaldos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoSincronizarSaldos";
		inputMap = this.jButtonNuevoProcesoSincronizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoSincronizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoSincronizarSaldos";
		inputMap = this.jButtonNuevoRelacionesProcesoSincronizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoSincronizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoSincronizarSaldosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoSincronizarSaldos";
		inputMap = this.jButtonModificarProcesoSincronizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoSincronizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoSincronizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoSincronizarSaldos";
		inputMap = this.jButtonActualizarProcesoSincronizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoSincronizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoSincronizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoSincronizarSaldos";
		inputMap = this.jButtonEliminarProcesoSincronizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoSincronizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoSincronizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoSincronizarSaldos";
		inputMap = this.jButtonCancelarProcesoSincronizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoSincronizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoSincronizarSaldos";
		inputMap = this.jButtonCerrarProcesoSincronizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoSincronizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoSincronizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoSincronizarSaldos";
		inputMap = this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosProcesoSincronizarSaldos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonGuardarCambiosProcesoSincronizarSaldos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoSincronizarSaldos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoSincronizarSaldosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoSincronizarSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoSincronizarSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoSincronizarSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoSincronizarSaldosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonidProcesoSincronizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoSincronizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_ejercicioProcesoSincronizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoSincronizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_ejercicioProcesoSincronizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoSincronizarSaldosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_periodoProcesoSincronizarSaldosUpdate.addActionListener(new ButtonActionListener(this,"id_periodoProcesoSincronizarSaldosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jButtonid_periodoProcesoSincronizarSaldosBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoProcesoSincronizarSaldosBusqueda"));
		
		
		this.jButtonBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos.addActionListener(new ButtonActionListener(this,"BusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoSincronizarSaldos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoSincronizarSaldosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoSincronizarSaldosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoSincronizarSaldos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoSincronizarSaldos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
					procesosincronizarsaldosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldoss) {
					procesosincronizarsaldosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoSincronizarSaldosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
						procesosincronizarsaldosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldoss) {
						procesosincronizarsaldosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoSincronizarSaldos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoSincronizarSaldos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoSincronizarSaldos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoSincronizarSaldosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoSincronizarSaldos.getSelectedRows();
			
			ProcesoSincronizarSaldos procesosincronizarsaldosLocal=new ProcesoSincronizarSaldos();
			
			//this.seleccionarTodosProcesoSincronizarSaldos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesosincronizarsaldosLocal =(ProcesoSincronizarSaldos) this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss().toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesosincronizarsaldosLocal =(ProcesoSincronizarSaldos) this.procesosincronizarsaldoss.toArray()[this.jTableDatosProcesoSincronizarSaldos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesosincronizarsaldosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
						procesosincronizarsaldosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldoss) {
						procesosincronizarsaldosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoSincronizarSaldos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoSincronizarSaldos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoSincronizarSaldos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoSincronizarSaldosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoSincronizarSaldosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoSincronizarSaldosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoSincronizarSaldos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldoss) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoSincronizarSaldosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoSincronizarSaldos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoSincronizarSaldos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoSincronizarSaldos) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoSincronizarSaldos(conSplash);
				
					this.generarReporteProcesoSincronizarSaldossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoSincronizarSaldossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoSincronizarSaldossSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoSincronizarSaldossSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoSincronizarSaldos();
				
				this.exportarProcesoSincronizarSaldossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoSincronizarSaldoss();
				//this.importarProcesoSincronizarSaldoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoSincronizarSaldos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoSincronizarSaldossSeleccionados();
				//this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sincronizar Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoSincronizarSaldos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoSincronizarSaldos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoSincronizarSaldos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sincronizar Saldos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoSincronizarSaldosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoSincronizarSaldos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoSincronizarSaldos(conSplash);
					
						//this.actualizarParametrosGeneralProcesoSincronizarSaldos();
						
						this.generarReporteProcesoAccionProcesoSincronizarSaldossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Sincronizar SaldosES SELECCIONADOS?", "MANTENIMIENTO DE Sincronizar Saldos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoSincronizarSaldos();
				
						this.actualizarParametrosGeneralProcesoSincronizarSaldos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesosincronizarsaldosReturnGeneral=procesosincronizarsaldosLogic.procesarAccionProcesoSincronizarSaldossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss(),this.procesosincronizarsaldosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoSincronizarSaldosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoSincronizarSaldos();
					
					ProcesoSincronizarSaldosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoSincronizarSaldosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoSincronizarSaldos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxTiposAccionesFormularioProcesoSincronizarSaldos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoSincronizarSaldos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoSincronizarSaldosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoSincronizarSaldos();
			
			if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();		
			ProcesoSincronizarSaldos procesosincronizarsaldos=new ProcesoSincronizarSaldos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoSincronizarSaldos.getSelectedItem();
			
			
			
			
			procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesosincronizarsaldossSeleccionados.size()==1) {
				for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldossSeleccionados) {
					procesosincronizarsaldos=procesosincronizarsaldosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoSincronizarSaldos();
			
      		//this.finishProcessProcesoSincronizarSaldos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoSincronizarSaldosReturnGeneral() throws Exception {
		if(this.procesosincronizarsaldosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesosincronizarsaldosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesosincronizarsaldosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesosincronizarsaldosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesosincronizarsaldosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesosincronizarsaldosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
		}
		
		if(this.procesosincronizarsaldosReturnGeneral.getConRetornoLista() || this.procesosincronizarsaldosReturnGeneral.getConRetornoObjeto()) {
			if(this.procesosincronizarsaldosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesosincronizarsaldosLogic.setProcesoSincronizarSaldoss(this.procesosincronizarsaldosReturnGeneral.getProcesoSincronizarSaldoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoSincronizarSaldos(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoSincronizarSaldos() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoSincronizarSaldos> getProcesoSincronizarSaldossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoSincronizarSaldos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss()) {
					if(procesosincronizarsaldosAux.getIsSelected()) {
						procesosincronizarsaldossSeleccionados.add(procesosincronizarsaldosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:this.procesosincronizarsaldoss) {
					if(procesosincronizarsaldosAux.getIsSelected()) {
						procesosincronizarsaldossSeleccionados.add(procesosincronizarsaldosAux);				
					}
				}
			}
			
			if(procesosincronizarsaldossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesosincronizarsaldossSeleccionados.addAll(this.procesosincronizarsaldosLogic.getProcesoSincronizarSaldoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesosincronizarsaldossSeleccionados.addAll(this.procesosincronizarsaldoss);				
					}
				}
			}
		} else {
			procesosincronizarsaldossSeleccionados.add(this.procesosincronizarsaldos);
		}
		
		return procesosincronizarsaldossSeleccionados;
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
	
	public void generarReporteProcesoSincronizarSaldossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoSincronizarSaldossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoSincronizarSaldossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoSincronizarSaldossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoSincronizarSaldossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sincronizar Saldos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoSincronizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();		
		
		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoSincronizarSaldoss("Todos",procesosincronizarsaldossSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoSincronizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();		
		
		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoSincronizarSaldoss("Todos",procesosincronizarsaldossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoSincronizarSaldossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();
		
		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoSincronizarSaldoss("Todos",procesosincronizarsaldossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoSincronizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoSincronizarSaldos();
		
		
		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoSincronizarSaldos();
		
		
		//this.generarReporteProcesoSincronizarSaldoss("Todos",procesosincronizarsaldossSeleccionados ,procesosincronizarsaldosImplementable,procesosincronizarsaldosImplementableHome);
	}
	
	public void mostrarImportacionProcesoSincronizarSaldoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoSincronizarSaldos();
		
		this.abrirFrameImportacionProcesoSincronizarSaldos();		
		
			
		//this.generarReporteProcesoSincronizarSaldoss("Todos",procesosincronizarsaldossSeleccionados ,procesosincronizarsaldosImplementable,procesosincronizarsaldosImplementableHome);
	}
	
	public void importarProcesoSincronizarSaldoss() throws Exception {		
	
	}
	
	public void exportarProcesoSincronizarSaldossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoSincronizarSaldossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoSincronizarSaldossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoSincronizarSaldossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sincronizar Saldos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoSincronizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();		
		
		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosincronizarsaldos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoSincronizarSaldos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoSincronizarSaldos(procesosincronizarsaldosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesosincronizarsaldosAux.setsDetalleGeneralEntityReporte(procesosincronizarsaldosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sincronizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoSincronizarSaldos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoSincronizarSaldosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSincronizarSaldosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesosincronizarsaldos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosincronizarsaldos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosincronizarsaldos.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesosincronizarsaldos.getperiodo_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoSincronizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();		
		
		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosincronizarsaldos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoSincronizarSaldoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoSincronizarSaldos(row);				
				iRow++;
			}				
			
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoSincronizarSaldos(procesosincronizarsaldosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sincronizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoSincronizarSaldossSeleccionados() throws Exception {
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();		
		
		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesosincronizarsaldos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesosincronizarsaldoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesosincronizarsaldos");
			//elementRoot.appendChild(element);
		
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldossSeleccionados) {
				element = document.createElement("procesosincronizarsaldos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoSincronizarSaldos(procesosincronizarsaldosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sincronizar Saldos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoSincronizarSaldos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesosincronizarsaldos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosincronizarsaldos.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesosincronizarsaldos.getperiodo_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesoSincronizarSaldos(ProcesoSincronizarSaldos procesosincronizarsaldos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoSincronizarSaldosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesosincronizarsaldos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoSincronizarSaldosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesosincronizarsaldos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementejercicio_descripcion = document.createElement(ProcesoSincronizarSaldosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(procesosincronizarsaldos.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(ProcesoSincronizarSaldosConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(procesosincronizarsaldos.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesoSincronizarSaldossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados=new ArrayList<ProcesoSincronizarSaldos>();
		
		procesosincronizarsaldossSeleccionados=this.getProcesoSincronizarSaldossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoSincronizarSaldos(procesosincronizarsaldossSeleccionados);
		
		this.generarReporteProcesoSincronizarSaldoss("Todos",procesosincronizarsaldossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoSincronizarSaldos(ArrayList<ProcesoSincronizarSaldos> procesosincronizarsaldossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoSincronizarSaldos procesosincronizarsaldosAux:procesosincronizarsaldossSeleccionados) {
				procesosincronizarsaldosAux.setsDetalleGeneralEntityReporte(procesosincronizarsaldosAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					procesosincronizarsaldosAux.setsDescripcionGeneralEntityReporte1(procesosincronizarsaldosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoSincronizarSaldosConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					procesosincronizarsaldosAux.setsDescripcionGeneralEntityReporte1(procesosincronizarsaldosAux.getperiodo_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoSincronizarSaldosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoSincronizarSaldos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoSincronizarSaldosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=true;
		} else {
			this.actualizarEstadoPanelsProcesoSincronizarSaldos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoSincronizarSaldos=false;
			//this.isVisibilidadCeldaVerFormProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaDuplicarProcesoSincronizarSaldos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			if(!procesosincronizarsaldosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;												
			}
			
			this.jButtonCerrarProcesoSincronizarSaldos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
		}
		
		if(!this.permiteMantenimiento(this.procesosincronizarsaldos)) {
			this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=false;
			this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoSincronizarSaldos=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoSincronizarSaldos=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoSincronizarSaldos=false;
		//this.isVisibilidadCeldaModificarProcesoSincronizarSaldos=true;
		this.isVisibilidadCeldaActualizarProcesoSincronizarSaldos=false;
		this.isVisibilidadCeldaEliminarProcesoSincronizarSaldos=false;
		//this.isVisibilidadCeldaCancelarProcesoSincronizarSaldos=true;			
		this.isVisibilidadCeldaGuardarProcesoSincronizarSaldos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoSincronizarSaldos() {
	}
	
	public void actualizarEstadoPanelsProcesoSincronizarSaldos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosProcesoSincronizarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoSincronizarSaldos!=null) {
				this.jPanelPaginacionProcesoSincronizarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoSincronizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosProcesoSincronizarSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoSincronizarSaldos!=null) {
				this.jPanelPaginacionProcesoSincronizarSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoSincronizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosProcesoSincronizarSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoSincronizarSaldos!=null) {
				this.jPanelPaginacionProcesoSincronizarSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoSincronizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosProcesoSincronizarSaldos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoSincronizarSaldos!=null) {
				this.jPanelPaginacionProcesoSincronizarSaldos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoSincronizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosProcesoSincronizarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoSincronizarSaldos!=null) {
				this.jPanelPaginacionProcesoSincronizarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoSincronizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosProcesoSincronizarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoSincronizarSaldos!=null) {
				this.jPanelPaginacionProcesoSincronizarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoSincronizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosEdicionProcesoSincronizarSaldos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoSincronizarSaldos!=null) {
				this.jScrollPanelDatosProcesoSincronizarSaldos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoSincronizarSaldos!=null) {
				this.jPanelPaginacionProcesoSincronizarSaldos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoSincronizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos!=null) {
					this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoSincronizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesosincronizarsaldosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos!=null) {
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoSincronizarSaldos!=null) {
				this.jPanelParametrosReportesProcesoSincronizarSaldos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaProcesoSincronizarSaldos=isParaEjercicio;
			if(!this.isVisibilidadBusquedaProcesoSincronizarSaldos) {this.jTabbedPaneBusquedasProcesoSincronizarSaldos.remove(jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaProcesoSincronizarSaldos=isParaPeriodo;
			if(!this.isVisibilidadBusquedaProcesoSincronizarSaldos) {this.jTabbedPaneBusquedasProcesoSincronizarSaldos.remove(jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);}
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
			
			this.inicializarActualizarBindingTablaProcesoSincronizarSaldos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoSincronizarSaldos() {
		this.updateBorderResaltarBusquedasFormularioProcesoSincronizarSaldos();
		this.updateVisibilidadBusquedasFormularioProcesoSincronizarSaldos();
		this.updateHabilitarBusquedasFormularioProcesoSincronizarSaldos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoSincronizarSaldos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos.getComponents().length>0) {
	

		if(this.procesosincronizarsaldosConstantesFunciones.resaltarBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos!=null) {
			index= this.jTabbedPaneBusquedasProcesoSincronizarSaldos.indexOfComponent(this.jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoSincronizarSaldos.getComponent(index);
				jPanel.setBorder(this.procesosincronizarsaldosConstantesFunciones.resaltarBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoSincronizarSaldos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoSincronizarSaldos.indexOfComponent(this.jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoSincronizarSaldos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesosincronizarsaldosConstantesFunciones.mostrarBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);
			if(!this.procesosincronizarsaldosConstantesFunciones.mostrarBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos && index>-1) {
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoSincronizarSaldos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoSincronizarSaldos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoSincronizarSaldos.indexOfComponent(this.jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoSincronizarSaldos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesosincronizarsaldosConstantesFunciones.activarBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);
				this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setEnabledAt(index,this.procesosincronizarsaldosConstantesFunciones.activarBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoSincronizarSaldos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoSincronizarSaldos")) {
			index= this.jTabbedPaneBusquedasProcesoSincronizarSaldos.indexOfComponent(this.jPanelBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);

			this.jTabbedPaneBusquedasProcesoSincronizarSaldos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoSincronizarSaldos.getComponent(index);

			this.procesosincronizarsaldosConstantesFunciones.setResaltarBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos(resaltar);

			jPanel.setBorder(this.procesosincronizarsaldosConstantesFunciones.resaltarBusquedaProcesoSincronizarSaldosProcesoSincronizarSaldos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoSincronizarSaldos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoSincronizarSaldos() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoSincronizarSaldos();
		this.updateVisibilidadResaltarControlesFormularioProcesoSincronizarSaldos();
		this.updateHabilitarResaltarControlesFormularioProcesoSincronizarSaldos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoSincronizarSaldos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesosincronizarsaldosConstantesFunciones.resaltaridProcesoSincronizarSaldos!=null && this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.setBorder(this.procesosincronizarsaldosConstantesFunciones.resaltaridProcesoSincronizarSaldos);}
		if(this.procesosincronizarsaldosConstantesFunciones.resaltarid_ejercicioProcesoSincronizarSaldos!=null && this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.setBorder(this.procesosincronizarsaldosConstantesFunciones.resaltarid_ejercicioProcesoSincronizarSaldos);}
		if(this.procesosincronizarsaldosConstantesFunciones.resaltarid_periodoProcesoSincronizarSaldos!=null && this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.setBorder(this.procesosincronizarsaldosConstantesFunciones.resaltarid_periodoProcesoSincronizarSaldos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoSincronizarSaldos() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
	
		//this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.setVisible(this.procesosincronizarsaldosConstantesFunciones.mostraridProcesoSincronizarSaldos);
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jPanelidProcesoSincronizarSaldos.setVisible(this.procesosincronizarsaldosConstantesFunciones.mostraridProcesoSincronizarSaldos);
		//this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.setVisible(this.procesosincronizarsaldosConstantesFunciones.mostrarid_ejercicioProcesoSincronizarSaldos);
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jPanelid_ejercicioProcesoSincronizarSaldos.setVisible(this.procesosincronizarsaldosConstantesFunciones.mostrarid_ejercicioProcesoSincronizarSaldos);
		//this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.setVisible(this.procesosincronizarsaldosConstantesFunciones.mostrarid_periodoProcesoSincronizarSaldos);
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jPanelid_periodoProcesoSincronizarSaldos.setVisible(this.procesosincronizarsaldosConstantesFunciones.mostrarid_periodoProcesoSincronizarSaldos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoSincronizarSaldos() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoSincronizarSaldos!=null) {
	
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jLabelidProcesoSincronizarSaldos.setEnabled(this.procesosincronizarsaldosConstantesFunciones.activaridProcesoSincronizarSaldos);
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_ejercicioProcesoSincronizarSaldos.setEnabled(this.procesosincronizarsaldosConstantesFunciones.activarid_ejercicioProcesoSincronizarSaldos);
		this.jInternalFrameDetalleFormProcesoSincronizarSaldos.jComboBoxid_periodoProcesoSincronizarSaldos.setEnabled(this.procesosincronizarsaldosConstantesFunciones.activarid_periodoProcesoSincronizarSaldos);
		}
	}
	
		
}