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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.PreguntaEquivalenciaConstantesFunciones;
import com.bydan.erp.cartera.util.PreguntaEquivalenciaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.PreguntaEquivalenciaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.PreguntaEquivalenciaBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class PreguntaEquivalenciaBeanSwingJInternalFrame extends PreguntaEquivalenciaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PreguntaEquivalenciaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PreguntaEquivalencia> preguntaequivalenciaValidator = new ClassValidator<PreguntaEquivalencia>(PreguntaEquivalencia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PreguntaEquivalencia preguntaequivalencia;	
	public PreguntaEquivalencia preguntaequivalenciaAux;
	public PreguntaEquivalencia preguntaequivalenciaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PreguntaEquivalencia preguntaequivalenciaTotales;
	public Long idPreguntaEquivalenciaActual;
	public Long iIdNuevoPreguntaEquivalencia=0L;
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
	
	public Boolean isPermisoTodoPreguntaEquivalencia;
	public Boolean isPermisoNuevoPreguntaEquivalencia;
	public Boolean isPermisoActualizarPreguntaEquivalencia;
	public Boolean isPermisoActualizarOriginalPreguntaEquivalencia;
	public Boolean isPermisoEliminarPreguntaEquivalencia;
	public Boolean isPermisoGuardarCambiosPreguntaEquivalencia;
	public Boolean isPermisoConsultaPreguntaEquivalencia;
	public Boolean isPermisoBusquedaPreguntaEquivalencia;
	public Boolean isPermisoReportePreguntaEquivalencia;
	public Boolean isPermisoPaginacionMedioPreguntaEquivalencia;
	public Boolean isPermisoPaginacionAltoPreguntaEquivalencia;
	public Boolean isPermisoPaginacionTodoPreguntaEquivalencia;
	public Boolean isPermisoCopiarPreguntaEquivalencia;
	public Boolean isPermisoVerFormPreguntaEquivalencia;
	public Boolean isPermisoDuplicarPreguntaEquivalencia;
	public Boolean isPermisoOrdenPreguntaEquivalencia;
	
	
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
	
	public PreguntaEquivalenciaParameterReturnGeneral preguntaequivalenciaReturnGeneral;
	public PreguntaEquivalenciaParameterReturnGeneral preguntaequivalenciaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPreguntaEquivalencia=false;
	public Boolean esParaAccionDesdeFormularioPreguntaEquivalencia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PreguntaEquivalenciaSessionBeanAdditional preguntaequivalenciaSessionBeanAdditional=null;
	
	public PreguntaEquivalenciaSessionBeanAdditional getPreguntaEquivalenciaSessionBeanAdditional() {
		return this.preguntaequivalenciaSessionBeanAdditional;
	}
	
	public void setPreguntaEquivalenciaSessionBeanAdditional(PreguntaEquivalenciaSessionBeanAdditional preguntaequivalenciaSessionBeanAdditional) {
		try {
			this.preguntaequivalenciaSessionBeanAdditional=preguntaequivalenciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PreguntaEquivalenciaBeanSwingJInternalFrameAdditional preguntaequivalenciaBeanSwingJInternalFrameAdditional=null;
	//public class PreguntaEquivalenciaBeanSwingJInternalFrame
	
	public PreguntaEquivalenciaBeanSwingJInternalFrameAdditional getPreguntaEquivalenciaBeanSwingJInternalFrameAdditional() {
		return this.preguntaequivalenciaBeanSwingJInternalFrameAdditional;
	}
	
	public void setPreguntaEquivalenciaBeanSwingJInternalFrameAdditional(PreguntaEquivalenciaBeanSwingJInternalFrameAdditional preguntaequivalenciaBeanSwingJInternalFrameAdditional) {
		try {
			this.preguntaequivalenciaBeanSwingJInternalFrameAdditional=preguntaequivalenciaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PreguntaEquivalenciaLogic preguntaequivalenciaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PreguntaEquivalencia preguntaequivalenciaBean;
	public PreguntaEquivalenciaConstantesFunciones preguntaequivalenciaConstantesFunciones;
	//public PreguntaEquivalenciaParameterReturnGeneral preguntaequivalenciaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<PreguntaEquivalencia> preguntaequivalencias;	
	//public List<PreguntaEquivalencia> preguntaequivalenciasEliminados;
	//public List<PreguntaEquivalencia> preguntaequivalenciasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPreguntaEquivalencia=false;
	public Boolean isVisibilidadCeldaDuplicarPreguntaEquivalencia=true;
	public Boolean isVisibilidadCeldaCopiarPreguntaEquivalencia=true;
	public Boolean isVisibilidadCeldaVerFormPreguntaEquivalencia=true;
	public Boolean isVisibilidadCeldaOrdenPreguntaEquivalencia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;
	public Boolean isVisibilidadCeldaModificarPreguntaEquivalencia=false;
	public Boolean isVisibilidadCeldaActualizarPreguntaEquivalencia=false;
	public Boolean isVisibilidadCeldaEliminarPreguntaEquivalencia=false;
	public Boolean isVisibilidadCeldaCancelarPreguntaEquivalencia=false;
	public Boolean isVisibilidadCeldaGuardarPreguntaEquivalencia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPreguntaEquivalencia() {
		return this.iIdNuevoPreguntaEquivalencia;
	}

	public void setiIdNuevoPreguntaEquivalencia(Long iIdNuevoPreguntaEquivalencia) {
		this.iIdNuevoPreguntaEquivalencia = iIdNuevoPreguntaEquivalencia;
	}
	
	public Long getidPreguntaEquivalenciaActual() {
		return this.idPreguntaEquivalenciaActual;
	}

	public void setidPreguntaEquivalenciaActual(Long idPreguntaEquivalenciaActual) {
		this.idPreguntaEquivalenciaActual = idPreguntaEquivalenciaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PreguntaEquivalencia getpreguntaequivalencia() {
		return this.preguntaequivalencia;
	}

	public void setpreguntaequivalencia(PreguntaEquivalencia preguntaequivalencia) {
		this.preguntaequivalencia = preguntaequivalencia;
	}
	
	public PreguntaEquivalencia getpreguntaequivalenciaAux() {
		return this.preguntaequivalenciaAux;
	}

	public void setpreguntaequivalenciaAux(PreguntaEquivalencia preguntaequivalenciaAux) {
		this.preguntaequivalenciaAux = preguntaequivalenciaAux;
	}				
	
	public PreguntaEquivalencia getpreguntaequivalenciaAnterior() {
		return this.preguntaequivalenciaAnterior;
	}

	public void setpreguntaequivalenciaAnterior(PreguntaEquivalencia preguntaequivalenciaAnterior) {
		this.preguntaequivalenciaAnterior = preguntaequivalenciaAnterior;
	}	
	
	public PreguntaEquivalencia getpreguntaequivalenciaTotales() {
		return this.preguntaequivalenciaTotales;
	}

	public void setpreguntaequivalenciaTotales(PreguntaEquivalencia preguntaequivalenciaTotales) {
		this.preguntaequivalenciaTotales = preguntaequivalenciaTotales;
	}	
	
	public PreguntaEquivalencia getpreguntaequivalenciaBean() {
		return this.preguntaequivalenciaBean;
	}

	public void setpreguntaequivalenciaBean(PreguntaEquivalencia preguntaequivalenciaBean) {
		this.preguntaequivalenciaBean = preguntaequivalenciaBean;
	}	
	
	public PreguntaEquivalenciaParameterReturnGeneral getpreguntaequivalenciaReturnGeneral() {
		return this.preguntaequivalenciaReturnGeneral;
	}

	public void setpreguntaequivalenciaReturnGeneral(PreguntaEquivalenciaParameterReturnGeneral preguntaequivalenciaReturnGeneral) {
		this.preguntaequivalenciaReturnGeneral = preguntaequivalenciaReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo=-1L;

	public Long getid_ejercicioBusquedaPorIdEjercicioPorIdPeriodo() {
		return this.id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo;
	}

	public void setid_ejercicioBusquedaPorIdEjercicioPorIdPeriodo(Long id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo) {
		this.id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo = id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo;
	}

;
	public Long id_periodoBusquedaPorIdEjercicioPorIdPeriodo=-1L;

	public Long getid_periodoBusquedaPorIdEjercicioPorIdPeriodo() {
		return this.id_periodoBusquedaPorIdEjercicioPorIdPeriodo;
	}

	public void setid_periodoBusquedaPorIdEjercicioPorIdPeriodo(Long id_periodoBusquedaPorIdEjercicioPorIdPeriodo) {
		this.id_periodoBusquedaPorIdEjercicioPorIdPeriodo = id_periodoBusquedaPorIdEjercicioPorIdPeriodo;
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

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
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
	
	
	public PreguntaEquivalenciaLogic getPreguntaEquivalenciaLogic()	{		
		return preguntaequivalenciaLogic;
	}

	public void setPreguntaEquivalenciaLogic(PreguntaEquivalenciaLogic preguntaequivalenciaLogic) {
		this.preguntaequivalenciaLogic = preguntaequivalenciaLogic;
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
	
	public Boolean getIsEsNuevoPreguntaEquivalencia() {
		return isEsNuevoPreguntaEquivalencia;
	}

	public void setIsEsNuevoPreguntaEquivalencia(Boolean isEsNuevoPreguntaEquivalencia) {
		this.isEsNuevoPreguntaEquivalencia = isEsNuevoPreguntaEquivalencia;
	}

	public Boolean getEsParaAccionDesdeFormularioPreguntaEquivalencia() {
		return esParaAccionDesdeFormularioPreguntaEquivalencia;
	}
	
	public void setEsParaAccionDesdeFormularioPreguntaEquivalencia(Boolean esParaAccionDesdeFormularioPreguntaEquivalencia) {
		this.esParaAccionDesdeFormularioPreguntaEquivalencia = esParaAccionDesdeFormularioPreguntaEquivalencia;
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

			if(this.preguntaequivalenciaSessionBean==null) {
				this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
			}

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(preguntaequivalenciaSessionBean.getlidEmpresaActual());
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

			if(this.preguntaequivalenciaSessionBean==null) {
				this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
			}

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(preguntaequivalenciaSessionBean.getlidSucursalActual());
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

			if(this.preguntaequivalenciaSessionBean==null) {
				this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
			}

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(preguntaequivalenciaSessionBean.getlidEjercicioActual());
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

			if(this.preguntaequivalenciaSessionBean==null) {
				this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
			}

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(preguntaequivalenciaSessionBean.getlidPeriodoActual());
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

			if(this.preguntaequivalenciaSessionBean==null) {
				this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
			}

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(preguntaequivalenciaSessionBean.getlidAnioActual());
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

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.preguntaequivalenciaSessionBean==null) {
				this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
			}

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(preguntaequivalenciaSessionBean.getlidMesActual());
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

					if(this.preguntaequivalencia!=null) {
						this.preguntaequivalencia.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPreguntaEquivalencia.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPreguntaEquivalenciaGenerico)throws Exception
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
				jComboBoxid_empresaPreguntaEquivalenciaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPreguntaEquivalenciaGenerico!=null && jComboBoxid_empresaPreguntaEquivalenciaGenerico.getItemCount()>0) {
					jComboBoxid_empresaPreguntaEquivalenciaGenerico.setSelectedIndex(0);
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

					if(this.preguntaequivalencia!=null) {
						this.preguntaequivalencia.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPreguntaEquivalencia.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPreguntaEquivalenciaGenerico)throws Exception
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
				jComboBoxid_sucursalPreguntaEquivalenciaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPreguntaEquivalenciaGenerico!=null && jComboBoxid_sucursalPreguntaEquivalenciaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPreguntaEquivalenciaGenerico.setSelectedIndex(0);
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

					if(this.preguntaequivalencia!=null) {
						this.preguntaequivalencia.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPreguntaEquivalencia.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia!=null) {
						jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia!=null) {
							//jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPreguntaEquivalenciaGenerico)throws Exception
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
				jComboBoxid_ejercicioPreguntaEquivalenciaGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPreguntaEquivalenciaGenerico!=null && jComboBoxid_ejercicioPreguntaEquivalenciaGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPreguntaEquivalenciaGenerico.setSelectedIndex(0);
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

					if(this.preguntaequivalencia!=null) {
						this.preguntaequivalencia.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPreguntaEquivalencia.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia!=null) {
						jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia!=null) {
							//jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.getItemCount()>0) {
								jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPreguntaEquivalenciaGenerico)throws Exception
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
				jComboBoxid_periodoPreguntaEquivalenciaGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPreguntaEquivalenciaGenerico!=null && jComboBoxid_periodoPreguntaEquivalenciaGenerico.getItemCount()>0) {
					jComboBoxid_periodoPreguntaEquivalenciaGenerico.setSelectedIndex(0);
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

					if(this.preguntaequivalencia!=null) {
						this.preguntaequivalencia.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioPreguntaEquivalencia.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioPreguntaEquivalenciaGenerico)throws Exception
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
				jComboBoxid_anioPreguntaEquivalenciaGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioPreguntaEquivalenciaGenerico!=null && jComboBoxid_anioPreguntaEquivalenciaGenerico.getItemCount()>0) {
					jComboBoxid_anioPreguntaEquivalenciaGenerico.setSelectedIndex(0);
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

					if(this.preguntaequivalencia!=null) {
						this.preguntaequivalencia.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesPreguntaEquivalencia.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesPreguntaEquivalenciaGenerico)throws Exception
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
				jComboBoxid_mesPreguntaEquivalenciaGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesPreguntaEquivalenciaGenerico!=null && jComboBoxid_mesPreguntaEquivalenciaGenerico.getItemCount()>0) {
					jComboBoxid_mesPreguntaEquivalenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PreguntaEquivalencia preguntaequivalencia,JComboBox jComboBoxid_empresaPreguntaEquivalenciaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPreguntaEquivalenciaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPreguntaEquivalenciaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				preguntaequivalencia.setid_empresa(empresaAux.getId());
				preguntaequivalencia.setempresa_descripcion(PreguntaEquivalenciaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				preguntaequivalencia.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PreguntaEquivalencia preguntaequivalencia,JComboBox jComboBoxid_sucursalPreguntaEquivalenciaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPreguntaEquivalenciaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPreguntaEquivalenciaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				preguntaequivalencia.setid_sucursal(sucursalAux.getId());
				preguntaequivalencia.setsucursal_descripcion(PreguntaEquivalenciaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				preguntaequivalencia.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PreguntaEquivalencia preguntaequivalencia,JComboBox jComboBoxid_ejercicioPreguntaEquivalenciaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPreguntaEquivalenciaGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPreguntaEquivalenciaGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				preguntaequivalencia.setid_ejercicio(ejercicioAux.getId());
				preguntaequivalencia.setejercicio_descripcion(PreguntaEquivalenciaConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				preguntaequivalencia.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PreguntaEquivalencia preguntaequivalencia,JComboBox jComboBoxid_periodoPreguntaEquivalenciaGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPreguntaEquivalenciaGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPreguntaEquivalenciaGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				preguntaequivalencia.setid_periodo(periodoAux.getId());
				preguntaequivalencia.setperiodo_descripcion(PreguntaEquivalenciaConstantesFunciones.getPeriodoDescripcion(periodoAux));
				preguntaequivalencia.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(PreguntaEquivalencia preguntaequivalencia,JComboBox jComboBoxid_anioPreguntaEquivalenciaGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioPreguntaEquivalenciaGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioPreguntaEquivalenciaGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				preguntaequivalencia.setid_anio(anioAux.getId());
				preguntaequivalencia.setanio_descripcion(PreguntaEquivalenciaConstantesFunciones.getAnioDescripcion(anioAux));
				preguntaequivalencia.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(PreguntaEquivalencia preguntaequivalencia,JComboBox jComboBoxid_mesPreguntaEquivalenciaGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesPreguntaEquivalenciaGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesPreguntaEquivalenciaGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				preguntaequivalencia.setid_mes(mesAux.getId());
				preguntaequivalencia.setmes_descripcion(PreguntaEquivalenciaConstantesFunciones.getMesDescripcion(mesAux));
				preguntaequivalencia.setMes(mesAux);			}
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

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
					}

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
					}

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
					}

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.addItem(ejercicio);
							}
						}

						if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
					}

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.addItem(periodo);
							}
						}

						if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
					}

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { 
					}

					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPreguntaEquivalencia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PreguntaEquivalenciaConstantesFunciones.refrescarForeignKeysDescripcionesPreguntaEquivalencia(this.preguntaequivalenciaLogic.getPreguntaEquivalencias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PreguntaEquivalenciaConstantesFunciones.refrescarForeignKeysDescripcionesPreguntaEquivalencia(this.preguntaequivalencias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//preguntaequivalenciaLogic.setPreguntaEquivalencias(this.preguntaequivalencias);
			preguntaequivalenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PreguntaEquivalenciaParameterReturnGeneral getPreguntaEquivalenciaParameterGeneral() {
		return this.preguntaequivalenciaParameterGeneral;
	}
	
	public void setPreguntaEquivalenciaParameterGeneral(PreguntaEquivalenciaParameterReturnGeneral preguntaequivalenciaParameterGeneral) {
		this.preguntaequivalenciaParameterGeneral = preguntaequivalenciaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPreguntaEquivalencia() {
		return isPermisoTodoPreguntaEquivalencia;
	}

	public void setIsPermisoTodoPreguntaEquivalencia(Boolean isPermisoTodoPreguntaEquivalencia) {
		this.isPermisoTodoPreguntaEquivalencia = isPermisoTodoPreguntaEquivalencia;
	}

	public Boolean getIsPermisoNuevoPreguntaEquivalencia() {
		return isPermisoNuevoPreguntaEquivalencia;
	}

	public void setIsPermisoNuevoPreguntaEquivalencia(Boolean isPermisoNuevoPreguntaEquivalencia) {
		this.isPermisoNuevoPreguntaEquivalencia = isPermisoNuevoPreguntaEquivalencia;
	}

	public Boolean getIsPermisoActualizarPreguntaEquivalencia() {
		return isPermisoActualizarPreguntaEquivalencia;
	}

	public void setIsPermisoActualizarPreguntaEquivalencia(Boolean isPermisoActualizarPreguntaEquivalencia) {
		this.isPermisoActualizarPreguntaEquivalencia = isPermisoActualizarPreguntaEquivalencia;
	}

	public Boolean getIsPermisoEliminarPreguntaEquivalencia() {
		return isPermisoEliminarPreguntaEquivalencia;
	}

	public void setIsPermisoEliminarPreguntaEquivalencia(Boolean isPermisoEliminarPreguntaEquivalencia) {
		this.isPermisoEliminarPreguntaEquivalencia = isPermisoEliminarPreguntaEquivalencia;
	}

	public Boolean getIsPermisoGuardarCambiosPreguntaEquivalencia() {
		return isPermisoGuardarCambiosPreguntaEquivalencia;
	}

	public void setIsPermisoGuardarCambiosPreguntaEquivalencia(Boolean isPermisoGuardarCambiosPreguntaEquivalencia) {
		this.isPermisoGuardarCambiosPreguntaEquivalencia = isPermisoGuardarCambiosPreguntaEquivalencia;
	}
	
	public Boolean getIsPermisoConsultaPreguntaEquivalencia() {
		return isPermisoConsultaPreguntaEquivalencia;
	}

	public void setIsPermisoConsultaPreguntaEquivalencia(Boolean isPermisoConsultaPreguntaEquivalencia) {
		this.isPermisoConsultaPreguntaEquivalencia = isPermisoConsultaPreguntaEquivalencia;
	}

	public Boolean getIsPermisoBusquedaPreguntaEquivalencia() {
		return isPermisoBusquedaPreguntaEquivalencia;
	}

	public void setIsPermisoBusquedaPreguntaEquivalencia(Boolean isPermisoBusquedaPreguntaEquivalencia) {
		this.isPermisoBusquedaPreguntaEquivalencia = isPermisoBusquedaPreguntaEquivalencia;
	}

	public Boolean getIsPermisoReportePreguntaEquivalencia() {
		return isPermisoReportePreguntaEquivalencia;
	}

	public void setIsPermisoReportePreguntaEquivalencia(Boolean isPermisoReportePreguntaEquivalencia) {
		this.isPermisoReportePreguntaEquivalencia = isPermisoReportePreguntaEquivalencia;
	}
	
	public Boolean getIsPermisoPaginacionMedioPreguntaEquivalencia() {
		return isPermisoPaginacionMedioPreguntaEquivalencia;
	}

	public void setIsPermisoPaginacionMedioPreguntaEquivalencia(Boolean isPermisoPaginacionMedioPreguntaEquivalencia) {
		this.isPermisoPaginacionMedioPreguntaEquivalencia = isPermisoPaginacionMedioPreguntaEquivalencia;
	}
	
	public Boolean getIsPermisoPaginacionTodoPreguntaEquivalencia() {
		return isPermisoPaginacionTodoPreguntaEquivalencia;
	}

	public void setIsPermisoPaginacionTodoPreguntaEquivalencia(Boolean isPermisoPaginacionTodoPreguntaEquivalencia) {
		this.isPermisoPaginacionTodoPreguntaEquivalencia = isPermisoPaginacionTodoPreguntaEquivalencia;
	}
	
	public Boolean getIsPermisoPaginacionAltoPreguntaEquivalencia() {
		return isPermisoPaginacionAltoPreguntaEquivalencia;
	}

	public void setIsPermisoPaginacionAltoPreguntaEquivalencia(Boolean isPermisoPaginacionAltoPreguntaEquivalencia) {
		this.isPermisoPaginacionAltoPreguntaEquivalencia = isPermisoPaginacionAltoPreguntaEquivalencia;
	}
	
	public Boolean getIsPermisoCopiarPreguntaEquivalencia() {
		return isPermisoCopiarPreguntaEquivalencia;
	}

	public void setIsPermisoCopiarPreguntaEquivalencia(Boolean isPermisoCopiarPreguntaEquivalencia) {
		this.isPermisoCopiarPreguntaEquivalencia = isPermisoCopiarPreguntaEquivalencia;
	}
	
	public Boolean getIsPermisoVerFormPreguntaEquivalencia() {
		return isPermisoVerFormPreguntaEquivalencia;
	}

	public void setIsPermisoVerFormPreguntaEquivalencia(Boolean isPermisoVerFormPreguntaEquivalencia) {
		this.isPermisoVerFormPreguntaEquivalencia = isPermisoVerFormPreguntaEquivalencia;
	}
	
	public Boolean getIsPermisoDuplicarPreguntaEquivalencia() {
		return isPermisoDuplicarPreguntaEquivalencia;
	}

	public void setIsPermisoDuplicarPreguntaEquivalencia(Boolean isPermisoDuplicarPreguntaEquivalencia) {
		this.isPermisoDuplicarPreguntaEquivalencia = isPermisoDuplicarPreguntaEquivalencia;
	}
	
	public Boolean getIsPermisoOrdenPreguntaEquivalencia() {
		return isPermisoOrdenPreguntaEquivalencia;
	}

	public void setIsPermisoOrdenPreguntaEquivalencia(Boolean isPermisoOrdenPreguntaEquivalencia) {
		this.isPermisoOrdenPreguntaEquivalencia = isPermisoOrdenPreguntaEquivalencia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPreguntaEquivalencia() {
		return isVisibilidadCeldaNuevoPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaNuevoPreguntaEquivalencia(Boolean isVisibilidadCeldaNuevoPreguntaEquivalencia) {
		this.isVisibilidadCeldaNuevoPreguntaEquivalencia = isVisibilidadCeldaNuevoPreguntaEquivalencia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPreguntaEquivalencia() {
		return isVisibilidadCeldaDuplicarPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaDuplicarPreguntaEquivalencia(Boolean isVisibilidadCeldaDuplicarPreguntaEquivalencia) {
		this.isVisibilidadCeldaDuplicarPreguntaEquivalencia = isVisibilidadCeldaDuplicarPreguntaEquivalencia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPreguntaEquivalencia() {
		return isVisibilidadCeldaCopiarPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaCopiarPreguntaEquivalencia(Boolean isVisibilidadCeldaCopiarPreguntaEquivalencia) {
		this.isVisibilidadCeldaCopiarPreguntaEquivalencia = isVisibilidadCeldaCopiarPreguntaEquivalencia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPreguntaEquivalencia() {
		return isVisibilidadCeldaVerFormPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaVerFormPreguntaEquivalencia(Boolean isVisibilidadCeldaVerFormPreguntaEquivalencia) {
		this.isVisibilidadCeldaVerFormPreguntaEquivalencia = isVisibilidadCeldaVerFormPreguntaEquivalencia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPreguntaEquivalencia() {
		return isVisibilidadCeldaOrdenPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaOrdenPreguntaEquivalencia(Boolean isVisibilidadCeldaOrdenPreguntaEquivalencia) {
		this.isVisibilidadCeldaOrdenPreguntaEquivalencia = isVisibilidadCeldaOrdenPreguntaEquivalencia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia() {
		return isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia(Boolean isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia) {
		this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia = isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPreguntaEquivalencia() {
		return isVisibilidadCeldaModificarPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaModificarPreguntaEquivalencia(Boolean isVisibilidadCeldaModificarPreguntaEquivalencia) {
		this.isVisibilidadCeldaModificarPreguntaEquivalencia = isVisibilidadCeldaModificarPreguntaEquivalencia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPreguntaEquivalencia() {
		return isVisibilidadCeldaActualizarPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaActualizarPreguntaEquivalencia(Boolean isVisibilidadCeldaActualizarPreguntaEquivalencia) {
		this.isVisibilidadCeldaActualizarPreguntaEquivalencia = isVisibilidadCeldaActualizarPreguntaEquivalencia;
	}

	public Boolean getIsVisibilidadCeldaEliminarPreguntaEquivalencia() {
		return isVisibilidadCeldaEliminarPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaEliminarPreguntaEquivalencia(Boolean isVisibilidadCeldaEliminarPreguntaEquivalencia) {
		this.isVisibilidadCeldaEliminarPreguntaEquivalencia = isVisibilidadCeldaEliminarPreguntaEquivalencia;
	}

	public Boolean getIsVisibilidadCeldaCancelarPreguntaEquivalencia() {
		return isVisibilidadCeldaCancelarPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaCancelarPreguntaEquivalencia(Boolean isVisibilidadCeldaCancelarPreguntaEquivalencia) {
		this.isVisibilidadCeldaCancelarPreguntaEquivalencia = isVisibilidadCeldaCancelarPreguntaEquivalencia;
	}

	public Boolean getIsVisibilidadCeldaGuardarPreguntaEquivalencia() {
		return isVisibilidadCeldaGuardarPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaGuardarPreguntaEquivalencia(Boolean isVisibilidadCeldaGuardarPreguntaEquivalencia) {
		this.isVisibilidadCeldaGuardarPreguntaEquivalencia = isVisibilidadCeldaGuardarPreguntaEquivalencia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPreguntaEquivalencia() {
		return isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPreguntaEquivalencia(Boolean isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia) {
		this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia = isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia;
	}
		
	public PreguntaEquivalenciaSessionBean getpreguntaequivalenciaSessionBean() {
		return this.preguntaequivalenciaSessionBean;
	}
	
	public void setpreguntaequivalenciaSessionBean(PreguntaEquivalenciaSessionBean preguntaequivalenciaSessionBean) {
		this.preguntaequivalenciaSessionBean=preguntaequivalenciaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdEjercicioPorIdPeriodo() {
		return this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo;
	}

	public void setisVisibilidadBusquedaPorIdEjercicioPorIdPeriodo(Boolean isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {
		this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo;
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

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(preguntaequivalencia,null);
				this.setActualParaGuardarSucursalForeignKey(preguntaequivalencia,null);
				this.setActualParaGuardarEjercicioForeignKey(preguntaequivalencia,null);
				this.setActualParaGuardarPeriodoForeignKey(preguntaequivalencia,null);
				this.setActualParaGuardarAnioForeignKey(preguntaequivalencia,null);
				this.setActualParaGuardarMesForeignKey(preguntaequivalencia,null);
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
	
	public void bugActualizarReferenciaActual(PreguntaEquivalencia preguntaequivalencia,PreguntaEquivalencia preguntaequivalenciaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPreguntaEquivalencia(preguntaequivalencia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		preguntaequivalenciaAux.setId(preguntaequivalencia.getId());
		preguntaequivalenciaAux.setVersionRow(preguntaequivalencia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPreguntaEquivalencia();
		
			int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = preguntaequivalenciaValidator.getInvalidValues(this.preguntaequivalencia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			preguntaequivalenciaLogic.setDatosCliente(datosCliente);
			preguntaequivalenciaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				preguntaequivalenciaAux=new  PreguntaEquivalencia();
				
				preguntaequivalenciaAux.setIsNew(true);
				preguntaequivalenciaAux.setIsChanged(true);
				
				preguntaequivalenciaAux.setPreguntaEquivalenciaOriginal(this.preguntaequivalencia);
				
				preguntaequivalenciaAux.setId(this.preguntaequivalencia.getId());	
				preguntaequivalenciaAux.setVersionRow(this.preguntaequivalencia.getVersionRow());	
				preguntaequivalenciaAux.setid_empresa(this.preguntaequivalencia.getid_empresa());	
				preguntaequivalenciaAux.setid_sucursal(this.preguntaequivalencia.getid_sucursal());	
				preguntaequivalenciaAux.setid_ejercicio(this.preguntaequivalencia.getid_ejercicio());	
				preguntaequivalenciaAux.setid_periodo(this.preguntaequivalencia.getid_periodo());	
				preguntaequivalenciaAux.setdescripcion(this.preguntaequivalencia.getdescripcion());	
				preguntaequivalenciaAux.setdesde(this.preguntaequivalencia.getdesde());	
				preguntaequivalenciaAux.sethasta(this.preguntaequivalencia.gethasta());	
				preguntaequivalenciaAux.setorden(this.preguntaequivalencia.getorden());	
				preguntaequivalenciaAux.setid_anio(this.preguntaequivalencia.getid_anio());	
				preguntaequivalenciaAux.setid_mes(this.preguntaequivalencia.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(preguntaequivalenciaAux,preguntaequivalenciaLogic.getPreguntaEquivalencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntaequivalenciaAux,preguntaequivalencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciaLogic.savePreguntaEquivalencias();//WithConnection
						//preguntaequivalenciaLogic.getSetVersionRowPreguntaEquivalencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.preguntaequivalencia,preguntaequivalenciaAux);
					
					this.refrescarForeignKeysDescripcionesPreguntaEquivalencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								preguntaequivalenciaLogic.savePreguntaEquivalenciaRelaciones(preguntaequivalenciaAux);//WithConnection
								//preguntaequivalenciaLogic.getSetVersionRowPreguntaEquivalencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.preguntaequivalencia,preguntaequivalenciaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(preguntaequivalenciaAux,preguntaequivalenciaLogic.getPreguntaEquivalencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(preguntaequivalenciaAux,preguntaequivalencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.preguntaequivalencia,preguntaequivalenciaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				preguntaequivalenciaAux=new  PreguntaEquivalencia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() 
					|| (this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() && this.preguntaequivalencia.getId()>=0)) {
						
					preguntaequivalenciaAux.setIsNew(false);
				}
				
				preguntaequivalenciaAux.setIsDeleted(false);
			
				preguntaequivalenciaAux.setId(this.preguntaequivalencia.getId());	
				preguntaequivalenciaAux.setVersionRow(this.preguntaequivalencia.getVersionRow());	
				preguntaequivalenciaAux.setid_empresa(this.preguntaequivalencia.getid_empresa());	
				preguntaequivalenciaAux.setid_sucursal(this.preguntaequivalencia.getid_sucursal());	
				preguntaequivalenciaAux.setid_ejercicio(this.preguntaequivalencia.getid_ejercicio());	
				preguntaequivalenciaAux.setid_periodo(this.preguntaequivalencia.getid_periodo());	
				preguntaequivalenciaAux.setdescripcion(this.preguntaequivalencia.getdescripcion());	
				preguntaequivalenciaAux.setdesde(this.preguntaequivalencia.getdesde());	
				preguntaequivalenciaAux.sethasta(this.preguntaequivalencia.gethasta());	
				preguntaequivalenciaAux.setorden(this.preguntaequivalencia.getorden());	
				preguntaequivalenciaAux.setid_anio(this.preguntaequivalencia.getid_anio());	
				preguntaequivalenciaAux.setid_mes(this.preguntaequivalencia.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(preguntaequivalenciaAux,preguntaequivalenciaLogic.getPreguntaEquivalencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntaequivalenciaAux,preguntaequivalencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciaLogic.savePreguntaEquivalencias();//WithConnection
						//preguntaequivalenciaLogic.getSetVersionRowPreguntaEquivalencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.preguntaequivalencia,preguntaequivalenciaAux);
					
					this.refrescarForeignKeysDescripcionesPreguntaEquivalencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								preguntaequivalenciaLogic.savePreguntaEquivalenciaRelaciones(preguntaequivalenciaAux);//WithConnection
								//preguntaequivalenciaLogic.getSetVersionRowPreguntaEquivalencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.preguntaequivalencia,preguntaequivalenciaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(preguntaequivalenciaAux,preguntaequivalenciaLogic.getPreguntaEquivalencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(preguntaequivalenciaAux,preguntaequivalencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.preguntaequivalencia,preguntaequivalenciaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				preguntaequivalenciaAux=new  PreguntaEquivalencia();
				
				preguntaequivalenciaAux.setIsNew(false);
				preguntaequivalenciaAux.setIsChanged(false);
				
				preguntaequivalenciaAux.setIsDeleted(true);
				
				preguntaequivalenciaAux.setId(this.preguntaequivalencia.getId());	
				preguntaequivalenciaAux.setVersionRow(this.preguntaequivalencia.getVersionRow());	
				preguntaequivalenciaAux.setid_empresa(this.preguntaequivalencia.getid_empresa());	
				preguntaequivalenciaAux.setid_sucursal(this.preguntaequivalencia.getid_sucursal());	
				preguntaequivalenciaAux.setid_ejercicio(this.preguntaequivalencia.getid_ejercicio());	
				preguntaequivalenciaAux.setid_periodo(this.preguntaequivalencia.getid_periodo());	
				preguntaequivalenciaAux.setdescripcion(this.preguntaequivalencia.getdescripcion());	
				preguntaequivalenciaAux.setdesde(this.preguntaequivalencia.getdesde());	
				preguntaequivalenciaAux.sethasta(this.preguntaequivalencia.gethasta());	
				preguntaequivalenciaAux.setorden(this.preguntaequivalencia.getorden());	
				preguntaequivalenciaAux.setid_anio(this.preguntaequivalencia.getid_anio());	
				preguntaequivalenciaAux.setid_mes(this.preguntaequivalencia.getid_mes());	
				
				if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.preguntaequivalenciaAux.getId()>=0) {	
						this.preguntaequivalenciasEliminados.add(preguntaequivalenciaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(preguntaequivalenciaAux,preguntaequivalenciaLogic.getPreguntaEquivalencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntaequivalenciaAux,preguntaequivalencias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciaLogic.savePreguntaEquivalencias();//WithConnection
						//preguntaequivalenciaLogic.getSetVersionRowPreguntaEquivalencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								preguntaequivalenciaLogic.savePreguntaEquivalenciaRelaciones(preguntaequivalenciaAux);//WithConnection
								//preguntaequivalenciaLogic.getSetVersionRowPreguntaEquivalencias();//WithConnection
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
							if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(preguntaequivalenciaAux,preguntaequivalenciaLogic.getPreguntaEquivalencias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(preguntaequivalenciaAux,preguntaequivalencias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getPreguntaEquivalencias().addAll(this.preguntaequivalenciasEliminados);
					
					preguntaequivalenciaLogic.savePreguntaEquivalencias();//WithConnection
					//preguntaequivalenciaLogic.getSetVersionRowPreguntaEquivalencias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPreguntaEquivalencia();
				
				this.preguntaequivalenciasEliminados= new ArrayList<PreguntaEquivalencia>();		
			}
			
			if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Preguntas Equivalencia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.preguntaequivalencia=preguntaequivalenciaAux;
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
      		//this.finishProcessPreguntaEquivalencia();
      	}
		
	}	
	
	public void actualizarRelaciones(PreguntaEquivalencia preguntaequivalenciaLocal) throws Exception {
		
		if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PreguntaEquivalencia preguntaequivalenciaLocal) throws Exception {	
		if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				preguntaequivalenciaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				preguntaequivalenciaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				preguntaequivalenciaLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				preguntaequivalenciaLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				preguntaequivalenciaLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				preguntaequivalenciaLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPreguntaEquivalenciaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = preguntaequivalenciaValidator.getInvalidValues(this.preguntaequivalencia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PreguntaEquivalencia preguntaequivalencia,List<PreguntaEquivalencia> preguntaequivalencias) throws Exception {
		try	{		
			PreguntaEquivalenciaConstantesFunciones.actualizarLista(preguntaequivalencia,preguntaequivalencias,this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PreguntaEquivalencia preguntaequivalencia,List<PreguntaEquivalencia> preguntaequivalencias) throws Exception {
		try	{			
			PreguntaEquivalenciaConstantesFunciones.actualizarSelectedLista(preguntaequivalencia,preguntaequivalencias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PreguntaEquivalencia> preguntaequivalenciasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				preguntaequivalenciasLocal=this.preguntaequivalenciaLogic.getPreguntaEquivalencias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				preguntaequivalenciasLocal=this.preguntaequivalencias;
			}
			//ARCHITECTURE
		
			for(PreguntaEquivalencia preguntaequivalenciaLocal:preguntaequivalenciasLocal) {
				if(this.permiteMantenimiento(preguntaequivalenciaLocal) && preguntaequivalenciaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PreguntaEquivalenciaConstantesFunciones.getPreguntaEquivalenciaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_empresaPreguntaEquivalencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_sucursalPreguntaEquivalencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_ejercicioPreguntaEquivalencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_periodoPreguntaEquivalencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabeldescripcionPreguntaEquivalencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.DESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabeldesdePreguntaEquivalencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.HASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelhastaPreguntaEquivalencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelordenPreguntaEquivalencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_anioPreguntaEquivalencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PreguntaEquivalenciaConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_mesPreguntaEquivalencia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_empresaPreguntaEquivalencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_sucursalPreguntaEquivalencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_ejercicioPreguntaEquivalencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_periodoPreguntaEquivalencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabeldescripcionPreguntaEquivalencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabeldesdePreguntaEquivalencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelhastaPreguntaEquivalencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelordenPreguntaEquivalencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_anioPreguntaEquivalencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelid_mesPreguntaEquivalencia,"");
		
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
		this.iIdNuevoPreguntaEquivalencia--;	
		
		
		this.preguntaequivalenciaAux=new PreguntaEquivalencia();
		
		this.preguntaequivalenciaAux.setId(this.iIdNuevoPreguntaEquivalencia);
		this.preguntaequivalenciaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.preguntaequivalenciaLogic.getPreguntaEquivalencias().add(this.preguntaequivalenciaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.preguntaequivalencias.add(this.preguntaequivalenciaAux);
		}
		//ARCHITECTURE
		
		this.preguntaequivalencia=this.preguntaequivalenciaAux;
		
		if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPreguntaEquivalencia(this.preguntaequivalencia);
			this.setVariablesObjetoActualToFormularioForeignKeyPreguntaEquivalencia(this.preguntaequivalencia);
		}
				
		//this.setDefaultControlesPreguntaEquivalencia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPreguntaEquivalencia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPreguntaEquivalencia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPreguntaEquivalencia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPreguntaEquivalencia(this.preguntaequivalenciaBean,this.preguntaequivalencia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
			classes=PreguntaEquivalenciaConstantesFunciones.getClassesRelationshipsOfPreguntaEquivalencia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.preguntaequivalenciaReturnGeneral=preguntaequivalenciaLogic.procesarEventosPreguntaEquivalenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.preguntaequivalenciaLogic.getPreguntaEquivalencias(),this.preguntaequivalencia,this.preguntaequivalenciaParameterGeneral,this.isEsNuevoPreguntaEquivalencia,classes);//this.preguntaequivalenciaLogic.getPreguntaEquivalencia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPreguntaEquivalencia(this.preguntaequivalenciaReturnGeneral,this.preguntaequivalenciaBean,false);
		
		if(this.preguntaequivalenciaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPreguntaEquivalencia(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPreguntaEquivalencia(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia());
		}
		
		if(this.preguntaequivalenciaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPreguntaEquivalencia(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia(),classes);//this.preguntaequivalenciaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPreguntaEquivalencia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPreguntaEquivalencia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.RecargarFormPreguntaEquivalencia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPreguntaEquivalencia(false);
						
			if(preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreguntaEquivalencia();
			}
			
			this.actualizarVisualTableDatosPreguntaEquivalencia();
			
			this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(this.getIndiceNuevoPreguntaEquivalencia(), this.getIndiceNuevoPreguntaEquivalencia());
			
			this.seleccionarFilaTablaPreguntaEquivalenciaActual();
						
			this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPreguntaEquivalencia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextAreadescripcionPreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activardescripcionPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFielddesdePreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activardesdePreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldhastaPreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activarhastaPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldordenPreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activarordenPreguntaEquivalencia);	
		//
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activarid_empresaPreguntaEquivalencia);//
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activarid_sucursalPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activarid_ejercicioPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activarid_periodoPreguntaEquivalencia);//
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activarid_anioPreguntaEquivalencia);//
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.setEnabled(isHabilitar && this.preguntaequivalenciaConstantesFunciones.activarid_mesPreguntaEquivalencia);
	};
	
	public void setDefaultControlesPreguntaEquivalencia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPreguntaEquivalencia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.preguntaequivalenciaSessionBean.setConGuardarRelaciones(true);			
			this.preguntaequivalenciaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTabbedPaneRelacionesPreguntaEquivalencia.setVisible(true);
			
					
		} else {
			//this.preguntaequivalenciaSessionBean.setConGuardarRelaciones(false);			
			this.preguntaequivalenciaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTabbedPaneRelacionesPreguntaEquivalencia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPreguntaEquivalencia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
				if(preguntaequivalenciaAux.getId().equals(this.iIdNuevoPreguntaEquivalencia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalencias) {
				if(preguntaequivalenciaAux.getId().equals(this.iIdNuevoPreguntaEquivalencia)) {
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
	
	public int getIndiceActualPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
				if(preguntaequivalenciaAux.getId().equals(preguntaequivalencia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalencias) {
				if(preguntaequivalenciaAux.getId().equals(preguntaequivalencia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalenciaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
				if(preguntaequivalenciaAux.getPreguntaEquivalenciaOriginal().getId().equals(preguntaequivalenciaOriginal.getId())) {
					existe=true;
					preguntaequivalenciaOriginal.setId(preguntaequivalenciaAux.getId());
					preguntaequivalenciaOriginal.setVersionRow(preguntaequivalenciaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalencias) {
				if(preguntaequivalenciaAux.getPreguntaEquivalenciaOriginal().getId().equals(preguntaequivalenciaOriginal.getId())) {
					existe=true;
					preguntaequivalenciaOriginal.setId(preguntaequivalenciaAux.getId());
					preguntaequivalenciaOriginal.setVersionRow(preguntaequivalenciaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPreguntaEquivalencia(Boolean esParaCancelar) throws Exception {
		preguntaequivalenciasAux=new ArrayList<PreguntaEquivalencia>();
		preguntaequivalenciaAux=new PreguntaEquivalencia();
		
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
					if(preguntaequivalenciaAux.getId()<0) {
						preguntaequivalenciasAux.add(preguntaequivalenciaAux);
					}		
				}
				this.iIdNuevoPreguntaEquivalencia=0L;
				this.preguntaequivalenciaLogic.getPreguntaEquivalencias().removeAll(preguntaequivalenciasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalencias) {
					if(preguntaequivalenciaAux.getId()<0) {
						preguntaequivalenciasAux.add(preguntaequivalenciaAux);
					}		
				}
				this.iIdNuevoPreguntaEquivalencia=0L;
				this.preguntaequivalencias.removeAll(preguntaequivalenciasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPreguntaEquivalencia 
					&& this.preguntaequivalenciaLogic.getPreguntaEquivalencias().size()>0
					) {
					preguntaequivalenciaAux=this.preguntaequivalenciaLogic.getPreguntaEquivalencias().get(this.preguntaequivalenciaLogic.getPreguntaEquivalencias().size() - 1);
				
					if(preguntaequivalenciaAux.getId()<0) {
						this.preguntaequivalenciaLogic.getPreguntaEquivalencias().remove(preguntaequivalenciaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPreguntaEquivalencia && this.preguntaequivalencias.size()>0) {
					preguntaequivalenciaAux=this.preguntaequivalencias.get(this.preguntaequivalencias.size() - 1);
				
					if(preguntaequivalenciaAux.getId()<0) {
						this.preguntaequivalencias.remove(preguntaequivalenciaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPreguntaEquivalencia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(preguntaequivalencia.getId()<0) {
				this.preguntaequivalenciaLogic.getPreguntaEquivalencias().remove(this.preguntaequivalencia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(preguntaequivalencia.getId()<0) {
				this.preguntaequivalencias.remove(this.preguntaequivalencia);
			}
		}			
	}
	
	public void setEstadosInicialesPreguntaEquivalencia(List<PreguntaEquivalencia> preguntaequivalenciasAux) throws Exception {
		PreguntaEquivalenciaConstantesFunciones.setEstadosInicialesPreguntaEquivalencia(preguntaequivalenciasAux);
	}
	
	public void setEstadosInicialesPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalenciaAux) throws Exception {
		PreguntaEquivalenciaConstantesFunciones.setEstadosInicialesPreguntaEquivalencia(preguntaequivalenciaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPreguntaEquivalenciaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPreguntaEquivalenciaActual()) {
				if(!this.isEsNuevoPreguntaEquivalencia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPreguntaEquivalencia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPreguntaEquivalenciaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Preguntas Equivalencia ?", "MANTENIMIENTO DE Preguntas Equivalencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PreguntaEquivalencia preguntaequivalencia) throws Exception {
		PreguntaEquivalenciaConstantesFunciones.seleccionarAsignar(this.preguntaequivalencia,preguntaequivalencia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPreguntaEquivalencia=this.isPermisoActualizarOriginalPreguntaEquivalencia;
			
			
			this.seleccionarAsignar(preguntaequivalencia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PreguntaEquivalenciaConstantesFunciones.quitarEspaciosPreguntaEquivalencia(this.preguntaequivalencia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.preguntaequivalenciaSessionBean.setsFuncionBusquedaRapida(this.preguntaequivalenciaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPreguntaEquivalencia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPreguntaEquivalencia(esParaCancelar);				
				this.cancelarNuevoPreguntaEquivalencia(esParaCancelar);								
			}
			
			this.preguntaequivalencia=new PreguntaEquivalencia();
			
			this.inicializarPreguntaEquivalencia();
			
			this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPreguntaEquivalencia() throws Exception {
		try {
			PreguntaEquivalenciaConstantesFunciones.inicializarPreguntaEquivalencia(this.preguntaequivalencia);
			
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
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.preguntaequivalenciaLogic.getPreguntaEquivalencias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePreguntaEquivalencias(String sAccionBusqueda,List<PreguntaEquivalencia> preguntaequivalenciasParaReportes) throws Exception {
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
					sPathReporteFinal="PreguntaEquivalencia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PreguntaEquivalenciaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PreguntaEquivalenciaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PreguntaEquivalencia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Preguntas Equivalencias");		
		parameters.put("busquedapor", PreguntaEquivalenciaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePreguntaEquivalencia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PreguntaEquivalenciaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PreguntaEquivalenciaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePreguntaEquivalencia=new JRBeanArrayDataSource(PreguntaEquivalenciaJInternalFrame.TraerPreguntaEquivalenciaBeans(preguntaequivalenciasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePreguntaEquivalencia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PreguntaEquivalenciaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PreguntaEquivalenciaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PreguntaEquivalenciaBean.TraerPreguntaEquivalenciaBeans(preguntaequivalenciasParaReportes).toArray()));
							
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
				this.generarExcelReportePreguntaEquivalencias(sAccionBusqueda,sTipoArchivoReporte,preguntaequivalenciasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPreguntaEquivalencias(sAccionBusqueda,sTipoArchivoReporte,preguntaequivalenciasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPreguntaEquivalenciaActionPerformed(null);
					//this.generarExcelReportePreguntaEquivalencias(sAccionBusqueda,sTipoArchivoReporte,preguntaequivalenciasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPreguntaEquivalencias(sAccionBusqueda,sTipoArchivoReporte,preguntaequivalenciasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPreguntaEquivalencias(sAccionBusqueda,sTipoArchivoReporte,preguntaequivalenciasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPreguntaEquivalencias(sAccionBusqueda,sTipoArchivoReporte,preguntaequivalenciasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePreguntaEquivalencias(String sAccionBusqueda,String sTipoArchivoReporte,List<PreguntaEquivalencia> preguntaequivalenciasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaequivalencia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreguntaEquivalencias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPreguntaEquivalencia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PreguntaEquivalencia preguntaequivalencia : preguntaequivalenciasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PreguntaEquivalenciaConstantesFunciones.generarExcelReporteDataPreguntaEquivalencia("NORMAL",row,workbook,preguntaequivalencia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPreguntaEquivalencia(String sTipo,Row row,Workbook workbook) {
		
		PreguntaEquivalenciaConstantesFunciones.generarExcelReporteHeaderPreguntaEquivalencia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPreguntaEquivalencias(String sAccionBusqueda,String sTipoArchivoReporte,List<PreguntaEquivalencia> preguntaequivalenciasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaequivalencia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreguntaEquivalencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PreguntaEquivalencia preguntaequivalencia : preguntaequivalenciasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.getPreguntaEquivalenciaDescripcion(preguntaequivalencia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.getdesde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.gethasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(preguntaequivalencia.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPreguntaEquivalencias(String sAccionBusqueda,String sTipoArchivoReporte,List<PreguntaEquivalencia> preguntaequivalenciasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PreguntaEquivalencia> preguntaequivalenciasRespaldo=null;
		
		classes=PreguntaEquivalenciaConstantesFunciones.getClassesRelationshipsOfPreguntaEquivalencia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.preguntaequivalenciaLogic.setDatosCliente(this.datosCliente);
		this.preguntaequivalenciaLogic.setDatosDeep(this.datosDeep);
		this.preguntaequivalenciaLogic.setIsConDeep(true);
		
		preguntaequivalenciasRespaldo=this.preguntaequivalenciaLogic.getPreguntaEquivalencias();
		
		this.preguntaequivalenciaLogic.setPreguntaEquivalencias(preguntaequivalenciasParaReportes);	
		this.preguntaequivalenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		preguntaequivalenciasParaReportes=this.preguntaequivalenciaLogic.getPreguntaEquivalencias();
		this.preguntaequivalenciaLogic.setPreguntaEquivalencias(preguntaequivalenciasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaequivalencia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PreguntaEquivalencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPreguntaEquivalencia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PreguntaEquivalencia preguntaequivalencia : preguntaequivalenciasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPreguntaEquivalencia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PreguntaEquivalenciaConstantesFunciones.generarExcelReporteDataPreguntaEquivalencia("NORMAL",row,workbook,preguntaequivalencia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.getPreguntaEquivalenciaDescripcion(preguntaequivalencia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPreguntaEquivalencia() throws Exception {		
		this.startProcessPreguntaEquivalencia(true);
	}
	
	public void startProcessPreguntaEquivalencia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPreguntaEquivalencia ,this.jPanelParametrosReportesPreguntaEquivalencia, this.jScrollPanelDatosPreguntaEquivalencia,this.jPanelPaginacionPreguntaEquivalencia, this.jScrollPanelDatosEdicionPreguntaEquivalencia, this.jPanelAccionesPreguntaEquivalencia,this.jPanelAccionesFormularioPreguntaEquivalencia,this.jmenuBarPreguntaEquivalencia,this.jmenuBarDetallePreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,this.jTtoolBarDetallePreguntaEquivalencia);		
		
		final JTabbedPane jTabbedPaneBusquedasPreguntaEquivalencia=this.jTabbedPaneBusquedasPreguntaEquivalencia; 
		
		final JPanel jPanelParametrosReportesPreguntaEquivalencia=this.jPanelParametrosReportesPreguntaEquivalencia;
		//final JScrollPane jScrollPanelDatosPreguntaEquivalencia=this.jScrollPanelDatosPreguntaEquivalencia;
		final JTable jTableDatosPreguntaEquivalencia=this.jTableDatosPreguntaEquivalencia;		
		final JPanel jPanelPaginacionPreguntaEquivalencia=this.jPanelPaginacionPreguntaEquivalencia;
		//final JScrollPane jScrollPanelDatosEdicionPreguntaEquivalencia=this.jScrollPanelDatosEdicionPreguntaEquivalencia;
		final JPanel jPanelAccionesPreguntaEquivalencia=this.jPanelAccionesPreguntaEquivalencia;
		
		JPanel jPanelCamposAuxiliarPreguntaEquivalencia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPreguntaEquivalencia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			jPanelCamposAuxiliarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelCamposPreguntaEquivalencia;
			jPanelAccionesFormularioAuxiliarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelAccionesFormularioPreguntaEquivalencia;
		}
		
		final JPanel jPanelCamposPreguntaEquivalencia=jPanelCamposAuxiliarPreguntaEquivalencia;
		final JPanel jPanelAccionesFormularioPreguntaEquivalencia=jPanelAccionesFormularioAuxiliarPreguntaEquivalencia;
		
		
		final JMenuBar jmenuBarPreguntaEquivalencia=this.jmenuBarPreguntaEquivalencia;
		final JToolBar jTtoolBarPreguntaEquivalencia=this.jTtoolBarPreguntaEquivalencia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPreguntaEquivalencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPreguntaEquivalencia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			jmenuBarDetalleAuxiliarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jmenuBarDetallePreguntaEquivalencia;
			jTtoolBarDetalleAuxiliarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jTtoolBarDetallePreguntaEquivalencia;
		}
		
		final JMenuBar jmenuBarDetallePreguntaEquivalencia=jmenuBarDetalleAuxiliarPreguntaEquivalencia;
		final JToolBar jTtoolBarDetallePreguntaEquivalencia=jTtoolBarDetalleAuxiliarPreguntaEquivalencia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPreguntaEquivalencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPreguntaEquivalencia;
			processRunnable.jTableDatos=jTableDatosPreguntaEquivalencia;
			processRunnable.jPanelCampos=jPanelCamposPreguntaEquivalencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionPreguntaEquivalencia;
			processRunnable.jPanelAcciones=jPanelAccionesPreguntaEquivalencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPreguntaEquivalencia;
			
			
			processRunnable.jmenuBar=jmenuBarPreguntaEquivalencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePreguntaEquivalencia;
			processRunnable.jTtoolBar=jTtoolBarPreguntaEquivalencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePreguntaEquivalencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPreguntaEquivalencia ,jPanelParametrosReportesPreguntaEquivalencia,jTableDatosPreguntaEquivalencia, /*jScrollPanelDatosPreguntaEquivalencia,*/jPanelCamposPreguntaEquivalencia,jPanelPaginacionPreguntaEquivalencia, /*jScrollPanelDatosEdicionPreguntaEquivalencia,*/ jPanelAccionesPreguntaEquivalencia,jPanelAccionesFormularioPreguntaEquivalencia,jmenuBarPreguntaEquivalencia,jmenuBarDetallePreguntaEquivalencia,jTtoolBarPreguntaEquivalencia,jTtoolBarDetallePreguntaEquivalencia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPreguntaEquivalencia ,jPanelParametrosReportesPreguntaEquivalencia, jScrollPanelDatosPreguntaEquivalencia,jPanelPaginacionPreguntaEquivalencia, jScrollPanelDatosEdicionPreguntaEquivalencia, jPanelAccionesPreguntaEquivalencia,jPanelAccionesFormularioPreguntaEquivalencia,jmenuBarPreguntaEquivalencia,jmenuBarDetallePreguntaEquivalencia,jTtoolBarPreguntaEquivalencia,jTtoolBarDetallePreguntaEquivalencia);
						
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
	
	public void finishProcessPreguntaEquivalencia() {// throws Exception 
		this.finishProcessPreguntaEquivalencia(true);
	}
	
	public void finishProcessPreguntaEquivalencia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPreguntaEquivalencia ,this.jPanelParametrosReportesPreguntaEquivalencia, this.jScrollPanelDatosPreguntaEquivalencia,this.jPanelPaginacionPreguntaEquivalencia, this.jScrollPanelDatosEdicionPreguntaEquivalencia, this.jPanelAccionesPreguntaEquivalencia,this.jPanelAccionesFormularioPreguntaEquivalencia,this.jmenuBarPreguntaEquivalencia,this.jmenuBarDetallePreguntaEquivalencia,this.jTtoolBarPreguntaEquivalencia,this.jTtoolBarDetallePreguntaEquivalencia);		
		
		final JTabbedPane jTabbedPaneBusquedasPreguntaEquivalencia=this.jTabbedPaneBusquedasPreguntaEquivalencia; 
		
		final JPanel jPanelParametrosReportesPreguntaEquivalencia=this.jPanelParametrosReportesPreguntaEquivalencia;
		//final JScrollPane jScrollPanelDatosPreguntaEquivalencia=this.jScrollPanelDatosPreguntaEquivalencia;
		final JTable jTableDatosPreguntaEquivalencia=this.jTableDatosPreguntaEquivalencia;		
		final JPanel jPanelPaginacionPreguntaEquivalencia=this.jPanelPaginacionPreguntaEquivalencia;
		//final JScrollPane jScrollPanelDatosEdicionPreguntaEquivalencia=this.jScrollPanelDatosEdicionPreguntaEquivalencia;
		final JPanel jPanelAccionesPreguntaEquivalencia=this.jPanelAccionesPreguntaEquivalencia;
		
		JPanel jPanelCamposAuxiliarPreguntaEquivalencia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPreguntaEquivalencia=new JPanel();
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			jPanelCamposAuxiliarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelCamposPreguntaEquivalencia;
			jPanelAccionesFormularioAuxiliarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelAccionesFormularioPreguntaEquivalencia;
		}
		
		final JPanel jPanelCamposPreguntaEquivalencia=jPanelCamposAuxiliarPreguntaEquivalencia;
		final JPanel jPanelAccionesFormularioPreguntaEquivalencia=jPanelAccionesFormularioAuxiliarPreguntaEquivalencia;
		
		
		final JMenuBar jmenuBarPreguntaEquivalencia=this.jmenuBarPreguntaEquivalencia;		
		final JToolBar jTtoolBarPreguntaEquivalencia=this.jTtoolBarPreguntaEquivalencia;
				
		JMenuBar jmenuBarDetalleAuxiliarPreguntaEquivalencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPreguntaEquivalencia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			jmenuBarDetalleAuxiliarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jmenuBarDetallePreguntaEquivalencia;
			jTtoolBarDetalleAuxiliarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jTtoolBarDetallePreguntaEquivalencia;		
		}
		
		final JMenuBar jmenuBarDetallePreguntaEquivalencia=jmenuBarDetalleAuxiliarPreguntaEquivalencia;
		final JToolBar jTtoolBarDetallePreguntaEquivalencia=jTtoolBarDetalleAuxiliarPreguntaEquivalencia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPreguntaEquivalencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPreguntaEquivalencia;
			processRunnable.jTableDatos=jTableDatosPreguntaEquivalencia;
			processRunnable.jPanelCampos=jPanelCamposPreguntaEquivalencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionPreguntaEquivalencia;
			processRunnable.jPanelAcciones=jPanelAccionesPreguntaEquivalencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPreguntaEquivalencia;
			
			
			processRunnable.jmenuBar=jmenuBarPreguntaEquivalencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePreguntaEquivalencia;
			processRunnable.jTtoolBar=jTtoolBarPreguntaEquivalencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePreguntaEquivalencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPreguntaEquivalencia ,jPanelParametrosReportesPreguntaEquivalencia, jTableDatosPreguntaEquivalencia,/*jScrollPanelDatosPreguntaEquivalencia,*/jPanelCamposPreguntaEquivalencia,jPanelPaginacionPreguntaEquivalencia, /*jScrollPanelDatosEdicionPreguntaEquivalencia,*/ jPanelAccionesPreguntaEquivalencia,jPanelAccionesFormularioPreguntaEquivalencia,jmenuBarPreguntaEquivalencia,jmenuBarDetallePreguntaEquivalencia,jTtoolBarPreguntaEquivalencia,jTtoolBarDetallePreguntaEquivalencia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPreguntaEquivalencia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPreguntaEquivalencia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPreguntaEquivalencia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPreguntaEquivalencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPreguntaEquivalencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePreguntaEquivalencia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPreguntaEquivalencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPreguntaEquivalencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePreguntaEquivalencia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.preguntaequivalenciaConstantesFunciones.getsFinalQueryPreguntaEquivalencia();
		String  finalQueryPaginacionTodos=this.preguntaequivalenciaConstantesFunciones.getsFinalQueryPreguntaEquivalencia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PreguntaEquivalenciaConstantesFunciones.getArrayColumnasGlobalesNoPreguntaEquivalencia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PreguntaEquivalenciaConstantesFunciones.getArrayColumnasGlobalesPreguntaEquivalencia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PreguntaEquivalenciaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.preguntaequivalenciasEliminados= new ArrayList<PreguntaEquivalencia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPreguntaEquivalencia();
		
				///*PreguntaEquivalenciaSessionBean*/this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
			
			if(this.preguntaequivalenciaSessionBean==null) {
				this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
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
					this.iNumeroPaginacion=PreguntaEquivalenciaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PreguntaEquivalenciaConstantesFunciones.getClassesForeignKeysOfPreguntaEquivalencia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/preguntaequivalencia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			preguntaequivalenciasAux= new ArrayList<PreguntaEquivalencia>();
			
				
			preguntaequivalenciaLogic.setDatosCliente(this.datosCliente);
			preguntaequivalenciaLogic.setDatosDeep(this.datosDeep);
			preguntaequivalenciaLogic.setIsConDeep(true);
			
			
			preguntaequivalenciaLogic.getPreguntaEquivalenciaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					preguntaequivalenciaLogic.getTodosPreguntaEquivalencias(finalQueryGlobal,pagination);
					
					//preguntaequivalenciaLogic.getTodosPreguntaEquivalenciasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(preguntaequivalenciaLogic.getPreguntaEquivalencias()==null|| preguntaequivalenciaLogic.getPreguntaEquivalencias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preguntaequivalenciasAux= new ArrayList<PreguntaEquivalencia>();
							preguntaequivalenciasAux.addAll(preguntaequivalenciaLogic.getPreguntaEquivalencias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaequivalenciasAux= new ArrayList<PreguntaEquivalencia>();
							preguntaequivalenciasAux.addAll(preguntaequivalencias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preguntaequivalenciaLogic.getTodosPreguntaEquivalencias(finalQueryGlobal+"",this.pagination);												
							
							//preguntaequivalenciaLogic.getTodosPreguntaEquivalenciasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePreguntaEquivalencias("Todos",preguntaequivalenciaLogic.getPreguntaEquivalencias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							preguntaequivalenciaLogic.setPreguntaEquivalencias(new ArrayList<PreguntaEquivalencia>());					
							preguntaequivalenciaLogic.getPreguntaEquivalencias().addAll(preguntaequivalenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaequivalencias=new ArrayList<PreguntaEquivalencia>();
							preguntaequivalencias.addAll(preguntaequivalenciasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPreguntaEquivalencia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPreguntaEquivalencia=this.idActual;
				
				} else if(this.idPreguntaEquivalenciaActual!=null && this.idPreguntaEquivalenciaActual!=0L) {
					idPreguntaEquivalencia=idPreguntaEquivalenciaActual;
				}
				
					
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndicePorId(idPreguntaEquivalencia);
				
				this.preguntaequivalencias=new ArrayList<PreguntaEquivalencia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					preguntaequivalenciaLogic.getEntity(idPreguntaEquivalencia);
					
					//preguntaequivalenciaLogic.getEntityWithConnection(idPreguntaEquivalencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaequivalenciaLogic.setPreguntaEquivalencias(new ArrayList<PreguntaEquivalencia>());
					preguntaequivalenciaLogic.getPreguntaEquivalencias().add(preguntaequivalenciaLogic.getPreguntaEquivalencia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaequivalencias=new ArrayList<PreguntaEquivalencia>();
					this.preguntaequivalencias.add(preguntaequivalencia);
				}
				
				if(preguntaequivalenciaLogic.getPreguntaEquivalencia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo")) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					preguntaequivalenciaLogic.getPreguntaEquivalenciasBusquedaPorIdEjercicioPorIdPeriodo(finalQueryGlobal,pagination,id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=preguntaequivalenciaLogic.getPreguntaEquivalencias()==null||preguntaequivalenciaLogic.getPreguntaEquivalencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=preguntaequivalencias==null|| preguntaequivalencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciasAux=new ArrayList<PreguntaEquivalencia>();
						preguntaequivalenciasAux.addAll(preguntaequivalenciaLogic.getPreguntaEquivalencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaequivalenciasAux=new ArrayList<PreguntaEquivalencia>();
							preguntaequivalenciasAux.addAll(preguntaequivalencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							preguntaequivalenciaLogic.getPreguntaEquivalenciasBusquedaPorIdEjercicioPorIdPeriodo(finalQueryGlobal,pagination,id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceBusquedaPorIdEjercicioPorIdPeriodo(id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo,id_periodoBusquedaPorIdEjercicioPorIdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreguntaEquivalencias("BusquedaPorIdEjercicioPorIdPeriodo",preguntaequivalenciaLogic.getPreguntaEquivalencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreguntaEquivalencias("BusquedaPorIdEjercicioPorIdPeriodo",preguntaequivalencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciaLogic.setPreguntaEquivalencias(new ArrayList<PreguntaEquivalencia>());
						preguntaequivalenciaLogic.getPreguntaEquivalencias().addAll(preguntaequivalenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaequivalencias=new ArrayList<PreguntaEquivalencia>();
							preguntaequivalencias.addAll(preguntaequivalenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=preguntaequivalenciaLogic.getPreguntaEquivalencias()==null||preguntaequivalenciaLogic.getPreguntaEquivalencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=preguntaequivalencias==null|| preguntaequivalencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciasAux=new ArrayList<PreguntaEquivalencia>();
						preguntaequivalenciasAux.addAll(preguntaequivalenciaLogic.getPreguntaEquivalencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaequivalenciasAux=new ArrayList<PreguntaEquivalencia>();
							preguntaequivalenciasAux.addAll(preguntaequivalencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreguntaEquivalencias("FK_IdEmpresa",preguntaequivalenciaLogic.getPreguntaEquivalencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreguntaEquivalencias("FK_IdEmpresa",preguntaequivalencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciaLogic.setPreguntaEquivalencias(new ArrayList<PreguntaEquivalencia>());
						preguntaequivalenciaLogic.getPreguntaEquivalencias().addAll(preguntaequivalenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaequivalencias=new ArrayList<PreguntaEquivalencia>();
							preguntaequivalencias.addAll(preguntaequivalenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=preguntaequivalenciaLogic.getPreguntaEquivalencias()==null||preguntaequivalenciaLogic.getPreguntaEquivalencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=preguntaequivalencias==null|| preguntaequivalencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciasAux=new ArrayList<PreguntaEquivalencia>();
						preguntaequivalenciasAux.addAll(preguntaequivalenciaLogic.getPreguntaEquivalencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaequivalenciasAux=new ArrayList<PreguntaEquivalencia>();
							preguntaequivalenciasAux.addAll(preguntaequivalencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PreguntaEquivalenciaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePreguntaEquivalencias("FK_IdSucursal",preguntaequivalenciaLogic.getPreguntaEquivalencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePreguntaEquivalencias("FK_IdSucursal",preguntaequivalencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciaLogic.setPreguntaEquivalencias(new ArrayList<PreguntaEquivalencia>());
						preguntaequivalenciaLogic.getPreguntaEquivalencias().addAll(preguntaequivalenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaequivalencias=new ArrayList<PreguntaEquivalencia>();
							preguntaequivalencias.addAll(preguntaequivalenciasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPreguntaEquivalencia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPreguntaEquivalencia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=preguntaequivalenciaLogic.getPreguntaEquivalencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=preguntaequivalencias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=preguntaequivalenciaLogic.getPreguntaEquivalencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=preguntaequivalencias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PreguntaEquivalencia preguntaequivalencia) {
		Boolean permite=true;
		
		if(this.preguntaequivalencia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PreguntaEquivalenciaConstantesFunciones.getOrderByListaPreguntaEquivalencia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PreguntaEquivalenciaConstantesFunciones.getOrderByListaPreguntaEquivalencia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
				if(preguntaequivalencia.getsType().equals(Constantes2.S_TOTALES)) {
					preguntaequivalenciaTotales=preguntaequivalencia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEquivalencia preguntaequivalencia:this.preguntaequivalencias) {
				if(preguntaequivalencia.getsType().equals(Constantes2.S_TOTALES)) {
					preguntaequivalenciaTotales=preguntaequivalencia;
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
			this.preguntaequivalenciaAux=new PreguntaEquivalencia();
			this.preguntaequivalenciaAux.setsType(Constantes2.S_TOTALES);
			this.preguntaequivalenciaAux.setIsNew(false);
			this.preguntaequivalenciaAux.setIsChanged(false);
			this.preguntaequivalenciaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PreguntaEquivalenciaConstantesFunciones.TotalizarValoresFilaPreguntaEquivalencia(this.preguntaequivalenciaLogic.getPreguntaEquivalencias(),this.preguntaequivalenciaAux);
				
				this.preguntaequivalenciaLogic.getPreguntaEquivalencias().add(this.preguntaequivalenciaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PreguntaEquivalenciaConstantesFunciones.TotalizarValoresFilaPreguntaEquivalencia(this.preguntaequivalencias,this.preguntaequivalenciaAux);
				
				this.preguntaequivalencias.add(this.preguntaequivalenciaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		preguntaequivalenciaTotales=new PreguntaEquivalencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.preguntaequivalenciaLogic.getPreguntaEquivalencias().remove(preguntaequivalenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.preguntaequivalencias.remove(preguntaequivalenciaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		preguntaequivalenciaTotales=new PreguntaEquivalencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
				if(preguntaequivalencia.getsType().equals(Constantes2.S_TOTALES)) {
					preguntaequivalenciaTotales=preguntaequivalencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PreguntaEquivalenciaConstantesFunciones.TotalizarValoresFilaPreguntaEquivalencia(this.preguntaequivalenciaLogic.getPreguntaEquivalencias(),preguntaequivalenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PreguntaEquivalencia preguntaequivalencia:this.preguntaequivalencias) {
				if(preguntaequivalencia.getsType().equals(Constantes2.S_TOTALES)) {
					preguntaequivalenciaTotales=preguntaequivalencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PreguntaEquivalenciaConstantesFunciones.TotalizarValoresFilaPreguntaEquivalencia(this.preguntaequivalencias,preguntaequivalenciaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPreguntaEquivalenciasBusquedaPorIdEjercicioPorIdPeriodo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdEjercicioPorIdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEquivalenciasFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEquivalenciasFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEquivalenciasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEquivalenciasFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEquivalenciasFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPreguntaEquivalenciasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPreguntaEquivalenciasBusquedaPorIdEjercicioPorIdPeriodo(String sFinalQuery,Long id_ejercicio,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaequivalenciaLogic.getPreguntaEquivalenciasBusquedaPorIdEjercicioPorIdPeriodo(sFinalQuery,this.pagination,id_ejercicio,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEquivalenciasFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEquivalenciasFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEquivalenciasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEquivalenciasFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEquivalenciasFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPreguntaEquivalenciasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaequivalenciaLogic.getPreguntaEquivalenciasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosPreguntaEquivalencia() {
		this.isPermisoTodoPreguntaEquivalencia=false;
		this.isPermisoNuevoPreguntaEquivalencia=false;
		this.isPermisoActualizarPreguntaEquivalencia=false;
		this.isPermisoActualizarOriginalPreguntaEquivalencia=false;
		this.isPermisoEliminarPreguntaEquivalencia=false;
		this.isPermisoGuardarCambiosPreguntaEquivalencia=false;
		this.isPermisoConsultaPreguntaEquivalencia=false;
		this.isPermisoBusquedaPreguntaEquivalencia=false;
		this.isPermisoReportePreguntaEquivalencia=false;		
		this.isPermisoOrdenPreguntaEquivalencia=false;		
		this.isPermisoPaginacionMedioPreguntaEquivalencia=false;		
		this.isPermisoPaginacionAltoPreguntaEquivalencia=false;
		this.isPermisoPaginacionTodoPreguntaEquivalencia=false;
		this.isPermisoCopiarPreguntaEquivalencia=false;		
		this.isPermisoVerFormPreguntaEquivalencia=false;		
		this.isPermisoDuplicarPreguntaEquivalencia=false;		
		this.isPermisoOrdenPreguntaEquivalencia=false;		
	}
	
	public void setPermisosUsuarioPreguntaEquivalencia(Boolean isPermiso) {
		this.isPermisoTodoPreguntaEquivalencia=isPermiso;
		this.isPermisoNuevoPreguntaEquivalencia=isPermiso;
		this.isPermisoActualizarPreguntaEquivalencia=isPermiso;
		this.isPermisoActualizarOriginalPreguntaEquivalencia=isPermiso;
		this.isPermisoEliminarPreguntaEquivalencia=isPermiso;
		this.isPermisoGuardarCambiosPreguntaEquivalencia=isPermiso;
		this.isPermisoConsultaPreguntaEquivalencia=isPermiso;
		this.isPermisoBusquedaPreguntaEquivalencia=isPermiso;
		this.isPermisoReportePreguntaEquivalencia=isPermiso;
		this.isPermisoOrdenPreguntaEquivalencia=isPermiso;		
		this.isPermisoPaginacionMedioPreguntaEquivalencia=isPermiso;		
		this.isPermisoPaginacionAltoPreguntaEquivalencia=isPermiso;		
		this.isPermisoPaginacionTodoPreguntaEquivalencia=isPermiso;		
		this.isPermisoCopiarPreguntaEquivalencia=isPermiso;		
		this.isPermisoVerFormPreguntaEquivalencia=isPermiso;		
		this.isPermisoDuplicarPreguntaEquivalencia=isPermiso;
		this.isPermisoOrdenPreguntaEquivalencia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPreguntaEquivalencia(Boolean isPermiso) {
		//this.isPermisoTodoPreguntaEquivalencia=isPermiso;
		this.isPermisoNuevoPreguntaEquivalencia=isPermiso;
		this.isPermisoActualizarPreguntaEquivalencia=isPermiso;
		this.isPermisoActualizarOriginalPreguntaEquivalencia=isPermiso;
		this.isPermisoEliminarPreguntaEquivalencia=isPermiso;
		this.isPermisoGuardarCambiosPreguntaEquivalencia=isPermiso;
		//this.isPermisoConsultaPreguntaEquivalencia=isPermiso;
		//this.isPermisoBusquedaPreguntaEquivalencia=isPermiso;
		//this.isPermisoReportePreguntaEquivalencia=isPermiso;
		//this.isPermisoOrdenPreguntaEquivalencia=isPermiso;		
		//this.isPermisoPaginacionMedioPreguntaEquivalencia=isPermiso;		
		//this.isPermisoPaginacionAltoPreguntaEquivalencia=isPermiso;		
		//this.isPermisoPaginacionTodoPreguntaEquivalencia=isPermiso;		
		//this.isPermisoCopiarPreguntaEquivalencia=isPermiso;		
		//this.isPermisoDuplicarPreguntaEquivalencia=isPermiso;
		//this.isPermisoOrdenPreguntaEquivalencia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPreguntaEquivalenciaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PreguntaEquivalenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPreguntaEquivalencia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPreguntaEquivalenciaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPreguntaEquivalenciaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPreguntaEquivalenciaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPreguntaEquivalenciaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPreguntaEquivalencia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PreguntaEquivalenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PreguntaEquivalenciaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPreguntaEquivalencia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPreguntaEquivalencia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPreguntaEquivalencia=this.isPermisoActualizarPreguntaEquivalencia;
			this.isPermisoEliminarPreguntaEquivalencia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPreguntaEquivalencia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPreguntaEquivalencia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPreguntaEquivalencia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPreguntaEquivalencia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePreguntaEquivalencia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPreguntaEquivalencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPreguntaEquivalencia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPreguntaEquivalencia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPreguntaEquivalencia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPreguntaEquivalencia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPreguntaEquivalencia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPreguntaEquivalencia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPreguntaEquivalencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPreguntaEquivalencia.setToolTipText(this.jTableDatosPreguntaEquivalencia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPreguntaEquivalencia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPreguntaEquivalencia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PreguntaEquivalenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PreguntaEquivalenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPreguntaEquivalencia() throws Exception {
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
	public void inicializarCombosForeignKeyPreguntaEquivalenciaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPreguntaEquivalenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PreguntaEquivalenciaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPreguntaEquivalenciaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyPreguntaEquivalenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PreguntaEquivalenciaParameterReturnGeneral preguntaequivalenciaReturnGeneral=new PreguntaEquivalenciaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.preguntaequivalenciaConstantesFunciones.cargarid_empresaPreguntaEquivalencia)
					 || (this.esRecargarFks && this.preguntaequivalenciaConstantesFunciones.cargarid_empresaPreguntaEquivalencia)) {

					if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+preguntaequivalenciaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.preguntaequivalenciaConstantesFunciones.cargarid_sucursalPreguntaEquivalencia)
					 || (this.esRecargarFks && this.preguntaequivalenciaConstantesFunciones.cargarid_sucursalPreguntaEquivalencia)) {

					if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+preguntaequivalenciaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.preguntaequivalenciaConstantesFunciones.cargarid_ejercicioPreguntaEquivalencia)
					 || (this.esRecargarFks && this.preguntaequivalenciaConstantesFunciones.cargarid_ejercicioPreguntaEquivalencia)) {

					if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+preguntaequivalenciaSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.preguntaequivalenciaConstantesFunciones.cargarid_periodoPreguntaEquivalencia)
					 || (this.esRecargarFks && this.preguntaequivalenciaConstantesFunciones.cargarid_periodoPreguntaEquivalencia)) {

					if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+preguntaequivalenciaSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.preguntaequivalenciaConstantesFunciones.cargarid_anioPreguntaEquivalencia)
					 || (this.esRecargarFks && this.preguntaequivalenciaConstantesFunciones.cargarid_anioPreguntaEquivalencia)) {

					if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+preguntaequivalenciaSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.preguntaequivalenciaConstantesFunciones.cargarid_mesPreguntaEquivalencia)
					 || (this.esRecargarFks && this.preguntaequivalenciaConstantesFunciones.cargarid_mesPreguntaEquivalencia)) {

					if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+preguntaequivalenciaSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				preguntaequivalenciaReturnGeneral=preguntaequivalenciaLogic.cargarCombosLoteForeignKeyPreguntaEquivalencia(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=preguntaequivalenciaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=preguntaequivalenciaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=preguntaequivalenciaReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=preguntaequivalenciaReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=preguntaequivalenciaReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=preguntaequivalenciaReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPreguntaEquivalencia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.preguntaequivalenciaSessionBean==null) {
				this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
			}

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.preguntaequivalenciaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyPreguntaEquivalencia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPreguntaEquivalencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPreguntaEquivalencia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPreguntaEquivalencia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia)throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(preguntaequivalencia.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(preguntaequivalencia.getid_periodo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPreguntaEquivalencia()throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(this.preguntaequivalenciaConstantesFunciones.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(this.preguntaequivalenciaConstantesFunciones.getid_periodo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPreguntaEquivalencia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPreguntaEquivalencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPreguntaEquivalencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPreguntaEquivalencia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPreguntaEquivalencia()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPreguntaEquivalencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPreguntaEquivalencia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public PreguntaEquivalenciaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PreguntaEquivalenciaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PreguntaEquivalenciaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean(); 
		this.preguntaequivalenciaConstantesFunciones=new PreguntaEquivalenciaConstantesFunciones(); 
		this.preguntaequivalenciaBean=new PreguntaEquivalencia();//(this.preguntaequivalenciaConstantesFunciones); 		
		this.preguntaequivalenciaReturnGeneral=new PreguntaEquivalenciaParameterReturnGeneral(); 
		
		this.preguntaequivalenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.preguntaequivalenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PreguntaEquivalenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PreguntaEquivalenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PreguntaEquivalenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPreguntaEquivalencia(true);
			
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
			
			this.preguntaequivalenciaConstantesFunciones=new PreguntaEquivalenciaConstantesFunciones(); 
			this.preguntaequivalenciaBean=new PreguntaEquivalencia();//this.preguntaequivalenciaConstantesFunciones); 			
			this.preguntaequivalenciaReturnGeneral=new PreguntaEquivalenciaParameterReturnGeneral(); 
		
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Preguntas Equivalencia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.preguntaequivalencia=new PreguntaEquivalencia();
			this.preguntaequivalencias = new ArrayList<PreguntaEquivalencia>();
			this.preguntaequivalenciasAux = new ArrayList<PreguntaEquivalencia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic=new PreguntaEquivalenciaLogic();
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.preguntaequivalenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.preguntaequivalenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPreguntaEquivalencia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPreguntaEquivalencia);	
					}
					
					if(this.jInternalFrameImportacionPreguntaEquivalencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPreguntaEquivalencia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPreguntaEquivalencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPreguntaEquivalencia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPreguntaEquivalencia);
				this.jInternalFrameDetalleFormPreguntaEquivalencia.setVisible(false);
				this.jInternalFrameDetalleFormPreguntaEquivalencia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPreguntaEquivalencia);
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setVisible(false);
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPreguntaEquivalencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPreguntaEquivalencia);
					this.jInternalFrameImportacionPreguntaEquivalencia.setVisible(false);
					this.jInternalFrameImportacionPreguntaEquivalencia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPreguntaEquivalencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPreguntaEquivalencia);
					this.jInternalFrameOrderByPreguntaEquivalencia.setVisible(false);
					this.jInternalFrameOrderByPreguntaEquivalencia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPreguntaEquivalenciaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PreguntaEquivalenciaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.preguntaequivalenciaReturnGeneral=new PreguntaEquivalenciaParameterReturnGeneral();
			
			this.preguntaequivalenciaParameterGeneral=new PreguntaEquivalenciaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.preguntaequivalenciaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PreguntaEquivalenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PreguntaEquivalenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),this.preguntaequivalenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PreguntaEquivalenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),this.preguntaequivalenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=false;
			this.isVisibilidadCeldaDuplicarPreguntaEquivalencia=true;
			this.isVisibilidadCeldaCopiarPreguntaEquivalencia=true;
			this.isVisibilidadCeldaVerFormPreguntaEquivalencia=true;
			this.isVisibilidadCeldaOrdenPreguntaEquivalencia=true;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=false;
			
			
			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPreguntaEquivalencia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPreguntaEquivalencia(false);
			
			this.setPermisosUsuarioPreguntaEquivalencia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() 
				|| (this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado() && this.preguntaequivalenciaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPreguntaEquivalenciaClasesRelacionadas();
			}
			
			if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPreguntaEquivalenciaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPreguntaEquivalencia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPreguntaEquivalencia();
			}
			
			if(!this.isPermisoBusquedaPreguntaEquivalencia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPreguntaEquivalencia,this.isPermisoPaginacionMedioPreguntaEquivalencia,this.isPermisoPaginacionTodoPreguntaEquivalencia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PreguntaEquivalenciaConstantesFunciones.getTiposSeleccionarPreguntaEquivalencia());
				
				this.tiposColumnasSelect=PreguntaEquivalenciaConstantesFunciones.getTiposSeleccionarPreguntaEquivalencia(true);
				
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
			//if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPreguntaEquivalencia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPreguntaEquivalencia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPreguntaEquivalencia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaEquivalencia() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
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
				preguntaequivalenciaImplementable= (PreguntaEquivalenciaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PreguntaEquivalenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				preguntaequivalenciaImplementableHome= (PreguntaEquivalenciaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PreguntaEquivalenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.preguntaequivalencias= new ArrayList<PreguntaEquivalencia>();
			this.preguntaequivalenciasEliminados= new ArrayList<PreguntaEquivalencia>();
						
			this.isEsNuevoPreguntaEquivalencia=false;
			this.esParaAccionDesdeFormularioPreguntaEquivalencia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPreguntaEquivalencia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPreguntaEquivalencia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PreguntaEquivalenciaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPreguntaEquivalencia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPreguntaEquivalencia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPreguntaEquivalencia();
			}
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPreguntaEquivalencia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPreguntaEquivalencia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPreguntaEquivalencia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPreguntaEquivalencia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PreguntaEquivalencia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPreguntaEquivalencia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPreguntaEquivalencia")) {
				iIndex=this.jInternalFrameDetalleFormPreguntaEquivalencia.jTabbedPaneRelacionesPreguntaEquivalencia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPreguntaEquivalencia.jTabbedPaneRelacionesPreguntaEquivalencia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPreguntaEquivalencia();	
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
	
	public void cargarCombosForeignKeyPreguntaEquivalencia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPreguntaEquivalencia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPreguntaEquivalencia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPreguntaEquivalenciaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPreguntaEquivalencia();
		
		this.cargarCombosFrameForeignKeyPreguntaEquivalencia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPreguntaEquivalencia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPreguntaEquivalencia();
		}
	}
	
	

	public void cargarCombosForeignKeyEjercicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEjercicio(this.ejerciciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPeriodo(this.periodosForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoPreguntaEquivalenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
			
			if(jTableDatosPreguntaEquivalencia.getRowCount()>=1) {
				jTableDatosPreguntaEquivalencia.removeRowSelectionInterval(0, jTableDatosPreguntaEquivalencia.getRowCount()-1);						
			}
			
			this.isEsNuevoPreguntaEquivalencia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPreguntaEquivalencia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPreguntaEquivalencia(true);			
			//this.preguntaequivalencia=new PreguntaEquivalencia();
			//this.preguntaequivalencia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreguntaEquivalencia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaEquivalencia() ;
			
			if(PreguntaEquivalenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreguntaEquivalencia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.preguntaequivalencia);	
			this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);				
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
			if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PreguntaEquivalencia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPreguntaEquivalenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPreguntaEquivalencia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPreguntaEquivalencia.getSelectedRows().length;			
			}
			
			preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPreguntaEquivalencia--;			
				//PreguntaEquivalencia preguntaequivalenciaAux= new PreguntaEquivalencia();			
				//preguntaequivalenciaAux.setId(this.iIdNuevoPreguntaEquivalencia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PreguntaEquivalencia preguntaequivalenciaOrigen=new PreguntaEquivalencia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PreguntaEquivalencia preguntaequivalenciaOrigen : preguntaequivalenciasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							preguntaequivalenciaOrigen =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							preguntaequivalenciaOrigen =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPreguntaEquivalencia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.preguntaequivalencia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPreguntaEquivalencia(preguntaequivalenciaOrigen,this.preguntaequivalencia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.preguntaequivalenciaLogic.getPreguntaEquivalencias().add(this.preguntaequivalenciaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencias.add(this.preguntaequivalenciaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
				
				this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(this.getIndiceNuevoPreguntaEquivalencia(), this.getIndiceNuevoPreguntaEquivalencia());
				
				int iLastRow =  this.jTableDatosPreguntaEquivalencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPreguntaEquivalencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPreguntaEquivalencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();									
		
			PreguntaEquivalencia preguntaequivalenciaOrigen=new PreguntaEquivalencia();
			PreguntaEquivalencia preguntaequivalenciaDestino=new PreguntaEquivalencia();
				
			preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPreguntaEquivalencia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || preguntaequivalenciasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPreguntaEquivalencia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciaOrigen =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						preguntaequivalenciaOrigen =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						preguntaequivalenciaDestino =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						preguntaequivalenciaDestino =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				preguntaequivalenciaOrigen =preguntaequivalenciasSeleccionados.get(0);
				preguntaequivalenciaDestino =preguntaequivalenciasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPreguntaEquivalencia(preguntaequivalenciaOrigen,preguntaequivalenciaDestino,true,false);
				
				preguntaequivalenciaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(preguntaequivalenciaDestino,preguntaequivalenciaLogic.getPreguntaEquivalencias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(preguntaequivalenciaDestino,preguntaequivalencias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
				
				//this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(this.getIndiceNuevoPreguntaEquivalencia(), this.getIndiceNuevoPreguntaEquivalencia());
				
				int iLastRow =  this.jTableDatosPreguntaEquivalencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPreguntaEquivalencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPreguntaEquivalencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPreguntaEquivalencia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPreguntaEquivalencia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(!isVisible);
			this.jPanelPaginacionPreguntaEquivalencia.setVisible(!isVisible);
			this.jPanelAccionesPreguntaEquivalencia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePreguntaEquivalencia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPreguntaEquivalencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPreguntaEquivalencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPreguntaEquivalencia();
			
			this.abrirFrameOrderByPreguntaEquivalencia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPreguntaEquivalencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePreguntaEquivalencia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPreguntaEquivalencia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPreguntaEquivalencia.isMaximum()) {
					this.jInternalFrameDetalleFormPreguntaEquivalencia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPreguntaEquivalencia.setSize(this.jInternalFrameDetalleFormPreguntaEquivalencia.iWidthFormulario,this.jInternalFrameDetalleFormPreguntaEquivalencia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPreguntaEquivalencia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPreguntaEquivalencia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPreguntaEquivalencia.isMaximum()) {
						this.jInternalFrameDetalleFormPreguntaEquivalencia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jContentPaneDetallePreguntaEquivalencia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPreguntaEquivalencia.jTabbedPaneRelacionesPreguntaEquivalencia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPreguntaEquivalencia.jContentPaneDetallePreguntaEquivalencia.getWidth(),PreguntaEquivalenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPreguntaEquivalencia.jTabbedPaneRelacionesPreguntaEquivalencia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPreguntaEquivalencia.jContentPaneDetallePreguntaEquivalencia.getWidth(),PreguntaEquivalenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPreguntaEquivalencia.jTabbedPaneRelacionesPreguntaEquivalencia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPreguntaEquivalencia.jContentPaneDetallePreguntaEquivalencia.getWidth(),PreguntaEquivalenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPreguntaEquivalencia.setVisible(true);
	        this.jInternalFrameDetalleFormPreguntaEquivalencia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPreguntaEquivalencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPreguntaEquivalencia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPreguntaEquivalencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaEquivalencia,false,this);
				} else {
					this.jInternalFrameOrderByPreguntaEquivalencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPreguntaEquivalencia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPreguntaEquivalencia);
				this.jInternalFrameOrderByPreguntaEquivalencia.setVisible(false);
				this.jInternalFrameOrderByPreguntaEquivalencia.setSelected(false);
				
				this.jInternalFrameOrderByPreguntaEquivalencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPreguntaEquivalencia"));
				
				this.inicializarActualizarBindingTablaOrderByPreguntaEquivalencia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPreguntaEquivalencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPreguntaEquivalencia==null) {
				
				this.jInternalFrameImportacionPreguntaEquivalencia=new ImportacionJInternalFrame(PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPreguntaEquivalencia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPreguntaEquivalencia);
				this.jInternalFrameImportacionPreguntaEquivalencia.setVisible(false);
				this.jInternalFrameImportacionPreguntaEquivalencia.setSelected(false);


				this.jInternalFrameImportacionPreguntaEquivalencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPreguntaEquivalencia"));
				this.jInternalFrameImportacionPreguntaEquivalencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPreguntaEquivalencia"));
				this.jInternalFrameImportacionPreguntaEquivalencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPreguntaEquivalencia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPreguntaEquivalencia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia==null) {
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia=new ReporteDinamicoJInternalFrame(PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPreguntaEquivalencia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPreguntaEquivalencia);
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setVisible(false);
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreguntaEquivalencia"));
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreguntaEquivalencia"));
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreguntaEquivalencia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreguntaEquivalencia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePreguntaEquivalencia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPreguntaEquivalencia);
			
	       	this.jInternalFrameDetalleFormPreguntaEquivalencia.setVisible(false);
	        this.jInternalFrameDetalleFormPreguntaEquivalencia.setSelected(false);
			
			//this.jInternalFrameDetalleFormPreguntaEquivalencia.dispose();
			//this.jInternalFrameDetalleFormPreguntaEquivalencia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPreguntaEquivalencia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setVisible(true);
	        this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPreguntaEquivalencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPreguntaEquivalencia.setVisible(true);
	        this.jInternalFrameImportacionPreguntaEquivalencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPreguntaEquivalencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPreguntaEquivalencia.setVisible(true);
	        this.jInternalFrameOrderByPreguntaEquivalencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPreguntaEquivalencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPreguntaEquivalencia.setVisible(false);
	        this.jInternalFrameOrderByPreguntaEquivalencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPreguntaEquivalencia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setVisible(false);
	        this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPreguntaEquivalencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPreguntaEquivalencia.setVisible(false);
	        this.jInternalFrameImportacionPreguntaEquivalencia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPreguntaEquivalencia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPreguntaEquivalencia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPreguntaEquivalencia(true);
			//this.isEsNuevoPreguntaEquivalencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreguntaEquivalencia(false) ;
			
			if(preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PreguntaEquivalenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreguntaEquivalencia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaEquivalencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPreguntaEquivalenciaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPreguntaEquivalencia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPreguntaEquivalencia(true);
			//this.isEsNuevoPreguntaEquivalencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.preguntaequivalencia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPreguntaEquivalencia(false) ;
			
			if(PreguntaEquivalenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePreguntaEquivalencia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaEquivalencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEjercicio(List<Ejercicio> ejerciciosForeignKey)throws Exception{
		TableColumn tableColumnEjercicio=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO));
		TableCellEditor tableCellEditorEjercicio =tableColumnEjercicio.getCellEditor();

		EjercicioTableCell ejercicioTableCellFk=(EjercicioTableCell)tableCellEditorEjercicio;

		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.setejerciciosForeignKey(ejerciciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreguntaEquivalencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ejercicioTableCellFk.setRowActual(intSelectedRow);
			//ejercicioTableCellFk.setejerciciosForeignKeyActual(ejerciciosForeignKey);
		//}


		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.RecargarEjerciciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPeriodo(List<Periodo> periodosForeignKey)throws Exception{
		TableColumn tableColumnPeriodo=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO));
		TableCellEditor tableCellEditorPeriodo =tableColumnPeriodo.getCellEditor();

		PeriodoTableCell periodoTableCellFk=(PeriodoTableCell)tableCellEditorPeriodo;

		if(periodoTableCellFk!=null) {
			periodoTableCellFk.setperiodosForeignKey(periodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreguntaEquivalencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periodoTableCellFk.setRowActual(intSelectedRow);
			//periodoTableCellFk.setperiodosForeignKeyActual(periodosForeignKey);
		//}


		if(periodoTableCellFk!=null) {
			periodoTableCellFk.RecargarPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreguntaEquivalencia.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPreguntaEquivalencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPreguntaEquivalencia(false);
			
			//if(!this.isEsNuevoPreguntaEquivalencia) {								
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				
			}
			
			if(this.permiteMantenimiento(this.preguntaequivalencia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPreguntaEquivalencia=true;
					this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
					this.isEsNuevoPreguntaEquivalencia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPreguntaEquivalencia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPreguntaEquivalencia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPreguntaEquivalencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreguntaEquivalencia(false);
				
				this.habilitarDeshabilitarControlesPreguntaEquivalencia(false);
			
												
				
				if(PreguntaEquivalenciaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePreguntaEquivalencia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,preguntaequivalenciaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPreguntaEquivalencia(this.preguntaequivalencia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,preguntaequivalenciaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.preguntaequivalencia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				this.preguntaequivalencia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				this.preguntaequivalencia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.preguntaequivalencia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PreguntaEquivalenciaModel) this.jTableDatosPreguntaEquivalencia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPreguntaEquivalencia=true;
				this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
				this.isEsNuevoPreguntaEquivalencia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPreguntaEquivalencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreguntaEquivalencia(false);
				
				this.habilitarDeshabilitarControlesPreguntaEquivalencia(false);
				
				
				
				if(PreguntaEquivalenciaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePreguntaEquivalencia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPreguntaEquivalencia.getRowCount()>=1) {
				jTableDatosPreguntaEquivalencia.removeRowSelectionInterval(0, jTableDatosPreguntaEquivalencia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPreguntaEquivalencia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPreguntaEquivalencia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPreguntaEquivalencia(false) ;
			
			this.isEsNuevoPreguntaEquivalencia=false;
			
			if(PreguntaEquivalenciaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePreguntaEquivalencia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPreguntaEquivalencia(false);
				
				//SI ES MANUAL
				if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPreguntaEquivalencia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPreguntaEquivalencia--;			
			//PreguntaEquivalencia preguntaequivalenciaAux= new PreguntaEquivalencia();			
			//preguntaequivalenciaAux.setId(this.iIdNuevoPreguntaEquivalencia);
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPreguntaEquivalencia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
			
			this.preguntaequivalencia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.preguntaequivalenciaLogic.getPreguntaEquivalencias().add(this.preguntaequivalenciaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.preguntaequivalencias.add(this.preguntaequivalenciaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
			
			this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(this.getIndiceNuevoPreguntaEquivalencia(), this.getIndiceNuevoPreguntaEquivalencia());
			
			int iLastRow =  this.jTableDatosPreguntaEquivalencia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPreguntaEquivalencia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPreguntaEquivalencia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaEquivalencia(false);
			
			//SI ES MANUAL
			if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreguntaEquivalencia();
			}
			
			//this.abrirFrameTreePreguntaEquivalencia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Preguntas EquivalenciaS ?", "MANTENIMIENTO DE Preguntas Equivalencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPreguntaEquivalencia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPreguntaEquivalencia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.preguntaequivalenciaReturnGeneral=preguntaequivalenciaLogic.procesarImportacionPreguntaEquivalenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.preguntaequivalenciaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPreguntaEquivalenciaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPreguntaEquivalencia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPreguntaEquivalencia.setFileImportacion(this.jInternalFrameImportacionPreguntaEquivalencia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPreguntaEquivalencia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPreguntaEquivalencia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPreguntaEquivalencia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPreguntaEquivalencia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();		

		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PreguntaEquivalenciaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PreguntaEquivalenciaBaseDesign.jrxml";
			
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
			
			this.generarReportePreguntaEquivalencias("Todos",preguntaequivalenciasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES:
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
		
		if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE:
					sNombreCampoCategoria="desde";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA:
					sNombreCampoCategoria="hasta";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE:
					sNombreCampoCategoriaValor="desde";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA:
					sNombreCampoCategoriaValor="hasta";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"desde");
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hasta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hasta");
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES:
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
	
	public void jButtonGenerarExcelReporteDinamicoPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();		
		
		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaequivalencia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PreguntaEquivalencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.getdesde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.gethasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(PreguntaEquivalencia preguntaequivalencia:preguntaequivalenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(preguntaequivalencia.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelPreguntaEquivalencia(row);				
			//	iRow++;
			//}				
			
			//for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalenciasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPreguntaEquivalencia(preguntaequivalenciaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
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
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaEquivalencia(false);
			
			//SI ES MANUAL
			if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPreguntaEquivalencia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaEquivalencia(false);
			
			//SI ES MANUAL
			if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPreguntaEquivalencia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPreguntaEquivalencia(false);
			
			//SI ES MANUAL
			if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPreguntaEquivalencia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPreguntaEquivalencia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPreguntaEquivalencia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPreguntaEquivalencia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPreguntaEquivalencia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPreguntaEquivalencia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPreguntaEquivalencia.setMinimumSize(dimensionMinimum);
		this.jTableDatosPreguntaEquivalencia.setMaximumSize(dimensionMaximum);
		this.jTableDatosPreguntaEquivalencia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPreguntaEquivalencia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPreguntaEquivalencia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPreguntaEquivalencia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPreguntaEquivalencia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPreguntaEquivalencia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPreguntaEquivalencia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaEquivalencia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPreguntaEquivalencia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPreguntaEquivalencia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPreguntaEquivalencia();
		
		this.inicializarActualizarBindingBotonesManualPreguntaEquivalencia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPreguntaEquivalencia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaEquivalencia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPreguntaEquivalencia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPreguntaEquivalencia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPreguntaEquivalencia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPreguntaEquivalencia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePreguntaEquivalencia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPreguntaEquivalencia.jCheckBoxPostAccionNuevoPreguntaEquivalencia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPreguntaEquivalencia.jCheckBoxPostAccionSinCerrarPreguntaEquivalencia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPreguntaEquivalencia.jCheckBoxPostAccionSinMensajePreguntaEquivalencia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPreguntaEquivalencia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPreguntaEquivalencia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePreguntaEquivalencia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jCheckBoxPostAccionNuevoPreguntaEquivalencia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jCheckBoxPostAccionSinCerrarPreguntaEquivalencia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jCheckBoxPostAccionSinMensajePreguntaEquivalencia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPreguntaEquivalencia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPreguntaEquivalencia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPreguntaEquivalencia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPreguntaEquivalencia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPreguntaEquivalencia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPreguntaEquivalencia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPreguntaEquivalencia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPreguntaEquivalencia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPreguntaEquivalencia(Boolean esInicializar) throws Exception {
		try	{	
			if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPreguntaEquivalencia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPreguntaEquivalencia() throws Exception {
		try	{
			if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPreguntaEquivalencia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePreguntaEquivalencia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPreguntaEquivalencia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPreguntaEquivalencia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPreguntaEquivalencia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPreguntaEquivalencia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPreguntaEquivalencia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPreguntaEquivalencia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPreguntaEquivalencia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPreguntaEquivalencia.addItem(reporte);
			}
			
			
			if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPreguntaEquivalencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPreguntaEquivalencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPreguntaEquivalencia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPreguntaEquivalencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPreguntaEquivalencia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPreguntaEquivalencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPreguntaEquivalencia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPreguntaEquivalencia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPreguntaEquivalencia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreguntaEquivalencia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPreguntaEquivalencia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia!=null) {
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia!=null) {
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia!=null) {
				
				if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PreguntaEquivalenciaConstantesFunciones.getTiposSeleccionarPreguntaEquivalencia(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PreguntaEquivalenciaConstantesFunciones.getTiposSeleccionarPreguntaEquivalencia(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PreguntaEquivalenciaConstantesFunciones.getTiposSeleccionarPreguntaEquivalencia(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPreguntaEquivalencia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.getSelectedItem()!=null){this.id_ejercicioBusquedaPorIdEjercicioPorIdPeriodo=((Ejercicio)this.jComboBoxid_ejercicioBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.getSelectedItem()!=null){this.id_periodoBusquedaPorIdEjercicioPorIdPeriodo=((Periodo)this.jComboBoxid_periodoBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPreguntaEquivalencia(Boolean esInicializar) throws Exception {				
		if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPreguntaEquivalencia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPreguntaEquivalencia() throws Exception {
		this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPreguntaEquivalencia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPreguntaEquivalenciaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalenciaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPreguntaEquivalencia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=preguntaequivalenciaLogic.getPreguntaEquivalencias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=preguntaequivalencias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPreguntaEquivalencia.setModel(new PreguntaEquivalenciaModel(this.preguntaequivalenciaLogic.getPreguntaEquivalencias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPreguntaEquivalencia.setModel(new PreguntaEquivalenciaModel(this.preguntaequivalencias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPreguntaEquivalencia!=null && this.jInternalFrameOrderByPreguntaEquivalencia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPreguntaEquivalencia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO,preguntaequivalenciaConstantesFunciones.resaltarSeleccionarPreguntaEquivalencia,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PreguntaEquivalenciaConstantesFunciones.SCLASSWEBTITULO,preguntaequivalenciaConstantesFunciones.resaltarSeleccionarPreguntaEquivalencia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_ID));

		if(this.preguntaequivalenciaConstantesFunciones.mostraridPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.preguntaequivalenciaConstantesFunciones.resaltaridPreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activaridPreguntaEquivalencia,iSizeTabla,this,true,"idPreguntaEquivalencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntaequivalenciaConstantesFunciones.resaltaridPreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activaridPreguntaEquivalencia,this,true,"idPreguntaEquivalencia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.preguntaequivalenciaConstantesFunciones.mostrarid_empresaPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_empresaPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_empresaPreguntaEquivalencia,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_empresaPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_empresaPreguntaEquivalencia,false,"id_empresaPreguntaEquivalencia","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.preguntaequivalenciaConstantesFunciones.mostrarid_sucursalPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_sucursalPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_sucursalPreguntaEquivalencia,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_sucursalPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_sucursalPreguntaEquivalencia,false,"id_sucursalPreguntaEquivalencia","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.preguntaequivalenciaConstantesFunciones.mostrarid_ejercicioPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_ejercicioPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_ejercicioPreguntaEquivalencia,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_ejercicioPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_ejercicioPreguntaEquivalencia,true,"id_ejercicioPreguntaEquivalencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO));

		if(this.preguntaequivalenciaConstantesFunciones.mostrarid_periodoPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_periodoPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_periodoPreguntaEquivalencia,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_periodoPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_periodoPreguntaEquivalencia,true,"id_periodoPreguntaEquivalencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.preguntaequivalenciaConstantesFunciones.mostrardescripcionPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.preguntaequivalenciaConstantesFunciones.resaltardescripcionPreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activardescripcionPreguntaEquivalencia,iSizeTabla,this,true,"descripcionPreguntaEquivalencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntaequivalenciaConstantesFunciones.resaltardescripcionPreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activardescripcionPreguntaEquivalencia,this,true,"descripcionPreguntaEquivalencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE));

		if(this.preguntaequivalenciaConstantesFunciones.mostrardesdePreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.preguntaequivalenciaConstantesFunciones.resaltardesdePreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activardesdePreguntaEquivalencia,iSizeTabla,this,true,"desdePreguntaEquivalencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntaequivalenciaConstantesFunciones.resaltardesdePreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activardesdePreguntaEquivalencia,this,true,"desdePreguntaEquivalencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA));

		if(this.preguntaequivalenciaConstantesFunciones.mostrarhastaPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.preguntaequivalenciaConstantesFunciones.resaltarhastaPreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activarhastaPreguntaEquivalencia,iSizeTabla,this,true,"hastaPreguntaEquivalencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntaequivalenciaConstantesFunciones.resaltarhastaPreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activarhastaPreguntaEquivalencia,this,true,"hastaPreguntaEquivalencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN));

		if(this.preguntaequivalenciaConstantesFunciones.mostrarordenPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.preguntaequivalenciaConstantesFunciones.resaltarordenPreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activarordenPreguntaEquivalencia,iSizeTabla,this,true,"ordenPreguntaEquivalencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.preguntaequivalenciaConstantesFunciones.resaltarordenPreguntaEquivalencia,this.preguntaequivalenciaConstantesFunciones.activarordenPreguntaEquivalencia,this,true,"ordenPreguntaEquivalencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO));

		if(this.preguntaequivalenciaConstantesFunciones.mostrarid_anioPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_anioPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_anioPreguntaEquivalencia,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_anioPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_anioPreguntaEquivalencia,true,"id_anioPreguntaEquivalencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES));

		if(this.preguntaequivalenciaConstantesFunciones.mostrarid_mesPreguntaEquivalencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_mesPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_mesPreguntaEquivalencia,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.preguntaequivalenciaConstantesFunciones.resaltarid_mesPreguntaEquivalencia,this,this.preguntaequivalenciaConstantesFunciones.activarid_mesPreguntaEquivalencia,true,"id_mesPreguntaEquivalencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PreguntaEquivalenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPreguntaEquivalencia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPreguntaEquivalencia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPreguntaEquivalencia.addColumn(tableColumn);
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
			
			this.jTableDatosPreguntaEquivalencia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPreguntaEquivalencia.moveColumn(this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPreguntaEquivalencia.moveColumn(this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPreguntaEquivalencia.moveColumn(this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPreguntaEquivalencia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPreguntaEquivalencia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPreguntaEquivalencia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPreguntaEquivalencia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPreguntaEquivalencia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPreguntaEquivalencia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=preguntaequivalenciaLogic.getPreguntaEquivalencias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=preguntaequivalencias.size()-1;
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
		//this.jTableDatosPreguntaEquivalencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPreguntaEquivalencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPreguntaEquivalencia();
			
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
				
				//this.isEsNuevoPreguntaEquivalencia=false;
					
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
				if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPreguntaEquivalencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPreguntaEquivalencia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.preguntaequivalencia.getsType().equals("DUPLICADO")
				   || this.preguntaequivalencia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPreguntaEquivalencia=true;
				
				} else {
					this.isEsNuevoPreguntaEquivalencia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
					if(this.preguntaequivalencia.getId()>=0 && !this.preguntaequivalencia.getIsNew()) {						
						this.isEsNuevoPreguntaEquivalencia=false;
						
					} else {
						this.isEsNuevoPreguntaEquivalencia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPreguntaEquivalencia(esRelaciones);						
				
				this.seleccionarPreguntaEquivalencia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.preguntaequivalencia.getId()<0) {
					this.isEsNuevoPreguntaEquivalencia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPreguntaEquivalencia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPreguntaEquivalencia(evt,rowIndex);
				}	
				
				if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PreguntaEquivalencia: " + this.dDif); 
					}
				}								
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPreguntaEquivalencia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.preguntaequivalencia)) {
					if(this.preguntaequivalencia.getId()>0) {
						this.preguntaequivalencia.setIsDeleted(true);
						
						this.preguntaequivalenciasEliminados.add(this.preguntaequivalencia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.preguntaequivalenciaLogic.getPreguntaEquivalencias().remove(this.preguntaequivalencia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencias.remove(this.preguntaequivalencia);				
					}
					
					
					((PreguntaEquivalenciaModel) this.jTableDatosPreguntaEquivalencia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPreguntaEquivalencia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPreguntaEquivalencia) {
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPreguntaEquivalencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPreguntaEquivalencia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPreguntaEquivalencia(this.preguntaequivalencia);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.preguntaequivalenciaConstantesFunciones.cargarid_empresaPreguntaEquivalencia || this.preguntaequivalenciaConstantesFunciones.event_dependid_empresaPreguntaEquivalencia) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.preguntaequivalencia.getid_empresa());
									//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(preguntaequivalencia.getEmpresa()!=null) {
							this.empresasForeignKey.add(preguntaequivalencia.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.preguntaequivalencia.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.preguntaequivalenciaConstantesFunciones.cargarid_sucursalPreguntaEquivalencia || this.preguntaequivalenciaConstantesFunciones.event_dependid_sucursalPreguntaEquivalencia) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.preguntaequivalencia.getid_sucursal());
									//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(preguntaequivalencia.getSucursal()!=null) {
							this.sucursalsForeignKey.add(preguntaequivalencia.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.preguntaequivalencia.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.preguntaequivalenciaConstantesFunciones.cargarid_ejercicioPreguntaEquivalencia || this.preguntaequivalenciaConstantesFunciones.event_dependid_ejercicioPreguntaEquivalencia) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.preguntaequivalencia.getid_ejercicio());
									//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(preguntaequivalencia.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(preguntaequivalencia.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.preguntaequivalencia.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.preguntaequivalenciaConstantesFunciones.cargarid_periodoPreguntaEquivalencia || this.preguntaequivalenciaConstantesFunciones.event_dependid_periodoPreguntaEquivalencia) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.preguntaequivalencia.getid_periodo());
									//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(preguntaequivalencia.getPeriodo()!=null) {
							this.periodosForeignKey.add(preguntaequivalencia.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.preguntaequivalencia.getid_periodo(),false,"Formulario");

					//Anio
					if(!this.preguntaequivalenciaConstantesFunciones.cargarid_anioPreguntaEquivalencia || this.preguntaequivalenciaConstantesFunciones.event_dependid_anioPreguntaEquivalencia) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.preguntaequivalencia.getid_anio());
									//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(preguntaequivalencia.getAnio()!=null) {
							this.aniosForeignKey.add(preguntaequivalencia.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.preguntaequivalencia.getid_anio(),false,"Formulario");

					//Mes
					if(!this.preguntaequivalenciaConstantesFunciones.cargarid_mesPreguntaEquivalencia || this.preguntaequivalenciaConstantesFunciones.event_dependid_mesPreguntaEquivalencia) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.preguntaequivalencia.getid_mes());
									//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(preguntaequivalencia.getMes()!=null) {
							this.messForeignKey.add(preguntaequivalencia.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.preguntaequivalencia.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPreguntaEquivalencia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPreguntaEquivalencia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPreguntaEquivalencia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPreguntaEquivalencia(preguntaequivalencia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPreguntaEquivalencia(preguntaequivalencia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPreguntaEquivalencia(preguntaequivalencia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPreguntaEquivalencia(preguntaequivalencia);
	}
	
	public void setVariablesObjetoActualToFormularioPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.setText(preguntaequivalencia.getId().toString());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextAreadescripcionPreguntaEquivalencia.setText(preguntaequivalencia.getdescripcion());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFielddesdePreguntaEquivalencia.setText(preguntaequivalencia.getdesde().toString());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldhastaPreguntaEquivalencia.setText(preguntaequivalencia.gethasta().toString());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldordenPreguntaEquivalencia.setText(preguntaequivalencia.getorden().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PreguntaEquivalencia preguntaequivalenciaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,preguntaequivalenciaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PreguntaEquivalencia preguntaequivalenciaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				preguntaequivalenciaLocal=this.preguntaequivalencia;
			} else {
				preguntaequivalenciaLocal=this.preguntaequivalenciaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(preguntaequivalenciaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPreguntaEquivalencia(preguntaequivalenciaLocal,true);
					
					if(preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(preguntaequivalenciaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(preguntaequivalenciaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(preguntaequivalencia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(preguntaequivalencia);
	}
	
	public void setVariablesFormularioToObjetoActualPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(preguntaequivalencia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.getText()==null || this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.getText()=="" || this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.getText()=="Id") {
				this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.setText("0");
			}

			if(conColumnasBase) {preguntaequivalencia.setId(Long.parseLong(this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaEquivalenciaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelIdPreguntaEquivalencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			preguntaequivalencia.setdescripcion(this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextAreadescripcionPreguntaEquivalencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabeldescripcionPreguntaEquivalencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			preguntaequivalencia.setdesde(Double.parseDouble(this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFielddesdePreguntaEquivalencia.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabeldesdePreguntaEquivalencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			preguntaequivalencia.sethasta(Double.parseDouble(this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldhastaPreguntaEquivalencia.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelhastaPreguntaEquivalencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			preguntaequivalencia.setorden(Integer.parseInt(this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldordenPreguntaEquivalencia.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelordenPreguntaEquivalencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalenciaBean,PreguntaEquivalencia preguntaequivalencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalenciaOrigen,PreguntaEquivalencia preguntaequivalencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && preguntaequivalenciaOrigen.getId()!=null && !preguntaequivalenciaOrigen.getId().equals(0L))) {preguntaequivalencia.setId(preguntaequivalenciaOrigen.getId());}}
			if(conDefault || (!conDefault && preguntaequivalenciaOrigen.getdescripcion()!=null && !preguntaequivalenciaOrigen.getdescripcion().equals(""))) {preguntaequivalencia.setdescripcion(preguntaequivalenciaOrigen.getdescripcion());}
			if(conDefault || (!conDefault && preguntaequivalenciaOrigen.getdesde()!=null && !preguntaequivalenciaOrigen.getdesde().equals(0.0))) {preguntaequivalencia.setdesde(preguntaequivalenciaOrigen.getdesde());}
			if(conDefault || (!conDefault && preguntaequivalenciaOrigen.gethasta()!=null && !preguntaequivalenciaOrigen.gethasta().equals(0.0))) {preguntaequivalencia.sethasta(preguntaequivalenciaOrigen.gethasta());}
			if(conDefault || (!conDefault && preguntaequivalenciaOrigen.getorden()!=null && !preguntaequivalenciaOrigen.getorden().equals(0))) {preguntaequivalencia.setorden(preguntaequivalenciaOrigen.getorden());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.setText(preguntaequivalencia.getId().toString());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextAreadescripcionPreguntaEquivalencia.setText(preguntaequivalencia.getdescripcion());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFielddesdePreguntaEquivalencia.setText(preguntaequivalencia.getdesde().toString());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldhastaPreguntaEquivalencia.setText(preguntaequivalencia.gethasta().toString());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldordenPreguntaEquivalencia.setText(preguntaequivalencia.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPreguntaEquivalencia(PreguntaEquivalenciaBean preguntaequivalenciaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.setText(preguntaequivalenciaBean.getId().toString());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextAreadescripcionPreguntaEquivalencia.setText(preguntaequivalenciaBean.getdescripcion());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFielddesdePreguntaEquivalencia.setText(preguntaequivalenciaBean.getdesde().toString());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldhastaPreguntaEquivalencia.setText(preguntaequivalenciaBean.gethasta().toString());
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldordenPreguntaEquivalencia.setText(preguntaequivalenciaBean.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPreguntaEquivalencia(PreguntaEquivalenciaParameterReturnGeneral preguntaequivalenciaReturnGeneral,PreguntaEquivalenciaBean preguntaequivalenciaBean,Boolean conDefault) throws Exception { 
		try {
			PreguntaEquivalencia preguntaequivalenciaLocal=new PreguntaEquivalencia();
			
			preguntaequivalenciaLocal=preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && preguntaequivalenciaLocal.getId()!=null && !preguntaequivalenciaLocal.getId().equals(0L))) {preguntaequivalenciaBean.setId(preguntaequivalenciaLocal.getId());}}
			if(conDefault || (!conDefault && preguntaequivalenciaLocal.getdescripcion()!=null && !preguntaequivalenciaLocal.getdescripcion().equals(""))) {preguntaequivalenciaBean.setdescripcion(preguntaequivalenciaLocal.getdescripcion());}
			if(conDefault || (!conDefault && preguntaequivalenciaLocal.getdesde()!=null && !preguntaequivalenciaLocal.getdesde().equals(0.0))) {preguntaequivalenciaBean.setdesde(preguntaequivalenciaLocal.getdesde());}
			if(conDefault || (!conDefault && preguntaequivalenciaLocal.gethasta()!=null && !preguntaequivalenciaLocal.gethasta().equals(0.0))) {preguntaequivalenciaBean.sethasta(preguntaequivalenciaLocal.gethasta());}
			if(conDefault || (!conDefault && preguntaequivalenciaLocal.getorden()!=null && !preguntaequivalenciaLocal.getorden().equals(0))) {preguntaequivalenciaBean.setorden(preguntaequivalenciaLocal.getorden());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPreguntaEquivalenciaGenerico(Long idPreguntaEquivalenciaSeleccionado,JComboBox jComboBoxPreguntaEquivalencia,List<PreguntaEquivalencia> preguntaequivalenciasLocal)throws Exception {
		try {
			PreguntaEquivalencia  preguntaequivalenciaTemp=null;

			for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalenciasLocal) {
				if(preguntaequivalenciaAux.getId()!=null && preguntaequivalenciaAux.getId().equals(idPreguntaEquivalenciaSeleccionado)) {
					preguntaequivalenciaTemp=preguntaequivalenciaAux;
					break;
				}
			}

			jComboBoxPreguntaEquivalencia.setSelectedItem(preguntaequivalenciaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPreguntaEquivalenciaGenerico(JComboBox jComboBoxPreguntaEquivalencia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPreguntaEquivalencia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPreguntaEquivalencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPreguntaEquivalencia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPreguntaEquivalencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPreguntaEquivalencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPreguntaEquivalencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			preguntaequivalencia=(PreguntaEquivalencia) preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			preguntaequivalencia =(PreguntaEquivalencia) preguntaequivalencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!preguntaequivalencia.getIsNew() && !preguntaequivalencia.getIsChanged() && !preguntaequivalencia.getIsDeleted()) {
				sDescripcion=preguntaequivalencia.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaequivalencia.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!preguntaequivalencia.getIsNew() && !preguntaequivalencia.getIsChanged() && !preguntaequivalencia.getIsDeleted()) {
				sDescripcion=preguntaequivalencia.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaequivalencia.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!preguntaequivalencia.getIsNew() && !preguntaequivalencia.getIsChanged() && !preguntaequivalencia.getIsDeleted()) {
				sDescripcion=preguntaequivalencia.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaequivalencia.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!preguntaequivalencia.getIsNew() && !preguntaequivalencia.getIsChanged() && !preguntaequivalencia.getIsDeleted()) {
				sDescripcion=preguntaequivalencia.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaequivalencia.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!preguntaequivalencia.getIsNew() && !preguntaequivalencia.getIsChanged() && !preguntaequivalencia.getIsDeleted()) {
				sDescripcion=preguntaequivalencia.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaequivalencia.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!preguntaequivalencia.getIsNew() && !preguntaequivalencia.getIsChanged() && !preguntaequivalencia.getIsDeleted()) {
				sDescripcion=preguntaequivalencia.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=preguntaequivalencia.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PreguntaEquivalencia preguntaequivalenciaRow=new PreguntaEquivalencia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			preguntaequivalenciaRow=(PreguntaEquivalencia) preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			preguntaequivalenciaRow=(PreguntaEquivalencia) preguntaequivalencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPreguntaEquivalencia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaNuevoPreguntaEquivalencia && this.isPermisoNuevoPreguntaEquivalencia));			
			this.jButtonDuplicarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaDuplicarPreguntaEquivalencia && this.isPermisoDuplicarPreguntaEquivalencia));			
			this.jButtonCopiarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaCopiarPreguntaEquivalencia && this.isPermisoCopiarPreguntaEquivalencia));
			this.jButtonVerFormPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaVerFormPreguntaEquivalencia && this.isPermisoVerFormPreguntaEquivalencia));
			
			this.jButtonAbrirOrderByPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaOrdenPreguntaEquivalencia && this.isPermisoOrdenPreguntaEquivalencia));			
			
			this.jButtonNuevoRelacionesPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia && this.isPermisoNuevoPreguntaEquivalencia));			
			this.jButtonNuevoGuardarCambiosPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaNuevoPreguntaEquivalencia && this.isPermisoNuevoPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonModificarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaModificarPreguntaEquivalencia && this.isPermisoActualizarPreguntaEquivalencia));	
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaActualizarPreguntaEquivalencia && this.isPermisoActualizarPreguntaEquivalencia));	
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaEliminarPreguntaEquivalencia && this.isPermisoEliminarPreguntaEquivalencia));
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarPreguntaEquivalencia.setVisible(this.isVisibilidadCeldaCancelarPreguntaEquivalencia);							
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaGuardarPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));			
			
			}
						
			this.jButtonGuardarCambiosTablaPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaNuevoPreguntaEquivalencia && this.isPermisoNuevoPreguntaEquivalencia));						
			this.jButtonDuplicarToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaDuplicarPreguntaEquivalencia && this.isPermisoDuplicarPreguntaEquivalencia));						
			this.jButtonCopiarToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaCopiarPreguntaEquivalencia && this.isPermisoCopiarPreguntaEquivalencia));			
			this.jButtonVerFormToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaVerFormPreguntaEquivalencia && this.isPermisoVerFormPreguntaEquivalencia));			
			this.jButtonAbrirOrderByToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaOrdenPreguntaEquivalencia && this.isPermisoOrdenPreguntaEquivalencia));
			this.jButtonNuevoRelacionesToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia && this.isPermisoNuevoPreguntaEquivalencia));			
			this.jButtonNuevoGuardarCambiosToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaNuevoPreguntaEquivalencia && this.isPermisoNuevoPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));			
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonModificarToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaModificarPreguntaEquivalencia && this.isPermisoActualizarPreguntaEquivalencia));	
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaActualizarPreguntaEquivalencia  && this.isPermisoActualizarPreguntaEquivalencia));	
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaEliminarPreguntaEquivalencia && this.isPermisoEliminarPreguntaEquivalencia));
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarToolBarPreguntaEquivalencia.setVisible(this.isVisibilidadCeldaCancelarPreguntaEquivalencia);				
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaGuardarPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaNuevoPreguntaEquivalencia && this.isPermisoNuevoPreguntaEquivalencia));			
			this.jMenuItemDuplicarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaDuplicarPreguntaEquivalencia && this.isPermisoDuplicarPreguntaEquivalencia));			
			this.jMenuItemCopiarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaCopiarPreguntaEquivalencia && this.isPermisoCopiarPreguntaEquivalencia));			
			this.jMenuItemVerFormPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaVerFormPreguntaEquivalencia && this.isPermisoVerFormPreguntaEquivalencia));			
			this.jMenuItemAbrirOrderByPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaOrdenPreguntaEquivalencia && this.isPermisoOrdenPreguntaEquivalencia));			
			//this.jMenuItemMostrarOcultarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaOrdenPreguntaEquivalencia && this.isPermisoOrdenPreguntaEquivalencia));
			this.jMenuItemDetalleAbrirOrderByPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaOrdenPreguntaEquivalencia && this.isPermisoOrdenPreguntaEquivalencia));			
			//this.jMenuItemDetalleMostrarOcultarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaOrdenPreguntaEquivalencia && this.isPermisoOrdenPreguntaEquivalencia));			
			this.jMenuItemNuevoRelacionesPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia && this.isPermisoNuevoPreguntaEquivalencia));			
			this.jMenuItemNuevoGuardarCambiosPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaNuevoPreguntaEquivalencia && this.isPermisoNuevoPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));									
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemModificarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaModificarPreguntaEquivalencia && this.isPermisoActualizarPreguntaEquivalencia));	
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemActualizarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaActualizarPreguntaEquivalencia && this.isPermisoActualizarPreguntaEquivalencia));	
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemEliminarPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaEliminarPreguntaEquivalencia && this.isPermisoEliminarPreguntaEquivalencia));
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemCancelarPreguntaEquivalencia.setVisible(this.isVisibilidadCeldaCancelarPreguntaEquivalencia);				
			}
			
			this.jMenuItemGuardarCambiosPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaGuardarPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));						
			this.jMenuItemGuardarCambiosTablaPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=this.jButtonNuevoPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaDuplicarPreguntaEquivalencia=this.jButtonDuplicarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaCopiarPreguntaEquivalencia=this.jButtonCopiarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaVerFormPreguntaEquivalencia=this.jButtonVerFormPreguntaEquivalencia.isVisible();
			
			this.isVisibilidadCeldaOrdenPreguntaEquivalencia=this.jButtonAbrirOrderByPreguntaEquivalencia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=this.jButtonNuevoRelacionesPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=this.jButtonModificarPreguntaEquivalencia.isVisible();
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaGuardarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosPreguntaEquivalencia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=this.jButtonGuardarCambiosTablaPreguntaEquivalencia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=this.jButtonNuevoToolBarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=this.jButtonNuevoRelacionesToolBarPreguntaEquivalencia.isVisible();
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonModificarToolBarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarToolBarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarToolBarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarToolBarPreguntaEquivalencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPreguntaEquivalencia=this.jButtonGuardarCambiosToolBarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=this.jButtonGuardarCambiosTablaToolBarPreguntaEquivalencia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=this.jMenuItemNuevoPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=this.jMenuItemNuevoRelacionesPreguntaEquivalencia.isVisible();
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemModificarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemActualizarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemEliminarPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemCancelarPreguntaEquivalencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPreguntaEquivalencia=this.jMenuItemGuardarCambiosPreguntaEquivalencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=this.jMenuItemGuardarCambiosTablaPreguntaEquivalencia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPreguntaEquivalencia(Boolean esInicializar) {
		if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
				//if(this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPreguntaEquivalencia();
			}
			
			this.inicializarActualizarBindingBotonesManualPreguntaEquivalencia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPreguntaEquivalencia() {
		this.jButtonNuevoPreguntaEquivalencia.setVisible(this.isPermisoNuevoPreguntaEquivalencia);			
		this.jButtonDuplicarPreguntaEquivalencia.setVisible(this.isPermisoDuplicarPreguntaEquivalencia);			
		this.jButtonCopiarPreguntaEquivalencia.setVisible(this.isPermisoCopiarPreguntaEquivalencia);			
		this.jButtonVerFormPreguntaEquivalencia.setVisible(this.isPermisoVerFormPreguntaEquivalencia);			
		
		this.jButtonAbrirOrderByPreguntaEquivalencia.setVisible(this.isPermisoOrdenPreguntaEquivalencia);					
		
		this.jButtonNuevoRelacionesPreguntaEquivalencia.setVisible(this.isPermisoNuevoPreguntaEquivalencia);			
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonModificarPreguntaEquivalencia.setVisible(this.isPermisoActualizarPreguntaEquivalencia);	
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarPreguntaEquivalencia.setVisible(this.isPermisoActualizarPreguntaEquivalencia);	
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarPreguntaEquivalencia.setVisible(this.isPermisoEliminarPreguntaEquivalencia);
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarPreguntaEquivalencia.setVisible(this.isVisibilidadCeldaCancelarPreguntaEquivalencia);						
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosPreguntaEquivalencia.setVisible(this.isPermisoGuardarCambiosPreguntaEquivalencia);							
		}
		
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia.setVisible(this.isPermisoActualizarPreguntaEquivalencia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePreguntaEquivalencia() {
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonModificarPreguntaEquivalencia.setVisible(this.isPermisoActualizarPreguntaEquivalencia);	
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarPreguntaEquivalencia.setVisible(this.isPermisoActualizarPreguntaEquivalencia);	
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarPreguntaEquivalencia.setVisible(this.isPermisoEliminarPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarPreguntaEquivalencia.setVisible(this.isVisibilidadCeldaCancelarPreguntaEquivalencia);							
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosPreguntaEquivalencia.setVisible((this.isVisibilidadCeldaGuardarPreguntaEquivalencia && this.isPermisoGuardarCambiosPreguntaEquivalencia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPreguntaEquivalencia() {
		if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPreguntaEquivalencia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPreguntaEquivalencia() {
	}
	
	public void jTableDatosPreguntaEquivalenciaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPreguntaEquivalencia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.preguntaequivalencia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPreguntaEquivalenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPreguntaEquivalencia(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEquivalencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.preguntaequivalenciaLogic.getConnexion());

				if(this.preguntaequivalencia.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.preguntaequivalencia.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEquivalencia=(TitledBorder)this.jScrollPanelDatosPreguntaEquivalencia.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPreguntaEquivalencia.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.preguntaequivalencia.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPreguntaEquivalenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPreguntaEquivalencia(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEquivalencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.preguntaequivalenciaLogic.getConnexion());

				if(this.preguntaequivalencia.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.preguntaequivalencia.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEquivalencia=(TitledBorder)this.jScrollPanelDatosPreguntaEquivalencia.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPreguntaEquivalencia.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.preguntaequivalencia.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPreguntaEquivalenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPreguntaEquivalencia(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEquivalencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.preguntaequivalenciaLogic.getConnexion());

				if(this.preguntaequivalencia.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.preguntaequivalencia.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEquivalencia=(TitledBorder)this.jScrollPanelDatosPreguntaEquivalencia.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPreguntaEquivalencia.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.preguntaequivalencia.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPreguntaEquivalenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPreguntaEquivalencia(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEquivalencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.preguntaequivalenciaLogic.getConnexion());

				if(this.preguntaequivalencia.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.preguntaequivalencia.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEquivalencia=(TitledBorder)this.jScrollPanelDatosPreguntaEquivalencia.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPreguntaEquivalencia.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.preguntaequivalencia.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.preguntaequivalencia.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondesdePreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getdesde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where desde = "+this.preguntaequivalencia.getdesde().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhastaPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.gethasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hasta = "+this.preguntaequivalencia.gethasta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.preguntaequivalencia.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioPreguntaEquivalenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebPreguntaEquivalencia(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEquivalencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.preguntaequivalenciaLogic.getConnexion());

				if(this.preguntaequivalencia.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.preguntaequivalencia.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEquivalencia=(TitledBorder)this.jScrollPanelDatosPreguntaEquivalencia.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderPreguntaEquivalencia.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.preguntaequivalencia.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesPreguntaEquivalenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebPreguntaEquivalencia(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPreguntaEquivalencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPreguntaEquivalencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.preguntaequivalenciaLogic.getConnexion());

				if(this.preguntaequivalencia.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.preguntaequivalencia.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPreguntaEquivalencia=(TitledBorder)this.jScrollPanelDatosPreguntaEquivalencia.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderPreguntaEquivalencia.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesPreguntaEquivalenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.getpreguntaequivalencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.preguntaequivalencia==null) {
						this.preguntaequivalencia = new PreguntaEquivalencia();
					}

					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);
				}

				if(this.preguntaequivalencia.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.preguntaequivalencia.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPreguntaEquivalencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);

			this.getPreguntaEquivalenciasBusquedaPorIdEjercicioPorIdPeriodo();

			this.inicializarActualizarBindingPreguntaEquivalencia(false);

			//if(PreguntaEquivalenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);

			this.getPreguntaEquivalenciasFK_IdAnio();

			this.inicializarActualizarBindingPreguntaEquivalencia(false);

			//if(PreguntaEquivalenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);

			this.getPreguntaEquivalenciasFK_IdEjercicio();

			this.inicializarActualizarBindingPreguntaEquivalencia(false);

			//if(PreguntaEquivalenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);

			this.getPreguntaEquivalenciasFK_IdEmpresa();

			this.inicializarActualizarBindingPreguntaEquivalencia(false);

			//if(PreguntaEquivalenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);

			this.getPreguntaEquivalenciasFK_IdMes();

			this.inicializarActualizarBindingPreguntaEquivalencia(false);

			//if(PreguntaEquivalenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);

			this.getPreguntaEquivalenciasFK_IdPeriodo();

			this.inicializarActualizarBindingPreguntaEquivalencia(false);

			//if(PreguntaEquivalenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPreguntaEquivalenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);

			this.getPreguntaEquivalenciasFK_IdSucursal();

			this.inicializarActualizarBindingPreguntaEquivalencia(false);

			//if(PreguntaEquivalenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.preguntaequivalenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePreguntaEquivalencia() {
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.setVisible(false);	    			
			this.jInternalFrameDetalleFormPreguntaEquivalencia.dispose();
			this.jInternalFrameDetalleFormPreguntaEquivalencia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia!=null) {
			this.jInternalFrameReporteDinamicoPreguntaEquivalencia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPreguntaEquivalencia.dispose();
			this.jInternalFrameReporteDinamicoPreguntaEquivalencia=null;
		}
		
		if(this.jInternalFrameImportacionPreguntaEquivalencia!=null) {
			this.jInternalFrameImportacionPreguntaEquivalencia.setVisible(false);	    			
			this.jInternalFrameImportacionPreguntaEquivalencia.dispose();
			this.jInternalFrameImportacionPreguntaEquivalencia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPreguntaEquivalencia();
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
			
			if(sTipo.equals("NuevoPreguntaEquivalencia")) {
				jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPreguntaEquivalencia")) {
				jButtonDuplicarPreguntaEquivalenciaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPreguntaEquivalencia")) {
				jButtonCopiarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormPreguntaEquivalencia")) {
				jButtonVerFormPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPreguntaEquivalencia")) {
				jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPreguntaEquivalencia")) {
				jButtonDuplicarPreguntaEquivalenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPreguntaEquivalencia")) {
				jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPreguntaEquivalencia")) {
				jButtonDuplicarPreguntaEquivalenciaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPreguntaEquivalencia")) {
				jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPreguntaEquivalencia")) {
				jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPreguntaEquivalencia")) {
				jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPreguntaEquivalencia")) {
				jButtonModificarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPreguntaEquivalencia")) {
				jButtonModificarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPreguntaEquivalencia")) {
				jButtonModificarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPreguntaEquivalencia")) {
				jButtonActualizarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPreguntaEquivalencia")) {
				jButtonActualizarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPreguntaEquivalencia")) {
				jButtonActualizarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarPreguntaEquivalencia")) {
				jButtonEliminarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPreguntaEquivalencia")) {
				jButtonEliminarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPreguntaEquivalencia")) {
				jButtonEliminarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarPreguntaEquivalencia")) {
				jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPreguntaEquivalencia")) {
				jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPreguntaEquivalencia")) {
				jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarPreguntaEquivalencia")) {
				jButtonCerrarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPreguntaEquivalencia")) {
				jButtonCerrarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPreguntaEquivalencia")) {
				jButtonCerrarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPreguntaEquivalencia")) {
				jButtonMostrarOcultarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPreguntaEquivalencia")) {
				jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPreguntaEquivalencia")) {
				jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPreguntaEquivalencia")) {
				jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPreguntaEquivalencia")) {
				jButtonCopiarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPreguntaEquivalencia")) {
				jButtonVerFormPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPreguntaEquivalencia")) {
				jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPreguntaEquivalencia")) {
				jButtonCopiarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPreguntaEquivalencia")) {
				jButtonVerFormPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPreguntaEquivalencia")) {
				jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPreguntaEquivalencia")) {
				jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPreguntaEquivalencia")) {
				jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPreguntaEquivalencia")) {
				jButtonRecargarInformacionPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPreguntaEquivalencia")) {
				jButtonRecargarInformacionPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPreguntaEquivalencia")) {
				jButtonRecargarInformacionPreguntaEquivalenciaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPreguntaEquivalencia")) {
				jButtonAnterioresPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPreguntaEquivalencia")) {
				jButtonAnterioresPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePreguntaEquivalencia")) {
				jButtonAnterioresPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPreguntaEquivalencia")) {
				jButtonSiguientesPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPreguntaEquivalencia")) {
				jButtonSiguientesPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPreguntaEquivalencia")) {
				jButtonSiguientesPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPreguntaEquivalencia") || sTipo.equals("MenuItemDetalleAbrirOrderByPreguntaEquivalencia")) {
				jButtonAbrirOrderByPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPreguntaEquivalencia") || sTipo.equals("MenuItemDetalleMostrarOcultarPreguntaEquivalencia")) {
				jButtonMostrarOcultarPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPreguntaEquivalencia")) {
				jButtonNuevoGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPreguntaEquivalencia")) {
				jButtonNuevoGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPreguntaEquivalencia")) {
				jButtonNuevoGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPreguntaEquivalencia")) {
				jButtonCerrarReporteDinamicoPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPreguntaEquivalencia")) {
				jButtonGenerarReporteDinamicoPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPreguntaEquivalencia")) {
				
				jButtonGenerarExcelReporteDinamicoPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPreguntaEquivalencia")) {
				jButtonCerrarImportacionPreguntaEquivalenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPreguntaEquivalencia")) {
				
				jButtonGenerarImportacionPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPreguntaEquivalencia")) {
				
				jButtonAbrirImportacionPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPreguntaEquivalencia")) {
				jComboBoxTiposAccionesPreguntaEquivalenciaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPreguntaEquivalencia")) {
				jComboBoxTiposRelacionesPreguntaEquivalenciaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPreguntaEquivalencia")) {
				jComboBoxTiposAccionesPreguntaEquivalenciaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPreguntaEquivalencia")) {
				
				jComboBoxTiposSeleccionarPreguntaEquivalenciaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPreguntaEquivalencia")) {
				jTextFieldValorCampoGeneralPreguntaEquivalenciaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPreguntaEquivalencia")) {
				jButtonAbrirOrderByPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPreguntaEquivalencia")) {
				jButtonAbrirOrderByPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPreguntaEquivalencia")) {
				jButtonCerrarOrderByPreguntaEquivalenciaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPreguntaEquivalenciaBusqueda")) {
				this.jButtonidPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPreguntaEquivalenciaUpdate")) {
				this.jButtonid_empresaPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_empresaPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPreguntaEquivalenciaUpdate")) {
				this.jButtonid_sucursalPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_sucursalPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPreguntaEquivalenciaUpdate")) {
				this.jButtonid_ejercicioPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_ejercicioPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPreguntaEquivalenciaUpdate")) {
				this.jButtonid_periodoPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_periodoPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPreguntaEquivalenciaBusqueda")) {
				this.jButtondescripcionPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("desdePreguntaEquivalenciaBusqueda")) {
				this.jButtondesdePreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hastaPreguntaEquivalenciaBusqueda")) {
				this.jButtonhastaPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPreguntaEquivalenciaBusqueda")) {
				this.jButtonordenPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPreguntaEquivalenciaUpdate")) {
				this.jButtonid_anioPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_anioPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPreguntaEquivalenciaUpdate")) {
				this.jButtonid_mesPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_mesPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia")) {
				this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalenciaActionPerformed(evt);
			}
			
			;
			
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPreguntaEquivalencia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				


				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PreguntaEquivalencia preguntaequivalenciaLocal=null;
			
			if(!this.getEsControlTabla()) {
				preguntaequivalenciaLocal=this.preguntaequivalencia;
			} else {
				preguntaequivalenciaLocal=this.preguntaequivalenciaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
							
				
				


				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
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
			
			


			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEquivalenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
								
						
				


				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
								
				
				


				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEquivalenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
							
				
				


				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
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
			
			


			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
								
				
				


				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEquivalenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEquivalenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPreguntaEquivalencia")) {
					jCheckBoxSeleccionarTodosPreguntaEquivalenciaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPreguntaEquivalencia")) {
					jCheckBoxSeleccionadosPreguntaEquivalenciaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPreguntaEquivalencia")) {
					
				}
				
				


				
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
												
				
				


				
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEquivalenciaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
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
			
			


			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.preguntaequivalencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.preguntaequivalencia);
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
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
				
				


				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PreguntaEquivalencia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PreguntaEquivalencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPreguntaEquivalenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.preguntaequivalenciaAnterior =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPreguntaEquivalencia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPreguntaEquivalenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPreguntaEquivalencia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.preguntaequivalencia =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.preguntaequivalencia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPreguntaEquivalencia")) {
				
				}
				
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPreguntaEquivalencia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPreguntaEquivalencia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPreguntaEquivalencia")) {
			
			}
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPreguntaEquivalencia();
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
			if(sTipo.equals("NuevoPreguntaEquivalencia")) {
				jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPreguntaEquivalencia")) {
				jButtonDuplicarPreguntaEquivalenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPreguntaEquivalencia")) {
				jButtonCopiarPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPreguntaEquivalencia")) {
				jButtonVerFormPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPreguntaEquivalencia")) {
				jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPreguntaEquivalencia")) {
				jButtonModificarPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPreguntaEquivalencia")) {
				jButtonActualizarPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPreguntaEquivalencia")) {
				jButtonEliminarPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPreguntaEquivalencia")) {
				jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPreguntaEquivalencia")) {
				jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPreguntaEquivalencia")) {
				jButtonCerrarPreguntaEquivalenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPreguntaEquivalencia")) {
				jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPreguntaEquivalencia")) {
				jButtonNuevoGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPreguntaEquivalencia")) {
				jButtonAbrirOrderByPreguntaEquivalenciaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPreguntaEquivalencia")) {
				jButtonRecargarInformacionPreguntaEquivalenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPreguntaEquivalencia")) {
				jButtonAnterioresPreguntaEquivalenciaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPreguntaEquivalencia")) {
				jButtonSiguientesPreguntaEquivalenciaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPreguntaEquivalenciaBusqueda")) {
				this.jButtonidPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPreguntaEquivalenciaUpdate")) {
				this.jButtonid_empresaPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_empresaPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPreguntaEquivalenciaUpdate")) {
				this.jButtonid_sucursalPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_sucursalPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPreguntaEquivalenciaUpdate")) {
				this.jButtonid_ejercicioPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_ejercicioPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPreguntaEquivalenciaUpdate")) {
				this.jButtonid_periodoPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_periodoPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPreguntaEquivalenciaBusqueda")) {
				this.jButtondescripcionPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("desdePreguntaEquivalenciaBusqueda")) {
				this.jButtondesdePreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hastaPreguntaEquivalenciaBusqueda")) {
				this.jButtonhastaPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPreguntaEquivalenciaBusqueda")) {
				this.jButtonordenPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPreguntaEquivalenciaUpdate")) {
				this.jButtonid_anioPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_anioPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPreguntaEquivalenciaUpdate")) {
				this.jButtonid_mesPreguntaEquivalenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPreguntaEquivalenciaBusqueda")) {
				this.jButtonid_mesPreguntaEquivalenciaBusquedaActionPerformed(evt);
			}
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPreguntaEquivalencia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePreguntaEquivalencia")) {
				closingInternalFramePreguntaEquivalencia();
				
			} else if(sTipo.equals("jButtonCancelarPreguntaEquivalencia")) {
				JInternalFrameBase jInternalFrameDetalleFormPreguntaEquivalencia = (JInternalFrameBase)evt.getSource();
	            	
	            PreguntaEquivalenciaBeanSwingJInternalFrame jInternalFrameParent=(PreguntaEquivalenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormPreguntaEquivalencia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPreguntaEquivalenciaActionPerformed(null);
			}
			
			PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.preguntaequivalencia,new Object(),this.preguntaequivalenciaParameterGeneral,this.preguntaequivalenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPreguntaEquivalencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPreguntaEquivalencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPreguntaEquivalencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.preguntaequivalencia)) {
			if(!esControlTabla) {
				if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);			
				}
				
				if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.preguntaequivalenciaReturnGeneral=preguntaequivalenciaLogic.procesarEventosPreguntaEquivalenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntaequivalenciaLogic.getPreguntaEquivalencias(),this.preguntaequivalencia,this.preguntaequivalenciaParameterGeneral,this.isEsNuevoPreguntaEquivalencia,classes);//this.preguntaequivalenciaLogic.getPreguntaEquivalencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPreguntaEquivalencia(this.preguntaequivalenciaReturnGeneral,this.preguntaequivalenciaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPreguntaEquivalencia(classes,this.preguntaequivalenciaReturnGeneral,this.preguntaequivalenciaBean,false);
					}
						
					if(this.preguntaequivalenciaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPreguntaEquivalencia(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPreguntaEquivalencia(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia());	
					}
						
					if(this.preguntaequivalenciaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPreguntaEquivalencia(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia(),classes);//this.preguntaequivalenciaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPreguntaEquivalencia(this.preguntaequivalencia,classes);//this.preguntaequivalenciaBean);									
				}
			
				if(PreguntaEquivalenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPreguntaEquivalencia(this.preguntaequivalencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPreguntaEquivalencia(this.preguntaequivalencia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.preguntaequivalenciaAnterior!=null) {
						this.preguntaequivalencia=this.preguntaequivalenciaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.preguntaequivalenciaReturnGeneral=preguntaequivalenciaLogic.procesarEventosPreguntaEquivalenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntaequivalenciaLogic.getPreguntaEquivalencias(),this.preguntaequivalencia,this.preguntaequivalenciaParameterGeneral,this.isEsNuevoPreguntaEquivalencia,classes);//this.preguntaequivalenciaLogic.getPreguntaEquivalencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.preguntaequivalenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia(),preguntaequivalenciaLogic.getPreguntaEquivalencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia(),this.preguntaequivalencias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPreguntaEquivalencia.repaint();
				
				//((AbstractTableModel) this.jTableDatosPreguntaEquivalencia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPreguntaEquivalencia();
			}
		}
	}
	
	public void actualizarVisualTableDatosPreguntaEquivalencia() throws Exception {
		
		PreguntaEquivalenciaModel preguntaequivalenciaModel=(PreguntaEquivalenciaModel)this.jTableDatosPreguntaEquivalencia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			preguntaequivalenciaModel.preguntaequivalencias=this.preguntaequivalenciaLogic.getPreguntaEquivalencias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			preguntaequivalenciaModel.preguntaequivalencias=this.preguntaequivalencias;
		}
		
		
		((PreguntaEquivalenciaModel) this.jTableDatosPreguntaEquivalencia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPreguntaEquivalencia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpreguntaequivalenciaAnterior(),this.preguntaequivalenciaLogic.getPreguntaEquivalencias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpreguntaequivalenciaAnterior(),this.preguntaequivalencias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPreguntaEquivalencia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
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
										
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntaequivalencia,new Object(),generalEntityParameterGeneral,this.preguntaequivalenciaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PreguntaEquivalenciaConstantesFunciones.getClassesRelationshipsOfPreguntaEquivalencia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PreguntaEquivalenciaConstantesFunciones.getClassesRelationshipsFromStringsOfPreguntaEquivalencia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPreguntaEquivalencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.preguntaequivalencia,new Object(),generalEntityParameterGeneral,this.preguntaequivalenciaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPreguntaEquivalencia(PreguntaEquivalenciaBean preguntaequivalenciaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPreguntaEquivalencia(ArrayList<Classe> classes,PreguntaEquivalenciaReturnGeneral preguntaequivalenciaReturnGeneral,PreguntaEquivalenciaBean preguntaequivalenciaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.preguntaequivalencia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia = new PreguntaEquivalenciaDetalleFormJInternalFrame(jDesktopPane,this.preguntaequivalenciaSessionBean.getConGuardarRelaciones(),this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.setVisible(false);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.setSelected(false);						
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.preguntaequivalenciaLogic=this.preguntaequivalenciaLogic;
		
		this.cargarCombosFrameForeignKeyPreguntaEquivalencia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePreguntaEquivalencia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePreguntaEquivalencia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPreguntaEquivalencia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPreguntaEquivalencia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPreguntaEquivalencia"));
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonModificarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"ModificarPreguntaEquivalencia"));

		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonModificarToolBarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarPreguntaEquivalencia"));
					
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemModificarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarPreguntaEquivalencia"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"ActualizarPreguntaEquivalencia"));
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarToolBarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPreguntaEquivalencia"));
						
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemActualizarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPreguntaEquivalencia"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"EliminarPreguntaEquivalencia"));
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarPreguntaEquivalencia"));
								
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemEliminarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPreguntaEquivalencia"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"CancelarPreguntaEquivalencia"));
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarPreguntaEquivalencia"));
					
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemCancelarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPreguntaEquivalencia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemDetalleCerrarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPreguntaEquivalencia"));		
		
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreguntaEquivalencia"));
		
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreguntaEquivalencia"));
		
		
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPreguntaEquivalencia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonidPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"idPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_empresaPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_empresaPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_sucursalPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_sucursalPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_ejercicioPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_periodoPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_periodoPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtondescripcionPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtondesdePreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"desdePreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonhastaPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"hastaPreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonordenPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"ordenPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_anioPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_anioPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_mesPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_mesPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEquivalenciaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jTabbedPaneRelacionesPreguntaEquivalencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPreguntaEquivalencia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePreguntaEquivalencia"));
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPreguntaEquivalencia"));
		}
		
		this.jTableDatosPreguntaEquivalencia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPreguntaEquivalencia"));
		
		this.jTableDatosPreguntaEquivalencia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPreguntaEquivalencia"));
		
		this.jButtonNuevoPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"NuevoPreguntaEquivalencia"));
		
		this.jButtonDuplicarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"DuplicarPreguntaEquivalencia"));
		
		this.jButtonCopiarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"CopiarPreguntaEquivalencia"));
		
		this.jButtonVerFormPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"VerFormPreguntaEquivalencia"));
		
		
		this.jButtonNuevoToolBarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"NuevoToolBarPreguntaEquivalencia"));
			
		this.jButtonDuplicarToolBarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPreguntaEquivalencia"));
			
		this.jMenuItemNuevoPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPreguntaEquivalencia"));
			
		this.jMenuItemDuplicarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPreguntaEquivalencia"));		
		
		
		this.jButtonNuevoRelacionesPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPreguntaEquivalencia"));
		
		
		this.jButtonNuevoRelacionesToolBarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPreguntaEquivalencia"));
			
		this.jMenuItemNuevoRelacionesPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPreguntaEquivalencia"));		
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonModificarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"ModificarPreguntaEquivalencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonModificarToolBarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarPreguntaEquivalencia"));
			
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemModificarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarPreguntaEquivalencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"ActualizarPreguntaEquivalencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonActualizarToolBarPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPreguntaEquivalencia"));
				
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemActualizarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPreguntaEquivalencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"EliminarPreguntaEquivalencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonEliminarToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarPreguntaEquivalencia"));
						
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemEliminarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPreguntaEquivalencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"CancelarPreguntaEquivalencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonCancelarToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarPreguntaEquivalencia"));
			
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemCancelarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPreguntaEquivalencia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPreguntaEquivalencia"));		
		
		
		this.jButtonCerrarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"CerrarPreguntaEquivalencia"));
		
		
		this.jButtonCerrarToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"CerrarToolBarPreguntaEquivalencia"));
			
		this.jMenuItemCerrarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPreguntaEquivalencia"));
			
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jMenuItemDetalleCerrarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPreguntaEquivalencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosPreguntaEquivalencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPreguntaEquivalencia"));
		}
		
		this.jButtonCopiarToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"CopiarToolBarPreguntaEquivalencia"));
			
		this.jButtonVerFormToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"VerFormToolBarPreguntaEquivalencia"));
		
		this.jMenuItemGuardarCambiosPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPreguntaEquivalencia"));
			
		this.jMenuItemCopiarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPreguntaEquivalencia"));		
		
		this.jMenuItemVerFormPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPreguntaEquivalencia"));		
		
		
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPreguntaEquivalencia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPreguntaEquivalencia"));
			
		this.jMenuItemGuardarCambiosTablaPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPreguntaEquivalencia"));		
		
		
		
		this.jButtonRecargarInformacionPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionPreguntaEquivalencia"));
					
		this.jButtonRecargarInformacionToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPreguntaEquivalencia"));
		
		this.jMenuItemRecargarInformacionPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPreguntaEquivalencia"));		
		
		
		
		this.jButtonAnterioresPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"AnterioresPreguntaEquivalencia"));
		
		
		this.jButtonAnterioresToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPreguntaEquivalencia"));
		
		this.jMenuItemAnterioresPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPreguntaEquivalencia"));		
		
		
		this.jButtonSiguientesPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"SiguientesPreguntaEquivalencia"));
		
		
		this.jButtonSiguientesToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPreguntaEquivalencia"));
			
		this.jMenuItemSiguientesPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPreguntaEquivalencia"));
			
		this.jMenuItemAbrirOrderByPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPreguntaEquivalencia"));
			
		this.jMenuItemMostrarOcultarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPreguntaEquivalencia"));
			
		this.jMenuItemDetalleAbrirOrderByPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPreguntaEquivalencia"));
			
		this.jMenuItemDetalleMostarOcultarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPreguntaEquivalencia"));		
		
		
		this.jButtonNuevoGuardarCambiosPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPreguntaEquivalencia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPreguntaEquivalencia"));
			
		this.jMenuItemNuevoGuardarCambiosPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPreguntaEquivalencia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPreguntaEquivalencia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPreguntaEquivalencia"));

		this.jCheckBoxSeleccionadosPreguntaEquivalencia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPreguntaEquivalencia"));
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPreguntaEquivalencia"));
		}
		
		
		this.jComboBoxTiposRelacionesPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"TiposRelacionesPreguntaEquivalencia"));
			
		this.jComboBoxTiposAccionesPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"TiposAccionesPreguntaEquivalencia"));
					
		this.jComboBoxTiposSeleccionarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPreguntaEquivalencia"));
			
		this.jTextFieldValorCampoGeneralPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPreguntaEquivalencia"));		
		
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonidPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"idPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_empresaPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_empresaPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_sucursalPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_sucursalPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_ejercicioPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_periodoPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_periodoPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtondescripcionPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtondesdePreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"desdePreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonhastaPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"hastaPreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonordenPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"ordenPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_anioPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_anioPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_mesPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_mesPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEquivalenciaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"BusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPreguntaEquivalencia!=null) {
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreguntaEquivalencia"));
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreguntaEquivalencia"));
				this.jInternalFrameReporteDinamicoPreguntaEquivalencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreguntaEquivalencia"));
			}
			
			//this.jButtonCerrarReporteDinamicoPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPreguntaEquivalencia"));				
			//this.jButtonGenerarReporteDinamicoPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPreguntaEquivalencia"));
			//this.jButtonGenerarExcelReporteDinamicoPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPreguntaEquivalencia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPreguntaEquivalencia!=null) {
				this.jInternalFrameImportacionPreguntaEquivalencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPreguntaEquivalencia"));
				this.jInternalFrameImportacionPreguntaEquivalencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPreguntaEquivalencia"));
				this.jInternalFrameImportacionPreguntaEquivalencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPreguntaEquivalencia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByPreguntaEquivalencia"));
			
			this.jButtonAbrirOrderByToolBarPreguntaEquivalencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPreguntaEquivalencia"));			
			
			if(this.jInternalFrameOrderByPreguntaEquivalencia!=null) {
				this.jInternalFrameOrderByPreguntaEquivalencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPreguntaEquivalencia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPreguntaEquivalencia.jTabbedPaneRelacionesPreguntaEquivalencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPreguntaEquivalencia"));
		
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
            		closingInternalFramePreguntaEquivalencia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPreguntaEquivalencia = (JInternalFrameBase)event.getSource();
	            	
	            PreguntaEquivalenciaBeanSwingJInternalFrame jInternalFrameParent=(PreguntaEquivalenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormPreguntaEquivalencia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPreguntaEquivalenciaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPreguntaEquivalencia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPreguntaEquivalenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPreguntaEquivalencia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPreguntaEquivalencia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPreguntaEquivalencia";
		inputMap = this.jButtonNuevoPreguntaEquivalencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPreguntaEquivalencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPreguntaEquivalencia";
		inputMap = this.jButtonNuevoRelacionesPreguntaEquivalencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPreguntaEquivalencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPreguntaEquivalenciaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPreguntaEquivalencia";
		inputMap = this.jButtonModificarPreguntaEquivalencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPreguntaEquivalencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPreguntaEquivalenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPreguntaEquivalencia";
		inputMap = this.jButtonActualizarPreguntaEquivalencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPreguntaEquivalencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPreguntaEquivalenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPreguntaEquivalencia";
		inputMap = this.jButtonEliminarPreguntaEquivalencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPreguntaEquivalencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPreguntaEquivalenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPreguntaEquivalencia";
		inputMap = this.jButtonCancelarPreguntaEquivalencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPreguntaEquivalencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPreguntaEquivalencia";
		inputMap = this.jButtonCerrarPreguntaEquivalencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPreguntaEquivalencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPreguntaEquivalenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPreguntaEquivalencia";
		inputMap = this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosPreguntaEquivalencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonGuardarCambiosPreguntaEquivalencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPreguntaEquivalencia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPreguntaEquivalenciaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPreguntaEquivalencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPreguntaEquivalenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPreguntaEquivalencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPreguntaEquivalenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPreguntaEquivalencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPreguntaEquivalenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonidPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"idPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_empresaPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_empresaPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_sucursalPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_sucursalPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_ejercicioPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_ejercicioPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_periodoPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_periodoPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtondescripcionPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtondesdePreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"desdePreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonhastaPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"hastaPreguntaEquivalenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonordenPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"ordenPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_anioPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_anioPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPreguntaEquivalenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_mesPreguntaEquivalenciaUpdate.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEquivalenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jButtonid_mesPreguntaEquivalenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPreguntaEquivalenciaBusqueda"));
		
		
		this.jButtonBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia.addActionListener(new ButtonActionListener(this,"BusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPreguntaEquivalencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPreguntaEquivalenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPreguntaEquivalenciaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPreguntaEquivalencia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPreguntaEquivalencia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
					preguntaequivalenciaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalencias) {
					preguntaequivalenciaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPreguntaEquivalenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
						preguntaequivalenciaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalencias) {
						preguntaequivalenciaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalencias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPreguntaEquivalencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPreguntaEquivalencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPreguntaEquivalenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPreguntaEquivalencia.getSelectedRows();
			
			PreguntaEquivalencia preguntaequivalenciaLocal=new PreguntaEquivalencia();
			
			//this.seleccionarTodosPreguntaEquivalencia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaequivalenciaLocal =(PreguntaEquivalencia) this.preguntaequivalenciaLogic.getPreguntaEquivalencias().toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					preguntaequivalenciaLocal =(PreguntaEquivalencia) this.preguntaequivalencias.toArray()[this.jTableDatosPreguntaEquivalencia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				preguntaequivalenciaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
						preguntaequivalenciaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalencias) {
						preguntaequivalenciaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPreguntaEquivalencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPreguntaEquivalencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPreguntaEquivalencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPreguntaEquivalenciaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPreguntaEquivalenciaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPreguntaEquivalenciaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPreguntaEquivalencia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
				
						if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							preguntaequivalenciaAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE)) {
							existe=true;
							preguntaequivalenciaAux.setdesde(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA)) {
							existe=true;
							preguntaequivalenciaAux.sethasta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							preguntaequivalenciaAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalencias) {
					
						if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							preguntaequivalenciaAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE)) {
							existe=true;
							preguntaequivalenciaAux.setdesde(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA)) {
							existe=true;
							preguntaequivalenciaAux.sethasta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							preguntaequivalenciaAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPreguntaEquivalenciaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPreguntaEquivalencia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPreguntaEquivalencia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePreguntaEquivalencia) {				
					conSplash=true;//false;										
					
					//this.startProcessPreguntaEquivalencia(conSplash);
				
					this.generarReportePreguntaEquivalenciasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPreguntaEquivalenciasSeleccionados();
				//this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreguntaEquivalenciasSeleccionados(false);
				//this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPreguntaEquivalenciasSeleccionados(true);
				//this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPreguntaEquivalencia();
				
				this.exportarPreguntaEquivalenciasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPreguntaEquivalencias();
				//this.importarPreguntaEquivalencias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPreguntaEquivalencia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPreguntaEquivalenciasSeleccionados();
				//this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Preguntas Equivalencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPreguntaEquivalencia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPreguntaEquivalencia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPreguntaEquivalencia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setSelectedIndex(0);					
				}	
			} 			
			else if(PreguntaEquivalenciaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePreguntaEquivalencia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPreguntaEquivalencia(conSplash);
					
						//this.actualizarParametrosGeneralPreguntaEquivalencia();
						
						this.generarReporteProcesoAccionPreguntaEquivalenciasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Preguntas EquivalenciaS SELECCIONADOS?", "MANTENIMIENTO DE Preguntas Equivalencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPreguntaEquivalencia();
				
						this.actualizarParametrosGeneralPreguntaEquivalencia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.preguntaequivalenciaReturnGeneral=preguntaequivalenciaLogic.procesarAccionPreguntaEquivalenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.preguntaequivalenciaLogic.getPreguntaEquivalencias(),this.preguntaequivalenciaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPreguntaEquivalenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPreguntaEquivalencia();
					
					PreguntaEquivalenciaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPreguntaEquivalenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPreguntaEquivalencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxTiposAccionesFormularioPreguntaEquivalencia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPreguntaEquivalencia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPreguntaEquivalenciaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPreguntaEquivalencia();
			
			if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();		
			PreguntaEquivalencia preguntaequivalencia=new PreguntaEquivalencia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPreguntaEquivalencia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPreguntaEquivalencia.getSelectedItem();
			
			
			
			
			preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
			//this.sTipoAccion;
			
			if(preguntaequivalenciasSeleccionados.size()==1) {
				for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalenciasSeleccionados) {
					preguntaequivalencia=preguntaequivalenciaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPreguntaEquivalencia();
			
      		//this.finishProcessPreguntaEquivalencia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPreguntaEquivalenciaReturnGeneral() throws Exception {
		if(this.preguntaequivalenciaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.preguntaequivalenciaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.preguntaequivalenciaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.preguntaequivalenciaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.preguntaequivalenciaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.preguntaequivalenciaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPreguntaEquivalencia(false);
		}
		
		if(this.preguntaequivalenciaReturnGeneral.getConRetornoLista() || this.preguntaequivalenciaReturnGeneral.getConRetornoObjeto()) {
			if(this.preguntaequivalenciaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.preguntaequivalenciaLogic.setPreguntaEquivalencias(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.preguntaequivalenciaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.preguntaequivalenciaLogic.setPreguntaEquivalencia(this.preguntaequivalenciaReturnGeneral.getPreguntaEquivalencia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPreguntaEquivalencia(false);
		}
	}
	
	public void actualizarParametrosGeneralPreguntaEquivalencia() throws Exception {
		
		
	}
	
	public ArrayList<PreguntaEquivalencia> getPreguntaEquivalenciasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPreguntaEquivalencia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalenciaLogic.getPreguntaEquivalencias()) {
					if(preguntaequivalenciaAux.getIsSelected()) {
						preguntaequivalenciasSeleccionados.add(preguntaequivalenciaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PreguntaEquivalencia preguntaequivalenciaAux:this.preguntaequivalencias) {
					if(preguntaequivalenciaAux.getIsSelected()) {
						preguntaequivalenciasSeleccionados.add(preguntaequivalenciaAux);				
					}
				}
			}
			
			if(preguntaequivalenciasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						preguntaequivalenciasSeleccionados.addAll(this.preguntaequivalenciaLogic.getPreguntaEquivalencias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						preguntaequivalenciasSeleccionados.addAll(this.preguntaequivalencias);				
					}
				}
			}
		} else {
			preguntaequivalenciasSeleccionados.add(this.preguntaequivalencia);
		}
		
		return preguntaequivalenciasSeleccionados;
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
	
	public void generarReportePreguntaEquivalenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPreguntaEquivalenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPreguntaEquivalenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreguntaEquivalenciasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPreguntaEquivalenciasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Preguntas Equivalencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPreguntaEquivalenciasSeleccionados() throws Exception {
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();		
		
		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePreguntaEquivalencias("Todos",preguntaequivalenciasSeleccionados);
		
	}	
	
	public void generarReporteNormalPreguntaEquivalenciasSeleccionados() throws Exception {
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();		
		
		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePreguntaEquivalencias("Todos",preguntaequivalenciasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPreguntaEquivalenciasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();
		
		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePreguntaEquivalencias("Todos",preguntaequivalenciasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPreguntaEquivalenciasSeleccionados() throws Exception {
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPreguntaEquivalencia();
		
		
		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPreguntaEquivalencia();
		
		
		//this.generarReportePreguntaEquivalencias("Todos",preguntaequivalenciasSeleccionados ,preguntaequivalenciaImplementable,preguntaequivalenciaImplementableHome);
	}
	
	public void mostrarImportacionPreguntaEquivalencias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPreguntaEquivalencia();
		
		this.abrirFrameImportacionPreguntaEquivalencia();		
		
			
		//this.generarReportePreguntaEquivalencias("Todos",preguntaequivalenciasSeleccionados ,preguntaequivalenciaImplementable,preguntaequivalenciaImplementableHome);
	}
	
	public void importarPreguntaEquivalencias() throws Exception {		
	
	}
	
	public void exportarPreguntaEquivalenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPreguntaEquivalenciasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPreguntaEquivalenciasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPreguntaEquivalenciasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Preguntas Equivalencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPreguntaEquivalenciasSeleccionados() throws Exception {
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();		
		
		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaequivalencia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPreguntaEquivalencia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalenciasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPreguntaEquivalencia(preguntaequivalenciaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//preguntaequivalenciaAux.setsDetalleGeneralEntityReporte(preguntaequivalenciaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPreguntaEquivalencia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=preguntaequivalencia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getdesde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.gethasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=preguntaequivalencia.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPreguntaEquivalenciasSeleccionados() throws Exception {
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();		
		
		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaequivalencia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PreguntaEquivalencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPreguntaEquivalencia(row);				
				iRow++;
			}				
			
			for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalenciasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPreguntaEquivalencia(preguntaequivalenciaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPreguntaEquivalenciasSeleccionados() throws Exception {
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();		
		
		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"preguntaequivalencia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("preguntaequivalencias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("preguntaequivalencia");
			//elementRoot.appendChild(element);
		
			for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalenciasSeleccionados) {
				element = document.createElement("preguntaequivalencia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPreguntaEquivalencia(preguntaequivalenciaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Preguntas Equivalencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPreguntaEquivalencia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_DESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_HASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getdesde());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.gethasta());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(preguntaequivalencia.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlPreguntaEquivalencia(PreguntaEquivalencia preguntaequivalencia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PreguntaEquivalenciaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(preguntaequivalencia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PreguntaEquivalenciaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(preguntaequivalencia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PreguntaEquivalenciaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(preguntaequivalencia.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PreguntaEquivalenciaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(preguntaequivalencia.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PreguntaEquivalenciaConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(preguntaequivalencia.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PreguntaEquivalenciaConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(preguntaequivalencia.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementdescripcion = document.createElement(PreguntaEquivalenciaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(preguntaequivalencia.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementdesde = document.createElement(PreguntaEquivalenciaConstantesFunciones.DESDE);
		elementdesde.appendChild(document.createTextNode(preguntaequivalencia.getdesde().toString().trim()));
		element.appendChild(elementdesde);

		Element elementhasta = document.createElement(PreguntaEquivalenciaConstantesFunciones.HASTA);
		elementhasta.appendChild(document.createTextNode(preguntaequivalencia.gethasta().toString().trim()));
		element.appendChild(elementhasta);

		Element elementorden = document.createElement(PreguntaEquivalenciaConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(preguntaequivalencia.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementanio_descripcion = document.createElement(PreguntaEquivalenciaConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(preguntaequivalencia.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(PreguntaEquivalenciaConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(preguntaequivalencia.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoPreguntaEquivalenciasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados=new ArrayList<PreguntaEquivalencia>();
		
		preguntaequivalenciasSeleccionados=this.getPreguntaEquivalenciasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPreguntaEquivalencia(preguntaequivalenciasSeleccionados);
		
		this.generarReportePreguntaEquivalencias("Todos",preguntaequivalenciasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPreguntaEquivalencia(ArrayList<PreguntaEquivalencia> preguntaequivalenciasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PreguntaEquivalencia preguntaequivalenciaAux:preguntaequivalenciasSeleccionados) {
				preguntaequivalenciaAux.setsDetalleGeneralEntityReporte(preguntaequivalenciaAux.toString());
			
				if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					preguntaequivalenciaAux.setsDescripcionGeneralEntityReporte1(preguntaequivalenciaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					preguntaequivalenciaAux.setsDescripcionGeneralEntityReporte1(preguntaequivalenciaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					preguntaequivalenciaAux.setsDescripcionGeneralEntityReporte1(preguntaequivalenciaAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					preguntaequivalenciaAux.setsDescripcionGeneralEntityReporte1(preguntaequivalenciaAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					preguntaequivalenciaAux.setsDescripcionGeneralEntityReporte1(preguntaequivalenciaAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					preguntaequivalenciaAux.setsDescripcionGeneralEntityReporte1(preguntaequivalenciaAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					preguntaequivalenciaAux.setsDescripcionGeneralEntityReporte1(preguntaequivalenciaAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PreguntaEquivalenciaConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					preguntaequivalenciaAux.setsDescripcionGeneralEntityReporte1(preguntaequivalenciaAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PreguntaEquivalenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPreguntaEquivalencia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPreguntaEquivalencia=true;
				this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=true;
				this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=true;
			}
			
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=false;
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=true;
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=false;
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=true;
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=true;
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=false;
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=true;
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=true;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=true;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=true;
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=false;
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=false;
			this.isVisibilidadCeldaModificarPreguntaEquivalencia=true;
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaCancelarPreguntaEquivalencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				} else {
					this.isVisibilidadCeldaGuardarPreguntaEquivalencia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PreguntaEquivalenciaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=true;
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=true;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=true;
		} else {
			this.actualizarEstadoPanelsPreguntaEquivalencia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPreguntaEquivalencia=false;
			//this.isVisibilidadCeldaVerFormPreguntaEquivalencia=false;
			this.isVisibilidadCeldaDuplicarPreguntaEquivalencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;
		} else {
			this.isVisibilidadCeldaNuevoPreguntaEquivalencia=false;
			this.isVisibilidadCeldaGuardarCambiosPreguntaEquivalencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			if(!preguntaequivalenciaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;												
			}
			
			this.jButtonCerrarPreguntaEquivalencia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPreguntaEquivalencia=false;
		}
		
		if(!this.permiteMantenimiento(this.preguntaequivalencia)) {
			this.isVisibilidadCeldaActualizarPreguntaEquivalencia=false;
			this.isVisibilidadCeldaEliminarPreguntaEquivalencia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPreguntaEquivalencia() {
	}
	
	public void actualizarEstadoPanelsPreguntaEquivalencia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosEdicionPreguntaEquivalencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEquivalencia!=null) {
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosPreguntaEquivalencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaEquivalencia!=null) {
				this.jPanelPaginacionPreguntaEquivalencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaEquivalencia!=null) {
				this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosEdicionPreguntaEquivalencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEquivalencia!=null) {
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosPreguntaEquivalencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreguntaEquivalencia!=null) {
				this.jPanelPaginacionPreguntaEquivalencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreguntaEquivalencia!=null) {
				this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosEdicionPreguntaEquivalencia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEquivalencia!=null) {
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosPreguntaEquivalencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreguntaEquivalencia!=null) {
				this.jPanelPaginacionPreguntaEquivalencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreguntaEquivalencia!=null) {
				this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosEdicionPreguntaEquivalencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEquivalencia!=null) {
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosPreguntaEquivalencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionPreguntaEquivalencia!=null) {
				this.jPanelPaginacionPreguntaEquivalencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPreguntaEquivalencia!=null) {
				this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosEdicionPreguntaEquivalencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEquivalencia!=null) {
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosPreguntaEquivalencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaEquivalencia!=null) {
				this.jPanelPaginacionPreguntaEquivalencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaEquivalencia!=null) {
				this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosEdicionPreguntaEquivalencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEquivalencia!=null) {
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosPreguntaEquivalencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaEquivalencia!=null) {
				this.jPanelPaginacionPreguntaEquivalencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaEquivalencia!=null) {
				this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosEdicionPreguntaEquivalencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEquivalencia!=null) {
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPreguntaEquivalencia!=null) {
				this.jScrollPanelDatosPreguntaEquivalencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPreguntaEquivalencia!=null) {
				this.jPanelPaginacionPreguntaEquivalencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPreguntaEquivalencia!=null) {
				this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPreguntaEquivalencia!=null) {
					this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPreguntaEquivalencia!=null) {
				this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.preguntaequivalenciaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPreguntaEquivalencia!=null) {
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPreguntaEquivalencia!=null) {
				this.jPanelParametrosReportesPreguntaEquivalencia.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEquivalencia.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEquivalencia.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaEjercicio;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEquivalencia.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaPeriodo;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEquivalencia.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaAnioNegation;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEquivalencia.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo=isParaMesNegation;
			if(!this.isVisibilidadBusquedaPorIdEjercicioPorIdPeriodo) {this.jTabbedPaneBusquedasPreguntaEquivalencia.remove(jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PreguntaEquivalenciaSessionBean preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
		
		if(this.preguntaequivalenciaSessionBean==null) {
			this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
		}
		
		this.preguntaequivalenciaSessionBean.setsUltimaBusquedaPreguntaEquivalencia(this.getsAccionBusqueda());
		this.preguntaequivalenciaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.preguntaequivalenciaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdEjercicioPorIdPeriodo")) {
			preguntaequivalenciaSessionBean.setid_ejercicio(this.getid_ejercicioBusquedaPorIdEjercicioPorIdPeriodo());	
			preguntaequivalenciaSessionBean.setid_periodo(this.getid_periodoBusquedaPorIdEjercicioPorIdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			preguntaequivalenciaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			preguntaequivalenciaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PreguntaEquivalenciaSessionBean preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
		
		if(this.preguntaequivalenciaSessionBean==null) {
			this.preguntaequivalenciaSessionBean=new PreguntaEquivalenciaSessionBean();
		}
		
		if(this.preguntaequivalenciaSessionBean.getsUltimaBusquedaPreguntaEquivalencia()!=null&&!this.preguntaequivalenciaSessionBean.getsUltimaBusquedaPreguntaEquivalencia().equals("")) {
			this.setsAccionBusqueda(preguntaequivalenciaSessionBean.getsUltimaBusquedaPreguntaEquivalencia());
			this.setiNumeroPaginacion(preguntaequivalenciaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(preguntaequivalenciaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdEjercicioPorIdPeriodo")) {
				this.setid_ejercicioBusquedaPorIdEjercicioPorIdPeriodo(preguntaequivalenciaSessionBean.getid_ejercicio());
				preguntaequivalenciaSessionBean.setid_ejercicio(-1L);
				this.setid_periodoBusquedaPorIdEjercicioPorIdPeriodo(preguntaequivalenciaSessionBean.getid_periodo());
				preguntaequivalenciaSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(preguntaequivalenciaSessionBean.getid_empresa());
				preguntaequivalenciaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(preguntaequivalenciaSessionBean.getid_sucursal());
				preguntaequivalenciaSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.preguntaequivalenciaSessionBean.setsUltimaBusquedaPreguntaEquivalencia("");
		this.preguntaequivalenciaSessionBean.setiNumeroPaginacion(PreguntaEquivalenciaConstantesFunciones.INUMEROPAGINACION);
		this.preguntaequivalenciaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPreguntaEquivalencia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPreguntaEquivalencia() {
		this.updateBorderResaltarBusquedasFormularioPreguntaEquivalencia();
		this.updateVisibilidadBusquedasFormularioPreguntaEquivalencia();
		this.updateHabilitarBusquedasFormularioPreguntaEquivalencia();
	}
	
	public void updateBorderResaltarBusquedasFormularioPreguntaEquivalencia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPreguntaEquivalencia.getComponents().length>0) {
	

		if(this.preguntaequivalenciaConstantesFunciones.resaltarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia!=null) {
			index= this.jTabbedPaneBusquedasPreguntaEquivalencia.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEquivalencia.getComponent(index);
				jPanel.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPreguntaEquivalencia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPreguntaEquivalencia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPreguntaEquivalencia.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEquivalencia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);
			if(!this.preguntaequivalenciaConstantesFunciones.mostrarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia && index>-1) {
				this.jTabbedPaneBusquedasPreguntaEquivalencia.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPreguntaEquivalencia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPreguntaEquivalencia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPreguntaEquivalencia.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEquivalencia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.preguntaequivalenciaConstantesFunciones.activarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);
				this.jTabbedPaneBusquedasPreguntaEquivalencia.setEnabledAt(index,this.preguntaequivalenciaConstantesFunciones.activarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPreguntaEquivalencia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdEjercicioPorIdPeriodo")) {
			index= this.jTabbedPaneBusquedasPreguntaEquivalencia.indexOfComponent(this.jPanelBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);

			this.jTabbedPaneBusquedasPreguntaEquivalencia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPreguntaEquivalencia.getComponent(index);

			this.preguntaequivalenciaConstantesFunciones.setResaltarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia(resaltar);

			jPanel.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarBusquedaPorIdEjercicioPorIdPeriodoPreguntaEquivalencia);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPreguntaEquivalencia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPreguntaEquivalencia() throws Exception {

		if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPreguntaEquivalencia();
		this.updateVisibilidadResaltarControlesFormularioPreguntaEquivalencia();
		this.updateHabilitarResaltarControlesFormularioPreguntaEquivalencia();
		
	}
	
	public void updateBorderResaltarControlesFormularioPreguntaEquivalencia() throws Exception {
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.preguntaequivalenciaConstantesFunciones.resaltaridPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltaridPreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltarid_empresaPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarid_empresaPreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltarid_sucursalPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarid_sucursalPreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltarid_ejercicioPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarid_ejercicioPreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltarid_periodoPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarid_periodoPreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltardescripcionPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextAreadescripcionPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltardescripcionPreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltardesdePreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFielddesdePreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltardesdePreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltarhastaPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldhastaPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarhastaPreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltarordenPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldordenPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarordenPreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltarid_anioPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarid_anioPreguntaEquivalencia);}
		if(this.preguntaequivalenciaConstantesFunciones.resaltarid_mesPreguntaEquivalencia!=null && this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.setBorder(this.preguntaequivalenciaConstantesFunciones.resaltarid_mesPreguntaEquivalencia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPreguntaEquivalencia() throws Exception {		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
	
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostraridPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelidPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostraridPreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_empresaPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelid_empresaPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_empresaPreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_sucursalPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelid_sucursalPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_sucursalPreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_ejercicioPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelid_ejercicioPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_ejercicioPreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_periodoPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelid_periodoPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_periodoPreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextAreadescripcionPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrardescripcionPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPaneldescripcionPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrardescripcionPreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFielddesdePreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrardesdePreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPaneldesdePreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrardesdePreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldhastaPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarhastaPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelhastaPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarhastaPreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldordenPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarordenPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelordenPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarordenPreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_anioPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelid_anioPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_anioPreguntaEquivalencia);
		//this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_mesPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jPanelid_mesPreguntaEquivalencia.setVisible(this.preguntaequivalenciaConstantesFunciones.mostrarid_mesPreguntaEquivalencia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPreguntaEquivalencia() throws Exception {
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPreguntaEquivalencia!=null) {
	
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jLabelidPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activaridPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_empresaPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activarid_empresaPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_sucursalPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activarid_sucursalPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_ejercicioPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activarid_ejercicioPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_periodoPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activarid_periodoPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextAreadescripcionPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activardescripcionPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFielddesdePreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activardesdePreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldhastaPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activarhastaPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jTextFieldordenPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activarordenPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_anioPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activarid_anioPreguntaEquivalencia);
		this.jInternalFrameDetalleFormPreguntaEquivalencia.jComboBoxid_mesPreguntaEquivalencia.setEnabled(this.preguntaequivalenciaConstantesFunciones.activarid_mesPreguntaEquivalencia);
		}
	}
	
		
}