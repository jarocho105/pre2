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

import com.bydan.erp.nomina.util.CierreRolMensualConstantesFunciones;
import com.bydan.erp.nomina.util.CierreRolMensualParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CierreRolMensualParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CierreRolMensualBean;
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
public class CierreRolMensualBeanSwingJInternalFrame extends CierreRolMensualJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CierreRolMensualBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CierreRolMensual> cierrerolmensualValidator = new ClassValidator<CierreRolMensual>(CierreRolMensual.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CierreRolMensual cierrerolmensual;	
	public CierreRolMensual cierrerolmensualAux;
	public CierreRolMensual cierrerolmensualAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CierreRolMensual cierrerolmensualTotales;
	public Long idCierreRolMensualActual;
	public Long iIdNuevoCierreRolMensual=0L;
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

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
	}

	public String sFinalQueryComboEstadoEmpleado="";

	public List<EstadoEmpleado> estadoempleadosForeignKey;

	public List<EstadoEmpleado> getestadoempleadosForeignKey() {
		return estadoempleadosForeignKey;
	}

	public void setestadoempleadosForeignKey(List<EstadoEmpleado> estadoempleadosForeignKey) {
		this.estadoempleadosForeignKey = estadoempleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoEmpleado estadoempleadoForeignKey;

	public EstadoEmpleado getestadoempleadoForeignKey() {
		return estadoempleadoForeignKey;
	}

	public void setestadoempleadoForeignKey(EstadoEmpleado estadoempleadoForeignKey) {
		this.estadoempleadoForeignKey = estadoempleadoForeignKey;
	}

	public String sFinalQueryComboAsientoContable="";

	public List<AsientoContable> asientocontablesForeignKey;

	public List<AsientoContable> getasientocontablesForeignKey() {
		return asientocontablesForeignKey;
	}

	public void setasientocontablesForeignKey(List<AsientoContable> asientocontablesForeignKey) {
		this.asientocontablesForeignKey = asientocontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public AsientoContable asientocontableForeignKey;

	public AsientoContable getasientocontableForeignKey() {
		return asientocontableForeignKey;
	}

	public void setasientocontableForeignKey(AsientoContable asientocontableForeignKey) {
		this.asientocontableForeignKey = asientocontableForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	public Long idAsientoContableActual=0L;

	public Long getidAsientoContableActual() {
		return idAsientoContableActual;
	}

	public void setidAsientoContableActual(Long idAsientoContableActual) {
		this.idAsientoContableActual= idAsientoContableActual;
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
	
	public Boolean isPermisoTodoCierreRolMensual;
	public Boolean isPermisoNuevoCierreRolMensual;
	public Boolean isPermisoActualizarCierreRolMensual;
	public Boolean isPermisoActualizarOriginalCierreRolMensual;
	public Boolean isPermisoEliminarCierreRolMensual;
	public Boolean isPermisoGuardarCambiosCierreRolMensual;
	public Boolean isPermisoConsultaCierreRolMensual;
	public Boolean isPermisoBusquedaCierreRolMensual;
	public Boolean isPermisoReporteCierreRolMensual;
	public Boolean isPermisoPaginacionMedioCierreRolMensual;
	public Boolean isPermisoPaginacionAltoCierreRolMensual;
	public Boolean isPermisoPaginacionTodoCierreRolMensual;
	public Boolean isPermisoCopiarCierreRolMensual;
	public Boolean isPermisoVerFormCierreRolMensual;
	public Boolean isPermisoDuplicarCierreRolMensual;
	public Boolean isPermisoOrdenCierreRolMensual;
	
	
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
	
	public CierreRolMensualParameterReturnGeneral cierrerolmensualReturnGeneral;
	public CierreRolMensualParameterReturnGeneral cierrerolmensualParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCierreRolMensual=false;
	public Boolean esParaAccionDesdeFormularioCierreRolMensual=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CierreRolMensualSessionBeanAdditional cierrerolmensualSessionBeanAdditional=null;
	
	public CierreRolMensualSessionBeanAdditional getCierreRolMensualSessionBeanAdditional() {
		return this.cierrerolmensualSessionBeanAdditional;
	}
	
	public void setCierreRolMensualSessionBeanAdditional(CierreRolMensualSessionBeanAdditional cierrerolmensualSessionBeanAdditional) {
		try {
			this.cierrerolmensualSessionBeanAdditional=cierrerolmensualSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CierreRolMensualBeanSwingJInternalFrameAdditional cierrerolmensualBeanSwingJInternalFrameAdditional=null;
	//public class CierreRolMensualBeanSwingJInternalFrame
	
	public CierreRolMensualBeanSwingJInternalFrameAdditional getCierreRolMensualBeanSwingJInternalFrameAdditional() {
		return this.cierrerolmensualBeanSwingJInternalFrameAdditional;
	}
	
	public void setCierreRolMensualBeanSwingJInternalFrameAdditional(CierreRolMensualBeanSwingJInternalFrameAdditional cierrerolmensualBeanSwingJInternalFrameAdditional) {
		try {
			this.cierrerolmensualBeanSwingJInternalFrameAdditional=cierrerolmensualBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CierreRolMensualLogic cierrerolmensualLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CierreRolMensual cierrerolmensualBean;
	public CierreRolMensualConstantesFunciones cierrerolmensualConstantesFunciones;
	//public CierreRolMensualParameterReturnGeneral cierrerolmensualReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public EmpleadoLogic empleadoLogic;
	public EstructuraLogic estructuraLogic;
	public EstadoEmpleadoLogic estadoempleadoLogic;
	public AsientoContableLogic asientocontableLogic;
	
	//PARAMETROS
	
	
	//public List<CierreRolMensual> cierrerolmensuals;	
	//public List<CierreRolMensual> cierrerolmensualsEliminados;
	//public List<CierreRolMensual> cierrerolmensualsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCierreRolMensual=false;
	public Boolean isVisibilidadCeldaDuplicarCierreRolMensual=true;
	public Boolean isVisibilidadCeldaCopiarCierreRolMensual=true;
	public Boolean isVisibilidadCeldaVerFormCierreRolMensual=true;
	public Boolean isVisibilidadCeldaOrdenCierreRolMensual=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;
	public Boolean isVisibilidadCeldaModificarCierreRolMensual=false;
	public Boolean isVisibilidadCeldaActualizarCierreRolMensual=false;
	public Boolean isVisibilidadCeldaEliminarCierreRolMensual=false;
	public Boolean isVisibilidadCeldaCancelarCierreRolMensual=false;
	public Boolean isVisibilidadCeldaGuardarCierreRolMensual=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCierreRolMensual=false;	
	
	
	public Boolean isVisibilidadFK_IdAsientoContable=false;
	public Boolean isVisibilidadFK_IdCierreRolMensual=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoEmpleado=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCierreRolMensual() {
		return this.iIdNuevoCierreRolMensual;
	}

	public void setiIdNuevoCierreRolMensual(Long iIdNuevoCierreRolMensual) {
		this.iIdNuevoCierreRolMensual = iIdNuevoCierreRolMensual;
	}
	
	public Long getidCierreRolMensualActual() {
		return this.idCierreRolMensualActual;
	}

	public void setidCierreRolMensualActual(Long idCierreRolMensualActual) {
		this.idCierreRolMensualActual = idCierreRolMensualActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CierreRolMensual getcierrerolmensual() {
		return this.cierrerolmensual;
	}

	public void setcierrerolmensual(CierreRolMensual cierrerolmensual) {
		this.cierrerolmensual = cierrerolmensual;
	}
	
	public CierreRolMensual getcierrerolmensualAux() {
		return this.cierrerolmensualAux;
	}

	public void setcierrerolmensualAux(CierreRolMensual cierrerolmensualAux) {
		this.cierrerolmensualAux = cierrerolmensualAux;
	}				
	
	public CierreRolMensual getcierrerolmensualAnterior() {
		return this.cierrerolmensualAnterior;
	}

	public void setcierrerolmensualAnterior(CierreRolMensual cierrerolmensualAnterior) {
		this.cierrerolmensualAnterior = cierrerolmensualAnterior;
	}	
	
	public CierreRolMensual getcierrerolmensualTotales() {
		return this.cierrerolmensualTotales;
	}

	public void setcierrerolmensualTotales(CierreRolMensual cierrerolmensualTotales) {
		this.cierrerolmensualTotales = cierrerolmensualTotales;
	}	
	
	public CierreRolMensual getcierrerolmensualBean() {
		return this.cierrerolmensualBean;
	}

	public void setcierrerolmensualBean(CierreRolMensual cierrerolmensualBean) {
		this.cierrerolmensualBean = cierrerolmensualBean;
	}	
	
	public CierreRolMensualParameterReturnGeneral getcierrerolmensualReturnGeneral() {
		return this.cierrerolmensualReturnGeneral;
	}

	public void setcierrerolmensualReturnGeneral(CierreRolMensualParameterReturnGeneral cierrerolmensualReturnGeneral) {
		this.cierrerolmensualReturnGeneral = cierrerolmensualReturnGeneral;
	}	
	
	
	public Long id_asiento_contableFK_IdAsientoContable=-1L;

	public Long getid_asiento_contableFK_IdAsientoContable() {
		return this.id_asiento_contableFK_IdAsientoContable;
	}

	public void setid_asiento_contableFK_IdAsientoContable(Long id_asiento_contableFK_IdAsientoContable) {
		this.id_asiento_contableFK_IdAsientoContable = id_asiento_contableFK_IdAsientoContable;
	}

	public Long id_estructuraFK_IdCierreRolMensual=-1L;

	public Long getid_estructuraFK_IdCierreRolMensual() {
		return this.id_estructuraFK_IdCierreRolMensual;
	}

	public void setid_estructuraFK_IdCierreRolMensual(Long id_estructuraFK_IdCierreRolMensual) {
		this.id_estructuraFK_IdCierreRolMensual = id_estructuraFK_IdCierreRolMensual;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_empleadoFK_IdEstadoEmpleado=-1L;

	public Long getid_estado_empleadoFK_IdEstadoEmpleado() {
		return this.id_estado_empleadoFK_IdEstadoEmpleado;
	}

	public void setid_estado_empleadoFK_IdEstadoEmpleado(Long id_estado_empleadoFK_IdEstadoEmpleado) {
		this.id_estado_empleadoFK_IdEstadoEmpleado = id_estado_empleadoFK_IdEstadoEmpleado;
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
	
	
	public CierreRolMensualLogic getCierreRolMensualLogic()	{		
		return cierrerolmensualLogic;
	}

	public void setCierreRolMensualLogic(CierreRolMensualLogic cierrerolmensualLogic) {
		this.cierrerolmensualLogic = cierrerolmensualLogic;
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
	
	public Boolean getIsEsNuevoCierreRolMensual() {
		return isEsNuevoCierreRolMensual;
	}

	public void setIsEsNuevoCierreRolMensual(Boolean isEsNuevoCierreRolMensual) {
		this.isEsNuevoCierreRolMensual = isEsNuevoCierreRolMensual;
	}

	public Boolean getEsParaAccionDesdeFormularioCierreRolMensual() {
		return esParaAccionDesdeFormularioCierreRolMensual;
	}
	
	public void setEsParaAccionDesdeFormularioCierreRolMensual(Boolean esParaAccionDesdeFormularioCierreRolMensual) {
		this.esParaAccionDesdeFormularioCierreRolMensual = esParaAccionDesdeFormularioCierreRolMensual;
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

			if(this.cierrerolmensualSessionBean==null) {
				this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cierrerolmensualSessionBean.getlidEmpresaActual());
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

			if(this.cierrerolmensualSessionBean==null) {
				this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cierrerolmensualSessionBean.getlidSucursalActual());
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

			if(this.cierrerolmensualSessionBean==null) {
				this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(cierrerolmensualSessionBean.getlidEjercicioActual());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.cierrerolmensualSessionBean==null) {
				this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(cierrerolmensualSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.cierrerolmensualSessionBean==null) {
				this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(cierrerolmensualSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

	public void cargarCombosEstadoEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadoempleadosForeignKey=new ArrayList<EstadoEmpleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoEmpleadoLogic estadoempleadoLogic=new EstadoEmpleadoLogic();

			//estadoempleadoLogic.getEstadoEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.cierrerolmensualSessionBean==null) {
				this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEstadoEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadoempleadoLogic.getEstadoEmpleadoDataAccess().setIsForForeingKeyData(true);

					estadoempleadoLogic.getTodosEstadoEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.estadoempleadosForeignKey=estadoempleadoLogic.getEstadoEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoempleadoLogic.getEntityWithConnection(cierrerolmensualSessionBean.getlidEstadoEmpleadoActual());
					this.estadoempleadosForeignKey.add(estadoempleadoLogic.getEstadoEmpleado());
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

	public void cargarCombosAsientoContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AsientoContableLogic asientocontableLogic=new AsientoContableLogic();

			//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

			if(this.cierrerolmensualSessionBean==null) {
				this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

					asientocontableLogic.getTodosAsientoContablesWithConnection(sFinalQuery,new Pagination());

					this.asientocontablesForeignKey=asientocontableLogic.getAsientoContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAsientoContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(cierrerolmensualSessionBean.getlidAsientoContableActual());
					this.asientocontablesForeignKey.add(asientocontableLogic.getAsientoContable());
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

					if(this.cierrerolmensual!=null) {
						this.cierrerolmensual.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCierreRolMensual.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCierreRolMensualGenerico)throws Exception
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
				jComboBoxid_empresaCierreRolMensualGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCierreRolMensualGenerico!=null && jComboBoxid_empresaCierreRolMensualGenerico.getItemCount()>0) {
					jComboBoxid_empresaCierreRolMensualGenerico.setSelectedIndex(0);
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

					if(this.cierrerolmensual!=null) {
						this.cierrerolmensual.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCierreRolMensual.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCierreRolMensualGenerico)throws Exception
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
				jComboBoxid_sucursalCierreRolMensualGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCierreRolMensualGenerico!=null && jComboBoxid_sucursalCierreRolMensualGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCierreRolMensualGenerico.setSelectedIndex(0);
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

					if(this.cierrerolmensual!=null) {
						this.cierrerolmensual.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioCierreRolMensual.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioCierreRolMensualGenerico)throws Exception
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
				jComboBoxid_ejercicioCierreRolMensualGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioCierreRolMensualGenerico!=null && jComboBoxid_ejercicioCierreRolMensualGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioCierreRolMensualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.cierrerolmensual!=null) {
						this.cierrerolmensual.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoCierreRolMensual.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoCierreRolMensualGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoCierreRolMensualGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoCierreRolMensualGenerico!=null && jComboBoxid_empleadoCierreRolMensualGenerico.getItemCount()>0) {
					jComboBoxid_empleadoCierreRolMensualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.cierrerolmensual!=null) {
						this.cierrerolmensual.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraCierreRolMensual.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCierreRolMensual") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual!=null) {
						jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual!=null) {
							//jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraCierreRolMensualGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraCierreRolMensualGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraCierreRolMensualGenerico!=null && jComboBoxid_estructuraCierreRolMensualGenerico.getItemCount()>0) {
					jComboBoxid_estructuraCierreRolMensualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoEmpleadoForeignKey(Long idEstadoEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoEmpleado  estadoempleadoTemp=null;

			for(EstadoEmpleado estadoempleadoAux:estadoempleadosForeignKey) {
				if(estadoempleadoAux.getId()!=null && estadoempleadoAux.getId().equals(idEstadoEmpleadoSeleccionado)) {
					estadoempleadoTemp=estadoempleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadoempleadoTemp!=null) {

					if(this.cierrerolmensual!=null) {
						this.cierrerolmensual.setEstadoEmpleado(estadoempleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.setSelectedItem(estadoempleadoTemp);
					}
				} else {
					//jComboBoxid_estado_empleadoCierreRolMensual.setSelectedItem(estadoempleadoTemp);
					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadoempleadoTemp!=null && jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual!=null) {
						jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setSelectedItem(estadoempleadoTemp);
					} else {
						if(jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual!=null) {
							//jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setSelectedItem(estadoempleadoTemp);
							if(jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.getItemCount()>0) {
								jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setSelectedIndex(0);
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

	public String getActualEstadoEmpleadoForeignKeyDescripcion(Long idEstadoEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoEmpleado  estadoempleadoTemp=null;

			for(EstadoEmpleado estadoempleadoAux:estadoempleadosForeignKey) {
				if(estadoempleadoAux.getId()!=null && estadoempleadoAux.getId().equals(idEstadoEmpleadoSeleccionado)) {
					estadoempleadoTemp=estadoempleadoAux;
					break;
				}
			}


			sDescripcion=EstadoEmpleadoConstantesFunciones.getEstadoEmpleadoDescripcion(estadoempleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoEmpleadoForeignKeyGenerico(Long idEstadoEmpleadoSeleccionado,JComboBox jComboBoxid_estado_empleadoCierreRolMensualGenerico)throws Exception
	{
		try
		{
			EstadoEmpleado  estadoempleadoTemp=null;

			for(EstadoEmpleado estadoempleadoAux:estadoempleadosForeignKey) {
				if(estadoempleadoAux.getId()!=null && estadoempleadoAux.getId().equals(idEstadoEmpleadoSeleccionado)) {
					estadoempleadoTemp=estadoempleadoAux;
					break;
				}
			}

			if(estadoempleadoTemp!=null) {
				jComboBoxid_estado_empleadoCierreRolMensualGenerico.setSelectedItem(estadoempleadoTemp);
			} else {
				if(jComboBoxid_estado_empleadoCierreRolMensualGenerico!=null && jComboBoxid_estado_empleadoCierreRolMensualGenerico.getItemCount()>0) {
					jComboBoxid_estado_empleadoCierreRolMensualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAsientoContableForeignKey(Long idAsientoContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(asientocontableTemp!=null) {

					if(this.cierrerolmensual!=null) {
						this.cierrerolmensual.setAsientoContable(asientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.setSelectedItem(asientocontableTemp);
					}
				} else {
					//jComboBoxid_asiento_contableCierreRolMensual.setSelectedItem(asientocontableTemp);
					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
						if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.getItemCount()>0) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(asientocontableTemp!=null && jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual!=null) {
						jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.setSelectedItem(asientocontableTemp);
					} else {
						if(jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual!=null) {
							//jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.setSelectedItem(asientocontableTemp);
							if(jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.getItemCount()>0) {
								jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.setSelectedIndex(0);
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

	public String getActualAsientoContableForeignKeyDescripcion(Long idAsientoContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}


			sDescripcion=AsientoContableConstantesFunciones.getAsientoContableDescripcion(asientocontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAsientoContableForeignKeyGenerico(Long idAsientoContableSeleccionado,JComboBox jComboBoxid_asiento_contableCierreRolMensualGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(asientocontableTemp!=null) {
				jComboBoxid_asiento_contableCierreRolMensualGenerico.setSelectedItem(asientocontableTemp);
			} else {
				if(jComboBoxid_asiento_contableCierreRolMensualGenerico!=null && jComboBoxid_asiento_contableCierreRolMensualGenerico.getItemCount()>0) {
					jComboBoxid_asiento_contableCierreRolMensualGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CierreRolMensual cierrerolmensual,JComboBox jComboBoxid_empresaCierreRolMensualGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCierreRolMensualGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCierreRolMensualGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cierrerolmensual.setid_empresa(empresaAux.getId());
				cierrerolmensual.setempresa_descripcion(CierreRolMensualConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cierrerolmensual.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CierreRolMensual cierrerolmensual,JComboBox jComboBoxid_sucursalCierreRolMensualGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCierreRolMensualGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCierreRolMensualGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cierrerolmensual.setid_sucursal(sucursalAux.getId());
				cierrerolmensual.setsucursal_descripcion(CierreRolMensualConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cierrerolmensual.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(CierreRolMensual cierrerolmensual,JComboBox jComboBoxid_ejercicioCierreRolMensualGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioCierreRolMensualGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioCierreRolMensualGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				cierrerolmensual.setid_ejercicio(ejercicioAux.getId());
				cierrerolmensual.setejercicio_descripcion(CierreRolMensualConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				cierrerolmensual.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(CierreRolMensual cierrerolmensual,JComboBox jComboBoxid_empleadoCierreRolMensualGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoCierreRolMensualGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoCierreRolMensualGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				cierrerolmensual.setid_empleado(empleadoAux.getId());
				cierrerolmensual.setempleado_descripcion(CierreRolMensualConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				cierrerolmensual.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(CierreRolMensual cierrerolmensual,JComboBox jComboBoxid_estructuraCierreRolMensualGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraCierreRolMensualGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraCierreRolMensualGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				cierrerolmensual.setid_estructura(estructuraAux.getId());
				cierrerolmensual.setestructura_descripcion(CierreRolMensualConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				cierrerolmensual.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoEmpleadoForeignKey(CierreRolMensual cierrerolmensual,JComboBox jComboBoxid_estado_empleadoCierreRolMensualGenerico)throws Exception
	{
		try
		{
			EstadoEmpleado  estadoempleadoAux=new EstadoEmpleado();

			if(jComboBoxid_estado_empleadoCierreRolMensualGenerico==null) {
				estadoempleadoAux=(EstadoEmpleado)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.getSelectedItem();
			} else {
				estadoempleadoAux=(EstadoEmpleado)jComboBoxid_estado_empleadoCierreRolMensualGenerico.getSelectedItem();
			}

			if(estadoempleadoAux!=null && estadoempleadoAux.getId()!=null) {
				cierrerolmensual.setid_estado_empleado(estadoempleadoAux.getId());
				cierrerolmensual.setestadoempleado_descripcion(CierreRolMensualConstantesFunciones.getEstadoEmpleadoDescripcion(estadoempleadoAux));
				cierrerolmensual.setEstadoEmpleado(estadoempleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAsientoContableForeignKey(CierreRolMensual cierrerolmensual,JComboBox jComboBoxid_asiento_contableCierreRolMensualGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableAux=new AsientoContable();

			if(jComboBoxid_asiento_contableCierreRolMensualGenerico==null) {
				asientocontableAux=(AsientoContable)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.getSelectedItem();
			} else {
				asientocontableAux=(AsientoContable)jComboBoxid_asiento_contableCierreRolMensualGenerico.getSelectedItem();
			}

			if(asientocontableAux!=null && asientocontableAux.getId()!=null) {
				cierrerolmensual.setid_asiento_contable(asientocontableAux.getId());
				cierrerolmensual.setasientocontable_descripcion(CierreRolMensualConstantesFunciones.getAsientoContableDescripcion(asientocontableAux));
				cierrerolmensual.setAsientoContable(asientocontableAux);			}
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

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
					}

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
					}

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
					}

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
					}

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.addItem(empleado);
							}
						}

						if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
					}

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCierreRolMensual") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.addItem(estructura);
							}
						}

						if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.removeAllItems();

							for(EstadoEmpleado estadoempleado:this.estadoempleadosForeignKey) {
								this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.addItem(estadoempleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
					}

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.removeAllItems();

							for(EstadoEmpleado estadoempleado:this.estadoempleadosForeignKey) {
								this.jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.addItem(estadoempleado);
							}
						}

						if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAsientoContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAsientoContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.addItem(asientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { 
					}

					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.addItem(asientocontable);
							}
						}

						if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoEmpleadoForeignKey(EstadoEmpleado estadoempleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.setSelectedItem(estadoempleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setSelectedItem(estadoempleado);
						} else {
							this.jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAsientoContableForeignKey(AsientoContable asientocontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.setSelectedItem(asientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.setSelectedItem(asientocontable);
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCierreRolMensual() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CierreRolMensualConstantesFunciones.refrescarForeignKeysDescripcionesCierreRolMensual(this.cierrerolmensualLogic.getCierreRolMensuals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CierreRolMensualConstantesFunciones.refrescarForeignKeysDescripcionesCierreRolMensual(this.cierrerolmensuals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(EstadoEmpleado.class));
		classes.add(new Classe(AsientoContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cierrerolmensualLogic.setCierreRolMensuals(this.cierrerolmensuals);
			cierrerolmensualLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CierreRolMensualParameterReturnGeneral getCierreRolMensualParameterGeneral() {
		return this.cierrerolmensualParameterGeneral;
	}
	
	public void setCierreRolMensualParameterGeneral(CierreRolMensualParameterReturnGeneral cierrerolmensualParameterGeneral) {
		this.cierrerolmensualParameterGeneral = cierrerolmensualParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCierreRolMensual() {
		return isPermisoTodoCierreRolMensual;
	}

	public void setIsPermisoTodoCierreRolMensual(Boolean isPermisoTodoCierreRolMensual) {
		this.isPermisoTodoCierreRolMensual = isPermisoTodoCierreRolMensual;
	}

	public Boolean getIsPermisoNuevoCierreRolMensual() {
		return isPermisoNuevoCierreRolMensual;
	}

	public void setIsPermisoNuevoCierreRolMensual(Boolean isPermisoNuevoCierreRolMensual) {
		this.isPermisoNuevoCierreRolMensual = isPermisoNuevoCierreRolMensual;
	}

	public Boolean getIsPermisoActualizarCierreRolMensual() {
		return isPermisoActualizarCierreRolMensual;
	}

	public void setIsPermisoActualizarCierreRolMensual(Boolean isPermisoActualizarCierreRolMensual) {
		this.isPermisoActualizarCierreRolMensual = isPermisoActualizarCierreRolMensual;
	}

	public Boolean getIsPermisoEliminarCierreRolMensual() {
		return isPermisoEliminarCierreRolMensual;
	}

	public void setIsPermisoEliminarCierreRolMensual(Boolean isPermisoEliminarCierreRolMensual) {
		this.isPermisoEliminarCierreRolMensual = isPermisoEliminarCierreRolMensual;
	}

	public Boolean getIsPermisoGuardarCambiosCierreRolMensual() {
		return isPermisoGuardarCambiosCierreRolMensual;
	}

	public void setIsPermisoGuardarCambiosCierreRolMensual(Boolean isPermisoGuardarCambiosCierreRolMensual) {
		this.isPermisoGuardarCambiosCierreRolMensual = isPermisoGuardarCambiosCierreRolMensual;
	}
	
	public Boolean getIsPermisoConsultaCierreRolMensual() {
		return isPermisoConsultaCierreRolMensual;
	}

	public void setIsPermisoConsultaCierreRolMensual(Boolean isPermisoConsultaCierreRolMensual) {
		this.isPermisoConsultaCierreRolMensual = isPermisoConsultaCierreRolMensual;
	}

	public Boolean getIsPermisoBusquedaCierreRolMensual() {
		return isPermisoBusquedaCierreRolMensual;
	}

	public void setIsPermisoBusquedaCierreRolMensual(Boolean isPermisoBusquedaCierreRolMensual) {
		this.isPermisoBusquedaCierreRolMensual = isPermisoBusquedaCierreRolMensual;
	}

	public Boolean getIsPermisoReporteCierreRolMensual() {
		return isPermisoReporteCierreRolMensual;
	}

	public void setIsPermisoReporteCierreRolMensual(Boolean isPermisoReporteCierreRolMensual) {
		this.isPermisoReporteCierreRolMensual = isPermisoReporteCierreRolMensual;
	}
	
	public Boolean getIsPermisoPaginacionMedioCierreRolMensual() {
		return isPermisoPaginacionMedioCierreRolMensual;
	}

	public void setIsPermisoPaginacionMedioCierreRolMensual(Boolean isPermisoPaginacionMedioCierreRolMensual) {
		this.isPermisoPaginacionMedioCierreRolMensual = isPermisoPaginacionMedioCierreRolMensual;
	}
	
	public Boolean getIsPermisoPaginacionTodoCierreRolMensual() {
		return isPermisoPaginacionTodoCierreRolMensual;
	}

	public void setIsPermisoPaginacionTodoCierreRolMensual(Boolean isPermisoPaginacionTodoCierreRolMensual) {
		this.isPermisoPaginacionTodoCierreRolMensual = isPermisoPaginacionTodoCierreRolMensual;
	}
	
	public Boolean getIsPermisoPaginacionAltoCierreRolMensual() {
		return isPermisoPaginacionAltoCierreRolMensual;
	}

	public void setIsPermisoPaginacionAltoCierreRolMensual(Boolean isPermisoPaginacionAltoCierreRolMensual) {
		this.isPermisoPaginacionAltoCierreRolMensual = isPermisoPaginacionAltoCierreRolMensual;
	}
	
	public Boolean getIsPermisoCopiarCierreRolMensual() {
		return isPermisoCopiarCierreRolMensual;
	}

	public void setIsPermisoCopiarCierreRolMensual(Boolean isPermisoCopiarCierreRolMensual) {
		this.isPermisoCopiarCierreRolMensual = isPermisoCopiarCierreRolMensual;
	}
	
	public Boolean getIsPermisoVerFormCierreRolMensual() {
		return isPermisoVerFormCierreRolMensual;
	}

	public void setIsPermisoVerFormCierreRolMensual(Boolean isPermisoVerFormCierreRolMensual) {
		this.isPermisoVerFormCierreRolMensual = isPermisoVerFormCierreRolMensual;
	}
	
	public Boolean getIsPermisoDuplicarCierreRolMensual() {
		return isPermisoDuplicarCierreRolMensual;
	}

	public void setIsPermisoDuplicarCierreRolMensual(Boolean isPermisoDuplicarCierreRolMensual) {
		this.isPermisoDuplicarCierreRolMensual = isPermisoDuplicarCierreRolMensual;
	}
	
	public Boolean getIsPermisoOrdenCierreRolMensual() {
		return isPermisoOrdenCierreRolMensual;
	}

	public void setIsPermisoOrdenCierreRolMensual(Boolean isPermisoOrdenCierreRolMensual) {
		this.isPermisoOrdenCierreRolMensual = isPermisoOrdenCierreRolMensual;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCierreRolMensual() {
		return isVisibilidadCeldaNuevoCierreRolMensual;
	}

	public void setIsVisibilidadCeldaNuevoCierreRolMensual(Boolean isVisibilidadCeldaNuevoCierreRolMensual) {
		this.isVisibilidadCeldaNuevoCierreRolMensual = isVisibilidadCeldaNuevoCierreRolMensual;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCierreRolMensual() {
		return isVisibilidadCeldaDuplicarCierreRolMensual;
	}

	public void setIsVisibilidadCeldaDuplicarCierreRolMensual(Boolean isVisibilidadCeldaDuplicarCierreRolMensual) {
		this.isVisibilidadCeldaDuplicarCierreRolMensual = isVisibilidadCeldaDuplicarCierreRolMensual;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCierreRolMensual() {
		return isVisibilidadCeldaCopiarCierreRolMensual;
	}

	public void setIsVisibilidadCeldaCopiarCierreRolMensual(Boolean isVisibilidadCeldaCopiarCierreRolMensual) {
		this.isVisibilidadCeldaCopiarCierreRolMensual = isVisibilidadCeldaCopiarCierreRolMensual;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCierreRolMensual() {
		return isVisibilidadCeldaVerFormCierreRolMensual;
	}

	public void setIsVisibilidadCeldaVerFormCierreRolMensual(Boolean isVisibilidadCeldaVerFormCierreRolMensual) {
		this.isVisibilidadCeldaVerFormCierreRolMensual = isVisibilidadCeldaVerFormCierreRolMensual;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCierreRolMensual() {
		return isVisibilidadCeldaOrdenCierreRolMensual;
	}

	public void setIsVisibilidadCeldaOrdenCierreRolMensual(Boolean isVisibilidadCeldaOrdenCierreRolMensual) {
		this.isVisibilidadCeldaOrdenCierreRolMensual = isVisibilidadCeldaOrdenCierreRolMensual;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCierreRolMensual() {
		return isVisibilidadCeldaNuevoRelacionesCierreRolMensual;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCierreRolMensual(Boolean isVisibilidadCeldaNuevoRelacionesCierreRolMensual) {
		this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual = isVisibilidadCeldaNuevoRelacionesCierreRolMensual;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCierreRolMensual() {
		return isVisibilidadCeldaModificarCierreRolMensual;
	}

	public void setIsVisibilidadCeldaModificarCierreRolMensual(Boolean isVisibilidadCeldaModificarCierreRolMensual) {
		this.isVisibilidadCeldaModificarCierreRolMensual = isVisibilidadCeldaModificarCierreRolMensual;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCierreRolMensual() {
		return isVisibilidadCeldaActualizarCierreRolMensual;
	}

	public void setIsVisibilidadCeldaActualizarCierreRolMensual(Boolean isVisibilidadCeldaActualizarCierreRolMensual) {
		this.isVisibilidadCeldaActualizarCierreRolMensual = isVisibilidadCeldaActualizarCierreRolMensual;
	}

	public Boolean getIsVisibilidadCeldaEliminarCierreRolMensual() {
		return isVisibilidadCeldaEliminarCierreRolMensual;
	}

	public void setIsVisibilidadCeldaEliminarCierreRolMensual(Boolean isVisibilidadCeldaEliminarCierreRolMensual) {
		this.isVisibilidadCeldaEliminarCierreRolMensual = isVisibilidadCeldaEliminarCierreRolMensual;
	}

	public Boolean getIsVisibilidadCeldaCancelarCierreRolMensual() {
		return isVisibilidadCeldaCancelarCierreRolMensual;
	}

	public void setIsVisibilidadCeldaCancelarCierreRolMensual(Boolean isVisibilidadCeldaCancelarCierreRolMensual) {
		this.isVisibilidadCeldaCancelarCierreRolMensual = isVisibilidadCeldaCancelarCierreRolMensual;
	}

	public Boolean getIsVisibilidadCeldaGuardarCierreRolMensual() {
		return isVisibilidadCeldaGuardarCierreRolMensual;
	}

	public void setIsVisibilidadCeldaGuardarCierreRolMensual(Boolean isVisibilidadCeldaGuardarCierreRolMensual) {
		this.isVisibilidadCeldaGuardarCierreRolMensual = isVisibilidadCeldaGuardarCierreRolMensual;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCierreRolMensual() {
		return isVisibilidadCeldaGuardarCambiosCierreRolMensual;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCierreRolMensual(Boolean isVisibilidadCeldaGuardarCambiosCierreRolMensual) {
		this.isVisibilidadCeldaGuardarCambiosCierreRolMensual = isVisibilidadCeldaGuardarCambiosCierreRolMensual;
	}
		
	public CierreRolMensualSessionBean getcierrerolmensualSessionBean() {
		return this.cierrerolmensualSessionBean;
	}
	
	public void setcierrerolmensualSessionBean(CierreRolMensualSessionBean cierrerolmensualSessionBean) {
		this.cierrerolmensualSessionBean=cierrerolmensualSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAsientoContable() {
		return this.isVisibilidadFK_IdAsientoContable;
	}

	public void setisVisibilidadFK_IdAsientoContable(Boolean isVisibilidadFK_IdAsientoContable) {
		this.isVisibilidadFK_IdAsientoContable=isVisibilidadFK_IdAsientoContable;
	}

	public Boolean getisVisibilidadFK_IdCierreRolMensual() {
		return this.isVisibilidadFK_IdCierreRolMensual;
	}

	public void setisVisibilidadFK_IdCierreRolMensual(Boolean isVisibilidadFK_IdCierreRolMensual) {
		this.isVisibilidadFK_IdCierreRolMensual=isVisibilidadFK_IdCierreRolMensual;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoEmpleado() {
		return this.isVisibilidadFK_IdEstadoEmpleado;
	}

	public void setisVisibilidadFK_IdEstadoEmpleado(Boolean isVisibilidadFK_IdEstadoEmpleado) {
		this.isVisibilidadFK_IdEstadoEmpleado=isVisibilidadFK_IdEstadoEmpleado;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(CierreRolMensual cierrerolmensual)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cierrerolmensual,null);
				this.setActualParaGuardarSucursalForeignKey(cierrerolmensual,null);
				this.setActualParaGuardarEjercicioForeignKey(cierrerolmensual,null);
				this.setActualParaGuardarEmpleadoForeignKey(cierrerolmensual,null);
				this.setActualParaGuardarEstructuraForeignKey(cierrerolmensual,null);
				this.setActualParaGuardarEstadoEmpleadoForeignKey(cierrerolmensual,null);
				this.setActualParaGuardarAsientoContableForeignKey(cierrerolmensual,null);
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
	
	public void bugActualizarReferenciaActual(CierreRolMensual cierrerolmensual,CierreRolMensual cierrerolmensualAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCierreRolMensual(cierrerolmensual);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cierrerolmensualAux.setId(cierrerolmensual.getId());
		cierrerolmensualAux.setVersionRow(cierrerolmensual.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCierreRolMensual();
		
			int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cierrerolmensualValidator.getInvalidValues(this.cierrerolmensual);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cierrerolmensualLogic.setDatosCliente(datosCliente);
			cierrerolmensualLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cierrerolmensualAux=new  CierreRolMensual();
				
				cierrerolmensualAux.setIsNew(true);
				cierrerolmensualAux.setIsChanged(true);
				
				cierrerolmensualAux.setCierreRolMensualOriginal(this.cierrerolmensual);
				
				cierrerolmensualAux.setId(this.cierrerolmensual.getId());	
				cierrerolmensualAux.setVersionRow(this.cierrerolmensual.getVersionRow());	
				cierrerolmensualAux.setid_empresa(this.cierrerolmensual.getid_empresa());	
				cierrerolmensualAux.setid_sucursal(this.cierrerolmensual.getid_sucursal());	
				cierrerolmensualAux.setid_ejercicio(this.cierrerolmensual.getid_ejercicio());	
				cierrerolmensualAux.setid_empleado(this.cierrerolmensual.getid_empleado());	
				cierrerolmensualAux.setid_estructura(this.cierrerolmensual.getid_estructura());	
				cierrerolmensualAux.setid_estado_empleado(this.cierrerolmensual.getid_estado_empleado());	
				cierrerolmensualAux.setid_asiento_contable(this.cierrerolmensual.getid_asiento_contable());	
				cierrerolmensualAux.setporcentaje(this.cierrerolmensual.getporcentaje());	
				cierrerolmensualAux.setfecha(this.cierrerolmensual.getfecha());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cierrerolmensualSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cierrerolmensualAux,cierrerolmensualLogic.getCierreRolMensuals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cierrerolmensualAux,cierrerolmensuals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cierrerolmensualSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.saveCierreRolMensuals();//WithConnection
						//cierrerolmensualLogic.getSetVersionRowCierreRolMensuals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cierrerolmensual,cierrerolmensualAux);
					
					this.refrescarForeignKeysDescripcionesCierreRolMensual();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cierrerolmensualLogic.saveCierreRolMensualRelaciones(cierrerolmensualAux);//WithConnection
								//cierrerolmensualLogic.getSetVersionRowCierreRolMensuals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cierrerolmensual,cierrerolmensualAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cierrerolmensualSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cierrerolmensualAux,cierrerolmensualLogic.getCierreRolMensuals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cierrerolmensualAux,cierrerolmensuals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cierrerolmensual,cierrerolmensualAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cierrerolmensualAux=new  CierreRolMensual();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado() 
					|| (this.cierrerolmensualSessionBean.getEsGuardarRelacionado() && this.cierrerolmensual.getId()>=0)) {
						
					cierrerolmensualAux.setIsNew(false);
				}
				
				cierrerolmensualAux.setIsDeleted(false);
			
				cierrerolmensualAux.setId(this.cierrerolmensual.getId());	
				cierrerolmensualAux.setVersionRow(this.cierrerolmensual.getVersionRow());	
				cierrerolmensualAux.setid_empresa(this.cierrerolmensual.getid_empresa());	
				cierrerolmensualAux.setid_sucursal(this.cierrerolmensual.getid_sucursal());	
				cierrerolmensualAux.setid_ejercicio(this.cierrerolmensual.getid_ejercicio());	
				cierrerolmensualAux.setid_empleado(this.cierrerolmensual.getid_empleado());	
				cierrerolmensualAux.setid_estructura(this.cierrerolmensual.getid_estructura());	
				cierrerolmensualAux.setid_estado_empleado(this.cierrerolmensual.getid_estado_empleado());	
				cierrerolmensualAux.setid_asiento_contable(this.cierrerolmensual.getid_asiento_contable());	
				cierrerolmensualAux.setporcentaje(this.cierrerolmensual.getporcentaje());	
				cierrerolmensualAux.setfecha(this.cierrerolmensual.getfecha());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cierrerolmensualAux,cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cierrerolmensualAux,cierrerolmensuals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cierrerolmensualSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.saveCierreRolMensuals();//WithConnection
						//cierrerolmensualLogic.getSetVersionRowCierreRolMensuals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cierrerolmensual,cierrerolmensualAux);
					
					this.refrescarForeignKeysDescripcionesCierreRolMensual();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cierrerolmensualLogic.saveCierreRolMensualRelaciones(cierrerolmensualAux);//WithConnection
								//cierrerolmensualLogic.getSetVersionRowCierreRolMensuals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cierrerolmensual,cierrerolmensualAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cierrerolmensualSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cierrerolmensualAux,cierrerolmensualLogic.getCierreRolMensuals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cierrerolmensualAux,cierrerolmensuals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cierrerolmensual,cierrerolmensualAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cierrerolmensualAux=new  CierreRolMensual();
				
				cierrerolmensualAux.setIsNew(false);
				cierrerolmensualAux.setIsChanged(false);
				
				cierrerolmensualAux.setIsDeleted(true);
				
				cierrerolmensualAux.setId(this.cierrerolmensual.getId());	
				cierrerolmensualAux.setVersionRow(this.cierrerolmensual.getVersionRow());	
				cierrerolmensualAux.setid_empresa(this.cierrerolmensual.getid_empresa());	
				cierrerolmensualAux.setid_sucursal(this.cierrerolmensual.getid_sucursal());	
				cierrerolmensualAux.setid_ejercicio(this.cierrerolmensual.getid_ejercicio());	
				cierrerolmensualAux.setid_empleado(this.cierrerolmensual.getid_empleado());	
				cierrerolmensualAux.setid_estructura(this.cierrerolmensual.getid_estructura());	
				cierrerolmensualAux.setid_estado_empleado(this.cierrerolmensual.getid_estado_empleado());	
				cierrerolmensualAux.setid_asiento_contable(this.cierrerolmensual.getid_asiento_contable());	
				cierrerolmensualAux.setporcentaje(this.cierrerolmensual.getporcentaje());	
				cierrerolmensualAux.setfecha(this.cierrerolmensual.getfecha());	
				
				if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cierrerolmensualAux.getId()>=0) {	
						this.cierrerolmensualsEliminados.add(cierrerolmensualAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cierrerolmensualAux,cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cierrerolmensualAux,cierrerolmensuals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cierrerolmensualSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.saveCierreRolMensuals();//WithConnection
						//cierrerolmensualLogic.getSetVersionRowCierreRolMensuals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cierrerolmensualLogic.saveCierreRolMensualRelaciones(cierrerolmensualAux);//WithConnection
								//cierrerolmensualLogic.getSetVersionRowCierreRolMensuals();//WithConnection
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
							if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cierrerolmensualSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cierrerolmensualAux,cierrerolmensualLogic.getCierreRolMensuals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cierrerolmensualAux,cierrerolmensuals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getCierreRolMensuals().addAll(this.cierrerolmensualsEliminados);
					
					cierrerolmensualLogic.saveCierreRolMensuals();//WithConnection
					//cierrerolmensualLogic.getSetVersionRowCierreRolMensuals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCierreRolMensual();
				
				this.cierrerolmensualsEliminados= new ArrayList<CierreRolMensual>();		
			}
			
			if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cierre Rol Mensual GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cierrerolmensual=cierrerolmensualAux;
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
      		//this.finishProcessCierreRolMensual();
      	}
		
	}	
	
	public void actualizarRelaciones(CierreRolMensual cierrerolmensualLocal) throws Exception {
		
		if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CierreRolMensual cierrerolmensualLocal) throws Exception {	
		if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cierrerolmensualLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cierrerolmensualLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				cierrerolmensualLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				cierrerolmensualLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				cierrerolmensualLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoEmpleadoDetalleFormJInternalFrame.class)) {
				EstadoEmpleadoBeanSwingJInternalFrame estadoempleadoBeanSwingJInternalFrameLocal=(EstadoEmpleadoBeanSwingJInternalFrame) ((EstadoEmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadoempleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoEmpleado(estadoempleadoBeanSwingJInternalFrameLocal.getestadoempleado(),true);
				estadoempleadoBeanSwingJInternalFrameLocal.actualizarLista(estadoempleadoBeanSwingJInternalFrameLocal.estadoempleado,this.estadoempleadosForeignKey);

				estadoempleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(estadoempleadoBeanSwingJInternalFrameLocal.estadoempleado);

				cierrerolmensualLocal.setEstadoEmpleado(estadoempleadoBeanSwingJInternalFrameLocal.estadoempleado);

				this.addItemDefectoCombosForeignKeyEstadoEmpleado();
				this.cargarCombosFrameEstadoEmpleadosForeignKey("Formulario");
				this.setActualEstadoEmpleadoForeignKey(estadoempleadoBeanSwingJInternalFrameLocal.estadoempleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AsientoContableDetalleFormJInternalFrame.class)) {
				AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrameLocal=(AsientoContableBeanSwingJInternalFrame) ((AsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				asientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAsientoContable(asientocontableBeanSwingJInternalFrameLocal.getasientocontable(),true);
				asientocontableBeanSwingJInternalFrameLocal.actualizarLista(asientocontableBeanSwingJInternalFrameLocal.asientocontable,this.asientocontablesForeignKey);

				asientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				cierrerolmensualLocal.setAsientoContable(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey("Formulario");
				this.setActualAsientoContableForeignKey(asientocontableBeanSwingJInternalFrameLocal.asientocontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCierreRolMensualActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cierrerolmensualValidator.getInvalidValues(this.cierrerolmensual);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CierreRolMensual cierrerolmensual,List<CierreRolMensual> cierrerolmensuals) throws Exception {
		try	{		
			CierreRolMensualConstantesFunciones.actualizarLista(cierrerolmensual,cierrerolmensuals,this.cierrerolmensualSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CierreRolMensual cierrerolmensual,List<CierreRolMensual> cierrerolmensuals) throws Exception {
		try	{			
			CierreRolMensualConstantesFunciones.actualizarSelectedLista(cierrerolmensual,cierrerolmensuals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CierreRolMensual> cierrerolmensualsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cierrerolmensualsLocal=this.cierrerolmensualLogic.getCierreRolMensuals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cierrerolmensualsLocal=this.cierrerolmensuals;
			}
			//ARCHITECTURE
		
			for(CierreRolMensual cierrerolmensualLocal:cierrerolmensualsLocal) {
				if(this.permiteMantenimiento(cierrerolmensualLocal) && cierrerolmensualLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CierreRolMensualConstantesFunciones.getCierreRolMensualLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CierreRolMensualConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_empresaCierreRolMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreRolMensualConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_sucursalCierreRolMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreRolMensualConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_ejercicioCierreRolMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreRolMensualConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_empleadoCierreRolMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreRolMensualConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_estructuraCierreRolMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreRolMensualConstantesFunciones.IDESTADOEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_estado_empleadoCierreRolMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreRolMensualConstantesFunciones.IDASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_asiento_contableCierreRolMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreRolMensualConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelporcentajeCierreRolMensual,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CierreRolMensualConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelfechaCierreRolMensual,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_empresaCierreRolMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_sucursalCierreRolMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_ejercicioCierreRolMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_empleadoCierreRolMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_estructuraCierreRolMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_estado_empleadoCierreRolMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreRolMensual.jLabelid_asiento_contableCierreRolMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreRolMensual.jLabelporcentajeCierreRolMensual,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCierreRolMensual.jLabelfechaCierreRolMensual,"");
		
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
		this.iIdNuevoCierreRolMensual--;	
		
		
		this.cierrerolmensualAux=new CierreRolMensual();
		
		this.cierrerolmensualAux.setId(this.iIdNuevoCierreRolMensual);
		this.cierrerolmensualAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cierrerolmensualLogic.getCierreRolMensuals().add(this.cierrerolmensualAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cierrerolmensuals.add(this.cierrerolmensualAux);
		}
		//ARCHITECTURE
		
		this.cierrerolmensual=this.cierrerolmensualAux;
		
		if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCierreRolMensual(this.cierrerolmensual);
			this.setVariablesObjetoActualToFormularioForeignKeyCierreRolMensual(this.cierrerolmensual);
		}
				
		//this.setDefaultControlesCierreRolMensual();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCierreRolMensual();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCierreRolMensual();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCierreRolMensual();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCierreRolMensual(this.cierrerolmensualBean,this.cierrerolmensual,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CierreRolMensualConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {
			classes=CierreRolMensualConstantesFunciones.getClassesRelationshipsOfCierreRolMensual(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cierrerolmensualReturnGeneral=cierrerolmensualLogic.procesarEventosCierreRolMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cierrerolmensualLogic.getCierreRolMensuals(),this.cierrerolmensual,this.cierrerolmensualParameterGeneral,this.isEsNuevoCierreRolMensual,classes);//this.cierrerolmensualLogic.getCierreRolMensual()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCierreRolMensual(this.cierrerolmensualReturnGeneral,this.cierrerolmensualBean,false);
		
		if(this.cierrerolmensualReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCierreRolMensual(this.cierrerolmensualReturnGeneral.getCierreRolMensual());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCierreRolMensual(this.cierrerolmensualReturnGeneral.getCierreRolMensual());
		}
		
		if(this.cierrerolmensualReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCierreRolMensual(this.cierrerolmensualReturnGeneral.getCierreRolMensual(),classes);//this.cierrerolmensualBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCierreRolMensual();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCierreRolMensual();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.RecargarFormCierreRolMensual(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCierreRolMensual(false);
						
			if(cierrerolmensualSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCierreRolMensual();
			}
			
			this.actualizarVisualTableDatosCierreRolMensual();
			
			this.jTableDatosCierreRolMensual.setRowSelectionInterval(this.getIndiceNuevoCierreRolMensual(), this.getIndiceNuevoCierreRolMensual());
			
			this.seleccionarFilaTablaCierreRolMensualActual();
						
			this.actualizarEstadoCeldasBotonesCierreRolMensual("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCierreRolMensual(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCierreRolMensual.jTextFieldporcentajeCierreRolMensual.setEnabled(isHabilitar && this.cierrerolmensualConstantesFunciones.activarporcentajeCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jDateChooserfechaCierreRolMensual.setEnabled(isHabilitar && this.cierrerolmensualConstantesFunciones.activarfechaCierreRolMensual);	
		//
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.setEnabled(isHabilitar && this.cierrerolmensualConstantesFunciones.activarid_empresaCierreRolMensual);//
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.setEnabled(isHabilitar && this.cierrerolmensualConstantesFunciones.activarid_sucursalCierreRolMensual);//
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.setEnabled(isHabilitar && this.cierrerolmensualConstantesFunciones.activarid_ejercicioCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.setEnabled(isHabilitar && this.cierrerolmensualConstantesFunciones.activarid_empleadoCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.setEnabled(isHabilitar && this.cierrerolmensualConstantesFunciones.activarid_estructuraCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.setEnabled(isHabilitar && this.cierrerolmensualConstantesFunciones.activarid_estado_empleadoCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.setEnabled(isHabilitar && this.cierrerolmensualConstantesFunciones.activarid_asiento_contableCierreRolMensual);
	};
	
	public void setDefaultControlesCierreRolMensual() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCierreRolMensual(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cierrerolmensualSessionBean.setConGuardarRelaciones(true);			
			this.cierrerolmensualSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCierreRolMensual.jTabbedPaneRelacionesCierreRolMensual.setVisible(true);
			
					
		} else {
			//this.cierrerolmensualSessionBean.setConGuardarRelaciones(false);			
			this.cierrerolmensualSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCierreRolMensual.jTabbedPaneRelacionesCierreRolMensual.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCierreRolMensual() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensualLogic.getCierreRolMensuals()) {
				if(cierrerolmensualAux.getId().equals(this.iIdNuevoCierreRolMensual)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensuals) {
				if(cierrerolmensualAux.getId().equals(this.iIdNuevoCierreRolMensual)) {
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
	
	public int getIndiceActualCierreRolMensual(CierreRolMensual cierrerolmensual,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensualLogic.getCierreRolMensuals()) {
				if(cierrerolmensualAux.getId().equals(cierrerolmensual.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensuals) {
				if(cierrerolmensualAux.getId().equals(cierrerolmensual.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCierreRolMensual(CierreRolMensual cierrerolmensualOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensualLogic.getCierreRolMensuals()) {
				if(cierrerolmensualAux.getCierreRolMensualOriginal().getId().equals(cierrerolmensualOriginal.getId())) {
					existe=true;
					cierrerolmensualOriginal.setId(cierrerolmensualAux.getId());
					cierrerolmensualOriginal.setVersionRow(cierrerolmensualAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensuals) {
				if(cierrerolmensualAux.getCierreRolMensualOriginal().getId().equals(cierrerolmensualOriginal.getId())) {
					existe=true;
					cierrerolmensualOriginal.setId(cierrerolmensualAux.getId());
					cierrerolmensualOriginal.setVersionRow(cierrerolmensualAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCierreRolMensual(Boolean esParaCancelar) throws Exception {
		cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
		cierrerolmensualAux=new CierreRolMensual();
		
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensualLogic.getCierreRolMensuals()) {
					if(cierrerolmensualAux.getId()<0) {
						cierrerolmensualsAux.add(cierrerolmensualAux);
					}		
				}
				this.iIdNuevoCierreRolMensual=0L;
				this.cierrerolmensualLogic.getCierreRolMensuals().removeAll(cierrerolmensualsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensuals) {
					if(cierrerolmensualAux.getId()<0) {
						cierrerolmensualsAux.add(cierrerolmensualAux);
					}		
				}
				this.iIdNuevoCierreRolMensual=0L;
				this.cierrerolmensuals.removeAll(cierrerolmensualsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCierreRolMensual 
					&& this.cierrerolmensualLogic.getCierreRolMensuals().size()>0
					) {
					cierrerolmensualAux=this.cierrerolmensualLogic.getCierreRolMensuals().get(this.cierrerolmensualLogic.getCierreRolMensuals().size() - 1);
				
					if(cierrerolmensualAux.getId()<0) {
						this.cierrerolmensualLogic.getCierreRolMensuals().remove(cierrerolmensualAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCierreRolMensual && this.cierrerolmensuals.size()>0) {
					cierrerolmensualAux=this.cierrerolmensuals.get(this.cierrerolmensuals.size() - 1);
				
					if(cierrerolmensualAux.getId()<0) {
						this.cierrerolmensuals.remove(cierrerolmensualAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCierreRolMensual(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cierrerolmensual.getId()<0) {
				this.cierrerolmensualLogic.getCierreRolMensuals().remove(this.cierrerolmensual);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cierrerolmensual.getId()<0) {
				this.cierrerolmensuals.remove(this.cierrerolmensual);
			}
		}			
	}
	
	public void setEstadosInicialesCierreRolMensual(List<CierreRolMensual> cierrerolmensualsAux) throws Exception {
		CierreRolMensualConstantesFunciones.setEstadosInicialesCierreRolMensual(cierrerolmensualsAux);
	}
	
	public void setEstadosInicialesCierreRolMensual(CierreRolMensual cierrerolmensualAux) throws Exception {
		CierreRolMensualConstantesFunciones.setEstadosInicialesCierreRolMensual(cierrerolmensualAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCierreRolMensualActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCierreRolMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCierreRolMensualActual()) {
				if(!this.isEsNuevoCierreRolMensual) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCierreRolMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCierreRolMensual=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCierreRolMensualActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cierre Rol Mensual ?", "MANTENIMIENTO DE Cierre Rol Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCierreRolMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CierreRolMensual cierrerolmensual) throws Exception {
		CierreRolMensualConstantesFunciones.seleccionarAsignar(this.cierrerolmensual,cierrerolmensual);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCierreRolMensual=this.isPermisoActualizarOriginalCierreRolMensual;
			
			
			this.seleccionarAsignar(cierrerolmensual);
			
			

			idEmpleadoActual=cierrerolmensual.getid_empleado();
			this.seleccionarEmpleadoActual();

			idAsientoContableActual=cierrerolmensual.getid_asiento_contable();
			this.seleccionarAsientoContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CierreRolMensualConstantesFunciones.quitarEspaciosCierreRolMensual(this.cierrerolmensual,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCierreRolMensual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cierrerolmensualSessionBean.setsFuncionBusquedaRapida(this.cierrerolmensualSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarAsientoContableActual() throws Exception {
		try	{
			AsientoContable asientocontableAux=new AsientoContable();

			if(this.idAsientoContableActual != null && this.idAsientoContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(this.idAsientoContableActual);
					asientocontableAux= asientocontableLogic.getAsientoContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				asientocontablesForeignKey=new ArrayList<AsientoContable>();
				asientocontablesForeignKey.add(asientocontableAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCierreRolMensual) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCierreRolMensual(esParaCancelar);				
				this.cancelarNuevoCierreRolMensual(esParaCancelar);								
			}
			
			this.cierrerolmensual=new CierreRolMensual();
			
			this.inicializarCierreRolMensual();
			
			this.actualizarEstadoCeldasBotonesCierreRolMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCierreRolMensual() throws Exception {
		try {
			CierreRolMensualConstantesFunciones.inicializarCierreRolMensual(this.cierrerolmensual);
			
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
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cierrerolmensualLogic.getCierreRolMensuals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCierreRolMensuals(String sAccionBusqueda,List<CierreRolMensual> cierrerolmensualsParaReportes) throws Exception {
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
					sPathReporteFinal="CierreRolMensual"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CierreRolMensualMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CierreRolMensualMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CierreRolMensual"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cierre Rol Mensuales");		
		parameters.put("busquedapor", CierreRolMensualConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCierreRolMensual=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CierreRolMensualConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CierreRolMensualConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCierreRolMensual=new JRBeanArrayDataSource(CierreRolMensualJInternalFrame.TraerCierreRolMensualBeans(cierrerolmensualsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCierreRolMensual);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CierreRolMensualConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CierreRolMensualConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CierreRolMensualBean.TraerCierreRolMensualBeans(cierrerolmensualsParaReportes).toArray()));
							
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
				this.generarExcelReporteCierreRolMensuals(sAccionBusqueda,sTipoArchivoReporte,cierrerolmensualsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCierreRolMensuals(sAccionBusqueda,sTipoArchivoReporte,cierrerolmensualsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCierreRolMensualActionPerformed(null);
					//this.generarExcelReporteCierreRolMensuals(sAccionBusqueda,sTipoArchivoReporte,cierrerolmensualsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCierreRolMensuals(sAccionBusqueda,sTipoArchivoReporte,cierrerolmensualsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCierreRolMensuals(sAccionBusqueda,sTipoArchivoReporte,cierrerolmensualsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCierreRolMensuals(sAccionBusqueda,sTipoArchivoReporte,cierrerolmensualsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCierreRolMensuals(String sAccionBusqueda,String sTipoArchivoReporte,List<CierreRolMensual> cierrerolmensualsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrerolmensual";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CierreRolMensuals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCierreRolMensual("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CierreRolMensual cierrerolmensual : cierrerolmensualsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CierreRolMensualConstantesFunciones.generarExcelReporteDataCierreRolMensual("NORMAL",row,workbook,cierrerolmensual,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCierreRolMensual(String sTipo,Row row,Workbook workbook) {
		
		CierreRolMensualConstantesFunciones.generarExcelReporteHeaderCierreRolMensual(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCierreRolMensuals(String sAccionBusqueda,String sTipoArchivoReporte,List<CierreRolMensual> cierrerolmensualsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrerolmensual_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CierreRolMensuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CierreRolMensual cierrerolmensual : cierrerolmensualsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CierreRolMensualConstantesFunciones.getCierreRolMensualDescripcion(cierrerolmensual));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrerolmensual.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrerolmensual.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrerolmensual.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrerolmensual.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrerolmensual.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrerolmensual.getestadoempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrerolmensual.getasientocontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrerolmensual.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CierreRolMensualConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cierrerolmensual.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCierreRolMensuals(String sAccionBusqueda,String sTipoArchivoReporte,List<CierreRolMensual> cierrerolmensualsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CierreRolMensual> cierrerolmensualsRespaldo=null;
		
		classes=CierreRolMensualConstantesFunciones.getClassesRelationshipsOfCierreRolMensual(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cierrerolmensualLogic.setDatosCliente(this.datosCliente);
		this.cierrerolmensualLogic.setDatosDeep(this.datosDeep);
		this.cierrerolmensualLogic.setIsConDeep(true);
		
		cierrerolmensualsRespaldo=this.cierrerolmensualLogic.getCierreRolMensuals();
		
		this.cierrerolmensualLogic.setCierreRolMensuals(cierrerolmensualsParaReportes);	
		this.cierrerolmensualLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cierrerolmensualsParaReportes=this.cierrerolmensualLogic.getCierreRolMensuals();
		this.cierrerolmensualLogic.setCierreRolMensuals(cierrerolmensualsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrerolmensual_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CierreRolMensuals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCierreRolMensual("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CierreRolMensual cierrerolmensual : cierrerolmensualsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCierreRolMensual("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CierreRolMensualConstantesFunciones.generarExcelReporteDataCierreRolMensual("NORMAL",row,workbook,cierrerolmensual,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CierreRolMensualConstantesFunciones.getCierreRolMensualDescripcion(cierrerolmensual));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCierreRolMensual.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCierreRolMensual() throws Exception {		
		this.startProcessCierreRolMensual(true);
	}
	
	public void startProcessCierreRolMensual(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCierreRolMensual ,this.jPanelParametrosReportesCierreRolMensual, this.jScrollPanelDatosCierreRolMensual,this.jPanelPaginacionCierreRolMensual, this.jScrollPanelDatosEdicionCierreRolMensual, this.jPanelAccionesCierreRolMensual,this.jPanelAccionesFormularioCierreRolMensual,this.jmenuBarCierreRolMensual,this.jmenuBarDetalleCierreRolMensual,this.jTtoolBarCierreRolMensual,this.jTtoolBarDetalleCierreRolMensual);		
		
		final JTabbedPane jTabbedPaneBusquedasCierreRolMensual=this.jTabbedPaneBusquedasCierreRolMensual; 
		
		final JPanel jPanelParametrosReportesCierreRolMensual=this.jPanelParametrosReportesCierreRolMensual;
		//final JScrollPane jScrollPanelDatosCierreRolMensual=this.jScrollPanelDatosCierreRolMensual;
		final JTable jTableDatosCierreRolMensual=this.jTableDatosCierreRolMensual;		
		final JPanel jPanelPaginacionCierreRolMensual=this.jPanelPaginacionCierreRolMensual;
		//final JScrollPane jScrollPanelDatosEdicionCierreRolMensual=this.jScrollPanelDatosEdicionCierreRolMensual;
		final JPanel jPanelAccionesCierreRolMensual=this.jPanelAccionesCierreRolMensual;
		
		JPanel jPanelCamposAuxiliarCierreRolMensual=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCierreRolMensual=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			jPanelCamposAuxiliarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jPanelCamposCierreRolMensual;
			jPanelAccionesFormularioAuxiliarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jPanelAccionesFormularioCierreRolMensual;
		}
		
		final JPanel jPanelCamposCierreRolMensual=jPanelCamposAuxiliarCierreRolMensual;
		final JPanel jPanelAccionesFormularioCierreRolMensual=jPanelAccionesFormularioAuxiliarCierreRolMensual;
		
		
		final JMenuBar jmenuBarCierreRolMensual=this.jmenuBarCierreRolMensual;
		final JToolBar jTtoolBarCierreRolMensual=this.jTtoolBarCierreRolMensual;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCierreRolMensual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCierreRolMensual=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			jmenuBarDetalleAuxiliarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jmenuBarDetalleCierreRolMensual;
			jTtoolBarDetalleAuxiliarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jTtoolBarDetalleCierreRolMensual;
		}
		
		final JMenuBar jmenuBarDetalleCierreRolMensual=jmenuBarDetalleAuxiliarCierreRolMensual;
		final JToolBar jTtoolBarDetalleCierreRolMensual=jTtoolBarDetalleAuxiliarCierreRolMensual;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCierreRolMensual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCierreRolMensual;
			processRunnable.jTableDatos=jTableDatosCierreRolMensual;
			processRunnable.jPanelCampos=jPanelCamposCierreRolMensual;
			processRunnable.jPanelPaginacion=jPanelPaginacionCierreRolMensual;
			processRunnable.jPanelAcciones=jPanelAccionesCierreRolMensual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCierreRolMensual;
			
			
			processRunnable.jmenuBar=jmenuBarCierreRolMensual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCierreRolMensual;
			processRunnable.jTtoolBar=jTtoolBarCierreRolMensual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCierreRolMensual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCierreRolMensual ,jPanelParametrosReportesCierreRolMensual,jTableDatosCierreRolMensual, /*jScrollPanelDatosCierreRolMensual,*/jPanelCamposCierreRolMensual,jPanelPaginacionCierreRolMensual, /*jScrollPanelDatosEdicionCierreRolMensual,*/ jPanelAccionesCierreRolMensual,jPanelAccionesFormularioCierreRolMensual,jmenuBarCierreRolMensual,jmenuBarDetalleCierreRolMensual,jTtoolBarCierreRolMensual,jTtoolBarDetalleCierreRolMensual);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCierreRolMensual ,jPanelParametrosReportesCierreRolMensual, jScrollPanelDatosCierreRolMensual,jPanelPaginacionCierreRolMensual, jScrollPanelDatosEdicionCierreRolMensual, jPanelAccionesCierreRolMensual,jPanelAccionesFormularioCierreRolMensual,jmenuBarCierreRolMensual,jmenuBarDetalleCierreRolMensual,jTtoolBarCierreRolMensual,jTtoolBarDetalleCierreRolMensual);
						
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
	
	public void finishProcessCierreRolMensual() {// throws Exception 
		this.finishProcessCierreRolMensual(true);
	}
	
	public void finishProcessCierreRolMensual(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCierreRolMensual ,this.jPanelParametrosReportesCierreRolMensual, this.jScrollPanelDatosCierreRolMensual,this.jPanelPaginacionCierreRolMensual, this.jScrollPanelDatosEdicionCierreRolMensual, this.jPanelAccionesCierreRolMensual,this.jPanelAccionesFormularioCierreRolMensual,this.jmenuBarCierreRolMensual,this.jmenuBarDetalleCierreRolMensual,this.jTtoolBarCierreRolMensual,this.jTtoolBarDetalleCierreRolMensual);		
		
		final JTabbedPane jTabbedPaneBusquedasCierreRolMensual=this.jTabbedPaneBusquedasCierreRolMensual; 
		
		final JPanel jPanelParametrosReportesCierreRolMensual=this.jPanelParametrosReportesCierreRolMensual;
		//final JScrollPane jScrollPanelDatosCierreRolMensual=this.jScrollPanelDatosCierreRolMensual;
		final JTable jTableDatosCierreRolMensual=this.jTableDatosCierreRolMensual;		
		final JPanel jPanelPaginacionCierreRolMensual=this.jPanelPaginacionCierreRolMensual;
		//final JScrollPane jScrollPanelDatosEdicionCierreRolMensual=this.jScrollPanelDatosEdicionCierreRolMensual;
		final JPanel jPanelAccionesCierreRolMensual=this.jPanelAccionesCierreRolMensual;
		
		JPanel jPanelCamposAuxiliarCierreRolMensual=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCierreRolMensual=new JPanel();
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			jPanelCamposAuxiliarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jPanelCamposCierreRolMensual;
			jPanelAccionesFormularioAuxiliarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jPanelAccionesFormularioCierreRolMensual;
		}
		
		final JPanel jPanelCamposCierreRolMensual=jPanelCamposAuxiliarCierreRolMensual;
		final JPanel jPanelAccionesFormularioCierreRolMensual=jPanelAccionesFormularioAuxiliarCierreRolMensual;
		
		
		final JMenuBar jmenuBarCierreRolMensual=this.jmenuBarCierreRolMensual;		
		final JToolBar jTtoolBarCierreRolMensual=this.jTtoolBarCierreRolMensual;
				
		JMenuBar jmenuBarDetalleAuxiliarCierreRolMensual=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCierreRolMensual=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			jmenuBarDetalleAuxiliarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jmenuBarDetalleCierreRolMensual;
			jTtoolBarDetalleAuxiliarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jTtoolBarDetalleCierreRolMensual;		
		}
		
		final JMenuBar jmenuBarDetalleCierreRolMensual=jmenuBarDetalleAuxiliarCierreRolMensual;
		final JToolBar jTtoolBarDetalleCierreRolMensual=jTtoolBarDetalleAuxiliarCierreRolMensual;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCierreRolMensual;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCierreRolMensual;
			processRunnable.jTableDatos=jTableDatosCierreRolMensual;
			processRunnable.jPanelCampos=jPanelCamposCierreRolMensual;
			processRunnable.jPanelPaginacion=jPanelPaginacionCierreRolMensual;
			processRunnable.jPanelAcciones=jPanelAccionesCierreRolMensual;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCierreRolMensual;
			
			
			processRunnable.jmenuBar=jmenuBarCierreRolMensual;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCierreRolMensual;
			processRunnable.jTtoolBar=jTtoolBarCierreRolMensual;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCierreRolMensual;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCierreRolMensual ,jPanelParametrosReportesCierreRolMensual, jTableDatosCierreRolMensual,/*jScrollPanelDatosCierreRolMensual,*/jPanelCamposCierreRolMensual,jPanelPaginacionCierreRolMensual, /*jScrollPanelDatosEdicionCierreRolMensual,*/ jPanelAccionesCierreRolMensual,jPanelAccionesFormularioCierreRolMensual,jmenuBarCierreRolMensual,jmenuBarDetalleCierreRolMensual,jTtoolBarCierreRolMensual,jTtoolBarDetalleCierreRolMensual));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCierreRolMensual(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCierreRolMensual(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCierreRolMensual(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCierreRolMensual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCierreRolMensual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCierreRolMensual,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCierreRolMensual(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCierreRolMensual,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCierreRolMensual,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cierrerolmensualConstantesFunciones.getsFinalQueryCierreRolMensual();
		String  finalQueryPaginacionTodos=this.cierrerolmensualConstantesFunciones.getsFinalQueryCierreRolMensual();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CierreRolMensualConstantesFunciones.getArrayColumnasGlobalesNoCierreRolMensual(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CierreRolMensualConstantesFunciones.getArrayColumnasGlobalesCierreRolMensual(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CierreRolMensualConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cierrerolmensualsEliminados= new ArrayList<CierreRolMensual>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCierreRolMensual();
		
				///*CierreRolMensualSessionBean*/this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			
			if(this.cierrerolmensualSessionBean==null) {
				this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
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
					this.iNumeroPaginacion=CierreRolMensualConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CierreRolMensualConstantesFunciones.getClassesForeignKeysOfCierreRolMensual(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cierrerolmensual."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cierrerolmensualsAux= new ArrayList<CierreRolMensual>();
			
				
			cierrerolmensualLogic.setDatosCliente(this.datosCliente);
			cierrerolmensualLogic.setDatosDeep(this.datosDeep);
			cierrerolmensualLogic.setIsConDeep(true);
			
			
			cierrerolmensualLogic.getCierreRolMensualDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cierrerolmensualLogic.getTodosCierreRolMensuals(finalQueryGlobal,pagination);
					
					//cierrerolmensualLogic.getTodosCierreRolMensualsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cierrerolmensualLogic.getCierreRolMensuals()==null|| cierrerolmensualLogic.getCierreRolMensuals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cierrerolmensualsAux= new ArrayList<CierreRolMensual>();
							cierrerolmensualsAux.addAll(cierrerolmensualLogic.getCierreRolMensuals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensualsAux= new ArrayList<CierreRolMensual>();
							cierrerolmensualsAux.addAll(cierrerolmensuals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cierrerolmensualLogic.getTodosCierreRolMensuals(finalQueryGlobal+"",this.pagination);												
							
							//cierrerolmensualLogic.getTodosCierreRolMensualsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCierreRolMensuals("Todos",cierrerolmensualLogic.getCierreRolMensuals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());					
							cierrerolmensualLogic.getCierreRolMensuals().addAll(cierrerolmensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensuals=new ArrayList<CierreRolMensual>();
							cierrerolmensuals.addAll(cierrerolmensualsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCierreRolMensual=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCierreRolMensual=this.idActual;
				
				} else if(this.idCierreRolMensualActual!=null && this.idCierreRolMensualActual!=0L) {
					idCierreRolMensual=idCierreRolMensualActual;
				}
				
					
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndicePorId(idCierreRolMensual);
				
				this.cierrerolmensuals=new ArrayList<CierreRolMensual>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cierrerolmensualLogic.getEntity(idCierreRolMensual);
					
					//cierrerolmensualLogic.getEntityWithConnection(idCierreRolMensual);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
					cierrerolmensualLogic.getCierreRolMensuals().add(cierrerolmensualLogic.getCierreRolMensual());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrerolmensuals=new ArrayList<CierreRolMensual>();
					this.cierrerolmensuals.add(cierrerolmensual);
				}
				
				if(cierrerolmensualLogic.getCierreRolMensual()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAsientoContable")) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrerolmensualLogic.getCierreRolMensualsFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrerolmensualLogic.getCierreRolMensuals()==null||cierrerolmensualLogic.getCierreRolMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrerolmensuals==null|| cierrerolmensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
						cierrerolmensualsAux.addAll(cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
							cierrerolmensualsAux.addAll(cierrerolmensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrerolmensualLogic.getCierreRolMensualsFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreRolMensuals("FK_IdAsientoContable",cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreRolMensuals("FK_IdAsientoContable",cierrerolmensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
						cierrerolmensualLogic.getCierreRolMensuals().addAll(cierrerolmensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensuals=new ArrayList<CierreRolMensual>();
							cierrerolmensuals.addAll(cierrerolmensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCierreRolMensual")) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdCierreRolMensual(id_estructuraFK_IdCierreRolMensual);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrerolmensualLogic.getCierreRolMensualsFK_IdCierreRolMensual(finalQueryGlobal,pagination,id_estructuraFK_IdCierreRolMensual);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdCierreRolMensual(id_estructuraFK_IdCierreRolMensual);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdCierreRolMensual(id_estructuraFK_IdCierreRolMensual);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrerolmensualLogic.getCierreRolMensuals()==null||cierrerolmensualLogic.getCierreRolMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrerolmensuals==null|| cierrerolmensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
						cierrerolmensualsAux.addAll(cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
							cierrerolmensualsAux.addAll(cierrerolmensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrerolmensualLogic.getCierreRolMensualsFK_IdCierreRolMensual(finalQueryGlobal,pagination,id_estructuraFK_IdCierreRolMensual);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdCierreRolMensual(id_estructuraFK_IdCierreRolMensual);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdCierreRolMensual(id_estructuraFK_IdCierreRolMensual);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreRolMensuals("FK_IdCierreRolMensual",cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreRolMensuals("FK_IdCierreRolMensual",cierrerolmensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
						cierrerolmensualLogic.getCierreRolMensuals().addAll(cierrerolmensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensuals=new ArrayList<CierreRolMensual>();
							cierrerolmensuals.addAll(cierrerolmensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrerolmensualLogic.getCierreRolMensualsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrerolmensualLogic.getCierreRolMensuals()==null||cierrerolmensualLogic.getCierreRolMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrerolmensuals==null|| cierrerolmensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
						cierrerolmensualsAux.addAll(cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
							cierrerolmensualsAux.addAll(cierrerolmensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrerolmensualLogic.getCierreRolMensualsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreRolMensuals("FK_IdEjercicio",cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreRolMensuals("FK_IdEjercicio",cierrerolmensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
						cierrerolmensualLogic.getCierreRolMensuals().addAll(cierrerolmensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensuals=new ArrayList<CierreRolMensual>();
							cierrerolmensuals.addAll(cierrerolmensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrerolmensualLogic.getCierreRolMensualsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrerolmensualLogic.getCierreRolMensuals()==null||cierrerolmensualLogic.getCierreRolMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrerolmensuals==null|| cierrerolmensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
						cierrerolmensualsAux.addAll(cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
							cierrerolmensualsAux.addAll(cierrerolmensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrerolmensualLogic.getCierreRolMensualsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreRolMensuals("FK_IdEmpleado",cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreRolMensuals("FK_IdEmpleado",cierrerolmensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
						cierrerolmensualLogic.getCierreRolMensuals().addAll(cierrerolmensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensuals=new ArrayList<CierreRolMensual>();
							cierrerolmensuals.addAll(cierrerolmensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrerolmensualLogic.getCierreRolMensualsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrerolmensualLogic.getCierreRolMensuals()==null||cierrerolmensualLogic.getCierreRolMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrerolmensuals==null|| cierrerolmensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
						cierrerolmensualsAux.addAll(cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
							cierrerolmensualsAux.addAll(cierrerolmensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrerolmensualLogic.getCierreRolMensualsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreRolMensuals("FK_IdEmpresa",cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreRolMensuals("FK_IdEmpresa",cierrerolmensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
						cierrerolmensualLogic.getCierreRolMensuals().addAll(cierrerolmensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensuals=new ArrayList<CierreRolMensual>();
							cierrerolmensuals.addAll(cierrerolmensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoEmpleado")) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEstadoEmpleado(id_estado_empleadoFK_IdEstadoEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrerolmensualLogic.getCierreRolMensualsFK_IdEstadoEmpleado(finalQueryGlobal,pagination,id_estado_empleadoFK_IdEstadoEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEstadoEmpleado(id_estado_empleadoFK_IdEstadoEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEstadoEmpleado(id_estado_empleadoFK_IdEstadoEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrerolmensualLogic.getCierreRolMensuals()==null||cierrerolmensualLogic.getCierreRolMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrerolmensuals==null|| cierrerolmensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
						cierrerolmensualsAux.addAll(cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
							cierrerolmensualsAux.addAll(cierrerolmensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrerolmensualLogic.getCierreRolMensualsFK_IdEstadoEmpleado(finalQueryGlobal,pagination,id_estado_empleadoFK_IdEstadoEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEstadoEmpleado(id_estado_empleadoFK_IdEstadoEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdEstadoEmpleado(id_estado_empleadoFK_IdEstadoEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreRolMensuals("FK_IdEstadoEmpleado",cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreRolMensuals("FK_IdEstadoEmpleado",cierrerolmensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
						cierrerolmensualLogic.getCierreRolMensuals().addAll(cierrerolmensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensuals=new ArrayList<CierreRolMensual>();
							cierrerolmensuals.addAll(cierrerolmensualsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cierrerolmensualLogic.getCierreRolMensualsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cierrerolmensualLogic.getCierreRolMensuals()==null||cierrerolmensualLogic.getCierreRolMensuals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cierrerolmensuals==null|| cierrerolmensuals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
						cierrerolmensualsAux.addAll(cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensualsAux=new ArrayList<CierreRolMensual>();
							cierrerolmensualsAux.addAll(cierrerolmensuals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cierrerolmensualLogic.getCierreRolMensualsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CierreRolMensualConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCierreRolMensuals("FK_IdSucursal",cierrerolmensualLogic.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCierreRolMensuals("FK_IdSucursal",cierrerolmensuals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualLogic.setCierreRolMensuals(new ArrayList<CierreRolMensual>());
						cierrerolmensualLogic.getCierreRolMensuals().addAll(cierrerolmensualsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensuals=new ArrayList<CierreRolMensual>();
							cierrerolmensuals.addAll(cierrerolmensualsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCierreRolMensual();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCierreRolMensual();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cierrerolmensualLogic.getCierreRolMensuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cierrerolmensuals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cierrerolmensualLogic.getCierreRolMensuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cierrerolmensuals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CierreRolMensual cierrerolmensual) {
		Boolean permite=true;
		
		if(this.cierrerolmensual.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CierreRolMensualConstantesFunciones.getOrderByListaCierreRolMensual();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CierreRolMensualConstantesFunciones.getOrderByListaCierreRolMensual();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreRolMensual cierrerolmensual:cierrerolmensualLogic.getCierreRolMensuals()) {
				if(cierrerolmensual.getsType().equals(Constantes2.S_TOTALES)) {
					cierrerolmensualTotales=cierrerolmensual;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreRolMensual cierrerolmensual:this.cierrerolmensuals) {
				if(cierrerolmensual.getsType().equals(Constantes2.S_TOTALES)) {
					cierrerolmensualTotales=cierrerolmensual;
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
			this.cierrerolmensualAux=new CierreRolMensual();
			this.cierrerolmensualAux.setsType(Constantes2.S_TOTALES);
			this.cierrerolmensualAux.setIsNew(false);
			this.cierrerolmensualAux.setIsChanged(false);
			this.cierrerolmensualAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CierreRolMensualConstantesFunciones.TotalizarValoresFilaCierreRolMensual(this.cierrerolmensualLogic.getCierreRolMensuals(),this.cierrerolmensualAux);
				
				this.cierrerolmensualLogic.getCierreRolMensuals().add(this.cierrerolmensualAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CierreRolMensualConstantesFunciones.TotalizarValoresFilaCierreRolMensual(this.cierrerolmensuals,this.cierrerolmensualAux);
				
				this.cierrerolmensuals.add(this.cierrerolmensualAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cierrerolmensualTotales=new CierreRolMensual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cierrerolmensualLogic.getCierreRolMensuals().remove(cierrerolmensualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cierrerolmensuals.remove(cierrerolmensualTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cierrerolmensualTotales=new CierreRolMensual();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CierreRolMensual cierrerolmensual:cierrerolmensualLogic.getCierreRolMensuals()) {
				if(cierrerolmensual.getsType().equals(Constantes2.S_TOTALES)) {
					cierrerolmensualTotales=cierrerolmensual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CierreRolMensualConstantesFunciones.TotalizarValoresFilaCierreRolMensual(this.cierrerolmensualLogic.getCierreRolMensuals(),cierrerolmensualTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CierreRolMensual cierrerolmensual:this.cierrerolmensuals) {
				if(cierrerolmensual.getsType().equals(Constantes2.S_TOTALES)) {
					cierrerolmensualTotales=cierrerolmensual;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CierreRolMensualConstantesFunciones.TotalizarValoresFilaCierreRolMensual(this.cierrerolmensuals,cierrerolmensualTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCierreRolMensualsFK_IdAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCierreRolMensualsFK_IdCierreRolMensual()throws Exception {
		try {
			sAccionBusqueda="FK_IdCierreRolMensual";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCierreRolMensualsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCierreRolMensualsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCierreRolMensualsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCierreRolMensualsFK_IdEstadoEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCierreRolMensualsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCierreRolMensualsFK_IdAsientoContable(String sFinalQuery,Long id_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrerolmensualLogic.getCierreRolMensualsFK_IdAsientoContable(sFinalQuery,this.pagination,id_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCierreRolMensualsFK_IdCierreRolMensual(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrerolmensualLogic.getCierreRolMensualsFK_IdCierreRolMensual(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCierreRolMensualsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrerolmensualLogic.getCierreRolMensualsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCierreRolMensualsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrerolmensualLogic.getCierreRolMensualsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCierreRolMensualsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrerolmensualLogic.getCierreRolMensualsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCierreRolMensualsFK_IdEstadoEmpleado(String sFinalQuery,Long id_estado_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrerolmensualLogic.getCierreRolMensualsFK_IdEstadoEmpleado(sFinalQuery,this.pagination,id_estado_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCierreRolMensualsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrerolmensualLogic.getCierreRolMensualsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCierreRolMensual() {
		this.isPermisoTodoCierreRolMensual=false;
		this.isPermisoNuevoCierreRolMensual=false;
		this.isPermisoActualizarCierreRolMensual=false;
		this.isPermisoActualizarOriginalCierreRolMensual=false;
		this.isPermisoEliminarCierreRolMensual=false;
		this.isPermisoGuardarCambiosCierreRolMensual=false;
		this.isPermisoConsultaCierreRolMensual=false;
		this.isPermisoBusquedaCierreRolMensual=false;
		this.isPermisoReporteCierreRolMensual=false;		
		this.isPermisoOrdenCierreRolMensual=false;		
		this.isPermisoPaginacionMedioCierreRolMensual=false;		
		this.isPermisoPaginacionAltoCierreRolMensual=false;
		this.isPermisoPaginacionTodoCierreRolMensual=false;
		this.isPermisoCopiarCierreRolMensual=false;		
		this.isPermisoVerFormCierreRolMensual=false;		
		this.isPermisoDuplicarCierreRolMensual=false;		
		this.isPermisoOrdenCierreRolMensual=false;		
	}
	
	public void setPermisosUsuarioCierreRolMensual(Boolean isPermiso) {
		this.isPermisoTodoCierreRolMensual=isPermiso;
		this.isPermisoNuevoCierreRolMensual=isPermiso;
		this.isPermisoActualizarCierreRolMensual=isPermiso;
		this.isPermisoActualizarOriginalCierreRolMensual=isPermiso;
		this.isPermisoEliminarCierreRolMensual=isPermiso;
		this.isPermisoGuardarCambiosCierreRolMensual=isPermiso;
		this.isPermisoConsultaCierreRolMensual=isPermiso;
		this.isPermisoBusquedaCierreRolMensual=isPermiso;
		this.isPermisoReporteCierreRolMensual=isPermiso;
		this.isPermisoOrdenCierreRolMensual=isPermiso;		
		this.isPermisoPaginacionMedioCierreRolMensual=isPermiso;		
		this.isPermisoPaginacionAltoCierreRolMensual=isPermiso;		
		this.isPermisoPaginacionTodoCierreRolMensual=isPermiso;		
		this.isPermisoCopiarCierreRolMensual=isPermiso;		
		this.isPermisoVerFormCierreRolMensual=isPermiso;		
		this.isPermisoDuplicarCierreRolMensual=isPermiso;
		this.isPermisoOrdenCierreRolMensual=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCierreRolMensual(Boolean isPermiso) {
		//this.isPermisoTodoCierreRolMensual=isPermiso;
		this.isPermisoNuevoCierreRolMensual=isPermiso;
		this.isPermisoActualizarCierreRolMensual=isPermiso;
		this.isPermisoActualizarOriginalCierreRolMensual=isPermiso;
		this.isPermisoEliminarCierreRolMensual=isPermiso;
		this.isPermisoGuardarCambiosCierreRolMensual=isPermiso;
		//this.isPermisoConsultaCierreRolMensual=isPermiso;
		//this.isPermisoBusquedaCierreRolMensual=isPermiso;
		//this.isPermisoReporteCierreRolMensual=isPermiso;
		//this.isPermisoOrdenCierreRolMensual=isPermiso;		
		//this.isPermisoPaginacionMedioCierreRolMensual=isPermiso;		
		//this.isPermisoPaginacionAltoCierreRolMensual=isPermiso;		
		//this.isPermisoPaginacionTodoCierreRolMensual=isPermiso;		
		//this.isPermisoCopiarCierreRolMensual=isPermiso;		
		//this.isPermisoDuplicarCierreRolMensual=isPermiso;
		//this.isPermisoOrdenCierreRolMensual=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCierreRolMensualClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CierreRolMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCierreRolMensual(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCierreRolMensualClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCierreRolMensualClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCierreRolMensualClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCierreRolMensualClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCierreRolMensual() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CierreRolMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CierreRolMensualConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCierreRolMensual=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCierreRolMensual=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCierreRolMensual=this.isPermisoActualizarCierreRolMensual;
			this.isPermisoEliminarCierreRolMensual=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCierreRolMensual=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCierreRolMensual=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCierreRolMensual=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCierreRolMensual=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCierreRolMensual=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCierreRolMensual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCierreRolMensual=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCierreRolMensual=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCierreRolMensual=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCierreRolMensual=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCierreRolMensual=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCierreRolMensual=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCierreRolMensual=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCierreRolMensual.setToolTipText(this.jTableDatosCierreRolMensual.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCierreRolMensual(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCierreRolMensual(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CierreRolMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CierreRolMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCierreRolMensual() throws Exception {
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
	public void inicializarCombosForeignKeyCierreRolMensualListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.estadoempleadosForeignKey=new ArrayList();
				this.asientocontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCierreRolMensualListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CierreRolMensualJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCierreRolMensualListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadoempleadosForeignKey==null||this.estadoempleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoEmpleadoConstantesFunciones.getArrayColumnasGlobalesEstadoEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoEmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoEmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAsientoContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AsientoContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCierreRolMensualListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CierreRolMensualParameterReturnGeneral cierrerolmensualReturnGeneral=new CierreRolMensualParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cierrerolmensualConstantesFunciones.cargarid_empresaCierreRolMensual)
					 || (this.esRecargarFks && this.cierrerolmensualConstantesFunciones.cargarid_empresaCierreRolMensual)) {

					if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cierrerolmensualSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cierrerolmensualConstantesFunciones.cargarid_sucursalCierreRolMensual)
					 || (this.esRecargarFks && this.cierrerolmensualConstantesFunciones.cargarid_sucursalCierreRolMensual)) {

					if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cierrerolmensualSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.cierrerolmensualConstantesFunciones.cargarid_ejercicioCierreRolMensual)
					 || (this.esRecargarFks && this.cierrerolmensualConstantesFunciones.cargarid_ejercicioCierreRolMensual)) {

					if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+cierrerolmensualSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.cierrerolmensualConstantesFunciones.cargarid_empleadoCierreRolMensual)
					 || (this.esRecargarFks && this.cierrerolmensualConstantesFunciones.cargarid_empleadoCierreRolMensual)) {

					if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+cierrerolmensualSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.cierrerolmensualConstantesFunciones.cargarid_estructuraCierreRolMensual)
					 || (this.esRecargarFks && this.cierrerolmensualConstantesFunciones.cargarid_estructuraCierreRolMensual)) {

					if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+cierrerolmensualSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalEstadoEmpleado="";

				if(((this.estadoempleadosForeignKey==null||this.estadoempleadosForeignKey.size()<=0) && this.cierrerolmensualConstantesFunciones.cargarid_estado_empleadoCierreRolMensual)
					 || (this.esRecargarFks && this.cierrerolmensualConstantesFunciones.cargarid_estado_empleadoCierreRolMensual)) {

					if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEstadoEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoEmpleadoConstantesFunciones.getArrayColumnasGlobalesEstadoEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoEmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoEmpleado, "");
						finalQueryGlobalEstadoEmpleado+=EstadoEmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoEmpleado=" WHERE " + ConstantesSql.ID + "="+cierrerolmensualSessionBean.getlidEstadoEmpleadoActual();
					}
				} else {
					finalQueryGlobalEstadoEmpleado="NONE";
				}


				String finalQueryGlobalAsientoContable="";

				if(((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0) && this.cierrerolmensualConstantesFunciones.cargarid_asiento_contableCierreRolMensual)
					 || (this.esRecargarFks && this.cierrerolmensualConstantesFunciones.cargarid_asiento_contableCierreRolMensual)) {

					if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAsientoContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

						finalQueryGlobalAsientoContable=Funciones.GetFinalQueryAppend(finalQueryGlobalAsientoContable, "");
						finalQueryGlobalAsientoContable+=AsientoContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAsientoContable=" WHERE " + ConstantesSql.ID + "="+cierrerolmensualSessionBean.getlidAsientoContableActual();
					}
				} else {
					finalQueryGlobalAsientoContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cierrerolmensualReturnGeneral=cierrerolmensualLogic.cargarCombosLoteForeignKeyCierreRolMensual(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalEmpleado,finalQueryGlobalEstructura,finalQueryGlobalEstadoEmpleado,finalQueryGlobalAsientoContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cierrerolmensualReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cierrerolmensualReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=cierrerolmensualReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=cierrerolmensualReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=cierrerolmensualReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalEstadoEmpleado.equals("NONE")) {
				this.estadoempleadosForeignKey=cierrerolmensualReturnGeneral.getestadoempleadosForeignKey();
			}

			if(!finalQueryGlobalAsientoContable.equals("NONE")) {
				this.asientocontablesForeignKey=cierrerolmensualReturnGeneral.getasientocontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCierreRolMensual()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEstadoEmpleado();
			this.addItemDefectoCombosForeignKeyAsientoContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cierrerolmensualSessionBean==null) {
				this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoEmpleado()throws Exception {
		try {

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionEstadoEmpleado()) {
				EstadoEmpleado estadoempleado=new EstadoEmpleado();
				EstadoEmpleadoConstantesFunciones.setEstadoEmpleadoDescripcion(estadoempleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadoempleado.setId(null);

				if(!EstadoEmpleadoConstantesFunciones.ExisteEnLista(this.estadoempleadosForeignKey,estadoempleado,true)) {

					this.estadoempleadosForeignKey.add(0,estadoempleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAsientoContable()throws Exception {
		try {

			if(!this.cierrerolmensualSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				AsientoContable asientocontable=new AsientoContable();
				AsientoContableConstantesFunciones.setAsientoContableDescripcion(asientocontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				asientocontable.setId(null);

				if(!AsientoContableConstantesFunciones.ExisteEnLista(this.asientocontablesForeignKey,asientocontable,true)) {

					this.asientocontablesForeignKey.add(0,asientocontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCierreRolMensual()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCierreRolMensual(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCierreRolMensual()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
			
			
				this.cierrerolmensual.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCierreRolMensual();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCierreRolMensual(CierreRolMensual cierrerolmensual)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(cierrerolmensual.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(cierrerolmensual.getid_estructura(),false,"Formulario");
			this.setActualEstadoEmpleadoForeignKey(cierrerolmensual.getid_estado_empleado(),false,"Formulario");
			this.setActualAsientoContableForeignKey(cierrerolmensual.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCierreRolMensual(CierreRolMensual cierrerolmensual,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cierrerolmensual.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoCierreRolMensual")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(cierrerolmensual.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				if(cierrerolmensual.getAsientoContable()!=null && !sTipoEvento.equals("id_asiento_contableCierreRolMensual")) { //sTipoEvento Evita Bucle Infinito

					this.asientocontablesForeignKey=new ArrayList<AsientoContable>();
					this.asientocontablesForeignKey.add(cierrerolmensual.getAsientoContable());

					this.addItemDefectoCombosForeignKeyAsientoContable();
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCierreRolMensual()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.cierrerolmensualConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.cierrerolmensualConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEstadoEmpleadoForeignKey(this.cierrerolmensualConstantesFunciones.getid_estado_empleado(),false,"Formulario");
			this.setActualAsientoContableForeignKey(this.cierrerolmensualConstantesFunciones.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCierreRolMensual()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCierreRolMensual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCierreRolMensual()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCierreRolMensual()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCierreRolMensual()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEstadoEmpleadosForeignKey("Todos");
			this.cargarCombosFrameAsientoContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCierreRolMensual(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCierreRolMensual()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.getItemCount()>0) {
				this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public CierreRolMensualBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CierreRolMensualBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CierreRolMensualBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean(); 
		this.cierrerolmensualConstantesFunciones=new CierreRolMensualConstantesFunciones(); 
		this.cierrerolmensualBean=new CierreRolMensual();//(this.cierrerolmensualConstantesFunciones); 		
		this.cierrerolmensualReturnGeneral=new CierreRolMensualParameterReturnGeneral(); 
		
		this.cierrerolmensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cierrerolmensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CierreRolMensualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CierreRolMensualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CierreRolMensualBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCierreRolMensual(true);
			
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
			
			this.cierrerolmensualConstantesFunciones=new CierreRolMensualConstantesFunciones(); 
			this.cierrerolmensualBean=new CierreRolMensual();//this.cierrerolmensualConstantesFunciones); 			
			this.cierrerolmensualReturnGeneral=new CierreRolMensualParameterReturnGeneral(); 
		
			CierreRolMensualBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cierre Rol Mensual Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cierrerolmensual=new CierreRolMensual();
			this.cierrerolmensuals = new ArrayList<CierreRolMensual>();
			this.cierrerolmensualsAux = new ArrayList<CierreRolMensual>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic=new CierreRolMensualLogic();
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}
			
			//this.cierrerolmensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cierrerolmensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCierreRolMensual);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCierreRolMensual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCierreRolMensual);	
					}
					
					if(this.jInternalFrameImportacionCierreRolMensual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCierreRolMensual);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCierreRolMensual!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCierreRolMensual);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCierreRolMensual);
				this.jInternalFrameDetalleFormCierreRolMensual.setVisible(false);
				this.jInternalFrameDetalleFormCierreRolMensual.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCierreRolMensual!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCierreRolMensual);
					this.jInternalFrameReporteDinamicoCierreRolMensual.setVisible(false);
					this.jInternalFrameReporteDinamicoCierreRolMensual.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCierreRolMensual!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCierreRolMensual);
					this.jInternalFrameImportacionCierreRolMensual.setVisible(false);
					this.jInternalFrameImportacionCierreRolMensual.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCierreRolMensual!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCierreRolMensual);
					this.jInternalFrameOrderByCierreRolMensual.setVisible(false);
					this.jInternalFrameOrderByCierreRolMensual.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCierreRolMensualActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CierreRolMensualConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cierrerolmensualReturnGeneral=new CierreRolMensualParameterReturnGeneral();
			
			this.cierrerolmensualParameterGeneral=new CierreRolMensualParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cierrerolmensualLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CierreRolMensualJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CierreRolMensualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cierrerolmensualSessionBean.getEsGuardarRelacionado(),this.cierrerolmensualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CierreRolMensualConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cierrerolmensualSessionBean.getEsGuardarRelacionado(),this.cierrerolmensualSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCierreRolMensual=false;
			this.isVisibilidadCeldaDuplicarCierreRolMensual=true;
			this.isVisibilidadCeldaCopiarCierreRolMensual=true;
			this.isVisibilidadCeldaVerFormCierreRolMensual=true;
			this.isVisibilidadCeldaOrdenCierreRolMensual=true;
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;
			this.isVisibilidadCeldaModificarCierreRolMensual=false;
			this.isVisibilidadCeldaActualizarCierreRolMensual=false;
			this.isVisibilidadCeldaEliminarCierreRolMensual=false;
			this.isVisibilidadCeldaCancelarCierreRolMensual=false;
			this.isVisibilidadCeldaGuardarCierreRolMensual=false;
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=false;
			
			
			this.isVisibilidadFK_IdAsientoContable=true;
			this.isVisibilidadFK_IdCierreRolMensual=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoEmpleado=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCierreRolMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCierreRolMensual();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCierreRolMensual(false);
			
			this.setPermisosUsuarioCierreRolMensual();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado() 
				|| (this.cierrerolmensualSessionBean.getEsGuardarRelacionado() && this.cierrerolmensualSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCierreRolMensualClasesRelacionadas();
			}
			
			if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCierreRolMensualClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCierreRolMensual();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCierreRolMensual();
			}
			
			if(!this.isPermisoBusquedaCierreRolMensual) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCierreRolMensual.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCierreRolMensual,this.isPermisoPaginacionMedioCierreRolMensual,this.isPermisoPaginacionTodoCierreRolMensual);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CierreRolMensualConstantesFunciones.getTiposSeleccionarCierreRolMensual());
				
				this.tiposColumnasSelect=CierreRolMensualConstantesFunciones.getTiposSeleccionarCierreRolMensual(true);
				
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
			//if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCierreRolMensual();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCierreRolMensual(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCierreRolMensual(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCierreRolMensual() ;
			
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
			this.empleadoLogic=new EmpleadoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.estadoempleadoLogic=new EstadoEmpleadoLogic();
			this.asientocontableLogic=new AsientoContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cierrerolmensualImplementable= (CierreRolMensualImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CierreRolMensualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cierrerolmensualImplementableHome= (CierreRolMensualImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CierreRolMensualConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cierrerolmensuals= new ArrayList<CierreRolMensual>();
			this.cierrerolmensualsEliminados= new ArrayList<CierreRolMensual>();
						
			this.isEsNuevoCierreRolMensual=false;
			this.esParaAccionDesdeFormularioCierreRolMensual=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			this.idAsientoContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.estadoempleadosForeignKey=new ArrayList<EstadoEmpleado>() ;
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCierreRolMensual(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCierreRolMensual();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CierreRolMensualBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CierreRolMensualConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCierreRolMensual("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCierreRolMensual(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCierreRolMensual();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCierreRolMensual();
			}
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCierreRolMensual.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCierreRolMensual.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCierreRolMensual.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCierreRolMensual(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CierreRolMensual: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCierreRolMensual() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCierreRolMensual")) {
				iIndex=this.jInternalFrameDetalleFormCierreRolMensual.jTabbedPaneRelacionesCierreRolMensual.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCierreRolMensual.jTabbedPaneRelacionesCierreRolMensual.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCierreRolMensual();	
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
	
	public void cargarCombosForeignKeyCierreRolMensual(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCierreRolMensual(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCierreRolMensual(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCierreRolMensualListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCierreRolMensual();
		
		this.cargarCombosFrameForeignKeyCierreRolMensual();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCierreRolMensual();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCierreRolMensual();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoEmpleado();
				this.cargarCombosFrameEstadoEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoEmpleado(this.estadoempleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAsientoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCierreRolMensualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
			
			if(jTableDatosCierreRolMensual.getRowCount()>=1) {
				jTableDatosCierreRolMensual.removeRowSelectionInterval(0, jTableDatosCierreRolMensual.getRowCount()-1);						
			}
			
			this.isEsNuevoCierreRolMensual=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCierreRolMensual(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCierreRolMensual(true);			
			//this.cierrerolmensual=new CierreRolMensual();
			//this.cierrerolmensual.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCierreRolMensual(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCierreRolMensual() ;
			
			if(CierreRolMensualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCierreRolMensual(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cierrerolmensual);	
			this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);				
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
			if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CierreRolMensual: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCierreRolMensualActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCierreRolMensual.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCierreRolMensual.getSelectedRows().length;			
			}
			
			cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCierreRolMensual--;			
				//CierreRolMensual cierrerolmensualAux= new CierreRolMensual();			
				//cierrerolmensualAux.setId(this.iIdNuevoCierreRolMensual);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CierreRolMensual cierrerolmensualOrigen=new CierreRolMensual();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CierreRolMensual cierrerolmensualOrigen : cierrerolmensualsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cierrerolmensualOrigen =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cierrerolmensualOrigen =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCierreRolMensual();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cierrerolmensual.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCierreRolMensual(cierrerolmensualOrigen,this.cierrerolmensual,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cierrerolmensualLogic.getCierreRolMensuals().add(this.cierrerolmensualAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cierrerolmensuals.add(this.cierrerolmensualAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCierreRolMensual(false);
				
				this.jTableDatosCierreRolMensual.setRowSelectionInterval(this.getIndiceNuevoCierreRolMensual(), this.getIndiceNuevoCierreRolMensual());
				
				int iLastRow =  this.jTableDatosCierreRolMensual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCierreRolMensual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCierreRolMensual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCierreRolMensual(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();									
		
			CierreRolMensual cierrerolmensualOrigen=new CierreRolMensual();
			CierreRolMensual cierrerolmensualDestino=new CierreRolMensual();
				
			cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCierreRolMensual.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cierrerolmensualsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCierreRolMensual.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualOrigen =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cierrerolmensualOrigen =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cierrerolmensualDestino =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cierrerolmensualDestino =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cierrerolmensualOrigen =cierrerolmensualsSeleccionados.get(0);
				cierrerolmensualDestino =cierrerolmensualsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCierreRolMensual(cierrerolmensualOrigen,cierrerolmensualDestino,true,false);
				
				cierrerolmensualDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cierrerolmensualDestino,cierrerolmensualLogic.getCierreRolMensuals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cierrerolmensualDestino,cierrerolmensuals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCierreRolMensual(false);
				
				//this.jTableDatosCierreRolMensual.setRowSelectionInterval(this.getIndiceNuevoCierreRolMensual(), this.getIndiceNuevoCierreRolMensual());
				
				int iLastRow =  this.jTableDatosCierreRolMensual.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCierreRolMensual.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCierreRolMensual.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCierreRolMensual(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCierreRolMensual.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCierreRolMensual.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCierreRolMensual.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCierreRolMensual.setVisible(!isVisible);
			this.jPanelPaginacionCierreRolMensual.setVisible(!isVisible);
			this.jPanelAccionesCierreRolMensual.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCierreRolMensual();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCierreRolMensual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCierreRolMensual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCierreRolMensual();
			
			this.abrirFrameOrderByCierreRolMensual();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCierreRolMensual();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCierreRolMensual(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCierreRolMensual);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCierreRolMensual.isMaximum()) {
					this.jInternalFrameDetalleFormCierreRolMensual.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCierreRolMensual.setSize(this.jInternalFrameDetalleFormCierreRolMensual.iWidthFormulario,this.jInternalFrameDetalleFormCierreRolMensual.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCierreRolMensual.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCierreRolMensual.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCierreRolMensual.isMaximum()) {
						this.jInternalFrameDetalleFormCierreRolMensual.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCierreRolMensual.jContentPaneDetalleCierreRolMensual.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCierreRolMensual.jTabbedPaneRelacionesCierreRolMensual.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCierreRolMensual.jContentPaneDetalleCierreRolMensual.getWidth(),CierreRolMensualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCierreRolMensual.jTabbedPaneRelacionesCierreRolMensual.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCierreRolMensual.jContentPaneDetalleCierreRolMensual.getWidth(),CierreRolMensualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCierreRolMensual.jTabbedPaneRelacionesCierreRolMensual.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCierreRolMensual.jContentPaneDetalleCierreRolMensual.getWidth(),CierreRolMensualConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCierreRolMensual.setVisible(true);
	        this.jInternalFrameDetalleFormCierreRolMensual.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCierreRolMensual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCierreRolMensual==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCierreRolMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCierreRolMensual,false,this);
				} else {
					this.jInternalFrameOrderByCierreRolMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCierreRolMensual,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCierreRolMensual);
				this.jInternalFrameOrderByCierreRolMensual.setVisible(false);
				this.jInternalFrameOrderByCierreRolMensual.setSelected(false);
				
				this.jInternalFrameOrderByCierreRolMensual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCierreRolMensual"));
				
				this.inicializarActualizarBindingTablaOrderByCierreRolMensual();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCierreRolMensual() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCierreRolMensual==null) {
				
				this.jInternalFrameImportacionCierreRolMensual=new ImportacionJInternalFrame(CierreRolMensualConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCierreRolMensual);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCierreRolMensual);
				this.jInternalFrameImportacionCierreRolMensual.setVisible(false);
				this.jInternalFrameImportacionCierreRolMensual.setSelected(false);


				this.jInternalFrameImportacionCierreRolMensual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCierreRolMensual"));
				this.jInternalFrameImportacionCierreRolMensual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCierreRolMensual"));
				this.jInternalFrameImportacionCierreRolMensual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCierreRolMensual"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCierreRolMensual() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCierreRolMensual==null) {
				this.jInternalFrameReporteDinamicoCierreRolMensual=new ReporteDinamicoJInternalFrame(CierreRolMensualConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCierreRolMensual);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCierreRolMensual);
				this.jInternalFrameReporteDinamicoCierreRolMensual.setVisible(false);
				this.jInternalFrameReporteDinamicoCierreRolMensual.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCierreRolMensual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCierreRolMensual"));
				this.jInternalFrameReporteDinamicoCierreRolMensual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCierreRolMensual"));
				this.jInternalFrameReporteDinamicoCierreRolMensual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCierreRolMensual"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCierreRolMensual();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCierreRolMensual() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCierreRolMensual);
			
	       	this.jInternalFrameDetalleFormCierreRolMensual.setVisible(false);
	        this.jInternalFrameDetalleFormCierreRolMensual.setSelected(false);
			
			//this.jInternalFrameDetalleFormCierreRolMensual.dispose();
			//this.jInternalFrameDetalleFormCierreRolMensual=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCierreRolMensual() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCierreRolMensual.setVisible(true);
	        this.jInternalFrameReporteDinamicoCierreRolMensual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCierreRolMensual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCierreRolMensual.setVisible(true);
	        this.jInternalFrameImportacionCierreRolMensual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCierreRolMensual() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCierreRolMensual.setVisible(true);
	        this.jInternalFrameOrderByCierreRolMensual.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCierreRolMensual() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCierreRolMensual.setVisible(false);
	        this.jInternalFrameOrderByCierreRolMensual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCierreRolMensual() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCierreRolMensual.setVisible(false);
	        this.jInternalFrameReporteDinamicoCierreRolMensual.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCierreRolMensual() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCierreRolMensual.setVisible(false);
	        this.jInternalFrameImportacionCierreRolMensual.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeEstructura(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="Estructura";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructura(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCierreRolMensual(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCierreRolMensual(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCierreRolMensual(true);
			//this.isEsNuevoCierreRolMensual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCierreRolMensual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCierreRolMensual(false) ;
			
			if(cierrerolmensualSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CierreRolMensualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCierreRolMensual(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCierreRolMensual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCierreRolMensualActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCierreRolMensual(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCierreRolMensual(true);
			//this.isEsNuevoCierreRolMensual=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cierrerolmensual.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCierreRolMensual("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCierreRolMensual(false) ;
			
			if(CierreRolMensualJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCierreRolMensual(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCierreRolMensual(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.cierrerolmensualConstantesFunciones.cargarid_empleadoCierreRolMensual) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCierreRolMensual(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
			
			if(sType.equals("AsientoContable")) {
				if(!this.cierrerolmensualConstantesFunciones.cargarid_asiento_contableCierreRolMensual) {
					this.cargarCombosAsientoContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCierreRolMensual(false,false);
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_asiento_contable (id);

				this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCierreRolMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCierreRolMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoEmpleado(List<EstadoEmpleado> estadoempleadosForeignKey)throws Exception{
		TableColumn tableColumnEstadoEmpleado=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO));
		TableCellEditor tableCellEditorEstadoEmpleado =tableColumnEstadoEmpleado.getCellEditor();

		EstadoEmpleadoTableCell estadoempleadoTableCellFk=(EstadoEmpleadoTableCell)tableCellEditorEstadoEmpleado;

		if(estadoempleadoTableCellFk!=null) {
			estadoempleadoTableCellFk.setestadoempleadosForeignKey(estadoempleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCierreRolMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadoempleadoTableCellFk.setRowActual(intSelectedRow);
			//estadoempleadoTableCellFk.setestadoempleadosForeignKeyActual(estadoempleadosForeignKey);
		//}


		if(estadoempleadoTableCellFk!=null) {
			estadoempleadoTableCellFk.RecargarEstadoEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAsientoContable(List<AsientoContable> asientocontablesForeignKey)throws Exception{
		TableColumn tableColumnAsientoContable=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE));
		TableCellEditor tableCellEditorAsientoContable =tableColumnAsientoContable.getCellEditor();

		AsientoContableTableCell asientocontableTableCellFk=(AsientoContableTableCell)tableCellEditorAsientoContable;

		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.setasientocontablesForeignKey(asientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCierreRolMensual.getSelectedRow();

		//if(intSelectedRow<=0) {
			//asientocontableTableCellFk.setRowActual(intSelectedRow);
			//asientocontableTableCellFk.setasientocontablesForeignKeyActual(asientocontablesForeignKey);
		//}


		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.RecargarAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_asiento_contable (Long id) throws Exception {
		this.setActualAsientoContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCierreRolMensual(false);
			
			//if(!this.isEsNuevoCierreRolMensual) {								
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				
			}
			
			if(this.permiteMantenimiento(this.cierrerolmensual)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCierreRolMensual=true;
					this.inicializarActualizarBindingTablaCierreRolMensual(false);
					this.isEsNuevoCierreRolMensual=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCierreRolMensual=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCierreRolMensual=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCierreRolMensual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCierreRolMensual(false);
				
				this.habilitarDeshabilitarControlesCierreRolMensual(false);
			
												
				
				if(CierreRolMensualJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCierreRolMensual();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCierreRolMensualActionPerformed(evt,cierrerolmensualSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCierreRolMensual(this.cierrerolmensual,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCierreRolMensual.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cierrerolmensualSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cierrerolmensual.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				this.cierrerolmensual.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				this.cierrerolmensual.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cierrerolmensual)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CierreRolMensualModel) this.jTableDatosCierreRolMensual.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCierreRolMensual=true;
				this.inicializarActualizarBindingTablaCierreRolMensual(false);
				this.isEsNuevoCierreRolMensual=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCierreRolMensual(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCierreRolMensual(false);
				
				this.habilitarDeshabilitarControlesCierreRolMensual(false);
				
				
				
				if(CierreRolMensualJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCierreRolMensual();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCierreRolMensual.getRowCount()>=1) {
				jTableDatosCierreRolMensual.removeRowSelectionInterval(0, jTableDatosCierreRolMensual.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCierreRolMensual(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCierreRolMensual(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCierreRolMensual(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCierreRolMensual(false) ;
			
			this.isEsNuevoCierreRolMensual=false;
			
			if(CierreRolMensualJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCierreRolMensual();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCierreRolMensual(false);
				
				//SI ES MANUAL
				if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCierreRolMensual();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCierreRolMensual--;			
			//CierreRolMensual cierrerolmensualAux= new CierreRolMensual();			
			//cierrerolmensualAux.setId(this.iIdNuevoCierreRolMensual);
			
			if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCierreRolMensual();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
			
			this.cierrerolmensual.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cierrerolmensualLogic.getCierreRolMensuals().add(this.cierrerolmensualAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cierrerolmensuals.add(this.cierrerolmensualAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCierreRolMensual(false);
			
			this.jTableDatosCierreRolMensual.setRowSelectionInterval(this.getIndiceNuevoCierreRolMensual(), this.getIndiceNuevoCierreRolMensual());
			
			int iLastRow =  this.jTableDatosCierreRolMensual.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCierreRolMensual.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCierreRolMensual.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCierreRolMensual(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCierreRolMensual(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCierreRolMensual(false);
			
			//SI ES MANUAL
			if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCierreRolMensual();
			}
			
			//this.abrirFrameTreeCierreRolMensual();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cierre Rol MensualES ?", "MANTENIMIENTO DE Cierre Rol Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCierreRolMensual.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCierreRolMensual();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cierrerolmensualReturnGeneral=cierrerolmensualLogic.procesarImportacionCierreRolMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cierrerolmensualParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCierreRolMensualReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCierreRolMensual.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCierreRolMensual.setFileImportacion(this.jInternalFrameImportacionCierreRolMensual.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCierreRolMensual.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCierreRolMensual.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCierreRolMensual.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCierreRolMensual.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();		

		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CierreRolMensualBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CierreRolMensualBaseDesign.jrxml";
			
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
			
			this.generarReporteCierreRolMensuals("Todos",cierrerolmensualsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoEmpleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CierreRolMensualConstantesFunciones.LABEL_FECHA:
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
		
		if(this.jInternalFrameReporteDinamicoCierreRolMensual.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO:
					sNombreCampoCategoria="id_estado_empleado";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoria="id_asiento_contable";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO:
					sNombreCampoCategoriaValor="id_estado_empleado";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_asiento_contable";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case CierreRolMensualConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_empleado");
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_asiento_contable");
					break;

				case CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case CierreRolMensualConstantesFunciones.LABEL_FECHA:
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
	
	public void jButtonGenerarExcelReporteDinamicoCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();		
		
		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrerolmensual";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CierreRolMensuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CierreRolMensual cierrerolmensual:cierrerolmensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrerolmensual.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CierreRolMensual cierrerolmensual:cierrerolmensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrerolmensual.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(CierreRolMensual cierrerolmensual:cierrerolmensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrerolmensual.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(CierreRolMensual cierrerolmensual:cierrerolmensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrerolmensual.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(CierreRolMensual cierrerolmensual:cierrerolmensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrerolmensual.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO);
					iRow++;

					for(CierreRolMensual cierrerolmensual:cierrerolmensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrerolmensual.getestadoempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE);
					iRow++;

					for(CierreRolMensual cierrerolmensual:cierrerolmensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrerolmensual.getasientocontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(CierreRolMensual cierrerolmensual:cierrerolmensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrerolmensual.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CierreRolMensualConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(CierreRolMensual cierrerolmensual:cierrerolmensualsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cierrerolmensual.getfecha());
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
			//	this.getFilaCabeceraExportarExcelCierreRolMensual(row);				
			//	iRow++;
			//}				
			
			//for(CierreRolMensual cierrerolmensualAux:cierrerolmensualsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCierreRolMensual(cierrerolmensualAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
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
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCierreRolMensual(false);
			
			//SI ES MANUAL
			if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCierreRolMensual();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCierreRolMensual(false);
			
			//SI ES MANUAL
			if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCierreRolMensual();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCierreRolMensual(false);
			
			//SI ES MANUAL
			if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCierreRolMensual();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCierreRolMensual() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCierreRolMensual.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCierreRolMensual.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCierreRolMensual.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCierreRolMensual.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCierreRolMensual.setMinimumSize(dimensionMinimum);
		this.jTableDatosCierreRolMensual.setMaximumSize(dimensionMaximum);
		this.jTableDatosCierreRolMensual.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCierreRolMensual(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCierreRolMensual(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCierreRolMensual(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCierreRolMensual(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCierreRolMensual(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCierreRolMensual(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCierreRolMensual(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCierreRolMensual(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCierreRolMensual() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCierreRolMensual();
		
		this.inicializarActualizarBindingBotonesManualCierreRolMensual(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCierreRolMensual();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCierreRolMensual() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCierreRolMensual(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCierreRolMensual(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCierreRolMensual.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCierreRolMensual.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCierreRolMensual.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCierreRolMensual.jCheckBoxPostAccionNuevoCierreRolMensual.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCierreRolMensual.jCheckBoxPostAccionSinCerrarCierreRolMensual.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCierreRolMensual.jCheckBoxPostAccionSinMensajeCierreRolMensual.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCierreRolMensual.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCierreRolMensual.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCierreRolMensual.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
				this.jInternalFrameDetalleFormCierreRolMensual.jCheckBoxPostAccionNuevoCierreRolMensual.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCierreRolMensual.jCheckBoxPostAccionSinCerrarCierreRolMensual.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCierreRolMensual.jCheckBoxPostAccionSinMensajeCierreRolMensual.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCierreRolMensual.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCierreRolMensual.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCierreRolMensual.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCierreRolMensual!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCierreRolMensual.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCierreRolMensual.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCierreRolMensual.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCierreRolMensual.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCierreRolMensual!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCierreRolMensual.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCierreRolMensual.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCierreRolMensual(Boolean esInicializar) throws Exception {
		try	{	
			if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCierreRolMensual(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCierreRolMensual() throws Exception {
		try	{
			if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCierreRolMensual();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCierreRolMensual() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCierreRolMensual() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCierreRolMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCierreRolMensual.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCierreRolMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCierreRolMensual.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCierreRolMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCierreRolMensual.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCierreRolMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCierreRolMensual.addItem(reporte);
			}
			
			
			if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCierreRolMensual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCierreRolMensual.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCierreRolMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCierreRolMensual.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCierreRolMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCierreRolMensual.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCierreRolMensual.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCierreRolMensual.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCierreRolMensual.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCierreRolMensual();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCierreRolMensual() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCierreRolMensual!=null) {
				this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCierreRolMensual!=null) {
				this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCierreRolMensual.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCierreRolMensual!=null) {
				
				if(this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCierreRolMensual.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCierreRolMensual.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCierreRolMensual.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCierreRolMensual.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCierreRolMensual()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.getSelectedItem()!=null){this.id_asiento_contableFK_IdAsientoContable=((AsientoContable)this.jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.getSelectedItem()!=null){this.id_estructuraFK_IdCierreRolMensual=((Estructura)this.jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.getSelectedItem()!=null){this.id_estado_empleadoFK_IdEstadoEmpleado=((EstadoEmpleado)this.jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCierreRolMensual(Boolean esInicializar) throws Exception {				
		if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCierreRolMensual();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCierreRolMensual() throws Exception {
		this.inicializarActualizarBindingTablaCierreRolMensual(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCierreRolMensual() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCierreRolMensualOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensualOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCierreRolMensual(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cierrerolmensualLogic.getCierreRolMensuals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cierrerolmensuals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCierreRolMensual.setModel(new CierreRolMensualModel(this.cierrerolmensualLogic.getCierreRolMensuals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCierreRolMensual.setModel(new CierreRolMensualModel(this.cierrerolmensuals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCierreRolMensual!=null && this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCierreRolMensual();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO,cierrerolmensualConstantesFunciones.resaltarSeleccionarCierreRolMensual,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO,cierrerolmensualConstantesFunciones.resaltarSeleccionarCierreRolMensual,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_ID));

		if(this.cierrerolmensualConstantesFunciones.mostraridCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cierrerolmensualConstantesFunciones.resaltaridCierreRolMensual,this.cierrerolmensualConstantesFunciones.activaridCierreRolMensual,this,true,"idCierreRolMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cierrerolmensualConstantesFunciones.resaltaridCierreRolMensual,this.cierrerolmensualConstantesFunciones.activaridCierreRolMensual,this,true,"idCierreRolMensual","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cierrerolmensualConstantesFunciones.mostrarid_empresaCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_empresaCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_empresaCierreRolMensual));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_empresaCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_empresaCierreRolMensual,false,"id_empresaCierreRolMensual","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cierrerolmensualConstantesFunciones.mostrarid_sucursalCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_sucursalCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_sucursalCierreRolMensual));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_sucursalCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_sucursalCierreRolMensual,false,"id_sucursalCierreRolMensual","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.cierrerolmensualConstantesFunciones.mostrarid_ejercicioCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_ejercicioCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_ejercicioCierreRolMensual));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_ejercicioCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_ejercicioCierreRolMensual,false,"id_ejercicioCierreRolMensual","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.cierrerolmensualConstantesFunciones.mostrarid_empleadoCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_empleadoCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_empleadoCierreRolMensual));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_empleadoCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_empleadoCierreRolMensual,true,"id_empleadoCierreRolMensual","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.cierrerolmensualConstantesFunciones.mostrarid_estructuraCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_estructuraCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_estructuraCierreRolMensual));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_estructuraCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_estructuraCierreRolMensual,true,"id_estructuraCierreRolMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO));

		if(this.cierrerolmensualConstantesFunciones.mostrarid_estado_empleadoCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoEmpleadoTableCell(this.estadoempleadosForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_estado_empleadoCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_estado_empleadoCierreRolMensual));
			tableColumn.setCellEditor(new EstadoEmpleadoTableCell(this.estadoempleadosForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_estado_empleadoCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_estado_empleadoCierreRolMensual,true,"id_estado_empleadoCierreRolMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE));

		if(this.cierrerolmensualConstantesFunciones.mostrarid_asiento_contableCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AsientoContableTableCell(this.asientocontablesForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_asiento_contableCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_asiento_contableCierreRolMensual));
			tableColumn.setCellEditor(new AsientoContableTableCell(this.asientocontablesForeignKey,this.cierrerolmensualConstantesFunciones.resaltarid_asiento_contableCierreRolMensual,this,this.cierrerolmensualConstantesFunciones.activarid_asiento_contableCierreRolMensual,true,"id_asiento_contableCierreRolMensual","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE));

		if(this.cierrerolmensualConstantesFunciones.mostrarporcentajeCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cierrerolmensualConstantesFunciones.resaltarporcentajeCierreRolMensual,this.cierrerolmensualConstantesFunciones.activarporcentajeCierreRolMensual,this,true,"porcentajeCierreRolMensual","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cierrerolmensualConstantesFunciones.resaltarporcentajeCierreRolMensual,this.cierrerolmensualConstantesFunciones.activarporcentajeCierreRolMensual,this,true,"porcentajeCierreRolMensual","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,CierreRolMensualConstantesFunciones.LABEL_FECHA));

		if(this.cierrerolmensualConstantesFunciones.mostrarfechaCierreRolMensual && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CierreRolMensualConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cierrerolmensualConstantesFunciones.resaltarfechaCierreRolMensual,this.cierrerolmensualConstantesFunciones.activarfechaCierreRolMensual,this,true,"fechaCierreRolMensual","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cierrerolmensualConstantesFunciones.resaltarfechaCierreRolMensual,this.cierrerolmensualConstantesFunciones.activarfechaCierreRolMensual,this,true,"fechaCierreRolMensual","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CierreRolMensualPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cierrerolmensualSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cierrerolmensualSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCierreRolMensual.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cierrerolmensualSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cierrerolmensualSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCierreRolMensual.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cierrerolmensualSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cierrerolmensualSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCierreRolMensual.addColumn(tableColumn);
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
			
			this.jTableDatosCierreRolMensual.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCierreRolMensual.moveColumn(this.jTableDatosCierreRolMensual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCierreRolMensual.moveColumn(this.jTableDatosCierreRolMensual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCierreRolMensual.moveColumn(this.jTableDatosCierreRolMensual.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCierreRolMensual.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCierreRolMensual.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCierreRolMensual,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCierreRolMensual.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCierreRolMensual.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCierreRolMensual.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCierreRolMensual.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCierreRolMensual.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cierrerolmensualLogic.getCierreRolMensuals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cierrerolmensuals.size()-1;
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
		//this.jTableDatosCierreRolMensual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCierreRolMensual.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCierreRolMensual();
			
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
				
				//this.isEsNuevoCierreRolMensual=false;
					
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
				if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCierreRolMensual==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCierreRolMensual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCierreRolMensual.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cierrerolmensual.getsType().equals("DUPLICADO")
				   || this.cierrerolmensual.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCierreRolMensual=true;
				
				} else {
					this.isEsNuevoCierreRolMensual=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
					if(this.cierrerolmensual.getId()>=0 && !this.cierrerolmensual.getIsNew()) {						
						this.isEsNuevoCierreRolMensual=false;
						
					} else {
						this.isEsNuevoCierreRolMensual=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCierreRolMensual(esRelaciones);						
				
				this.seleccionarCierreRolMensual(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cierrerolmensual.getId()<0) {
					this.isEsNuevoCierreRolMensual=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCierreRolMensual(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCierreRolMensual(evt,rowIndex);
				}	
				
				if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CierreRolMensual: " + this.dDif); 
					}
				}								
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCierreRolMensual(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cierrerolmensual)) {
					if(this.cierrerolmensual.getId()>0) {
						this.cierrerolmensual.setIsDeleted(true);
						
						this.cierrerolmensualsEliminados.add(this.cierrerolmensual);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cierrerolmensualLogic.getCierreRolMensuals().remove(this.cierrerolmensual);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cierrerolmensuals.remove(this.cierrerolmensual);				
					}
					
					
					((CierreRolMensualModel) this.jTableDatosCierreRolMensual.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCierreRolMensual(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCierreRolMensual(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCierreRolMensual) {
			
			if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCierreRolMensual.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCierreRolMensual.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCierreRolMensual(this.cierrerolmensual);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cierrerolmensualConstantesFunciones.cargarid_empresaCierreRolMensual || this.cierrerolmensualConstantesFunciones.event_dependid_empresaCierreRolMensual) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cierrerolmensual.getid_empresa());
									//this.inicializarActualizarBindingCierreRolMensual(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cierrerolmensual.getEmpresa()!=null) {
							this.empresasForeignKey.add(cierrerolmensual.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cierrerolmensual.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cierrerolmensualConstantesFunciones.cargarid_sucursalCierreRolMensual || this.cierrerolmensualConstantesFunciones.event_dependid_sucursalCierreRolMensual) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cierrerolmensual.getid_sucursal());
									//this.inicializarActualizarBindingCierreRolMensual(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cierrerolmensual.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cierrerolmensual.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cierrerolmensual.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.cierrerolmensualConstantesFunciones.cargarid_ejercicioCierreRolMensual || this.cierrerolmensualConstantesFunciones.event_dependid_ejercicioCierreRolMensual) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.cierrerolmensual.getid_ejercicio());
									//this.inicializarActualizarBindingCierreRolMensual(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(cierrerolmensual.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(cierrerolmensual.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.cierrerolmensual.getid_ejercicio(),false,"Formulario");

					//Empleado
					if(!this.cierrerolmensualConstantesFunciones.cargarid_empleadoCierreRolMensual || this.cierrerolmensualConstantesFunciones.event_dependid_empleadoCierreRolMensual) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.cierrerolmensual.getid_empleado());
									//this.inicializarActualizarBindingCierreRolMensual(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(cierrerolmensual.getEmpleado()!=null) {
							this.empleadosForeignKey.add(cierrerolmensual.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.cierrerolmensual.getid_empleado(),false,"Formulario");

					//Estructura
					if(!this.cierrerolmensualConstantesFunciones.cargarid_estructuraCierreRolMensual || this.cierrerolmensualConstantesFunciones.event_dependid_estructuraCierreRolMensual) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.cierrerolmensual.getid_estructura());
									//this.inicializarActualizarBindingCierreRolMensual(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(cierrerolmensual.getEstructura()!=null) {
							this.estructurasForeignKey.add(cierrerolmensual.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.cierrerolmensual.getid_estructura(),false,"Formulario");

					//EstadoEmpleado
					if(!this.cierrerolmensualConstantesFunciones.cargarid_estado_empleadoCierreRolMensual || this.cierrerolmensualConstantesFunciones.event_dependid_estado_empleadoCierreRolMensual) {
						//this.cargarCombosEstadoEmpleadosForeignKeyLista(" where id="+this.cierrerolmensual.getid_estado_empleado());
									//this.inicializarActualizarBindingCierreRolMensual(false,false);
						this.estadoempleadosForeignKey=new ArrayList<EstadoEmpleado>();

						if(cierrerolmensual.getEstadoEmpleado()!=null) {
							this.estadoempleadosForeignKey.add(cierrerolmensual.getEstadoEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEstadoEmpleado();
						this.cargarCombosFrameEstadoEmpleadosForeignKey("Todos");
					}
					this.setActualEstadoEmpleadoForeignKey(this.cierrerolmensual.getid_estado_empleado(),false,"Formulario");

					//AsientoContable
					if(!this.cierrerolmensualConstantesFunciones.cargarid_asiento_contableCierreRolMensual || this.cierrerolmensualConstantesFunciones.event_dependid_asiento_contableCierreRolMensual) {
						//this.cargarCombosAsientoContablesForeignKeyLista(" where id="+this.cierrerolmensual.getid_asiento_contable());
									//this.inicializarActualizarBindingCierreRolMensual(false,false);
						this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

						if(cierrerolmensual.getAsientoContable()!=null) {
							this.asientocontablesForeignKey.add(cierrerolmensual.getAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyAsientoContable();
						this.cargarCombosFrameAsientoContablesForeignKey("Todos");
					}
					this.setActualAsientoContableForeignKey(this.cierrerolmensual.getid_asiento_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCierreRolMensual("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCierreRolMensual(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCierreRolMensual() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCierreRolMensual(CierreRolMensual cierrerolmensual) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCierreRolMensual(cierrerolmensual,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCierreRolMensual(CierreRolMensual cierrerolmensual,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCierreRolMensual(cierrerolmensual);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCierreRolMensual(cierrerolmensual,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCierreRolMensual(cierrerolmensual);
	}
	
	public void setVariablesObjetoActualToFormularioCierreRolMensual(CierreRolMensual cierrerolmensual) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.setText(cierrerolmensual.getId().toString());
			this.jInternalFrameDetalleFormCierreRolMensual.jTextFieldporcentajeCierreRolMensual.setText(cierrerolmensual.getporcentaje().toString());
			this.jInternalFrameDetalleFormCierreRolMensual.jDateChooserfechaCierreRolMensual.setDate(cierrerolmensual.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CierreRolMensual cierrerolmensualLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cierrerolmensualLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CierreRolMensual cierrerolmensualLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cierrerolmensualLocal=this.cierrerolmensual;
			} else {
				cierrerolmensualLocal=this.cierrerolmensualAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cierrerolmensualLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCierreRolMensual(cierrerolmensualLocal,true);
					
					if(cierrerolmensualSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cierrerolmensualLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cierrerolmensualLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCierreRolMensual(CierreRolMensual cierrerolmensual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCierreRolMensual(cierrerolmensual,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(cierrerolmensual);
	}
	
	public void setVariablesFormularioToObjetoActualCierreRolMensual(CierreRolMensual cierrerolmensual,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCierreRolMensual(cierrerolmensual,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCierreRolMensual(CierreRolMensual cierrerolmensual,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.getText()==null || this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.getText()=="" || this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.getText()=="Id") {
				this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.setText("0");
			}

			if(conColumnasBase) {cierrerolmensual.setId(Long.parseLong(this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CierreRolMensualConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelIdCierreRolMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cierrerolmensual.setporcentaje(Integer.parseInt(this.jInternalFrameDetalleFormCierreRolMensual.jTextFieldporcentajeCierreRolMensual.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelporcentajeCierreRolMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cierrerolmensual.setfecha(this.jInternalFrameDetalleFormCierreRolMensual.jDateChooserfechaCierreRolMensual.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CierreRolMensualConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCierreRolMensual.jLabelfechaCierreRolMensual,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCierreRolMensual(CierreRolMensual cierrerolmensualBean,CierreRolMensual cierrerolmensual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cierrerolmensualBean.getid_empleado()!=null && !cierrerolmensualBean.getid_empleado().equals(-1L))) {cierrerolmensual.setid_empleado(cierrerolmensualBean.getid_empleado());}
			if(conDefault || (!conDefault && cierrerolmensualBean.getid_estructura()!=null && !cierrerolmensualBean.getid_estructura().equals(-1L))) {cierrerolmensual.setid_estructura(cierrerolmensualBean.getid_estructura());}
			if(conDefault || (!conDefault && cierrerolmensualBean.getid_estado_empleado()!=null && !cierrerolmensualBean.getid_estado_empleado().equals(-1L))) {cierrerolmensual.setid_estado_empleado(cierrerolmensualBean.getid_estado_empleado());}
			if(conDefault || (!conDefault && cierrerolmensualBean.getid_asiento_contable()!=null && !cierrerolmensualBean.getid_asiento_contable().equals(-1L))) {cierrerolmensual.setid_asiento_contable(cierrerolmensualBean.getid_asiento_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCierreRolMensual(CierreRolMensual cierrerolmensualOrigen,CierreRolMensual cierrerolmensual,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cierrerolmensualOrigen.getId()!=null && !cierrerolmensualOrigen.getId().equals(0L))) {cierrerolmensual.setId(cierrerolmensualOrigen.getId());}}
			if(conDefault || (!conDefault && cierrerolmensualOrigen.getid_empleado()!=null && !cierrerolmensualOrigen.getid_empleado().equals(-1L))) {cierrerolmensual.setid_empleado(cierrerolmensualOrigen.getid_empleado());}
			if(conDefault || (!conDefault && cierrerolmensualOrigen.getid_estructura()!=null && !cierrerolmensualOrigen.getid_estructura().equals(-1L))) {cierrerolmensual.setid_estructura(cierrerolmensualOrigen.getid_estructura());}
			if(conDefault || (!conDefault && cierrerolmensualOrigen.getid_estado_empleado()!=null && !cierrerolmensualOrigen.getid_estado_empleado().equals(-1L))) {cierrerolmensual.setid_estado_empleado(cierrerolmensualOrigen.getid_estado_empleado());}
			if(conDefault || (!conDefault && cierrerolmensualOrigen.getid_asiento_contable()!=null && !cierrerolmensualOrigen.getid_asiento_contable().equals(-1L))) {cierrerolmensual.setid_asiento_contable(cierrerolmensualOrigen.getid_asiento_contable());}
			if(conDefault || (!conDefault && cierrerolmensualOrigen.getporcentaje()!=null && !cierrerolmensualOrigen.getporcentaje().equals(0))) {cierrerolmensual.setporcentaje(cierrerolmensualOrigen.getporcentaje());}
			if(conDefault || (!conDefault && cierrerolmensualOrigen.getfecha()!=null && !cierrerolmensualOrigen.getfecha().equals(new Date()))) {cierrerolmensual.setfecha(cierrerolmensualOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCierreRolMensual(CierreRolMensual cierrerolmensual) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.setText(cierrerolmensual.getId().toString());
			this.jInternalFrameDetalleFormCierreRolMensual.jTextFieldporcentajeCierreRolMensual.setText(cierrerolmensual.getporcentaje().toString());
			this.jInternalFrameDetalleFormCierreRolMensual.jDateChooserfechaCierreRolMensual.setDate(cierrerolmensual.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCierreRolMensual(CierreRolMensualBean cierrerolmensualBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.setText(cierrerolmensualBean.getId().toString());
			this.jInternalFrameDetalleFormCierreRolMensual.jTextFieldporcentajeCierreRolMensual.setText(cierrerolmensualBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormCierreRolMensual.jDateChooserfechaCierreRolMensual.setDate(cierrerolmensualBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCierreRolMensual(CierreRolMensualParameterReturnGeneral cierrerolmensualReturnGeneral,CierreRolMensualBean cierrerolmensualBean,Boolean conDefault) throws Exception { 
		try {
			CierreRolMensual cierrerolmensualLocal=new CierreRolMensual();
			
			cierrerolmensualLocal=cierrerolmensualReturnGeneral.getCierreRolMensual();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cierrerolmensualLocal.getId()!=null && !cierrerolmensualLocal.getId().equals(0L))) {cierrerolmensualBean.setId(cierrerolmensualLocal.getId());}}
			if(conDefault || (!conDefault && cierrerolmensualLocal.getid_empleado()!=null && !cierrerolmensualLocal.getid_empleado().equals(-1L))) {cierrerolmensualBean.setid_empleado(cierrerolmensualLocal.getid_empleado());}
			if(conDefault || (!conDefault && cierrerolmensualLocal.getid_estructura()!=null && !cierrerolmensualLocal.getid_estructura().equals(-1L))) {cierrerolmensualBean.setid_estructura(cierrerolmensualLocal.getid_estructura());}
			if(conDefault || (!conDefault && cierrerolmensualLocal.getid_estado_empleado()!=null && !cierrerolmensualLocal.getid_estado_empleado().equals(-1L))) {cierrerolmensualBean.setid_estado_empleado(cierrerolmensualLocal.getid_estado_empleado());}
			if(conDefault || (!conDefault && cierrerolmensualLocal.getid_asiento_contable()!=null && !cierrerolmensualLocal.getid_asiento_contable().equals(-1L))) {cierrerolmensualBean.setid_asiento_contable(cierrerolmensualLocal.getid_asiento_contable());}
			if(conDefault || (!conDefault && cierrerolmensualLocal.getporcentaje()!=null && !cierrerolmensualLocal.getporcentaje().equals(0))) {cierrerolmensualBean.setporcentaje(cierrerolmensualLocal.getporcentaje());}
			if(conDefault || (!conDefault && cierrerolmensualLocal.getfecha()!=null && !cierrerolmensualLocal.getfecha().equals(new Date()))) {cierrerolmensualBean.setfecha(cierrerolmensualLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCierreRolMensualGenerico(Long idCierreRolMensualSeleccionado,JComboBox jComboBoxCierreRolMensual,List<CierreRolMensual> cierrerolmensualsLocal)throws Exception {
		try {
			CierreRolMensual  cierrerolmensualTemp=null;

			for(CierreRolMensual cierrerolmensualAux:cierrerolmensualsLocal) {
				if(cierrerolmensualAux.getId()!=null && cierrerolmensualAux.getId().equals(idCierreRolMensualSeleccionado)) {
					cierrerolmensualTemp=cierrerolmensualAux;
					break;
				}
			}

			jComboBoxCierreRolMensual.setSelectedItem(cierrerolmensualTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCierreRolMensualGenerico(JComboBox jComboBoxCierreRolMensual,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCierreRolMensual.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCierreRolMensual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCierreRolMensual.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCierreRolMensual.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCierreRolMensual.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCierreRolMensual.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cierrerolmensual=(CierreRolMensual) cierrerolmensualLogic.getCierreRolMensuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cierrerolmensual =(CierreRolMensual) cierrerolmensuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cierrerolmensual.getIsNew() && !cierrerolmensual.getIsChanged() && !cierrerolmensual.getIsDeleted()) {
				sDescripcion=cierrerolmensual.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cierrerolmensual.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cierrerolmensual.getIsNew() && !cierrerolmensual.getIsChanged() && !cierrerolmensual.getIsDeleted()) {
				sDescripcion=cierrerolmensual.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cierrerolmensual.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!cierrerolmensual.getIsNew() && !cierrerolmensual.getIsChanged() && !cierrerolmensual.getIsDeleted()) {
				sDescripcion=cierrerolmensual.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=cierrerolmensual.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!cierrerolmensual.getIsNew() && !cierrerolmensual.getIsChanged() && !cierrerolmensual.getIsDeleted()) {
				sDescripcion=cierrerolmensual.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=cierrerolmensual.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!cierrerolmensual.getIsNew() && !cierrerolmensual.getIsChanged() && !cierrerolmensual.getIsDeleted()) {
				sDescripcion=cierrerolmensual.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=cierrerolmensual.getestructura_descripcion();
			}
		}

		if(sTipo.equals("EstadoEmpleado")) {
			//sDescripcion=this.getActualEstadoEmpleadoForeignKeyDescripcion((Long)value);
			if(!cierrerolmensual.getIsNew() && !cierrerolmensual.getIsChanged() && !cierrerolmensual.getIsDeleted()) {
				sDescripcion=cierrerolmensual.getestadoempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=cierrerolmensual.getestadoempleado_descripcion();
			}
		}

		if(sTipo.equals("AsientoContable")) {
			//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
			if(!cierrerolmensual.getIsNew() && !cierrerolmensual.getIsChanged() && !cierrerolmensual.getIsDeleted()) {
				sDescripcion=cierrerolmensual.getasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=cierrerolmensual.getasientocontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CierreRolMensual cierrerolmensualRow=new CierreRolMensual();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cierrerolmensualRow=(CierreRolMensual) cierrerolmensualLogic.getCierreRolMensuals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cierrerolmensualRow=(CierreRolMensual) cierrerolmensuals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCierreRolMensual(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCierreRolMensual.setVisible((this.isVisibilidadCeldaNuevoCierreRolMensual && this.isPermisoNuevoCierreRolMensual));			
			this.jButtonDuplicarCierreRolMensual.setVisible((this.isVisibilidadCeldaDuplicarCierreRolMensual && this.isPermisoDuplicarCierreRolMensual));			
			this.jButtonCopiarCierreRolMensual.setVisible((this.isVisibilidadCeldaCopiarCierreRolMensual && this.isPermisoCopiarCierreRolMensual));
			this.jButtonVerFormCierreRolMensual.setVisible((this.isVisibilidadCeldaVerFormCierreRolMensual && this.isPermisoVerFormCierreRolMensual));
			
			this.jButtonAbrirOrderByCierreRolMensual.setVisible((this.isVisibilidadCeldaOrdenCierreRolMensual && this.isPermisoOrdenCierreRolMensual));			
			
			this.jButtonNuevoRelacionesCierreRolMensual.setVisible((this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual && this.isPermisoNuevoCierreRolMensual));			
			this.jButtonNuevoGuardarCambiosCierreRolMensual.setVisible((this.isVisibilidadCeldaNuevoCierreRolMensual && this.isPermisoNuevoCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));
			
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonModificarCierreRolMensual.setVisible((this.isVisibilidadCeldaModificarCierreRolMensual && this.isPermisoActualizarCierreRolMensual));	
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarCierreRolMensual.setVisible((this.isVisibilidadCeldaActualizarCierreRolMensual && this.isPermisoActualizarCierreRolMensual));	
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarCierreRolMensual.setVisible((this.isVisibilidadCeldaEliminarCierreRolMensual && this.isPermisoEliminarCierreRolMensual));
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarCierreRolMensual.setVisible(this.isVisibilidadCeldaCancelarCierreRolMensual);							
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosCierreRolMensual.setVisible((this.isVisibilidadCeldaGuardarCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));			
			
			}
						
			this.jButtonGuardarCambiosTablaCierreRolMensual.setVisible((this.isVisibilidadCeldaGuardarCambiosCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaNuevoCierreRolMensual && this.isPermisoNuevoCierreRolMensual));						
			this.jButtonDuplicarToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaDuplicarCierreRolMensual && this.isPermisoDuplicarCierreRolMensual));						
			this.jButtonCopiarToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaCopiarCierreRolMensual && this.isPermisoCopiarCierreRolMensual));			
			this.jButtonVerFormToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaVerFormCierreRolMensual && this.isPermisoVerFormCierreRolMensual));			
			this.jButtonAbrirOrderByToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaOrdenCierreRolMensual && this.isPermisoOrdenCierreRolMensual));
			this.jButtonNuevoRelacionesToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual && this.isPermisoNuevoCierreRolMensual));			
			this.jButtonNuevoGuardarCambiosToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaNuevoCierreRolMensual && this.isPermisoNuevoCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));			
			
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonModificarToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaModificarCierreRolMensual && this.isPermisoActualizarCierreRolMensual));	
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaActualizarCierreRolMensual  && this.isPermisoActualizarCierreRolMensual));	
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaEliminarCierreRolMensual && this.isPermisoEliminarCierreRolMensual));
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarToolBarCierreRolMensual.setVisible(this.isVisibilidadCeldaCancelarCierreRolMensual);				
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaGuardarCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCierreRolMensual.setVisible((this.isVisibilidadCeldaGuardarCambiosCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCierreRolMensual.setVisible((this.isVisibilidadCeldaNuevoCierreRolMensual && this.isPermisoNuevoCierreRolMensual));			
			this.jMenuItemDuplicarCierreRolMensual.setVisible((this.isVisibilidadCeldaDuplicarCierreRolMensual && this.isPermisoDuplicarCierreRolMensual));			
			this.jMenuItemCopiarCierreRolMensual.setVisible((this.isVisibilidadCeldaCopiarCierreRolMensual && this.isPermisoCopiarCierreRolMensual));			
			this.jMenuItemVerFormCierreRolMensual.setVisible((this.isVisibilidadCeldaVerFormCierreRolMensual && this.isPermisoVerFormCierreRolMensual));			
			this.jMenuItemAbrirOrderByCierreRolMensual.setVisible((this.isVisibilidadCeldaOrdenCierreRolMensual && this.isPermisoOrdenCierreRolMensual));			
			//this.jMenuItemMostrarOcultarCierreRolMensual.setVisible((this.isVisibilidadCeldaOrdenCierreRolMensual && this.isPermisoOrdenCierreRolMensual));
			this.jMenuItemDetalleAbrirOrderByCierreRolMensual.setVisible((this.isVisibilidadCeldaOrdenCierreRolMensual && this.isPermisoOrdenCierreRolMensual));			
			//this.jMenuItemDetalleMostrarOcultarCierreRolMensual.setVisible((this.isVisibilidadCeldaOrdenCierreRolMensual && this.isPermisoOrdenCierreRolMensual));			
			this.jMenuItemNuevoRelacionesCierreRolMensual.setVisible((this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual && this.isPermisoNuevoCierreRolMensual));			
			this.jMenuItemNuevoGuardarCambiosCierreRolMensual.setVisible((this.isVisibilidadCeldaNuevoCierreRolMensual && this.isPermisoNuevoCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));									
			
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemModificarCierreRolMensual.setVisible((this.isVisibilidadCeldaModificarCierreRolMensual && this.isPermisoActualizarCierreRolMensual));	
			this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemActualizarCierreRolMensual.setVisible((this.isVisibilidadCeldaActualizarCierreRolMensual && this.isPermisoActualizarCierreRolMensual));	
			this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemEliminarCierreRolMensual.setVisible((this.isVisibilidadCeldaEliminarCierreRolMensual && this.isPermisoEliminarCierreRolMensual));
			this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemCancelarCierreRolMensual.setVisible(this.isVisibilidadCeldaCancelarCierreRolMensual);				
			}
			
			this.jMenuItemGuardarCambiosCierreRolMensual.setVisible((this.isVisibilidadCeldaGuardarCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));						
			this.jMenuItemGuardarCambiosTablaCierreRolMensual.setVisible((this.isVisibilidadCeldaGuardarCambiosCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCierreRolMensual=this.jButtonNuevoCierreRolMensual.isVisible();
			this.isVisibilidadCeldaDuplicarCierreRolMensual=this.jButtonDuplicarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaCopiarCierreRolMensual=this.jButtonCopiarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaVerFormCierreRolMensual=this.jButtonVerFormCierreRolMensual.isVisible();
			
			this.isVisibilidadCeldaOrdenCierreRolMensual=this.jButtonAbrirOrderByCierreRolMensual.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=this.jButtonNuevoRelacionesCierreRolMensual.isVisible();
			this.isVisibilidadCeldaModificarCierreRolMensual=this.jButtonModificarCierreRolMensual.isVisible();
			
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			this.isVisibilidadCeldaActualizarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaEliminarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaCancelarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaGuardarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosCierreRolMensual.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=this.jButtonGuardarCambiosTablaCierreRolMensual.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCierreRolMensual=this.jButtonNuevoToolBarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=this.jButtonNuevoRelacionesToolBarCierreRolMensual.isVisible();
			
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			this.isVisibilidadCeldaModificarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jButtonModificarToolBarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaActualizarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarToolBarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaEliminarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarToolBarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaCancelarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarToolBarCierreRolMensual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCierreRolMensual=this.jButtonGuardarCambiosToolBarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=this.jButtonGuardarCambiosTablaToolBarCierreRolMensual.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCierreRolMensual=this.jMenuItemNuevoCierreRolMensual.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=this.jMenuItemNuevoRelacionesCierreRolMensual.isVisible();
			
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			this.isVisibilidadCeldaModificarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemModificarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaActualizarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemActualizarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaEliminarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemEliminarCierreRolMensual.isVisible();
			this.isVisibilidadCeldaCancelarCierreRolMensual=this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemCancelarCierreRolMensual.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCierreRolMensual=this.jMenuItemGuardarCambiosCierreRolMensual.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=this.jMenuItemGuardarCambiosTablaCierreRolMensual.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCierreRolMensual(Boolean esInicializar) {
		if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {
				//if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCierreRolMensual();
			}
			
			this.inicializarActualizarBindingBotonesManualCierreRolMensual(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCierreRolMensual() {
		this.jButtonNuevoCierreRolMensual.setVisible(this.isPermisoNuevoCierreRolMensual);			
		this.jButtonDuplicarCierreRolMensual.setVisible(this.isPermisoDuplicarCierreRolMensual);			
		this.jButtonCopiarCierreRolMensual.setVisible(this.isPermisoCopiarCierreRolMensual);			
		this.jButtonVerFormCierreRolMensual.setVisible(this.isPermisoVerFormCierreRolMensual);			
		
		this.jButtonAbrirOrderByCierreRolMensual.setVisible(this.isPermisoOrdenCierreRolMensual);					
		
		this.jButtonNuevoRelacionesCierreRolMensual.setVisible(this.isPermisoNuevoCierreRolMensual);			
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonModificarCierreRolMensual.setVisible(this.isPermisoActualizarCierreRolMensual);	
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarCierreRolMensual.setVisible(this.isPermisoActualizarCierreRolMensual);	
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarCierreRolMensual.setVisible(this.isPermisoEliminarCierreRolMensual);
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarCierreRolMensual.setVisible(this.isVisibilidadCeldaCancelarCierreRolMensual);						
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosCierreRolMensual.setVisible(this.isPermisoGuardarCambiosCierreRolMensual);							
		}
		
		this.jButtonGuardarCambiosTablaCierreRolMensual.setVisible(this.isPermisoActualizarCierreRolMensual);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCierreRolMensual() {
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonModificarCierreRolMensual.setVisible(this.isPermisoActualizarCierreRolMensual);	
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarCierreRolMensual.setVisible(this.isPermisoActualizarCierreRolMensual);	
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarCierreRolMensual.setVisible(this.isPermisoEliminarCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarCierreRolMensual.setVisible(this.isVisibilidadCeldaCancelarCierreRolMensual);							
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosCierreRolMensual.setVisible((this.isVisibilidadCeldaGuardarCierreRolMensual && this.isPermisoGuardarCambiosCierreRolMensual));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCierreRolMensual() {
		if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCierreRolMensual();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCierreRolMensual() {
	}
	
	public void jTableDatosCierreRolMensualListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCierreRolMensual(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cierrerolmensual.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCierreRolMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCierreRolMensual(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreRolMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreRolMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cierrerolmensualLogic.getConnexion());

				if(this.cierrerolmensual.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cierrerolmensual.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cierrerolmensual.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCierreRolMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCierreRolMensual(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreRolMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreRolMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cierrerolmensualLogic.getConnexion());

				if(this.cierrerolmensual.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cierrerolmensual.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cierrerolmensual.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioCierreRolMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebCierreRolMensual(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreRolMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreRolMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.cierrerolmensualLogic.getConnexion());

				if(this.cierrerolmensual.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.cierrerolmensual.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.cierrerolmensual.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoCierreRolMensualActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCierreRolMensual=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosCierreRolMensual.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoCierreRolMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebCierreRolMensual(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreRolMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreRolMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.cierrerolmensualLogic.getConnexion());

				if(this.cierrerolmensual.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.cierrerolmensual.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.cierrerolmensual.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraCierreRolMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebCierreRolMensual(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreRolMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreRolMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.cierrerolmensualLogic.getConnexion());

				if(this.cierrerolmensual.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.cierrerolmensual.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.cierrerolmensual.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_empleadoCierreRolMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadoempleado=true;

			idTienePermisoestadoempleado=this.tienePermisosUsuarioEnPaginaWebCierreRolMensual(EstadoEmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreRolMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreRolMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);

				this.estadoempleadoBeanSwingJInternalFrame=new EstadoEmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadoempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadoempleadoBeanSwingJInternalFrame.getEstadoEmpleadoLogic().setConnexion(this.cierrerolmensualLogic.getConnexion());

				if(this.cierrerolmensual.getid_estado_empleado()!=null) {
					this.estadoempleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadoempleadoBeanSwingJInternalFrame.setIdActual(this.cierrerolmensual.getid_estado_empleado());
					this.estadoempleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadoempleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadoempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.estadoempleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
				TitledBorder titledBorderestadoempleado=(TitledBorder)this.estadoempleadoBeanSwingJInternalFrame.jScrollPanelDatosEstadoEmpleado.getBorder();

				titledBorderestadoempleado.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Estado Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_empleadoCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getid_estado_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_empleado = "+this.cierrerolmensual.getid_estado_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_asiento_contableCierreRolMensualActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="AsientoContable";

			if(!this.sFinalQueryGeneral_asientocontable.equals("")) {
				this.asientocontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_asientocontable);
				this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.asientocontableBeanSwingJInternalFrame.procesarBusqueda(this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingAsientoContable(false);
			}

			if(!this.sFinalQueryComboAsientoContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCierreRolMensual=null;
			TitledBorder titledBorderasientocontable=null;

			if(!this.jScrollPanelDatosCierreRolMensual.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
				titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Asiento Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_asiento_contableCierreRolMensualUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoasientocontable=true;

			idTienePermisoasientocontable=this.tienePermisosUsuarioEnPaginaWebCierreRolMensual(AsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCierreRolMensual.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCierreRolMensual.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);

				this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.asientocontableBeanSwingJInternalFrame.getAsientoContableLogic().setConnexion(this.cierrerolmensualLogic.getConnexion());

				if(this.cierrerolmensual.getid_asiento_contable()!=null) {
					this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.asientocontableBeanSwingJInternalFrame.setIdActual(this.cierrerolmensual.getid_asiento_contable());
					this.asientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCierreRolMensual=(TitledBorder)this.jScrollPanelDatosCierreRolMensual.getBorder();
				TitledBorder titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderCierreRolMensual.getTitle() + " -> Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_asiento_contableCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getid_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_asiento_contable = "+this.cierrerolmensual.getid_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.cierrerolmensual.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaCierreRolMensualBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.getcierrerolmensual(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cierrerolmensual==null) {
						this.cierrerolmensual = new CierreRolMensual();
					}

					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);
				}

				if(this.cierrerolmensual.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.cierrerolmensual.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCierreRolMensual(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAsientoContableCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreRolMensual(false,false);

			this.getCierreRolMensualsFK_IdAsientoContable();

			this.inicializarActualizarBindingCierreRolMensual(false);

			//if(CierreRolMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreRolMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCierreRolMensualCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreRolMensual(false,false);

			this.getCierreRolMensualsFK_IdCierreRolMensual();

			this.inicializarActualizarBindingCierreRolMensual(false);

			//if(CierreRolMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreRolMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreRolMensual(false,false);

			this.getCierreRolMensualsFK_IdEjercicio();

			this.inicializarActualizarBindingCierreRolMensual(false);

			//if(CierreRolMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreRolMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreRolMensual(false,false);

			this.getCierreRolMensualsFK_IdEmpleado();

			this.inicializarActualizarBindingCierreRolMensual(false);

			//if(CierreRolMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreRolMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreRolMensual(false,false);

			this.getCierreRolMensualsFK_IdEmpresa();

			this.inicializarActualizarBindingCierreRolMensual(false);

			//if(CierreRolMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreRolMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoEmpleadoCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreRolMensual(false,false);

			this.getCierreRolMensualsFK_IdEstadoEmpleado();

			this.inicializarActualizarBindingCierreRolMensual(false);

			//if(CierreRolMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreRolMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCierreRolMensualActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCierreRolMensual(false,false);

			this.getCierreRolMensualsFK_IdSucursal();

			this.inicializarActualizarBindingCierreRolMensual(false);

			//if(CierreRolMensualBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCierreRolMensual(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cierrerolmensualLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCierreRolMensual() {
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
			this.jInternalFrameDetalleFormCierreRolMensual.setVisible(false);	    			
			this.jInternalFrameDetalleFormCierreRolMensual.dispose();
			this.jInternalFrameDetalleFormCierreRolMensual=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCierreRolMensual!=null) {
			this.jInternalFrameReporteDinamicoCierreRolMensual.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCierreRolMensual.dispose();
			this.jInternalFrameReporteDinamicoCierreRolMensual=null;
		}
		
		if(this.jInternalFrameImportacionCierreRolMensual!=null) {
			this.jInternalFrameImportacionCierreRolMensual.setVisible(false);	    			
			this.jInternalFrameImportacionCierreRolMensual.dispose();
			this.jInternalFrameImportacionCierreRolMensual=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCierreRolMensual();
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
			
			if(sTipo.equals("NuevoCierreRolMensual")) {
				jButtonNuevoCierreRolMensualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCierreRolMensual")) {
				jButtonDuplicarCierreRolMensualActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCierreRolMensual")) {
				jButtonCopiarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("VerFormCierreRolMensual")) {
				jButtonVerFormCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCierreRolMensual")) {
				jButtonNuevoCierreRolMensualActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCierreRolMensual")) {
				jButtonDuplicarCierreRolMensualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCierreRolMensual")) {
				jButtonNuevoCierreRolMensualActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCierreRolMensual")) {
				jButtonDuplicarCierreRolMensualActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCierreRolMensual")) {
				jButtonNuevoCierreRolMensualActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCierreRolMensual")) {
				jButtonNuevoCierreRolMensualActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCierreRolMensual")) {
				jButtonNuevoCierreRolMensualActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCierreRolMensual")) {
				jButtonModificarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCierreRolMensual")) {
				jButtonModificarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCierreRolMensual")) {
				jButtonModificarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCierreRolMensual")) {
				jButtonActualizarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCierreRolMensual")) {
				jButtonActualizarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCierreRolMensual")) {
				jButtonActualizarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("EliminarCierreRolMensual")) {
				jButtonEliminarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCierreRolMensual")) {
				jButtonEliminarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCierreRolMensual")) {
				jButtonEliminarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("CancelarCierreRolMensual")) {
				jButtonCancelarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCierreRolMensual")) {
				jButtonCancelarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCierreRolMensual")) {
				jButtonCancelarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("CerrarCierreRolMensual")) {
				jButtonCerrarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCierreRolMensual")) {
				jButtonCerrarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCierreRolMensual")) {
				jButtonCerrarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCierreRolMensual")) {
				jButtonMostrarOcultarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCierreRolMensual")) {
				jButtonCancelarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCierreRolMensual")) {
				jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCierreRolMensual")) {
				jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCierreRolMensual")) {
				jButtonCopiarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCierreRolMensual")) {
				jButtonVerFormCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCierreRolMensual")) {
				jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCierreRolMensual")) {
				jButtonCopiarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCierreRolMensual")) {
				jButtonVerFormCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCierreRolMensual")) {
				jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCierreRolMensual")) {
				jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCierreRolMensual")) {
				jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCierreRolMensual")) {
				jButtonRecargarInformacionCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCierreRolMensual")) {
				jButtonRecargarInformacionCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCierreRolMensual")) {
				jButtonRecargarInformacionCierreRolMensualActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCierreRolMensual")) {
				jButtonAnterioresCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCierreRolMensual")) {
				jButtonAnterioresCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCierreRolMensual")) {
				jButtonAnterioresCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCierreRolMensual")) {
				jButtonSiguientesCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCierreRolMensual")) {
				jButtonSiguientesCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCierreRolMensual")) {
				jButtonSiguientesCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCierreRolMensual") || sTipo.equals("MenuItemDetalleAbrirOrderByCierreRolMensual")) {
				jButtonAbrirOrderByCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCierreRolMensual") || sTipo.equals("MenuItemDetalleMostrarOcultarCierreRolMensual")) {
				jButtonMostrarOcultarCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCierreRolMensual")) {
				jButtonNuevoGuardarCambiosCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCierreRolMensual")) {
				jButtonNuevoGuardarCambiosCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCierreRolMensual")) {
				jButtonNuevoGuardarCambiosCierreRolMensualActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCierreRolMensual")) {
				jButtonCerrarReporteDinamicoCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCierreRolMensual")) {
				jButtonGenerarReporteDinamicoCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCierreRolMensual")) {
				
				jButtonGenerarExcelReporteDinamicoCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCierreRolMensual")) {
				jButtonCerrarImportacionCierreRolMensualActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCierreRolMensual")) {
				
				jButtonGenerarImportacionCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCierreRolMensual")) {
				
				jButtonAbrirImportacionCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCierreRolMensual")) {
				jComboBoxTiposAccionesCierreRolMensualActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCierreRolMensual")) {
				jComboBoxTiposRelacionesCierreRolMensualActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCierreRolMensual")) {
				jComboBoxTiposAccionesCierreRolMensualActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCierreRolMensual")) {
				
				jComboBoxTiposSeleccionarCierreRolMensualActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCierreRolMensual")) {
				jTextFieldValorCampoGeneralCierreRolMensualActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCierreRolMensual")) {
				jButtonAbrirOrderByCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCierreRolMensual")) {
				jButtonAbrirOrderByCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCierreRolMensual")) {
				jButtonCerrarOrderByCierreRolMensualActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCierreRolMensualBusqueda")) {
				this.jButtonidCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCierreRolMensualUpdate")) {
				this.jButtonid_empresaCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCierreRolMensualBusqueda")) {
				this.jButtonid_empresaCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCierreRolMensualUpdate")) {
				this.jButtonid_sucursalCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCierreRolMensualBusqueda")) {
				this.jButtonid_sucursalCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCierreRolMensualUpdate")) {
				this.jButtonid_ejercicioCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCierreRolMensualBusqueda")) {
				this.jButtonid_ejercicioCierreRolMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoCierreRolMensual")) {
				this.jButtonid_empleadoCierreRolMensualActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCierreRolMensualUpdate")) {
				this.jButtonid_empleadoCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCierreRolMensualBusqueda")) {
				this.jButtonid_empleadoCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraCierreRolMensualUpdate")) {
				this.jButtonid_estructuraCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraCierreRolMensualBusqueda")) {
				this.jButtonid_estructuraCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_empleadoCierreRolMensualUpdate")) {
				this.jButtonid_estado_empleadoCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_empleadoCierreRolMensualBusqueda")) {
				this.jButtonid_estado_empleadoCierreRolMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableCierreRolMensual")) {
				this.jButtonid_asiento_contableCierreRolMensualActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableCierreRolMensualUpdate")) {
				this.jButtonid_asiento_contableCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableCierreRolMensualBusqueda")) {
				this.jButtonid_asiento_contableCierreRolMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeCierreRolMensualBusqueda")) {
				this.jButtonporcentajeCierreRolMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCierreRolMensualBusqueda")) {
				this.jButtonfechaCierreRolMensualBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_asiento_contableCierreRolMensual")) {
				this.jButtonid_asiento_contableCierreRolMensualActionPerformed(evt);
			}
			else if(sTipo.equals("id_empleadoCierreRolMensual")) {
				this.jButtonid_empleadoCierreRolMensualActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAsientoContableCierreRolMensual")) {
				this.jButtonFK_IdAsientoContableCierreRolMensualActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCierreRolMensualCierreRolMensual")) {
				this.jButtonFK_IdCierreRolMensualCierreRolMensualActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoCierreRolMensual")) {
				this.jButtonFK_IdEmpleadoCierreRolMensualActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoEmpleadoCierreRolMensual")) {
				this.jButtonFK_IdEstadoEmpleadoCierreRolMensualActionPerformed(evt);
			}
			
			;
			
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCierreRolMensual();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreRolMensualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				


				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CierreRolMensual cierrerolmensualLocal=null;
			
			if(!this.getEsControlTabla()) {
				cierrerolmensualLocal=this.cierrerolmensual;
			} else {
				cierrerolmensualLocal=this.cierrerolmensualAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
							
				
				


				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreRolMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
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
			
			


			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreRolMensualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
								
						
				


				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
								
				
				


				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreRolMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreRolMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreRolMensualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
							
				
				


				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreRolMensualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
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
			
			


			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreRolMensualActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
								
				
				


				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreRolMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreRolMensualActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreRolMensualActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCierreRolMensual")) {
					jCheckBoxSeleccionarTodosCierreRolMensualItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCierreRolMensual")) {
					jCheckBoxSeleccionadosCierreRolMensualItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCierreRolMensual")) {
					
				}
				
				


				
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
												
				
				


				
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreRolMensualActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreRolMensualActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
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
			
			


			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCierreRolMensualActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cierrerolmensual);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cierrerolmensual);
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
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
				
				


				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CierreRolMensual.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CierreRolMensual.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCierreRolMensualActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cierrerolmensualAnterior =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCierreRolMensual")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCierreRolMensualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCierreRolMensual.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cierrerolmensual =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cierrerolmensual);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCierreRolMensual")) {
				
				}
				
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCierreRolMensual")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCierreRolMensual.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCierreRolMensual")) {
			
			}
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCierreRolMensual();
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
			if(sTipo.equals("NuevoCierreRolMensual")) {
				jButtonNuevoCierreRolMensualActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCierreRolMensual")) {
				jButtonDuplicarCierreRolMensualActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCierreRolMensual")) {
				jButtonCopiarCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCierreRolMensual")) {
				jButtonVerFormCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCierreRolMensual")) {
				jButtonNuevoCierreRolMensualActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCierreRolMensual")) {
				jButtonModificarCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCierreRolMensual")) {
				jButtonActualizarCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCierreRolMensual")) {
				jButtonEliminarCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCierreRolMensual")) {
				jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCierreRolMensual")) {
				jButtonCancelarCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCierreRolMensual")) {
				jButtonCerrarCierreRolMensualActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCierreRolMensual")) {
				jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCierreRolMensual")) {
				jButtonNuevoGuardarCambiosCierreRolMensualActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCierreRolMensual")) {
				jButtonAbrirOrderByCierreRolMensualActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCierreRolMensual")) {
				jButtonRecargarInformacionCierreRolMensualActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCierreRolMensual")) {
				jButtonAnterioresCierreRolMensualActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCierreRolMensual")) {
				jButtonSiguientesCierreRolMensualActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCierreRolMensualBusqueda")) {
				this.jButtonidCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCierreRolMensualUpdate")) {
				this.jButtonid_empresaCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCierreRolMensualBusqueda")) {
				this.jButtonid_empresaCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCierreRolMensualUpdate")) {
				this.jButtonid_sucursalCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCierreRolMensualBusqueda")) {
				this.jButtonid_sucursalCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioCierreRolMensualUpdate")) {
				this.jButtonid_ejercicioCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioCierreRolMensualBusqueda")) {
				this.jButtonid_ejercicioCierreRolMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoCierreRolMensual")) {
				this.jButtonid_empleadoCierreRolMensualActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCierreRolMensualUpdate")) {
				this.jButtonid_empleadoCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCierreRolMensualBusqueda")) {
				this.jButtonid_empleadoCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraCierreRolMensualUpdate")) {
				this.jButtonid_estructuraCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraCierreRolMensualBusqueda")) {
				this.jButtonid_estructuraCierreRolMensualBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_empleadoCierreRolMensualUpdate")) {
				this.jButtonid_estado_empleadoCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_empleadoCierreRolMensualBusqueda")) {
				this.jButtonid_estado_empleadoCierreRolMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableCierreRolMensual")) {
				this.jButtonid_asiento_contableCierreRolMensualActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableCierreRolMensualUpdate")) {
				this.jButtonid_asiento_contableCierreRolMensualUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableCierreRolMensualBusqueda")) {
				this.jButtonid_asiento_contableCierreRolMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeCierreRolMensualBusqueda")) {
				this.jButtonporcentajeCierreRolMensualBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaCierreRolMensualBusqueda")) {
				this.jButtonfechaCierreRolMensualBusquedaActionPerformed(evt);
			}
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCierreRolMensual();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCierreRolMensual")) {
				closingInternalFrameCierreRolMensual();
				
			} else if(sTipo.equals("jButtonCancelarCierreRolMensual")) {
				JInternalFrameBase jInternalFrameDetalleFormCierreRolMensual = (JInternalFrameBase)evt.getSource();
	            	
	            CierreRolMensualBeanSwingJInternalFrame jInternalFrameParent=(CierreRolMensualBeanSwingJInternalFrame)jInternalFrameDetalleFormCierreRolMensual.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCierreRolMensualActionPerformed(null);
			}
			
			CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cierrerolmensual,new Object(),this.cierrerolmensualParameterGeneral,this.cierrerolmensualReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCierreRolMensual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCierreRolMensual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCierreRolMensual(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cierrerolmensual)) {
			if(!esControlTabla) {
				if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);			
				}
				
				if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCierreRolMensual(this.cierrerolmensual,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cierrerolmensualReturnGeneral=cierrerolmensualLogic.procesarEventosCierreRolMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cierrerolmensualLogic.getCierreRolMensuals(),this.cierrerolmensual,this.cierrerolmensualParameterGeneral,this.isEsNuevoCierreRolMensual,classes);//this.cierrerolmensualLogic.getCierreRolMensual()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCierreRolMensual(this.cierrerolmensualReturnGeneral,this.cierrerolmensualBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCierreRolMensual(classes,this.cierrerolmensualReturnGeneral,this.cierrerolmensualBean,false);
					}
						
					if(this.cierrerolmensualReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCierreRolMensual(this.cierrerolmensualReturnGeneral.getCierreRolMensual());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCierreRolMensual(this.cierrerolmensualReturnGeneral.getCierreRolMensual());	
					}
						
					if(this.cierrerolmensualReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCierreRolMensual(this.cierrerolmensualReturnGeneral.getCierreRolMensual(),classes);//this.cierrerolmensualBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCierreRolMensual(this.cierrerolmensual,classes);//this.cierrerolmensualBean);									
				}
			
				if(CierreRolMensualJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCierreRolMensual(this.cierrerolmensual,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCierreRolMensual(this.cierrerolmensual);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cierrerolmensualAnterior!=null) {
						this.cierrerolmensual=this.cierrerolmensualAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cierrerolmensualReturnGeneral=cierrerolmensualLogic.procesarEventosCierreRolMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cierrerolmensualLogic.getCierreRolMensuals(),this.cierrerolmensual,this.cierrerolmensualParameterGeneral,this.isEsNuevoCierreRolMensual,classes);//this.cierrerolmensualLogic.getCierreRolMensual()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cierrerolmensualSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cierrerolmensualSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cierrerolmensualReturnGeneral.getCierreRolMensual(),cierrerolmensualLogic.getCierreRolMensuals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cierrerolmensualReturnGeneral.getCierreRolMensual(),this.cierrerolmensuals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCierreRolMensual.repaint();
				
				//((AbstractTableModel) this.jTableDatosCierreRolMensual.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCierreRolMensual();
			}
		}
	}
	
	public void actualizarVisualTableDatosCierreRolMensual() throws Exception {
		
		CierreRolMensualModel cierrerolmensualModel=(CierreRolMensualModel)this.jTableDatosCierreRolMensual.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cierrerolmensualModel.cierrerolmensuals=this.cierrerolmensualLogic.getCierreRolMensuals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cierrerolmensualModel.cierrerolmensuals=this.cierrerolmensuals;
		}
		
		
		((CierreRolMensualModel) this.jTableDatosCierreRolMensual.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCierreRolMensual() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcierrerolmensualAnterior(),this.cierrerolmensualLogic.getCierreRolMensuals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcierrerolmensualAnterior(),this.cierrerolmensuals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCierreRolMensual();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCierreRolMensual(CierreRolMensual cierrerolmensual,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
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
										
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cierrerolmensual,new Object(),generalEntityParameterGeneral,this.cierrerolmensualReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cierrerolmensualSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CierreRolMensualConstantesFunciones.getClassesRelationshipsOfCierreRolMensual(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CierreRolMensualConstantesFunciones.getClassesRelationshipsFromStringsOfCierreRolMensual(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCierreRolMensual(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CierreRolMensualBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cierrerolmensual,new Object(),generalEntityParameterGeneral,this.cierrerolmensualReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCierreRolMensual(CierreRolMensualBean cierrerolmensualBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCierreRolMensual(ArrayList<Classe> classes,CierreRolMensualReturnGeneral cierrerolmensualReturnGeneral,CierreRolMensualBean cierrerolmensualBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCierreRolMensual(CierreRolMensual cierrerolmensual,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cierrerolmensual)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCierreRolMensual = new CierreRolMensualDetalleFormJInternalFrame(jDesktopPane,this.cierrerolmensualSessionBean.getConGuardarRelaciones(),this.cierrerolmensualSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.setVisible(false);
		this.jInternalFrameDetalleFormCierreRolMensual.setSelected(false);						
		
		this.jInternalFrameDetalleFormCierreRolMensual.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCierreRolMensual.cierrerolmensualLogic=this.cierrerolmensualLogic;
		
		this.cargarCombosFrameForeignKeyCierreRolMensual("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCierreRolMensual();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCierreRolMensual();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCierreRolMensual("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCierreRolMensual();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCierreRolMensual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCierreRolMensual"));
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonModificarCierreRolMensual.addActionListener(new ButtonActionListener(this,"ModificarCierreRolMensual"));

		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonModificarToolBarCierreRolMensual.addActionListener(new ButtonActionListener(this,"ModificarToolBarCierreRolMensual"));
					
		this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemModificarCierreRolMensual.addActionListener(new ButtonActionListener(this,"MenuItemModificarCierreRolMensual"));		
		
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarCierreRolMensual.addActionListener (new ButtonActionListener(this,"ActualizarCierreRolMensual"));
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarToolBarCierreRolMensual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCierreRolMensual"));
						
		this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemActualizarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCierreRolMensual"));		
		
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarCierreRolMensual.addActionListener (new ButtonActionListener(this,"EliminarCierreRolMensual"));
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"EliminarToolBarCierreRolMensual"));
								
		this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemEliminarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCierreRolMensual"));		
		
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarCierreRolMensual.addActionListener (new ButtonActionListener(this,"CancelarCierreRolMensual"));
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"CancelarToolBarCierreRolMensual"));
					
		this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemCancelarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCierreRolMensual"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemDetalleCerrarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCierreRolMensual"));		
		
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCierreRolMensual"));
		
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCierreRolMensual"));
		
		
		
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCierreRolMensual"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonidCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"idCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empresaCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empresaCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_sucursalCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_sucursalCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_ejercicioCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_ejercicioCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCierreRolMensualBusqueda"));
		//jButtonid_empleadoCierreRolMensual.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoCierreRolMensualActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensual"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estructuraCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estructuraCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estado_empleadoCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_estado_empleadoCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estado_empleadoCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_empleadoCierreRolMensualBusqueda"));
		//jButtonid_asiento_contableCierreRolMensual.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableCierreRolMensualActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensual"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonporcentajeCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCierreRolMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonfechaCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"fechaCierreRolMensualBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCierreRolMensual.jTabbedPaneRelacionesCierreRolMensual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCierreRolMensual"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCierreRolMensual"));
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCierreRolMensual"));
		}
		
		this.jTableDatosCierreRolMensual.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCierreRolMensual"));
		
		this.jTableDatosCierreRolMensual.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCierreRolMensual"));
		
		this.jButtonNuevoCierreRolMensual.addActionListener(new ButtonActionListener(this,"NuevoCierreRolMensual"));
		
		this.jButtonDuplicarCierreRolMensual.addActionListener(new ButtonActionListener(this,"DuplicarCierreRolMensual"));
		
		this.jButtonCopiarCierreRolMensual.addActionListener(new ButtonActionListener(this,"CopiarCierreRolMensual"));
		
		this.jButtonVerFormCierreRolMensual.addActionListener(new ButtonActionListener(this,"VerFormCierreRolMensual"));
		
		
		this.jButtonNuevoToolBarCierreRolMensual.addActionListener(new ButtonActionListener(this,"NuevoToolBarCierreRolMensual"));
			
		this.jButtonDuplicarToolBarCierreRolMensual.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCierreRolMensual"));
			
		this.jMenuItemNuevoCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCierreRolMensual"));
			
		this.jMenuItemDuplicarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCierreRolMensual"));		
		
		
		this.jButtonNuevoRelacionesCierreRolMensual.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCierreRolMensual"));
		
		
		this.jButtonNuevoRelacionesToolBarCierreRolMensual.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCierreRolMensual"));
			
		this.jMenuItemNuevoRelacionesCierreRolMensual.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCierreRolMensual"));		
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonModificarCierreRolMensual.addActionListener(new ButtonActionListener(this,"ModificarCierreRolMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonModificarToolBarCierreRolMensual.addActionListener(new ButtonActionListener(this,"ModificarToolBarCierreRolMensual"));
			
			this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemModificarCierreRolMensual.addActionListener(new ButtonActionListener(this,"MenuItemModificarCierreRolMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarCierreRolMensual.addActionListener (new ButtonActionListener(this,"ActualizarCierreRolMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonActualizarToolBarCierreRolMensual.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCierreRolMensual"));
				
			this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemActualizarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCierreRolMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarCierreRolMensual.addActionListener (new ButtonActionListener(this,"EliminarCierreRolMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonEliminarToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"EliminarToolBarCierreRolMensual"));
						
			this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemEliminarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCierreRolMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarCierreRolMensual.addActionListener (new ButtonActionListener(this,"CancelarCierreRolMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonCancelarToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"CancelarToolBarCierreRolMensual"));
			
			this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemCancelarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCierreRolMensual"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCierreRolMensual"));		
		
		
		this.jButtonCerrarCierreRolMensual.addActionListener (new ButtonActionListener(this,"CerrarCierreRolMensual"));
		
		
		this.jButtonCerrarToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"CerrarToolBarCierreRolMensual"));
			
		this.jMenuItemCerrarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCierreRolMensual"));
			
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jMenuItemDetalleCerrarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCierreRolMensual"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosCierreRolMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosCierreRolMensual"));
		}
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCierreRolMensual"));
		}
		
		this.jButtonCopiarToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"CopiarToolBarCierreRolMensual"));
			
		this.jButtonVerFormToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"VerFormToolBarCierreRolMensual"));
		
		this.jMenuItemGuardarCambiosCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCierreRolMensual"));
			
		this.jMenuItemCopiarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCierreRolMensual"));		
		
		this.jMenuItemVerFormCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCierreRolMensual"));		
		
		
		this.jButtonGuardarCambiosTablaCierreRolMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCierreRolMensual"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCierreRolMensual"));
			
		this.jMenuItemGuardarCambiosTablaCierreRolMensual.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCierreRolMensual"));		
		
		
		
		this.jButtonRecargarInformacionCierreRolMensual.addActionListener (new ButtonActionListener(this,"RecargarInformacionCierreRolMensual"));
					
		this.jButtonRecargarInformacionToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCierreRolMensual"));
		
		this.jMenuItemRecargarInformacionCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCierreRolMensual"));		
		
		
		
		this.jButtonAnterioresCierreRolMensual.addActionListener (new ButtonActionListener(this,"AnterioresCierreRolMensual"));
		
		
		this.jButtonAnterioresToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCierreRolMensual"));
		
		this.jMenuItemAnterioresCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCierreRolMensual"));		
		
		
		this.jButtonSiguientesCierreRolMensual.addActionListener (new ButtonActionListener(this,"SiguientesCierreRolMensual"));
		
		
		this.jButtonSiguientesToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCierreRolMensual"));
			
		this.jMenuItemSiguientesCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCierreRolMensual"));
			
		this.jMenuItemAbrirOrderByCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCierreRolMensual"));
			
		this.jMenuItemMostrarOcultarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCierreRolMensual"));
			
		this.jMenuItemDetalleAbrirOrderByCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCierreRolMensual"));
			
		this.jMenuItemDetalleMostarOcultarCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCierreRolMensual"));		
		
		
		this.jButtonNuevoGuardarCambiosCierreRolMensual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCierreRolMensual"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCierreRolMensual"));
			
		this.jMenuItemNuevoGuardarCambiosCierreRolMensual.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCierreRolMensual"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCierreRolMensual.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCierreRolMensual"));

		this.jCheckBoxSeleccionadosCierreRolMensual.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCierreRolMensual"));
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCierreRolMensual"));
		}
		
		
		this.jComboBoxTiposRelacionesCierreRolMensual.addActionListener (new ButtonActionListener(this,"TiposRelacionesCierreRolMensual"));
			
		this.jComboBoxTiposAccionesCierreRolMensual.addActionListener (new ButtonActionListener(this,"TiposAccionesCierreRolMensual"));
					
		this.jComboBoxTiposSeleccionarCierreRolMensual.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCierreRolMensual"));
			
		this.jTextFieldValorCampoGeneralCierreRolMensual.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCierreRolMensual"));		
		
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonidCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"idCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empresaCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empresaCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_sucursalCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_sucursalCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_ejercicioCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_ejercicioCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCierreRolMensualBusqueda"));
		//jButtonid_empleadoCierreRolMensual.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoCierreRolMensualActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensual"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estructuraCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estructuraCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estado_empleadoCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_estado_empleadoCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estado_empleadoCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_empleadoCierreRolMensualBusqueda"));
		//jButtonid_asiento_contableCierreRolMensual.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableCierreRolMensualActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensual"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonporcentajeCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCierreRolMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonfechaCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"fechaCierreRolMensualBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAsientoContableCierreRolMensual.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableCierreRolMensual"));

			this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensual"));

			this.jButtonFK_IdCierreRolMensualCierreRolMensual.addActionListener(new ButtonActionListener(this,"FK_IdCierreRolMensualCierreRolMensual"));

			this.jButtonFK_IdEmpleadoCierreRolMensual.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoCierreRolMensual"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensual"));

			this.jButtonFK_IdEstadoEmpleadoCierreRolMensual.addActionListener(new ButtonActionListener(this,"FK_IdEstadoEmpleadoCierreRolMensual"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCierreRolMensual!=null) {
				this.jInternalFrameReporteDinamicoCierreRolMensual.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCierreRolMensual"));
				this.jInternalFrameReporteDinamicoCierreRolMensual.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCierreRolMensual"));
				this.jInternalFrameReporteDinamicoCierreRolMensual.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCierreRolMensual"));
			}
			
			//this.jButtonCerrarReporteDinamicoCierreRolMensual.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCierreRolMensual"));				
			//this.jButtonGenerarReporteDinamicoCierreRolMensual.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCierreRolMensual"));
			//this.jButtonGenerarExcelReporteDinamicoCierreRolMensual.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCierreRolMensual"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCierreRolMensual!=null) {
				this.jInternalFrameImportacionCierreRolMensual.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCierreRolMensual"));
				this.jInternalFrameImportacionCierreRolMensual.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCierreRolMensual"));
				this.jInternalFrameImportacionCierreRolMensual.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCierreRolMensual"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCierreRolMensual.addActionListener (new ButtonActionListener(this,"AbrirOrderByCierreRolMensual"));
			
			this.jButtonAbrirOrderByToolBarCierreRolMensual.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCierreRolMensual"));			
			
			if(this.jInternalFrameOrderByCierreRolMensual!=null) {
				this.jInternalFrameOrderByCierreRolMensual.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCierreRolMensual"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCierreRolMensual.jTabbedPaneRelacionesCierreRolMensual.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCierreRolMensual"));
		
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
            		closingInternalFrameCierreRolMensual();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCierreRolMensual.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCierreRolMensual = (JInternalFrameBase)event.getSource();
	            	
	            CierreRolMensualBeanSwingJInternalFrame jInternalFrameParent=(CierreRolMensualBeanSwingJInternalFrame)jInternalFrameDetalleFormCierreRolMensual.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCierreRolMensualActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCierreRolMensual.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCierreRolMensualListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCierreRolMensual.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCierreRolMensual.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreRolMensualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreRolMensualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreRolMensualActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCierreRolMensual";
		inputMap = this.jButtonNuevoCierreRolMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCierreRolMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCierreRolMensualActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreRolMensualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreRolMensualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCierreRolMensualActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCierreRolMensual";
		inputMap = this.jButtonNuevoRelacionesCierreRolMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCierreRolMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCierreRolMensualActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCierreRolMensual";
		inputMap = this.jButtonModificarCierreRolMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCierreRolMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCierreRolMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCierreRolMensual";
		inputMap = this.jButtonActualizarCierreRolMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCierreRolMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCierreRolMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCierreRolMensual";
		inputMap = this.jButtonEliminarCierreRolMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCierreRolMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCierreRolMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCierreRolMensual";
		inputMap = this.jButtonCancelarCierreRolMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCierreRolMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCierreRolMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCierreRolMensual";
		inputMap = this.jButtonCerrarCierreRolMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCierreRolMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCierreRolMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCierreRolMensual";
		inputMap = this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosCierreRolMensual.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonGuardarCambiosCierreRolMensual.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCierreRolMensualActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCierreRolMensual.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCierreRolMensualItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCierreRolMensual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCierreRolMensualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCierreRolMensual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCierreRolMensualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCierreRolMensual.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCierreRolMensualActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonidCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"idCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empresaCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empresaCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_sucursalCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_sucursalCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_ejercicioCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_ejercicioCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioCierreRolMensualBusqueda"));
		//jButtonid_empleadoCierreRolMensual.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoCierreRolMensualActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensual"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estructuraCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estructuraCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCierreRolMensualBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estado_empleadoCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_estado_empleadoCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_estado_empleadoCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_empleadoCierreRolMensualBusqueda"));
		//jButtonid_asiento_contableCierreRolMensual.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableCierreRolMensualActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensual"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensualUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensualUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonporcentajeCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCierreRolMensualBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCierreRolMensual.jButtonfechaCierreRolMensualBusqueda.addActionListener(new ButtonActionListener(this,"fechaCierreRolMensualBusqueda"));
		
		
		this.jButtonFK_IdAsientoContableCierreRolMensual.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableCierreRolMensual"));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_asiento_contableCierreRolMensual"));

		this.jButtonFK_IdCierreRolMensualCierreRolMensual.addActionListener(new ButtonActionListener(this,"FK_IdCierreRolMensualCierreRolMensual"));

		this.jButtonFK_IdEmpleadoCierreRolMensual.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoCierreRolMensual"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual.addActionListener(new ButtonActionListener(this,"id_empleadoCierreRolMensual"));

		this.jButtonFK_IdEstadoEmpleadoCierreRolMensual.addActionListener(new ButtonActionListener(this,"FK_IdEstadoEmpleadoCierreRolMensual"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCierreRolMensual.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCierreRolMensualActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCierreRolMensualActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCierreRolMensual.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCierreRolMensual(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensualLogic.getCierreRolMensuals()) {
					cierrerolmensualAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CierreRolMensual cierrerolmensualAux:cierrerolmensuals) {
					cierrerolmensualAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCierreRolMensualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCierreRolMensual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensualLogic.getCierreRolMensuals()) {
						cierrerolmensualAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CierreRolMensual cierrerolmensualAux:cierrerolmensuals) {
						cierrerolmensualAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensualLogic.getCierreRolMensuals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CierreRolMensual cierrerolmensualAux:cierrerolmensuals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCierreRolMensual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCierreRolMensual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCierreRolMensual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCierreRolMensualItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCierreRolMensual(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCierreRolMensual.getSelectedRows();
			
			CierreRolMensual cierrerolmensualLocal=new CierreRolMensual();
			
			//this.seleccionarTodosCierreRolMensual(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cierrerolmensualLocal =(CierreRolMensual) this.cierrerolmensualLogic.getCierreRolMensuals().toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cierrerolmensualLocal =(CierreRolMensual) this.cierrerolmensuals.toArray()[this.jTableDatosCierreRolMensual.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cierrerolmensualLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensualLogic.getCierreRolMensuals()) {
						cierrerolmensualAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CierreRolMensual cierrerolmensualAux:cierrerolmensuals) {
						cierrerolmensualAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCierreRolMensual(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCierreRolMensual.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCierreRolMensual.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCierreRolMensual,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCierreRolMensualItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCierreRolMensualParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCierreRolMensualActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCierreRolMensual(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCierreRolMensual.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensualLogic.getCierreRolMensuals()) {
				
						if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							cierrerolmensualAux.setporcentaje(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cierrerolmensualAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CierreRolMensual cierrerolmensualAux:cierrerolmensuals) {
					
						if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							cierrerolmensualAux.setporcentaje(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							cierrerolmensualAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCierreRolMensual(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCierreRolMensualActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCierreRolMensual(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCierreRolMensual=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCierreRolMensual.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCierreRolMensual) {				
					conSplash=true;//false;										
					
					//this.startProcessCierreRolMensual(conSplash);
				
					this.generarReporteCierreRolMensualsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCierreRolMensualsSeleccionados();
				//this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCierreRolMensualsSeleccionados(false);
				//this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCierreRolMensualsSeleccionados(true);
				//this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCierreRolMensual();
				
				this.exportarCierreRolMensualsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCierreRolMensuals();
				//this.importarCierreRolMensuals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCierreRolMensual();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCierreRolMensualsSeleccionados();
				//this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cierre Rol Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCierreRolMensual();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCierreRolMensual)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCierreRolMensual(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.setSelectedIndex(0);					
				}	
			} 			
			else if(CierreRolMensualBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCierreRolMensual) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCierreRolMensual(conSplash);
					
						//this.actualizarParametrosGeneralCierreRolMensual();
						
						this.generarReporteProcesoAccionCierreRolMensualsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CierreRolMensualBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cierre Rol MensualES SELECCIONADOS?", "MANTENIMIENTO DE Cierre Rol Mensual", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCierreRolMensual();
				
						this.actualizarParametrosGeneralCierreRolMensual();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cierrerolmensualReturnGeneral=cierrerolmensualLogic.procesarAccionCierreRolMensualsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cierrerolmensualLogic.getCierreRolMensuals(),this.cierrerolmensualParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCierreRolMensualReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCierreRolMensual();
					
					CierreRolMensualBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCierreRolMensualReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCierreRolMensual.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxTiposAccionesFormularioCierreRolMensual.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCierreRolMensual(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCierreRolMensualActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCierreRolMensual();
			
			if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();		
			CierreRolMensual cierrerolmensual=new CierreRolMensual();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCierreRolMensual(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCierreRolMensual.getSelectedItem();
			
			
			
			
			cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
			//this.sTipoAccion;
			
			if(cierrerolmensualsSeleccionados.size()==1) {
				for(CierreRolMensual cierrerolmensualAux:cierrerolmensualsSeleccionados) {
					cierrerolmensual=cierrerolmensualAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCierreRolMensual();
			
      		//this.finishProcessCierreRolMensual(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCierreRolMensualReturnGeneral() throws Exception {
		if(this.cierrerolmensualReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cierrerolmensualReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cierrerolmensualReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cierrerolmensualReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cierrerolmensualReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cierrerolmensualReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCierreRolMensual(false);
		}
		
		if(this.cierrerolmensualReturnGeneral.getConRetornoLista() || this.cierrerolmensualReturnGeneral.getConRetornoObjeto()) {
			if(this.cierrerolmensualReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cierrerolmensualLogic.setCierreRolMensuals(this.cierrerolmensualReturnGeneral.getCierreRolMensuals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cierrerolmensualReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cierrerolmensualLogic.setCierreRolMensual(this.cierrerolmensualReturnGeneral.getCierreRolMensual());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCierreRolMensual(false);
		}
	}
	
	public void actualizarParametrosGeneralCierreRolMensual() throws Exception {
		
		
	}
	
	public ArrayList<CierreRolMensual> getCierreRolMensualsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCierreRolMensual) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CierreRolMensual cierrerolmensualAux:cierrerolmensualLogic.getCierreRolMensuals()) {
					if(cierrerolmensualAux.getIsSelected()) {
						cierrerolmensualsSeleccionados.add(cierrerolmensualAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CierreRolMensual cierrerolmensualAux:this.cierrerolmensuals) {
					if(cierrerolmensualAux.getIsSelected()) {
						cierrerolmensualsSeleccionados.add(cierrerolmensualAux);				
					}
				}
			}
			
			if(cierrerolmensualsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cierrerolmensualsSeleccionados.addAll(this.cierrerolmensualLogic.getCierreRolMensuals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cierrerolmensualsSeleccionados.addAll(this.cierrerolmensuals);				
					}
				}
			}
		} else {
			cierrerolmensualsSeleccionados.add(this.cierrerolmensual);
		}
		
		return cierrerolmensualsSeleccionados;
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
	
	public void generarReporteCierreRolMensualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCierreRolMensualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCierreRolMensualsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCierreRolMensualsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCierreRolMensualsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cierre Rol Mensual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCierreRolMensualsSeleccionados() throws Exception {
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();		
		
		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCierreRolMensuals("Todos",cierrerolmensualsSeleccionados);
		
	}	
	
	public void generarReporteNormalCierreRolMensualsSeleccionados() throws Exception {
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();		
		
		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCierreRolMensuals("Todos",cierrerolmensualsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCierreRolMensualsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();
		
		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCierreRolMensuals("Todos",cierrerolmensualsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCierreRolMensualsSeleccionados() throws Exception {
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCierreRolMensual();
		
		
		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCierreRolMensual();
		
		
		//this.generarReporteCierreRolMensuals("Todos",cierrerolmensualsSeleccionados ,cierrerolmensualImplementable,cierrerolmensualImplementableHome);
	}
	
	public void mostrarImportacionCierreRolMensuals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCierreRolMensual();
		
		this.abrirFrameImportacionCierreRolMensual();		
		
			
		//this.generarReporteCierreRolMensuals("Todos",cierrerolmensualsSeleccionados ,cierrerolmensualImplementable,cierrerolmensualImplementableHome);
	}
	
	public void importarCierreRolMensuals() throws Exception {		
	
	}
	
	public void exportarCierreRolMensualsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCierreRolMensualsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCierreRolMensualsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCierreRolMensualsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cierre Rol Mensual",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCierreRolMensualsSeleccionados() throws Exception {
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();		
		
		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrerolmensual."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCierreRolMensual(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CierreRolMensual cierrerolmensualAux:cierrerolmensualsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCierreRolMensual(cierrerolmensualAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cierrerolmensualAux.setsDetalleGeneralEntityReporte(cierrerolmensualAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCierreRolMensual(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CierreRolMensualConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCierreRolMensual(CierreRolMensual cierrerolmensual,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cierrerolmensual.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getestadoempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getasientocontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cierrerolmensual.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCierreRolMensualsSeleccionados() throws Exception {
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();		
		
		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrerolmensual.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CierreRolMensuals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCierreRolMensual(row);				
				iRow++;
			}				
			
			for(CierreRolMensual cierrerolmensualAux:cierrerolmensualsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCierreRolMensual(cierrerolmensualAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCierreRolMensualsSeleccionados() throws Exception {
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();		
		
		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cierrerolmensual.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cierrerolmensuals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cierrerolmensual");
			//elementRoot.appendChild(element);
		
			for(CierreRolMensual cierrerolmensualAux:cierrerolmensualsSeleccionados) {
				element = document.createElement("cierrerolmensual");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCierreRolMensual(cierrerolmensualAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cierre Rol Mensual",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCierreRolMensual(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(CierreRolMensualConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCierreRolMensual(CierreRolMensual cierrerolmensual,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getestadoempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getasientocontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(cierrerolmensual.getfecha());				
	}
	
	public void setFilaDatosExportarXmlCierreRolMensual(CierreRolMensual cierrerolmensual,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CierreRolMensualConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cierrerolmensual.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CierreRolMensualConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cierrerolmensual.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CierreRolMensualConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cierrerolmensual.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CierreRolMensualConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cierrerolmensual.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(CierreRolMensualConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(cierrerolmensual.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementempleado_descripcion = document.createElement(CierreRolMensualConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(cierrerolmensual.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementestructura_descripcion = document.createElement(CierreRolMensualConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(cierrerolmensual.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementestadoempleado_descripcion = document.createElement(CierreRolMensualConstantesFunciones.IDESTADOEMPLEADO);
		elementestadoempleado_descripcion.appendChild(document.createTextNode(cierrerolmensual.getestadoempleado_descripcion()));
		element.appendChild(elementestadoempleado_descripcion);

		Element elementasientocontable_descripcion = document.createElement(CierreRolMensualConstantesFunciones.IDASIENTOCONTABLE);
		elementasientocontable_descripcion.appendChild(document.createTextNode(cierrerolmensual.getasientocontable_descripcion()));
		element.appendChild(elementasientocontable_descripcion);

		Element elementporcentaje = document.createElement(CierreRolMensualConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(cierrerolmensual.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementfecha = document.createElement(CierreRolMensualConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(cierrerolmensual.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoCierreRolMensualsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados=new ArrayList<CierreRolMensual>();
		
		cierrerolmensualsSeleccionados=this.getCierreRolMensualsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCierreRolMensual(cierrerolmensualsSeleccionados);
		
		this.generarReporteCierreRolMensuals("Todos",cierrerolmensualsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCierreRolMensual(ArrayList<CierreRolMensual> cierrerolmensualsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CierreRolMensual cierrerolmensualAux:cierrerolmensualsSeleccionados) {
				cierrerolmensualAux.setsDetalleGeneralEntityReporte(cierrerolmensualAux.toString());
			
				if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cierrerolmensualAux.setsDescripcionGeneralEntityReporte1(cierrerolmensualAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cierrerolmensualAux.setsDescripcionGeneralEntityReporte1(cierrerolmensualAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					cierrerolmensualAux.setsDescripcionGeneralEntityReporte1(cierrerolmensualAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					cierrerolmensualAux.setsDescripcionGeneralEntityReporte1(cierrerolmensualAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					cierrerolmensualAux.setsDescripcionGeneralEntityReporte1(cierrerolmensualAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_IDESTADOEMPLEADO)) {
					existe=true;
					cierrerolmensualAux.setsDescripcionGeneralEntityReporte1(cierrerolmensualAux.getestadoempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_IDASIENTOCONTABLE)) {
					existe=true;
					cierrerolmensualAux.setsDescripcionGeneralEntityReporte1(cierrerolmensualAux.getasientocontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_PORCENTAJE)) {
					existe=true;
					cierrerolmensualAux.setsDescripcionGeneralEntityReporte1(cierrerolmensualAux.getporcentaje().toString());
				}
				 else if(sTipoSeleccionar.equals(CierreRolMensualConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					cierrerolmensualAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cierrerolmensualAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CierreRolMensualConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCierreRolMensual(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCierreRolMensual=true;
				this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=true;
				this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=true;
			}
			
			this.isVisibilidadCeldaModificarCierreRolMensual=false;
			this.isVisibilidadCeldaActualizarCierreRolMensual=false;
			this.isVisibilidadCeldaEliminarCierreRolMensual=false;
			this.isVisibilidadCeldaCancelarCierreRolMensual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreRolMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCierreRolMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=false;
			this.isVisibilidadCeldaModificarCierreRolMensual=false;
			this.isVisibilidadCeldaActualizarCierreRolMensual=true;
			this.isVisibilidadCeldaEliminarCierreRolMensual=false;
			this.isVisibilidadCeldaCancelarCierreRolMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreRolMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCierreRolMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=false;
			this.isVisibilidadCeldaModificarCierreRolMensual=false;
			this.isVisibilidadCeldaActualizarCierreRolMensual=true;
			this.isVisibilidadCeldaEliminarCierreRolMensual=true;
			this.isVisibilidadCeldaCancelarCierreRolMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreRolMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCierreRolMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=false;
			this.isVisibilidadCeldaModificarCierreRolMensual=false;
			this.isVisibilidadCeldaActualizarCierreRolMensual=true;
			this.isVisibilidadCeldaEliminarCierreRolMensual=false;
			this.isVisibilidadCeldaCancelarCierreRolMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				} else {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCierreRolMensual=true;
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=true;
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=true;
			this.isVisibilidadCeldaModificarCierreRolMensual=false;
			this.isVisibilidadCeldaActualizarCierreRolMensual=false;
			this.isVisibilidadCeldaEliminarCierreRolMensual=false;
			this.isVisibilidadCeldaCancelarCierreRolMensual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreRolMensual=true;
				} else {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCierreRolMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=false;
			this.isVisibilidadCeldaActualizarCierreRolMensual=false;
			this.isVisibilidadCeldaEliminarCierreRolMensual=false;
			this.isVisibilidadCeldaCancelarCierreRolMensual=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				} else {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCierreRolMensual=false;
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=false;
			this.isVisibilidadCeldaModificarCierreRolMensual=true;
			this.isVisibilidadCeldaActualizarCierreRolMensual=false;
			this.isVisibilidadCeldaEliminarCierreRolMensual=false;
			this.isVisibilidadCeldaCancelarCierreRolMensual=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				} else {
					this.isVisibilidadCeldaGuardarCierreRolMensual=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CierreRolMensualJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCierreRolMensual=true;
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=true;
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=true;
		} else {
			this.actualizarEstadoPanelsCierreRolMensual(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCierreRolMensual=false;
			//this.isVisibilidadCeldaVerFormCierreRolMensual=false;
			this.isVisibilidadCeldaDuplicarCierreRolMensual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cierrerolmensualSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;
		} else {
			this.isVisibilidadCeldaNuevoCierreRolMensual=false;
			this.isVisibilidadCeldaGuardarCambiosCierreRolMensual=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			if(!cierrerolmensualSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;												
			}
			
			this.jButtonCerrarCierreRolMensual.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCierreRolMensual=false;
		}
		
		if(!this.permiteMantenimiento(this.cierrerolmensual)) {
			this.isVisibilidadCeldaActualizarCierreRolMensual=false;
			this.isVisibilidadCeldaEliminarCierreRolMensual=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCierreRolMensual() {
	}
	
	public void actualizarEstadoPanelsCierreRolMensual(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCierreRolMensual!=null) {
				this.jScrollPanelDatosEdicionCierreRolMensual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreRolMensual!=null) {
				this.jTabbedPaneBusquedasCierreRolMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCierreRolMensual!=null) {
				this.jScrollPanelDatosCierreRolMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionCierreRolMensual!=null) {
				this.jPanelPaginacionCierreRolMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCierreRolMensual!=null) {
				this.jPanelParametrosReportesCierreRolMensual.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCierreRolMensual!=null) {
				this.jScrollPanelDatosEdicionCierreRolMensual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreRolMensual!=null) {
				this.jTabbedPaneBusquedasCierreRolMensual.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCierreRolMensual!=null) {
				this.jScrollPanelDatosCierreRolMensual.setVisible(false);
			}
			
			if(this.jPanelPaginacionCierreRolMensual!=null) {
				this.jPanelPaginacionCierreRolMensual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCierreRolMensual!=null) {
				this.jPanelParametrosReportesCierreRolMensual.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCierreRolMensual!=null) {
				this.jScrollPanelDatosEdicionCierreRolMensual.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreRolMensual!=null) {
				this.jTabbedPaneBusquedasCierreRolMensual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCierreRolMensual!=null) {
				this.jScrollPanelDatosCierreRolMensual.setVisible(false);
			}
			
			if(this.jPanelPaginacionCierreRolMensual!=null) {
				this.jPanelPaginacionCierreRolMensual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCierreRolMensual!=null) {
				this.jPanelParametrosReportesCierreRolMensual.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCierreRolMensual!=null) {
				this.jScrollPanelDatosEdicionCierreRolMensual.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreRolMensual!=null) {
				this.jTabbedPaneBusquedasCierreRolMensual.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCierreRolMensual!=null) {
				this.jScrollPanelDatosCierreRolMensual.setVisible(false);
			}
			
			if(this.jPanelPaginacionCierreRolMensual!=null) {
				this.jPanelPaginacionCierreRolMensual.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCierreRolMensual!=null) {
				this.jPanelParametrosReportesCierreRolMensual.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCierreRolMensual!=null) {
				this.jScrollPanelDatosEdicionCierreRolMensual.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreRolMensual!=null) {
				this.jTabbedPaneBusquedasCierreRolMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCierreRolMensual!=null) {
				this.jScrollPanelDatosCierreRolMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionCierreRolMensual!=null) {
				this.jPanelPaginacionCierreRolMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCierreRolMensual!=null) {
				this.jPanelParametrosReportesCierreRolMensual.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCierreRolMensual!=null) {
				this.jScrollPanelDatosEdicionCierreRolMensual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreRolMensual!=null) {
				this.jTabbedPaneBusquedasCierreRolMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCierreRolMensual!=null) {
				this.jScrollPanelDatosCierreRolMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionCierreRolMensual!=null) {
				this.jPanelPaginacionCierreRolMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCierreRolMensual!=null) {
				this.jPanelParametrosReportesCierreRolMensual.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCierreRolMensual!=null) {
				this.jScrollPanelDatosEdicionCierreRolMensual.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreRolMensual!=null) {
				this.jTabbedPaneBusquedasCierreRolMensual.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCierreRolMensual!=null) {
				this.jScrollPanelDatosCierreRolMensual.setVisible(true);
			}
			
			if(this.jPanelPaginacionCierreRolMensual!=null) {
				this.jPanelPaginacionCierreRolMensual.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCierreRolMensual!=null) {
				this.jPanelParametrosReportesCierreRolMensual.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCierreRolMensual!=null) {
					this.jTabbedPaneBusquedasCierreRolMensual.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCierreRolMensual!=null) {
				this.jPanelParametrosReportesCierreRolMensual.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCierreRolMensual!=null) {
				this.jTabbedPaneBusquedasCierreRolMensual.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCierreRolMensual!=null) {
				this.jPanelParametrosReportesCierreRolMensual.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdAsientoContableCierreRolMensual);}

			this.isVisibilidadFK_IdCierreRolMensual=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCierreRolMensual) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdCierreRolMensualCierreRolMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEmpleadoCierreRolMensual);}

			this.isVisibilidadFK_IdEstadoEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEstadoEmpleadoCierreRolMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAsientoContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdAsientoContableCierreRolMensual);}

			this.isVisibilidadFK_IdCierreRolMensual=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCierreRolMensual) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdCierreRolMensualCierreRolMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEmpleadoCierreRolMensual);}

			this.isVisibilidadFK_IdEstadoEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEstadoEmpleadoCierreRolMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdAsientoContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdAsientoContableCierreRolMensual);}

			this.isVisibilidadFK_IdCierreRolMensual=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCierreRolMensual) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdCierreRolMensualCierreRolMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEmpleadoCierreRolMensual);}

			this.isVisibilidadFK_IdEstadoEmpleado=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEstadoEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEstadoEmpleadoCierreRolMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdAsientoContableCierreRolMensual);}

			this.isVisibilidadFK_IdCierreRolMensual=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCierreRolMensual) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdCierreRolMensualCierreRolMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEmpleadoCierreRolMensual);}

			this.isVisibilidadFK_IdEstadoEmpleado=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstadoEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEstadoEmpleadoCierreRolMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdAsientoContable=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdAsientoContableCierreRolMensual);}

			this.isVisibilidadFK_IdCierreRolMensual=isParaEstructura;
			if(!this.isVisibilidadFK_IdCierreRolMensual) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdCierreRolMensualCierreRolMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEmpleadoCierreRolMensual);}

			this.isVisibilidadFK_IdEstadoEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEstadoEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEstadoEmpleadoCierreRolMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoEmpleado(Boolean isParaEstadoEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoEmpleadoNegation=!isParaEstadoEmpleado;

			this.isVisibilidadFK_IdAsientoContable=isParaEstadoEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdAsientoContableCierreRolMensual);}

			this.isVisibilidadFK_IdCierreRolMensual=isParaEstadoEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCierreRolMensual) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdCierreRolMensualCierreRolMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaEstadoEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEmpleadoCierreRolMensual);}

			this.isVisibilidadFK_IdEstadoEmpleado=isParaEstadoEmpleado;
			if(!this.isVisibilidadFK_IdEstadoEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEstadoEmpleadoCierreRolMensual);}
		}
		
	}

	public void setVisibilidadBusquedasParaAsientoContable(Boolean isParaAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAsientoContableNegation=!isParaAsientoContable;

			this.isVisibilidadFK_IdAsientoContable=isParaAsientoContable;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdAsientoContableCierreRolMensual);}

			this.isVisibilidadFK_IdCierreRolMensual=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdCierreRolMensual) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdCierreRolMensualCierreRolMensual);}

			this.isVisibilidadFK_IdEmpleado=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEmpleadoCierreRolMensual);}

			this.isVisibilidadFK_IdEstadoEmpleado=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdEstadoEmpleado) {this.jTabbedPaneBusquedasCierreRolMensual.remove(jPanelFK_IdEstadoEmpleadoCierreRolMensual);}
		}
		
	}
	
	
	
	

	public String registrarSesionCierreRolMensualParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(cierrerolmensualSessionBean==null) {
				cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(cierrerolmensualSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.cierrerolmensualFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(CierreRolMensualConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionCierreRolMensual(true);
			//empleadoSessionBean.setlidCierreRolMensualActual(this.idCierreRolMensualActual);

			cierrerolmensualSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCierreRolMensual(true);
			cierrerolmensualSessionBean.setlIdCierreRolMensualActualForeignKey(this.idCierreRolMensualActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionCierreRolMensualParaBusquedaAsientoContables() throws Exception {
		Boolean isPaginaPopupAsientoContable=false;

		try {

			if(cierrerolmensualSessionBean==null) {
				cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
			}

			if(asientocontableSessionBean==null) {
				asientocontableSessionBean=new AsientoContableSessionBean();
			}

			asientocontableSessionBean.setsPathNavegacionActual(cierrerolmensualSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
			asientocontableSessionBean.setisPermiteRecargarInformacion(false);
			asientocontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupAsientoContable=asientocontableSessionBean.getisPaginaPopup();
			asientocontableSessionBean.setisPaginaPopup(false);
			asientocontableSessionBean.setEstaModoBusqueda(true);
			asientocontableSessionBean.setsFuncionBusquedaRapida("window.opener.cierrerolmensualFuncionGeneral.setCombosCodigoDesdeBusquedaid_asiento_contable(TO_REPLACE);");
			asientocontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable(true);
			asientocontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable(CierreRolMensualConstantesFunciones.SNOMBREOPCION);
			//asientocontableSessionBean.setisBusquedaDesdeForeignKeySesionCierreRolMensual(true);
			//asientocontableSessionBean.setlidCierreRolMensualActual(this.idCierreRolMensualActual);

			cierrerolmensualSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCierreRolMensual(true);
			cierrerolmensualSessionBean.setlIdCierreRolMensualActualForeignKey(this.idCierreRolMensualActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CierreRolMensualSessionBean cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		
		if(this.cierrerolmensualSessionBean==null) {
			this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		}
		
		this.cierrerolmensualSessionBean.setsUltimaBusquedaCierreRolMensual(this.getsAccionBusqueda());
		this.cierrerolmensualSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cierrerolmensualSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
			cierrerolmensualSessionBean.setid_asiento_contable(this.getid_asiento_contableFK_IdAsientoContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCierreRolMensual")) {
			cierrerolmensualSessionBean.setid_estructura(this.getid_estructuraFK_IdCierreRolMensual());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			cierrerolmensualSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			cierrerolmensualSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cierrerolmensualSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoEmpleado")) {
			cierrerolmensualSessionBean.setid_estado_empleado(this.getid_estado_empleadoFK_IdEstadoEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cierrerolmensualSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CierreRolMensualSessionBean cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		
		if(this.cierrerolmensualSessionBean==null) {
			this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		}
		
		if(this.cierrerolmensualSessionBean.getsUltimaBusquedaCierreRolMensual()!=null&&!this.cierrerolmensualSessionBean.getsUltimaBusquedaCierreRolMensual().equals("")) {
			this.setsAccionBusqueda(cierrerolmensualSessionBean.getsUltimaBusquedaCierreRolMensual());
			this.setiNumeroPaginacion(cierrerolmensualSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cierrerolmensualSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
				this.setid_asiento_contableFK_IdAsientoContable(cierrerolmensualSessionBean.getid_asiento_contable());
				cierrerolmensualSessionBean.setid_asiento_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCierreRolMensual")) {
				this.setid_estructuraFK_IdCierreRolMensual(cierrerolmensualSessionBean.getid_estructura());
				cierrerolmensualSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(cierrerolmensualSessionBean.getid_ejercicio());
				cierrerolmensualSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(cierrerolmensualSessionBean.getid_empleado());
				cierrerolmensualSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cierrerolmensualSessionBean.getid_empresa());
				cierrerolmensualSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoEmpleado")) {
				this.setid_estado_empleadoFK_IdEstadoEmpleado(cierrerolmensualSessionBean.getid_estado_empleado());
				cierrerolmensualSessionBean.setid_estado_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cierrerolmensualSessionBean.getid_sucursal());
				cierrerolmensualSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.cierrerolmensualSessionBean.setsUltimaBusquedaCierreRolMensual("");
		this.cierrerolmensualSessionBean.setiNumeroPaginacion(CierreRolMensualConstantesFunciones.INUMEROPAGINACION);
		this.cierrerolmensualSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCierreRolMensual(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCierreRolMensual() {
		this.updateBorderResaltarBusquedasFormularioCierreRolMensual();
		this.updateVisibilidadBusquedasFormularioCierreRolMensual();
		this.updateHabilitarBusquedasFormularioCierreRolMensual();
	}
	
	public void updateBorderResaltarBusquedasFormularioCierreRolMensual() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCierreRolMensual.getComponents().length>0) {
	

		if(this.cierrerolmensualConstantesFunciones.resaltarFK_IdAsientoContableCierreRolMensual!=null) {
			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdAsientoContableCierreRolMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
				jPanel.setBorder(this.cierrerolmensualConstantesFunciones.resaltarFK_IdAsientoContableCierreRolMensual);
			}
		}

		if(this.cierrerolmensualConstantesFunciones.resaltarFK_IdCierreRolMensualCierreRolMensual!=null) {
			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdCierreRolMensualCierreRolMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
				jPanel.setBorder(this.cierrerolmensualConstantesFunciones.resaltarFK_IdCierreRolMensualCierreRolMensual);
			}
		}

		if(this.cierrerolmensualConstantesFunciones.resaltarFK_IdEmpleadoCierreRolMensual!=null) {
			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdEmpleadoCierreRolMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
				jPanel.setBorder(this.cierrerolmensualConstantesFunciones.resaltarFK_IdEmpleadoCierreRolMensual);
			}
		}

		if(this.cierrerolmensualConstantesFunciones.resaltarFK_IdEstadoEmpleadoCierreRolMensual!=null) {
			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdEstadoEmpleadoCierreRolMensual);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
				jPanel.setBorder(this.cierrerolmensualConstantesFunciones.resaltarFK_IdEstadoEmpleadoCierreRolMensual);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCierreRolMensual() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCierreRolMensual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdAsientoContableCierreRolMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cierrerolmensualConstantesFunciones.mostrarFK_IdAsientoContableCierreRolMensual);
			if(!this.cierrerolmensualConstantesFunciones.mostrarFK_IdAsientoContableCierreRolMensual && index>-1) {
				this.jTabbedPaneBusquedasCierreRolMensual.remove(index);
			}

			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdCierreRolMensualCierreRolMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cierrerolmensualConstantesFunciones.mostrarFK_IdCierreRolMensualCierreRolMensual);
			if(!this.cierrerolmensualConstantesFunciones.mostrarFK_IdCierreRolMensualCierreRolMensual && index>-1) {
				this.jTabbedPaneBusquedasCierreRolMensual.remove(index);
			}

			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdEmpleadoCierreRolMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cierrerolmensualConstantesFunciones.mostrarFK_IdEmpleadoCierreRolMensual);
			if(!this.cierrerolmensualConstantesFunciones.mostrarFK_IdEmpleadoCierreRolMensual && index>-1) {
				this.jTabbedPaneBusquedasCierreRolMensual.remove(index);
			}

			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdEstadoEmpleadoCierreRolMensual);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cierrerolmensualConstantesFunciones.mostrarFK_IdEstadoEmpleadoCierreRolMensual);
			if(!this.cierrerolmensualConstantesFunciones.mostrarFK_IdEstadoEmpleadoCierreRolMensual && index>-1) {
				this.jTabbedPaneBusquedasCierreRolMensual.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCierreRolMensual() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCierreRolMensual.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdAsientoContableCierreRolMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cierrerolmensualConstantesFunciones.activarFK_IdAsientoContableCierreRolMensual);
				this.jTabbedPaneBusquedasCierreRolMensual.setEnabledAt(index,this.cierrerolmensualConstantesFunciones.activarFK_IdAsientoContableCierreRolMensual);
			}

			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdCierreRolMensualCierreRolMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cierrerolmensualConstantesFunciones.activarFK_IdCierreRolMensualCierreRolMensual);
				this.jTabbedPaneBusquedasCierreRolMensual.setEnabledAt(index,this.cierrerolmensualConstantesFunciones.activarFK_IdCierreRolMensualCierreRolMensual);
			}

			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdEmpleadoCierreRolMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cierrerolmensualConstantesFunciones.activarFK_IdEmpleadoCierreRolMensual);
				this.jTabbedPaneBusquedasCierreRolMensual.setEnabledAt(index,this.cierrerolmensualConstantesFunciones.activarFK_IdEmpleadoCierreRolMensual);
			}

			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdEstadoEmpleadoCierreRolMensual);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cierrerolmensualConstantesFunciones.activarFK_IdEstadoEmpleadoCierreRolMensual);
				this.jTabbedPaneBusquedasCierreRolMensual.setEnabledAt(index,this.cierrerolmensualConstantesFunciones.activarFK_IdEstadoEmpleadoCierreRolMensual);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCierreRolMensual(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAsientoContable")) {
			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdAsientoContableCierreRolMensual);

			this.jTabbedPaneBusquedasCierreRolMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);

			this.cierrerolmensualConstantesFunciones.setResaltarFK_IdAsientoContableCierreRolMensual(resaltar);

			jPanel.setBorder(this.cierrerolmensualConstantesFunciones.resaltarFK_IdAsientoContableCierreRolMensual);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCierreRolMensual")) {
			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdCierreRolMensualCierreRolMensual);

			this.jTabbedPaneBusquedasCierreRolMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);

			this.cierrerolmensualConstantesFunciones.setResaltarFK_IdCierreRolMensualCierreRolMensual(resaltar);

			jPanel.setBorder(this.cierrerolmensualConstantesFunciones.resaltarFK_IdCierreRolMensualCierreRolMensual);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdEmpleadoCierreRolMensual);

			this.jTabbedPaneBusquedasCierreRolMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);

			this.cierrerolmensualConstantesFunciones.setResaltarFK_IdEmpleadoCierreRolMensual(resaltar);

			jPanel.setBorder(this.cierrerolmensualConstantesFunciones.resaltarFK_IdEmpleadoCierreRolMensual);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoEmpleado")) {
			index= this.jTabbedPaneBusquedasCierreRolMensual.indexOfComponent(this.jPanelFK_IdEstadoEmpleadoCierreRolMensual);

			this.jTabbedPaneBusquedasCierreRolMensual.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCierreRolMensual.getComponent(index);

			this.cierrerolmensualConstantesFunciones.setResaltarFK_IdEstadoEmpleadoCierreRolMensual(resaltar);

			jPanel.setBorder(this.cierrerolmensualConstantesFunciones.resaltarFK_IdEstadoEmpleadoCierreRolMensual);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCierreRolMensual.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCierreRolMensual() throws Exception {

		if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCierreRolMensual();
		this.updateVisibilidadResaltarControlesFormularioCierreRolMensual();
		this.updateHabilitarResaltarControlesFormularioCierreRolMensual();
		
	}
	
	public void updateBorderResaltarControlesFormularioCierreRolMensual() throws Exception {
		if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cierrerolmensualConstantesFunciones.resaltaridCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltaridCierreRolMensual);}
		if(this.cierrerolmensualConstantesFunciones.resaltarid_empresaCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltarid_empresaCierreRolMensual);}
		if(this.cierrerolmensualConstantesFunciones.resaltarid_sucursalCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltarid_sucursalCierreRolMensual);}
		if(this.cierrerolmensualConstantesFunciones.resaltarid_ejercicioCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltarid_ejercicioCierreRolMensual);}
		if(this.cierrerolmensualConstantesFunciones.resaltarid_empleadoCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltarid_empleadoCierreRolMensual);}
		if(this.cierrerolmensualConstantesFunciones.resaltarid_estructuraCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltarid_estructuraCierreRolMensual);}
		if(this.cierrerolmensualConstantesFunciones.resaltarid_estado_empleadoCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltarid_estado_empleadoCierreRolMensual);}
		if(this.cierrerolmensualConstantesFunciones.resaltarid_asiento_contableCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltarid_asiento_contableCierreRolMensual);}
		if(this.cierrerolmensualConstantesFunciones.resaltarporcentajeCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jTextFieldporcentajeCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltarporcentajeCierreRolMensual);}
		if(this.cierrerolmensualConstantesFunciones.resaltarfechaCierreRolMensual!=null && this.jInternalFrameDetalleFormCierreRolMensual!=null) {this.jInternalFrameDetalleFormCierreRolMensual.jDateChooserfechaCierreRolMensual.setBorder(this.cierrerolmensualConstantesFunciones.resaltarfechaCierreRolMensual);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCierreRolMensual() throws Exception {		
		if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
	
		//this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostraridCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelidCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostraridCierreRolMensual);
		//this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_empresaCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelid_empresaCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_empresaCierreRolMensual);
		//this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_sucursalCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelid_sucursalCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_sucursalCierreRolMensual);
		//this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_ejercicioCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelid_ejercicioCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_ejercicioCierreRolMensual);
		//this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_empleadoCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelid_empleadoCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_empleadoCierreRolMensual);
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_empleadoCierreRolMensual);
		//this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_estructuraCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelid_estructuraCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_estructuraCierreRolMensual);
		//this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_estado_empleadoCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelid_estado_empleadoCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_estado_empleadoCierreRolMensual);
		//this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_asiento_contableCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelid_asiento_contableCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_asiento_contableCierreRolMensual);
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarid_asiento_contableCierreRolMensual);
		//this.jInternalFrameDetalleFormCierreRolMensual.jTextFieldporcentajeCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarporcentajeCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelporcentajeCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarporcentajeCierreRolMensual);
		//this.jInternalFrameDetalleFormCierreRolMensual.jDateChooserfechaCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarfechaCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jPanelfechaCierreRolMensual.setVisible(this.cierrerolmensualConstantesFunciones.mostrarfechaCierreRolMensual);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCierreRolMensual() throws Exception {
		if(this.jInternalFrameDetalleFormCierreRolMensual==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCierreRolMensual!=null) {
	
		this.jInternalFrameDetalleFormCierreRolMensual.jLabelidCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activaridCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empresaCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarid_empresaCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_sucursalCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarid_sucursalCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_ejercicioCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarid_ejercicioCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_empleadoCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarid_empleadoCierreRolMensual);
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_empleadoCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarid_empleadoCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estructuraCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarid_estructuraCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_estado_empleadoCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarid_estado_empleadoCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jComboBoxid_asiento_contableCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarid_asiento_contableCierreRolMensual);
			this.jInternalFrameDetalleFormCierreRolMensual.jButtonid_asiento_contableCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarid_asiento_contableCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jTextFieldporcentajeCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarporcentajeCierreRolMensual);
		this.jInternalFrameDetalleFormCierreRolMensual.jDateChooserfechaCierreRolMensual.setEnabled(this.cierrerolmensualConstantesFunciones.activarfechaCierreRolMensual);
		}
	}
	
		
}