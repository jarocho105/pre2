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

import com.bydan.erp.contabilidad.util.PeriodoImportExportConstantesFunciones;
import com.bydan.erp.contabilidad.util.PeriodoImportExportParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PeriodoImportExportParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PeriodoImportExportBean;
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
public class PeriodoImportExportBeanSwingJInternalFrame extends PeriodoImportExportJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PeriodoImportExportBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PeriodoImportExport> periodoimportexportValidator = new ClassValidator<PeriodoImportExport>(PeriodoImportExport.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PeriodoImportExport periodoimportexport;	
	public PeriodoImportExport periodoimportexportAux;
	public PeriodoImportExport periodoimportexportAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PeriodoImportExport periodoimportexportTotales;
	public Long idPeriodoImportExportActual;
	public Long iIdNuevoPeriodoImportExport=0L;
	public int rowIndexActual=0;
	
	
	
	
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
	
	public Boolean isPermisoTodoPeriodoImportExport;
	public Boolean isPermisoNuevoPeriodoImportExport;
	public Boolean isPermisoActualizarPeriodoImportExport;
	public Boolean isPermisoActualizarOriginalPeriodoImportExport;
	public Boolean isPermisoEliminarPeriodoImportExport;
	public Boolean isPermisoGuardarCambiosPeriodoImportExport;
	public Boolean isPermisoConsultaPeriodoImportExport;
	public Boolean isPermisoBusquedaPeriodoImportExport;
	public Boolean isPermisoReportePeriodoImportExport;
	public Boolean isPermisoPaginacionMedioPeriodoImportExport;
	public Boolean isPermisoPaginacionAltoPeriodoImportExport;
	public Boolean isPermisoPaginacionTodoPeriodoImportExport;
	public Boolean isPermisoCopiarPeriodoImportExport;
	public Boolean isPermisoVerFormPeriodoImportExport;
	public Boolean isPermisoDuplicarPeriodoImportExport;
	public Boolean isPermisoOrdenPeriodoImportExport;
	
	
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
	
	public PeriodoImportExportParameterReturnGeneral periodoimportexportReturnGeneral;
	public PeriodoImportExportParameterReturnGeneral periodoimportexportParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPeriodoImportExport=false;
	public Boolean esParaAccionDesdeFormularioPeriodoImportExport=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PeriodoImportExportSessionBeanAdditional periodoimportexportSessionBeanAdditional=null;
	
	public PeriodoImportExportSessionBeanAdditional getPeriodoImportExportSessionBeanAdditional() {
		return this.periodoimportexportSessionBeanAdditional;
	}
	
	public void setPeriodoImportExportSessionBeanAdditional(PeriodoImportExportSessionBeanAdditional periodoimportexportSessionBeanAdditional) {
		try {
			this.periodoimportexportSessionBeanAdditional=periodoimportexportSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PeriodoImportExportBeanSwingJInternalFrameAdditional periodoimportexportBeanSwingJInternalFrameAdditional=null;
	//public class PeriodoImportExportBeanSwingJInternalFrame
	
	public PeriodoImportExportBeanSwingJInternalFrameAdditional getPeriodoImportExportBeanSwingJInternalFrameAdditional() {
		return this.periodoimportexportBeanSwingJInternalFrameAdditional;
	}
	
	public void setPeriodoImportExportBeanSwingJInternalFrameAdditional(PeriodoImportExportBeanSwingJInternalFrameAdditional periodoimportexportBeanSwingJInternalFrameAdditional) {
		try {
			this.periodoimportexportBeanSwingJInternalFrameAdditional=periodoimportexportBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PeriodoImportExportLogic periodoimportexportLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PeriodoImportExport periodoimportexportBean;
	public PeriodoImportExportConstantesFunciones periodoimportexportConstantesFunciones;
	//public PeriodoImportExportParameterReturnGeneral periodoimportexportReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<PeriodoImportExport> periodoimportexports;	
	//public List<PeriodoImportExport> periodoimportexportsEliminados;
	//public List<PeriodoImportExport> periodoimportexportsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPeriodoImportExport=false;
	public Boolean isVisibilidadCeldaDuplicarPeriodoImportExport=true;
	public Boolean isVisibilidadCeldaCopiarPeriodoImportExport=true;
	public Boolean isVisibilidadCeldaVerFormPeriodoImportExport=true;
	public Boolean isVisibilidadCeldaOrdenPeriodoImportExport=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;
	public Boolean isVisibilidadCeldaModificarPeriodoImportExport=false;
	public Boolean isVisibilidadCeldaActualizarPeriodoImportExport=false;
	public Boolean isVisibilidadCeldaEliminarPeriodoImportExport=false;
	public Boolean isVisibilidadCeldaCancelarPeriodoImportExport=false;
	public Boolean isVisibilidadCeldaGuardarPeriodoImportExport=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPeriodoImportExport=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoPeriodoImportExport() {
		return this.iIdNuevoPeriodoImportExport;
	}

	public void setiIdNuevoPeriodoImportExport(Long iIdNuevoPeriodoImportExport) {
		this.iIdNuevoPeriodoImportExport = iIdNuevoPeriodoImportExport;
	}
	
	public Long getidPeriodoImportExportActual() {
		return this.idPeriodoImportExportActual;
	}

	public void setidPeriodoImportExportActual(Long idPeriodoImportExportActual) {
		this.idPeriodoImportExportActual = idPeriodoImportExportActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PeriodoImportExport getperiodoimportexport() {
		return this.periodoimportexport;
	}

	public void setperiodoimportexport(PeriodoImportExport periodoimportexport) {
		this.periodoimportexport = periodoimportexport;
	}
	
	public PeriodoImportExport getperiodoimportexportAux() {
		return this.periodoimportexportAux;
	}

	public void setperiodoimportexportAux(PeriodoImportExport periodoimportexportAux) {
		this.periodoimportexportAux = periodoimportexportAux;
	}				
	
	public PeriodoImportExport getperiodoimportexportAnterior() {
		return this.periodoimportexportAnterior;
	}

	public void setperiodoimportexportAnterior(PeriodoImportExport periodoimportexportAnterior) {
		this.periodoimportexportAnterior = periodoimportexportAnterior;
	}	
	
	public PeriodoImportExport getperiodoimportexportTotales() {
		return this.periodoimportexportTotales;
	}

	public void setperiodoimportexportTotales(PeriodoImportExport periodoimportexportTotales) {
		this.periodoimportexportTotales = periodoimportexportTotales;
	}	
	
	public PeriodoImportExport getperiodoimportexportBean() {
		return this.periodoimportexportBean;
	}

	public void setperiodoimportexportBean(PeriodoImportExport periodoimportexportBean) {
		this.periodoimportexportBean = periodoimportexportBean;
	}	
	
	public PeriodoImportExportParameterReturnGeneral getperiodoimportexportReturnGeneral() {
		return this.periodoimportexportReturnGeneral;
	}

	public void setperiodoimportexportReturnGeneral(PeriodoImportExportParameterReturnGeneral periodoimportexportReturnGeneral) {
		this.periodoimportexportReturnGeneral = periodoimportexportReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PeriodoImportExportLogic getPeriodoImportExportLogic()	{		
		return periodoimportexportLogic;
	}

	public void setPeriodoImportExportLogic(PeriodoImportExportLogic periodoimportexportLogic) {
		this.periodoimportexportLogic = periodoimportexportLogic;
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
	
	public Boolean getIsEsNuevoPeriodoImportExport() {
		return isEsNuevoPeriodoImportExport;
	}

	public void setIsEsNuevoPeriodoImportExport(Boolean isEsNuevoPeriodoImportExport) {
		this.isEsNuevoPeriodoImportExport = isEsNuevoPeriodoImportExport;
	}

	public Boolean getEsParaAccionDesdeFormularioPeriodoImportExport() {
		return esParaAccionDesdeFormularioPeriodoImportExport;
	}
	
	public void setEsParaAccionDesdeFormularioPeriodoImportExport(Boolean esParaAccionDesdeFormularioPeriodoImportExport) {
		this.esParaAccionDesdeFormularioPeriodoImportExport = esParaAccionDesdeFormularioPeriodoImportExport;
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

			anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.periodoimportexportSessionBean==null) {
				this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
			}

			if(!this.periodoimportexportSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

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
					anioLogic.getEntityWithConnection(periodoimportexportSessionBean.getlidAnioActual());
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

			mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.periodoimportexportSessionBean==null) {
				this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
			}

			if(!this.periodoimportexportSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

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
					mesLogic.getEntityWithConnection(periodoimportexportSessionBean.getlidMesActual());
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

					if(this.periodoimportexport!=null) {
						this.periodoimportexport.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
						this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioPeriodoImportExport.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
						if(this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioPeriodoImportExport!=null) {
						jComboBoxid_anioFK_IdAnioPeriodoImportExport.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioPeriodoImportExport!=null) {
							//jComboBoxid_anioFK_IdAnioPeriodoImportExport.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioPeriodoImportExport.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioPeriodoImportExport.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioPeriodoImportExportGenerico)throws Exception
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
				jComboBoxid_anioPeriodoImportExportGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioPeriodoImportExportGenerico!=null && jComboBoxid_anioPeriodoImportExportGenerico.getItemCount()>0) {
					jComboBoxid_anioPeriodoImportExportGenerico.setSelectedIndex(0);
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

					if(this.periodoimportexport!=null) {
						this.periodoimportexport.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
						this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesPeriodoImportExport.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
						if(this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesPeriodoImportExportGenerico)throws Exception
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
				jComboBoxid_mesPeriodoImportExportGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesPeriodoImportExportGenerico!=null && jComboBoxid_mesPeriodoImportExportGenerico.getItemCount()>0) {
					jComboBoxid_mesPeriodoImportExportGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(PeriodoImportExport periodoimportexport,JComboBox jComboBoxid_anioPeriodoImportExportGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioPeriodoImportExportGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioPeriodoImportExportGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				periodoimportexport.setid_anio(anioAux.getId());
				periodoimportexport.setanio_descripcion(PeriodoImportExportConstantesFunciones.getAnioDescripcion(anioAux));
				periodoimportexport.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(PeriodoImportExport periodoimportexport,JComboBox jComboBoxid_mesPeriodoImportExportGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesPeriodoImportExportGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesPeriodoImportExportGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				periodoimportexport.setid_mes(mesAux.getId());
				periodoimportexport.setmes_descripcion(PeriodoImportExportConstantesFunciones.getMesDescripcion(mesAux));
				periodoimportexport.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { 
							this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { 
					}

					if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioPeriodoImportExport.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioPeriodoImportExport.addItem(anio);
							}
						}

						if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { 
							this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { 
					}

					if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
							this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
							this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioPeriodoImportExport.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioPeriodoImportExport.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
							this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
							this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPeriodoImportExport() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PeriodoImportExportConstantesFunciones.refrescarForeignKeysDescripcionesPeriodoImportExport(this.periodoimportexportLogic.getPeriodoImportExports());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PeriodoImportExportConstantesFunciones.refrescarForeignKeysDescripcionesPeriodoImportExport(this.periodoimportexports);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//periodoimportexportLogic.setPeriodoImportExports(this.periodoimportexports);
			periodoimportexportLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PeriodoImportExportParameterReturnGeneral getPeriodoImportExportParameterGeneral() {
		return this.periodoimportexportParameterGeneral;
	}
	
	public void setPeriodoImportExportParameterGeneral(PeriodoImportExportParameterReturnGeneral periodoimportexportParameterGeneral) {
		this.periodoimportexportParameterGeneral = periodoimportexportParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPeriodoImportExport() {
		return isPermisoTodoPeriodoImportExport;
	}

	public void setIsPermisoTodoPeriodoImportExport(Boolean isPermisoTodoPeriodoImportExport) {
		this.isPermisoTodoPeriodoImportExport = isPermisoTodoPeriodoImportExport;
	}

	public Boolean getIsPermisoNuevoPeriodoImportExport() {
		return isPermisoNuevoPeriodoImportExport;
	}

	public void setIsPermisoNuevoPeriodoImportExport(Boolean isPermisoNuevoPeriodoImportExport) {
		this.isPermisoNuevoPeriodoImportExport = isPermisoNuevoPeriodoImportExport;
	}

	public Boolean getIsPermisoActualizarPeriodoImportExport() {
		return isPermisoActualizarPeriodoImportExport;
	}

	public void setIsPermisoActualizarPeriodoImportExport(Boolean isPermisoActualizarPeriodoImportExport) {
		this.isPermisoActualizarPeriodoImportExport = isPermisoActualizarPeriodoImportExport;
	}

	public Boolean getIsPermisoEliminarPeriodoImportExport() {
		return isPermisoEliminarPeriodoImportExport;
	}

	public void setIsPermisoEliminarPeriodoImportExport(Boolean isPermisoEliminarPeriodoImportExport) {
		this.isPermisoEliminarPeriodoImportExport = isPermisoEliminarPeriodoImportExport;
	}

	public Boolean getIsPermisoGuardarCambiosPeriodoImportExport() {
		return isPermisoGuardarCambiosPeriodoImportExport;
	}

	public void setIsPermisoGuardarCambiosPeriodoImportExport(Boolean isPermisoGuardarCambiosPeriodoImportExport) {
		this.isPermisoGuardarCambiosPeriodoImportExport = isPermisoGuardarCambiosPeriodoImportExport;
	}
	
	public Boolean getIsPermisoConsultaPeriodoImportExport() {
		return isPermisoConsultaPeriodoImportExport;
	}

	public void setIsPermisoConsultaPeriodoImportExport(Boolean isPermisoConsultaPeriodoImportExport) {
		this.isPermisoConsultaPeriodoImportExport = isPermisoConsultaPeriodoImportExport;
	}

	public Boolean getIsPermisoBusquedaPeriodoImportExport() {
		return isPermisoBusquedaPeriodoImportExport;
	}

	public void setIsPermisoBusquedaPeriodoImportExport(Boolean isPermisoBusquedaPeriodoImportExport) {
		this.isPermisoBusquedaPeriodoImportExport = isPermisoBusquedaPeriodoImportExport;
	}

	public Boolean getIsPermisoReportePeriodoImportExport() {
		return isPermisoReportePeriodoImportExport;
	}

	public void setIsPermisoReportePeriodoImportExport(Boolean isPermisoReportePeriodoImportExport) {
		this.isPermisoReportePeriodoImportExport = isPermisoReportePeriodoImportExport;
	}
	
	public Boolean getIsPermisoPaginacionMedioPeriodoImportExport() {
		return isPermisoPaginacionMedioPeriodoImportExport;
	}

	public void setIsPermisoPaginacionMedioPeriodoImportExport(Boolean isPermisoPaginacionMedioPeriodoImportExport) {
		this.isPermisoPaginacionMedioPeriodoImportExport = isPermisoPaginacionMedioPeriodoImportExport;
	}
	
	public Boolean getIsPermisoPaginacionTodoPeriodoImportExport() {
		return isPermisoPaginacionTodoPeriodoImportExport;
	}

	public void setIsPermisoPaginacionTodoPeriodoImportExport(Boolean isPermisoPaginacionTodoPeriodoImportExport) {
		this.isPermisoPaginacionTodoPeriodoImportExport = isPermisoPaginacionTodoPeriodoImportExport;
	}
	
	public Boolean getIsPermisoPaginacionAltoPeriodoImportExport() {
		return isPermisoPaginacionAltoPeriodoImportExport;
	}

	public void setIsPermisoPaginacionAltoPeriodoImportExport(Boolean isPermisoPaginacionAltoPeriodoImportExport) {
		this.isPermisoPaginacionAltoPeriodoImportExport = isPermisoPaginacionAltoPeriodoImportExport;
	}
	
	public Boolean getIsPermisoCopiarPeriodoImportExport() {
		return isPermisoCopiarPeriodoImportExport;
	}

	public void setIsPermisoCopiarPeriodoImportExport(Boolean isPermisoCopiarPeriodoImportExport) {
		this.isPermisoCopiarPeriodoImportExport = isPermisoCopiarPeriodoImportExport;
	}
	
	public Boolean getIsPermisoVerFormPeriodoImportExport() {
		return isPermisoVerFormPeriodoImportExport;
	}

	public void setIsPermisoVerFormPeriodoImportExport(Boolean isPermisoVerFormPeriodoImportExport) {
		this.isPermisoVerFormPeriodoImportExport = isPermisoVerFormPeriodoImportExport;
	}
	
	public Boolean getIsPermisoDuplicarPeriodoImportExport() {
		return isPermisoDuplicarPeriodoImportExport;
	}

	public void setIsPermisoDuplicarPeriodoImportExport(Boolean isPermisoDuplicarPeriodoImportExport) {
		this.isPermisoDuplicarPeriodoImportExport = isPermisoDuplicarPeriodoImportExport;
	}
	
	public Boolean getIsPermisoOrdenPeriodoImportExport() {
		return isPermisoOrdenPeriodoImportExport;
	}

	public void setIsPermisoOrdenPeriodoImportExport(Boolean isPermisoOrdenPeriodoImportExport) {
		this.isPermisoOrdenPeriodoImportExport = isPermisoOrdenPeriodoImportExport;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPeriodoImportExport() {
		return isVisibilidadCeldaNuevoPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaNuevoPeriodoImportExport(Boolean isVisibilidadCeldaNuevoPeriodoImportExport) {
		this.isVisibilidadCeldaNuevoPeriodoImportExport = isVisibilidadCeldaNuevoPeriodoImportExport;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPeriodoImportExport() {
		return isVisibilidadCeldaDuplicarPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaDuplicarPeriodoImportExport(Boolean isVisibilidadCeldaDuplicarPeriodoImportExport) {
		this.isVisibilidadCeldaDuplicarPeriodoImportExport = isVisibilidadCeldaDuplicarPeriodoImportExport;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPeriodoImportExport() {
		return isVisibilidadCeldaCopiarPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaCopiarPeriodoImportExport(Boolean isVisibilidadCeldaCopiarPeriodoImportExport) {
		this.isVisibilidadCeldaCopiarPeriodoImportExport = isVisibilidadCeldaCopiarPeriodoImportExport;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPeriodoImportExport() {
		return isVisibilidadCeldaVerFormPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaVerFormPeriodoImportExport(Boolean isVisibilidadCeldaVerFormPeriodoImportExport) {
		this.isVisibilidadCeldaVerFormPeriodoImportExport = isVisibilidadCeldaVerFormPeriodoImportExport;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPeriodoImportExport() {
		return isVisibilidadCeldaOrdenPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaOrdenPeriodoImportExport(Boolean isVisibilidadCeldaOrdenPeriodoImportExport) {
		this.isVisibilidadCeldaOrdenPeriodoImportExport = isVisibilidadCeldaOrdenPeriodoImportExport;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPeriodoImportExport() {
		return isVisibilidadCeldaNuevoRelacionesPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPeriodoImportExport(Boolean isVisibilidadCeldaNuevoRelacionesPeriodoImportExport) {
		this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport = isVisibilidadCeldaNuevoRelacionesPeriodoImportExport;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPeriodoImportExport() {
		return isVisibilidadCeldaModificarPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaModificarPeriodoImportExport(Boolean isVisibilidadCeldaModificarPeriodoImportExport) {
		this.isVisibilidadCeldaModificarPeriodoImportExport = isVisibilidadCeldaModificarPeriodoImportExport;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPeriodoImportExport() {
		return isVisibilidadCeldaActualizarPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaActualizarPeriodoImportExport(Boolean isVisibilidadCeldaActualizarPeriodoImportExport) {
		this.isVisibilidadCeldaActualizarPeriodoImportExport = isVisibilidadCeldaActualizarPeriodoImportExport;
	}

	public Boolean getIsVisibilidadCeldaEliminarPeriodoImportExport() {
		return isVisibilidadCeldaEliminarPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaEliminarPeriodoImportExport(Boolean isVisibilidadCeldaEliminarPeriodoImportExport) {
		this.isVisibilidadCeldaEliminarPeriodoImportExport = isVisibilidadCeldaEliminarPeriodoImportExport;
	}

	public Boolean getIsVisibilidadCeldaCancelarPeriodoImportExport() {
		return isVisibilidadCeldaCancelarPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaCancelarPeriodoImportExport(Boolean isVisibilidadCeldaCancelarPeriodoImportExport) {
		this.isVisibilidadCeldaCancelarPeriodoImportExport = isVisibilidadCeldaCancelarPeriodoImportExport;
	}

	public Boolean getIsVisibilidadCeldaGuardarPeriodoImportExport() {
		return isVisibilidadCeldaGuardarPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaGuardarPeriodoImportExport(Boolean isVisibilidadCeldaGuardarPeriodoImportExport) {
		this.isVisibilidadCeldaGuardarPeriodoImportExport = isVisibilidadCeldaGuardarPeriodoImportExport;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPeriodoImportExport() {
		return isVisibilidadCeldaGuardarCambiosPeriodoImportExport;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPeriodoImportExport(Boolean isVisibilidadCeldaGuardarCambiosPeriodoImportExport) {
		this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport = isVisibilidadCeldaGuardarCambiosPeriodoImportExport;
	}
		
	public PeriodoImportExportSessionBean getperiodoimportexportSessionBean() {
		return this.periodoimportexportSessionBean;
	}
	
	public void setperiodoimportexportSessionBean(PeriodoImportExportSessionBean periodoimportexportSessionBean) {
		this.periodoimportexportSessionBean=periodoimportexportSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(PeriodoImportExport periodoimportexport)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(periodoimportexport,null);
				this.setActualParaGuardarMesForeignKey(periodoimportexport,null);
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
	
	public void bugActualizarReferenciaActual(PeriodoImportExport periodoimportexport,PeriodoImportExport periodoimportexportAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPeriodoImportExport(periodoimportexport);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		periodoimportexportAux.setId(periodoimportexport.getId());
		periodoimportexportAux.setVersionRow(periodoimportexport.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPeriodoImportExport();
		
			int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.periodoimportexport,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = periodoimportexportValidator.getInvalidValues(this.periodoimportexport);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			periodoimportexportLogic.setDatosCliente(datosCliente);
			periodoimportexportLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				periodoimportexportAux=new  PeriodoImportExport();
				
				periodoimportexportAux.setIsNew(true);
				periodoimportexportAux.setIsChanged(true);
				
				periodoimportexportAux.setPeriodoImportExportOriginal(this.periodoimportexport);
				
				periodoimportexportAux.setId(this.periodoimportexport.getId());	
				periodoimportexportAux.setVersionRow(this.periodoimportexport.getVersionRow());	
				periodoimportexportAux.setcodigo(this.periodoimportexport.getcodigo());	
				periodoimportexportAux.setid_anio(this.periodoimportexport.getid_anio());	
				periodoimportexportAux.setid_mes(this.periodoimportexport.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.periodoimportexportSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(periodoimportexportAux,periodoimportexportLogic.getPeriodoImportExports());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoimportexportAux,periodoimportexports);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periodoimportexportSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoimportexportLogic.savePeriodoImportExports();//WithConnection
						//periodoimportexportLogic.getSetVersionRowPeriodoImportExports();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.periodoimportexport,periodoimportexportAux);
					
					this.refrescarForeignKeysDescripcionesPeriodoImportExport();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								periodoimportexportLogic.savePeriodoImportExportRelaciones(periodoimportexportAux);//WithConnection
								//periodoimportexportLogic.getSetVersionRowPeriodoImportExports();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.periodoimportexport,periodoimportexportAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones() 
									|| this.periodoimportexportSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(periodoimportexportAux,periodoimportexportLogic.getPeriodoImportExports());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(periodoimportexportAux,periodoimportexports);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.periodoimportexport,periodoimportexportAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				periodoimportexportAux=new  PeriodoImportExport();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado() 
					|| (this.periodoimportexportSessionBean.getEsGuardarRelacionado() && this.periodoimportexport.getId()>=0)) {
						
					periodoimportexportAux.setIsNew(false);
				}
				
				periodoimportexportAux.setIsDeleted(false);
			
				periodoimportexportAux.setId(this.periodoimportexport.getId());	
				periodoimportexportAux.setVersionRow(this.periodoimportexport.getVersionRow());	
				periodoimportexportAux.setcodigo(this.periodoimportexport.getcodigo());	
				periodoimportexportAux.setid_anio(this.periodoimportexport.getid_anio());	
				periodoimportexportAux.setid_mes(this.periodoimportexport.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(periodoimportexportAux,periodoimportexportLogic.getPeriodoImportExports());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoimportexportAux,periodoimportexports);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periodoimportexportSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoimportexportLogic.savePeriodoImportExports();//WithConnection
						//periodoimportexportLogic.getSetVersionRowPeriodoImportExports();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.periodoimportexport,periodoimportexportAux);
					
					this.refrescarForeignKeysDescripcionesPeriodoImportExport();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								periodoimportexportLogic.savePeriodoImportExportRelaciones(periodoimportexportAux);//WithConnection
								//periodoimportexportLogic.getSetVersionRowPeriodoImportExports();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.periodoimportexport,periodoimportexportAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones() 
									|| this.periodoimportexportSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(periodoimportexportAux,periodoimportexportLogic.getPeriodoImportExports());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(periodoimportexportAux,periodoimportexports);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.periodoimportexport,periodoimportexportAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				periodoimportexportAux=new  PeriodoImportExport();
				
				periodoimportexportAux.setIsNew(false);
				periodoimportexportAux.setIsChanged(false);
				
				periodoimportexportAux.setIsDeleted(true);
				
				periodoimportexportAux.setId(this.periodoimportexport.getId());	
				periodoimportexportAux.setVersionRow(this.periodoimportexport.getVersionRow());	
				periodoimportexportAux.setcodigo(this.periodoimportexport.getcodigo());	
				periodoimportexportAux.setid_anio(this.periodoimportexport.getid_anio());	
				periodoimportexportAux.setid_mes(this.periodoimportexport.getid_mes());	
				
				if(this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.periodoimportexportAux.getId()>=0) {	
						this.periodoimportexportsEliminados.add(periodoimportexportAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(periodoimportexportAux,periodoimportexportLogic.getPeriodoImportExports());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoimportexportAux,periodoimportexports);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periodoimportexportSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoimportexportLogic.savePeriodoImportExports();//WithConnection
						//periodoimportexportLogic.getSetVersionRowPeriodoImportExports();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								periodoimportexportLogic.savePeriodoImportExportRelaciones(periodoimportexportAux);//WithConnection
								//periodoimportexportLogic.getSetVersionRowPeriodoImportExports();//WithConnection
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
							if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones() 
								|| this.periodoimportexportSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(periodoimportexportAux,periodoimportexportLogic.getPeriodoImportExports());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(periodoimportexportAux,periodoimportexports);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.getPeriodoImportExports().addAll(this.periodoimportexportsEliminados);
					
					periodoimportexportLogic.savePeriodoImportExports();//WithConnection
					//periodoimportexportLogic.getSetVersionRowPeriodoImportExports();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPeriodoImportExport();
				
				this.periodoimportexportsEliminados= new ArrayList<PeriodoImportExport>();		
			}
			
			if(this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Periodo Importar Exportar GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.periodoimportexport=periodoimportexportAux;
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
      		//this.finishProcessPeriodoImportExport();
      	}
		
	}	
	
	public void actualizarRelaciones(PeriodoImportExport periodoimportexportLocal) throws Exception {
		
		if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PeriodoImportExport periodoimportexportLocal) throws Exception {	
		if(this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				periodoimportexportLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				periodoimportexportLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPeriodoImportExportActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = periodoimportexportValidator.getInvalidValues(this.periodoimportexport);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PeriodoImportExport periodoimportexport,List<PeriodoImportExport> periodoimportexports) throws Exception {
		try	{		
			PeriodoImportExportConstantesFunciones.actualizarLista(periodoimportexport,periodoimportexports,this.periodoimportexportSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PeriodoImportExport periodoimportexport,List<PeriodoImportExport> periodoimportexports) throws Exception {
		try	{			
			PeriodoImportExportConstantesFunciones.actualizarSelectedLista(periodoimportexport,periodoimportexports);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PeriodoImportExport> periodoimportexportsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				periodoimportexportsLocal=this.periodoimportexportLogic.getPeriodoImportExports();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				periodoimportexportsLocal=this.periodoimportexports;
			}
			//ARCHITECTURE
		
			for(PeriodoImportExport periodoimportexportLocal:periodoimportexportsLocal) {
				if(this.permiteMantenimiento(periodoimportexportLocal) && periodoimportexportLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PeriodoImportExportConstantesFunciones.getPeriodoImportExportLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PeriodoImportExportConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoImportExport.jLabelcodigoPeriodoImportExport,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoImportExportConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoImportExport.jLabelid_anioPeriodoImportExport,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoImportExportConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoImportExport.jLabelid_mesPeriodoImportExport,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoImportExport.jLabelcodigoPeriodoImportExport,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoImportExport.jLabelid_anioPeriodoImportExport,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoImportExport.jLabelid_mesPeriodoImportExport,"");
		
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
		this.iIdNuevoPeriodoImportExport--;	
		
		
		this.periodoimportexportAux=new PeriodoImportExport();
		
		this.periodoimportexportAux.setId(this.iIdNuevoPeriodoImportExport);
		this.periodoimportexportAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.periodoimportexportLogic.getPeriodoImportExports().add(this.periodoimportexportAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.periodoimportexports.add(this.periodoimportexportAux);
		}
		//ARCHITECTURE
		
		this.periodoimportexport=this.periodoimportexportAux;
		
		if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPeriodoImportExport(this.periodoimportexport);
			this.setVariablesObjetoActualToFormularioForeignKeyPeriodoImportExport(this.periodoimportexport);
		}
				
		//this.setDefaultControlesPeriodoImportExport();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPeriodoImportExport();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPeriodoImportExport();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodoImportExport();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPeriodoImportExport(this.periodoimportexportBean,this.periodoimportexport,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PeriodoImportExportConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {
			classes=PeriodoImportExportConstantesFunciones.getClassesRelationshipsOfPeriodoImportExport(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.periodoimportexportReturnGeneral=periodoimportexportLogic.procesarEventosPeriodoImportExportsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periodoimportexportLogic.getPeriodoImportExports(),this.periodoimportexport,this.periodoimportexportParameterGeneral,this.isEsNuevoPeriodoImportExport,classes);//this.periodoimportexportLogic.getPeriodoImportExport()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPeriodoImportExport(this.periodoimportexportReturnGeneral,this.periodoimportexportBean,false);
		
		if(this.periodoimportexportReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPeriodoImportExport(this.periodoimportexportReturnGeneral.getPeriodoImportExport());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPeriodoImportExport(this.periodoimportexportReturnGeneral.getPeriodoImportExport());
		}
		
		if(this.periodoimportexportReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPeriodoImportExport(this.periodoimportexportReturnGeneral.getPeriodoImportExport(),classes);//this.periodoimportexportBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.periodoimportexport,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPeriodoImportExport();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPeriodoImportExport();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.RecargarFormPeriodoImportExport(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPeriodoImportExport(false);
						
			if(periodoimportexportSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodoImportExport();
			}
			
			this.actualizarVisualTableDatosPeriodoImportExport();
			
			this.jTableDatosPeriodoImportExport.setRowSelectionInterval(this.getIndiceNuevoPeriodoImportExport(), this.getIndiceNuevoPeriodoImportExport());
			
			this.seleccionarFilaTablaPeriodoImportExportActual();
						
			this.actualizarEstadoCeldasBotonesPeriodoImportExport("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPeriodoImportExport(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldcodigoPeriodoImportExport.setEnabled(isHabilitar && this.periodoimportexportConstantesFunciones.activarcodigoPeriodoImportExport);	
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.setEnabled(isHabilitar && this.periodoimportexportConstantesFunciones.activarid_anioPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.setEnabled(isHabilitar && this.periodoimportexportConstantesFunciones.activarid_mesPeriodoImportExport);
	};
	
	public void setDefaultControlesPeriodoImportExport() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPeriodoImportExport(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.periodoimportexportSessionBean.setConGuardarRelaciones(true);			
			this.periodoimportexportSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPeriodoImportExport.jTabbedPaneRelacionesPeriodoImportExport.setVisible(true);
			
					
		} else {
			//this.periodoimportexportSessionBean.setConGuardarRelaciones(false);			
			this.periodoimportexportSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPeriodoImportExport.jTabbedPaneRelacionesPeriodoImportExport.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPeriodoImportExport() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoImportExport periodoimportexportAux:this.periodoimportexportLogic.getPeriodoImportExports()) {
				if(periodoimportexportAux.getId().equals(this.iIdNuevoPeriodoImportExport)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoImportExport periodoimportexportAux:this.periodoimportexports) {
				if(periodoimportexportAux.getId().equals(this.iIdNuevoPeriodoImportExport)) {
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
	
	public int getIndiceActualPeriodoImportExport(PeriodoImportExport periodoimportexport,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoImportExport periodoimportexportAux:this.periodoimportexportLogic.getPeriodoImportExports()) {
				if(periodoimportexportAux.getId().equals(periodoimportexport.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoImportExport periodoimportexportAux:this.periodoimportexports) {
				if(periodoimportexportAux.getId().equals(periodoimportexport.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPeriodoImportExport(PeriodoImportExport periodoimportexportOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoImportExport periodoimportexportAux:this.periodoimportexportLogic.getPeriodoImportExports()) {
				if(periodoimportexportAux.getPeriodoImportExportOriginal().getId().equals(periodoimportexportOriginal.getId())) {
					existe=true;
					periodoimportexportOriginal.setId(periodoimportexportAux.getId());
					periodoimportexportOriginal.setVersionRow(periodoimportexportAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoImportExport periodoimportexportAux:this.periodoimportexports) {
				if(periodoimportexportAux.getPeriodoImportExportOriginal().getId().equals(periodoimportexportOriginal.getId())) {
					existe=true;
					periodoimportexportOriginal.setId(periodoimportexportAux.getId());
					periodoimportexportOriginal.setVersionRow(periodoimportexportAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPeriodoImportExport(Boolean esParaCancelar) throws Exception {
		periodoimportexportsAux=new ArrayList<PeriodoImportExport>();
		periodoimportexportAux=new PeriodoImportExport();
		
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PeriodoImportExport periodoimportexportAux:this.periodoimportexportLogic.getPeriodoImportExports()) {
					if(periodoimportexportAux.getId()<0) {
						periodoimportexportsAux.add(periodoimportexportAux);
					}		
				}
				this.iIdNuevoPeriodoImportExport=0L;
				this.periodoimportexportLogic.getPeriodoImportExports().removeAll(periodoimportexportsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoImportExport periodoimportexportAux:this.periodoimportexports) {
					if(periodoimportexportAux.getId()<0) {
						periodoimportexportsAux.add(periodoimportexportAux);
					}		
				}
				this.iIdNuevoPeriodoImportExport=0L;
				this.periodoimportexports.removeAll(periodoimportexportsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPeriodoImportExport 
					&& this.periodoimportexportLogic.getPeriodoImportExports().size()>0
					) {
					periodoimportexportAux=this.periodoimportexportLogic.getPeriodoImportExports().get(this.periodoimportexportLogic.getPeriodoImportExports().size() - 1);
				
					if(periodoimportexportAux.getId()<0) {
						this.periodoimportexportLogic.getPeriodoImportExports().remove(periodoimportexportAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPeriodoImportExport && this.periodoimportexports.size()>0) {
					periodoimportexportAux=this.periodoimportexports.get(this.periodoimportexports.size() - 1);
				
					if(periodoimportexportAux.getId()<0) {
						this.periodoimportexports.remove(periodoimportexportAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPeriodoImportExport(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(periodoimportexport.getId()<0) {
				this.periodoimportexportLogic.getPeriodoImportExports().remove(this.periodoimportexport);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(periodoimportexport.getId()<0) {
				this.periodoimportexports.remove(this.periodoimportexport);
			}
		}			
	}
	
	public void setEstadosInicialesPeriodoImportExport(List<PeriodoImportExport> periodoimportexportsAux) throws Exception {
		PeriodoImportExportConstantesFunciones.setEstadosInicialesPeriodoImportExport(periodoimportexportsAux);
	}
	
	public void setEstadosInicialesPeriodoImportExport(PeriodoImportExport periodoimportexportAux) throws Exception {
		PeriodoImportExportConstantesFunciones.setEstadosInicialesPeriodoImportExport(periodoimportexportAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPeriodoImportExportActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPeriodoImportExport("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPeriodoImportExportActual()) {
				if(!this.isEsNuevoPeriodoImportExport) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPeriodoImportExport("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPeriodoImportExport=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPeriodoImportExportActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Periodo Importar Exportar ?", "MANTENIMIENTO DE Periodo Importar Exportar", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPeriodoImportExport("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PeriodoImportExport periodoimportexport) throws Exception {
		PeriodoImportExportConstantesFunciones.seleccionarAsignar(this.periodoimportexport,periodoimportexport);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPeriodoImportExport=this.isPermisoActualizarOriginalPeriodoImportExport;
			
			
			this.seleccionarAsignar(periodoimportexport);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PeriodoImportExportConstantesFunciones.quitarEspaciosPeriodoImportExport(this.periodoimportexport,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPeriodoImportExport("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.periodoimportexportSessionBean.setsFuncionBusquedaRapida(this.periodoimportexportSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPeriodoImportExport) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPeriodoImportExport(esParaCancelar);				
				this.cancelarNuevoPeriodoImportExport(esParaCancelar);								
			}
			
			this.periodoimportexport=new PeriodoImportExport();
			
			this.inicializarPeriodoImportExport();
			
			this.actualizarEstadoCeldasBotonesPeriodoImportExport("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPeriodoImportExport() throws Exception {
		try {
			PeriodoImportExportConstantesFunciones.inicializarPeriodoImportExport(this.periodoimportexport);
			
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
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.periodoimportexportLogic.getPeriodoImportExports().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePeriodoImportExports(String sAccionBusqueda,List<PeriodoImportExport> periodoimportexportsParaReportes) throws Exception {
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
					sPathReporteFinal="PeriodoImportExport"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PeriodoImportExportMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PeriodoImportExportMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PeriodoImportExport"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Periodo Importar Exportars");		
		parameters.put("busquedapor", PeriodoImportExportConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePeriodoImportExport=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PeriodoImportExportConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PeriodoImportExportConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePeriodoImportExport=new JRBeanArrayDataSource(PeriodoImportExportJInternalFrame.TraerPeriodoImportExportBeans(periodoimportexportsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePeriodoImportExport);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PeriodoImportExportConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PeriodoImportExportConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PeriodoImportExportBean.TraerPeriodoImportExportBeans(periodoimportexportsParaReportes).toArray()));
							
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
				this.generarExcelReportePeriodoImportExports(sAccionBusqueda,sTipoArchivoReporte,periodoimportexportsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPeriodoImportExports(sAccionBusqueda,sTipoArchivoReporte,periodoimportexportsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPeriodoImportExportActionPerformed(null);
					//this.generarExcelReportePeriodoImportExports(sAccionBusqueda,sTipoArchivoReporte,periodoimportexportsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPeriodoImportExports(sAccionBusqueda,sTipoArchivoReporte,periodoimportexportsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPeriodoImportExports(sAccionBusqueda,sTipoArchivoReporte,periodoimportexportsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPeriodoImportExports(sAccionBusqueda,sTipoArchivoReporte,periodoimportexportsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePeriodoImportExports(String sAccionBusqueda,String sTipoArchivoReporte,List<PeriodoImportExport> periodoimportexportsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoimportexport";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PeriodoImportExports");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPeriodoImportExport("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PeriodoImportExport periodoimportexport : periodoimportexportsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PeriodoImportExportConstantesFunciones.generarExcelReporteDataPeriodoImportExport("NORMAL",row,workbook,periodoimportexport,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPeriodoImportExport(String sTipo,Row row,Workbook workbook) {
		
		PeriodoImportExportConstantesFunciones.generarExcelReporteHeaderPeriodoImportExport(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPeriodoImportExports(String sAccionBusqueda,String sTipoArchivoReporte,List<PeriodoImportExport> periodoimportexportsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoimportexport_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PeriodoImportExports");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PeriodoImportExport periodoimportexport : periodoimportexportsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PeriodoImportExportConstantesFunciones.getPeriodoImportExportDescripcion(periodoimportexport));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoImportExportConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodoimportexport.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoImportExportConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodoimportexport.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoImportExportConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodoimportexport.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPeriodoImportExports(String sAccionBusqueda,String sTipoArchivoReporte,List<PeriodoImportExport> periodoimportexportsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PeriodoImportExport> periodoimportexportsRespaldo=null;
		
		classes=PeriodoImportExportConstantesFunciones.getClassesRelationshipsOfPeriodoImportExport(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.periodoimportexportLogic.setDatosCliente(this.datosCliente);
		this.periodoimportexportLogic.setDatosDeep(this.datosDeep);
		this.periodoimportexportLogic.setIsConDeep(true);
		
		periodoimportexportsRespaldo=this.periodoimportexportLogic.getPeriodoImportExports();
		
		this.periodoimportexportLogic.setPeriodoImportExports(periodoimportexportsParaReportes);	
		this.periodoimportexportLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		periodoimportexportsParaReportes=this.periodoimportexportLogic.getPeriodoImportExports();
		this.periodoimportexportLogic.setPeriodoImportExports(periodoimportexportsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoimportexport_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PeriodoImportExports");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPeriodoImportExport("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PeriodoImportExport periodoimportexport : periodoimportexportsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPeriodoImportExport("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PeriodoImportExportConstantesFunciones.generarExcelReporteDataPeriodoImportExport("NORMAL",row,workbook,periodoimportexport,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PeriodoImportExportConstantesFunciones.getPeriodoImportExportDescripcion(periodoimportexport));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPeriodoImportExport() throws Exception {		
		this.startProcessPeriodoImportExport(true);
	}
	
	public void startProcessPeriodoImportExport(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPeriodoImportExport ,this.jPanelParametrosReportesPeriodoImportExport, this.jScrollPanelDatosPeriodoImportExport,this.jPanelPaginacionPeriodoImportExport, this.jScrollPanelDatosEdicionPeriodoImportExport, this.jPanelAccionesPeriodoImportExport,this.jPanelAccionesFormularioPeriodoImportExport,this.jmenuBarPeriodoImportExport,this.jmenuBarDetallePeriodoImportExport,this.jTtoolBarPeriodoImportExport,this.jTtoolBarDetallePeriodoImportExport);		
		
		final JTabbedPane jTabbedPaneBusquedasPeriodoImportExport=this.jTabbedPaneBusquedasPeriodoImportExport; 
		
		final JPanel jPanelParametrosReportesPeriodoImportExport=this.jPanelParametrosReportesPeriodoImportExport;
		//final JScrollPane jScrollPanelDatosPeriodoImportExport=this.jScrollPanelDatosPeriodoImportExport;
		final JTable jTableDatosPeriodoImportExport=this.jTableDatosPeriodoImportExport;		
		final JPanel jPanelPaginacionPeriodoImportExport=this.jPanelPaginacionPeriodoImportExport;
		//final JScrollPane jScrollPanelDatosEdicionPeriodoImportExport=this.jScrollPanelDatosEdicionPeriodoImportExport;
		final JPanel jPanelAccionesPeriodoImportExport=this.jPanelAccionesPeriodoImportExport;
		
		JPanel jPanelCamposAuxiliarPeriodoImportExport=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPeriodoImportExport=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			jPanelCamposAuxiliarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jPanelCamposPeriodoImportExport;
			jPanelAccionesFormularioAuxiliarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jPanelAccionesFormularioPeriodoImportExport;
		}
		
		final JPanel jPanelCamposPeriodoImportExport=jPanelCamposAuxiliarPeriodoImportExport;
		final JPanel jPanelAccionesFormularioPeriodoImportExport=jPanelAccionesFormularioAuxiliarPeriodoImportExport;
		
		
		final JMenuBar jmenuBarPeriodoImportExport=this.jmenuBarPeriodoImportExport;
		final JToolBar jTtoolBarPeriodoImportExport=this.jTtoolBarPeriodoImportExport;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPeriodoImportExport=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPeriodoImportExport=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			jmenuBarDetalleAuxiliarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jmenuBarDetallePeriodoImportExport;
			jTtoolBarDetalleAuxiliarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jTtoolBarDetallePeriodoImportExport;
		}
		
		final JMenuBar jmenuBarDetallePeriodoImportExport=jmenuBarDetalleAuxiliarPeriodoImportExport;
		final JToolBar jTtoolBarDetallePeriodoImportExport=jTtoolBarDetalleAuxiliarPeriodoImportExport;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPeriodoImportExport;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPeriodoImportExport;
			processRunnable.jTableDatos=jTableDatosPeriodoImportExport;
			processRunnable.jPanelCampos=jPanelCamposPeriodoImportExport;
			processRunnable.jPanelPaginacion=jPanelPaginacionPeriodoImportExport;
			processRunnable.jPanelAcciones=jPanelAccionesPeriodoImportExport;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPeriodoImportExport;
			
			
			processRunnable.jmenuBar=jmenuBarPeriodoImportExport;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePeriodoImportExport;
			processRunnable.jTtoolBar=jTtoolBarPeriodoImportExport;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePeriodoImportExport;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPeriodoImportExport ,jPanelParametrosReportesPeriodoImportExport,jTableDatosPeriodoImportExport, /*jScrollPanelDatosPeriodoImportExport,*/jPanelCamposPeriodoImportExport,jPanelPaginacionPeriodoImportExport, /*jScrollPanelDatosEdicionPeriodoImportExport,*/ jPanelAccionesPeriodoImportExport,jPanelAccionesFormularioPeriodoImportExport,jmenuBarPeriodoImportExport,jmenuBarDetallePeriodoImportExport,jTtoolBarPeriodoImportExport,jTtoolBarDetallePeriodoImportExport);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPeriodoImportExport ,jPanelParametrosReportesPeriodoImportExport, jScrollPanelDatosPeriodoImportExport,jPanelPaginacionPeriodoImportExport, jScrollPanelDatosEdicionPeriodoImportExport, jPanelAccionesPeriodoImportExport,jPanelAccionesFormularioPeriodoImportExport,jmenuBarPeriodoImportExport,jmenuBarDetallePeriodoImportExport,jTtoolBarPeriodoImportExport,jTtoolBarDetallePeriodoImportExport);
						
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
	
	public void finishProcessPeriodoImportExport() {// throws Exception 
		this.finishProcessPeriodoImportExport(true);
	}
	
	public void finishProcessPeriodoImportExport(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPeriodoImportExport ,this.jPanelParametrosReportesPeriodoImportExport, this.jScrollPanelDatosPeriodoImportExport,this.jPanelPaginacionPeriodoImportExport, this.jScrollPanelDatosEdicionPeriodoImportExport, this.jPanelAccionesPeriodoImportExport,this.jPanelAccionesFormularioPeriodoImportExport,this.jmenuBarPeriodoImportExport,this.jmenuBarDetallePeriodoImportExport,this.jTtoolBarPeriodoImportExport,this.jTtoolBarDetallePeriodoImportExport);		
		
		final JTabbedPane jTabbedPaneBusquedasPeriodoImportExport=this.jTabbedPaneBusquedasPeriodoImportExport; 
		
		final JPanel jPanelParametrosReportesPeriodoImportExport=this.jPanelParametrosReportesPeriodoImportExport;
		//final JScrollPane jScrollPanelDatosPeriodoImportExport=this.jScrollPanelDatosPeriodoImportExport;
		final JTable jTableDatosPeriodoImportExport=this.jTableDatosPeriodoImportExport;		
		final JPanel jPanelPaginacionPeriodoImportExport=this.jPanelPaginacionPeriodoImportExport;
		//final JScrollPane jScrollPanelDatosEdicionPeriodoImportExport=this.jScrollPanelDatosEdicionPeriodoImportExport;
		final JPanel jPanelAccionesPeriodoImportExport=this.jPanelAccionesPeriodoImportExport;
		
		JPanel jPanelCamposAuxiliarPeriodoImportExport=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPeriodoImportExport=new JPanel();
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			jPanelCamposAuxiliarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jPanelCamposPeriodoImportExport;
			jPanelAccionesFormularioAuxiliarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jPanelAccionesFormularioPeriodoImportExport;
		}
		
		final JPanel jPanelCamposPeriodoImportExport=jPanelCamposAuxiliarPeriodoImportExport;
		final JPanel jPanelAccionesFormularioPeriodoImportExport=jPanelAccionesFormularioAuxiliarPeriodoImportExport;
		
		
		final JMenuBar jmenuBarPeriodoImportExport=this.jmenuBarPeriodoImportExport;		
		final JToolBar jTtoolBarPeriodoImportExport=this.jTtoolBarPeriodoImportExport;
				
		JMenuBar jmenuBarDetalleAuxiliarPeriodoImportExport=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPeriodoImportExport=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			jmenuBarDetalleAuxiliarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jmenuBarDetallePeriodoImportExport;
			jTtoolBarDetalleAuxiliarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jTtoolBarDetallePeriodoImportExport;		
		}
		
		final JMenuBar jmenuBarDetallePeriodoImportExport=jmenuBarDetalleAuxiliarPeriodoImportExport;
		final JToolBar jTtoolBarDetallePeriodoImportExport=jTtoolBarDetalleAuxiliarPeriodoImportExport;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPeriodoImportExport;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPeriodoImportExport;
			processRunnable.jTableDatos=jTableDatosPeriodoImportExport;
			processRunnable.jPanelCampos=jPanelCamposPeriodoImportExport;
			processRunnable.jPanelPaginacion=jPanelPaginacionPeriodoImportExport;
			processRunnable.jPanelAcciones=jPanelAccionesPeriodoImportExport;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPeriodoImportExport;
			
			
			processRunnable.jmenuBar=jmenuBarPeriodoImportExport;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePeriodoImportExport;
			processRunnable.jTtoolBar=jTtoolBarPeriodoImportExport;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePeriodoImportExport;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPeriodoImportExport ,jPanelParametrosReportesPeriodoImportExport, jTableDatosPeriodoImportExport,/*jScrollPanelDatosPeriodoImportExport,*/jPanelCamposPeriodoImportExport,jPanelPaginacionPeriodoImportExport, /*jScrollPanelDatosEdicionPeriodoImportExport,*/ jPanelAccionesPeriodoImportExport,jPanelAccionesFormularioPeriodoImportExport,jmenuBarPeriodoImportExport,jmenuBarDetallePeriodoImportExport,jTtoolBarPeriodoImportExport,jTtoolBarDetallePeriodoImportExport));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPeriodoImportExport(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPeriodoImportExport(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPeriodoImportExport(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPeriodoImportExport(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPeriodoImportExport,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePeriodoImportExport,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPeriodoImportExport(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPeriodoImportExport,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePeriodoImportExport,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.periodoimportexportConstantesFunciones.getsFinalQueryPeriodoImportExport();
		String  finalQueryPaginacionTodos=this.periodoimportexportConstantesFunciones.getsFinalQueryPeriodoImportExport();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PeriodoImportExportConstantesFunciones.getArrayColumnasGlobalesNoPeriodoImportExport(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PeriodoImportExportConstantesFunciones.getArrayColumnasGlobalesPeriodoImportExport(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PeriodoImportExportConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.periodoimportexportsEliminados= new ArrayList<PeriodoImportExport>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPeriodoImportExport();
		
				///*PeriodoImportExportSessionBean*/this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
			
			if(this.periodoimportexportSessionBean==null) {
				this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
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
					this.iNumeroPaginacion=PeriodoImportExportConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PeriodoImportExportConstantesFunciones.getClassesForeignKeysOfPeriodoImportExport(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/periodoimportexport."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			periodoimportexportsAux= new ArrayList<PeriodoImportExport>();
			
				
			periodoimportexportLogic.setDatosCliente(this.datosCliente);
			periodoimportexportLogic.setDatosDeep(this.datosDeep);
			periodoimportexportLogic.setIsConDeep(true);
			
			
			periodoimportexportLogic.getPeriodoImportExportDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					periodoimportexportLogic.getTodosPeriodoImportExports(finalQueryGlobal,pagination);
					
					//periodoimportexportLogic.getTodosPeriodoImportExportsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(periodoimportexportLogic.getPeriodoImportExports()==null|| periodoimportexportLogic.getPeriodoImportExports().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periodoimportexportsAux= new ArrayList<PeriodoImportExport>();
							periodoimportexportsAux.addAll(periodoimportexportLogic.getPeriodoImportExports());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoimportexportsAux= new ArrayList<PeriodoImportExport>();
							periodoimportexportsAux.addAll(periodoimportexports);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periodoimportexportLogic.getTodosPeriodoImportExports(finalQueryGlobal+"",this.pagination);												
							
							//periodoimportexportLogic.getTodosPeriodoImportExportsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePeriodoImportExports("Todos",periodoimportexportLogic.getPeriodoImportExports() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periodoimportexportLogic.setPeriodoImportExports(new ArrayList<PeriodoImportExport>());					
							periodoimportexportLogic.getPeriodoImportExports().addAll(periodoimportexportsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoimportexports=new ArrayList<PeriodoImportExport>();
							periodoimportexports.addAll(periodoimportexportsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPeriodoImportExport=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPeriodoImportExport=this.idActual;
				
				} else if(this.idPeriodoImportExportActual!=null && this.idPeriodoImportExportActual!=0L) {
					idPeriodoImportExport=idPeriodoImportExportActual;
				}
				
					
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndicePorId(idPeriodoImportExport);
				
				this.periodoimportexports=new ArrayList<PeriodoImportExport>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					periodoimportexportLogic.getEntity(idPeriodoImportExport);
					
					//periodoimportexportLogic.getEntityWithConnection(idPeriodoImportExport);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoimportexportLogic.setPeriodoImportExports(new ArrayList<PeriodoImportExport>());
					periodoimportexportLogic.getPeriodoImportExports().add(periodoimportexportLogic.getPeriodoImportExport());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodoimportexports=new ArrayList<PeriodoImportExport>();
					this.periodoimportexports.add(periodoimportexport);
				}
				
				if(periodoimportexportLogic.getPeriodoImportExport()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periodoimportexportLogic.getPeriodoImportExportsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periodoimportexportLogic.getPeriodoImportExports()==null||periodoimportexportLogic.getPeriodoImportExports().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periodoimportexports==null|| periodoimportexports.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoimportexportsAux=new ArrayList<PeriodoImportExport>();
						periodoimportexportsAux.addAll(periodoimportexportLogic.getPeriodoImportExports());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoimportexportsAux=new ArrayList<PeriodoImportExport>();
							periodoimportexportsAux.addAll(periodoimportexports);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periodoimportexportLogic.getPeriodoImportExportsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodoImportExports("BusquedaPorCodigo",periodoimportexportLogic.getPeriodoImportExports());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodoImportExports("BusquedaPorCodigo",periodoimportexports);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoimportexportLogic.setPeriodoImportExports(new ArrayList<PeriodoImportExport>());
						periodoimportexportLogic.getPeriodoImportExports().addAll(periodoimportexportsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoimportexports=new ArrayList<PeriodoImportExport>();
							periodoimportexports.addAll(periodoimportexportsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periodoimportexportLogic.getPeriodoImportExportsFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periodoimportexportLogic.getPeriodoImportExports()==null||periodoimportexportLogic.getPeriodoImportExports().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periodoimportexports==null|| periodoimportexports.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoimportexportsAux=new ArrayList<PeriodoImportExport>();
						periodoimportexportsAux.addAll(periodoimportexportLogic.getPeriodoImportExports());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoimportexportsAux=new ArrayList<PeriodoImportExport>();
							periodoimportexportsAux.addAll(periodoimportexports);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periodoimportexportLogic.getPeriodoImportExportsFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoImportExportConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodoImportExports("FK_IdAnio",periodoimportexportLogic.getPeriodoImportExports());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodoImportExports("FK_IdAnio",periodoimportexports);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoimportexportLogic.setPeriodoImportExports(new ArrayList<PeriodoImportExport>());
						periodoimportexportLogic.getPeriodoImportExports().addAll(periodoimportexportsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoimportexports=new ArrayList<PeriodoImportExport>();
							periodoimportexports.addAll(periodoimportexportsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPeriodoImportExport();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPeriodoImportExport();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=periodoimportexportLogic.getPeriodoImportExports().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periodoimportexports.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=periodoimportexportLogic.getPeriodoImportExports().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periodoimportexports.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PeriodoImportExport periodoimportexport) {
		Boolean permite=true;
		
		if(this.periodoimportexport.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PeriodoImportExportConstantesFunciones.getOrderByListaPeriodoImportExport();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PeriodoImportExportConstantesFunciones.getOrderByListaPeriodoImportExport();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoImportExport periodoimportexport:periodoimportexportLogic.getPeriodoImportExports()) {
				if(periodoimportexport.getsType().equals(Constantes2.S_TOTALES)) {
					periodoimportexportTotales=periodoimportexport;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoImportExport periodoimportexport:this.periodoimportexports) {
				if(periodoimportexport.getsType().equals(Constantes2.S_TOTALES)) {
					periodoimportexportTotales=periodoimportexport;
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
			this.periodoimportexportAux=new PeriodoImportExport();
			this.periodoimportexportAux.setsType(Constantes2.S_TOTALES);
			this.periodoimportexportAux.setIsNew(false);
			this.periodoimportexportAux.setIsChanged(false);
			this.periodoimportexportAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PeriodoImportExportConstantesFunciones.TotalizarValoresFilaPeriodoImportExport(this.periodoimportexportLogic.getPeriodoImportExports(),this.periodoimportexportAux);
				
				this.periodoimportexportLogic.getPeriodoImportExports().add(this.periodoimportexportAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PeriodoImportExportConstantesFunciones.TotalizarValoresFilaPeriodoImportExport(this.periodoimportexports,this.periodoimportexportAux);
				
				this.periodoimportexports.add(this.periodoimportexportAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		periodoimportexportTotales=new PeriodoImportExport();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.periodoimportexportLogic.getPeriodoImportExports().remove(periodoimportexportTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.periodoimportexports.remove(periodoimportexportTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		periodoimportexportTotales=new PeriodoImportExport();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoImportExport periodoimportexport:periodoimportexportLogic.getPeriodoImportExports()) {
				if(periodoimportexport.getsType().equals(Constantes2.S_TOTALES)) {
					periodoimportexportTotales=periodoimportexport;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PeriodoImportExportConstantesFunciones.TotalizarValoresFilaPeriodoImportExport(this.periodoimportexportLogic.getPeriodoImportExports(),periodoimportexportTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoImportExport periodoimportexport:this.periodoimportexports) {
				if(periodoimportexport.getsType().equals(Constantes2.S_TOTALES)) {
					periodoimportexportTotales=periodoimportexport;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PeriodoImportExportConstantesFunciones.TotalizarValoresFilaPeriodoImportExport(this.periodoimportexports,periodoimportexportTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPeriodoImportExportsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodoImportExportsFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodoImportExportsFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodoImportExportPorIdAnioPorIdMes()throws Exception {
		try {
			sAccionBusqueda="PorIdAnioPorIdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getPeriodoImportExportsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoimportexportLogic.getPeriodoImportExportsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodoImportExportsFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoimportexportLogic.getPeriodoImportExportsFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodoImportExportsFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoimportexportLogic.getPeriodoImportExportsFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodoImportExportPorIdAnioPorIdMes(Long id_anio,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoimportexportLogic.getPeriodoImportExportPorIdAnioPorIdMes(id_anio,id_mes);
				
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
	
	public void inicializarPermisosPeriodoImportExport() {
		this.isPermisoTodoPeriodoImportExport=false;
		this.isPermisoNuevoPeriodoImportExport=false;
		this.isPermisoActualizarPeriodoImportExport=false;
		this.isPermisoActualizarOriginalPeriodoImportExport=false;
		this.isPermisoEliminarPeriodoImportExport=false;
		this.isPermisoGuardarCambiosPeriodoImportExport=false;
		this.isPermisoConsultaPeriodoImportExport=false;
		this.isPermisoBusquedaPeriodoImportExport=false;
		this.isPermisoReportePeriodoImportExport=false;		
		this.isPermisoOrdenPeriodoImportExport=false;		
		this.isPermisoPaginacionMedioPeriodoImportExport=false;		
		this.isPermisoPaginacionAltoPeriodoImportExport=false;
		this.isPermisoPaginacionTodoPeriodoImportExport=false;
		this.isPermisoCopiarPeriodoImportExport=false;		
		this.isPermisoVerFormPeriodoImportExport=false;		
		this.isPermisoDuplicarPeriodoImportExport=false;		
		this.isPermisoOrdenPeriodoImportExport=false;		
	}
	
	public void setPermisosUsuarioPeriodoImportExport(Boolean isPermiso) {
		this.isPermisoTodoPeriodoImportExport=isPermiso;
		this.isPermisoNuevoPeriodoImportExport=isPermiso;
		this.isPermisoActualizarPeriodoImportExport=isPermiso;
		this.isPermisoActualizarOriginalPeriodoImportExport=isPermiso;
		this.isPermisoEliminarPeriodoImportExport=isPermiso;
		this.isPermisoGuardarCambiosPeriodoImportExport=isPermiso;
		this.isPermisoConsultaPeriodoImportExport=isPermiso;
		this.isPermisoBusquedaPeriodoImportExport=isPermiso;
		this.isPermisoReportePeriodoImportExport=isPermiso;
		this.isPermisoOrdenPeriodoImportExport=isPermiso;		
		this.isPermisoPaginacionMedioPeriodoImportExport=isPermiso;		
		this.isPermisoPaginacionAltoPeriodoImportExport=isPermiso;		
		this.isPermisoPaginacionTodoPeriodoImportExport=isPermiso;		
		this.isPermisoCopiarPeriodoImportExport=isPermiso;		
		this.isPermisoVerFormPeriodoImportExport=isPermiso;		
		this.isPermisoDuplicarPeriodoImportExport=isPermiso;
		this.isPermisoOrdenPeriodoImportExport=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPeriodoImportExport(Boolean isPermiso) {
		//this.isPermisoTodoPeriodoImportExport=isPermiso;
		this.isPermisoNuevoPeriodoImportExport=isPermiso;
		this.isPermisoActualizarPeriodoImportExport=isPermiso;
		this.isPermisoActualizarOriginalPeriodoImportExport=isPermiso;
		this.isPermisoEliminarPeriodoImportExport=isPermiso;
		this.isPermisoGuardarCambiosPeriodoImportExport=isPermiso;
		//this.isPermisoConsultaPeriodoImportExport=isPermiso;
		//this.isPermisoBusquedaPeriodoImportExport=isPermiso;
		//this.isPermisoReportePeriodoImportExport=isPermiso;
		//this.isPermisoOrdenPeriodoImportExport=isPermiso;		
		//this.isPermisoPaginacionMedioPeriodoImportExport=isPermiso;		
		//this.isPermisoPaginacionAltoPeriodoImportExport=isPermiso;		
		//this.isPermisoPaginacionTodoPeriodoImportExport=isPermiso;		
		//this.isPermisoCopiarPeriodoImportExport=isPermiso;		
		//this.isPermisoDuplicarPeriodoImportExport=isPermiso;
		//this.isPermisoOrdenPeriodoImportExport=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPeriodoImportExportClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PeriodoImportExportJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPeriodoImportExport(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPeriodoImportExportClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPeriodoImportExportClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPeriodoImportExportClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPeriodoImportExportClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPeriodoImportExport() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PeriodoImportExportJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PeriodoImportExportConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPeriodoImportExport=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPeriodoImportExport=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPeriodoImportExport=this.isPermisoActualizarPeriodoImportExport;
			this.isPermisoEliminarPeriodoImportExport=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPeriodoImportExport=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPeriodoImportExport=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPeriodoImportExport=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPeriodoImportExport=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePeriodoImportExport=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPeriodoImportExport=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPeriodoImportExport=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPeriodoImportExport=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPeriodoImportExport=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPeriodoImportExport=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPeriodoImportExport=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPeriodoImportExport=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPeriodoImportExport=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPeriodoImportExport.setToolTipText(this.jTableDatosPeriodoImportExport.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPeriodoImportExport(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPeriodoImportExport(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PeriodoImportExportJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PeriodoImportExportJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPeriodoImportExport() throws Exception {
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
	public void inicializarCombosForeignKeyPeriodoImportExportListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPeriodoImportExportListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PeriodoImportExportJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPeriodoImportExportListas(false);
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyPeriodoImportExportListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PeriodoImportExportParameterReturnGeneral periodoimportexportReturnGeneral=new PeriodoImportExportParameterReturnGeneral();
						
			


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.periodoimportexportConstantesFunciones.cargarid_anioPeriodoImportExport)
					 || (this.esRecargarFks && this.periodoimportexportConstantesFunciones.cargarid_anioPeriodoImportExport)) {

					if(!this.periodoimportexportSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+periodoimportexportSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.periodoimportexportConstantesFunciones.cargarid_mesPeriodoImportExport)
					 || (this.esRecargarFks && this.periodoimportexportConstantesFunciones.cargarid_mesPeriodoImportExport)) {

					if(!this.periodoimportexportSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+periodoimportexportSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				periodoimportexportReturnGeneral=periodoimportexportLogic.cargarCombosLoteForeignKeyPeriodoImportExport(finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=periodoimportexportReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=periodoimportexportReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPeriodoImportExport()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.periodoimportexportSessionBean==null) {
				this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
			}

			if(!this.periodoimportexportSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.periodoimportexportSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyPeriodoImportExport()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPeriodoImportExport(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPeriodoImportExport()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodoImportExport();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPeriodoImportExport(PeriodoImportExport periodoimportexport)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPeriodoImportExport(PeriodoImportExport periodoimportexport,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPeriodoImportExport()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodoImportExport()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPeriodoImportExport()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPeriodoImportExport()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPeriodoImportExport()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPeriodoImportExport()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPeriodoImportExport(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPeriodoImportExport()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport!=null && this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport!=null && this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public PeriodoImportExportBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PeriodoImportExportBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PeriodoImportExportBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean(); 
		this.periodoimportexportConstantesFunciones=new PeriodoImportExportConstantesFunciones(); 
		this.periodoimportexportBean=new PeriodoImportExport();//(this.periodoimportexportConstantesFunciones); 		
		this.periodoimportexportReturnGeneral=new PeriodoImportExportParameterReturnGeneral(); 
		
		this.periodoimportexportSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periodoimportexportSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PeriodoImportExportBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PeriodoImportExportBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PeriodoImportExportBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPeriodoImportExport(true);
			
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
			
			this.periodoimportexportConstantesFunciones=new PeriodoImportExportConstantesFunciones(); 
			this.periodoimportexportBean=new PeriodoImportExport();//this.periodoimportexportConstantesFunciones); 			
			this.periodoimportexportReturnGeneral=new PeriodoImportExportParameterReturnGeneral(); 
		
			PeriodoImportExportBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Periodo Importar Exportar Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.periodoimportexport=new PeriodoImportExport();
			this.periodoimportexports = new ArrayList<PeriodoImportExport>();
			this.periodoimportexportsAux = new ArrayList<PeriodoImportExport>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic=new PeriodoImportExportLogic();
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}
			
			//this.periodoimportexportSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.periodoimportexportSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPeriodoImportExport);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPeriodoImportExport!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPeriodoImportExport);	
					}
					
					if(this.jInternalFrameImportacionPeriodoImportExport!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPeriodoImportExport);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPeriodoImportExport!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPeriodoImportExport);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPeriodoImportExport);
				this.jInternalFrameDetalleFormPeriodoImportExport.setVisible(false);
				this.jInternalFrameDetalleFormPeriodoImportExport.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPeriodoImportExport!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPeriodoImportExport);
					this.jInternalFrameReporteDinamicoPeriodoImportExport.setVisible(false);
					this.jInternalFrameReporteDinamicoPeriodoImportExport.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPeriodoImportExport!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPeriodoImportExport);
					this.jInternalFrameImportacionPeriodoImportExport.setVisible(false);
					this.jInternalFrameImportacionPeriodoImportExport.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPeriodoImportExport!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPeriodoImportExport);
					this.jInternalFrameOrderByPeriodoImportExport.setVisible(false);
					this.jInternalFrameOrderByPeriodoImportExport.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPeriodoImportExportActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PeriodoImportExportConstantesFunciones.INUMEROPAGINACION;
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
			
			this.periodoimportexportReturnGeneral=new PeriodoImportExportParameterReturnGeneral();
			
			this.periodoimportexportParameterGeneral=new PeriodoImportExportParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.periodoimportexportLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PeriodoImportExportJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PeriodoImportExportConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.periodoimportexportSessionBean.getEsGuardarRelacionado(),this.periodoimportexportSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PeriodoImportExportConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.periodoimportexportSessionBean.getEsGuardarRelacionado(),this.periodoimportexportSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPeriodoImportExport=false;
			this.isVisibilidadCeldaDuplicarPeriodoImportExport=true;
			this.isVisibilidadCeldaCopiarPeriodoImportExport=true;
			this.isVisibilidadCeldaVerFormPeriodoImportExport=true;
			this.isVisibilidadCeldaOrdenPeriodoImportExport=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;
			this.isVisibilidadCeldaModificarPeriodoImportExport=false;
			this.isVisibilidadCeldaActualizarPeriodoImportExport=false;
			this.isVisibilidadCeldaEliminarPeriodoImportExport=false;
			this.isVisibilidadCeldaCancelarPeriodoImportExport=false;
			this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPeriodoImportExport("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPeriodoImportExport();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPeriodoImportExport(false);
			
			this.setPermisosUsuarioPeriodoImportExport();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado() 
				|| (this.periodoimportexportSessionBean.getEsGuardarRelacionado() && this.periodoimportexportSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPeriodoImportExportClasesRelacionadas();
			}
			
			if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPeriodoImportExportClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPeriodoImportExport();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPeriodoImportExport();
			}
			
			if(!this.isPermisoBusquedaPeriodoImportExport) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPeriodoImportExport,this.isPermisoPaginacionMedioPeriodoImportExport,this.isPermisoPaginacionTodoPeriodoImportExport);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PeriodoImportExportConstantesFunciones.getTiposSeleccionarPeriodoImportExport());
				
				this.tiposColumnasSelect=PeriodoImportExportConstantesFunciones.getTiposSeleccionarPeriodoImportExport(true);
				
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
			//if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPeriodoImportExport();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPeriodoImportExport(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPeriodoImportExport(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoImportExport() ;
			
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
			
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				periodoimportexportImplementable= (PeriodoImportExportImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PeriodoImportExportConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				periodoimportexportImplementableHome= (PeriodoImportExportImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PeriodoImportExportConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.periodoimportexports= new ArrayList<PeriodoImportExport>();
			this.periodoimportexportsEliminados= new ArrayList<PeriodoImportExport>();
						
			this.isEsNuevoPeriodoImportExport=false;
			this.esParaAccionDesdeFormularioPeriodoImportExport=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPeriodoImportExport(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPeriodoImportExport();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PeriodoImportExportBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PeriodoImportExportConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPeriodoImportExport("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPeriodoImportExport(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPeriodoImportExport();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPeriodoImportExport();
			}
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPeriodoImportExport.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPeriodoImportExport.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPeriodoImportExport.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPeriodoImportExport(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PeriodoImportExport: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPeriodoImportExport() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPeriodoImportExport")) {
				iIndex=this.jInternalFrameDetalleFormPeriodoImportExport.jTabbedPaneRelacionesPeriodoImportExport.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPeriodoImportExport.jTabbedPaneRelacionesPeriodoImportExport.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPeriodoImportExport();	
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
	
	public void cargarCombosForeignKeyPeriodoImportExport(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPeriodoImportExport(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPeriodoImportExport(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPeriodoImportExportListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPeriodoImportExport();
		
		this.cargarCombosFrameForeignKeyPeriodoImportExport();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPeriodoImportExport();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPeriodoImportExport();
		}
	}
	
	

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

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
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPeriodoImportExportActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
			
			if(jTableDatosPeriodoImportExport.getRowCount()>=1) {
				jTableDatosPeriodoImportExport.removeRowSelectionInterval(0, jTableDatosPeriodoImportExport.getRowCount()-1);						
			}
			
			this.isEsNuevoPeriodoImportExport=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPeriodoImportExport(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPeriodoImportExport(true);			
			//this.periodoimportexport=new PeriodoImportExport();
			//this.periodoimportexport.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodoImportExport(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoImportExport() ;
			
			if(PeriodoImportExportJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodoImportExport(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.periodoimportexport);	
			this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);				
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
			if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PeriodoImportExport: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPeriodoImportExportActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPeriodoImportExport.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPeriodoImportExport.getSelectedRows().length;			
			}
			
			periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPeriodoImportExport--;			
				//PeriodoImportExport periodoimportexportAux= new PeriodoImportExport();			
				//periodoimportexportAux.setId(this.iIdNuevoPeriodoImportExport);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PeriodoImportExport periodoimportexportOrigen=new PeriodoImportExport();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PeriodoImportExport periodoimportexportOrigen : periodoimportexportsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							periodoimportexportOrigen =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoimportexportOrigen =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPeriodoImportExport();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.periodoimportexport.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPeriodoImportExport(periodoimportexportOrigen,this.periodoimportexport,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.periodoimportexportLogic.getPeriodoImportExports().add(this.periodoimportexportAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.periodoimportexports.add(this.periodoimportexportAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPeriodoImportExport(false);
				
				this.jTableDatosPeriodoImportExport.setRowSelectionInterval(this.getIndiceNuevoPeriodoImportExport(), this.getIndiceNuevoPeriodoImportExport());
				
				int iLastRow =  this.jTableDatosPeriodoImportExport.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPeriodoImportExport.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPeriodoImportExport.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodoImportExport(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();									
		
			PeriodoImportExport periodoimportexportOrigen=new PeriodoImportExport();
			PeriodoImportExport periodoimportexportDestino=new PeriodoImportExport();
				
			periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPeriodoImportExport.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || periodoimportexportsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPeriodoImportExport.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoimportexportOrigen =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						periodoimportexportOrigen =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoimportexportDestino =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						periodoimportexportDestino =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				periodoimportexportOrigen =periodoimportexportsSeleccionados.get(0);
				periodoimportexportDestino =periodoimportexportsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPeriodoImportExport(periodoimportexportOrigen,periodoimportexportDestino,true,false);
				
				periodoimportexportDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(periodoimportexportDestino,periodoimportexportLogic.getPeriodoImportExports());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoimportexportDestino,periodoimportexports);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPeriodoImportExport(false);
				
				//this.jTableDatosPeriodoImportExport.setRowSelectionInterval(this.getIndiceNuevoPeriodoImportExport(), this.getIndiceNuevoPeriodoImportExport());
				
				int iLastRow =  this.jTableDatosPeriodoImportExport.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPeriodoImportExport.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPeriodoImportExport.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodoImportExport(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPeriodoImportExport.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPeriodoImportExport.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPeriodoImportExport.setVisible(!isVisible);
			this.jPanelPaginacionPeriodoImportExport.setVisible(!isVisible);
			this.jPanelAccionesPeriodoImportExport.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePeriodoImportExport();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPeriodoImportExport();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPeriodoImportExport();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPeriodoImportExport();
			
			this.abrirFrameOrderByPeriodoImportExport();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPeriodoImportExport();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePeriodoImportExport(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPeriodoImportExport);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPeriodoImportExport.isMaximum()) {
					this.jInternalFrameDetalleFormPeriodoImportExport.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPeriodoImportExport.setSize(this.jInternalFrameDetalleFormPeriodoImportExport.iWidthFormulario,this.jInternalFrameDetalleFormPeriodoImportExport.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPeriodoImportExport.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPeriodoImportExport.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPeriodoImportExport.isMaximum()) {
						this.jInternalFrameDetalleFormPeriodoImportExport.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPeriodoImportExport.jContentPaneDetallePeriodoImportExport.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPeriodoImportExport.jTabbedPaneRelacionesPeriodoImportExport.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPeriodoImportExport.jContentPaneDetallePeriodoImportExport.getWidth(),PeriodoImportExportConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPeriodoImportExport.jTabbedPaneRelacionesPeriodoImportExport.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPeriodoImportExport.jContentPaneDetallePeriodoImportExport.getWidth(),PeriodoImportExportConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPeriodoImportExport.jTabbedPaneRelacionesPeriodoImportExport.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPeriodoImportExport.jContentPaneDetallePeriodoImportExport.getWidth(),PeriodoImportExportConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPeriodoImportExport.setVisible(true);
	        this.jInternalFrameDetalleFormPeriodoImportExport.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPeriodoImportExport() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPeriodoImportExport==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPeriodoImportExport=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoImportExport,false,this);
				} else {
					this.jInternalFrameOrderByPeriodoImportExport=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoImportExport,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPeriodoImportExport);
				this.jInternalFrameOrderByPeriodoImportExport.setVisible(false);
				this.jInternalFrameOrderByPeriodoImportExport.setSelected(false);
				
				this.jInternalFrameOrderByPeriodoImportExport.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPeriodoImportExport"));
				
				this.inicializarActualizarBindingTablaOrderByPeriodoImportExport();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPeriodoImportExport() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPeriodoImportExport==null) {
				
				this.jInternalFrameImportacionPeriodoImportExport=new ImportacionJInternalFrame(PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPeriodoImportExport);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPeriodoImportExport);
				this.jInternalFrameImportacionPeriodoImportExport.setVisible(false);
				this.jInternalFrameImportacionPeriodoImportExport.setSelected(false);


				this.jInternalFrameImportacionPeriodoImportExport.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPeriodoImportExport"));
				this.jInternalFrameImportacionPeriodoImportExport.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPeriodoImportExport"));
				this.jInternalFrameImportacionPeriodoImportExport.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPeriodoImportExport"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPeriodoImportExport() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPeriodoImportExport==null) {
				this.jInternalFrameReporteDinamicoPeriodoImportExport=new ReporteDinamicoJInternalFrame(PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPeriodoImportExport);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPeriodoImportExport);
				this.jInternalFrameReporteDinamicoPeriodoImportExport.setVisible(false);
				this.jInternalFrameReporteDinamicoPeriodoImportExport.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPeriodoImportExport.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodoImportExport"));
				this.jInternalFrameReporteDinamicoPeriodoImportExport.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodoImportExport"));
				this.jInternalFrameReporteDinamicoPeriodoImportExport.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodoImportExport"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodoImportExport();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePeriodoImportExport() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPeriodoImportExport);
			
	       	this.jInternalFrameDetalleFormPeriodoImportExport.setVisible(false);
	        this.jInternalFrameDetalleFormPeriodoImportExport.setSelected(false);
			
			//this.jInternalFrameDetalleFormPeriodoImportExport.dispose();
			//this.jInternalFrameDetalleFormPeriodoImportExport=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPeriodoImportExport() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPeriodoImportExport.setVisible(true);
	        this.jInternalFrameReporteDinamicoPeriodoImportExport.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPeriodoImportExport() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPeriodoImportExport.setVisible(true);
	        this.jInternalFrameImportacionPeriodoImportExport.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPeriodoImportExport() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPeriodoImportExport.setVisible(true);
	        this.jInternalFrameOrderByPeriodoImportExport.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPeriodoImportExport() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPeriodoImportExport.setVisible(false);
	        this.jInternalFrameOrderByPeriodoImportExport.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPeriodoImportExport() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPeriodoImportExport.setVisible(false);
	        this.jInternalFrameReporteDinamicoPeriodoImportExport.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPeriodoImportExport() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPeriodoImportExport.setVisible(false);
	        this.jInternalFrameImportacionPeriodoImportExport.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPeriodoImportExport(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPeriodoImportExport(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPeriodoImportExport(true);
			//this.isEsNuevoPeriodoImportExport=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPeriodoImportExport("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodoImportExport(false) ;
			
			if(periodoimportexportSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PeriodoImportExportJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodoImportExport(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoImportExport(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPeriodoImportExportActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPeriodoImportExport(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPeriodoImportExport(true);
			//this.isEsNuevoPeriodoImportExport=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.periodoimportexport.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPeriodoImportExport("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPeriodoImportExport(false) ;
			
			if(PeriodoImportExportJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodoImportExport(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoImportExport(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExport,PeriodoImportExportConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPeriodoImportExport.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExport,PeriodoImportExportConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPeriodoImportExport.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPeriodoImportExport(false);
			
			//if(!this.isEsNuevoPeriodoImportExport) {								
				int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.periodoimportexport,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
				
			}
			
			if(this.permiteMantenimiento(this.periodoimportexport)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPeriodoImportExport=true;
					this.inicializarActualizarBindingTablaPeriodoImportExport(false);
					this.isEsNuevoPeriodoImportExport=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPeriodoImportExport=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPeriodoImportExport=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPeriodoImportExport(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodoImportExport(false);
				
				this.habilitarDeshabilitarControlesPeriodoImportExport(false);
			
												
				
				if(PeriodoImportExportJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePeriodoImportExport();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPeriodoImportExportActionPerformed(evt,periodoimportexportSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPeriodoImportExport(this.periodoimportexport,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPeriodoImportExport.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,periodoimportexportSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.periodoimportexport.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				this.periodoimportexport.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				this.periodoimportexport.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.periodoimportexport)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PeriodoImportExportModel) this.jTableDatosPeriodoImportExport.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPeriodoImportExport=true;
				this.inicializarActualizarBindingTablaPeriodoImportExport(false);
				this.isEsNuevoPeriodoImportExport=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPeriodoImportExport(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodoImportExport(false);
				
				this.habilitarDeshabilitarControlesPeriodoImportExport(false);
				
				
				
				if(PeriodoImportExportJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePeriodoImportExport();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPeriodoImportExport.getRowCount()>=1) {
				jTableDatosPeriodoImportExport.removeRowSelectionInterval(0, jTableDatosPeriodoImportExport.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPeriodoImportExport(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPeriodoImportExport(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodoImportExport(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoImportExport(false) ;
			
			this.isEsNuevoPeriodoImportExport=false;
			
			if(PeriodoImportExportJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePeriodoImportExport();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPeriodoImportExport(false);
				
				//SI ES MANUAL
				if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPeriodoImportExport();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPeriodoImportExport--;			
			//PeriodoImportExport periodoimportexportAux= new PeriodoImportExport();			
			//periodoimportexportAux.setId(this.iIdNuevoPeriodoImportExport);
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPeriodoImportExport();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
			
			this.periodoimportexport.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.periodoimportexportLogic.getPeriodoImportExports().add(this.periodoimportexportAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.periodoimportexports.add(this.periodoimportexportAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPeriodoImportExport(false);
			
			this.jTableDatosPeriodoImportExport.setRowSelectionInterval(this.getIndiceNuevoPeriodoImportExport(), this.getIndiceNuevoPeriodoImportExport());
			
			int iLastRow =  this.jTableDatosPeriodoImportExport.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPeriodoImportExport.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPeriodoImportExport.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPeriodoImportExport(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPeriodoImportExport(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoImportExport(false);
			
			//SI ES MANUAL
			if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodoImportExport();
			}
			
			//this.abrirFrameTreePeriodoImportExport();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Periodo Importar ExportarS ?", "MANTENIMIENTO DE Periodo Importar Exportar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPeriodoImportExport.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPeriodoImportExport();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.periodoimportexportReturnGeneral=periodoimportexportLogic.procesarImportacionPeriodoImportExportsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.periodoimportexportParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPeriodoImportExportReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPeriodoImportExport.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPeriodoImportExport.setFileImportacion(this.jInternalFrameImportacionPeriodoImportExport.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPeriodoImportExport.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPeriodoImportExport.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPeriodoImportExport.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPeriodoImportExport.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();		

		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PeriodoImportExportBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PeriodoImportExportBaseDesign.jrxml";
			
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
			
			this.generarReportePeriodoImportExports("Todos",periodoimportexportsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PeriodoImportExportConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPeriodoImportExport.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PeriodoImportExportConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PeriodoImportExportConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PeriodoImportExportConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();		
		
		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoimportexport";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PeriodoImportExports");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PeriodoImportExportConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PeriodoImportExport periodoimportexport:periodoimportexportsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodoimportexport.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(PeriodoImportExport periodoimportexport:periodoimportexportsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodoimportexport.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoImportExportConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(PeriodoImportExport periodoimportexport:periodoimportexportsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodoimportexport.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelPeriodoImportExport(row);				
			//	iRow++;
			//}				
			
			//for(PeriodoImportExport periodoimportexportAux:periodoimportexportsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPeriodoImportExport(periodoimportexportAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
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
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoImportExport(false);
			
			//SI ES MANUAL
			if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodoImportExport();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoImportExport(false);
			
			//SI ES MANUAL
			if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPeriodoImportExport();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoImportExport(false);
			
			//SI ES MANUAL
			if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPeriodoImportExport();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPeriodoImportExport() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPeriodoImportExport.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPeriodoImportExport.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPeriodoImportExport.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPeriodoImportExport.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPeriodoImportExport.setMinimumSize(dimensionMinimum);
		this.jTableDatosPeriodoImportExport.setMaximumSize(dimensionMaximum);
		this.jTableDatosPeriodoImportExport.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPeriodoImportExport(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPeriodoImportExport(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPeriodoImportExport(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPeriodoImportExport(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPeriodoImportExport(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPeriodoImportExport(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoImportExport(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPeriodoImportExport(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPeriodoImportExport() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPeriodoImportExport();
		
		this.inicializarActualizarBindingBotonesManualPeriodoImportExport(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPeriodoImportExport();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoImportExport() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodoImportExport(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodoImportExport(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPeriodoImportExport.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPeriodoImportExport.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePeriodoImportExport.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPeriodoImportExport.jCheckBoxPostAccionNuevoPeriodoImportExport.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPeriodoImportExport.jCheckBoxPostAccionSinCerrarPeriodoImportExport.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPeriodoImportExport.jCheckBoxPostAccionSinMensajePeriodoImportExport.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPeriodoImportExport.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPeriodoImportExport.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePeriodoImportExport.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
				this.jInternalFrameDetalleFormPeriodoImportExport.jCheckBoxPostAccionNuevoPeriodoImportExport.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPeriodoImportExport.jCheckBoxPostAccionSinCerrarPeriodoImportExport.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPeriodoImportExport.jCheckBoxPostAccionSinMensajePeriodoImportExport.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPeriodoImportExport.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPeriodoImportExport.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPeriodoImportExport.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPeriodoImportExport!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPeriodoImportExport.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPeriodoImportExport.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPeriodoImportExport.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPeriodoImportExport.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPeriodoImportExport!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPeriodoImportExport.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPeriodoImportExport.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPeriodoImportExport(Boolean esInicializar) throws Exception {
		try	{	
			if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodoImportExport(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoImportExport() throws Exception {
		try	{
			if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPeriodoImportExport();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePeriodoImportExport() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPeriodoImportExport() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPeriodoImportExport.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPeriodoImportExport.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPeriodoImportExport.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPeriodoImportExport.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPeriodoImportExport.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPeriodoImportExport.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPeriodoImportExport.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPeriodoImportExport.addItem(reporte);
			}
			
			
			if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPeriodoImportExport.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPeriodoImportExport.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPeriodoImportExport.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPeriodoImportExport.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPeriodoImportExport.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPeriodoImportExport.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPeriodoImportExport.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPeriodoImportExport.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPeriodoImportExport.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodoImportExport();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodoImportExport() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPeriodoImportExport!=null) {
				this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPeriodoImportExport!=null) {
				this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPeriodoImportExport.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPeriodoImportExport!=null) {
				
				if(this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPeriodoImportExport.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPeriodoImportExport()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoPeriodoImportExport.getText();
		if(this.jComboBoxid_anioFK_IdAnioPeriodoImportExport.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioPeriodoImportExport.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPeriodoImportExport(Boolean esInicializar) throws Exception {				
		if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPeriodoImportExport();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPeriodoImportExport() throws Exception {
		this.inicializarActualizarBindingTablaPeriodoImportExport(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPeriodoImportExport() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PeriodoImportExportPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PeriodoImportExportPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPeriodoImportExportOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExportOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PeriodoImportExportPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PeriodoImportExportPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPeriodoImportExport(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=periodoimportexportLogic.getPeriodoImportExports().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=periodoimportexports.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPeriodoImportExport.setModel(new PeriodoImportExportModel(this.periodoimportexportLogic.getPeriodoImportExports(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPeriodoImportExport.setModel(new PeriodoImportExportModel(this.periodoimportexports,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPeriodoImportExport!=null && this.jInternalFrameOrderByPeriodoImportExport.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPeriodoImportExport();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExport,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PeriodoImportExportPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO,periodoimportexportConstantesFunciones.resaltarSeleccionarPeriodoImportExport,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PeriodoImportExportConstantesFunciones.SCLASSWEBTITULO,periodoimportexportConstantesFunciones.resaltarSeleccionarPeriodoImportExport,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExport,PeriodoImportExportConstantesFunciones.LABEL_ID));

		if(this.periodoimportexportConstantesFunciones.mostraridPeriodoImportExport && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoImportExportConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.periodoimportexportConstantesFunciones.resaltaridPeriodoImportExport,this.periodoimportexportConstantesFunciones.activaridPeriodoImportExport,this,true,"idPeriodoImportExport","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.periodoimportexportConstantesFunciones.resaltaridPeriodoImportExport,this.periodoimportexportConstantesFunciones.activaridPeriodoImportExport,this,true,"idPeriodoImportExport","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExport,PeriodoImportExportConstantesFunciones.LABEL_CODIGO));

		if(this.periodoimportexportConstantesFunciones.mostrarcodigoPeriodoImportExport && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoImportExportConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.periodoimportexportConstantesFunciones.resaltarcodigoPeriodoImportExport,this.periodoimportexportConstantesFunciones.activarcodigoPeriodoImportExport,this,true,"codigoPeriodoImportExport","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.periodoimportexportConstantesFunciones.resaltarcodigoPeriodoImportExport,this.periodoimportexportConstantesFunciones.activarcodigoPeriodoImportExport,this,true,"codigoPeriodoImportExport","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoImportExportPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExport,PeriodoImportExportConstantesFunciones.LABEL_IDANIO));

		if(this.periodoimportexportConstantesFunciones.mostrarid_anioPeriodoImportExport && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoImportExportConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.periodoimportexportConstantesFunciones.resaltarid_anioPeriodoImportExport,this,this.periodoimportexportConstantesFunciones.activarid_anioPeriodoImportExport));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.periodoimportexportConstantesFunciones.resaltarid_anioPeriodoImportExport,this,this.periodoimportexportConstantesFunciones.activarid_anioPeriodoImportExport,true,"id_anioPeriodoImportExport","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoImportExportPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExport,PeriodoImportExportConstantesFunciones.LABEL_IDMES));

		if(this.periodoimportexportConstantesFunciones.mostrarid_mesPeriodoImportExport && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoImportExportConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.periodoimportexportConstantesFunciones.resaltarid_mesPeriodoImportExport,this,this.periodoimportexportConstantesFunciones.activarid_mesPeriodoImportExport));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.periodoimportexportConstantesFunciones.resaltarid_mesPeriodoImportExport,this,this.periodoimportexportConstantesFunciones.activarid_mesPeriodoImportExport,true,"id_mesPeriodoImportExport","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoImportExportPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.periodoimportexportSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.periodoimportexportSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPeriodoImportExport.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.periodoimportexportSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.periodoimportexportSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPeriodoImportExport.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.periodoimportexportSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.periodoimportexportSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPeriodoImportExport.addColumn(tableColumn);
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
			
			this.jTableDatosPeriodoImportExport.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPeriodoImportExport.moveColumn(this.jTableDatosPeriodoImportExport.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPeriodoImportExport.moveColumn(this.jTableDatosPeriodoImportExport.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPeriodoImportExport.moveColumn(this.jTableDatosPeriodoImportExport.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPeriodoImportExport.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPeriodoImportExport.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPeriodoImportExport,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPeriodoImportExport.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPeriodoImportExport.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPeriodoImportExport.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPeriodoImportExport.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=periodoimportexportLogic.getPeriodoImportExports().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=periodoimportexports.size()-1;
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
		//this.jTableDatosPeriodoImportExport.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPeriodoImportExport.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPeriodoImportExport();
			
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
				
				//this.isEsNuevoPeriodoImportExport=false;
					
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
				if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPeriodoImportExport==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPeriodoImportExport.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPeriodoImportExport.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.periodoimportexport.getsType().equals("DUPLICADO")
				   || this.periodoimportexport.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPeriodoImportExport=true;
				
				} else {
					this.isEsNuevoPeriodoImportExport=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
					if(this.periodoimportexport.getId()>=0 && !this.periodoimportexport.getIsNew()) {						
						this.isEsNuevoPeriodoImportExport=false;
						
					} else {
						this.isEsNuevoPeriodoImportExport=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPeriodoImportExport(esRelaciones);						
				
				this.seleccionarPeriodoImportExport(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.periodoimportexport.getId()<0) {
					this.isEsNuevoPeriodoImportExport=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPeriodoImportExport(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPeriodoImportExport(evt,rowIndex);
				}	
				
				if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PeriodoImportExport: " + this.dDif); 
					}
				}								
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPeriodoImportExport(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.periodoimportexport)) {
					if(this.periodoimportexport.getId()>0) {
						this.periodoimportexport.setIsDeleted(true);
						
						this.periodoimportexportsEliminados.add(this.periodoimportexport);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.periodoimportexportLogic.getPeriodoImportExports().remove(this.periodoimportexport);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.periodoimportexports.remove(this.periodoimportexport);				
					}
					
					
					((PeriodoImportExportModel) this.jTableDatosPeriodoImportExport.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodoImportExport(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPeriodoImportExport(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPeriodoImportExport) {
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPeriodoImportExport.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPeriodoImportExport.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPeriodoImportExport(this.periodoimportexport);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.periodoimportexportConstantesFunciones.cargarid_anioPeriodoImportExport || this.periodoimportexportConstantesFunciones.event_dependid_anioPeriodoImportExport) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.periodoimportexport.getid_anio());
									//this.inicializarActualizarBindingPeriodoImportExport(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(periodoimportexport.getAnio()!=null) {
							this.aniosForeignKey.add(periodoimportexport.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.periodoimportexport.getid_anio(),false,"Formulario");

					//Mes
					if(!this.periodoimportexportConstantesFunciones.cargarid_mesPeriodoImportExport || this.periodoimportexportConstantesFunciones.event_dependid_mesPeriodoImportExport) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.periodoimportexport.getid_mes());
									//this.inicializarActualizarBindingPeriodoImportExport(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(periodoimportexport.getMes()!=null) {
							this.messForeignKey.add(periodoimportexport.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.periodoimportexport.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPeriodoImportExport("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPeriodoImportExport(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodoImportExport() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPeriodoImportExport(PeriodoImportExport periodoimportexport) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPeriodoImportExport(periodoimportexport,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPeriodoImportExport(PeriodoImportExport periodoimportexport,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPeriodoImportExport(periodoimportexport);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPeriodoImportExport(periodoimportexport,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPeriodoImportExport(periodoimportexport);
	}
	
	public void setVariablesObjetoActualToFormularioPeriodoImportExport(PeriodoImportExport periodoimportexport) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.setText(periodoimportexport.getId().toString());
			this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldcodigoPeriodoImportExport.setText(periodoimportexport.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PeriodoImportExport periodoimportexportLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,periodoimportexportLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PeriodoImportExport periodoimportexportLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				periodoimportexportLocal=this.periodoimportexport;
			} else {
				periodoimportexportLocal=this.periodoimportexportAnterior;
			}
		}
		
		if(this.permiteMantenimiento(periodoimportexportLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPeriodoImportExport(periodoimportexportLocal,true);
					
					if(periodoimportexportSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(periodoimportexportLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(periodoimportexportLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPeriodoImportExport(PeriodoImportExport periodoimportexport,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPeriodoImportExport(periodoimportexport,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(periodoimportexport);
	}
	
	public void setVariablesFormularioToObjetoActualPeriodoImportExport(PeriodoImportExport periodoimportexport,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPeriodoImportExport(periodoimportexport,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPeriodoImportExport(PeriodoImportExport periodoimportexport,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.getText()==null || this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.getText()=="" || this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.getText()=="Id") {
				this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.setText("0");
			}

			if(conColumnasBase) {periodoimportexport.setId(Long.parseLong(this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoImportExportConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoImportExport.jLabelIdPeriodoImportExport,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periodoimportexport.setcodigo(this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldcodigoPeriodoImportExport.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoImportExportConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoImportExport.jLabelcodigoPeriodoImportExport,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPeriodoImportExport(PeriodoImportExport periodoimportexportBean,PeriodoImportExport periodoimportexport,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPeriodoImportExport(PeriodoImportExport periodoimportexportOrigen,PeriodoImportExport periodoimportexport,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && periodoimportexportOrigen.getId()!=null && !periodoimportexportOrigen.getId().equals(0L))) {periodoimportexport.setId(periodoimportexportOrigen.getId());}}
			if(conDefault || (!conDefault && periodoimportexportOrigen.getcodigo()!=null && !periodoimportexportOrigen.getcodigo().equals(""))) {periodoimportexport.setcodigo(periodoimportexportOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPeriodoImportExport(PeriodoImportExport periodoimportexport) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.setText(periodoimportexport.getId().toString());
			this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldcodigoPeriodoImportExport.setText(periodoimportexport.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPeriodoImportExport(PeriodoImportExportBean periodoimportexportBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.setText(periodoimportexportBean.getId().toString());
			this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldcodigoPeriodoImportExport.setText(periodoimportexportBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPeriodoImportExport(PeriodoImportExportParameterReturnGeneral periodoimportexportReturnGeneral,PeriodoImportExportBean periodoimportexportBean,Boolean conDefault) throws Exception { 
		try {
			PeriodoImportExport periodoimportexportLocal=new PeriodoImportExport();
			
			periodoimportexportLocal=periodoimportexportReturnGeneral.getPeriodoImportExport();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && periodoimportexportLocal.getId()!=null && !periodoimportexportLocal.getId().equals(0L))) {periodoimportexportBean.setId(periodoimportexportLocal.getId());}}
			if(conDefault || (!conDefault && periodoimportexportLocal.getcodigo()!=null && !periodoimportexportLocal.getcodigo().equals(""))) {periodoimportexportBean.setcodigo(periodoimportexportLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPeriodoImportExportGenerico(Long idPeriodoImportExportSeleccionado,JComboBox jComboBoxPeriodoImportExport,List<PeriodoImportExport> periodoimportexportsLocal)throws Exception {
		try {
			PeriodoImportExport  periodoimportexportTemp=null;

			for(PeriodoImportExport periodoimportexportAux:periodoimportexportsLocal) {
				if(periodoimportexportAux.getId()!=null && periodoimportexportAux.getId().equals(idPeriodoImportExportSeleccionado)) {
					periodoimportexportTemp=periodoimportexportAux;
					break;
				}
			}

			jComboBoxPeriodoImportExport.setSelectedItem(periodoimportexportTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPeriodoImportExportGenerico(JComboBox jComboBoxPeriodoImportExport,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPeriodoImportExport.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPeriodoImportExport.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPeriodoImportExport.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPeriodoImportExport.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPeriodoImportExport.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPeriodoImportExport.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periodoimportexport=(PeriodoImportExport) periodoimportexportLogic.getPeriodoImportExports().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			periodoimportexport =(PeriodoImportExport) periodoimportexports.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!periodoimportexport.getIsNew() && !periodoimportexport.getIsChanged() && !periodoimportexport.getIsDeleted()) {
				sDescripcion=periodoimportexport.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=periodoimportexport.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!periodoimportexport.getIsNew() && !periodoimportexport.getIsChanged() && !periodoimportexport.getIsDeleted()) {
				sDescripcion=periodoimportexport.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=periodoimportexport.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PeriodoImportExport periodoimportexportRow=new PeriodoImportExport();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periodoimportexportRow=(PeriodoImportExport) periodoimportexportLogic.getPeriodoImportExports().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			periodoimportexportRow=(PeriodoImportExport) periodoimportexports.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPeriodoImportExport(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPeriodoImportExport.setVisible((this.isVisibilidadCeldaNuevoPeriodoImportExport && this.isPermisoNuevoPeriodoImportExport));			
			this.jButtonDuplicarPeriodoImportExport.setVisible((this.isVisibilidadCeldaDuplicarPeriodoImportExport && this.isPermisoDuplicarPeriodoImportExport));			
			this.jButtonCopiarPeriodoImportExport.setVisible((this.isVisibilidadCeldaCopiarPeriodoImportExport && this.isPermisoCopiarPeriodoImportExport));
			this.jButtonVerFormPeriodoImportExport.setVisible((this.isVisibilidadCeldaVerFormPeriodoImportExport && this.isPermisoVerFormPeriodoImportExport));
			
			this.jButtonAbrirOrderByPeriodoImportExport.setVisible((this.isVisibilidadCeldaOrdenPeriodoImportExport && this.isPermisoOrdenPeriodoImportExport));			
			
			this.jButtonNuevoRelacionesPeriodoImportExport.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport && this.isPermisoNuevoPeriodoImportExport));			
			this.jButtonNuevoGuardarCambiosPeriodoImportExport.setVisible((this.isVisibilidadCeldaNuevoPeriodoImportExport && this.isPermisoNuevoPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonModificarPeriodoImportExport.setVisible((this.isVisibilidadCeldaModificarPeriodoImportExport && this.isPermisoActualizarPeriodoImportExport));	
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarPeriodoImportExport.setVisible((this.isVisibilidadCeldaActualizarPeriodoImportExport && this.isPermisoActualizarPeriodoImportExport));	
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarPeriodoImportExport.setVisible((this.isVisibilidadCeldaEliminarPeriodoImportExport && this.isPermisoEliminarPeriodoImportExport));
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarPeriodoImportExport.setVisible(this.isVisibilidadCeldaCancelarPeriodoImportExport);							
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosPeriodoImportExport.setVisible((this.isVisibilidadCeldaGuardarPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));			
			
			}
						
			this.jButtonGuardarCambiosTablaPeriodoImportExport.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaNuevoPeriodoImportExport && this.isPermisoNuevoPeriodoImportExport));						
			this.jButtonDuplicarToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaDuplicarPeriodoImportExport && this.isPermisoDuplicarPeriodoImportExport));						
			this.jButtonCopiarToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaCopiarPeriodoImportExport && this.isPermisoCopiarPeriodoImportExport));			
			this.jButtonVerFormToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaVerFormPeriodoImportExport && this.isPermisoVerFormPeriodoImportExport));			
			this.jButtonAbrirOrderByToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaOrdenPeriodoImportExport && this.isPermisoOrdenPeriodoImportExport));
			this.jButtonNuevoRelacionesToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport && this.isPermisoNuevoPeriodoImportExport));			
			this.jButtonNuevoGuardarCambiosToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaNuevoPeriodoImportExport && this.isPermisoNuevoPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));			
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonModificarToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaModificarPeriodoImportExport && this.isPermisoActualizarPeriodoImportExport));	
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaActualizarPeriodoImportExport  && this.isPermisoActualizarPeriodoImportExport));	
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaEliminarPeriodoImportExport && this.isPermisoEliminarPeriodoImportExport));
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarToolBarPeriodoImportExport.setVisible(this.isVisibilidadCeldaCancelarPeriodoImportExport);				
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaGuardarPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPeriodoImportExport.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPeriodoImportExport.setVisible((this.isVisibilidadCeldaNuevoPeriodoImportExport && this.isPermisoNuevoPeriodoImportExport));			
			this.jMenuItemDuplicarPeriodoImportExport.setVisible((this.isVisibilidadCeldaDuplicarPeriodoImportExport && this.isPermisoDuplicarPeriodoImportExport));			
			this.jMenuItemCopiarPeriodoImportExport.setVisible((this.isVisibilidadCeldaCopiarPeriodoImportExport && this.isPermisoCopiarPeriodoImportExport));			
			this.jMenuItemVerFormPeriodoImportExport.setVisible((this.isVisibilidadCeldaVerFormPeriodoImportExport && this.isPermisoVerFormPeriodoImportExport));			
			this.jMenuItemAbrirOrderByPeriodoImportExport.setVisible((this.isVisibilidadCeldaOrdenPeriodoImportExport && this.isPermisoOrdenPeriodoImportExport));			
			//this.jMenuItemMostrarOcultarPeriodoImportExport.setVisible((this.isVisibilidadCeldaOrdenPeriodoImportExport && this.isPermisoOrdenPeriodoImportExport));
			this.jMenuItemDetalleAbrirOrderByPeriodoImportExport.setVisible((this.isVisibilidadCeldaOrdenPeriodoImportExport && this.isPermisoOrdenPeriodoImportExport));			
			//this.jMenuItemDetalleMostrarOcultarPeriodoImportExport.setVisible((this.isVisibilidadCeldaOrdenPeriodoImportExport && this.isPermisoOrdenPeriodoImportExport));			
			this.jMenuItemNuevoRelacionesPeriodoImportExport.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport && this.isPermisoNuevoPeriodoImportExport));			
			this.jMenuItemNuevoGuardarCambiosPeriodoImportExport.setVisible((this.isVisibilidadCeldaNuevoPeriodoImportExport && this.isPermisoNuevoPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));									
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemModificarPeriodoImportExport.setVisible((this.isVisibilidadCeldaModificarPeriodoImportExport && this.isPermisoActualizarPeriodoImportExport));	
			this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemActualizarPeriodoImportExport.setVisible((this.isVisibilidadCeldaActualizarPeriodoImportExport && this.isPermisoActualizarPeriodoImportExport));	
			this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemEliminarPeriodoImportExport.setVisible((this.isVisibilidadCeldaEliminarPeriodoImportExport && this.isPermisoEliminarPeriodoImportExport));
			this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemCancelarPeriodoImportExport.setVisible(this.isVisibilidadCeldaCancelarPeriodoImportExport);				
			}
			
			this.jMenuItemGuardarCambiosPeriodoImportExport.setVisible((this.isVisibilidadCeldaGuardarPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));						
			this.jMenuItemGuardarCambiosTablaPeriodoImportExport.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPeriodoImportExport=this.jButtonNuevoPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaDuplicarPeriodoImportExport=this.jButtonDuplicarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaCopiarPeriodoImportExport=this.jButtonCopiarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaVerFormPeriodoImportExport=this.jButtonVerFormPeriodoImportExport.isVisible();
			
			this.isVisibilidadCeldaOrdenPeriodoImportExport=this.jButtonAbrirOrderByPeriodoImportExport.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=this.jButtonNuevoRelacionesPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaModificarPeriodoImportExport=this.jButtonModificarPeriodoImportExport.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			this.isVisibilidadCeldaActualizarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaEliminarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaCancelarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaGuardarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosPeriodoImportExport.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=this.jButtonGuardarCambiosTablaPeriodoImportExport.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPeriodoImportExport=this.jButtonNuevoToolBarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=this.jButtonNuevoRelacionesToolBarPeriodoImportExport.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			this.isVisibilidadCeldaModificarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jButtonModificarToolBarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaActualizarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarToolBarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaEliminarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarToolBarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaCancelarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarToolBarPeriodoImportExport.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPeriodoImportExport=this.jButtonGuardarCambiosToolBarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=this.jButtonGuardarCambiosTablaToolBarPeriodoImportExport.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPeriodoImportExport=this.jMenuItemNuevoPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=this.jMenuItemNuevoRelacionesPeriodoImportExport.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			this.isVisibilidadCeldaModificarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemModificarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaActualizarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemActualizarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaEliminarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemEliminarPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaCancelarPeriodoImportExport=this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemCancelarPeriodoImportExport.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPeriodoImportExport=this.jMenuItemGuardarCambiosPeriodoImportExport.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=this.jMenuItemGuardarCambiosTablaPeriodoImportExport.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPeriodoImportExport(Boolean esInicializar) {
		if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {			
			if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {
				//if(this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPeriodoImportExport();
			}
			
			this.inicializarActualizarBindingBotonesManualPeriodoImportExport(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPeriodoImportExport() {
		this.jButtonNuevoPeriodoImportExport.setVisible(this.isPermisoNuevoPeriodoImportExport);			
		this.jButtonDuplicarPeriodoImportExport.setVisible(this.isPermisoDuplicarPeriodoImportExport);			
		this.jButtonCopiarPeriodoImportExport.setVisible(this.isPermisoCopiarPeriodoImportExport);			
		this.jButtonVerFormPeriodoImportExport.setVisible(this.isPermisoVerFormPeriodoImportExport);			
		
		this.jButtonAbrirOrderByPeriodoImportExport.setVisible(this.isPermisoOrdenPeriodoImportExport);					
		
		this.jButtonNuevoRelacionesPeriodoImportExport.setVisible(this.isPermisoNuevoPeriodoImportExport);			
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonModificarPeriodoImportExport.setVisible(this.isPermisoActualizarPeriodoImportExport);	
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarPeriodoImportExport.setVisible(this.isPermisoActualizarPeriodoImportExport);	
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarPeriodoImportExport.setVisible(this.isPermisoEliminarPeriodoImportExport);
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarPeriodoImportExport.setVisible(this.isVisibilidadCeldaCancelarPeriodoImportExport);						
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosPeriodoImportExport.setVisible(this.isPermisoGuardarCambiosPeriodoImportExport);							
		}
		
		this.jButtonGuardarCambiosTablaPeriodoImportExport.setVisible(this.isPermisoActualizarPeriodoImportExport);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePeriodoImportExport() {
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonModificarPeriodoImportExport.setVisible(this.isPermisoActualizarPeriodoImportExport);	
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarPeriodoImportExport.setVisible(this.isPermisoActualizarPeriodoImportExport);	
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarPeriodoImportExport.setVisible(this.isPermisoEliminarPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarPeriodoImportExport.setVisible(this.isVisibilidadCeldaCancelarPeriodoImportExport);							
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosPeriodoImportExport.setVisible((this.isVisibilidadCeldaGuardarPeriodoImportExport && this.isPermisoGuardarCambiosPeriodoImportExport));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPeriodoImportExport() {
		if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPeriodoImportExport();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPeriodoImportExport() {
	}
	
	public void jTableDatosPeriodoImportExportListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPeriodoImportExport(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPeriodoImportExportBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.getperiodoimportexport(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoimportexport==null) {
						this.periodoimportexport = new PeriodoImportExport();
					}

					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.periodoimportexport,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
				}

				if(this.periodoimportexport.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.periodoimportexport.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoImportExport(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPeriodoImportExportBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.getperiodoimportexport(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoimportexport==null) {
						this.periodoimportexport = new PeriodoImportExport();
					}

					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.periodoimportexport,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
				}

				if(this.periodoimportexport.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.periodoimportexport.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoImportExport(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioPeriodoImportExportUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebPeriodoImportExport(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodoImportExport.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodoImportExport.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.getperiodoimportexport(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.periodoimportexportLogic.getConnexion());

				if(this.periodoimportexport.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.periodoimportexport.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodoImportExport=(TitledBorder)this.jScrollPanelDatosPeriodoImportExport.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderPeriodoImportExport.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioPeriodoImportExportBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.getperiodoimportexport(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoimportexport==null) {
						this.periodoimportexport = new PeriodoImportExport();
					}

					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.periodoimportexport,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
				}

				if(this.periodoimportexport.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.periodoimportexport.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoImportExport(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesPeriodoImportExportUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebPeriodoImportExport(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodoImportExport.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodoImportExport.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.getperiodoimportexport(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.periodoimportexportLogic.getConnexion());

				if(this.periodoimportexport.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.periodoimportexport.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodoImportExport=(TitledBorder)this.jScrollPanelDatosPeriodoImportExport.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderPeriodoImportExport.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesPeriodoImportExportBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.getperiodoimportexport(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoimportexport==null) {
						this.periodoimportexport = new PeriodoImportExport();
					}

					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.periodoimportexport,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);
				}

				if(this.periodoimportexport.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.periodoimportexport.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoImportExport(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodoImportExport(false,false);

			this.getPeriodoImportExportsBusquedaPorCodigo();

			this.inicializarActualizarBindingPeriodoImportExport(false);

			//if(PeriodoImportExportBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodoImportExport(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodoImportExport(false,false);

			this.getPeriodoImportExportsFK_IdAnio();

			this.inicializarActualizarBindingPeriodoImportExport(false);

			//if(PeriodoImportExportBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodoImportExport(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesPeriodoImportExportActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodoImportExport(false,false);

			this.getPeriodoImportExportsFK_IdMes();

			this.inicializarActualizarBindingPeriodoImportExport(false);

			//if(PeriodoImportExportBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodoImportExport(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoimportexportLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePeriodoImportExport() {
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
			this.jInternalFrameDetalleFormPeriodoImportExport.setVisible(false);	    			
			this.jInternalFrameDetalleFormPeriodoImportExport.dispose();
			this.jInternalFrameDetalleFormPeriodoImportExport=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPeriodoImportExport!=null) {
			this.jInternalFrameReporteDinamicoPeriodoImportExport.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPeriodoImportExport.dispose();
			this.jInternalFrameReporteDinamicoPeriodoImportExport=null;
		}
		
		if(this.jInternalFrameImportacionPeriodoImportExport!=null) {
			this.jInternalFrameImportacionPeriodoImportExport.setVisible(false);	    			
			this.jInternalFrameImportacionPeriodoImportExport.dispose();
			this.jInternalFrameImportacionPeriodoImportExport=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPeriodoImportExport();
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
			
			if(sTipo.equals("NuevoPeriodoImportExport")) {
				jButtonNuevoPeriodoImportExportActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPeriodoImportExport")) {
				jButtonDuplicarPeriodoImportExportActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPeriodoImportExport")) {
				jButtonCopiarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("VerFormPeriodoImportExport")) {
				jButtonVerFormPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPeriodoImportExport")) {
				jButtonNuevoPeriodoImportExportActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPeriodoImportExport")) {
				jButtonDuplicarPeriodoImportExportActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPeriodoImportExport")) {
				jButtonNuevoPeriodoImportExportActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPeriodoImportExport")) {
				jButtonDuplicarPeriodoImportExportActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPeriodoImportExport")) {
				jButtonNuevoPeriodoImportExportActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPeriodoImportExport")) {
				jButtonNuevoPeriodoImportExportActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPeriodoImportExport")) {
				jButtonNuevoPeriodoImportExportActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPeriodoImportExport")) {
				jButtonModificarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPeriodoImportExport")) {
				jButtonModificarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPeriodoImportExport")) {
				jButtonModificarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPeriodoImportExport")) {
				jButtonActualizarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPeriodoImportExport")) {
				jButtonActualizarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPeriodoImportExport")) {
				jButtonActualizarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("EliminarPeriodoImportExport")) {
				jButtonEliminarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPeriodoImportExport")) {
				jButtonEliminarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPeriodoImportExport")) {
				jButtonEliminarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("CancelarPeriodoImportExport")) {
				jButtonCancelarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPeriodoImportExport")) {
				jButtonCancelarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPeriodoImportExport")) {
				jButtonCancelarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("CerrarPeriodoImportExport")) {
				jButtonCerrarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPeriodoImportExport")) {
				jButtonCerrarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPeriodoImportExport")) {
				jButtonCerrarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPeriodoImportExport")) {
				jButtonMostrarOcultarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPeriodoImportExport")) {
				jButtonCancelarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPeriodoImportExport")) {
				jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPeriodoImportExport")) {
				jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPeriodoImportExport")) {
				jButtonCopiarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPeriodoImportExport")) {
				jButtonVerFormPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPeriodoImportExport")) {
				jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPeriodoImportExport")) {
				jButtonCopiarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPeriodoImportExport")) {
				jButtonVerFormPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPeriodoImportExport")) {
				jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPeriodoImportExport")) {
				jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPeriodoImportExport")) {
				jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPeriodoImportExport")) {
				jButtonRecargarInformacionPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPeriodoImportExport")) {
				jButtonRecargarInformacionPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPeriodoImportExport")) {
				jButtonRecargarInformacionPeriodoImportExportActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPeriodoImportExport")) {
				jButtonAnterioresPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPeriodoImportExport")) {
				jButtonAnterioresPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePeriodoImportExport")) {
				jButtonAnterioresPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPeriodoImportExport")) {
				jButtonSiguientesPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPeriodoImportExport")) {
				jButtonSiguientesPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPeriodoImportExport")) {
				jButtonSiguientesPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPeriodoImportExport") || sTipo.equals("MenuItemDetalleAbrirOrderByPeriodoImportExport")) {
				jButtonAbrirOrderByPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPeriodoImportExport") || sTipo.equals("MenuItemDetalleMostrarOcultarPeriodoImportExport")) {
				jButtonMostrarOcultarPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPeriodoImportExport")) {
				jButtonNuevoGuardarCambiosPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPeriodoImportExport")) {
				jButtonNuevoGuardarCambiosPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPeriodoImportExport")) {
				jButtonNuevoGuardarCambiosPeriodoImportExportActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPeriodoImportExport")) {
				jButtonCerrarReporteDinamicoPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPeriodoImportExport")) {
				jButtonGenerarReporteDinamicoPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPeriodoImportExport")) {
				
				jButtonGenerarExcelReporteDinamicoPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPeriodoImportExport")) {
				jButtonCerrarImportacionPeriodoImportExportActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPeriodoImportExport")) {
				
				jButtonGenerarImportacionPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPeriodoImportExport")) {
				
				jButtonAbrirImportacionPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPeriodoImportExport")) {
				jComboBoxTiposAccionesPeriodoImportExportActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPeriodoImportExport")) {
				jComboBoxTiposRelacionesPeriodoImportExportActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPeriodoImportExport")) {
				jComboBoxTiposAccionesPeriodoImportExportActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPeriodoImportExport")) {
				
				jComboBoxTiposSeleccionarPeriodoImportExportActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPeriodoImportExport")) {
				jTextFieldValorCampoGeneralPeriodoImportExportActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPeriodoImportExport")) {
				jButtonAbrirOrderByPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPeriodoImportExport")) {
				jButtonAbrirOrderByPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPeriodoImportExport")) {
				jButtonCerrarOrderByPeriodoImportExportActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPeriodoImportExportBusqueda")) {
				this.jButtonidPeriodoImportExportBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPeriodoImportExportBusqueda")) {
				this.jButtoncodigoPeriodoImportExportBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPeriodoImportExportUpdate")) {
				this.jButtonid_anioPeriodoImportExportUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPeriodoImportExportBusqueda")) {
				this.jButtonid_anioPeriodoImportExportBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPeriodoImportExportUpdate")) {
				this.jButtonid_mesPeriodoImportExportUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPeriodoImportExportBusqueda")) {
				this.jButtonid_mesPeriodoImportExportBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoPeriodoImportExport")) {
				this.jButtonBusquedaPorCodigoPeriodoImportExportActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdAnioPeriodoImportExport")) {
				this.jButtonFK_IdAnioPeriodoImportExportActionPerformed(evt);
			}
			
			;
			
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPeriodoImportExport();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoImportExportActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				


				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PeriodoImportExport periodoimportexportLocal=null;
			
			if(!this.getEsControlTabla()) {
				periodoimportexportLocal=this.periodoimportexport;
			} else {
				periodoimportexportLocal=this.periodoimportexportAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
							
				
				


				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoImportExportActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
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
			
			


			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoImportExportActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
								
						
				


				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
								
				
				


				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoImportExportActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoImportExportActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoImportExportActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
							
				
				


				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoImportExportActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
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
			
			


			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoImportExportActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
								
				
				


				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoImportExportActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoImportExportActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoImportExportActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPeriodoImportExport")) {
					jCheckBoxSeleccionarTodosPeriodoImportExportItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPeriodoImportExport")) {
					jCheckBoxSeleccionadosPeriodoImportExportItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPeriodoImportExport")) {
					
				}
				
				


				
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
												
				
				


				
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoImportExportActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoImportExportActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
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
			
			


			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoImportExportActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoimportexport);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoimportexport);
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
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
				
				


				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoImportExport.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoImportExport.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoImportExportActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoimportexportAnterior =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPeriodoImportExport")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPeriodoImportExportListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPeriodoImportExport.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.periodoimportexport =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.periodoimportexport =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.periodoimportexport);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPeriodoImportExport")) {
				
				}
				
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPeriodoImportExport")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPeriodoImportExport.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPeriodoImportExport")) {
			
			}
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPeriodoImportExport();
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
			if(sTipo.equals("NuevoPeriodoImportExport")) {
				jButtonNuevoPeriodoImportExportActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPeriodoImportExport")) {
				jButtonDuplicarPeriodoImportExportActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPeriodoImportExport")) {
				jButtonCopiarPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPeriodoImportExport")) {
				jButtonVerFormPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPeriodoImportExport")) {
				jButtonNuevoPeriodoImportExportActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPeriodoImportExport")) {
				jButtonModificarPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPeriodoImportExport")) {
				jButtonActualizarPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPeriodoImportExport")) {
				jButtonEliminarPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPeriodoImportExport")) {
				jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPeriodoImportExport")) {
				jButtonCancelarPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPeriodoImportExport")) {
				jButtonCerrarPeriodoImportExportActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPeriodoImportExport")) {
				jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPeriodoImportExport")) {
				jButtonNuevoGuardarCambiosPeriodoImportExportActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPeriodoImportExport")) {
				jButtonAbrirOrderByPeriodoImportExportActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPeriodoImportExport")) {
				jButtonRecargarInformacionPeriodoImportExportActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPeriodoImportExport")) {
				jButtonAnterioresPeriodoImportExportActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPeriodoImportExport")) {
				jButtonSiguientesPeriodoImportExportActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPeriodoImportExportBusqueda")) {
				this.jButtonidPeriodoImportExportBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPeriodoImportExportBusqueda")) {
				this.jButtoncodigoPeriodoImportExportBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPeriodoImportExportUpdate")) {
				this.jButtonid_anioPeriodoImportExportUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPeriodoImportExportBusqueda")) {
				this.jButtonid_anioPeriodoImportExportBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPeriodoImportExportUpdate")) {
				this.jButtonid_mesPeriodoImportExportUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPeriodoImportExportBusqueda")) {
				this.jButtonid_mesPeriodoImportExportBusquedaActionPerformed(evt);
			}
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPeriodoImportExport();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePeriodoImportExport")) {
				closingInternalFramePeriodoImportExport();
				
			} else if(sTipo.equals("jButtonCancelarPeriodoImportExport")) {
				JInternalFrameBase jInternalFrameDetalleFormPeriodoImportExport = (JInternalFrameBase)evt.getSource();
	            	
	            PeriodoImportExportBeanSwingJInternalFrame jInternalFrameParent=(PeriodoImportExportBeanSwingJInternalFrame)jInternalFrameDetalleFormPeriodoImportExport.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPeriodoImportExportActionPerformed(null);
			}
			
			PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.periodoimportexport,new Object(),this.periodoimportexportParameterGeneral,this.periodoimportexportReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPeriodoImportExport(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPeriodoImportExport(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPeriodoImportExport(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.periodoimportexport)) {
			if(!esControlTabla) {
				if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.periodoimportexport,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);			
				}
				
				if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPeriodoImportExport(this.periodoimportexport,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.periodoimportexportReturnGeneral=periodoimportexportLogic.procesarEventosPeriodoImportExportsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoimportexportLogic.getPeriodoImportExports(),this.periodoimportexport,this.periodoimportexportParameterGeneral,this.isEsNuevoPeriodoImportExport,classes);//this.periodoimportexportLogic.getPeriodoImportExport()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPeriodoImportExport(this.periodoimportexportReturnGeneral,this.periodoimportexportBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPeriodoImportExport(classes,this.periodoimportexportReturnGeneral,this.periodoimportexportBean,false);
					}
						
					if(this.periodoimportexportReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPeriodoImportExport(this.periodoimportexportReturnGeneral.getPeriodoImportExport());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPeriodoImportExport(this.periodoimportexportReturnGeneral.getPeriodoImportExport());	
					}
						
					if(this.periodoimportexportReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPeriodoImportExport(this.periodoimportexportReturnGeneral.getPeriodoImportExport(),classes);//this.periodoimportexportBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPeriodoImportExport(this.periodoimportexport,classes);//this.periodoimportexportBean);									
				}
			
				if(PeriodoImportExportJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPeriodoImportExport(this.periodoimportexport,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoImportExport(this.periodoimportexport);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.periodoimportexportAnterior!=null) {
						this.periodoimportexport=this.periodoimportexportAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.periodoimportexportReturnGeneral=periodoimportexportLogic.procesarEventosPeriodoImportExportsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoimportexportLogic.getPeriodoImportExports(),this.periodoimportexport,this.periodoimportexportParameterGeneral,this.isEsNuevoPeriodoImportExport,classes);//this.periodoimportexportLogic.getPeriodoImportExport()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.periodoimportexportSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.periodoimportexportSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.periodoimportexportReturnGeneral.getPeriodoImportExport(),periodoimportexportLogic.getPeriodoImportExports());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.periodoimportexportReturnGeneral.getPeriodoImportExport(),this.periodoimportexports);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPeriodoImportExport.repaint();
				
				//((AbstractTableModel) this.jTableDatosPeriodoImportExport.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPeriodoImportExport();
			}
		}
	}
	
	public void actualizarVisualTableDatosPeriodoImportExport() throws Exception {
		
		PeriodoImportExportModel periodoimportexportModel=(PeriodoImportExportModel)this.jTableDatosPeriodoImportExport.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periodoimportexportModel.periodoimportexports=this.periodoimportexportLogic.getPeriodoImportExports();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			periodoimportexportModel.periodoimportexports=this.periodoimportexports;
		}
		
		
		((PeriodoImportExportModel) this.jTableDatosPeriodoImportExport.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPeriodoImportExport() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getperiodoimportexportAnterior(),this.periodoimportexportLogic.getPeriodoImportExports());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getperiodoimportexportAnterior(),this.periodoimportexports);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPeriodoImportExport();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPeriodoImportExport(PeriodoImportExport periodoimportexport,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
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
										
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoimportexport,new Object(),generalEntityParameterGeneral,this.periodoimportexportReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.periodoimportexportSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PeriodoImportExportConstantesFunciones.getClassesRelationshipsOfPeriodoImportExport(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PeriodoImportExportConstantesFunciones.getClassesRelationshipsFromStringsOfPeriodoImportExport(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPeriodoImportExport(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PeriodoImportExportBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoimportexport,new Object(),generalEntityParameterGeneral,this.periodoimportexportReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPeriodoImportExport(PeriodoImportExportBean periodoimportexportBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPeriodoImportExport(ArrayList<Classe> classes,PeriodoImportExportReturnGeneral periodoimportexportReturnGeneral,PeriodoImportExportBean periodoimportexportBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPeriodoImportExport(PeriodoImportExport periodoimportexport,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.periodoimportexport)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPeriodoImportExport = new PeriodoImportExportDetalleFormJInternalFrame(jDesktopPane,this.periodoimportexportSessionBean.getConGuardarRelaciones(),this.periodoimportexportSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.setVisible(false);
		this.jInternalFrameDetalleFormPeriodoImportExport.setSelected(false);						
		
		this.jInternalFrameDetalleFormPeriodoImportExport.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPeriodoImportExport.periodoimportexportLogic=this.periodoimportexportLogic;
		
		this.cargarCombosFrameForeignKeyPeriodoImportExport("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePeriodoImportExport();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePeriodoImportExport();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPeriodoImportExport("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPeriodoImportExport();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPeriodoImportExport.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPeriodoImportExport"));
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonModificarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"ModificarPeriodoImportExport"));

		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonModificarToolBarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"ModificarToolBarPeriodoImportExport"));
					
		this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemModificarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"MenuItemModificarPeriodoImportExport"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"ActualizarPeriodoImportExport"));
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarToolBarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPeriodoImportExport"));
						
		this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemActualizarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPeriodoImportExport"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"EliminarPeriodoImportExport"));
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"EliminarToolBarPeriodoImportExport"));
								
		this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemEliminarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPeriodoImportExport"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"CancelarPeriodoImportExport"));
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"CancelarToolBarPeriodoImportExport"));
					
		this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemCancelarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPeriodoImportExport"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemDetalleCerrarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPeriodoImportExport"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodoImportExport"));
		
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodoImportExport"));
		
		
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPeriodoImportExport"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonidPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoImportExportBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtoncodigoPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"codigoPeriodoImportExportBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_anioPeriodoImportExportUpdate.addActionListener(new ButtonActionListener(this,"id_anioPeriodoImportExportUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_anioPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPeriodoImportExportBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_mesPeriodoImportExportUpdate.addActionListener(new ButtonActionListener(this,"id_mesPeriodoImportExportUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_mesPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPeriodoImportExportBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPeriodoImportExport.jTabbedPaneRelacionesPeriodoImportExport.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPeriodoImportExport"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePeriodoImportExport"));
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPeriodoImportExport"));
		}
		
		this.jTableDatosPeriodoImportExport.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPeriodoImportExport"));
		
		this.jTableDatosPeriodoImportExport.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPeriodoImportExport"));
		
		this.jButtonNuevoPeriodoImportExport.addActionListener(new ButtonActionListener(this,"NuevoPeriodoImportExport"));
		
		this.jButtonDuplicarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"DuplicarPeriodoImportExport"));
		
		this.jButtonCopiarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"CopiarPeriodoImportExport"));
		
		this.jButtonVerFormPeriodoImportExport.addActionListener(new ButtonActionListener(this,"VerFormPeriodoImportExport"));
		
		
		this.jButtonNuevoToolBarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"NuevoToolBarPeriodoImportExport"));
			
		this.jButtonDuplicarToolBarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPeriodoImportExport"));
			
		this.jMenuItemNuevoPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPeriodoImportExport"));
			
		this.jMenuItemDuplicarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPeriodoImportExport"));		
		
		
		this.jButtonNuevoRelacionesPeriodoImportExport.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPeriodoImportExport"));
		
		
		this.jButtonNuevoRelacionesToolBarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPeriodoImportExport"));
			
		this.jMenuItemNuevoRelacionesPeriodoImportExport.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPeriodoImportExport"));		
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonModificarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"ModificarPeriodoImportExport"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonModificarToolBarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"ModificarToolBarPeriodoImportExport"));
			
			this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemModificarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"MenuItemModificarPeriodoImportExport"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"ActualizarPeriodoImportExport"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonActualizarToolBarPeriodoImportExport.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPeriodoImportExport"));
				
			this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemActualizarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPeriodoImportExport"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"EliminarPeriodoImportExport"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonEliminarToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"EliminarToolBarPeriodoImportExport"));
						
			this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemEliminarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPeriodoImportExport"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"CancelarPeriodoImportExport"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonCancelarToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"CancelarToolBarPeriodoImportExport"));
			
			this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemCancelarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPeriodoImportExport"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPeriodoImportExport"));		
		
		
		this.jButtonCerrarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"CerrarPeriodoImportExport"));
		
		
		this.jButtonCerrarToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"CerrarToolBarPeriodoImportExport"));
			
		this.jMenuItemCerrarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPeriodoImportExport"));
			
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jMenuItemDetalleCerrarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPeriodoImportExport"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosPeriodoImportExport.addActionListener (new ButtonActionListener(this,"GuardarCambiosPeriodoImportExport"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodoImportExport"));
		}
		
		this.jButtonCopiarToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"CopiarToolBarPeriodoImportExport"));
			
		this.jButtonVerFormToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"VerFormToolBarPeriodoImportExport"));
		
		this.jMenuItemGuardarCambiosPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPeriodoImportExport"));
			
		this.jMenuItemCopiarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPeriodoImportExport"));		
		
		this.jMenuItemVerFormPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPeriodoImportExport"));		
		
		
		this.jButtonGuardarCambiosTablaPeriodoImportExport.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPeriodoImportExport"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPeriodoImportExport"));
			
		this.jMenuItemGuardarCambiosTablaPeriodoImportExport.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPeriodoImportExport"));		
		
		
		
		this.jButtonRecargarInformacionPeriodoImportExport.addActionListener (new ButtonActionListener(this,"RecargarInformacionPeriodoImportExport"));
					
		this.jButtonRecargarInformacionToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPeriodoImportExport"));
		
		this.jMenuItemRecargarInformacionPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPeriodoImportExport"));		
		
		
		
		this.jButtonAnterioresPeriodoImportExport.addActionListener (new ButtonActionListener(this,"AnterioresPeriodoImportExport"));
		
		
		this.jButtonAnterioresToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPeriodoImportExport"));
		
		this.jMenuItemAnterioresPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPeriodoImportExport"));		
		
		
		this.jButtonSiguientesPeriodoImportExport.addActionListener (new ButtonActionListener(this,"SiguientesPeriodoImportExport"));
		
		
		this.jButtonSiguientesToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPeriodoImportExport"));
			
		this.jMenuItemSiguientesPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPeriodoImportExport"));
			
		this.jMenuItemAbrirOrderByPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPeriodoImportExport"));
			
		this.jMenuItemMostrarOcultarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPeriodoImportExport"));
			
		this.jMenuItemDetalleAbrirOrderByPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPeriodoImportExport"));
			
		this.jMenuItemDetalleMostarOcultarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPeriodoImportExport"));		
		
		
		this.jButtonNuevoGuardarCambiosPeriodoImportExport.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPeriodoImportExport"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPeriodoImportExport"));
			
		this.jMenuItemNuevoGuardarCambiosPeriodoImportExport.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPeriodoImportExport"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPeriodoImportExport.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPeriodoImportExport"));

		this.jCheckBoxSeleccionadosPeriodoImportExport.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPeriodoImportExport"));
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPeriodoImportExport"));
		}
		
		
		this.jComboBoxTiposRelacionesPeriodoImportExport.addActionListener (new ButtonActionListener(this,"TiposRelacionesPeriodoImportExport"));
			
		this.jComboBoxTiposAccionesPeriodoImportExport.addActionListener (new ButtonActionListener(this,"TiposAccionesPeriodoImportExport"));
					
		this.jComboBoxTiposSeleccionarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPeriodoImportExport"));
			
		this.jTextFieldValorCampoGeneralPeriodoImportExport.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPeriodoImportExport"));		
		
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonidPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoImportExportBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtoncodigoPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"codigoPeriodoImportExportBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_anioPeriodoImportExportUpdate.addActionListener(new ButtonActionListener(this,"id_anioPeriodoImportExportUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_anioPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPeriodoImportExportBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_mesPeriodoImportExportUpdate.addActionListener(new ButtonActionListener(this,"id_mesPeriodoImportExportUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_mesPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPeriodoImportExportBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoPeriodoImportExport.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPeriodoImportExport"));

			this.jButtonFK_IdAnioPeriodoImportExport.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodoImportExport"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPeriodoImportExport!=null) {
				this.jInternalFrameReporteDinamicoPeriodoImportExport.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodoImportExport"));
				this.jInternalFrameReporteDinamicoPeriodoImportExport.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodoImportExport"));
				this.jInternalFrameReporteDinamicoPeriodoImportExport.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodoImportExport"));
			}
			
			//this.jButtonCerrarReporteDinamicoPeriodoImportExport.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodoImportExport"));				
			//this.jButtonGenerarReporteDinamicoPeriodoImportExport.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodoImportExport"));
			//this.jButtonGenerarExcelReporteDinamicoPeriodoImportExport.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodoImportExport"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPeriodoImportExport!=null) {
				this.jInternalFrameImportacionPeriodoImportExport.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPeriodoImportExport"));
				this.jInternalFrameImportacionPeriodoImportExport.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPeriodoImportExport"));
				this.jInternalFrameImportacionPeriodoImportExport.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPeriodoImportExport"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPeriodoImportExport.addActionListener (new ButtonActionListener(this,"AbrirOrderByPeriodoImportExport"));
			
			this.jButtonAbrirOrderByToolBarPeriodoImportExport.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPeriodoImportExport"));			
			
			if(this.jInternalFrameOrderByPeriodoImportExport!=null) {
				this.jInternalFrameOrderByPeriodoImportExport.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPeriodoImportExport"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoImportExport.jTabbedPaneRelacionesPeriodoImportExport.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPeriodoImportExport"));
		
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
            		closingInternalFramePeriodoImportExport();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPeriodoImportExport.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPeriodoImportExport = (JInternalFrameBase)event.getSource();
	            	
	            PeriodoImportExportBeanSwingJInternalFrame jInternalFrameParent=(PeriodoImportExportBeanSwingJInternalFrame)jInternalFrameDetalleFormPeriodoImportExport.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPeriodoImportExportActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPeriodoImportExport.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPeriodoImportExportListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPeriodoImportExport.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPeriodoImportExport.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoImportExportActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoImportExportActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoImportExportActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPeriodoImportExport";
		inputMap = this.jButtonNuevoPeriodoImportExport.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPeriodoImportExport.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPeriodoImportExportActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoImportExportActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoImportExportActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoImportExportActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPeriodoImportExport";
		inputMap = this.jButtonNuevoRelacionesPeriodoImportExport.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPeriodoImportExport.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPeriodoImportExportActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPeriodoImportExport";
		inputMap = this.jButtonModificarPeriodoImportExport.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPeriodoImportExport.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPeriodoImportExportActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPeriodoImportExport";
		inputMap = this.jButtonActualizarPeriodoImportExport.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPeriodoImportExport.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPeriodoImportExportActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPeriodoImportExport";
		inputMap = this.jButtonEliminarPeriodoImportExport.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPeriodoImportExport.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPeriodoImportExportActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPeriodoImportExport";
		inputMap = this.jButtonCancelarPeriodoImportExport.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPeriodoImportExport.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPeriodoImportExportActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPeriodoImportExport";
		inputMap = this.jButtonCerrarPeriodoImportExport.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPeriodoImportExport.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPeriodoImportExportActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPeriodoImportExport";
		inputMap = this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosPeriodoImportExport.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonGuardarCambiosPeriodoImportExport.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPeriodoImportExportActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPeriodoImportExport.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPeriodoImportExportItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPeriodoImportExport.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPeriodoImportExportActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPeriodoImportExport.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPeriodoImportExportActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPeriodoImportExport.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPeriodoImportExportActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonidPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoImportExportBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtoncodigoPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"codigoPeriodoImportExportBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_anioPeriodoImportExportUpdate.addActionListener(new ButtonActionListener(this,"id_anioPeriodoImportExportUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_anioPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPeriodoImportExportBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_mesPeriodoImportExportUpdate.addActionListener(new ButtonActionListener(this,"id_mesPeriodoImportExportUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoImportExport.jButtonid_mesPeriodoImportExportBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPeriodoImportExportBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoPeriodoImportExport.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPeriodoImportExport"));

		this.jButtonFK_IdAnioPeriodoImportExport.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodoImportExport"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPeriodoImportExport.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPeriodoImportExportActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPeriodoImportExportActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPeriodoImportExport.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPeriodoImportExport(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PeriodoImportExport periodoimportexportAux:this.periodoimportexportLogic.getPeriodoImportExports()) {
					periodoimportexportAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoImportExport periodoimportexportAux:periodoimportexports) {
					periodoimportexportAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPeriodoImportExportItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPeriodoImportExport(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PeriodoImportExport periodoimportexportAux:this.periodoimportexportLogic.getPeriodoImportExports()) {
						periodoimportexportAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PeriodoImportExport periodoimportexportAux:periodoimportexports) {
						periodoimportexportAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PeriodoImportExport periodoimportexportAux:this.periodoimportexportLogic.getPeriodoImportExports()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PeriodoImportExport periodoimportexportAux:periodoimportexports) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPeriodoImportExport(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPeriodoImportExport.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPeriodoImportExport.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExport,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPeriodoImportExportItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPeriodoImportExport(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPeriodoImportExport.getSelectedRows();
			
			PeriodoImportExport periodoimportexportLocal=new PeriodoImportExport();
			
			//this.seleccionarTodosPeriodoImportExport(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoimportexportLocal =(PeriodoImportExport) this.periodoimportexportLogic.getPeriodoImportExports().toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					periodoimportexportLocal =(PeriodoImportExport) this.periodoimportexports.toArray()[this.jTableDatosPeriodoImportExport.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				periodoimportexportLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PeriodoImportExport periodoimportexportAux:this.periodoimportexportLogic.getPeriodoImportExports()) {
						periodoimportexportAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PeriodoImportExport periodoimportexportAux:periodoimportexports) {
						periodoimportexportAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPeriodoImportExport(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPeriodoImportExport.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPeriodoImportExport.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPeriodoImportExport,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPeriodoImportExportItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPeriodoImportExportParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPeriodoImportExportActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPeriodoImportExport(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPeriodoImportExport.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PeriodoImportExport periodoimportexportAux:this.periodoimportexportLogic.getPeriodoImportExports()) {
				
						if(sTipoSeleccionar.equals(PeriodoImportExportConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							periodoimportexportAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoImportExport periodoimportexportAux:periodoimportexports) {
					
						if(sTipoSeleccionar.equals(PeriodoImportExportConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							periodoimportexportAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPeriodoImportExport(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPeriodoImportExportActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPeriodoImportExport(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPeriodoImportExport=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPeriodoImportExport.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePeriodoImportExport) {				
					conSplash=true;//false;										
					
					//this.startProcessPeriodoImportExport(conSplash);
				
					this.generarReportePeriodoImportExportsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPeriodoImportExportsSeleccionados();
				//this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPeriodoImportExportsSeleccionados(false);
				//this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPeriodoImportExportsSeleccionados(true);
				//this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPeriodoImportExport();
				
				this.exportarPeriodoImportExportsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPeriodoImportExports();
				//this.importarPeriodoImportExports();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPeriodoImportExport();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPeriodoImportExportsSeleccionados();
				//this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Periodo Importar Exportar", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPeriodoImportExport();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPeriodoImportExport)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPeriodoImportExport(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.setSelectedIndex(0);					
				}	
			} 			
			else if(PeriodoImportExportBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePeriodoImportExport) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPeriodoImportExport(conSplash);
					
						//this.actualizarParametrosGeneralPeriodoImportExport();
						
						this.generarReporteProcesoAccionPeriodoImportExportsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PeriodoImportExportBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Periodo Importar ExportarS SELECCIONADOS?", "MANTENIMIENTO DE Periodo Importar Exportar", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPeriodoImportExport();
				
						this.actualizarParametrosGeneralPeriodoImportExport();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.periodoimportexportReturnGeneral=periodoimportexportLogic.procesarAccionPeriodoImportExportsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.periodoimportexportLogic.getPeriodoImportExports(),this.periodoimportexportParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPeriodoImportExportReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPeriodoImportExport();
					
					PeriodoImportExportBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPeriodoImportExportReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPeriodoImportExport.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxTiposAccionesFormularioPeriodoImportExport.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPeriodoImportExport(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPeriodoImportExportActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPeriodoImportExport();
			
			if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();		
			PeriodoImportExport periodoimportexport=new PeriodoImportExport();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPeriodoImportExport(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPeriodoImportExport.getSelectedItem();
			
			
			
			
			periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
			//this.sTipoAccion;
			
			if(periodoimportexportsSeleccionados.size()==1) {
				for(PeriodoImportExport periodoimportexportAux:periodoimportexportsSeleccionados) {
					periodoimportexport=periodoimportexportAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPeriodoImportExport();
			
      		//this.finishProcessPeriodoImportExport(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPeriodoImportExportReturnGeneral() throws Exception {
		if(this.periodoimportexportReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.periodoimportexportReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.periodoimportexportReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.periodoimportexportReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.periodoimportexportReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.periodoimportexportReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPeriodoImportExport(false);
		}
		
		if(this.periodoimportexportReturnGeneral.getConRetornoLista() || this.periodoimportexportReturnGeneral.getConRetornoObjeto()) {
			if(this.periodoimportexportReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.periodoimportexportLogic.setPeriodoImportExports(this.periodoimportexportReturnGeneral.getPeriodoImportExports());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.periodoimportexportReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.periodoimportexportLogic.setPeriodoImportExport(this.periodoimportexportReturnGeneral.getPeriodoImportExport());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPeriodoImportExport(false);
		}
	}
	
	public void actualizarParametrosGeneralPeriodoImportExport() throws Exception {
		
		
	}
	
	public ArrayList<PeriodoImportExport> getPeriodoImportExportsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPeriodoImportExport) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PeriodoImportExport periodoimportexportAux:periodoimportexportLogic.getPeriodoImportExports()) {
					if(periodoimportexportAux.getIsSelected()) {
						periodoimportexportsSeleccionados.add(periodoimportexportAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoImportExport periodoimportexportAux:this.periodoimportexports) {
					if(periodoimportexportAux.getIsSelected()) {
						periodoimportexportsSeleccionados.add(periodoimportexportAux);				
					}
				}
			}
			
			if(periodoimportexportsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						periodoimportexportsSeleccionados.addAll(this.periodoimportexportLogic.getPeriodoImportExports());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						periodoimportexportsSeleccionados.addAll(this.periodoimportexports);				
					}
				}
			}
		} else {
			periodoimportexportsSeleccionados.add(this.periodoimportexport);
		}
		
		return periodoimportexportsSeleccionados;
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
	
	public void generarReportePeriodoImportExportsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPeriodoImportExportsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPeriodoImportExportsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPeriodoImportExportsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPeriodoImportExportsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Periodo Importar Exportar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPeriodoImportExportsSeleccionados() throws Exception {
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();		
		
		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePeriodoImportExports("Todos",periodoimportexportsSeleccionados);
		
	}	
	
	public void generarReporteNormalPeriodoImportExportsSeleccionados() throws Exception {
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();		
		
		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePeriodoImportExports("Todos",periodoimportexportsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPeriodoImportExportsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();
		
		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePeriodoImportExports("Todos",periodoimportexportsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPeriodoImportExportsSeleccionados() throws Exception {
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPeriodoImportExport();
		
		
		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPeriodoImportExport();
		
		
		//this.generarReportePeriodoImportExports("Todos",periodoimportexportsSeleccionados ,periodoimportexportImplementable,periodoimportexportImplementableHome);
	}
	
	public void mostrarImportacionPeriodoImportExports() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPeriodoImportExport();
		
		this.abrirFrameImportacionPeriodoImportExport();		
		
			
		//this.generarReportePeriodoImportExports("Todos",periodoimportexportsSeleccionados ,periodoimportexportImplementable,periodoimportexportImplementableHome);
	}
	
	public void importarPeriodoImportExports() throws Exception {		
	
	}
	
	public void exportarPeriodoImportExportsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPeriodoImportExportsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPeriodoImportExportsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPeriodoImportExportsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Periodo Importar Exportar",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPeriodoImportExportsSeleccionados() throws Exception {
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();		
		
		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoimportexport."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPeriodoImportExport(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PeriodoImportExport periodoimportexportAux:periodoimportexportsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPeriodoImportExport(periodoimportexportAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//periodoimportexportAux.setsDetalleGeneralEntityReporte(periodoimportexportAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPeriodoImportExport(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PeriodoImportExportConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoImportExportConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoImportExportConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoImportExportConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoImportExportConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPeriodoImportExport(PeriodoImportExport periodoimportexport,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=periodoimportexport.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoimportexport.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoimportexport.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoimportexport.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoimportexport.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPeriodoImportExportsSeleccionados() throws Exception {
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();		
		
		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoimportexport.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PeriodoImportExports");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPeriodoImportExport(row);				
				iRow++;
			}				
			
			for(PeriodoImportExport periodoimportexportAux:periodoimportexportsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPeriodoImportExport(periodoimportexportAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPeriodoImportExportsSeleccionados() throws Exception {
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();		
		
		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoimportexport.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("periodoimportexports");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("periodoimportexport");
			//elementRoot.appendChild(element);
		
			for(PeriodoImportExport periodoimportexportAux:periodoimportexportsSeleccionados) {
				element = document.createElement("periodoimportexport");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPeriodoImportExport(periodoimportexportAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Importar Exportar",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPeriodoImportExport(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoImportExportConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPeriodoImportExport(PeriodoImportExport periodoimportexport,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(periodoimportexport.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(periodoimportexport.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(periodoimportexport.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periodoimportexport.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlPeriodoImportExport(PeriodoImportExport periodoimportexport,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PeriodoImportExportConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(periodoimportexport.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PeriodoImportExportConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(periodoimportexport.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(PeriodoImportExportConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(periodoimportexport.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementanio_descripcion = document.createElement(PeriodoImportExportConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(periodoimportexport.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(PeriodoImportExportConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(periodoimportexport.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoPeriodoImportExportsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados=new ArrayList<PeriodoImportExport>();
		
		periodoimportexportsSeleccionados=this.getPeriodoImportExportsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPeriodoImportExport(periodoimportexportsSeleccionados);
		
		this.generarReportePeriodoImportExports("Todos",periodoimportexportsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPeriodoImportExport(ArrayList<PeriodoImportExport> periodoimportexportsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PeriodoImportExport periodoimportexportAux:periodoimportexportsSeleccionados) {
				periodoimportexportAux.setsDetalleGeneralEntityReporte(periodoimportexportAux.toString());
			
				if(sTipoSeleccionar.equals(PeriodoImportExportConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					periodoimportexportAux.setsDescripcionGeneralEntityReporte1(periodoimportexportAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PeriodoImportExportConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					periodoimportexportAux.setsDescripcionGeneralEntityReporte1(periodoimportexportAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoImportExportConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					periodoimportexportAux.setsDescripcionGeneralEntityReporte1(periodoimportexportAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoImportExportConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPeriodoImportExport(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPeriodoImportExport=true;
				this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=true;
				this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=true;
			}
			
			this.isVisibilidadCeldaModificarPeriodoImportExport=false;
			this.isVisibilidadCeldaActualizarPeriodoImportExport=false;
			this.isVisibilidadCeldaEliminarPeriodoImportExport=false;
			this.isVisibilidadCeldaCancelarPeriodoImportExport=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPeriodoImportExport=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=false;
			this.isVisibilidadCeldaModificarPeriodoImportExport=false;
			this.isVisibilidadCeldaActualizarPeriodoImportExport=true;
			this.isVisibilidadCeldaEliminarPeriodoImportExport=false;
			this.isVisibilidadCeldaCancelarPeriodoImportExport=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPeriodoImportExport=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=false;
			this.isVisibilidadCeldaModificarPeriodoImportExport=false;
			this.isVisibilidadCeldaActualizarPeriodoImportExport=true;
			this.isVisibilidadCeldaEliminarPeriodoImportExport=true;
			this.isVisibilidadCeldaCancelarPeriodoImportExport=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPeriodoImportExport=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=false;
			this.isVisibilidadCeldaModificarPeriodoImportExport=false;
			this.isVisibilidadCeldaActualizarPeriodoImportExport=true;
			this.isVisibilidadCeldaEliminarPeriodoImportExport=false;
			this.isVisibilidadCeldaCancelarPeriodoImportExport=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPeriodoImportExport=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=true;
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=true;
			this.isVisibilidadCeldaModificarPeriodoImportExport=false;
			this.isVisibilidadCeldaActualizarPeriodoImportExport=false;
			this.isVisibilidadCeldaEliminarPeriodoImportExport=false;
			this.isVisibilidadCeldaCancelarPeriodoImportExport=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPeriodoImportExport=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=false;
			this.isVisibilidadCeldaActualizarPeriodoImportExport=false;
			this.isVisibilidadCeldaEliminarPeriodoImportExport=false;
			this.isVisibilidadCeldaCancelarPeriodoImportExport=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPeriodoImportExport=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=false;
			this.isVisibilidadCeldaModificarPeriodoImportExport=true;
			this.isVisibilidadCeldaActualizarPeriodoImportExport=false;
			this.isVisibilidadCeldaEliminarPeriodoImportExport=false;
			this.isVisibilidadCeldaCancelarPeriodoImportExport=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoImportExport=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PeriodoImportExportJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPeriodoImportExport=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=true;
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=true;
		} else {
			this.actualizarEstadoPanelsPeriodoImportExport(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPeriodoImportExport=false;
			//this.isVisibilidadCeldaVerFormPeriodoImportExport=false;
			this.isVisibilidadCeldaDuplicarPeriodoImportExport=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!periodoimportexportSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;
		} else {
			this.isVisibilidadCeldaNuevoPeriodoImportExport=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoImportExport=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			if(!periodoimportexportSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;												
			}
			
			this.jButtonCerrarPeriodoImportExport.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPeriodoImportExport=false;
		}
		
		if(!this.permiteMantenimiento(this.periodoimportexport)) {
			this.isVisibilidadCeldaActualizarPeriodoImportExport=false;
			this.isVisibilidadCeldaEliminarPeriodoImportExport=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPeriodoImportExport() {
	}
	
	public void actualizarEstadoPanelsPeriodoImportExport(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPeriodoImportExport!=null) {
				this.jScrollPanelDatosEdicionPeriodoImportExport.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoImportExport!=null) {
				this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoImportExport!=null) {
				this.jScrollPanelDatosPeriodoImportExport.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoImportExport!=null) {
				this.jPanelPaginacionPeriodoImportExport.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoImportExport!=null) {
				this.jPanelParametrosReportesPeriodoImportExport.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPeriodoImportExport!=null) {
				this.jScrollPanelDatosEdicionPeriodoImportExport.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoImportExport!=null) {
				this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPeriodoImportExport!=null) {
				this.jScrollPanelDatosPeriodoImportExport.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodoImportExport!=null) {
				this.jPanelPaginacionPeriodoImportExport.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodoImportExport!=null) {
				this.jPanelParametrosReportesPeriodoImportExport.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPeriodoImportExport!=null) {
				this.jScrollPanelDatosEdicionPeriodoImportExport.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoImportExport!=null) {
				this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoImportExport!=null) {
				this.jScrollPanelDatosPeriodoImportExport.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodoImportExport!=null) {
				this.jPanelPaginacionPeriodoImportExport.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodoImportExport!=null) {
				this.jPanelParametrosReportesPeriodoImportExport.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPeriodoImportExport!=null) {
				this.jScrollPanelDatosEdicionPeriodoImportExport.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoImportExport!=null) {
				this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoImportExport!=null) {
				this.jScrollPanelDatosPeriodoImportExport.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodoImportExport!=null) {
				this.jPanelPaginacionPeriodoImportExport.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodoImportExport!=null) {
				this.jPanelParametrosReportesPeriodoImportExport.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPeriodoImportExport!=null) {
				this.jScrollPanelDatosEdicionPeriodoImportExport.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoImportExport!=null) {
				this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoImportExport!=null) {
				this.jScrollPanelDatosPeriodoImportExport.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoImportExport!=null) {
				this.jPanelPaginacionPeriodoImportExport.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoImportExport!=null) {
				this.jPanelParametrosReportesPeriodoImportExport.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPeriodoImportExport!=null) {
				this.jScrollPanelDatosEdicionPeriodoImportExport.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoImportExport!=null) {
				this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoImportExport!=null) {
				this.jScrollPanelDatosPeriodoImportExport.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoImportExport!=null) {
				this.jPanelPaginacionPeriodoImportExport.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoImportExport!=null) {
				this.jPanelParametrosReportesPeriodoImportExport.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPeriodoImportExport!=null) {
				this.jScrollPanelDatosEdicionPeriodoImportExport.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoImportExport!=null) {
				this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoImportExport!=null) {
				this.jScrollPanelDatosPeriodoImportExport.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoImportExport!=null) {
				this.jPanelPaginacionPeriodoImportExport.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoImportExport!=null) {
				this.jPanelParametrosReportesPeriodoImportExport.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPeriodoImportExport!=null) {
					this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPeriodoImportExport!=null) {
				this.jPanelParametrosReportesPeriodoImportExport.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.periodoimportexportSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoImportExport!=null) {
				this.jTabbedPaneBusquedasPeriodoImportExport.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPeriodoImportExport!=null) {
				this.jPanelParametrosReportesPeriodoImportExport.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaPorCodigo=isParaAnioNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPeriodoImportExport.remove(jPanelBusquedaPorCodigoPeriodoImportExport);}

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasPeriodoImportExport.remove(jPanelFK_IdAnioPeriodoImportExport);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaPorCodigo=isParaMesNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPeriodoImportExport.remove(jPanelBusquedaPorCodigoPeriodoImportExport);}

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasPeriodoImportExport.remove(jPanelFK_IdAnioPeriodoImportExport);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PeriodoImportExportSessionBean periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
		
		if(this.periodoimportexportSessionBean==null) {
			this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
		}
		
		this.periodoimportexportSessionBean.setsUltimaBusquedaPeriodoImportExport(this.getsAccionBusqueda());
		this.periodoimportexportSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.periodoimportexportSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			periodoimportexportSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			periodoimportexportSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PeriodoImportExportSessionBean periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
		
		if(this.periodoimportexportSessionBean==null) {
			this.periodoimportexportSessionBean=new PeriodoImportExportSessionBean();
		}
		
		if(this.periodoimportexportSessionBean.getsUltimaBusquedaPeriodoImportExport()!=null&&!this.periodoimportexportSessionBean.getsUltimaBusquedaPeriodoImportExport().equals("")) {
			this.setsAccionBusqueda(periodoimportexportSessionBean.getsUltimaBusquedaPeriodoImportExport());
			this.setiNumeroPaginacion(periodoimportexportSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(periodoimportexportSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(periodoimportexportSessionBean.getcodigo());
				periodoimportexportSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(periodoimportexportSessionBean.getid_anio());
				periodoimportexportSessionBean.setid_anio(null);
			}
		}
		
		this.periodoimportexportSessionBean.setsUltimaBusquedaPeriodoImportExport("");
		this.periodoimportexportSessionBean.setiNumeroPaginacion(PeriodoImportExportConstantesFunciones.INUMEROPAGINACION);
		this.periodoimportexportSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPeriodoImportExport(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPeriodoImportExport() {
		this.updateBorderResaltarBusquedasFormularioPeriodoImportExport();
		this.updateVisibilidadBusquedasFormularioPeriodoImportExport();
		this.updateHabilitarBusquedasFormularioPeriodoImportExport();
	}
	
	public void updateBorderResaltarBusquedasFormularioPeriodoImportExport() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPeriodoImportExport.getComponents().length>0) {
	

		if(this.periodoimportexportConstantesFunciones.resaltarBusquedaPorCodigoPeriodoImportExport!=null) {
			index= this.jTabbedPaneBusquedasPeriodoImportExport.indexOfComponent(this.jPanelBusquedaPorCodigoPeriodoImportExport);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoImportExport.getComponent(index);
				jPanel.setBorder(this.periodoimportexportConstantesFunciones.resaltarBusquedaPorCodigoPeriodoImportExport);
			}
		}

		if(this.periodoimportexportConstantesFunciones.resaltarFK_IdAnioPeriodoImportExport!=null) {
			index= this.jTabbedPaneBusquedasPeriodoImportExport.indexOfComponent(this.jPanelFK_IdAnioPeriodoImportExport);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoImportExport.getComponent(index);
				jPanel.setBorder(this.periodoimportexportConstantesFunciones.resaltarFK_IdAnioPeriodoImportExport);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPeriodoImportExport() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPeriodoImportExport.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPeriodoImportExport.indexOfComponent(this.jPanelBusquedaPorCodigoPeriodoImportExport);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoImportExport.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.periodoimportexportConstantesFunciones.mostrarBusquedaPorCodigoPeriodoImportExport);
			if(!this.periodoimportexportConstantesFunciones.mostrarBusquedaPorCodigoPeriodoImportExport && index>-1) {
				this.jTabbedPaneBusquedasPeriodoImportExport.remove(index);
			}

			index= this.jTabbedPaneBusquedasPeriodoImportExport.indexOfComponent(this.jPanelFK_IdAnioPeriodoImportExport);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoImportExport.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.periodoimportexportConstantesFunciones.mostrarFK_IdAnioPeriodoImportExport);
			if(!this.periodoimportexportConstantesFunciones.mostrarFK_IdAnioPeriodoImportExport && index>-1) {
				this.jTabbedPaneBusquedasPeriodoImportExport.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPeriodoImportExport() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPeriodoImportExport.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPeriodoImportExport.indexOfComponent(this.jPanelBusquedaPorCodigoPeriodoImportExport);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoImportExport.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.periodoimportexportConstantesFunciones.activarBusquedaPorCodigoPeriodoImportExport);
				this.jTabbedPaneBusquedasPeriodoImportExport.setEnabledAt(index,this.periodoimportexportConstantesFunciones.activarBusquedaPorCodigoPeriodoImportExport);
			}

			index= this.jTabbedPaneBusquedasPeriodoImportExport.indexOfComponent(this.jPanelFK_IdAnioPeriodoImportExport);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoImportExport.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.periodoimportexportConstantesFunciones.activarFK_IdAnioPeriodoImportExport);
				this.jTabbedPaneBusquedasPeriodoImportExport.setEnabledAt(index,this.periodoimportexportConstantesFunciones.activarFK_IdAnioPeriodoImportExport);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPeriodoImportExport(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasPeriodoImportExport.indexOfComponent(this.jPanelBusquedaPorCodigoPeriodoImportExport);

			this.jTabbedPaneBusquedasPeriodoImportExport.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoImportExport.getComponent(index);

			this.periodoimportexportConstantesFunciones.setResaltarBusquedaPorCodigoPeriodoImportExport(resaltar);

			jPanel.setBorder(this.periodoimportexportConstantesFunciones.resaltarBusquedaPorCodigoPeriodoImportExport);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasPeriodoImportExport.indexOfComponent(this.jPanelFK_IdAnioPeriodoImportExport);

			this.jTabbedPaneBusquedasPeriodoImportExport.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPeriodoImportExport.getComponent(index);

			this.periodoimportexportConstantesFunciones.setResaltarFK_IdAnioPeriodoImportExport(resaltar);

			jPanel.setBorder(this.periodoimportexportConstantesFunciones.resaltarFK_IdAnioPeriodoImportExport);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPeriodoImportExport.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPeriodoImportExport() throws Exception {

		if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPeriodoImportExport();
		this.updateVisibilidadResaltarControlesFormularioPeriodoImportExport();
		this.updateHabilitarResaltarControlesFormularioPeriodoImportExport();
		
	}
	
	public void updateBorderResaltarControlesFormularioPeriodoImportExport() throws Exception {
		if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.periodoimportexportConstantesFunciones.resaltaridPeriodoImportExport!=null && this.jInternalFrameDetalleFormPeriodoImportExport!=null) {this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.setBorder(this.periodoimportexportConstantesFunciones.resaltaridPeriodoImportExport);}
		if(this.periodoimportexportConstantesFunciones.resaltarcodigoPeriodoImportExport!=null && this.jInternalFrameDetalleFormPeriodoImportExport!=null) {this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldcodigoPeriodoImportExport.setBorder(this.periodoimportexportConstantesFunciones.resaltarcodigoPeriodoImportExport);}
		if(this.periodoimportexportConstantesFunciones.resaltarid_anioPeriodoImportExport!=null && this.jInternalFrameDetalleFormPeriodoImportExport!=null) {this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.setBorder(this.periodoimportexportConstantesFunciones.resaltarid_anioPeriodoImportExport);}
		if(this.periodoimportexportConstantesFunciones.resaltarid_mesPeriodoImportExport!=null && this.jInternalFrameDetalleFormPeriodoImportExport!=null) {this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.setBorder(this.periodoimportexportConstantesFunciones.resaltarid_mesPeriodoImportExport);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPeriodoImportExport() throws Exception {		
		if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
	
		//this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.setVisible(this.periodoimportexportConstantesFunciones.mostraridPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.jPanelidPeriodoImportExport.setVisible(this.periodoimportexportConstantesFunciones.mostraridPeriodoImportExport);
		//this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldcodigoPeriodoImportExport.setVisible(this.periodoimportexportConstantesFunciones.mostrarcodigoPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.jPanelcodigoPeriodoImportExport.setVisible(this.periodoimportexportConstantesFunciones.mostrarcodigoPeriodoImportExport);
		//this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.setVisible(this.periodoimportexportConstantesFunciones.mostrarid_anioPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.jPanelid_anioPeriodoImportExport.setVisible(this.periodoimportexportConstantesFunciones.mostrarid_anioPeriodoImportExport);
		//this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.setVisible(this.periodoimportexportConstantesFunciones.mostrarid_mesPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.jPanelid_mesPeriodoImportExport.setVisible(this.periodoimportexportConstantesFunciones.mostrarid_mesPeriodoImportExport);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPeriodoImportExport() throws Exception {
		if(this.jInternalFrameDetalleFormPeriodoImportExport==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPeriodoImportExport!=null) {
	
		this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldidPeriodoImportExport.setEnabled(this.periodoimportexportConstantesFunciones.activaridPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.jTextFieldcodigoPeriodoImportExport.setEnabled(this.periodoimportexportConstantesFunciones.activarcodigoPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_anioPeriodoImportExport.setEnabled(this.periodoimportexportConstantesFunciones.activarid_anioPeriodoImportExport);
		this.jInternalFrameDetalleFormPeriodoImportExport.jComboBoxid_mesPeriodoImportExport.setEnabled(this.periodoimportexportConstantesFunciones.activarid_mesPeriodoImportExport);
		}
	}
	
		
}