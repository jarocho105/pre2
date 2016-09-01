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

//import com.bydan.erp.contabilidad.util.ProcesoCierreEjercicioAnualConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ProcesoCierreEjercicioAnualParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ProcesoCierreEjercicioAnualParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ProcesoCierreEjercicioAnualBean;
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
public class ProcesoCierreEjercicioAnualBeanSwingJInternalFrame extends ProcesoCierreEjercicioAnualJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCierreEjercicioAnualBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCierreEjercicioAnual> procesocierreejercicioanualValidator = new ClassValidator<ProcesoCierreEjercicioAnual>(ProcesoCierreEjercicioAnual.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCierreEjercicioAnual procesocierreejercicioanual;	
	public ProcesoCierreEjercicioAnual procesocierreejercicioanualAux;
	public ProcesoCierreEjercicioAnual procesocierreejercicioanualAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCierreEjercicioAnual procesocierreejercicioanualTotales;
	public Long idProcesoCierreEjercicioAnualActual;
	public Long iIdNuevoProcesoCierreEjercicioAnual=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoDocumento="";

	public List<TipoDocumento> tipodocumentosForeignKey;

	public List<TipoDocumento> gettipodocumentosForeignKey() {
		return tipodocumentosForeignKey;
	}

	public void settipodocumentosForeignKey(List<TipoDocumento> tipodocumentosForeignKey) {
		this.tipodocumentosForeignKey = tipodocumentosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDocumento tipodocumentoForeignKey;

	public TipoDocumento gettipodocumentoForeignKey() {
		return tipodocumentoForeignKey;
	}

	public void settipodocumentoForeignKey(TipoDocumento tipodocumentoForeignKey) {
		this.tipodocumentoForeignKey = tipodocumentoForeignKey;
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
	
	public Boolean isPermisoTodoProcesoCierreEjercicioAnual;
	public Boolean isPermisoNuevoProcesoCierreEjercicioAnual;
	public Boolean isPermisoActualizarProcesoCierreEjercicioAnual;
	public Boolean isPermisoActualizarOriginalProcesoCierreEjercicioAnual;
	public Boolean isPermisoEliminarProcesoCierreEjercicioAnual;
	public Boolean isPermisoGuardarCambiosProcesoCierreEjercicioAnual;
	public Boolean isPermisoConsultaProcesoCierreEjercicioAnual;
	public Boolean isPermisoBusquedaProcesoCierreEjercicioAnual;
	public Boolean isPermisoReporteProcesoCierreEjercicioAnual;
	public Boolean isPermisoPaginacionMedioProcesoCierreEjercicioAnual;
	public Boolean isPermisoPaginacionAltoProcesoCierreEjercicioAnual;
	public Boolean isPermisoPaginacionTodoProcesoCierreEjercicioAnual;
	public Boolean isPermisoCopiarProcesoCierreEjercicioAnual;
	public Boolean isPermisoVerFormProcesoCierreEjercicioAnual;
	public Boolean isPermisoDuplicarProcesoCierreEjercicioAnual;
	public Boolean isPermisoOrdenProcesoCierreEjercicioAnual;
	
	
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
	
	public ProcesoCierreEjercicioAnualParameterReturnGeneral procesocierreejercicioanualReturnGeneral;
	public ProcesoCierreEjercicioAnualParameterReturnGeneral procesocierreejercicioanualParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCierreEjercicioAnual=false;
	public Boolean esParaAccionDesdeFormularioProcesoCierreEjercicioAnual=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCierreEjercicioAnualSessionBeanAdditional procesocierreejercicioanualSessionBeanAdditional=null;
	
	public ProcesoCierreEjercicioAnualSessionBeanAdditional getProcesoCierreEjercicioAnualSessionBeanAdditional() {
		return this.procesocierreejercicioanualSessionBeanAdditional;
	}
	
	public void setProcesoCierreEjercicioAnualSessionBeanAdditional(ProcesoCierreEjercicioAnualSessionBeanAdditional procesocierreejercicioanualSessionBeanAdditional) {
		try {
			this.procesocierreejercicioanualSessionBeanAdditional=procesocierreejercicioanualSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional procesocierreejercicioanualBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCierreEjercicioAnualBeanSwingJInternalFrame
	
	public ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional getProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional() {
		return this.procesocierreejercicioanualBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional(ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional procesocierreejercicioanualBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocierreejercicioanualBeanSwingJInternalFrameAdditional=procesocierreejercicioanualBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCierreEjercicioAnualLogic procesocierreejercicioanualLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCierreEjercicioAnual procesocierreejercicioanualBean;
	public ProcesoCierreEjercicioAnualConstantesFunciones procesocierreejercicioanualConstantesFunciones;
	//public ProcesoCierreEjercicioAnualParameterReturnGeneral procesocierreejercicioanualReturnGeneral;
	
	//FK
	
	public TipoDocumentoLogic tipodocumentoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCierreEjercicioAnual> procesocierreejercicioanuals;	
	//public List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsEliminados;
	//public List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
	public Boolean isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCierreEjercicioAnual=false;
	public Boolean isVisibilidadFK_IdTipoDocumento=false;
	
	public Long getiIdNuevoProcesoCierreEjercicioAnual() {
		return this.iIdNuevoProcesoCierreEjercicioAnual;
	}

	public void setiIdNuevoProcesoCierreEjercicioAnual(Long iIdNuevoProcesoCierreEjercicioAnual) {
		this.iIdNuevoProcesoCierreEjercicioAnual = iIdNuevoProcesoCierreEjercicioAnual;
	}
	
	public Long getidProcesoCierreEjercicioAnualActual() {
		return this.idProcesoCierreEjercicioAnualActual;
	}

	public void setidProcesoCierreEjercicioAnualActual(Long idProcesoCierreEjercicioAnualActual) {
		this.idProcesoCierreEjercicioAnualActual = idProcesoCierreEjercicioAnualActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCierreEjercicioAnual getprocesocierreejercicioanual() {
		return this.procesocierreejercicioanual;
	}

	public void setprocesocierreejercicioanual(ProcesoCierreEjercicioAnual procesocierreejercicioanual) {
		this.procesocierreejercicioanual = procesocierreejercicioanual;
	}
	
	public ProcesoCierreEjercicioAnual getprocesocierreejercicioanualAux() {
		return this.procesocierreejercicioanualAux;
	}

	public void setprocesocierreejercicioanualAux(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux) {
		this.procesocierreejercicioanualAux = procesocierreejercicioanualAux;
	}				
	
	public ProcesoCierreEjercicioAnual getprocesocierreejercicioanualAnterior() {
		return this.procesocierreejercicioanualAnterior;
	}

	public void setprocesocierreejercicioanualAnterior(ProcesoCierreEjercicioAnual procesocierreejercicioanualAnterior) {
		this.procesocierreejercicioanualAnterior = procesocierreejercicioanualAnterior;
	}	
	
	public ProcesoCierreEjercicioAnual getprocesocierreejercicioanualTotales() {
		return this.procesocierreejercicioanualTotales;
	}

	public void setprocesocierreejercicioanualTotales(ProcesoCierreEjercicioAnual procesocierreejercicioanualTotales) {
		this.procesocierreejercicioanualTotales = procesocierreejercicioanualTotales;
	}	
	
	public ProcesoCierreEjercicioAnual getprocesocierreejercicioanualBean() {
		return this.procesocierreejercicioanualBean;
	}

	public void setprocesocierreejercicioanualBean(ProcesoCierreEjercicioAnual procesocierreejercicioanualBean) {
		this.procesocierreejercicioanualBean = procesocierreejercicioanualBean;
	}	
	
	public ProcesoCierreEjercicioAnualParameterReturnGeneral getprocesocierreejercicioanualReturnGeneral() {
		return this.procesocierreejercicioanualReturnGeneral;
	}

	public void setprocesocierreejercicioanualReturnGeneral(ProcesoCierreEjercicioAnualParameterReturnGeneral procesocierreejercicioanualReturnGeneral) {
		this.procesocierreejercicioanualReturnGeneral = procesocierreejercicioanualReturnGeneral;
	}	
	
	
	public Long id_tipo_documentoBusquedaProcesoCierreEjercicioAnual=-1L;

	public Long getid_tipo_documentoBusquedaProcesoCierreEjercicioAnual() {
		return this.id_tipo_documentoBusquedaProcesoCierreEjercicioAnual;
	}

	public void setid_tipo_documentoBusquedaProcesoCierreEjercicioAnual(Long id_tipo_documentoBusquedaProcesoCierreEjercicioAnual) {
		this.id_tipo_documentoBusquedaProcesoCierreEjercicioAnual = id_tipo_documentoBusquedaProcesoCierreEjercicioAnual;
	}

;
	public Date fechaBusquedaProcesoCierreEjercicioAnual=new Date();

	public Date getfechaBusquedaProcesoCierreEjercicioAnual() {
		return this.fechaBusquedaProcesoCierreEjercicioAnual;
	}

	public void setfechaBusquedaProcesoCierreEjercicioAnual(Date fechaBusquedaProcesoCierreEjercicioAnual) {
		this.fechaBusquedaProcesoCierreEjercicioAnual = fechaBusquedaProcesoCierreEjercicioAnual;
	}

	public Long id_tipo_documentoFK_IdTipoDocumento=-1L;

	public Long getid_tipo_documentoFK_IdTipoDocumento() {
		return this.id_tipo_documentoFK_IdTipoDocumento;
	}

	public void setid_tipo_documentoFK_IdTipoDocumento(Long id_tipo_documentoFK_IdTipoDocumento) {
		this.id_tipo_documentoFK_IdTipoDocumento = id_tipo_documentoFK_IdTipoDocumento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoCierreEjercicioAnualLogic getProcesoCierreEjercicioAnualLogic()	{		
		return procesocierreejercicioanualLogic;
	}

	public void setProcesoCierreEjercicioAnualLogic(ProcesoCierreEjercicioAnualLogic procesocierreejercicioanualLogic) {
		this.procesocierreejercicioanualLogic = procesocierreejercicioanualLogic;
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
	
	public Boolean getIsEsNuevoProcesoCierreEjercicioAnual() {
		return isEsNuevoProcesoCierreEjercicioAnual;
	}

	public void setIsEsNuevoProcesoCierreEjercicioAnual(Boolean isEsNuevoProcesoCierreEjercicioAnual) {
		this.isEsNuevoProcesoCierreEjercicioAnual = isEsNuevoProcesoCierreEjercicioAnual;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCierreEjercicioAnual() {
		return esParaAccionDesdeFormularioProcesoCierreEjercicioAnual;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCierreEjercicioAnual(Boolean esParaAccionDesdeFormularioProcesoCierreEjercicioAnual) {
		this.esParaAccionDesdeFormularioProcesoCierreEjercicioAnual = esParaAccionDesdeFormularioProcesoCierreEjercicioAnual;
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
	
	
	public void cargarCombosTipoDocumentosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDocumentoLogic tipodocumentoLogic=new TipoDocumentoLogic();

			tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocierreejercicioanualSessionBean==null) {
				this.procesocierreejercicioanualSessionBean=new ProcesoCierreEjercicioAnualSessionBean();
			}

			if(!this.procesocierreejercicioanualSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

					tipodocumentoLogic.getTodosTipoDocumentosWithConnection(sFinalQuery,new Pagination());

					this.tipodocumentosForeignKey=tipodocumentoLogic.getTipoDocumentos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDocumento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getEntityWithConnection(procesocierreejercicioanualSessionBean.getlidTipoDocumentoActual());
					this.tipodocumentosForeignKey.add(tipodocumentoLogic.getTipoDocumento());
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

	
	
	public void setActualTipoDocumentoForeignKey(Long idTipoDocumentoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodocumentoTemp!=null) {

					if(this.procesocierreejercicioanual!=null) {
						this.procesocierreejercicioanual.setTipoDocumento(tipodocumentoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
						this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setSelectedItem(tipodocumentoTemp);
					}
				} else {
					//jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setSelectedItem(tipodocumentoTemp);
					if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreEjercicioAnual") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentoTemp!=null && jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual!=null) {
						jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setSelectedItem(tipodocumentoTemp);
					} else {
						if(jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual!=null) {
							//jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setSelectedItem(tipodocumentoTemp);
							if(jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.getItemCount()>0) {
								jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setSelectedIndex(0);
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

	public String getActualTipoDocumentoForeignKeyDescripcion(Long idTipoDocumentoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}


			sDescripcion=TipoDocumentoConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDocumentoForeignKeyGenerico(Long idTipoDocumentoSeleccionado,JComboBox jComboBoxid_tipo_documentoProcesoCierreEjercicioAnualGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(tipodocumentoTemp!=null) {
				jComboBoxid_tipo_documentoProcesoCierreEjercicioAnualGenerico.setSelectedItem(tipodocumentoTemp);
			} else {
				if(jComboBoxid_tipo_documentoProcesoCierreEjercicioAnualGenerico!=null && jComboBoxid_tipo_documentoProcesoCierreEjercicioAnualGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documentoProcesoCierreEjercicioAnualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoForeignKey(ProcesoCierreEjercicioAnual procesocierreejercicioanual,JComboBox jComboBoxid_tipo_documentoProcesoCierreEjercicioAnualGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoAux=new TipoDocumento();

			if(jComboBoxid_tipo_documentoProcesoCierreEjercicioAnualGenerico==null) {
				tipodocumentoAux=(TipoDocumento)this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.getSelectedItem();
			} else {
				tipodocumentoAux=(TipoDocumento)jComboBoxid_tipo_documentoProcesoCierreEjercicioAnualGenerico.getSelectedItem();
			}

			if(tipodocumentoAux!=null && tipodocumentoAux.getId()!=null) {
				procesocierreejercicioanual.setid_tipo_documento(tipodocumentoAux.getId());
				procesocierreejercicioanual.settipodocumento_descripcion(ProcesoCierreEjercicioAnualConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoAux));
				procesocierreejercicioanual.setTipoDocumento(tipodocumentoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDocumentosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDocumento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { 
							this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.addItem(tipodocumento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { 
					}

					if(!ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreEjercicioAnual") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.addItem(tipodocumento);
							}
						}

						if(!ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoDocumentoForeignKey(TipoDocumento tipodocumento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
							this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setSelectedItem(tipodocumento);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
							this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setSelectedItem(tipodocumento);
						} else {
							this.jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCierreEjercicioAnual() throws Exception {
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
		
	public ProcesoCierreEjercicioAnualParameterReturnGeneral getProcesoCierreEjercicioAnualParameterGeneral() {
		return this.procesocierreejercicioanualParameterGeneral;
	}
	
	public void setProcesoCierreEjercicioAnualParameterGeneral(ProcesoCierreEjercicioAnualParameterReturnGeneral procesocierreejercicioanualParameterGeneral) {
		this.procesocierreejercicioanualParameterGeneral = procesocierreejercicioanualParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCierreEjercicioAnual() {
		return isPermisoTodoProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoTodoProcesoCierreEjercicioAnual(Boolean isPermisoTodoProcesoCierreEjercicioAnual) {
		this.isPermisoTodoProcesoCierreEjercicioAnual = isPermisoTodoProcesoCierreEjercicioAnual;
	}

	public Boolean getIsPermisoNuevoProcesoCierreEjercicioAnual() {
		return isPermisoNuevoProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoNuevoProcesoCierreEjercicioAnual(Boolean isPermisoNuevoProcesoCierreEjercicioAnual) {
		this.isPermisoNuevoProcesoCierreEjercicioAnual = isPermisoNuevoProcesoCierreEjercicioAnual;
	}

	public Boolean getIsPermisoActualizarProcesoCierreEjercicioAnual() {
		return isPermisoActualizarProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoActualizarProcesoCierreEjercicioAnual(Boolean isPermisoActualizarProcesoCierreEjercicioAnual) {
		this.isPermisoActualizarProcesoCierreEjercicioAnual = isPermisoActualizarProcesoCierreEjercicioAnual;
	}

	public Boolean getIsPermisoEliminarProcesoCierreEjercicioAnual() {
		return isPermisoEliminarProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoEliminarProcesoCierreEjercicioAnual(Boolean isPermisoEliminarProcesoCierreEjercicioAnual) {
		this.isPermisoEliminarProcesoCierreEjercicioAnual = isPermisoEliminarProcesoCierreEjercicioAnual;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCierreEjercicioAnual() {
		return isPermisoGuardarCambiosProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoGuardarCambiosProcesoCierreEjercicioAnual(Boolean isPermisoGuardarCambiosProcesoCierreEjercicioAnual) {
		this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual = isPermisoGuardarCambiosProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsPermisoConsultaProcesoCierreEjercicioAnual() {
		return isPermisoConsultaProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoConsultaProcesoCierreEjercicioAnual(Boolean isPermisoConsultaProcesoCierreEjercicioAnual) {
		this.isPermisoConsultaProcesoCierreEjercicioAnual = isPermisoConsultaProcesoCierreEjercicioAnual;
	}

	public Boolean getIsPermisoBusquedaProcesoCierreEjercicioAnual() {
		return isPermisoBusquedaProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoBusquedaProcesoCierreEjercicioAnual(Boolean isPermisoBusquedaProcesoCierreEjercicioAnual) {
		this.isPermisoBusquedaProcesoCierreEjercicioAnual = isPermisoBusquedaProcesoCierreEjercicioAnual;
	}

	public Boolean getIsPermisoReporteProcesoCierreEjercicioAnual() {
		return isPermisoReporteProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoReporteProcesoCierreEjercicioAnual(Boolean isPermisoReporteProcesoCierreEjercicioAnual) {
		this.isPermisoReporteProcesoCierreEjercicioAnual = isPermisoReporteProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCierreEjercicioAnual() {
		return isPermisoPaginacionMedioProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoPaginacionMedioProcesoCierreEjercicioAnual(Boolean isPermisoPaginacionMedioProcesoCierreEjercicioAnual) {
		this.isPermisoPaginacionMedioProcesoCierreEjercicioAnual = isPermisoPaginacionMedioProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCierreEjercicioAnual() {
		return isPermisoPaginacionTodoProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoPaginacionTodoProcesoCierreEjercicioAnual(Boolean isPermisoPaginacionTodoProcesoCierreEjercicioAnual) {
		this.isPermisoPaginacionTodoProcesoCierreEjercicioAnual = isPermisoPaginacionTodoProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCierreEjercicioAnual() {
		return isPermisoPaginacionAltoProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoPaginacionAltoProcesoCierreEjercicioAnual(Boolean isPermisoPaginacionAltoProcesoCierreEjercicioAnual) {
		this.isPermisoPaginacionAltoProcesoCierreEjercicioAnual = isPermisoPaginacionAltoProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsPermisoCopiarProcesoCierreEjercicioAnual() {
		return isPermisoCopiarProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoCopiarProcesoCierreEjercicioAnual(Boolean isPermisoCopiarProcesoCierreEjercicioAnual) {
		this.isPermisoCopiarProcesoCierreEjercicioAnual = isPermisoCopiarProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsPermisoVerFormProcesoCierreEjercicioAnual() {
		return isPermisoVerFormProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoVerFormProcesoCierreEjercicioAnual(Boolean isPermisoVerFormProcesoCierreEjercicioAnual) {
		this.isPermisoVerFormProcesoCierreEjercicioAnual = isPermisoVerFormProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCierreEjercicioAnual() {
		return isPermisoDuplicarProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoDuplicarProcesoCierreEjercicioAnual(Boolean isPermisoDuplicarProcesoCierreEjercicioAnual) {
		this.isPermisoDuplicarProcesoCierreEjercicioAnual = isPermisoDuplicarProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsPermisoOrdenProcesoCierreEjercicioAnual() {
		return isPermisoOrdenProcesoCierreEjercicioAnual;
	}

	public void setIsPermisoOrdenProcesoCierreEjercicioAnual(Boolean isPermisoOrdenProcesoCierreEjercicioAnual) {
		this.isPermisoOrdenProcesoCierreEjercicioAnual = isPermisoOrdenProcesoCierreEjercicioAnual;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual = isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual = isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual = isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual = isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual = isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual = isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaModificarProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaModificarProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaModificarProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual = isVisibilidadCeldaModificarProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual = isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual = isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual = isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual = isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual() {
		return isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual(Boolean isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual = isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual;
	}
		
	public ProcesoCierreEjercicioAnualSessionBean getprocesocierreejercicioanualSessionBean() {
		return this.procesocierreejercicioanualSessionBean;
	}
	
	public void setprocesocierreejercicioanualSessionBean(ProcesoCierreEjercicioAnualSessionBean procesocierreejercicioanualSessionBean) {
		this.procesocierreejercicioanualSessionBean=procesocierreejercicioanualSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCierreEjercicioAnual() {
		return this.isVisibilidadBusquedaProcesoCierreEjercicioAnual;
	}

	public void setisVisibilidadBusquedaProcesoCierreEjercicioAnual(Boolean isVisibilidadBusquedaProcesoCierreEjercicioAnual) {
		this.isVisibilidadBusquedaProcesoCierreEjercicioAnual=isVisibilidadBusquedaProcesoCierreEjercicioAnual;
	}

	public Boolean getisVisibilidadFK_IdTipoDocumento() {
		return this.isVisibilidadFK_IdTipoDocumento;
	}

	public void setisVisibilidadFK_IdTipoDocumento(Boolean isVisibilidadFK_IdTipoDocumento) {
		this.isVisibilidadFK_IdTipoDocumento=isVisibilidadFK_IdTipoDocumento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual)throws Exception {
		try {
			
				this.setActualParaGuardarTipoDocumentoForeignKey(procesocierreejercicioanual,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,ProcesoCierreEjercicioAnual procesocierreejercicioanualAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCierreEjercicioAnual(procesocierreejercicioanual);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocierreejercicioanualAux.setId(procesocierreejercicioanual.getId());
		procesocierreejercicioanualAux.setVersionRow(procesocierreejercicioanual.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCierreEjercicioAnual procesocierreejercicioanualLocal) throws Exception {
		
		if(this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCierreEjercicioAnual procesocierreejercicioanualLocal) throws Exception {	
		if(this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoDocumentoDetalleFormJInternalFrame.class)) {
				TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrameLocal=(TipoDocumentoBeanSwingJInternalFrame) ((TipoDocumentoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.gettipodocumento(),true);
				tipodocumentoBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento,this.tipodocumentosForeignKey);

				tipodocumentoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				procesocierreejercicioanualLocal.setTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey("Formulario");
				this.setActualTipoDocumentoForeignKey(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCierreEjercicioAnualActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocierreejercicioanualValidator.getInvalidValues(this.procesocierreejercicioanual);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCierreEjercicioAnual procesocierreejercicioanual,List<ProcesoCierreEjercicioAnual> procesocierreejercicioanuals) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCierreEjercicioAnual procesocierreejercicioanual,List<ProcesoCierreEjercicioAnual> procesocierreejercicioanuals) throws Exception {
		try	{			
			ProcesoCierreEjercicioAnualConstantesFunciones.actualizarSelectedLista(procesocierreejercicioanual,procesocierreejercicioanuals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocierreejercicioanualsLocal=this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocierreejercicioanualsLocal=this.procesocierreejercicioanuals;
			}
			//ARCHITECTURE
		
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualLocal:procesocierreejercicioanualsLocal) {
				if(this.permiteMantenimiento(procesocierreejercicioanualLocal) && procesocierreejercicioanualLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCierreEjercicioAnualConstantesFunciones.getProcesoCierreEjercicioAnualLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoCierreEjercicioAnualConstantesFunciones.IDTIPODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jLabelid_tipo_documentoProcesoCierreEjercicioAnual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCierreEjercicioAnualConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jLabelfechaProcesoCierreEjercicioAnual,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jLabelid_tipo_documentoProcesoCierreEjercicioAnual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jLabelfechaProcesoCierreEjercicioAnual,"");
		
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
		this.iIdNuevoProcesoCierreEjercicioAnual--;	
		
		
		this.procesocierreejercicioanualAux=new ProcesoCierreEjercicioAnual();
		
		this.procesocierreejercicioanualAux.setId(this.iIdNuevoProcesoCierreEjercicioAnual);
		this.procesocierreejercicioanualAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().add(this.procesocierreejercicioanualAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocierreejercicioanuals.add(this.procesocierreejercicioanualAux);
		}
		//ARCHITECTURE
		
		this.procesocierreejercicioanual=this.procesocierreejercicioanualAux;
		
		if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
		}
				
		//this.setDefaultControlesProcesoCierreEjercicioAnual();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCierreEjercicioAnual();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCierreEjercicioAnual();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreEjercicioAnual();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanualBean,this.procesocierreejercicioanual,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCierreEjercicioAnual(this.procesocierreejercicioanualReturnGeneral,this.procesocierreejercicioanualBean,false);
		
		if(this.procesocierreejercicioanualReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreEjercicioAnual(this.procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnual());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCierreEjercicioAnual(this.procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnual());
		}
		
		if(this.procesocierreejercicioanualReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreEjercicioAnual(this.procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnual(),classes);//this.procesocierreejercicioanualBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCierreEjercicioAnual();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCierreEjercicioAnual();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.RecargarFormProcesoCierreEjercicioAnual(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
						
			if(procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreEjercicioAnual();
			}
			
			this.actualizarVisualTableDatosProcesoCierreEjercicioAnual();
			
			this.jTableDatosProcesoCierreEjercicioAnual.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreEjercicioAnual(), this.getIndiceNuevoProcesoCierreEjercicioAnual());
			
			this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCierreEjercicioAnual(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jDateChooserfechaProcesoCierreEjercicioAnual.setEnabled(isHabilitar && this.procesocierreejercicioanualConstantesFunciones.activarfechaProcesoCierreEjercicioAnual);	
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setEnabled(isHabilitar && this.procesocierreejercicioanualConstantesFunciones.activarid_tipo_documentoProcesoCierreEjercicioAnual);
	};
	
	public void setDefaultControlesProcesoCierreEjercicioAnual() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCierreEjercicioAnual(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocierreejercicioanualSessionBean.setConGuardarRelaciones(true);			
			this.procesocierreejercicioanualSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.setVisible(true);
			
					
		} else {
			//this.procesocierreejercicioanualSessionBean.setConGuardarRelaciones(false);			
			this.procesocierreejercicioanualSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCierreEjercicioAnual() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
				if(procesocierreejercicioanualAux.getId().equals(this.iIdNuevoProcesoCierreEjercicioAnual)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanuals) {
				if(procesocierreejercicioanualAux.getId().equals(this.iIdNuevoProcesoCierreEjercicioAnual)) {
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
	
	public int getIndiceActualProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
				if(procesocierreejercicioanualAux.getId().equals(procesocierreejercicioanual.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanuals) {
				if(procesocierreejercicioanualAux.getId().equals(procesocierreejercicioanual.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanualOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
				if(procesocierreejercicioanualAux.getProcesoCierreEjercicioAnualOriginal().getId().equals(procesocierreejercicioanualOriginal.getId())) {
					existe=true;
					procesocierreejercicioanualOriginal.setId(procesocierreejercicioanualAux.getId());
					procesocierreejercicioanualOriginal.setVersionRow(procesocierreejercicioanualAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanuals) {
				if(procesocierreejercicioanualAux.getProcesoCierreEjercicioAnualOriginal().getId().equals(procesocierreejercicioanualOriginal.getId())) {
					existe=true;
					procesocierreejercicioanualOriginal.setId(procesocierreejercicioanualAux.getId());
					procesocierreejercicioanualOriginal.setVersionRow(procesocierreejercicioanualAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCierreEjercicioAnual(Boolean esParaCancelar) throws Exception {
		procesocierreejercicioanualsAux=new ArrayList<ProcesoCierreEjercicioAnual>();
		procesocierreejercicioanualAux=new ProcesoCierreEjercicioAnual();
		
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
					if(procesocierreejercicioanualAux.getId()<0) {
						procesocierreejercicioanualsAux.add(procesocierreejercicioanualAux);
					}		
				}
				this.iIdNuevoProcesoCierreEjercicioAnual=0L;
				this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().removeAll(procesocierreejercicioanualsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanuals) {
					if(procesocierreejercicioanualAux.getId()<0) {
						procesocierreejercicioanualsAux.add(procesocierreejercicioanualAux);
					}		
				}
				this.iIdNuevoProcesoCierreEjercicioAnual=0L;
				this.procesocierreejercicioanuals.removeAll(procesocierreejercicioanualsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCierreEjercicioAnual 
					&& this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().size()>0
					) {
					procesocierreejercicioanualAux=this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().get(this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().size() - 1);
				
					if(procesocierreejercicioanualAux.getId()<0) {
						this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().remove(procesocierreejercicioanualAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCierreEjercicioAnual && this.procesocierreejercicioanuals.size()>0) {
					procesocierreejercicioanualAux=this.procesocierreejercicioanuals.get(this.procesocierreejercicioanuals.size() - 1);
				
					if(procesocierreejercicioanualAux.getId()<0) {
						this.procesocierreejercicioanuals.remove(procesocierreejercicioanualAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCierreEjercicioAnual(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocierreejercicioanual.getId()<0) {
				this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().remove(this.procesocierreejercicioanual);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocierreejercicioanual.getId()<0) {
				this.procesocierreejercicioanuals.remove(this.procesocierreejercicioanual);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCierreEjercicioAnual(List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsAux) throws Exception {
		ProcesoCierreEjercicioAnualConstantesFunciones.setEstadosInicialesProcesoCierreEjercicioAnual(procesocierreejercicioanualsAux);
	}
	
	public void setEstadosInicialesProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux) throws Exception {
		ProcesoCierreEjercicioAnualConstantesFunciones.setEstadosInicialesProcesoCierreEjercicioAnual(procesocierreejercicioanualAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCierreEjercicioAnualActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCierreEjercicioAnualActual()) {
				if(!this.isEsNuevoProcesoCierreEjercicioAnual) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCierreEjercicioAnual=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCierreEjercicioAnualActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Cierre Ejercicio Anual ?", "MANTENIMIENTO DE Proceso Cierre Ejercicio Anual", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCierreEjercicioAnual procesocierreejercicioanual) throws Exception {
		ProcesoCierreEjercicioAnualConstantesFunciones.seleccionarAsignar(this.procesocierreejercicioanual,procesocierreejercicioanual);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCierreEjercicioAnual=this.isPermisoActualizarOriginalProcesoCierreEjercicioAnual;
			
			
			this.seleccionarAsignar(procesocierreejercicioanual);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocierreejercicioanualSessionBean.setsFuncionBusquedaRapida(this.procesocierreejercicioanualSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCierreEjercicioAnual) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCierreEjercicioAnual(esParaCancelar);				
				this.cancelarNuevoProcesoCierreEjercicioAnual(esParaCancelar);								
			}
			
			this.procesocierreejercicioanual=new ProcesoCierreEjercicioAnual();
			
			this.inicializarProcesoCierreEjercicioAnual();
			
			this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCierreEjercicioAnual() throws Exception {
		try {
			ProcesoCierreEjercicioAnualConstantesFunciones.inicializarProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCierreEjercicioAnuals(String sAccionBusqueda,List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCierreEjercicioAnual"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCierreEjercicioAnualMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCierreEjercicioAnualMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCierreEjercicioAnual"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Cierre Ejercicio Anuales");		
		parameters.put("busquedapor", ProcesoCierreEjercicioAnualConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCierreEjercicioAnual=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCierreEjercicioAnual);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCierreEjercicioAnualConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCierreEjercicioAnualBean.TraerProcesoCierreEjercicioAnualBeans(procesocierreejercicioanualsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCierreEjercicioAnuals(sAccionBusqueda,sTipoArchivoReporte,procesocierreejercicioanualsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCierreEjercicioAnuals(sAccionBusqueda,sTipoArchivoReporte,procesocierreejercicioanualsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(null);
					//this.generarExcelReporteProcesoCierreEjercicioAnuals(sAccionBusqueda,sTipoArchivoReporte,procesocierreejercicioanualsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCierreEjercicioAnuals(sAccionBusqueda,sTipoArchivoReporte,procesocierreejercicioanualsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCierreEjercicioAnuals(sAccionBusqueda,sTipoArchivoReporte,procesocierreejercicioanualsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCierreEjercicioAnuals(sAccionBusqueda,sTipoArchivoReporte,procesocierreejercicioanualsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCierreEjercicioAnuals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreejercicioanual";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreEjercicioAnuals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierreEjercicioAnual("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCierreEjercicioAnual procesocierreejercicioanual : procesocierreejercicioanualsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCierreEjercicioAnualConstantesFunciones.generarExcelReporteDataProcesoCierreEjercicioAnual("NORMAL",row,workbook,procesocierreejercicioanual,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Ejercicio Anual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCierreEjercicioAnual(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCierreEjercicioAnualConstantesFunciones.generarExcelReporteHeaderProcesoCierreEjercicioAnual(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCierreEjercicioAnuals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreejercicioanual_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreEjercicioAnuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCierreEjercicioAnual procesocierreejercicioanual : procesocierreejercicioanualsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.getProcesoCierreEjercicioAnualDescripcion(procesocierreejercicioanual));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierreejercicioanual.gettipodocumento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierreejercicioanual.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Ejercicio Anual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCierreEjercicioAnuals(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsRespaldo=null;
		
		classes=ProcesoCierreEjercicioAnualConstantesFunciones.getClassesRelationshipsOfProcesoCierreEjercicioAnual(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocierreejercicioanualLogic.setDatosCliente(this.datosCliente);
		this.procesocierreejercicioanualLogic.setDatosDeep(this.datosDeep);
		this.procesocierreejercicioanualLogic.setIsConDeep(true);
		
		procesocierreejercicioanualsRespaldo=this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals();
		
		this.procesocierreejercicioanualLogic.setProcesoCierreEjercicioAnuals(procesocierreejercicioanualsParaReportes);	
		this.procesocierreejercicioanualLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocierreejercicioanualsParaReportes=this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals();
		this.procesocierreejercicioanualLogic.setProcesoCierreEjercicioAnuals(procesocierreejercicioanualsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreejercicioanual_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreEjercicioAnuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierreEjercicioAnual("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCierreEjercicioAnual procesocierreejercicioanual : procesocierreejercicioanualsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCierreEjercicioAnual("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCierreEjercicioAnualConstantesFunciones.generarExcelReporteDataProcesoCierreEjercicioAnual("NORMAL",row,workbook,procesocierreejercicioanual,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.getProcesoCierreEjercicioAnualDescripcion(procesocierreejercicioanual));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Ejercicio Anual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCierreEjercicioAnual() throws Exception {		
		this.startProcessProcesoCierreEjercicioAnual(true);
	}
	
	public void startProcessProcesoCierreEjercicioAnual(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual ,this.jPanelParametrosReportesProcesoCierreEjercicioAnual, this.jScrollPanelDatosProcesoCierreEjercicioAnual,this.jPanelPaginacionProcesoCierreEjercicioAnual, this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual, this.jPanelAccionesProcesoCierreEjercicioAnual,this.jPanelAccionesFormularioProcesoCierreEjercicioAnual,this.jmenuBarProcesoCierreEjercicioAnual,this.jmenuBarDetalleProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,this.jTtoolBarDetalleProcesoCierreEjercicioAnual);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierreEjercicioAnual=this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual; 
		
		final JPanel jPanelParametrosReportesProcesoCierreEjercicioAnual=this.jPanelParametrosReportesProcesoCierreEjercicioAnual;
		//final JScrollPane jScrollPanelDatosProcesoCierreEjercicioAnual=this.jScrollPanelDatosProcesoCierreEjercicioAnual;
		final JTable jTableDatosProcesoCierreEjercicioAnual=this.jTableDatosProcesoCierreEjercicioAnual;		
		final JPanel jPanelPaginacionProcesoCierreEjercicioAnual=this.jPanelPaginacionProcesoCierreEjercicioAnual;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierreEjercicioAnual=this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual;
		final JPanel jPanelAccionesProcesoCierreEjercicioAnual=this.jPanelAccionesProcesoCierreEjercicioAnual;
		
		JPanel jPanelCamposAuxiliarProcesoCierreEjercicioAnual=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierreEjercicioAnual=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			jPanelCamposAuxiliarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jPanelCamposProcesoCierreEjercicioAnual;
			jPanelAccionesFormularioAuxiliarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jPanelAccionesFormularioProcesoCierreEjercicioAnual;
		}
		
		final JPanel jPanelCamposProcesoCierreEjercicioAnual=jPanelCamposAuxiliarProcesoCierreEjercicioAnual;
		final JPanel jPanelAccionesFormularioProcesoCierreEjercicioAnual=jPanelAccionesFormularioAuxiliarProcesoCierreEjercicioAnual;
		
		
		final JMenuBar jmenuBarProcesoCierreEjercicioAnual=this.jmenuBarProcesoCierreEjercicioAnual;
		final JToolBar jTtoolBarProcesoCierreEjercicioAnual=this.jTtoolBarProcesoCierreEjercicioAnual;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierreEjercicioAnual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierreEjercicioAnual=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			jmenuBarDetalleAuxiliarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jmenuBarDetalleProcesoCierreEjercicioAnual;
			jTtoolBarDetalleAuxiliarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTtoolBarDetalleProcesoCierreEjercicioAnual;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierreEjercicioAnual=jmenuBarDetalleAuxiliarProcesoCierreEjercicioAnual;
		final JToolBar jTtoolBarDetalleProcesoCierreEjercicioAnual=jTtoolBarDetalleAuxiliarProcesoCierreEjercicioAnual;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierreEjercicioAnual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierreEjercicioAnual;
			processRunnable.jTableDatos=jTableDatosProcesoCierreEjercicioAnual;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierreEjercicioAnual;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierreEjercicioAnual;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierreEjercicioAnual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierreEjercicioAnual;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierreEjercicioAnual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierreEjercicioAnual;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierreEjercicioAnual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierreEjercicioAnual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierreEjercicioAnual ,jPanelParametrosReportesProcesoCierreEjercicioAnual,jTableDatosProcesoCierreEjercicioAnual, /*jScrollPanelDatosProcesoCierreEjercicioAnual,*/jPanelCamposProcesoCierreEjercicioAnual,jPanelPaginacionProcesoCierreEjercicioAnual, /*jScrollPanelDatosEdicionProcesoCierreEjercicioAnual,*/ jPanelAccionesProcesoCierreEjercicioAnual,jPanelAccionesFormularioProcesoCierreEjercicioAnual,jmenuBarProcesoCierreEjercicioAnual,jmenuBarDetalleProcesoCierreEjercicioAnual,jTtoolBarProcesoCierreEjercicioAnual,jTtoolBarDetalleProcesoCierreEjercicioAnual);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierreEjercicioAnual ,jPanelParametrosReportesProcesoCierreEjercicioAnual, jScrollPanelDatosProcesoCierreEjercicioAnual,jPanelPaginacionProcesoCierreEjercicioAnual, jScrollPanelDatosEdicionProcesoCierreEjercicioAnual, jPanelAccionesProcesoCierreEjercicioAnual,jPanelAccionesFormularioProcesoCierreEjercicioAnual,jmenuBarProcesoCierreEjercicioAnual,jmenuBarDetalleProcesoCierreEjercicioAnual,jTtoolBarProcesoCierreEjercicioAnual,jTtoolBarDetalleProcesoCierreEjercicioAnual);
						
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
	
	public void finishProcessProcesoCierreEjercicioAnual() {// throws Exception 
		this.finishProcessProcesoCierreEjercicioAnual(true);
	}
	
	public void finishProcessProcesoCierreEjercicioAnual(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual ,this.jPanelParametrosReportesProcesoCierreEjercicioAnual, this.jScrollPanelDatosProcesoCierreEjercicioAnual,this.jPanelPaginacionProcesoCierreEjercicioAnual, this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual, this.jPanelAccionesProcesoCierreEjercicioAnual,this.jPanelAccionesFormularioProcesoCierreEjercicioAnual,this.jmenuBarProcesoCierreEjercicioAnual,this.jmenuBarDetalleProcesoCierreEjercicioAnual,this.jTtoolBarProcesoCierreEjercicioAnual,this.jTtoolBarDetalleProcesoCierreEjercicioAnual);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierreEjercicioAnual=this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual; 
		
		final JPanel jPanelParametrosReportesProcesoCierreEjercicioAnual=this.jPanelParametrosReportesProcesoCierreEjercicioAnual;
		//final JScrollPane jScrollPanelDatosProcesoCierreEjercicioAnual=this.jScrollPanelDatosProcesoCierreEjercicioAnual;
		final JTable jTableDatosProcesoCierreEjercicioAnual=this.jTableDatosProcesoCierreEjercicioAnual;		
		final JPanel jPanelPaginacionProcesoCierreEjercicioAnual=this.jPanelPaginacionProcesoCierreEjercicioAnual;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierreEjercicioAnual=this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual;
		final JPanel jPanelAccionesProcesoCierreEjercicioAnual=this.jPanelAccionesProcesoCierreEjercicioAnual;
		
		JPanel jPanelCamposAuxiliarProcesoCierreEjercicioAnual=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierreEjercicioAnual=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			jPanelCamposAuxiliarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jPanelCamposProcesoCierreEjercicioAnual;
			jPanelAccionesFormularioAuxiliarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jPanelAccionesFormularioProcesoCierreEjercicioAnual;
		}
		
		final JPanel jPanelCamposProcesoCierreEjercicioAnual=jPanelCamposAuxiliarProcesoCierreEjercicioAnual;
		final JPanel jPanelAccionesFormularioProcesoCierreEjercicioAnual=jPanelAccionesFormularioAuxiliarProcesoCierreEjercicioAnual;
		
		
		final JMenuBar jmenuBarProcesoCierreEjercicioAnual=this.jmenuBarProcesoCierreEjercicioAnual;		
		final JToolBar jTtoolBarProcesoCierreEjercicioAnual=this.jTtoolBarProcesoCierreEjercicioAnual;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierreEjercicioAnual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierreEjercicioAnual=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			jmenuBarDetalleAuxiliarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jmenuBarDetalleProcesoCierreEjercicioAnual;
			jTtoolBarDetalleAuxiliarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTtoolBarDetalleProcesoCierreEjercicioAnual;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierreEjercicioAnual=jmenuBarDetalleAuxiliarProcesoCierreEjercicioAnual;
		final JToolBar jTtoolBarDetalleProcesoCierreEjercicioAnual=jTtoolBarDetalleAuxiliarProcesoCierreEjercicioAnual;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierreEjercicioAnual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierreEjercicioAnual;
			processRunnable.jTableDatos=jTableDatosProcesoCierreEjercicioAnual;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierreEjercicioAnual;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierreEjercicioAnual;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierreEjercicioAnual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierreEjercicioAnual;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierreEjercicioAnual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierreEjercicioAnual;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierreEjercicioAnual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierreEjercicioAnual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCierreEjercicioAnual ,jPanelParametrosReportesProcesoCierreEjercicioAnual, jTableDatosProcesoCierreEjercicioAnual,/*jScrollPanelDatosProcesoCierreEjercicioAnual,*/jPanelCamposProcesoCierreEjercicioAnual,jPanelPaginacionProcesoCierreEjercicioAnual, /*jScrollPanelDatosEdicionProcesoCierreEjercicioAnual,*/ jPanelAccionesProcesoCierreEjercicioAnual,jPanelAccionesFormularioProcesoCierreEjercicioAnual,jmenuBarProcesoCierreEjercicioAnual,jmenuBarDetalleProcesoCierreEjercicioAnual,jTtoolBarProcesoCierreEjercicioAnual,jTtoolBarDetalleProcesoCierreEjercicioAnual));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCierreEjercicioAnual(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCierreEjercicioAnual(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCierreEjercicioAnual(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCierreEjercicioAnual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCierreEjercicioAnual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCierreEjercicioAnual,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCierreEjercicioAnual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCierreEjercicioAnual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCierreEjercicioAnual,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocierreejercicioanualConstantesFunciones.getsFinalQueryProcesoCierreEjercicioAnual();
		String  finalQueryPaginacionTodos=this.procesocierreejercicioanualConstantesFunciones.getsFinalQueryProcesoCierreEjercicioAnual();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCierreEjercicioAnualConstantesFunciones.getArrayColumnasGlobalesNoProcesoCierreEjercicioAnual(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCierreEjercicioAnualConstantesFunciones.getArrayColumnasGlobalesProcesoCierreEjercicioAnual(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCierreEjercicioAnualConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocierreejercicioanualsEliminados= new ArrayList<ProcesoCierreEjercicioAnual>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCierreEjercicioAnual();
		
				///*ProcesoCierreEjercicioAnualSessionBean*/this.procesocierreejercicioanualSessionBean=new ProcesoCierreEjercicioAnualSessionBean();
			
			if(this.procesocierreejercicioanualSessionBean==null) {
				this.procesocierreejercicioanualSessionBean=new ProcesoCierreEjercicioAnualSessionBean();
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
					this.iNumeroPaginacion=ProcesoCierreEjercicioAnualConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCierreEjercicioAnualConstantesFunciones.getClassesForeignKeysOfProcesoCierreEjercicioAnual(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocierreejercicioanual."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocierreejercicioanualsAux= new ArrayList<ProcesoCierreEjercicioAnual>();
			
				
			procesocierreejercicioanualLogic.setDatosCliente(this.datosCliente);
			procesocierreejercicioanualLogic.setDatosDeep(this.datosDeep);
			procesocierreejercicioanualLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCierreEjercicioAnual")) {
				this.sDetalleReporte=ProcesoCierreEjercicioAnualConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreEjercicioAnual(id_tipo_documentoBusquedaProcesoCierreEjercicioAnual,fechaBusquedaProcesoCierreEjercicioAnual);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnualsBusquedaProcesoCierreEjercicioAnual(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_documentoBusquedaProcesoCierreEjercicioAnual,fechaBusquedaProcesoCierreEjercicioAnual);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierreEjercicioAnualConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreEjercicioAnual(id_tipo_documentoBusquedaProcesoCierreEjercicioAnual,fechaBusquedaProcesoCierreEjercicioAnual);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierreEjercicioAnualConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreEjercicioAnual(id_tipo_documentoBusquedaProcesoCierreEjercicioAnual,fechaBusquedaProcesoCierreEjercicioAnual);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()==null||procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocierreejercicioanuals==null|| procesocierreejercicioanuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreejercicioanualsAux=new ArrayList<ProcesoCierreEjercicioAnual>();
						procesocierreejercicioanualsAux.addAll(procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierreejercicioanualsAux=new ArrayList<ProcesoCierreEjercicioAnual>();
							procesocierreejercicioanualsAux.addAll(procesocierreejercicioanuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnualsBusquedaProcesoCierreEjercicioAnual(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_documentoBusquedaProcesoCierreEjercicioAnual,fechaBusquedaProcesoCierreEjercicioAnual);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierreEjercicioAnualConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreEjercicioAnual(id_tipo_documentoBusquedaProcesoCierreEjercicioAnual,fechaBusquedaProcesoCierreEjercicioAnual);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierreEjercicioAnualConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreEjercicioAnual(id_tipo_documentoBusquedaProcesoCierreEjercicioAnual,fechaBusquedaProcesoCierreEjercicioAnual);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCierreEjercicioAnuals("BusquedaProcesoCierreEjercicioAnual",procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCierreEjercicioAnuals("BusquedaProcesoCierreEjercicioAnual",procesocierreejercicioanuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreejercicioanualLogic.setProcesoCierreEjercicioAnuals(new ArrayList<ProcesoCierreEjercicioAnual>());
						procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().addAll(procesocierreejercicioanualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierreejercicioanuals=new ArrayList<ProcesoCierreEjercicioAnual>();
							procesocierreejercicioanuals.addAll(procesocierreejercicioanualsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCierreEjercicioAnual();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCierreEjercicioAnual();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierreejercicioanuals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierreejercicioanuals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCierreEjercicioAnual procesocierreejercicioanual) {
		Boolean permite=true;
		
		if(this.procesocierreejercicioanual.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCierreEjercicioAnualConstantesFunciones.getOrderByListaProcesoCierreEjercicioAnual();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCierreEjercicioAnualConstantesFunciones.getOrderByListaProcesoCierreEjercicioAnual();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanual:procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
				if(procesocierreejercicioanual.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreejercicioanualTotales=procesocierreejercicioanual;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanual:this.procesocierreejercicioanuals) {
				if(procesocierreejercicioanual.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreejercicioanualTotales=procesocierreejercicioanual;
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
			this.procesocierreejercicioanualAux=new ProcesoCierreEjercicioAnual();
			this.procesocierreejercicioanualAux.setsType(Constantes2.S_TOTALES);
			this.procesocierreejercicioanualAux.setIsNew(false);
			this.procesocierreejercicioanualAux.setIsChanged(false);
			this.procesocierreejercicioanualAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCierreEjercicioAnualConstantesFunciones.TotalizarValoresFilaProcesoCierreEjercicioAnual(this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals(),this.procesocierreejercicioanualAux);
				
				//this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().add(this.procesocierreejercicioanualAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCierreEjercicioAnualConstantesFunciones.TotalizarValoresFilaProcesoCierreEjercicioAnual(this.procesocierreejercicioanuals,this.procesocierreejercicioanualAux);
				
				this.procesocierreejercicioanuals.add(this.procesocierreejercicioanualAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocierreejercicioanualTotales=new ProcesoCierreEjercicioAnual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().remove(procesocierreejercicioanualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierreejercicioanuals.remove(procesocierreejercicioanualTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocierreejercicioanualTotales=new ProcesoCierreEjercicioAnual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanual:procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
				if(procesocierreejercicioanual.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreejercicioanualTotales=procesocierreejercicioanual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierreEjercicioAnualConstantesFunciones.TotalizarValoresFilaProcesoCierreEjercicioAnual(this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals(),procesocierreejercicioanualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanual:this.procesocierreejercicioanuals) {
				if(procesocierreejercicioanual.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierreejercicioanualTotales=procesocierreejercicioanual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierreEjercicioAnualConstantesFunciones.TotalizarValoresFilaProcesoCierreEjercicioAnual(this.procesocierreejercicioanuals,procesocierreejercicioanualTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCierreEjercicioAnualsBusquedaProcesoCierreEjercicioAnual()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCierreEjercicioAnual";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCierreEjercicioAnualsFK_IdTipoDocumento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCierreEjercicioAnualsBusquedaProcesoCierreEjercicioAnual(String sFinalQuery,Long id_tipo_documento,Date fecha)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnualsBusquedaProcesoCierreEjercicioAnual(sFinalQuery,this.pagination,id_tipo_documento,fecha);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCierreEjercicioAnualsFK_IdTipoDocumento(String sFinalQuery,Long id_tipo_documento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnualsFK_IdTipoDocumento(sFinalQuery,this.pagination,id_tipo_documento);
				
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
	
	public void inicializarPermisosProcesoCierreEjercicioAnual() {
		this.isPermisoTodoProcesoCierreEjercicioAnual=false;
		this.isPermisoNuevoProcesoCierreEjercicioAnual=false;
		this.isPermisoActualizarProcesoCierreEjercicioAnual=false;
		this.isPermisoActualizarOriginalProcesoCierreEjercicioAnual=false;
		this.isPermisoEliminarProcesoCierreEjercicioAnual=false;
		this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual=false;
		this.isPermisoConsultaProcesoCierreEjercicioAnual=true;
		this.isPermisoBusquedaProcesoCierreEjercicioAnual=true;
		this.isPermisoReporteProcesoCierreEjercicioAnual=true;
		this.isPermisoOrdenProcesoCierreEjercicioAnual=false;		
		this.isPermisoPaginacionMedioProcesoCierreEjercicioAnual=false;		
		this.isPermisoPaginacionAltoProcesoCierreEjercicioAnual=false;		
		this.isPermisoPaginacionTodoProcesoCierreEjercicioAnual=false;		
		this.isPermisoCopiarProcesoCierreEjercicioAnual=false;		
		this.isPermisoVerFormProcesoCierreEjercicioAnual=false;		
		this.isPermisoDuplicarProcesoCierreEjercicioAnual=false;
		this.isPermisoOrdenProcesoCierreEjercicioAnual=false;
	}
	
	public void setPermisosUsuarioProcesoCierreEjercicioAnual(Boolean isPermiso) {
		this.isPermisoTodoProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoNuevoProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoActualizarProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoEliminarProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoConsultaProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoBusquedaProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoReporteProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoOrdenProcesoCierreEjercicioAnual=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCierreEjercicioAnual=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCierreEjercicioAnual=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCierreEjercicioAnual=isPermiso;		
		this.isPermisoCopiarProcesoCierreEjercicioAnual=isPermiso;		
		this.isPermisoVerFormProcesoCierreEjercicioAnual=isPermiso;		
		this.isPermisoDuplicarProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoOrdenProcesoCierreEjercicioAnual=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCierreEjercicioAnual(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoNuevoProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoActualizarProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoEliminarProcesoCierreEjercicioAnual=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual=isPermiso;
		//this.isPermisoConsultaProcesoCierreEjercicioAnual=isPermiso;
		//this.isPermisoBusquedaProcesoCierreEjercicioAnual=isPermiso;
		//this.isPermisoReporteProcesoCierreEjercicioAnual=isPermiso;
		//this.isPermisoOrdenProcesoCierreEjercicioAnual=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCierreEjercicioAnual=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCierreEjercicioAnual=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCierreEjercicioAnual=isPermiso;		
		//this.isPermisoCopiarProcesoCierreEjercicioAnual=isPermiso;		
		//this.isPermisoDuplicarProcesoCierreEjercicioAnual=isPermiso;
		//this.isPermisoOrdenProcesoCierreEjercicioAnual=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierreEjercicioAnualClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCierreEjercicioAnualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCierreEjercicioAnual(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierreEjercicioAnualClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCierreEjercicioAnualClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCierreEjercicioAnualClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCierreEjercicioAnualClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCierreEjercicioAnual() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCierreEjercicioAnualJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCierreEjercicioAnualConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCierreEjercicioAnual=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCierreEjercicioAnual=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCierreEjercicioAnual=this.isPermisoActualizarProcesoCierreEjercicioAnual;
			this.isPermisoEliminarProcesoCierreEjercicioAnual=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCierreEjercicioAnual=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCierreEjercicioAnual=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCierreEjercicioAnual=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCierreEjercicioAnual=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierreEjercicioAnual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCierreEjercicioAnual=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCierreEjercicioAnual=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCierreEjercicioAnual=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCierreEjercicioAnual=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCierreEjercicioAnual=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCierreEjercicioAnual=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierreEjercicioAnual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCierreEjercicioAnual.setToolTipText(this.jTableDatosProcesoCierreEjercicioAnual.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCierreEjercicioAnual(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCierreEjercicioAnual(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCierreEjercicioAnualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCierreEjercicioAnualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCierreEjercicioAnual() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCierreEjercicioAnualListas()throws Exception {
		try	{						
			
				this.tipodocumentosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCierreEjercicioAnualListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCierreEjercicioAnualJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoDocumentoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodocumentosForeignKey==null||this.tipodocumentosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDocumento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDocumentoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDocumentosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCierreEjercicioAnual()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoDocumento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoDocumento()throws Exception {
		try {
			if(this.procesocierreejercicioanualSessionBean==null) {
				this.procesocierreejercicioanualSessionBean=new ProcesoCierreEjercicioAnualSessionBean();
			}

			if(!this.procesocierreejercicioanualSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				TipoDocumento tipodocumento=new TipoDocumento();
				TipoDocumentoConstantesFunciones.setTipoDocumentoDescripcion(tipodocumento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodocumento.setId(null);

				if(!TipoDocumentoConstantesFunciones.ExisteEnLista(this.tipodocumentosForeignKey,tipodocumento,true)) {

					this.tipodocumentosForeignKey.add(0,tipodocumento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierreEjercicioAnual()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierreEjercicioAnual(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoCierreEjercicioAnual()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreEjercicioAnual();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual)throws Exception {	
		try {
			
			this.setActualTipoDocumentoForeignKey(procesocierreejercicioanual.getid_tipo_documento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCierreEjercicioAnual()throws Exception {	
		try {
			
			this.setActualTipoDocumentoForeignKey(this.procesocierreejercicioanualConstantesFunciones.getid_tipo_documento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreEjercicioAnual()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCierreEjercicioAnual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCierreEjercicioAnual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCierreEjercicioAnual()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCierreEjercicioAnual()throws Exception {
		try {
			

			this.cargarCombosFrameTipoDocumentosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCierreEjercicioAnual(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCierreEjercicioAnual()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual!=null && this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ProcesoCierreEjercicioAnualBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCierreEjercicioAnualBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCierreEjercicioAnualBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocierreejercicioanualSessionBean=new ProcesoCierreEjercicioAnualSessionBean(); 
		this.procesocierreejercicioanualConstantesFunciones=new ProcesoCierreEjercicioAnualConstantesFunciones(); 
		this.procesocierreejercicioanualBean=new ProcesoCierreEjercicioAnual();//(this.procesocierreejercicioanualConstantesFunciones); 		
		this.procesocierreejercicioanualReturnGeneral=new ProcesoCierreEjercicioAnualParameterReturnGeneral(); 
		
		this.procesocierreejercicioanualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierreejercicioanualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCierreEjercicioAnualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCierreEjercicioAnualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCierreEjercicioAnualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCierreEjercicioAnual(true);
			
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
			
			this.procesocierreejercicioanualConstantesFunciones=new ProcesoCierreEjercicioAnualConstantesFunciones(); 
			this.procesocierreejercicioanualBean=new ProcesoCierreEjercicioAnual();//this.procesocierreejercicioanualConstantesFunciones); 			
			this.procesocierreejercicioanualReturnGeneral=new ProcesoCierreEjercicioAnualParameterReturnGeneral(); 
		
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cierre Ejercicio Anual Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesocierreejercicioanual=new ProcesoCierreEjercicioAnual();
			this.procesocierreejercicioanuals = new ArrayList<ProcesoCierreEjercicioAnual>();
			this.procesocierreejercicioanualsAux = new ArrayList<ProcesoCierreEjercicioAnual>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic=new ProcesoCierreEjercicioAnualLogic();
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocierreejercicioanualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocierreejercicioanualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual);	
					}
					
					if(this.jInternalFrameImportacionProcesoCierreEjercicioAnual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierreEjercicioAnual);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCierreEjercicioAnual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCierreEjercicioAnual);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual);
				this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual);
					this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCierreEjercicioAnual!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierreEjercicioAnual);
					this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setVisible(false);
					this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCierreEjercicioAnual!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierreEjercicioAnual);
					this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setVisible(false);
					this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCierreEjercicioAnualActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCierreEjercicioAnualConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocierreejercicioanualReturnGeneral=new ProcesoCierreEjercicioAnualParameterReturnGeneral();
			
			this.procesocierreejercicioanualParameterGeneral=new ProcesoCierreEjercicioAnualParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocierreejercicioanualLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCierreEjercicioAnualJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierreEjercicioAnualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado(),this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierreEjercicioAnualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado(),this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=false;
			
			
			this.isVisibilidadBusquedaProcesoCierreEjercicioAnual=true;
			this.isVisibilidadFK_IdTipoDocumento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCierreEjercicioAnual();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCierreEjercicioAnual(false);
			
			this.setPermisosUsuarioProcesoCierreEjercicioAnual();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado() && this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCierreEjercicioAnualClasesRelacionadas();
			}
			
			if(this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCierreEjercicioAnualClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCierreEjercicioAnual();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCierreEjercicioAnual();
			}
			
			if(!this.isPermisoBusquedaProcesoCierreEjercicioAnual) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCierreEjercicioAnualConstantesFunciones.getTiposSeleccionarProcesoCierreEjercicioAnual());
				
				this.tiposColumnasSelect=ProcesoCierreEjercicioAnualConstantesFunciones.getTiposSeleccionarProcesoCierreEjercicioAnual(true);
				
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
			//if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCierreEjercicioAnual();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoCierreEjercicioAnual(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoCierreEjercicioAnual(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreEjercicioAnual() ;
			
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
			
			this.tipodocumentoLogic=new TipoDocumentoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocierreejercicioanualImplementable= (ProcesoCierreEjercicioAnualImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierreEjercicioAnualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocierreejercicioanualImplementableHome= (ProcesoCierreEjercicioAnualImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierreEjercicioAnualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocierreejercicioanuals= new ArrayList<ProcesoCierreEjercicioAnual>();
			this.procesocierreejercicioanualsEliminados= new ArrayList<ProcesoCierreEjercicioAnual>();
						
			this.isEsNuevoProcesoCierreEjercicioAnual=false;
			this.esParaAccionDesdeFormularioProcesoCierreEjercicioAnual=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCierreEjercicioAnual(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCierreEjercicioAnual();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCierreEjercicioAnualConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCierreEjercicioAnual();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCierreEjercicioAnual();
			}
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCierreEjercicioAnual(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCierreEjercicioAnual: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCierreEjercicioAnual() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCierreEjercicioAnual")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCierreEjercicioAnual();	
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
	
	public void cargarCombosForeignKeyProcesoCierreEjercicioAnual(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCierreEjercicioAnual(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCierreEjercicioAnual(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCierreEjercicioAnualListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCierreEjercicioAnual();
		
		this.cargarCombosFrameForeignKeyProcesoCierreEjercicioAnual();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCierreEjercicioAnual();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCierreEjercicioAnual();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoDocumento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDocumento(this.tipodocumentosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
			
			if(jTableDatosProcesoCierreEjercicioAnual.getRowCount()>=1) {
				jTableDatosProcesoCierreEjercicioAnual.removeRowSelectionInterval(0, jTableDatosProcesoCierreEjercicioAnual.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCierreEjercicioAnual=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCierreEjercicioAnual(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCierreEjercicioAnual(true);			
			//this.procesocierreejercicioanual=new ProcesoCierreEjercicioAnual();
			//this.procesocierreejercicioanual.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreEjercicioAnual(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual() ;
			
			if(ProcesoCierreEjercicioAnualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreEjercicioAnual(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocierreejercicioanual);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);				
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
			if(this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCierreEjercicioAnual: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRows().length;			
			}
			
			procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCierreEjercicioAnual--;			
				//ProcesoCierreEjercicioAnual procesocierreejercicioanualAux= new ProcesoCierreEjercicioAnual();			
				//procesocierreejercicioanualAux.setId(this.iIdNuevoProcesoCierreEjercicioAnual);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCierreEjercicioAnual procesocierreejercicioanualOrigen=new ProcesoCierreEjercicioAnual();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualOrigen : procesocierreejercicioanualsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocierreejercicioanualOrigen =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierreejercicioanualOrigen =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCierreEjercicioAnual();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocierreejercicioanual.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCierreEjercicioAnual(procesocierreejercicioanualOrigen,this.procesocierreejercicioanual,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().add(this.procesocierreejercicioanualAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierreejercicioanuals.add(this.procesocierreejercicioanualAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
				
				this.jTableDatosProcesoCierreEjercicioAnual.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreEjercicioAnual(), this.getIndiceNuevoProcesoCierreEjercicioAnual());
				
				int iLastRow =  this.jTableDatosProcesoCierreEjercicioAnual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierreEjercicioAnual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierreEjercicioAnual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();									
		
			ProcesoCierreEjercicioAnual procesocierreejercicioanualOrigen=new ProcesoCierreEjercicioAnual();
			ProcesoCierreEjercicioAnual procesocierreejercicioanualDestino=new ProcesoCierreEjercicioAnual();
				
			procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocierreejercicioanualsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreejercicioanualOrigen =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierreejercicioanualOrigen =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierreejercicioanualDestino =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierreejercicioanualDestino =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocierreejercicioanualOrigen =procesocierreejercicioanualsSeleccionados.get(0);
				procesocierreejercicioanualDestino =procesocierreejercicioanualsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCierreEjercicioAnual(procesocierreejercicioanualOrigen,procesocierreejercicioanualDestino,true,false);
				
				procesocierreejercicioanualDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocierreejercicioanualDestino,procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocierreejercicioanualDestino,procesocierreejercicioanuals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
				
				//this.jTableDatosProcesoCierreEjercicioAnual.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreEjercicioAnual(), this.getIndiceNuevoProcesoCierreEjercicioAnual());
				
				int iLastRow =  this.jTableDatosProcesoCierreEjercicioAnual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierreEjercicioAnual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierreEjercicioAnual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCierreEjercicioAnual.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCierreEjercicioAnual.setVisible(!isVisible);
			this.jPanelAccionesProcesoCierreEjercicioAnual.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCierreEjercicioAnual();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCierreEjercicioAnual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCierreEjercicioAnual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCierreEjercicioAnual();
			
			this.abrirFrameOrderByProcesoCierreEjercicioAnual();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCierreEjercicioAnual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCierreEjercicioAnual(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierreEjercicioAnual);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setSize(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jContentPaneDetalleProcesoCierreEjercicioAnual.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jContentPaneDetalleProcesoCierreEjercicioAnual.getWidth(),ProcesoCierreEjercicioAnualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jContentPaneDetalleProcesoCierreEjercicioAnual.getWidth(),ProcesoCierreEjercicioAnualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jContentPaneDetalleProcesoCierreEjercicioAnual.getWidth(),ProcesoCierreEjercicioAnualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCierreEjercicioAnual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCierreEjercicioAnual==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCierreEjercicioAnual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreEjercicioAnual,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCierreEjercicioAnual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreEjercicioAnual,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierreEjercicioAnual);
				this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setVisible(false);
				this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierreEjercicioAnual"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCierreEjercicioAnual();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCierreEjercicioAnual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCierreEjercicioAnual==null) {
				
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual=new ImportacionJInternalFrame(ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierreEjercicioAnual);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierreEjercicioAnual);
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setVisible(false);
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setSelected(false);


				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierreEjercicioAnual"));
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierreEjercicioAnual"));
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierreEjercicioAnual"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCierreEjercicioAnual() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual==null) {
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual=new ReporteDinamicoJInternalFrame(ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual);
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreEjercicioAnual"));
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreEjercicioAnual"));
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreEjercicioAnual"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreEjercicioAnual();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCierreEjercicioAnual() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierreEjercicioAnual);
			
	       	this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.dispose();
			//this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCierreEjercicioAnual() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCierreEjercicioAnual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setVisible(true);
	        this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCierreEjercicioAnual() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setVisible(true);
	        this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCierreEjercicioAnual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setVisible(false);
	        this.jInternalFrameOrderByProcesoCierreEjercicioAnual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCierreEjercicioAnual() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCierreEjercicioAnual() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setVisible(false);
	        this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCierreEjercicioAnual(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCierreEjercicioAnual(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCierreEjercicioAnual(true);
			//this.isEsNuevoProcesoCierreEjercicioAnual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreEjercicioAnual(false) ;
			
			if(procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCierreEjercicioAnualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreEjercicioAnual(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCierreEjercicioAnualActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCierreEjercicioAnual(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCierreEjercicioAnual(true);
			//this.isEsNuevoProcesoCierreEjercicioAnual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocierreejercicioanual.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCierreEjercicioAnual(false) ;
			
			if(ProcesoCierreEjercicioAnualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreEjercicioAnual(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoDocumento(List<TipoDocumento> tipodocumentosForeignKey)throws Exception{
		TableColumn tableColumnTipoDocumento=this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreEjercicioAnual,ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO));
		TableCellEditor tableCellEditorTipoDocumento =tableColumnTipoDocumento.getCellEditor();

		TipoDocumentoTableCell tipodocumentoTableCellFk=(TipoDocumentoTableCell)tableCellEditorTipoDocumento;

		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.settipodocumentosForeignKey(tipodocumentosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentoTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentoTableCellFk.settipodocumentosForeignKeyActual(tipodocumentosForeignKey);
		//}


		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.RecargarTipoDocumentosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierreEjercicioAnual(false);
			
			//if(!this.isEsNuevoProcesoCierreEjercicioAnual) {								
				int intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
				
			}
			
			if(this.permiteMantenimiento(this.procesocierreejercicioanual)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCierreEjercicioAnual=true;
					this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
					this.isEsNuevoProcesoCierreEjercicioAnual=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCierreEjercicioAnual=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCierreEjercicioAnual=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierreEjercicioAnual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual(false);
				
				this.habilitarDeshabilitarControlesProcesoCierreEjercicioAnual(false);
			
												
				
				if(ProcesoCierreEjercicioAnualJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCierreEjercicioAnual();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,procesocierreejercicioanualSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCierreEjercicioAnual.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocierreejercicioanualSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocierreejercicioanual.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				this.procesocierreejercicioanual.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				this.procesocierreejercicioanual.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocierreejercicioanual)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCierreEjercicioAnualModel) this.jTableDatosProcesoCierreEjercicioAnual.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCierreEjercicioAnual=true;
				this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
				this.isEsNuevoProcesoCierreEjercicioAnual=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierreEjercicioAnual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual(false);
				
				this.habilitarDeshabilitarControlesProcesoCierreEjercicioAnual(false);
				
				
				
				if(ProcesoCierreEjercicioAnualJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCierreEjercicioAnual();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCierreEjercicioAnual.getRowCount()>=1) {
				jTableDatosProcesoCierreEjercicioAnual.removeRowSelectionInterval(0, jTableDatosProcesoCierreEjercicioAnual.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCierreEjercicioAnual(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreEjercicioAnual(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual(false) ;
			
			this.isEsNuevoProcesoCierreEjercicioAnual=false;
			
			if(ProcesoCierreEjercicioAnualJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCierreEjercicioAnual();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
				
				//SI ES MANUAL
				if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCierreEjercicioAnual();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCierreEjercicioAnual--;			
			//ProcesoCierreEjercicioAnual procesocierreejercicioanualAux= new ProcesoCierreEjercicioAnual();			
			//procesocierreejercicioanualAux.setId(this.iIdNuevoProcesoCierreEjercicioAnual);
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCierreEjercicioAnual();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
			
			this.procesocierreejercicioanual.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().add(this.procesocierreejercicioanualAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocierreejercicioanuals.add(this.procesocierreejercicioanualAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
			
			this.jTableDatosProcesoCierreEjercicioAnual.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreEjercicioAnual(), this.getIndiceNuevoProcesoCierreEjercicioAnual());
			
			int iLastRow =  this.jTableDatosProcesoCierreEjercicioAnual.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCierreEjercicioAnual.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCierreEjercicioAnual.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
			
			//SI ES MANUAL
			if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreEjercicioAnual();
			}
			
			//this.abrirFrameTreeProcesoCierreEjercicioAnual();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setFileImportacion(this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCierreEjercicioAnual.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();		

		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCierreEjercicioAnualBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCierreEjercicioAnualBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCierreEjercicioAnuals("Todos",procesocierreejercicioanualsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Ejercicio Anual",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					sNombreCampoCategoria="id_tipo_documento";
					break;

				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					sNombreCampoCategoriaValor="id_tipo_documento";
					break;

				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_documento");
					break;

				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();		
		
		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreejercicioanual";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCierreEjercicioAnuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO);
					iRow++;

					for(ProcesoCierreEjercicioAnual procesocierreejercicioanual:procesocierreejercicioanualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierreejercicioanual.gettipodocumento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ProcesoCierreEjercicioAnual procesocierreejercicioanual:procesocierreejercicioanualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierreejercicioanual.getfecha());
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
			//	this.getFilaCabeceraExportarExcelProcesoCierreEjercicioAnual(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanualsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCierreEjercicioAnual(procesocierreejercicioanualAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Ejercicio Anual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoCierreEjercicioAnual(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
			
			//SI ES MANUAL
			if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreEjercicioAnual();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
			
			//SI ES MANUAL
			if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierreEjercicioAnual();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
			
			//SI ES MANUAL
			if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierreEjercicioAnual();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCierreEjercicioAnual() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCierreEjercicioAnual.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCierreEjercicioAnual.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCierreEjercicioAnual.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCierreEjercicioAnual.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCierreEjercicioAnual.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCierreEjercicioAnual.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCierreEjercicioAnual.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCierreEjercicioAnual(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCierreEjercicioAnual(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCierreEjercicioAnual(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCierreEjercicioAnual(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCierreEjercicioAnual(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreEjercicioAnual(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierreEjercicioAnual(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCierreEjercicioAnual() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual();
		
		this.inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierreEjercicioAnual();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreEjercicioAnual() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreEjercicioAnual(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreEjercicioAnual(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jCheckBoxPostAccionNuevoProcesoCierreEjercicioAnual.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jCheckBoxPostAccionSinCerrarProcesoCierreEjercicioAnual.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jCheckBoxPostAccionSinMensajeProcesoCierreEjercicioAnual.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCierreEjercicioAnual.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
				this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jCheckBoxPostAccionNuevoProcesoCierreEjercicioAnual.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jCheckBoxPostAccionSinCerrarProcesoCierreEjercicioAnual.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jCheckBoxPostAccionSinMensajeProcesoCierreEjercicioAnual.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCierreEjercicioAnual.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCierreEjercicioAnual(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreEjercicioAnual(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreEjercicioAnual() throws Exception {
		try	{
			if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierreEjercicioAnual();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierreEjercicioAnual() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierreEjercicioAnual() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCierreEjercicioAnual.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCierreEjercicioAnual.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCierreEjercicioAnual.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCierreEjercicioAnual.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.addItem(reporte);
			}
			
			
			if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCierreEjercicioAnual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreEjercicioAnual();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreEjercicioAnual() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCierreEjercicioAnual()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.getSelectedItem()!=null){this.id_tipo_documentoBusquedaProcesoCierreEjercicioAnual=((TipoDocumento)this.jComboBoxid_tipo_documentoBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.getSelectedItem()).getId();}
		this.fechaBusquedaProcesoCierreEjercicioAnual=new Date(this.jDateChooserfechaBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCierreEjercicioAnual(Boolean esInicializar) throws Exception {				
		if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierreEjercicioAnual();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCierreEjercicioAnual() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCierreEjercicioAnual() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCierreEjercicioAnualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCierreEjercicioAnualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCierreEjercicioAnualOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreEjercicioAnualOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCierreEjercicioAnualPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCierreEjercicioAnualPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocierreejercicioanuals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCierreEjercicioAnual.setModel(new ProcesoCierreEjercicioAnualModel(this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCierreEjercicioAnual.setModel(new ProcesoCierreEjercicioAnualModel(this.procesocierreejercicioanuals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCierreEjercicioAnual!=null && this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCierreEjercicioAnual();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreEjercicioAnual,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCierreEjercicioAnualPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO,procesocierreejercicioanualConstantesFunciones.resaltarSeleccionarProcesoCierreEjercicioAnual,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCierreEjercicioAnualConstantesFunciones.SCLASSWEBTITULO,procesocierreejercicioanualConstantesFunciones.resaltarSeleccionarProcesoCierreEjercicioAnual,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreEjercicioAnual,ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_ID));

		if(this.procesocierreejercicioanualConstantesFunciones.mostraridProcesoCierreEjercicioAnual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocierreejercicioanualConstantesFunciones.resaltaridProcesoCierreEjercicioAnual,this.procesocierreejercicioanualConstantesFunciones.activaridProcesoCierreEjercicioAnual,this,true,"idProcesoCierreEjercicioAnual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocierreejercicioanualConstantesFunciones.resaltaridProcesoCierreEjercicioAnual,this.procesocierreejercicioanualConstantesFunciones.activaridProcesoCierreEjercicioAnual,this,true,"idProcesoCierreEjercicioAnual","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreEjercicioAnual,ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO));

		if(this.procesocierreejercicioanualConstantesFunciones.mostrarid_tipo_documentoProcesoCierreEjercicioAnual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDocumentoTableCell(this.tipodocumentosForeignKey,this.procesocierreejercicioanualConstantesFunciones.resaltarid_tipo_documentoProcesoCierreEjercicioAnual,this,this.procesocierreejercicioanualConstantesFunciones.activarid_tipo_documentoProcesoCierreEjercicioAnual));
			tableColumn.setCellEditor(new TipoDocumentoTableCell(this.tipodocumentosForeignKey,this.procesocierreejercicioanualConstantesFunciones.resaltarid_tipo_documentoProcesoCierreEjercicioAnual,this,this.procesocierreejercicioanualConstantesFunciones.activarid_tipo_documentoProcesoCierreEjercicioAnual,true,"id_tipo_documentoProcesoCierreEjercicioAnual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreEjercicioAnualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreEjercicioAnual,ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA));

		if(this.procesocierreejercicioanualConstantesFunciones.mostrarfechaProcesoCierreEjercicioAnual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesocierreejercicioanualConstantesFunciones.resaltarfechaProcesoCierreEjercicioAnual,this.procesocierreejercicioanualConstantesFunciones.activarfechaProcesoCierreEjercicioAnual,this,true,"fechaProcesoCierreEjercicioAnual","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesocierreejercicioanualConstantesFunciones.resaltarfechaProcesoCierreEjercicioAnual,this.procesocierreejercicioanualConstantesFunciones.activarfechaProcesoCierreEjercicioAnual,this,true,"fechaProcesoCierreEjercicioAnual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreEjercicioAnualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierreEjercicioAnual.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierreEjercicioAnual.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCierreEjercicioAnual.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCierreEjercicioAnual.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCierreEjercicioAnual.moveColumn(this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCierreEjercicioAnual.moveColumn(this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCierreEjercicioAnual.moveColumn(this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCierreEjercicioAnual.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCierreEjercicioAnual.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCierreEjercicioAnual,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCierreEjercicioAnual.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCierreEjercicioAnual.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCierreEjercicioAnual.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocierreejercicioanuals.size()-1;
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
		//this.jTableDatosProcesoCierreEjercicioAnual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCierreEjercicioAnual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCierreEjercicioAnual();
			
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
				
				//this.isEsNuevoProcesoCierreEjercicioAnual=false;
					
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
				if(this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierreEjercicioAnual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocierreejercicioanual.getsType().equals("DUPLICADO")
				   || this.procesocierreejercicioanual.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCierreEjercicioAnual=true;
				
				} else {
					this.isEsNuevoProcesoCierreEjercicioAnual=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocierreejercicioanual.getId()>=0 && !this.procesocierreejercicioanual.getIsNew()) {						
						this.isEsNuevoProcesoCierreEjercicioAnual=false;
						
					} else {
						this.isEsNuevoProcesoCierreEjercicioAnual=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCierreEjercicioAnual(esRelaciones);						
				
				this.seleccionarProcesoCierreEjercicioAnual(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocierreejercicioanual.getId()<0) {
					this.isEsNuevoProcesoCierreEjercicioAnual=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCierreEjercicioAnual(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCierreEjercicioAnual(evt,rowIndex);
				}	
				
				if(this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCierreEjercicioAnual: " + this.dDif); 
					}
				}								
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCierreEjercicioAnual(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocierreejercicioanual)) {
					if(this.procesocierreejercicioanual.getId()>0) {
						this.procesocierreejercicioanual.setIsDeleted(true);
						
						this.procesocierreejercicioanualsEliminados.add(this.procesocierreejercicioanual);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().remove(this.procesocierreejercicioanual);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierreejercicioanuals.remove(this.procesocierreejercicioanual);				
					}
					
					
					((ProcesoCierreEjercicioAnualModel) this.jTableDatosProcesoCierreEjercicioAnual.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCierreEjercicioAnual(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCierreEjercicioAnual) {
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierreEjercicioAnual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoDocumento
					if(!this.procesocierreejercicioanualConstantesFunciones.cargarid_tipo_documentoProcesoCierreEjercicioAnual || this.procesocierreejercicioanualConstantesFunciones.event_dependid_tipo_documentoProcesoCierreEjercicioAnual) {
						//this.cargarCombosTipoDocumentosForeignKeyLista(" where id="+this.procesocierreejercicioanual.getid_tipo_documento());
									//this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);
						this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();

						if(procesocierreejercicioanual.getTipoDocumento()!=null) {
							this.tipodocumentosForeignKey.add(procesocierreejercicioanual.getTipoDocumento());
						}

						this.addItemDefectoCombosForeignKeyTipoDocumento();
						this.cargarCombosFrameTipoDocumentosForeignKey("Todos");
					}
					this.setActualTipoDocumentoForeignKey(this.procesocierreejercicioanual.getid_tipo_documento(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCierreEjercicioAnual(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCierreEjercicioAnual(procesocierreejercicioanual,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCierreEjercicioAnual(procesocierreejercicioanual);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCierreEjercicioAnual(procesocierreejercicioanual,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreEjercicioAnual(procesocierreejercicioanual);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.setText(procesocierreejercicioanual.getId().toString());
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jDateChooserfechaProcesoCierreEjercicioAnual.setDate(procesocierreejercicioanual.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCierreEjercicioAnual procesocierreejercicioanualLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocierreejercicioanualLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCierreEjercicioAnual procesocierreejercicioanualLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocierreejercicioanualLocal=this.procesocierreejercicioanual;
			} else {
				procesocierreejercicioanualLocal=this.procesocierreejercicioanualAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocierreejercicioanualLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCierreEjercicioAnual(procesocierreejercicioanualLocal,true);
					
					if(procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocierreejercicioanualLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocierreejercicioanualLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(procesocierreejercicioanual,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(procesocierreejercicioanual);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(procesocierreejercicioanual,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.getText()==null || this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.getText()=="" || this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.setText("0");
			}

			if(conColumnasBase) {procesocierreejercicioanual.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jLabelIdProcesoCierreEjercicioAnual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocierreejercicioanual.setfecha(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jDateChooserfechaProcesoCierreEjercicioAnual.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jLabelfechaProcesoCierreEjercicioAnual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanualBean,ProcesoCierreEjercicioAnual procesocierreejercicioanual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && procesocierreejercicioanualBean.getid_tipo_documento()!=null && !procesocierreejercicioanualBean.getid_tipo_documento().equals(-1L))) {procesocierreejercicioanual.setid_tipo_documento(procesocierreejercicioanualBean.getid_tipo_documento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanualOrigen,ProcesoCierreEjercicioAnual procesocierreejercicioanual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierreejercicioanualOrigen.getId()!=null && !procesocierreejercicioanualOrigen.getId().equals(0L))) {procesocierreejercicioanual.setId(procesocierreejercicioanualOrigen.getId());}}
			if(conDefault || (!conDefault && procesocierreejercicioanualOrigen.getid_tipo_documento()!=null && !procesocierreejercicioanualOrigen.getid_tipo_documento().equals(-1L))) {procesocierreejercicioanual.setid_tipo_documento(procesocierreejercicioanualOrigen.getid_tipo_documento());}
			if(conDefault || (!conDefault && procesocierreejercicioanualOrigen.getfecha()!=null && !procesocierreejercicioanualOrigen.getfecha().equals(new Date()))) {procesocierreejercicioanual.setfecha(procesocierreejercicioanualOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.setText(procesocierreejercicioanual.getId().toString());
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jDateChooserfechaProcesoCierreEjercicioAnual.setDate(procesocierreejercicioanual.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnualBean procesocierreejercicioanualBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.setText(procesocierreejercicioanualBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jDateChooserfechaProcesoCierreEjercicioAnual.setDate(procesocierreejercicioanualBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnualParameterReturnGeneral procesocierreejercicioanualReturnGeneral,ProcesoCierreEjercicioAnualBean procesocierreejercicioanualBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCierreEjercicioAnual procesocierreejercicioanualLocal=new ProcesoCierreEjercicioAnual();
			
			procesocierreejercicioanualLocal=procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnual();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierreejercicioanualLocal.getId()!=null && !procesocierreejercicioanualLocal.getId().equals(0L))) {procesocierreejercicioanualBean.setId(procesocierreejercicioanualLocal.getId());}}
			if(conDefault || (!conDefault && procesocierreejercicioanualLocal.getid_tipo_documento()!=null && !procesocierreejercicioanualLocal.getid_tipo_documento().equals(-1L))) {procesocierreejercicioanualBean.setid_tipo_documento(procesocierreejercicioanualLocal.getid_tipo_documento());}
			if(conDefault || (!conDefault && procesocierreejercicioanualLocal.getfecha()!=null && !procesocierreejercicioanualLocal.getfecha().equals(new Date()))) {procesocierreejercicioanualBean.setfecha(procesocierreejercicioanualLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCierreEjercicioAnualGenerico(Long idProcesoCierreEjercicioAnualSeleccionado,JComboBox jComboBoxProcesoCierreEjercicioAnual,List<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsLocal)throws Exception {
		try {
			ProcesoCierreEjercicioAnual  procesocierreejercicioanualTemp=null;

			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanualsLocal) {
				if(procesocierreejercicioanualAux.getId()!=null && procesocierreejercicioanualAux.getId().equals(idProcesoCierreEjercicioAnualSeleccionado)) {
					procesocierreejercicioanualTemp=procesocierreejercicioanualAux;
					break;
				}
			}

			jComboBoxProcesoCierreEjercicioAnual.setSelectedItem(procesocierreejercicioanualTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCierreEjercicioAnualGenerico(JComboBox jComboBoxProcesoCierreEjercicioAnual,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCierreEjercicioAnual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierreEjercicioAnual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCierreEjercicioAnual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierreEjercicioAnual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierreEjercicioAnual.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCierreEjercicioAnual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierreEjercicioAnual.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCierreEjercicioAnual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCierreEjercicioAnual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCierreEjercicioAnual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierreejercicioanual=(ProcesoCierreEjercicioAnual) procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) procesocierreejercicioanuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoDocumento")) {
			//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
			if(!procesocierreejercicioanual.getIsNew() && !procesocierreejercicioanual.getIsChanged() && !procesocierreejercicioanual.getIsDeleted()) {
				sDescripcion=procesocierreejercicioanual.gettipodocumento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierreejercicioanual.gettipodocumento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCierreEjercicioAnual procesocierreejercicioanualRow=new ProcesoCierreEjercicioAnual();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierreejercicioanualRow=(ProcesoCierreEjercicioAnual) procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierreejercicioanualRow=(ProcesoCierreEjercicioAnual) procesocierreejercicioanuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual && this.isPermisoNuevoProcesoCierreEjercicioAnual));			
			this.jButtonDuplicarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual && this.isPermisoDuplicarProcesoCierreEjercicioAnual));			
			this.jButtonCopiarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual && this.isPermisoCopiarProcesoCierreEjercicioAnual));
			this.jButtonVerFormProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual && this.isPermisoVerFormProcesoCierreEjercicioAnual));
			
			this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual && this.isPermisoOrdenProcesoCierreEjercicioAnual));			
			
			this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual && this.isPermisoNuevoProcesoCierreEjercicioAnual));			
			this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual && this.isPermisoNuevoProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonModificarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual && this.isPermisoActualizarProcesoCierreEjercicioAnual));	
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual && this.isPermisoActualizarProcesoCierreEjercicioAnual));	
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual && this.isPermisoEliminarProcesoCierreEjercicioAnual));
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarProcesoCierreEjercicioAnual.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual);							
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual && this.isPermisoNuevoProcesoCierreEjercicioAnual));						
			this.jButtonDuplicarToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual && this.isPermisoDuplicarProcesoCierreEjercicioAnual));						
			this.jButtonCopiarToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual && this.isPermisoCopiarProcesoCierreEjercicioAnual));			
			this.jButtonVerFormToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual && this.isPermisoVerFormProcesoCierreEjercicioAnual));			
			this.jButtonAbrirOrderByToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual && this.isPermisoOrdenProcesoCierreEjercicioAnual));
			this.jButtonNuevoRelacionesToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual && this.isPermisoNuevoProcesoCierreEjercicioAnual));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual && this.isPermisoNuevoProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));			
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonModificarToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual && this.isPermisoActualizarProcesoCierreEjercicioAnual));	
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual  && this.isPermisoActualizarProcesoCierreEjercicioAnual));	
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual && this.isPermisoEliminarProcesoCierreEjercicioAnual));
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarToolBarProcesoCierreEjercicioAnual.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual);				
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual && this.isPermisoNuevoProcesoCierreEjercicioAnual));			
			this.jMenuItemDuplicarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual && this.isPermisoDuplicarProcesoCierreEjercicioAnual));			
			this.jMenuItemCopiarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual && this.isPermisoCopiarProcesoCierreEjercicioAnual));			
			this.jMenuItemVerFormProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual && this.isPermisoVerFormProcesoCierreEjercicioAnual));			
			this.jMenuItemAbrirOrderByProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual && this.isPermisoOrdenProcesoCierreEjercicioAnual));			
			//this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual && this.isPermisoOrdenProcesoCierreEjercicioAnual));
			this.jMenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual && this.isPermisoOrdenProcesoCierreEjercicioAnual));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual && this.isPermisoOrdenProcesoCierreEjercicioAnual));			
			this.jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual && this.isPermisoNuevoProcesoCierreEjercicioAnual));			
			this.jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual && this.isPermisoNuevoProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));									
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemModificarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual && this.isPermisoActualizarProcesoCierreEjercicioAnual));	
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemActualizarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual && this.isPermisoActualizarProcesoCierreEjercicioAnual));	
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemEliminarProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual && this.isPermisoEliminarProcesoCierreEjercicioAnual));
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemCancelarProcesoCierreEjercicioAnual.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));						
			this.jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=this.jButtonNuevoProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual=this.jButtonDuplicarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual=this.jButtonCopiarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual=this.jButtonVerFormProcesoCierreEjercicioAnual.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCierreEjercicioAnual=this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=this.jButtonModificarProcesoCierreEjercicioAnual.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosProcesoCierreEjercicioAnual.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=this.jButtonNuevoToolBarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=this.jButtonNuevoRelacionesToolBarProcesoCierreEjercicioAnual.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonModificarToolBarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarToolBarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarToolBarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarToolBarProcesoCierreEjercicioAnual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=this.jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=this.jButtonGuardarCambiosTablaToolBarProcesoCierreEjercicioAnual.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=this.jMenuItemNuevoProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=this.jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemModificarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemActualizarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemEliminarProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemCancelarProcesoCierreEjercicioAnual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=this.jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCierreEjercicioAnual(Boolean esInicializar) {
		if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierreEjercicioAnual();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCierreEjercicioAnual(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCierreEjercicioAnual() {
		this.jButtonNuevoProcesoCierreEjercicioAnual.setVisible(this.isPermisoNuevoProcesoCierreEjercicioAnual);			
		this.jButtonDuplicarProcesoCierreEjercicioAnual.setVisible(this.isPermisoDuplicarProcesoCierreEjercicioAnual);			
		this.jButtonCopiarProcesoCierreEjercicioAnual.setVisible(this.isPermisoCopiarProcesoCierreEjercicioAnual);			
		this.jButtonVerFormProcesoCierreEjercicioAnual.setVisible(this.isPermisoVerFormProcesoCierreEjercicioAnual);			
		
		this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.setVisible(this.isPermisoOrdenProcesoCierreEjercicioAnual);					
		
		this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.setVisible(this.isPermisoNuevoProcesoCierreEjercicioAnual);			
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonModificarProcesoCierreEjercicioAnual.setVisible(this.isPermisoActualizarProcesoCierreEjercicioAnual);	
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarProcesoCierreEjercicioAnual.setVisible(this.isPermisoActualizarProcesoCierreEjercicioAnual);	
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarProcesoCierreEjercicioAnual.setVisible(this.isPermisoEliminarProcesoCierreEjercicioAnual);
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarProcesoCierreEjercicioAnual.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual);						
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosProcesoCierreEjercicioAnual.setVisible(this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.setVisible(this.isPermisoActualizarProcesoCierreEjercicioAnual);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierreEjercicioAnual() {
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonModificarProcesoCierreEjercicioAnual.setVisible(this.isPermisoActualizarProcesoCierreEjercicioAnual);	
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarProcesoCierreEjercicioAnual.setVisible(this.isPermisoActualizarProcesoCierreEjercicioAnual);	
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarProcesoCierreEjercicioAnual.setVisible(this.isPermisoEliminarProcesoCierreEjercicioAnual);
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarProcesoCierreEjercicioAnual.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual);							
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosProcesoCierreEjercicioAnual.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual && this.isPermisoGuardarCambiosProcesoCierreEjercicioAnual));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCierreEjercicioAnual() {
		if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCierreEjercicioAnual();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCierreEjercicioAnual() {
	}
	
	public void jTableDatosProcesoCierreEjercicioAnualListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCierreEjercicioAnual(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCierreEjercicioAnualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.getprocesocierreejercicioanual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreejercicioanual==null) {
						this.procesocierreejercicioanual = new ProcesoCierreEjercicioAnual();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
				}

				if(this.procesocierreejercicioanual.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocierreejercicioanual.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumento=true;

			idTienePermisotipodocumento=this.tienePermisosUsuarioEnPaginaWebProcesoCierreEjercicioAnual(TipoDocumentoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierreEjercicioAnual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierreEjercicioAnual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.getprocesocierreejercicioanual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);

				this.tipodocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentoBeanSwingJInternalFrame.getTipoDocumentoLogic().setConnexion(this.procesocierreejercicioanualLogic.getConnexion());

				if(this.procesocierreejercicioanual.getid_tipo_documento()!=null) {
					this.tipodocumentoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentoBeanSwingJInternalFrame.setIdActual(this.procesocierreejercicioanual.getid_tipo_documento());
					this.tipodocumentoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierreEjercicioAnual=(TitledBorder)this.jScrollPanelDatosProcesoCierreEjercicioAnual.getBorder();
				TitledBorder titledBordertipodocumento=(TitledBorder)this.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.getBorder();

				titledBordertipodocumento.setTitle(titledBorderProcesoCierreEjercicioAnual.getTitle() + " -> Tipo Documento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.getprocesocierreejercicioanual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreejercicioanual==null) {
						this.procesocierreejercicioanual = new ProcesoCierreEjercicioAnual();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
				}

				if(this.procesocierreejercicioanual.getid_tipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento = "+this.procesocierreejercicioanual.getid_tipo_documento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaProcesoCierreEjercicioAnualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.getprocesocierreejercicioanual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierreejercicioanual==null) {
						this.procesocierreejercicioanual = new ProcesoCierreEjercicioAnual();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);
				}

				if(this.procesocierreejercicioanual.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.procesocierreejercicioanual.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);

			this.getProcesoCierreEjercicioAnualsBusquedaProcesoCierreEjercicioAnual();

			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);

			//if(ProcesoCierreEjercicioAnualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoProcesoCierreEjercicioAnualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);

			this.getProcesoCierreEjercicioAnualsFK_IdTipoDocumento();

			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);

			//if(ProcesoCierreEjercicioAnualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierreejercicioanualLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCierreEjercicioAnual() {
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.dispose();
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual!=null) {
			this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.dispose();
			this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCierreEjercicioAnual!=null) {
			this.jInternalFrameImportacionProcesoCierreEjercicioAnual.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCierreEjercicioAnual.dispose();
			this.jInternalFrameImportacionProcesoCierreEjercicioAnual=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCierreEjercicioAnual();
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCierreEjercicioAnual")) {
				jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCierreEjercicioAnual")) {
				jButtonDuplicarProcesoCierreEjercicioAnualActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCierreEjercicioAnual")) {
				jButtonCopiarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCierreEjercicioAnual")) {
				jButtonVerFormProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCierreEjercicioAnual")) {
				jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCierreEjercicioAnual")) {
				jButtonDuplicarProcesoCierreEjercicioAnualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCierreEjercicioAnual")) {
				jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCierreEjercicioAnual")) {
				jButtonDuplicarProcesoCierreEjercicioAnualActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCierreEjercicioAnual")) {
				jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCierreEjercicioAnual")) {
				jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCierreEjercicioAnual")) {
				jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCierreEjercicioAnual")) {
				jButtonModificarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCierreEjercicioAnual")) {
				jButtonModificarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCierreEjercicioAnual")) {
				jButtonModificarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCierreEjercicioAnual")) {
				jButtonActualizarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCierreEjercicioAnual")) {
				jButtonActualizarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCierreEjercicioAnual")) {
				jButtonActualizarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCierreEjercicioAnual")) {
				jButtonEliminarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCierreEjercicioAnual")) {
				jButtonEliminarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCierreEjercicioAnual")) {
				jButtonEliminarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCierreEjercicioAnual")) {
				jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCierreEjercicioAnual")) {
				jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCierreEjercicioAnual")) {
				jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCierreEjercicioAnual")) {
				jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCierreEjercicioAnual")) {
				jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCierreEjercicioAnual")) {
				jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCierreEjercicioAnual")) {
				jButtonMostrarOcultarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCierreEjercicioAnual")) {
				jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCierreEjercicioAnual")) {
				jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCierreEjercicioAnual")) {
				jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCierreEjercicioAnual")) {
				jButtonCopiarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCierreEjercicioAnual")) {
				jButtonVerFormProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCierreEjercicioAnual")) {
				jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCierreEjercicioAnual")) {
				jButtonCopiarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCierreEjercicioAnual")) {
				jButtonVerFormProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierreEjercicioAnual")) {
				jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCierreEjercicioAnual")) {
				jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual")) {
				jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCierreEjercicioAnual")) {
				jButtonRecargarInformacionProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCierreEjercicioAnual")) {
				jButtonRecargarInformacionProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCierreEjercicioAnual")) {
				jButtonRecargarInformacionProcesoCierreEjercicioAnualActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCierreEjercicioAnual")) {
				jButtonAnterioresProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCierreEjercicioAnual")) {
				jButtonAnterioresProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCierreEjercicioAnual")) {
				jButtonAnterioresProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCierreEjercicioAnual")) {
				jButtonSiguientesProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCierreEjercicioAnual")) {
				jButtonSiguientesProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCierreEjercicioAnual")) {
				jButtonSiguientesProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCierreEjercicioAnual") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual")) {
				jButtonAbrirOrderByProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCierreEjercicioAnual") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCierreEjercicioAnual")) {
				jButtonMostrarOcultarProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierreEjercicioAnual")) {
				jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCierreEjercicioAnual")) {
				jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual")) {
				jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoCierreEjercicioAnual")) {
				jButtonProcesarInformacionProcesoCierreEjercicioAnualActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCierreEjercicioAnual")) {
				jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCierreEjercicioAnual")) {
				jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCierreEjercicioAnual")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCierreEjercicioAnual")) {
				jButtonCerrarImportacionProcesoCierreEjercicioAnualActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCierreEjercicioAnual")) {
				
				jButtonGenerarImportacionProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCierreEjercicioAnual")) {
				
				jButtonAbrirImportacionProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCierreEjercicioAnual")) {
				jComboBoxTiposAccionesProcesoCierreEjercicioAnualActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCierreEjercicioAnual")) {
				jComboBoxTiposRelacionesProcesoCierreEjercicioAnualActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCierreEjercicioAnual")) {
				jComboBoxTiposAccionesProcesoCierreEjercicioAnualActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCierreEjercicioAnual")) {
				
				jComboBoxTiposSeleccionarProcesoCierreEjercicioAnualActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCierreEjercicioAnual")) {
				jTextFieldValorCampoGeneralProcesoCierreEjercicioAnualActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCierreEjercicioAnual")) {
				jButtonAbrirOrderByProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCierreEjercicioAnual")) {
				jButtonAbrirOrderByProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCierreEjercicioAnual")) {
				jButtonCerrarOrderByProcesoCierreEjercicioAnualActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierreEjercicioAnualBusqueda")) {
				this.jButtonidProcesoCierreEjercicioAnualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesoCierreEjercicioAnualUpdate")) {
				this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesoCierreEjercicioAnualBusqueda")) {
				this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoCierreEjercicioAnualBusqueda")) {
				this.jButtonfechaProcesoCierreEjercicioAnualBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual")) {
				this.jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnualActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCierreEjercicioAnual();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				


				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCierreEjercicioAnual procesocierreejercicioanualLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocierreejercicioanualLocal=this.procesocierreejercicioanual;
			} else {
				procesocierreejercicioanualLocal=this.procesocierreejercicioanualAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
							
				
				


				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
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
			
			


			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
								
						
				


				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
								
				
				


				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
							
				
				


				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
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
			
			


			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
								
				
				


				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCierreEjercicioAnual")) {
					jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnualItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCierreEjercicioAnual")) {
					jCheckBoxSeleccionadosProcesoCierreEjercicioAnualItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCierreEjercicioAnual")) {
					
				}
				
				


				
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
												
				
				


				
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
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
			
			


			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierreejercicioanual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierreejercicioanual);
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
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
				
				


				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreEjercicioAnual.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreEjercicioAnual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreEjercicioAnualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierreejercicioanualAnterior =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCierreEjercicioAnual")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCierreEjercicioAnualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocierreejercicioanual =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocierreejercicioanual);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCierreEjercicioAnual")) {
				
				}
				
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCierreEjercicioAnual")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCierreEjercicioAnual.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCierreEjercicioAnual")) {
			
			}
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCierreEjercicioAnual();
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCierreEjercicioAnual")) {
				jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCierreEjercicioAnual")) {
				jButtonDuplicarProcesoCierreEjercicioAnualActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCierreEjercicioAnual")) {
				jButtonCopiarProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCierreEjercicioAnual")) {
				jButtonVerFormProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCierreEjercicioAnual")) {
				jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCierreEjercicioAnual")) {
				jButtonModificarProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCierreEjercicioAnual")) {
				jButtonActualizarProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCierreEjercicioAnual")) {
				jButtonEliminarProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierreEjercicioAnual")) {
				jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCierreEjercicioAnual")) {
				jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCierreEjercicioAnual")) {
				jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCierreEjercicioAnual")) {
				jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierreEjercicioAnual")) {
				jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCierreEjercicioAnual")) {
				jButtonAbrirOrderByProcesoCierreEjercicioAnualActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCierreEjercicioAnual")) {
				jButtonRecargarInformacionProcesoCierreEjercicioAnualActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCierreEjercicioAnual")) {
				jButtonAnterioresProcesoCierreEjercicioAnualActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCierreEjercicioAnual")) {
				jButtonSiguientesProcesoCierreEjercicioAnualActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierreEjercicioAnualBusqueda")) {
				this.jButtonidProcesoCierreEjercicioAnualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesoCierreEjercicioAnualUpdate")) {
				this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesoCierreEjercicioAnualBusqueda")) {
				this.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoCierreEjercicioAnualBusqueda")) {
				this.jButtonfechaProcesoCierreEjercicioAnualBusquedaActionPerformed(evt);
			}
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCierreEjercicioAnual();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCierreEjercicioAnual")) {
				closingInternalFrameProcesoCierreEjercicioAnual();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCierreEjercicioAnual")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCierreEjercicioAnual = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCierreEjercicioAnualBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierreEjercicioAnualBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierreEjercicioAnual.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(null);
			}
			
			ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierreejercicioanual,new Object(),this.procesocierreejercicioanualParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCierreEjercicioAnual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCierreEjercicioAnual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCierreEjercicioAnual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocierreejercicioanual)) {
			if(!esControlTabla) {
				if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);			
				}
				
				if(this.procesocierreejercicioanualSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCierreEjercicioAnual(this.procesocierreejercicioanualReturnGeneral,this.procesocierreejercicioanualBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocierreejercicioanualSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierreEjercicioAnual(classes,this.procesocierreejercicioanualReturnGeneral,this.procesocierreejercicioanualBean,false);
					}
						
					if(this.procesocierreejercicioanualReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreEjercicioAnual(this.procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnual());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCierreEjercicioAnual(this.procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnual());	
					}
						
					if(this.procesocierreejercicioanualReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreEjercicioAnual(this.procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnual(),classes);//this.procesocierreejercicioanualBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,classes);//this.procesocierreejercicioanualBean);									
				}
			
				if(ProcesoCierreEjercicioAnualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCierreEjercicioAnual(this.procesocierreejercicioanual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreEjercicioAnual(this.procesocierreejercicioanual);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocierreejercicioanualAnterior!=null) {
						this.procesocierreejercicioanual=this.procesocierreejercicioanualAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocierreejercicioanualSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnual(),procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnual(),this.procesocierreejercicioanuals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCierreEjercicioAnual.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCierreEjercicioAnual.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCierreEjercicioAnual();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCierreEjercicioAnual() throws Exception {
		
		ProcesoCierreEjercicioAnualModel procesocierreejercicioanualModel=(ProcesoCierreEjercicioAnualModel)this.jTableDatosProcesoCierreEjercicioAnual.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierreejercicioanualModel.procesocierreejercicioanuals=this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocierreejercicioanualModel.procesocierreejercicioanuals=this.procesocierreejercicioanuals;
		}
		
		
		((ProcesoCierreEjercicioAnualModel) this.jTableDatosProcesoCierreEjercicioAnual.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCierreEjercicioAnual() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocierreejercicioanualAnterior(),this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocierreejercicioanualAnterior(),this.procesocierreejercicioanuals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCierreEjercicioAnual();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
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
										
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierreejercicioanual,new Object(),generalEntityParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCierreEjercicioAnualConstantesFunciones.getClassesRelationshipsOfProcesoCierreEjercicioAnual(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCierreEjercicioAnualConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCierreEjercicioAnual(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCierreEjercicioAnual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierreejercicioanual,new Object(),generalEntityParameterGeneral,this.procesocierreejercicioanualReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnualBean procesocierreejercicioanualBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierreEjercicioAnual(ArrayList<Classe> classes,ProcesoCierreEjercicioAnualReturnGeneral procesocierreejercicioanualReturnGeneral,ProcesoCierreEjercicioAnualBean procesocierreejercicioanualBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocierreejercicioanual)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual = new ProcesoCierreEjercicioAnualDetalleFormJInternalFrame(jDesktopPane,this.procesocierreejercicioanualSessionBean.getConGuardarRelaciones(),this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual);
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.procesocierreejercicioanualLogic=this.procesocierreejercicioanualLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCierreEjercicioAnual("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierreEjercicioAnual();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierreEjercicioAnual();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCierreEjercicioAnual("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCierreEjercicioAnual();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierreEjercicioAnual"));
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonModificarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierreEjercicioAnual"));

		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonModificarToolBarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierreEjercicioAnual"));
					
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemModificarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierreEjercicioAnual"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierreEjercicioAnual"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarToolBarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierreEjercicioAnual"));
						
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemActualizarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierreEjercicioAnual"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierreEjercicioAnual"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierreEjercicioAnual"));
								
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemEliminarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierreEjercicioAnual"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierreEjercicioAnual"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierreEjercicioAnual"));
					
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemCancelarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierreEjercicioAnual"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemDetalleCerrarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierreEjercicioAnual"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreEjercicioAnual"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreEjercicioAnual"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierreEjercicioAnual"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonidProcesoCierreEjercicioAnualBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreEjercicioAnualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoCierreEjercicioAnualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoCierreEjercicioAnualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonfechaProcesoCierreEjercicioAnualBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoCierreEjercicioAnualBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierreEjercicioAnual"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCierreEjercicioAnual"));
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierreEjercicioAnual"));
		}
		
		this.jTableDatosProcesoCierreEjercicioAnual.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCierreEjercicioAnual"));
		
		this.jTableDatosProcesoCierreEjercicioAnual.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCierreEjercicioAnual"));
		
		this.jButtonNuevoProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"NuevoProcesoCierreEjercicioAnual"));
		
		this.jButtonDuplicarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCierreEjercicioAnual"));
		
		this.jButtonCopiarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"CopiarProcesoCierreEjercicioAnual"));
		
		this.jButtonVerFormProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"VerFormProcesoCierreEjercicioAnual"));
		
		
		this.jButtonNuevoToolBarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCierreEjercicioAnual"));
			
		this.jButtonDuplicarToolBarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCierreEjercicioAnual"));
			
		this.jMenuItemNuevoProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCierreEjercicioAnual"));
			
		this.jMenuItemDuplicarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCierreEjercicioAnual"));		
		
		
		this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCierreEjercicioAnual"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCierreEjercicioAnual"));
			
		this.jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCierreEjercicioAnual"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonModificarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierreEjercicioAnual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonModificarToolBarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierreEjercicioAnual"));
			
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemModificarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierreEjercicioAnual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierreEjercicioAnual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonActualizarToolBarProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierreEjercicioAnual"));
				
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemActualizarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierreEjercicioAnual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierreEjercicioAnual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonEliminarToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierreEjercicioAnual"));
						
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemEliminarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierreEjercicioAnual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierreEjercicioAnual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonCancelarToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierreEjercicioAnual"));
			
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemCancelarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierreEjercicioAnual"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCierreEjercicioAnual"));		
		
		
		this.jButtonCerrarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"CerrarProcesoCierreEjercicioAnual"));
		
		
		this.jButtonCerrarToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCierreEjercicioAnual"));
			
		this.jMenuItemCerrarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCierreEjercicioAnual"));
			
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jMenuItemDetalleCerrarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierreEjercicioAnual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCierreEjercicioAnual"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreEjercicioAnual"));
		}
		
		this.jButtonCopiarToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCierreEjercicioAnual"));
			
		this.jButtonVerFormToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCierreEjercicioAnual"));
		
		this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCierreEjercicioAnual"));
			
		this.jMenuItemCopiarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCierreEjercicioAnual"));		
		
		this.jMenuItemVerFormProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCierreEjercicioAnual"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierreEjercicioAnual"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCierreEjercicioAnual"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierreEjercicioAnual"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCierreEjercicioAnual"));
					
		this.jButtonRecargarInformacionToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCierreEjercicioAnual"));
		
		this.jMenuItemRecargarInformacionProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCierreEjercicioAnual"));		
		
		
		
		this.jButtonAnterioresProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCierreEjercicioAnual"));
		
		
		this.jButtonAnterioresToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCierreEjercicioAnual"));
		
		this.jMenuItemAnterioresProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCierreEjercicioAnual"));		
		
		
		this.jButtonSiguientesProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCierreEjercicioAnual"));
		
		
		this.jButtonSiguientesToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCierreEjercicioAnual"));
			
		this.jMenuItemSiguientesProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCierreEjercicioAnual"));
			
		this.jMenuItemAbrirOrderByProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCierreEjercicioAnual"));
			
		this.jMenuItemMostrarOcultarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCierreEjercicioAnual"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCierreEjercicioAnual"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCierreEjercicioAnual"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCierreEjercicioAnual"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCierreEjercicioAnual"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual"));		
		
		
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoCierreEjercicioAnual"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCierreEjercicioAnual"));

		this.jCheckBoxSeleccionadosProcesoCierreEjercicioAnual.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCierreEjercicioAnual"));
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierreEjercicioAnual"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCierreEjercicioAnual"));
			
		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCierreEjercicioAnual"));
					
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCierreEjercicioAnual"));
			
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCierreEjercicioAnual"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonidProcesoCierreEjercicioAnualBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreEjercicioAnualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoCierreEjercicioAnualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoCierreEjercicioAnualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonfechaProcesoCierreEjercicioAnualBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoCierreEjercicioAnualBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreEjercicioAnual"));
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreEjercicioAnual"));
				this.jInternalFrameReporteDinamicoProcesoCierreEjercicioAnual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreEjercicioAnual"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreEjercicioAnual"));				
			//this.jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreEjercicioAnual"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreEjercicioAnual"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCierreEjercicioAnual!=null) {
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierreEjercicioAnual"));
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierreEjercicioAnual"));
				this.jInternalFrameImportacionProcesoCierreEjercicioAnual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierreEjercicioAnual"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCierreEjercicioAnual"));
			
			this.jButtonAbrirOrderByToolBarProcesoCierreEjercicioAnual.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCierreEjercicioAnual"));			
			
			if(this.jInternalFrameOrderByProcesoCierreEjercicioAnual!=null) {
				this.jInternalFrameOrderByProcesoCierreEjercicioAnual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierreEjercicioAnual"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTabbedPaneRelacionesProcesoCierreEjercicioAnual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierreEjercicioAnual"));
		
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
            		closingInternalFrameProcesoCierreEjercicioAnual();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCierreEjercicioAnual = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCierreEjercicioAnualBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierreEjercicioAnualBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierreEjercicioAnual.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCierreEjercicioAnual.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCierreEjercicioAnualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCierreEjercicioAnual.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCierreEjercicioAnual.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCierreEjercicioAnual";
		inputMap = this.jButtonNuevoProcesoCierreEjercicioAnual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCierreEjercicioAnual";
		inputMap = this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierreEjercicioAnualActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonModificarProcesoCierreEjercicioAnual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCierreEjercicioAnualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonActualizarProcesoCierreEjercicioAnual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCierreEjercicioAnualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonEliminarProcesoCierreEjercicioAnual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCierreEjercicioAnualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonCancelarProcesoCierreEjercicioAnual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCierreEjercicioAnual";
		inputMap = this.jButtonCerrarProcesoCierreEjercicioAnual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCierreEjercicioAnualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCierreEjercicioAnual";
		inputMap = this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosProcesoCierreEjercicioAnual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonGuardarCambiosProcesoCierreEjercicioAnual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnual.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnualItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCierreEjercicioAnualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCierreEjercicioAnualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCierreEjercicioAnualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonidProcesoCierreEjercicioAnualBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreEjercicioAnualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonid_tipo_documentoProcesoCierreEjercicioAnualUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoCierreEjercicioAnualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonid_tipo_documentoProcesoCierreEjercicioAnualBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoCierreEjercicioAnualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jButtonfechaProcesoCierreEjercicioAnualBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoCierreEjercicioAnualBusqueda"));
		
		
		this.jButtonBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCierreEjercicioAnual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCierreEjercicioAnualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCierreEjercicioAnualActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCierreEjercicioAnual.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCierreEjercicioAnual(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
					procesocierreejercicioanualAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanuals) {
					procesocierreejercicioanualAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCierreEjercicioAnualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
						procesocierreejercicioanualAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanuals) {
						procesocierreejercicioanualAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanuals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierreEjercicioAnual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierreEjercicioAnual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreEjercicioAnual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCierreEjercicioAnualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCierreEjercicioAnual.getSelectedRows();
			
			ProcesoCierreEjercicioAnual procesocierreejercicioanualLocal=new ProcesoCierreEjercicioAnual();
			
			//this.seleccionarTodosProcesoCierreEjercicioAnual(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocierreejercicioanualLocal =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals().toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocierreejercicioanualLocal =(ProcesoCierreEjercicioAnual) this.procesocierreejercicioanuals.toArray()[this.jTableDatosProcesoCierreEjercicioAnual.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocierreejercicioanualLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
						procesocierreejercicioanualAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanuals) {
						procesocierreejercicioanualAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierreEjercicioAnual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierreEjercicioAnual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreEjercicioAnual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCierreEjercicioAnualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCierreEjercicioAnualParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCierreEjercicioAnualActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCierreEjercicioAnual.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
				
						if(sTipoSeleccionar.equals(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesocierreejercicioanualAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanuals) {
					
						if(sTipoSeleccionar.equals(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesocierreejercicioanualAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCierreEjercicioAnualActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCierreEjercicioAnual=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCierreEjercicioAnual) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCierreEjercicioAnual(conSplash);
				
					this.generarReporteProcesoCierreEjercicioAnualsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCierreEjercicioAnualsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierreEjercicioAnualsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierreEjercicioAnualsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierreEjercicioAnual();
				
				this.exportarProcesoCierreEjercicioAnualsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCierreEjercicioAnuals();
				//this.importarProcesoCierreEjercicioAnuals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierreEjercicioAnual();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCierreEjercicioAnualsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Cierre Ejercicio Anual", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCierreEjercicioAnual();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCierreEjercicioAnual)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCierreEjercicioAnual(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Cierre Ejercicio Anual",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCierreEjercicioAnualBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCierreEjercicioAnual) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCierreEjercicioAnual(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCierreEjercicioAnual();
						
						this.generarReporteProcesoAccionProcesoCierreEjercicioAnualsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Cierre Ejercicio AnualES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Cierre Ejercicio Anual", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCierreEjercicioAnual();
				
						this.actualizarParametrosGeneralProcesoCierreEjercicioAnual();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocierreejercicioanualReturnGeneral=procesocierreejercicioanualLogic.procesarAccionProcesoCierreEjercicioAnualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals(),this.procesocierreejercicioanualParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCierreEjercicioAnualReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCierreEjercicioAnual();
					
					ProcesoCierreEjercicioAnualBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCierreEjercicioAnualReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierreEjercicioAnual.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxTiposAccionesFormularioProcesoCierreEjercicioAnual.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCierreEjercicioAnual(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCierreEjercicioAnualActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCierreEjercicioAnual();
			
			if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();		
			ProcesoCierreEjercicioAnual procesocierreejercicioanual=new ProcesoCierreEjercicioAnual();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCierreEjercicioAnual.getSelectedItem();
			
			
			
			
			procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocierreejercicioanualsSeleccionados.size()==1) {
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanualsSeleccionados) {
					procesocierreejercicioanual=procesocierreejercicioanualAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCierreEjercicioAnual();
			
      		//this.finishProcessProcesoCierreEjercicioAnual(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCierreEjercicioAnualReturnGeneral() throws Exception {
		if(this.procesocierreejercicioanualReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocierreejercicioanualReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocierreejercicioanualReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocierreejercicioanualReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocierreejercicioanualReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocierreejercicioanualReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
		}
		
		if(this.procesocierreejercicioanualReturnGeneral.getConRetornoLista() || this.procesocierreejercicioanualReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocierreejercicioanualReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesocierreejercicioanualLogic.setProcesoCierreEjercicioAnuals(this.procesocierreejercicioanualReturnGeneral.getProcesoCierreEjercicioAnuals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCierreEjercicioAnual(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCierreEjercicioAnual() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCierreEjercicioAnual> getProcesoCierreEjercicioAnualsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCierreEjercicioAnual) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals()) {
					if(procesocierreejercicioanualAux.getIsSelected()) {
						procesocierreejercicioanualsSeleccionados.add(procesocierreejercicioanualAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:this.procesocierreejercicioanuals) {
					if(procesocierreejercicioanualAux.getIsSelected()) {
						procesocierreejercicioanualsSeleccionados.add(procesocierreejercicioanualAux);				
					}
				}
			}
			
			if(procesocierreejercicioanualsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocierreejercicioanualsSeleccionados.addAll(this.procesocierreejercicioanualLogic.getProcesoCierreEjercicioAnuals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocierreejercicioanualsSeleccionados.addAll(this.procesocierreejercicioanuals);				
					}
				}
			}
		} else {
			procesocierreejercicioanualsSeleccionados.add(this.procesocierreejercicioanual);
		}
		
		return procesocierreejercicioanualsSeleccionados;
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
	
	public void generarReporteProcesoCierreEjercicioAnualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCierreEjercicioAnualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCierreEjercicioAnualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierreEjercicioAnualsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierreEjercicioAnualsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Cierre Ejercicio Anual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCierreEjercicioAnualsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();		
		
		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCierreEjercicioAnuals("Todos",procesocierreejercicioanualsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCierreEjercicioAnualsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();		
		
		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCierreEjercicioAnuals("Todos",procesocierreejercicioanualsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCierreEjercicioAnualsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();
		
		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCierreEjercicioAnuals("Todos",procesocierreejercicioanualsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCierreEjercicioAnualsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCierreEjercicioAnual();
		
		
		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCierreEjercicioAnual();
		
		
		//this.generarReporteProcesoCierreEjercicioAnuals("Todos",procesocierreejercicioanualsSeleccionados ,procesocierreejercicioanualImplementable,procesocierreejercicioanualImplementableHome);
	}
	
	public void mostrarImportacionProcesoCierreEjercicioAnuals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCierreEjercicioAnual();
		
		this.abrirFrameImportacionProcesoCierreEjercicioAnual();		
		
			
		//this.generarReporteProcesoCierreEjercicioAnuals("Todos",procesocierreejercicioanualsSeleccionados ,procesocierreejercicioanualImplementable,procesocierreejercicioanualImplementableHome);
	}
	
	public void importarProcesoCierreEjercicioAnuals() throws Exception {		
	
	}
	
	public void exportarProcesoCierreEjercicioAnualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCierreEjercicioAnualsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCierreEjercicioAnualsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCierreEjercicioAnualsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Cierre Ejercicio Anual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCierreEjercicioAnualsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();		
		
		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreejercicioanual."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCierreEjercicioAnual(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanualsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCierreEjercicioAnual(procesocierreejercicioanualAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocierreejercicioanualAux.setsDetalleGeneralEntityReporte(procesocierreejercicioanualAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Ejercicio Anual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCierreEjercicioAnual(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocierreejercicioanual.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreejercicioanual.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreejercicioanual.gettipodocumento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierreejercicioanual.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCierreEjercicioAnualsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();		
		
		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreejercicioanual.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCierreEjercicioAnuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCierreEjercicioAnual(row);				
				iRow++;
			}				
			
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanualsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCierreEjercicioAnual(procesocierreejercicioanualAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Ejercicio Anual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCierreEjercicioAnualsSeleccionados() throws Exception {
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();		
		
		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierreejercicioanual.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocierreejercicioanuals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocierreejercicioanual");
			//elementRoot.appendChild(element);
		
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanualsSeleccionados) {
				element = document.createElement("procesocierreejercicioanual");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCierreEjercicioAnual(procesocierreejercicioanualAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Ejercicio Anual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCierreEjercicioAnual(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreejercicioanual.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreejercicioanual.gettipodocumento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierreejercicioanual.getfecha());				
	}
	
	public void setFilaDatosExportarXmlProcesoCierreEjercicioAnual(ProcesoCierreEjercicioAnual procesocierreejercicioanual,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCierreEjercicioAnualConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocierreejercicioanual.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCierreEjercicioAnualConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocierreejercicioanual.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipodocumento_descripcion = document.createElement(ProcesoCierreEjercicioAnualConstantesFunciones.IDTIPODOCUMENTO);
		elementtipodocumento_descripcion.appendChild(document.createTextNode(procesocierreejercicioanual.gettipodocumento_descripcion()));
		element.appendChild(elementtipodocumento_descripcion);

		Element elementfecha = document.createElement(ProcesoCierreEjercicioAnualConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(procesocierreejercicioanual.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoProcesoCierreEjercicioAnualsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados=new ArrayList<ProcesoCierreEjercicioAnual>();
		
		procesocierreejercicioanualsSeleccionados=this.getProcesoCierreEjercicioAnualsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCierreEjercicioAnual(procesocierreejercicioanualsSeleccionados);
		
		this.generarReporteProcesoCierreEjercicioAnuals("Todos",procesocierreejercicioanualsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCierreEjercicioAnual(ArrayList<ProcesoCierreEjercicioAnual> procesocierreejercicioanualsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCierreEjercicioAnual procesocierreejercicioanualAux:procesocierreejercicioanualsSeleccionados) {
				procesocierreejercicioanualAux.setsDetalleGeneralEntityReporte(procesocierreejercicioanualAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_IDTIPODOCUMENTO)) {
					existe=true;
					procesocierreejercicioanualAux.setsDescripcionGeneralEntityReporte1(procesocierreejercicioanualAux.gettipodocumento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierreEjercicioAnualConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					procesocierreejercicioanualAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesocierreejercicioanualAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreEjercicioAnualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCierreEjercicioAnual(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCierreEjercicioAnualJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=true;
		} else {
			this.actualizarEstadoPanelsProcesoCierreEjercicioAnual(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCierreEjercicioAnual=false;
			//this.isVisibilidadCeldaVerFormProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaDuplicarProcesoCierreEjercicioAnual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			if(!procesocierreejercicioanualSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;												
			}
			
			this.jButtonCerrarProcesoCierreEjercicioAnual.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocierreejercicioanual)) {
			this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=false;
			this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCierreEjercicioAnual=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierreEjercicioAnual=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCierreEjercicioAnual=false;
		//this.isVisibilidadCeldaModificarProcesoCierreEjercicioAnual=true;
		this.isVisibilidadCeldaActualizarProcesoCierreEjercicioAnual=false;
		this.isVisibilidadCeldaEliminarProcesoCierreEjercicioAnual=false;
		//this.isVisibilidadCeldaCancelarProcesoCierreEjercicioAnual=true;			
		this.isVisibilidadCeldaGuardarProcesoCierreEjercicioAnual=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierreEjercicioAnual() {
	}
	
	public void actualizarEstadoPanelsProcesoCierreEjercicioAnual(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual!=null) {
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosProcesoCierreEjercicioAnual.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreEjercicioAnual!=null) {
				this.jPanelPaginacionProcesoCierreEjercicioAnual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreEjercicioAnual!=null) {
				this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual!=null) {
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosProcesoCierreEjercicioAnual.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreEjercicioAnual!=null) {
				this.jPanelPaginacionProcesoCierreEjercicioAnual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreEjercicioAnual!=null) {
				this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual!=null) {
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosProcesoCierreEjercicioAnual.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreEjercicioAnual!=null) {
				this.jPanelPaginacionProcesoCierreEjercicioAnual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreEjercicioAnual!=null) {
				this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual!=null) {
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosProcesoCierreEjercicioAnual.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreEjercicioAnual!=null) {
				this.jPanelPaginacionProcesoCierreEjercicioAnual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreEjercicioAnual!=null) {
				this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual!=null) {
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosProcesoCierreEjercicioAnual.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreEjercicioAnual!=null) {
				this.jPanelPaginacionProcesoCierreEjercicioAnual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreEjercicioAnual!=null) {
				this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual!=null) {
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosProcesoCierreEjercicioAnual.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreEjercicioAnual!=null) {
				this.jPanelPaginacionProcesoCierreEjercicioAnual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreEjercicioAnual!=null) {
				this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreEjercicioAnual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual!=null) {
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreEjercicioAnual!=null) {
				this.jScrollPanelDatosProcesoCierreEjercicioAnual.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreEjercicioAnual!=null) {
				this.jPanelPaginacionProcesoCierreEjercicioAnual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreEjercicioAnual!=null) {
				this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual!=null) {
					this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCierreEjercicioAnual!=null) {
				this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocierreejercicioanualSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual!=null) {
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCierreEjercicioAnual!=null) {
				this.jPanelParametrosReportesProcesoCierreEjercicioAnual.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoDocumento(Boolean isParaTipoDocumento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoNegation=!isParaTipoDocumento;

			this.isVisibilidadBusquedaProcesoCierreEjercicioAnual=isParaTipoDocumento;
			if(!this.isVisibilidadBusquedaProcesoCierreEjercicioAnual) {this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.remove(jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);}
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
			
			this.inicializarActualizarBindingTablaProcesoCierreEjercicioAnual(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCierreEjercicioAnual() {
		this.updateBorderResaltarBusquedasFormularioProcesoCierreEjercicioAnual();
		this.updateVisibilidadBusquedasFormularioProcesoCierreEjercicioAnual();
		this.updateHabilitarBusquedasFormularioProcesoCierreEjercicioAnual();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCierreEjercicioAnual() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.getComponents().length>0) {
	

		if(this.procesocierreejercicioanualConstantesFunciones.resaltarBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual!=null) {
			index= this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.indexOfComponent(this.jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.getComponent(index);
				jPanel.setBorder(this.procesocierreejercicioanualConstantesFunciones.resaltarBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCierreEjercicioAnual() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.indexOfComponent(this.jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocierreejercicioanualConstantesFunciones.mostrarBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);
			if(!this.procesocierreejercicioanualConstantesFunciones.mostrarBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual && index>-1) {
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCierreEjercicioAnual() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.indexOfComponent(this.jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocierreejercicioanualConstantesFunciones.activarBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);
				this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setEnabledAt(index,this.procesocierreejercicioanualConstantesFunciones.activarBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCierreEjercicioAnual(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCierreEjercicioAnual")) {
			index= this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.indexOfComponent(this.jPanelBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);

			this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreEjercicioAnual.getComponent(index);

			this.procesocierreejercicioanualConstantesFunciones.setResaltarBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual(resaltar);

			jPanel.setBorder(this.procesocierreejercicioanualConstantesFunciones.resaltarBusquedaProcesoCierreEjercicioAnualProcesoCierreEjercicioAnual);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCierreEjercicioAnual.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCierreEjercicioAnual() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCierreEjercicioAnual();
		this.updateVisibilidadResaltarControlesFormularioProcesoCierreEjercicioAnual();
		this.updateHabilitarResaltarControlesFormularioProcesoCierreEjercicioAnual();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCierreEjercicioAnual() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocierreejercicioanualConstantesFunciones.resaltaridProcesoCierreEjercicioAnual!=null && this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.setBorder(this.procesocierreejercicioanualConstantesFunciones.resaltaridProcesoCierreEjercicioAnual);}
		if(this.procesocierreejercicioanualConstantesFunciones.resaltarid_tipo_documentoProcesoCierreEjercicioAnual!=null && this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setBorder(this.procesocierreejercicioanualConstantesFunciones.resaltarid_tipo_documentoProcesoCierreEjercicioAnual);}
		if(this.procesocierreejercicioanualConstantesFunciones.resaltarfechaProcesoCierreEjercicioAnual!=null && this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jDateChooserfechaProcesoCierreEjercicioAnual.setBorder(this.procesocierreejercicioanualConstantesFunciones.resaltarfechaProcesoCierreEjercicioAnual);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCierreEjercicioAnual() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.setVisible(this.procesocierreejercicioanualConstantesFunciones.mostraridProcesoCierreEjercicioAnual);
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jPanelidProcesoCierreEjercicioAnual.setVisible(this.procesocierreejercicioanualConstantesFunciones.mostraridProcesoCierreEjercicioAnual);
		//this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setVisible(this.procesocierreejercicioanualConstantesFunciones.mostrarid_tipo_documentoProcesoCierreEjercicioAnual);
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jPanelid_tipo_documentoProcesoCierreEjercicioAnual.setVisible(this.procesocierreejercicioanualConstantesFunciones.mostrarid_tipo_documentoProcesoCierreEjercicioAnual);
		//this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jDateChooserfechaProcesoCierreEjercicioAnual.setVisible(this.procesocierreejercicioanualConstantesFunciones.mostrarfechaProcesoCierreEjercicioAnual);
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jPanelfechaProcesoCierreEjercicioAnual.setVisible(this.procesocierreejercicioanualConstantesFunciones.mostrarfechaProcesoCierreEjercicioAnual);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCierreEjercicioAnual() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual!=null) {
	
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jTextFieldidProcesoCierreEjercicioAnual.setEnabled(this.procesocierreejercicioanualConstantesFunciones.activaridProcesoCierreEjercicioAnual);
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jComboBoxid_tipo_documentoProcesoCierreEjercicioAnual.setEnabled(this.procesocierreejercicioanualConstantesFunciones.activarid_tipo_documentoProcesoCierreEjercicioAnual);
		this.jInternalFrameDetalleFormProcesoCierreEjercicioAnual.jDateChooserfechaProcesoCierreEjercicioAnual.setEnabled(this.procesocierreejercicioanualConstantesFunciones.activarfechaProcesoCierreEjercicioAnual);
		}
	}
	
		
}