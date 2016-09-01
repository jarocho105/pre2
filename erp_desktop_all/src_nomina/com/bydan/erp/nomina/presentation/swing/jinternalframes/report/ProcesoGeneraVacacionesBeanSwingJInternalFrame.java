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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.ProcesoGeneraVacacionesConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoGeneraVacacionesParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoGeneraVacacionesParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoGeneraVacacionesBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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
public class ProcesoGeneraVacacionesBeanSwingJInternalFrame extends ProcesoGeneraVacacionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoGeneraVacacionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoGeneraVacaciones> procesogeneravacacionesValidator = new ClassValidator<ProcesoGeneraVacaciones>(ProcesoGeneraVacaciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoGeneraVacaciones procesogeneravacaciones;	
	public ProcesoGeneraVacaciones procesogeneravacacionesAux;
	public ProcesoGeneraVacaciones procesogeneravacacionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoGeneraVacaciones procesogeneravacacionesTotales;
	public Long idProcesoGeneraVacacionesActual;
	public Long iIdNuevoProcesoGeneraVacaciones=0L;
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
	
	public Boolean isPermisoTodoProcesoGeneraVacaciones;
	public Boolean isPermisoNuevoProcesoGeneraVacaciones;
	public Boolean isPermisoActualizarProcesoGeneraVacaciones;
	public Boolean isPermisoActualizarOriginalProcesoGeneraVacaciones;
	public Boolean isPermisoEliminarProcesoGeneraVacaciones;
	public Boolean isPermisoGuardarCambiosProcesoGeneraVacaciones;
	public Boolean isPermisoConsultaProcesoGeneraVacaciones;
	public Boolean isPermisoBusquedaProcesoGeneraVacaciones;
	public Boolean isPermisoReporteProcesoGeneraVacaciones;
	public Boolean isPermisoPaginacionMedioProcesoGeneraVacaciones;
	public Boolean isPermisoPaginacionAltoProcesoGeneraVacaciones;
	public Boolean isPermisoPaginacionTodoProcesoGeneraVacaciones;
	public Boolean isPermisoCopiarProcesoGeneraVacaciones;
	public Boolean isPermisoVerFormProcesoGeneraVacaciones;
	public Boolean isPermisoDuplicarProcesoGeneraVacaciones;
	public Boolean isPermisoOrdenProcesoGeneraVacaciones;
	
	
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
	
	public ProcesoGeneraVacacionesParameterReturnGeneral procesogeneravacacionesReturnGeneral;
	public ProcesoGeneraVacacionesParameterReturnGeneral procesogeneravacacionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoGeneraVacaciones=false;
	public Boolean esParaAccionDesdeFormularioProcesoGeneraVacaciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoGeneraVacacionesSessionBeanAdditional procesogeneravacacionesSessionBeanAdditional=null;
	
	public ProcesoGeneraVacacionesSessionBeanAdditional getProcesoGeneraVacacionesSessionBeanAdditional() {
		return this.procesogeneravacacionesSessionBeanAdditional;
	}
	
	public void setProcesoGeneraVacacionesSessionBeanAdditional(ProcesoGeneraVacacionesSessionBeanAdditional procesogeneravacacionesSessionBeanAdditional) {
		try {
			this.procesogeneravacacionesSessionBeanAdditional=procesogeneravacacionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional procesogeneravacacionesBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoGeneraVacacionesBeanSwingJInternalFrame
	
	public ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional getProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional() {
		return this.procesogeneravacacionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional(ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional procesogeneravacacionesBeanSwingJInternalFrameAdditional) {
		try {
			this.procesogeneravacacionesBeanSwingJInternalFrameAdditional=procesogeneravacacionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoGeneraVacacionesLogic procesogeneravacacionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoGeneraVacaciones procesogeneravacacionesBean;
	public ProcesoGeneraVacacionesConstantesFunciones procesogeneravacacionesConstantesFunciones;
	//public ProcesoGeneraVacacionesParameterReturnGeneral procesogeneravacacionesReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<ProcesoGeneraVacaciones> procesogeneravacacioness;	
	//public List<ProcesoGeneraVacaciones> procesogeneravacacionessEliminados;
	//public List<ProcesoGeneraVacaciones> procesogeneravacacionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoGeneraVacaciones=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoGeneraVacaciones=true;
	public Boolean isVisibilidadCeldaCopiarProcesoGeneraVacaciones=true;
	public Boolean isVisibilidadCeldaVerFormProcesoGeneraVacaciones=true;
	public Boolean isVisibilidadCeldaOrdenProcesoGeneraVacaciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
	public Boolean isVisibilidadCeldaModificarProcesoGeneraVacaciones=false;
	public Boolean isVisibilidadCeldaActualizarProcesoGeneraVacaciones=false;
	public Boolean isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
	public Boolean isVisibilidadCeldaCancelarProcesoGeneraVacaciones=false;
	public Boolean isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=false;	
	
	
	
	public Long getiIdNuevoProcesoGeneraVacaciones() {
		return this.iIdNuevoProcesoGeneraVacaciones;
	}

	public void setiIdNuevoProcesoGeneraVacaciones(Long iIdNuevoProcesoGeneraVacaciones) {
		this.iIdNuevoProcesoGeneraVacaciones = iIdNuevoProcesoGeneraVacaciones;
	}
	
	public Long getidProcesoGeneraVacacionesActual() {
		return this.idProcesoGeneraVacacionesActual;
	}

	public void setidProcesoGeneraVacacionesActual(Long idProcesoGeneraVacacionesActual) {
		this.idProcesoGeneraVacacionesActual = idProcesoGeneraVacacionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoGeneraVacaciones getprocesogeneravacaciones() {
		return this.procesogeneravacaciones;
	}

	public void setprocesogeneravacaciones(ProcesoGeneraVacaciones procesogeneravacaciones) {
		this.procesogeneravacaciones = procesogeneravacaciones;
	}
	
	public ProcesoGeneraVacaciones getprocesogeneravacacionesAux() {
		return this.procesogeneravacacionesAux;
	}

	public void setprocesogeneravacacionesAux(ProcesoGeneraVacaciones procesogeneravacacionesAux) {
		this.procesogeneravacacionesAux = procesogeneravacacionesAux;
	}				
	
	public ProcesoGeneraVacaciones getprocesogeneravacacionesAnterior() {
		return this.procesogeneravacacionesAnterior;
	}

	public void setprocesogeneravacacionesAnterior(ProcesoGeneraVacaciones procesogeneravacacionesAnterior) {
		this.procesogeneravacacionesAnterior = procesogeneravacacionesAnterior;
	}	
	
	public ProcesoGeneraVacaciones getprocesogeneravacacionesTotales() {
		return this.procesogeneravacacionesTotales;
	}

	public void setprocesogeneravacacionesTotales(ProcesoGeneraVacaciones procesogeneravacacionesTotales) {
		this.procesogeneravacacionesTotales = procesogeneravacacionesTotales;
	}	
	
	public ProcesoGeneraVacaciones getprocesogeneravacacionesBean() {
		return this.procesogeneravacacionesBean;
	}

	public void setprocesogeneravacacionesBean(ProcesoGeneraVacaciones procesogeneravacacionesBean) {
		this.procesogeneravacacionesBean = procesogeneravacacionesBean;
	}	
	
	public ProcesoGeneraVacacionesParameterReturnGeneral getprocesogeneravacacionesReturnGeneral() {
		return this.procesogeneravacacionesReturnGeneral;
	}

	public void setprocesogeneravacacionesReturnGeneral(ProcesoGeneraVacacionesParameterReturnGeneral procesogeneravacacionesReturnGeneral) {
		this.procesogeneravacacionesReturnGeneral = procesogeneravacacionesReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoGeneraVacacionesLogic getProcesoGeneraVacacionesLogic()	{		
		return procesogeneravacacionesLogic;
	}

	public void setProcesoGeneraVacacionesLogic(ProcesoGeneraVacacionesLogic procesogeneravacacionesLogic) {
		this.procesogeneravacacionesLogic = procesogeneravacacionesLogic;
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
	
	public Boolean getIsEsNuevoProcesoGeneraVacaciones() {
		return isEsNuevoProcesoGeneraVacaciones;
	}

	public void setIsEsNuevoProcesoGeneraVacaciones(Boolean isEsNuevoProcesoGeneraVacaciones) {
		this.isEsNuevoProcesoGeneraVacaciones = isEsNuevoProcesoGeneraVacaciones;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoGeneraVacaciones() {
		return esParaAccionDesdeFormularioProcesoGeneraVacaciones;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoGeneraVacaciones(Boolean esParaAccionDesdeFormularioProcesoGeneraVacaciones) {
		this.esParaAccionDesdeFormularioProcesoGeneraVacaciones = esParaAccionDesdeFormularioProcesoGeneraVacaciones;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesProcesoGeneraVacaciones() throws Exception {
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
		
	public ProcesoGeneraVacacionesParameterReturnGeneral getProcesoGeneraVacacionesParameterGeneral() {
		return this.procesogeneravacacionesParameterGeneral;
	}
	
	public void setProcesoGeneraVacacionesParameterGeneral(ProcesoGeneraVacacionesParameterReturnGeneral procesogeneravacacionesParameterGeneral) {
		this.procesogeneravacacionesParameterGeneral = procesogeneravacacionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoGeneraVacaciones() {
		return isPermisoTodoProcesoGeneraVacaciones;
	}

	public void setIsPermisoTodoProcesoGeneraVacaciones(Boolean isPermisoTodoProcesoGeneraVacaciones) {
		this.isPermisoTodoProcesoGeneraVacaciones = isPermisoTodoProcesoGeneraVacaciones;
	}

	public Boolean getIsPermisoNuevoProcesoGeneraVacaciones() {
		return isPermisoNuevoProcesoGeneraVacaciones;
	}

	public void setIsPermisoNuevoProcesoGeneraVacaciones(Boolean isPermisoNuevoProcesoGeneraVacaciones) {
		this.isPermisoNuevoProcesoGeneraVacaciones = isPermisoNuevoProcesoGeneraVacaciones;
	}

	public Boolean getIsPermisoActualizarProcesoGeneraVacaciones() {
		return isPermisoActualizarProcesoGeneraVacaciones;
	}

	public void setIsPermisoActualizarProcesoGeneraVacaciones(Boolean isPermisoActualizarProcesoGeneraVacaciones) {
		this.isPermisoActualizarProcesoGeneraVacaciones = isPermisoActualizarProcesoGeneraVacaciones;
	}

	public Boolean getIsPermisoEliminarProcesoGeneraVacaciones() {
		return isPermisoEliminarProcesoGeneraVacaciones;
	}

	public void setIsPermisoEliminarProcesoGeneraVacaciones(Boolean isPermisoEliminarProcesoGeneraVacaciones) {
		this.isPermisoEliminarProcesoGeneraVacaciones = isPermisoEliminarProcesoGeneraVacaciones;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoGeneraVacaciones() {
		return isPermisoGuardarCambiosProcesoGeneraVacaciones;
	}

	public void setIsPermisoGuardarCambiosProcesoGeneraVacaciones(Boolean isPermisoGuardarCambiosProcesoGeneraVacaciones) {
		this.isPermisoGuardarCambiosProcesoGeneraVacaciones = isPermisoGuardarCambiosProcesoGeneraVacaciones;
	}
	
	public Boolean getIsPermisoConsultaProcesoGeneraVacaciones() {
		return isPermisoConsultaProcesoGeneraVacaciones;
	}

	public void setIsPermisoConsultaProcesoGeneraVacaciones(Boolean isPermisoConsultaProcesoGeneraVacaciones) {
		this.isPermisoConsultaProcesoGeneraVacaciones = isPermisoConsultaProcesoGeneraVacaciones;
	}

	public Boolean getIsPermisoBusquedaProcesoGeneraVacaciones() {
		return isPermisoBusquedaProcesoGeneraVacaciones;
	}

	public void setIsPermisoBusquedaProcesoGeneraVacaciones(Boolean isPermisoBusquedaProcesoGeneraVacaciones) {
		this.isPermisoBusquedaProcesoGeneraVacaciones = isPermisoBusquedaProcesoGeneraVacaciones;
	}

	public Boolean getIsPermisoReporteProcesoGeneraVacaciones() {
		return isPermisoReporteProcesoGeneraVacaciones;
	}

	public void setIsPermisoReporteProcesoGeneraVacaciones(Boolean isPermisoReporteProcesoGeneraVacaciones) {
		this.isPermisoReporteProcesoGeneraVacaciones = isPermisoReporteProcesoGeneraVacaciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoGeneraVacaciones() {
		return isPermisoPaginacionMedioProcesoGeneraVacaciones;
	}

	public void setIsPermisoPaginacionMedioProcesoGeneraVacaciones(Boolean isPermisoPaginacionMedioProcesoGeneraVacaciones) {
		this.isPermisoPaginacionMedioProcesoGeneraVacaciones = isPermisoPaginacionMedioProcesoGeneraVacaciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoGeneraVacaciones() {
		return isPermisoPaginacionTodoProcesoGeneraVacaciones;
	}

	public void setIsPermisoPaginacionTodoProcesoGeneraVacaciones(Boolean isPermisoPaginacionTodoProcesoGeneraVacaciones) {
		this.isPermisoPaginacionTodoProcesoGeneraVacaciones = isPermisoPaginacionTodoProcesoGeneraVacaciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoGeneraVacaciones() {
		return isPermisoPaginacionAltoProcesoGeneraVacaciones;
	}

	public void setIsPermisoPaginacionAltoProcesoGeneraVacaciones(Boolean isPermisoPaginacionAltoProcesoGeneraVacaciones) {
		this.isPermisoPaginacionAltoProcesoGeneraVacaciones = isPermisoPaginacionAltoProcesoGeneraVacaciones;
	}
	
	public Boolean getIsPermisoCopiarProcesoGeneraVacaciones() {
		return isPermisoCopiarProcesoGeneraVacaciones;
	}

	public void setIsPermisoCopiarProcesoGeneraVacaciones(Boolean isPermisoCopiarProcesoGeneraVacaciones) {
		this.isPermisoCopiarProcesoGeneraVacaciones = isPermisoCopiarProcesoGeneraVacaciones;
	}
	
	public Boolean getIsPermisoVerFormProcesoGeneraVacaciones() {
		return isPermisoVerFormProcesoGeneraVacaciones;
	}

	public void setIsPermisoVerFormProcesoGeneraVacaciones(Boolean isPermisoVerFormProcesoGeneraVacaciones) {
		this.isPermisoVerFormProcesoGeneraVacaciones = isPermisoVerFormProcesoGeneraVacaciones;
	}
	
	public Boolean getIsPermisoDuplicarProcesoGeneraVacaciones() {
		return isPermisoDuplicarProcesoGeneraVacaciones;
	}

	public void setIsPermisoDuplicarProcesoGeneraVacaciones(Boolean isPermisoDuplicarProcesoGeneraVacaciones) {
		this.isPermisoDuplicarProcesoGeneraVacaciones = isPermisoDuplicarProcesoGeneraVacaciones;
	}
	
	public Boolean getIsPermisoOrdenProcesoGeneraVacaciones() {
		return isPermisoOrdenProcesoGeneraVacaciones;
	}

	public void setIsPermisoOrdenProcesoGeneraVacaciones(Boolean isPermisoOrdenProcesoGeneraVacaciones) {
		this.isPermisoOrdenProcesoGeneraVacaciones = isPermisoOrdenProcesoGeneraVacaciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoGeneraVacaciones() {
		return isVisibilidadCeldaNuevoProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaNuevoProcesoGeneraVacaciones(Boolean isVisibilidadCeldaNuevoProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones = isVisibilidadCeldaNuevoProcesoGeneraVacaciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoGeneraVacaciones() {
		return isVisibilidadCeldaDuplicarProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoGeneraVacaciones(Boolean isVisibilidadCeldaDuplicarProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaDuplicarProcesoGeneraVacaciones = isVisibilidadCeldaDuplicarProcesoGeneraVacaciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoGeneraVacaciones() {
		return isVisibilidadCeldaCopiarProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaCopiarProcesoGeneraVacaciones(Boolean isVisibilidadCeldaCopiarProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaCopiarProcesoGeneraVacaciones = isVisibilidadCeldaCopiarProcesoGeneraVacaciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoGeneraVacaciones() {
		return isVisibilidadCeldaVerFormProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaVerFormProcesoGeneraVacaciones(Boolean isVisibilidadCeldaVerFormProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaVerFormProcesoGeneraVacaciones = isVisibilidadCeldaVerFormProcesoGeneraVacaciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoGeneraVacaciones() {
		return isVisibilidadCeldaOrdenProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaOrdenProcesoGeneraVacaciones(Boolean isVisibilidadCeldaOrdenProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaOrdenProcesoGeneraVacaciones = isVisibilidadCeldaOrdenProcesoGeneraVacaciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones() {
		return isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones(Boolean isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones = isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoGeneraVacaciones() {
		return isVisibilidadCeldaModificarProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaModificarProcesoGeneraVacaciones(Boolean isVisibilidadCeldaModificarProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaModificarProcesoGeneraVacaciones = isVisibilidadCeldaModificarProcesoGeneraVacaciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoGeneraVacaciones() {
		return isVisibilidadCeldaActualizarProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaActualizarProcesoGeneraVacaciones(Boolean isVisibilidadCeldaActualizarProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones = isVisibilidadCeldaActualizarProcesoGeneraVacaciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoGeneraVacaciones() {
		return isVisibilidadCeldaEliminarProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaEliminarProcesoGeneraVacaciones(Boolean isVisibilidadCeldaEliminarProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones = isVisibilidadCeldaEliminarProcesoGeneraVacaciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoGeneraVacaciones() {
		return isVisibilidadCeldaCancelarProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaCancelarProcesoGeneraVacaciones(Boolean isVisibilidadCeldaCancelarProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones = isVisibilidadCeldaCancelarProcesoGeneraVacaciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoGeneraVacaciones() {
		return isVisibilidadCeldaGuardarProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaGuardarProcesoGeneraVacaciones(Boolean isVisibilidadCeldaGuardarProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones = isVisibilidadCeldaGuardarProcesoGeneraVacaciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones() {
		return isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones(Boolean isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones) {
		this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones = isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones;
	}
		
	public ProcesoGeneraVacacionesSessionBean getprocesogeneravacacionesSessionBean() {
		return this.procesogeneravacacionesSessionBean;
	}
	
	public void setprocesogeneravacacionesSessionBean(ProcesoGeneraVacacionesSessionBean procesogeneravacacionesSessionBean) {
		this.procesogeneravacacionesSessionBean=procesogeneravacacionesSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones)throws Exception {
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
	
	public void bugActualizarReferenciaActual(ProcesoGeneraVacaciones procesogeneravacaciones,ProcesoGeneraVacaciones procesogeneravacacionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoGeneraVacaciones(procesogeneravacaciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesogeneravacacionesAux.setId(procesogeneravacaciones.getId());
		procesogeneravacacionesAux.setVersionRow(procesogeneravacaciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoGeneraVacaciones procesogeneravacacionesLocal) throws Exception {
		
		if(this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoGeneraVacaciones procesogeneravacacionesLocal) throws Exception {	
		if(this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarProcesoGeneraVacacionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesogeneravacacionesValidator.getInvalidValues(this.procesogeneravacaciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoGeneraVacaciones procesogeneravacaciones,List<ProcesoGeneraVacaciones> procesogeneravacacioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoGeneraVacaciones procesogeneravacaciones,List<ProcesoGeneraVacaciones> procesogeneravacacioness) throws Exception {
		try	{			
			ProcesoGeneraVacacionesConstantesFunciones.actualizarSelectedLista(procesogeneravacaciones,procesogeneravacacioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoGeneraVacaciones> procesogeneravacacionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesogeneravacacionessLocal=this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesogeneravacacionessLocal=this.procesogeneravacacioness;
			}
			//ARCHITECTURE
		
			for(ProcesoGeneraVacaciones procesogeneravacacionesLocal:procesogeneravacacionessLocal) {
				if(this.permiteMantenimiento(procesogeneravacacionesLocal) && procesogeneravacacionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoGeneraVacacionesConstantesFunciones.getProcesoGeneraVacacionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoGeneraVacacionesConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelfechaProcesoGeneraVacaciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelfechaProcesoGeneraVacaciones,"");
		
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
		this.iIdNuevoProcesoGeneraVacaciones--;	
		
		
		this.procesogeneravacacionesAux=new ProcesoGeneraVacaciones();
		
		this.procesogeneravacacionesAux.setId(this.iIdNuevoProcesoGeneraVacaciones);
		this.procesogeneravacacionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().add(this.procesogeneravacacionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesogeneravacacioness.add(this.procesogeneravacacionesAux);
		}
		//ARCHITECTURE
		
		this.procesogeneravacaciones=this.procesogeneravacacionesAux;
		
		if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoGeneraVacaciones(this.procesogeneravacaciones);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraVacaciones(this.procesogeneravacaciones);
		}
				
		//this.setDefaultControlesProcesoGeneraVacaciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoGeneraVacaciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoGeneraVacaciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoGeneraVacaciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoGeneraVacaciones(this.procesogeneravacacionesBean,this.procesogeneravacaciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoGeneraVacaciones(this.procesogeneravacacionesReturnGeneral,this.procesogeneravacacionesBean,false);
		
		if(this.procesogeneravacacionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraVacaciones(this.procesogeneravacacionesReturnGeneral.getProcesoGeneraVacaciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoGeneraVacaciones(this.procesogeneravacacionesReturnGeneral.getProcesoGeneraVacaciones());
		}
		
		if(this.procesogeneravacacionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoGeneraVacaciones(this.procesogeneravacacionesReturnGeneral.getProcesoGeneraVacaciones(),classes);//this.procesogeneravacacionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(this.procesogeneravacaciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoGeneraVacaciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoGeneraVacaciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.RecargarFormProcesoGeneraVacaciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
						
			if(procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoGeneraVacaciones();
			}
			
			this.actualizarVisualTableDatosProcesoGeneraVacaciones();
			
			this.jTableDatosProcesoGeneraVacaciones.setRowSelectionInterval(this.getIndiceNuevoProcesoGeneraVacaciones(), this.getIndiceNuevoProcesoGeneraVacaciones());
			
			this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
						
			this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoGeneraVacaciones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jDateChooserfechaProcesoGeneraVacaciones.setEnabled(isHabilitar && this.procesogeneravacacionesConstantesFunciones.activarfechaProcesoGeneraVacaciones);	
		
	};
	
	public void setDefaultControlesProcesoGeneraVacaciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoGeneraVacaciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesogeneravacacionesSessionBean.setConGuardarRelaciones(true);			
			this.procesogeneravacacionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTabbedPaneRelacionesProcesoGeneraVacaciones.setVisible(true);
			
					
		} else {
			//this.procesogeneravacacionesSessionBean.setConGuardarRelaciones(false);			
			this.procesogeneravacacionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTabbedPaneRelacionesProcesoGeneraVacaciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoGeneraVacaciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
				if(procesogeneravacacionesAux.getId().equals(this.iIdNuevoProcesoGeneraVacaciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacioness) {
				if(procesogeneravacacionesAux.getId().equals(this.iIdNuevoProcesoGeneraVacaciones)) {
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
	
	public int getIndiceActualProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
				if(procesogeneravacacionesAux.getId().equals(procesogeneravacaciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacioness) {
				if(procesogeneravacacionesAux.getId().equals(procesogeneravacaciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacacionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
				if(procesogeneravacacionesAux.getProcesoGeneraVacacionesOriginal().getId().equals(procesogeneravacacionesOriginal.getId())) {
					existe=true;
					procesogeneravacacionesOriginal.setId(procesogeneravacacionesAux.getId());
					procesogeneravacacionesOriginal.setVersionRow(procesogeneravacacionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacioness) {
				if(procesogeneravacacionesAux.getProcesoGeneraVacacionesOriginal().getId().equals(procesogeneravacacionesOriginal.getId())) {
					existe=true;
					procesogeneravacacionesOriginal.setId(procesogeneravacacionesAux.getId());
					procesogeneravacacionesOriginal.setVersionRow(procesogeneravacacionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoGeneraVacaciones(Boolean esParaCancelar) throws Exception {
		procesogeneravacacionessAux=new ArrayList<ProcesoGeneraVacaciones>();
		procesogeneravacacionesAux=new ProcesoGeneraVacaciones();
		
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
					if(procesogeneravacacionesAux.getId()<0) {
						procesogeneravacacionessAux.add(procesogeneravacacionesAux);
					}		
				}
				this.iIdNuevoProcesoGeneraVacaciones=0L;
				this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().removeAll(procesogeneravacacionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacioness) {
					if(procesogeneravacacionesAux.getId()<0) {
						procesogeneravacacionessAux.add(procesogeneravacacionesAux);
					}		
				}
				this.iIdNuevoProcesoGeneraVacaciones=0L;
				this.procesogeneravacacioness.removeAll(procesogeneravacacionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoGeneraVacaciones 
					&& this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().size()>0
					) {
					procesogeneravacacionesAux=this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().get(this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().size() - 1);
				
					if(procesogeneravacacionesAux.getId()<0) {
						this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().remove(procesogeneravacacionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoGeneraVacaciones && this.procesogeneravacacioness.size()>0) {
					procesogeneravacacionesAux=this.procesogeneravacacioness.get(this.procesogeneravacacioness.size() - 1);
				
					if(procesogeneravacacionesAux.getId()<0) {
						this.procesogeneravacacioness.remove(procesogeneravacacionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoGeneraVacaciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesogeneravacaciones.getId()<0) {
				this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().remove(this.procesogeneravacaciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesogeneravacaciones.getId()<0) {
				this.procesogeneravacacioness.remove(this.procesogeneravacaciones);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoGeneraVacaciones(List<ProcesoGeneraVacaciones> procesogeneravacacionessAux) throws Exception {
		ProcesoGeneraVacacionesConstantesFunciones.setEstadosInicialesProcesoGeneraVacaciones(procesogeneravacacionessAux);
	}
	
	public void setEstadosInicialesProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacacionesAux) throws Exception {
		ProcesoGeneraVacacionesConstantesFunciones.setEstadosInicialesProcesoGeneraVacaciones(procesogeneravacacionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoGeneraVacacionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoGeneraVacacionesActual()) {
				if(!this.isEsNuevoProcesoGeneraVacaciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoGeneraVacaciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoGeneraVacacionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Genera Vacaciones ?", "MANTENIMIENTO DE Proceso Genera Vacaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoGeneraVacaciones procesogeneravacaciones) throws Exception {
		ProcesoGeneraVacacionesConstantesFunciones.seleccionarAsignar(this.procesogeneravacaciones,procesogeneravacaciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoGeneraVacaciones=this.isPermisoActualizarOriginalProcesoGeneraVacaciones;
			
			
			this.seleccionarAsignar(procesogeneravacaciones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesogeneravacacionesSessionBean.setsFuncionBusquedaRapida(this.procesogeneravacacionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoGeneraVacaciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoGeneraVacaciones(esParaCancelar);				
				this.cancelarNuevoProcesoGeneraVacaciones(esParaCancelar);								
			}
			
			this.procesogeneravacaciones=new ProcesoGeneraVacaciones();
			
			this.inicializarProcesoGeneraVacaciones();
			
			this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoGeneraVacaciones() throws Exception {
		try {
			ProcesoGeneraVacacionesConstantesFunciones.inicializarProcesoGeneraVacaciones(this.procesogeneravacaciones);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoGeneraVacacioness(String sAccionBusqueda,List<ProcesoGeneraVacaciones> procesogeneravacacionessParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoGeneraVacaciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoGeneraVacacionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoGeneraVacacionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoGeneraVacaciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Genera Vacacioneses");		
		parameters.put("busquedapor", ProcesoGeneraVacacionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoGeneraVacaciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoGeneraVacaciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoGeneraVacacionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoGeneraVacacionesBean.TraerProcesoGeneraVacacionesBeans(procesogeneravacacionessParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoGeneraVacacioness(sAccionBusqueda,sTipoArchivoReporte,procesogeneravacacionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoGeneraVacacioness(sAccionBusqueda,sTipoArchivoReporte,procesogeneravacacionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoGeneraVacacionesActionPerformed(null);
					//this.generarExcelReporteProcesoGeneraVacacioness(sAccionBusqueda,sTipoArchivoReporte,procesogeneravacacionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoGeneraVacacioness(sAccionBusqueda,sTipoArchivoReporte,procesogeneravacacionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoGeneraVacacioness(sAccionBusqueda,sTipoArchivoReporte,procesogeneravacacionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoGeneraVacacioness(sAccionBusqueda,sTipoArchivoReporte,procesogeneravacacionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoGeneraVacacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoGeneraVacaciones> procesogeneravacacionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneravacaciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoGeneraVacacioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoGeneraVacaciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoGeneraVacaciones procesogeneravacaciones : procesogeneravacacionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoGeneraVacacionesConstantesFunciones.generarExcelReporteDataProcesoGeneraVacaciones("NORMAL",row,workbook,procesogeneravacaciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Vacaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoGeneraVacaciones(String sTipo,Row row,Workbook workbook) {
		
		ProcesoGeneraVacacionesConstantesFunciones.generarExcelReporteHeaderProcesoGeneraVacaciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoGeneraVacacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoGeneraVacaciones> procesogeneravacacionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneravacaciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoGeneraVacacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoGeneraVacaciones procesogeneravacaciones : procesogeneravacacionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoGeneraVacacionesConstantesFunciones.getProcesoGeneraVacacionesDescripcion(procesogeneravacaciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesogeneravacaciones.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Vacaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoGeneraVacacioness(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoGeneraVacaciones> procesogeneravacacionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoGeneraVacaciones> procesogeneravacacionessRespaldo=null;
		
		classes=ProcesoGeneraVacacionesConstantesFunciones.getClassesRelationshipsOfProcesoGeneraVacaciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesogeneravacacionesLogic.setDatosCliente(this.datosCliente);
		this.procesogeneravacacionesLogic.setDatosDeep(this.datosDeep);
		this.procesogeneravacacionesLogic.setIsConDeep(true);
		
		procesogeneravacacionessRespaldo=this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness();
		
		this.procesogeneravacacionesLogic.setProcesoGeneraVacacioness(procesogeneravacacionessParaReportes);	
		this.procesogeneravacacionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesogeneravacacionessParaReportes=this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness();
		this.procesogeneravacacionesLogic.setProcesoGeneraVacacioness(procesogeneravacacionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneravacaciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoGeneraVacacioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoGeneraVacaciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoGeneraVacaciones procesogeneravacaciones : procesogeneravacacionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoGeneraVacaciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoGeneraVacacionesConstantesFunciones.generarExcelReporteDataProcesoGeneraVacaciones("NORMAL",row,workbook,procesogeneravacaciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoGeneraVacacionesConstantesFunciones.getProcesoGeneraVacacionesDescripcion(procesogeneravacaciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Vacaciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoGeneraVacaciones() throws Exception {		
		this.startProcessProcesoGeneraVacaciones(true);
	}
	
	public void startProcessProcesoGeneraVacaciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesProcesoGeneraVacaciones, this.jScrollPanelDatosProcesoGeneraVacaciones,this.jPanelPaginacionProcesoGeneraVacaciones, this.jScrollPanelDatosEdicionProcesoGeneraVacaciones, this.jPanelAccionesProcesoGeneraVacaciones,this.jPanelAccionesFormularioProcesoGeneraVacaciones,this.jmenuBarProcesoGeneraVacaciones,this.jmenuBarDetalleProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,this.jTtoolBarDetalleProcesoGeneraVacaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoGeneraVacaciones=null; 
		
		final JPanel jPanelParametrosReportesProcesoGeneraVacaciones=this.jPanelParametrosReportesProcesoGeneraVacaciones;
		//final JScrollPane jScrollPanelDatosProcesoGeneraVacaciones=this.jScrollPanelDatosProcesoGeneraVacaciones;
		final JTable jTableDatosProcesoGeneraVacaciones=this.jTableDatosProcesoGeneraVacaciones;		
		final JPanel jPanelPaginacionProcesoGeneraVacaciones=this.jPanelPaginacionProcesoGeneraVacaciones;
		//final JScrollPane jScrollPanelDatosEdicionProcesoGeneraVacaciones=this.jScrollPanelDatosEdicionProcesoGeneraVacaciones;
		final JPanel jPanelAccionesProcesoGeneraVacaciones=this.jPanelAccionesProcesoGeneraVacaciones;
		
		JPanel jPanelCamposAuxiliarProcesoGeneraVacaciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoGeneraVacaciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			jPanelCamposAuxiliarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jPanelCamposProcesoGeneraVacaciones;
			jPanelAccionesFormularioAuxiliarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jPanelAccionesFormularioProcesoGeneraVacaciones;
		}
		
		final JPanel jPanelCamposProcesoGeneraVacaciones=jPanelCamposAuxiliarProcesoGeneraVacaciones;
		final JPanel jPanelAccionesFormularioProcesoGeneraVacaciones=jPanelAccionesFormularioAuxiliarProcesoGeneraVacaciones;
		
		
		final JMenuBar jmenuBarProcesoGeneraVacaciones=this.jmenuBarProcesoGeneraVacaciones;
		final JToolBar jTtoolBarProcesoGeneraVacaciones=this.jTtoolBarProcesoGeneraVacaciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoGeneraVacaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoGeneraVacaciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			jmenuBarDetalleAuxiliarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jmenuBarDetalleProcesoGeneraVacaciones;
			jTtoolBarDetalleAuxiliarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTtoolBarDetalleProcesoGeneraVacaciones;
		}
		
		final JMenuBar jmenuBarDetalleProcesoGeneraVacaciones=jmenuBarDetalleAuxiliarProcesoGeneraVacaciones;
		final JToolBar jTtoolBarDetalleProcesoGeneraVacaciones=jTtoolBarDetalleAuxiliarProcesoGeneraVacaciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoGeneraVacaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoGeneraVacaciones;
			processRunnable.jTableDatos=jTableDatosProcesoGeneraVacaciones;
			processRunnable.jPanelCampos=jPanelCamposProcesoGeneraVacaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoGeneraVacaciones;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoGeneraVacaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoGeneraVacaciones;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoGeneraVacaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoGeneraVacaciones;
			processRunnable.jTtoolBar=jTtoolBarProcesoGeneraVacaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoGeneraVacaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoGeneraVacaciones ,jPanelParametrosReportesProcesoGeneraVacaciones,jTableDatosProcesoGeneraVacaciones, /*jScrollPanelDatosProcesoGeneraVacaciones,*/jPanelCamposProcesoGeneraVacaciones,jPanelPaginacionProcesoGeneraVacaciones, /*jScrollPanelDatosEdicionProcesoGeneraVacaciones,*/ jPanelAccionesProcesoGeneraVacaciones,jPanelAccionesFormularioProcesoGeneraVacaciones,jmenuBarProcesoGeneraVacaciones,jmenuBarDetalleProcesoGeneraVacaciones,jTtoolBarProcesoGeneraVacaciones,jTtoolBarDetalleProcesoGeneraVacaciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesProcesoGeneraVacaciones, jScrollPanelDatosProcesoGeneraVacaciones,jPanelPaginacionProcesoGeneraVacaciones, jScrollPanelDatosEdicionProcesoGeneraVacaciones, jPanelAccionesProcesoGeneraVacaciones,jPanelAccionesFormularioProcesoGeneraVacaciones,jmenuBarProcesoGeneraVacaciones,jmenuBarDetalleProcesoGeneraVacaciones,jTtoolBarProcesoGeneraVacaciones,jTtoolBarDetalleProcesoGeneraVacaciones);
						
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
	
	public void finishProcessProcesoGeneraVacaciones() {// throws Exception 
		this.finishProcessProcesoGeneraVacaciones(true);
	}
	
	public void finishProcessProcesoGeneraVacaciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesProcesoGeneraVacaciones, this.jScrollPanelDatosProcesoGeneraVacaciones,this.jPanelPaginacionProcesoGeneraVacaciones, this.jScrollPanelDatosEdicionProcesoGeneraVacaciones, this.jPanelAccionesProcesoGeneraVacaciones,this.jPanelAccionesFormularioProcesoGeneraVacaciones,this.jmenuBarProcesoGeneraVacaciones,this.jmenuBarDetalleProcesoGeneraVacaciones,this.jTtoolBarProcesoGeneraVacaciones,this.jTtoolBarDetalleProcesoGeneraVacaciones);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoGeneraVacaciones=null; 
		
		final JPanel jPanelParametrosReportesProcesoGeneraVacaciones=this.jPanelParametrosReportesProcesoGeneraVacaciones;
		//final JScrollPane jScrollPanelDatosProcesoGeneraVacaciones=this.jScrollPanelDatosProcesoGeneraVacaciones;
		final JTable jTableDatosProcesoGeneraVacaciones=this.jTableDatosProcesoGeneraVacaciones;		
		final JPanel jPanelPaginacionProcesoGeneraVacaciones=this.jPanelPaginacionProcesoGeneraVacaciones;
		//final JScrollPane jScrollPanelDatosEdicionProcesoGeneraVacaciones=this.jScrollPanelDatosEdicionProcesoGeneraVacaciones;
		final JPanel jPanelAccionesProcesoGeneraVacaciones=this.jPanelAccionesProcesoGeneraVacaciones;
		
		JPanel jPanelCamposAuxiliarProcesoGeneraVacaciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoGeneraVacaciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			jPanelCamposAuxiliarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jPanelCamposProcesoGeneraVacaciones;
			jPanelAccionesFormularioAuxiliarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jPanelAccionesFormularioProcesoGeneraVacaciones;
		}
		
		final JPanel jPanelCamposProcesoGeneraVacaciones=jPanelCamposAuxiliarProcesoGeneraVacaciones;
		final JPanel jPanelAccionesFormularioProcesoGeneraVacaciones=jPanelAccionesFormularioAuxiliarProcesoGeneraVacaciones;
		
		
		final JMenuBar jmenuBarProcesoGeneraVacaciones=this.jmenuBarProcesoGeneraVacaciones;		
		final JToolBar jTtoolBarProcesoGeneraVacaciones=this.jTtoolBarProcesoGeneraVacaciones;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoGeneraVacaciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoGeneraVacaciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			jmenuBarDetalleAuxiliarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jmenuBarDetalleProcesoGeneraVacaciones;
			jTtoolBarDetalleAuxiliarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTtoolBarDetalleProcesoGeneraVacaciones;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoGeneraVacaciones=jmenuBarDetalleAuxiliarProcesoGeneraVacaciones;
		final JToolBar jTtoolBarDetalleProcesoGeneraVacaciones=jTtoolBarDetalleAuxiliarProcesoGeneraVacaciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoGeneraVacaciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoGeneraVacaciones;
			processRunnable.jTableDatos=jTableDatosProcesoGeneraVacaciones;
			processRunnable.jPanelCampos=jPanelCamposProcesoGeneraVacaciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoGeneraVacaciones;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoGeneraVacaciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoGeneraVacaciones;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoGeneraVacaciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoGeneraVacaciones;
			processRunnable.jTtoolBar=jTtoolBarProcesoGeneraVacaciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoGeneraVacaciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoGeneraVacaciones ,jPanelParametrosReportesProcesoGeneraVacaciones, jTableDatosProcesoGeneraVacaciones,/*jScrollPanelDatosProcesoGeneraVacaciones,*/jPanelCamposProcesoGeneraVacaciones,jPanelPaginacionProcesoGeneraVacaciones, /*jScrollPanelDatosEdicionProcesoGeneraVacaciones,*/ jPanelAccionesProcesoGeneraVacaciones,jPanelAccionesFormularioProcesoGeneraVacaciones,jmenuBarProcesoGeneraVacaciones,jmenuBarDetalleProcesoGeneraVacaciones,jTtoolBarProcesoGeneraVacaciones,jTtoolBarDetalleProcesoGeneraVacaciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoGeneraVacaciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoGeneraVacaciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoGeneraVacaciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoGeneraVacaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoGeneraVacaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoGeneraVacaciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoGeneraVacaciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoGeneraVacaciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoGeneraVacaciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesogeneravacacionesConstantesFunciones.getsFinalQueryProcesoGeneraVacaciones();
		String  finalQueryPaginacionTodos=this.procesogeneravacacionesConstantesFunciones.getsFinalQueryProcesoGeneraVacaciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoGeneraVacacionesConstantesFunciones.getArrayColumnasGlobalesNoProcesoGeneraVacaciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoGeneraVacacionesConstantesFunciones.getArrayColumnasGlobalesProcesoGeneraVacaciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoGeneraVacacionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesogeneravacacionessEliminados= new ArrayList<ProcesoGeneraVacaciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoGeneraVacaciones();
		
				///*ProcesoGeneraVacacionesSessionBean*/this.procesogeneravacacionesSessionBean=new ProcesoGeneraVacacionesSessionBean();
			
			if(this.procesogeneravacacionesSessionBean==null) {
				this.procesogeneravacacionesSessionBean=new ProcesoGeneraVacacionesSessionBean();
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
					this.iNumeroPaginacion=ProcesoGeneraVacacionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoGeneraVacacionesConstantesFunciones.getClassesForeignKeysOfProcesoGeneraVacaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesogeneravacaciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesogeneravacacionessAux= new ArrayList<ProcesoGeneraVacaciones>();
			
				
			procesogeneravacacionesLogic.setDatosCliente(this.datosCliente);
			procesogeneravacacionesLogic.setDatosDeep(this.datosDeep);
			procesogeneravacacionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoGeneraVacaciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoGeneraVacaciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesogeneravacacionesLogic.getProcesoGeneraVacacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesogeneravacacioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesogeneravacacionesLogic.getProcesoGeneraVacacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesogeneravacacioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoGeneraVacaciones procesogeneravacaciones) {
		Boolean permite=true;
		
		if(this.procesogeneravacaciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoGeneraVacacionesConstantesFunciones.getOrderByListaProcesoGeneraVacaciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoGeneraVacacionesConstantesFunciones.getOrderByListaProcesoGeneraVacaciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraVacaciones procesogeneravacaciones:procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
				if(procesogeneravacaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesogeneravacacionesTotales=procesogeneravacaciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraVacaciones procesogeneravacaciones:this.procesogeneravacacioness) {
				if(procesogeneravacaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesogeneravacacionesTotales=procesogeneravacaciones;
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
			this.procesogeneravacacionesAux=new ProcesoGeneraVacaciones();
			this.procesogeneravacacionesAux.setsType(Constantes2.S_TOTALES);
			this.procesogeneravacacionesAux.setIsNew(false);
			this.procesogeneravacacionesAux.setIsChanged(false);
			this.procesogeneravacacionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoGeneraVacacionesConstantesFunciones.TotalizarValoresFilaProcesoGeneraVacaciones(this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness(),this.procesogeneravacacionesAux);
				
				//this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().add(this.procesogeneravacacionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoGeneraVacacionesConstantesFunciones.TotalizarValoresFilaProcesoGeneraVacaciones(this.procesogeneravacacioness,this.procesogeneravacacionesAux);
				
				this.procesogeneravacacioness.add(this.procesogeneravacacionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesogeneravacacionesTotales=new ProcesoGeneraVacaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().remove(procesogeneravacacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesogeneravacacioness.remove(procesogeneravacacionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesogeneravacacionesTotales=new ProcesoGeneraVacaciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoGeneraVacaciones procesogeneravacaciones:procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
				if(procesogeneravacaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesogeneravacacionesTotales=procesogeneravacaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoGeneraVacacionesConstantesFunciones.TotalizarValoresFilaProcesoGeneraVacaciones(this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness(),procesogeneravacacionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoGeneraVacaciones procesogeneravacaciones:this.procesogeneravacacioness) {
				if(procesogeneravacaciones.getsType().equals(Constantes2.S_TOTALES)) {
					procesogeneravacacionesTotales=procesogeneravacaciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoGeneraVacacionesConstantesFunciones.TotalizarValoresFilaProcesoGeneraVacaciones(this.procesogeneravacacioness,procesogeneravacacionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosProcesoGeneraVacaciones() {
		this.isPermisoTodoProcesoGeneraVacaciones=false;
		this.isPermisoNuevoProcesoGeneraVacaciones=false;
		this.isPermisoActualizarProcesoGeneraVacaciones=false;
		this.isPermisoActualizarOriginalProcesoGeneraVacaciones=false;
		this.isPermisoEliminarProcesoGeneraVacaciones=false;
		this.isPermisoGuardarCambiosProcesoGeneraVacaciones=false;
		this.isPermisoConsultaProcesoGeneraVacaciones=true;
		this.isPermisoBusquedaProcesoGeneraVacaciones=true;
		this.isPermisoReporteProcesoGeneraVacaciones=true;
		this.isPermisoOrdenProcesoGeneraVacaciones=false;		
		this.isPermisoPaginacionMedioProcesoGeneraVacaciones=false;		
		this.isPermisoPaginacionAltoProcesoGeneraVacaciones=false;		
		this.isPermisoPaginacionTodoProcesoGeneraVacaciones=false;		
		this.isPermisoCopiarProcesoGeneraVacaciones=false;		
		this.isPermisoVerFormProcesoGeneraVacaciones=false;		
		this.isPermisoDuplicarProcesoGeneraVacaciones=false;
		this.isPermisoOrdenProcesoGeneraVacaciones=false;
	}
	
	public void setPermisosUsuarioProcesoGeneraVacaciones(Boolean isPermiso) {
		this.isPermisoTodoProcesoGeneraVacaciones=isPermiso;
		this.isPermisoNuevoProcesoGeneraVacaciones=isPermiso;
		this.isPermisoActualizarProcesoGeneraVacaciones=isPermiso;
		this.isPermisoActualizarOriginalProcesoGeneraVacaciones=isPermiso;
		this.isPermisoEliminarProcesoGeneraVacaciones=isPermiso;
		this.isPermisoGuardarCambiosProcesoGeneraVacaciones=isPermiso;
		this.isPermisoConsultaProcesoGeneraVacaciones=isPermiso;
		this.isPermisoBusquedaProcesoGeneraVacaciones=isPermiso;
		this.isPermisoReporteProcesoGeneraVacaciones=isPermiso;
		this.isPermisoOrdenProcesoGeneraVacaciones=isPermiso;		
		this.isPermisoPaginacionMedioProcesoGeneraVacaciones=isPermiso;		
		this.isPermisoPaginacionAltoProcesoGeneraVacaciones=isPermiso;		
		this.isPermisoPaginacionTodoProcesoGeneraVacaciones=isPermiso;		
		this.isPermisoCopiarProcesoGeneraVacaciones=isPermiso;		
		this.isPermisoVerFormProcesoGeneraVacaciones=isPermiso;		
		this.isPermisoDuplicarProcesoGeneraVacaciones=isPermiso;
		this.isPermisoOrdenProcesoGeneraVacaciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoGeneraVacaciones(Boolean isPermiso) {
		//this.isPermisoTodoProcesoGeneraVacaciones=isPermiso;
		this.isPermisoNuevoProcesoGeneraVacaciones=isPermiso;
		this.isPermisoActualizarProcesoGeneraVacaciones=isPermiso;
		this.isPermisoActualizarOriginalProcesoGeneraVacaciones=isPermiso;
		this.isPermisoEliminarProcesoGeneraVacaciones=isPermiso;
		this.isPermisoGuardarCambiosProcesoGeneraVacaciones=isPermiso;
		//this.isPermisoConsultaProcesoGeneraVacaciones=isPermiso;
		//this.isPermisoBusquedaProcesoGeneraVacaciones=isPermiso;
		//this.isPermisoReporteProcesoGeneraVacaciones=isPermiso;
		//this.isPermisoOrdenProcesoGeneraVacaciones=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoGeneraVacaciones=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoGeneraVacaciones=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoGeneraVacaciones=isPermiso;		
		//this.isPermisoCopiarProcesoGeneraVacaciones=isPermiso;		
		//this.isPermisoDuplicarProcesoGeneraVacaciones=isPermiso;
		//this.isPermisoOrdenProcesoGeneraVacaciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoGeneraVacacionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoGeneraVacacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoGeneraVacaciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoGeneraVacacionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoGeneraVacacionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoGeneraVacacionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoGeneraVacacionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoGeneraVacaciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoGeneraVacacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoGeneraVacacionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoGeneraVacaciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoGeneraVacaciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoGeneraVacaciones=this.isPermisoActualizarProcesoGeneraVacaciones;
			this.isPermisoEliminarProcesoGeneraVacaciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoGeneraVacaciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoGeneraVacaciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoGeneraVacaciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoGeneraVacaciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoGeneraVacaciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoGeneraVacaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoGeneraVacaciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoGeneraVacaciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoGeneraVacaciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoGeneraVacaciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoGeneraVacaciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoGeneraVacaciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoGeneraVacaciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoGeneraVacaciones.setToolTipText(this.jTableDatosProcesoGeneraVacaciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoGeneraVacaciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoGeneraVacaciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoGeneraVacacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoGeneraVacacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoGeneraVacaciones() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyProcesoGeneraVacacionesListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoGeneraVacacionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoGeneraVacacionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoGeneraVacaciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyProcesoGeneraVacaciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoGeneraVacaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoGeneraVacaciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoGeneraVacaciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoGeneraVacaciones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoGeneraVacaciones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoGeneraVacaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoGeneraVacaciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoGeneraVacaciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoGeneraVacaciones()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoGeneraVacaciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoGeneraVacaciones()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ProcesoGeneraVacacionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoGeneraVacacionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoGeneraVacacionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesogeneravacacionesSessionBean=new ProcesoGeneraVacacionesSessionBean(); 
		this.procesogeneravacacionesConstantesFunciones=new ProcesoGeneraVacacionesConstantesFunciones(); 
		this.procesogeneravacacionesBean=new ProcesoGeneraVacaciones();//(this.procesogeneravacacionesConstantesFunciones); 		
		this.procesogeneravacacionesReturnGeneral=new ProcesoGeneraVacacionesParameterReturnGeneral(); 
		
		this.procesogeneravacacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesogeneravacacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoGeneraVacacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoGeneraVacacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoGeneraVacacionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoGeneraVacaciones(true);
			
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
			
			this.procesogeneravacacionesConstantesFunciones=new ProcesoGeneraVacacionesConstantesFunciones(); 
			this.procesogeneravacacionesBean=new ProcesoGeneraVacaciones();//this.procesogeneravacacionesConstantesFunciones); 			
			this.procesogeneravacacionesReturnGeneral=new ProcesoGeneraVacacionesParameterReturnGeneral(); 
		
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Genera Vacaciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesogeneravacaciones=new ProcesoGeneraVacaciones();
			this.procesogeneravacacioness = new ArrayList<ProcesoGeneraVacaciones>();
			this.procesogeneravacacionessAux = new ArrayList<ProcesoGeneraVacaciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic=new ProcesoGeneraVacacionesLogic();
				this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.procesogeneravacacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesogeneravacacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoGeneraVacaciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones);	
					}
					
					if(this.jInternalFrameImportacionProcesoGeneraVacaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoGeneraVacaciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoGeneraVacaciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoGeneraVacaciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoGeneraVacaciones);
				this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setVisible(false);
				this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones);
					this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoGeneraVacaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoGeneraVacaciones);
					this.jInternalFrameImportacionProcesoGeneraVacaciones.setVisible(false);
					this.jInternalFrameImportacionProcesoGeneraVacaciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoGeneraVacaciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoGeneraVacaciones);
					this.jInternalFrameOrderByProcesoGeneraVacaciones.setVisible(false);
					this.jInternalFrameOrderByProcesoGeneraVacaciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoGeneraVacacionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoGeneraVacacionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesogeneravacacionesReturnGeneral=new ProcesoGeneraVacacionesParameterReturnGeneral();
			
			this.procesogeneravacacionesParameterGeneral=new ProcesoGeneraVacacionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesogeneravacacionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoGeneraVacacionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoGeneraVacacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado(),this.procesogeneravacacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoGeneraVacacionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado(),this.procesogeneravacacionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaDuplicarProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaCopiarProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaVerFormProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaOrdenProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoGeneraVacaciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoGeneraVacaciones(false);
			
			this.setPermisosUsuarioProcesoGeneraVacaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado() 
				|| (this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado() && this.procesogeneravacacionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoGeneraVacacionesClasesRelacionadas();
			}
			
			if(this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoGeneraVacacionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoGeneraVacaciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoGeneraVacaciones();
			}
			
			if(!this.isPermisoBusquedaProcesoGeneraVacaciones) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoGeneraVacacionesConstantesFunciones.getTiposSeleccionarProcesoGeneraVacaciones());
				
				this.tiposColumnasSelect=ProcesoGeneraVacacionesConstantesFunciones.getTiposSeleccionarProcesoGeneraVacaciones(true);
				
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
			//if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoGeneraVacaciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioProcesoGeneraVacaciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioProcesoGeneraVacaciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGeneraVacaciones() ;
			
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
				procesogeneravacacionesImplementable= (ProcesoGeneraVacacionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoGeneraVacacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesogeneravacacionesImplementableHome= (ProcesoGeneraVacacionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoGeneraVacacionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesogeneravacacioness= new ArrayList<ProcesoGeneraVacaciones>();
			this.procesogeneravacacionessEliminados= new ArrayList<ProcesoGeneraVacaciones>();
						
			this.isEsNuevoProcesoGeneraVacaciones=false;
			this.esParaAccionDesdeFormularioProcesoGeneraVacaciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoGeneraVacaciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoGeneraVacaciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoGeneraVacacionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoGeneraVacaciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoGeneraVacaciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoGeneraVacaciones();
			}
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoGeneraVacaciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoGeneraVacaciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoGeneraVacaciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoGeneraVacaciones")) {
				iIndex=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTabbedPaneRelacionesProcesoGeneraVacaciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTabbedPaneRelacionesProcesoGeneraVacaciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoGeneraVacaciones();	
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
	
	public void cargarCombosForeignKeyProcesoGeneraVacaciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoGeneraVacaciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoGeneraVacaciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoGeneraVacacionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoGeneraVacaciones();
		
		this.cargarCombosFrameForeignKeyProcesoGeneraVacaciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoGeneraVacaciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoGeneraVacaciones();
		}
	}
	
	
	
	public void jButtonNuevoProcesoGeneraVacacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
			
			if(jTableDatosProcesoGeneraVacaciones.getRowCount()>=1) {
				jTableDatosProcesoGeneraVacaciones.removeRowSelectionInterval(0, jTableDatosProcesoGeneraVacaciones.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoGeneraVacaciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoGeneraVacaciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoGeneraVacaciones(true);			
			//this.procesogeneravacaciones=new ProcesoGeneraVacaciones();
			//this.procesogeneravacaciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoGeneraVacaciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones() ;
			
			if(ProcesoGeneraVacacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoGeneraVacaciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesogeneravacaciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);				
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
			if(this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoGeneraVacaciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoGeneraVacacionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoGeneraVacaciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoGeneraVacaciones.getSelectedRows().length;			
			}
			
			procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoGeneraVacaciones--;			
				//ProcesoGeneraVacaciones procesogeneravacacionesAux= new ProcesoGeneraVacaciones();			
				//procesogeneravacacionesAux.setId(this.iIdNuevoProcesoGeneraVacaciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoGeneraVacaciones procesogeneravacacionesOrigen=new ProcesoGeneraVacaciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoGeneraVacaciones procesogeneravacacionesOrigen : procesogeneravacacionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesogeneravacacionesOrigen =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesogeneravacacionesOrigen =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoGeneraVacaciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesogeneravacaciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoGeneraVacaciones(procesogeneravacacionesOrigen,this.procesogeneravacaciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().add(this.procesogeneravacacionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesogeneravacacioness.add(this.procesogeneravacacionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
				
				this.jTableDatosProcesoGeneraVacaciones.setRowSelectionInterval(this.getIndiceNuevoProcesoGeneraVacaciones(), this.getIndiceNuevoProcesoGeneraVacaciones());
				
				int iLastRow =  this.jTableDatosProcesoGeneraVacaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoGeneraVacaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoGeneraVacaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();									
		
			ProcesoGeneraVacaciones procesogeneravacacionesOrigen=new ProcesoGeneraVacaciones();
			ProcesoGeneraVacaciones procesogeneravacacionesDestino=new ProcesoGeneraVacaciones();
				
			procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoGeneraVacaciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesogeneravacacionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoGeneraVacaciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogeneravacacionesOrigen =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesogeneravacacionesOrigen =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesogeneravacacionesDestino =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesogeneravacacionesDestino =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesogeneravacacionesOrigen =procesogeneravacacionessSeleccionados.get(0);
				procesogeneravacacionesDestino =procesogeneravacacionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoGeneraVacaciones(procesogeneravacacionesOrigen,procesogeneravacacionesDestino,true,false);
				
				procesogeneravacacionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesogeneravacacionesDestino,procesogeneravacacionesLogic.getProcesoGeneraVacacioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesogeneravacacionesDestino,procesogeneravacacioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
				
				//this.jTableDatosProcesoGeneraVacaciones.setRowSelectionInterval(this.getIndiceNuevoProcesoGeneraVacaciones(), this.getIndiceNuevoProcesoGeneraVacaciones());
				
				int iLastRow =  this.jTableDatosProcesoGeneraVacaciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoGeneraVacaciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoGeneraVacaciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoGeneraVacaciones.isVisible();
			
			
			this.jPanelParametrosReportesProcesoGeneraVacaciones.setVisible(!isVisible);
			this.jPanelPaginacionProcesoGeneraVacaciones.setVisible(!isVisible);
			this.jPanelAccionesProcesoGeneraVacaciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoGeneraVacaciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoGeneraVacaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoGeneraVacaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoGeneraVacaciones();
			
			this.abrirFrameOrderByProcesoGeneraVacaciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoGeneraVacaciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoGeneraVacaciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoGeneraVacaciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setSize(this.jInternalFrameDetalleFormProcesoGeneraVacaciones.iWidthFormulario,this.jInternalFrameDetalleFormProcesoGeneraVacaciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoGeneraVacaciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoGeneraVacaciones.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jContentPaneDetalleProcesoGeneraVacaciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTabbedPaneRelacionesProcesoGeneraVacaciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jContentPaneDetalleProcesoGeneraVacaciones.getWidth(),ProcesoGeneraVacacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTabbedPaneRelacionesProcesoGeneraVacaciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jContentPaneDetalleProcesoGeneraVacaciones.getWidth(),ProcesoGeneraVacacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTabbedPaneRelacionesProcesoGeneraVacaciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jContentPaneDetalleProcesoGeneraVacaciones.getWidth(),ProcesoGeneraVacacionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoGeneraVacaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoGeneraVacaciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoGeneraVacaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGeneraVacaciones,false,this);
				} else {
					this.jInternalFrameOrderByProcesoGeneraVacaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoGeneraVacaciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoGeneraVacaciones);
				this.jInternalFrameOrderByProcesoGeneraVacaciones.setVisible(false);
				this.jInternalFrameOrderByProcesoGeneraVacaciones.setSelected(false);
				
				this.jInternalFrameOrderByProcesoGeneraVacaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoGeneraVacaciones"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoGeneraVacaciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoGeneraVacaciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoGeneraVacaciones==null) {
				
				this.jInternalFrameImportacionProcesoGeneraVacaciones=new ImportacionJInternalFrame(ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoGeneraVacaciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoGeneraVacaciones);
				this.jInternalFrameImportacionProcesoGeneraVacaciones.setVisible(false);
				this.jInternalFrameImportacionProcesoGeneraVacaciones.setSelected(false);


				this.jInternalFrameImportacionProcesoGeneraVacaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoGeneraVacaciones"));
				this.jInternalFrameImportacionProcesoGeneraVacaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoGeneraVacaciones"));
				this.jInternalFrameImportacionProcesoGeneraVacaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoGeneraVacaciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoGeneraVacaciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones==null) {
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones=new ReporteDinamicoJInternalFrame(ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones);
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoGeneraVacaciones"));
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoGeneraVacaciones"));
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoGeneraVacaciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoGeneraVacaciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoGeneraVacaciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoGeneraVacaciones);
			
	       	this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoGeneraVacaciones.dispose();
			//this.jInternalFrameDetalleFormProcesoGeneraVacaciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoGeneraVacaciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoGeneraVacaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoGeneraVacaciones.setVisible(true);
	        this.jInternalFrameImportacionProcesoGeneraVacaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoGeneraVacaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setVisible(true);
	        this.jInternalFrameOrderByProcesoGeneraVacaciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoGeneraVacaciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoGeneraVacaciones.setVisible(false);
	        this.jInternalFrameOrderByProcesoGeneraVacaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoGeneraVacaciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoGeneraVacaciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoGeneraVacaciones.setVisible(false);
	        this.jInternalFrameImportacionProcesoGeneraVacaciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoGeneraVacaciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoGeneraVacaciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoGeneraVacaciones(true);
			//this.isEsNuevoProcesoGeneraVacaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoGeneraVacaciones(false) ;
			
			if(procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoGeneraVacacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoGeneraVacaciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoGeneraVacacionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoGeneraVacaciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoGeneraVacaciones(true);
			//this.isEsNuevoProcesoGeneraVacaciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesogeneravacaciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoGeneraVacaciones(false) ;
			
			if(ProcesoGeneraVacacionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoGeneraVacaciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoGeneraVacaciones(false);
			
			//if(!this.isEsNuevoProcesoGeneraVacaciones) {								
				int intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(this.procesogeneravacaciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);
				
			}
			
			if(this.permiteMantenimiento(this.procesogeneravacaciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoGeneraVacaciones=true;
					this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
					this.isEsNuevoProcesoGeneraVacaciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoGeneraVacaciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoGeneraVacaciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoGeneraVacaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones(false);
				
				this.habilitarDeshabilitarControlesProcesoGeneraVacaciones(false);
			
												
				
				if(ProcesoGeneraVacacionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoGeneraVacaciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,procesogeneravacacionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoGeneraVacaciones(this.procesogeneravacaciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoGeneraVacaciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesogeneravacacionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesogeneravacaciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				this.procesogeneravacaciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				this.procesogeneravacaciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesogeneravacaciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoGeneraVacacionesModel) this.jTableDatosProcesoGeneraVacaciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoGeneraVacaciones=true;
				this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
				this.isEsNuevoProcesoGeneraVacaciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoGeneraVacaciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones(false);
				
				this.habilitarDeshabilitarControlesProcesoGeneraVacaciones(false);
				
				
				
				if(ProcesoGeneraVacacionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoGeneraVacaciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoGeneraVacaciones.getRowCount()>=1) {
				jTableDatosProcesoGeneraVacaciones.removeRowSelectionInterval(0, jTableDatosProcesoGeneraVacaciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoGeneraVacaciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoGeneraVacaciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones(false) ;
			
			this.isEsNuevoProcesoGeneraVacaciones=false;
			
			if(ProcesoGeneraVacacionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoGeneraVacaciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
				
				//SI ES MANUAL
				if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoGeneraVacaciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoGeneraVacaciones--;			
			//ProcesoGeneraVacaciones procesogeneravacacionesAux= new ProcesoGeneraVacaciones();			
			//procesogeneravacacionesAux.setId(this.iIdNuevoProcesoGeneraVacaciones);
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoGeneraVacaciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);
			
			this.procesogeneravacaciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().add(this.procesogeneravacacionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesogeneravacacioness.add(this.procesogeneravacacionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
			
			this.jTableDatosProcesoGeneraVacaciones.setRowSelectionInterval(this.getIndiceNuevoProcesoGeneraVacaciones(), this.getIndiceNuevoProcesoGeneraVacaciones());
			
			int iLastRow =  this.jTableDatosProcesoGeneraVacaciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoGeneraVacaciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoGeneraVacaciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
			
			//SI ES MANUAL
			if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoGeneraVacaciones();
			}
			
			//this.abrirFrameTreeProcesoGeneraVacaciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoGeneraVacaciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoGeneraVacaciones.setFileImportacion(this.jInternalFrameImportacionProcesoGeneraVacaciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoGeneraVacaciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoGeneraVacaciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoGeneraVacaciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoGeneraVacaciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();		

		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoGeneraVacacionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoGeneraVacacionesBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoGeneraVacacioness("Todos",procesogeneravacacionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Vacaciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA:
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
		
		if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA:
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();		
		
		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneravacaciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoGeneraVacacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ProcesoGeneraVacaciones procesogeneravacaciones:procesogeneravacacionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesogeneravacaciones.getfecha());
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
			//	this.getFilaCabeceraExportarExcelProcesoGeneraVacaciones(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoGeneraVacaciones(procesogeneravacacionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Vacaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoGeneraVacaciones(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
			
			//SI ES MANUAL
			if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoGeneraVacaciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
			
			//SI ES MANUAL
			if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoGeneraVacaciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoGeneraVacacionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
			
			//SI ES MANUAL
			if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoGeneraVacaciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoGeneraVacaciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoGeneraVacaciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoGeneraVacaciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoGeneraVacaciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoGeneraVacaciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoGeneraVacaciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoGeneraVacaciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoGeneraVacaciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoGeneraVacaciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoGeneraVacaciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoGeneraVacaciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoGeneraVacaciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoGeneraVacaciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGeneraVacaciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoGeneraVacaciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoGeneraVacaciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoGeneraVacaciones();
		
		this.inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoGeneraVacaciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGeneraVacaciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoGeneraVacaciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoGeneraVacaciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoGeneraVacaciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jCheckBoxPostAccionNuevoProcesoGeneraVacaciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jCheckBoxPostAccionSinCerrarProcesoGeneraVacaciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jCheckBoxPostAccionSinMensajeProcesoGeneraVacaciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoGeneraVacaciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoGeneraVacaciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
				this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jCheckBoxPostAccionNuevoProcesoGeneraVacaciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jCheckBoxPostAccionSinCerrarProcesoGeneraVacaciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jCheckBoxPostAccionSinMensajeProcesoGeneraVacaciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoGeneraVacaciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoGeneraVacaciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoGeneraVacaciones(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoGeneraVacaciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoGeneraVacaciones() throws Exception {
		try	{
			if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoGeneraVacaciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoGeneraVacaciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoGeneraVacaciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoGeneraVacaciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoGeneraVacaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoGeneraVacaciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoGeneraVacaciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.addItem(reporte);
			}
			
			
			if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoGeneraVacaciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoGeneraVacaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoGeneraVacaciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoGeneraVacaciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoGeneraVacaciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones!=null) {
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones!=null) {
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoGeneraVacaciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoGeneraVacaciones(Boolean esInicializar) throws Exception {				
		if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoGeneraVacaciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoGeneraVacaciones() throws Exception {
		this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoGeneraVacaciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoGeneraVacacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoGeneraVacacionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoGeneraVacacionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraVacacionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoGeneraVacacionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoGeneraVacacionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoGeneraVacaciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesogeneravacacionesLogic.getProcesoGeneraVacacioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesogeneravacacioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoGeneraVacaciones.setModel(new ProcesoGeneraVacacionesModel(this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoGeneraVacaciones.setModel(new ProcesoGeneraVacacionesModel(this.procesogeneravacacioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoGeneraVacaciones!=null && this.jInternalFrameOrderByProcesoGeneraVacaciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoGeneraVacaciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraVacaciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoGeneraVacacionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO,procesogeneravacacionesConstantesFunciones.resaltarSeleccionarProcesoGeneraVacaciones,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoGeneraVacacionesConstantesFunciones.SCLASSWEBTITULO,procesogeneravacacionesConstantesFunciones.resaltarSeleccionarProcesoGeneraVacaciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraVacaciones,ProcesoGeneraVacacionesConstantesFunciones.LABEL_ID));

		if(this.procesogeneravacacionesConstantesFunciones.mostraridProcesoGeneraVacaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGeneraVacacionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesogeneravacacionesConstantesFunciones.resaltaridProcesoGeneraVacaciones,this.procesogeneravacacionesConstantesFunciones.activaridProcesoGeneraVacaciones,this,true,"idProcesoGeneraVacaciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesogeneravacacionesConstantesFunciones.resaltaridProcesoGeneraVacaciones,this.procesogeneravacacionesConstantesFunciones.activaridProcesoGeneraVacaciones,this,true,"idProcesoGeneraVacaciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraVacaciones,ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA));

		if(this.procesogeneravacacionesConstantesFunciones.mostrarfechaProcesoGeneraVacaciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesogeneravacacionesConstantesFunciones.resaltarfechaProcesoGeneraVacaciones,this.procesogeneravacacionesConstantesFunciones.activarfechaProcesoGeneraVacaciones,this,true,"fechaProcesoGeneraVacaciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesogeneravacacionesConstantesFunciones.resaltarfechaProcesoGeneraVacaciones,this.procesogeneravacacionesConstantesFunciones.activarfechaProcesoGeneraVacaciones,this,true,"fechaProcesoGeneraVacaciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoGeneraVacacionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoGeneraVacaciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoGeneraVacaciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoGeneraVacaciones.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoGeneraVacaciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoGeneraVacaciones.moveColumn(this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoGeneraVacaciones.moveColumn(this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoGeneraVacaciones.moveColumn(this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoGeneraVacaciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoGeneraVacaciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoGeneraVacaciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoGeneraVacaciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoGeneraVacaciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoGeneraVacaciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesogeneravacacionesLogic.getProcesoGeneraVacacioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesogeneravacacioness.size()-1;
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
		//this.jTableDatosProcesoGeneraVacaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoGeneraVacaciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoGeneraVacaciones();
			
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
				
				//this.isEsNuevoProcesoGeneraVacaciones=false;
					
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
				if(this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoGeneraVacaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesogeneravacaciones.getsType().equals("DUPLICADO")
				   || this.procesogeneravacaciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoGeneraVacaciones=true;
				
				} else {
					this.isEsNuevoProcesoGeneraVacaciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
					if(this.procesogeneravacaciones.getId()>=0 && !this.procesogeneravacaciones.getIsNew()) {						
						this.isEsNuevoProcesoGeneraVacaciones=false;
						
					} else {
						this.isEsNuevoProcesoGeneraVacaciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoGeneraVacaciones(esRelaciones);						
				
				this.seleccionarProcesoGeneraVacaciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesogeneravacaciones.getId()<0) {
					this.isEsNuevoProcesoGeneraVacaciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoGeneraVacaciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoGeneraVacaciones(evt,rowIndex);
				}	
				
				if(this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoGeneraVacaciones: " + this.dDif); 
					}
				}								
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoGeneraVacaciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesogeneravacaciones)) {
					if(this.procesogeneravacaciones.getId()>0) {
						this.procesogeneravacaciones.setIsDeleted(true);
						
						this.procesogeneravacacionessEliminados.add(this.procesogeneravacaciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().remove(this.procesogeneravacaciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesogeneravacacioness.remove(this.procesogeneravacaciones);				
					}
					
					
					((ProcesoGeneraVacacionesModel) this.jTableDatosProcesoGeneraVacaciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoGeneraVacaciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoGeneraVacaciones) {
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoGeneraVacaciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoGeneraVacaciones(this.procesogeneravacaciones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoGeneraVacaciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoGeneraVacaciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoGeneraVacaciones(procesogeneravacaciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoGeneraVacaciones(procesogeneravacaciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoGeneraVacaciones(procesogeneravacaciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraVacaciones(procesogeneravacaciones);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.setText(procesogeneravacaciones.getId().toString());
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jDateChooserfechaProcesoGeneraVacaciones.setDate(procesogeneravacaciones.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoGeneraVacaciones procesogeneravacacionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesogeneravacacionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoGeneraVacaciones procesogeneravacacionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesogeneravacacionesLocal=this.procesogeneravacaciones;
			} else {
				procesogeneravacacionesLocal=this.procesogeneravacacionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesogeneravacacionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoGeneraVacaciones(procesogeneravacacionesLocal,true);
					
					if(procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesogeneravacacionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesogeneravacacionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(procesogeneravacaciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(procesogeneravacaciones);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(procesogeneravacaciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.getText()==null || this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.getText()=="" || this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.setText("0");
			}

			if(conColumnasBase) {procesogeneravacaciones.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGeneraVacacionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelIdProcesoGeneraVacaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesogeneravacaciones.setfecha(this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jDateChooserfechaProcesoGeneraVacaciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelfechaProcesoGeneraVacaciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacacionesBean,ProcesoGeneraVacaciones procesogeneravacaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacacionesOrigen,ProcesoGeneraVacaciones procesogeneravacaciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesogeneravacacionesOrigen.getId()!=null && !procesogeneravacacionesOrigen.getId().equals(0L))) {procesogeneravacaciones.setId(procesogeneravacacionesOrigen.getId());}}
			if(conDefault || (!conDefault && procesogeneravacacionesOrigen.getfecha()!=null && !procesogeneravacacionesOrigen.getfecha().equals(new Date()))) {procesogeneravacaciones.setfecha(procesogeneravacacionesOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.setText(procesogeneravacaciones.getId().toString());
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jDateChooserfechaProcesoGeneraVacaciones.setDate(procesogeneravacaciones.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoGeneraVacaciones(ProcesoGeneraVacacionesBean procesogeneravacacionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.setText(procesogeneravacacionesBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jDateChooserfechaProcesoGeneraVacaciones.setDate(procesogeneravacacionesBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoGeneraVacaciones(ProcesoGeneraVacacionesParameterReturnGeneral procesogeneravacacionesReturnGeneral,ProcesoGeneraVacacionesBean procesogeneravacacionesBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoGeneraVacaciones procesogeneravacacionesLocal=new ProcesoGeneraVacaciones();
			
			procesogeneravacacionesLocal=procesogeneravacacionesReturnGeneral.getProcesoGeneraVacaciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesogeneravacacionesLocal.getId()!=null && !procesogeneravacacionesLocal.getId().equals(0L))) {procesogeneravacacionesBean.setId(procesogeneravacacionesLocal.getId());}}
			if(conDefault || (!conDefault && procesogeneravacacionesLocal.getfecha()!=null && !procesogeneravacacionesLocal.getfecha().equals(new Date()))) {procesogeneravacacionesBean.setfecha(procesogeneravacacionesLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoGeneraVacacionesGenerico(Long idProcesoGeneraVacacionesSeleccionado,JComboBox jComboBoxProcesoGeneraVacaciones,List<ProcesoGeneraVacaciones> procesogeneravacacionessLocal)throws Exception {
		try {
			ProcesoGeneraVacaciones  procesogeneravacacionesTemp=null;

			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacionessLocal) {
				if(procesogeneravacacionesAux.getId()!=null && procesogeneravacacionesAux.getId().equals(idProcesoGeneraVacacionesSeleccionado)) {
					procesogeneravacacionesTemp=procesogeneravacacionesAux;
					break;
				}
			}

			jComboBoxProcesoGeneraVacaciones.setSelectedItem(procesogeneravacacionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoGeneraVacacionesGenerico(JComboBox jComboBoxProcesoGeneraVacaciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoGeneraVacaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoGeneraVacaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoGeneraVacaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoGeneraVacaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoGeneraVacaciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoGeneraVacaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoGeneraVacaciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoGeneraVacaciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoGeneraVacaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoGeneraVacaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesogeneravacaciones=(ProcesoGeneraVacaciones) procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesogeneravacaciones =(ProcesoGeneraVacaciones) procesogeneravacacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoGeneraVacaciones procesogeneravacacionesRow=new ProcesoGeneraVacaciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesogeneravacacionesRow=(ProcesoGeneraVacaciones) procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesogeneravacacionesRow=(ProcesoGeneraVacaciones) procesogeneravacacioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones && this.isPermisoNuevoProcesoGeneraVacaciones));			
			this.jButtonDuplicarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaDuplicarProcesoGeneraVacaciones && this.isPermisoDuplicarProcesoGeneraVacaciones));			
			this.jButtonCopiarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaCopiarProcesoGeneraVacaciones && this.isPermisoCopiarProcesoGeneraVacaciones));
			this.jButtonVerFormProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaVerFormProcesoGeneraVacaciones && this.isPermisoVerFormProcesoGeneraVacaciones));
			
			this.jButtonAbrirOrderByProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraVacaciones && this.isPermisoOrdenProcesoGeneraVacaciones));			
			
			this.jButtonNuevoRelacionesProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones && this.isPermisoNuevoProcesoGeneraVacaciones));			
			this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones && this.isPermisoNuevoProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonModificarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaModificarProcesoGeneraVacaciones && this.isPermisoActualizarProcesoGeneraVacaciones));	
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones && this.isPermisoActualizarProcesoGeneraVacaciones));	
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones && this.isPermisoEliminarProcesoGeneraVacaciones));
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarProcesoGeneraVacaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones);							
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones && this.isPermisoNuevoProcesoGeneraVacaciones));						
			this.jButtonDuplicarToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaDuplicarProcesoGeneraVacaciones && this.isPermisoDuplicarProcesoGeneraVacaciones));						
			this.jButtonCopiarToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaCopiarProcesoGeneraVacaciones && this.isPermisoCopiarProcesoGeneraVacaciones));			
			this.jButtonVerFormToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaVerFormProcesoGeneraVacaciones && this.isPermisoVerFormProcesoGeneraVacaciones));			
			this.jButtonAbrirOrderByToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraVacaciones && this.isPermisoOrdenProcesoGeneraVacaciones));
			this.jButtonNuevoRelacionesToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones && this.isPermisoNuevoProcesoGeneraVacaciones));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones && this.isPermisoNuevoProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));			
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonModificarToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaModificarProcesoGeneraVacaciones && this.isPermisoActualizarProcesoGeneraVacaciones));	
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones  && this.isPermisoActualizarProcesoGeneraVacaciones));	
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones && this.isPermisoEliminarProcesoGeneraVacaciones));
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarToolBarProcesoGeneraVacaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones);				
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones && this.isPermisoNuevoProcesoGeneraVacaciones));			
			this.jMenuItemDuplicarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaDuplicarProcesoGeneraVacaciones && this.isPermisoDuplicarProcesoGeneraVacaciones));			
			this.jMenuItemCopiarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaCopiarProcesoGeneraVacaciones && this.isPermisoCopiarProcesoGeneraVacaciones));			
			this.jMenuItemVerFormProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaVerFormProcesoGeneraVacaciones && this.isPermisoVerFormProcesoGeneraVacaciones));			
			this.jMenuItemAbrirOrderByProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraVacaciones && this.isPermisoOrdenProcesoGeneraVacaciones));			
			//this.jMenuItemMostrarOcultarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraVacaciones && this.isPermisoOrdenProcesoGeneraVacaciones));
			this.jMenuItemDetalleAbrirOrderByProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraVacaciones && this.isPermisoOrdenProcesoGeneraVacaciones));			
			//this.jMenuItemDetalleMostrarOcultarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaOrdenProcesoGeneraVacaciones && this.isPermisoOrdenProcesoGeneraVacaciones));			
			this.jMenuItemNuevoRelacionesProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones && this.isPermisoNuevoProcesoGeneraVacaciones));			
			this.jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones && this.isPermisoNuevoProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));									
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemModificarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaModificarProcesoGeneraVacaciones && this.isPermisoActualizarProcesoGeneraVacaciones));	
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemActualizarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones && this.isPermisoActualizarProcesoGeneraVacaciones));	
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemEliminarProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones && this.isPermisoEliminarProcesoGeneraVacaciones));
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemCancelarProcesoGeneraVacaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones);				
			}
			
			this.jMenuItemGuardarCambiosProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));						
			this.jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=this.jButtonNuevoProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoGeneraVacaciones=this.jButtonDuplicarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaCopiarProcesoGeneraVacaciones=this.jButtonCopiarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaVerFormProcesoGeneraVacaciones=this.jButtonVerFormProcesoGeneraVacaciones.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoGeneraVacaciones=this.jButtonAbrirOrderByProcesoGeneraVacaciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=this.jButtonNuevoRelacionesProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=this.jButtonModificarProcesoGeneraVacaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosProcesoGeneraVacaciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=this.jButtonNuevoToolBarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=this.jButtonNuevoRelacionesToolBarProcesoGeneraVacaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonModificarToolBarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarToolBarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarToolBarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarToolBarProcesoGeneraVacaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=this.jButtonGuardarCambiosToolBarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=this.jButtonGuardarCambiosTablaToolBarProcesoGeneraVacaciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=this.jMenuItemNuevoProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=this.jMenuItemNuevoRelacionesProcesoGeneraVacaciones.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemModificarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemActualizarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemEliminarProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemCancelarProcesoGeneraVacaciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=this.jMenuItemGuardarCambiosProcesoGeneraVacaciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=this.jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoGeneraVacaciones(Boolean esInicializar) {
		if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
				//if(this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoGeneraVacaciones();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoGeneraVacaciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoGeneraVacaciones() {
		this.jButtonNuevoProcesoGeneraVacaciones.setVisible(this.isPermisoNuevoProcesoGeneraVacaciones);			
		this.jButtonDuplicarProcesoGeneraVacaciones.setVisible(this.isPermisoDuplicarProcesoGeneraVacaciones);			
		this.jButtonCopiarProcesoGeneraVacaciones.setVisible(this.isPermisoCopiarProcesoGeneraVacaciones);			
		this.jButtonVerFormProcesoGeneraVacaciones.setVisible(this.isPermisoVerFormProcesoGeneraVacaciones);			
		
		this.jButtonAbrirOrderByProcesoGeneraVacaciones.setVisible(this.isPermisoOrdenProcesoGeneraVacaciones);					
		
		this.jButtonNuevoRelacionesProcesoGeneraVacaciones.setVisible(this.isPermisoNuevoProcesoGeneraVacaciones);			
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonModificarProcesoGeneraVacaciones.setVisible(this.isPermisoActualizarProcesoGeneraVacaciones);	
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarProcesoGeneraVacaciones.setVisible(this.isPermisoActualizarProcesoGeneraVacaciones);	
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarProcesoGeneraVacaciones.setVisible(this.isPermisoEliminarProcesoGeneraVacaciones);
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarProcesoGeneraVacaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones);						
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosProcesoGeneraVacaciones.setVisible(this.isPermisoGuardarCambiosProcesoGeneraVacaciones);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.setVisible(this.isPermisoActualizarProcesoGeneraVacaciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoGeneraVacaciones() {
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonModificarProcesoGeneraVacaciones.setVisible(this.isPermisoActualizarProcesoGeneraVacaciones);	
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarProcesoGeneraVacaciones.setVisible(this.isPermisoActualizarProcesoGeneraVacaciones);	
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarProcesoGeneraVacaciones.setVisible(this.isPermisoEliminarProcesoGeneraVacaciones);
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarProcesoGeneraVacaciones.setVisible(this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones);							
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosProcesoGeneraVacaciones.setVisible((this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones && this.isPermisoGuardarCambiosProcesoGeneraVacaciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoGeneraVacaciones() {
		if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoGeneraVacaciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoGeneraVacaciones() {
	}
	
	public void jTableDatosProcesoGeneraVacacionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoGeneraVacaciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoGeneraVacacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(this.getprocesogeneravacaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogeneravacaciones==null) {
						this.procesogeneravacaciones = new ProcesoGeneraVacaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(this.procesogeneravacaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);
				}

				if(this.procesogeneravacaciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesogeneravacaciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaProcesoGeneraVacacionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(this.getprocesogeneravacaciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesogeneravacaciones==null) {
						this.procesogeneravacaciones = new ProcesoGeneraVacaciones();
					}

					this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(this.procesogeneravacaciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);
				}

				if(this.procesogeneravacaciones.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.procesogeneravacaciones.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameProcesoGeneraVacaciones() {
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.dispose();
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones!=null) {
			this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.dispose();
			this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones=null;
		}
		
		if(this.jInternalFrameImportacionProcesoGeneraVacaciones!=null) {
			this.jInternalFrameImportacionProcesoGeneraVacaciones.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoGeneraVacaciones.dispose();
			this.jInternalFrameImportacionProcesoGeneraVacaciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoGeneraVacaciones();
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoGeneraVacaciones")) {
				jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoGeneraVacaciones")) {
				jButtonDuplicarProcesoGeneraVacacionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoGeneraVacaciones")) {
				jButtonCopiarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoGeneraVacaciones")) {
				jButtonVerFormProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoGeneraVacaciones")) {
				jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoGeneraVacaciones")) {
				jButtonDuplicarProcesoGeneraVacacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoGeneraVacaciones")) {
				jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoGeneraVacaciones")) {
				jButtonDuplicarProcesoGeneraVacacionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoGeneraVacaciones")) {
				jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoGeneraVacaciones")) {
				jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoGeneraVacaciones")) {
				jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoGeneraVacaciones")) {
				jButtonModificarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoGeneraVacaciones")) {
				jButtonModificarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoGeneraVacaciones")) {
				jButtonModificarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoGeneraVacaciones")) {
				jButtonActualizarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoGeneraVacaciones")) {
				jButtonActualizarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoGeneraVacaciones")) {
				jButtonActualizarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoGeneraVacaciones")) {
				jButtonEliminarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoGeneraVacaciones")) {
				jButtonEliminarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoGeneraVacaciones")) {
				jButtonEliminarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoGeneraVacaciones")) {
				jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoGeneraVacaciones")) {
				jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoGeneraVacaciones")) {
				jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoGeneraVacaciones")) {
				jButtonCerrarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoGeneraVacaciones")) {
				jButtonCerrarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoGeneraVacaciones")) {
				jButtonCerrarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoGeneraVacaciones")) {
				jButtonMostrarOcultarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoGeneraVacaciones")) {
				jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoGeneraVacaciones")) {
				jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoGeneraVacaciones")) {
				jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoGeneraVacaciones")) {
				jButtonCopiarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoGeneraVacaciones")) {
				jButtonVerFormProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoGeneraVacaciones")) {
				jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoGeneraVacaciones")) {
				jButtonCopiarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoGeneraVacaciones")) {
				jButtonVerFormProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoGeneraVacaciones")) {
				jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoGeneraVacaciones")) {
				jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoGeneraVacaciones")) {
				jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoGeneraVacaciones")) {
				jButtonRecargarInformacionProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoGeneraVacaciones")) {
				jButtonRecargarInformacionProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoGeneraVacaciones")) {
				jButtonRecargarInformacionProcesoGeneraVacacionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoGeneraVacaciones")) {
				jButtonAnterioresProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoGeneraVacaciones")) {
				jButtonAnterioresProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoGeneraVacaciones")) {
				jButtonAnterioresProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoGeneraVacaciones")) {
				jButtonSiguientesProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoGeneraVacaciones")) {
				jButtonSiguientesProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoGeneraVacaciones")) {
				jButtonSiguientesProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoGeneraVacaciones") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoGeneraVacaciones")) {
				jButtonAbrirOrderByProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoGeneraVacaciones") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoGeneraVacaciones")) {
				jButtonMostrarOcultarProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoGeneraVacaciones")) {
				jButtonNuevoGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoGeneraVacaciones")) {
				jButtonNuevoGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoGeneraVacaciones")) {
				jButtonNuevoGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoGeneraVacaciones")) {
				jButtonProcesarInformacionProcesoGeneraVacacionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoGeneraVacaciones")) {
				jButtonCerrarReporteDinamicoProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoGeneraVacaciones")) {
				jButtonGenerarReporteDinamicoProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoGeneraVacaciones")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoGeneraVacaciones")) {
				jButtonCerrarImportacionProcesoGeneraVacacionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoGeneraVacaciones")) {
				
				jButtonGenerarImportacionProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoGeneraVacaciones")) {
				
				jButtonAbrirImportacionProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoGeneraVacaciones")) {
				jComboBoxTiposAccionesProcesoGeneraVacacionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoGeneraVacaciones")) {
				jComboBoxTiposRelacionesProcesoGeneraVacacionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoGeneraVacaciones")) {
				jComboBoxTiposAccionesProcesoGeneraVacacionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoGeneraVacaciones")) {
				
				jComboBoxTiposSeleccionarProcesoGeneraVacacionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoGeneraVacaciones")) {
				jTextFieldValorCampoGeneralProcesoGeneraVacacionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoGeneraVacaciones")) {
				jButtonAbrirOrderByProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoGeneraVacaciones")) {
				jButtonAbrirOrderByProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoGeneraVacaciones")) {
				jButtonCerrarOrderByProcesoGeneraVacacionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoGeneraVacacionesBusqueda")) {
				this.jButtonidProcesoGeneraVacacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoGeneraVacacionesBusqueda")) {
				this.jButtonfechaProcesoGeneraVacacionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoGeneraVacaciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				


				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoGeneraVacaciones procesogeneravacacionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesogeneravacacionesLocal=this.procesogeneravacaciones;
			} else {
				procesogeneravacacionesLocal=this.procesogeneravacacionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
							
				
				


				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
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
			
			


			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
								
						
				


				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
								
				
				


				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
							
				
				


				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
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
			
			


			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
								
				
				


				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoGeneraVacaciones")) {
					jCheckBoxSeleccionarTodosProcesoGeneraVacacionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoGeneraVacaciones")) {
					jCheckBoxSeleccionadosProcesoGeneraVacacionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoGeneraVacaciones")) {
					
				}
				
				


				
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
												
				
				


				
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
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
			
			


			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesogeneravacaciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesogeneravacaciones);
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
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
				
				


				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoGeneraVacaciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoGeneraVacaciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoGeneraVacacionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesogeneravacacionesAnterior =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoGeneraVacaciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoGeneraVacacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoGeneraVacaciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesogeneravacaciones =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesogeneravacaciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoGeneraVacaciones")) {
				
				}
				
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoGeneraVacaciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoGeneraVacaciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoGeneraVacaciones")) {
			
			}
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoGeneraVacaciones();
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoGeneraVacaciones")) {
				jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoGeneraVacaciones")) {
				jButtonDuplicarProcesoGeneraVacacionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoGeneraVacaciones")) {
				jButtonCopiarProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoGeneraVacaciones")) {
				jButtonVerFormProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoGeneraVacaciones")) {
				jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoGeneraVacaciones")) {
				jButtonModificarProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoGeneraVacaciones")) {
				jButtonActualizarProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoGeneraVacaciones")) {
				jButtonEliminarProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoGeneraVacaciones")) {
				jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoGeneraVacaciones")) {
				jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoGeneraVacaciones")) {
				jButtonCerrarProcesoGeneraVacacionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoGeneraVacaciones")) {
				jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoGeneraVacaciones")) {
				jButtonNuevoGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoGeneraVacaciones")) {
				jButtonAbrirOrderByProcesoGeneraVacacionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoGeneraVacaciones")) {
				jButtonRecargarInformacionProcesoGeneraVacacionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoGeneraVacaciones")) {
				jButtonAnterioresProcesoGeneraVacacionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoGeneraVacaciones")) {
				jButtonSiguientesProcesoGeneraVacacionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoGeneraVacacionesBusqueda")) {
				this.jButtonidProcesoGeneraVacacionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoGeneraVacacionesBusqueda")) {
				this.jButtonfechaProcesoGeneraVacacionesBusquedaActionPerformed(evt);
			}
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoGeneraVacaciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoGeneraVacaciones")) {
				closingInternalFrameProcesoGeneraVacaciones();
				
			} else if(sTipo.equals("jButtonCancelarProcesoGeneraVacaciones")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoGeneraVacaciones = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoGeneraVacacionesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoGeneraVacacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoGeneraVacaciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoGeneraVacacionesActionPerformed(null);
			}
			
			ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesogeneravacaciones,new Object(),this.procesogeneravacacionesParameterGeneral,this.procesogeneravacacionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoGeneraVacaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoGeneraVacaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoGeneraVacaciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesogeneravacaciones)) {
			if(!esControlTabla) {
				if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(this.procesogeneravacaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);			
				}
				
				if(this.procesogeneravacacionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoGeneraVacaciones(this.procesogeneravacaciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoGeneraVacaciones(this.procesogeneravacacionesReturnGeneral,this.procesogeneravacacionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesogeneravacacionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoGeneraVacaciones(classes,this.procesogeneravacacionesReturnGeneral,this.procesogeneravacacionesBean,false);
					}
						
					if(this.procesogeneravacacionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoGeneraVacaciones(this.procesogeneravacacionesReturnGeneral.getProcesoGeneraVacaciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoGeneraVacaciones(this.procesogeneravacacionesReturnGeneral.getProcesoGeneraVacaciones());	
					}
						
					if(this.procesogeneravacacionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoGeneraVacaciones(this.procesogeneravacacionesReturnGeneral.getProcesoGeneraVacaciones(),classes);//this.procesogeneravacacionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoGeneraVacaciones(this.procesogeneravacaciones,classes);//this.procesogeneravacacionesBean);									
				}
			
				if(ProcesoGeneraVacacionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoGeneraVacaciones(this.procesogeneravacaciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoGeneraVacaciones(this.procesogeneravacaciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesogeneravacacionesAnterior!=null) {
						this.procesogeneravacaciones=this.procesogeneravacacionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesogeneravacacionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesogeneravacacionesReturnGeneral.getProcesoGeneraVacaciones(),procesogeneravacacionesLogic.getProcesoGeneraVacacioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesogeneravacacionesReturnGeneral.getProcesoGeneraVacaciones(),this.procesogeneravacacioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoGeneraVacaciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoGeneraVacaciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoGeneraVacaciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoGeneraVacaciones() throws Exception {
		
		ProcesoGeneraVacacionesModel procesogeneravacacionesModel=(ProcesoGeneraVacacionesModel)this.jTableDatosProcesoGeneraVacaciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesogeneravacacionesModel.procesogeneravacacioness=this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesogeneravacacionesModel.procesogeneravacacioness=this.procesogeneravacacioness;
		}
		
		
		((ProcesoGeneraVacacionesModel) this.jTableDatosProcesoGeneraVacaciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoGeneraVacaciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesogeneravacacionesAnterior(),this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesogeneravacacionesAnterior(),this.procesogeneravacacioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoGeneraVacaciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
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
										
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesogeneravacaciones,new Object(),generalEntityParameterGeneral,this.procesogeneravacacionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoGeneraVacacionesConstantesFunciones.getClassesRelationshipsOfProcesoGeneraVacaciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoGeneraVacacionesConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoGeneraVacaciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoGeneraVacaciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesogeneravacaciones,new Object(),generalEntityParameterGeneral,this.procesogeneravacacionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoGeneraVacaciones(ProcesoGeneraVacacionesBean procesogeneravacacionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoGeneraVacaciones(ArrayList<Classe> classes,ProcesoGeneraVacacionesReturnGeneral procesogeneravacacionesReturnGeneral,ProcesoGeneraVacacionesBean procesogeneravacacionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesogeneravacaciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones = new ProcesoGeneraVacacionesDetalleFormJInternalFrame(jDesktopPane,this.procesogeneravacacionesSessionBean.getConGuardarRelaciones(),this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoGeneraVacaciones);
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setVisible(false);
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.procesogeneravacacionesLogic=this.procesogeneravacacionesLogic;
		
		this.cargarCombosFrameForeignKeyProcesoGeneraVacaciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoGeneraVacaciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoGeneraVacaciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoGeneraVacaciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoGeneraVacaciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoGeneraVacaciones"));
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonModificarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"ModificarProcesoGeneraVacaciones"));

		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonModificarToolBarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoGeneraVacaciones"));
					
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemModificarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoGeneraVacaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"ActualizarProcesoGeneraVacaciones"));
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarToolBarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoGeneraVacaciones"));
						
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemActualizarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoGeneraVacaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"EliminarProcesoGeneraVacaciones"));
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoGeneraVacaciones"));
								
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemEliminarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoGeneraVacaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"CancelarProcesoGeneraVacaciones"));
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoGeneraVacaciones"));
					
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemCancelarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoGeneraVacaciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemDetalleCerrarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoGeneraVacaciones"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoGeneraVacaciones"));
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoGeneraVacaciones"));
		
		
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoGeneraVacaciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonidProcesoGeneraVacacionesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoGeneraVacacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonfechaProcesoGeneraVacacionesBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoGeneraVacacionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTabbedPaneRelacionesProcesoGeneraVacaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoGeneraVacaciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoGeneraVacaciones"));
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoGeneraVacaciones"));
		}
		
		this.jTableDatosProcesoGeneraVacaciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoGeneraVacaciones"));
		
		this.jTableDatosProcesoGeneraVacaciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoGeneraVacaciones"));
		
		this.jButtonNuevoProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"NuevoProcesoGeneraVacaciones"));
		
		this.jButtonDuplicarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"DuplicarProcesoGeneraVacaciones"));
		
		this.jButtonCopiarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"CopiarProcesoGeneraVacaciones"));
		
		this.jButtonVerFormProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"VerFormProcesoGeneraVacaciones"));
		
		
		this.jButtonNuevoToolBarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoGeneraVacaciones"));
			
		this.jButtonDuplicarToolBarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoGeneraVacaciones"));
			
		this.jMenuItemNuevoProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoGeneraVacaciones"));
			
		this.jMenuItemDuplicarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoGeneraVacaciones"));		
		
		
		this.jButtonNuevoRelacionesProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoGeneraVacaciones"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoGeneraVacaciones"));
			
		this.jMenuItemNuevoRelacionesProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoGeneraVacaciones"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonModificarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"ModificarProcesoGeneraVacaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonModificarToolBarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoGeneraVacaciones"));
			
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemModificarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoGeneraVacaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"ActualizarProcesoGeneraVacaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonActualizarToolBarProcesoGeneraVacaciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoGeneraVacaciones"));
				
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemActualizarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoGeneraVacaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"EliminarProcesoGeneraVacaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonEliminarToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoGeneraVacaciones"));
						
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemEliminarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoGeneraVacaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"CancelarProcesoGeneraVacaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonCancelarToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoGeneraVacaciones"));
			
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemCancelarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoGeneraVacaciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoGeneraVacaciones"));		
		
		
		this.jButtonCerrarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"CerrarProcesoGeneraVacaciones"));
		
		
		this.jButtonCerrarToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoGeneraVacaciones"));
			
		this.jMenuItemCerrarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoGeneraVacaciones"));
			
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jMenuItemDetalleCerrarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoGeneraVacaciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoGeneraVacaciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoGeneraVacaciones"));
		}
		
		this.jButtonCopiarToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoGeneraVacaciones"));
			
		this.jButtonVerFormToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoGeneraVacaciones"));
		
		this.jMenuItemGuardarCambiosProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoGeneraVacaciones"));
			
		this.jMenuItemCopiarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoGeneraVacaciones"));		
		
		this.jMenuItemVerFormProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoGeneraVacaciones"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoGeneraVacaciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoGeneraVacaciones"));
			
		this.jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoGeneraVacaciones"));		
		
		
		
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoGeneraVacaciones"));
					
		this.jButtonRecargarInformacionToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoGeneraVacaciones"));
		
		this.jMenuItemRecargarInformacionProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoGeneraVacaciones"));		
		
		
		
		this.jButtonAnterioresProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"AnterioresProcesoGeneraVacaciones"));
		
		
		this.jButtonAnterioresToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoGeneraVacaciones"));
		
		this.jMenuItemAnterioresProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoGeneraVacaciones"));		
		
		
		this.jButtonSiguientesProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"SiguientesProcesoGeneraVacaciones"));
		
		
		this.jButtonSiguientesToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoGeneraVacaciones"));
			
		this.jMenuItemSiguientesProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoGeneraVacaciones"));
			
		this.jMenuItemAbrirOrderByProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoGeneraVacaciones"));
			
		this.jMenuItemMostrarOcultarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoGeneraVacaciones"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoGeneraVacaciones"));
			
		this.jMenuItemDetalleMostarOcultarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoGeneraVacaciones"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoGeneraVacaciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoGeneraVacaciones"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoGeneraVacaciones"));		
		
		
		this.jButtonProcesarInformacionProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoGeneraVacaciones"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoGeneraVacaciones"));

		this.jCheckBoxSeleccionadosProcesoGeneraVacaciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoGeneraVacaciones"));
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoGeneraVacaciones"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoGeneraVacaciones"));
			
		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoGeneraVacaciones"));
					
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoGeneraVacaciones"));
			
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoGeneraVacaciones"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonidProcesoGeneraVacacionesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoGeneraVacacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonfechaProcesoGeneraVacacionesBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoGeneraVacacionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones!=null) {
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoGeneraVacaciones"));
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoGeneraVacaciones"));
				this.jInternalFrameReporteDinamicoProcesoGeneraVacaciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoGeneraVacaciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoGeneraVacaciones"));				
			//this.jButtonGenerarReporteDinamicoProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoGeneraVacaciones"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoGeneraVacaciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoGeneraVacaciones!=null) {
				this.jInternalFrameImportacionProcesoGeneraVacaciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoGeneraVacaciones"));
				this.jInternalFrameImportacionProcesoGeneraVacaciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoGeneraVacaciones"));
				this.jInternalFrameImportacionProcesoGeneraVacaciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoGeneraVacaciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoGeneraVacaciones"));
			
			this.jButtonAbrirOrderByToolBarProcesoGeneraVacaciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoGeneraVacaciones"));			
			
			if(this.jInternalFrameOrderByProcesoGeneraVacaciones!=null) {
				this.jInternalFrameOrderByProcesoGeneraVacaciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoGeneraVacaciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jTabbedPaneRelacionesProcesoGeneraVacaciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoGeneraVacaciones"));
		
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
            		closingInternalFrameProcesoGeneraVacaciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoGeneraVacaciones = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoGeneraVacacionesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoGeneraVacacionesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoGeneraVacaciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoGeneraVacacionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoGeneraVacaciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoGeneraVacacionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoGeneraVacaciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoGeneraVacaciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoGeneraVacaciones";
		inputMap = this.jButtonNuevoProcesoGeneraVacaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoGeneraVacaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoGeneraVacaciones";
		inputMap = this.jButtonNuevoRelacionesProcesoGeneraVacaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoGeneraVacaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoGeneraVacacionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoGeneraVacaciones";
		inputMap = this.jButtonModificarProcesoGeneraVacaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoGeneraVacaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoGeneraVacacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoGeneraVacaciones";
		inputMap = this.jButtonActualizarProcesoGeneraVacaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoGeneraVacaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoGeneraVacacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoGeneraVacaciones";
		inputMap = this.jButtonEliminarProcesoGeneraVacaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoGeneraVacaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoGeneraVacacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoGeneraVacaciones";
		inputMap = this.jButtonCancelarProcesoGeneraVacaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoGeneraVacaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoGeneraVacaciones";
		inputMap = this.jButtonCerrarProcesoGeneraVacaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoGeneraVacaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoGeneraVacacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoGeneraVacaciones";
		inputMap = this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosProcesoGeneraVacaciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonGuardarCambiosProcesoGeneraVacaciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoGeneraVacaciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoGeneraVacacionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoGeneraVacaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoGeneraVacacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoGeneraVacacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoGeneraVacacionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonidProcesoGeneraVacacionesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoGeneraVacacionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jButtonfechaProcesoGeneraVacacionesBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoGeneraVacacionesBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoGeneraVacaciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoGeneraVacacionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoGeneraVacacionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoGeneraVacaciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoGeneraVacaciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
					procesogeneravacacionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacioness) {
					procesogeneravacacionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoGeneraVacacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
						procesogeneravacacionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacioness) {
						procesogeneravacacionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoGeneraVacaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoGeneraVacaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraVacaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoGeneraVacacionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoGeneraVacaciones.getSelectedRows();
			
			ProcesoGeneraVacaciones procesogeneravacacionesLocal=new ProcesoGeneraVacaciones();
			
			//this.seleccionarTodosProcesoGeneraVacaciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesogeneravacacionesLocal =(ProcesoGeneraVacaciones) this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness().toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesogeneravacacionesLocal =(ProcesoGeneraVacaciones) this.procesogeneravacacioness.toArray()[this.jTableDatosProcesoGeneraVacaciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesogeneravacacionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
						procesogeneravacacionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacioness) {
						procesogeneravacacionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoGeneraVacaciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoGeneraVacaciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoGeneraVacaciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoGeneraVacacionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoGeneraVacacionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoGeneraVacacionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoGeneraVacaciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
				
						if(sTipoSeleccionar.equals(ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesogeneravacacionesAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacioness) {
					
						if(sTipoSeleccionar.equals(ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesogeneravacacionesAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoGeneraVacacionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoGeneraVacaciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoGeneraVacaciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoGeneraVacaciones) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoGeneraVacaciones(conSplash);
				
					this.generarReporteProcesoGeneraVacacionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoGeneraVacacionessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoGeneraVacacionessSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoGeneraVacacionessSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoGeneraVacaciones();
				
				this.exportarProcesoGeneraVacacionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoGeneraVacacioness();
				//this.importarProcesoGeneraVacacioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoGeneraVacaciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoGeneraVacacionessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Genera Vacaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoGeneraVacaciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoGeneraVacaciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoGeneraVacaciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Genera Vacaciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoGeneraVacacionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoGeneraVacaciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoGeneraVacaciones(conSplash);
					
						//this.actualizarParametrosGeneralProcesoGeneraVacaciones();
						
						this.generarReporteProcesoAccionProcesoGeneraVacacionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Genera VacacionesES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Genera Vacaciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoGeneraVacaciones();
				
						this.actualizarParametrosGeneralProcesoGeneraVacaciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesogeneravacacionesReturnGeneral=procesogeneravacacionesLogic.procesarAccionProcesoGeneraVacacionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness(),this.procesogeneravacacionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoGeneraVacacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoGeneraVacaciones();
					
					ProcesoGeneraVacacionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoGeneraVacacionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoGeneraVacaciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jComboBoxTiposAccionesFormularioProcesoGeneraVacaciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoGeneraVacaciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoGeneraVacacionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoGeneraVacaciones();
			
			if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();		
			ProcesoGeneraVacaciones procesogeneravacaciones=new ProcesoGeneraVacaciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoGeneraVacaciones.getSelectedItem();
			
			
			
			
			procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesogeneravacacionessSeleccionados.size()==1) {
				for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacionessSeleccionados) {
					procesogeneravacaciones=procesogeneravacacionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoGeneraVacaciones();
			
      		//this.finishProcessProcesoGeneraVacaciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoGeneraVacacionesReturnGeneral() throws Exception {
		if(this.procesogeneravacacionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesogeneravacacionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesogeneravacacionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesogeneravacacionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesogeneravacacionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesogeneravacacionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
		}
		
		if(this.procesogeneravacacionesReturnGeneral.getConRetornoLista() || this.procesogeneravacacionesReturnGeneral.getConRetornoObjeto()) {
			if(this.procesogeneravacacionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesogeneravacacionesLogic.setProcesoGeneraVacacioness(this.procesogeneravacacionesReturnGeneral.getProcesoGeneraVacacioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoGeneraVacaciones(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoGeneraVacaciones() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoGeneraVacaciones> getProcesoGeneraVacacionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoGeneraVacaciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacionesLogic.getProcesoGeneraVacacioness()) {
					if(procesogeneravacacionesAux.getIsSelected()) {
						procesogeneravacacionessSeleccionados.add(procesogeneravacacionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoGeneraVacaciones procesogeneravacacionesAux:this.procesogeneravacacioness) {
					if(procesogeneravacacionesAux.getIsSelected()) {
						procesogeneravacacionessSeleccionados.add(procesogeneravacacionesAux);				
					}
				}
			}
			
			if(procesogeneravacacionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesogeneravacacionessSeleccionados.addAll(this.procesogeneravacacionesLogic.getProcesoGeneraVacacioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesogeneravacacionessSeleccionados.addAll(this.procesogeneravacacioness);				
					}
				}
			}
		} else {
			procesogeneravacacionessSeleccionados.add(this.procesogeneravacaciones);
		}
		
		return procesogeneravacacionessSeleccionados;
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
	
	public void generarReporteProcesoGeneraVacacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoGeneraVacacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoGeneraVacacionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoGeneraVacacionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoGeneraVacacionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Genera Vacaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoGeneraVacacionessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();		
		
		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoGeneraVacacioness("Todos",procesogeneravacacionessSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoGeneraVacacionessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();		
		
		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoGeneraVacacioness("Todos",procesogeneravacacionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoGeneraVacacionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();
		
		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoGeneraVacacioness("Todos",procesogeneravacacionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoGeneraVacacionessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoGeneraVacaciones();
		
		
		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoGeneraVacaciones();
		
		
		//this.generarReporteProcesoGeneraVacacioness("Todos",procesogeneravacacionessSeleccionados ,procesogeneravacacionesImplementable,procesogeneravacacionesImplementableHome);
	}
	
	public void mostrarImportacionProcesoGeneraVacacioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoGeneraVacaciones();
		
		this.abrirFrameImportacionProcesoGeneraVacaciones();		
		
			
		//this.generarReporteProcesoGeneraVacacioness("Todos",procesogeneravacacionessSeleccionados ,procesogeneravacacionesImplementable,procesogeneravacacionesImplementableHome);
	}
	
	public void importarProcesoGeneraVacacioness() throws Exception {		
	
	}
	
	public void exportarProcesoGeneraVacacionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoGeneraVacacionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoGeneraVacacionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoGeneraVacacionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Genera Vacaciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoGeneraVacacionessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();		
		
		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneravacaciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoGeneraVacaciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoGeneraVacaciones(procesogeneravacacionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesogeneravacacionesAux.setsDetalleGeneralEntityReporte(procesogeneravacacionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Vacaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoGeneraVacaciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoGeneraVacacionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGeneraVacacionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesogeneravacaciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogeneravacaciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesogeneravacaciones.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoGeneraVacacionessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();		
		
		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneravacaciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoGeneraVacacioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoGeneraVacaciones(row);				
				iRow++;
			}				
			
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoGeneraVacaciones(procesogeneravacacionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Vacaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoGeneraVacacionessSeleccionados() throws Exception {
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();		
		
		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesogeneravacaciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesogeneravacacioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesogeneravacaciones");
			//elementRoot.appendChild(element);
		
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacionessSeleccionados) {
				element = document.createElement("procesogeneravacaciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoGeneraVacaciones(procesogeneravacacionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Genera Vacaciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoGeneraVacaciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGeneraVacacionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGeneraVacacionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA);
	}
	
	public void getFilaDatosExportarExcelProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesogeneravacaciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesogeneravacaciones.getfecha());				
	}
	
	public void setFilaDatosExportarXmlProcesoGeneraVacaciones(ProcesoGeneraVacaciones procesogeneravacaciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoGeneraVacacionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesogeneravacaciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoGeneraVacacionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesogeneravacaciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementfecha = document.createElement(ProcesoGeneraVacacionesConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(procesogeneravacaciones.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoProcesoGeneraVacacionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados=new ArrayList<ProcesoGeneraVacaciones>();
		
		procesogeneravacacionessSeleccionados=this.getProcesoGeneraVacacionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoGeneraVacaciones(procesogeneravacacionessSeleccionados);
		
		this.generarReporteProcesoGeneraVacacioness("Todos",procesogeneravacacionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoGeneraVacaciones(ArrayList<ProcesoGeneraVacaciones> procesogeneravacacionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoGeneraVacaciones procesogeneravacacionesAux:procesogeneravacacionessSeleccionados) {
				procesogeneravacacionesAux.setsDetalleGeneralEntityReporte(procesogeneravacacionesAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoGeneraVacacionesConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					procesogeneravacacionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesogeneravacacionesAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoGeneraVacacionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoGeneraVacaciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoGeneraVacacionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=true;
		} else {
			this.actualizarEstadoPanelsProcesoGeneraVacaciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoGeneraVacaciones=false;
			//this.isVisibilidadCeldaVerFormProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaDuplicarProcesoGeneraVacaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
			if(!procesogeneravacacionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;												
			}
			
			this.jButtonCerrarProcesoGeneraVacaciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
		}
		
		if(!this.permiteMantenimiento(this.procesogeneravacaciones)) {
			this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=false;
			this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoGeneraVacaciones=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoGeneraVacaciones=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoGeneraVacaciones=false;
		//this.isVisibilidadCeldaModificarProcesoGeneraVacaciones=true;
		this.isVisibilidadCeldaActualizarProcesoGeneraVacaciones=false;
		this.isVisibilidadCeldaEliminarProcesoGeneraVacaciones=false;
		//this.isVisibilidadCeldaCancelarProcesoGeneraVacaciones=true;			
		this.isVisibilidadCeldaGuardarProcesoGeneraVacaciones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoGeneraVacaciones() {
	}
	
	public void actualizarEstadoPanelsProcesoGeneraVacaciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosProcesoGeneraVacaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGeneraVacaciones!=null) {
				this.jPanelPaginacionProcesoGeneraVacaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraVacaciones!=null) {
				this.jPanelParametrosReportesProcesoGeneraVacaciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosProcesoGeneraVacaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoGeneraVacaciones!=null) {
				this.jPanelPaginacionProcesoGeneraVacaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraVacaciones!=null) {
				this.jPanelParametrosReportesProcesoGeneraVacaciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosProcesoGeneraVacaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoGeneraVacaciones!=null) {
				this.jPanelPaginacionProcesoGeneraVacaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraVacaciones!=null) {
				this.jPanelParametrosReportesProcesoGeneraVacaciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosProcesoGeneraVacaciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoGeneraVacaciones!=null) {
				this.jPanelPaginacionProcesoGeneraVacaciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraVacaciones!=null) {
				this.jPanelParametrosReportesProcesoGeneraVacaciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosProcesoGeneraVacaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGeneraVacaciones!=null) {
				this.jPanelPaginacionProcesoGeneraVacaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraVacaciones!=null) {
				this.jPanelParametrosReportesProcesoGeneraVacaciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosProcesoGeneraVacaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGeneraVacaciones!=null) {
				this.jPanelPaginacionProcesoGeneraVacaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraVacaciones!=null) {
				this.jPanelParametrosReportesProcesoGeneraVacaciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosEdicionProcesoGeneraVacaciones.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosProcesoGeneraVacaciones!=null) {
				this.jScrollPanelDatosProcesoGeneraVacaciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoGeneraVacaciones!=null) {
				this.jPanelPaginacionProcesoGeneraVacaciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoGeneraVacaciones!=null) {
				this.jPanelParametrosReportesProcesoGeneraVacaciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.procesogeneravacacionesSessionBean.getEsGuardarRelacionado()) {
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
			
			this.inicializarActualizarBindingTablaProcesoGeneraVacaciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoGeneraVacaciones() {
		this.updateBorderResaltarBusquedasFormularioProcesoGeneraVacaciones();
		this.updateVisibilidadBusquedasFormularioProcesoGeneraVacaciones();
		this.updateHabilitarBusquedasFormularioProcesoGeneraVacaciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoGeneraVacaciones() {					
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoGeneraVacaciones() {
	}
	
	public void updateHabilitarBusquedasFormularioProcesoGeneraVacaciones() {
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
	
	public void updateControlesFormularioProcesoGeneraVacaciones() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoGeneraVacaciones();
		this.updateVisibilidadResaltarControlesFormularioProcesoGeneraVacaciones();
		this.updateHabilitarResaltarControlesFormularioProcesoGeneraVacaciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoGeneraVacaciones() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesogeneravacacionesConstantesFunciones.resaltaridProcesoGeneraVacaciones!=null && this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.setBorder(this.procesogeneravacacionesConstantesFunciones.resaltaridProcesoGeneraVacaciones);}
		if(this.procesogeneravacacionesConstantesFunciones.resaltarfechaProcesoGeneraVacaciones!=null && this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jDateChooserfechaProcesoGeneraVacaciones.setBorder(this.procesogeneravacacionesConstantesFunciones.resaltarfechaProcesoGeneraVacaciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoGeneraVacaciones() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
	
		//this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.setVisible(this.procesogeneravacacionesConstantesFunciones.mostraridProcesoGeneraVacaciones);
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jPanelidProcesoGeneraVacaciones.setVisible(this.procesogeneravacacionesConstantesFunciones.mostraridProcesoGeneraVacaciones);
		//this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jDateChooserfechaProcesoGeneraVacaciones.setVisible(this.procesogeneravacacionesConstantesFunciones.mostrarfechaProcesoGeneraVacaciones);
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jPanelfechaProcesoGeneraVacaciones.setVisible(this.procesogeneravacacionesConstantesFunciones.mostrarfechaProcesoGeneraVacaciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoGeneraVacaciones() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoGeneraVacaciones!=null) {
	
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jLabelidProcesoGeneraVacaciones.setEnabled(this.procesogeneravacacionesConstantesFunciones.activaridProcesoGeneraVacaciones);
		this.jInternalFrameDetalleFormProcesoGeneraVacaciones.jDateChooserfechaProcesoGeneraVacaciones.setEnabled(this.procesogeneravacacionesConstantesFunciones.activarfechaProcesoGeneraVacaciones);
		}
	}
	
		
}