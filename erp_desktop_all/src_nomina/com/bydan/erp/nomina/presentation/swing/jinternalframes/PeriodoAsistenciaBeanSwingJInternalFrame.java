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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.PeriodoAsistenciaConstantesFunciones;
import com.bydan.erp.nomina.util.PeriodoAsistenciaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.PeriodoAsistenciaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.PeriodoAsistenciaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PeriodoAsistenciaBeanSwingJInternalFrame extends PeriodoAsistenciaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PeriodoAsistenciaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PeriodoAsistencia> periodoasistenciaValidator = new ClassValidator<PeriodoAsistencia>(PeriodoAsistencia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PeriodoAsistencia periodoasistencia;	
	public PeriodoAsistencia periodoasistenciaAux;
	public PeriodoAsistencia periodoasistenciaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PeriodoAsistencia periodoasistenciaTotales;
	public Long idPeriodoAsistenciaActual;
	public Long iIdNuevoPeriodoAsistencia=0L;
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
	
	public Boolean isPermisoTodoPeriodoAsistencia;
	public Boolean isPermisoNuevoPeriodoAsistencia;
	public Boolean isPermisoActualizarPeriodoAsistencia;
	public Boolean isPermisoActualizarOriginalPeriodoAsistencia;
	public Boolean isPermisoEliminarPeriodoAsistencia;
	public Boolean isPermisoGuardarCambiosPeriodoAsistencia;
	public Boolean isPermisoConsultaPeriodoAsistencia;
	public Boolean isPermisoBusquedaPeriodoAsistencia;
	public Boolean isPermisoReportePeriodoAsistencia;
	public Boolean isPermisoPaginacionMedioPeriodoAsistencia;
	public Boolean isPermisoPaginacionAltoPeriodoAsistencia;
	public Boolean isPermisoPaginacionTodoPeriodoAsistencia;
	public Boolean isPermisoCopiarPeriodoAsistencia;
	public Boolean isPermisoVerFormPeriodoAsistencia;
	public Boolean isPermisoDuplicarPeriodoAsistencia;
	public Boolean isPermisoOrdenPeriodoAsistencia;
	
	
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
	
	public PeriodoAsistenciaParameterReturnGeneral periodoasistenciaReturnGeneral;
	public PeriodoAsistenciaParameterReturnGeneral periodoasistenciaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPeriodoAsistencia=false;
	public Boolean esParaAccionDesdeFormularioPeriodoAsistencia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PeriodoAsistenciaSessionBeanAdditional periodoasistenciaSessionBeanAdditional=null;
	
	public PeriodoAsistenciaSessionBeanAdditional getPeriodoAsistenciaSessionBeanAdditional() {
		return this.periodoasistenciaSessionBeanAdditional;
	}
	
	public void setPeriodoAsistenciaSessionBeanAdditional(PeriodoAsistenciaSessionBeanAdditional periodoasistenciaSessionBeanAdditional) {
		try {
			this.periodoasistenciaSessionBeanAdditional=periodoasistenciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PeriodoAsistenciaBeanSwingJInternalFrameAdditional periodoasistenciaBeanSwingJInternalFrameAdditional=null;
	//public class PeriodoAsistenciaBeanSwingJInternalFrame
	
	public PeriodoAsistenciaBeanSwingJInternalFrameAdditional getPeriodoAsistenciaBeanSwingJInternalFrameAdditional() {
		return this.periodoasistenciaBeanSwingJInternalFrameAdditional;
	}
	
	public void setPeriodoAsistenciaBeanSwingJInternalFrameAdditional(PeriodoAsistenciaBeanSwingJInternalFrameAdditional periodoasistenciaBeanSwingJInternalFrameAdditional) {
		try {
			this.periodoasistenciaBeanSwingJInternalFrameAdditional=periodoasistenciaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PeriodoAsistenciaLogic periodoasistenciaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PeriodoAsistencia periodoasistenciaBean;
	public PeriodoAsistenciaConstantesFunciones periodoasistenciaConstantesFunciones;
	//public PeriodoAsistenciaParameterReturnGeneral periodoasistenciaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	
	//PARAMETROS
	
	
	//public List<PeriodoAsistencia> periodoasistencias;	
	//public List<PeriodoAsistencia> periodoasistenciasEliminados;
	//public List<PeriodoAsistencia> periodoasistenciasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPeriodoAsistencia=false;
	public Boolean isVisibilidadCeldaDuplicarPeriodoAsistencia=true;
	public Boolean isVisibilidadCeldaCopiarPeriodoAsistencia=true;
	public Boolean isVisibilidadCeldaVerFormPeriodoAsistencia=true;
	public Boolean isVisibilidadCeldaOrdenPeriodoAsistencia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;
	public Boolean isVisibilidadCeldaModificarPeriodoAsistencia=false;
	public Boolean isVisibilidadCeldaActualizarPeriodoAsistencia=false;
	public Boolean isVisibilidadCeldaEliminarPeriodoAsistencia=false;
	public Boolean isVisibilidadCeldaCancelarPeriodoAsistencia=false;
	public Boolean isVisibilidadCeldaGuardarPeriodoAsistencia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	
	public Long getiIdNuevoPeriodoAsistencia() {
		return this.iIdNuevoPeriodoAsistencia;
	}

	public void setiIdNuevoPeriodoAsistencia(Long iIdNuevoPeriodoAsistencia) {
		this.iIdNuevoPeriodoAsistencia = iIdNuevoPeriodoAsistencia;
	}
	
	public Long getidPeriodoAsistenciaActual() {
		return this.idPeriodoAsistenciaActual;
	}

	public void setidPeriodoAsistenciaActual(Long idPeriodoAsistenciaActual) {
		this.idPeriodoAsistenciaActual = idPeriodoAsistenciaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PeriodoAsistencia getperiodoasistencia() {
		return this.periodoasistencia;
	}

	public void setperiodoasistencia(PeriodoAsistencia periodoasistencia) {
		this.periodoasistencia = periodoasistencia;
	}
	
	public PeriodoAsistencia getperiodoasistenciaAux() {
		return this.periodoasistenciaAux;
	}

	public void setperiodoasistenciaAux(PeriodoAsistencia periodoasistenciaAux) {
		this.periodoasistenciaAux = periodoasistenciaAux;
	}				
	
	public PeriodoAsistencia getperiodoasistenciaAnterior() {
		return this.periodoasistenciaAnterior;
	}

	public void setperiodoasistenciaAnterior(PeriodoAsistencia periodoasistenciaAnterior) {
		this.periodoasistenciaAnterior = periodoasistenciaAnterior;
	}	
	
	public PeriodoAsistencia getperiodoasistenciaTotales() {
		return this.periodoasistenciaTotales;
	}

	public void setperiodoasistenciaTotales(PeriodoAsistencia periodoasistenciaTotales) {
		this.periodoasistenciaTotales = periodoasistenciaTotales;
	}	
	
	public PeriodoAsistencia getperiodoasistenciaBean() {
		return this.periodoasistenciaBean;
	}

	public void setperiodoasistenciaBean(PeriodoAsistencia periodoasistenciaBean) {
		this.periodoasistenciaBean = periodoasistenciaBean;
	}	
	
	public PeriodoAsistenciaParameterReturnGeneral getperiodoasistenciaReturnGeneral() {
		return this.periodoasistenciaReturnGeneral;
	}

	public void setperiodoasistenciaReturnGeneral(PeriodoAsistenciaParameterReturnGeneral periodoasistenciaReturnGeneral) {
		this.periodoasistenciaReturnGeneral = periodoasistenciaReturnGeneral;
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

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PeriodoAsistenciaLogic getPeriodoAsistenciaLogic()	{		
		return periodoasistenciaLogic;
	}

	public void setPeriodoAsistenciaLogic(PeriodoAsistenciaLogic periodoasistenciaLogic) {
		this.periodoasistenciaLogic = periodoasistenciaLogic;
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
	
	public Boolean getIsEsNuevoPeriodoAsistencia() {
		return isEsNuevoPeriodoAsistencia;
	}

	public void setIsEsNuevoPeriodoAsistencia(Boolean isEsNuevoPeriodoAsistencia) {
		this.isEsNuevoPeriodoAsistencia = isEsNuevoPeriodoAsistencia;
	}

	public Boolean getEsParaAccionDesdeFormularioPeriodoAsistencia() {
		return esParaAccionDesdeFormularioPeriodoAsistencia;
	}
	
	public void setEsParaAccionDesdeFormularioPeriodoAsistencia(Boolean esParaAccionDesdeFormularioPeriodoAsistencia) {
		this.esParaAccionDesdeFormularioPeriodoAsistencia = esParaAccionDesdeFormularioPeriodoAsistencia;
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

			if(this.periodoasistenciaSessionBean==null) {
				this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
			}

			if(!this.periodoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(periodoasistenciaSessionBean.getlidEmpresaActual());
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

			if(this.periodoasistenciaSessionBean==null) {
				this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
			}

			if(!this.periodoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(periodoasistenciaSessionBean.getlidEjercicioActual());
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

			if(this.periodoasistenciaSessionBean==null) {
				this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
			}

			if(!this.periodoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(periodoasistenciaSessionBean.getlidPeriodoActual());
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

					if(this.periodoasistencia!=null) {
						this.periodoasistencia.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
						this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPeriodoAsistencia.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPeriodoAsistenciaGenerico)throws Exception
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
				jComboBoxid_empresaPeriodoAsistenciaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPeriodoAsistenciaGenerico!=null && jComboBoxid_empresaPeriodoAsistenciaGenerico.getItemCount()>0) {
					jComboBoxid_empresaPeriodoAsistenciaGenerico.setSelectedIndex(0);
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

					if(this.periodoasistencia!=null) {
						this.periodoasistencia.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
						this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPeriodoAsistencia.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPeriodoAsistenciaGenerico)throws Exception
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
				jComboBoxid_ejercicioPeriodoAsistenciaGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPeriodoAsistenciaGenerico!=null && jComboBoxid_ejercicioPeriodoAsistenciaGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPeriodoAsistenciaGenerico.setSelectedIndex(0);
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

					if(this.periodoasistencia!=null) {
						this.periodoasistencia.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
						this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPeriodoAsistencia.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPeriodoAsistenciaGenerico)throws Exception
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
				jComboBoxid_periodoPeriodoAsistenciaGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPeriodoAsistenciaGenerico!=null && jComboBoxid_periodoPeriodoAsistenciaGenerico.getItemCount()>0) {
					jComboBoxid_periodoPeriodoAsistenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PeriodoAsistencia periodoasistencia,JComboBox jComboBoxid_empresaPeriodoAsistenciaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPeriodoAsistenciaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPeriodoAsistenciaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				periodoasistencia.setid_empresa(empresaAux.getId());
				periodoasistencia.setempresa_descripcion(PeriodoAsistenciaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				periodoasistencia.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PeriodoAsistencia periodoasistencia,JComboBox jComboBoxid_ejercicioPeriodoAsistenciaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPeriodoAsistenciaGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPeriodoAsistenciaGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				periodoasistencia.setid_ejercicio(ejercicioAux.getId());
				periodoasistencia.setejercicio_descripcion(PeriodoAsistenciaConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				periodoasistencia.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PeriodoAsistencia periodoasistencia,JComboBox jComboBoxid_periodoPeriodoAsistenciaGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPeriodoAsistenciaGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPeriodoAsistenciaGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				periodoasistencia.setid_periodo(periodoAux.getId());
				periodoasistencia.setperiodo_descripcion(PeriodoAsistenciaConstantesFunciones.getPeriodoDescripcion(periodoAux));
				periodoasistencia.setPeriodo(periodoAux);			}
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

					if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { 
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { 
					}

					if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { 
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { 
					}

					if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { 
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { 
					}

					if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPeriodoAsistencia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PeriodoAsistenciaConstantesFunciones.refrescarForeignKeysDescripcionesPeriodoAsistencia(this.periodoasistenciaLogic.getPeriodoAsistencias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PeriodoAsistenciaConstantesFunciones.refrescarForeignKeysDescripcionesPeriodoAsistencia(this.periodoasistencias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//periodoasistenciaLogic.setPeriodoAsistencias(this.periodoasistencias);
			periodoasistenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PeriodoAsistenciaParameterReturnGeneral getPeriodoAsistenciaParameterGeneral() {
		return this.periodoasistenciaParameterGeneral;
	}
	
	public void setPeriodoAsistenciaParameterGeneral(PeriodoAsistenciaParameterReturnGeneral periodoasistenciaParameterGeneral) {
		this.periodoasistenciaParameterGeneral = periodoasistenciaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPeriodoAsistencia() {
		return isPermisoTodoPeriodoAsistencia;
	}

	public void setIsPermisoTodoPeriodoAsistencia(Boolean isPermisoTodoPeriodoAsistencia) {
		this.isPermisoTodoPeriodoAsistencia = isPermisoTodoPeriodoAsistencia;
	}

	public Boolean getIsPermisoNuevoPeriodoAsistencia() {
		return isPermisoNuevoPeriodoAsistencia;
	}

	public void setIsPermisoNuevoPeriodoAsistencia(Boolean isPermisoNuevoPeriodoAsistencia) {
		this.isPermisoNuevoPeriodoAsistencia = isPermisoNuevoPeriodoAsistencia;
	}

	public Boolean getIsPermisoActualizarPeriodoAsistencia() {
		return isPermisoActualizarPeriodoAsistencia;
	}

	public void setIsPermisoActualizarPeriodoAsistencia(Boolean isPermisoActualizarPeriodoAsistencia) {
		this.isPermisoActualizarPeriodoAsistencia = isPermisoActualizarPeriodoAsistencia;
	}

	public Boolean getIsPermisoEliminarPeriodoAsistencia() {
		return isPermisoEliminarPeriodoAsistencia;
	}

	public void setIsPermisoEliminarPeriodoAsistencia(Boolean isPermisoEliminarPeriodoAsistencia) {
		this.isPermisoEliminarPeriodoAsistencia = isPermisoEliminarPeriodoAsistencia;
	}

	public Boolean getIsPermisoGuardarCambiosPeriodoAsistencia() {
		return isPermisoGuardarCambiosPeriodoAsistencia;
	}

	public void setIsPermisoGuardarCambiosPeriodoAsistencia(Boolean isPermisoGuardarCambiosPeriodoAsistencia) {
		this.isPermisoGuardarCambiosPeriodoAsistencia = isPermisoGuardarCambiosPeriodoAsistencia;
	}
	
	public Boolean getIsPermisoConsultaPeriodoAsistencia() {
		return isPermisoConsultaPeriodoAsistencia;
	}

	public void setIsPermisoConsultaPeriodoAsistencia(Boolean isPermisoConsultaPeriodoAsistencia) {
		this.isPermisoConsultaPeriodoAsistencia = isPermisoConsultaPeriodoAsistencia;
	}

	public Boolean getIsPermisoBusquedaPeriodoAsistencia() {
		return isPermisoBusquedaPeriodoAsistencia;
	}

	public void setIsPermisoBusquedaPeriodoAsistencia(Boolean isPermisoBusquedaPeriodoAsistencia) {
		this.isPermisoBusquedaPeriodoAsistencia = isPermisoBusquedaPeriodoAsistencia;
	}

	public Boolean getIsPermisoReportePeriodoAsistencia() {
		return isPermisoReportePeriodoAsistencia;
	}

	public void setIsPermisoReportePeriodoAsistencia(Boolean isPermisoReportePeriodoAsistencia) {
		this.isPermisoReportePeriodoAsistencia = isPermisoReportePeriodoAsistencia;
	}
	
	public Boolean getIsPermisoPaginacionMedioPeriodoAsistencia() {
		return isPermisoPaginacionMedioPeriodoAsistencia;
	}

	public void setIsPermisoPaginacionMedioPeriodoAsistencia(Boolean isPermisoPaginacionMedioPeriodoAsistencia) {
		this.isPermisoPaginacionMedioPeriodoAsistencia = isPermisoPaginacionMedioPeriodoAsistencia;
	}
	
	public Boolean getIsPermisoPaginacionTodoPeriodoAsistencia() {
		return isPermisoPaginacionTodoPeriodoAsistencia;
	}

	public void setIsPermisoPaginacionTodoPeriodoAsistencia(Boolean isPermisoPaginacionTodoPeriodoAsistencia) {
		this.isPermisoPaginacionTodoPeriodoAsistencia = isPermisoPaginacionTodoPeriodoAsistencia;
	}
	
	public Boolean getIsPermisoPaginacionAltoPeriodoAsistencia() {
		return isPermisoPaginacionAltoPeriodoAsistencia;
	}

	public void setIsPermisoPaginacionAltoPeriodoAsistencia(Boolean isPermisoPaginacionAltoPeriodoAsistencia) {
		this.isPermisoPaginacionAltoPeriodoAsistencia = isPermisoPaginacionAltoPeriodoAsistencia;
	}
	
	public Boolean getIsPermisoCopiarPeriodoAsistencia() {
		return isPermisoCopiarPeriodoAsistencia;
	}

	public void setIsPermisoCopiarPeriodoAsistencia(Boolean isPermisoCopiarPeriodoAsistencia) {
		this.isPermisoCopiarPeriodoAsistencia = isPermisoCopiarPeriodoAsistencia;
	}
	
	public Boolean getIsPermisoVerFormPeriodoAsistencia() {
		return isPermisoVerFormPeriodoAsistencia;
	}

	public void setIsPermisoVerFormPeriodoAsistencia(Boolean isPermisoVerFormPeriodoAsistencia) {
		this.isPermisoVerFormPeriodoAsistencia = isPermisoVerFormPeriodoAsistencia;
	}
	
	public Boolean getIsPermisoDuplicarPeriodoAsistencia() {
		return isPermisoDuplicarPeriodoAsistencia;
	}

	public void setIsPermisoDuplicarPeriodoAsistencia(Boolean isPermisoDuplicarPeriodoAsistencia) {
		this.isPermisoDuplicarPeriodoAsistencia = isPermisoDuplicarPeriodoAsistencia;
	}
	
	public Boolean getIsPermisoOrdenPeriodoAsistencia() {
		return isPermisoOrdenPeriodoAsistencia;
	}

	public void setIsPermisoOrdenPeriodoAsistencia(Boolean isPermisoOrdenPeriodoAsistencia) {
		this.isPermisoOrdenPeriodoAsistencia = isPermisoOrdenPeriodoAsistencia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPeriodoAsistencia() {
		return isVisibilidadCeldaNuevoPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaNuevoPeriodoAsistencia(Boolean isVisibilidadCeldaNuevoPeriodoAsistencia) {
		this.isVisibilidadCeldaNuevoPeriodoAsistencia = isVisibilidadCeldaNuevoPeriodoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPeriodoAsistencia() {
		return isVisibilidadCeldaDuplicarPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaDuplicarPeriodoAsistencia(Boolean isVisibilidadCeldaDuplicarPeriodoAsistencia) {
		this.isVisibilidadCeldaDuplicarPeriodoAsistencia = isVisibilidadCeldaDuplicarPeriodoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPeriodoAsistencia() {
		return isVisibilidadCeldaCopiarPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaCopiarPeriodoAsistencia(Boolean isVisibilidadCeldaCopiarPeriodoAsistencia) {
		this.isVisibilidadCeldaCopiarPeriodoAsistencia = isVisibilidadCeldaCopiarPeriodoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPeriodoAsistencia() {
		return isVisibilidadCeldaVerFormPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaVerFormPeriodoAsistencia(Boolean isVisibilidadCeldaVerFormPeriodoAsistencia) {
		this.isVisibilidadCeldaVerFormPeriodoAsistencia = isVisibilidadCeldaVerFormPeriodoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPeriodoAsistencia() {
		return isVisibilidadCeldaOrdenPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaOrdenPeriodoAsistencia(Boolean isVisibilidadCeldaOrdenPeriodoAsistencia) {
		this.isVisibilidadCeldaOrdenPeriodoAsistencia = isVisibilidadCeldaOrdenPeriodoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPeriodoAsistencia() {
		return isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPeriodoAsistencia(Boolean isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia) {
		this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia = isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPeriodoAsistencia() {
		return isVisibilidadCeldaModificarPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaModificarPeriodoAsistencia(Boolean isVisibilidadCeldaModificarPeriodoAsistencia) {
		this.isVisibilidadCeldaModificarPeriodoAsistencia = isVisibilidadCeldaModificarPeriodoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPeriodoAsistencia() {
		return isVisibilidadCeldaActualizarPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaActualizarPeriodoAsistencia(Boolean isVisibilidadCeldaActualizarPeriodoAsistencia) {
		this.isVisibilidadCeldaActualizarPeriodoAsistencia = isVisibilidadCeldaActualizarPeriodoAsistencia;
	}

	public Boolean getIsVisibilidadCeldaEliminarPeriodoAsistencia() {
		return isVisibilidadCeldaEliminarPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaEliminarPeriodoAsistencia(Boolean isVisibilidadCeldaEliminarPeriodoAsistencia) {
		this.isVisibilidadCeldaEliminarPeriodoAsistencia = isVisibilidadCeldaEliminarPeriodoAsistencia;
	}

	public Boolean getIsVisibilidadCeldaCancelarPeriodoAsistencia() {
		return isVisibilidadCeldaCancelarPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaCancelarPeriodoAsistencia(Boolean isVisibilidadCeldaCancelarPeriodoAsistencia) {
		this.isVisibilidadCeldaCancelarPeriodoAsistencia = isVisibilidadCeldaCancelarPeriodoAsistencia;
	}

	public Boolean getIsVisibilidadCeldaGuardarPeriodoAsistencia() {
		return isVisibilidadCeldaGuardarPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaGuardarPeriodoAsistencia(Boolean isVisibilidadCeldaGuardarPeriodoAsistencia) {
		this.isVisibilidadCeldaGuardarPeriodoAsistencia = isVisibilidadCeldaGuardarPeriodoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPeriodoAsistencia() {
		return isVisibilidadCeldaGuardarCambiosPeriodoAsistencia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPeriodoAsistencia(Boolean isVisibilidadCeldaGuardarCambiosPeriodoAsistencia) {
		this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia = isVisibilidadCeldaGuardarCambiosPeriodoAsistencia;
	}
		
	public PeriodoAsistenciaSessionBean getperiodoasistenciaSessionBean() {
		return this.periodoasistenciaSessionBean;
	}
	
	public void setperiodoasistenciaSessionBean(PeriodoAsistenciaSessionBean periodoasistenciaSessionBean) {
		this.periodoasistenciaSessionBean=periodoasistenciaSessionBean;
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

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(PeriodoAsistencia periodoasistencia)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(periodoasistencia,null);
				this.setActualParaGuardarEjercicioForeignKey(periodoasistencia,null);
				this.setActualParaGuardarPeriodoForeignKey(periodoasistencia,null);
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
	
	public void bugActualizarReferenciaActual(PeriodoAsistencia periodoasistencia,PeriodoAsistencia periodoasistenciaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPeriodoAsistencia(periodoasistencia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		periodoasistenciaAux.setId(periodoasistencia.getId());
		periodoasistenciaAux.setVersionRow(periodoasistencia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPeriodoAsistencia();
		
			int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = periodoasistenciaValidator.getInvalidValues(this.periodoasistencia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			periodoasistenciaLogic.setDatosCliente(datosCliente);
			periodoasistenciaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				periodoasistenciaAux=new  PeriodoAsistencia();
				
				periodoasistenciaAux.setIsNew(true);
				periodoasistenciaAux.setIsChanged(true);
				
				periodoasistenciaAux.setPeriodoAsistenciaOriginal(this.periodoasistencia);
				
				periodoasistenciaAux.setId(this.periodoasistencia.getId());	
				periodoasistenciaAux.setVersionRow(this.periodoasistencia.getVersionRow());	
				periodoasistenciaAux.setid_empresa(this.periodoasistencia.getid_empresa());	
				periodoasistenciaAux.setid_ejercicio(this.periodoasistencia.getid_ejercicio());	
				periodoasistenciaAux.setid_periodo(this.periodoasistencia.getid_periodo());	
				periodoasistenciaAux.setfecha_inicio(this.periodoasistencia.getfecha_inicio());	
				periodoasistenciaAux.setfecha_fin(this.periodoasistencia.getfecha_fin());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.periodoasistenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(periodoasistenciaAux,periodoasistenciaLogic.getPeriodoAsistencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoasistenciaAux,periodoasistencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periodoasistenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciaLogic.savePeriodoAsistencias();//WithConnection
						//periodoasistenciaLogic.getSetVersionRowPeriodoAsistencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.periodoasistencia,periodoasistenciaAux);
					
					this.refrescarForeignKeysDescripcionesPeriodoAsistencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								periodoasistenciaLogic.savePeriodoAsistenciaRelaciones(periodoasistenciaAux);//WithConnection
								//periodoasistenciaLogic.getSetVersionRowPeriodoAsistencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.periodoasistencia,periodoasistenciaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.periodoasistenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(periodoasistenciaAux,periodoasistenciaLogic.getPeriodoAsistencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(periodoasistenciaAux,periodoasistencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.periodoasistencia,periodoasistenciaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				periodoasistenciaAux=new  PeriodoAsistencia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado() 
					|| (this.periodoasistenciaSessionBean.getEsGuardarRelacionado() && this.periodoasistencia.getId()>=0)) {
						
					periodoasistenciaAux.setIsNew(false);
				}
				
				periodoasistenciaAux.setIsDeleted(false);
			
				periodoasistenciaAux.setId(this.periodoasistencia.getId());	
				periodoasistenciaAux.setVersionRow(this.periodoasistencia.getVersionRow());	
				periodoasistenciaAux.setid_empresa(this.periodoasistencia.getid_empresa());	
				periodoasistenciaAux.setid_ejercicio(this.periodoasistencia.getid_ejercicio());	
				periodoasistenciaAux.setid_periodo(this.periodoasistencia.getid_periodo());	
				periodoasistenciaAux.setfecha_inicio(this.periodoasistencia.getfecha_inicio());	
				periodoasistenciaAux.setfecha_fin(this.periodoasistencia.getfecha_fin());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(periodoasistenciaAux,periodoasistenciaLogic.getPeriodoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoasistenciaAux,periodoasistencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periodoasistenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciaLogic.savePeriodoAsistencias();//WithConnection
						//periodoasistenciaLogic.getSetVersionRowPeriodoAsistencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.periodoasistencia,periodoasistenciaAux);
					
					this.refrescarForeignKeysDescripcionesPeriodoAsistencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								periodoasistenciaLogic.savePeriodoAsistenciaRelaciones(periodoasistenciaAux);//WithConnection
								//periodoasistenciaLogic.getSetVersionRowPeriodoAsistencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.periodoasistencia,periodoasistenciaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.periodoasistenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(periodoasistenciaAux,periodoasistenciaLogic.getPeriodoAsistencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(periodoasistenciaAux,periodoasistencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.periodoasistencia,periodoasistenciaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				periodoasistenciaAux=new  PeriodoAsistencia();
				
				periodoasistenciaAux.setIsNew(false);
				periodoasistenciaAux.setIsChanged(false);
				
				periodoasistenciaAux.setIsDeleted(true);
				
				periodoasistenciaAux.setId(this.periodoasistencia.getId());	
				periodoasistenciaAux.setVersionRow(this.periodoasistencia.getVersionRow());	
				periodoasistenciaAux.setid_empresa(this.periodoasistencia.getid_empresa());	
				periodoasistenciaAux.setid_ejercicio(this.periodoasistencia.getid_ejercicio());	
				periodoasistenciaAux.setid_periodo(this.periodoasistencia.getid_periodo());	
				periodoasistenciaAux.setfecha_inicio(this.periodoasistencia.getfecha_inicio());	
				periodoasistenciaAux.setfecha_fin(this.periodoasistencia.getfecha_fin());	
				
				if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.periodoasistenciaAux.getId()>=0) {	
						this.periodoasistenciasEliminados.add(periodoasistenciaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(periodoasistenciaAux,periodoasistenciaLogic.getPeriodoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoasistenciaAux,periodoasistencias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.periodoasistenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciaLogic.savePeriodoAsistencias();//WithConnection
						//periodoasistenciaLogic.getSetVersionRowPeriodoAsistencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								periodoasistenciaLogic.savePeriodoAsistenciaRelaciones(periodoasistenciaAux);//WithConnection
								//periodoasistenciaLogic.getSetVersionRowPeriodoAsistencias();//WithConnection
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
							if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.periodoasistenciaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(periodoasistenciaAux,periodoasistenciaLogic.getPeriodoAsistencias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(periodoasistenciaAux,periodoasistencias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.getPeriodoAsistencias().addAll(this.periodoasistenciasEliminados);
					
					periodoasistenciaLogic.savePeriodoAsistencias();//WithConnection
					//periodoasistenciaLogic.getSetVersionRowPeriodoAsistencias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPeriodoAsistencia();
				
				this.periodoasistenciasEliminados= new ArrayList<PeriodoAsistencia>();		
			}
			
			if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Periodo Asistencia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.periodoasistencia=periodoasistenciaAux;
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
      		//this.finishProcessPeriodoAsistencia();
      	}
		
	}	
	
	public void actualizarRelaciones(PeriodoAsistencia periodoasistenciaLocal) throws Exception {
		
		if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PeriodoAsistencia periodoasistenciaLocal) throws Exception {	
		if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				periodoasistenciaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				periodoasistenciaLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				periodoasistenciaLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPeriodoAsistenciaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = periodoasistenciaValidator.getInvalidValues(this.periodoasistencia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PeriodoAsistencia periodoasistencia,List<PeriodoAsistencia> periodoasistencias) throws Exception {
		try	{		
			PeriodoAsistenciaConstantesFunciones.actualizarLista(periodoasistencia,periodoasistencias,this.periodoasistenciaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PeriodoAsistencia periodoasistencia,List<PeriodoAsistencia> periodoasistencias) throws Exception {
		try	{			
			PeriodoAsistenciaConstantesFunciones.actualizarSelectedLista(periodoasistencia,periodoasistencias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PeriodoAsistencia> periodoasistenciasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				periodoasistenciasLocal=this.periodoasistenciaLogic.getPeriodoAsistencias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				periodoasistenciasLocal=this.periodoasistencias;
			}
			//ARCHITECTURE
		
			for(PeriodoAsistencia periodoasistenciaLocal:periodoasistenciasLocal) {
				if(this.permiteMantenimiento(periodoasistenciaLocal) && periodoasistenciaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PeriodoAsistenciaConstantesFunciones.getPeriodoAsistenciaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PeriodoAsistenciaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelid_empresaPeriodoAsistencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoAsistenciaConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelid_ejercicioPeriodoAsistencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoAsistenciaConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelid_periodoPeriodoAsistencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoAsistenciaConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelfecha_inicioPeriodoAsistencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PeriodoAsistenciaConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelfecha_finPeriodoAsistencia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelid_empresaPeriodoAsistencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelid_ejercicioPeriodoAsistencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelid_periodoPeriodoAsistencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelfecha_inicioPeriodoAsistencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelfecha_finPeriodoAsistencia,"");
		
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
		this.iIdNuevoPeriodoAsistencia--;	
		
		
		this.periodoasistenciaAux=new PeriodoAsistencia();
		
		this.periodoasistenciaAux.setId(this.iIdNuevoPeriodoAsistencia);
		this.periodoasistenciaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.periodoasistenciaLogic.getPeriodoAsistencias().add(this.periodoasistenciaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.periodoasistencias.add(this.periodoasistenciaAux);
		}
		//ARCHITECTURE
		
		this.periodoasistencia=this.periodoasistenciaAux;
		
		if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPeriodoAsistencia(this.periodoasistencia);
			this.setVariablesObjetoActualToFormularioForeignKeyPeriodoAsistencia(this.periodoasistencia);
		}
				
		//this.setDefaultControlesPeriodoAsistencia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPeriodoAsistencia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPeriodoAsistencia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodoAsistencia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPeriodoAsistencia(this.periodoasistenciaBean,this.periodoasistencia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {
			classes=PeriodoAsistenciaConstantesFunciones.getClassesRelationshipsOfPeriodoAsistencia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.periodoasistenciaReturnGeneral=periodoasistenciaLogic.procesarEventosPeriodoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periodoasistenciaLogic.getPeriodoAsistencias(),this.periodoasistencia,this.periodoasistenciaParameterGeneral,this.isEsNuevoPeriodoAsistencia,classes);//this.periodoasistenciaLogic.getPeriodoAsistencia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPeriodoAsistencia(this.periodoasistenciaReturnGeneral,this.periodoasistenciaBean,false);
		
		if(this.periodoasistenciaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPeriodoAsistencia(this.periodoasistenciaReturnGeneral.getPeriodoAsistencia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPeriodoAsistencia(this.periodoasistenciaReturnGeneral.getPeriodoAsistencia());
		}
		
		if(this.periodoasistenciaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPeriodoAsistencia(this.periodoasistenciaReturnGeneral.getPeriodoAsistencia(),classes);//this.periodoasistenciaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPeriodoAsistencia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPeriodoAsistencia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.RecargarFormPeriodoAsistencia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPeriodoAsistencia(false);
						
			if(periodoasistenciaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodoAsistencia();
			}
			
			this.actualizarVisualTableDatosPeriodoAsistencia();
			
			this.jTableDatosPeriodoAsistencia.setRowSelectionInterval(this.getIndiceNuevoPeriodoAsistencia(), this.getIndiceNuevoPeriodoAsistencia());
			
			this.seleccionarFilaTablaPeriodoAsistenciaActual();
						
			this.actualizarEstadoCeldasBotonesPeriodoAsistencia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPeriodoAsistencia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_inicioPeriodoAsistencia.setEnabled(isHabilitar && this.periodoasistenciaConstantesFunciones.activarfecha_inicioPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_finPeriodoAsistencia.setEnabled(isHabilitar && this.periodoasistenciaConstantesFunciones.activarfecha_finPeriodoAsistencia);	
		//
		this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.setEnabled(isHabilitar && this.periodoasistenciaConstantesFunciones.activarid_empresaPeriodoAsistencia);//
		this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.setEnabled(isHabilitar && this.periodoasistenciaConstantesFunciones.activarid_ejercicioPeriodoAsistencia);//
		this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.setEnabled(isHabilitar && this.periodoasistenciaConstantesFunciones.activarid_periodoPeriodoAsistencia);
	};
	
	public void setDefaultControlesPeriodoAsistencia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPeriodoAsistencia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.periodoasistenciaSessionBean.setConGuardarRelaciones(true);			
			this.periodoasistenciaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPeriodoAsistencia.jTabbedPaneRelacionesPeriodoAsistencia.setVisible(true);
			
					
		} else {
			//this.periodoasistenciaSessionBean.setConGuardarRelaciones(false);			
			this.periodoasistenciaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPeriodoAsistencia.jTabbedPaneRelacionesPeriodoAsistencia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPeriodoAsistencia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistenciaLogic.getPeriodoAsistencias()) {
				if(periodoasistenciaAux.getId().equals(this.iIdNuevoPeriodoAsistencia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistencias) {
				if(periodoasistenciaAux.getId().equals(this.iIdNuevoPeriodoAsistencia)) {
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
	
	public int getIndiceActualPeriodoAsistencia(PeriodoAsistencia periodoasistencia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistenciaLogic.getPeriodoAsistencias()) {
				if(periodoasistenciaAux.getId().equals(periodoasistencia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistencias) {
				if(periodoasistenciaAux.getId().equals(periodoasistencia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPeriodoAsistencia(PeriodoAsistencia periodoasistenciaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistenciaLogic.getPeriodoAsistencias()) {
				if(periodoasistenciaAux.getPeriodoAsistenciaOriginal().getId().equals(periodoasistenciaOriginal.getId())) {
					existe=true;
					periodoasistenciaOriginal.setId(periodoasistenciaAux.getId());
					periodoasistenciaOriginal.setVersionRow(periodoasistenciaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistencias) {
				if(periodoasistenciaAux.getPeriodoAsistenciaOriginal().getId().equals(periodoasistenciaOriginal.getId())) {
					existe=true;
					periodoasistenciaOriginal.setId(periodoasistenciaAux.getId());
					periodoasistenciaOriginal.setVersionRow(periodoasistenciaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPeriodoAsistencia(Boolean esParaCancelar) throws Exception {
		periodoasistenciasAux=new ArrayList<PeriodoAsistencia>();
		periodoasistenciaAux=new PeriodoAsistencia();
		
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistenciaLogic.getPeriodoAsistencias()) {
					if(periodoasistenciaAux.getId()<0) {
						periodoasistenciasAux.add(periodoasistenciaAux);
					}		
				}
				this.iIdNuevoPeriodoAsistencia=0L;
				this.periodoasistenciaLogic.getPeriodoAsistencias().removeAll(periodoasistenciasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistencias) {
					if(periodoasistenciaAux.getId()<0) {
						periodoasistenciasAux.add(periodoasistenciaAux);
					}		
				}
				this.iIdNuevoPeriodoAsistencia=0L;
				this.periodoasistencias.removeAll(periodoasistenciasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPeriodoAsistencia 
					&& this.periodoasistenciaLogic.getPeriodoAsistencias().size()>0
					) {
					periodoasistenciaAux=this.periodoasistenciaLogic.getPeriodoAsistencias().get(this.periodoasistenciaLogic.getPeriodoAsistencias().size() - 1);
				
					if(periodoasistenciaAux.getId()<0) {
						this.periodoasistenciaLogic.getPeriodoAsistencias().remove(periodoasistenciaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPeriodoAsistencia && this.periodoasistencias.size()>0) {
					periodoasistenciaAux=this.periodoasistencias.get(this.periodoasistencias.size() - 1);
				
					if(periodoasistenciaAux.getId()<0) {
						this.periodoasistencias.remove(periodoasistenciaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPeriodoAsistencia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(periodoasistencia.getId()<0) {
				this.periodoasistenciaLogic.getPeriodoAsistencias().remove(this.periodoasistencia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(periodoasistencia.getId()<0) {
				this.periodoasistencias.remove(this.periodoasistencia);
			}
		}			
	}
	
	public void setEstadosInicialesPeriodoAsistencia(List<PeriodoAsistencia> periodoasistenciasAux) throws Exception {
		PeriodoAsistenciaConstantesFunciones.setEstadosInicialesPeriodoAsistencia(periodoasistenciasAux);
	}
	
	public void setEstadosInicialesPeriodoAsistencia(PeriodoAsistencia periodoasistenciaAux) throws Exception {
		PeriodoAsistenciaConstantesFunciones.setEstadosInicialesPeriodoAsistencia(periodoasistenciaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPeriodoAsistenciaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPeriodoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPeriodoAsistenciaActual()) {
				if(!this.isEsNuevoPeriodoAsistencia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPeriodoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPeriodoAsistencia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPeriodoAsistenciaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Periodo Asistencia ?", "MANTENIMIENTO DE Periodo Asistencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPeriodoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PeriodoAsistencia periodoasistencia) throws Exception {
		PeriodoAsistenciaConstantesFunciones.seleccionarAsignar(this.periodoasistencia,periodoasistencia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPeriodoAsistencia=this.isPermisoActualizarOriginalPeriodoAsistencia;
			
			
			this.seleccionarAsignar(periodoasistencia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PeriodoAsistenciaConstantesFunciones.quitarEspaciosPeriodoAsistencia(this.periodoasistencia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPeriodoAsistencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.periodoasistenciaSessionBean.setsFuncionBusquedaRapida(this.periodoasistenciaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPeriodoAsistencia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPeriodoAsistencia(esParaCancelar);				
				this.cancelarNuevoPeriodoAsistencia(esParaCancelar);								
			}
			
			this.periodoasistencia=new PeriodoAsistencia();
			
			this.inicializarPeriodoAsistencia();
			
			this.actualizarEstadoCeldasBotonesPeriodoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPeriodoAsistencia() throws Exception {
		try {
			PeriodoAsistenciaConstantesFunciones.inicializarPeriodoAsistencia(this.periodoasistencia);
			
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
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.periodoasistenciaLogic.getPeriodoAsistencias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePeriodoAsistencias(String sAccionBusqueda,List<PeriodoAsistencia> periodoasistenciasParaReportes) throws Exception {
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
					sPathReporteFinal="PeriodoAsistencia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PeriodoAsistenciaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PeriodoAsistenciaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PeriodoAsistencia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Periodo Asistencias");		
		parameters.put("busquedapor", PeriodoAsistenciaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePeriodoAsistencia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PeriodoAsistenciaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PeriodoAsistenciaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePeriodoAsistencia=new JRBeanArrayDataSource(PeriodoAsistenciaJInternalFrame.TraerPeriodoAsistenciaBeans(periodoasistenciasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePeriodoAsistencia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PeriodoAsistenciaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PeriodoAsistenciaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PeriodoAsistenciaBean.TraerPeriodoAsistenciaBeans(periodoasistenciasParaReportes).toArray()));
							
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
				this.generarExcelReportePeriodoAsistencias(sAccionBusqueda,sTipoArchivoReporte,periodoasistenciasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPeriodoAsistencias(sAccionBusqueda,sTipoArchivoReporte,periodoasistenciasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPeriodoAsistenciaActionPerformed(null);
					//this.generarExcelReportePeriodoAsistencias(sAccionBusqueda,sTipoArchivoReporte,periodoasistenciasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPeriodoAsistencias(sAccionBusqueda,sTipoArchivoReporte,periodoasistenciasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPeriodoAsistencias(sAccionBusqueda,sTipoArchivoReporte,periodoasistenciasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPeriodoAsistencias(sAccionBusqueda,sTipoArchivoReporte,periodoasistenciasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePeriodoAsistencias(String sAccionBusqueda,String sTipoArchivoReporte,List<PeriodoAsistencia> periodoasistenciasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoasistencia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PeriodoAsistencias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPeriodoAsistencia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PeriodoAsistencia periodoasistencia : periodoasistenciasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PeriodoAsistenciaConstantesFunciones.generarExcelReporteDataPeriodoAsistencia("NORMAL",row,workbook,periodoasistencia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPeriodoAsistencia(String sTipo,Row row,Workbook workbook) {
		
		PeriodoAsistenciaConstantesFunciones.generarExcelReporteHeaderPeriodoAsistencia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPeriodoAsistencias(String sAccionBusqueda,String sTipoArchivoReporte,List<PeriodoAsistencia> periodoasistenciasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoasistencia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PeriodoAsistencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PeriodoAsistencia periodoasistencia : periodoasistenciasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PeriodoAsistenciaConstantesFunciones.getPeriodoAsistenciaDescripcion(periodoasistencia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodoasistencia.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodoasistencia.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodoasistencia.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodoasistencia.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(periodoasistencia.getfecha_fin());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPeriodoAsistencias(String sAccionBusqueda,String sTipoArchivoReporte,List<PeriodoAsistencia> periodoasistenciasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PeriodoAsistencia> periodoasistenciasRespaldo=null;
		
		classes=PeriodoAsistenciaConstantesFunciones.getClassesRelationshipsOfPeriodoAsistencia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.periodoasistenciaLogic.setDatosCliente(this.datosCliente);
		this.periodoasistenciaLogic.setDatosDeep(this.datosDeep);
		this.periodoasistenciaLogic.setIsConDeep(true);
		
		periodoasistenciasRespaldo=this.periodoasistenciaLogic.getPeriodoAsistencias();
		
		this.periodoasistenciaLogic.setPeriodoAsistencias(periodoasistenciasParaReportes);	
		this.periodoasistenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		periodoasistenciasParaReportes=this.periodoasistenciaLogic.getPeriodoAsistencias();
		this.periodoasistenciaLogic.setPeriodoAsistencias(periodoasistenciasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoasistencia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PeriodoAsistencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPeriodoAsistencia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PeriodoAsistencia periodoasistencia : periodoasistenciasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPeriodoAsistencia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PeriodoAsistenciaConstantesFunciones.generarExcelReporteDataPeriodoAsistencia("NORMAL",row,workbook,periodoasistencia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PeriodoAsistenciaConstantesFunciones.getPeriodoAsistenciaDescripcion(periodoasistencia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPeriodoAsistencia() throws Exception {		
		this.startProcessPeriodoAsistencia(true);
	}
	
	public void startProcessPeriodoAsistencia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPeriodoAsistencia ,this.jPanelParametrosReportesPeriodoAsistencia, this.jScrollPanelDatosPeriodoAsistencia,this.jPanelPaginacionPeriodoAsistencia, this.jScrollPanelDatosEdicionPeriodoAsistencia, this.jPanelAccionesPeriodoAsistencia,this.jPanelAccionesFormularioPeriodoAsistencia,this.jmenuBarPeriodoAsistencia,this.jmenuBarDetallePeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,this.jTtoolBarDetallePeriodoAsistencia);		
		
		final JTabbedPane jTabbedPaneBusquedasPeriodoAsistencia=this.jTabbedPaneBusquedasPeriodoAsistencia; 
		
		final JPanel jPanelParametrosReportesPeriodoAsistencia=this.jPanelParametrosReportesPeriodoAsistencia;
		//final JScrollPane jScrollPanelDatosPeriodoAsistencia=this.jScrollPanelDatosPeriodoAsistencia;
		final JTable jTableDatosPeriodoAsistencia=this.jTableDatosPeriodoAsistencia;		
		final JPanel jPanelPaginacionPeriodoAsistencia=this.jPanelPaginacionPeriodoAsistencia;
		//final JScrollPane jScrollPanelDatosEdicionPeriodoAsistencia=this.jScrollPanelDatosEdicionPeriodoAsistencia;
		final JPanel jPanelAccionesPeriodoAsistencia=this.jPanelAccionesPeriodoAsistencia;
		
		JPanel jPanelCamposAuxiliarPeriodoAsistencia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPeriodoAsistencia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			jPanelCamposAuxiliarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelCamposPeriodoAsistencia;
			jPanelAccionesFormularioAuxiliarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelAccionesFormularioPeriodoAsistencia;
		}
		
		final JPanel jPanelCamposPeriodoAsistencia=jPanelCamposAuxiliarPeriodoAsistencia;
		final JPanel jPanelAccionesFormularioPeriodoAsistencia=jPanelAccionesFormularioAuxiliarPeriodoAsistencia;
		
		
		final JMenuBar jmenuBarPeriodoAsistencia=this.jmenuBarPeriodoAsistencia;
		final JToolBar jTtoolBarPeriodoAsistencia=this.jTtoolBarPeriodoAsistencia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPeriodoAsistencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPeriodoAsistencia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			jmenuBarDetalleAuxiliarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jmenuBarDetallePeriodoAsistencia;
			jTtoolBarDetalleAuxiliarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jTtoolBarDetallePeriodoAsistencia;
		}
		
		final JMenuBar jmenuBarDetallePeriodoAsistencia=jmenuBarDetalleAuxiliarPeriodoAsistencia;
		final JToolBar jTtoolBarDetallePeriodoAsistencia=jTtoolBarDetalleAuxiliarPeriodoAsistencia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPeriodoAsistencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPeriodoAsistencia;
			processRunnable.jTableDatos=jTableDatosPeriodoAsistencia;
			processRunnable.jPanelCampos=jPanelCamposPeriodoAsistencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionPeriodoAsistencia;
			processRunnable.jPanelAcciones=jPanelAccionesPeriodoAsistencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPeriodoAsistencia;
			
			
			processRunnable.jmenuBar=jmenuBarPeriodoAsistencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePeriodoAsistencia;
			processRunnable.jTtoolBar=jTtoolBarPeriodoAsistencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePeriodoAsistencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPeriodoAsistencia ,jPanelParametrosReportesPeriodoAsistencia,jTableDatosPeriodoAsistencia, /*jScrollPanelDatosPeriodoAsistencia,*/jPanelCamposPeriodoAsistencia,jPanelPaginacionPeriodoAsistencia, /*jScrollPanelDatosEdicionPeriodoAsistencia,*/ jPanelAccionesPeriodoAsistencia,jPanelAccionesFormularioPeriodoAsistencia,jmenuBarPeriodoAsistencia,jmenuBarDetallePeriodoAsistencia,jTtoolBarPeriodoAsistencia,jTtoolBarDetallePeriodoAsistencia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPeriodoAsistencia ,jPanelParametrosReportesPeriodoAsistencia, jScrollPanelDatosPeriodoAsistencia,jPanelPaginacionPeriodoAsistencia, jScrollPanelDatosEdicionPeriodoAsistencia, jPanelAccionesPeriodoAsistencia,jPanelAccionesFormularioPeriodoAsistencia,jmenuBarPeriodoAsistencia,jmenuBarDetallePeriodoAsistencia,jTtoolBarPeriodoAsistencia,jTtoolBarDetallePeriodoAsistencia);
						
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
	
	public void finishProcessPeriodoAsistencia() {// throws Exception 
		this.finishProcessPeriodoAsistencia(true);
	}
	
	public void finishProcessPeriodoAsistencia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPeriodoAsistencia ,this.jPanelParametrosReportesPeriodoAsistencia, this.jScrollPanelDatosPeriodoAsistencia,this.jPanelPaginacionPeriodoAsistencia, this.jScrollPanelDatosEdicionPeriodoAsistencia, this.jPanelAccionesPeriodoAsistencia,this.jPanelAccionesFormularioPeriodoAsistencia,this.jmenuBarPeriodoAsistencia,this.jmenuBarDetallePeriodoAsistencia,this.jTtoolBarPeriodoAsistencia,this.jTtoolBarDetallePeriodoAsistencia);		
		
		final JTabbedPane jTabbedPaneBusquedasPeriodoAsistencia=this.jTabbedPaneBusquedasPeriodoAsistencia; 
		
		final JPanel jPanelParametrosReportesPeriodoAsistencia=this.jPanelParametrosReportesPeriodoAsistencia;
		//final JScrollPane jScrollPanelDatosPeriodoAsistencia=this.jScrollPanelDatosPeriodoAsistencia;
		final JTable jTableDatosPeriodoAsistencia=this.jTableDatosPeriodoAsistencia;		
		final JPanel jPanelPaginacionPeriodoAsistencia=this.jPanelPaginacionPeriodoAsistencia;
		//final JScrollPane jScrollPanelDatosEdicionPeriodoAsistencia=this.jScrollPanelDatosEdicionPeriodoAsistencia;
		final JPanel jPanelAccionesPeriodoAsistencia=this.jPanelAccionesPeriodoAsistencia;
		
		JPanel jPanelCamposAuxiliarPeriodoAsistencia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPeriodoAsistencia=new JPanel();
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			jPanelCamposAuxiliarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelCamposPeriodoAsistencia;
			jPanelAccionesFormularioAuxiliarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelAccionesFormularioPeriodoAsistencia;
		}
		
		final JPanel jPanelCamposPeriodoAsistencia=jPanelCamposAuxiliarPeriodoAsistencia;
		final JPanel jPanelAccionesFormularioPeriodoAsistencia=jPanelAccionesFormularioAuxiliarPeriodoAsistencia;
		
		
		final JMenuBar jmenuBarPeriodoAsistencia=this.jmenuBarPeriodoAsistencia;		
		final JToolBar jTtoolBarPeriodoAsistencia=this.jTtoolBarPeriodoAsistencia;
				
		JMenuBar jmenuBarDetalleAuxiliarPeriodoAsistencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPeriodoAsistencia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			jmenuBarDetalleAuxiliarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jmenuBarDetallePeriodoAsistencia;
			jTtoolBarDetalleAuxiliarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jTtoolBarDetallePeriodoAsistencia;		
		}
		
		final JMenuBar jmenuBarDetallePeriodoAsistencia=jmenuBarDetalleAuxiliarPeriodoAsistencia;
		final JToolBar jTtoolBarDetallePeriodoAsistencia=jTtoolBarDetalleAuxiliarPeriodoAsistencia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPeriodoAsistencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPeriodoAsistencia;
			processRunnable.jTableDatos=jTableDatosPeriodoAsistencia;
			processRunnable.jPanelCampos=jPanelCamposPeriodoAsistencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionPeriodoAsistencia;
			processRunnable.jPanelAcciones=jPanelAccionesPeriodoAsistencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPeriodoAsistencia;
			
			
			processRunnable.jmenuBar=jmenuBarPeriodoAsistencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePeriodoAsistencia;
			processRunnable.jTtoolBar=jTtoolBarPeriodoAsistencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePeriodoAsistencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPeriodoAsistencia ,jPanelParametrosReportesPeriodoAsistencia, jTableDatosPeriodoAsistencia,/*jScrollPanelDatosPeriodoAsistencia,*/jPanelCamposPeriodoAsistencia,jPanelPaginacionPeriodoAsistencia, /*jScrollPanelDatosEdicionPeriodoAsistencia,*/ jPanelAccionesPeriodoAsistencia,jPanelAccionesFormularioPeriodoAsistencia,jmenuBarPeriodoAsistencia,jmenuBarDetallePeriodoAsistencia,jTtoolBarPeriodoAsistencia,jTtoolBarDetallePeriodoAsistencia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPeriodoAsistencia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPeriodoAsistencia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPeriodoAsistencia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPeriodoAsistencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPeriodoAsistencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePeriodoAsistencia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPeriodoAsistencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPeriodoAsistencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePeriodoAsistencia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.periodoasistenciaConstantesFunciones.getsFinalQueryPeriodoAsistencia();
		String  finalQueryPaginacionTodos=this.periodoasistenciaConstantesFunciones.getsFinalQueryPeriodoAsistencia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PeriodoAsistenciaConstantesFunciones.getArrayColumnasGlobalesNoPeriodoAsistencia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PeriodoAsistenciaConstantesFunciones.getArrayColumnasGlobalesPeriodoAsistencia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PeriodoAsistenciaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.periodoasistenciasEliminados= new ArrayList<PeriodoAsistencia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPeriodoAsistencia();
		
				///*PeriodoAsistenciaSessionBean*/this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
			
			if(this.periodoasistenciaSessionBean==null) {
				this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
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
					this.iNumeroPaginacion=PeriodoAsistenciaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PeriodoAsistenciaConstantesFunciones.getClassesForeignKeysOfPeriodoAsistencia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/periodoasistencia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			periodoasistenciasAux= new ArrayList<PeriodoAsistencia>();
			
				
			periodoasistenciaLogic.setDatosCliente(this.datosCliente);
			periodoasistenciaLogic.setDatosDeep(this.datosDeep);
			periodoasistenciaLogic.setIsConDeep(true);
			
			
			periodoasistenciaLogic.getPeriodoAsistenciaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					periodoasistenciaLogic.getTodosPeriodoAsistencias(finalQueryGlobal,pagination);
					
					//periodoasistenciaLogic.getTodosPeriodoAsistenciasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(periodoasistenciaLogic.getPeriodoAsistencias()==null|| periodoasistenciaLogic.getPeriodoAsistencias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periodoasistenciasAux= new ArrayList<PeriodoAsistencia>();
							periodoasistenciasAux.addAll(periodoasistenciaLogic.getPeriodoAsistencias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoasistenciasAux= new ArrayList<PeriodoAsistencia>();
							periodoasistenciasAux.addAll(periodoasistencias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periodoasistenciaLogic.getTodosPeriodoAsistencias(finalQueryGlobal+"",this.pagination);												
							
							//periodoasistenciaLogic.getTodosPeriodoAsistenciasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePeriodoAsistencias("Todos",periodoasistenciaLogic.getPeriodoAsistencias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							periodoasistenciaLogic.setPeriodoAsistencias(new ArrayList<PeriodoAsistencia>());					
							periodoasistenciaLogic.getPeriodoAsistencias().addAll(periodoasistenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoasistencias=new ArrayList<PeriodoAsistencia>();
							periodoasistencias.addAll(periodoasistenciasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPeriodoAsistencia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPeriodoAsistencia=this.idActual;
				
				} else if(this.idPeriodoAsistenciaActual!=null && this.idPeriodoAsistenciaActual!=0L) {
					idPeriodoAsistencia=idPeriodoAsistenciaActual;
				}
				
					
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndicePorId(idPeriodoAsistencia);
				
				this.periodoasistencias=new ArrayList<PeriodoAsistencia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					periodoasistenciaLogic.getEntity(idPeriodoAsistencia);
					
					//periodoasistenciaLogic.getEntityWithConnection(idPeriodoAsistencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoasistenciaLogic.setPeriodoAsistencias(new ArrayList<PeriodoAsistencia>());
					periodoasistenciaLogic.getPeriodoAsistencias().add(periodoasistenciaLogic.getPeriodoAsistencia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodoasistencias=new ArrayList<PeriodoAsistencia>();
					this.periodoasistencias.add(periodoasistencia);
				}
				
				if(periodoasistenciaLogic.getPeriodoAsistencia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periodoasistenciaLogic.getPeriodoAsistenciasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periodoasistenciaLogic.getPeriodoAsistencias()==null||periodoasistenciaLogic.getPeriodoAsistencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periodoasistencias==null|| periodoasistencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciasAux=new ArrayList<PeriodoAsistencia>();
						periodoasistenciasAux.addAll(periodoasistenciaLogic.getPeriodoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoasistenciasAux=new ArrayList<PeriodoAsistencia>();
							periodoasistenciasAux.addAll(periodoasistencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periodoasistenciaLogic.getPeriodoAsistenciasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodoAsistencias("FK_IdEjercicio",periodoasistenciaLogic.getPeriodoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodoAsistencias("FK_IdEjercicio",periodoasistencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciaLogic.setPeriodoAsistencias(new ArrayList<PeriodoAsistencia>());
						periodoasistenciaLogic.getPeriodoAsistencias().addAll(periodoasistenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoasistencias=new ArrayList<PeriodoAsistencia>();
							periodoasistencias.addAll(periodoasistenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periodoasistenciaLogic.getPeriodoAsistenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periodoasistenciaLogic.getPeriodoAsistencias()==null||periodoasistenciaLogic.getPeriodoAsistencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periodoasistencias==null|| periodoasistencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciasAux=new ArrayList<PeriodoAsistencia>();
						periodoasistenciasAux.addAll(periodoasistenciaLogic.getPeriodoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoasistenciasAux=new ArrayList<PeriodoAsistencia>();
							periodoasistenciasAux.addAll(periodoasistencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periodoasistenciaLogic.getPeriodoAsistenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodoAsistencias("FK_IdEmpresa",periodoasistenciaLogic.getPeriodoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodoAsistencias("FK_IdEmpresa",periodoasistencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciaLogic.setPeriodoAsistencias(new ArrayList<PeriodoAsistencia>());
						periodoasistenciaLogic.getPeriodoAsistencias().addAll(periodoasistenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoasistencias=new ArrayList<PeriodoAsistencia>();
							periodoasistencias.addAll(periodoasistenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					periodoasistenciaLogic.getPeriodoAsistenciasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=periodoasistenciaLogic.getPeriodoAsistencias()==null||periodoasistenciaLogic.getPeriodoAsistencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=periodoasistencias==null|| periodoasistencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciasAux=new ArrayList<PeriodoAsistencia>();
						periodoasistenciasAux.addAll(periodoasistenciaLogic.getPeriodoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoasistenciasAux=new ArrayList<PeriodoAsistencia>();
							periodoasistenciasAux.addAll(periodoasistencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							periodoasistenciaLogic.getPeriodoAsistenciasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PeriodoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePeriodoAsistencias("FK_IdPeriodo",periodoasistenciaLogic.getPeriodoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePeriodoAsistencias("FK_IdPeriodo",periodoasistencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciaLogic.setPeriodoAsistencias(new ArrayList<PeriodoAsistencia>());
						periodoasistenciaLogic.getPeriodoAsistencias().addAll(periodoasistenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoasistencias=new ArrayList<PeriodoAsistencia>();
							periodoasistencias.addAll(periodoasistenciasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPeriodoAsistencia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPeriodoAsistencia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=periodoasistenciaLogic.getPeriodoAsistencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periodoasistencias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=periodoasistenciaLogic.getPeriodoAsistencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=periodoasistencias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PeriodoAsistencia periodoasistencia) {
		Boolean permite=true;
		
		if(this.periodoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PeriodoAsistenciaConstantesFunciones.getOrderByListaPeriodoAsistencia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PeriodoAsistenciaConstantesFunciones.getOrderByListaPeriodoAsistencia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoAsistencia periodoasistencia:periodoasistenciaLogic.getPeriodoAsistencias()) {
				if(periodoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
					periodoasistenciaTotales=periodoasistencia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoAsistencia periodoasistencia:this.periodoasistencias) {
				if(periodoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
					periodoasistenciaTotales=periodoasistencia;
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
			this.periodoasistenciaAux=new PeriodoAsistencia();
			this.periodoasistenciaAux.setsType(Constantes2.S_TOTALES);
			this.periodoasistenciaAux.setIsNew(false);
			this.periodoasistenciaAux.setIsChanged(false);
			this.periodoasistenciaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PeriodoAsistenciaConstantesFunciones.TotalizarValoresFilaPeriodoAsistencia(this.periodoasistenciaLogic.getPeriodoAsistencias(),this.periodoasistenciaAux);
				
				this.periodoasistenciaLogic.getPeriodoAsistencias().add(this.periodoasistenciaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PeriodoAsistenciaConstantesFunciones.TotalizarValoresFilaPeriodoAsistencia(this.periodoasistencias,this.periodoasistenciaAux);
				
				this.periodoasistencias.add(this.periodoasistenciaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		periodoasistenciaTotales=new PeriodoAsistencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.periodoasistenciaLogic.getPeriodoAsistencias().remove(periodoasistenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.periodoasistencias.remove(periodoasistenciaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		periodoasistenciaTotales=new PeriodoAsistencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PeriodoAsistencia periodoasistencia:periodoasistenciaLogic.getPeriodoAsistencias()) {
				if(periodoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
					periodoasistenciaTotales=periodoasistencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PeriodoAsistenciaConstantesFunciones.TotalizarValoresFilaPeriodoAsistencia(this.periodoasistenciaLogic.getPeriodoAsistencias(),periodoasistenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PeriodoAsistencia periodoasistencia:this.periodoasistencias) {
				if(periodoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
					periodoasistenciaTotales=periodoasistencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PeriodoAsistenciaConstantesFunciones.TotalizarValoresFilaPeriodoAsistencia(this.periodoasistencias,periodoasistenciaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPeriodoAsistenciasFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodoAsistenciasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPeriodoAsistenciasFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPeriodoAsistenciasFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoasistenciaLogic.getPeriodoAsistenciasFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodoAsistenciasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoasistenciaLogic.getPeriodoAsistenciasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPeriodoAsistenciasFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoasistenciaLogic.getPeriodoAsistenciasFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
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
	
	public void inicializarPermisosPeriodoAsistencia() {
		this.isPermisoTodoPeriodoAsistencia=false;
		this.isPermisoNuevoPeriodoAsistencia=false;
		this.isPermisoActualizarPeriodoAsistencia=false;
		this.isPermisoActualizarOriginalPeriodoAsistencia=false;
		this.isPermisoEliminarPeriodoAsistencia=false;
		this.isPermisoGuardarCambiosPeriodoAsistencia=false;
		this.isPermisoConsultaPeriodoAsistencia=false;
		this.isPermisoBusquedaPeriodoAsistencia=false;
		this.isPermisoReportePeriodoAsistencia=false;		
		this.isPermisoOrdenPeriodoAsistencia=false;		
		this.isPermisoPaginacionMedioPeriodoAsistencia=false;		
		this.isPermisoPaginacionAltoPeriodoAsistencia=false;
		this.isPermisoPaginacionTodoPeriodoAsistencia=false;
		this.isPermisoCopiarPeriodoAsistencia=false;		
		this.isPermisoVerFormPeriodoAsistencia=false;		
		this.isPermisoDuplicarPeriodoAsistencia=false;		
		this.isPermisoOrdenPeriodoAsistencia=false;		
	}
	
	public void setPermisosUsuarioPeriodoAsistencia(Boolean isPermiso) {
		this.isPermisoTodoPeriodoAsistencia=isPermiso;
		this.isPermisoNuevoPeriodoAsistencia=isPermiso;
		this.isPermisoActualizarPeriodoAsistencia=isPermiso;
		this.isPermisoActualizarOriginalPeriodoAsistencia=isPermiso;
		this.isPermisoEliminarPeriodoAsistencia=isPermiso;
		this.isPermisoGuardarCambiosPeriodoAsistencia=isPermiso;
		this.isPermisoConsultaPeriodoAsistencia=isPermiso;
		this.isPermisoBusquedaPeriodoAsistencia=isPermiso;
		this.isPermisoReportePeriodoAsistencia=isPermiso;
		this.isPermisoOrdenPeriodoAsistencia=isPermiso;		
		this.isPermisoPaginacionMedioPeriodoAsistencia=isPermiso;		
		this.isPermisoPaginacionAltoPeriodoAsistencia=isPermiso;		
		this.isPermisoPaginacionTodoPeriodoAsistencia=isPermiso;		
		this.isPermisoCopiarPeriodoAsistencia=isPermiso;		
		this.isPermisoVerFormPeriodoAsistencia=isPermiso;		
		this.isPermisoDuplicarPeriodoAsistencia=isPermiso;
		this.isPermisoOrdenPeriodoAsistencia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPeriodoAsistencia(Boolean isPermiso) {
		//this.isPermisoTodoPeriodoAsistencia=isPermiso;
		this.isPermisoNuevoPeriodoAsistencia=isPermiso;
		this.isPermisoActualizarPeriodoAsistencia=isPermiso;
		this.isPermisoActualizarOriginalPeriodoAsistencia=isPermiso;
		this.isPermisoEliminarPeriodoAsistencia=isPermiso;
		this.isPermisoGuardarCambiosPeriodoAsistencia=isPermiso;
		//this.isPermisoConsultaPeriodoAsistencia=isPermiso;
		//this.isPermisoBusquedaPeriodoAsistencia=isPermiso;
		//this.isPermisoReportePeriodoAsistencia=isPermiso;
		//this.isPermisoOrdenPeriodoAsistencia=isPermiso;		
		//this.isPermisoPaginacionMedioPeriodoAsistencia=isPermiso;		
		//this.isPermisoPaginacionAltoPeriodoAsistencia=isPermiso;		
		//this.isPermisoPaginacionTodoPeriodoAsistencia=isPermiso;		
		//this.isPermisoCopiarPeriodoAsistencia=isPermiso;		
		//this.isPermisoDuplicarPeriodoAsistencia=isPermiso;
		//this.isPermisoOrdenPeriodoAsistencia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPeriodoAsistenciaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PeriodoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPeriodoAsistencia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPeriodoAsistenciaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPeriodoAsistenciaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPeriodoAsistenciaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPeriodoAsistenciaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPeriodoAsistencia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PeriodoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PeriodoAsistenciaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPeriodoAsistencia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPeriodoAsistencia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPeriodoAsistencia=this.isPermisoActualizarPeriodoAsistencia;
			this.isPermisoEliminarPeriodoAsistencia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPeriodoAsistencia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPeriodoAsistencia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPeriodoAsistencia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPeriodoAsistencia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePeriodoAsistencia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPeriodoAsistencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPeriodoAsistencia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPeriodoAsistencia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPeriodoAsistencia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPeriodoAsistencia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPeriodoAsistencia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPeriodoAsistencia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPeriodoAsistencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPeriodoAsistencia.setToolTipText(this.jTableDatosPeriodoAsistencia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPeriodoAsistencia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPeriodoAsistencia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PeriodoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PeriodoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPeriodoAsistencia() throws Exception {
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
	public void inicializarCombosForeignKeyPeriodoAsistenciaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPeriodoAsistenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PeriodoAsistenciaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPeriodoAsistenciaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
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

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyPeriodoAsistenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PeriodoAsistenciaParameterReturnGeneral periodoasistenciaReturnGeneral=new PeriodoAsistenciaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.periodoasistenciaConstantesFunciones.cargarid_empresaPeriodoAsistencia)
					 || (this.esRecargarFks && this.periodoasistenciaConstantesFunciones.cargarid_empresaPeriodoAsistencia)) {

					if(!this.periodoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+periodoasistenciaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.periodoasistenciaConstantesFunciones.cargarid_ejercicioPeriodoAsistencia)
					 || (this.esRecargarFks && this.periodoasistenciaConstantesFunciones.cargarid_ejercicioPeriodoAsistencia)) {

					if(!this.periodoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+periodoasistenciaSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.periodoasistenciaConstantesFunciones.cargarid_periodoPeriodoAsistencia)
					 || (this.esRecargarFks && this.periodoasistenciaConstantesFunciones.cargarid_periodoPeriodoAsistencia)) {

					if(!this.periodoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+periodoasistenciaSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				periodoasistenciaReturnGeneral=periodoasistenciaLogic.cargarCombosLoteForeignKeyPeriodoAsistencia(finalQueryGlobalEmpresa,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=periodoasistenciaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=periodoasistenciaReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=periodoasistenciaReturnGeneral.getperiodosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPeriodoAsistencia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.periodoasistenciaSessionBean==null) {
				this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
			}

			if(!this.periodoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.periodoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.periodoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
	
	public void initActionsCombosTodosForeignKeyPeriodoAsistencia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPeriodoAsistencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPeriodoAsistencia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.periodoasistencia.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.periodoasistencia.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodoAsistencia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPeriodoAsistencia(PeriodoAsistencia periodoasistencia)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPeriodoAsistencia(PeriodoAsistencia periodoasistencia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPeriodoAsistencia()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPeriodoAsistencia()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPeriodoAsistencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPeriodoAsistencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPeriodoAsistencia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPeriodoAsistencia()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPeriodoAsistencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPeriodoAsistencia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia!=null && this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia!=null && this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia!=null && this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public PeriodoAsistenciaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PeriodoAsistenciaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PeriodoAsistenciaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean(); 
		this.periodoasistenciaConstantesFunciones=new PeriodoAsistenciaConstantesFunciones(); 
		this.periodoasistenciaBean=new PeriodoAsistencia();//(this.periodoasistenciaConstantesFunciones); 		
		this.periodoasistenciaReturnGeneral=new PeriodoAsistenciaParameterReturnGeneral(); 
		
		this.periodoasistenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.periodoasistenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PeriodoAsistenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PeriodoAsistenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PeriodoAsistenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPeriodoAsistencia(true);
			
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
			
			this.periodoasistenciaConstantesFunciones=new PeriodoAsistenciaConstantesFunciones(); 
			this.periodoasistenciaBean=new PeriodoAsistencia();//this.periodoasistenciaConstantesFunciones); 			
			this.periodoasistenciaReturnGeneral=new PeriodoAsistenciaParameterReturnGeneral(); 
		
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Periodo Asistencia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.periodoasistencia=new PeriodoAsistencia();
			this.periodoasistencias = new ArrayList<PeriodoAsistencia>();
			this.periodoasistenciasAux = new ArrayList<PeriodoAsistencia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic=new PeriodoAsistenciaLogic();
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.periodoasistenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.periodoasistenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPeriodoAsistencia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPeriodoAsistencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPeriodoAsistencia);	
					}
					
					if(this.jInternalFrameImportacionPeriodoAsistencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPeriodoAsistencia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPeriodoAsistencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPeriodoAsistencia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPeriodoAsistencia);
				this.jInternalFrameDetalleFormPeriodoAsistencia.setVisible(false);
				this.jInternalFrameDetalleFormPeriodoAsistencia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPeriodoAsistencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPeriodoAsistencia);
					this.jInternalFrameReporteDinamicoPeriodoAsistencia.setVisible(false);
					this.jInternalFrameReporteDinamicoPeriodoAsistencia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPeriodoAsistencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPeriodoAsistencia);
					this.jInternalFrameImportacionPeriodoAsistencia.setVisible(false);
					this.jInternalFrameImportacionPeriodoAsistencia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPeriodoAsistencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPeriodoAsistencia);
					this.jInternalFrameOrderByPeriodoAsistencia.setVisible(false);
					this.jInternalFrameOrderByPeriodoAsistencia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPeriodoAsistenciaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PeriodoAsistenciaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.periodoasistenciaReturnGeneral=new PeriodoAsistenciaParameterReturnGeneral();
			
			this.periodoasistenciaParameterGeneral=new PeriodoAsistenciaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.periodoasistenciaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PeriodoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PeriodoAsistenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.periodoasistenciaSessionBean.getEsGuardarRelacionado(),this.periodoasistenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PeriodoAsistenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.periodoasistenciaSessionBean.getEsGuardarRelacionado(),this.periodoasistenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=false;
			this.isVisibilidadCeldaDuplicarPeriodoAsistencia=true;
			this.isVisibilidadCeldaCopiarPeriodoAsistencia=true;
			this.isVisibilidadCeldaVerFormPeriodoAsistencia=true;
			this.isVisibilidadCeldaOrdenPeriodoAsistencia=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;
			this.isVisibilidadCeldaModificarPeriodoAsistencia=false;
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=false;
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=false;
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=false;
			this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPeriodoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPeriodoAsistencia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPeriodoAsistencia(false);
			
			this.setPermisosUsuarioPeriodoAsistencia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado() 
				|| (this.periodoasistenciaSessionBean.getEsGuardarRelacionado() && this.periodoasistenciaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPeriodoAsistenciaClasesRelacionadas();
			}
			
			if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPeriodoAsistenciaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPeriodoAsistencia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPeriodoAsistencia();
			}
			
			if(!this.isPermisoBusquedaPeriodoAsistencia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPeriodoAsistencia,this.isPermisoPaginacionMedioPeriodoAsistencia,this.isPermisoPaginacionTodoPeriodoAsistencia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PeriodoAsistenciaConstantesFunciones.getTiposSeleccionarPeriodoAsistencia());
				
				this.tiposColumnasSelect=PeriodoAsistenciaConstantesFunciones.getTiposSeleccionarPeriodoAsistencia(true);
				
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
			//if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPeriodoAsistencia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPeriodoAsistencia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPeriodoAsistencia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoAsistencia() ;
			
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
				periodoasistenciaImplementable= (PeriodoAsistenciaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PeriodoAsistenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				periodoasistenciaImplementableHome= (PeriodoAsistenciaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PeriodoAsistenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.periodoasistencias= new ArrayList<PeriodoAsistencia>();
			this.periodoasistenciasEliminados= new ArrayList<PeriodoAsistencia>();
						
			this.isEsNuevoPeriodoAsistencia=false;
			this.esParaAccionDesdeFormularioPeriodoAsistencia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPeriodoAsistencia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPeriodoAsistencia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PeriodoAsistenciaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPeriodoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPeriodoAsistencia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPeriodoAsistencia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPeriodoAsistencia();
			}
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPeriodoAsistencia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPeriodoAsistencia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPeriodoAsistencia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPeriodoAsistencia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PeriodoAsistencia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPeriodoAsistencia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPeriodoAsistencia")) {
				iIndex=this.jInternalFrameDetalleFormPeriodoAsistencia.jTabbedPaneRelacionesPeriodoAsistencia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPeriodoAsistencia.jTabbedPaneRelacionesPeriodoAsistencia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPeriodoAsistencia();	
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
	
	public void cargarCombosForeignKeyPeriodoAsistencia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPeriodoAsistencia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPeriodoAsistencia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPeriodoAsistenciaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPeriodoAsistencia();
		
		this.cargarCombosFrameForeignKeyPeriodoAsistencia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPeriodoAsistencia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPeriodoAsistencia();
		}
	}
	
	
	
	public void jButtonNuevoPeriodoAsistenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
			
			if(jTableDatosPeriodoAsistencia.getRowCount()>=1) {
				jTableDatosPeriodoAsistencia.removeRowSelectionInterval(0, jTableDatosPeriodoAsistencia.getRowCount()-1);						
			}
			
			this.isEsNuevoPeriodoAsistencia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPeriodoAsistencia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPeriodoAsistencia(true);			
			//this.periodoasistencia=new PeriodoAsistencia();
			//this.periodoasistencia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodoAsistencia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoAsistencia() ;
			
			if(PeriodoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodoAsistencia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.periodoasistencia);	
			this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);				
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
			if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PeriodoAsistencia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPeriodoAsistenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPeriodoAsistencia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPeriodoAsistencia.getSelectedRows().length;			
			}
			
			periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPeriodoAsistencia--;			
				//PeriodoAsistencia periodoasistenciaAux= new PeriodoAsistencia();			
				//periodoasistenciaAux.setId(this.iIdNuevoPeriodoAsistencia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PeriodoAsistencia periodoasistenciaOrigen=new PeriodoAsistencia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PeriodoAsistencia periodoasistenciaOrigen : periodoasistenciasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							periodoasistenciaOrigen =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							periodoasistenciaOrigen =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPeriodoAsistencia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.periodoasistencia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPeriodoAsistencia(periodoasistenciaOrigen,this.periodoasistencia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.periodoasistenciaLogic.getPeriodoAsistencias().add(this.periodoasistenciaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.periodoasistencias.add(this.periodoasistenciaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
				
				this.jTableDatosPeriodoAsistencia.setRowSelectionInterval(this.getIndiceNuevoPeriodoAsistencia(), this.getIndiceNuevoPeriodoAsistencia());
				
				int iLastRow =  this.jTableDatosPeriodoAsistencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPeriodoAsistencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPeriodoAsistencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();									
		
			PeriodoAsistencia periodoasistenciaOrigen=new PeriodoAsistencia();
			PeriodoAsistencia periodoasistenciaDestino=new PeriodoAsistencia();
				
			periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPeriodoAsistencia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || periodoasistenciasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPeriodoAsistencia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciaOrigen =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						periodoasistenciaOrigen =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						periodoasistenciaDestino =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						periodoasistenciaDestino =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				periodoasistenciaOrigen =periodoasistenciasSeleccionados.get(0);
				periodoasistenciaDestino =periodoasistenciasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPeriodoAsistencia(periodoasistenciaOrigen,periodoasistenciaDestino,true,false);
				
				periodoasistenciaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(periodoasistenciaDestino,periodoasistenciaLogic.getPeriodoAsistencias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(periodoasistenciaDestino,periodoasistencias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
				
				//this.jTableDatosPeriodoAsistencia.setRowSelectionInterval(this.getIndiceNuevoPeriodoAsistencia(), this.getIndiceNuevoPeriodoAsistencia());
				
				int iLastRow =  this.jTableDatosPeriodoAsistencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPeriodoAsistencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPeriodoAsistencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPeriodoAsistencia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPeriodoAsistencia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPeriodoAsistencia.setVisible(!isVisible);
			this.jPanelPaginacionPeriodoAsistencia.setVisible(!isVisible);
			this.jPanelAccionesPeriodoAsistencia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePeriodoAsistencia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPeriodoAsistencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPeriodoAsistencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPeriodoAsistencia();
			
			this.abrirFrameOrderByPeriodoAsistencia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPeriodoAsistencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePeriodoAsistencia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPeriodoAsistencia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPeriodoAsistencia.isMaximum()) {
					this.jInternalFrameDetalleFormPeriodoAsistencia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPeriodoAsistencia.setSize(this.jInternalFrameDetalleFormPeriodoAsistencia.iWidthFormulario,this.jInternalFrameDetalleFormPeriodoAsistencia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPeriodoAsistencia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPeriodoAsistencia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPeriodoAsistencia.isMaximum()) {
						this.jInternalFrameDetalleFormPeriodoAsistencia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPeriodoAsistencia.jContentPaneDetallePeriodoAsistencia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPeriodoAsistencia.jTabbedPaneRelacionesPeriodoAsistencia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPeriodoAsistencia.jContentPaneDetallePeriodoAsistencia.getWidth(),PeriodoAsistenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPeriodoAsistencia.jTabbedPaneRelacionesPeriodoAsistencia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPeriodoAsistencia.jContentPaneDetallePeriodoAsistencia.getWidth(),PeriodoAsistenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPeriodoAsistencia.jTabbedPaneRelacionesPeriodoAsistencia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPeriodoAsistencia.jContentPaneDetallePeriodoAsistencia.getWidth(),PeriodoAsistenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPeriodoAsistencia.setVisible(true);
	        this.jInternalFrameDetalleFormPeriodoAsistencia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPeriodoAsistencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPeriodoAsistencia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPeriodoAsistencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoAsistencia,false,this);
				} else {
					this.jInternalFrameOrderByPeriodoAsistencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPeriodoAsistencia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPeriodoAsistencia);
				this.jInternalFrameOrderByPeriodoAsistencia.setVisible(false);
				this.jInternalFrameOrderByPeriodoAsistencia.setSelected(false);
				
				this.jInternalFrameOrderByPeriodoAsistencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPeriodoAsistencia"));
				
				this.inicializarActualizarBindingTablaOrderByPeriodoAsistencia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPeriodoAsistencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPeriodoAsistencia==null) {
				
				this.jInternalFrameImportacionPeriodoAsistencia=new ImportacionJInternalFrame(PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPeriodoAsistencia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPeriodoAsistencia);
				this.jInternalFrameImportacionPeriodoAsistencia.setVisible(false);
				this.jInternalFrameImportacionPeriodoAsistencia.setSelected(false);


				this.jInternalFrameImportacionPeriodoAsistencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPeriodoAsistencia"));
				this.jInternalFrameImportacionPeriodoAsistencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPeriodoAsistencia"));
				this.jInternalFrameImportacionPeriodoAsistencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPeriodoAsistencia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPeriodoAsistencia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPeriodoAsistencia==null) {
				this.jInternalFrameReporteDinamicoPeriodoAsistencia=new ReporteDinamicoJInternalFrame(PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPeriodoAsistencia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPeriodoAsistencia);
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.setVisible(false);
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodoAsistencia"));
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodoAsistencia"));
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodoAsistencia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodoAsistencia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePeriodoAsistencia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPeriodoAsistencia);
			
	       	this.jInternalFrameDetalleFormPeriodoAsistencia.setVisible(false);
	        this.jInternalFrameDetalleFormPeriodoAsistencia.setSelected(false);
			
			//this.jInternalFrameDetalleFormPeriodoAsistencia.dispose();
			//this.jInternalFrameDetalleFormPeriodoAsistencia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPeriodoAsistencia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPeriodoAsistencia.setVisible(true);
	        this.jInternalFrameReporteDinamicoPeriodoAsistencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPeriodoAsistencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPeriodoAsistencia.setVisible(true);
	        this.jInternalFrameImportacionPeriodoAsistencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPeriodoAsistencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPeriodoAsistencia.setVisible(true);
	        this.jInternalFrameOrderByPeriodoAsistencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPeriodoAsistencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPeriodoAsistencia.setVisible(false);
	        this.jInternalFrameOrderByPeriodoAsistencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPeriodoAsistencia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPeriodoAsistencia.setVisible(false);
	        this.jInternalFrameReporteDinamicoPeriodoAsistencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPeriodoAsistencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPeriodoAsistencia.setVisible(false);
	        this.jInternalFrameImportacionPeriodoAsistencia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPeriodoAsistencia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPeriodoAsistencia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPeriodoAsistencia(true);
			//this.isEsNuevoPeriodoAsistencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPeriodoAsistencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodoAsistencia(false) ;
			
			if(periodoasistenciaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PeriodoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodoAsistencia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoAsistencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPeriodoAsistenciaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPeriodoAsistencia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPeriodoAsistencia(true);
			//this.isEsNuevoPeriodoAsistencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.periodoasistencia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPeriodoAsistencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPeriodoAsistencia(false) ;
			
			if(PeriodoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePeriodoAsistencia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoAsistencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	
	public void jButtonActualizarPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPeriodoAsistencia(false);
			
			//if(!this.isEsNuevoPeriodoAsistencia) {								
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
				
			}
			
			if(this.permiteMantenimiento(this.periodoasistencia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPeriodoAsistencia=true;
					this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
					this.isEsNuevoPeriodoAsistencia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPeriodoAsistencia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPeriodoAsistencia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPeriodoAsistencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodoAsistencia(false);
				
				this.habilitarDeshabilitarControlesPeriodoAsistencia(false);
			
												
				
				if(PeriodoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePeriodoAsistencia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPeriodoAsistenciaActionPerformed(evt,periodoasistenciaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPeriodoAsistencia(this.periodoasistencia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPeriodoAsistencia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,periodoasistenciaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.periodoasistencia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				this.periodoasistencia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				this.periodoasistencia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.periodoasistencia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PeriodoAsistenciaModel) this.jTableDatosPeriodoAsistencia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPeriodoAsistencia=true;
				this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
				this.isEsNuevoPeriodoAsistencia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPeriodoAsistencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodoAsistencia(false);
				
				this.habilitarDeshabilitarControlesPeriodoAsistencia(false);
				
				
				
				if(PeriodoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePeriodoAsistencia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPeriodoAsistencia.getRowCount()>=1) {
				jTableDatosPeriodoAsistencia.removeRowSelectionInterval(0, jTableDatosPeriodoAsistencia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPeriodoAsistencia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPeriodoAsistencia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPeriodoAsistencia(false) ;
			
			this.isEsNuevoPeriodoAsistencia=false;
			
			if(PeriodoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePeriodoAsistencia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPeriodoAsistencia(false);
				
				//SI ES MANUAL
				if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPeriodoAsistencia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPeriodoAsistencia--;			
			//PeriodoAsistencia periodoasistenciaAux= new PeriodoAsistencia();			
			//periodoasistenciaAux.setId(this.iIdNuevoPeriodoAsistencia);
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPeriodoAsistencia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
			
			this.periodoasistencia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.periodoasistenciaLogic.getPeriodoAsistencias().add(this.periodoasistenciaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.periodoasistencias.add(this.periodoasistenciaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
			
			this.jTableDatosPeriodoAsistencia.setRowSelectionInterval(this.getIndiceNuevoPeriodoAsistencia(), this.getIndiceNuevoPeriodoAsistencia());
			
			int iLastRow =  this.jTableDatosPeriodoAsistencia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPeriodoAsistencia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPeriodoAsistencia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPeriodoAsistencia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoAsistencia(false);
			
			//SI ES MANUAL
			if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodoAsistencia();
			}
			
			//this.abrirFrameTreePeriodoAsistencia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Periodo AsistenciaS ?", "MANTENIMIENTO DE Periodo Asistencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPeriodoAsistencia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPeriodoAsistencia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.periodoasistenciaReturnGeneral=periodoasistenciaLogic.procesarImportacionPeriodoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.periodoasistenciaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPeriodoAsistenciaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPeriodoAsistencia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPeriodoAsistencia.setFileImportacion(this.jInternalFrameImportacionPeriodoAsistencia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPeriodoAsistencia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPeriodoAsistencia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPeriodoAsistencia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPeriodoAsistencia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();		

		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PeriodoAsistenciaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PeriodoAsistenciaBaseDesign.jrxml";
			
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
			
			this.generarReportePeriodoAsistencias("Todos",periodoasistenciasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
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
	
	public void jButtonGenerarExcelReporteDinamicoPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();		
		
		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoasistencia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PeriodoAsistencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PeriodoAsistencia periodoasistencia:periodoasistenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodoasistencia.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PeriodoAsistencia periodoasistencia:periodoasistenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodoasistencia.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PeriodoAsistencia periodoasistencia:periodoasistenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodoasistencia.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(PeriodoAsistencia periodoasistencia:periodoasistenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodoasistencia.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(PeriodoAsistencia periodoasistencia:periodoasistenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(periodoasistencia.getfecha_fin());
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
			//	this.getFilaCabeceraExportarExcelPeriodoAsistencia(row);				
			//	iRow++;
			//}				
			
			//for(PeriodoAsistencia periodoasistenciaAux:periodoasistenciasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPeriodoAsistencia(periodoasistenciaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
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
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoAsistencia(false);
			
			//SI ES MANUAL
			if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPeriodoAsistencia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoAsistencia(false);
			
			//SI ES MANUAL
			if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPeriodoAsistencia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPeriodoAsistencia(false);
			
			//SI ES MANUAL
			if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPeriodoAsistencia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPeriodoAsistencia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPeriodoAsistencia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPeriodoAsistencia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPeriodoAsistencia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPeriodoAsistencia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPeriodoAsistencia.setMinimumSize(dimensionMinimum);
		this.jTableDatosPeriodoAsistencia.setMaximumSize(dimensionMaximum);
		this.jTableDatosPeriodoAsistencia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPeriodoAsistencia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPeriodoAsistencia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPeriodoAsistencia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPeriodoAsistencia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPeriodoAsistencia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPeriodoAsistencia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoAsistencia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPeriodoAsistencia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPeriodoAsistencia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPeriodoAsistencia();
		
		this.inicializarActualizarBindingBotonesManualPeriodoAsistencia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPeriodoAsistencia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoAsistencia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodoAsistencia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodoAsistencia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPeriodoAsistencia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPeriodoAsistencia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePeriodoAsistencia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPeriodoAsistencia.jCheckBoxPostAccionNuevoPeriodoAsistencia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPeriodoAsistencia.jCheckBoxPostAccionSinCerrarPeriodoAsistencia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPeriodoAsistencia.jCheckBoxPostAccionSinMensajePeriodoAsistencia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPeriodoAsistencia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPeriodoAsistencia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePeriodoAsistencia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
				this.jInternalFrameDetalleFormPeriodoAsistencia.jCheckBoxPostAccionNuevoPeriodoAsistencia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPeriodoAsistencia.jCheckBoxPostAccionSinCerrarPeriodoAsistencia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPeriodoAsistencia.jCheckBoxPostAccionSinMensajePeriodoAsistencia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPeriodoAsistencia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPeriodoAsistencia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPeriodoAsistencia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPeriodoAsistencia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPeriodoAsistencia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPeriodoAsistencia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPeriodoAsistencia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPeriodoAsistencia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPeriodoAsistencia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPeriodoAsistencia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPeriodoAsistencia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPeriodoAsistencia(Boolean esInicializar) throws Exception {
		try	{	
			if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPeriodoAsistencia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPeriodoAsistencia() throws Exception {
		try	{
			if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPeriodoAsistencia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePeriodoAsistencia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPeriodoAsistencia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPeriodoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPeriodoAsistencia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPeriodoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPeriodoAsistencia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPeriodoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPeriodoAsistencia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPeriodoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPeriodoAsistencia.addItem(reporte);
			}
			
			
			if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPeriodoAsistencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPeriodoAsistencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPeriodoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPeriodoAsistencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPeriodoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPeriodoAsistencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPeriodoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPeriodoAsistencia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPeriodoAsistencia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodoAsistencia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPeriodoAsistencia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPeriodoAsistencia!=null) {
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPeriodoAsistencia!=null) {
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPeriodoAsistencia!=null) {
				
				if(this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPeriodoAsistencia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPeriodoAsistencia(Boolean esInicializar) throws Exception {				
		if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPeriodoAsistencia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPeriodoAsistencia() throws Exception {
		this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPeriodoAsistencia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPeriodoAsistenciaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistenciaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPeriodoAsistencia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=periodoasistenciaLogic.getPeriodoAsistencias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=periodoasistencias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPeriodoAsistencia.setModel(new PeriodoAsistenciaModel(this.periodoasistenciaLogic.getPeriodoAsistencias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPeriodoAsistencia.setModel(new PeriodoAsistenciaModel(this.periodoasistencias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPeriodoAsistencia!=null && this.jInternalFrameOrderByPeriodoAsistencia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPeriodoAsistencia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistencia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO,periodoasistenciaConstantesFunciones.resaltarSeleccionarPeriodoAsistencia,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PeriodoAsistenciaConstantesFunciones.SCLASSWEBTITULO,periodoasistenciaConstantesFunciones.resaltarSeleccionarPeriodoAsistencia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistencia,PeriodoAsistenciaConstantesFunciones.LABEL_ID));

		if(this.periodoasistenciaConstantesFunciones.mostraridPeriodoAsistencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoAsistenciaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.periodoasistenciaConstantesFunciones.resaltaridPeriodoAsistencia,this.periodoasistenciaConstantesFunciones.activaridPeriodoAsistencia,this,true,"idPeriodoAsistencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.periodoasistenciaConstantesFunciones.resaltaridPeriodoAsistencia,this.periodoasistenciaConstantesFunciones.activaridPeriodoAsistencia,this,true,"idPeriodoAsistencia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistencia,PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.periodoasistenciaConstantesFunciones.mostrarid_empresaPeriodoAsistencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.periodoasistenciaConstantesFunciones.resaltarid_empresaPeriodoAsistencia,this,this.periodoasistenciaConstantesFunciones.activarid_empresaPeriodoAsistencia));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.periodoasistenciaConstantesFunciones.resaltarid_empresaPeriodoAsistencia,this,this.periodoasistenciaConstantesFunciones.activarid_empresaPeriodoAsistencia,false,"id_empresaPeriodoAsistencia","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistencia,PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.periodoasistenciaConstantesFunciones.mostrarid_ejercicioPeriodoAsistencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.periodoasistenciaConstantesFunciones.resaltarid_ejercicioPeriodoAsistencia,this,this.periodoasistenciaConstantesFunciones.activarid_ejercicioPeriodoAsistencia));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.periodoasistenciaConstantesFunciones.resaltarid_ejercicioPeriodoAsistencia,this,this.periodoasistenciaConstantesFunciones.activarid_ejercicioPeriodoAsistencia,false,"id_ejercicioPeriodoAsistencia","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistencia,PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO));

		if(this.periodoasistenciaConstantesFunciones.mostrarid_periodoPeriodoAsistencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.periodoasistenciaConstantesFunciones.resaltarid_periodoPeriodoAsistencia,this,this.periodoasistenciaConstantesFunciones.activarid_periodoPeriodoAsistencia));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.periodoasistenciaConstantesFunciones.resaltarid_periodoPeriodoAsistencia,this,this.periodoasistenciaConstantesFunciones.activarid_periodoPeriodoAsistencia,false,"id_periodoPeriodoAsistencia","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistencia,PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO));

		if(this.periodoasistenciaConstantesFunciones.mostrarfecha_inicioPeriodoAsistencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.periodoasistenciaConstantesFunciones.resaltarfecha_inicioPeriodoAsistencia,this.periodoasistenciaConstantesFunciones.activarfecha_inicioPeriodoAsistencia,this,true,"fecha_inicioPeriodoAsistencia","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.periodoasistenciaConstantesFunciones.resaltarfecha_inicioPeriodoAsistencia,this.periodoasistenciaConstantesFunciones.activarfecha_inicioPeriodoAsistencia,this,true,"fecha_inicioPeriodoAsistencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistencia,PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN));

		if(this.periodoasistenciaConstantesFunciones.mostrarfecha_finPeriodoAsistencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.periodoasistenciaConstantesFunciones.resaltarfecha_finPeriodoAsistencia,this.periodoasistenciaConstantesFunciones.activarfecha_finPeriodoAsistencia,this,true,"fecha_finPeriodoAsistencia","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.periodoasistenciaConstantesFunciones.resaltarfecha_finPeriodoAsistencia,this.periodoasistenciaConstantesFunciones.activarfecha_finPeriodoAsistencia,this,true,"fecha_finPeriodoAsistencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PeriodoAsistenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.periodoasistenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.periodoasistenciaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPeriodoAsistencia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.periodoasistenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.periodoasistenciaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPeriodoAsistencia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.periodoasistenciaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.periodoasistenciaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPeriodoAsistencia.addColumn(tableColumn);
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
			
			this.jTableDatosPeriodoAsistencia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPeriodoAsistencia.moveColumn(this.jTableDatosPeriodoAsistencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPeriodoAsistencia.moveColumn(this.jTableDatosPeriodoAsistencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPeriodoAsistencia.moveColumn(this.jTableDatosPeriodoAsistencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPeriodoAsistencia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPeriodoAsistencia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPeriodoAsistencia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPeriodoAsistencia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPeriodoAsistencia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPeriodoAsistencia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPeriodoAsistencia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=periodoasistenciaLogic.getPeriodoAsistencias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=periodoasistencias.size()-1;
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
		//this.jTableDatosPeriodoAsistencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPeriodoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPeriodoAsistencia();
			
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
				
				//this.isEsNuevoPeriodoAsistencia=false;
					
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
				if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPeriodoAsistencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPeriodoAsistencia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.periodoasistencia.getsType().equals("DUPLICADO")
				   || this.periodoasistencia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPeriodoAsistencia=true;
				
				} else {
					this.isEsNuevoPeriodoAsistencia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
					if(this.periodoasistencia.getId()>=0 && !this.periodoasistencia.getIsNew()) {						
						this.isEsNuevoPeriodoAsistencia=false;
						
					} else {
						this.isEsNuevoPeriodoAsistencia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPeriodoAsistencia(esRelaciones);						
				
				this.seleccionarPeriodoAsistencia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.periodoasistencia.getId()<0) {
					this.isEsNuevoPeriodoAsistencia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPeriodoAsistencia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPeriodoAsistencia(evt,rowIndex);
				}	
				
				if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PeriodoAsistencia: " + this.dDif); 
					}
				}								
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPeriodoAsistencia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.periodoasistencia)) {
					if(this.periodoasistencia.getId()>0) {
						this.periodoasistencia.setIsDeleted(true);
						
						this.periodoasistenciasEliminados.add(this.periodoasistencia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.periodoasistenciaLogic.getPeriodoAsistencias().remove(this.periodoasistencia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.periodoasistencias.remove(this.periodoasistencia);				
					}
					
					
					((PeriodoAsistenciaModel) this.jTableDatosPeriodoAsistencia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPeriodoAsistencia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPeriodoAsistencia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPeriodoAsistencia) {
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPeriodoAsistencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPeriodoAsistencia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPeriodoAsistencia(this.periodoasistencia);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.periodoasistenciaConstantesFunciones.cargarid_empresaPeriodoAsistencia || this.periodoasistenciaConstantesFunciones.event_dependid_empresaPeriodoAsistencia) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.periodoasistencia.getid_empresa());
									//this.inicializarActualizarBindingPeriodoAsistencia(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(periodoasistencia.getEmpresa()!=null) {
							this.empresasForeignKey.add(periodoasistencia.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.periodoasistencia.getid_empresa(),false,"Formulario");

					//Ejercicio
					if(!this.periodoasistenciaConstantesFunciones.cargarid_ejercicioPeriodoAsistencia || this.periodoasistenciaConstantesFunciones.event_dependid_ejercicioPeriodoAsistencia) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.periodoasistencia.getid_ejercicio());
									//this.inicializarActualizarBindingPeriodoAsistencia(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(periodoasistencia.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(periodoasistencia.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.periodoasistencia.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.periodoasistenciaConstantesFunciones.cargarid_periodoPeriodoAsistencia || this.periodoasistenciaConstantesFunciones.event_dependid_periodoPeriodoAsistencia) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.periodoasistencia.getid_periodo());
									//this.inicializarActualizarBindingPeriodoAsistencia(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(periodoasistencia.getPeriodo()!=null) {
							this.periodosForeignKey.add(periodoasistencia.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.periodoasistencia.getid_periodo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPeriodoAsistencia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPeriodoAsistencia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPeriodoAsistencia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPeriodoAsistencia(PeriodoAsistencia periodoasistencia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPeriodoAsistencia(periodoasistencia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPeriodoAsistencia(PeriodoAsistencia periodoasistencia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPeriodoAsistencia(periodoasistencia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPeriodoAsistencia(periodoasistencia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPeriodoAsistencia(periodoasistencia);
	}
	
	public void setVariablesObjetoActualToFormularioPeriodoAsistencia(PeriodoAsistencia periodoasistencia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.setText(periodoasistencia.getId().toString());
			this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_inicioPeriodoAsistencia.setDate(periodoasistencia.getfecha_inicio());
			this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_finPeriodoAsistencia.setDate(periodoasistencia.getfecha_fin());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PeriodoAsistencia periodoasistenciaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,periodoasistenciaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PeriodoAsistencia periodoasistenciaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				periodoasistenciaLocal=this.periodoasistencia;
			} else {
				periodoasistenciaLocal=this.periodoasistenciaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(periodoasistenciaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPeriodoAsistencia(periodoasistenciaLocal,true);
					
					if(periodoasistenciaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(periodoasistenciaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(periodoasistenciaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPeriodoAsistencia(PeriodoAsistencia periodoasistencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPeriodoAsistencia(periodoasistencia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(periodoasistencia);
	}
	
	public void setVariablesFormularioToObjetoActualPeriodoAsistencia(PeriodoAsistencia periodoasistencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPeriodoAsistencia(periodoasistencia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPeriodoAsistencia(PeriodoAsistencia periodoasistencia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.getText()==null || this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.getText()=="" || this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.getText()=="Id") {
				this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.setText("0");
			}

			if(conColumnasBase) {periodoasistencia.setId(Long.parseLong(this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoAsistenciaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelIdPeriodoAsistencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periodoasistencia.setfecha_inicio(this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_inicioPeriodoAsistencia.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelfecha_inicioPeriodoAsistencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			periodoasistencia.setfecha_fin(this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_finPeriodoAsistencia.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelfecha_finPeriodoAsistencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPeriodoAsistencia(PeriodoAsistencia periodoasistenciaBean,PeriodoAsistencia periodoasistencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPeriodoAsistencia(PeriodoAsistencia periodoasistenciaOrigen,PeriodoAsistencia periodoasistencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && periodoasistenciaOrigen.getId()!=null && !periodoasistenciaOrigen.getId().equals(0L))) {periodoasistencia.setId(periodoasistenciaOrigen.getId());}}
			if(conDefault || (!conDefault && periodoasistenciaOrigen.getfecha_inicio()!=null && !periodoasistenciaOrigen.getfecha_inicio().equals(new Date()))) {periodoasistencia.setfecha_inicio(periodoasistenciaOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && periodoasistenciaOrigen.getfecha_fin()!=null && !periodoasistenciaOrigen.getfecha_fin().equals(new Date()))) {periodoasistencia.setfecha_fin(periodoasistenciaOrigen.getfecha_fin());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPeriodoAsistencia(PeriodoAsistencia periodoasistencia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.setText(periodoasistencia.getId().toString());
			this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_inicioPeriodoAsistencia.setDate(periodoasistencia.getfecha_inicio());
			this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_finPeriodoAsistencia.setDate(periodoasistencia.getfecha_fin());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPeriodoAsistencia(PeriodoAsistenciaBean periodoasistenciaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.setText(periodoasistenciaBean.getId().toString());
			this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_inicioPeriodoAsistencia.setDate(periodoasistenciaBean.getfecha_inicio());
			this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_finPeriodoAsistencia.setDate(periodoasistenciaBean.getfecha_fin());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPeriodoAsistencia(PeriodoAsistenciaParameterReturnGeneral periodoasistenciaReturnGeneral,PeriodoAsistenciaBean periodoasistenciaBean,Boolean conDefault) throws Exception { 
		try {
			PeriodoAsistencia periodoasistenciaLocal=new PeriodoAsistencia();
			
			periodoasistenciaLocal=periodoasistenciaReturnGeneral.getPeriodoAsistencia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && periodoasistenciaLocal.getId()!=null && !periodoasistenciaLocal.getId().equals(0L))) {periodoasistenciaBean.setId(periodoasistenciaLocal.getId());}}
			if(conDefault || (!conDefault && periodoasistenciaLocal.getfecha_inicio()!=null && !periodoasistenciaLocal.getfecha_inicio().equals(new Date()))) {periodoasistenciaBean.setfecha_inicio(periodoasistenciaLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && periodoasistenciaLocal.getfecha_fin()!=null && !periodoasistenciaLocal.getfecha_fin().equals(new Date()))) {periodoasistenciaBean.setfecha_fin(periodoasistenciaLocal.getfecha_fin());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPeriodoAsistenciaGenerico(Long idPeriodoAsistenciaSeleccionado,JComboBox jComboBoxPeriodoAsistencia,List<PeriodoAsistencia> periodoasistenciasLocal)throws Exception {
		try {
			PeriodoAsistencia  periodoasistenciaTemp=null;

			for(PeriodoAsistencia periodoasistenciaAux:periodoasistenciasLocal) {
				if(periodoasistenciaAux.getId()!=null && periodoasistenciaAux.getId().equals(idPeriodoAsistenciaSeleccionado)) {
					periodoasistenciaTemp=periodoasistenciaAux;
					break;
				}
			}

			jComboBoxPeriodoAsistencia.setSelectedItem(periodoasistenciaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPeriodoAsistenciaGenerico(JComboBox jComboBoxPeriodoAsistencia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPeriodoAsistencia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPeriodoAsistencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPeriodoAsistencia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPeriodoAsistencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPeriodoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPeriodoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periodoasistencia=(PeriodoAsistencia) periodoasistenciaLogic.getPeriodoAsistencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			periodoasistencia =(PeriodoAsistencia) periodoasistencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!periodoasistencia.getIsNew() && !periodoasistencia.getIsChanged() && !periodoasistencia.getIsDeleted()) {
				sDescripcion=periodoasistencia.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=periodoasistencia.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!periodoasistencia.getIsNew() && !periodoasistencia.getIsChanged() && !periodoasistencia.getIsDeleted()) {
				sDescripcion=periodoasistencia.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=periodoasistencia.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!periodoasistencia.getIsNew() && !periodoasistencia.getIsChanged() && !periodoasistencia.getIsDeleted()) {
				sDescripcion=periodoasistencia.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=periodoasistencia.getperiodo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PeriodoAsistencia periodoasistenciaRow=new PeriodoAsistencia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periodoasistenciaRow=(PeriodoAsistencia) periodoasistenciaLogic.getPeriodoAsistencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			periodoasistenciaRow=(PeriodoAsistencia) periodoasistencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPeriodoAsistencia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPeriodoAsistencia.setVisible((this.isVisibilidadCeldaNuevoPeriodoAsistencia && this.isPermisoNuevoPeriodoAsistencia));			
			this.jButtonDuplicarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaDuplicarPeriodoAsistencia && this.isPermisoDuplicarPeriodoAsistencia));			
			this.jButtonCopiarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaCopiarPeriodoAsistencia && this.isPermisoCopiarPeriodoAsistencia));
			this.jButtonVerFormPeriodoAsistencia.setVisible((this.isVisibilidadCeldaVerFormPeriodoAsistencia && this.isPermisoVerFormPeriodoAsistencia));
			
			this.jButtonAbrirOrderByPeriodoAsistencia.setVisible((this.isVisibilidadCeldaOrdenPeriodoAsistencia && this.isPermisoOrdenPeriodoAsistencia));			
			
			this.jButtonNuevoRelacionesPeriodoAsistencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia && this.isPermisoNuevoPeriodoAsistencia));			
			this.jButtonNuevoGuardarCambiosPeriodoAsistencia.setVisible((this.isVisibilidadCeldaNuevoPeriodoAsistencia && this.isPermisoNuevoPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonModificarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaModificarPeriodoAsistencia && this.isPermisoActualizarPeriodoAsistencia));	
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaActualizarPeriodoAsistencia && this.isPermisoActualizarPeriodoAsistencia));	
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaEliminarPeriodoAsistencia && this.isPermisoEliminarPeriodoAsistencia));
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarPeriodoAsistencia.setVisible(this.isVisibilidadCeldaCancelarPeriodoAsistencia);							
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosPeriodoAsistencia.setVisible((this.isVisibilidadCeldaGuardarPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));			
			
			}
						
			this.jButtonGuardarCambiosTablaPeriodoAsistencia.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaNuevoPeriodoAsistencia && this.isPermisoNuevoPeriodoAsistencia));						
			this.jButtonDuplicarToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaDuplicarPeriodoAsistencia && this.isPermisoDuplicarPeriodoAsistencia));						
			this.jButtonCopiarToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaCopiarPeriodoAsistencia && this.isPermisoCopiarPeriodoAsistencia));			
			this.jButtonVerFormToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaVerFormPeriodoAsistencia && this.isPermisoVerFormPeriodoAsistencia));			
			this.jButtonAbrirOrderByToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaOrdenPeriodoAsistencia && this.isPermisoOrdenPeriodoAsistencia));
			this.jButtonNuevoRelacionesToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia && this.isPermisoNuevoPeriodoAsistencia));			
			this.jButtonNuevoGuardarCambiosToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaNuevoPeriodoAsistencia && this.isPermisoNuevoPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));			
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonModificarToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaModificarPeriodoAsistencia && this.isPermisoActualizarPeriodoAsistencia));	
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaActualizarPeriodoAsistencia  && this.isPermisoActualizarPeriodoAsistencia));	
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaEliminarPeriodoAsistencia && this.isPermisoEliminarPeriodoAsistencia));
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarToolBarPeriodoAsistencia.setVisible(this.isVisibilidadCeldaCancelarPeriodoAsistencia);				
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaGuardarPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPeriodoAsistencia.setVisible((this.isVisibilidadCeldaNuevoPeriodoAsistencia && this.isPermisoNuevoPeriodoAsistencia));			
			this.jMenuItemDuplicarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaDuplicarPeriodoAsistencia && this.isPermisoDuplicarPeriodoAsistencia));			
			this.jMenuItemCopiarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaCopiarPeriodoAsistencia && this.isPermisoCopiarPeriodoAsistencia));			
			this.jMenuItemVerFormPeriodoAsistencia.setVisible((this.isVisibilidadCeldaVerFormPeriodoAsistencia && this.isPermisoVerFormPeriodoAsistencia));			
			this.jMenuItemAbrirOrderByPeriodoAsistencia.setVisible((this.isVisibilidadCeldaOrdenPeriodoAsistencia && this.isPermisoOrdenPeriodoAsistencia));			
			//this.jMenuItemMostrarOcultarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaOrdenPeriodoAsistencia && this.isPermisoOrdenPeriodoAsistencia));
			this.jMenuItemDetalleAbrirOrderByPeriodoAsistencia.setVisible((this.isVisibilidadCeldaOrdenPeriodoAsistencia && this.isPermisoOrdenPeriodoAsistencia));			
			//this.jMenuItemDetalleMostrarOcultarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaOrdenPeriodoAsistencia && this.isPermisoOrdenPeriodoAsistencia));			
			this.jMenuItemNuevoRelacionesPeriodoAsistencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia && this.isPermisoNuevoPeriodoAsistencia));			
			this.jMenuItemNuevoGuardarCambiosPeriodoAsistencia.setVisible((this.isVisibilidadCeldaNuevoPeriodoAsistencia && this.isPermisoNuevoPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));									
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemModificarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaModificarPeriodoAsistencia && this.isPermisoActualizarPeriodoAsistencia));	
			this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemActualizarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaActualizarPeriodoAsistencia && this.isPermisoActualizarPeriodoAsistencia));	
			this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemEliminarPeriodoAsistencia.setVisible((this.isVisibilidadCeldaEliminarPeriodoAsistencia && this.isPermisoEliminarPeriodoAsistencia));
			this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemCancelarPeriodoAsistencia.setVisible(this.isVisibilidadCeldaCancelarPeriodoAsistencia);				
			}
			
			this.jMenuItemGuardarCambiosPeriodoAsistencia.setVisible((this.isVisibilidadCeldaGuardarPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));						
			this.jMenuItemGuardarCambiosTablaPeriodoAsistencia.setVisible((this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=this.jButtonNuevoPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaDuplicarPeriodoAsistencia=this.jButtonDuplicarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaCopiarPeriodoAsistencia=this.jButtonCopiarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaVerFormPeriodoAsistencia=this.jButtonVerFormPeriodoAsistencia.isVisible();
			
			this.isVisibilidadCeldaOrdenPeriodoAsistencia=this.jButtonAbrirOrderByPeriodoAsistencia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=this.jButtonNuevoRelacionesPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaModificarPeriodoAsistencia=this.jButtonModificarPeriodoAsistencia.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaGuardarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosPeriodoAsistencia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=this.jButtonGuardarCambiosTablaPeriodoAsistencia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=this.jButtonNuevoToolBarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=this.jButtonNuevoRelacionesToolBarPeriodoAsistencia.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			this.isVisibilidadCeldaModificarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonModificarToolBarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarToolBarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarToolBarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarToolBarPeriodoAsistencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPeriodoAsistencia=this.jButtonGuardarCambiosToolBarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=this.jButtonGuardarCambiosTablaToolBarPeriodoAsistencia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=this.jMenuItemNuevoPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=this.jMenuItemNuevoRelacionesPeriodoAsistencia.isVisible();
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			this.isVisibilidadCeldaModificarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemModificarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemActualizarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemEliminarPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemCancelarPeriodoAsistencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPeriodoAsistencia=this.jMenuItemGuardarCambiosPeriodoAsistencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=this.jMenuItemGuardarCambiosTablaPeriodoAsistencia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPeriodoAsistencia(Boolean esInicializar) {
		if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {
				//if(this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPeriodoAsistencia();
			}
			
			this.inicializarActualizarBindingBotonesManualPeriodoAsistencia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPeriodoAsistencia() {
		this.jButtonNuevoPeriodoAsistencia.setVisible(this.isPermisoNuevoPeriodoAsistencia);			
		this.jButtonDuplicarPeriodoAsistencia.setVisible(this.isPermisoDuplicarPeriodoAsistencia);			
		this.jButtonCopiarPeriodoAsistencia.setVisible(this.isPermisoCopiarPeriodoAsistencia);			
		this.jButtonVerFormPeriodoAsistencia.setVisible(this.isPermisoVerFormPeriodoAsistencia);			
		
		this.jButtonAbrirOrderByPeriodoAsistencia.setVisible(this.isPermisoOrdenPeriodoAsistencia);					
		
		this.jButtonNuevoRelacionesPeriodoAsistencia.setVisible(this.isPermisoNuevoPeriodoAsistencia);			
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonModificarPeriodoAsistencia.setVisible(this.isPermisoActualizarPeriodoAsistencia);	
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarPeriodoAsistencia.setVisible(this.isPermisoActualizarPeriodoAsistencia);	
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarPeriodoAsistencia.setVisible(this.isPermisoEliminarPeriodoAsistencia);
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarPeriodoAsistencia.setVisible(this.isVisibilidadCeldaCancelarPeriodoAsistencia);						
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosPeriodoAsistencia.setVisible(this.isPermisoGuardarCambiosPeriodoAsistencia);							
		}
		
		this.jButtonGuardarCambiosTablaPeriodoAsistencia.setVisible(this.isPermisoActualizarPeriodoAsistencia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePeriodoAsistencia() {
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonModificarPeriodoAsistencia.setVisible(this.isPermisoActualizarPeriodoAsistencia);	
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarPeriodoAsistencia.setVisible(this.isPermisoActualizarPeriodoAsistencia);	
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarPeriodoAsistencia.setVisible(this.isPermisoEliminarPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarPeriodoAsistencia.setVisible(this.isVisibilidadCeldaCancelarPeriodoAsistencia);							
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosPeriodoAsistencia.setVisible((this.isVisibilidadCeldaGuardarPeriodoAsistencia && this.isPermisoGuardarCambiosPeriodoAsistencia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPeriodoAsistencia() {
		if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPeriodoAsistencia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPeriodoAsistencia() {
	}
	
	public void jTableDatosPeriodoAsistenciaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPeriodoAsistencia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPeriodoAsistenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.getperiodoasistencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoasistencia==null) {
						this.periodoasistencia = new PeriodoAsistencia();
					}

					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
				}

				if(this.periodoasistencia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.periodoasistencia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoAsistencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPeriodoAsistenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPeriodoAsistencia(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodoAsistencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodoAsistencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.getperiodoasistencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.periodoasistenciaLogic.getConnexion());

				if(this.periodoasistencia.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.periodoasistencia.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodoAsistencia=(TitledBorder)this.jScrollPanelDatosPeriodoAsistencia.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPeriodoAsistencia.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPeriodoAsistenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.getperiodoasistencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoasistencia==null) {
						this.periodoasistencia = new PeriodoAsistencia();
					}

					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
				}

				if(this.periodoasistencia.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.periodoasistencia.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoAsistencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPeriodoAsistenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPeriodoAsistencia(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodoAsistencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodoAsistencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.getperiodoasistencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.periodoasistenciaLogic.getConnexion());

				if(this.periodoasistencia.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.periodoasistencia.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodoAsistencia=(TitledBorder)this.jScrollPanelDatosPeriodoAsistencia.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPeriodoAsistencia.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPeriodoAsistenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.getperiodoasistencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoasistencia==null) {
						this.periodoasistencia = new PeriodoAsistencia();
					}

					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
				}

				if(this.periodoasistencia.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.periodoasistencia.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoAsistencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPeriodoAsistenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPeriodoAsistencia(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPeriodoAsistencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPeriodoAsistencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.getperiodoasistencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.periodoasistenciaLogic.getConnexion());

				if(this.periodoasistencia.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.periodoasistencia.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPeriodoAsistencia=(TitledBorder)this.jScrollPanelDatosPeriodoAsistencia.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPeriodoAsistencia.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPeriodoAsistenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.getperiodoasistencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoasistencia==null) {
						this.periodoasistencia = new PeriodoAsistencia();
					}

					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
				}

				if(this.periodoasistencia.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.periodoasistencia.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoAsistencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioPeriodoAsistenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.getperiodoasistencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoasistencia==null) {
						this.periodoasistencia = new PeriodoAsistencia();
					}

					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
				}

				if(this.periodoasistencia.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.periodoasistencia.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoAsistencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finPeriodoAsistenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.getperiodoasistencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.periodoasistencia==null) {
						this.periodoasistencia = new PeriodoAsistencia();
					}

					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);
				}

				if(this.periodoasistencia.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.periodoasistencia.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPeriodoAsistencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodoAsistencia(false,false);

			this.getPeriodoAsistenciasFK_IdEjercicio();

			this.inicializarActualizarBindingPeriodoAsistencia(false);

			//if(PeriodoAsistenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodoAsistencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodoAsistencia(false,false);

			this.getPeriodoAsistenciasFK_IdEmpresa();

			this.inicializarActualizarBindingPeriodoAsistencia(false);

			//if(PeriodoAsistenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodoAsistencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPeriodoAsistenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPeriodoAsistencia(false,false);

			this.getPeriodoAsistenciasFK_IdPeriodo();

			this.inicializarActualizarBindingPeriodoAsistencia(false);

			//if(PeriodoAsistenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPeriodoAsistencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.periodoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePeriodoAsistencia() {
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.setVisible(false);	    			
			this.jInternalFrameDetalleFormPeriodoAsistencia.dispose();
			this.jInternalFrameDetalleFormPeriodoAsistencia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPeriodoAsistencia!=null) {
			this.jInternalFrameReporteDinamicoPeriodoAsistencia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPeriodoAsistencia.dispose();
			this.jInternalFrameReporteDinamicoPeriodoAsistencia=null;
		}
		
		if(this.jInternalFrameImportacionPeriodoAsistencia!=null) {
			this.jInternalFrameImportacionPeriodoAsistencia.setVisible(false);	    			
			this.jInternalFrameImportacionPeriodoAsistencia.dispose();
			this.jInternalFrameImportacionPeriodoAsistencia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPeriodoAsistencia();
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
			
			if(sTipo.equals("NuevoPeriodoAsistencia")) {
				jButtonNuevoPeriodoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPeriodoAsistencia")) {
				jButtonDuplicarPeriodoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPeriodoAsistencia")) {
				jButtonCopiarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormPeriodoAsistencia")) {
				jButtonVerFormPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPeriodoAsistencia")) {
				jButtonNuevoPeriodoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPeriodoAsistencia")) {
				jButtonDuplicarPeriodoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPeriodoAsistencia")) {
				jButtonNuevoPeriodoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPeriodoAsistencia")) {
				jButtonDuplicarPeriodoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPeriodoAsistencia")) {
				jButtonNuevoPeriodoAsistenciaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPeriodoAsistencia")) {
				jButtonNuevoPeriodoAsistenciaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPeriodoAsistencia")) {
				jButtonNuevoPeriodoAsistenciaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPeriodoAsistencia")) {
				jButtonModificarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPeriodoAsistencia")) {
				jButtonModificarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPeriodoAsistencia")) {
				jButtonModificarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPeriodoAsistencia")) {
				jButtonActualizarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPeriodoAsistencia")) {
				jButtonActualizarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPeriodoAsistencia")) {
				jButtonActualizarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarPeriodoAsistencia")) {
				jButtonEliminarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPeriodoAsistencia")) {
				jButtonEliminarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPeriodoAsistencia")) {
				jButtonEliminarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarPeriodoAsistencia")) {
				jButtonCancelarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPeriodoAsistencia")) {
				jButtonCancelarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPeriodoAsistencia")) {
				jButtonCancelarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarPeriodoAsistencia")) {
				jButtonCerrarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPeriodoAsistencia")) {
				jButtonCerrarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPeriodoAsistencia")) {
				jButtonCerrarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPeriodoAsistencia")) {
				jButtonMostrarOcultarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPeriodoAsistencia")) {
				jButtonCancelarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPeriodoAsistencia")) {
				jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPeriodoAsistencia")) {
				jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPeriodoAsistencia")) {
				jButtonCopiarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPeriodoAsistencia")) {
				jButtonVerFormPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPeriodoAsistencia")) {
				jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPeriodoAsistencia")) {
				jButtonCopiarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPeriodoAsistencia")) {
				jButtonVerFormPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPeriodoAsistencia")) {
				jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPeriodoAsistencia")) {
				jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPeriodoAsistencia")) {
				jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPeriodoAsistencia")) {
				jButtonRecargarInformacionPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPeriodoAsistencia")) {
				jButtonRecargarInformacionPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPeriodoAsistencia")) {
				jButtonRecargarInformacionPeriodoAsistenciaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPeriodoAsistencia")) {
				jButtonAnterioresPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPeriodoAsistencia")) {
				jButtonAnterioresPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePeriodoAsistencia")) {
				jButtonAnterioresPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPeriodoAsistencia")) {
				jButtonSiguientesPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPeriodoAsistencia")) {
				jButtonSiguientesPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPeriodoAsistencia")) {
				jButtonSiguientesPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPeriodoAsistencia") || sTipo.equals("MenuItemDetalleAbrirOrderByPeriodoAsistencia")) {
				jButtonAbrirOrderByPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPeriodoAsistencia") || sTipo.equals("MenuItemDetalleMostrarOcultarPeriodoAsistencia")) {
				jButtonMostrarOcultarPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPeriodoAsistencia")) {
				jButtonNuevoGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPeriodoAsistencia")) {
				jButtonNuevoGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPeriodoAsistencia")) {
				jButtonNuevoGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPeriodoAsistencia")) {
				jButtonCerrarReporteDinamicoPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPeriodoAsistencia")) {
				jButtonGenerarReporteDinamicoPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPeriodoAsistencia")) {
				
				jButtonGenerarExcelReporteDinamicoPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPeriodoAsistencia")) {
				jButtonCerrarImportacionPeriodoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPeriodoAsistencia")) {
				
				jButtonGenerarImportacionPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPeriodoAsistencia")) {
				
				jButtonAbrirImportacionPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPeriodoAsistencia")) {
				jComboBoxTiposAccionesPeriodoAsistenciaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPeriodoAsistencia")) {
				jComboBoxTiposRelacionesPeriodoAsistenciaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPeriodoAsistencia")) {
				jComboBoxTiposAccionesPeriodoAsistenciaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPeriodoAsistencia")) {
				
				jComboBoxTiposSeleccionarPeriodoAsistenciaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPeriodoAsistencia")) {
				jTextFieldValorCampoGeneralPeriodoAsistenciaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPeriodoAsistencia")) {
				jButtonAbrirOrderByPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPeriodoAsistencia")) {
				jButtonAbrirOrderByPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPeriodoAsistencia")) {
				jButtonCerrarOrderByPeriodoAsistenciaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPeriodoAsistenciaBusqueda")) {
				this.jButtonidPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPeriodoAsistenciaUpdate")) {
				this.jButtonid_empresaPeriodoAsistenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPeriodoAsistenciaBusqueda")) {
				this.jButtonid_empresaPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPeriodoAsistenciaUpdate")) {
				this.jButtonid_ejercicioPeriodoAsistenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPeriodoAsistenciaBusqueda")) {
				this.jButtonid_ejercicioPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPeriodoAsistenciaUpdate")) {
				this.jButtonid_periodoPeriodoAsistenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPeriodoAsistenciaBusqueda")) {
				this.jButtonid_periodoPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioPeriodoAsistenciaBusqueda")) {
				this.jButtonfecha_inicioPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finPeriodoAsistenciaBusqueda")) {
				this.jButtonfecha_finPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPeriodoAsistencia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				


				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PeriodoAsistencia periodoasistenciaLocal=null;
			
			if(!this.getEsControlTabla()) {
				periodoasistenciaLocal=this.periodoasistencia;
			} else {
				periodoasistenciaLocal=this.periodoasistenciaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
							
				
				


				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
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
			
			


			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoAsistenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
								
						
				


				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
								
				
				


				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoAsistenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
							
				
				


				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
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
			
			


			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
								
				
				


				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoAsistenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoAsistenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPeriodoAsistencia")) {
					jCheckBoxSeleccionarTodosPeriodoAsistenciaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPeriodoAsistencia")) {
					jCheckBoxSeleccionadosPeriodoAsistenciaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPeriodoAsistencia")) {
					
				}
				
				


				
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
												
				
				


				
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoAsistenciaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
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
			
			


			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.periodoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.periodoasistencia);
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
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
				
				


				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PeriodoAsistencia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PeriodoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPeriodoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.periodoasistenciaAnterior =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPeriodoAsistencia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPeriodoAsistenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPeriodoAsistencia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.periodoasistencia =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.periodoasistencia =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.periodoasistencia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPeriodoAsistencia")) {
				
				}
				
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPeriodoAsistencia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPeriodoAsistencia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPeriodoAsistencia")) {
			
			}
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPeriodoAsistencia();
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
			if(sTipo.equals("NuevoPeriodoAsistencia")) {
				jButtonNuevoPeriodoAsistenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPeriodoAsistencia")) {
				jButtonDuplicarPeriodoAsistenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPeriodoAsistencia")) {
				jButtonCopiarPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPeriodoAsistencia")) {
				jButtonVerFormPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPeriodoAsistencia")) {
				jButtonNuevoPeriodoAsistenciaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPeriodoAsistencia")) {
				jButtonModificarPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPeriodoAsistencia")) {
				jButtonActualizarPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPeriodoAsistencia")) {
				jButtonEliminarPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPeriodoAsistencia")) {
				jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPeriodoAsistencia")) {
				jButtonCancelarPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPeriodoAsistencia")) {
				jButtonCerrarPeriodoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPeriodoAsistencia")) {
				jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPeriodoAsistencia")) {
				jButtonNuevoGuardarCambiosPeriodoAsistenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPeriodoAsistencia")) {
				jButtonAbrirOrderByPeriodoAsistenciaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPeriodoAsistencia")) {
				jButtonRecargarInformacionPeriodoAsistenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPeriodoAsistencia")) {
				jButtonAnterioresPeriodoAsistenciaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPeriodoAsistencia")) {
				jButtonSiguientesPeriodoAsistenciaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPeriodoAsistenciaBusqueda")) {
				this.jButtonidPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPeriodoAsistenciaUpdate")) {
				this.jButtonid_empresaPeriodoAsistenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPeriodoAsistenciaBusqueda")) {
				this.jButtonid_empresaPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPeriodoAsistenciaUpdate")) {
				this.jButtonid_ejercicioPeriodoAsistenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPeriodoAsistenciaBusqueda")) {
				this.jButtonid_ejercicioPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPeriodoAsistenciaUpdate")) {
				this.jButtonid_periodoPeriodoAsistenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPeriodoAsistenciaBusqueda")) {
				this.jButtonid_periodoPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioPeriodoAsistenciaBusqueda")) {
				this.jButtonfecha_inicioPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finPeriodoAsistenciaBusqueda")) {
				this.jButtonfecha_finPeriodoAsistenciaBusquedaActionPerformed(evt);
			}
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPeriodoAsistencia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePeriodoAsistencia")) {
				closingInternalFramePeriodoAsistencia();
				
			} else if(sTipo.equals("jButtonCancelarPeriodoAsistencia")) {
				JInternalFrameBase jInternalFrameDetalleFormPeriodoAsistencia = (JInternalFrameBase)evt.getSource();
	            	
	            PeriodoAsistenciaBeanSwingJInternalFrame jInternalFrameParent=(PeriodoAsistenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormPeriodoAsistencia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPeriodoAsistenciaActionPerformed(null);
			}
			
			PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.periodoasistencia,new Object(),this.periodoasistenciaParameterGeneral,this.periodoasistenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPeriodoAsistencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPeriodoAsistencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPeriodoAsistencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.periodoasistencia)) {
			if(!esControlTabla) {
				if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);			
				}
				
				if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPeriodoAsistencia(this.periodoasistencia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.periodoasistenciaReturnGeneral=periodoasistenciaLogic.procesarEventosPeriodoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoasistenciaLogic.getPeriodoAsistencias(),this.periodoasistencia,this.periodoasistenciaParameterGeneral,this.isEsNuevoPeriodoAsistencia,classes);//this.periodoasistenciaLogic.getPeriodoAsistencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPeriodoAsistencia(this.periodoasistenciaReturnGeneral,this.periodoasistenciaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPeriodoAsistencia(classes,this.periodoasistenciaReturnGeneral,this.periodoasistenciaBean,false);
					}
						
					if(this.periodoasistenciaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPeriodoAsistencia(this.periodoasistenciaReturnGeneral.getPeriodoAsistencia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPeriodoAsistencia(this.periodoasistenciaReturnGeneral.getPeriodoAsistencia());	
					}
						
					if(this.periodoasistenciaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPeriodoAsistencia(this.periodoasistenciaReturnGeneral.getPeriodoAsistencia(),classes);//this.periodoasistenciaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPeriodoAsistencia(this.periodoasistencia,classes);//this.periodoasistenciaBean);									
				}
			
				if(PeriodoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPeriodoAsistencia(this.periodoasistencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPeriodoAsistencia(this.periodoasistencia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.periodoasistenciaAnterior!=null) {
						this.periodoasistencia=this.periodoasistenciaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.periodoasistenciaReturnGeneral=periodoasistenciaLogic.procesarEventosPeriodoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoasistenciaLogic.getPeriodoAsistencias(),this.periodoasistencia,this.periodoasistenciaParameterGeneral,this.isEsNuevoPeriodoAsistencia,classes);//this.periodoasistenciaLogic.getPeriodoAsistencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.periodoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.periodoasistenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.periodoasistenciaReturnGeneral.getPeriodoAsistencia(),periodoasistenciaLogic.getPeriodoAsistencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.periodoasistenciaReturnGeneral.getPeriodoAsistencia(),this.periodoasistencias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPeriodoAsistencia.repaint();
				
				//((AbstractTableModel) this.jTableDatosPeriodoAsistencia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPeriodoAsistencia();
			}
		}
	}
	
	public void actualizarVisualTableDatosPeriodoAsistencia() throws Exception {
		
		PeriodoAsistenciaModel periodoasistenciaModel=(PeriodoAsistenciaModel)this.jTableDatosPeriodoAsistencia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			periodoasistenciaModel.periodoasistencias=this.periodoasistenciaLogic.getPeriodoAsistencias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			periodoasistenciaModel.periodoasistencias=this.periodoasistencias;
		}
		
		
		((PeriodoAsistenciaModel) this.jTableDatosPeriodoAsistencia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPeriodoAsistencia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getperiodoasistenciaAnterior(),this.periodoasistenciaLogic.getPeriodoAsistencias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getperiodoasistenciaAnterior(),this.periodoasistencias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPeriodoAsistencia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPeriodoAsistencia(PeriodoAsistencia periodoasistencia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
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
										
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoasistencia,new Object(),generalEntityParameterGeneral,this.periodoasistenciaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.periodoasistenciaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PeriodoAsistenciaConstantesFunciones.getClassesRelationshipsOfPeriodoAsistencia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PeriodoAsistenciaConstantesFunciones.getClassesRelationshipsFromStringsOfPeriodoAsistencia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPeriodoAsistencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PeriodoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.periodoasistencia,new Object(),generalEntityParameterGeneral,this.periodoasistenciaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPeriodoAsistencia(PeriodoAsistenciaBean periodoasistenciaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPeriodoAsistencia(ArrayList<Classe> classes,PeriodoAsistenciaReturnGeneral periodoasistenciaReturnGeneral,PeriodoAsistenciaBean periodoasistenciaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPeriodoAsistencia(PeriodoAsistencia periodoasistencia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.periodoasistencia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPeriodoAsistencia = new PeriodoAsistenciaDetalleFormJInternalFrame(jDesktopPane,this.periodoasistenciaSessionBean.getConGuardarRelaciones(),this.periodoasistenciaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.setVisible(false);
		this.jInternalFrameDetalleFormPeriodoAsistencia.setSelected(false);						
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.periodoasistenciaLogic=this.periodoasistenciaLogic;
		
		this.cargarCombosFrameForeignKeyPeriodoAsistencia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePeriodoAsistencia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePeriodoAsistencia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPeriodoAsistencia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPeriodoAsistencia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPeriodoAsistencia"));
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonModificarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"ModificarPeriodoAsistencia"));

		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonModificarToolBarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarPeriodoAsistencia"));
					
		this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemModificarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarPeriodoAsistencia"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"ActualizarPeriodoAsistencia"));
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarToolBarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPeriodoAsistencia"));
						
		this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemActualizarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPeriodoAsistencia"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"EliminarPeriodoAsistencia"));
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarPeriodoAsistencia"));
								
		this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemEliminarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPeriodoAsistencia"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"CancelarPeriodoAsistencia"));
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarPeriodoAsistencia"));
					
		this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemCancelarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPeriodoAsistencia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemDetalleCerrarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPeriodoAsistencia"));		
		
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodoAsistencia"));
		
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodoAsistencia"));
		
		
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPeriodoAsistencia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonidPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_empresaPeriodoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_empresaPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_ejercicioPeriodoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_ejercicioPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_periodoPeriodoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPeriodoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_periodoPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPeriodoAsistenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonfecha_inicioPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioPeriodoAsistenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonfecha_finPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finPeriodoAsistenciaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPeriodoAsistencia.jTabbedPaneRelacionesPeriodoAsistencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPeriodoAsistencia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePeriodoAsistencia"));
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPeriodoAsistencia"));
		}
		
		this.jTableDatosPeriodoAsistencia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPeriodoAsistencia"));
		
		this.jTableDatosPeriodoAsistencia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPeriodoAsistencia"));
		
		this.jButtonNuevoPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"NuevoPeriodoAsistencia"));
		
		this.jButtonDuplicarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"DuplicarPeriodoAsistencia"));
		
		this.jButtonCopiarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"CopiarPeriodoAsistencia"));
		
		this.jButtonVerFormPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"VerFormPeriodoAsistencia"));
		
		
		this.jButtonNuevoToolBarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"NuevoToolBarPeriodoAsistencia"));
			
		this.jButtonDuplicarToolBarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPeriodoAsistencia"));
			
		this.jMenuItemNuevoPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPeriodoAsistencia"));
			
		this.jMenuItemDuplicarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPeriodoAsistencia"));		
		
		
		this.jButtonNuevoRelacionesPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPeriodoAsistencia"));
		
		
		this.jButtonNuevoRelacionesToolBarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPeriodoAsistencia"));
			
		this.jMenuItemNuevoRelacionesPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPeriodoAsistencia"));		
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonModificarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"ModificarPeriodoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonModificarToolBarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarPeriodoAsistencia"));
			
			this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemModificarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarPeriodoAsistencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"ActualizarPeriodoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonActualizarToolBarPeriodoAsistencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPeriodoAsistencia"));
				
			this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemActualizarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPeriodoAsistencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"EliminarPeriodoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonEliminarToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarPeriodoAsistencia"));
						
			this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemEliminarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPeriodoAsistencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"CancelarPeriodoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonCancelarToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarPeriodoAsistencia"));
			
			this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemCancelarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPeriodoAsistencia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPeriodoAsistencia"));		
		
		
		this.jButtonCerrarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"CerrarPeriodoAsistencia"));
		
		
		this.jButtonCerrarToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"CerrarToolBarPeriodoAsistencia"));
			
		this.jMenuItemCerrarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPeriodoAsistencia"));
			
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jMenuItemDetalleCerrarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPeriodoAsistencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosPeriodoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPeriodoAsistencia"));
		}
		
		this.jButtonCopiarToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"CopiarToolBarPeriodoAsistencia"));
			
		this.jButtonVerFormToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"VerFormToolBarPeriodoAsistencia"));
		
		this.jMenuItemGuardarCambiosPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPeriodoAsistencia"));
			
		this.jMenuItemCopiarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPeriodoAsistencia"));		
		
		this.jMenuItemVerFormPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPeriodoAsistencia"));		
		
		
		this.jButtonGuardarCambiosTablaPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPeriodoAsistencia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPeriodoAsistencia"));
			
		this.jMenuItemGuardarCambiosTablaPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPeriodoAsistencia"));		
		
		
		
		this.jButtonRecargarInformacionPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionPeriodoAsistencia"));
					
		this.jButtonRecargarInformacionToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPeriodoAsistencia"));
		
		this.jMenuItemRecargarInformacionPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPeriodoAsistencia"));		
		
		
		
		this.jButtonAnterioresPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"AnterioresPeriodoAsistencia"));
		
		
		this.jButtonAnterioresToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPeriodoAsistencia"));
		
		this.jMenuItemAnterioresPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPeriodoAsistencia"));		
		
		
		this.jButtonSiguientesPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"SiguientesPeriodoAsistencia"));
		
		
		this.jButtonSiguientesToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPeriodoAsistencia"));
			
		this.jMenuItemSiguientesPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPeriodoAsistencia"));
			
		this.jMenuItemAbrirOrderByPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPeriodoAsistencia"));
			
		this.jMenuItemMostrarOcultarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPeriodoAsistencia"));
			
		this.jMenuItemDetalleAbrirOrderByPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPeriodoAsistencia"));
			
		this.jMenuItemDetalleMostarOcultarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPeriodoAsistencia"));		
		
		
		this.jButtonNuevoGuardarCambiosPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPeriodoAsistencia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPeriodoAsistencia"));
			
		this.jMenuItemNuevoGuardarCambiosPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPeriodoAsistencia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPeriodoAsistencia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPeriodoAsistencia"));

		this.jCheckBoxSeleccionadosPeriodoAsistencia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPeriodoAsistencia"));
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPeriodoAsistencia"));
		}
		
		
		this.jComboBoxTiposRelacionesPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"TiposRelacionesPeriodoAsistencia"));
			
		this.jComboBoxTiposAccionesPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"TiposAccionesPeriodoAsistencia"));
					
		this.jComboBoxTiposSeleccionarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPeriodoAsistencia"));
			
		this.jTextFieldValorCampoGeneralPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPeriodoAsistencia"));		
		
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonidPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_empresaPeriodoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_empresaPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_ejercicioPeriodoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_ejercicioPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_periodoPeriodoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPeriodoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_periodoPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPeriodoAsistenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonfecha_inicioPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioPeriodoAsistenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonfecha_finPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finPeriodoAsistenciaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPeriodoAsistencia!=null) {
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodoAsistencia"));
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodoAsistencia"));
				this.jInternalFrameReporteDinamicoPeriodoAsistencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodoAsistencia"));
			}
			
			//this.jButtonCerrarReporteDinamicoPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPeriodoAsistencia"));				
			//this.jButtonGenerarReporteDinamicoPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPeriodoAsistencia"));
			//this.jButtonGenerarExcelReporteDinamicoPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPeriodoAsistencia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPeriodoAsistencia!=null) {
				this.jInternalFrameImportacionPeriodoAsistencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPeriodoAsistencia"));
				this.jInternalFrameImportacionPeriodoAsistencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPeriodoAsistencia"));
				this.jInternalFrameImportacionPeriodoAsistencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPeriodoAsistencia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByPeriodoAsistencia"));
			
			this.jButtonAbrirOrderByToolBarPeriodoAsistencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPeriodoAsistencia"));			
			
			if(this.jInternalFrameOrderByPeriodoAsistencia!=null) {
				this.jInternalFrameOrderByPeriodoAsistencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPeriodoAsistencia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPeriodoAsistencia.jTabbedPaneRelacionesPeriodoAsistencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPeriodoAsistencia"));
		
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
            		closingInternalFramePeriodoAsistencia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPeriodoAsistencia = (JInternalFrameBase)event.getSource();
	            	
	            PeriodoAsistenciaBeanSwingJInternalFrame jInternalFrameParent=(PeriodoAsistenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormPeriodoAsistencia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPeriodoAsistenciaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPeriodoAsistencia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPeriodoAsistenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPeriodoAsistencia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPeriodoAsistencia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoAsistenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoAsistenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoAsistenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPeriodoAsistencia";
		inputMap = this.jButtonNuevoPeriodoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPeriodoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPeriodoAsistenciaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoAsistenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoAsistenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPeriodoAsistenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPeriodoAsistencia";
		inputMap = this.jButtonNuevoRelacionesPeriodoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPeriodoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPeriodoAsistenciaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPeriodoAsistencia";
		inputMap = this.jButtonModificarPeriodoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPeriodoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPeriodoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPeriodoAsistencia";
		inputMap = this.jButtonActualizarPeriodoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPeriodoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPeriodoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPeriodoAsistencia";
		inputMap = this.jButtonEliminarPeriodoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPeriodoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPeriodoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPeriodoAsistencia";
		inputMap = this.jButtonCancelarPeriodoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPeriodoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPeriodoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPeriodoAsistencia";
		inputMap = this.jButtonCerrarPeriodoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPeriodoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPeriodoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPeriodoAsistencia";
		inputMap = this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosPeriodoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonGuardarCambiosPeriodoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPeriodoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPeriodoAsistencia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPeriodoAsistenciaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPeriodoAsistencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPeriodoAsistenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPeriodoAsistencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPeriodoAsistenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPeriodoAsistencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPeriodoAsistenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonidPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"idPeriodoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_empresaPeriodoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_empresaPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPeriodoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_ejercicioPeriodoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_ejercicioPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPeriodoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_periodoPeriodoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPeriodoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonid_periodoPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPeriodoAsistenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonfecha_inicioPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioPeriodoAsistenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPeriodoAsistencia.jButtonfecha_finPeriodoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finPeriodoAsistenciaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPeriodoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPeriodoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPeriodoAsistenciaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPeriodoAsistencia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPeriodoAsistencia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistenciaLogic.getPeriodoAsistencias()) {
					periodoasistenciaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoAsistencia periodoasistenciaAux:periodoasistencias) {
					periodoasistenciaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPeriodoAsistenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPeriodoAsistencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistenciaLogic.getPeriodoAsistencias()) {
						periodoasistenciaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PeriodoAsistencia periodoasistenciaAux:periodoasistencias) {
						periodoasistenciaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistenciaLogic.getPeriodoAsistencias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PeriodoAsistencia periodoasistenciaAux:periodoasistencias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPeriodoAsistencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPeriodoAsistencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPeriodoAsistenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPeriodoAsistencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPeriodoAsistencia.getSelectedRows();
			
			PeriodoAsistencia periodoasistenciaLocal=new PeriodoAsistencia();
			
			//this.seleccionarTodosPeriodoAsistencia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoasistenciaLocal =(PeriodoAsistencia) this.periodoasistenciaLogic.getPeriodoAsistencias().toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					periodoasistenciaLocal =(PeriodoAsistencia) this.periodoasistencias.toArray()[this.jTableDatosPeriodoAsistencia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				periodoasistenciaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistenciaLogic.getPeriodoAsistencias()) {
						periodoasistenciaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PeriodoAsistencia periodoasistenciaAux:periodoasistencias) {
						periodoasistenciaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPeriodoAsistencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPeriodoAsistencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPeriodoAsistencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPeriodoAsistenciaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPeriodoAsistenciaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPeriodoAsistenciaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPeriodoAsistencia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPeriodoAsistencia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistenciaLogic.getPeriodoAsistencias()) {
				
						if(sTipoSeleccionar.equals(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							periodoasistenciaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							periodoasistenciaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoAsistencia periodoasistenciaAux:periodoasistencias) {
					
						if(sTipoSeleccionar.equals(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							periodoasistenciaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							periodoasistenciaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPeriodoAsistenciaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPeriodoAsistencia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPeriodoAsistencia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPeriodoAsistencia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePeriodoAsistencia) {				
					conSplash=true;//false;										
					
					//this.startProcessPeriodoAsistencia(conSplash);
				
					this.generarReportePeriodoAsistenciasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPeriodoAsistenciasSeleccionados();
				//this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPeriodoAsistenciasSeleccionados(false);
				//this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPeriodoAsistenciasSeleccionados(true);
				//this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPeriodoAsistencia();
				
				this.exportarPeriodoAsistenciasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPeriodoAsistencias();
				//this.importarPeriodoAsistencias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPeriodoAsistencia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPeriodoAsistenciasSeleccionados();
				//this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Periodo Asistencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPeriodoAsistencia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPeriodoAsistencia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPeriodoAsistencia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setSelectedIndex(0);					
				}	
			} 			
			else if(PeriodoAsistenciaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePeriodoAsistencia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPeriodoAsistencia(conSplash);
					
						//this.actualizarParametrosGeneralPeriodoAsistencia();
						
						this.generarReporteProcesoAccionPeriodoAsistenciasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PeriodoAsistenciaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Periodo AsistenciaS SELECCIONADOS?", "MANTENIMIENTO DE Periodo Asistencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPeriodoAsistencia();
				
						this.actualizarParametrosGeneralPeriodoAsistencia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.periodoasistenciaReturnGeneral=periodoasistenciaLogic.procesarAccionPeriodoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.periodoasistenciaLogic.getPeriodoAsistencias(),this.periodoasistenciaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPeriodoAsistenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPeriodoAsistencia();
					
					PeriodoAsistenciaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPeriodoAsistenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPeriodoAsistencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxTiposAccionesFormularioPeriodoAsistencia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPeriodoAsistencia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPeriodoAsistenciaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPeriodoAsistencia();
			
			if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();		
			PeriodoAsistencia periodoasistencia=new PeriodoAsistencia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPeriodoAsistencia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPeriodoAsistencia.getSelectedItem();
			
			
			
			
			periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
			//this.sTipoAccion;
			
			if(periodoasistenciasSeleccionados.size()==1) {
				for(PeriodoAsistencia periodoasistenciaAux:periodoasistenciasSeleccionados) {
					periodoasistencia=periodoasistenciaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPeriodoAsistencia();
			
      		//this.finishProcessPeriodoAsistencia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPeriodoAsistenciaReturnGeneral() throws Exception {
		if(this.periodoasistenciaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.periodoasistenciaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.periodoasistenciaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.periodoasistenciaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.periodoasistenciaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.periodoasistenciaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPeriodoAsistencia(false);
		}
		
		if(this.periodoasistenciaReturnGeneral.getConRetornoLista() || this.periodoasistenciaReturnGeneral.getConRetornoObjeto()) {
			if(this.periodoasistenciaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.periodoasistenciaLogic.setPeriodoAsistencias(this.periodoasistenciaReturnGeneral.getPeriodoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.periodoasistenciaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.periodoasistenciaLogic.setPeriodoAsistencia(this.periodoasistenciaReturnGeneral.getPeriodoAsistencia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPeriodoAsistencia(false);
		}
	}
	
	public void actualizarParametrosGeneralPeriodoAsistencia() throws Exception {
		
		
	}
	
	public ArrayList<PeriodoAsistencia> getPeriodoAsistenciasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPeriodoAsistencia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PeriodoAsistencia periodoasistenciaAux:periodoasistenciaLogic.getPeriodoAsistencias()) {
					if(periodoasistenciaAux.getIsSelected()) {
						periodoasistenciasSeleccionados.add(periodoasistenciaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PeriodoAsistencia periodoasistenciaAux:this.periodoasistencias) {
					if(periodoasistenciaAux.getIsSelected()) {
						periodoasistenciasSeleccionados.add(periodoasistenciaAux);				
					}
				}
			}
			
			if(periodoasistenciasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						periodoasistenciasSeleccionados.addAll(this.periodoasistenciaLogic.getPeriodoAsistencias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						periodoasistenciasSeleccionados.addAll(this.periodoasistencias);				
					}
				}
			}
		} else {
			periodoasistenciasSeleccionados.add(this.periodoasistencia);
		}
		
		return periodoasistenciasSeleccionados;
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
	
	public void generarReportePeriodoAsistenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPeriodoAsistenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPeriodoAsistenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPeriodoAsistenciasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPeriodoAsistenciasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Periodo Asistencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPeriodoAsistenciasSeleccionados() throws Exception {
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();		
		
		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePeriodoAsistencias("Todos",periodoasistenciasSeleccionados);
		
	}	
	
	public void generarReporteNormalPeriodoAsistenciasSeleccionados() throws Exception {
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();		
		
		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePeriodoAsistencias("Todos",periodoasistenciasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPeriodoAsistenciasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();
		
		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePeriodoAsistencias("Todos",periodoasistenciasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPeriodoAsistenciasSeleccionados() throws Exception {
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPeriodoAsistencia();
		
		
		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPeriodoAsistencia();
		
		
		//this.generarReportePeriodoAsistencias("Todos",periodoasistenciasSeleccionados ,periodoasistenciaImplementable,periodoasistenciaImplementableHome);
	}
	
	public void mostrarImportacionPeriodoAsistencias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPeriodoAsistencia();
		
		this.abrirFrameImportacionPeriodoAsistencia();		
		
			
		//this.generarReportePeriodoAsistencias("Todos",periodoasistenciasSeleccionados ,periodoasistenciaImplementable,periodoasistenciaImplementableHome);
	}
	
	public void importarPeriodoAsistencias() throws Exception {		
	
	}
	
	public void exportarPeriodoAsistenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPeriodoAsistenciasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPeriodoAsistenciasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPeriodoAsistenciasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Periodo Asistencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPeriodoAsistenciasSeleccionados() throws Exception {
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();		
		
		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoasistencia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPeriodoAsistencia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PeriodoAsistencia periodoasistenciaAux:periodoasistenciasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPeriodoAsistencia(periodoasistenciaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//periodoasistenciaAux.setsDetalleGeneralEntityReporte(periodoasistenciaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPeriodoAsistencia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PeriodoAsistenciaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoAsistenciaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPeriodoAsistencia(PeriodoAsistencia periodoasistencia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=periodoasistencia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoasistencia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoasistencia.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoasistencia.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoasistencia.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoasistencia.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=periodoasistencia.getfecha_fin().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPeriodoAsistenciasSeleccionados() throws Exception {
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();		
		
		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoasistencia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PeriodoAsistencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPeriodoAsistencia(row);				
				iRow++;
			}				
			
			for(PeriodoAsistencia periodoasistenciaAux:periodoasistenciasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPeriodoAsistencia(periodoasistenciaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPeriodoAsistenciasSeleccionados() throws Exception {
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();		
		
		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"periodoasistencia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("periodoasistencias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("periodoasistencia");
			//elementRoot.appendChild(element);
		
			for(PeriodoAsistencia periodoasistenciaAux:periodoasistenciasSeleccionados) {
				element = document.createElement("periodoasistencia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPeriodoAsistencia(periodoasistenciaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Periodo Asistencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPeriodoAsistencia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPeriodoAsistencia(PeriodoAsistencia periodoasistencia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(periodoasistencia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(periodoasistencia.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periodoasistencia.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periodoasistencia.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(periodoasistencia.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(periodoasistencia.getfecha_fin());				
	}
	
	public void setFilaDatosExportarXmlPeriodoAsistencia(PeriodoAsistencia periodoasistencia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PeriodoAsistenciaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(periodoasistencia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PeriodoAsistenciaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(periodoasistencia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PeriodoAsistenciaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(periodoasistencia.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(PeriodoAsistenciaConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(periodoasistencia.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PeriodoAsistenciaConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(periodoasistencia.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementfecha_inicio = document.createElement(PeriodoAsistenciaConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(periodoasistencia.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(PeriodoAsistenciaConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(periodoasistencia.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);
	}
	
	public void generarReporteGroupGenericoPeriodoAsistenciasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados=new ArrayList<PeriodoAsistencia>();
		
		periodoasistenciasSeleccionados=this.getPeriodoAsistenciasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPeriodoAsistencia(periodoasistenciasSeleccionados);
		
		this.generarReportePeriodoAsistencias("Todos",periodoasistenciasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPeriodoAsistencia(ArrayList<PeriodoAsistencia> periodoasistenciasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PeriodoAsistencia periodoasistenciaAux:periodoasistenciasSeleccionados) {
				periodoasistenciaAux.setsDetalleGeneralEntityReporte(periodoasistenciaAux.toString());
			
				if(sTipoSeleccionar.equals(PeriodoAsistenciaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					periodoasistenciaAux.setsDescripcionGeneralEntityReporte1(periodoasistenciaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoAsistenciaConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					periodoasistenciaAux.setsDescripcionGeneralEntityReporte1(periodoasistenciaAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoAsistenciaConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					periodoasistenciaAux.setsDescripcionGeneralEntityReporte1(periodoasistenciaAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					periodoasistenciaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(periodoasistenciaAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(PeriodoAsistenciaConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					periodoasistenciaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(periodoasistenciaAux.getfecha_fin()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PeriodoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPeriodoAsistencia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPeriodoAsistencia=true;
				this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=true;
				this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=true;
			}
			
			this.isVisibilidadCeldaModificarPeriodoAsistencia=false;
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=false;
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=false;
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=false;
			this.isVisibilidadCeldaModificarPeriodoAsistencia=false;
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=true;
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=false;
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=false;
			this.isVisibilidadCeldaModificarPeriodoAsistencia=false;
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=true;
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=true;
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=false;
			this.isVisibilidadCeldaModificarPeriodoAsistencia=false;
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=true;
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=false;
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=true;
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=true;
			this.isVisibilidadCeldaModificarPeriodoAsistencia=false;
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=false;
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=false;
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=false;
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=false;
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=false;
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=false;
			this.isVisibilidadCeldaModificarPeriodoAsistencia=true;
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=false;
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=false;
			this.isVisibilidadCeldaCancelarPeriodoAsistencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				} else {
					this.isVisibilidadCeldaGuardarPeriodoAsistencia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PeriodoAsistenciaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=true;
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=true;
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=true;
		} else {
			this.actualizarEstadoPanelsPeriodoAsistencia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPeriodoAsistencia=false;
			//this.isVisibilidadCeldaVerFormPeriodoAsistencia=false;
			this.isVisibilidadCeldaDuplicarPeriodoAsistencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!periodoasistenciaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;
		} else {
			this.isVisibilidadCeldaNuevoPeriodoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosPeriodoAsistencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			if(!periodoasistenciaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;												
			}
			
			this.jButtonCerrarPeriodoAsistencia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPeriodoAsistencia=false;
		}
		
		if(!this.permiteMantenimiento(this.periodoasistencia)) {
			this.isVisibilidadCeldaActualizarPeriodoAsistencia=false;
			this.isVisibilidadCeldaEliminarPeriodoAsistencia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPeriodoAsistencia() {
	}
	
	public void actualizarEstadoPanelsPeriodoAsistencia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPeriodoAsistencia!=null) {
				this.jScrollPanelDatosEdicionPeriodoAsistencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoAsistencia!=null) {
				this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoAsistencia!=null) {
				this.jScrollPanelDatosPeriodoAsistencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoAsistencia!=null) {
				this.jPanelPaginacionPeriodoAsistencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoAsistencia!=null) {
				this.jPanelParametrosReportesPeriodoAsistencia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPeriodoAsistencia!=null) {
				this.jScrollPanelDatosEdicionPeriodoAsistencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoAsistencia!=null) {
				this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPeriodoAsistencia!=null) {
				this.jScrollPanelDatosPeriodoAsistencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodoAsistencia!=null) {
				this.jPanelPaginacionPeriodoAsistencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodoAsistencia!=null) {
				this.jPanelParametrosReportesPeriodoAsistencia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPeriodoAsistencia!=null) {
				this.jScrollPanelDatosEdicionPeriodoAsistencia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoAsistencia!=null) {
				this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoAsistencia!=null) {
				this.jScrollPanelDatosPeriodoAsistencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodoAsistencia!=null) {
				this.jPanelPaginacionPeriodoAsistencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodoAsistencia!=null) {
				this.jPanelParametrosReportesPeriodoAsistencia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPeriodoAsistencia!=null) {
				this.jScrollPanelDatosEdicionPeriodoAsistencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoAsistencia!=null) {
				this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoAsistencia!=null) {
				this.jScrollPanelDatosPeriodoAsistencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionPeriodoAsistencia!=null) {
				this.jPanelPaginacionPeriodoAsistencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPeriodoAsistencia!=null) {
				this.jPanelParametrosReportesPeriodoAsistencia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPeriodoAsistencia!=null) {
				this.jScrollPanelDatosEdicionPeriodoAsistencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoAsistencia!=null) {
				this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoAsistencia!=null) {
				this.jScrollPanelDatosPeriodoAsistencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoAsistencia!=null) {
				this.jPanelPaginacionPeriodoAsistencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoAsistencia!=null) {
				this.jPanelParametrosReportesPeriodoAsistencia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPeriodoAsistencia!=null) {
				this.jScrollPanelDatosEdicionPeriodoAsistencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoAsistencia!=null) {
				this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoAsistencia!=null) {
				this.jScrollPanelDatosPeriodoAsistencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoAsistencia!=null) {
				this.jPanelPaginacionPeriodoAsistencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoAsistencia!=null) {
				this.jPanelParametrosReportesPeriodoAsistencia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPeriodoAsistencia!=null) {
				this.jScrollPanelDatosEdicionPeriodoAsistencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoAsistencia!=null) {
				this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPeriodoAsistencia!=null) {
				this.jScrollPanelDatosPeriodoAsistencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPeriodoAsistencia!=null) {
				this.jPanelPaginacionPeriodoAsistencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPeriodoAsistencia!=null) {
				this.jPanelParametrosReportesPeriodoAsistencia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPeriodoAsistencia!=null) {
					this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPeriodoAsistencia!=null) {
				this.jPanelParametrosReportesPeriodoAsistencia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.periodoasistenciaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPeriodoAsistencia!=null) {
				this.jTabbedPaneBusquedasPeriodoAsistencia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPeriodoAsistencia!=null) {
				this.jPanelParametrosReportesPeriodoAsistencia.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PeriodoAsistenciaSessionBean periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
		
		if(this.periodoasistenciaSessionBean==null) {
			this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
		}
		
		this.periodoasistenciaSessionBean.setsUltimaBusquedaPeriodoAsistencia(this.getsAccionBusqueda());
		this.periodoasistenciaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.periodoasistenciaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			periodoasistenciaSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			periodoasistenciaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			periodoasistenciaSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PeriodoAsistenciaSessionBean periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
		
		if(this.periodoasistenciaSessionBean==null) {
			this.periodoasistenciaSessionBean=new PeriodoAsistenciaSessionBean();
		}
		
		if(this.periodoasistenciaSessionBean.getsUltimaBusquedaPeriodoAsistencia()!=null&&!this.periodoasistenciaSessionBean.getsUltimaBusquedaPeriodoAsistencia().equals("")) {
			this.setsAccionBusqueda(periodoasistenciaSessionBean.getsUltimaBusquedaPeriodoAsistencia());
			this.setiNumeroPaginacion(periodoasistenciaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(periodoasistenciaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(periodoasistenciaSessionBean.getid_ejercicio());
				periodoasistenciaSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(periodoasistenciaSessionBean.getid_empresa());
				periodoasistenciaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(periodoasistenciaSessionBean.getid_periodo());
				periodoasistenciaSessionBean.setid_periodo(-1L);
			}
		}
		
		this.periodoasistenciaSessionBean.setsUltimaBusquedaPeriodoAsistencia("");
		this.periodoasistenciaSessionBean.setiNumeroPaginacion(PeriodoAsistenciaConstantesFunciones.INUMEROPAGINACION);
		this.periodoasistenciaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPeriodoAsistencia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPeriodoAsistencia() {
		this.updateBorderResaltarBusquedasFormularioPeriodoAsistencia();
		this.updateVisibilidadBusquedasFormularioPeriodoAsistencia();
		this.updateHabilitarBusquedasFormularioPeriodoAsistencia();
	}
	
	public void updateBorderResaltarBusquedasFormularioPeriodoAsistencia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPeriodoAsistencia.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPeriodoAsistencia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPeriodoAsistencia.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPeriodoAsistencia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPeriodoAsistencia.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPeriodoAsistencia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarPeriodoAsistencia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPeriodoAsistencia() throws Exception {

		if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPeriodoAsistencia();
		this.updateVisibilidadResaltarControlesFormularioPeriodoAsistencia();
		this.updateHabilitarResaltarControlesFormularioPeriodoAsistencia();
		
	}
	
	public void updateBorderResaltarControlesFormularioPeriodoAsistencia() throws Exception {
		if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.periodoasistenciaConstantesFunciones.resaltaridPeriodoAsistencia!=null && this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.setBorder(this.periodoasistenciaConstantesFunciones.resaltaridPeriodoAsistencia);}
		if(this.periodoasistenciaConstantesFunciones.resaltarid_empresaPeriodoAsistencia!=null && this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.setBorder(this.periodoasistenciaConstantesFunciones.resaltarid_empresaPeriodoAsistencia);}
		if(this.periodoasistenciaConstantesFunciones.resaltarid_ejercicioPeriodoAsistencia!=null && this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.setBorder(this.periodoasistenciaConstantesFunciones.resaltarid_ejercicioPeriodoAsistencia);}
		if(this.periodoasistenciaConstantesFunciones.resaltarid_periodoPeriodoAsistencia!=null && this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.setBorder(this.periodoasistenciaConstantesFunciones.resaltarid_periodoPeriodoAsistencia);}
		if(this.periodoasistenciaConstantesFunciones.resaltarfecha_inicioPeriodoAsistencia!=null && this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_inicioPeriodoAsistencia.setBorder(this.periodoasistenciaConstantesFunciones.resaltarfecha_inicioPeriodoAsistencia);}
		if(this.periodoasistenciaConstantesFunciones.resaltarfecha_finPeriodoAsistencia!=null && this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_finPeriodoAsistencia.setBorder(this.periodoasistenciaConstantesFunciones.resaltarfecha_finPeriodoAsistencia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPeriodoAsistencia() throws Exception {		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
	
		//this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostraridPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelidPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostraridPeriodoAsistencia);
		//this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarid_empresaPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelid_empresaPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarid_empresaPeriodoAsistencia);
		//this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarid_ejercicioPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelid_ejercicioPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarid_ejercicioPeriodoAsistencia);
		//this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarid_periodoPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelid_periodoPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarid_periodoPeriodoAsistencia);
		//this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_inicioPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarfecha_inicioPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelfecha_inicioPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarfecha_inicioPeriodoAsistencia);
		//this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_finPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarfecha_finPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jPanelfecha_finPeriodoAsistencia.setVisible(this.periodoasistenciaConstantesFunciones.mostrarfecha_finPeriodoAsistencia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPeriodoAsistencia() throws Exception {
		if(this.jInternalFrameDetalleFormPeriodoAsistencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPeriodoAsistencia!=null) {
	
		this.jInternalFrameDetalleFormPeriodoAsistencia.jLabelidPeriodoAsistencia.setEnabled(this.periodoasistenciaConstantesFunciones.activaridPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_empresaPeriodoAsistencia.setEnabled(this.periodoasistenciaConstantesFunciones.activarid_empresaPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_ejercicioPeriodoAsistencia.setEnabled(this.periodoasistenciaConstantesFunciones.activarid_ejercicioPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jComboBoxid_periodoPeriodoAsistencia.setEnabled(this.periodoasistenciaConstantesFunciones.activarid_periodoPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_inicioPeriodoAsistencia.setEnabled(this.periodoasistenciaConstantesFunciones.activarfecha_inicioPeriodoAsistencia);
		this.jInternalFrameDetalleFormPeriodoAsistencia.jDateChooserfecha_finPeriodoAsistencia.setEnabled(this.periodoasistenciaConstantesFunciones.activarfecha_finPeriodoAsistencia);
		}
	}
	
		
}